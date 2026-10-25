# libnative-lib.so (arm64-v8a) — engenharia reversa

Biblioteca nativa carregada em `App.onCreate` via `System.loadLibrary`. Exporta duas
funcoes JNI relevantes (ver `.dynsym`):

| Endereco | Tamanho | Simbolo |
|---|---|---|
| `0x675c0` | 3636 B | `AesDecrypt_decrypt(const std::__ndk1::string&)` |
| `0x686a4` | 580 B | `Java_com_android_vending_networking_Baker_merge` |
| `0x675a8` | 24 B | `JNI_OnLoad` |

## `Baker.merge(String, Context)` — 0x686a4

Thunk fino. Converte o `String` Java para `std::string`, chama `AesDecrypt_decrypt`
e devolve o resultado com `NewStringUTF`. Toda a logica esta em `AesDecrypt_decrypt`.

## `AesDecrypt_decrypt` — 0x675c0

**O nome e um engodo: nao usa AES.** E uma cifra de fluxo construida a mao sobre
SHA-256, calculada atraves das APIs Java (`java.security.MessageDigest` e
`android.util.Base64`) chamadas por JNI a partir do codigo nativo. Fazer a
descriptografia em C++ chamando de volta o Java dificulta a leitura e esconde que,
no fundo, o primitivo e so SHA-256.

### Algoritmo recuperado

```
bruto     = Base64.decode(entrada, NO_WRAP)        # ajudante em 0x68988
chave     = bruto[:16]                              # primeiros 16 bytes do blob
cifrado   = bruto[16:]                              # o resto
para cada bloco i = 0, 1, 2, ... (32 bytes):
    bloco_ks = SHA-256( chave || big_endian_uint32(i) )   # 32 bytes
    claro[i] = cifrado[i] XOR bloco_ks
```

Pontos confirmados no desmonte:
- `0x68988` faz `FindClass("android/util/Base64")` + `getInstance`/`decode`
  `(Ljava/lang/String;I)[B`. A flag e `2` (`NO_WRAP`) na primeira chamada.
- `0x67660`: `ldr q0,[x22]` copia os **primeiros 16 bytes** do blob decodificado = chave.
- `0x67668..`: `x19 = inicio+16`, `cipherlen = fim - (inicio+16)` = cifrado.
- `0x67720..0x677f0`: `MessageDigest.getInstance("SHA-256")`, `update(chave)`.
- `0x67858`: `rev w8, w20` = contador do bloco em **big-endian**; `NewByteArray(4)` +
  `update(contador)`; depois `digest()` -> 32 bytes de keystream.
- `0x67a54..0x67c10`: XOR vetorizado (NEON, `eor v0.16b,...`) do keystream com o cifrado,
  32 bytes por volta, com cauda escalar.
- Dois ramos quase identicos (`0x675c0` e `0x67c14`) tratam o caminho normal e um
  caminho de erro/segundo formato; a aritmetica da cifra e a mesma.

### Implicacao

A chave viaja **dentro do proprio blob** (os 16 bytes iniciais). Nao ha chave fixa
escondida no binario. Logo, qualquer valor cifrado que a app receba (por exemplo o
`cric_api2` do Firebase Remote Config, ou respostas da API) pode ser decifrado sem
nenhum segredo adicional. A reimplementacao esta em `baker_decrypt.py` e passa um
teste de round-trip.

### Como usar

```bash
# com um blob real capturado (Remote Config cric_api2, ou corpo de resposta da API):
python3 native/baker_decrypt.py "<string_base64>"
```

Para obter um blob real sem executar a app: ler o valor `cric_api2` na consola do
projeto Firebase `cfynewtv`, ou capturar trafego com um proxy MITM. A desencriptacao
em si ja nao precisa da app.

## Outras bibliotecas nativas

| Ficheiro | Papel |
|---|---|
| `libcr_android.so` | Motor do proxyware CashRaven (Rust: tokio, snow/Noise, curve25519, AES). Faz o relay de trafego. Ver strings em `strings/libcr_android.so.txt`. |
| `libffmpegJNI.so`, `libdav1dJNI.so` | Descodificacao de video (AV1/ffmpeg) para o player. |
| `libunitycoherencenative.so` | Unity Ads. |
| `libjnidispatch.so` | JNA (ponte usada pelo uniffi do CashRaven). |

Ferramentas: pyelftools + capstone (desmonte AArch64). Sem Ghidra; a reconstrucao
foi feita bloco a bloco a partir do `.text`.

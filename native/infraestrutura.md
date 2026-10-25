# Infraestrutura da CricFy TV (análise estática + captura de rede)

## Captura de rede (mitmproxy)

O proxy de Wi-Fi do Android **não** apanha o tráfego da app. Com o proxy ativo só
aparecem os testes de ligação do sistema Google TV (`connectivitycheck.gstatic.com`,
`www.google.com/gen_204`, `play.googleapis.com/generate_204`). Da CricFy, nada, nem
sequer uma falha de TLS.

Motivo: a app não usa a pilha HTTP do sistema (que respeitaria o proxy). Traz o
**Cronet** (`org.chromium.net`, 38 classes) e os sockets nativos do proxyware
(Rust/tokio em `libcr_android.so`), e nenhum deles honra o proxy do Wi-Fi. Para
intercetar o tráfego dela seria preciso interceção transparente (o Mac como gateway
da TV com redireção de portas) e, ainda assim, um certificado de confiança, já que o
`network_security_config` não confia em certificados de utilizador.

## Servidor de controlo (análise estática — sem captura)

Os valores por omissão do Firebase Remote Config estão embutidos na APK em
`res/xw.xml` (um `defaultsMap`). Conteúdo:

| Chave | Valor |
|---|---|
| `cric_api1` | `https://cfyadmiin1.top/` |
| `cric_api2` | `https://cfyadmiin1.top/` |
| `userAgent` | `Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36` |

`App.onCreate` lê a chave **`cric_api2`** do Remote Config (projeto Firebase
`cfynewtv`) e usa-a como base da API (ver `app-androguard/com/android/vending/App.java`,
`zd2.b`). Como vem do Remote Config, o operador pode trocar o servidor remotamente a
qualquer momento; `cfyadmiin1.top` é o valor de arranque embutido.

A app força um User-Agent de Chrome para os pedidos não parecerem vir de uma app.

### Domínios conhecidos

| Domínio | Papel |
|---|---|
| `cfyadmiin1.top` | Servidor de controlo / API (Remote Config `cric_api2`). Nome deliberadamente parecido com "admin". |
| `dokoplay.xyz` | Lookup de streams: `/server_lookup.php?channel_id=premium` (string fixa em `libnative-lib.so`). |
| `newembedplay.xyz`, `rtstv.xyz` | Servidores de embed/stream (strings fixas). |
| `edge.cashraven.io:9000` | Backend do proxyware CashRaven. |

## Como verificar a resposta da API (sem a app)

A API responde provavelmente com blobs cifrados pelo esquema Baker. Para confirmar,
basta um pedido com o User-Agent certo e passar a resposta pelo `baker_decrypt.py`:

```bash
curl -s -A "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36" \
     "https://cfyadmiin1.top/" | python3 baker_decrypt.py
```

(O objetivo da análise é documentar a infraestrutura e o esquema de cifra, não
extrair nem redistribuir os links de streams pirata.)

## Reputação

A família de domínios `cricfy.*` está marcada como maliciosa/phishing em vários
serviços de reputação (ver fontes no README e abaixo). `cfyadmiin1.top` é
infraestrutura descartável associada à mesma operação.

Fontes:
- urlscan.io: resultado para a infraestrutura cricfy — https://urlscan.io/result/019e17a3-2f85-726f-b273-1fc4baa96667
- PhishDestroy: relatório de cricfy.co — https://phishdestroy.io/hi/domain/cricfy.co/
- urlert: investigação de ameaça sobre cricfy.net — https://www.urlert.com/domains/cricfy.net
- Whoxy: domínios com a keyword cricfytv — https://www.whoxy.com/keyword/cricfytv

#!/usr/bin/env python3
"""
Reimplementacao de com.android.vending.networking.Baker.merge(String, Context)
-> AesDecrypt_decrypt(const std::string&) em libnative-lib.so (arm64-v8a).

Engenharia reversa a partir da funcao nativa em 0x675c0 (AesDecrypt_decrypt)
e do ajudante em 0x68988 (base64 decode via android.util.Base64).

Apesar do nome "AesDecrypt", NAO ha AES nenhum. E uma cifra de fluxo caseira:

    bruto       = Base64.decode(entrada, NO_WRAP)
    chave       = bruto[:16]                 # primeiros 16 bytes
    cifrado     = bruto[16:]                  # o resto
    bloco_i     = SHA-256(chave || be32(i))   # i = 0,1,2,... contador big-endian de 4 bytes
    keystream   = bloco_0 || bloco_1 || ...   # 32 bytes por bloco
    claro       = cifrado XOR keystream

Como a chave vai dentro do proprio blob (nao ha chave fixa no binario), qualquer
blob produzido pela app e decifravel so com isto, sem segredos adicionais.

Uso:
    python3 baker_decrypt.py "<string base64 do app>"
    echo "<base64>" | python3 baker_decrypt.py
"""
import sys, base64, hashlib, struct


def baker_decrypt(b64_text: str) -> bytes:
    raw = base64.b64decode(b64_text)
    if len(raw) < 16:
        raise ValueError("blob demasiado curto: faltam os 16 bytes de chave")
    key, ct = raw[:16], raw[16:]
    out = bytearray()
    for i in range((len(ct) + 31) // 32):
        ks = hashlib.sha256(key + struct.pack(">I", i)).digest()
        blk = ct[i * 32:(i + 1) * 32]
        out += bytes(a ^ b for a, b in zip(blk, ks))
    return bytes(out)


def baker_encrypt(plaintext: bytes, key16: bytes) -> str:
    """Inverso, util so para provar que o algoritmo fecha (round-trip)."""
    assert len(key16) == 16
    ct = bytearray()
    for i in range((len(plaintext) + 31) // 32):
        ks = hashlib.sha256(key16 + struct.pack(">I", i)).digest()
        blk = plaintext[i * 32:(i + 1) * 32]
        ct += bytes(a ^ b for a, b in zip(blk, ks))
    return base64.b64encode(key16 + bytes(ct)).decode()


if __name__ == "__main__":
    data = sys.argv[1] if len(sys.argv) > 1 else sys.stdin.read().strip()
    dec = baker_decrypt(data)
    try:
        print(dec.decode("utf-8"))
    except UnicodeDecodeError:
        sys.stdout.buffer.write(dec)

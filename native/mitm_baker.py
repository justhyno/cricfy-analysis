"""
Addon mitmproxy para a analise da CricFy TV.

Para cada pedido/resposta, procura strings base64 compridas no corpo (e em alguns
cabecalhos/campos JSON) e tenta decifra-las com o esquema do Baker.merge
(SHA-256 em modo contador, ver baker_decrypt.py). Quando o resultado parece texto
util (URL, JSON), imprime-o. Assim, se a API da app devolver configuracao cifrada,
ve-se o conteudo real em claro no momento da captura.

Uso:
    mitmdump -s native/mitm_baker.py
    # ou, so para dominios suspeitos:
    mitmdump -s native/mitm_baker.py "~d xyz"
"""
import re
import base64
from baker_decrypt import baker_decrypt

from mitmproxy import http, ctx

B64 = re.compile(rb"[A-Za-z0-9+/]{40,}={0,2}")
INTERESTING = ("xyz", "cricfy", "cfynewtv", "api")


def _looks_text(b: bytes) -> bool:
    if not b:
        return False
    printable = sum(1 for c in b if 9 <= c <= 13 or 32 <= c <= 126)
    return printable / len(b) > 0.85


def _scan(label: str, flow: http.HTTPFlow, body: bytes):
    for m in set(B64.findall(body)):
        if len(m) % 4:
            continue
        try:
            dec = baker_decrypt(m.decode())
        except Exception:
            continue
        if _looks_text(dec):
            ctx.log.alert(
                "\n[BAKER %s] %s\n  blob: %s...\n  claro: %s\n"
                % (label, flow.request.pretty_url, m[:40].decode(), dec[:400])
            )


def request(flow: http.HTTPFlow):
    if flow.request.content:
        _scan("REQ", flow, flow.request.content)


def response(flow: http.HTTPFlow):
    host = flow.request.pretty_host
    if any(k in host for k in INTERESTING):
        ctx.log.info("[trafego] %s %s -> %s"
                     % (flow.request.method, flow.request.pretty_url,
                        flow.response.status_code if flow.response else "?"))
    if flow.response and flow.response.content:
        _scan("RESP", flow, flow.response.content)

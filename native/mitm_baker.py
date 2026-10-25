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
import os
import re
import base64
from baker_decrypt import baker_decrypt

from mitmproxy import http, ctx

B64 = re.compile(rb"[A-Za-z0-9+/]{40,}={0,2}")
INTERESTING = ("xyz", "cricfy", "cfynewtv")
SKIP_HOSTS = ("google", "gstatic", "googleapis", "android", "gvt1", "gvt2",
              "firebase", "crashlytics", "doubleclick", "unity3d", "ironsrc")

LOG = os.path.expanduser("~/Public/baker_capture.log")


def _w(line: str):
    with open(LOG, "a") as f:
        f.write(line + "\n")
        f.flush()


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
            msg = ("[BAKER %s] %s\n  blob: %s...\n  claro: %s"
                   % (label, flow.request.pretty_url, m[:40].decode(), dec[:600]))
            ctx.log.alert("\n" + msg + "\n")
            _w(msg)


def _relevant(host: str) -> bool:
    if any(k in host for k in SKIP_HOSTS):
        return False
    return True


def request(flow: http.HTTPFlow):
    if _relevant(flow.request.pretty_host):
        _w("[REQ] %s %s" % (flow.request.method, flow.request.pretty_url))
    if flow.request.content:
        _scan("REQ", flow, flow.request.content)


def response(flow: http.HTTPFlow):
    host = flow.request.pretty_host
    if _relevant(host):
        line = ("[RESP] %s %s -> %s  (%s)"
                % (flow.request.method, flow.request.pretty_url,
                   flow.response.status_code if flow.response else "?",
                   flow.response.headers.get("content-type", "") if flow.response else ""))
        ctx.log.info(line)
        _w(line)
    if flow.response and flow.response.content:
        _scan("RESP", flow, flow.response.content)


def tls_failed_client(data):
    try:
        host = data.context.client.sni or str(data.conn.address)
    except Exception:
        host = "?"
    if _relevant(str(host)):
        _w("[TLS-FAIL] %s  (app nao confia no certificado -> precisa caminho B)" % host)

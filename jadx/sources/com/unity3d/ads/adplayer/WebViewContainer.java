package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import org.json.JSONArray;
import p000.lg3;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes33.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, z50 z50Var);

    Object destroy(z50 z50Var);

    Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, z50 z50Var);

    lg3 getLastInputEvent();

    WebView getWebView();

    lg3 isRenderProcessGone();

    Object loadUrl(String str, z50 z50Var);
}

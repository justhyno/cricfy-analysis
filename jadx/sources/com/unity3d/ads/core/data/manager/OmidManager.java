package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import p000.d6;
import p000.dk2;
import p000.e6;
import p000.f6;
import p000.ij2;
import p000.n70;
import p000.s5;
import p000.te1;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes43.dex */
public interface OmidManager {
    void activate(Context context);

    s5 createAdEvents(d6 d6Var);

    d6 createAdSession(e6 e6Var, f6 f6Var);

    e6 createAdSessionConfiguration(n70 n70Var, te1 te1Var, ij2 ij2Var, ij2 ij2Var2, boolean z);

    f6 createHtmlAdSessionContext(dk2 dk2Var, WebView webView, String str, String str2);

    f6 createJavaScriptAdSessionContext(dk2 dk2Var, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}

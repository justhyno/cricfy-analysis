package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import java.util.Map;
import p000.a41;
import p000.ta3;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes12.dex */
public interface WebViewBridge {
    Map<String, a41> getExposedFunctions();

    ta3 getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, z50 z50Var);

    Object sendEvent(WebViewEvent webViewEvent, z50 z50Var);

    void setExposedFunctions(Map<String, ? extends a41> map);
}

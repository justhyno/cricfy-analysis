package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes8.dex */
public interface GetAdPlayer {
    AdPlayer invoke(WebViewBridge webViewBridge, WebViewContainer webViewContainer, AdObject adObject, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType);
}

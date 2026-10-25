package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes33.dex */
public interface SendWebViewClientErrorDiagnostics {
    void invoke(List<WebViewClientError> list, AdObject adObject);
}

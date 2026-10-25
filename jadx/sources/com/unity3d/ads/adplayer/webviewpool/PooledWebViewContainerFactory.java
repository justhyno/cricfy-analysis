package com.unity3d.ads.adplayer.webviewpool;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import p000.y60;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes49.dex */
public interface PooledWebViewContainerFactory {
    AndroidWebViewContainer create(PoolEntry poolEntry, y60 y60Var, AdObject adObject);
}

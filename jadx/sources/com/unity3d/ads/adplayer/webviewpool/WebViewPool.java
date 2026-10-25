package com.unity3d.ads.adplayer.webviewpool;

import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes38.dex */
public interface WebViewPool {
    Object acquireForShow(z50 z50Var);

    Object acquireFreshEntry(z50 z50Var);

    Object enqueueRecycled(PoolEntry poolEntry, z50 z50Var);

    Object initialize(int i, z50 z50Var);

    Object release(PoolEntry poolEntry, z50 z50Var);

    Object resetEntry(PoolEntry poolEntry, z50 z50Var);
}

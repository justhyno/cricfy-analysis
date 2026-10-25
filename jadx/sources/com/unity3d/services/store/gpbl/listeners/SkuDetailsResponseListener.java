package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes12.dex */
public interface SkuDetailsResponseListener {
    void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List<? extends SkuDetailsBridge> list);
}

package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes38.dex */
public interface GetTransactionData {
    TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, String str);
}

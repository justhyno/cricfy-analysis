package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes25.dex */
public interface IBillingClientBuilderBridge {
    IBillingClient build() throws ClassNotFoundException;

    IBillingClientBuilderBridge enablePendingPurchases();

    IBillingClientBuilderBridge setListener(PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}

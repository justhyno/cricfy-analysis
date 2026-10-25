package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes48.dex */
public interface GetTransactionRequest {
    Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, z50 z50Var);
}

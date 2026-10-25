package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.AdResponseOuterClass;
import p000.q41;
import p000.y60;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes10.dex */
public interface PreShowWebViewStrategy {
    Object acquireForShow(y60 y60Var, AdObject adObject, z50 z50Var);

    Object onAdExpired(AdObject adObject, z50 z50Var);

    Object onLoadSuccess(AdObject adObject, String str, AdResponseOuterClass.AdResponse adResponse, y60 y60Var, q41 q41Var, z50 z50Var);

    Object onShowComplete(AdObject adObject, z50 z50Var);
}

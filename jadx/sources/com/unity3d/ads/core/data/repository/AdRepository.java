package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes28.dex */
public interface AdRepository {
    void addAd(ByteString byteString, AdObject adObject);

    void enqueueOpportunityForPlacement(String str, ByteString byteString);

    AdObject getAd(ByteString byteString);

    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(ByteString byteString);

    ByteString pollOpportunityIdForPlacement(String str);

    void removeAd(ByteString byteString);
}

package com.unity3d.ads;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes21.dex */
public interface ShowListener<UnityAd> {
    void onClicked(UnityAd unityad);

    void onCompleted(UnityAd unityad, ShowFinishState showFinishState);

    void onFailed(UnityAd unityad, UnityAdsError unityAdsError);

    void onStarted(UnityAd unityad);
}

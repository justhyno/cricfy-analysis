package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.InternalLoadListener;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes23.dex */
public interface IUnityAds {
    @Deprecated
    boolean getDebugMode();

    String getToken();

    void getToken(IUnityAdsTokenListener iUnityAdsTokenListener);

    void getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener);

    String getVersion();

    void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener);

    boolean isInitialized();

    @Deprecated
    boolean isSupported();

    void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener);

    void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener);

    @Deprecated
    void setDebugMode(boolean z);

    void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener);
}

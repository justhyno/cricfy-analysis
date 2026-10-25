package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes32.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, z50 z50Var);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(z50 z50Var);

    Object getIdfi(z50 z50Var);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(z50 z50Var);
}

package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes3.dex */
public interface StorageManager {
    void addStorageLocation(StorageManager.StorageType storageType, String str);

    Storage getStorage(StorageManager.StorageType storageType);

    void hasInitialized();

    boolean hasStorage(StorageManager.StorageType storageType);

    boolean init(Context context);

    void initStorage(StorageManager.StorageType storageType);

    void removeStorage(StorageManager.StorageType storageType);
}

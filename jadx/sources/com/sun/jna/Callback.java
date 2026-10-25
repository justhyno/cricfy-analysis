package com.sun.jna;

import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes33.dex */
public interface Callback {
    public static final List<String> FORBIDDEN_NAMES = null;
    public static final String METHOD_NAME = "callback";

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes8.dex */
    public interface UncaughtExceptionHandler {
        void uncaughtException(Callback callback, Throwable th);
    }
}

package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes27.dex */
public interface InvocationMapper {
    InvocationHandler getInvocationHandler(NativeLibrary nativeLibrary, Method method);
}

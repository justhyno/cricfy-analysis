package com.sun.jna.win32;

import com.sun.jna.Callback;
import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes41.dex */
public interface StdCallLibrary extends Library, StdCall {
    public static final FunctionMapper FUNCTION_MAPPER = null;
    public static final int STDCALL_CONVENTION = 63;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public interface StdCallCallback extends Callback, StdCall {
    }
}

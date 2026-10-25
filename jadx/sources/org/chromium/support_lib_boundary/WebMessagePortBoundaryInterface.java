package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes6.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler, Handler handler);
}

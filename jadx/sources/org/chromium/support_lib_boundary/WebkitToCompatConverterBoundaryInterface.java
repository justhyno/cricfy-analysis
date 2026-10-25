package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes11.dex */
public interface WebkitToCompatConverterBoundaryInterface {
    InvocationHandler convertCookieManager(Object obj);

    Object convertSafeBrowsingResponse(InvocationHandler invocationHandler);

    InvocationHandler convertSafeBrowsingResponse(Object obj);

    Object convertServiceWorkerSettings(InvocationHandler invocationHandler);

    InvocationHandler convertServiceWorkerSettings(Object obj);

    InvocationHandler convertSettings(WebSettings webSettings);

    Object convertWebMessagePort(InvocationHandler invocationHandler);

    InvocationHandler convertWebMessagePort(Object obj);

    Object convertWebResourceError(InvocationHandler invocationHandler);

    InvocationHandler convertWebResourceError(Object obj);

    InvocationHandler convertWebResourceRequest(WebResourceRequest webResourceRequest);
}

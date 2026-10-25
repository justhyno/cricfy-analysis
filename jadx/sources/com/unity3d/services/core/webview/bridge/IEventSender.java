package com.unity3d.services.core.webview.bridge;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes46.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> r1, Enum<?> r2, Object... objArr);
}

package okhttp3;

import java.io.IOException;
import p000.a41;
import p000.jo3;
import p000.zj1;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes45.dex */
public interface Call extends Cloneable {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes28.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void addEventListener(EventListener eventListener);

    void cancel();

    /* renamed from: clone */
    Call mo11855clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    <T> T tag(Class<? extends T> cls);

    <T> T tag(Class<T> cls, a41 a41Var);

    <T> T tag(zj1 zj1Var);

    <T> T tag(zj1 zj1Var, a41 a41Var);

    jo3 timeout();
}

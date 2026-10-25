package okhttp3.internal.dns;

import java.io.IOException;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes7.dex */
public interface DnsQuery {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes37.dex */
    public interface Callback {
        void onFailure(IOException iOException);

        void onResponse(DnsMessage dnsMessage);
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes21.dex */
    public interface Factory {
        DnsQuery newQuery(Question question);
    }

    void cancel();

    void enqueue(Callback callback);
}

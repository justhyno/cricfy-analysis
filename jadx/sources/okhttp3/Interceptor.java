package okhttp3;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes14.dex */
public interface Interceptor {
    public static final Companion Companion = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes26.dex */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Authenticator getAuthenticator();

        Cache getCache();

        CertificatePinner getCertificatePinner();

        ConnectionPool getConnectionPool();

        CookieJar getCookieJar();

        Dns getDns();

        EventListener getEventListener();

        boolean getFollowRedirects();

        boolean getFollowSslRedirects();

        HostnameVerifier getHostnameVerifier();

        Proxy getProxy();

        Authenticator getProxyAuthenticator();

        ProxySelector getProxySelector();

        boolean getRetryOnConnectionFailure();

        SocketFactory getSocketFactory();

        SSLSocketFactory getSslSocketFactoryOrNull();

        X509TrustManager getX509TrustManagerOrNull();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withAuthenticator(Authenticator authenticator);

        Chain withCache(Cache cache);

        Chain withCertificatePinner(CertificatePinner certificatePinner);

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withConnectionPool(ConnectionPool connectionPool);

        Chain withCookieJar(CookieJar cookieJar);

        Chain withDns(Dns dns);

        Chain withHostnameVerifier(HostnameVerifier hostnameVerifier);

        Chain withProxy(Proxy proxy);

        Chain withProxyAuthenticator(Authenticator authenticator);

        Chain withProxySelector(ProxySelector proxySelector);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withRetryOnConnectionFailure(boolean z);

        Chain withSocketFactory(SocketFactory socketFactory);

        Chain withSslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes45.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-395150962 < 0) in method: okhttp3.Interceptor.Companion.<init>():void, file: classes45.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-395150962 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-395150962 < 0) in method: okhttp3.Interceptor.Companion.<init>():void, file: classes45.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Interceptor.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1632953910 < 0) in method: okhttp3.Interceptor.Companion.invoke(c41):okhttp3.Interceptor, file: classes45.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1632953910 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.Interceptor invoke(p000.c41 r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1632953910 < 0) in method: okhttp3.Interceptor.Companion.invoke(c41):okhttp3.Interceptor, file: classes45.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Interceptor.Companion.invoke(c41):okhttp3.Interceptor");
        }
    }

    Response intercept(Chain chain) throws IOException;
}

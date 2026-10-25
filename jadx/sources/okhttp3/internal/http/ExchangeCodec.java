package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
import p000.hd3;
import p000.mc3;
import p000.sd3;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes24.dex */
public interface ExchangeCodec {
    public static final Companion Companion = null;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes23.dex */
    public interface Carrier {
        /* renamed from: cancel */
        void mo11852cancel();

        Route getRoute();

        void noNewExchanges();

        void trackFailure(RealCall realCall, IOException iOException);
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes8.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1299239470 < 0) in method: okhttp3.internal.http.ExchangeCodec.Companion.<init>():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1299239470 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1299239470 < 0) in method: okhttp3.internal.http.ExchangeCodec.Companion.<init>():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.ExchangeCodec.Companion.<init>():void");
        }
    }

    void cancel();

    mc3 createRequestBody(Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    Carrier getCarrier();

    hd3 getSocket();

    boolean isResponseComplete();

    sd3 openResponseBodySource(Response response) throws IOException;

    Headers peekTrailers() throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(Response response) throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}

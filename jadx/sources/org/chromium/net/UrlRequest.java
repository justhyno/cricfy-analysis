package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes38.dex */
public abstract class UrlRequest {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes45.dex */
    public static abstract class Builder {
        public static final int REQUEST_PRIORITY_HIGHEST = 4;
        public static final int REQUEST_PRIORITY_IDLE = 0;
        public static final int REQUEST_PRIORITY_LOW = 2;
        public static final int REQUEST_PRIORITY_LOWEST = 1;
        public static final int REQUEST_PRIORITY_MEDIUM = 3;

        public abstract Builder addHeader(String str, String str2);

        public abstract Builder allowDirectExecutor();

        public abstract UrlRequest build();

        public abstract Builder disableCache();

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes.dex */
    public static abstract class Callback {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (648103202 > 464228) in method: org.chromium.net.UrlRequest.Callback.onCanceled(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void, file: classes.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (648103202 > 464228)
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
        public void onCanceled(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (648103202 > 464228) in method: org.chromium.net.UrlRequest.Callback.onCanceled(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void, file: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.UrlRequest.Callback.onCanceled(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
        }

        public abstract void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException);

        public abstract void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception;

        public abstract void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception;

        public abstract void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception;

        public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo);
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes39.dex */
    public static class Status {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-746212269 < 0) in method: org.chromium.net.UrlRequest.Status.<init>():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-746212269 < 0)
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
        private Status() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-746212269 < 0) in method: org.chromium.net.UrlRequest.Status.<init>():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.UrlRequest.Status.<init>():void");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes4.dex */
    public static abstract class StatusListener {
        public abstract void onStatus(int i);
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(StatusListener statusListener);

    public abstract boolean isDone();

    public abstract void read(ByteBuffer byteBuffer);

    public abstract void start();
}

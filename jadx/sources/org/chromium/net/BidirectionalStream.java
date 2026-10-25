package org.chromium.net;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes23.dex */
public abstract class BidirectionalStream {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes26.dex */
    public static abstract class Builder {
        public static final int STREAM_PRIORITY_HIGHEST = 4;
        public static final int STREAM_PRIORITY_IDLE = 0;
        public static final int STREAM_PRIORITY_LOW = 2;
        public static final int STREAM_PRIORITY_LOWEST = 1;
        public static final int STREAM_PRIORITY_MEDIUM = 3;

        public abstract Builder addHeader(String str, String str2);

        public abstract BidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z);

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes34.dex */
    public static abstract class Callback {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1324105454 > 358344) in method: org.chromium.net.BidirectionalStream.Callback.onCanceled(org.chromium.net.BidirectionalStream, org.chromium.net.UrlResponseInfo):void, file: classes34.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1324105454 > 358344)
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
        public void onCanceled(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1324105454 > 358344) in method: org.chromium.net.BidirectionalStream.Callback.onCanceled(org.chromium.net.BidirectionalStream, org.chromium.net.UrlResponseInfo):void, file: classes34.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.BidirectionalStream.Callback.onCanceled(org.chromium.net.BidirectionalStream, org.chromium.net.UrlResponseInfo):void");
        }

        public abstract void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException);

        public abstract void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z);

        public abstract void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo);

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1918348594 < 0) in method: org.chromium.net.BidirectionalStream.Callback.onResponseTrailersReceived(org.chromium.net.BidirectionalStream, org.chromium.net.UrlResponseInfo, org.chromium.net.UrlResponseInfo$HeaderBlock):void, file: classes34.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1918348594 < 0)
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
        public void onResponseTrailersReceived(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2, org.chromium.net.UrlResponseInfo.HeaderBlock r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1918348594 < 0) in method: org.chromium.net.BidirectionalStream.Callback.onResponseTrailersReceived(org.chromium.net.BidirectionalStream, org.chromium.net.UrlResponseInfo, org.chromium.net.UrlResponseInfo$HeaderBlock):void, file: classes34.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.BidirectionalStream.Callback.onResponseTrailersReceived(org.chromium.net.BidirectionalStream, org.chromium.net.UrlResponseInfo, org.chromium.net.UrlResponseInfo$HeaderBlock):void");
        }

        public abstract void onStreamReady(BidirectionalStream bidirectionalStream);

        public abstract void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo);

        public abstract void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z);
    }

    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(ByteBuffer byteBuffer);

    public abstract void start();

    public abstract void write(ByteBuffer byteBuffer, boolean z);
}

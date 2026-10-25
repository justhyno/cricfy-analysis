package org.chromium.net;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes24.dex */
public abstract class NetworkException extends CronetException {
    public static final int ERROR_ADDRESS_UNREACHABLE = 9;
    public static final int ERROR_CONNECTION_CLOSED = 5;
    public static final int ERROR_CONNECTION_REFUSED = 7;
    public static final int ERROR_CONNECTION_RESET = 8;
    public static final int ERROR_CONNECTION_TIMED_OUT = 6;
    public static final int ERROR_HOSTNAME_NOT_RESOLVED = 1;
    public static final int ERROR_INTERNET_DISCONNECTED = 2;
    public static final int ERROR_NETWORK_CHANGED = 3;
    public static final int ERROR_OTHER = 11;
    public static final int ERROR_QUIC_PROTOCOL_FAILED = 10;
    public static final int ERROR_TIMED_OUT = 4;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1396589674 < 0) in method: org.chromium.net.NetworkException.<init>(java.lang.String, java.lang.Throwable):void, file: classes24.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1396589674 < 0)
        	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
        	at java.base/java.nio.Buffer.position(Buffer.java:327)
        	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
        	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
        	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
        	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
        	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
        	... 6 more
        */
    public NetworkException(java.lang.String r1, java.lang.Throwable r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1396589674 < 0) in method: org.chromium.net.NetworkException.<init>(java.lang.String, java.lang.Throwable):void, file: classes24.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkException.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public abstract int getCronetInternalErrorCode();

    public abstract int getErrorCode();

    public abstract boolean immediatelyRetryable();
}

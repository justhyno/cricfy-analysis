package com.unity3d.coherence;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes5.dex */
final class CoherenceBridge {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1575167326 < 0) in method: com.unity3d.coherence.CoherenceBridge.<init>():void, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1575167326 < 0)
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
    private CoherenceBridge() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1575167326 < 0) in method: com.unity3d.coherence.CoherenceBridge.<init>():void, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.coherence.CoherenceBridge.<init>():void");
    }

    public static native byte[] getCommonAttributes(long j, int i, int i2);

    public static native byte[] getVersions(long j);

    public static native long init(Coherence coherence, String str, int i);

    public static native boolean isInitialized(long j);

    public static native void setExternalUserId(long j, String str);

    public static native void setLogHandler(LogHandler logHandler);

    public static native long vmCreate(long j, byte[] bArr);

    public static native void vmDrop(long j, long j2);

    public static native VmInvokeResult vmInvokeMain(long j, long j2, byte[] bArr);

    public static native String vmLastError(long j);
}

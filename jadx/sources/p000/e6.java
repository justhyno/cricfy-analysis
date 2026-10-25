package p000;

/* loaded from: classes33.dex */
public final class e6 {

    /* renamed from: a */
    public final ij2 f5965a;

    /* renamed from: b */
    public final ij2 f5966b;

    /* renamed from: c */
    public final boolean f5967c;

    /* renamed from: d */
    public final n70 f5968d;

    /* renamed from: e */
    public final te1 f5969e;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (19336578 > 410888) in method: e6.<init>(n70, te1, ij2, ij2, boolean):void, file: classes33.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (19336578 > 410888)
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
    public e6(p000.n70 r1, p000.te1 r2, p000.ij2 r3, p000.ij2 r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (19336578 > 410888) in method: e6.<init>(n70, te1, ij2, ij2, boolean):void, file: classes33.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e6.<init>(n70, te1, ij2, ij2, boolean):void");
    }
}

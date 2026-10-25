package p000;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes47.dex */
public interface iy1 extends n73 {
    /* renamed from: b */
    long mo5154b(long j, i63 i63Var);

    /* renamed from: f */
    long mo5155f(ns0[] ns0VarArr, boolean[] zArr, h43[] h43VarArr, boolean[] zArr2, long j);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1327880802 > 346160) in method: iy1.h():void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1327880802 > 346160)
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
    /* renamed from: h */
    default void mo5374h() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1327880802 > 346160) in method: iy1.h():void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iy1.mo5374h():void");
    }

    /* renamed from: j */
    void mo5156j();

    /* renamed from: l */
    long mo5157l(long j);

    /* renamed from: m */
    void mo5158m(long j);

    /* renamed from: q */
    long mo5159q();

    /* renamed from: s */
    void mo5160s(hy1 hy1Var, long j);

    /* renamed from: t */
    sp3 mo5161t();
}

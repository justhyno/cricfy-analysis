package p000;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes30.dex */
public abstract class v03 implements w03 {

    /* renamed from: a */
    public final int f19955a;

    /* renamed from: b */
    public final String f19956b;

    /* renamed from: c */
    public final String f19957c;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-755732401 < 0) in method: v03.<init>(int, java.lang.String, java.lang.String):void, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-755732401 < 0)
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
    public v03(int r1, java.lang.String r2, java.lang.String r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-755732401 < 0) in method: v03.<init>(int, java.lang.String, java.lang.String):void, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v03.<init>(int, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public abstract void mo3431a(i33 i33Var);

    /* renamed from: b */
    public abstract void mo3432b(i33 i33Var);

    /* renamed from: c */
    public abstract void mo3433c(i33 i33Var);

    /* renamed from: d */
    public abstract void mo3434d(i33 i33Var);

    /* renamed from: e */
    public abstract void mo3435e(i33 i33Var);

    /* renamed from: f */
    public abstract void mo3436f(i33 i33Var);

    /* renamed from: g */
    public abstract q7 mo3437g(i33 i33Var);
}

package p000;

import java.util.UUID;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes8.dex */
public interface dl0 {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (908230193 > 380432) in method: dl0.b(dl0, dl0):void, file: classes8.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (908230193 > 380432)
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
    /* renamed from: b */
    static void m3200b(p000.dl0 r0, p000.dl0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (908230193 > 380432) in method: dl0.b(dl0, dl0):void, file: classes8.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dl0.m3200b(dl0, dl0):void");
    }

    /* renamed from: a */
    UUID mo3201a();

    /* renamed from: c */
    boolean mo3202c();

    /* renamed from: d */
    void mo3203d(gl0 gl0Var);

    /* renamed from: e */
    void mo3204e(gl0 gl0Var);

    /* renamed from: f */
    boolean mo3205f(String str);

    /* renamed from: g */
    k31 mo3206g();

    cl0 getError();

    int getState();
}

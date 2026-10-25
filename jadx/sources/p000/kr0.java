package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes8.dex */
public interface kr0 {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1341357612 < 0) in method: kr0.B(byte[], en2):void, file: classes8.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1341357612 < 0)
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
    /* renamed from: B */
    default void mo6209B(byte[] r1, p000.en2 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1341357612 < 0) in method: kr0.B(byte[], en2):void, file: classes8.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kr0.mo6209B(byte[], en2):void");
    }

    /* renamed from: a */
    Map mo3100a(byte[] bArr);

    /* renamed from: e */
    void mo3102e(xm4 xm4Var);

    /* renamed from: i */
    jr0 mo3104i();

    /* renamed from: m */
    k31 mo3108m(byte[] bArr);

    /* renamed from: n */
    byte[] mo3109n();

    /* renamed from: p */
    boolean mo3111p(byte[] bArr, String str);

    /* renamed from: q */
    void mo3112q(byte[] bArr, byte[] bArr2);

    void release();

    /* renamed from: s */
    void mo3113s(byte[] bArr);

    /* renamed from: w */
    byte[] mo3114w(byte[] bArr, byte[] bArr2);

    /* renamed from: x */
    void mo3115x(byte[] bArr);

    /* renamed from: y */
    ir0 mo3116y(byte[] bArr, List list, int i, HashMap hashMap);

    /* renamed from: z */
    int mo3117z();
}

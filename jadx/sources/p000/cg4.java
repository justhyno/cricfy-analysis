package p000;

import android.os.Bundle;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes27.dex */
public abstract class cg4 extends ja4 {

    /* renamed from: f */
    public final /* synthetic */ int f3328f;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-68759533 < 0) in method: cg4.<init>(int):void, file: classes27.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-68759533 < 0)
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
    public cg4(int r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-68759533 < 0) in method: cg4.<init>(int):void, file: classes27.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cg4.<init>(int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (481975975 > 347704) in method: cg4.N(int, android.os.Parcel, android.os.Parcel):boolean, file: classes27.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (481975975 > 347704)
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
    @Override // p000.ja4
    /* renamed from: N */
    public final boolean mo1550N(int r1, android.os.Parcel r2, android.os.Parcel r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (481975975 > 347704) in method: cg4.N(int, android.os.Parcel, android.os.Parcel):boolean, file: classes27.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cg4.mo1550N(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* renamed from: O */
    public abstract void mo2020O(int i);

    /* renamed from: P */
    public abstract void mo2021P(int i);

    /* renamed from: Q */
    public abstract void mo2022Q(int i);

    /* renamed from: R */
    public abstract void mo2023R(ee eeVar, String str, String str2, boolean z);

    /* renamed from: S */
    public abstract void mo2024S(int i);

    /* renamed from: T */
    public abstract void mo2025T(int i);

    /* renamed from: U */
    public abstract void mo2026U(int i);

    /* renamed from: V */
    public abstract void mo2027V(int i);

    /* renamed from: W */
    public abstract void mo2028W();

    /* renamed from: X */
    public abstract void mo2029X(be4 be4Var);

    /* renamed from: Y */
    public abstract void mo2030Y(xb4 xb4Var);

    /* renamed from: Z */
    public abstract void mo2031Z(String str, String str2);

    public abstract void a0(byte[] bArr, String str);

    public abstract void b0(int i, long j);

    public abstract void c0(long j);

    /* renamed from: y */
    public abstract void mo2032y(Bundle bundle);
}

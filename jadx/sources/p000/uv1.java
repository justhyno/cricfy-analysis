package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes23.dex */
public interface uv1 {
    /* renamed from: B */
    void mo6380B(ArrayList arrayList);

    /* renamed from: C */
    void mo6381C(lw1 lw1Var, Handler handler);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1635983491 > 406240) in method: uv1.F(qb):void, file: classes23.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1635983491 > 406240)
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
    /* renamed from: F */
    default void mo9466F(p000.qb r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1635983491 > 406240) in method: uv1.F(qb):void, file: classes23.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uv1.mo9466F(qb):void");
    }

    /* renamed from: G */
    void mo6383G(ArrayList arrayList);

    /* renamed from: a */
    void mo6396a(Bundle bundle);

    /* renamed from: b */
    void mo6397b(int i, x70 x70Var, long j, int i2);

    /* renamed from: c */
    void mo6398c(int i, int i2, long j, int i3);

    /* renamed from: e */
    void mo6399e(int i);

    /* renamed from: f */
    MediaFormat mo6400f();

    void flush();

    /* renamed from: g */
    void mo6401g();

    /* renamed from: h */
    void mo6402h(int i, long j);

    /* renamed from: i */
    int mo6403i();

    /* renamed from: m */
    int mo6404m(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: o */
    void mo6405o(int i);

    void release();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1453462330 < 0) in method: uv1.u(xm4):boolean, file: classes23.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1453462330 < 0)
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
    /* renamed from: u */
    default boolean mo9469u(p000.xm4 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1453462330 < 0) in method: uv1.u(xm4):boolean, file: classes23.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uv1.mo9469u(xm4):boolean");
    }

    /* renamed from: v */
    ByteBuffer mo6406v(int i);

    /* renamed from: w */
    void mo6407w(Surface surface);

    /* renamed from: z */
    ByteBuffer mo6408z(int i);
}

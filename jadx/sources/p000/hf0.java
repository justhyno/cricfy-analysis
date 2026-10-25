package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes39.dex */
public final class hf0 {

    /* renamed from: f */
    public static final Logger f8985f = null;

    /* renamed from: a */
    public final b22 f8986a;

    /* renamed from: b */
    public final Executor f8987b;

    /* renamed from: c */
    public final m72 f8988c;

    /* renamed from: d */
    public final m33 f8989d;

    /* renamed from: e */
    public final m33 f8990e;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1322690972 > 388180) in method: hf0.<init>(java.util.concurrent.Executor, m72, b22, m33, m33):void, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1322690972 > 388180)
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
    public hf0(java.util.concurrent.Executor r1, p000.m72 r2, p000.b22 r3, p000.m33 r4, p000.m33 r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1322690972 > 388180) in method: hf0.<init>(java.util.concurrent.Executor, m72, b22, m33, m33):void, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hf0.<init>(java.util.concurrent.Executor, m72, b22, m33, m33):void");
    }
}

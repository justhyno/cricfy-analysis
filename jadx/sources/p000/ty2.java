package p000;

import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes33.dex */
public abstract class ty2 {

    /* renamed from: o */
    public final a11 f19069o;

    /* renamed from: p */
    public final ee1 f19070p;

    /* renamed from: q */
    public final long f19071q;

    /* renamed from: r */
    public final List f19072r;

    /* renamed from: s */
    public final gu2 f19073s;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1245635553 > 410888) in method: ty2.<init>(a11, java.util.List, v63, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void, file: classes33.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1245635553 > 410888)
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
    public ty2(p000.a11 r1, java.util.List r2, p000.v63 r3, java.util.ArrayList r4, java.util.ArrayList r5, java.util.ArrayList r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1245635553 > 410888) in method: ty2.<init>(a11, java.util.List, v63, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void, file: classes33.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ty2.<init>(a11, java.util.List, v63, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: a */
    public abstract String mo8884a();

    /* renamed from: c */
    public abstract u90 mo8886c();

    /* renamed from: d */
    public abstract gu2 mo8887d();
}

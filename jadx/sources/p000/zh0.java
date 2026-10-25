package p000;

import java.util.TreeMap;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes14.dex */
public final class zh0 {

    /* renamed from: a */
    public final String f23832a;

    /* renamed from: b */
    public final String f23833b;

    /* renamed from: c */
    public final long f23834c;

    /* renamed from: d */
    public long f23835d;

    /* renamed from: e */
    public int f23836e;

    /* renamed from: f */
    public final int f23837f;

    /* renamed from: g */
    public final int f23838g;

    /* renamed from: h */
    public int[] f23839h;

    /* renamed from: i */
    public final TreeMap f23840i;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1007239175 > 393876) in method: zh0.<init>(java.lang.String, java.lang.String, long, int, int, int, int[], java.util.TreeMap):void, file: classes14.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1007239175 > 393876)
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
    public zh0(java.lang.String r1, java.lang.String r2, long r3, int r5, int r6, int r7, int[] r8, java.util.TreeMap r9) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1007239175 > 393876) in method: zh0.<init>(java.lang.String, java.lang.String, long, int, int, int, int[], java.util.TreeMap):void, file: classes14.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zh0.<init>(java.lang.String, java.lang.String, long, int, int, int, int[], java.util.TreeMap):void");
    }
}

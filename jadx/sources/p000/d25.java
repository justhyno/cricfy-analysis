package p000;

import java.util.HashMap;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes.dex */
public final class d25 {

    /* renamed from: a */
    public final long f4948a;

    /* renamed from: b */
    public final ou4 f4949b;

    /* renamed from: c */
    public final String f4950c;

    /* renamed from: d */
    public final HashMap f4951d;

    /* renamed from: e */
    public final hy4 f4952e;

    /* renamed from: f */
    public final long f4953f;

    /* renamed from: g */
    public final long f4954g;

    /* renamed from: h */
    public final long f4955h;

    /* renamed from: i */
    public final int f4956i;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1516188563 < 0) in method: d25.<init>(long, ou4, java.lang.String, java.util.HashMap, hy4, long, long, long, int):void, file: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1516188563 < 0)
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
    public /* synthetic */ d25(long r1, p000.ou4 r3, java.lang.String r4, java.util.HashMap r5, p000.hy4 r6, long r7, long r9, long r11, int r13) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1516188563 < 0) in method: d25.<init>(long, ou4, java.lang.String, java.util.HashMap, hy4, long, long, long, int):void, file: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d25.<init>(long, ou4, java.lang.String, java.util.HashMap, hy4, long, long, long, int):void");
    }
}

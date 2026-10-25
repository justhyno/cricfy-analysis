package p000;

import sun.misc.Unsafe;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes39.dex */
public abstract class fv3 {

    /* renamed from: a */
    public final /* synthetic */ int f7509a;

    /* renamed from: b */
    public final Unsafe f7510b;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1486856349 < 0) in method: fv3.<init>(sun.misc.Unsafe, int):void, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1486856349 < 0)
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
    public /* synthetic */ fv3(sun.misc.Unsafe r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1486856349 < 0) in method: fv3.<init>(sun.misc.Unsafe, int):void, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fv3.<init>(sun.misc.Unsafe, int):void");
    }

    /* renamed from: a */
    public abstract void mo2869a(long j, byte[] bArr, long j2, long j3);

    /* renamed from: b */
    public abstract void mo2870b(byte[] bArr, long j, long j2, long j3);

    /* renamed from: c */
    public abstract boolean mo2871c(long j, Object obj);

    /* renamed from: d */
    public abstract byte mo2872d(long j);

    /* renamed from: e */
    public abstract byte mo2873e(long j, Object obj);

    /* renamed from: f */
    public abstract double mo2874f(long j, Object obj);

    /* renamed from: g */
    public abstract float mo2875g(long j, Object obj);

    /* renamed from: h */
    public abstract long mo2876h(long j);

    /* renamed from: i */
    public abstract void mo2877i(Object obj, long j, boolean z);

    /* renamed from: j */
    public abstract void mo2878j(long j, byte b);

    /* renamed from: k */
    public abstract void mo2879k(Object obj, long j, byte b);

    /* renamed from: l */
    public abstract void mo2880l(Object obj, long j, double d);

    /* renamed from: m */
    public abstract void mo2881m(Object obj, long j, float f);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-857163604 < 0) in method: fv3.n():boolean, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-857163604 < 0)
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
    /* renamed from: n */
    public boolean mo3388n() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-857163604 < 0) in method: fv3.n():boolean, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fv3.mo3388n():boolean");
    }

    /* renamed from: o */
    public abstract boolean mo2882o();

    /* renamed from: p */
    public abstract void mo1488p(Object obj, long j, byte b);

    /* renamed from: q */
    public abstract boolean mo1489q(long j, Object obj);

    /* renamed from: r */
    public abstract void mo1490r(Object obj, long j, boolean z);

    /* renamed from: s */
    public abstract float mo1491s(long j, Object obj);

    /* renamed from: t */
    public abstract void mo1492t(Object obj, long j, float f);

    /* renamed from: u */
    public abstract double mo1493u(long j, Object obj);

    /* renamed from: v */
    public abstract void mo1494v(Object obj, long j, double d);
}

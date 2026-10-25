package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes14.dex */
public final class bj3 {

    /* renamed from: A */
    public int f2379A;

    /* renamed from: B */
    public int f2380B;

    /* renamed from: C */
    public int f2381C;

    /* renamed from: D */
    public int f2382D;

    /* renamed from: E */
    public StaticLayout f2383E;

    /* renamed from: F */
    public StaticLayout f2384F;

    /* renamed from: G */
    public int f2385G;

    /* renamed from: H */
    public int f2386H;

    /* renamed from: I */
    public int f2387I;

    /* renamed from: J */
    public Rect f2388J;

    /* renamed from: a */
    public final float f2389a;

    /* renamed from: b */
    public final float f2390b;

    /* renamed from: c */
    public final float f2391c;

    /* renamed from: d */
    public final float f2392d;

    /* renamed from: e */
    public final float f2393e;

    /* renamed from: f */
    public final TextPaint f2394f;

    /* renamed from: g */
    public final Paint f2395g;

    /* renamed from: h */
    public final Paint f2396h;

    /* renamed from: i */
    public CharSequence f2397i;

    /* renamed from: j */
    public Layout.Alignment f2398j;

    /* renamed from: k */
    public Bitmap f2399k;

    /* renamed from: l */
    public float f2400l;

    /* renamed from: m */
    public int f2401m;

    /* renamed from: n */
    public int f2402n;

    /* renamed from: o */
    public float f2403o;

    /* renamed from: p */
    public int f2404p;

    /* renamed from: q */
    public float f2405q;

    /* renamed from: r */
    public float f2406r;

    /* renamed from: s */
    public int f2407s;

    /* renamed from: t */
    public int f2408t;

    /* renamed from: u */
    public int f2409u;

    /* renamed from: v */
    public int f2410v;

    /* renamed from: w */
    public int f2411w;

    /* renamed from: x */
    public float f2412x;

    /* renamed from: y */
    public float f2413y;

    /* renamed from: z */
    public float f2414z;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1333504360 < 0) in method: bj3.<init>(android.content.Context):void, file: classes14.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1333504360 < 0)
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
    public bj3(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1333504360 < 0) in method: bj3.<init>(android.content.Context):void, file: classes14.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bj3.<init>(android.content.Context):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2147400226 > 393876) in method: bj3.a(android.graphics.Canvas, boolean):void, file: classes14.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2147400226 > 393876)
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
    /* renamed from: a */
    public final void m1542a(android.graphics.Canvas r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2147400226 > 393876) in method: bj3.a(android.graphics.Canvas, boolean):void, file: classes14.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bj3.m1542a(android.graphics.Canvas, boolean):void");
    }
}

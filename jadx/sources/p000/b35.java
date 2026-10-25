package p000;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes12.dex */
public final class b35 {

    /* renamed from: a */
    public final Context f1930a;

    /* renamed from: b */
    public final oj3 f1931b;

    /* renamed from: c */
    public final oj3 f1932c;

    /* renamed from: d */
    public final oj3 f1933d;

    /* renamed from: e */
    public volatile int f1934e;

    /* renamed from: f */
    public final CopyOnWriteArrayList f1935f;

    /* renamed from: g */
    public final Object f1936g;

    /* renamed from: h */
    public volatile oz0 f1937h;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-158966252 < 0) in method: b35.<init>(android.content.Context, oj3, oj3, oj3):void, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-158966252 < 0)
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
    public b35(android.content.Context r1, p000.oj3 r2, p000.oj3 r3, p000.oj3 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-158966252 < 0) in method: b35.<init>(android.content.Context, oj3, oj3, oj3):void, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b35.<init>(android.content.Context, oj3, oj3, oj3):void");
    }
}

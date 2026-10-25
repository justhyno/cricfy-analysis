package p000;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes4.dex */
public abstract class pa3 {

    /* renamed from: a */
    public boolean f15461a;

    /* renamed from: b */
    public boolean f15462b;

    /* renamed from: c */
    public p93 f15463c;

    /* renamed from: d */
    public RectF f15464d;

    /* renamed from: e */
    public final Path f15465e;

    /* renamed from: a */
    public abstract void mo8003a(NavigationView navigationView);

    /* renamed from: b */
    public abstract boolean mo8004b();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1555007205 > 406256) in method: pa3.c():void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1555007205 > 406256)
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
    /* renamed from: c */
    public final void m8005c() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1555007205 > 406256) in method: pa3.c():void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pa3.m8005c():void");
    }
}

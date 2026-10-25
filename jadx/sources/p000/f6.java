package p000;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes50.dex */
public final class f6 {

    /* renamed from: a */
    public final WebView f6914a;

    /* renamed from: b */
    public final ArrayList f6915b;

    /* renamed from: c */
    public final HashMap f6916c;

    /* renamed from: d */
    public final String f6917d;

    /* renamed from: e */
    public final String f6918e;

    /* renamed from: f */
    public final g6 f6919f;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1885379794 > 405784) in method: f6.<init>(dk2, android.webkit.WebView, java.lang.String, java.lang.String, g6):void, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1885379794 > 405784)
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
    public f6(p000.dk2 r1, android.webkit.WebView r2, java.lang.String r3, java.lang.String r4, p000.g6 r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1885379794 > 405784) in method: f6.<init>(dk2, android.webkit.WebView, java.lang.String, java.lang.String, g6):void, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f6.<init>(dk2, android.webkit.WebView, java.lang.String, java.lang.String, g6):void");
    }
}

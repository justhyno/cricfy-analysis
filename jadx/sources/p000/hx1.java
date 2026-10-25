package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes8.dex */
public final class hx1 extends IOException {

    /* renamed from: o */
    public final na0 f9460o;

    /* renamed from: p */
    public final Uri f9461p;

    /* renamed from: q */
    public final Map f9462q;

    /* renamed from: r */
    public final long f9463r;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-254272058 < 0) in method: hx1.<init>(na0, android.net.Uri, java.util.Map, long, java.lang.Exception):void, file: classes8.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-254272058 < 0)
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
    public hx1(p000.na0 r1, android.net.Uri r2, java.util.Map r3, long r4, java.lang.Exception r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-254272058 < 0) in method: hx1.<init>(na0, android.net.Uri, java.util.Map, long, java.lang.Exception):void, file: classes8.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hx1.<init>(na0, android.net.Uri, java.util.Map, long, java.lang.Exception):void");
    }
}

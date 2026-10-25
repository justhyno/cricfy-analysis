package androidx.room;

import android.app.Service;
import java.util.LinkedHashMap;
import p000.l92;
import p000.m92;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes42.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: o */
    public int f1472o;

    /* renamed from: p */
    public final LinkedHashMap f1473p;

    /* renamed from: q */
    public final m92 f1474q;

    /* renamed from: r */
    public final l92 f1475r;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-511141268 < 0) in method: androidx.room.MultiInstanceInvalidationService.onBind(android.content.Intent):android.os.IBinder, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-511141268 < 0)
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
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-511141268 < 0) in method: androidx.room.MultiInstanceInvalidationService.onBind(android.content.Intent):android.os.IBinder, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.MultiInstanceInvalidationService.onBind(android.content.Intent):android.os.IBinder");
    }
}

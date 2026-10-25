package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes13.dex */
public abstract class zd2 {

    /* renamed from: a */
    public static Context f23743a = null;

    /* renamed from: b */
    public static String f23744b = "";

    /* renamed from: c */
    public static OkHttpClient f23745c;

    /* renamed from: d */
    public static u01 f23746d;

    /* renamed from: e */
    public static final boolean f23747e = false;

    /* renamed from: f */
    public static final String f23748f = null;

    /* renamed from: g */
    public static final ConcurrentLinkedQueue f23749g = null;

    /* renamed from: h */
    public static be2 f23750h;

    /* renamed from: i */
    public static final dx5 f23751i = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (618473182 > 389804) in method: zd2.a():android.content.Context, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (618473182 > 389804)
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
    public static android.content.Context m11325a() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (618473182 > 389804) in method: zd2.a():android.content.Context, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zd2.m11325a():android.content.Context");
    }
}

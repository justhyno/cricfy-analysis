package com.unity3d.ads;

import java.util.Map;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes7.dex */
public interface UnityAdsInitModuleListener {
    public static final Companion Companion = null;
    public static final int ERROR_INITIALIZATION_FAILED = 1;
    public static final int ERROR_INTERNAL = 3;
    public static final int ERROR_NO_CONFIG = 2;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes43.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        public static final int ERROR_INITIALIZATION_FAILED = 1;
        public static final int ERROR_INTERNAL = 3;
        public static final int ERROR_NO_CONFIG = 2;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1006737326 < 0) in method: com.unity3d.ads.UnityAdsInitModuleListener.Companion.<init>():void, file: classes43.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1006737326 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1006737326 < 0) in method: com.unity3d.ads.UnityAdsInitModuleListener.Companion.<init>():void, file: classes43.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.UnityAdsInitModuleListener.Companion.<init>():void");
        }
    }

    byte[] initParams(Map<String, ? extends Object> map);

    String moduleName();

    void onFailure(String str, int i);

    void onSuccess(byte[] bArr, Map<String, ? extends Object> map);
}

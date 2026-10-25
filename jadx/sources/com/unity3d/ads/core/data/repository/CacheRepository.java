package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CachedFile;
import org.json.JSONArray;
import p000.r41;
import p000.z50;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes21.dex */
public interface CacheRepository {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public static final class DefaultImpls {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (633162138 > 396852) in method: com.unity3d.ads.core.data.repository.CacheRepository.DefaultImpls.getFile$default(com.unity3d.ads.core.data.repository.CacheRepository, java.lang.String, org.json.JSONArray, int, int, r41, z50, int, java.lang.Object):java.lang.Object, file: classes21.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (633162138 > 396852)
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
        public static /* synthetic */ java.lang.Object getFile$default(com.unity3d.ads.core.data.repository.CacheRepository r0, java.lang.String r1, org.json.JSONArray r2, int r3, int r4, p000.r41 r5, p000.z50 r6, int r7, java.lang.Object r8) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (633162138 > 396852) in method: com.unity3d.ads.core.data.repository.CacheRepository.DefaultImpls.getFile$default(com.unity3d.ads.core.data.repository.CacheRepository, java.lang.String, org.json.JSONArray, int, int, r41, z50, int, java.lang.Object):java.lang.Object, file: classes21.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.CacheRepository.DefaultImpls.getFile$default(com.unity3d.ads.core.data.repository.CacheRepository, java.lang.String, org.json.JSONArray, int, int, r41, z50, int, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (966449390 > 396852) in method: com.unity3d.ads.core.data.repository.CacheRepository.DefaultImpls.getWebviewFile$default(com.unity3d.ads.core.data.repository.CacheRepository, java.lang.String, java.lang.String, boolean, z50, int, java.lang.Object):java.lang.Object, file: classes21.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (966449390 > 396852)
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
        public static /* synthetic */ java.lang.Object getWebviewFile$default(com.unity3d.ads.core.data.repository.CacheRepository r0, java.lang.String r1, java.lang.String r2, boolean r3, p000.z50 r4, int r5, java.lang.Object r6) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (966449390 > 396852) in method: com.unity3d.ads.core.data.repository.CacheRepository.DefaultImpls.getWebviewFile$default(com.unity3d.ads.core.data.repository.CacheRepository, java.lang.String, java.lang.String, boolean, z50, int, java.lang.Object):java.lang.Object, file: classes21.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.CacheRepository.DefaultImpls.getWebviewFile$default(com.unity3d.ads.core.data.repository.CacheRepository, java.lang.String, java.lang.String, boolean, z50, int, java.lang.Object):java.lang.Object");
        }
    }

    Object clearCache(z50 z50Var);

    Object doesFileExist(String str, z50 z50Var);

    Object getCacheSize(z50 z50Var);

    Object getFile(String str, JSONArray jSONArray, int i, int i2, r41 r41Var, z50 z50Var);

    Object getWebviewFile(String str, String str2, boolean z, z50 z50Var);

    Object getWebviewFileFromDisk(String str, String str2, z50 z50Var);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, z50 z50Var);
}

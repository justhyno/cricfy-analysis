package com.unity3d.ads.core.data.datasource;

import java.io.File;
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
/* loaded from: classes33.dex */
public interface CacheDataSource {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes36.dex */
    public static final class DefaultImpls {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1535520590 > 411420) in method: com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(com.unity3d.ads.core.data.datasource.CacheDataSource, java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50, int, java.lang.Object):java.lang.Object, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1535520590 > 411420)
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
        public static /* synthetic */ java.lang.Object getFile$default(com.unity3d.ads.core.data.datasource.CacheDataSource r0, java.io.File r1, java.lang.String r2, java.lang.String r3, java.lang.Integer r4, int r5, p000.r41 r6, p000.z50 r7, int r8, java.lang.Object r9) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1535520590 > 411420) in method: com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(com.unity3d.ads.core.data.datasource.CacheDataSource, java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50, int, java.lang.Object):java.lang.Object, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(com.unity3d.ads.core.data.datasource.CacheDataSource, java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50, int, java.lang.Object):java.lang.Object");
        }
    }

    Object getFile(File file, String str, String str2, Integer num, int i, r41 r41Var, z50 z50Var);
}

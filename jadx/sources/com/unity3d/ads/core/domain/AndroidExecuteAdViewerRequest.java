package com.unity3d.ads.core.domain;

import p000.o60;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes21.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final o60 ioDispatcher;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (582074572 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.<init>(o60, com.unity3d.ads.core.domain.HttpClientProvider, com.unity3d.ads.core.domain.GetCachedAsset):void, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (582074572 > 396852)
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
    public AndroidExecuteAdViewerRequest(p000.o60 r1, com.unity3d.ads.core.domain.HttpClientProvider r2, com.unity3d.ads.core.domain.GetCachedAsset r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (582074572 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.<init>(o60, com.unity3d.ads.core.domain.HttpClientProvider, com.unity3d.ads.core.domain.GetCachedAsset):void, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.<init>(o60, com.unity3d.ads.core.domain.HttpClientProvider, com.unity3d.ads.core.domain.GetCachedAsset):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1204066672 < 0) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$createRequest(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest, com.unity3d.services.core.network.model.RequestType, java.lang.Object[]):com.unity3d.services.core.network.model.HttpRequest, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1204066672 < 0)
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
    public static final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest access$createRequest(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r0, com.unity3d.services.core.network.model.RequestType r1, java.lang.Object[] r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1204066672 < 0) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$createRequest(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest, com.unity3d.services.core.network.model.RequestType, java.lang.Object[]):com.unity3d.services.core.network.model.HttpRequest, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$createRequest(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest, com.unity3d.services.core.network.model.RequestType, java.lang.Object[]):com.unity3d.services.core.network.model.HttpRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (428594868 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getGetCachedAsset$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest):com.unity3d.ads.core.domain.GetCachedAsset, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (428594868 > 396852)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetCachedAsset access$getGetCachedAsset$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (428594868 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getGetCachedAsset$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest):com.unity3d.ads.core.domain.GetCachedAsset, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getGetCachedAsset$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest):com.unity3d.ads.core.domain.GetCachedAsset");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (400624718 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getHttpClientProvider$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest):com.unity3d.ads.core.domain.HttpClientProvider, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (400624718 > 396852)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.HttpClientProvider access$getHttpClientProvider$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (400624718 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getHttpClientProvider$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest):com.unity3d.ads.core.domain.HttpClientProvider, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getHttpClientProvider$p(com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest):com.unity3d.ads.core.domain.HttpClientProvider");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (539153246 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.createRequest(com.unity3d.services.core.network.model.RequestType, java.lang.Object[]):com.unity3d.services.core.network.model.HttpRequest, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (539153246 > 396852)
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
    private final com.unity3d.services.core.network.model.HttpRequest createRequest(com.unity3d.services.core.network.model.RequestType r1, java.lang.Object[] r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (539153246 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.createRequest(com.unity3d.services.core.network.model.RequestType, java.lang.Object[]):com.unity3d.services.core.network.model.HttpRequest, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.createRequest(com.unity3d.services.core.network.model.RequestType, java.lang.Object[]):com.unity3d.services.core.network.model.HttpRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2059563742 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.invoke(com.unity3d.services.core.network.model.RequestType, java.lang.Object[], z50):java.lang.Object, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2059563742 > 396852)
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
    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public java.lang.Object invoke(com.unity3d.services.core.network.model.RequestType r1, java.lang.Object[] r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2059563742 > 396852) in method: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.invoke(com.unity3d.services.core.network.model.RequestType, java.lang.Object[], z50):java.lang.Object, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.invoke(com.unity3d.services.core.network.model.RequestType, java.lang.Object[], z50):java.lang.Object");
    }
}

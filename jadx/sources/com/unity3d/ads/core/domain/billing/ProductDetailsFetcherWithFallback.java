package com.unity3d.ads.core.domain.billing;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes14.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-443197958 < 0) in method: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.<init>(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher, com.unity3d.ads.core.domain.billing.ProductDetailsFetcher):void, file: classes14.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-443197958 < 0)
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
    public ProductDetailsFetcherWithFallback(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r1, com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-443197958 < 0) in method: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.<init>(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher, com.unity3d.ads.core.domain.billing.ProductDetailsFetcher):void, file: classes14.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.<init>(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher, com.unity3d.ads.core.domain.billing.ProductDetailsFetcher):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (108312112 > 393876) in method: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, z50):java.lang.Object, file: classes14.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (108312112 > 393876)
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
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public java.lang.Object fetchProductDetails(java.lang.String r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (108312112 > 393876) in method: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, z50):java.lang.Object, file: classes14.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, z50):java.lang.Object");
    }
}

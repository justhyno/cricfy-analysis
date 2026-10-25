package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes44.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;
    private final int detectedVersion;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2023633378 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.<init>(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, int):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2023633378 < 0)
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
    public BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2023633378 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.<init>(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, int):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.<init>(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-453496699 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.<init>(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, int, int, bd0):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-453496699 < 0)
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
    public /* synthetic */ BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge r1, int r2, int r3, p000.bd0 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-453496699 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.<init>(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, int, int, bd0):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.<init>(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, int, int, bd0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1806159834 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.getAdapterVersion():java.lang.String, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1806159834 < 0)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public java.lang.String getAdapterVersion() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1806159834 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.getAdapterVersion():java.lang.String, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.getAdapterVersion():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1934643118 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.initialize(com.unity3d.services.store.gpbl.listeners.BillingInitializationListener):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1934643118 > 395592)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(com.unity3d.services.store.gpbl.listeners.BillingInitializationListener r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1934643118 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.initialize(com.unity3d.services.store.gpbl.listeners.BillingInitializationListener):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.initialize(com.unity3d.services.store.gpbl.listeners.BillingInitializationListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (197189942 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.isFeatureSupported(java.lang.String):com.unity3d.services.store.gpbl.BillingResultResponseCode, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (197189942 > 395592)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public com.unity3d.services.store.gpbl.BillingResultResponseCode isFeatureSupported(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (197189942 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.isFeatureSupported(java.lang.String):com.unity3d.services.store.gpbl.BillingResultResponseCode, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.isFeatureSupported(java.lang.String):com.unity3d.services.store.gpbl.BillingResultResponseCode");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1861835516 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.isReady():boolean, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1861835516 < 0)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1861835516 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.isReady():boolean, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.isReady():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1740604619 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryProductDetailsAsync(java.lang.String, java.lang.String, com.unity3d.services.store.gpbl.listeners.ProductDetailsListener):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1740604619 > 395592)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(java.lang.String r1, java.lang.String r2, com.unity3d.services.store.gpbl.listeners.ProductDetailsListener r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1740604619 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryProductDetailsAsync(java.lang.String, java.lang.String, com.unity3d.services.store.gpbl.listeners.ProductDetailsListener):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryProductDetailsAsync(java.lang.String, java.lang.String, com.unity3d.services.store.gpbl.listeners.ProductDetailsListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1904717986 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryPurchasesAsync(java.lang.String, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1904717986 > 395592)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(java.lang.String r1, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1904717986 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryPurchasesAsync(java.lang.String, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryPurchasesAsync(java.lang.String, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (903327420 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.startConnection(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (903327420 > 395592)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (903327420 > 395592) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.startConnection(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.startConnection(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener):void");
    }
}

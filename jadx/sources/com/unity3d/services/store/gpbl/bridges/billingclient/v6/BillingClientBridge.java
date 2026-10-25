package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes18.dex */
public class BillingClientBridge extends BillingClientBridgeCommon {
    private static final String queryPurchasesAsyncMethodName = "queryPurchasesAsync";
    private static final String querySkuDetailsAsyncMethodName = "querySkuDetailsAsync";

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-48759634 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.<init>(java.lang.Object):void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-48759634 < 0)
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
    public BillingClientBridge(java.lang.Object r1) throws java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-48759634 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.<init>(java.lang.Object):void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.<init>(java.lang.Object):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1459942530 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.newBuilder(android.content.Context):com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1459942530 < 0)
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
    public static com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge newBuilder(android.content.Context r0) throws java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1459942530 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.newBuilder(android.content.Context):com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.newBuilder(android.content.Context):com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1664020954 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.queryPurchasesAsync(java.lang.String, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy):void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1664020954 < 0)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(java.lang.String r1, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy r2) throws java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1664020954 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.queryPurchasesAsync(java.lang.String, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy):void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.queryPurchasesAsync(java.lang.String, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1104057698 > 348964) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy):void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1104057698 > 348964)
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
    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge r1, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy r2) throws java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1104057698 > 348964) in method: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy):void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy):void");
    }
}

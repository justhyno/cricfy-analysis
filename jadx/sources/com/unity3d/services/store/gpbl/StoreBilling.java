package com.unity3d.services.store.gpbl;

import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes46.dex */
public class StoreBilling {
    private final IBillingClient _billingClientBridge;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1781291874 > 386592) in method: com.unity3d.services.store.gpbl.StoreBilling.<init>(android.content.Context, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener):void, file: classes46.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1781291874 > 386592)
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
    public StoreBilling(android.content.Context r1, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener r2) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1781291874 > 386592) in method: com.unity3d.services.store.gpbl.StoreBilling.<init>(android.content.Context, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener):void, file: classes46.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.StoreBilling.<init>(android.content.Context, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-654982326 < 0) in method: com.unity3d.services.store.gpbl.StoreBilling.getPurchaseHistory(java.lang.String, int, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener):void, file: classes46.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-654982326 < 0)
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
    public void getPurchaseHistory(java.lang.String r1, int r2, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener r3) throws java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-654982326 < 0) in method: com.unity3d.services.store.gpbl.StoreBilling.getPurchaseHistory(java.lang.String, int, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener):void, file: classes46.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.StoreBilling.getPurchaseHistory(java.lang.String, int, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1728267733 < 0) in method: com.unity3d.services.store.gpbl.StoreBilling.getPurchases(java.lang.String, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener):void, file: classes46.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1728267733 < 0)
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
    public void getPurchases(java.lang.String r1, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener r2) throws java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1728267733 < 0) in method: com.unity3d.services.store.gpbl.StoreBilling.getPurchases(java.lang.String, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener):void, file: classes46.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.StoreBilling.getPurchases(java.lang.String, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-61170677 < 0) in method: com.unity3d.services.store.gpbl.StoreBilling.getSkuDetails(java.lang.String, java.util.List<java.lang.String>, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener):void, file: classes46.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-61170677 < 0)
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
    public void getSkuDetails(java.lang.String r1, java.util.List<java.lang.String> r2, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener r3) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-61170677 < 0) in method: com.unity3d.services.store.gpbl.StoreBilling.getSkuDetails(java.lang.String, java.util.List<java.lang.String>, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener):void, file: classes46.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.StoreBilling.getSkuDetails(java.lang.String, java.util.List, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (832459253 > 386592) in method: com.unity3d.services.store.gpbl.StoreBilling.initialize(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener):void, file: classes46.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (832459253 > 386592)
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
    public void initialize(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener r1) throws java.lang.ClassNotFoundException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (832459253 > 386592) in method: com.unity3d.services.store.gpbl.StoreBilling.initialize(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener):void, file: classes46.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.StoreBilling.initialize(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1986738172 > 386592) in method: com.unity3d.services.store.gpbl.StoreBilling.isFeatureSupported(java.lang.String):int, file: classes46.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1986738172 > 386592)
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
    public int isFeatureSupported(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1986738172 > 386592) in method: com.unity3d.services.store.gpbl.StoreBilling.isFeatureSupported(java.lang.String):int, file: classes46.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.StoreBilling.isFeatureSupported(java.lang.String):int");
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import p000.y60;

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
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final AdRevenueObserver adRevenueObserver;
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
    private final DeliverModuleConfigs deliverModuleConfigs;
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final InitializeAdQuality initializeAdQuality;
    private final LifecycleEventObserver lifecycleEventObserver;
    private final MaxAdRevenueObserver maxAdRevenueObserver;
    private final y60 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (967365996 > 396852) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.<init>(com.unity3d.ads.core.data.manager.TransactionEventManager, com.unity3d.ads.core.domain.events.AdRevenueObserver, com.unity3d.ads.core.domain.events.MaxAdRevenueObserver, com.unity3d.ads.core.domain.events.LifecycleEventObserver, com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest, com.unity3d.ads.core.data.repository.SessionRepository, y60, com.unity3d.ads.core.domain.HandleDebugSettings, com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration, com.unity3d.ads.core.domain.adquality.InitializeAdQuality, com.unity3d.ads.core.domain.DeliverModuleConfigs):void, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (967365996 > 396852)
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
    public AndroidHandleGatewayInitializationResponse(com.unity3d.ads.core.data.manager.TransactionEventManager r1, com.unity3d.ads.core.domain.events.AdRevenueObserver r2, com.unity3d.ads.core.domain.events.MaxAdRevenueObserver r3, com.unity3d.ads.core.domain.events.LifecycleEventObserver r4, com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest r5, com.unity3d.ads.core.data.repository.SessionRepository r6, p000.y60 r7, com.unity3d.ads.core.domain.HandleDebugSettings r8, com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy r9, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration r10, com.unity3d.ads.core.domain.adquality.InitializeAdQuality r11, com.unity3d.ads.core.domain.DeliverModuleConfigs r12) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (967365996 > 396852) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.<init>(com.unity3d.ads.core.data.manager.TransactionEventManager, com.unity3d.ads.core.domain.events.AdRevenueObserver, com.unity3d.ads.core.domain.events.MaxAdRevenueObserver, com.unity3d.ads.core.domain.events.LifecycleEventObserver, com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest, com.unity3d.ads.core.data.repository.SessionRepository, y60, com.unity3d.ads.core.domain.HandleDebugSettings, com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration, com.unity3d.ads.core.domain.adquality.InitializeAdQuality, com.unity3d.ads.core.domain.DeliverModuleConfigs):void, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.<init>(com.unity3d.ads.core.data.manager.TransactionEventManager, com.unity3d.ads.core.domain.events.AdRevenueObserver, com.unity3d.ads.core.domain.events.MaxAdRevenueObserver, com.unity3d.ads.core.domain.events.LifecycleEventObserver, com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest, com.unity3d.ads.core.data.repository.SessionRepository, y60, com.unity3d.ads.core.domain.HandleDebugSettings, com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration, com.unity3d.ads.core.domain.adquality.InitializeAdQuality, com.unity3d.ads.core.domain.DeliverModuleConfigs):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1723284682 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.access$getTriggerInitializationCompletedRequest$p(com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse):com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1723284682 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest access$getTriggerInitializationCompletedRequest$p(com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1723284682 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.access$getTriggerInitializationCompletedRequest$p(com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse):com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.access$getTriggerInitializationCompletedRequest$p(com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse):com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1473340356 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.invoke(gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse, z50):java.lang.Object, file: classes21.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1473340356 < 0)
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
    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1473340356 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.invoke(gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse, z50):java.lang.Object, file: classes21.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.invoke(gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse, z50):java.lang.Object");
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.OptimisticInitializationManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import p000.o60;

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
/* loaded from: classes19.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = null;
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final o60 defaultDispatcher;
    private final DeliverModuleConfigs deliverModuleConfigs;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetIsModulesInitEnabled getIsModulesInitEnabled;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final Logger logger;
    private final OptimisticInitializationManager optimisticInitializationManager;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public static final class Companion {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (459577118 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.Companion.<init>():void, file: classes19.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (459577118 > 392356)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (459577118 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.Companion.<init>():void, file: classes19.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-651290402 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.Companion.<init>(bd0):void, file: classes19.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-651290402 < 0)
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
        public /* synthetic */ Companion(p000.bd0 r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-651290402 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.Companion.<init>(bd0):void, file: classes19.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.Companion.<init>(bd0):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1579986882 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.<clinit>():void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1579986882 > 392356)
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
    static {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1579986882 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.<clinit>():void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (226473076 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.<init>(o60, com.unity3d.ads.core.domain.om.InitializeOMSDK, com.unity3d.ads.core.domain.GetInitializationRequest, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.CleanAssets, com.unity3d.ads.core.domain.HandleGatewayInitializationResponse, com.unity3d.ads.core.domain.DeliverModuleConfigs, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.events.EventObservers, com.unity3d.ads.core.domain.TriggerInitializeListener, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.data.manager.StorageManager, com.unity3d.ads.core.data.manager.SDKPropertiesManager, com.unity3d.ads.core.domain.GetGameId, com.unity3d.ads.core.log.Logger, com.unity3d.ads.core.domain.AndroidHandleFocusCounters, com.unity3d.ads.core.data.manager.OptimisticInitializationManager, com.unity3d.ads.core.domain.GetIsModulesInitEnabled):void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (226473076 > 392356)
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
    public AndroidInitializeBoldSDK(p000.o60 r1, com.unity3d.ads.core.domain.om.InitializeOMSDK r2, com.unity3d.ads.core.domain.GetInitializationRequest r3, com.unity3d.ads.core.domain.GetRequestPolicy r4, com.unity3d.ads.core.domain.CleanAssets r5, com.unity3d.ads.core.domain.HandleGatewayInitializationResponse r6, com.unity3d.ads.core.domain.DeliverModuleConfigs r7, com.unity3d.ads.gatewayclient.GatewayClient r8, com.unity3d.ads.core.data.repository.SessionRepository r9, com.unity3d.ads.core.domain.events.EventObservers r10, com.unity3d.ads.core.domain.TriggerInitializeListener r11, com.unity3d.ads.core.domain.SendDiagnosticEvent r12, com.unity3d.ads.core.data.repository.DiagnosticEventRepository r13, com.unity3d.ads.core.data.manager.StorageManager r14, com.unity3d.ads.core.data.manager.SDKPropertiesManager r15, com.unity3d.ads.core.domain.GetGameId r16, com.unity3d.ads.core.log.Logger r17, com.unity3d.ads.core.domain.AndroidHandleFocusCounters r18, com.unity3d.ads.core.data.manager.OptimisticInitializationManager r19, com.unity3d.ads.core.domain.GetIsModulesInitEnabled r20) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (226473076 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.<init>(o60, com.unity3d.ads.core.domain.om.InitializeOMSDK, com.unity3d.ads.core.domain.GetInitializationRequest, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.CleanAssets, com.unity3d.ads.core.domain.HandleGatewayInitializationResponse, com.unity3d.ads.core.domain.DeliverModuleConfigs, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.events.EventObservers, com.unity3d.ads.core.domain.TriggerInitializeListener, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.data.manager.StorageManager, com.unity3d.ads.core.data.manager.SDKPropertiesManager, com.unity3d.ads.core.domain.GetGameId, com.unity3d.ads.core.log.Logger, com.unity3d.ads.core.domain.AndroidHandleFocusCounters, com.unity3d.ads.core.data.manager.OptimisticInitializationManager, com.unity3d.ads.core.domain.GetIsModulesInitEnabled):void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.<init>(o60, com.unity3d.ads.core.domain.om.InitializeOMSDK, com.unity3d.ads.core.domain.GetInitializationRequest, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.CleanAssets, com.unity3d.ads.core.domain.HandleGatewayInitializationResponse, com.unity3d.ads.core.domain.DeliverModuleConfigs, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.events.EventObservers, com.unity3d.ads.core.domain.TriggerInitializeListener, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.data.manager.StorageManager, com.unity3d.ads.core.data.manager.SDKPropertiesManager, com.unity3d.ads.core.domain.GetGameId, com.unity3d.ads.core.log.Logger, com.unity3d.ads.core.domain.AndroidHandleFocusCounters, com.unity3d.ads.core.data.manager.OptimisticInitializationManager, com.unity3d.ads.core.domain.GetIsModulesInitEnabled):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1667468014 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1667468014 < 0)
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
    public static final /* synthetic */ void access$checkCanInitialize(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1667468014 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-417967419 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.gatewayclient.GatewayClient, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-417967419 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.gatewayclient.GatewayClient access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-417967419 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.gatewayclient.GatewayClient, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.gatewayclient.GatewayClient");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1696650161 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.GetInitializationRequest, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1696650161 > 392356)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetInitializationRequest access$getGetInitializeRequest$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1696650161 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.GetInitializationRequest, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.GetInitializationRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-153538038 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-153538038 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetRequestPolicy access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-153538038 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.GetRequestPolicy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-499017882 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getHandleGatewayInitializationResponse$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.HandleGatewayInitializationResponse, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-499017882 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.HandleGatewayInitializationResponse access$getHandleGatewayInitializationResponse$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-499017882 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getHandleGatewayInitializationResponse$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.HandleGatewayInitializationResponse, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getHandleGatewayInitializationResponse$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.domain.HandleGatewayInitializationResponse");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (601996606 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getOptimisticInitializationManager$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.data.manager.OptimisticInitializationManager, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (601996606 > 392356)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.manager.OptimisticInitializationManager access$getOptimisticInitializationManager$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (601996606 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getOptimisticInitializationManager$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.data.manager.OptimisticInitializationManager, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getOptimisticInitializationManager$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.data.manager.OptimisticInitializationManager");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (374034554 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.data.repository.SessionRepository, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (374034554 > 392356)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (374034554 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.data.repository.SessionRepository, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK):com.unity3d.ads.core.data.repository.SessionRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2011896134 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationFailure(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, un3, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2011896134 > 392356)
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
    public static final /* synthetic */ void access$initializationFailure(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0, p000.un3 r1, com.unity3d.ads.core.data.model.exception.InitializationException r2, java.lang.String r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2011896134 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationFailure(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, un3, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationFailure(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, un3, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (512770240 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (512770240 > 392356)
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
    public static final /* synthetic */ java.lang.Object access$initializationStart(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0, java.lang.String r1, boolean r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (512770240 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, java.lang.String, boolean, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (909643622 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationSuccess(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, un3, java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (909643622 > 392356)
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
    public static final /* synthetic */ java.lang.Object access$initializationSuccess(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0, p000.un3 r1, java.lang.String r2, boolean r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (909643622 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationSuccess(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, un3, java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationSuccess(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, un3, java.lang.String, boolean, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-472910566 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.checkCanInitialize():void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-472910566 < 0)
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
    private final void checkCanInitialize() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-472910566 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.checkCanInitialize():void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.checkCanInitialize():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1136233648 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getInitLog():java.lang.String, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1136233648 > 392356)
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
    private final java.lang.String getInitLog() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1136233648 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getInitLog():java.lang.String, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getInitLog():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1179122052 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getTags(com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):java.util.Map<java.lang.String, java.lang.String>, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1179122052 > 392356)
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
    private final java.util.Map<java.lang.String, java.lang.String> getTags(com.unity3d.ads.core.data.model.exception.InitializationException r1, java.lang.String r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1179122052 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getTags(com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):java.util.Map<java.lang.String, java.lang.String>, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getTags(com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1260866393 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getTags$default(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean, int, java.lang.Object):java.util.Map, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1260866393 > 392356)
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
    public static /* synthetic */ java.util.Map getTags$default(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0, com.unity3d.ads.core.data.model.exception.InitializationException r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1260866393 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getTags$default(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean, int, java.lang.Object):java.util.Map, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.getTags$default(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean, int, java.lang.Object):java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (29954506 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationFailure(un3, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (29954506 > 392356)
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
    private final void initializationFailure(p000.un3 r1, com.unity3d.ads.core.data.model.exception.InitializationException r2, java.lang.String r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (29954506 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationFailure(un3, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationFailure(un3, com.unity3d.ads.core.data.model.exception.InitializationException, java.lang.String, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2031134890 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationStart(java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2031134890 < 0)
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
    private final java.lang.Object initializationStart(java.lang.String r1, boolean r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2031134890 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationStart(java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationStart(java.lang.String, boolean, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (865879018 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(un3, java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (865879018 > 392356)
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
    private final java.lang.Object initializationSuccess(p000.un3 r1, java.lang.String r2, boolean r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (865879018 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(un3, java.lang.String, boolean, z50):java.lang.Object, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(un3, java.lang.String, boolean, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (885521516 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.logNewPrivacyWasNotUsedIfNeeded():void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (885521516 > 392356)
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
    private final void logNewPrivacyWasNotUsedIfNeeded() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (885521516 > 392356) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.logNewPrivacyWasNotUsedIfNeeded():void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.logNewPrivacyWasNotUsedIfNeeded():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-812600018 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.setupDiagnosticEvents():void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-812600018 < 0)
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
    private final void setupDiagnosticEvents() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-812600018 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.setupDiagnosticEvents():void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.setupDiagnosticEvents():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-985623226 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke(java.lang.String, z50):java.lang.Object, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-985623226 < 0)
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
    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public java.lang.Object invoke(java.lang.String r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-985623226 < 0) in method: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke(java.lang.String, z50):java.lang.Object, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke(java.lang.String, z50):java.lang.Object");
    }
}

package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes18.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final OperationType operationType;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2071369962 > 348964) in method: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.<init>(com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator, com.unity3d.ads.core.data.model.OperationType):void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2071369962 > 348964)
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
    public UniversalRequestEventSender(com.unity3d.ads.gatewayclient.GatewayClient r1, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r2, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r3, com.unity3d.ads.core.data.model.OperationType r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2071369962 > 348964) in method: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.<init>(com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator, com.unity3d.ads.core.data.model.OperationType):void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.<init>(com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator, com.unity3d.ads.core.data.model.OperationType):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (803292806 > 348964) in method: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.<init>(com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator, com.unity3d.ads.core.data.model.OperationType, int, bd0):void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (803292806 > 348964)
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
    public /* synthetic */ UniversalRequestEventSender(com.unity3d.ads.gatewayclient.GatewayClient r1, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r2, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r3, com.unity3d.ads.core.data.model.OperationType r4, int r5, p000.bd0 r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (803292806 > 348964) in method: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.<init>(com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator, com.unity3d.ads.core.data.model.OperationType, int, bd0):void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.<init>(com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator, com.unity3d.ads.core.data.model.OperationType, int, bd0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1439908598 > 348964) in method: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, z50):java.lang.Object, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1439908598 > 348964)
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
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r1, com.unity3d.ads.gatewayclient.RequestPolicy r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1439908598 > 348964) in method: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, z50):java.lang.Object, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, z50):java.lang.Object");
    }
}

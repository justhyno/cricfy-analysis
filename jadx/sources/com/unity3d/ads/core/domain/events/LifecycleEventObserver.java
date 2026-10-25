package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import p000.ea2;
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
/* loaded from: classes49.dex */
public final class LifecycleEventObserver {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GatewayClient gatewayClient;
    private final GetByteStringId getByteStringId;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ea2 isRunning;
    private final LifecycleDataSource lifecycleDataSource;
    private final Logger logger;
    private final y60 scope;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (874824602 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, y60, com.unity3d.ads.core.data.datasource.LifecycleDataSource, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.log.Logger):void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (874824602 > 383928)
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
    public LifecycleEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1, p000.y60 r2, com.unity3d.ads.core.data.datasource.LifecycleDataSource r3, com.unity3d.ads.core.data.repository.DeviceInfoRepository r4, com.unity3d.ads.gatewayclient.GatewayClient r5, com.unity3d.ads.core.domain.GetRequestPolicy r6, com.unity3d.ads.core.domain.GetByteStringId r7, com.unity3d.ads.core.log.Logger r8) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (874824602 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, y60, com.unity3d.ads.core.data.datasource.LifecycleDataSource, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.log.Logger):void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, y60, com.unity3d.ads.core.data.datasource.LifecycleDataSource, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.log.Logger):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (437155706 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.a(com.unity3d.ads.core.domain.events.LifecycleEventObserver, java.lang.Throwable):mu3, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (437155706 > 383928)
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
    /* renamed from: a */
    public static /* synthetic */ p000.mu3 m2664a(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0, java.lang.Throwable r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (437155706 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.a(com.unity3d.ads.core.domain.events.LifecycleEventObserver, java.lang.Throwable):mu3, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.m2664a(com.unity3d.ads.core.domain.events.LifecycleEventObserver, java.lang.Throwable):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1549995948 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getDeviceInfoRepository$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.data.repository.DeviceInfoRepository, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1549995948 > 383928)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.DeviceInfoRepository access$getDeviceInfoRepository$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1549995948 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getDeviceInfoRepository$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.data.repository.DeviceInfoRepository, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getDeviceInfoRepository$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.data.repository.DeviceInfoRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-806134262 < 0) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGatewayClient$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.gatewayclient.GatewayClient, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-806134262 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.gatewayclient.GatewayClient access$getGatewayClient$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-806134262 < 0) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGatewayClient$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.gatewayclient.GatewayClient, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGatewayClient$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.gatewayclient.GatewayClient");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1430802682 < 0) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetByteStringId$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetByteStringId, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1430802682 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetByteStringId access$getGetByteStringId$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1430802682 < 0) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetByteStringId$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetByteStringId, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetByteStringId$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetByteStringId");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1524245714 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1524245714 > 383928)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetRequestPolicy access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1524245714 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1522602766 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1522602766 > 383928)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1522602766 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (133624802 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getLogger$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.log.Logger, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (133624802 > 383928)
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
    public static final /* synthetic */ com.unity3d.ads.core.log.Logger access$getLogger$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (133624802 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getLogger$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.log.Logger, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.access$getLogger$p(com.unity3d.ads.core.domain.events.LifecycleEventObserver):com.unity3d.ads.core.log.Logger");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1192309722 < 0) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.invoke$lambda$1(com.unity3d.ads.core.domain.events.LifecycleEventObserver, java.lang.Throwable):mu3, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1192309722 < 0)
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
    private static final p000.mu3 invoke$lambda$1(com.unity3d.ads.core.domain.events.LifecycleEventObserver r0, java.lang.Throwable r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1192309722 < 0) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.invoke$lambda$1(com.unity3d.ads.core.domain.events.LifecycleEventObserver, java.lang.Throwable):mu3, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.invoke$lambda$1(com.unity3d.ads.core.domain.events.LifecycleEventObserver, java.lang.Throwable):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (857456648 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.invoke():void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (857456648 > 383928)
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
    public final void invoke() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (857456648 > 383928) in method: com.unity3d.ads.core.domain.events.LifecycleEventObserver.invoke():void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.invoke():void");
    }
}

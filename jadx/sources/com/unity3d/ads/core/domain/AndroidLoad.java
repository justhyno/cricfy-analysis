package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
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
/* loaded from: classes44.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final o60 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final ValidateExtrasSize validateExtrasSize;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (647751914 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.<init>(o60, com.unity3d.ads.core.domain.GetAdRequest, com.unity3d.ads.core.domain.GetAdPlayerConfigRequest, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.HandleGatewayAdResponse, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.domain.ValidateExtrasSize):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (647751914 > 395592)
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
    public AndroidLoad(p000.o60 r1, com.unity3d.ads.core.domain.GetAdRequest r2, com.unity3d.ads.core.domain.GetAdPlayerConfigRequest r3, com.unity3d.ads.core.domain.GetRequestPolicy r4, com.unity3d.ads.core.domain.HandleGatewayAdResponse r5, com.unity3d.ads.core.data.repository.SessionRepository r6, com.unity3d.ads.gatewayclient.GatewayClient r7, com.unity3d.ads.core.data.repository.AdRepository r8, com.unity3d.ads.core.domain.SendDiagnosticEvent r9, com.unity3d.ads.core.domain.ValidateExtrasSize r10) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (647751914 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.<init>(o60, com.unity3d.ads.core.domain.GetAdRequest, com.unity3d.ads.core.domain.GetAdPlayerConfigRequest, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.HandleGatewayAdResponse, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.domain.ValidateExtrasSize):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.<init>(o60, com.unity3d.ads.core.domain.GetAdRequest, com.unity3d.ads.core.domain.GetAdPlayerConfigRequest, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.HandleGatewayAdResponse, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.gatewayclient.GatewayClient, com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.domain.ValidateExtrasSize):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-939254513 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getAdRepository$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.data.repository.AdRepository, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-939254513 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.AdRepository access$getAdRepository$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-939254513 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getAdRepository$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.data.repository.AdRepository, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getAdRepository$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.data.repository.AdRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (162480784 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.gatewayclient.GatewayClient, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (162480784 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.gatewayclient.GatewayClient access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (162480784 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.gatewayclient.GatewayClient, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getGatewayClient$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.gatewayclient.GatewayClient");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (771767442 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGetAdPlayerConfigRequest$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetAdPlayerConfigRequest, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (771767442 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetAdPlayerConfigRequest access$getGetAdPlayerConfigRequest$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (771767442 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGetAdPlayerConfigRequest$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetAdPlayerConfigRequest, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getGetAdPlayerConfigRequest$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetAdPlayerConfigRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (935573522 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGetAdRequest$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetAdRequest, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (935573522 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetAdRequest access$getGetAdRequest$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (935573522 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGetAdRequest$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetAdRequest, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getGetAdRequest$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetAdRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-963744138 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-963744138 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetRequestPolicy access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-963744138 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getGetRequestPolicy$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.GetRequestPolicy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1157420688 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getHandleGatewayAdResponse$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.HandleGatewayAdResponse, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1157420688 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.HandleGatewayAdResponse access$getHandleGatewayAdResponse$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1157420688 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getHandleGatewayAdResponse$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.HandleGatewayAdResponse, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getHandleGatewayAdResponse$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.HandleGatewayAdResponse");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1124044870 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.SendDiagnosticEvent, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1124044870 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.SendDiagnosticEvent access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1124044870 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.SendDiagnosticEvent, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.SendDiagnosticEvent");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-182051926 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.data.repository.SessionRepository, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-182051926 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-182051926 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.data.repository.SessionRepository, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getSessionRepository$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.data.repository.SessionRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-301678782 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getTmpAdObject(com.unity3d.ads.core.domain.AndroidLoad, com.google.protobuf.ByteString, java.lang.String, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, com.unity3d.ads.UnityAdsLoadOptions):com.unity3d.ads.core.data.model.AdObject, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-301678782 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.model.AdObject access$getTmpAdObject(com.unity3d.ads.core.domain.AndroidLoad r0, com.google.protobuf.ByteString r1, java.lang.String r2, boolean r3, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r4, com.unity3d.ads.UnityAdsLoadOptions r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-301678782 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getTmpAdObject(com.unity3d.ads.core.domain.AndroidLoad, com.google.protobuf.ByteString, java.lang.String, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, com.unity3d.ads.UnityAdsLoadOptions):com.unity3d.ads.core.data.model.AdObject, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getTmpAdObject(com.unity3d.ads.core.domain.AndroidLoad, com.google.protobuf.ByteString, java.lang.String, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, com.unity3d.ads.UnityAdsLoadOptions):com.unity3d.ads.core.data.model.AdObject");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (312172986 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getValidateExtrasSize$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.ValidateExtrasSize, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (312172986 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.ValidateExtrasSize access$getValidateExtrasSize$p(com.unity3d.ads.core.domain.AndroidLoad r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (312172986 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$getValidateExtrasSize$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.ValidateExtrasSize, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$getValidateExtrasSize$p(com.unity3d.ads.core.domain.AndroidLoad):com.unity3d.ads.core.domain.ValidateExtrasSize");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-74376780 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$handleGatewayException(com.unity3d.ads.core.domain.AndroidLoad, com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException):com.unity3d.ads.core.data.model.LoadResult$Failure, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-74376780 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.model.LoadResult.Failure access$handleGatewayException(com.unity3d.ads.core.domain.AndroidLoad r0, com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-74376780 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$handleGatewayException(com.unity3d.ads.core.domain.AndroidLoad, com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException):com.unity3d.ads.core.data.model.LoadResult$Failure, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$handleGatewayException(com.unity3d.ads.core.domain.AndroidLoad, com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException):com.unity3d.ads.core.data.model.LoadResult$Failure");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1543359724 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$incrementLoadRequestAdmCount(com.unity3d.ads.core.domain.AndroidLoad, boolean):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1543359724 > 395592)
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
    public static final /* synthetic */ void access$incrementLoadRequestAdmCount(com.unity3d.ads.core.domain.AndroidLoad r0, boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1543359724 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.access$incrementLoadRequestAdmCount(com.unity3d.ads.core.domain.AndroidLoad, boolean):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$incrementLoadRequestAdmCount(com.unity3d.ads.core.domain.AndroidLoad, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-437845170 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$incrementLoadRequestCount(com.unity3d.ads.core.domain.AndroidLoad, boolean):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-437845170 < 0)
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
    public static final /* synthetic */ void access$incrementLoadRequestCount(com.unity3d.ads.core.domain.AndroidLoad r0, boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-437845170 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$incrementLoadRequestCount(com.unity3d.ads.core.domain.AndroidLoad, boolean):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$incrementLoadRequestCount(com.unity3d.ads.core.domain.AndroidLoad, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-565535235 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$isCachePhaseFailure(com.unity3d.ads.core.domain.AndroidLoad, com.unity3d.ads.core.data.model.LoadResult$Failure):boolean, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-565535235 < 0)
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
    public static final /* synthetic */ boolean access$isCachePhaseFailure(com.unity3d.ads.core.domain.AndroidLoad r0, com.unity3d.ads.core.data.model.LoadResult.Failure r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-565535235 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.access$isCachePhaseFailure(com.unity3d.ads.core.domain.AndroidLoad, com.unity3d.ads.core.data.model.LoadResult$Failure):boolean, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.access$isCachePhaseFailure(com.unity3d.ads.core.domain.AndroidLoad, com.unity3d.ads.core.data.model.LoadResult$Failure):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1430811006 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.getTmpAdObject(com.google.protobuf.ByteString, java.lang.String, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, com.unity3d.ads.UnityAdsLoadOptions):com.unity3d.ads.core.data.model.AdObject, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1430811006 < 0)
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
    private final com.unity3d.ads.core.data.model.AdObject getTmpAdObject(com.google.protobuf.ByteString r1, java.lang.String r2, boolean r3, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r4, com.unity3d.ads.UnityAdsLoadOptions r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1430811006 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.getTmpAdObject(com.google.protobuf.ByteString, java.lang.String, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, com.unity3d.ads.UnityAdsLoadOptions):com.unity3d.ads.core.data.model.AdObject, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.getTmpAdObject(com.google.protobuf.ByteString, java.lang.String, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, com.unity3d.ads.UnityAdsLoadOptions):com.unity3d.ads.core.data.model.AdObject");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1840683856 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.handleGatewayException(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException):com.unity3d.ads.core.data.model.LoadResult$Failure, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1840683856 < 0)
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
    private final com.unity3d.ads.core.data.model.LoadResult.Failure handleGatewayException(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1840683856 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.handleGatewayException(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException):com.unity3d.ads.core.data.model.LoadResult$Failure, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.handleGatewayException(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException):com.unity3d.ads.core.data.model.LoadResult$Failure");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1082998801 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.incrementLoadRequestAdmCount(boolean):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1082998801 < 0)
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
    private final void incrementLoadRequestAdmCount(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1082998801 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.incrementLoadRequestAdmCount(boolean):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.incrementLoadRequestAdmCount(boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (949304778 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.incrementLoadRequestCount(boolean):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (949304778 > 395592)
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
    private final void incrementLoadRequestCount(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (949304778 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.incrementLoadRequestCount(boolean):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.incrementLoadRequestCount(boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (361577690 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.isCachePhaseFailure(com.unity3d.ads.core.data.model.LoadResult$Failure):boolean, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (361577690 > 395592)
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
    private final boolean isCachePhaseFailure(com.unity3d.ads.core.data.model.LoadResult.Failure r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (361577690 > 395592) in method: com.unity3d.ads.core.domain.AndroidLoad.isCachePhaseFailure(com.unity3d.ads.core.data.model.LoadResult$Failure):boolean, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.isCachePhaseFailure(com.unity3d.ads.core.data.model.LoadResult$Failure):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-316449134 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.invoke(android.content.Context, java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, com.unity3d.ads.UnityAdsLoadOptions, z50):java.lang.Object, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-316449134 < 0)
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
    @Override // com.unity3d.ads.core.domain.Load
    public java.lang.Object invoke(android.content.Context r1, java.lang.String r2, com.google.protobuf.ByteString r3, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup r4, gatewayprotocol.v1.AdRequestOuterClass.BannerSize r5, com.unity3d.ads.UnityAdsLoadOptions r6, p000.z50 r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-316449134 < 0) in method: com.unity3d.ads.core.domain.AndroidLoad.invoke(android.content.Context, java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, com.unity3d.ads.UnityAdsLoadOptions, z50):java.lang.Object, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.invoke(android.content.Context, java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, com.unity3d.ads.UnityAdsLoadOptions, z50):java.lang.Object");
    }
}

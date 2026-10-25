package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes2.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final PreShowWebViewStrategy preShowStrategy;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1840402309 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.<init>(com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase, com.unity3d.ads.core.domain.GetWebViewBridgeUseCase, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi, com.unity3d.ads.core.domain.GetLatestWebViewConfiguration, com.unity3d.ads.adplayer.AdPlayerScope, com.unity3d.ads.core.domain.GetAdPlayer, com.unity3d.ads.core.domain.CacheWebViewAssets, com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy):void, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1840402309 < 0)
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
    public AndroidHandleGatewayAdResponse(com.unity3d.ads.core.data.repository.AdRepository r1, com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r2, com.unity3d.ads.core.domain.GetWebViewBridgeUseCase r3, com.unity3d.ads.core.data.repository.DeviceInfoRepository r4, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r5, com.unity3d.ads.core.data.repository.CampaignRepository r6, com.unity3d.ads.core.domain.SendDiagnosticEvent r7, com.unity3d.ads.core.domain.events.GetOperativeEventApi r8, com.unity3d.ads.core.domain.GetLatestWebViewConfiguration r9, com.unity3d.ads.adplayer.AdPlayerScope r10, com.unity3d.ads.core.domain.GetAdPlayer r11, com.unity3d.ads.core.domain.CacheWebViewAssets r12, com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy r13, com.unity3d.ads.core.data.repository.SessionRepository r14, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy r15) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1840402309 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.<init>(com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase, com.unity3d.ads.core.domain.GetWebViewBridgeUseCase, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi, com.unity3d.ads.core.domain.GetLatestWebViewConfiguration, com.unity3d.ads.adplayer.AdPlayerScope, com.unity3d.ads.core.domain.GetAdPlayer, com.unity3d.ads.core.domain.CacheWebViewAssets, com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy):void, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.<init>(com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase, com.unity3d.ads.core.domain.GetWebViewBridgeUseCase, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi, com.unity3d.ads.core.domain.GetLatestWebViewConfiguration, com.unity3d.ads.adplayer.AdPlayerScope, com.unity3d.ads.core.domain.GetAdPlayer, com.unity3d.ads.core.domain.CacheWebViewAssets, com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1308384816 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$cleanup(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, z50):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1308384816 < 0)
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
    public static final /* synthetic */ java.lang.Object access$cleanup(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0, java.lang.Throwable r1, com.google.protobuf.ByteString r2, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r3, com.unity3d.ads.adplayer.AdPlayer r4, p000.z50 r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1308384816 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$cleanup(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, z50):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$cleanup(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-386435625 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getAdPlayerScope$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.adplayer.AdPlayerScope, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-386435625 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.adplayer.AdPlayerScope access$getAdPlayerScope$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-386435625 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getAdPlayerScope$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.adplayer.AdPlayerScope, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getAdPlayerScope$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.adplayer.AdPlayerScope");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1447121538 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getCacheWebViewAssets$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.CacheWebViewAssets, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1447121538 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.CacheWebViewAssets access$getCacheWebViewAssets$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1447121538 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getCacheWebViewAssets$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.CacheWebViewAssets, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getCacheWebViewAssets$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.CacheWebViewAssets");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-393761930 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetAdPlayer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.GetAdPlayer, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-393761930 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetAdPlayer access$getGetAdPlayer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-393761930 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetAdPlayer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.GetAdPlayer, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetAdPlayer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.GetAdPlayer");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1853867487 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetHandleInvocationsFromAdViewer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1853867487 > 385712)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer access$getGetHandleInvocationsFromAdViewer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1853867487 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetHandleInvocationsFromAdViewer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetHandleInvocationsFromAdViewer$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1857311438 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetWebViewBridge$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.GetWebViewBridgeUseCase, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1857311438 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetWebViewBridgeUseCase access$getGetWebViewBridge$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1857311438 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetWebViewBridge$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.GetWebViewBridgeUseCase, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetWebViewBridge$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.GetWebViewBridgeUseCase");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-291620163 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getPreShowStrategy$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-291620163 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy access$getPreShowStrategy$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-291620163 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getPreShowStrategy$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getPreShowStrategy$p(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse):com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-181856523 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$loadUrl(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-181856523 < 0)
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
    public static final /* synthetic */ java.lang.Object access$loadUrl(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0, com.unity3d.ads.core.data.model.AdObject r1, java.lang.String r2, com.unity3d.ads.adplayer.WebViewContainer r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-181856523 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$loadUrl(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$loadUrl(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-395856270 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, z50):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-395856270 < 0)
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
    private final java.lang.Object cleanup(java.lang.Throwable r1, com.google.protobuf.ByteString r2, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r3, com.unity3d.ads.adplayer.AdPlayer r4, p000.z50 r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-395856270 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, z50):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-253980560 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.loadUrl(com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-253980560 < 0)
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
    private final java.lang.Object loadUrl(com.unity3d.ads.core.data.model.AdObject r1, java.lang.String r2, com.unity3d.ads.adplayer.WebViewContainer r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-253980560 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.loadUrl(com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.loadUrl(com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1518275783 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, boolean, z50):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1518275783 > 385712)
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
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r1, com.google.protobuf.ByteString r2, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r3, android.content.Context r4, java.lang.String r5, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r6, boolean r7, boolean r8, p000.z50 r9) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1518275783 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, boolean, z50):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, boolean, z50):java.lang.Object");
    }
}

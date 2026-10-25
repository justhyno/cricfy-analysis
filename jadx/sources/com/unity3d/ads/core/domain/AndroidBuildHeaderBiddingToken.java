package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes30.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final MediationInfoConverter mediationInfoConverter;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1259230010 > 373676) in method: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.<init>(com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.domain.GetClientInfo, com.unity3d.ads.core.domain.GetSharedDataTimestamps, com.unity3d.ads.core.domain.GetLimitedSessionToken, com.unity3d.ads.core.domain.GetInitializationData, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.data.repository.TcfRepository, com.unity3d.ads.core.domain.AndroidTestDataInfo, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.domain.MediationInfoConverter):void, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1259230010 > 373676)
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
    public AndroidBuildHeaderBiddingToken(com.unity3d.ads.core.domain.GetByteStringId r1, com.unity3d.ads.core.domain.GetClientInfo r2, com.unity3d.ads.core.domain.GetSharedDataTimestamps r3, com.unity3d.ads.core.domain.GetLimitedSessionToken r4, com.unity3d.ads.core.domain.GetInitializationData r5, com.unity3d.ads.core.data.repository.DeviceInfoRepository r6, com.unity3d.ads.core.data.repository.SessionRepository r7, com.unity3d.ads.core.data.repository.CampaignRepository r8, com.unity3d.ads.core.data.repository.TcfRepository r9, com.unity3d.ads.core.domain.AndroidTestDataInfo r10, com.unity3d.ads.core.data.manager.OfferwallManager r11, com.unity3d.ads.core.domain.MediationInfoConverter r12) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1259230010 > 373676) in method: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.<init>(com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.domain.GetClientInfo, com.unity3d.ads.core.domain.GetSharedDataTimestamps, com.unity3d.ads.core.domain.GetLimitedSessionToken, com.unity3d.ads.core.domain.GetInitializationData, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.data.repository.TcfRepository, com.unity3d.ads.core.domain.AndroidTestDataInfo, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.domain.MediationInfoConverter):void, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.<init>(com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.domain.GetClientInfo, com.unity3d.ads.core.domain.GetSharedDataTimestamps, com.unity3d.ads.core.domain.GetLimitedSessionToken, com.unity3d.ads.core.domain.GetInitializationData, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.data.repository.TcfRepository, com.unity3d.ads.core.domain.AndroidTestDataInfo, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.domain.MediationInfoConverter):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1572135598 > 373676) in method: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, z50):java.lang.Object, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1572135598 > 373676)
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
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public java.lang.Object invoke(int r1, com.unity3d.ads.TokenConfiguration r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1572135598 > 373676) in method: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, z50):java.lang.Object, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, z50):java.lang.Object");
    }
}

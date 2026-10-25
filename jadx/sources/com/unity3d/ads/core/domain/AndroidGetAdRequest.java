package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes17.dex */
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1529367394 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdRequest.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource, com.unity3d.ads.core.data.repository.TcfRepository):void, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1529367394 > 368904)
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
    public AndroidGetAdRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1, com.unity3d.ads.core.data.repository.SessionRepository r2, com.unity3d.ads.core.data.repository.DeviceInfoRepository r3, com.unity3d.ads.core.data.repository.CampaignRepository r4, com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource r5, com.unity3d.ads.core.data.repository.TcfRepository r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1529367394 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdRequest.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource, com.unity3d.ads.core.data.repository.TcfRepository):void, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdRequest.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource, com.unity3d.ads.core.data.repository.TcfRepository):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1227979334 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke(java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, com.unity3d.ads.core.data.model.LoadConfigurationInternal, z50):java.lang.Object, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1227979334 > 368904)
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
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    public java.lang.Object invoke(java.lang.String r1, com.google.protobuf.ByteString r2, gatewayprotocol.v1.AdRequestOuterClass.BannerSize r3, com.unity3d.ads.core.data.model.LoadConfigurationInternal r4, p000.z50 r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1227979334 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke(java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, com.unity3d.ads.core.data.model.LoadConfigurationInternal, z50):java.lang.Object, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke(java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, com.unity3d.ads.core.data.model.LoadConfigurationInternal, z50):java.lang.Object");
    }
}

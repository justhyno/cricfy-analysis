package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes30.dex */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-403004884 < 0) in method: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.<init>(com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository):void, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-403004884 < 0)
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
    public GetOperativeEventRequest(com.unity3d.ads.core.domain.GetByteStringId r1, com.unity3d.ads.core.data.repository.DeviceInfoRepository r2, com.unity3d.ads.core.data.repository.SessionRepository r3, com.unity3d.ads.core.data.repository.CampaignRepository r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-403004884 < 0) in method: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.<init>(com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository):void, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.<init>(com.unity3d.ads.core.domain.GetByteStringId, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2101999778 > 373676) in method: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50):java.lang.Object, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2101999778 > 373676)
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
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r1, com.google.protobuf.ByteString r2, com.google.protobuf.ByteString r3, com.google.protobuf.ByteString r4, java.lang.String r5, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r6, p000.z50 r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2101999778 > 373676) in method: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50):java.lang.Object, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50):java.lang.Object");
    }
}

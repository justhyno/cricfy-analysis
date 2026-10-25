package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes7.dex */
public final class HandleAdRevenueEvent {
    private final AdRevenueRepository adRevenueRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdRevenueEventData getAdRevenueEventData;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1883932516 < 0) in method: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.<init>(com.unity3d.ads.core.data.repository.AdRevenueRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.events.GetAdRevenueEventData):void, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1883932516 < 0)
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
    public HandleAdRevenueEvent(com.unity3d.ads.core.data.repository.AdRevenueRepository r1, com.unity3d.ads.core.data.repository.DeviceInfoRepository r2, com.unity3d.ads.core.domain.events.GetAdRevenueEventData r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1883932516 < 0) in method: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.<init>(com.unity3d.ads.core.data.repository.AdRevenueRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.events.GetAdRevenueEventData):void, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.<init>(com.unity3d.ads.core.data.repository.AdRevenueRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.events.GetAdRevenueEventData):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-549349566 < 0) in method: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.invoke(com.unity3d.ads.core.data.model.AdRevenueData, gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider, com.unity3d.ads.core.data.model.AdRevenueOrigin, z50):java.lang.Object, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-549349566 < 0)
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
    public final java.lang.Object invoke(com.unity3d.ads.core.data.model.AdRevenueData r1, gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider r2, com.unity3d.ads.core.data.model.AdRevenueOrigin r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-549349566 < 0) in method: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.invoke(com.unity3d.ads.core.data.model.AdRevenueData, gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider, com.unity3d.ads.core.data.model.AdRevenueOrigin, z50):java.lang.Object, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.invoke(com.unity3d.ads.core.data.model.AdRevenueData, gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider, com.unity3d.ads.core.data.model.AdRevenueOrigin, z50):java.lang.Object");
    }
}

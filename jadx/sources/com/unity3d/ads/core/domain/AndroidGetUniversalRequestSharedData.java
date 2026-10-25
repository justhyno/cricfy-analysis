package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes16.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1341180411 > 492760) in method: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.<init>(com.unity3d.ads.core.domain.GetSharedDataTimestamps, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.GetLimitedSessionToken, com.unity3d.ads.core.data.repository.DeveloperConsentRepository):void, file: classes16.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1341180411 > 492760)
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
    public AndroidGetUniversalRequestSharedData(com.unity3d.ads.core.domain.GetSharedDataTimestamps r1, com.unity3d.ads.core.data.repository.SessionRepository r2, com.unity3d.ads.core.data.repository.DeviceInfoRepository r3, com.unity3d.ads.core.domain.GetLimitedSessionToken r4, com.unity3d.ads.core.data.repository.DeveloperConsentRepository r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1341180411 > 492760) in method: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.<init>(com.unity3d.ads.core.domain.GetSharedDataTimestamps, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.GetLimitedSessionToken, com.unity3d.ads.core.data.repository.DeveloperConsentRepository):void, file: classes16.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.<init>(com.unity3d.ads.core.domain.GetSharedDataTimestamps, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.domain.GetLimitedSessionToken, com.unity3d.ads.core.data.repository.DeveloperConsentRepository):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1329083386 > 492760) in method: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(z50):java.lang.Object, file: classes16.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1329083386 > 492760)
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
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    public java.lang.Object invoke(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1329083386 > 492760) in method: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(z50):java.lang.Object, file: classes16.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(z50):java.lang.Object");
    }
}

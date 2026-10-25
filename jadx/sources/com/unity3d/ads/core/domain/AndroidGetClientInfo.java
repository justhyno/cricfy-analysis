package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes11.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-605244186 < 0) in method: com.unity3d.ads.core.domain.AndroidGetClientInfo.<init>(com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.MediationRepository, com.unity3d.ads.core.data.manager.OmidManager, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.data.datasource.FIdExistenceDataSource, com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource):void, file: classes11.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-605244186 < 0)
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
    public AndroidGetClientInfo(com.unity3d.ads.core.data.repository.SessionRepository r1, com.unity3d.ads.core.data.repository.MediationRepository r2, com.unity3d.ads.core.data.manager.OmidManager r3, com.unity3d.ads.core.data.manager.OfferwallManager r4, com.unity3d.ads.core.data.datasource.FIdExistenceDataSource r5, com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-605244186 < 0) in method: com.unity3d.ads.core.domain.AndroidGetClientInfo.<init>(com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.MediationRepository, com.unity3d.ads.core.data.manager.OmidManager, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.data.datasource.FIdExistenceDataSource, com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource):void, file: classes11.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetClientInfo.<init>(com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.data.repository.MediationRepository, com.unity3d.ads.core.data.manager.OmidManager, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.data.datasource.FIdExistenceDataSource, com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (929552311 > 370132) in method: com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke(z50):java.lang.Object, file: classes11.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (929552311 > 370132)
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
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    public java.lang.Object invoke(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (929552311 > 370132) in method: com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke(z50):java.lang.Object, file: classes11.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke(z50):java.lang.Object");
    }
}

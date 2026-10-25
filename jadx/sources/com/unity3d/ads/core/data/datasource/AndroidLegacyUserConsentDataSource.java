package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonStorage;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes50.dex */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage privateStorage;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1863869802 > 405784) in method: com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource.<init>(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage):void, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1863869802 > 405784)
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
    public AndroidLegacyUserConsentDataSource(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase r1, com.unity3d.services.core.misc.JsonStorage r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1863869802 > 405784) in method: com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource.<init>(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage):void, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource.<init>(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1367175154 > 405784) in method: com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource.getPrivacyData():java.lang.String, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1367175154 > 405784)
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
    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    public java.lang.String getPrivacyData() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1367175154 > 405784) in method: com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource.getPrivacyData():java.lang.String, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource.getPrivacyData():java.lang.String");
    }
}

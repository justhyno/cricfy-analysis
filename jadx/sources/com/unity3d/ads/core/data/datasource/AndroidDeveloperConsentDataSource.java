package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonStorage;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes19.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1171427338 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.<init>(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage, com.unity3d.ads.core.data.repository.SessionRepository):void, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1171427338 < 0)
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
    public AndroidDeveloperConsentDataSource(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase r1, com.unity3d.services.core.misc.JsonStorage r2, com.unity3d.ads.core.data.repository.SessionRepository r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1171427338 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.<init>(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage, com.unity3d.ads.core.data.repository.SessionRepository):void, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.<init>(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage, com.unity3d.ads.core.data.repository.SessionRepository):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1216256790 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.createDeveloperConsentOption(java.lang.String, boolean):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1216256790 > 392356)
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
    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(java.lang.String r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1216256790 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.createDeveloperConsentOption(java.lang.String, boolean):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.createDeveloperConsentOption(java.lang.String, boolean):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-459060884 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.developerConsentList():java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-459060884 < 0)
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
    private final java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-459060884 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.developerConsentList():java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.developerConsentList():java.util.List");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1757719414 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.fetchData():org.json.JSONObject, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1757719414 > 392356)
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
    private final org.json.JSONObject fetchData() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1757719414 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.fetchData():org.json.JSONObject, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.fetchData():org.json.JSONObject");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (385849638 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsentChoice(java.lang.Boolean):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (385849638 > 392356)
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
    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(java.lang.Boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (385849638 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsentChoice(java.lang.Boolean):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsentChoice(java.lang.Boolean):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (257529504 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsentType(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (257529504 > 392356)
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
    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (257529504 > 392356) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsentType(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsentType(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-582115956 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsent():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes19.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-582115956 < 0)
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
    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-582115956 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsent():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes19.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.getDeveloperConsent():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
    }
}

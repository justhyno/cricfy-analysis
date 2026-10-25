package com.unity3d.ads.core.domain;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes17.dex */
public final class AndroidGetAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MediationInfoConverter mediationInfoConverter;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (356701756 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.domain.MediationInfoConverter):void, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (356701756 > 368904)
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
    public AndroidGetAdPlayerConfigRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1, com.unity3d.ads.core.domain.MediationInfoConverter r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (356701756 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.domain.MediationInfoConverter):void, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.domain.MediationInfoConverter):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (716458214 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest.invoke(java.lang.String, com.google.protobuf.ByteString, com.google.protobuf.ByteString, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, com.unity3d.ads.core.data.model.LoadConfigurationInternal, z50):java.lang.Object, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (716458214 > 368904)
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
    @Override // com.unity3d.ads.core.domain.GetAdPlayerConfigRequest
    public java.lang.Object invoke(java.lang.String r1, com.google.protobuf.ByteString r2, com.google.protobuf.ByteString r3, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r4, com.unity3d.ads.core.data.model.LoadConfigurationInternal r5, p000.z50 r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (716458214 > 368904) in method: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest.invoke(java.lang.String, com.google.protobuf.ByteString, com.google.protobuf.ByteString, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, com.unity3d.ads.core.data.model.LoadConfigurationInternal, z50):java.lang.Object, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest.invoke(java.lang.String, com.google.protobuf.ByteString, com.google.protobuf.ByteString, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, com.unity3d.ads.core.data.model.LoadConfigurationInternal, z50):java.lang.Object");
    }
}

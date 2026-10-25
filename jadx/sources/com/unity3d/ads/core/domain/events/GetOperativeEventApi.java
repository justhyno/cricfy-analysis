package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.OperativeEventRepository;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes29.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1625479367 > 390388) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.<init>(com.unity3d.ads.core.data.repository.OperativeEventRepository, com.unity3d.ads.core.domain.events.GetOperativeEventRequest):void, file: classes29.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1625479367 > 390388)
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
    public GetOperativeEventApi(com.unity3d.ads.core.data.repository.OperativeEventRepository r1, com.unity3d.ads.core.domain.events.GetOperativeEventRequest r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1625479367 > 390388) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.<init>(com.unity3d.ads.core.data.repository.OperativeEventRepository, com.unity3d.ads.core.domain.events.GetOperativeEventRequest):void, file: classes29.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.<init>(com.unity3d.ads.core.data.repository.OperativeEventRepository, com.unity3d.ads.core.domain.events.GetOperativeEventRequest):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1359565526 > 390388) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(com.unity3d.ads.core.domain.events.GetOperativeEventApi, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50, int, java.lang.Object):java.lang.Object, file: classes29.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1359565526 > 390388)
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
    public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.events.GetOperativeEventApi r0, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r1, com.google.protobuf.ByteString r2, com.google.protobuf.ByteString r3, com.google.protobuf.ByteString r4, java.lang.String r5, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r6, p000.z50 r7, int r8, java.lang.Object r9) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1359565526 > 390388) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(com.unity3d.ads.core.domain.events.GetOperativeEventApi, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50, int, java.lang.Object):java.lang.Object, file: classes29.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(com.unity3d.ads.core.domain.events.GetOperativeEventApi, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50, int, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (289085845 > 390388) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50):java.lang.Object, file: classes29.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (289085845 > 390388)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (289085845 > 390388) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50):java.lang.Object, file: classes29.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-282815670 < 0) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.unity3d.ads.core.data.model.AdObject, com.google.protobuf.ByteString, z50):java.lang.Object, file: classes29.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-282815670 < 0)
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
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r1, com.unity3d.ads.core.data.model.AdObject r2, com.google.protobuf.ByteString r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-282815670 < 0) in method: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.unity3d.ads.core.data.model.AdObject, com.google.protobuf.ByteString, z50):java.lang.Object, file: classes29.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.unity3d.ads.core.data.model.AdObject, com.google.protobuf.ByteString, z50):java.lang.Object");
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes4.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1308054858 < 0) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.<init>(com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, com.unity3d.ads.core.data.datasource.LifecycleDataSource):void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1308054858 < 0)
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
    public AndroidSendDiagnosticEvent(com.unity3d.ads.core.data.repository.DiagnosticEventRepository r1, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest r2, com.unity3d.ads.core.data.datasource.LifecycleDataSource r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1308054858 < 0) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.<init>(com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, com.unity3d.ads.core.data.datasource.LifecycleDataSource):void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.<init>(com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, com.unity3d.ads.core.data.datasource.LifecycleDataSource):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1887593318 > 406256) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.sendEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1887593318 > 406256)
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
    private final void sendEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.String r2, java.lang.Double r3, java.util.Map<java.lang.String, java.lang.String> r4, java.util.Map<java.lang.String, java.lang.Integer> r5, com.unity3d.ads.core.data.model.AdObject r6, java.lang.Integer r7, com.google.protobuf.ByteString r8) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1887593318 > 406256) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.sendEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.sendEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1732716694 > 406256) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.sendEvent$default(com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1732716694 > 406256)
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
    public static /* synthetic */ void sendEvent$default(com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.String r2, java.lang.Double r3, java.util.Map r4, java.util.Map r5, com.unity3d.ads.core.data.model.AdObject r6, java.lang.Integer r7, com.google.protobuf.ByteString r8, int r9, java.lang.Object r10) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1732716694 > 406256) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.sendEvent$default(com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.sendEvent$default(com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (223897628 > 406256) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.Double, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (223897628 > 406256)
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
    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.Double r2, java.util.Map<java.lang.String, java.lang.String> r3, java.util.Map<java.lang.String, java.lang.Integer> r4, com.unity3d.ads.core.data.model.AdObject r5, java.lang.Integer r6, com.google.protobuf.ByteString r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (223897628 > 406256) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.Double, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-915246994 < 0) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(java.lang.String, java.lang.Double, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-915246994 < 0)
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
    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(java.lang.String r1, java.lang.Double r2, java.util.Map<java.lang.String, java.lang.String> r3, java.util.Map<java.lang.String, java.lang.Integer> r4, com.unity3d.ads.core.data.model.AdObject r5, java.lang.Integer r6, com.google.protobuf.ByteString r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-915246994 < 0) in method: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(java.lang.String, java.lang.Double, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString):void");
    }
}

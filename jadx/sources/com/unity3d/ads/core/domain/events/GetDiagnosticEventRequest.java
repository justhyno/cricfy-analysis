package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import p000.ea2;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes48.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final ea2 uniqueId;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1331162598 < 0) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.<init>(com.unity3d.ads.core.domain.GetSharedDataTimestamps):void, file: classes48.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1331162598 < 0)
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
    public GetDiagnosticEventRequest(com.unity3d.ads.core.domain.GetSharedDataTimestamps r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1331162598 < 0) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.<init>(com.unity3d.ads.core.domain.GetSharedDataTimestamps):void, file: classes48.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.<init>(com.unity3d.ads.core.domain.GetSharedDataTimestamps):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2041430737 > 379484) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.getTag(java.lang.String):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType, file: classes48.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2041430737 > 379484)
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
    private final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType getTag(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2041430737 > 379484) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.getTag(java.lang.String):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType, file: classes48.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.getTag(java.lang.String):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-375479782 < 0) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.getTags(java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>):java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTag>, file: classes48.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-375479782 < 0)
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
    private final java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag> getTags(java.util.Map<java.lang.String, java.lang.String> r1, java.util.Map<java.lang.String, java.lang.Integer> r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-375479782 < 0) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.getTags(java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>):java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTag>, file: classes48.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.getTags(java.util.Map, java.util.Map):java.util.List");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (603599841 > 379484) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.invoke$default(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.util.Map, java.util.Map, java.lang.Double, java.lang.Boolean, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes48.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (603599841 > 379484)
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
    public static /* synthetic */ gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent invoke$default(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.String r2, java.util.Map r3, java.util.Map r4, java.lang.Double r5, java.lang.Boolean r6, com.google.protobuf.ByteString r7, java.lang.String r8, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r9, java.lang.Integer r10, com.google.protobuf.ByteString r11, int r12, java.lang.Object r13) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (603599841 > 379484) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.invoke$default(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.util.Map, java.util.Map, java.lang.Double, java.lang.Boolean, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes48.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.invoke$default(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.util.Map, java.util.Map, java.lang.Double, java.lang.Boolean, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1390920778 > 379484) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, java.lang.Double, java.lang.Boolean, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, java.lang.Integer, com.google.protobuf.ByteString):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes48.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1390920778 > 379484)
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
    public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3, java.util.Map<java.lang.String, java.lang.Integer> r4, java.lang.Double r5, java.lang.Boolean r6, com.google.protobuf.ByteString r7, java.lang.String r8, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r9, java.lang.Integer r10, com.google.protobuf.ByteString r11) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1390920778 > 379484) in method: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Integer>, java.lang.Double, java.lang.Boolean, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, java.lang.Integer, com.google.protobuf.ByteString):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes48.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.util.Map, java.util.Map, java.lang.Double, java.lang.Boolean, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, java.lang.Integer, com.google.protobuf.ByteString):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent");
    }
}

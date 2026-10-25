package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Set;
import p000.da2;
import p000.ea2;
import p000.ta3;
import p000.y60;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes49.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final da2 _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final ea2 batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final ea2 configured;
    private final y60 coroutineScope;
    private final ta3 diagnosticEvents;
    private final ea2 enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1954182203 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.<init>(com.unity3d.ads.core.utils.CoroutineTimer, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, o60):void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1954182203 > 383928)
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
    public AndroidDiagnosticEventRepository(com.unity3d.ads.core.utils.CoroutineTimer r1, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest r2, p000.o60 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1954182203 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.<init>(com.unity3d.ads.core.utils.CoroutineTimer, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, o60):void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.<init>(com.unity3d.ads.core.utils.CoroutineTimer, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest, o60):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1045406246 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.a(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, java.util.List):java.lang.String, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1045406246 < 0)
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
    /* renamed from: a */
    public static /* synthetic */ java.lang.String m2585a(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, java.util.List r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1045406246 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.a(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, java.util.List):java.lang.String, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.m2585a(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, java.util.List):java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1869582588 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.access$get_diagnosticEvents$p(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):da2, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1869582588 < 0)
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
    public static final /* synthetic */ p000.da2 access$get_diagnosticEvents$p(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1869582588 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.access$get_diagnosticEvents$p(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):da2, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.access$get_diagnosticEvents$p(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):da2");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (791702732 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.b(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):mu3, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (791702732 > 383928)
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
    /* renamed from: b */
    public static /* synthetic */ p000.mu3 m2586b(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (791702732 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.b(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):mu3, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.m2586b(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1720570634 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.c(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1720570634 > 383928)
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
    /* renamed from: c */
    public static /* synthetic */ boolean m2587c(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1720570634 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.c(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.m2587c(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-667700069 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure$lambda$9(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):mu3, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-667700069 < 0)
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
    private static final p000.mu3 configure$lambda$9(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-667700069 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure$lambda$9(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):mu3, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure$lambda$9(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1774008181 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.d(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1774008181 > 383928)
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
    /* renamed from: d */
    public static /* synthetic */ gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent m2588d(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1774008181 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.d(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.m2588d(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-937668942 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.e(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-937668942 < 0)
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
    /* renamed from: e */
    public static /* synthetic */ boolean m2589e(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-937668942 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.e(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.m2589e(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1451852371 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$4(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1451852371 < 0)
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
    private static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1451852371 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$4(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$4(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (507882906 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$5(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (507882906 > 383928)
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
    private static final boolean flush$lambda$5(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (507882906 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$5(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$5(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (40235426 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$6(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (40235426 > 383928)
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
    private static final boolean flush$lambda$6(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (40235426 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$6(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$6(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1091873110 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$7(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, java.util.List):java.lang.String, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1091873110 > 383928)
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
    private static final java.lang.String flush$lambda$7(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository r0, java.util.List r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1091873110 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$7(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, java.util.List):java.lang.String, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$7(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository, java.util.List):java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1796292174 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1796292174 < 0)
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
    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1796292174 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1056322616 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.clear():void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1056322616 < 0)
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
    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1056322616 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.clear():void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.clear():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (279294736 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure(gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfiguration):void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (279294736 > 383928)
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
    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (279294736 > 383928) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure(gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfiguration):void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure(gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfiguration):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-263087214 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush():void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-263087214 < 0)
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
    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-263087214 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush():void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1506526272 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.getDiagnosticEvents():ta3, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1506526272 < 0)
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
    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public p000.ta3 getDiagnosticEvents() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1506526272 < 0) in method: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.getDiagnosticEvents():ta3, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.getDiagnosticEvents():ta3");
    }
}

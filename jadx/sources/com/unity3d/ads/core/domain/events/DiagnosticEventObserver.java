package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import p000.ea2;
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
/* loaded from: classes13.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetRequestPolicy diagnosticRequestPolicy;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ea2 isRunning;
    private final y60 scope;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1373783485 < 0) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest, o60, com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy):void, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1373783485 < 0)
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
    public DiagnosticEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1, com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest r2, p000.o60 r3, com.unity3d.ads.core.data.repository.DiagnosticEventRepository r4, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r5, com.unity3d.ads.core.domain.work.BackgroundWorker r6, com.unity3d.ads.core.domain.events.UniversalRequestEventSender r7, com.unity3d.ads.core.domain.GetRequestPolicy r8) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1373783485 < 0) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest, o60, com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy):void, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest, o60, com.unity3d.ads.core.data.repository.DiagnosticEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1813872702 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.work.BackgroundWorker, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1813872702 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.work.BackgroundWorker access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1813872702 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.work.BackgroundWorker, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.work.BackgroundWorker");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (27415378 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticEventRepository$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.data.repository.DiagnosticEventRepository, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (27415378 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.DiagnosticEventRepository access$getDiagnosticEventRepository$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (27415378 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticEventRepository$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.data.repository.DiagnosticEventRepository, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticEventRepository$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.data.repository.DiagnosticEventRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1867519158 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticRequestPolicy$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1867519158 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetRequestPolicy access$getDiagnosticRequestPolicy$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1867519158 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticRequestPolicy$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticRequestPolicy$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1952517178 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1952517178 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest access$getGetDiagnosticEventBatchRequest$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1952517178 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1320415935 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1320415935 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1320415935 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1412674432 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getScope$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):y60, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1412674432 > 389804)
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
    public static final /* synthetic */ p000.y60 access$getScope$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1412674432 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getScope$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):y60, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getScope$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):y60");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (932413454 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (932413454 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.datasource.UniversalRequestDataSource access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (932413454 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.data.datasource.UniversalRequestDataSource");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1861942838 < 0) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.events.UniversalRequestEventSender, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1861942838 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.events.UniversalRequestEventSender access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1861942838 < 0) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.events.UniversalRequestEventSender, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):com.unity3d.ads.core.domain.events.UniversalRequestEventSender");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1616420510 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$isRunning$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):ea2, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1616420510 > 389804)
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
    public static final /* synthetic */ p000.ea2 access$isRunning$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1616420510 > 389804) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$isRunning$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):ea2, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$isRunning$p(com.unity3d.ads.core.domain.events.DiagnosticEventObserver):ea2");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-605006117 < 0) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke(z50):java.lang.Object, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-605006117 < 0)
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
    public final java.lang.Object invoke(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-605006117 < 0) in method: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke(z50):java.lang.Object, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke(z50):java.lang.Object");
    }
}

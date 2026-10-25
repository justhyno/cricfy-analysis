package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
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
/* loaded from: classes44.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ea2 isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final GetRequestPolicy operativeRequestPolicy;
    private final y60 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (544568648 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, o60, com.unity3d.ads.core.data.repository.OperativeEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.SendDiagnosticEvent):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (544568648 > 395592)
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
    public OperativeEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1, p000.o60 r2, com.unity3d.ads.core.data.repository.OperativeEventRepository r3, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r4, com.unity3d.ads.core.domain.work.BackgroundWorker r5, com.unity3d.ads.core.domain.events.UniversalRequestEventSender r6, com.unity3d.ads.core.domain.GetRequestPolicy r7, com.unity3d.ads.core.domain.SendDiagnosticEvent r8) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (544568648 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, o60, com.unity3d.ads.core.data.repository.OperativeEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.SendDiagnosticEvent):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.<init>(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, o60, com.unity3d.ads.core.data.repository.OperativeEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy, com.unity3d.ads.core.domain.SendDiagnosticEvent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (993743864 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.work.BackgroundWorker, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (993743864 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.work.BackgroundWorker access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (993743864 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.work.BackgroundWorker, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getBackgroundWorker$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.work.BackgroundWorker");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1475209482 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1475209482 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1475209482 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getGetUniversalRequestForPayLoad$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (255068796 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getOperativeEventRepository$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.data.repository.OperativeEventRepository, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (255068796 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.OperativeEventRepository access$getOperativeEventRepository$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (255068796 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getOperativeEventRepository$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.data.repository.OperativeEventRepository, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getOperativeEventRepository$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.data.repository.OperativeEventRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-365209410 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getOperativeRequestPolicy$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-365209410 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetRequestPolicy access$getOperativeRequestPolicy$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-365209410 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getOperativeRequestPolicy$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getOperativeRequestPolicy$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.GetRequestPolicy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1160595906 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getScope$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):y60, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1160595906 < 0)
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
    public static final /* synthetic */ p000.y60 access$getScope$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1160595906 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getScope$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):y60, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getScope$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):y60");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1986185781 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.SendDiagnosticEvent, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1986185781 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.SendDiagnosticEvent access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1986185781 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.SendDiagnosticEvent, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.SendDiagnosticEvent");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1266581854 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1266581854 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.datasource.UniversalRequestDataSource access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1266581854 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getUniversalRequestDataSource$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.data.datasource.UniversalRequestDataSource");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (732472225 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.events.UniversalRequestEventSender, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (732472225 > 395592)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.events.UniversalRequestEventSender access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (732472225 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.events.UniversalRequestEventSender, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$getUniversalRequestEventSender$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):com.unity3d.ads.core.domain.events.UniversalRequestEventSender");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (420974259 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$isRunning$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):ea2, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (420974259 > 395592)
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
    public static final /* synthetic */ p000.ea2 access$isRunning$p(com.unity3d.ads.core.domain.events.OperativeEventObserver r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (420974259 > 395592) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$isRunning$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):ea2, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.access$isRunning$p(com.unity3d.ads.core.domain.events.OperativeEventObserver):ea2");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1432118028 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.invoke(z50):java.lang.Object, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1432118028 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1432118028 < 0) in method: com.unity3d.ads.core.domain.events.OperativeEventObserver.invoke(z50):java.lang.Object, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.invoke(z50):java.lang.Object");
    }
}

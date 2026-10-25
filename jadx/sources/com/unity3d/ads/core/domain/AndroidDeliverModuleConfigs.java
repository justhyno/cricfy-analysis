package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsInitModuleListener;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import p000.fa2;
import p000.o60;
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
/* loaded from: classes31.dex */
public final class AndroidDeliverModuleConfigs implements DeliverModuleConfigs {
    private final GetInitModuleListeners getInitModuleListeners;
    private final GetIsModulesInitEnabled getIsModulesInitEnabled;
    private final o60 ioDispatcher;
    private final ConcurrentHashMap<UnityAdsInitModuleListener, fa2> listenerLocks;
    private final y60 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (654010887 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.<init>(com.unity3d.ads.core.domain.GetInitModuleListeners, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, y60, o60, com.unity3d.ads.core.domain.GetIsModulesInitEnabled):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (654010887 > 364120)
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
    public AndroidDeliverModuleConfigs(com.unity3d.ads.core.domain.GetInitModuleListeners r1, com.unity3d.ads.core.data.repository.SessionRepository r2, com.unity3d.ads.core.domain.SendDiagnosticEvent r3, p000.y60 r4, p000.o60 r5, com.unity3d.ads.core.domain.GetIsModulesInitEnabled r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (654010887 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.<init>(com.unity3d.ads.core.domain.GetInitModuleListeners, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, y60, o60, com.unity3d.ads.core.domain.GetIsModulesInitEnabled):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.<init>(com.unity3d.ads.core.domain.GetInitModuleListeners, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, y60, o60, com.unity3d.ads.core.domain.GetIsModulesInitEnabled):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1664088457 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$deliver(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1664088457 > 364120)
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
    public static final /* synthetic */ void access$deliver(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs r0, com.unity3d.ads.UnityAdsInitModuleListener r1, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse r2, java.util.Map r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1664088457 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$deliver(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$deliver(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1264714604 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$fail(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener, java.lang.String):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1264714604 < 0)
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
    public static final /* synthetic */ void access$fail(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs r0, com.unity3d.ads.UnityAdsInitModuleListener r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1264714604 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$fail(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener, java.lang.String):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$fail(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-947643234 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$lockFor(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener):fa2, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-947643234 < 0)
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
    public static final /* synthetic */ p000.fa2 access$lockFor(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs r0, com.unity3d.ads.UnityAdsInitModuleListener r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-947643234 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$lockFor(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener):fa2, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.access$lockFor(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, com.unity3d.ads.UnityAdsInitModuleListener):fa2");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1788737300 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.deliver(com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map<java.lang.String, ? extends java.lang.Object>):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1788737300 < 0)
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
    private final void deliver(com.unity3d.ads.UnityAdsInitModuleListener r1, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1788737300 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.deliver(com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map<java.lang.String, ? extends java.lang.Object>):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.deliver(com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1191606742 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.fail(com.unity3d.ads.UnityAdsInitModuleListener, java.lang.String):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1191606742 > 364120)
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
    private final void fail(com.unity3d.ads.UnityAdsInitModuleListener r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1191606742 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.fail(com.unity3d.ads.UnityAdsInitModuleListener, java.lang.String):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.fail(com.unity3d.ads.UnityAdsInitModuleListener, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1944121354 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.lockFor(com.unity3d.ads.UnityAdsInitModuleListener):fa2, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1944121354 > 364120)
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
    private final p000.fa2 lockFor(com.unity3d.ads.UnityAdsInitModuleListener r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1944121354 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.lockFor(com.unity3d.ads.UnityAdsInitModuleListener):fa2, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.lockFor(com.unity3d.ads.UnityAdsInitModuleListener):fa2");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1395761849 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sendModuleDiagnostic(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.lang.String, java.lang.String):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1395761849 < 0)
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
    private final void sendModuleDiagnostic(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.String r2, java.lang.Double r3, java.lang.String r4, java.lang.String r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1395761849 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sendModuleDiagnostic(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.lang.String, java.lang.String):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sendModuleDiagnostic(gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.lang.String, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (694280346 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sendModuleDiagnostic$default(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, int, java.lang.Object):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (694280346 > 364120)
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
    public static /* synthetic */ void sendModuleDiagnostic$default(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.String r2, java.lang.Double r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.Object r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (694280346 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sendModuleDiagnostic$default(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, int, java.lang.Object):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sendModuleDiagnostic$default(com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, int, java.lang.Object):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1470378181 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sessionExtras():java.util.Map<java.lang.String, java.lang.Object>, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1470378181 < 0)
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
    private final java.util.Map<java.lang.String, java.lang.Object> sessionExtras() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1470378181 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sessionExtras():java.util.Map<java.lang.String, java.lang.Object>, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.sessionExtras():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1225544597 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.invoke(gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1225544597 > 364120)
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
    @Override // com.unity3d.ads.core.domain.DeliverModuleConfigs
    public void invoke(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1225544597 > 364120) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.invoke(gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.invoke(gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-75742458 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.notifyFailure(java.lang.String):void, file: classes31.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-75742458 < 0)
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
    @Override // com.unity3d.ads.core.domain.DeliverModuleConfigs
    public void notifyFailure(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-75742458 < 0) in method: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.notifyFailure(java.lang.String):void, file: classes31.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.notifyFailure(java.lang.String):void");
    }
}

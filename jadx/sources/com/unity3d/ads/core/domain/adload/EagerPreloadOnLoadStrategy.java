package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import java.util.concurrent.ConcurrentHashMap;
import p000.t00;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes42.dex */
public final class EagerPreloadOnLoadStrategy implements PreShowWebViewStrategy {
    private final ConcurrentHashMap<ByteString, t00> deferreds;
    private final AndroidGetWebViewContainerUseCase getWebViewContainer;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (583682395 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.<init>(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.log.Logger):void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (583682395 > 360852)
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
    public EagerPreloadOnLoadStrategy(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r1, com.unity3d.ads.core.domain.SendDiagnosticEvent r2, com.unity3d.ads.core.log.Logger r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (583682395 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.<init>(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.log.Logger):void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.<init>(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase, com.unity3d.ads.core.domain.SendDiagnosticEvent, com.unity3d.ads.core.log.Logger):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2133815174 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.reportPreloadFailure(com.unity3d.ads.core.data.model.AdObject, un3, java.lang.String, java.lang.String, java.lang.Throwable):void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2133815174 > 360852)
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
    private final void reportPreloadFailure(com.unity3d.ads.core.data.model.AdObject r1, p000.un3 r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2133815174 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.reportPreloadFailure(com.unity3d.ads.core.data.model.AdObject, un3, java.lang.String, java.lang.String, java.lang.Throwable):void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.reportPreloadFailure(com.unity3d.ads.core.data.model.AdObject, un3, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1291298838 < 0) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.reportPreloadFailure$default(com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy, com.unity3d.ads.core.data.model.AdObject, un3, java.lang.String, java.lang.String, java.lang.Throwable, int, java.lang.Object):void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1291298838 < 0)
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
    public static /* synthetic */ void reportPreloadFailure$default(com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy r0, com.unity3d.ads.core.data.model.AdObject r1, p000.un3 r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5, int r6, java.lang.Object r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1291298838 < 0) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.reportPreloadFailure$default(com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy, com.unity3d.ads.core.data.model.AdObject, un3, java.lang.String, java.lang.String, java.lang.Throwable, int, java.lang.Object):void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.reportPreloadFailure$default(com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy, com.unity3d.ads.core.data.model.AdObject, un3, java.lang.String, java.lang.String, java.lang.Throwable, int, java.lang.Object):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1264590549 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.acquireForShow(y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1264590549 > 360852)
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
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public java.lang.Object acquireForShow(p000.y60 r1, com.unity3d.ads.core.data.model.AdObject r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1264590549 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.acquireForShow(y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.acquireForShow(y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-215821736 < 0) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onAdExpired(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-215821736 < 0)
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
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public java.lang.Object onAdExpired(com.unity3d.ads.core.data.model.AdObject r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-215821736 < 0) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onAdExpired(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onAdExpired(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (967682122 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (967682122 > 360852)
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
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public java.lang.Object onLoadSuccess(com.unity3d.ads.core.data.model.AdObject r1, java.lang.String r2, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r3, p000.y60 r4, p000.q41 r5, p000.z50 r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (967682122 > 360852) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-8403758 < 0) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-8403758 < 0)
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
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public java.lang.Object onShowComplete(com.unity3d.ads.core.data.model.AdObject r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-8403758 < 0) in method: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }
}

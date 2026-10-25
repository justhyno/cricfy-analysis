package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import com.unity3d.ads.core.log.Logger;
import p000.q60;
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
/* loaded from: classes42.dex */
public final class CleanUpWhenOpportunityExpires {
    private final q60 coroutineExceptionHandler;
    private final y60 coroutineScope;
    private final Logger logger;
    private final PreShowWebViewStrategy preShowStrategy;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1738137117 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.<init>(o60, com.unity3d.ads.core.log.Logger, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy):void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1738137117 < 0)
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
    public CleanUpWhenOpportunityExpires(p000.o60 r1, com.unity3d.ads.core.log.Logger r2, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1738137117 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.<init>(o60, com.unity3d.ads.core.log.Logger, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy):void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.<init>(o60, com.unity3d.ads.core.log.Logger, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1654275846 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.a(cg3, java.lang.Throwable):mu3, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1654275846 < 0)
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
    public static /* synthetic */ p000.mu3 m2594a(p000.cg3 r0, java.lang.Throwable r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1654275846 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.a(cg3, java.lang.Throwable):mu3, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.m2594a(cg3, java.lang.Throwable):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1404866582 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getLogger$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires):com.unity3d.ads.core.log.Logger, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1404866582 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.log.Logger access$getLogger$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1404866582 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getLogger$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires):com.unity3d.ads.core.log.Logger, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getLogger$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires):com.unity3d.ads.core.log.Logger");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1565210734 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getPreShowStrategy$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires):com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1565210734 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy access$getPreShowStrategy$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1565210734 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getPreShowStrategy$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires):com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getPreShowStrategy$p(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires):com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (844104748 > 360852) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke$lambda$2(qh1, java.lang.Throwable):mu3, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (844104748 > 360852)
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
    private static final p000.mu3 invoke$lambda$2(p000.qh1 r0, java.lang.Throwable r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (844104748 > 360852) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke$lambda$2(qh1, java.lang.Throwable):mu3, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke$lambda$2(qh1, java.lang.Throwable):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-246670743 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke(com.unity3d.ads.core.data.model.AdObject):void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-246670743 < 0)
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
    public final void invoke(com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-246670743 < 0) in method: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke(com.unity3d.ads.core.data.model.AdObject):void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke(com.unity3d.ads.core.data.model.AdObject):void");
    }
}

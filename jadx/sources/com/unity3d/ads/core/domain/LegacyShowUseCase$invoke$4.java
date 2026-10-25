package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import p000.by0;
import p000.jw2;
import p000.s41;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes28.dex */
public final class LegacyShowUseCase$invoke$4<T> implements by0 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ jw2 $displayReadyEventSent;
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ NativeConfigurationOuterClass.NativeStartMode $nativeStartMode;
    final /* synthetic */ String $placement;
    final /* synthetic */ s41 $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;
    final /* synthetic */ LegacyShowUseCase this$0;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2055577406 > 401788) in method: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.<init>(jw2, boolean, gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode, com.unity3d.ads.core.domain.LegacyShowUseCase, com.unity3d.ads.core.data.model.AdObject, long, java.lang.String, com.unity3d.ads.core.data.model.Listeners, com.unity3d.ads.UnityAdsShowOptions, s41):void, file: classes28.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2055577406 > 401788)
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
    public LegacyShowUseCase$invoke$4(p000.jw2 r1, boolean r2, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeStartMode r3, com.unity3d.ads.core.domain.LegacyShowUseCase r4, com.unity3d.ads.core.data.model.AdObject r5, long r6, java.lang.String r8, com.unity3d.ads.core.data.model.Listeners r9, com.unity3d.ads.UnityAdsShowOptions r10, p000.s41 r11) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2055577406 > 401788) in method: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.<init>(jw2, boolean, gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode, com.unity3d.ads.core.domain.LegacyShowUseCase, com.unity3d.ads.core.data.model.AdObject, long, java.lang.String, com.unity3d.ads.core.data.model.Listeners, com.unity3d.ads.UnityAdsShowOptions, s41):void, file: classes28.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.<init>(jw2, boolean, gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode, com.unity3d.ads.core.domain.LegacyShowUseCase, com.unity3d.ads.core.data.model.AdObject, long, java.lang.String, com.unity3d.ads.core.data.model.Listeners, com.unity3d.ads.UnityAdsShowOptions, s41):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1165273273 < 0) in method: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, z50):java.lang.Object, file: classes28.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1165273273 < 0)
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
    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1165273273 < 0) in method: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, z50):java.lang.Object, file: classes28.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-921866556 < 0) in method: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(java.lang.Object, z50):java.lang.Object, file: classes28.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-921866556 < 0)
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
    @Override // p000.by0
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-921866556 < 0) in method: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(java.lang.Object, z50):java.lang.Object, file: classes28.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(java.lang.Object, z50):java.lang.Object");
    }
}

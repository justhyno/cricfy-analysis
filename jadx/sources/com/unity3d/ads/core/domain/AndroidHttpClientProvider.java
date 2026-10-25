package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import p000.fa2;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes37.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final IsCronetFallbackAvailable isCronetFallbackAvailable;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final fa2 mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1280139538 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.<init>(com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.SendDiagnosticEvent, android.content.Context, com.unity3d.services.core.network.core.CronetEngineBuilderFactory, com.unity3d.ads.core.configuration.MediationTraitsMetadataReader, com.unity3d.ads.core.domain.IsCronetFallbackAvailable):void, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1280139538 > 381936)
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
    public AndroidHttpClientProvider(com.unity3d.services.core.domain.ISDKDispatchers r1, com.unity3d.ads.core.domain.SendDiagnosticEvent r2, android.content.Context r3, com.unity3d.services.core.network.core.CronetEngineBuilderFactory r4, com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r5, com.unity3d.ads.core.domain.IsCronetFallbackAvailable r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1280139538 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.<init>(com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.SendDiagnosticEvent, android.content.Context, com.unity3d.services.core.network.core.CronetEngineBuilderFactory, com.unity3d.ads.core.configuration.MediationTraitsMetadataReader, com.unity3d.ads.core.domain.IsCronetFallbackAvailable):void, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.<init>(com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.SendDiagnosticEvent, android.content.Context, com.unity3d.services.core.network.core.CronetEngineBuilderFactory, com.unity3d.ads.core.configuration.MediationTraitsMetadataReader, com.unity3d.ads.core.domain.IsCronetFallbackAvailable):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1344334998 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$buildNetworkClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider, android.content.Context, com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.HttpClientSelection, z50):java.lang.Object, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1344334998 < 0)
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
    public static final /* synthetic */ java.lang.Object access$buildNetworkClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider r0, android.content.Context r1, com.unity3d.services.core.domain.ISDKDispatchers r2, com.unity3d.ads.core.domain.HttpClientSelection r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1344334998 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$buildNetworkClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider, android.content.Context, com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.HttpClientSelection, z50):java.lang.Object, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$buildNetworkClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider, android.content.Context, com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.HttpClientSelection, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (375163910 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$createHttpClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider, z50):java.lang.Object, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (375163910 > 381936)
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
    public static final /* synthetic */ java.lang.Object access$createHttpClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider r0, p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (375163910 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$createHttpClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider, z50):java.lang.Object, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$createHttpClient(com.unity3d.ads.core.domain.AndroidHttpClientProvider, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2122034074 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getContext$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):android.content.Context, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2122034074 < 0)
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
    public static final /* synthetic */ android.content.Context access$getContext$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2122034074 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getContext$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):android.content.Context, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getContext$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):android.content.Context");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (494583946 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getCronetEngineBuilderFactory$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.services.core.network.core.CronetEngineBuilderFactory, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (494583946 > 381936)
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
    public static final /* synthetic */ com.unity3d.services.core.network.core.CronetEngineBuilderFactory access$getCronetEngineBuilderFactory$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (494583946 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getCronetEngineBuilderFactory$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.services.core.network.core.CronetEngineBuilderFactory, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getCronetEngineBuilderFactory$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.services.core.network.core.CronetEngineBuilderFactory");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1821035705 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getDispatchers$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.services.core.domain.ISDKDispatchers, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1821035705 > 381936)
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
    public static final /* synthetic */ com.unity3d.services.core.domain.ISDKDispatchers access$getDispatchers$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1821035705 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getDispatchers$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.services.core.domain.ISDKDispatchers, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getDispatchers$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.services.core.domain.ISDKDispatchers");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-897840902 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.ads.core.domain.SendDiagnosticEvent, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-897840902 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.SendDiagnosticEvent access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-897840902 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.ads.core.domain.SendDiagnosticEvent, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.access$getSendDiagnosticEvent$p(com.unity3d.ads.core.domain.AndroidHttpClientProvider):com.unity3d.ads.core.domain.SendDiagnosticEvent");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1262338938 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.buildNetworkClient(android.content.Context, com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.HttpClientSelection, z50):java.lang.Object, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1262338938 > 381936)
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
    private final java.lang.Object buildNetworkClient(android.content.Context r1, com.unity3d.services.core.domain.ISDKDispatchers r2, com.unity3d.ads.core.domain.HttpClientSelection r3, p000.z50 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1262338938 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.buildNetworkClient(android.content.Context, com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.HttpClientSelection, z50):java.lang.Object, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.buildNetworkClient(android.content.Context, com.unity3d.services.core.domain.ISDKDispatchers, com.unity3d.ads.core.domain.HttpClientSelection, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (603410736 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(z50):java.lang.Object, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (603410736 > 381936)
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
    private final java.lang.Object createHttpClient(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (603410736 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(z50):java.lang.Object, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (625276753 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.getOkHttp3Client():com.unity3d.services.core.network.core.OkHttp3Client, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (625276753 > 381936)
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
    public final com.unity3d.services.core.network.core.OkHttp3Client getOkHttp3Client() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (625276753 > 381936) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.getOkHttp3Client():com.unity3d.services.core.network.core.OkHttp3Client, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.getOkHttp3Client():com.unity3d.services.core.network.core.OkHttp3Client");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1048679776 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(z50):java.lang.Object, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1048679776 < 0)
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
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    public java.lang.Object invoke(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1048679776 < 0) in method: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(z50):java.lang.Object, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(z50):java.lang.Object");
    }
}

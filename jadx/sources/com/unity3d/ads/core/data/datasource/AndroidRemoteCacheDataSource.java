package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import p000.o60;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes3.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClientProvider httpClientProvider;
    private final o60 ioDispatcher;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1044979638 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.<init>(o60, com.unity3d.ads.core.domain.CreateFile, com.unity3d.ads.core.domain.GetFileExtensionFromUrl, com.unity3d.ads.core.domain.HttpClientProvider, com.unity3d.ads.core.data.repository.SessionRepository):void, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1044979638 < 0)
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
    public AndroidRemoteCacheDataSource(p000.o60 r1, com.unity3d.ads.core.domain.CreateFile r2, com.unity3d.ads.core.domain.GetFileExtensionFromUrl r3, com.unity3d.ads.core.domain.HttpClientProvider r4, com.unity3d.ads.core.data.repository.SessionRepository r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1044979638 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.<init>(o60, com.unity3d.ads.core.domain.CreateFile, com.unity3d.ads.core.domain.GetFileExtensionFromUrl, com.unity3d.ads.core.domain.HttpClientProvider, com.unity3d.ads.core.data.repository.SessionRepository):void, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.<init>(o60, com.unity3d.ads.core.domain.CreateFile, com.unity3d.ads.core.domain.GetFileExtensionFromUrl, com.unity3d.ads.core.domain.HttpClientProvider, com.unity3d.ads.core.data.repository.SessionRepository):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1470989864 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getCreateFile$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.CreateFile, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1470989864 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.CreateFile access$getCreateFile$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1470989864 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getCreateFile$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.CreateFile, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getCreateFile$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.CreateFile");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1737235902 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getFileInternal(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource, java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1737235902 > 389804)
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
    public static final /* synthetic */ java.lang.Object access$getFileInternal(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource r0, java.io.File r1, java.lang.String r2, java.lang.String r3, java.lang.Integer r4, int r5, p000.r41 r6, p000.z50 r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1737235902 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getFileInternal(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource, java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getFileInternal(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource, java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1479565528 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getGetFileExtensionFromUrl$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.GetFileExtensionFromUrl, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1479565528 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.GetFileExtensionFromUrl access$getGetFileExtensionFromUrl$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1479565528 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getGetFileExtensionFromUrl$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.GetFileExtensionFromUrl, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getGetFileExtensionFromUrl$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.GetFileExtensionFromUrl");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1966879278 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getHttpClientProvider$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.HttpClientProvider, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1966879278 < 0)
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
    public static final /* synthetic */ com.unity3d.ads.core.domain.HttpClientProvider access$getHttpClientProvider$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1966879278 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getHttpClientProvider$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.HttpClientProvider, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getHttpClientProvider$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.domain.HttpClientProvider");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2956844 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getSessionRepository$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.data.repository.SessionRepository, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2956844 > 389804)
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
    public static final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository access$getSessionRepository$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2956844 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getSessionRepository$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.data.repository.SessionRepository, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.access$getSessionRepository$p(com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource):com.unity3d.ads.core.data.repository.SessionRepository");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (14348431 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFileInternal(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (14348431 > 389804)
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
    private final java.lang.Object getFileInternal(java.io.File r1, java.lang.String r2, java.lang.String r3, java.lang.Integer r4, int r5, p000.r41 r6, p000.z50 r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (14348431 > 389804) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFileInternal(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFileInternal(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1930609044 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1930609044 < 0)
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
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public java.lang.Object getFile(java.io.File r1, java.lang.String r2, java.lang.String r3, java.lang.Integer r4, int r5, p000.r41 r6, p000.z50 r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1930609044 < 0) in method: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, int, r41, z50):java.lang.Object");
    }
}

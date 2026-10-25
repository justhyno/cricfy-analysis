package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.webviewpool.PoolEntry;
import com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory;
import com.unity3d.ads.adplayer.webviewpool.WebViewPool;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes4.dex */
public class PoolAcquireAtShowStrategy implements PreShowWebViewStrategy {
    private final ConcurrentHashMap<ByteString, PoolEntry> claimedEntries;
    private final PooledWebViewContainerFactory containerFactory;
    private final WebViewPool pool;
    private final int poolSize;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1635833307 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.<init>(com.unity3d.ads.adplayer.webviewpool.WebViewPool, int, com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory):void, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1635833307 > 406256)
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
    public PoolAcquireAtShowStrategy(com.unity3d.ads.adplayer.webviewpool.WebViewPool r1, int r2, com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1635833307 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.<init>(com.unity3d.ads.adplayer.webviewpool.WebViewPool, int, com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory):void, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.<init>(com.unity3d.ads.adplayer.webviewpool.WebViewPool, int, com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-143455760 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-143455760 < 0)
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
    public static java.lang.Object acquireForShow$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy r0, p000.y60 r1, com.unity3d.ads.core.data.model.AdObject r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-143455760 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-975111307 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onAdExpired$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-975111307 < 0)
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
    public static java.lang.Object onAdExpired$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy r0, com.unity3d.ads.core.data.model.AdObject r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-975111307 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onAdExpired$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onAdExpired$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (645166295 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onLoadSuccess$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (645166295 > 406256)
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
    public static java.lang.Object onLoadSuccess$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy r0, com.unity3d.ads.core.data.model.AdObject r1, java.lang.String r2, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r3, p000.y60 r4, p000.q41 r5, p000.z50 r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (645166295 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onLoadSuccess$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onLoadSuccess$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1562630524 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onShowComplete$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1562630524 < 0)
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
    public static java.lang.Object onShowComplete$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy r0, com.unity3d.ads.core.data.model.AdObject r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1562630524 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onShowComplete$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onShowComplete$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1536975020 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow(y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1536975020 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1536975020 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow(y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow(y60, com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (936778095 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getClaimedEntries():java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, com.unity3d.ads.adplayer.webviewpool.PoolEntry>, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (936778095 > 406256)
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
    public final java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, com.unity3d.ads.adplayer.webviewpool.PoolEntry> getClaimedEntries() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (936778095 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getClaimedEntries():java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, com.unity3d.ads.adplayer.webviewpool.PoolEntry>, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getClaimedEntries():java.util.concurrent.ConcurrentHashMap");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1517604397 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getContainerFactory():com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1517604397 > 406256)
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
    public final com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory getContainerFactory() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1517604397 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getContainerFactory():com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getContainerFactory():com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2125401758 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getPool():com.unity3d.ads.adplayer.webviewpool.WebViewPool, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2125401758 < 0)
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
    public final com.unity3d.ads.adplayer.webviewpool.WebViewPool getPool() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2125401758 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getPool():com.unity3d.ads.adplayer.webviewpool.WebViewPool, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getPool():com.unity3d.ads.adplayer.webviewpool.WebViewPool");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1443555823 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getPoolSize():int, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1443555823 < 0)
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
    public final int getPoolSize() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1443555823 < 0) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getPoolSize():int, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.getPoolSize():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1763123441 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onAdExpired(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1763123441 > 406256)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1763123441 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onAdExpired(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onAdExpired(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (277471890 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (277471890 > 406256)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (277471890 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, y60, q41, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1018861622 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1018861622 > 406256)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1018861622 > 406256) in method: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object, file: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, z50):java.lang.Object");
    }
}

package com.unity3d.ads.adplayer.webviewpool;

import android.content.Context;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.o60;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes40.dex */
public class AndroidWebViewPool implements WebViewPool {
    private static final long ACQUIRE_TIMEOUT_MS = 2000;
    public static final Companion Companion = null;
    private static final long HEALTH_CHECK_TIMEOUT_MS = 500;
    private final Context context;
    private final ConcurrentLinkedQueue<PoolEntry> freshViews;
    private final GetCachedAsset getCachedAsset;
    private final AtomicBoolean isInitialized;
    private final o60 mainDispatcher;
    private volatile int poolSize;
    private final ConcurrentLinkedQueue<PoolEntry> recycledViews;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes25.dex */
    public static final class Companion {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (549641280 > 346388) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.Companion.<init>():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (549641280 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (549641280 > 346388) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.Companion.<init>():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1493082414 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.Companion.<init>(bd0):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1493082414 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public /* synthetic */ Companion(p000.bd0 r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1493082414 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.Companion.<init>(bd0):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.Companion.<init>(bd0):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (776533034 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.<clinit>():void, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (776533034 > 417452)
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
    static {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (776533034 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.<clinit>():void, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1809239221 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.<init>(android.content.Context, o60, com.unity3d.ads.core.domain.GetCachedAsset, com.unity3d.ads.core.domain.SendDiagnosticEvent):void, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1809239221 > 417452)
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
    public AndroidWebViewPool(android.content.Context r1, p000.o60 r2, com.unity3d.ads.core.domain.GetCachedAsset r3, com.unity3d.ads.core.domain.SendDiagnosticEvent r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1809239221 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.<init>(android.content.Context, o60, com.unity3d.ads.core.domain.GetCachedAsset, com.unity3d.ads.core.domain.SendDiagnosticEvent):void, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.<init>(android.content.Context, o60, com.unity3d.ads.core.domain.GetCachedAsset, com.unity3d.ads.core.domain.SendDiagnosticEvent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1899564054 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$createWebView(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.AndroidWebViewClient, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1899564054 > 417452)
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
    public static final /* synthetic */ java.lang.Object access$createWebView(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, com.unity3d.ads.adplayer.AndroidWebViewClient r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1899564054 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$createWebView(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.AndroidWebViewClient, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$createWebView(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.AndroidWebViewClient, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1837398690 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1837398690 > 417452)
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
    public static final /* synthetic */ java.lang.Object access$destroyEntry(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1837398690 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1430975108 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getContext$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):android.content.Context, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1430975108 < 0)
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
    public static final /* synthetic */ android.content.Context access$getContext$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1430975108 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getContext$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):android.content.Context, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getContext$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):android.content.Context");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2140907100 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):java.util.concurrent.ConcurrentLinkedQueue, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2140907100 < 0)
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
    public static final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue access$getFreshViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2140907100 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):java.util.concurrent.ConcurrentLinkedQueue, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):java.util.concurrent.ConcurrentLinkedQueue");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1604718546 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getMainDispatcher$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):o60, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1604718546 < 0)
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
    public static final /* synthetic */ p000.o60 access$getMainDispatcher$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1604718546 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getMainDispatcher$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):o60, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getMainDispatcher$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):o60");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (449813678 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getRecycledViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):java.util.concurrent.ConcurrentLinkedQueue, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (449813678 > 417452)
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
    public static final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue access$getRecycledViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (449813678 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getRecycledViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):java.util.concurrent.ConcurrentLinkedQueue, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getRecycledViews$p(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool):java.util.concurrent.ConcurrentLinkedQueue");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-641205208 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-641205208 < 0)
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
    public static final /* synthetic */ java.lang.Object access$isHealthy(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-641205208 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1779298778 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1779298778 > 417452)
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
    public static java.lang.Object acquireForShow$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1779298778 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1570971298 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1570971298 < 0)
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
    public static /* synthetic */ java.lang.Object acquireFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1570971298 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1077492358 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createClient():com.unity3d.ads.adplayer.AndroidWebViewClient, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1077492358 < 0)
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
    private final com.unity3d.ads.adplayer.AndroidWebViewClient createClient() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1077492358 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createClient():com.unity3d.ads.adplayer.AndroidWebViewClient, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createClient():com.unity3d.ads.adplayer.AndroidWebViewClient");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-96841866 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-96841866 < 0)
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
    public static java.lang.Object createFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-96841866 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-357141714 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createWebView(com.unity3d.ads.adplayer.AndroidWebViewClient, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-357141714 < 0)
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
    private final java.lang.Object createWebView(com.unity3d.ads.adplayer.AndroidWebViewClient r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-357141714 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createWebView(com.unity3d.ads.adplayer.AndroidWebViewClient, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createWebView(com.unity3d.ads.adplayer.AndroidWebViewClient, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1380557382 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.destroyEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1380557382 > 417452)
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
    private final java.lang.Object destroyEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1380557382 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.destroyEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.destroyEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1929257607 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.enqueueRecycled$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1929257607 < 0)
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
    public static java.lang.Object enqueueRecycled$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1929257607 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.enqueueRecycled$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.enqueueRecycled$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1258041384 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, int, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1258041384 < 0)
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
    public static java.lang.Object initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, int r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1258041384 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, int, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, int, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1585394130 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.isHealthy(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1585394130 > 417452)
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
    private final java.lang.Object isHealthy(com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1585394130 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.isHealthy(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.isHealthy(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (380391093 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (380391093 > 417452)
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
    public static java.lang.Object release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (380391093 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1213377846 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1213377846 < 0)
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
    public static java.lang.Object resetEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0, com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1213377846 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (140325656 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow(z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (140325656 > 417452)
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
    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public java.lang.Object acquireForShow(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (140325656 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow(z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow(z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1494597466 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireFreshEntry(z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1494597466 < 0)
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
    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public java.lang.Object acquireFreshEntry(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1494597466 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireFreshEntry(z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireFreshEntry(z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1684358700 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$unity_ads_defaultRelease(z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1684358700 < 0)
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
    public java.lang.Object createFreshEntry$unity_ads_defaultRelease(p000.z50 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1684358700 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$unity_ads_defaultRelease(z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$unity_ads_defaultRelease(z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1647003442 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.enqueueRecycled(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1647003442 < 0)
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
    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public java.lang.Object enqueueRecycled(com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1647003442 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.enqueueRecycled(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.enqueueRecycled(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2034256363 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize(int, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2034256363 < 0)
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
    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public java.lang.Object initialize(int r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2034256363 < 0) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize(int, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize(int, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (553193074 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (553193074 > 417452)
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
    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public java.lang.Object release(com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (553193074 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2052377151 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2052377151 > 417452)
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
    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public java.lang.Object resetEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2052377151 > 417452) in method: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry(com.unity3d.ads.adplayer.webviewpool.PoolEntry, z50):java.lang.Object");
    }
}

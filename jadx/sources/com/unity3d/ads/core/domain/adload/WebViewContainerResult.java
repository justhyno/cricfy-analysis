package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent;

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
/* loaded from: classes36.dex */
public abstract class WebViewContainerResult {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes39.dex */
    public static final class FromPool extends WebViewContainerResult {
        private final AndroidWebViewContainer container;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1862296110 > 388180) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1862296110 > 388180)
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
        public FromPool(com.unity3d.ads.adplayer.AndroidWebViewContainer r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1862296110 > 388180) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (474627498 > 388180) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, com.unity3d.ads.adplayer.AndroidWebViewContainer, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (474627498 > 388180)
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
        public static /* synthetic */ com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool r0, com.unity3d.ads.adplayer.AndroidWebViewContainer r1, int r2, java.lang.Object r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (474627498 > 388180) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, com.unity3d.ads.adplayer.AndroidWebViewContainer, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, com.unity3d.ads.adplayer.AndroidWebViewContainer, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-840766582 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-840766582 < 0)
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
        public final com.unity3d.ads.adplayer.AndroidWebViewContainer component1() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-840766582 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1783658923 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1783658923 < 0)
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
        public final com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool copy(com.unity3d.ads.adplayer.AndroidWebViewContainer r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1783658923 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-914550325 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.equals(java.lang.Object):boolean, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-914550325 < 0)
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
        public boolean equals(java.lang.Object r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-914550325 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.equals(java.lang.Object):boolean, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.equals(java.lang.Object):boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (550062915 > 388180) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (550062915 > 388180)
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
        @Override // com.unity3d.ads.core.domain.adload.WebViewContainerResult
        public com.unity3d.ads.adplayer.AndroidWebViewContainer getContainer() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (550062915 > 388180) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1321117469 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.hashCode():int, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1321117469 < 0)
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
        public int hashCode() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1321117469 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.hashCode():int, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.hashCode():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1070057462 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.toString():java.lang.String, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1070057462 < 0)
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
        public java.lang.String toString() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1070057462 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.toString():java.lang.String, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FromPool.toString():java.lang.String");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes41.dex */
    public static final class FullyPreloaded extends WebViewContainerResult {
        private final AdPlayer adPlayer;
        private final WebViewBridge bridge;
        private final AndroidWebViewContainer container;
        private final LoadEvent loadEvent;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-449992490 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent):void, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-449992490 < 0)
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
        public FullyPreloaded(com.unity3d.ads.adplayer.AndroidWebViewContainer r1, com.unity3d.ads.adplayer.AdPlayer r2, com.unity3d.ads.adplayer.WebViewBridge r3, com.unity3d.ads.adplayer.model.LoadEvent r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-449992490 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent):void, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1363089336 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1363089336 > 396432)
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
        public static /* synthetic */ com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded r0, com.unity3d.ads.adplayer.AndroidWebViewContainer r1, com.unity3d.ads.adplayer.AdPlayer r2, com.unity3d.ads.adplayer.WebViewBridge r3, com.unity3d.ads.adplayer.model.LoadEvent r4, int r5, java.lang.Object r6) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1363089336 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-518103560 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-518103560 < 0)
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
        public final com.unity3d.ads.adplayer.AndroidWebViewContainer component1() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-518103560 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1687232854 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component2():com.unity3d.ads.adplayer.AdPlayer, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1687232854 > 396432)
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
        public final com.unity3d.ads.adplayer.AdPlayer component2() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1687232854 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component2():com.unity3d.ads.adplayer.AdPlayer, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component2():com.unity3d.ads.adplayer.AdPlayer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (136577970 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component3():com.unity3d.ads.adplayer.WebViewBridge, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (136577970 > 396432)
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
        public final com.unity3d.ads.adplayer.WebViewBridge component3() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (136577970 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component3():com.unity3d.ads.adplayer.WebViewBridge, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component3():com.unity3d.ads.adplayer.WebViewBridge");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-395973988 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component4():com.unity3d.ads.adplayer.model.LoadEvent, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-395973988 < 0)
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
        public final com.unity3d.ads.adplayer.model.LoadEvent component4() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-395973988 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component4():com.unity3d.ads.adplayer.model.LoadEvent, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.component4():com.unity3d.ads.adplayer.model.LoadEvent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1529059947 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1529059947 > 396432)
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
        public final com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded copy(com.unity3d.ads.adplayer.AndroidWebViewContainer r1, com.unity3d.ads.adplayer.AdPlayer r2, com.unity3d.ads.adplayer.WebViewBridge r3, com.unity3d.ads.adplayer.model.LoadEvent r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1529059947 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer, com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.model.LoadEvent):com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-410777413 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.equals(java.lang.Object):boolean, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-410777413 < 0)
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
        public boolean equals(java.lang.Object r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-410777413 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.equals(java.lang.Object):boolean, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.equals(java.lang.Object):boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1226203448 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getAdPlayer():com.unity3d.ads.adplayer.AdPlayer, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1226203448 > 396432)
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
        public final com.unity3d.ads.adplayer.AdPlayer getAdPlayer() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1226203448 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getAdPlayer():com.unity3d.ads.adplayer.AdPlayer, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getAdPlayer():com.unity3d.ads.adplayer.AdPlayer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (235482808 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getBridge():com.unity3d.ads.adplayer.WebViewBridge, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (235482808 > 396432)
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
        public final com.unity3d.ads.adplayer.WebViewBridge getBridge() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (235482808 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getBridge():com.unity3d.ads.adplayer.WebViewBridge, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getBridge():com.unity3d.ads.adplayer.WebViewBridge");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1831098576 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1831098576 > 396432)
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
        @Override // com.unity3d.ads.core.domain.adload.WebViewContainerResult
        public com.unity3d.ads.adplayer.AndroidWebViewContainer getContainer() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1831098576 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1882709372 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getLoadEvent():com.unity3d.ads.adplayer.model.LoadEvent, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1882709372 > 396432)
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
        public final com.unity3d.ads.adplayer.model.LoadEvent getLoadEvent() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1882709372 > 396432) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getLoadEvent():com.unity3d.ads.adplayer.model.LoadEvent, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.getLoadEvent():com.unity3d.ads.adplayer.model.LoadEvent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-883185119 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.hashCode():int, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-883185119 < 0)
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
        public int hashCode() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-883185119 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.hashCode():int, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.hashCode():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-47607490 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.toString():java.lang.String, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-47607490 < 0)
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
        public java.lang.String toString() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-47607490 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.toString():java.lang.String, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded.toString():java.lang.String");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes7.dex */
    public static final class OnDemand extends WebViewContainerResult {
        private final AndroidWebViewContainer container;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1031796406 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1031796406 > 408588)
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
        public OnDemand(com.unity3d.ads.adplayer.AndroidWebViewContainer r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1031796406 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.<init>(com.unity3d.ads.adplayer.AndroidWebViewContainer):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (814523686 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, com.unity3d.ads.adplayer.AndroidWebViewContainer, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (814523686 > 408588)
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
        public static /* synthetic */ com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand r0, com.unity3d.ads.adplayer.AndroidWebViewContainer r1, int r2, java.lang.Object r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (814523686 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, com.unity3d.ads.adplayer.AndroidWebViewContainer, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.copy$default(com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, com.unity3d.ads.adplayer.AndroidWebViewContainer, int, java.lang.Object):com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-972498570 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-972498570 < 0)
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
        public final com.unity3d.ads.adplayer.AndroidWebViewContainer component1() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-972498570 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.component1():com.unity3d.ads.adplayer.AndroidWebViewContainer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-183240018 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer):com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-183240018 < 0)
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
        public final com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand copy(com.unity3d.ads.adplayer.AndroidWebViewContainer r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-183240018 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer):com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.copy(com.unity3d.ads.adplayer.AndroidWebViewContainer):com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1208130114 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.equals(java.lang.Object):boolean, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1208130114 < 0)
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
        public boolean equals(java.lang.Object r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1208130114 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.equals(java.lang.Object):boolean, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.equals(java.lang.Object):boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (434556042 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (434556042 > 408588)
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
        @Override // com.unity3d.ads.core.domain.adload.WebViewContainerResult
        public com.unity3d.ads.adplayer.AndroidWebViewContainer getContainer() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (434556042 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.getContainer():com.unity3d.ads.adplayer.AndroidWebViewContainer");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1032372506 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.hashCode():int, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1032372506 < 0)
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
        public int hashCode() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1032372506 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.hashCode():int, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.hashCode():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (105917972 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.toString():java.lang.String, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (105917972 > 408588)
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
        public java.lang.String toString() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (105917972 > 408588) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.toString():java.lang.String, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.OnDemand.toString():java.lang.String");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1955229754 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.<init>():void, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1955229754 < 0)
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
    private WebViewContainerResult() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1955229754 < 0) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.<init>():void, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1001309085 > 411420) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.<init>(bd0):void, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1001309085 > 411420)
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
    public /* synthetic */ WebViewContainerResult(p000.bd0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1001309085 > 411420) in method: com.unity3d.ads.core.domain.adload.WebViewContainerResult.<init>(bd0):void, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.WebViewContainerResult.<init>(bd0):void");
    }

    public abstract AndroidWebViewContainer getContainer();
}

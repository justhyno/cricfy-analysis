package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.CampaignMetadataOuterClass;

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
/* loaded from: classes34.dex */
public final class CampaignMetadataKt {
    public static final CampaignMetadataKt INSTANCE = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes10.dex */
    public static final class Dsl {
        public static final Companion Companion = null;
        private final CampaignMetadataOuterClass.CampaignMetadata.Builder _builder;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes34.dex */
        public static final class AssetsToCacheProxy extends DslProxy {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-776472510 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.AssetsToCacheProxy.<init>():void, file: classes34.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-776472510 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            private AssetsToCacheProxy() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-776472510 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.AssetsToCacheProxy.<init>():void, file: classes34.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.AssetsToCacheProxy.<init>():void");
            }
        }

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes32.dex */
        public static final class Companion {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (705315557 > 420208) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion.<init>():void, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (705315557 > 420208)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            private Companion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (705315557 > 420208) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion.<init>():void, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1929620637 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion.<init>(bd0):void, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1929620637 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public /* synthetic */ Companion(p000.bd0 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1929620637 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion.<init>(bd0):void, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion.<init>(bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1188099365 > 420208) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion._create(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):gatewayprotocol.v1.CampaignMetadataKt$Dsl, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1188099365 > 420208)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public final /* synthetic */ gatewayprotocol.v1.CampaignMetadataKt.Dsl _create(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1188099365 > 420208) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion._create(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):gatewayprotocol.v1.CampaignMetadataKt$Dsl, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.Companion._create(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):gatewayprotocol.v1.CampaignMetadataKt$Dsl");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (621139437 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<clinit>():void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (621139437 > 376268)
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
        static {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (621139437 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<clinit>():void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-19303176 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<init>(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-19303176 < 0)
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
        private Dsl(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata.Builder r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-19303176 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<init>(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<init>(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1348268848 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<init>(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder, bd0):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1348268848 > 376268)
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
        public /* synthetic */ Dsl(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata.Builder r1, p000.bd0 r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1348268848 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<init>(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder, bd0):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.<init>(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder, bd0):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1110272148 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl._build():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1110272148 < 0)
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
        public final /* synthetic */ gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata _build() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1110272148 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl._build():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl._build():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-735387176 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.addAllAssetsToCache(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-735387176 < 0)
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
        public final /* synthetic */ void addAllAssetsToCache(com.google.protobuf.kotlin.DslList r1, java.lang.Iterable r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-735387176 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.addAllAssetsToCache(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.addAllAssetsToCache(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1748755765 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.addAssetsToCache(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1748755765 > 376268)
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
        public final /* synthetic */ void addAssetsToCache(com.google.protobuf.kotlin.DslList r1, gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1748755765 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.addAssetsToCache(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.addAssetsToCache(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1765324665 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearAdDataRefreshDelayMs():void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1765324665 > 376268)
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
        public final void clearAdDataRefreshDelayMs() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1765324665 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearAdDataRefreshDelayMs():void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearAdDataRefreshDelayMs():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (755490098 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearAssetsToCache(com.google.protobuf.kotlin.DslList):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (755490098 > 376268)
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
        public final /* synthetic */ void clearAssetsToCache(com.google.protobuf.kotlin.DslList r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (755490098 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearAssetsToCache(com.google.protobuf.kotlin.DslList):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearAssetsToCache(com.google.protobuf.kotlin.DslList):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1319265033 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearCampaignStateData():void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1319265033 < 0)
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
        public final void clearCampaignStateData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1319265033 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearCampaignStateData():void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearCampaignStateData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (90238426 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearCampaignStateDataVersion():void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (90238426 > 376268)
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
        public final void clearCampaignStateDataVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (90238426 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearCampaignStateDataVersion():void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearCampaignStateDataVersion():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (878077534 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearTtlSeconds():void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (878077534 > 376268)
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
        public final void clearTtlSeconds() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (878077534 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearTtlSeconds():void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.clearTtlSeconds():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1106085650 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getAdDataRefreshDelayMs():int, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1106085650 > 376268)
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
        public final int getAdDataRefreshDelayMs() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1106085650 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getAdDataRefreshDelayMs():int, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getAdDataRefreshDelayMs():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1376449692 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getAssetsToCache():com.google.protobuf.kotlin.DslList, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1376449692 > 376268)
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
        public final /* synthetic */ com.google.protobuf.kotlin.DslList getAssetsToCache() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1376449692 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getAssetsToCache():com.google.protobuf.kotlin.DslList, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getAssetsToCache():com.google.protobuf.kotlin.DslList");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1018527168 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getCampaignStateData():com.google.protobuf.ByteString, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1018527168 > 376268)
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
        public final com.google.protobuf.ByteString getCampaignStateData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1018527168 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getCampaignStateData():com.google.protobuf.ByteString, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getCampaignStateData():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-794426958 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getCampaignStateDataVersion():int, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-794426958 < 0)
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
        public final int getCampaignStateDataVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-794426958 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getCampaignStateDataVersion():int, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getCampaignStateDataVersion():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1321436514 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getTtlSeconds():int, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1321436514 > 376268)
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
        public final int getTtlSeconds() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1321436514 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getTtlSeconds():int, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.getTtlSeconds():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1111335950 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.plusAssignAllAssetsToCache(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset, gatewayprotocol.v1.CampaignMetadataKt$Dsl$AssetsToCacheProxy>, java.lang.Iterable<gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset>):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1111335950 < 0)
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
        public final /* synthetic */ void plusAssignAllAssetsToCache(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset, gatewayprotocol.v1.CampaignMetadataKt.Dsl.AssetsToCacheProxy> r1, java.lang.Iterable<gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset> r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1111335950 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.plusAssignAllAssetsToCache(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset, gatewayprotocol.v1.CampaignMetadataKt$Dsl$AssetsToCacheProxy>, java.lang.Iterable<gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset>):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.plusAssignAllAssetsToCache(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2002453730 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.plusAssignAssetsToCache(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset, gatewayprotocol.v1.CampaignMetadataKt$Dsl$AssetsToCacheProxy>, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2002453730 > 376268)
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
        public final /* synthetic */ void plusAssignAssetsToCache(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset, gatewayprotocol.v1.CampaignMetadataKt.Dsl.AssetsToCacheProxy> r1, gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2002453730 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.plusAssignAssetsToCache(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset, gatewayprotocol.v1.CampaignMetadataKt$Dsl$AssetsToCacheProxy>, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.plusAssignAssetsToCache(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (927226396 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setAdDataRefreshDelayMs(int):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (927226396 > 376268)
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
        public final void setAdDataRefreshDelayMs(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (927226396 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setAdDataRefreshDelayMs(int):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setAdDataRefreshDelayMs(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1753952102 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setAssetsToCache(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1753952102 < 0)
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
        public final /* synthetic */ void setAssetsToCache(com.google.protobuf.kotlin.DslList r1, int r2, gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1753952102 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setAssetsToCache(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setAssetsToCache(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignAsset):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-75005113 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setCampaignStateData(com.google.protobuf.ByteString):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-75005113 < 0)
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
        public final void setCampaignStateData(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-75005113 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setCampaignStateData(com.google.protobuf.ByteString):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setCampaignStateData(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (163033266 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setCampaignStateDataVersion(int):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (163033266 > 376268)
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
        public final void setCampaignStateDataVersion(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (163033266 > 376268) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setCampaignStateDataVersion(int):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setCampaignStateDataVersion(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1620519114 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setTtlSeconds(int):void, file: classes10.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1620519114 < 0)
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
        public final void setTtlSeconds(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1620519114 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setTtlSeconds(int):void, file: classes10.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.Dsl.setTtlSeconds(int):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1987793336 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.<clinit>():void, file: classes34.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1987793336 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1987793336 < 0) in method: gatewayprotocol.v1.CampaignMetadataKt.<clinit>():void, file: classes34.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (299091414 > 358344) in method: gatewayprotocol.v1.CampaignMetadataKt.<init>():void, file: classes34.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (299091414 > 358344)
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
    private CampaignMetadataKt() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (299091414 > 358344) in method: gatewayprotocol.v1.CampaignMetadataKt.<init>():void, file: classes34.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignMetadataKt.<init>():void");
    }
}

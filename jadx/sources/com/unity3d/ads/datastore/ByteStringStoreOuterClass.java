package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

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
/* loaded from: classes13.dex */
public final class ByteStringStoreOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* renamed from: com.unity3d.ads.datastore.ByteStringStoreOuterClass$1 */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C01791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4553xa1df5c61 = null;
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes26.dex */
    public static final class ByteStringStore extends GeneratedMessageLite<ByteStringStore, Builder> implements ByteStringStoreOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final ByteStringStore DEFAULT_INSTANCE = null;
        private static volatile Parser<ByteStringStore> PARSER;
        private ByteString data_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes50.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<ByteStringStore, Builder> implements ByteStringStoreOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1108422962 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.<init>():void, file: classes50.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1108422962 < 0)
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
            private Builder() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1108422962 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.<init>():void, file: classes50.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1595415424 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.<init>(com.unity3d.ads.datastore.ByteStringStoreOuterClass$1):void, file: classes50.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1595415424 < 0)
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
            public /* synthetic */ Builder(com.unity3d.ads.datastore.ByteStringStoreOuterClass.C01791 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1595415424 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.<init>(com.unity3d.ads.datastore.ByteStringStoreOuterClass$1):void, file: classes50.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.<init>(com.unity3d.ads.datastore.ByteStringStoreOuterClass$1):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1737934254 > 405784) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.clearData():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes50.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1737934254 > 405784)
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
            public com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder clearData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1737934254 > 405784) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.clearData():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes50.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.clearData():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-135215080 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.getData():com.google.protobuf.ByteString, file: classes50.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-135215080 < 0)
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
            @Override // com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStoreOrBuilder
            public com.google.protobuf.ByteString getData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-135215080 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.getData():com.google.protobuf.ByteString, file: classes50.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.getData():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-518025066 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.setData(com.google.protobuf.ByteString):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes50.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-518025066 < 0)
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
            public com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder setData(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-518025066 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.setData(com.google.protobuf.ByteString):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes50.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder.setData(com.google.protobuf.ByteString):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1367518818 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.<clinit>():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1367518818 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1367518818 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.<clinit>():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-485469354 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.<init>():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-485469354 < 0)
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
        private ByteStringStore() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-485469354 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.<init>():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (218711750 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$000():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (218711750 > 358328)
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
        public static /* synthetic */ com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (218711750 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$000():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$000():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-54845926 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$100(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-54845926 < 0)
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
        public static /* synthetic */ void access$100(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-54845926 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$100(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$100(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1211680078 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$200(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1211680078 < 0)
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
        public static /* synthetic */ void access$200(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1211680078 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$200(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.access$200(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-914150110 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.clearData():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-914150110 < 0)
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
        private void clearData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-914150110 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.clearData():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.clearData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1049486030 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1049486030 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1049486030 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (197706689 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (197706689 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (197706689 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder():com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (283721882 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (283721882 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (283721882 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder(com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-722929198 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-722929198 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-722929198 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1272233132 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1272233132 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1272233132 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-759016970 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-759016970 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-759016970 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1404484897 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1404484897 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1404484897 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1690861504 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1690861504 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1690861504 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-58308478 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-58308478 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-58308478 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1552245351 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1552245351 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1552245351 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1928859176 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1928859176 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1928859176 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (368583646 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (368583646 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (368583646 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-201497862 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-201497862 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-201497862 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1472379639 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(byte[]):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1472379639 > 358328)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1472379639 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(byte[]):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(byte[]):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-390552274 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-390552274 < 0)
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
        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-390552274 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (364550430 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parser():com.google.protobuf.Parser<com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (364550430 > 358328)
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
        public static com.google.protobuf.Parser<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (364550430 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parser():com.google.protobuf.Parser<com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1405487954 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.setData(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1405487954 > 358328)
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
        private void setData(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1405487954 > 358328) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.setData(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.setData(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1785185197 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1785185197 < 0)
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
        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1785185197 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2118458291 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getData():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2118458291 < 0)
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
        @Override // com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStoreOrBuilder
        public com.google.protobuf.ByteString getData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2118458291 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getData():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getData():com.google.protobuf.ByteString");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes5.dex */
    public interface ByteStringStoreOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1266132740 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.<init>():void, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1266132740 < 0)
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
    private ByteStringStoreOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1266132740 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.<init>():void, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1924215639 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1924215639 < 0)
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
    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1924215639 < 0) in method: com.unity3d.ads.datastore.ByteStringStoreOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.ByteStringStoreOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

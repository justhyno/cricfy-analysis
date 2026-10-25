package gatewayprotocol.v1;

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
/* loaded from: classes42.dex */
public final class ModuleInitParamsOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes7.dex */
    public static final class ModuleInitParams extends GeneratedMessageLite<ModuleInitParams, Builder> implements ModuleInitParamsOrBuilder {
        public static final int CLASS_NAME_FIELD_NUMBER = 3;
        private static final ModuleInitParams DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile Parser<ModuleInitParams> PARSER;
        private String className_;
        private String name_;
        private ByteString params_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes13.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<ModuleInitParams, Builder> implements ModuleInitParamsOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1172657390 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.<init>():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1172657390 > 389804)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1172657390 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.<init>():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1946778427 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.<init>(b82):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1946778427 < 0)
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
            public /* synthetic */ Builder(p000.b82 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1946778427 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.<init>(b82):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.<init>(b82):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-568725414 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearClassName():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-568725414 < 0)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder clearClassName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-568725414 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearClassName():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearClassName():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1400440126 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearName():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1400440126 > 389804)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder clearName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1400440126 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearName():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearName():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1509665776 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearParams():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1509665776 < 0)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder clearParams() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1509665776 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearParams():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.clearParams():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1287788897 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getClassName():java.lang.String, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1287788897 > 389804)
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
            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public java.lang.String getClassName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1287788897 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getClassName():java.lang.String, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getClassName():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1689344738 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getClassNameBytes():com.google.protobuf.ByteString, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1689344738 > 389804)
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
            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public com.google.protobuf.ByteString getClassNameBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1689344738 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getClassNameBytes():com.google.protobuf.ByteString, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getClassNameBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1338159030 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getName():java.lang.String, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1338159030 < 0)
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
            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public java.lang.String getName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1338159030 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getName():java.lang.String, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getName():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1805299686 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getNameBytes():com.google.protobuf.ByteString, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1805299686 > 389804)
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
            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public com.google.protobuf.ByteString getNameBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1805299686 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getNameBytes():com.google.protobuf.ByteString, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getNameBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2128633530 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getParams():com.google.protobuf.ByteString, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2128633530 < 0)
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
            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public com.google.protobuf.ByteString getParams() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2128633530 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getParams():com.google.protobuf.ByteString, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.getParams():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (72338238 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setClassName(java.lang.String):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (72338238 > 389804)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder setClassName(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (72338238 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setClassName(java.lang.String):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setClassName(java.lang.String):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-535909373 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setClassNameBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-535909373 < 0)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder setClassNameBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-535909373 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setClassNameBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setClassNameBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1482402232 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setName(java.lang.String):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1482402232 < 0)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder setName(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1482402232 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setName(java.lang.String):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setName(java.lang.String):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1510342984 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setNameBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1510342984 < 0)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder setNameBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1510342984 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setNameBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setNameBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (897212722 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setParams(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (897212722 > 389804)
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
            public gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder setParams(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (897212722 > 389804) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setParams(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder.setParams(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1645723046 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.<clinit>():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1645723046 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1645723046 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.<clinit>():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (758079379 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.<init>():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (758079379 > 408588)
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
        private ModuleInitParams() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (758079379 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.<init>():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (336125374 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$000():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (336125374 > 408588)
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
        public static /* synthetic */ gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (336125374 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$000():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$000():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2143021186 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$100(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, java.lang.String):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2143021186 > 408588)
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
        public static /* synthetic */ void access$100(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2143021186 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$100(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, java.lang.String):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$100(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-323893155 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$200(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-323893155 < 0)
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
        public static /* synthetic */ void access$200(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-323893155 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$200(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$200(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-778705440 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$300(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-778705440 < 0)
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
        public static /* synthetic */ void access$300(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-778705440 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$300(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$300(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1635333340 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$400(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1635333340 < 0)
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
        public static /* synthetic */ void access$400(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1635333340 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$400(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$400(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-819047911 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$500(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-819047911 < 0)
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
        public static /* synthetic */ void access$500(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-819047911 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$500(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$500(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (716961262 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$600(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, java.lang.String):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (716961262 > 408588)
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
        public static /* synthetic */ void access$600(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (716961262 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$600(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, java.lang.String):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$600(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2068859218 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$700(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2068859218 > 408588)
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
        public static /* synthetic */ void access$700(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2068859218 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$700(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$700(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1120609189 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$800(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1120609189 > 408588)
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
        public static /* synthetic */ void access$800(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1120609189 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$800(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.access$800(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (802393366 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearClassName():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (802393366 > 408588)
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
        private void clearClassName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (802393366 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearClassName():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearClassName():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1468072278 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearName():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1468072278 > 408588)
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
        private void clearName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1468072278 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearName():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearName():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (487971654 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearParams():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (487971654 > 408588)
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
        private void clearParams() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (487971654 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearParams():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.clearParams():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1161917822 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getDefaultInstance():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1161917822 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1161917822 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getDefaultInstance():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getDefaultInstance():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1623842508 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.newBuilder():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1623842508 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1623842508 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.newBuilder():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.newBuilder():gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-258195696 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.newBuilder(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-258195696 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.Builder newBuilder(gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-258195696 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.newBuilder(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.newBuilder(gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1939446928 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1939446928 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1939446928 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-783757370 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-783757370 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-783757370 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2099282988 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2099282988 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2099282988 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1734061572 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1734061572 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1734061572 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (46372749 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (46372749 > 408588)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (46372749 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1251530054 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1251530054 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1251530054 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1255425268 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.io.InputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1255425268 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1255425268 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.io.InputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.io.InputStream):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1941473658 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1941473658 > 408588)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1941473658 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1570325179 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1570325179 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1570325179 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-835800822 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-835800822 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-835800822 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-96424209 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(byte[]):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-96424209 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-96424209 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(byte[]):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(byte[]):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1724747922 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1724747922 < 0)
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
        public static gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1724747922 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1195678158 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parser():com.google.protobuf.Parser<gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams>, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1195678158 < 0)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1195678158 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parser():com.google.protobuf.Parser<gatewayprotocol.v1.ModuleInitParamsOuterClass$ModuleInitParams>, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2103519403 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setClassName(java.lang.String):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2103519403 > 408588)
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
        private void setClassName(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2103519403 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setClassName(java.lang.String):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setClassName(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1980239208 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setClassNameBytes(com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1980239208 > 408588)
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
        private void setClassNameBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1980239208 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setClassNameBytes(com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setClassNameBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1542183831 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setName(java.lang.String):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1542183831 > 408588)
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
        private void setName(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1542183831 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setName(java.lang.String):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setName(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1468884562 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setNameBytes(com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1468884562 < 0)
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
        private void setNameBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1468884562 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setNameBytes(com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setNameBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1934879787 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setParams(com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1934879787 > 408588)
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
        private void setParams(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1934879787 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setParams(com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.setParams(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1369705870 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1369705870 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1369705870 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1357951060 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getClassName():java.lang.String, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1357951060 < 0)
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
        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public java.lang.String getClassName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1357951060 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getClassName():java.lang.String, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getClassName():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (243703116 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getClassNameBytes():com.google.protobuf.ByteString, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (243703116 > 408588)
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
        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public com.google.protobuf.ByteString getClassNameBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (243703116 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getClassNameBytes():com.google.protobuf.ByteString, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getClassNameBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (136257313 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getName():java.lang.String, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (136257313 > 408588)
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
        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public java.lang.String getName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (136257313 > 408588) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getName():java.lang.String, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getName():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1054890486 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getNameBytes():com.google.protobuf.ByteString, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1054890486 < 0)
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
        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1054890486 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getNameBytes():com.google.protobuf.ByteString, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getNameBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1793822857 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getParams():com.google.protobuf.ByteString, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1793822857 < 0)
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
        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public com.google.protobuf.ByteString getParams() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1793822857 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getParams():com.google.protobuf.ByteString, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParams.getParams():com.google.protobuf.ByteString");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes6.dex */
    public interface ModuleInitParamsOrBuilder extends MessageLiteOrBuilder {
        String getClassName();

        ByteString getClassNameBytes();

        String getName();

        ByteString getNameBytes();

        ByteString getParams();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1888305520 > 360852) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.<init>():void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1888305520 > 360852)
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
    private ModuleInitParamsOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1888305520 > 360852) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.<init>():void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-654133558 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes42.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-654133558 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-654133558 < 0) in method: gatewayprotocol.v1.ModuleInitParamsOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes42.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.ModuleInitParamsOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

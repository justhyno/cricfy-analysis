package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;

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
/* loaded from: classes6.dex */
public final class InitializationCompletedEventRequestOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes15.dex */
    public static final class InitializationCompletedEventRequest extends GeneratedMessageLite<InitializationCompletedEventRequest, Builder> implements InitializationCompletedEventRequestOrBuilder {
        public static final int COHERENCE_ATTRIBUTES_FIELD_NUMBER = 3;
        private static final InitializationCompletedEventRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private static volatile Parser<InitializationCompletedEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private ByteString coherenceAttributes_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes37.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationCompletedEventRequest, Builder> implements InitializationCompletedEventRequestOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (110539474 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.<init>():void, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (110539474 > 381936)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (110539474 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.<init>():void, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1766226412 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.<init>(ff1):void, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1766226412 < 0)
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
            public /* synthetic */ Builder(p000.ff1 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1766226412 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.<init>(ff1):void, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.<init>(ff1):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1842942022 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearCoherenceAttributes():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1842942022 < 0)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder clearCoherenceAttributes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1842942022 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearCoherenceAttributes():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearCoherenceAttributes():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1455779453 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1455779453 < 0)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder clearDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1455779453 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (408608257 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (408608257 > 381936)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder clearStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (408608257 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1020519852 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getCoherenceAttributes():com.google.protobuf.ByteString, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1020519852 > 381936)
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
            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public com.google.protobuf.ByteString getCoherenceAttributes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1020519852 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getCoherenceAttributes():com.google.protobuf.ByteString, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getCoherenceAttributes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-384042022 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-384042022 < 0)
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
            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-384042022 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1280916471 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1280916471 < 0)
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
            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1280916471 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (622303672 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasCoherenceAttributes():boolean, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (622303672 > 381936)
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
            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public boolean hasCoherenceAttributes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (622303672 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasCoherenceAttributes():boolean, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasCoherenceAttributes():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1954409134 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasDynamicDeviceInfo():boolean, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1954409134 > 381936)
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
            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1954409134 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasDynamicDeviceInfo():boolean, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasDynamicDeviceInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2122400406 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasStaticDeviceInfo():boolean, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2122400406 > 381936)
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
            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2122400406 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasStaticDeviceInfo():boolean, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.hasStaticDeviceInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-729338612 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-729338612 < 0)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-729338612 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1320651098 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1320651098 > 381936)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1320651098 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1722336094 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setCoherenceAttributes(com.google.protobuf.ByteString):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1722336094 < 0)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder setCoherenceAttributes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1722336094 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setCoherenceAttributes(com.google.protobuf.ByteString):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setCoherenceAttributes(com.google.protobuf.ByteString):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2028819506 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2028819506 < 0)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2028819506 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1413227210 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1413227210 < 0)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1413227210 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1434494718 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1434494718 > 381936)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1434494718 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1562983490 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1562983490 > 381936)
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
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1562983490 > 381936) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes37.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (963382118 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.<clinit>():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (963382118 > 493412)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (963382118 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.<clinit>():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (684577412 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.<init>():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (684577412 > 493412)
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
        private InitializationCompletedEventRequest() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (684577412 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.<init>():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (496675422 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$000():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (496675422 > 493412)
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
        public static /* synthetic */ gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (496675422 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$000():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$000():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1484420704 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$100(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1484420704 < 0)
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
        public static /* synthetic */ void access$100(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1484420704 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$100(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$100(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1660725086 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$200(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1660725086 > 493412)
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
        public static /* synthetic */ void access$200(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1660725086 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$200(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$200(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2119217684 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$300(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2119217684 < 0)
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
        public static /* synthetic */ void access$300(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2119217684 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$300(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$300(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2028145750 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$400(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2028145750 < 0)
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
        public static /* synthetic */ void access$400(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2028145750 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$400(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$400(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1026425638 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$500(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1026425638 > 493412)
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
        public static /* synthetic */ void access$500(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1026425638 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$500(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$500(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1859167474 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$600(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1859167474 < 0)
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
        public static /* synthetic */ void access$600(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1859167474 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$600(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$600(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1748925502 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$700(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1748925502 < 0)
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
        public static /* synthetic */ void access$700(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1748925502 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$700(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$700(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (519371456 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$800(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (519371456 > 493412)
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
        public static /* synthetic */ void access$800(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (519371456 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$800(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.access$800(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-657417940 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearCoherenceAttributes():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-657417940 < 0)
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
        private void clearCoherenceAttributes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-657417940 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearCoherenceAttributes():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearCoherenceAttributes():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1109314560 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearDynamicDeviceInfo():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1109314560 < 0)
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
        private void clearDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1109314560 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearDynamicDeviceInfo():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearDynamicDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2118783426 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearStaticDeviceInfo():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2118783426 > 493412)
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
        private void clearStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2118783426 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearStaticDeviceInfo():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.clearStaticDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-316769398 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-316769398 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-316769398 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-386716238 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-386716238 < 0)
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
        private void mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-386716238 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (364892972 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (364892972 > 493412)
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
        private void mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (364892972 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2102713412 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2102713412 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2102713412 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-914005546 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-914005546 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder newBuilder(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-914005546 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-993972284 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-993972284 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-993972284 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (198889010 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (198889010 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (198889010 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-905396248 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-905396248 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-905396248 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (318949870 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (318949870 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (318949870 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1050079876 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1050079876 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1050079876 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1918119342 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1918119342 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1918119342 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (538280836 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (538280836 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (538280836 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-280544286 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-280544286 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-280544286 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (515630448 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (515630448 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (515630448 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1293939950 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1293939950 < 0)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1293939950 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1336033450 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(byte[]):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1336033450 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1336033450 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(byte[]):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(byte[]):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2071457799 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2071457799 > 493412)
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
        public static gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2071457799 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (277239828 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parser():com.google.protobuf.Parser<gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest>, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (277239828 > 493412)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (277239828 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parser():com.google.protobuf.Parser<gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest>, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-751016518 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setCoherenceAttributes(com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-751016518 < 0)
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
        private void setCoherenceAttributes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-751016518 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setCoherenceAttributes(com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setCoherenceAttributes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-354152790 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-354152790 < 0)
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
        private void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-354152790 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (234068412 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (234068412 > 493412)
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
        private void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (234068412 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1311708294 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1311708294 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1311708294 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1698032679 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getCoherenceAttributes():com.google.protobuf.ByteString, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1698032679 < 0)
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
        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public com.google.protobuf.ByteString getCoherenceAttributes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1698032679 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getCoherenceAttributes():com.google.protobuf.ByteString, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getCoherenceAttributes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-620783003 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-620783003 < 0)
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
        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-620783003 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (698144486 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (698144486 > 493412)
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
        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (698144486 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (392937930 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasCoherenceAttributes():boolean, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (392937930 > 493412)
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
        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public boolean hasCoherenceAttributes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (392937930 > 493412) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasCoherenceAttributes():boolean, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasCoherenceAttributes():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1773448629 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasDynamicDeviceInfo():boolean, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1773448629 < 0)
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
        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1773448629 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasDynamicDeviceInfo():boolean, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasDynamicDeviceInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-606172518 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasStaticDeviceInfo():boolean, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-606172518 < 0)
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
        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-606172518 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasStaticDeviceInfo():boolean, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.hasStaticDeviceInfo():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes12.dex */
    public interface InitializationCompletedEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getCoherenceAttributes();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasCoherenceAttributes();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1207625952 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.<init>():void, file: classes6.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1207625952 < 0)
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
    private InitializationCompletedEventRequestOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1207625952 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.<init>():void, file: classes6.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-858596332 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes6.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-858596332 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-858596332 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes6.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

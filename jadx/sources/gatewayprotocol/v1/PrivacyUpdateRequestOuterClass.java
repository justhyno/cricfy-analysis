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
/* loaded from: classes35.dex */
public final class PrivacyUpdateRequestOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes23.dex */
    public static final class PrivacyUpdateRequest extends GeneratedMessageLite<PrivacyUpdateRequest, Builder> implements PrivacyUpdateRequestOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final PrivacyUpdateRequest DEFAULT_INSTANCE = null;
        private static volatile Parser<PrivacyUpdateRequest> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString content_;
        private int version_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes22.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<PrivacyUpdateRequest, Builder> implements PrivacyUpdateRequestOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (485668400 > 384920) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.<init>():void, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (485668400 > 384920)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (485668400 > 384920) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.<init>():void, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1600333524 > 384920) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.<init>(br2):void, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1600333524 > 384920)
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
            public /* synthetic */ Builder(p000.br2 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1600333524 > 384920) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.<init>(br2):void, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.<init>(br2):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-251828758 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.clearContent():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-251828758 < 0)
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
            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder clearContent() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-251828758 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.clearContent():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.clearContent():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1790260741 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.clearVersion():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1790260741 < 0)
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
            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder clearVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1790260741 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.clearVersion():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.clearVersion():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1681342049 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.getContent():com.google.protobuf.ByteString, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1681342049 < 0)
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
            @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
            public com.google.protobuf.ByteString getContent() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1681342049 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.getContent():com.google.protobuf.ByteString, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.getContent():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-132965126 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.getVersion():int, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-132965126 < 0)
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
            @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
            public int getVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-132965126 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.getVersion():int, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.getVersion():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2093498404 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.setContent(com.google.protobuf.ByteString):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2093498404 < 0)
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
            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder setContent(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2093498404 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.setContent(com.google.protobuf.ByteString):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.setContent(com.google.protobuf.ByteString):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1911044246 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.setVersion(int):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1911044246 < 0)
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
            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder setVersion(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1911044246 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.setVersion(int):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder.setVersion(int):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1130600642 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.<clinit>():void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1130600642 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1130600642 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.<clinit>():void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-491505798 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.<init>():void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-491505798 < 0)
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
        private PrivacyUpdateRequest() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-491505798 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.<init>():void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1961471579 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$000():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1961471579 > 406240)
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
        public static /* synthetic */ gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1961471579 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$000():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$000():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-464225904 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$100(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, int):void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-464225904 < 0)
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
        public static /* synthetic */ void access$100(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-464225904 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$100(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, int):void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$100(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2047098882 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$200(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2047098882 < 0)
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
        public static /* synthetic */ void access$200(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2047098882 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$200(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$200(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2146084949 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$300(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, com.google.protobuf.ByteString):void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2146084949 > 406240)
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
        public static /* synthetic */ void access$300(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2146084949 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$300(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, com.google.protobuf.ByteString):void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$300(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1869118110 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$400(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1869118110 > 406240)
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
        public static /* synthetic */ void access$400(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1869118110 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$400(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.access$400(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-575794242 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.clearContent():void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-575794242 < 0)
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
        private void clearContent() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-575794242 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.clearContent():void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.clearContent():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1227828941 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.clearVersion():void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1227828941 > 406240)
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
        private void clearVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1227828941 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.clearVersion():void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.clearVersion():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-932660158 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-932660158 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-932660158 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1885524005 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1885524005 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1885524005 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder():gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-812144226 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-812144226 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-812144226 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1309334637 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1309334637 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1309334637 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2044189453 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2044189453 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2044189453 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1235756566 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1235756566 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1235756566 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1444340414 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1444340414 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1444340414 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1160611058 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1160611058 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1160611058 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (793560428 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (793560428 > 406240)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (793560428 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (712451764 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (712451764 > 406240)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (712451764 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1961801578 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1961801578 > 406240)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1961801578 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1717833790 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1717833790 > 406240)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1717833790 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (227253336 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (227253336 > 406240)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (227253336 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1718461814 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(byte[]):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1718461814 < 0)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1718461814 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(byte[]):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(byte[]):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (57645911 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (57645911 > 406240)
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
        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (57645911 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1740537426 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parser():com.google.protobuf.Parser<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest>, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1740537426 < 0)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1740537426 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parser():com.google.protobuf.Parser<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest>, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1225921761 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.setContent(com.google.protobuf.ByteString):void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1225921761 < 0)
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
        private void setContent(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1225921761 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.setContent(com.google.protobuf.ByteString):void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.setContent(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (490668665 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.setVersion(int):void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (490668665 > 406240)
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
        private void setVersion(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (490668665 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.setVersion(int):void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.setVersion(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-829954562 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-829954562 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-829954562 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1943499398 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getContent():com.google.protobuf.ByteString, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1943499398 < 0)
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
        @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
        public com.google.protobuf.ByteString getContent() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1943499398 < 0) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getContent():com.google.protobuf.ByteString, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getContent():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (99909561 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getVersion():int, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (99909561 > 406240)
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
        @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
        public int getVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (99909561 > 406240) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getVersion():int, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getVersion():int");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes27.dex */
    public interface PrivacyUpdateRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getContent();

        int getVersion();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1670897038 > 383276) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.<init>():void, file: classes35.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1670897038 > 383276)
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
    private PrivacyUpdateRequestOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1670897038 > 383276) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.<init>():void, file: classes35.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1838170 > 383276) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes35.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1838170 > 383276)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1838170 > 383276) in method: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes35.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

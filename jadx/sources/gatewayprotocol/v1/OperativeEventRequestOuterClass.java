package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
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
/* loaded from: classes50.dex */
public final class OperativeEventRequestOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes6.dex */
    public static final class OperativeEventErrorData extends GeneratedMessageLite<OperativeEventErrorData, Builder> implements OperativeEventErrorDataOrBuilder {
        private static final OperativeEventErrorData DEFAULT_INSTANCE = null;
        public static final int ERROR_TOKEN_FIELD_NUMBER = 3;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<OperativeEventErrorData> PARSER;
        private int bitField0_;
        private ByteString errorToken_;
        private int errorType_;
        private String message_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes45.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<OperativeEventErrorData, Builder> implements OperativeEventErrorDataOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (57438521 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.<init>():void, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (57438521 > 376640)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (57438521 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.<init>():void, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (594824228 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.<init>(xi2):void, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (594824228 > 376640)
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
            public /* synthetic */ Builder(p000.xi2 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (594824228 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.<init>(xi2):void, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.<init>(xi2):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (201092138 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearErrorToken():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (201092138 > 376640)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder clearErrorToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (201092138 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearErrorToken():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearErrorToken():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-647118234 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-647118234 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder clearErrorType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-647118234 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (854266966 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearMessage():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (854266966 > 376640)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder clearMessage() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (854266966 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearMessage():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.clearMessage():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-441321654 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorToken():com.google.protobuf.ByteString, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-441321654 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public com.google.protobuf.ByteString getErrorToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-441321654 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorToken():com.google.protobuf.ByteString, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorToken():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1288449560 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1288449560 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1288449560 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1142912650 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorTypeValue():int, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1142912650 > 376640)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public int getErrorTypeValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1142912650 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorTypeValue():int, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getErrorTypeValue():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1080532506 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getMessage():java.lang.String, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1080532506 > 376640)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public java.lang.String getMessage() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1080532506 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getMessage():java.lang.String, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getMessage():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-582068678 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getMessageBytes():com.google.protobuf.ByteString, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-582068678 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public com.google.protobuf.ByteString getMessageBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-582068678 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getMessageBytes():com.google.protobuf.ByteString, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.getMessageBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1831607172 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.hasErrorToken():boolean, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1831607172 > 376640)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public boolean hasErrorToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1831607172 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.hasErrorToken():boolean, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.hasErrorToken():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1911639804 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorToken(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1911639804 > 376640)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setErrorToken(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1911639804 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorToken(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorToken(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1069023496 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1069023496 > 376640)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1069023496 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1149346222 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorTypeValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1149346222 > 376640)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setErrorTypeValue(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1149346222 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorTypeValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setErrorTypeValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1930115908 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setMessage(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1930115908 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setMessage(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1930115908 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setMessage(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setMessage(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (222516881 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setMessageBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (222516881 > 376640)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setMessageBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (222516881 > 376640) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setMessageBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes45.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder.setMessageBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1735344848 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.<clinit>():void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1735344848 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1735344848 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.<clinit>():void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1861866977 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.<init>():void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1861866977 < 0)
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
        private OperativeEventErrorData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1861866977 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.<init>():void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (949516258 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$000():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (949516258 > 376096)
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
        public static /* synthetic */ gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (949516258 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$000():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$000():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1898942638 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, int):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1898942638 < 0)
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
        public static /* synthetic */ void access$100(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1898942638 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, int):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1946841764 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1946841764 > 376096)
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
        public static /* synthetic */ void access$200(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1946841764 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (548279874 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (548279874 > 376096)
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
        public static /* synthetic */ void access$300(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (548279874 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1838322154 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, java.lang.String):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1838322154 > 376096)
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
        public static /* synthetic */ void access$400(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1838322154 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, java.lang.String):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1025726174 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1025726174 > 376096)
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
        public static /* synthetic */ void access$500(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1025726174 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2101928770 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, com.google.protobuf.ByteString):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2101928770 > 376096)
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
        public static /* synthetic */ void access$600(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2101928770 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, com.google.protobuf.ByteString):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1194343424 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, com.google.protobuf.ByteString):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1194343424 < 0)
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
        public static /* synthetic */ void access$700(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1194343424 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, com.google.protobuf.ByteString):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1013968250 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1013968250 < 0)
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
        public static /* synthetic */ void access$800(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1013968250 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.access$800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-690310840 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearErrorToken():void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-690310840 < 0)
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
        private void clearErrorToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-690310840 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearErrorToken():void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearErrorToken():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1789898854 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearErrorType():void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1789898854 < 0)
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
        private void clearErrorType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1789898854 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearErrorType():void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearErrorType():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1257213908 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearMessage():void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1257213908 > 376096)
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
        private void clearMessage() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1257213908 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearMessage():void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.clearMessage():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-449160032 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getDefaultInstance():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-449160032 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-449160032 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getDefaultInstance():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getDefaultInstance():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (62678351 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (62678351 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (62678351 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1413857069 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1413857069 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1413857069 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (955173362 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (955173362 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (955173362 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1649876503 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1649876503 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1649876503 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1895680596 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1895680596 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1895680596 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1977765578 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1977765578 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1977765578 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-471496158 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-471496158 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-471496158 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2105939196 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2105939196 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2105939196 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-214721665 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-214721665 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-214721665 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-34373488 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-34373488 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-34373488 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1459053170 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1459053170 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1459053170 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2103167625 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2103167625 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2103167625 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1244208271 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(byte[]):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1244208271 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1244208271 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(byte[]):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(byte[]):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (89558490 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (89558490 > 376096)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (89558490 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1217463773 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parser():com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData>, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1217463773 < 0)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1217463773 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parser():com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData>, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (752057230 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorToken(com.google.protobuf.ByteString):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (752057230 > 376096)
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
        private void setErrorToken(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (752057230 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorToken(com.google.protobuf.ByteString):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorToken(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1706905530 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1706905530 < 0)
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
        private void setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1706905530 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1855477175 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorTypeValue(int):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1855477175 > 376096)
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
        private void setErrorTypeValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1855477175 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorTypeValue(int):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setErrorTypeValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1227003972 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setMessage(java.lang.String):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1227003972 < 0)
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
        private void setMessage(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1227003972 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setMessage(java.lang.String):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setMessage(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-397483297 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setMessageBytes(com.google.protobuf.ByteString):void, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-397483297 < 0)
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
        private void setMessageBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-397483297 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setMessageBytes(com.google.protobuf.ByteString):void, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.setMessageBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1745437224 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1745437224 > 376096)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1745437224 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1587011456 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorToken():com.google.protobuf.ByteString, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1587011456 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public com.google.protobuf.ByteString getErrorToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1587011456 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorToken():com.google.protobuf.ByteString, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorToken():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1125921457 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1125921457 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1125921457 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1293792806 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorTypeValue():int, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1293792806 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public int getErrorTypeValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1293792806 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorTypeValue():int, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getErrorTypeValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (627391778 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getMessage():java.lang.String, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (627391778 > 376096)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public java.lang.String getMessage() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (627391778 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getMessage():java.lang.String, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getMessage():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (93641480 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getMessageBytes():com.google.protobuf.ByteString, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (93641480 > 376096)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public com.google.protobuf.ByteString getMessageBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (93641480 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getMessageBytes():com.google.protobuf.ByteString, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.getMessageBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (410177814 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.hasErrorToken():boolean, file: classes6.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (410177814 > 376096)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public boolean hasErrorToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (410177814 > 376096) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.hasErrorToken():boolean, file: classes6.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.hasErrorToken():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes28.dex */
    public interface OperativeEventErrorDataOrBuilder extends MessageLiteOrBuilder {
        ByteString getErrorToken();

        OperativeEventErrorType getErrorType();

        int getErrorTypeValue();

        String getMessage();

        ByteString getMessageBytes();

        boolean hasErrorToken();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes20.dex */
    public static final class OperativeEventErrorType implements Internal.EnumLite {
        private static final /* synthetic */ OperativeEventErrorType[] $VALUES = null;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER_VALUE = 7;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING_VALUE = 4;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED_VALUE = 6;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_EXPIRED = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_EXPIRED_VALUE = 3;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_GATEWAY = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_GATEWAY_VALUE = 2;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP_VALUE = 5;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT_VALUE = 1;
        public static final OperativeEventErrorType OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED = null;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED_VALUE = 0;
        public static final OperativeEventErrorType UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<OperativeEventErrorType> internalValueMap = null;
        private final int value;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (356213928 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.$values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType[], file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (356213928 > 368420)
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
        private static /* synthetic */ gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType[] $values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (356213928 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.$values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType[], file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.$values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (634903154 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.<clinit>():void, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (634903154 > 368420)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (634903154 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.<clinit>():void, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-325808188 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.<init>(java.lang.String, int, int):void, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-325808188 < 0)
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
        private OperativeEventErrorType(java.lang.String r1, int r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-325808188 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.<init>(java.lang.String, int, int):void, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.<init>(java.lang.String, int, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1549628038 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1549628038 > 368420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType forNumber(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1549628038 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (658208422 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType>, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (658208422 > 368420)
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
        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType> internalGetValueMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (658208422 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType>, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1388004693 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1388004693 > 368420)
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
        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1388004693 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-496779244 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.valueOf(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-496779244 < 0)
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
        @java.lang.Deprecated
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType valueOf(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-496779244 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.valueOf(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.valueOf(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1876376645 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.valueOf(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1876376645 > 368420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType valueOf(java.lang.String r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1876376645 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.valueOf(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.valueOf(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1341576022 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType[], file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1341576022 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType[] values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1341576022 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType[], file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (93068795 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.getNumber():int, file: classes20.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (93068795 > 368420)
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
        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (93068795 > 368420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.getNumber():int, file: classes20.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.getNumber():int");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes36.dex */
    public static final class OperativeEventRequest extends GeneratedMessageLite<OperativeEventRequest, Builder> implements OperativeEventRequestOrBuilder {
        public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
        public static final int AD_FORMAT_FIELD_NUMBER = 11;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        private static final OperativeEventRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
        private static volatile Parser<OperativeEventRequest> PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
        public static final int SID_FIELD_NUMBER = 6;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
        private int adFormat_;
        private ByteString additionalData_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_;
        private int eventType_;
        private ByteString impressionOpportunityId_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private String sid_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString trackingToken_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<OperativeEventRequest, Builder> implements OperativeEventRequestOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (167770896 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.<init>():void, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (167770896 > 464228)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (167770896 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.<init>():void, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1071469154 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.<init>(xi2):void, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1071469154 < 0)
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
            public /* synthetic */ Builder(p000.xi2 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1071469154 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.<init>(xi2):void, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.<init>(xi2):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2122775718 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearAdFormat():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2122775718 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearAdFormat() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2122775718 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearAdFormat():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearAdFormat():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (987621692 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearAdditionalData():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (987621692 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearAdditionalData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (987621692 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearAdditionalData():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearAdditionalData():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1095820515 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearCampaignState():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1095820515 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearCampaignState() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1095820515 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearCampaignState():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearCampaignState():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (844251038 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (844251038 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (844251038 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1581447872 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearEventId():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1581447872 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearEventId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1581447872 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearEventId():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearEventId():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1250589680 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1250589680 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearEventType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1250589680 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1425094174 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearImpressionOpportunityId():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1425094174 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearImpressionOpportunityId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1425094174 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearImpressionOpportunityId():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearImpressionOpportunityId():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1168463118 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearSessionCounters():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1168463118 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearSessionCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1168463118 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearSessionCounters():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearSessionCounters():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2146126932 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearSid():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2146126932 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearSid() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2146126932 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearSid():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearSid():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (753017370 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (753017370 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (753017370 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-8543970 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearTrackingToken():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-8543970 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearTrackingToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-8543970 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearTrackingToken():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.clearTrackingToken():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (302701217 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (302701217 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (302701217 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1646600714 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdFormatValue():int, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1646600714 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public int getAdFormatValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1646600714 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdFormatValue():int, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdFormatValue():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-902785158 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdditionalData():com.google.protobuf.ByteString, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-902785158 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getAdditionalData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-902785158 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdditionalData():com.google.protobuf.ByteString, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getAdditionalData():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1727371642 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1727371642 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1727371642 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1005138357 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1005138357 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1005138357 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (6539067 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventId():com.google.protobuf.ByteString, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (6539067 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getEventId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (6539067 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventId():com.google.protobuf.ByteString, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventId():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1170567272 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1170567272 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType getEventType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1170567272 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1637913774 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventTypeValue():int, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1637913774 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public int getEventTypeValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1637913774 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventTypeValue():int, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getEventTypeValue():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1735264056 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1735264056 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1735264056 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getImpressionOpportunityId():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2059453498 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2059453498 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2059453498 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (272151105 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSid():java.lang.String, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (272151105 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public java.lang.String getSid() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (272151105 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSid():java.lang.String, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSid():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-42668441 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSidBytes():com.google.protobuf.ByteString, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-42668441 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getSidBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-42668441 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSidBytes():com.google.protobuf.ByteString, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getSidBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-362147474 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-362147474 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-362147474 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1173279214 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getTrackingToken():com.google.protobuf.ByteString, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1173279214 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getTrackingToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1173279214 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getTrackingToken():com.google.protobuf.ByteString, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.getTrackingToken():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (602648715 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasAdFormat():boolean, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (602648715 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasAdFormat() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (602648715 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasAdFormat():boolean, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasAdFormat():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-171079700 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasCampaignState():boolean, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-171079700 < 0)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasCampaignState() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-171079700 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasCampaignState():boolean, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasCampaignState():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (875758388 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasDynamicDeviceInfo():boolean, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (875758388 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (875758388 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasDynamicDeviceInfo():boolean, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasDynamicDeviceInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (296404905 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasSessionCounters():boolean, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (296404905 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasSessionCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (296404905 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasSessionCounters():boolean, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasSessionCounters():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (669596749 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasStaticDeviceInfo():boolean, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (669596749 > 464228)
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
            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (669596749 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasStaticDeviceInfo():boolean, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.hasStaticDeviceInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1438881342 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1438881342 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1438881342 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2084996081 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2084996081 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2084996081 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1015012625 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1015012625 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1015012625 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (501200220 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (501200220 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (501200220 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1810182176 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1810182176 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setAdFormat(gatewayprotocol.v1.AdFormatOuterClass.AdFormat r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1810182176 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (768655754 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdFormatValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (768655754 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setAdFormatValue(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (768655754 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdFormatValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdFormatValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1091204497 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdditionalData(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1091204497 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setAdditionalData(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1091204497 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdditionalData(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setAdditionalData(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1235827214 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1235827214 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1235827214 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1334654686 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1334654686 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1334654686 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (628690786 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (628690786 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (628690786 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-581030300 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-581030300 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-581030300 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1266374338 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventId(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1266374338 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventId(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1266374338 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventId(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventId(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1929089214 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1929089214 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1929089214 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1768406302 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventTypeValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1768406302 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventTypeValue(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1768406302 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventTypeValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setEventTypeValue(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (660663630 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setImpressionOpportunityId(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (660663630 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setImpressionOpportunityId(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (660663630 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setImpressionOpportunityId(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setImpressionOpportunityId(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-393901370 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-393901370 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-393901370 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-667694002 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-667694002 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-667694002 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1932100262 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSid(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1932100262 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSid(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1932100262 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSid(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSid(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1321310684 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSidBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1321310684 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSidBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1321310684 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSidBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setSidBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1671657286 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1671657286 < 0)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1671657286 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (632090276 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (632090276 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (632090276 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (254598750 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setTrackingToken(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (254598750 > 464228)
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
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setTrackingToken(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (254598750 > 464228) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setTrackingToken(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder.setTrackingToken(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (594836304 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.<clinit>():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (594836304 > 411420)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (594836304 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.<clinit>():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1493290408 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.<init>():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1493290408 < 0)
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
        private OperativeEventRequest() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1493290408 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.<init>():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (694480399 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1000():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (694480399 > 411420)
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
        public static /* synthetic */ gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest access$1000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (694480399 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1000():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1000():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1294662576 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1294662576 < 0)
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
        public static /* synthetic */ void access$1100(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1294662576 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (626848115 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (626848115 > 411420)
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
        public static /* synthetic */ void access$1200(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (626848115 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1499281040 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, int):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1499281040 > 411420)
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
        public static /* synthetic */ void access$1300(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1499281040 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, int):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1476515525 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1476515525 < 0)
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
        public static /* synthetic */ void access$1400(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1476515525 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1383365160 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1383365160 > 411420)
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
        public static /* synthetic */ void access$1500(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1383365160 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-59727280 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-59727280 < 0)
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
        public static /* synthetic */ void access$1600(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-59727280 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2000355314 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2000355314 > 411420)
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
        public static /* synthetic */ void access$1700(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2000355314 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-834693505 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-834693505 < 0)
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
        public static /* synthetic */ void access$1800(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-834693505 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1938895196 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1938895196 < 0)
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
        public static /* synthetic */ void access$1900(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1938895196 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$1900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1248185787 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2000(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1248185787 > 411420)
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
        public static /* synthetic */ void access$2000(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1248185787 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2000(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2000(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (811125883 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (811125883 > 411420)
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
        public static /* synthetic */ void access$2100(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (811125883 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-929016362 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, java.lang.String):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-929016362 < 0)
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
        public static /* synthetic */ void access$2200(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-929016362 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, java.lang.String):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1330776170 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1330776170 < 0)
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
        public static /* synthetic */ void access$2300(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1330776170 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1783856972 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1783856972 < 0)
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
        public static /* synthetic */ void access$2400(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1783856972 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (934782969 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (934782969 > 411420)
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
        public static /* synthetic */ void access$2500(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (934782969 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (954785078 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (954785078 > 411420)
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
        public static /* synthetic */ void access$2600(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (954785078 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (799412978 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (799412978 > 411420)
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
        public static /* synthetic */ void access$2700(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (799412978 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1688149687 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1688149687 < 0)
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
        public static /* synthetic */ void access$2800(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1688149687 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1559578442 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1559578442 > 411420)
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
        public static /* synthetic */ void access$2900(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1559578442 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$2900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-702485397 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3000(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-702485397 < 0)
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
        public static /* synthetic */ void access$3000(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-702485397 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3000(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3000(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2033842277 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2033842277 > 411420)
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
        public static /* synthetic */ void access$3100(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2033842277 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3100(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1647807274 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1647807274 > 411420)
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
        public static /* synthetic */ void access$3200(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1647807274 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3200(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-213341076 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-213341076 < 0)
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
        public static /* synthetic */ void access$3300(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-213341076 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3300(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1769198034 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1769198034 > 411420)
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
        public static /* synthetic */ void access$3400(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1769198034 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3400(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1297123708 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1297123708 > 411420)
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
        public static /* synthetic */ void access$3500(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1297123708 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3500(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-355719231 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-355719231 < 0)
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
        public static /* synthetic */ void access$3600(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-355719231 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3600(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1040058660 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, int):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1040058660 < 0)
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
        public static /* synthetic */ void access$3700(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1040058660 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, int):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3700(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (316481445 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (316481445 > 411420)
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
        public static /* synthetic */ void access$3800(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (316481445 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3800(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2074661629 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2074661629 > 411420)
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
        public static /* synthetic */ void access$3900(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2074661629 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.access$3900(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1983461440 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearAdFormat():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1983461440 < 0)
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
        private void clearAdFormat() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1983461440 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearAdFormat():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearAdFormat():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1631007618 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearAdditionalData():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1631007618 > 411420)
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
        private void clearAdditionalData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1631007618 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearAdditionalData():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearAdditionalData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-822200076 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearCampaignState():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-822200076 < 0)
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
        private void clearCampaignState() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-822200076 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearCampaignState():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearCampaignState():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-57932511 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearDynamicDeviceInfo():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-57932511 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-57932511 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearDynamicDeviceInfo():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearDynamicDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1693506156 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearEventId():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1693506156 < 0)
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
        private void clearEventId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1693506156 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearEventId():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearEventId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (84954676 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearEventType():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (84954676 > 411420)
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
        private void clearEventType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (84954676 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearEventType():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearEventType():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1567000274 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearImpressionOpportunityId():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1567000274 < 0)
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
        private void clearImpressionOpportunityId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1567000274 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearImpressionOpportunityId():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearImpressionOpportunityId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1158051437 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearSessionCounters():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1158051437 < 0)
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
        private void clearSessionCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1158051437 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearSessionCounters():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearSessionCounters():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (883487690 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearSid():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (883487690 > 411420)
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
        private void clearSid() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (883487690 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearSid():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearSid():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-359383998 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearStaticDeviceInfo():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-359383998 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-359383998 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearStaticDeviceInfo():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearStaticDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (369115650 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearTrackingToken():void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (369115650 > 411420)
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
        private void clearTrackingToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (369115650 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearTrackingToken():void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.clearTrackingToken():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2077957566 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2077957566 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2077957566 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1970760152 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1970760152 > 411420)
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
        private void mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1970760152 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2053909806 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2053909806 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2053909806 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1591811568 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1591811568 > 411420)
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
        private void mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1591811568 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-47553690 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-47553690 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-47553690 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (15913731 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (15913731 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (15913731 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2142905784 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2142905784 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2142905784 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1995787240 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1995787240 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1995787240 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-692611263 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-692611263 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-692611263 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1475699006 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1475699006 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1475699006 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1635734630 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1635734630 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1635734630 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2106614384 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2106614384 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2106614384 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1949615889 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1949615889 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1949615889 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1391475643 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1391475643 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1391475643 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.io.InputStream):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2100344830 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2100344830 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2100344830 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (538444258 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (538444258 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (538444258 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1894796106 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1894796106 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1894796106 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (343300002 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(byte[]):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (343300002 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (343300002 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(byte[]):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(byte[]):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (164052198 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (164052198 > 411420)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (164052198 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-133590754 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parser():com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest>, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-133590754 < 0)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-133590754 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parser():com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest>, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1138434050 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1138434050 > 411420)
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
        private void setAdFormat(gatewayprotocol.v1.AdFormatOuterClass.AdFormat r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1138434050 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1187099410 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdFormatValue(int):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1187099410 < 0)
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
        private void setAdFormatValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1187099410 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdFormatValue(int):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdFormatValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1093495180 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdditionalData(com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1093495180 > 411420)
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
        private void setAdditionalData(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1093495180 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdditionalData(com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setAdditionalData(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1380269129 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1380269129 < 0)
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
        private void setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1380269129 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1842646427 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1842646427 > 411420)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1842646427 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (79254794 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventId(com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (79254794 > 411420)
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
        private void setEventId(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (79254794 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventId(com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventId(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1721200011 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1721200011 < 0)
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
        private void setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1721200011 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (508356938 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventTypeValue(int):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (508356938 > 411420)
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
        private void setEventTypeValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (508356938 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventTypeValue(int):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setEventTypeValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (610672210 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setImpressionOpportunityId(com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (610672210 > 411420)
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
        private void setImpressionOpportunityId(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (610672210 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setImpressionOpportunityId(com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setImpressionOpportunityId(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1983354822 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1983354822 > 411420)
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
        private void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1983354822 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1897580356 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSid(java.lang.String):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1897580356 < 0)
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
        private void setSid(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1897580356 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSid(java.lang.String):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSid(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-71712354 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSidBytes(com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-71712354 < 0)
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
        private void setSidBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-71712354 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSidBytes(com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setSidBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1747981814 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1747981814 > 411420)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1747981814 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-694911578 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setTrackingToken(com.google.protobuf.ByteString):void, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-694911578 < 0)
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
        private void setTrackingToken(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-694911578 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setTrackingToken(com.google.protobuf.ByteString):void, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.setTrackingToken(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1939108106 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1939108106 > 411420)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1939108106 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1554096144 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1554096144 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1554096144 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2051647294 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdFormatValue():int, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2051647294 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public int getAdFormatValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2051647294 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdFormatValue():int, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdFormatValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1242758130 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdditionalData():com.google.protobuf.ByteString, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1242758130 > 411420)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getAdditionalData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1242758130 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdditionalData():com.google.protobuf.ByteString, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getAdditionalData():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-404541766 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-404541766 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-404541766 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1287889656 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1287889656 > 411420)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1287889656 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1710536356 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventId():com.google.protobuf.ByteString, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1710536356 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getEventId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1710536356 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventId():com.google.protobuf.ByteString, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventId():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (58465630 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (58465630 > 411420)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType getEventType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (58465630 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventType():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-603994903 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventTypeValue():int, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-603994903 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public int getEventTypeValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-603994903 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventTypeValue():int, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getEventTypeValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (774672034 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (774672034 > 411420)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getImpressionOpportunityId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (774672034 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getImpressionOpportunityId():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: ArrayIndexOutOfBoundsException: Index -124842 out of bounds for length 35 in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.ArrayIndexOutOfBoundsException: Index -124842 out of bounds for length 35
            	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:58)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:86)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
            /*
            // Can't load method instructions: Load method exception: ArrayIndexOutOfBoundsException: Index -124842 out of bounds for length 35 in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1499985650 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSid():java.lang.String, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1499985650 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public java.lang.String getSid() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1499985650 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSid():java.lang.String, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSid():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1322727378 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSidBytes():com.google.protobuf.ByteString, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1322727378 > 411420)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getSidBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1322727378 > 411420) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSidBytes():com.google.protobuf.ByteString, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getSidBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-466997457 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-466997457 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-466997457 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-531612502 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getTrackingToken():com.google.protobuf.ByteString, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-531612502 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getTrackingToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-531612502 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getTrackingToken():com.google.protobuf.ByteString, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getTrackingToken():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1665587488 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasAdFormat():boolean, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1665587488 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasAdFormat() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1665587488 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasAdFormat():boolean, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasAdFormat():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-904979577 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasCampaignState():boolean, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-904979577 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasCampaignState() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-904979577 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasCampaignState():boolean, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasCampaignState():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-31522566 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasDynamicDeviceInfo():boolean, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-31522566 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-31522566 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasDynamicDeviceInfo():boolean, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasDynamicDeviceInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1656063657 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasSessionCounters():boolean, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1656063657 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasSessionCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1656063657 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasSessionCounters():boolean, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasSessionCounters():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1490747030 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasStaticDeviceInfo():boolean, file: classes36.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1490747030 < 0)
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
        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1490747030 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasStaticDeviceInfo():boolean, file: classes36.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.hasStaticDeviceInfo():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes22.dex */
    public interface OperativeEventRequestOrBuilder extends MessageLiteOrBuilder {
        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getAdditionalData();

        CampaignStateOuterClass.CampaignState getCampaignState();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getEventId();

        OperativeEventType getEventType();

        int getEventTypeValue();

        ByteString getImpressionOpportunityId();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        String getSid();

        ByteString getSidBytes();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTrackingToken();

        boolean hasAdFormat();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes28.dex */
    public static final class OperativeEventType implements Internal.EnumLite {
        private static final /* synthetic */ OperativeEventType[] $VALUES = null;
        public static final OperativeEventType OPERATIVE_EVENT_TYPE_LOAD_ERROR = null;
        public static final int OPERATIVE_EVENT_TYPE_LOAD_ERROR_VALUE = 2;
        public static final OperativeEventType OPERATIVE_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY = null;
        public static final int OPERATIVE_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE = 5;
        public static final OperativeEventType OPERATIVE_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL = null;
        public static final int OPERATIVE_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE = 4;
        public static final OperativeEventType OPERATIVE_EVENT_TYPE_SHOW_ERROR = null;
        public static final int OPERATIVE_EVENT_TYPE_SHOW_ERROR_VALUE = 3;
        public static final OperativeEventType OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER = null;
        public static final int OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER_VALUE = 1;
        public static final OperativeEventType OPERATIVE_EVENT_TYPE_UNSPECIFIED = null;
        public static final int OPERATIVE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final OperativeEventType UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<OperativeEventType> internalValueMap = null;
        private final int value;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1379273522 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.$values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType[], file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1379273522 < 0)
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
        private static /* synthetic */ gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType[] $values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1379273522 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.$values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType[], file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.$values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1627713358 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.<clinit>():void, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1627713358 > 401788)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1627713358 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.<clinit>():void, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2097518871 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.<init>(java.lang.String, int, int):void, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2097518871 > 401788)
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
        private OperativeEventType(java.lang.String r1, int r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2097518871 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.<init>(java.lang.String, int, int):void, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.<init>(java.lang.String, int, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2064537368 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.forNumber(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2064537368 > 401788)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType forNumber(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2064537368 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.forNumber(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.forNumber(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-50564241 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType>, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-50564241 < 0)
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
        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType> internalGetValueMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-50564241 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType>, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2092130158 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2092130158 < 0)
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
        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2092130158 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1622079202 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.valueOf(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1622079202 < 0)
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
        @java.lang.Deprecated
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType valueOf(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1622079202 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.valueOf(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.valueOf(int):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-351369095 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.valueOf(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-351369095 < 0)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType valueOf(java.lang.String r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-351369095 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.valueOf(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.valueOf(java.lang.String):gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (428912658 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType[], file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (428912658 > 401788)
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
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType[] values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (428912658 > 401788) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType[], file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.values():gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-450059788 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.getNumber():int, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-450059788 < 0)
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
        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-450059788 < 0) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.getNumber():int, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.getNumber():int");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (276419394 > 405784) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.<init>():void, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (276419394 > 405784)
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
    private OperativeEventRequestOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (276419394 > 405784) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.<init>():void, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2003350372 > 405784) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2003350372 > 405784)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2003350372 > 405784) in method: gatewayprotocol.v1.OperativeEventRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.OperativeEventRequestOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

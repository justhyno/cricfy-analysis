package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;

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
/* loaded from: classes39.dex */
public final class AdDataRefreshResponseOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes25.dex */
    public static final class AdDataRefreshResponse extends GeneratedMessageLite<AdDataRefreshResponse, Builder> implements AdDataRefreshResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 4;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        public static final int CAMPAIGN_METADATA_FIELD_NUMBER = 6;
        private static final AdDataRefreshResponse DEFAULT_INSTANCE = null;
        public static final int ERROR_FIELD_NUMBER = 5;
        private static volatile Parser<AdDataRefreshResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 3;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private CampaignMetadataOuterClass.CampaignMetadata campaignMetadata_;
        private ErrorOuterClass.Error error_;
        private ByteString trackingToken_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes10.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AdDataRefreshResponse, Builder> implements AdDataRefreshResponseOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (775425414 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.<init>():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (775425414 > 376268)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (775425414 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.<init>():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-21254782 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.<init>(r5):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-21254782 < 0)
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
            public /* synthetic */ Builder(p000.r5 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-21254782 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.<init>(r5):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.<init>(r5):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-797223398 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdData():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-797223398 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearAdData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-797223398 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdData():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdData():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-749941351 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdDataRefreshToken():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-749941351 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearAdDataRefreshToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-749941351 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdDataRefreshToken():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdDataRefreshToken():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (112553932 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdDataVersion():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (112553932 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearAdDataVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (112553932 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdDataVersion():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearAdDataVersion():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (595127380 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearCampaignMetadata():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (595127380 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearCampaignMetadata() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (595127380 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearCampaignMetadata():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearCampaignMetadata():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1885242118 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearError():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1885242118 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearError() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1885242118 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearError():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearError():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1556125976 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearTrackingToken():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1556125976 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearTrackingToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1556125976 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearTrackingToken():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.clearTrackingToken():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1602573717 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdData():com.google.protobuf.ByteString, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1602573717 > 376268)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public com.google.protobuf.ByteString getAdData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1602573717 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdData():com.google.protobuf.ByteString, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdData():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1341866964 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdDataRefreshToken():com.google.protobuf.ByteString, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1341866964 > 376268)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public com.google.protobuf.ByteString getAdDataRefreshToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1341866964 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdDataRefreshToken():com.google.protobuf.ByteString, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdDataRefreshToken():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (444206256 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdDataVersion():int, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (444206256 > 376268)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public int getAdDataVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (444206256 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdDataVersion():int, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getAdDataVersion():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1314085086 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getCampaignMetadata():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1314085086 < 0)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1314085086 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getCampaignMetadata():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getCampaignMetadata():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (157566702 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getError():gatewayprotocol.v1.ErrorOuterClass$Error, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (157566702 > 376268)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (157566702 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getError():gatewayprotocol.v1.ErrorOuterClass$Error, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getError():gatewayprotocol.v1.ErrorOuterClass$Error");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1479648890 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getTrackingToken():com.google.protobuf.ByteString, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1479648890 < 0)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public com.google.protobuf.ByteString getTrackingToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1479648890 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getTrackingToken():com.google.protobuf.ByteString, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.getTrackingToken():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-564164720 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.hasCampaignMetadata():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-564164720 < 0)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public boolean hasCampaignMetadata() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-564164720 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.hasCampaignMetadata():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.hasCampaignMetadata():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1829116302 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.hasError():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1829116302 < 0)
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
            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public boolean hasError() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1829116302 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.hasError():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.hasError():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-693255254 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-693255254 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-693255254 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1813939870 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.mergeError(gatewayprotocol.v1.ErrorOuterClass$Error):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1813939870 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1813939870 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.mergeError(gatewayprotocol.v1.ErrorOuterClass$Error):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.mergeError(gatewayprotocol.v1.ErrorOuterClass$Error):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-143544895 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdData(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-143544895 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setAdData(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-143544895 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdData(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdData(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1556650394 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdDataRefreshToken(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1556650394 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setAdDataRefreshToken(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1556650394 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdDataRefreshToken(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdDataRefreshToken(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1133544650 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdDataVersion(int):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1133544650 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setAdDataVersion(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1133544650 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdDataVersion(int):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setAdDataVersion(int):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (492457394 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (492457394 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (492457394 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata$Builder):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-762422086 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-762422086 < 0)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-762422086 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (26187825 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setError(gatewayprotocol.v1.ErrorOuterClass$Error$Builder):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (26187825 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (26187825 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setError(gatewayprotocol.v1.ErrorOuterClass$Error$Builder):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setError(gatewayprotocol.v1.ErrorOuterClass$Error$Builder):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1417733215 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setError(gatewayprotocol.v1.ErrorOuterClass$Error):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1417733215 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1417733215 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setError(gatewayprotocol.v1.ErrorOuterClass$Error):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setError(gatewayprotocol.v1.ErrorOuterClass$Error):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (891969917 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setTrackingToken(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (891969917 > 376268)
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
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setTrackingToken(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (891969917 > 376268) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setTrackingToken(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder.setTrackingToken(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-629381853 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.<clinit>():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-629381853 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-629381853 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.<clinit>():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1048474972 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.<init>():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1048474972 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private AdDataRefreshResponse() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1048474972 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.<init>():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (564129063 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$000():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (564129063 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (564129063 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$000():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$000():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-72942850 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-72942850 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-72942850 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (408103520 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1000(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (408103520 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1000(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, gatewayprotocol.v1.ErrorOuterClass.Error r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (408103520 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1000(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1000(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.ErrorOuterClass$Error):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1780051734 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1780051734 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1780051734 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1100(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1515800864 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1515800864 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1515800864 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-143360432 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-143360432 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-143360432 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-325939148 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-325939148 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-325939148 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$1400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1589345276 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1589345276 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1589345276 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$200(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-227151130 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, int):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-227151130 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-227151130 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, int):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$300(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (399200794 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (399200794 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (399200794 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$400(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1543985674 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$500(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1543985674 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$500(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1543985674 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$500(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$500(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1216389658 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$600(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1216389658 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$600(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1216389658 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$600(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$600(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-69603713 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$700(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-69603713 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$700(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-69603713 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$700(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$700(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-74127366 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$800(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-74127366 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$800(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-74127366 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$800(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$800(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1094477370 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$900(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1094477370 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$900(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0, gatewayprotocol.v1.ErrorOuterClass.Error r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1094477370 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$900(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.access$900(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, gatewayprotocol.v1.ErrorOuterClass$Error):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (923273493 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdData():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (923273493 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearAdData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (923273493 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdData():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1464940874 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdDataRefreshToken():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1464940874 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearAdDataRefreshToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1464940874 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdDataRefreshToken():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdDataRefreshToken():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1091622882 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdDataVersion():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1091622882 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearAdDataVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1091622882 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdDataVersion():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearAdDataVersion():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-863954530 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearCampaignMetadata():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-863954530 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearCampaignMetadata() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-863954530 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearCampaignMetadata():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearCampaignMetadata():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-295710546 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearError():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-295710546 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearError() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-295710546 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearError():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearError():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1514114610 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearTrackingToken():void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1514114610 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1514114610 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearTrackingToken():void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.clearTrackingToken():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (851814056 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (851814056 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (851814056 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (579813630 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (579813630 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (579813630 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.mergeCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2138668057 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.mergeError(gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2138668057 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeError(gatewayprotocol.v1.ErrorOuterClass.Error r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2138668057 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.mergeError(gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.mergeError(gatewayprotocol.v1.ErrorOuterClass$Error):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1705533758 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1705533758 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1705533758 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder():gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-705524534 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-705524534 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-705524534 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder(gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (701218454 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (701218454 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (701218454 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2034984441 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2034984441 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2034984441 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2046055606 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2046055606 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2046055606 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (422617259 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (422617259 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (422617259 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-273562820 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-273562820 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-273562820 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-492799537 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-492799537 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-492799537 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1402271264 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.io.InputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1402271264 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1402271264 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.io.InputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.io.InputStream):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1015509770 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1015509770 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1015509770 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (512414748 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (512414748 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (512414748 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-420406374 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-420406374 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-420406374 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (647212742 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(byte[]):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (647212742 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (647212742 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(byte[]):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(byte[]):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (791005344 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (791005344 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (791005344 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1386520526 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parser():com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse>, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1386520526 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1386520526 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parser():com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse>, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (555827468 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdData(com.google.protobuf.ByteString):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (555827468 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setAdData(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (555827468 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdData(com.google.protobuf.ByteString):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdData(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (112235516 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdDataRefreshToken(com.google.protobuf.ByteString):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (112235516 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setAdDataRefreshToken(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (112235516 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdDataRefreshToken(com.google.protobuf.ByteString):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdDataRefreshToken(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-338113612 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdDataVersion(int):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-338113612 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setAdDataVersion(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-338113612 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdDataVersion(int):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setAdDataVersion(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-367210333 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-367210333 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-367210333 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setCampaignMetadata(gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (19716531 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setError(gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (19716531 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setError(gatewayprotocol.v1.ErrorOuterClass.Error r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (19716531 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setError(gatewayprotocol.v1.ErrorOuterClass$Error):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setError(gatewayprotocol.v1.ErrorOuterClass$Error):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (836147072 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setTrackingToken(com.google.protobuf.ByteString):void, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (836147072 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (836147072 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setTrackingToken(com.google.protobuf.ByteString):void, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.setTrackingToken(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1980669202 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1980669202 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1980669202 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (880757963 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdData():com.google.protobuf.ByteString, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (880757963 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public com.google.protobuf.ByteString getAdData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (880757963 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdData():com.google.protobuf.ByteString, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdData():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-260865282 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdDataRefreshToken():com.google.protobuf.ByteString, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-260865282 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public com.google.protobuf.ByteString getAdDataRefreshToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-260865282 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdDataRefreshToken():com.google.protobuf.ByteString, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdDataRefreshToken():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1634381022 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdDataVersion():int, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1634381022 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public int getAdDataVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1634381022 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdDataVersion():int, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getAdDataVersion():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (987342908 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getCampaignMetadata():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (987342908 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (987342908 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getCampaignMetadata():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getCampaignMetadata():gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1905850868 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getError():gatewayprotocol.v1.ErrorOuterClass$Error, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1905850868 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1905850868 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getError():gatewayprotocol.v1.ErrorOuterClass$Error, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getError():gatewayprotocol.v1.ErrorOuterClass$Error");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (183568938 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getTrackingToken():com.google.protobuf.ByteString, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (183568938 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public com.google.protobuf.ByteString getTrackingToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (183568938 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getTrackingToken():com.google.protobuf.ByteString, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getTrackingToken():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (364575034 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.hasCampaignMetadata():boolean, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (364575034 > 346388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public boolean hasCampaignMetadata() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (364575034 > 346388) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.hasCampaignMetadata():boolean, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.hasCampaignMetadata():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1436081122 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.hasError():boolean, file: classes25.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1436081122 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public boolean hasError() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1436081122 < 0) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.hasError():boolean, file: classes25.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.hasError():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes32.dex */
    public interface AdDataRefreshResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata();

        ErrorOuterClass.Error getError();

        ByteString getTrackingToken();

        boolean hasCampaignMetadata();

        boolean hasError();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1655199978 > 388180) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.<init>():void, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1655199978 > 388180)
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
    private AdDataRefreshResponseOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1655199978 > 388180) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.<init>():void, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2058271458 > 388180) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2058271458 > 388180)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2058271458 > 388180) in method: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.AdDataRefreshResponseOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

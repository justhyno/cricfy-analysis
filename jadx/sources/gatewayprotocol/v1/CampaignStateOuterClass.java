package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.List;

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
/* loaded from: classes38.dex */
public final class CampaignStateOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes26.dex */
    public static final class Campaign extends GeneratedMessageLite<Campaign, Builder> implements CampaignOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DATA_VERSION_FIELD_NUMBER = 1;
        private static final Campaign DEFAULT_INSTANCE = null;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        public static final int LOAD_TIMESTAMP_FIELD_NUMBER = 5;
        private static volatile Parser<Campaign> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 3;
        public static final int SHOW_TIMESTAMP_FIELD_NUMBER = 6;
        private int bitField0_;
        private int dataVersion_;
        private ByteString data_;
        private ByteString impressionOpportunityId_;
        private TimestampsOuterClass.Timestamps loadTimestamp_;
        private String placementId_;
        private TimestampsOuterClass.Timestamps showTimestamp_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Campaign, Builder> implements CampaignOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (834916217 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.<init>():void, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (834916217 > 392004)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (834916217 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.<init>():void, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-136956782 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.<init>(sr):void, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-136956782 < 0)
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
            public /* synthetic */ Builder(p000.sr r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-136956782 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.<init>(sr):void, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.<init>(sr):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (290248254 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearData():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (290248254 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (290248254 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearData():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearData():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1694576282 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearDataVersion():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1694576282 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearDataVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1694576282 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearDataVersion():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearDataVersion():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1322955662 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearImpressionOpportunityId():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1322955662 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearImpressionOpportunityId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1322955662 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearImpressionOpportunityId():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearImpressionOpportunityId():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1121255515 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearLoadTimestamp():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1121255515 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearLoadTimestamp() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1121255515 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearLoadTimestamp():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearLoadTimestamp():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (638410718 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearPlacementId():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (638410718 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearPlacementId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (638410718 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearPlacementId():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearPlacementId():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-187540257 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearShowTimestamp():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-187540257 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearShowTimestamp() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-187540257 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearShowTimestamp():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.clearShowTimestamp():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2061661155 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getData():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2061661155 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public com.google.protobuf.ByteString getData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2061661155 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getData():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getData():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (612948222 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getDataVersion():int, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (612948222 > 392004)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public int getDataVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (612948222 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getDataVersion():int, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getDataVersion():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-575273917 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-575273917 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-575273917 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getImpressionOpportunityId():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1268435042 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getLoadTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1268435042 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestamp() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1268435042 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getLoadTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getLoadTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1415768269 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getPlacementId():java.lang.String, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1415768269 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public java.lang.String getPlacementId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1415768269 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getPlacementId():java.lang.String, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getPlacementId():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1661591666 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1661591666 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public com.google.protobuf.ByteString getPlacementIdBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1661591666 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getPlacementIdBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-963163990 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getShowTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-963163990 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestamp() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-963163990 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getShowTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.getShowTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1350928064 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.hasLoadTimestamp():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1350928064 > 392004)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public boolean hasLoadTimestamp() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1350928064 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.hasLoadTimestamp():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.hasLoadTimestamp():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2137461655 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.hasShowTimestamp():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2137461655 > 392004)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public boolean hasShowTimestamp() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2137461655 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.hasShowTimestamp():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.hasShowTimestamp():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1148659076 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1148659076 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1148659076 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1568128144 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1568128144 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1568128144 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-168783256 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setData(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-168783256 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setData(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-168783256 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setData(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setData(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1947849670 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setDataVersion(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1947849670 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setDataVersion(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1947849670 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setDataVersion(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setDataVersion(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (156891492 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setImpressionOpportunityId(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (156891492 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setImpressionOpportunityId(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (156891492 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setImpressionOpportunityId(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setImpressionOpportunityId(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (842476190 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (842476190 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (842476190 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-200111236 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-200111236 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-200111236 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1057809990 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setPlacementId(java.lang.String):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1057809990 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setPlacementId(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1057809990 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setPlacementId(java.lang.String):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setPlacementId(java.lang.String):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (119214382 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setPlacementIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (119214382 > 392004)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setPlacementIdBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (119214382 > 392004) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setPlacementIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setPlacementIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1749905766 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1749905766 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1749905766 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1815156520 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1815156520 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1815156520 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (105850722 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.<clinit>():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (105850722 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (105850722 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.<clinit>():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (566659744 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.<init>():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (566659744 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Campaign() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (566659744 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.<init>():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1431815525 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$000():gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1431815525 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ gatewayprotocol.v1.CampaignStateOuterClass.Campaign access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1431815525 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$000():gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$000():gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1311830022 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$100(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, int):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1311830022 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$100(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1311830022 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$100(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, int):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$100(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1775361619 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1000(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1775361619 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1000(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1775361619 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1000(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1000(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-775772922 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1100(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-775772922 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1100(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-775772922 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1100(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1100(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-573119563 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1200(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-573119563 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1200(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-573119563 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1200(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1200(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1317846408 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1300(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1317846408 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1300(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1317846408 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1300(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1300(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1016658348 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1400(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1016658348 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1400(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1016658348 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1400(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1400(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1825889887 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1500(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1825889887 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1500(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1825889887 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1500(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$1500(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1583027962 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$200(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1583027962 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$200(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1583027962 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$200(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$200(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-166364852 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$300(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-166364852 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$300(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-166364852 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$300(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$300(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1521359112 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$400(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1521359112 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$400(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1521359112 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$400(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$400(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2080370818 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$500(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2080370818 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$500(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2080370818 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$500(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$500(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-343640900 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$600(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-343640900 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$600(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-343640900 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$600(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$600(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1922233902 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$700(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1922233902 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$700(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1922233902 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$700(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$700(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (66296570 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$800(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (66296570 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$800(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (66296570 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$800(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$800(gatewayprotocol.v1.CampaignStateOuterClass$Campaign, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (743816751 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$900(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (743816751 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$900(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (743816751 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$900(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.access$900(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1951221728 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearData():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1951221728 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1951221728 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearData():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (97877190 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearDataVersion():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (97877190 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearDataVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (97877190 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearDataVersion():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearDataVersion():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (239523837 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearImpressionOpportunityId():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (239523837 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (239523837 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearImpressionOpportunityId():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearImpressionOpportunityId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1576823307 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearLoadTimestamp():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1576823307 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearLoadTimestamp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1576823307 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearLoadTimestamp():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearLoadTimestamp():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (111696836 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearPlacementId():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (111696836 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearPlacementId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (111696836 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearPlacementId():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearPlacementId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1749209258 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearShowTimestamp():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1749209258 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearShowTimestamp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1749209258 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearShowTimestamp():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.clearShowTimestamp():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-903398526 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getDefaultInstance():gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-903398526 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-903398526 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getDefaultInstance():gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getDefaultInstance():gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1406372607 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1406372607 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1406372607 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-805559648 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-805559648 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-805559648 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (598281506 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (598281506 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (598281506 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder():gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1163097095 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1163097095 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder newBuilder(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1163097095 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1399972580 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1399972580 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1399972580 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1253311462 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1253311462 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1253311462 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (179519342 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (179519342 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (179519342 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1961481263 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1961481263 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1961481263 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-552159919 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-552159919 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-552159919 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-396415552 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-396415552 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-396415552 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1079454344 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1079454344 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1079454344 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (132473428 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (132473428 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (132473428 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1572495796 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1572495796 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1572495796 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1831903947 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1831903947 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1831903947 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2142026719 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(byte[]):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2142026719 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2142026719 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(byte[]):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(byte[]):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1836981234 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1836981234 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1836981234 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1596708328 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parser():com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1596708328 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1596708328 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parser():com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1180114953 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setData(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1180114953 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1180114953 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setData(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setData(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (181201616 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setDataVersion(int):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (181201616 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setDataVersion(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (181201616 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setDataVersion(int):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setDataVersion(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1820151640 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setImpressionOpportunityId(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1820151640 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1820151640 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setImpressionOpportunityId(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setImpressionOpportunityId(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1891661205 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1891661205 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1891661205 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (995556922 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setPlacementId(java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (995556922 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setPlacementId(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (995556922 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setPlacementId(java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setPlacementId(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-940844874 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setPlacementIdBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-940844874 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setPlacementIdBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-940844874 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setPlacementIdBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setPlacementIdBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1810916176 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1810916176 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1810916176 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1596612757 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1596612757 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1596612757 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (177811330 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getData():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (177811330 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public com.google.protobuf.ByteString getData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (177811330 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getData():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getData():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1826201207 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getDataVersion():int, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1826201207 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public int getDataVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1826201207 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getDataVersion():int, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getDataVersion():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-521537618 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-521537618 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public com.google.protobuf.ByteString getImpressionOpportunityId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-521537618 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getImpressionOpportunityId():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getImpressionOpportunityId():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-381150876 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getLoadTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-381150876 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestamp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-381150876 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getLoadTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getLoadTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1034833870 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getPlacementId():java.lang.String, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1034833870 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public java.lang.String getPlacementId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1034833870 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getPlacementId():java.lang.String, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getPlacementId():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1189764022 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1189764022 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public com.google.protobuf.ByteString getPlacementIdBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1189764022 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getPlacementIdBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (760190800 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getShowTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (760190800 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestamp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (760190800 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getShowTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.getShowTimestamp():gatewayprotocol.v1.TimestampsOuterClass$Timestamps");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1244592614 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.hasLoadTimestamp():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1244592614 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public boolean hasLoadTimestamp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1244592614 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.hasLoadTimestamp():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.hasLoadTimestamp():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (595452146 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.hasShowTimestamp():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (595452146 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public boolean hasShowTimestamp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (595452146 > 358328) in method: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.hasShowTimestamp():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.Campaign.hasShowTimestamp():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes21.dex */
    public interface CampaignOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();

        int getDataVersion();

        ByteString getImpressionOpportunityId();

        TimestampsOuterClass.Timestamps getLoadTimestamp();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        TimestampsOuterClass.Timestamps getShowTimestamp();

        boolean hasLoadTimestamp();

        boolean hasShowTimestamp();
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes39.dex */
    public static final class CampaignState extends GeneratedMessageLite<CampaignState, Builder> implements CampaignStateOrBuilder {
        private static final CampaignState DEFAULT_INSTANCE = null;
        public static final int LOADED_CAMPAIGNS_FIELD_NUMBER = 1;
        private static volatile Parser<CampaignState> PARSER = null;
        public static final int SHOWN_CAMPAIGNS_FIELD_NUMBER = 2;
        private Internal.ProtobufList<Campaign> loadedCampaigns_;
        private Internal.ProtobufList<Campaign> shownCampaigns_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes22.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<CampaignState, Builder> implements CampaignStateOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1131780302 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.<init>():void, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1131780302 > 384920)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1131780302 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.<init>():void, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1111509964 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.<init>(sr):void, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1111509964 > 384920)
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
            public /* synthetic */ Builder(p000.sr r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1111509964 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.<init>(sr):void, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.<init>(sr):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1221391446 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1221391446 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1221391446 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addAllLoadedCampaigns(java.lang.Iterable):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-487601872 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-487601872 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-487601872 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addAllShownCampaigns(java.lang.Iterable):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1409952762 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1409952762 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1409952762 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-752361666 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-752361666 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-752361666 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-572312282 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-572312282 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-572312282 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (548860008 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (548860008 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (548860008 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-746276609 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-746276609 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-746276609 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-410610335 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-410610335 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-410610335 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1968384550 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1968384550 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1968384550 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1640811505 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1640811505 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1640811505 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1946093000 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.clearLoadedCampaigns():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1946093000 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder clearLoadedCampaigns() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1946093000 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.clearLoadedCampaigns():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.clearLoadedCampaigns():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1947032430 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.clearShownCampaigns():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1947032430 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder clearShownCampaigns() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1947032430 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.clearShownCampaigns():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.clearShownCampaigns():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (670890958 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (670890958 > 384920)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getLoadedCampaigns(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (670890958 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1554818071 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaignsCount():int, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1554818071 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public int getLoadedCampaignsCount() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1554818071 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaignsCount():int, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaignsCount():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (446276242 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (446276242 > 384920)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getLoadedCampaignsList() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (446276242 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getLoadedCampaignsList():java.util.List");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (866263370 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (866263370 > 384920)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getShownCampaigns(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (866263370 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-418740153 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaignsCount():int, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-418740153 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public int getShownCampaignsCount() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-418740153 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaignsCount():int, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaignsCount():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1784527583 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1784527583 < 0)
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
            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getShownCampaignsList() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1784527583 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.getShownCampaignsList():java.util.List");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1852933650 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.removeLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1852933650 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder removeLoadedCampaigns(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1852933650 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.removeLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.removeLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1611378046 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.removeShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1611378046 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder removeShownCampaigns(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1611378046 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.removeShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.removeShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (372695534 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (372695534 > 384920)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setLoadedCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (372695534 > 384920) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-423017858 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-423017858 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setLoadedCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-423017858 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-930421820 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-930421820 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setShownCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-930421820 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1048883374 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1048883374 < 0)
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
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setShownCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1048883374 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes22.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-815526297 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.<clinit>():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-815526297 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-815526297 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.<clinit>():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1374925398 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.<init>():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1374925398 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private CampaignState() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1374925398 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.<init>():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1972736445 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1700():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1972736445 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ gatewayprotocol.v1.CampaignStateOuterClass.CampaignState access$1700() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1972736445 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1700():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1700():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-671454004 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1800(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-671454004 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1800(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-671454004 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1800(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1800(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-759693464 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1900(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-759693464 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1900(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-759693464 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1900(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$1900(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1443375670 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2000(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1443375670 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2000(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1443375670 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2000(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2000(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-555598459 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2100(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, java.lang.Iterable):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-555598459 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2100(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, java.lang.Iterable r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-555598459 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2100(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, java.lang.Iterable):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2100(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (813438824 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2200(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (813438824 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2200(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (813438824 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2200(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2200(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1396129183 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2300(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1396129183 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2300(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1396129183 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2300(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2300(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1225084418 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2400(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1225084418 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2400(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1225084418 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2400(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2400(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-709680656 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2500(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-709680656 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2500(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-709680656 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2500(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2500(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1031159322 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2600(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1031159322 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2600(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1031159322 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2600(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2600(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-249922636 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2700(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, java.lang.Iterable):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-249922636 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2700(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, java.lang.Iterable r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-249922636 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2700(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, java.lang.Iterable):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2700(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1004138389 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2800(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1004138389 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2800(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1004138389 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2800(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2800(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1632196758 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2900(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1632196758 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2900(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1632196758 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2900(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.access$2900(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-573814474 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-573814474 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-573814474 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addAllLoadedCampaigns(java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (916273694 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (916273694 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (916273694 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass$Campaign>):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addAllShownCampaigns(java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-828806680 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-828806680 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addLoadedCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-828806680 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1794259834 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1794259834 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1794259834 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1804010832 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1804010832 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addShownCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1804010832 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1886268518 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1886268518 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1886268518 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-461527818 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.clearLoadedCampaigns():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-461527818 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearLoadedCampaigns() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-461527818 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.clearLoadedCampaigns():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.clearLoadedCampaigns():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-719432286 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.clearShownCampaigns():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-719432286 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearShownCampaigns() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-719432286 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.clearShownCampaigns():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.clearShownCampaigns():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1418531318 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.ensureLoadedCampaignsIsMutable():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1418531318 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void ensureLoadedCampaignsIsMutable() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1418531318 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.ensureLoadedCampaignsIsMutable():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.ensureLoadedCampaignsIsMutable():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-206655714 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.ensureShownCampaignsIsMutable():void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-206655714 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void ensureShownCampaignsIsMutable() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-206655714 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.ensureShownCampaignsIsMutable():void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.ensureShownCampaignsIsMutable():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1772298886 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1772298886 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1772298886 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1670124918 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1670124918 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1670124918 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (639991618 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (639991618 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder newBuilder(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (639991618 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1048994212 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1048994212 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1048994212 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-280655992 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-280655992 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-280655992 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (445865052 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (445865052 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (445865052 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1873605468 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1873605468 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1873605468 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1015944514 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1015944514 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1015944514 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (488449180 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (488449180 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (488449180 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1616501646 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1616501646 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1616501646 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.io.InputStream):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (766214726 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (766214726 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (766214726 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1293499258 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1293499258 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1293499258 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-584624281 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-584624281 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-584624281 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (245022086 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(byte[]):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (245022086 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (245022086 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(byte[]):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(byte[]):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1965529361 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1965529361 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1965529361 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1967433667 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parser():com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass$CampaignState>, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1967433667 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.CampaignState> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1967433667 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parser():com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass$CampaignState>, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-174546646 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.removeLoadedCampaigns(int):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-174546646 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void removeLoadedCampaigns(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-174546646 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.removeLoadedCampaigns(int):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.removeLoadedCampaigns(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1277930930 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.removeShownCampaigns(int):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1277930930 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void removeShownCampaigns(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1277930930 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.removeShownCampaigns(int):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.removeShownCampaigns(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1164784616 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1164784616 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setLoadedCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1164784616 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.setLoadedCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1281453146 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1281453146 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setShownCampaigns(int r1, gatewayprotocol.v1.CampaignStateOuterClass.Campaign r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1281453146 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.setShownCampaigns(int, gatewayprotocol.v1.CampaignStateOuterClass$Campaign):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (327596696 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (327596696 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (327596696 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1357503966 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1357503966 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getLoadedCampaigns(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1357503966 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2023519784 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsCount():int, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2023519784 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public int getLoadedCampaignsCount() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2023519784 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsCount():int, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsCount():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1093644246 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1093644246 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getLoadedCampaignsList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1093644246 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsList():java.util.List");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1412478639 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsOrBuilder(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1412478639 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder getLoadedCampaignsOrBuilder(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1412478639 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsOrBuilder(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsOrBuilder(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1293963607 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsOrBuilderList():java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder>, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1293963607 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder> getLoadedCampaignsOrBuilderList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1293963607 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsOrBuilderList():java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder>, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getLoadedCampaignsOrBuilderList():java.util.List");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1572814119 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1572814119 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getShownCampaigns(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1572814119 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaigns(int):gatewayprotocol.v1.CampaignStateOuterClass$Campaign");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (349939906 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsCount():int, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (349939906 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public int getShownCampaignsCount() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (349939906 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsCount():int, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsCount():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-166142983 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-166142983 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getShownCampaignsList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-166142983 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsList():java.util.List<gatewayprotocol.v1.CampaignStateOuterClass$Campaign>, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsList():java.util.List");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1508146538 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsOrBuilder(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1508146538 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder getShownCampaignsOrBuilder(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1508146538 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsOrBuilder(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsOrBuilder(int):gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1532129203 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsOrBuilderList():java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder>, file: classes39.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1532129203 > 388180)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder> getShownCampaignsOrBuilderList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1532129203 > 388180) in method: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsOrBuilderList():java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder>, file: classes39.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getShownCampaignsOrBuilderList():java.util.List");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes13.dex */
    public interface CampaignStateOrBuilder extends MessageLiteOrBuilder {
        Campaign getLoadedCampaigns(int i);

        int getLoadedCampaignsCount();

        List<Campaign> getLoadedCampaignsList();

        Campaign getShownCampaigns(int i);

        int getShownCampaignsCount();

        List<Campaign> getShownCampaignsList();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1939101681 > 430712) in method: gatewayprotocol.v1.CampaignStateOuterClass.<init>():void, file: classes38.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1939101681 > 430712)
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
    private CampaignStateOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1939101681 > 430712) in method: gatewayprotocol.v1.CampaignStateOuterClass.<init>():void, file: classes38.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1513014598 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes38.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1513014598 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1513014598 < 0) in method: gatewayprotocol.v1.CampaignStateOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes38.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.CampaignStateOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

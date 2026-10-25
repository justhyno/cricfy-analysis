package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;

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
/* loaded from: classes24.dex */
public final class HeaderBiddingTokenOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes26.dex */
    public static final class HeaderBiddingToken extends GeneratedMessageLite<HeaderBiddingToken, Builder> implements HeaderBiddingTokenOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 15;
        public static final int BANNER_SIZE_FIELD_NUMBER = 22;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        private static final HeaderBiddingToken DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int EXTERNAL_USER_IDENTIFIER_FIELD_NUMBER = 24;
        public static final int EXTRAS_FIELD_NUMBER = 19;
        public static final int INITIALIZATION_DATA_FIELD_NUMBER = 14;
        public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 13;
        public static final int MEDIATION_AD_UNIT_ID_FIELD_NUMBER = 23;
        public static final int MEDIATION_INFO_FIELD_NUMBER = 20;
        public static final int OFFERWALL_ENABLED_FIELD_NUMBER = 18;
        private static volatile Parser<HeaderBiddingToken> PARSER = null;
        public static final int PII_FIELD_NUMBER = 9;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 21;
        public static final int SCAR_SIGNALS_COLLECTED_FIELD_NUMBER = 12;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 6;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 3;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 7;
        public static final int TCF_FIELD_NUMBER = 11;
        public static final int TEST_DATA_FIELD_NUMBER = 16;
        public static final int TIMESTAMPS_FIELD_NUMBER = 5;
        public static final int TOKEN_COUNTERS_FIELD_NUMBER = 17;
        public static final int TOKEN_ID_FIELD_NUMBER = 1;
        public static final int TOKEN_NUMBER_FIELD_NUMBER = 2;
        private int adFormat_;
        private AdRequestOuterClass.BannerSize bannerSize_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private ClientInfoOuterClass.ClientInfo clientInfo_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private String externalUserIdentifier_;
        private MapFieldLite<String, String> extras_;
        private InitializationDataOuterClass.InitializationData initializationData_;
        private UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken_;
        private String mediationAdUnitId_;
        private MediationInfoOuterClass.MediationInfo mediationInfo_;
        private boolean offerwallEnabled_;
        private PiiOuterClass.Pii pii_;
        private String placementId_;
        private boolean scarSignalsCollected_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private ByteString sessionToken_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString tcf_;
        private TestDataOuterClass.TestData testData_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private TokenCounters tokenCounters_;
        private ByteString tokenId_;
        private int tokenNumber_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<HeaderBiddingToken, Builder> implements HeaderBiddingTokenOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (911857002 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.<init>():void, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (911857002 > 392004)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (911857002 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.<init>():void, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (485064967 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.<init>(t81):void, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (485064967 > 392004)
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
            public /* synthetic */ Builder(p000.t81 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (485064967 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.<init>(t81):void, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.<init>(t81):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (14953810 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearAdFormat():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (14953810 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearAdFormat() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (14953810 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearAdFormat():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearAdFormat():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (307324566 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearBannerSize():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (307324566 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearBannerSize() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (307324566 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearBannerSize():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearBannerSize():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1228754654 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearCampaignState():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1228754654 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearCampaignState() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1228754654 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearCampaignState():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearCampaignState():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2128740160 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearClientInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2128740160 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearClientInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2128740160 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearClientInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearClientInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1914301937 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1914301937 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1914301937 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearDynamicDeviceInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-406547432 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearExternalUserIdentifier():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-406547432 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearExternalUserIdentifier() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-406547432 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearExternalUserIdentifier():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearExternalUserIdentifier():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (129296046 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearExtras():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (129296046 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearExtras() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (129296046 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearExtras():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearExtras():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1672974226 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearInitializationData():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1672974226 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearInitializationData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1672974226 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearInitializationData():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearInitializationData():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2030808954 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearLimitedSessionToken():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2030808954 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearLimitedSessionToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2030808954 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearLimitedSessionToken():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearLimitedSessionToken():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2092467006 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearMediationAdUnitId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2092467006 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearMediationAdUnitId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2092467006 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearMediationAdUnitId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearMediationAdUnitId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1144022198 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearMediationInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1144022198 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearMediationInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1144022198 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearMediationInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearMediationInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1607009945 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearOfferwallEnabled():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1607009945 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearOfferwallEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1607009945 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearOfferwallEnabled():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearOfferwallEnabled():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-242698128 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearPii():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-242698128 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearPii() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-242698128 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearPii():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearPii():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (994664319 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearPlacementId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (994664319 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearPlacementId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (994664319 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearPlacementId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearPlacementId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-296520736 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearScarSignalsCollected():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-296520736 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearScarSignalsCollected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-296520736 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearScarSignalsCollected():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearScarSignalsCollected():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (477329245 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearSessionCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (477329245 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearSessionCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (477329245 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearSessionCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearSessionCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (565735389 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearSessionToken():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (565735389 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearSessionToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (565735389 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearSessionToken():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearSessionToken():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1805867968 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1805867968 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1805867968 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearStaticDeviceInfo():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (83724798 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTcf():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (83724798 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTcf() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (83724798 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTcf():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTcf():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (211932967 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTestData():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (211932967 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTestData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (211932967 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTestData():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTestData():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (646278410 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTimestamps():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (646278410 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTimestamps() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (646278410 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTimestamps():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTimestamps():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (486714140 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (486714140 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTokenCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (486714140 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1837239834 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1837239834 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTokenId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1837239834 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenId():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1239373462 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenNumber():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1239373462 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTokenNumber() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1239373462 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenNumber():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.clearTokenNumber():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2091628314 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.containsExtras(java.lang.String):boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2091628314 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean containsExtras(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2091628314 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.containsExtras(java.lang.String):boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.containsExtras(java.lang.String):boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1048836822 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1048836822 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1048836822 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1520551778 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getAdFormatValue():int, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1520551778 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public int getAdFormatValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1520551778 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getAdFormatValue():int, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getAdFormatValue():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1456541400 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getBannerSize():gatewayprotocol.v1.AdRequestOuterClass$BannerSize, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1456541400 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1456541400 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getBannerSize():gatewayprotocol.v1.AdRequestOuterClass$BannerSize, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getBannerSize():gatewayprotocol.v1.AdRequestOuterClass$BannerSize");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1291064344 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1291064344 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1291064344 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-764751934 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getClientInfo():gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-764751934 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-764751934 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getClientInfo():gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getClientInfo():gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (122782297 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (122782297 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (122782297 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1981944834 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExternalUserIdentifier():java.lang.String, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1981944834 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public java.lang.String getExternalUserIdentifier() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1981944834 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExternalUserIdentifier():java.lang.String, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExternalUserIdentifier():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1865742294 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExternalUserIdentifierBytes():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1865742294 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getExternalUserIdentifierBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1865742294 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExternalUserIdentifierBytes():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExternalUserIdentifierBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (375774554 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtras():java.util.Map<java.lang.String, java.lang.String>, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (375774554 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, java.lang.String> getExtras() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (375774554 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtras():java.util.Map<java.lang.String, java.lang.String>, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtras():java.util.Map");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-355555242 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasCount():int, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-355555242 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public int getExtrasCount() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-355555242 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasCount():int, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasCount():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2127018254 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasMap():java.util.Map<java.lang.String, java.lang.String>, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2127018254 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public java.util.Map<java.lang.String, java.lang.String> getExtrasMap() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2127018254 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasMap():java.util.Map<java.lang.String, java.lang.String>, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasMap():java.util.Map");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-549233049 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasOrDefault(java.lang.String, java.lang.String):java.lang.String, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-549233049 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public java.lang.String getExtrasOrDefault(java.lang.String r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-549233049 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasOrDefault(java.lang.String, java.lang.String):java.lang.String, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasOrDefault(java.lang.String, java.lang.String):java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-969253724 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasOrThrow(java.lang.String):java.lang.String, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-969253724 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public java.lang.String getExtrasOrThrow(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-969253724 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasOrThrow(java.lang.String):java.lang.String, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getExtrasOrThrow(java.lang.String):java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1215119803 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getInitializationData():gatewayprotocol.v1.InitializationDataOuterClass$InitializationData, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1215119803 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getInitializationData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1215119803 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getInitializationData():gatewayprotocol.v1.InitializationDataOuterClass$InitializationData, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getInitializationData():gatewayprotocol.v1.InitializationDataOuterClass$InitializationData");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-760292789 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getLimitedSessionToken():gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-760292789 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-760292789 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getLimitedSessionToken():gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getLimitedSessionToken():gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (550106829 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationAdUnitId():java.lang.String, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (550106829 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public java.lang.String getMediationAdUnitId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (550106829 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationAdUnitId():java.lang.String, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationAdUnitId():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-542447396 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationAdUnitIdBytes():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-542447396 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getMediationAdUnitIdBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-542447396 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationAdUnitIdBytes():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationAdUnitIdBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1260442466 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationInfo():gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1260442466 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo getMediationInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1260442466 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationInfo():gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getMediationInfo():gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (510118796 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getOfferwallEnabled():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (510118796 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean getOfferwallEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (510118796 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getOfferwallEnabled():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getOfferwallEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1676068282 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPii():gatewayprotocol.v1.PiiOuterClass$Pii, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1676068282 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1676068282 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPii():gatewayprotocol.v1.PiiOuterClass$Pii, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPii():gatewayprotocol.v1.PiiOuterClass$Pii");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-289518178 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPlacementId():java.lang.String, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-289518178 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public java.lang.String getPlacementId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-289518178 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPlacementId():java.lang.String, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPlacementId():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1425720292 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1425720292 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getPlacementIdBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1425720292 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getPlacementIdBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2062783472 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getScarSignalsCollected():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2062783472 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean getScarSignalsCollected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2062783472 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getScarSignalsCollected():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getScarSignalsCollected():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (994262231 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (994262231 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (994262231 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (53437094 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getSessionToken():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (53437094 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getSessionToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (53437094 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getSessionToken():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getSessionToken():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1400592692 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1400592692 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1400592692 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1448613890 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTcf():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1448613890 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getTcf() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1448613890 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTcf():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTcf():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2011637162 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTestData():gatewayprotocol.v1.TestDataOuterClass$TestData, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2011637162 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2011637162 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTestData():gatewayprotocol.v1.TestDataOuterClass$TestData, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTestData():gatewayprotocol.v1.TestDataOuterClass$TestData");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1072789962 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTimestamps():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1072789962 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1072789962 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTimestamps():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTimestamps():gatewayprotocol.v1.TimestampsOuterClass$Timestamps");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (724524598 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (724524598 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (724524598 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1774661138 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenId():com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1774661138 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getTokenId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1774661138 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenId():com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenId():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1296902635 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenNumber():int, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1296902635 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public int getTokenNumber() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1296902635 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenNumber():int, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.getTokenNumber():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1771005750 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasAdFormat():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1771005750 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasAdFormat() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1771005750 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasAdFormat():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasAdFormat():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1910153951 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasBannerSize():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1910153951 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasBannerSize() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1910153951 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasBannerSize():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasBannerSize():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (526702046 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasCampaignState():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (526702046 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasCampaignState() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (526702046 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasCampaignState():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasCampaignState():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1189924254 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasClientInfo():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1189924254 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasClientInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1189924254 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasClientInfo():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasClientInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1516599036 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasDynamicDeviceInfo():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1516599036 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasDynamicDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1516599036 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasDynamicDeviceInfo():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasDynamicDeviceInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2087551297 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasExternalUserIdentifier():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2087551297 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasExternalUserIdentifier() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2087551297 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasExternalUserIdentifier():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasExternalUserIdentifier():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1448363045 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasInitializationData():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1448363045 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasInitializationData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1448363045 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasInitializationData():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasInitializationData():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1052306010 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasLimitedSessionToken():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1052306010 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasLimitedSessionToken() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1052306010 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasLimitedSessionToken():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasLimitedSessionToken():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (365520762 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasMediationAdUnitId():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (365520762 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasMediationAdUnitId() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (365520762 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasMediationAdUnitId():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasMediationAdUnitId():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-671929638 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasMediationInfo():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-671929638 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasMediationInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-671929638 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasMediationInfo():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasMediationInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (837412337 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasOfferwallEnabled():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (837412337 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasOfferwallEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (837412337 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasOfferwallEnabled():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasOfferwallEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-411129254 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasPii():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-411129254 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasPii() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-411129254 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasPii():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasPii():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (841549574 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasScarSignalsCollected():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (841549574 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasScarSignalsCollected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (841549574 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasScarSignalsCollected():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasScarSignalsCollected():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (763918869 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasSessionCounters():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (763918869 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasSessionCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (763918869 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasSessionCounters():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasSessionCounters():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-175708602 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasStaticDeviceInfo():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-175708602 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasStaticDeviceInfo() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-175708602 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasStaticDeviceInfo():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasStaticDeviceInfo():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-638976833 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTcf():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-638976833 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTcf() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-638976833 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTcf():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTcf():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2056568416 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTestData():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2056568416 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTestData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2056568416 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTestData():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTestData():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1258412982 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTimestamps():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1258412982 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTimestamps() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1258412982 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTimestamps():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTimestamps():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1878968475 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTokenCounters():boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1878968475 > 392004)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTokenCounters() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1878968475 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTokenCounters():boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.hasTokenCounters():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-51282726 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-51282726 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-51282726 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-563493572 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-563493572 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-563493572 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1786690394 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1786690394 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1786690394 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-13627909 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-13627909 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-13627909 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1379079284 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1379079284 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1379079284 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2090510522 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2090510522 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2090510522 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1706499269 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1706499269 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1706499269 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1100269982 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergePii(gatewayprotocol.v1.PiiOuterClass$Pii):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1100269982 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergePii(gatewayprotocol.v1.PiiOuterClass.Pii r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1100269982 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergePii(gatewayprotocol.v1.PiiOuterClass$Pii):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergePii(gatewayprotocol.v1.PiiOuterClass$Pii):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1376035926 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1376035926 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1376035926 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1055530634 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1055530634 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1055530634 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1661880440 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1661880440 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeTestData(gatewayprotocol.v1.TestDataOuterClass.TestData r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1661880440 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (393788493 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (393788493 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (393788493 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1294353790 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1294353790 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1294353790 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1602328064 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.putAllExtras(java.util.Map<java.lang.String, java.lang.String>):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1602328064 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder putAllExtras(java.util.Map<java.lang.String, java.lang.String> r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1602328064 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.putAllExtras(java.util.Map<java.lang.String, java.lang.String>):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.putAllExtras(java.util.Map):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (399597598 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.putExtras(java.lang.String, java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (399597598 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder putExtras(java.lang.String r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (399597598 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.putExtras(java.lang.String, java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.putExtras(java.lang.String, java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (78144006 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.removeExtras(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (78144006 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder removeExtras(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (78144006 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.removeExtras(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.removeExtras(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2007803512 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2007803512 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setAdFormat(gatewayprotocol.v1.AdFormatOuterClass.AdFormat r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2007803512 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1490567836 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setAdFormatValue(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1490567836 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setAdFormatValue(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1490567836 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setAdFormatValue(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setAdFormatValue(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-328809305 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-328809305 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-328809305 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1153895343 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1153895343 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1153895343 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1832372714 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1832372714 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1832372714 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1586979320 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1586979320 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1586979320 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2145756679 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2145756679 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2145756679 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1651816328 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1651816328 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1651816328 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1825802006 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1825802006 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1825802006 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-466739069 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-466739069 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-466739069 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (137531266 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setExternalUserIdentifier(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (137531266 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setExternalUserIdentifier(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (137531266 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setExternalUserIdentifier(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setExternalUserIdentifier(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2081230610 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setExternalUserIdentifierBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2081230610 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setExternalUserIdentifierBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2081230610 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setExternalUserIdentifierBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setExternalUserIdentifierBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-841063370 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-841063370 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-841063370 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1729611290 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1729611290 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1729611290 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1079912356 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1079912356 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1079912356 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-355607831 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-355607831 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-355607831 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (139572275 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationAdUnitId(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (139572275 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setMediationAdUnitId(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (139572275 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationAdUnitId(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationAdUnitId(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1313410758 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationAdUnitIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1313410758 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setMediationAdUnitIdBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1313410758 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationAdUnitIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationAdUnitIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1575157954 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1575157954 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1575157954 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2088440226 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2088440226 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2088440226 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2006252513 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setOfferwallEnabled(boolean):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2006252513 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setOfferwallEnabled(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2006252513 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setOfferwallEnabled(boolean):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setOfferwallEnabled(boolean):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (524505866 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPii(gatewayprotocol.v1.PiiOuterClass$Pii$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (524505866 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (524505866 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPii(gatewayprotocol.v1.PiiOuterClass$Pii$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPii(gatewayprotocol.v1.PiiOuterClass$Pii$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (572583110 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPii(gatewayprotocol.v1.PiiOuterClass$Pii):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (572583110 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (572583110 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPii(gatewayprotocol.v1.PiiOuterClass$Pii):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPii(gatewayprotocol.v1.PiiOuterClass$Pii):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-120353814 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPlacementId(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-120353814 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setPlacementId(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-120353814 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPlacementId(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPlacementId(java.lang.String):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-289761977 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPlacementIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-289761977 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setPlacementIdBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-289761977 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPlacementIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setPlacementIdBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-936331765 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setScarSignalsCollected(boolean):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-936331765 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setScarSignalsCollected(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-936331765 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setScarSignalsCollected(boolean):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setScarSignalsCollected(boolean):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1280598869 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1280598869 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1280598869 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2030515241 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2030515241 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2030515241 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (10385370 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionToken(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (10385370 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setSessionToken(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (10385370 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionToken(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setSessionToken(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-829548909 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-829548909 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-829548909 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1340041238 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1340041238 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1340041238 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-923669626 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTcf(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-923669626 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTcf(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-923669626 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTcf(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTcf(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (513280607 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (513280607 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (513280607 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (494422478 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (494422478 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (494422478 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1030068566 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1030068566 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1030068566 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-575085430 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-575085430 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-575085430 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2124716358 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2124716358 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2124716358 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (789762656 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (789762656 > 392004)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (789762656 > 392004) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1359818278 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenId(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1359818278 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenId(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1359818278 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenId(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenId(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-312732950 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenNumber(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-312732950 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenNumber(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-312732950 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenNumber(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder.setTokenNumber(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1166767962 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.<clinit>():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1166767962 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1166767962 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.<clinit>():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (434047238 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.<init>():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (434047238 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private HeaderBiddingToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (434047238 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.<init>():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1875708910 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1875708910 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1875708910 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2083348808 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, int):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2083348808 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2083348808 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, int):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-913704744 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-913704744 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-913704744 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1067782749 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1067782749 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1067782749 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1259766414 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1259766414 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1259766414 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-541579490 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-541579490 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-541579490 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (158047924 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (158047924 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (158047924 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1128970410 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1128970410 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1128970410 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1358671170 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1358671170 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1358671170 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (672605802 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (672605802 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (672605802 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$1900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1582857508 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1582857508 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1582857508 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-682993018 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-682993018 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-682993018 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2023691230 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2023691230 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2023691230 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1465140026 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1465140026 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1465140026 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-807186146 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-807186146 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-807186146 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (605628053 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (605628053 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (605628053 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1007604772 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1007604772 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1007604772 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1200925500 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1200925500 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1200925500 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2119231306 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2119231306 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2119231306 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1297602403 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1297602403 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$2900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1297602403 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$2900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1279853462 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1279853462 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.PiiOuterClass.Pii r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1279853462 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.PiiOuterClass$Pii):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1775446146 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1775446146 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.PiiOuterClass.Pii r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1775446146 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.PiiOuterClass$Pii):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-504023498 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-504023498 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-504023498 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1879325174 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1879325174 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1879325174 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2027437441 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2027437441 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.CampaignStateOuterClass.CampaignState r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2027437441 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-833099374 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-833099374 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-833099374 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1703717288 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1703717288 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1703717288 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1048904278 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1048904278 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1048904278 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-276979212 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, boolean):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-276979212 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-276979212 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, boolean):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (287036990 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (287036990 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$3900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (287036990 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$3900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1056295823 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1056295823 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1056295823 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-729863198 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-729863198 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-729863198 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1153147785 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1153147785 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1153147785 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1040421582 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1040421582 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.InitializationDataOuterClass.InitializationData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1040421582 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1727023963 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1727023963 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.InitializationDataOuterClass.InitializationData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1727023963 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-786581094 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-786581094 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-786581094 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (477527718 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, int):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (477527718 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (477527718 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, int):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1271340658 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1271340658 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1271340658 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (53213040 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (53213040 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (53213040 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-95012420 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-95012420 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$4900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.TestDataOuterClass.TestData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-95012420 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$4900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TestDataOuterClass$TestData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (544225553 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (544225553 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.TestDataOuterClass.TestData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (544225553 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.TestDataOuterClass$TestData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-670137024 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-670137024 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-670137024 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (818805 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (818805 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (818805 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (845841990 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (845841990 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (845841990 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (203768640 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (203768640 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (203768640 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1958538122 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, boolean):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1958538122 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1958538122 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, boolean):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1335077646 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1335077646 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1335077646 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-690114246 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):java.util.Map, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-690114246 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ java.util.Map access$5700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-690114246 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):java.util.Map, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2066129170 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2066129170 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2066129170 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2030702407 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2030702407 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$5900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2030702407 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$5900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1376431471 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1376431471 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1376431471 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1333580540 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1333580540 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1333580540 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (847727022 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (847727022 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (847727022 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1316550145 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1316550145 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1316550145 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1669778596 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1669778596 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.AdRequestOuterClass.BannerSize r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1669778596 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1328077375 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1328077375 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, gatewayprotocol.v1.AdRequestOuterClass.BannerSize r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1328077375 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (20437268 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (20437268 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (20437268 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (78605666 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (78605666 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (78605666 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6700(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-723621409 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-723621409 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-723621409 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6800(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1667465034 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1667465034 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$6900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1667465034 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$6900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2031229314 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2031229314 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$7000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2031229314 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7000(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (501860546 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (501860546 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$7100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (501860546 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-830236215 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-830236215 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$7200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-830236215 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$7200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-606458190 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$800():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-606458190 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken access$800() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-606458190 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$800():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$800():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (453225442 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (453225442 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (453225442 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.access$900(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1747141042 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearAdFormat():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1747141042 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1747141042 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearAdFormat():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearAdFormat():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (50014718 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearBannerSize():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (50014718 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearBannerSize() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (50014718 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearBannerSize():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearBannerSize():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (393966103 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearCampaignState():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (393966103 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (393966103 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearCampaignState():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearCampaignState():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2109352756 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearClientInfo():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2109352756 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearClientInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2109352756 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearClientInfo():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearClientInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (176522092 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearDynamicDeviceInfo():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (176522092 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (176522092 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearDynamicDeviceInfo():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearDynamicDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (629862662 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearExternalUserIdentifier():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (629862662 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearExternalUserIdentifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (629862662 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearExternalUserIdentifier():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearExternalUserIdentifier():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (293408938 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearInitializationData():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (293408938 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearInitializationData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (293408938 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearInitializationData():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearInitializationData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2043704636 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearLimitedSessionToken():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2043704636 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearLimitedSessionToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2043704636 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearLimitedSessionToken():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearLimitedSessionToken():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1002394176 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearMediationAdUnitId():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1002394176 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearMediationAdUnitId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1002394176 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearMediationAdUnitId():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearMediationAdUnitId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1207507660 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearMediationInfo():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1207507660 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearMediationInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1207507660 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearMediationInfo():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearMediationInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2110503766 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearOfferwallEnabled():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2110503766 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearOfferwallEnabled() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2110503766 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearOfferwallEnabled():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearOfferwallEnabled():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (17462658 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearPii():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (17462658 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearPii() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (17462658 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearPii():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearPii():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-854535256 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearPlacementId():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-854535256 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-854535256 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearPlacementId():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearPlacementId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1751455876 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearScarSignalsCollected():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1751455876 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearScarSignalsCollected() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1751455876 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearScarSignalsCollected():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearScarSignalsCollected():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1252301174 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearSessionCounters():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1252301174 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1252301174 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearSessionCounters():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearSessionCounters():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-693675970 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearSessionToken():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-693675970 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearSessionToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-693675970 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearSessionToken():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearSessionToken():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1000054824 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearStaticDeviceInfo():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1000054824 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1000054824 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearStaticDeviceInfo():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearStaticDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (649072751 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTcf():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (649072751 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearTcf() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (649072751 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTcf():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTcf():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1770110190 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTestData():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1770110190 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearTestData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1770110190 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTestData():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTestData():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-448647060 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTimestamps():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-448647060 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearTimestamps() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-448647060 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTimestamps():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTimestamps():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (51306677 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenCounters():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (51306677 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearTokenCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (51306677 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenCounters():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenCounters():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (968832053 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenId():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (968832053 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearTokenId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (968832053 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenId():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-908584374 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenNumber():void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-908584374 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearTokenNumber() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-908584374 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenNumber():void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.clearTokenNumber():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-172870380 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getDefaultInstance():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-172870380 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-172870380 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getDefaultInstance():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getDefaultInstance():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1544009050 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMutableExtrasMap():java.util.Map<java.lang.String, java.lang.String>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1544009050 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private java.util.Map<java.lang.String, java.lang.String> getMutableExtrasMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1544009050 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMutableExtrasMap():java.util.Map<java.lang.String, java.lang.String>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMutableExtrasMap():java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (383661186 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.internalGetExtras():com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (383661186 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetExtras() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (383661186 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.internalGetExtras():com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.internalGetExtras():com.google.protobuf.MapFieldLite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1310063522 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.internalGetMutableExtras():com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1310063522 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableExtras() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1310063522 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.internalGetMutableExtras():com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.internalGetMutableExtras():com.google.protobuf.MapFieldLite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1399053260 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1399053260 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1399053260 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1203173946 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1203173946 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1203173946 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1913988401 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1913988401 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1913988401 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (443450487 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (443450487 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (443450487 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-386260578 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-386260578 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-386260578 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1167235751 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1167235751 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1167235751 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1123137846 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1123137846 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1123137846 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1296709608 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergePii(gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1296709608 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergePii(gatewayprotocol.v1.PiiOuterClass.Pii r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1296709608 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergePii(gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergePii(gatewayprotocol.v1.PiiOuterClass$Pii):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-334602536 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-334602536 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-334602536 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (444373471 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (444373471 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (444373471 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (443411104 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (443411104 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeTestData(gatewayprotocol.v1.TestDataOuterClass.TestData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (443411104 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (827153432 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (827153432 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (827153432 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-674221364 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-674221364 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-674221364 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1145187644 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1145187644 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1145187644 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (214172344 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (214172344 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (214172344 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1756363533 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1756363533 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1756363533 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1096236678 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1096236678 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1096236678 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2068274182 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2068274182 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2068274182 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1047216998 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1047216998 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1047216998 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-387418249 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-387418249 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-387418249 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-325491964 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-325491964 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-325491964 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2093837738 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2093837738 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2093837738 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2073033246 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2073033246 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2073033246 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1522363937 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1522363937 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1522363937 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1866066710 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1866066710 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1866066710 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1362299763 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(byte[]):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1362299763 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1362299763 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(byte[]):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(byte[]):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (29659478 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (29659478 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (29659478 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-633486333 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parser():com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-633486333 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-633486333 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parser():com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-747176174 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-747176174 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-747176174 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setAdFormat(gatewayprotocol.v1.AdFormatOuterClass$AdFormat):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2079563423 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setAdFormatValue(int):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2079563423 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2079563423 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setAdFormatValue(int):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setAdFormatValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1798462862 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1798462862 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1798462862 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setBannerSize(gatewayprotocol.v1.AdRequestOuterClass$BannerSize):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1516283671 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1516283671 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1516283671 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass$CampaignState):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-747611686 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-747611686 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-747611686 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1856400098 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1856400098 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1856400098 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1340916063 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setExternalUserIdentifier(java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1340916063 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setExternalUserIdentifier(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1340916063 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setExternalUserIdentifier(java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setExternalUserIdentifier(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-953952049 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setExternalUserIdentifierBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-953952049 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setExternalUserIdentifierBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-953952049 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setExternalUserIdentifierBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setExternalUserIdentifierBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-640345833 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-640345833 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-640345833 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass$InitializationData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (532318862 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (532318862 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (532318862 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1142896866 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationAdUnitId(java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1142896866 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setMediationAdUnitId(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1142896866 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationAdUnitId(java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationAdUnitId(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1396559335 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationAdUnitIdBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1396559335 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setMediationAdUnitIdBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1396559335 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationAdUnitIdBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationAdUnitIdBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1097588013 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1097588013 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1097588013 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setMediationInfo(gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-569329025 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setOfferwallEnabled(boolean):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-569329025 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setOfferwallEnabled(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-569329025 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setOfferwallEnabled(boolean):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setOfferwallEnabled(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (210810162 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPii(gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (210810162 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setPii(gatewayprotocol.v1.PiiOuterClass.Pii r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (210810162 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPii(gatewayprotocol.v1.PiiOuterClass$Pii):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPii(gatewayprotocol.v1.PiiOuterClass$Pii):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1847043770 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPlacementId(java.lang.String):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1847043770 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1847043770 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPlacementId(java.lang.String):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPlacementId(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1510243875 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPlacementIdBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1510243875 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1510243875 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPlacementIdBytes(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setPlacementIdBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1864746494 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setScarSignalsCollected(boolean):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1864746494 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setScarSignalsCollected(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1864746494 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setScarSignalsCollected(boolean):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setScarSignalsCollected(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (886941807 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (886941807 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (886941807 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1743382454 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setSessionToken(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1743382454 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setSessionToken(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1743382454 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setSessionToken(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setSessionToken(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1937753834 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1937753834 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1937753834 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1855284516 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTcf(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1855284516 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTcf(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1855284516 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTcf(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTcf(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1648447816 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1648447816 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1648447816 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTestData(gatewayprotocol.v1.TestDataOuterClass$TestData):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1577504374 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1577504374 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1577504374 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTimestamps(gatewayprotocol.v1.TimestampsOuterClass$Timestamps):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1327178272 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1327178272 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1327178272 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1002286706 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenId(com.google.protobuf.ByteString):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1002286706 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTokenId(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1002286706 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenId(com.google.protobuf.ByteString):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenId(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (902894554 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenNumber(int):void, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (902894554 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTokenNumber(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (902894554 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenNumber(int):void, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.setTokenNumber(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-769146555 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.containsExtras(java.lang.String):boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-769146555 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean containsExtras(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-769146555 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.containsExtras(java.lang.String):boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.containsExtras(java.lang.String):boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-61683964 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-61683964 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-61683964 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1514870522 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1514870522 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1514870522 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getAdFormat():gatewayprotocol.v1.AdFormatOuterClass$AdFormat");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (847383183 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getAdFormatValue():int, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (847383183 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public int getAdFormatValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (847383183 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getAdFormatValue():int, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getAdFormatValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1636935420 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getBannerSize():gatewayprotocol.v1.AdRequestOuterClass$BannerSize, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1636935420 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1636935420 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getBannerSize():gatewayprotocol.v1.AdRequestOuterClass$BannerSize, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getBannerSize():gatewayprotocol.v1.AdRequestOuterClass$BannerSize");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (121780465 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (121780465 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (121780465 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getCampaignState():gatewayprotocol.v1.CampaignStateOuterClass$CampaignState");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1835290338 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getClientInfo():gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1835290338 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1835290338 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getClientInfo():gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getClientInfo():gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1554965554 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1554965554 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1554965554 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1070766394 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExternalUserIdentifier():java.lang.String, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1070766394 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public java.lang.String getExternalUserIdentifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1070766394 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExternalUserIdentifier():java.lang.String, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExternalUserIdentifier():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (991426536 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExternalUserIdentifierBytes():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (991426536 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getExternalUserIdentifierBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (991426536 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExternalUserIdentifierBytes():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExternalUserIdentifierBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (543970870 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtras():java.util.Map<java.lang.String, java.lang.String>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (543970870 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, java.lang.String> getExtras() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (543970870 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtras():java.util.Map<java.lang.String, java.lang.String>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtras():java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (102087981 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasCount():int, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (102087981 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public int getExtrasCount() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (102087981 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasCount():int, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasCount():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-977201180 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasMap():java.util.Map<java.lang.String, java.lang.String>, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-977201180 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public java.util.Map<java.lang.String, java.lang.String> getExtrasMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-977201180 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasMap():java.util.Map<java.lang.String, java.lang.String>, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasMap():java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1108843362 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasOrDefault(java.lang.String, java.lang.String):java.lang.String, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1108843362 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public java.lang.String getExtrasOrDefault(java.lang.String r1, java.lang.String r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1108843362 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasOrDefault(java.lang.String, java.lang.String):java.lang.String, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasOrDefault(java.lang.String, java.lang.String):java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1849417582 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasOrThrow(java.lang.String):java.lang.String, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1849417582 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public java.lang.String getExtrasOrThrow(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1849417582 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasOrThrow(java.lang.String):java.lang.String, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getExtrasOrThrow(java.lang.String):java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1743787018 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getInitializationData():gatewayprotocol.v1.InitializationDataOuterClass$InitializationData, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1743787018 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getInitializationData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1743787018 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getInitializationData():gatewayprotocol.v1.InitializationDataOuterClass$InitializationData, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getInitializationData():gatewayprotocol.v1.InitializationDataOuterClass$InitializationData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-67544548 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getLimitedSessionToken():gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-67544548 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-67544548 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getLimitedSessionToken():gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getLimitedSessionToken():gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-264642946 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationAdUnitId():java.lang.String, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-264642946 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public java.lang.String getMediationAdUnitId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-264642946 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationAdUnitId():java.lang.String, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationAdUnitId():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1330577857 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationAdUnitIdBytes():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1330577857 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getMediationAdUnitIdBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1330577857 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationAdUnitIdBytes():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationAdUnitIdBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1269818017 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationInfo():gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1269818017 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo getMediationInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1269818017 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationInfo():gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getMediationInfo():gatewayprotocol.v1.MediationInfoOuterClass$MediationInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2103633845 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getOfferwallEnabled():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2103633845 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean getOfferwallEnabled() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2103633845 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getOfferwallEnabled():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getOfferwallEnabled():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-654382002 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPii():gatewayprotocol.v1.PiiOuterClass$Pii, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-654382002 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-654382002 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPii():gatewayprotocol.v1.PiiOuterClass$Pii, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPii():gatewayprotocol.v1.PiiOuterClass$Pii");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2002794296 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPlacementId():java.lang.String, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2002794296 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public java.lang.String getPlacementId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2002794296 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPlacementId():java.lang.String, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPlacementId():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1511882314 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1511882314 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getPlacementIdBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1511882314 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPlacementIdBytes():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getPlacementIdBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (647747838 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getScarSignalsCollected():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (647747838 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean getScarSignalsCollected() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (647747838 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getScarSignalsCollected():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getScarSignalsCollected():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1022026584 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1022026584 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1022026584 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getSessionCounters():gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-221970662 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getSessionToken():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-221970662 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getSessionToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-221970662 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getSessionToken():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getSessionToken():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1785186987 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1785186987 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1785186987 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2036197937 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTcf():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2036197937 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getTcf() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2036197937 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTcf():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTcf():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2035092098 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTestData():gatewayprotocol.v1.TestDataOuterClass$TestData, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2035092098 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2035092098 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTestData():gatewayprotocol.v1.TestDataOuterClass$TestData, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTestData():gatewayprotocol.v1.TestDataOuterClass$TestData");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (389032026 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTimestamps():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (389032026 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (389032026 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTimestamps():gatewayprotocol.v1.TimestampsOuterClass$Timestamps, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTimestamps():gatewayprotocol.v1.TimestampsOuterClass$Timestamps");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1332625466 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1332625466 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1332625466 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenCounters():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1499332136 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenId():com.google.protobuf.ByteString, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1499332136 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getTokenId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1499332136 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenId():com.google.protobuf.ByteString, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenId():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1182806176 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenNumber():int, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1182806176 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public int getTokenNumber() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1182806176 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenNumber():int, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.getTokenNumber():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2086435864 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasAdFormat():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2086435864 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasAdFormat() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2086435864 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasAdFormat():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasAdFormat():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-824101536 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasBannerSize():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-824101536 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasBannerSize() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-824101536 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasBannerSize():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasBannerSize():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-105704874 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasCampaignState():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-105704874 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasCampaignState() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-105704874 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasCampaignState():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasCampaignState():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (749653814 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasClientInfo():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (749653814 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasClientInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (749653814 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasClientInfo():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasClientInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1927065150 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasDynamicDeviceInfo():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1927065150 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1927065150 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasDynamicDeviceInfo():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasDynamicDeviceInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1332649194 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasExternalUserIdentifier():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1332649194 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasExternalUserIdentifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1332649194 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasExternalUserIdentifier():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasExternalUserIdentifier():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1972606339 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasInitializationData():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1972606339 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasInitializationData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1972606339 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasInitializationData():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasInitializationData():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-782898510 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasLimitedSessionToken():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-782898510 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasLimitedSessionToken() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-782898510 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasLimitedSessionToken():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasLimitedSessionToken():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1226159721 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasMediationAdUnitId():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1226159721 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasMediationAdUnitId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1226159721 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasMediationAdUnitId():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasMediationAdUnitId():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2088762830 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasMediationInfo():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2088762830 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasMediationInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2088762830 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasMediationInfo():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasMediationInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1075430789 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasOfferwallEnabled():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1075430789 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasOfferwallEnabled() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1075430789 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasOfferwallEnabled():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasOfferwallEnabled():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1349041813 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasPii():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1349041813 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasPii() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1349041813 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasPii():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasPii():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1818488321 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasScarSignalsCollected():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1818488321 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasScarSignalsCollected() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1818488321 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasScarSignalsCollected():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasScarSignalsCollected():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2003631641 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasSessionCounters():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2003631641 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasSessionCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2003631641 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasSessionCounters():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasSessionCounters():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1884968364 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasStaticDeviceInfo():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1884968364 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1884968364 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasStaticDeviceInfo():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasStaticDeviceInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1735773544 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTcf():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1735773544 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTcf() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1735773544 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTcf():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTcf():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1227521666 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTestData():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1227521666 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTestData() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1227521666 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTestData():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTestData():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1464451922 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTimestamps():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1464451922 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTimestamps() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1464451922 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTimestamps():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTimestamps():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (264367907 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTokenCounters():boolean, file: classes26.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (264367907 > 358328)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTokenCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (264367907 > 358328) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTokenCounters():boolean, file: classes26.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.hasTokenCounters():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes49.dex */
    public interface HeaderBiddingTokenOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        AdRequestOuterClass.BannerSize getBannerSize();

        CampaignStateOuterClass.CampaignState getCampaignState();

        ClientInfoOuterClass.ClientInfo getClientInfo();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        String getExternalUserIdentifier();

        ByteString getExternalUserIdentifierBytes();

        @Deprecated
        Map<String, String> getExtras();

        int getExtrasCount();

        Map<String, String> getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        InitializationDataOuterClass.InitializationData getInitializationData();

        UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken();

        String getMediationAdUnitId();

        ByteString getMediationAdUnitIdBytes();

        MediationInfoOuterClass.MediationInfo getMediationInfo();

        boolean getOfferwallEnabled();

        PiiOuterClass.Pii getPii();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        boolean getScarSignalsCollected();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        ByteString getSessionToken();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        TestDataOuterClass.TestData getTestData();

        TimestampsOuterClass.Timestamps getTimestamps();

        TokenCounters getTokenCounters();

        ByteString getTokenId();

        int getTokenNumber();

        boolean hasAdFormat();

        boolean hasBannerSize();

        boolean hasCampaignState();

        boolean hasClientInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasExternalUserIdentifier();

        boolean hasInitializationData();

        boolean hasLimitedSessionToken();

        boolean hasMediationAdUnitId();

        boolean hasMediationInfo();

        boolean hasOfferwallEnabled();

        boolean hasPii();

        boolean hasScarSignalsCollected();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasTestData();

        boolean hasTimestamps();

        boolean hasTokenCounters();
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes7.dex */
    public static final class TokenCounters extends GeneratedMessageLite<TokenCounters, Builder> implements TokenCountersOrBuilder {
        private static final TokenCounters DEFAULT_INSTANCE = null;
        private static volatile Parser<TokenCounters> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        public static final int STARTS_FIELD_NUMBER = 3;
        public static final int WINS_FIELD_NUMBER = 2;
        private int seq_;
        private int starts_;
        private int wins_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes28.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<TokenCounters, Builder> implements TokenCountersOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1824863958 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.<init>():void, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1824863958 < 0)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1824863958 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.<init>():void, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1043649878 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.<init>(t81):void, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1043649878 > 401788)
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
            public /* synthetic */ Builder(p000.t81 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1043649878 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.<init>(t81):void, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.<init>(t81):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-549458058 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearSeq():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-549458058 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearSeq() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-549458058 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearSeq():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearSeq():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (820879266 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearStarts():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (820879266 > 401788)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearStarts() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (820879266 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearStarts():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearStarts():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (139413155 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearWins():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (139413155 > 401788)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearWins() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (139413155 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearWins():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.clearWins():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1440875804 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getSeq():int, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1440875804 > 401788)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
            public int getSeq() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1440875804 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getSeq():int, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getSeq():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1429462706 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getStarts():int, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1429462706 > 401788)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
            public int getStarts() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1429462706 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getStarts():int, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getStarts():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1851992354 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getWins():int, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1851992354 < 0)
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
            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
            public int getWins() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1851992354 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getWins():int, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.getWins():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2043546478 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setSeq(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2043546478 > 401788)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setSeq(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2043546478 > 401788) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setSeq(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setSeq(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-872752917 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setStarts(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-872752917 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setStarts(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-872752917 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setStarts(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setStarts(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-247766515 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setWins(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-247766515 < 0)
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
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setWins(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-247766515 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setWins(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder.setWins(int):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2001356126 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.<clinit>():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2001356126 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2001356126 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.<clinit>():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1852884368 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.<init>():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1852884368 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private TokenCounters() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1852884368 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.<init>():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-883738142 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$000():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-883738142 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-883738142 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$000():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$000():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1207406086 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1207406086 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1207406086 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$100(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-220689530 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-220689530 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-220689530 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$200(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-824951267 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-824951267 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-824951267 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$300(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1962338241 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1962338241 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1962338241 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$400(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1049838297 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1049838297 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1049838297 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$500(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2107601707 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2107601707 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2107601707 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.access$600(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-261662232 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearSeq():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-261662232 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearSeq() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-261662232 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearSeq():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearSeq():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1007014684 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearStarts():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1007014684 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearStarts() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1007014684 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearStarts():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearStarts():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1497765428 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearWins():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1497765428 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearWins() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1497765428 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearWins():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.clearWins():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (394393396 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getDefaultInstance():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (394393396 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (394393396 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getDefaultInstance():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getDefaultInstance():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1412937698 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1412937698 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1412937698 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder():gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1137181734 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1137181734 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1137181734 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-501459230 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-501459230 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-501459230 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (720437002 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (720437002 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (720437002 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1076614346 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1076614346 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1076614346 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1411824978 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1411824978 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1411824978 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-888759090 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-888759090 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-888759090 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-730839796 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-730839796 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-730839796 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-290621506 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-290621506 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-290621506 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.io.InputStream):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (170911234 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (170911234 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (170911234 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (434846230 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (434846230 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (434846230 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (397158366 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (397158366 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (397158366 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1773261784 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(byte[]):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1773261784 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1773261784 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(byte[]):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(byte[]):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1093053994 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1093053994 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1093053994 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1834135906 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parser():com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters>, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1834135906 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1834135906 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parser():com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCounters>, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1025193754 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setSeq(int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1025193754 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setSeq(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1025193754 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setSeq(int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setSeq(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-233363118 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setStarts(int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-233363118 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setStarts(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-233363118 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setStarts(int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setStarts(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-720622806 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setWins(int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-720622806 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setWins(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-720622806 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setWins(int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.setWins(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1284005166 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1284005166 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1284005166 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1135203809 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getSeq():int, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1135203809 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
        public int getSeq() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1135203809 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getSeq():int, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getSeq():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2007839898 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getStarts():int, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2007839898 > 408588)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
        public int getStarts() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2007839898 > 408588) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getStarts():int, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getStarts():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-206600086 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getWins():int, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-206600086 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
        public int getWins() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-206600086 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getWins():int, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getWins():int");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public interface TokenCountersOrBuilder extends MessageLiteOrBuilder {
        int getSeq();

        int getStarts();

        int getWins();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2068948382 > 383840) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.<init>():void, file: classes24.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2068948382 > 383840)
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
    private HeaderBiddingTokenOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2068948382 > 383840) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.<init>():void, file: classes24.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1535387328 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes24.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1535387328 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1535387328 < 0) in method: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes24.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.HeaderBiddingTokenOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

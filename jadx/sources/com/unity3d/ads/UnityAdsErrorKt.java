package com.unity3d.ads;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes34.dex */
public final class UnityAdsErrorKt {
    private static final String BOLD_LOAD_FAIL_MSG_PREF = "Unity Ads SDK ad load failed:";
    public static final String MSG_BOLD_LOAD_FAIL_INSUFFICIENT_STORAGE = "Unity Ads SDK ad load failed: Insufficient storage space on the device. Free up space and try again.";
    public static final String MSG_BOLD_LOAD_FAIL_NETWORK_ERROR = "Unity Ads SDK ad load failed: Network error occurred. Check your network connection and try again later.";
    public static final String MSG_BOLD_LOAD_FAIL_NO_FILL = "Unity Ads SDK ad load failed: No ad fill available for the requested placement.";
    public static final String MSG_BOLD_LOAD_FAIL_PARSING_ERROR = "Unity Ads SDK ad load failed: Internal error occurred while parsing ad response.";
    public static final String MSG_BOLD_LOAD_FAIL_PLACEMENT_NOT_FOUND = "Unity Ads SDK ad load failed: Placement not found. Use the correct placement ID from your Unity Ads Monetization dashboard.";
    public static final String MSG_BOLD_LOAD_FAIL_PROTO_ERROR = "Unity Ads SDK ad load failed: Internal protocol error occurred. Try again later.";
    public static final String MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED = "Unity Ads SDK ad load failed: The Unity Ads SDK is not initialized. Initialize the SDK before loading ads.";
    public static final String MSG_BOLD_LOAD_FAIL_TIME_OUT = "Unity Ads SDK ad load failed: Request timed out. Check your network connection and try again later.\n";
    public static final String MSG_BOLD_LOAD_FAIL_UNSUPPORTED_PLACEMENT = "Unity Ads SDK ad load failed: The placement ID doesn’t match the ad format or the placement type. Check your placement settings in the Monetization dashboard.";
    public static final String MSG_BOLD_SHOW_FAIL_AD_OBJECT_EXPIRED = "Unity Ads SDK ad show failed: The ad has expired. Load a new ad.";
    public static final String MSG_BOLD_SHOW_FAIL_ALREADY_SHOWING = "Unity Ads SDK ad show failed: An ad is already being shown. Wait until the current ad finishes before showing a new one.";
    public static final String MSG_BOLD_SHOW_FAIL_INTERNAL_ERROR = "Unity Ads SDK ad show failed: Internal error occurred.";
    public static final String MSG_BOLD_SHOW_FAIL_TIMEOUT = "Unity Ads SDK ad show failed: Request timed out. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_GAME_NOT_FOUND = "Invalid Game ID: %s. Verify the Game ID in your Unity Ads Monetization dashboard.";
    public static final String MSG_INIT_FAIL_INSUFFICIENT_STORAGE = "Unity Ads SDK initialization failed: Insufficient storage space on the device. Free up space and try again.";
    public static final String MSG_INIT_FAIL_NETWORK_ERROR = "Unity Ads SDK initialization failed: Network error occurred. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_PARSING_ERROR = "Unity Ads SDK initialization failed: Internal protocol error occurred.Try again later.";
    public static final String MSG_INIT_FAIL_SYSTEM_ERROR = "Unity Ads SDK initialization failed: System error occurred. Try again later.";
    public static final String MSG_INIT_FAIL_TIMEOUT = "Unity Ads SDK initialization failed: Request timed out. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_UNKNOWN_ERROR = "Unity Ads SDK initialization failed: Unknown error occurred.";
    public static final String MSG_INIT_FAIL_WRONG_PLATFORM = "Unity Ads SDK initialization failed: Game ID mismatch. Use the correct Game ID for the target platform from your Unity Ads Monetization dashboard.";

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes14.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-21564070 < 0) in method: com.unity3d.ads.UnityAdsErrorKt.getInitErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode, java.lang.String):java.lang.String, file: classes34.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-21564070 < 0)
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
    public static final java.lang.String getInitErrorMsg(gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode r0, java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-21564070 < 0) in method: com.unity3d.ads.UnityAdsErrorKt.getInitErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode, java.lang.String):java.lang.String, file: classes34.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.UnityAdsErrorKt.getInitErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode, java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (162962527 > 358344) in method: com.unity3d.ads.UnityAdsErrorKt.getInitErrorMsg$default(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode, java.lang.String, int, java.lang.Object):java.lang.String, file: classes34.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (162962527 > 358344)
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
    public static /* synthetic */ java.lang.String getInitErrorMsg$default(gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode r0, java.lang.String r1, int r2, java.lang.Object r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (162962527 > 358344) in method: com.unity3d.ads.UnityAdsErrorKt.getInitErrorMsg$default(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode, java.lang.String, int, java.lang.Object):java.lang.String, file: classes34.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.UnityAdsErrorKt.getInitErrorMsg$default(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode, java.lang.String, int, java.lang.Object):java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1583952213 > 358344) in method: com.unity3d.ads.UnityAdsErrorKt.getLoadErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode):java.lang.String, file: classes34.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1583952213 > 358344)
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
    public static final java.lang.String getLoadErrorMsg(gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1583952213 > 358344) in method: com.unity3d.ads.UnityAdsErrorKt.getLoadErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode):java.lang.String, file: classes34.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.UnityAdsErrorKt.getLoadErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode):java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-539912862 < 0) in method: com.unity3d.ads.UnityAdsErrorKt.getShowErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode):java.lang.String, file: classes34.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-539912862 < 0)
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
    public static final java.lang.String getShowErrorMsg(gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-539912862 < 0) in method: com.unity3d.ads.UnityAdsErrorKt.getShowErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode):java.lang.String, file: classes34.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.UnityAdsErrorKt.getShowErrorMsg(gatewayprotocol.v1.ErrorOuterClass$PublicErrorCode):java.lang.String");
    }
}

package com.ironsource.adqualitysdk.sdk;

import android.content.Context;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
@Deprecated
/* loaded from: classes36.dex */
public abstract class IronSourceAdQuality {

    @Deprecated
    public static final String TAG = "ISAdQuality Agent SDK";

    @Deprecated
    public static final String VERSION = "9.9.0";

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-595969061 < 0) in method: com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance():com.ironsource.adqualitysdk.sdk.IronSourceAdQuality, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-595969061 < 0)
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
    @java.lang.Deprecated
    public static com.ironsource.adqualitysdk.sdk.IronSourceAdQuality getInstance() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-595969061 < 0) in method: com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance():com.ironsource.adqualitysdk.sdk.IronSourceAdQuality, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance():com.ironsource.adqualitysdk.sdk.IronSourceAdQuality");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (552460601 > 411420) in method: com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getSDKVersion():java.lang.String, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (552460601 > 411420)
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
    @java.lang.Deprecated
    public static java.lang.String getSDKVersion() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (552460601 > 411420) in method: com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getSDKVersion():java.lang.String, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getSDKVersion():java.lang.String");
    }

    @Deprecated
    public abstract void changeUserId(String str);

    @Deprecated
    public abstract void initialize(Context context, String str);

    @Deprecated
    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    public abstract void initializeWithGameId(Context context, String str);

    public abstract void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    @Deprecated
    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    @Deprecated
    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void setMetaData(String str, String str2);

    @Deprecated
    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z);

    @Deprecated
    public abstract void shutdown();
}

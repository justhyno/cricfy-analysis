package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.CacheAssets;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes18.dex */
public final class AndroidWebViewLessLoadStrategy implements WebViewLessLoadStrategy {
    private final AdRefresh adRefresh;
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final CampaignRepository campaignRepository;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-954610882 < 0) in method: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.<init>(com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.domain.CacheAssets, com.unity3d.ads.core.domain.AdRefresh, com.unity3d.ads.core.data.repository.SessionRepository):void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-954610882 < 0)
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
    public AndroidWebViewLessLoadStrategy(com.unity3d.ads.core.data.repository.AdRepository r1, com.unity3d.ads.core.data.repository.CampaignRepository r2, com.unity3d.ads.core.domain.CacheAssets r3, com.unity3d.ads.core.domain.AdRefresh r4, com.unity3d.ads.core.data.repository.SessionRepository r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-954610882 < 0) in method: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.<init>(com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.domain.CacheAssets, com.unity3d.ads.core.domain.AdRefresh, com.unity3d.ads.core.data.repository.SessionRepository):void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.<init>(com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.data.repository.CampaignRepository, com.unity3d.ads.core.domain.CacheAssets, com.unity3d.ads.core.domain.AdRefresh, com.unity3d.ads.core.data.repository.SessionRepository):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1639061046 > 348964) in method: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.invoke(y60, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, z50):java.lang.Object, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1639061046 > 348964)
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
    @Override // com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy
    public java.lang.Object invoke(p000.y60 r1, java.lang.String r2, com.unity3d.ads.UnityAdsLoadOptions r3, com.google.protobuf.ByteString r4, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r5, java.lang.String r6, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r7, boolean r8, p000.z50 r9) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1639061046 > 348964) in method: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.invoke(y60, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, z50):java.lang.Object, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.invoke(y60, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, z50):java.lang.Object");
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import p000.kk3;
import p000.q41;
import p000.sb0;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
@sb0(m8983c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1", m8984f = "AndroidHandleGatewayAdResponse.kt", m8985l = {214, 215}, m8986m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AndroidHandleGatewayAdResponse$invoke$loadWebView$1 extends kk3 implements q41 {
    final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticAdType $adType;
    final /* synthetic */ AdObject $eagerAdObject;
    final /* synthetic */ String $eagerBase64ImpressionConfig;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ String $webViewUrl;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (277064442 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.<init>(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, com.unity3d.ads.core.data.model.AdObject, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, java.lang.String, z50):void, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (277064442 > 385712)
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
    public AndroidHandleGatewayAdResponse$invoke$loadWebView$1(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r1, com.unity3d.ads.core.data.model.AdObject r2, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r3, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r4, java.lang.String r5, java.lang.String r6, p000.z50 r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (277064442 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.<init>(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, com.unity3d.ads.core.data.model.AdObject, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, java.lang.String, z50):void, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.<init>(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse, com.unity3d.ads.core.data.model.AdObject, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, java.lang.String, z50):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (70285963 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.create(java.lang.Object, z50):z50, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (70285963 > 385712)
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
    @Override // p000.ql
    public final p000.z50 create(java.lang.Object r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (70285963 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.create(java.lang.Object, z50):z50, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.create(java.lang.Object, z50):z50");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1654611961 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invoke(com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1654611961 > 385712)
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
    public final java.lang.Object invoke(com.unity3d.ads.adplayer.WebViewContainer r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1654611961 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invoke(com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invoke(com.unity3d.ads.adplayer.WebViewContainer, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1190656554 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1190656554 < 0)
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
    @Override // p000.q41
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1190656554 < 0) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1537262191 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes2.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1537262191 > 385712)
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
    @Override // p000.ql
    public final java.lang.Object invokeSuspend(java.lang.Object r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1537262191 > 385712) in method: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes2.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

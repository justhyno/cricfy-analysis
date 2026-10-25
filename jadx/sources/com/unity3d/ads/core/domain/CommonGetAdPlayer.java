package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import p000.o60;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes45.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final AdRepository adRepository;
    private final Context context;
    private final CurrentActivityDataSource currentActivityDataSource;
    private final o60 defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final OrientationRepository orientationRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-3836874 < 0) in method: com.unity3d.ads.core.domain.CommonGetAdPlayer.<init>(com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, o60, com.unity3d.ads.core.data.repository.OpenMeasurementRepository, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.data.datasource.LifecycleDataSource, com.unity3d.ads.core.data.repository.OrientationRepository, android.content.Context, com.unity3d.ads.core.data.datasource.CurrentActivityDataSource):void, file: classes45.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-3836874 < 0)
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
    public CommonGetAdPlayer(com.unity3d.ads.core.data.repository.DeviceInfoRepository r1, com.unity3d.ads.core.data.repository.SessionRepository r2, com.unity3d.ads.core.domain.SendDiagnosticEvent r3, p000.o60 r4, com.unity3d.ads.core.data.repository.OpenMeasurementRepository r5, com.unity3d.ads.core.data.manager.OfferwallManager r6, com.unity3d.ads.core.data.repository.AdRepository r7, com.unity3d.ads.core.data.datasource.LifecycleDataSource r8, com.unity3d.ads.core.data.repository.OrientationRepository r9, android.content.Context r10, com.unity3d.ads.core.data.datasource.CurrentActivityDataSource r11) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-3836874 < 0) in method: com.unity3d.ads.core.domain.CommonGetAdPlayer.<init>(com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, o60, com.unity3d.ads.core.data.repository.OpenMeasurementRepository, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.data.datasource.LifecycleDataSource, com.unity3d.ads.core.data.repository.OrientationRepository, android.content.Context, com.unity3d.ads.core.data.datasource.CurrentActivityDataSource):void, file: classes45.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetAdPlayer.<init>(com.unity3d.ads.core.data.repository.DeviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent, o60, com.unity3d.ads.core.data.repository.OpenMeasurementRepository, com.unity3d.ads.core.data.manager.OfferwallManager, com.unity3d.ads.core.data.repository.AdRepository, com.unity3d.ads.core.data.datasource.LifecycleDataSource, com.unity3d.ads.core.data.repository.OrientationRepository, android.content.Context, com.unity3d.ads.core.data.datasource.CurrentActivityDataSource):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (666630784 > 376640) in method: com.unity3d.ads.core.domain.CommonGetAdPlayer.invoke(com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.WebViewContainer, com.unity3d.ads.core.data.model.AdObject, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType):com.unity3d.ads.adplayer.AdPlayer, file: classes45.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (666630784 > 376640)
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
    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public com.unity3d.ads.adplayer.AdPlayer invoke(com.unity3d.ads.adplayer.WebViewBridge r1, com.unity3d.ads.adplayer.WebViewContainer r2, com.unity3d.ads.core.data.model.AdObject r3, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (666630784 > 376640) in method: com.unity3d.ads.core.domain.CommonGetAdPlayer.invoke(com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.WebViewContainer, com.unity3d.ads.core.data.model.AdObject, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType):com.unity3d.ads.adplayer.AdPlayer, file: classes45.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetAdPlayer.invoke(com.unity3d.ads.adplayer.WebViewBridge, com.unity3d.ads.adplayer.WebViewContainer, com.unity3d.ads.core.data.model.AdObject, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType):com.unity3d.ads.adplayer.AdPlayer");
    }
}

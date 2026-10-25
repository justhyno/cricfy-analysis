package uniffi.cr_android;

import java.util.List;
import p000.gt3;
import p000.st3;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes23.dex */
public interface CrShareInterface {
    public static final Companion Companion = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes31.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1477125670 < 0) in method: uniffi.cr_android.CrShareInterface.Companion.<init>():void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1477125670 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1477125670 < 0) in method: uniffi.cr_android.CrShareInterface.Companion.<init>():void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.CrShareInterface.Companion.<init>():void");
        }
    }

    String appId();

    /* renamed from: applyConsentConfig-JlBESG8 */
    st3 mo11887applyConsentConfigJlBESG8(String str);

    CrAuthState authState();

    CrAuthStatus authStatus();

    boolean autostartEnabled();

    boolean autostartSupported();

    CrBattery battery();

    void clearLastError();

    void clearListener();

    /* renamed from: consentConfigVersion-s-VKNKU */
    long mo11888consentConfigVersionsVKNKU();

    ManagedConsentScreen consentScreen();

    CrConsentStatus consentStatus();

    ConsentCopy consentText();

    ConsentColors consentTheme();

    String deviceId();

    Earnings earnings();

    /* renamed from: eventSeq-s-VKNKU */
    long mo11889eventSeqsVKNKU();

    /* renamed from: eventsSince-VKZWuLQ */
    List<CrEventInfo> mo11890eventsSinceVKZWuLQ(long j);

    boolean hasConsentDecision();

    boolean isOptedIn();

    boolean isPaused();

    boolean isRunning();

    boolean isServingAllowed();

    String lastCashOutId();

    CrEventInfo lastError();

    ShareMetrics metrics();

    void optIn();

    void optOut();

    void pause();

    /* renamed from: reportBattery-QWPFWSk */
    void mo11891reportBatteryQWPFWSk(gt3 gt3Var, CrChargingState crChargingState, gt3 gt3Var2);

    void reportNetwork(CrNetworkType crNetworkType);

    Double requestCashOut();

    CrCashOutResult requestCashOutDetailed();

    ResolvedConsentCopy resolvedConsent();

    void resume();

    CrServingStatus servingStatus();

    void setAppId(String str);

    boolean setAutostart(boolean z);

    void setEnabled(boolean z);

    void setListener(CrListener crListener);

    /* renamed from: setMbps-WZ4Q5Ns */
    void mo11892setMbpsWZ4Q5Ns(int i);

    void start();

    void stop();
}

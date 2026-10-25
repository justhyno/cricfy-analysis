package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import org.json.JSONObject;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes5.dex */
public interface OmInteraction {
    public static final Companion Companion = null;
    public static final String OMID_CREATIVE_TYPE = "creativeType";
    public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
    public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
    public static final String OMID_IMPRESSION_TYPE = "impressionType";
    public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
    public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
    public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes44.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        public static final String OMID_CREATIVE_TYPE = "creativeType";
        public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
        public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
        public static final String OMID_IMPRESSION_TYPE = "impressionType";
        public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
        public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
        public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1743278238 < 0) in method: com.unity3d.ads.core.domain.om.OmInteraction.Companion.<init>():void, file: classes44.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1743278238 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1743278238 < 0) in method: com.unity3d.ads.core.domain.om.OmInteraction.Companion.<init>():void, file: classes44.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.OmInteraction.Companion.<init>():void");
        }
    }

    OmidOptions getOMidOptions(JSONObject jSONObject);

    WebView getWebview(AdObject adObject);

    Object invoke(AdObject adObject, JSONObject jSONObject, z50 z50Var);
}

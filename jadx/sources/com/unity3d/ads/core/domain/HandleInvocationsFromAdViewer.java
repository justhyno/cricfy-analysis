package com.unity3d.ads.core.domain;

import com.unity3d.services.core.di.IServiceComponent;

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
/* loaded from: classes17.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = null;
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_REFRESH_INVALIDATION_REASON = "invalidationReason";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_PAYLOAD_VERSION = "payloadVersion";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes45.dex */
    public static final class Companion {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2112418964 > 376640) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Companion.<init>():void, file: classes45.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2112418964 > 376640)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2112418964 > 376640) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Companion.<init>():void, file: classes45.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1413661118 > 376640) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Companion.<init>(bd0):void, file: classes45.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1413661118 > 376640)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public /* synthetic */ Companion(p000.bd0 r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1413661118 > 376640) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Companion.<init>(bd0):void, file: classes45.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Companion.<init>(bd0):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (97985107 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.<clinit>():void, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (97985107 > 368904)
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
    static {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (97985107 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.<clinit>():void, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2146375096 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.<init>():void, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2146375096 > 368904)
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
    public HandleInvocationsFromAdViewer() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2146375096 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.<init>():void, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-405199772 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.A(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-405199772 < 0)
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
    /* renamed from: A */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2599A(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-405199772 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.A(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2599A(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (48952083 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.B(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (48952083 > 368904)
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
    /* renamed from: B */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2600B(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (48952083 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.B(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2600B(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1211492152 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.C(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1211492152 > 368904)
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
    /* renamed from: C */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2601C(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1211492152 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.C(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2601C(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1420141686 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.D(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1420141686 < 0)
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
    /* renamed from: D */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2602D(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1420141686 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.D(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2602D(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1624239234 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.E(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1624239234 > 368904)
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
    /* renamed from: E */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2603E(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1624239234 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.E(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2603E(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-999722738 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.F(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-999722738 < 0)
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
    /* renamed from: F */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2604F(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-999722738 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.F(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2604F(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1898263792 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.G(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1898263792 < 0)
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
    /* renamed from: G */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2605G(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1898263792 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.G(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2605G(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-777216774 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.H():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-777216774 < 0)
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
    /* renamed from: H */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2606H() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-777216774 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.H():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2606H():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1263625430 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.I(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1263625430 > 368904)
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
    /* renamed from: I */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2607I(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1263625430 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.I(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2607I(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (317595738 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.J(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (317595738 > 368904)
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
    /* renamed from: J */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2608J(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (317595738 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.J(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2608J(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (61798602 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.K(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (61798602 > 368904)
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
    /* renamed from: K */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2609K(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (61798602 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.K(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2609K(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1341367370 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.L(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1341367370 < 0)
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
    /* renamed from: L */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2610L(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1341367370 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.L(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2610L(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1921472030 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.M(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1921472030 < 0)
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
    /* renamed from: M */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2611M(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1921472030 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.M(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2611M(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1676481452 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.N():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1676481452 > 368904)
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
    /* renamed from: N */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2612N() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1676481452 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.N():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2612N():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (725210394 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.O(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (725210394 > 368904)
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
    /* renamed from: O */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2613O(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (725210394 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.O(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2613O(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1035850450 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.P(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1035850450 < 0)
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
    /* renamed from: P */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2614P(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1035850450 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.P(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2614P(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (737868470 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Q(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (737868470 > 368904)
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
    /* renamed from: Q */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2615Q(com.unity3d.ads.core.data.model.AdObject r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (737868470 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Q(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2615Q(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-570417620 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.R(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-570417620 < 0)
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
    /* renamed from: R */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2616R(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-570417620 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.R(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2616R(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (208863695 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.S(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (208863695 > 368904)
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
    /* renamed from: S */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2617S(com.unity3d.ads.core.data.model.AdObject r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (208863695 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.S(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2617S(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-327923388 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.T(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-327923388 < 0)
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
    /* renamed from: T */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2618T(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-327923388 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.T(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2618T(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1338930126 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.U(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1338930126 > 368904)
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
    /* renamed from: U */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2619U(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1338930126 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.U(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2619U(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1562772704 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.V(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1562772704 > 368904)
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
    /* renamed from: V */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2620V(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1562772704 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.V(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2620V(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1713621576 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.W(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1713621576 < 0)
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
    /* renamed from: W */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2621W(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1713621576 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.W(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2621W(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1623113314 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.X(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1623113314 > 368904)
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
    /* renamed from: X */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2622X(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1623113314 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.X(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2622X(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (577770090 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Y(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (577770090 > 368904)
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
    /* renamed from: Y */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2623Y(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (577770090 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Y(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2623Y(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (64077890 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Z(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (64077890 > 368904)
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
    /* renamed from: Z */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2624Z(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (64077890 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.Z(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2624Z(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1397443766 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.a(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1397443766 > 368904)
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
    /* renamed from: a */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2625a(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1397443766 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.a(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2625a(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1011137414 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.a0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1011137414 > 368904)
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
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction a0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1011137414 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.a0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.a0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (224416691 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.b(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (224416691 > 368904)
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
    /* renamed from: b */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2626b(com.unity3d.ads.core.data.model.AdObject r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (224416691 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.b(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2626b(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-924664615 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.b0(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-924664615 < 0)
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
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction b0(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-924664615 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.b0(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.b0(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1658860207 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.c(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1658860207 < 0)
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
    /* renamed from: c */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2627c(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1658860207 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.c(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2627c(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1451226134 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.d(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1451226134 < 0)
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
    /* renamed from: d */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2628d(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1451226134 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.d(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2628d(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1251966292 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.e(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1251966292 > 368904)
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
    /* renamed from: e */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2629e(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1251966292 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.e(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2629e(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1863342 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.f(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1863342 > 368904)
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
    /* renamed from: f */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2630f(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1863342 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.f(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2630f(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1395145821 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.g():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1395145821 > 368904)
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
    /* renamed from: g */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2631g() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1395145821 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.g():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2631g():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-645331784 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.h(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-645331784 < 0)
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
    /* renamed from: h */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2632h(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-645331784 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.h(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2632h(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-544185904 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.i(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-544185904 < 0)
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
    /* renamed from: i */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2633i(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-544185904 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.i(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2633i(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1806968697 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1806968697 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, com.unity3d.ads.core.data.model.AdObject r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1806968697 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$0(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1150272880 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$1(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1150272880 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$1(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1150272880 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$1(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$1(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1779110602 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$10(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1779110602 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$10(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1779110602 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$10(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$10(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1426037106 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$11():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1426037106 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$11() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1426037106 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$11():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$11():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-900205982 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$12():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-900205982 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$12() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-900205982 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$12():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$12():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-126284685 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$13():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-126284685 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$13() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-126284685 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$13():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$13():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1057019951 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$14():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1057019951 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$14() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1057019951 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$14():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$14():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (179294387 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$15():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (179294387 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$15() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (179294387 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$15():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$15():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-759800177 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$16():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-759800177 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$16() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-759800177 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$16():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$16():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1897339386 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$17():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1897339386 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$17() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1897339386 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$17():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$17():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-946048610 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$18(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-946048610 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$18(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-946048610 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$18(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$18(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2049112789 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$19(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2049112789 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$19(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2049112789 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$19(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$19(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1173653522 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$2(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1173653522 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$2(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1173653522 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$2(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$2(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1828885328 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$20(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1828885328 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$20(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1828885328 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$20(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$20(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1978327554 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$21(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1978327554 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$21(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1978327554 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$21(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$21(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1106303148 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$22(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1106303148 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$22(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1106303148 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$22(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$22(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (643470002 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$23(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (643470002 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$23(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (643470002 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$23(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$23(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (738975446 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$24(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (738975446 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$24(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (738975446 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$24(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$24(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2086423246 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$25(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2086423246 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$25(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2086423246 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$25(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$25(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1616846019 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$26(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1616846019 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$26(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1616846019 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$26(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$26(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1357441599 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$27(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1357441599 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$27(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1357441599 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$27(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$27(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (105179526 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$28(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (105179526 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$28(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (105179526 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$28(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$28(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2064484504 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$29(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2064484504 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$29(com.unity3d.ads.core.data.model.AdObject r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2064484504 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$29(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$29(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (475589664 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$3(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (475589664 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$3(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (475589664 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$3(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$3(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-185129927 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$30(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-185129927 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$30(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-185129927 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$30(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$30(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1513587498 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$31(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1513587498 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$31(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1513587498 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$31(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$31(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (760616060 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$32(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (760616060 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$32(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (760616060 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$32(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$32(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1886658613 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$33(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1886658613 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$33(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1886658613 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$33(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$33(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2102591386 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$34(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2102591386 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$34(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2102591386 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$34(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$34(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1871244058 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$35(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1871244058 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$35(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1871244058 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$35(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$35(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1940876890 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$36(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1940876890 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$36(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1940876890 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$36(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$36(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2115303289 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$37(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2115303289 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$37(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2115303289 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$37(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$37(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1477959294 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$38(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1477959294 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$38(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1477959294 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$38(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$38(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2003059077 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$39(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2003059077 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$39(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2003059077 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$39(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$39(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-305830706 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$4(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-305830706 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$4(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-305830706 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$4(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$4(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (822764776 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$40(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (822764776 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$40(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (822764776 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$40(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$40(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2062949522 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$41(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2062949522 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$41(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2062949522 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$41(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$41(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-28092313 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$42(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-28092313 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$42(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-28092313 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$42(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$42(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2075462445 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$43(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2075462445 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$43(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2075462445 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$43(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$43(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1491560044 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$44(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1491560044 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$44(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1491560044 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$44(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$44(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1256070633 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$45(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1256070633 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$45(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1256070633 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$45(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$45(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1541303324 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$46(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1541303324 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$46(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1541303324 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$46(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$46(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1829559425 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$47():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1829559425 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$47() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1829559425 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$47():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$47():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1978325750 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$48(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1978325750 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$48(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1978325750 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$48(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$48(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (181278426 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$49(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (181278426 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$49(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (181278426 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$49(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$49(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1768109579 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$5(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1768109579 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$5(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1768109579 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$5(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$5(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-46424589 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$50(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-46424589 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$50(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-46424589 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$50(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$50(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (884074745 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$51(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (884074745 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$51(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (884074745 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$51(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$51(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-193433270 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$52(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-193433270 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$52(com.unity3d.ads.core.data.model.AdObject r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-193433270 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$52(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$52(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-508955258 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$53(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-508955258 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$53(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-508955258 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$53(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$53(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-375352689 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$6(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-375352689 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$6(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-375352689 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$6(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$6(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (407340243 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$7(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (407340243 > 368904)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$7(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, com.unity3d.ads.core.data.model.AdObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (407340243 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$7(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$7(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1477282138 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$8(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1477282138 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$8(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1477282138 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$8(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$8(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2132859322 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$9(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2132859322 < 0)
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
    private static final com.unity3d.ads.adplayer.ExposedFunction invoke$lambda$9(com.unity3d.ads.core.data.model.AdObject r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2132859322 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$9(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke$lambda$9(com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-698516680 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.j():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-698516680 < 0)
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
    /* renamed from: j */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2634j() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-698516680 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.j():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2634j():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1040381337 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.k(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1040381337 < 0)
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
    /* renamed from: k */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2635k(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1040381337 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.k(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2635k(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2053001040 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.l(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2053001040 < 0)
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
    /* renamed from: l */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2636l(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2053001040 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.l(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2636l(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (858567362 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (858567362 > 368904)
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
    /* renamed from: m */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2637m() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (858567362 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2637m():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1942823330 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.n(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1942823330 < 0)
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
    /* renamed from: n */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2638n(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1942823330 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.n(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2638n(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (556751302 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.o(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (556751302 > 368904)
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
    /* renamed from: o */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2639o(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (556751302 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.o(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2639o(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1767183929 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.p():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1767183929 > 368904)
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
    /* renamed from: p */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2640p() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1767183929 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.p():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2640p():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1401291777 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.q(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1401291777 > 368904)
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
    /* renamed from: q */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2641q(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1401291777 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.q(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2641q(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (974683480 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.r():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (974683480 > 368904)
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
    /* renamed from: r */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2642r() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (974683480 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.r():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2642r():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (45728710 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.s(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (45728710 > 368904)
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
    /* renamed from: s */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2643s(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (45728710 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.s(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2643s(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1262484368 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.t(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1262484368 < 0)
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
    /* renamed from: t */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2644t(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1262484368 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.t(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2644t(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1432318754 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.u(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1432318754 < 0)
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
    /* renamed from: u */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2645u(com.unity3d.ads.core.data.model.AdObject r0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1432318754 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.u(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2645u(com.unity3d.ads.core.data.model.AdObject, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (660986806 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.v(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (660986806 > 368904)
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
    /* renamed from: v */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2646v(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, com.unity3d.ads.core.data.model.AdObject r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (660986806 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.v(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2646v(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer, java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1036716370 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.w(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1036716370 < 0)
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
    /* renamed from: w */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2647w(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1036716370 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.w(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2647w(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1611941617 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.x(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1611941617 > 368904)
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
    /* renamed from: x */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2648x(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1611941617 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.x(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2648x(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1024172118 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.y():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1024172118 > 368904)
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
    /* renamed from: y */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2649y() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1024172118 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.y():com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2649y():com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-320991584 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.z(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-320991584 < 0)
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
    /* renamed from: z */
    public static /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction m2650z(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-320991584 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.z(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.m2650z(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer):com.unity3d.ads.adplayer.ExposedFunction");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1698705754 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.getServiceProvider():com.unity3d.services.core.di.IServiceProvider, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1698705754 < 0)
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
    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1698705754 < 0) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.getServiceProvider():com.unity3d.services.core.di.IServiceProvider, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.getServiceProvider():com.unity3d.services.core.di.IServiceProvider");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1023849522 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke(java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):java.util.Map<java.lang.String, a41>, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1023849522 > 368904)
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
    public final java.util.Map<java.lang.String, p000.a41> invoke(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.unity3d.ads.core.data.model.AdObject r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1023849522 > 368904) in method: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke(java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):java.util.Map<java.lang.String, a41>, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke(java.lang.String, java.lang.String, java.lang.String, com.unity3d.ads.core.data.model.AdObject):java.util.Map");
    }
}

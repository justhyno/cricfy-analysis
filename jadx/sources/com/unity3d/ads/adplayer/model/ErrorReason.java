package com.unity3d.ads.adplayer.model;

import p000.pp0;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes36.dex */
public final class ErrorReason {
    private static final /* synthetic */ pp0 $ENTRIES = null;
    private static final /* synthetic */ ErrorReason[] $VALUES = null;
    public static final ErrorReason REASON_UNKNOWN = null;
    public static final ErrorReason REASON_WEBVIEW_RENDER_PROCESS_GONE = null;
    public static final ErrorReason REASON_WEB_BLANK = null;
    public static final ErrorReason REASON_WEB_ERROR_AUTHENTICATION = null;
    public static final ErrorReason REASON_WEB_ERROR_BAD_URL = null;
    public static final ErrorReason REASON_WEB_ERROR_CONNECT = null;
    public static final ErrorReason REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE = null;
    public static final ErrorReason REASON_WEB_ERROR_FILE = null;
    public static final ErrorReason REASON_WEB_ERROR_FILE_NOT_FOUND = null;
    public static final ErrorReason REASON_WEB_ERROR_HOST_LOOKUP = null;
    public static final ErrorReason REASON_WEB_ERROR_IO = null;
    public static final ErrorReason REASON_WEB_ERROR_PROXY_AUTHENTICATION = null;
    public static final ErrorReason REASON_WEB_ERROR_RECEIVED_HTTP = null;
    public static final ErrorReason REASON_WEB_ERROR_REDIRECT_LOOP = null;
    public static final ErrorReason REASON_WEB_ERROR_TIMEOUT = null;
    public static final ErrorReason REASON_WEB_ERROR_TOO_MANY_REQUESTS = null;
    public static final ErrorReason REASON_WEB_ERROR_UNKNOWN = null;
    public static final ErrorReason REASON_WEB_ERROR_UNSAFE_RESOURCE = null;
    public static final ErrorReason REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME = null;
    public static final ErrorReason REASON_WEB_ERROR_UNSUPPORTED_SCHEME = null;
    private final int code;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1319639136 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.$values():com.unity3d.ads.adplayer.model.ErrorReason[], file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1319639136 > 411420)
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
    private static final /* synthetic */ com.unity3d.ads.adplayer.model.ErrorReason[] $values() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1319639136 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.$values():com.unity3d.ads.adplayer.model.ErrorReason[], file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.$values():com.unity3d.ads.adplayer.model.ErrorReason[]");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (979328145 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.<clinit>():void, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (979328145 > 411420)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (979328145 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.<clinit>():void, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (113462739 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.<init>(java.lang.String, int, int):void, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (113462739 > 411420)
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
    private ErrorReason(java.lang.String r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (113462739 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.<init>(java.lang.String, int, int):void, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.<init>(java.lang.String, int, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (84829404 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.getEntries():pp0, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (84829404 > 411420)
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
    public static p000.pp0 getEntries() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (84829404 > 411420) in method: com.unity3d.ads.adplayer.model.ErrorReason.getEntries():pp0, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.getEntries():pp0");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1870390810 < 0) in method: com.unity3d.ads.adplayer.model.ErrorReason.valueOf(java.lang.String):com.unity3d.ads.adplayer.model.ErrorReason, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1870390810 < 0)
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
    public static com.unity3d.ads.adplayer.model.ErrorReason valueOf(java.lang.String r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1870390810 < 0) in method: com.unity3d.ads.adplayer.model.ErrorReason.valueOf(java.lang.String):com.unity3d.ads.adplayer.model.ErrorReason, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.valueOf(java.lang.String):com.unity3d.ads.adplayer.model.ErrorReason");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-287551954 < 0) in method: com.unity3d.ads.adplayer.model.ErrorReason.values():com.unity3d.ads.adplayer.model.ErrorReason[], file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-287551954 < 0)
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
    public static com.unity3d.ads.adplayer.model.ErrorReason[] values() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-287551954 < 0) in method: com.unity3d.ads.adplayer.model.ErrorReason.values():com.unity3d.ads.adplayer.model.ErrorReason[], file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.values():com.unity3d.ads.adplayer.model.ErrorReason[]");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2445798 < 0) in method: com.unity3d.ads.adplayer.model.ErrorReason.getCode():int, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2445798 < 0)
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
    public final int getCode() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2445798 < 0) in method: com.unity3d.ads.adplayer.model.ErrorReason.getCode():int, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.model.ErrorReason.getCode():int");
    }
}

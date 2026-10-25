package com.unity3d.services.core.webview;

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
/* loaded from: classes32.dex */
public final class WebViewEventCategory {
    private static final /* synthetic */ WebViewEventCategory[] $VALUES = null;
    public static final WebViewEventCategory ADUNIT = null;
    public static final WebViewEventCategory ANALYTICS = null;
    public static final WebViewEventCategory BANNER = null;
    public static final WebViewEventCategory BROADCAST = null;
    public static final WebViewEventCategory CACHE = null;
    public static final WebViewEventCategory CONNECTIVITY = null;
    public static final WebViewEventCategory DEVICEINFO = null;
    public static final WebViewEventCategory GMA = null;
    public static final WebViewEventCategory INIT_GMA = null;
    public static final WebViewEventCategory LIFECYCLE = null;
    public static final WebViewEventCategory LOAD_API = null;
    public static final WebViewEventCategory MEASUREMENTS = null;
    public static final WebViewEventCategory PERMISSIONS = null;
    public static final WebViewEventCategory PURCHASING = null;
    public static final WebViewEventCategory REQUEST = null;
    public static final WebViewEventCategory RESOLVE = null;
    public static final WebViewEventCategory STORAGE = null;
    public static final WebViewEventCategory STORE = null;
    public static final WebViewEventCategory TOKEN = null;
    public static final WebViewEventCategory TOPICS = null;
    public static final WebViewEventCategory VIDEOPLAYER = null;
    public static final WebViewEventCategory WEBPLAYER = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-530612754 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.$values():com.unity3d.services.core.webview.WebViewEventCategory[], file: classes32.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-530612754 < 0)
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
    private static /* synthetic */ com.unity3d.services.core.webview.WebViewEventCategory[] $values() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-530612754 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.$values():com.unity3d.services.core.webview.WebViewEventCategory[], file: classes32.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.WebViewEventCategory.$values():com.unity3d.services.core.webview.WebViewEventCategory[]");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2025517290 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.<clinit>():void, file: classes32.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2025517290 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2025517290 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.<clinit>():void, file: classes32.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.WebViewEventCategory.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (704964942 > 420208) in method: com.unity3d.services.core.webview.WebViewEventCategory.<init>(java.lang.String, int):void, file: classes32.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (704964942 > 420208)
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
    private WebViewEventCategory(java.lang.String r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (704964942 > 420208) in method: com.unity3d.services.core.webview.WebViewEventCategory.<init>(java.lang.String, int):void, file: classes32.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.WebViewEventCategory.<init>(java.lang.String, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1407502965 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.valueOf(java.lang.String):com.unity3d.services.core.webview.WebViewEventCategory, file: classes32.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1407502965 < 0)
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
    public static com.unity3d.services.core.webview.WebViewEventCategory valueOf(java.lang.String r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1407502965 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.valueOf(java.lang.String):com.unity3d.services.core.webview.WebViewEventCategory, file: classes32.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.WebViewEventCategory.valueOf(java.lang.String):com.unity3d.services.core.webview.WebViewEventCategory");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1520548204 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.values():com.unity3d.services.core.webview.WebViewEventCategory[], file: classes32.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1520548204 < 0)
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
    public static com.unity3d.services.core.webview.WebViewEventCategory[] values() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1520548204 < 0) in method: com.unity3d.services.core.webview.WebViewEventCategory.values():com.unity3d.services.core.webview.WebViewEventCategory[], file: classes32.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.WebViewEventCategory.values():com.unity3d.services.core.webview.WebViewEventCategory[]");
    }
}

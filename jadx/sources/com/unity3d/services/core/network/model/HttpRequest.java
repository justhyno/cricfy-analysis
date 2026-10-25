package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.List;
import java.util.Map;

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
/* loaded from: classes41.dex */
public final class HttpRequest {
    public static final Companion Companion = null;
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final String contentType;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes46.dex */
    public static final class Companion {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1683013164 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.Companion.<init>():void, file: classes46.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1683013164 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1683013164 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.Companion.<init>():void, file: classes46.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2015000624 > 386592) in method: com.unity3d.services.core.network.model.HttpRequest.Companion.<init>(bd0):void, file: classes46.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2015000624 > 386592)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2015000624 > 386592) in method: com.unity3d.services.core.network.model.HttpRequest.Companion.<init>(bd0):void, file: classes46.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.Companion.<init>(bd0):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (358418050 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<clinit>():void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (358418050 > 396432)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (358418050 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<clinit>():void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1293720590 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1293720590 > 396432)
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
    public HttpRequest(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1293720590 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1710450958 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1710450958 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1710450958 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-704609852 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-704609852 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-704609852 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1355157670 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1355157670 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1355157670 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1698502283 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1698502283 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1698502283 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (972172496 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (972172496 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (972172496 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (374555133 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (374555133 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (374555133 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1463271452 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1463271452 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1463271452 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1097111866 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1097111866 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1097111866 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-530413583 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-530413583 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-530413583 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1813979254 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1813979254 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1813979254 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1007446782 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1007446782 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1007446782 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1351055413 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1351055413 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1351055413 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (119804908 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (119804908 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (119804908 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1284470434 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1284470434 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1284470434 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1631820510 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1631820510 < 0)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15, com.unity3d.ads.core.data.model.OperationType r16) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1631820510 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1005020710 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1005020710 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15, com.unity3d.ads.core.data.model.OperationType r16, java.io.File r17) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1005020710 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2038087200 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2038087200 > 396432)
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
    public HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15, com.unity3d.ads.core.data.model.OperationType r16, java.io.File r17, int r18) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2038087200 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1987614750 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, bd0):void, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1987614750 > 396432)
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
    public /* synthetic */ HttpRequest(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map r5, java.util.Map r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15, com.unity3d.ads.core.data.model.OperationType r16, java.io.File r17, int r18, int r19, p000.bd0 r20) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1987614750 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, bd0):void, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, bd0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-615790944 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.copy$default(com.unity3d.services.core.network.model.HttpRequest, java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, java.lang.Object):com.unity3d.services.core.network.model.HttpRequest, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-615790944 < 0)
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
    public static /* synthetic */ com.unity3d.services.core.network.model.HttpRequest copy$default(com.unity3d.services.core.network.model.HttpRequest r0, java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map r5, java.util.Map r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15, com.unity3d.ads.core.data.model.OperationType r16, java.io.File r17, int r18, int r19, java.lang.Object r20) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-615790944 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.copy$default(com.unity3d.services.core.network.model.HttpRequest, java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, java.lang.Object):com.unity3d.services.core.network.model.HttpRequest, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.copy$default(com.unity3d.services.core.network.model.HttpRequest, java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, java.lang.Object):com.unity3d.services.core.network.model.HttpRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1774858484 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component1():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1774858484 > 396432)
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
    public final java.lang.String component1() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1774858484 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component1():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component1():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (596597336 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component10():java.lang.Integer, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (596597336 > 396432)
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
    public final java.lang.Integer component10() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (596597336 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component10():java.lang.Integer, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component10():java.lang.Integer");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1320330027 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component11():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1320330027 < 0)
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
    public final int component11() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1320330027 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component11():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component11():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1503756938 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component12():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1503756938 < 0)
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
    public final int component12() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1503756938 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component12():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component12():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1782649151 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component13():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1782649151 < 0)
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
    public final int component13() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1782649151 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component13():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component13():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1490193948 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component14():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1490193948 < 0)
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
    public final int component14() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1490193948 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component14():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component14():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1422202278 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component15():boolean, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1422202278 > 396432)
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
    public final boolean component15() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1422202278 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component15():boolean, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component15():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1195188442 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component16():com.unity3d.ads.core.data.model.OperationType, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1195188442 < 0)
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
    public final com.unity3d.ads.core.data.model.OperationType component16() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1195188442 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component16():com.unity3d.ads.core.data.model.OperationType, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component16():com.unity3d.ads.core.data.model.OperationType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (411298232 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component17():java.io.File, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (411298232 > 396432)
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
    public final java.io.File component17() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (411298232 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component17():java.io.File, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component17():java.io.File");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1877035532 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component18():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1877035532 < 0)
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
    public final int component18() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1877035532 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component18():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component18():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (204325532 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component2():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (204325532 > 396432)
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
    public final java.lang.String component2() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (204325532 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component2():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component2():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1715962112 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component3():com.unity3d.services.core.network.model.RequestType, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1715962112 > 396432)
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
    public final com.unity3d.services.core.network.model.RequestType component3() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1715962112 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component3():com.unity3d.services.core.network.model.RequestType, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component3():com.unity3d.services.core.network.model.RequestType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (91553622 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component4():java.lang.Object, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (91553622 > 396432)
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
    public final java.lang.Object component4() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (91553622 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component4():java.lang.Object, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component4():java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-888345816 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component5():java.util.Map<java.lang.String, java.util.List<java.lang.String>>, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-888345816 < 0)
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
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component5() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-888345816 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component5():java.util.Map<java.lang.String, java.util.List<java.lang.String>>, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component5():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1847727765 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component6():java.util.Map<java.lang.String, java.lang.String>, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1847727765 < 0)
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
    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1847727765 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component6():java.util.Map<java.lang.String, java.lang.String>, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component6():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1554821550 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component7():com.unity3d.services.core.network.model.BodyType, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1554821550 > 396432)
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
    public final com.unity3d.services.core.network.model.BodyType component7() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1554821550 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.component7():com.unity3d.services.core.network.model.BodyType, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component7():com.unity3d.services.core.network.model.BodyType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1767419470 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component8():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1767419470 < 0)
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
    public final java.lang.String component8() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1767419470 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component8():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component8():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1129309382 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component9():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1129309382 < 0)
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
    public final java.lang.String component9() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1129309382 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.component9():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.component9():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2020597774 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.copy(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int):com.unity3d.services.core.network.model.HttpRequest, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2020597774 < 0)
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
    public final com.unity3d.services.core.network.model.HttpRequest copy(java.lang.String r1, java.lang.String r2, com.unity3d.services.core.network.model.RequestType r3, java.lang.Object r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5, java.util.Map<java.lang.String, java.lang.String> r6, com.unity3d.services.core.network.model.BodyType r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, int r12, int r13, int r14, boolean r15, com.unity3d.ads.core.data.model.OperationType r16, java.io.File r17, int r18) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2020597774 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.copy(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.lang.String>, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int):com.unity3d.services.core.network.model.HttpRequest, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.copy(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int):com.unity3d.services.core.network.model.HttpRequest");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1672592130 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.equals(java.lang.Object):boolean, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1672592130 > 396432)
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
    public boolean equals(java.lang.Object r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1672592130 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.equals(java.lang.Object):boolean, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.equals(java.lang.Object):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-218027036 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getBaseURL():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-218027036 < 0)
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
    public final java.lang.String getBaseURL() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-218027036 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getBaseURL():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getBaseURL():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-246160461 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getBody():java.lang.Object, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-246160461 < 0)
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
    public final java.lang.Object getBody() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-246160461 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getBody():java.lang.Object, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getBody():java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1618459824 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getBodyType():com.unity3d.services.core.network.model.BodyType, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1618459824 > 396432)
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
    public final com.unity3d.services.core.network.model.BodyType getBodyType() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1618459824 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getBodyType():com.unity3d.services.core.network.model.BodyType, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getBodyType():com.unity3d.services.core.network.model.BodyType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2070389792 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getCallTimeout():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2070389792 > 396432)
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
    public final int getCallTimeout() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2070389792 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getCallTimeout():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getCallTimeout():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (471496910 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getConnectTimeout():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (471496910 > 396432)
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
    public final int getConnectTimeout() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (471496910 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getConnectTimeout():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getConnectTimeout():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1453348238 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getContentType():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1453348238 > 396432)
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
    public final java.lang.String getContentType() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1453348238 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getContentType():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getContentType():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1897806658 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getDownloadDestination():java.io.File, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1897806658 < 0)
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
    public final java.io.File getDownloadDestination() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1897806658 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getDownloadDestination():java.io.File, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getDownloadDestination():java.io.File");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1647843826 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getHeaders():java.util.Map<java.lang.String, java.util.List<java.lang.String>>, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1647843826 < 0)
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
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1647843826 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getHeaders():java.util.Map<java.lang.String, java.util.List<java.lang.String>>, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getHeaders():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-119079110 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getMethod():com.unity3d.services.core.network.model.RequestType, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-119079110 < 0)
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
    public final com.unity3d.services.core.network.model.RequestType getMethod() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-119079110 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getMethod():com.unity3d.services.core.network.model.RequestType, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getMethod():com.unity3d.services.core.network.model.RequestType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1259275938 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getOperationType():com.unity3d.ads.core.data.model.OperationType, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1259275938 < 0)
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
    public final com.unity3d.ads.core.data.model.OperationType getOperationType() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1259275938 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getOperationType():com.unity3d.ads.core.data.model.OperationType, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getOperationType():com.unity3d.ads.core.data.model.OperationType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1422925922 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getParameters():java.util.Map<java.lang.String, java.lang.String>, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1422925922 < 0)
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
    public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1422925922 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getParameters():java.util.Map<java.lang.String, java.lang.String>, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getParameters():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1142538779 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getPath():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1142538779 > 396432)
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
    public final java.lang.String getPath() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1142538779 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getPath():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getPath():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (133389317 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getPort():java.lang.Integer, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (133389317 > 396432)
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
    public final java.lang.Integer getPort() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (133389317 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getPort():java.lang.Integer, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getPort():java.lang.Integer");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (338003988 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getPriority():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (338003988 > 396432)
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
    public final int getPriority() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (338003988 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getPriority():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getPriority():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-384508081 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getReadTimeout():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-384508081 < 0)
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
    public final int getReadTimeout() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-384508081 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getReadTimeout():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getReadTimeout():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1490325243 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getScheme():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1490325243 < 0)
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
    public final java.lang.String getScheme() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1490325243 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.getScheme():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getScheme():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1589331942 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getWriteTimeout():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1589331942 > 396432)
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
    public final int getWriteTimeout() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1589331942 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.getWriteTimeout():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.getWriteTimeout():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1738661418 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.hashCode():int, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1738661418 < 0)
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
    public int hashCode() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1738661418 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.hashCode():int, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.hashCode():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-243597971 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.isProtobuf():boolean, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-243597971 < 0)
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
    public final boolean isProtobuf() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-243597971 < 0) in method: com.unity3d.services.core.network.model.HttpRequest.isProtobuf():boolean, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.isProtobuf():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1222904230 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.toString():java.lang.String, file: classes41.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1222904230 > 396432)
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
    public java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1222904230 > 396432) in method: com.unity3d.services.core.network.model.HttpRequest.toString():java.lang.String, file: classes41.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.toString():java.lang.String");
    }
}

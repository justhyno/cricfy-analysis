package com.unity3d.ads.core.data.model;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import p000.c83;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes5.dex */
public final class WebViewConfigurationStoreSerializer implements c83 {
    private final WebviewConfigurationStore.WebViewConfigurationStore defaultValue;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1053513658 > 353752) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.<init>():void, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1053513658 > 353752)
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
    public WebViewConfigurationStoreSerializer() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1053513658 > 353752) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.<init>():void, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (950469840 > 353752) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.getDefaultValue():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (950469840 > 353752)
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
    @Override // p000.c83
    public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (950469840 > 353752) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.getDefaultValue():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.getDefaultValue():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1184836258 < 0) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.getDefaultValue():java.lang.Object, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1184836258 < 0)
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
    @Override // p000.c83
    public /* bridge */ /* synthetic */ java.lang.Object getDefaultValue() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1184836258 < 0) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.getDefaultValue():java.lang.Object, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.getDefaultValue():java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (388269249 > 353752) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.readFrom(java.io.InputStream, z50):java.lang.Object, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (388269249 > 353752)
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
    @Override // p000.c83
    public java.lang.Object readFrom(java.io.InputStream r1, p000.z50 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (388269249 > 353752) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.readFrom(java.io.InputStream, z50):java.lang.Object, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.readFrom(java.io.InputStream, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-157597200 < 0) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.writeTo(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.io.OutputStream, z50):java.lang.Object, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-157597200 < 0)
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
    public java.lang.Object writeTo(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r1, java.io.OutputStream r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-157597200 < 0) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.writeTo(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.io.OutputStream, z50):java.lang.Object, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.writeTo(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.io.OutputStream, z50):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-344092588 < 0) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.writeTo(java.lang.Object, java.io.OutputStream, z50):java.lang.Object, file: classes5.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-344092588 < 0)
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
    @Override // p000.c83
    public /* bridge */ /* synthetic */ java.lang.Object writeTo(java.lang.Object r1, java.io.OutputStream r2, p000.z50 r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-344092588 < 0) in method: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.writeTo(java.lang.Object, java.io.OutputStream, z50):java.lang.Object, file: classes5.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer.writeTo(java.lang.Object, java.io.OutputStream, z50):java.lang.Object");
    }
}

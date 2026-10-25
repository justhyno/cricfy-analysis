package com.unity3d.ads.gatewayclient;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes38.dex */
public final class AndroidRequestUrlFactoryKt {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-915638665 < 0) in method: com.unity3d.ads.gatewayclient.AndroidRequestUrlFactoryKt.access$getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType):gatewayprotocol.v1.InitializationResponseOuterClass$RequestType, file: classes38.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-915638665 < 0)
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
    public static final /* synthetic */ gatewayprotocol.v1.InitializationResponseOuterClass.RequestType access$getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-915638665 < 0) in method: com.unity3d.ads.gatewayclient.AndroidRequestUrlFactoryKt.access$getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType):gatewayprotocol.v1.InitializationResponseOuterClass$RequestType, file: classes38.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.AndroidRequestUrlFactoryKt.access$getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType):gatewayprotocol.v1.InitializationResponseOuterClass$RequestType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-184898839 < 0) in method: com.unity3d.ads.gatewayclient.AndroidRequestUrlFactoryKt.getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType):gatewayprotocol.v1.InitializationResponseOuterClass$RequestType, file: classes38.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-184898839 < 0)
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
    private static final gatewayprotocol.v1.InitializationResponseOuterClass.RequestType getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-184898839 < 0) in method: com.unity3d.ads.gatewayclient.AndroidRequestUrlFactoryKt.getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType):gatewayprotocol.v1.InitializationResponseOuterClass$RequestType, file: classes38.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.AndroidRequestUrlFactoryKt.getRequestUrlOverrideType(com.unity3d.ads.core.data.model.OperationType):gatewayprotocol.v1.InitializationResponseOuterClass$RequestType");
    }
}

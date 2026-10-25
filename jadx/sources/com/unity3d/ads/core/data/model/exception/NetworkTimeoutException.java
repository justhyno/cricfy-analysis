package com.unity3d.ads.core.data.model.exception;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes30.dex */
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (538612086 > 373676) in method: com.unity3d.ads.core.data.model.exception.NetworkTimeoutException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (538612086 > 373676)
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
    public NetworkTimeoutException(java.lang.String r1, com.unity3d.ads.core.data.model.OperationType r2, java.lang.Integer r3, java.lang.String r4, java.lang.String r5, java.lang.Integer r6, java.lang.String r7) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (538612086 > 373676) in method: com.unity3d.ads.core.data.model.exception.NetworkTimeoutException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.exception.NetworkTimeoutException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1086725178 < 0) in method: com.unity3d.ads.core.data.model.exception.NetworkTimeoutException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, bd0):void, file: classes30.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1086725178 < 0)
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
    public /* synthetic */ NetworkTimeoutException(java.lang.String r1, com.unity3d.ads.core.data.model.OperationType r2, java.lang.Integer r3, java.lang.String r4, java.lang.String r5, java.lang.Integer r6, java.lang.String r7, int r8, p000.bd0 r9) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1086725178 < 0) in method: com.unity3d.ads.core.data.model.exception.NetworkTimeoutException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, bd0):void, file: classes30.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.exception.NetworkTimeoutException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, bd0):void");
    }
}

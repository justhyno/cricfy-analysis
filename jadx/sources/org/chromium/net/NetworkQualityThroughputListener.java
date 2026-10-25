package org.chromium.net;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes3.dex */
public abstract class NetworkQualityThroughputListener {
    private final Executor mExecutor;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2063502004 < 0) in method: org.chromium.net.NetworkQualityThroughputListener.<init>(java.util.concurrent.Executor):void, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2063502004 < 0)
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
    public NetworkQualityThroughputListener(java.util.concurrent.Executor r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2063502004 < 0) in method: org.chromium.net.NetworkQualityThroughputListener.<init>(java.util.concurrent.Executor):void, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkQualityThroughputListener.<init>(java.util.concurrent.Executor):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1149136520 < 0) in method: org.chromium.net.NetworkQualityThroughputListener.getExecutor():java.util.concurrent.Executor, file: classes3.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1149136520 < 0)
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
    public java.util.concurrent.Executor getExecutor() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1149136520 < 0) in method: org.chromium.net.NetworkQualityThroughputListener.getExecutor():java.util.concurrent.Executor, file: classes3.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkQualityThroughputListener.getExecutor():java.util.concurrent.Executor");
    }

    public abstract void onThroughputObservation(int i, long j, int i2);
}

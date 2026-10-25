package org.chromium.net;

import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes40.dex */
public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i, int i2);

    public abstract ExperimentalCronetEngine build();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-956457752 < 0) in method: org.chromium.net.ICronetEngineBuilder.enableBrotli(boolean):org.chromium.net.ICronetEngineBuilder, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-956457752 < 0)
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
    public org.chromium.net.ICronetEngineBuilder enableBrotli(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-956457752 < 0) in method: org.chromium.net.ICronetEngineBuilder.enableBrotli(boolean):org.chromium.net.ICronetEngineBuilder, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ICronetEngineBuilder.enableBrotli(boolean):org.chromium.net.ICronetEngineBuilder");
    }

    public abstract ICronetEngineBuilder enableHttp2(boolean z);

    public abstract ICronetEngineBuilder enableHttpCache(int i, long j);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-553867220 < 0) in method: org.chromium.net.ICronetEngineBuilder.enableNetworkQualityEstimator(boolean):org.chromium.net.ICronetEngineBuilder, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-553867220 < 0)
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
    public org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-553867220 < 0) in method: org.chromium.net.ICronetEngineBuilder.enableNetworkQualityEstimator(boolean):org.chromium.net.ICronetEngineBuilder, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ICronetEngineBuilder.enableNetworkQualityEstimator(boolean):org.chromium.net.ICronetEngineBuilder");
    }

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z);

    public abstract ICronetEngineBuilder enableQuic(boolean z);

    public abstract ICronetEngineBuilder enableSdch(boolean z);

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1323670048 > 417452) in method: org.chromium.net.ICronetEngineBuilder.setThreadPriority(int):org.chromium.net.ICronetEngineBuilder, file: classes40.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1323670048 > 417452)
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
    public org.chromium.net.ICronetEngineBuilder setThreadPriority(int r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1323670048 > 417452) in method: org.chromium.net.ICronetEngineBuilder.setThreadPriority(int):org.chromium.net.ICronetEngineBuilder, file: classes40.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ICronetEngineBuilder.setThreadPriority(int):org.chromium.net.ICronetEngineBuilder");
    }

    public abstract ICronetEngineBuilder setUserAgent(String str);
}

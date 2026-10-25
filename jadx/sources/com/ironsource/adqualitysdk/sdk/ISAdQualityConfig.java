package com.ironsource.adqualitysdk.sdk;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
@Deprecated
/* loaded from: classes25.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮌ */
    public final HashMap f4479;

    /* renamed from: ﮐ */
    public final ISAdQualityDeviceIdType f4480;

    /* renamed from: ﱟ */
    public final boolean f4481;

    /* renamed from: ﱡ */
    public final boolean f4482;

    /* renamed from: ﺙ */
    public final String f4483;

    /* renamed from: ﻏ */
    public final ISAdQualityLogLevel f4484;

    /* renamed from: ﻐ */
    public final HashSet f4485;

    /* renamed from: ﻛ */
    public final boolean f4486;

    /* renamed from: ｋ */
    public final boolean f4487;

    /* renamed from: ﾇ */
    public final boolean f4488;

    /* renamed from: ﾒ */
    public final String f4489;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    @Deprecated
    /* loaded from: classes29.dex */
    public static class Builder {

        /* renamed from: ﮌ */
        public final HashMap f4490;

        /* renamed from: ﮐ */
        public ISAdQualityDeviceIdType f4491;

        /* renamed from: ﱟ */
        public boolean f4492;

        /* renamed from: ﱡ */
        public boolean f4493;

        /* renamed from: ﺙ */
        public String f4494;

        /* renamed from: ﻏ */
        public final HashSet f4495;

        /* renamed from: ﻐ */
        public ISAdQualityLogLevel f4496;

        /* renamed from: ﻛ */
        public boolean f4497;

        /* renamed from: ｋ */
        public boolean f4498;

        /* renamed from: ﾇ */
        public boolean f4499;

        /* renamed from: ﾒ */
        public String f4500;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1757551570 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.<init>():void, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1757551570 > 390388)
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
        @java.lang.Deprecated
        public Builder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1757551570 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.<init>():void, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1057507629 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.addAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1057507629 < 0)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder addAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1057507629 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.addAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.addAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1262529372 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.build():com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1262529372 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig build() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1262529372 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.build():com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.build():com.ironsource.adqualitysdk.sdk.ISAdQualityConfig");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1064592306 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.removeAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1064592306 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder removeAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1064592306 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.removeAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.removeAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1524119256 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1524119256 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1524119256 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1515423314 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setCoppa(boolean):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1515423314 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setCoppa(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1515423314 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setCoppa(boolean):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setCoppa(boolean):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-332758490 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setDeviceIdType(com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-332758490 < 0)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setDeviceIdType(com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-332758490 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setDeviceIdType(com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setDeviceIdType(com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1303323802 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setInitializationSource(java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1303323802 < 0)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setInitializationSource(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1303323802 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setInitializationSource(java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setInitializationSource(java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (155655618 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setLogLevel(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (155655618 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setLogLevel(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (155655618 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setLogLevel(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setLogLevel(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (50206154 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setMetaData(java.lang.String, java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (50206154 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setMetaData(java.lang.String r1, java.lang.String r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (50206154 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setMetaData(java.lang.String, java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setMetaData(java.lang.String, java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1761120770 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setMetaData(org.json.JSONObject):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1761120770 < 0)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setMetaData(org.json.JSONObject r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1761120770 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setMetaData(org.json.JSONObject):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setMetaData(org.json.JSONObject):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-526772814 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setTestMode(boolean):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-526772814 < 0)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setTestMode(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-526772814 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setTestMode(boolean):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setTestMode(boolean):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1068184171 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setUserId(java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1068184171 > 390388)
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
        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setUserId(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1068184171 > 390388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setUserId(java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder.setUserId(java.lang.String):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-658150623 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.<init>(java.lang.String, boolean, boolean, boolean, com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel, java.util.HashSet, java.lang.String, boolean, boolean, com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType, java.util.HashMap):void, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-658150623 < 0)
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
    public ISAdQualityConfig(java.lang.String r1, boolean r2, boolean r3, boolean r4, com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r5, java.util.HashSet r6, java.lang.String r7, boolean r8, boolean r9, com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType r10, java.util.HashMap r11) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-658150623 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.<init>(java.lang.String, boolean, boolean, boolean, com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel, java.util.HashSet, java.lang.String, boolean, boolean, com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType, java.util.HashMap):void, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.<init>(java.lang.String, boolean, boolean, boolean, com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel, java.util.HashSet, java.lang.String, boolean, boolean, com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType, java.util.HashMap):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (355227814 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.merge(com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (355227814 > 346388)
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
    @java.lang.Deprecated
    public static com.ironsource.adqualitysdk.sdk.ISAdQualityConfig merge(com.ironsource.adqualitysdk.sdk.ISAdQualityConfig r0, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (355227814 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.merge(com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.merge(com.ironsource.adqualitysdk.sdk.ISAdQualityConfig, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):com.ironsource.adqualitysdk.sdk.ISAdQualityConfig");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1172726566 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getAdQualityInitListeners():java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener>, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1172726566 < 0)
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
    @java.lang.Deprecated
    public java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> getAdQualityInitListeners() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1172726566 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getAdQualityInitListeners():java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener>, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getAdQualityInitListeners():java.util.Set");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (402523508 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getCoppa():boolean, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (402523508 > 346388)
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
    @java.lang.Deprecated
    public boolean getCoppa() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (402523508 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getCoppa():boolean, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getCoppa():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1666630670 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getDeviceIdType():com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1666630670 < 0)
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
    @java.lang.Deprecated
    public com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType getDeviceIdType() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1666630670 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getDeviceIdType():com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getDeviceIdType():com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2123065939 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getInitializationSource():java.lang.String, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2123065939 > 346388)
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
    @java.lang.Deprecated
    public java.lang.String getInitializationSource() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2123065939 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getInitializationSource():java.lang.String, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getInitializationSource():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (58206648 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getLogLevel():com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (58206648 > 346388)
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
    @java.lang.Deprecated
    public com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel getLogLevel() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (58206648 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getLogLevel():com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getLogLevel():com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1201763757 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getMetaData():java.util.Map<java.lang.String, java.lang.String>, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1201763757 > 346388)
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
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetaData() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1201763757 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getMetaData():java.util.Map<java.lang.String, java.lang.String>, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getMetaData():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1805304356 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getUserId():java.lang.String, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1805304356 > 346388)
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
    @java.lang.Deprecated
    public java.lang.String getUserId() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1805304356 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getUserId():java.lang.String, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.getUserId():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-535837093 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.isTestMode():boolean, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-535837093 < 0)
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
    @java.lang.Deprecated
    public boolean isTestMode() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-535837093 < 0) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.isTestMode():boolean, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.isTestMode():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1559686772 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.isUserIdSet():boolean, file: classes25.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1559686772 > 346388)
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
    @java.lang.Deprecated
    public boolean isUserIdSet() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1559686772 > 346388) in method: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.isUserIdSet():boolean, file: classes25.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.isUserIdSet():boolean");
    }
}

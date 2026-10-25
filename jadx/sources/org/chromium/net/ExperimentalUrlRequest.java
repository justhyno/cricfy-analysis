package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

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
/* loaded from: classes49.dex */
public abstract class ExperimentalUrlRequest extends UrlRequest {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes28.dex */
    public static abstract class Builder extends UrlRequest.Builder {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (935046083 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.<init>():void, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (935046083 > 401788)
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
        public Builder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (935046083 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.<init>():void, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.<init>():void");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder addHeader(String str, String str2);

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1197428899 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1197428899 < 0)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder addHeader(java.lang.String r1, java.lang.String r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1197428899 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1222427058 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.addRequestAnnotation(java.lang.Object):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1222427058 > 401788)
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
        public org.chromium.net.ExperimentalUrlRequest.Builder addRequestAnnotation(java.lang.Object r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1222427058 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.addRequestAnnotation(java.lang.Object):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.addRequestAnnotation(java.lang.Object):org.chromium.net.ExperimentalUrlRequest$Builder");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder allowDirectExecutor();

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1918752998 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.allowDirectExecutor():org.chromium.net.UrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1918752998 < 0)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder allowDirectExecutor() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1918752998 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.allowDirectExecutor():org.chromium.net.UrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.allowDirectExecutor():org.chromium.net.UrlRequest$Builder");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract ExperimentalUrlRequest build();

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1025695947 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.build():org.chromium.net.UrlRequest, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1025695947 < 0)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest build() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1025695947 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.build():org.chromium.net.UrlRequest, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.build():org.chromium.net.UrlRequest");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder disableCache();

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2008082661 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.disableCache():org.chromium.net.UrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2008082661 < 0)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder disableCache() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2008082661 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.disableCache():org.chromium.net.UrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.disableCache():org.chromium.net.UrlRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1512181208 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.disableConnectionMigration():org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1512181208 < 0)
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
        public org.chromium.net.ExperimentalUrlRequest.Builder disableConnectionMigration() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1512181208 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.disableConnectionMigration():org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.disableConnectionMigration():org.chromium.net.ExperimentalUrlRequest$Builder");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setHttpMethod(String str);

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1739806018 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setHttpMethod(java.lang.String):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1739806018 > 401788)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setHttpMethod(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1739806018 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setHttpMethod(java.lang.String):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.setHttpMethod(java.lang.String):org.chromium.net.UrlRequest$Builder");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setPriority(int i);

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (438971434 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setPriority(int):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (438971434 > 401788)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setPriority(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (438971434 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setPriority(int):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.setPriority(int):org.chromium.net.UrlRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1321448466 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setRequestFinishedListener(org.chromium.net.RequestFinishedInfo$Listener):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1321448466 > 401788)
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
        public org.chromium.net.ExperimentalUrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1321448466 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setRequestFinishedListener(org.chromium.net.RequestFinishedInfo$Listener):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.setRequestFinishedListener(org.chromium.net.RequestFinishedInfo$Listener):org.chromium.net.ExperimentalUrlRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1924093968 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setTrafficStatsTag(int):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1924093968 < 0)
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
        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsTag(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1924093968 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setTrafficStatsTag(int):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.setTrafficStatsTag(int):org.chromium.net.ExperimentalUrlRequest$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-894026476 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setTrafficStatsUid(int):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-894026476 < 0)
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
        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsUid(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-894026476 < 0) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setTrafficStatsUid(int):org.chromium.net.ExperimentalUrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.setTrafficStatsUid(int):org.chromium.net.ExperimentalUrlRequest$Builder");
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (917827321 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (917827321 > 401788)
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
        @Override // org.chromium.net.UrlRequest.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider r1, java.util.concurrent.Executor r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (917827321 > 401788) in method: org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder, file: classes28.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1156762178 < 0) in method: org.chromium.net.ExperimentalUrlRequest.<init>():void, file: classes49.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1156762178 < 0)
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
    public ExperimentalUrlRequest() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1156762178 < 0) in method: org.chromium.net.ExperimentalUrlRequest.<init>():void, file: classes49.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ExperimentalUrlRequest.<init>():void");
    }
}

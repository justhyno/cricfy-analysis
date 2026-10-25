package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;

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
/* loaded from: classes12.dex */
public final class InitializationCompletedEventRequestKt {
    public static final InitializationCompletedEventRequestKt INSTANCE = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes24.dex */
    public static final class Dsl {
        public static final Companion Companion = null;
        private final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder _builder;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        public static final class Companion {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1716846368 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion.<init>():void, file: classes24.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1716846368 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            private Companion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1716846368 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion.<init>():void, file: classes24.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1979679655 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion.<init>(bd0):void, file: classes24.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1979679655 > 383840)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public /* synthetic */ Companion(p000.bd0 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1979679655 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion.<init>(bd0):void, file: classes24.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion.<init>(bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (940218954 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion._create(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl, file: classes24.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (940218954 > 383840)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public final /* synthetic */ gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl _create(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (940218954 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion._create(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl, file: classes24.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion._create(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder):gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1274626546 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<clinit>():void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1274626546 < 0)
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
        static {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1274626546 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<clinit>():void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-526407024 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<init>(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder):void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-526407024 < 0)
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
        private Dsl(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-526407024 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<init>(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder):void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<init>(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-189652403 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<init>(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, bd0):void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-189652403 < 0)
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
        public /* synthetic */ Dsl(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder r1, p000.bd0 r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-189652403 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<init>(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, bd0):void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.<init>(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder, bd0):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-201662436 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl._build():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-201662436 < 0)
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
        public final /* synthetic */ gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-201662436 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl._build():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl._build():gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-886280255 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearCoherenceAttributes():void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-886280255 < 0)
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
        public final void clearCoherenceAttributes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-886280255 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearCoherenceAttributes():void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearCoherenceAttributes():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (598872332 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearDynamicDeviceInfo():void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (598872332 > 383840)
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
        public final void clearDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (598872332 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearDynamicDeviceInfo():void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearDynamicDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1070551366 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearStaticDeviceInfo():void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1070551366 < 0)
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
        public final void clearStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1070551366 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearStaticDeviceInfo():void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.clearStaticDeviceInfo():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1302001285 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getCoherenceAttributes():com.google.protobuf.ByteString, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1302001285 < 0)
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
        public final com.google.protobuf.ByteString getCoherenceAttributes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1302001285 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getCoherenceAttributes():com.google.protobuf.ByteString, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getCoherenceAttributes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (754939570 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (754939570 > 383840)
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
        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (754939570 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getDynamicDeviceInfo():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1922198564 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1922198564 > 383840)
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
        public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1922198564 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.getStaticDeviceInfo():gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1920121600 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasCoherenceAttributes():boolean, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1920121600 < 0)
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
        public final boolean hasCoherenceAttributes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1920121600 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasCoherenceAttributes():boolean, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasCoherenceAttributes():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-716847902 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasDynamicDeviceInfo():boolean, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-716847902 < 0)
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
        public final boolean hasDynamicDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-716847902 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasDynamicDeviceInfo():boolean, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasDynamicDeviceInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1309131471 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasStaticDeviceInfo():boolean, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1309131471 > 383840)
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
        public final boolean hasStaticDeviceInfo() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1309131471 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasStaticDeviceInfo():boolean, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.hasStaticDeviceInfo():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1620222066 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setCoherenceAttributes(com.google.protobuf.ByteString):void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1620222066 < 0)
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
        public final void setCoherenceAttributes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1620222066 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setCoherenceAttributes(com.google.protobuf.ByteString):void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setCoherenceAttributes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1041142082 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1041142082 < 0)
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
        public final void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1041142082 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2113276682 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2113276682 > 383840)
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
        public final void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2113276682 > 383840) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1497245823 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.<clinit>():void, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1497245823 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1497245823 < 0) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.<clinit>():void, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (775756106 > 362532) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.<init>():void, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (775756106 > 362532)
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
    private InitializationCompletedEventRequestKt() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (775756106 > 362532) in method: gatewayprotocol.v1.InitializationCompletedEventRequestKt.<init>():void, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.InitializationCompletedEventRequestKt.<init>():void");
    }
}

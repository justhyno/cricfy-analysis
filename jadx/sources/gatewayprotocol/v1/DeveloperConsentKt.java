package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

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
/* loaded from: classes20.dex */
public final class DeveloperConsentKt {
    public static final DeveloperConsentKt INSTANCE = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes5.dex */
    public static final class Dsl {
        public static final Companion Companion = null;
        private final DeveloperConsentOuterClass.DeveloperConsent.Builder _builder;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes28.dex */
        public static final class Companion {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (636862742 > 401788) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion.<init>():void, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (636862742 > 401788)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (636862742 > 401788) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion.<init>():void, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-668363200 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion.<init>(bd0):void, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-668363200 < 0)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-668363200 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion.<init>(bd0):void, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion.<init>(bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-301443624 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion._create(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder):gatewayprotocol.v1.DeveloperConsentKt$Dsl, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-301443624 < 0)
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
            public final /* synthetic */ gatewayprotocol.v1.DeveloperConsentKt.Dsl _create(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-301443624 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion._create(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder):gatewayprotocol.v1.DeveloperConsentKt$Dsl, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion._create(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder):gatewayprotocol.v1.DeveloperConsentKt$Dsl");
            }
        }

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes30.dex */
        public static final class OptionsProxy extends DslProxy {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1165213942 > 373676) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.OptionsProxy.<init>():void, file: classes30.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1165213942 > 373676)
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
            private OptionsProxy() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1165213942 > 373676) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.OptionsProxy.<init>():void, file: classes30.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.OptionsProxy.<init>():void");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (360322013 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<clinit>():void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (360322013 > 353752)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (360322013 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<clinit>():void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-600387279 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<init>(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-600387279 < 0)
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
        private Dsl(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-600387279 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<init>(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<init>(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1947803134 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<init>(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, bd0):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1947803134 < 0)
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
        public /* synthetic */ Dsl(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder r1, p000.bd0 r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1947803134 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<init>(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, bd0):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.<init>(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, bd0):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-335452660 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl._build():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-335452660 < 0)
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
        public final /* synthetic */ gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent _build() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-335452660 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl._build():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl._build():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (495962582 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.addAllOptions(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (495962582 > 353752)
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
        public final /* synthetic */ void addAllOptions(com.google.protobuf.kotlin.DslList r1, java.lang.Iterable r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (495962582 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.addAllOptions(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.addAllOptions(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (718280631 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.addOptions(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (718280631 > 353752)
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
        public final /* synthetic */ void addOptions(com.google.protobuf.kotlin.DslList r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (718280631 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.addOptions(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.addOptions(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (405859622 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.clearOptions(com.google.protobuf.kotlin.DslList):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (405859622 > 353752)
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
        public final /* synthetic */ void clearOptions(com.google.protobuf.kotlin.DslList r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (405859622 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.clearOptions(com.google.protobuf.kotlin.DslList):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.clearOptions(com.google.protobuf.kotlin.DslList):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2136175970 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.getOptions():com.google.protobuf.kotlin.DslList, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2136175970 > 353752)
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
        public final /* synthetic */ com.google.protobuf.kotlin.DslList getOptions() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2136175970 > 353752) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.getOptions():com.google.protobuf.kotlin.DslList, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.getOptions():com.google.protobuf.kotlin.DslList");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-461845136 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.plusAssignAllOptions(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentKt$Dsl$OptionsProxy>, java.lang.Iterable<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-461845136 < 0)
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
        public final /* synthetic */ void plusAssignAllOptions(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentKt.Dsl.OptionsProxy> r1, java.lang.Iterable<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-461845136 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.plusAssignAllOptions(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentKt$Dsl$OptionsProxy>, java.lang.Iterable<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.plusAssignAllOptions(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-213911910 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.plusAssignOptions(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentKt$Dsl$OptionsProxy>, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-213911910 < 0)
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
        public final /* synthetic */ void plusAssignOptions(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentKt.Dsl.OptionsProxy> r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-213911910 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.plusAssignOptions(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentKt$Dsl$OptionsProxy>, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.plusAssignOptions(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1705276398 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.setOptions(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes5.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1705276398 < 0)
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
        public final /* synthetic */ void setOptions(com.google.protobuf.kotlin.DslList r1, int r2, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1705276398 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.Dsl.setOptions(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes5.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.Dsl.setOptions(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-630916762 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.<clinit>():void, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-630916762 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-630916762 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.<clinit>():void, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1017648720 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.<init>():void, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1017648720 < 0)
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
    private DeveloperConsentKt() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1017648720 < 0) in method: gatewayprotocol.v1.DeveloperConsentKt.<init>():void, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentKt.<init>():void");
    }
}

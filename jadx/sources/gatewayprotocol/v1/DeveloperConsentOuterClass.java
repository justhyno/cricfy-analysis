package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

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
/* loaded from: classes28.dex */
public final class DeveloperConsentOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes2.dex */
    public static final class DeveloperConsent extends GeneratedMessageLite<DeveloperConsent, Builder> implements DeveloperConsentOrBuilder {
        private static final DeveloperConsent DEFAULT_INSTANCE = null;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile Parser<DeveloperConsent> PARSER;
        private Internal.ProtobufList<DeveloperConsentOption> options_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes20.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DeveloperConsent, Builder> implements DeveloperConsentOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1416036164 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.<init>():void, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1416036164 < 0)
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
            private Builder() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1416036164 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.<init>():void, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-535516016 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.<init>(vh0):void, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-535516016 < 0)
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
            public /* synthetic */ Builder(p000.vh0 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-535516016 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.<init>(vh0):void, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.<init>(vh0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (383041256 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (383041256 > 368420)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (383041256 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addAllOptions(java.lang.Iterable):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1645485902 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1645485902 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1645485902 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (93925094 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (93925094 > 368420)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (93925094 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (596064550 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (596064550 > 368420)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (596064550 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1357461482 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1357461482 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1357461482 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1077095643 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.clearOptions():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1077095643 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder clearOptions() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1077095643 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.clearOptions():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.clearOptions():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-563066989 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-563066989 < 0)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getOptions(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-563066989 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1217707398 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptionsCount():int, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1217707398 > 368420)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public int getOptionsCount() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1217707398 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptionsCount():int, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptionsCount():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-187790007 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptionsList():java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-187790007 < 0)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> getOptionsList() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-187790007 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptionsList():java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.getOptionsList():java.util.List");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1791294870 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.removeOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1791294870 > 368420)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder removeOptions(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1791294870 > 368420) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.removeOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.removeOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1410163990 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1410163990 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder setOptions(int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1410163990 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-921524909 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-921524909 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder setOptions(int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-921524909 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes20.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-261493838 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.<clinit>():void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-261493838 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-261493838 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.<clinit>():void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1878144309 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.<init>():void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1878144309 > 385712)
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
        private DeveloperConsent() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1878144309 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.<init>():void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (826153558 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1100():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (826153558 > 385712)
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
        public static /* synthetic */ gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent access$1100() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (826153558 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1100():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1100():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-582839827 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1200(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-582839827 < 0)
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
        public static /* synthetic */ void access$1200(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0, int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-582839827 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1200(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1200(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1533906099 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1300(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1533906099 < 0)
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
        public static /* synthetic */ void access$1300(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1533906099 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1300(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1300(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1141515140 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1400(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1141515140 > 385712)
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
        public static /* synthetic */ void access$1400(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0, int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1141515140 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1400(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1400(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2023303622 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1500(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, java.lang.Iterable):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2023303622 < 0)
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
        public static /* synthetic */ void access$1500(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0, java.lang.Iterable r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2023303622 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1500(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, java.lang.Iterable):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1500(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1107798217 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1600(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1107798217 > 385712)
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
        public static /* synthetic */ void access$1600(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1107798217 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1600(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1600(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1830046990 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1700(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1830046990 < 0)
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
        public static /* synthetic */ void access$1700(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1830046990 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1700(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.access$1700(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (838202020 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (838202020 > 385712)
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
        private void addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (838202020 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addAllOptions(java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1278520006 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1278520006 > 385712)
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
        private void addOptions(int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1278520006 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-423012697 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-423012697 < 0)
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
        private void addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-423012697 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1829970414 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.clearOptions():void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1829970414 > 385712)
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
        private void clearOptions() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1829970414 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.clearOptions():void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.clearOptions():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1438572196 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.ensureOptionsIsMutable():void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1438572196 < 0)
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
        private void ensureOptionsIsMutable() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1438572196 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.ensureOptionsIsMutable():void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.ensureOptionsIsMutable():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1786215046 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1786215046 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1786215046 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (92272906 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (92272906 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (92272906 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1226495101 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1226495101 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1226495101 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1439340618 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1439340618 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1439340618 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-487759417 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-487759417 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-487759417 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-929938464 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-929938464 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-929938464 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-811375058 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-811375058 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-811375058 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (259393237 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (259393237 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (259393237 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (523318454 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (523318454 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (523318454 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (370302018 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (370302018 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (370302018 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (517655402 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (517655402 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (517655402 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1867321476 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1867321476 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1867321476 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-895962467 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-895962467 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-895962467 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1105785203 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(byte[]):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1105785203 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1105785203 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(byte[]):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(byte[]):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1776929330 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1776929330 > 385712)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1776929330 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1110317568 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parser():com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent>, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1110317568 < 0)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1110317568 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parser():com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent>, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1937039052 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.removeOptions(int):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1937039052 > 385712)
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
        private void removeOptions(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1937039052 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.removeOptions(int):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.removeOptions(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1346207314 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1346207314 > 385712)
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
        private void setOptions(int r1, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1346207314 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.setOptions(int, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (592916730 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (592916730 > 385712)
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
        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (592916730 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1256254910 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1256254910 < 0)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getOptions(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1256254910 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptions(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-255360858 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsCount():int, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-255360858 < 0)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public int getOptionsCount() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-255360858 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsCount():int, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsCount():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1292842995 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsList():java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1292842995 > 385712)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> getOptionsList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1292842995 > 385712) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsList():java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsList():java.util.List");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-867591105 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsOrBuilder(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-867591105 < 0)
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
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder getOptionsOrBuilder(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-867591105 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsOrBuilder(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsOrBuilder(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2044724162 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsOrBuilderList():java.util.List<? extends gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder>, file: classes2.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2044724162 < 0)
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
        public java.util.List<? extends gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder> getOptionsOrBuilderList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2044724162 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsOrBuilderList():java.util.List<? extends gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder>, file: classes2.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getOptionsOrBuilderList():java.util.List");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes30.dex */
    public static final class DeveloperConsentChoice implements Internal.EnumLite {
        private static final /* synthetic */ DeveloperConsentChoice[] $VALUES = null;
        public static final DeveloperConsentChoice DEVELOPER_CONSENT_CHOICE_FALSE = null;
        public static final int DEVELOPER_CONSENT_CHOICE_FALSE_VALUE = 2;
        public static final DeveloperConsentChoice DEVELOPER_CONSENT_CHOICE_TRUE = null;
        public static final int DEVELOPER_CONSENT_CHOICE_TRUE_VALUE = 1;
        public static final DeveloperConsentChoice DEVELOPER_CONSENT_CHOICE_UNSPECIFIED = null;
        public static final int DEVELOPER_CONSENT_CHOICE_UNSPECIFIED_VALUE = 0;
        public static final DeveloperConsentChoice UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<DeveloperConsentChoice> internalValueMap = null;
        private final int value;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1699173768 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.$values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice[], file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1699173768 < 0)
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
        private static /* synthetic */ gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice[] $values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1699173768 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.$values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice[], file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.$values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (675732283 > 373676) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.<clinit>():void, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (675732283 > 373676)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (675732283 > 373676) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.<clinit>():void, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1824697886 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.<init>(java.lang.String, int, int):void, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1824697886 < 0)
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
        private DeveloperConsentChoice(java.lang.String r1, int r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1824697886 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.<init>(java.lang.String, int, int):void, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.<init>(java.lang.String, int, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2065788010 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2065788010 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice forNumber(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2065788010 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1648600887 > 373676) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice>, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1648600887 > 373676)
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
        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice> internalGetValueMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1648600887 > 373676) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice>, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1082038386 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1082038386 < 0)
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
        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1082038386 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1776249249 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.valueOf(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1776249249 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice valueOf(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1776249249 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.valueOf(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.valueOf(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-235273671 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.valueOf(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-235273671 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice valueOf(java.lang.String r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-235273671 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.valueOf(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.valueOf(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-175797603 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice[], file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-175797603 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice[] values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-175797603 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice[], file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1162662102 > 373676) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.getNumber():int, file: classes30.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1162662102 > 373676)
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
        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1162662102 > 373676) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.getNumber():int, file: classes30.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.getNumber():int");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes7.dex */
    public static final class DeveloperConsentOption extends GeneratedMessageLite<DeveloperConsentOption, Builder> implements DeveloperConsentOptionOrBuilder {
        public static final int CUSTOM_TYPE_FIELD_NUMBER = 2;
        private static final DeveloperConsentOption DEFAULT_INSTANCE = null;
        private static volatile Parser<DeveloperConsentOption> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private String customType_;
        private int type_;
        private int value_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes33.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DeveloperConsentOption, Builder> implements DeveloperConsentOptionOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1536316314 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.<init>():void, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1536316314 < 0)
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
            private Builder() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1536316314 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.<init>():void, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1532824615 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.<init>(vh0):void, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1532824615 > 410888)
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
            public /* synthetic */ Builder(p000.vh0 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1532824615 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.<init>(vh0):void, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.<init>(vh0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1288652484 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearCustomType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1288652484 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearCustomType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1288652484 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearCustomType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearCustomType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (922171926 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (922171926 > 410888)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (922171926 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1168316591 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1168316591 > 410888)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1168316591 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.clearValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (786039130 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getCustomType():java.lang.String, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (786039130 > 410888)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public java.lang.String getCustomType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (786039130 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getCustomType():java.lang.String, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getCustomType():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-745155614 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getCustomTypeBytes():com.google.protobuf.ByteString, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-745155614 < 0)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public com.google.protobuf.ByteString getCustomTypeBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-745155614 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getCustomTypeBytes():com.google.protobuf.ByteString, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getCustomTypeBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-447692974 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-447692974 < 0)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-447692974 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1238055605 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getTypeValue():int, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1238055605 > 410888)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public int getTypeValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1238055605 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getTypeValue():int, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getTypeValue():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1738253051 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1738253051 > 410888)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1738253051 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-21462629 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getValueValue():int, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-21462629 < 0)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public int getValueValue() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-21462629 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getValueValue():int, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.getValueValue():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (494236866 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.hasCustomType():boolean, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (494236866 > 410888)
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
            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public boolean hasCustomType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (494236866 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.hasCustomType():boolean, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.hasCustomType():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1775595313 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setCustomType(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1775595313 > 410888)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setCustomType(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1775595313 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setCustomType(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setCustomType(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1890671074 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setCustomTypeBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1890671074 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setCustomTypeBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1890671074 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setCustomTypeBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setCustomTypeBytes(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1365311981 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setType(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1365311981 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setType(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1365311981 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setType(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setType(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-209623230 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setTypeValue(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-209623230 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setTypeValue(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-209623230 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setTypeValue(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setTypeValue(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1372591226 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setValue(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1372591226 < 0)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setValue(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1372591226 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setValue(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setValue(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (552481730 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setValueValue(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (552481730 > 410888)
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
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setValueValue(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (552481730 > 410888) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setValueValue(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder.setValueValue(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1991950834 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.<clinit>():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1991950834 > 408588)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1991950834 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.<clinit>():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1440487760 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.<init>():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1440487760 < 0)
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
        private DeveloperConsentOption() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1440487760 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.<init>():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1123070667 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$000():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1123070667 > 408588)
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
        public static /* synthetic */ gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1123070667 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$000():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$000():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1934506438 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$100(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1934506438 > 408588)
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
        public static /* synthetic */ void access$100(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1934506438 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$100(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$100(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1280204804 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$200(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1280204804 > 408588)
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
        public static /* synthetic */ void access$200(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1280204804 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$200(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$200(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1782310694 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$300(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1782310694 < 0)
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
        public static /* synthetic */ void access$300(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1782310694 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$300(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$300(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-479590235 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$400(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, java.lang.String):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-479590235 < 0)
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
        public static /* synthetic */ void access$400(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-479590235 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$400(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, java.lang.String):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$400(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1501680126 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$500(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1501680126 < 0)
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
        public static /* synthetic */ void access$500(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1501680126 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$500(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$500(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (380974120 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$600(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (380974120 > 408588)
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
        public static /* synthetic */ void access$600(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (380974120 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$600(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$600(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1730006030 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$700(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1730006030 < 0)
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
        public static /* synthetic */ void access$700(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1730006030 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$700(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$700(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1256947736 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$800(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1256947736 > 408588)
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
        public static /* synthetic */ void access$800(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1256947736 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$800(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$800(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (95470400 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$900(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (95470400 > 408588)
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
        public static /* synthetic */ void access$900(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (95470400 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$900(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.access$900(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2017453930 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearCustomType():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2017453930 > 408588)
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
        private void clearCustomType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2017453930 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearCustomType():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearCustomType():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (166917555 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearType():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (166917555 > 408588)
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
        private void clearType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (166917555 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearType():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearType():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-871316018 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearValue():void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-871316018 < 0)
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
        private void clearValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-871316018 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearValue():void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.clearValue():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1263857353 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getDefaultInstance():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1263857353 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1263857353 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getDefaultInstance():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getDefaultInstance():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1238362366 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1238362366 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1238362366 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1065170990 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1065170990 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1065170990 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (558733726 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (558733726 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (558733726 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1605543188 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1605543188 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1605543188 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-542406133 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-542406133 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-542406133 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (275252646 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (275252646 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (275252646 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1344933920 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1344933920 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1344933920 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2127323227 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2127323227 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2127323227 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-919205186 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-919205186 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-919205186 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.io.InputStream):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-599209750 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-599209750 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-599209750 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1358268019 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1358268019 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1358268019 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-668103403 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-668103403 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-668103403 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1643184342 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(byte[]):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1643184342 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1643184342 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(byte[]):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(byte[]):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (944463835 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (944463835 > 408588)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (944463835 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1322874732 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parser():com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1322874732 < 0)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1322874732 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parser():com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption>, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (317387778 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setCustomType(java.lang.String):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (317387778 > 408588)
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
        private void setCustomType(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (317387778 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setCustomType(java.lang.String):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setCustomType(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1519860410 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setCustomTypeBytes(com.google.protobuf.ByteString):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1519860410 > 408588)
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
        private void setCustomTypeBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1519860410 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setCustomTypeBytes(com.google.protobuf.ByteString):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setCustomTypeBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (630265002 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setType(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (630265002 > 408588)
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
        private void setType(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (630265002 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setType(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setType(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1533069276 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setTypeValue(int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1533069276 > 408588)
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
        private void setTypeValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1533069276 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setTypeValue(int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setTypeValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1392397810 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setValue(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1392397810 > 408588)
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
        private void setValue(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1392397810 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setValue(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setValue(gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (105143886 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setValueValue(int):void, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (105143886 > 408588)
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
        private void setValueValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (105143886 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setValueValue(int):void, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.setValueValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1740856082 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1740856082 < 0)
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
        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1740856082 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (296160340 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getCustomType():java.lang.String, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (296160340 > 408588)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public java.lang.String getCustomType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (296160340 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getCustomType():java.lang.String, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getCustomType():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1661674290 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getCustomTypeBytes():com.google.protobuf.ByteString, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1661674290 > 408588)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public com.google.protobuf.ByteString getCustomTypeBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1661674290 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getCustomTypeBytes():com.google.protobuf.ByteString, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getCustomTypeBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1814315458 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1814315458 > 408588)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1814315458 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getType():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-597765830 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getTypeValue():int, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-597765830 < 0)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public int getTypeValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-597765830 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getTypeValue():int, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getTypeValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1106514600 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1106514600 < 0)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1106514600 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getValue():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-936527998 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getValueValue():int, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-936527998 < 0)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public int getValueValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-936527998 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getValueValue():int, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.getValueValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1481457560 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.hasCustomType():boolean, file: classes7.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1481457560 > 408588)
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
        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public boolean hasCustomType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1481457560 > 408588) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.hasCustomType():boolean, file: classes7.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.hasCustomType():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes27.dex */
    public interface DeveloperConsentOptionOrBuilder extends MessageLiteOrBuilder {
        String getCustomType();

        ByteString getCustomTypeBytes();

        DeveloperConsentType getType();

        int getTypeValue();

        DeveloperConsentChoice getValue();

        int getValueValue();

        boolean hasCustomType();
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public interface DeveloperConsentOrBuilder extends MessageLiteOrBuilder {
        DeveloperConsentOption getOptions(int i);

        int getOptionsCount();

        List<DeveloperConsentOption> getOptionsList();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes32.dex */
    public static final class DeveloperConsentType implements Internal.EnumLite {
        private static final /* synthetic */ DeveloperConsentType[] $VALUES = null;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_CUSTOM = null;
        public static final int DEVELOPER_CONSENT_TYPE_CUSTOM_VALUE = 1;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_GDPR_CONSENT = null;
        public static final int DEVELOPER_CONSENT_TYPE_GDPR_CONSENT_VALUE = 5;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL = null;
        public static final int DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL_VALUE = 2;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_PIPL_CONSENT = null;
        public static final int DEVELOPER_CONSENT_TYPE_PIPL_CONSENT_VALUE = 3;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT = null;
        public static final int DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT_VALUE = 4;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL = null;
        public static final int DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL_VALUE = 9;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT = null;
        public static final int DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT_VALUE = 7;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT = null;
        public static final int DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT_VALUE = 8;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_UNSPECIFIED = null;
        public static final int DEVELOPER_CONSENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final DeveloperConsentType DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT = null;
        public static final int DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT_VALUE = 6;
        public static final DeveloperConsentType UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<DeveloperConsentType> internalValueMap = null;
        private final int value;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (442641014 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.$values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType[], file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (442641014 > 420208)
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
        private static /* synthetic */ gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType[] $values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (442641014 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.$values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType[], file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.$values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2027140870 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.<clinit>():void, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2027140870 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2027140870 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.<clinit>():void, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1703181174 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.<init>(java.lang.String, int, int):void, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1703181174 > 420208)
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
        private DeveloperConsentType(java.lang.String r1, int r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1703181174 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.<init>(java.lang.String, int, int):void, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.<init>(java.lang.String, int, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (31067709 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.forNumber(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (31067709 > 420208)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType forNumber(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (31067709 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.forNumber(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.forNumber(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1230779720 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType>, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1230779720 < 0)
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
        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType> internalGetValueMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1230779720 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType>, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.internalGetValueMap():com.google.protobuf.Internal$EnumLiteMap");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1807453884 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1807453884 > 420208)
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
        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1807453884 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.internalGetVerifier():com.google.protobuf.Internal$EnumVerifier");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-692582042 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.valueOf(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-692582042 < 0)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType valueOf(int r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-692582042 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.valueOf(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.valueOf(int):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1739062775 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.valueOf(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1739062775 > 420208)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType valueOf(java.lang.String r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1739062775 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.valueOf(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.valueOf(java.lang.String):gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (982922535 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType[], file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (982922535 > 420208)
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
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType[] values() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (982922535 > 420208) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType[], file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.values():gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType[]");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-801808438 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.getNumber():int, file: classes32.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-801808438 < 0)
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
        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-801808438 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.getNumber():int, file: classes32.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.getNumber():int");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1245942061 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.<init>():void, file: classes28.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1245942061 < 0)
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
    private DeveloperConsentOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1245942061 < 0) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.<init>():void, file: classes28.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1288266252 > 401788) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes28.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1288266252 > 401788)
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
    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1288266252 > 401788) in method: gatewayprotocol.v1.DeveloperConsentOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes28.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DeveloperConsentOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

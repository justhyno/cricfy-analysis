package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;

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
/* loaded from: classes18.dex */
public final class DynamicDeviceInfoKt {
    public static final DynamicDeviceInfoKt INSTANCE = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes13.dex */
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = null;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes25.dex */
        public static final class Dsl {
            public static final Companion Companion = null;
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes18.dex */
            public static final class Companion {
                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1842584058 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion.<init>():void, file: classes18.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1842584058 > 348964)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1842584058 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion.<init>():void, file: classes18.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion.<init>():void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2097493760 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion.<init>(bd0):void, file: classes18.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2097493760 < 0)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2097493760 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion.<init>(bd0):void, file: classes18.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion.<init>(bd0):void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1173514005 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$AndroidKt$Dsl, file: classes18.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1173514005 > 348964)
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
                public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder r1) {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1173514005 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$AndroidKt$Dsl, file: classes18.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$AndroidKt$Dsl");
                }
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2008384370 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<clinit>():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2008384370 < 0)
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
            static {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2008384370 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<clinit>():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<clinit>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-898235769 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-898235769 < 0)
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
            private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-898235769 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1350857909 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder, bd0):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1350857909 < 0)
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
            public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder r1, p000.bd0 r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1350857909 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder, bd0):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder, bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1785337848 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1785337848 > 346388)
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
            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1785337848 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (549835708 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAccessibilityDisplayDaltonizer():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (549835708 > 346388)
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
            public final void clearAccessibilityDisplayDaltonizer() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (549835708 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAccessibilityDisplayDaltonizer():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAccessibilityDisplayDaltonizer():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-825292466 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAdbEnabled():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-825292466 < 0)
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
            public final void clearAdbEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-825292466 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAdbEnabled():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAdbEnabled():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-784928138 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAirplaneMode():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-784928138 < 0)
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
            public final void clearAirplaneMode() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-784928138 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAirplaneMode():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAirplaneMode():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (550159368 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAnimatorScale():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (550159368 > 346388)
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
            public final void clearAnimatorScale() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (550159368 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAnimatorScale():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearAnimatorScale():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1431739725 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearChargingType():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1431739725 < 0)
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
            public final void clearChargingType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1431739725 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearChargingType():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearChargingType():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1978355850 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDeviceElapsedRealtime():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1978355850 < 0)
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
            public final void clearDeviceElapsedRealtime() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1978355850 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDeviceElapsedRealtime():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDeviceElapsedRealtime():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-174790061 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDeviceUpTime():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-174790061 < 0)
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
            public final void clearDeviceUpTime() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-174790061 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDeviceUpTime():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDeviceUpTime():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-935508019 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDisplayInversionEnabled():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-935508019 < 0)
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
            public final void clearDisplayInversionEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-935508019 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDisplayInversionEnabled():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearDisplayInversionEnabled():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-101569130 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearFontScale():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-101569130 < 0)
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
            public final void clearFontScale() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-101569130 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearFontScale():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearFontScale():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2140640772 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearFreeDiskSpaceInternal():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2140640772 > 346388)
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
            public final void clearFreeDiskSpaceInternal() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2140640772 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearFreeDiskSpaceInternal():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearFreeDiskSpaceInternal():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (177801410 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearJvmFreeMemory():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (177801410 > 346388)
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
            public final void clearJvmFreeMemory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (177801410 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearJvmFreeMemory():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearJvmFreeMemory():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1740947343 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearJvmTotalMemory():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1740947343 > 346388)
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
            public final void clearJvmTotalMemory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1740947343 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearJvmTotalMemory():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearJvmTotalMemory():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1952144598 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearMaxVolume():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1952144598 > 346388)
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
            public final void clearMaxVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1952144598 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearMaxVolume():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearMaxVolume():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1144687650 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkCapabilityTransports():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1144687650 < 0)
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
            public final void clearNetworkCapabilityTransports() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1144687650 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkCapabilityTransports():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkCapabilityTransports():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1119178148 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkConnected():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1119178148 < 0)
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
            public final void clearNetworkConnected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1119178148 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkConnected():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkConnected():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2023812305 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkMetered():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2023812305 < 0)
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
            public final void clearNetworkMetered() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2023812305 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkMetered():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkMetered():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1358245374 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkType():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1358245374 < 0)
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
            public final void clearNetworkType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1358245374 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkType():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearNetworkType():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (224903384 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearScreenBrightness():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (224903384 > 346388)
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
            public final void clearScreenBrightness() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (224903384 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearScreenBrightness():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearScreenBrightness():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1775271430 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearSdCardPresent():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1775271430 < 0)
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
            public final void clearSdCardPresent() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1775271430 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearSdCardPresent():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearSdCardPresent():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-768752528 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearStayOnWhilePluggedIn():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-768752528 < 0)
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
            public final void clearStayOnWhilePluggedIn() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-768752528 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearStayOnWhilePluggedIn():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearStayOnWhilePluggedIn():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1180074012 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearTelephonyManagerNetworkType():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1180074012 > 346388)
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
            public final void clearTelephonyManagerNetworkType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1180074012 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearTelephonyManagerNetworkType():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearTelephonyManagerNetworkType():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1583089121 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearUsbConnected():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1583089121 < 0)
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
            public final void clearUsbConnected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1583089121 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearUsbConnected():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearUsbConnected():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (114797690 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearVolume():void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (114797690 > 346388)
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
            public final void clearVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (114797690 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearVolume():void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.clearVolume():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1117354344 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAccessibilityDisplayDaltonizer():int, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1117354344 < 0)
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
            public final int getAccessibilityDisplayDaltonizer() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1117354344 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAccessibilityDisplayDaltonizer():int, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAccessibilityDisplayDaltonizer():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1904401316 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAdbEnabled():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1904401316 > 346388)
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
            public final boolean getAdbEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1904401316 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAdbEnabled():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAdbEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-557958790 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAirplaneMode():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-557958790 < 0)
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
            public final boolean getAirplaneMode() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-557958790 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAirplaneMode():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAirplaneMode():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (909848198 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAnimatorScale():float, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (909848198 > 346388)
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
            public final float getAnimatorScale() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (909848198 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAnimatorScale():float, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getAnimatorScale():float");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1584235886 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getChargingType():int, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1584235886 < 0)
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
            public final int getChargingType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1584235886 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getChargingType():int, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getChargingType():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1678175326 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDeviceElapsedRealtime():long, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1678175326 < 0)
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
            public final long getDeviceElapsedRealtime() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1678175326 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDeviceElapsedRealtime():long, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDeviceElapsedRealtime():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-278167189 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDeviceUpTime():long, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-278167189 < 0)
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
            public final long getDeviceUpTime() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-278167189 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDeviceUpTime():long, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDeviceUpTime():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (343958376 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDisplayInversionEnabled():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (343958376 > 346388)
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
            public final boolean getDisplayInversionEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (343958376 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDisplayInversionEnabled():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getDisplayInversionEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (440172124 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getFontScale():float, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (440172124 > 346388)
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
            public final float getFontScale() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (440172124 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getFontScale():float, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getFontScale():float");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1107427963 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getFreeDiskSpaceInternal():long, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1107427963 > 346388)
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
            public final long getFreeDiskSpaceInternal() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1107427963 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getFreeDiskSpaceInternal():long, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getFreeDiskSpaceInternal():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-69278043 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getJvmFreeMemory():long, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-69278043 < 0)
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
            public final long getJvmFreeMemory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-69278043 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getJvmFreeMemory():long, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getJvmFreeMemory():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (798361470 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getJvmTotalMemory():long, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (798361470 > 346388)
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
            public final long getJvmTotalMemory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (798361470 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getJvmTotalMemory():long, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getJvmTotalMemory():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1510918590 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getMaxVolume():double, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1510918590 > 346388)
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
            public final double getMaxVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1510918590 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getMaxVolume():double, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getMaxVolume():double");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1699727650 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkCapabilityTransports():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1699727650 > 346388)
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
            public final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1699727650 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkCapabilityTransports():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkCapabilityTransports():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-29007154 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkConnected():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-29007154 < 0)
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
            public final boolean getNetworkConnected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-29007154 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkConnected():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkConnected():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1404976770 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkMetered():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1404976770 > 346388)
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
            public final boolean getNetworkMetered() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1404976770 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkMetered():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkMetered():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (22620011 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkType():int, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (22620011 > 346388)
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
            public final int getNetworkType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (22620011 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkType():int, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getNetworkType():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2095702486 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getScreenBrightness():double, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2095702486 > 346388)
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
            public final double getScreenBrightness() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2095702486 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getScreenBrightness():double, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getScreenBrightness():double");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-115683912 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getSdCardPresent():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-115683912 < 0)
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
            public final boolean getSdCardPresent() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-115683912 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getSdCardPresent():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getSdCardPresent():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1498741770 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getStayOnWhilePluggedIn():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1498741770 > 346388)
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
            public final boolean getStayOnWhilePluggedIn() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1498741770 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getStayOnWhilePluggedIn():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getStayOnWhilePluggedIn():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1327244951 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getTelephonyManagerNetworkType():int, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1327244951 > 346388)
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
            public final int getTelephonyManagerNetworkType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1327244951 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getTelephonyManagerNetworkType():int, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getTelephonyManagerNetworkType():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (106491145 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getUsbConnected():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (106491145 > 346388)
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
            public final boolean getUsbConnected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (106491145 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getUsbConnected():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getUsbConnected():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-68150660 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getVolume():double, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-68150660 < 0)
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
            public final double getVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-68150660 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getVolume():double, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.getVolume():double");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1782711202 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAccessibilityDisplayDaltonizer():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1782711202 < 0)
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
            public final boolean hasAccessibilityDisplayDaltonizer() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1782711202 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAccessibilityDisplayDaltonizer():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAccessibilityDisplayDaltonizer():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-366580642 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAdbEnabled():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-366580642 < 0)
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
            public final boolean hasAdbEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-366580642 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAdbEnabled():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAdbEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-811865686 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAirplaneMode():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-811865686 < 0)
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
            public final boolean hasAirplaneMode() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-811865686 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAirplaneMode():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAirplaneMode():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-998309534 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAnimatorScale():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-998309534 < 0)
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
            public final boolean hasAnimatorScale() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-998309534 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAnimatorScale():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasAnimatorScale():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1872913682 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasChargingType():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1872913682 < 0)
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
            public final boolean hasChargingType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1872913682 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasChargingType():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasChargingType():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1482293056 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDeviceElapsedRealtime():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1482293056 > 346388)
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
            public final boolean hasDeviceElapsedRealtime() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1482293056 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDeviceElapsedRealtime():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDeviceElapsedRealtime():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (118292042 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDeviceUpTime():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (118292042 > 346388)
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
            public final boolean hasDeviceUpTime() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (118292042 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDeviceUpTime():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDeviceUpTime():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1775387210 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDisplayInversionEnabled():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1775387210 < 0)
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
            public final boolean hasDisplayInversionEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1775387210 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDisplayInversionEnabled():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasDisplayInversionEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1146697696 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasFontScale():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1146697696 < 0)
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
            public final boolean hasFontScale() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1146697696 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasFontScale():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasFontScale():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-236002800 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasFreeDiskSpaceInternal():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-236002800 < 0)
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
            public final boolean hasFreeDiskSpaceInternal() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-236002800 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasFreeDiskSpaceInternal():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasFreeDiskSpaceInternal():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2018023922 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasJvmFreeMemory():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2018023922 < 0)
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
            public final boolean hasJvmFreeMemory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2018023922 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasJvmFreeMemory():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasJvmFreeMemory():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1772071346 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasJvmTotalMemory():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1772071346 > 346388)
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
            public final boolean hasJvmTotalMemory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1772071346 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasJvmTotalMemory():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasJvmTotalMemory():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (127532448 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasMaxVolume():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (127532448 > 346388)
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
            public final boolean hasMaxVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (127532448 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasMaxVolume():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasMaxVolume():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2144348896 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkCapabilityTransports():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2144348896 > 346388)
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
            public final boolean hasNetworkCapabilityTransports() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2144348896 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkCapabilityTransports():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkCapabilityTransports():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (538735136 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkConnected():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (538735136 > 346388)
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
            public final boolean hasNetworkConnected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (538735136 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkConnected():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkConnected():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1310470682 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkMetered():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1310470682 < 0)
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
            public final boolean hasNetworkMetered() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1310470682 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkMetered():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkMetered():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1051800364 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkType():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1051800364 < 0)
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
            public final boolean hasNetworkType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1051800364 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkType():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasNetworkType():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (929882371 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasScreenBrightness():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (929882371 > 346388)
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
            public final boolean hasScreenBrightness() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (929882371 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasScreenBrightness():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasScreenBrightness():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2034705382 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasSdCardPresent():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2034705382 > 346388)
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
            public final boolean hasSdCardPresent() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2034705382 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasSdCardPresent():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasSdCardPresent():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1327053340 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasStayOnWhilePluggedIn():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1327053340 > 346388)
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
            public final boolean hasStayOnWhilePluggedIn() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1327053340 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasStayOnWhilePluggedIn():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasStayOnWhilePluggedIn():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1035503467 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasTelephonyManagerNetworkType():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1035503467 > 346388)
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
            public final boolean hasTelephonyManagerNetworkType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1035503467 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasTelephonyManagerNetworkType():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasTelephonyManagerNetworkType():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1977253671 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasUsbConnected():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1977253671 > 346388)
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
            public final boolean hasUsbConnected() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1977253671 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasUsbConnected():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasUsbConnected():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-37310880 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasVolume():boolean, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-37310880 < 0)
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
            public final boolean hasVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-37310880 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasVolume():boolean, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.hasVolume():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-527345973 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAccessibilityDisplayDaltonizer(int):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-527345973 < 0)
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
            public final void setAccessibilityDisplayDaltonizer(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-527345973 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAccessibilityDisplayDaltonizer(int):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAccessibilityDisplayDaltonizer(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (256422329 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAdbEnabled(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (256422329 > 346388)
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
            public final void setAdbEnabled(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (256422329 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAdbEnabled(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAdbEnabled(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2052496214 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAirplaneMode(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2052496214 > 346388)
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
            public final void setAirplaneMode(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2052496214 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAirplaneMode(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAirplaneMode(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2112394580 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAnimatorScale(float):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2112394580 < 0)
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
            public final void setAnimatorScale(float r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2112394580 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAnimatorScale(float):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setAnimatorScale(float):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-379197034 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setChargingType(int):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-379197034 < 0)
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
            public final void setChargingType(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-379197034 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setChargingType(int):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setChargingType(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (227696442 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDeviceElapsedRealtime(long):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (227696442 > 346388)
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
            public final void setDeviceElapsedRealtime(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (227696442 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDeviceElapsedRealtime(long):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDeviceElapsedRealtime(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (785812294 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDeviceUpTime(long):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (785812294 > 346388)
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
            public final void setDeviceUpTime(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (785812294 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDeviceUpTime(long):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDeviceUpTime(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (300059758 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDisplayInversionEnabled(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (300059758 > 346388)
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
            public final void setDisplayInversionEnabled(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (300059758 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDisplayInversionEnabled(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setDisplayInversionEnabled(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-762250334 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setFontScale(float):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-762250334 < 0)
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
            public final void setFontScale(float r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-762250334 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setFontScale(float):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setFontScale(float):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (330731928 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setFreeDiskSpaceInternal(long):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (330731928 > 346388)
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
            public final void setFreeDiskSpaceInternal(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (330731928 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setFreeDiskSpaceInternal(long):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setFreeDiskSpaceInternal(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1672722852 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setJvmFreeMemory(long):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1672722852 < 0)
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
            public final void setJvmFreeMemory(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1672722852 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setJvmFreeMemory(long):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setJvmFreeMemory(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1014563032 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setJvmTotalMemory(long):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1014563032 < 0)
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
            public final void setJvmTotalMemory(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1014563032 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setJvmTotalMemory(long):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setJvmTotalMemory(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1453796950 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setMaxVolume(double):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1453796950 > 346388)
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
            public final void setMaxVolume(double r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1453796950 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setMaxVolume(double):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setMaxVolume(double):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1734688471 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1734688471 > 346388)
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
            public final void setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1734688471 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1259599866 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkConnected(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1259599866 < 0)
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
            public final void setNetworkConnected(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1259599866 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkConnected(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkConnected(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1146148876 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkMetered(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1146148876 < 0)
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
            public final void setNetworkMetered(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1146148876 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkMetered(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkMetered(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-847015780 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkType(int):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-847015780 < 0)
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
            public final void setNetworkType(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-847015780 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkType(int):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setNetworkType(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1837536820 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setScreenBrightness(double):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1837536820 > 346388)
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
            public final void setScreenBrightness(double r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1837536820 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setScreenBrightness(double):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setScreenBrightness(double):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1146655990 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setSdCardPresent(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1146655990 < 0)
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
            public final void setSdCardPresent(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1146655990 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setSdCardPresent(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setSdCardPresent(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1615178191 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setStayOnWhilePluggedIn(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1615178191 > 346388)
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
            public final void setStayOnWhilePluggedIn(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1615178191 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setStayOnWhilePluggedIn(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setStayOnWhilePluggedIn(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1501236649 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setTelephonyManagerNetworkType(int):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1501236649 > 346388)
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
            public final void setTelephonyManagerNetworkType(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1501236649 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setTelephonyManagerNetworkType(int):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setTelephonyManagerNetworkType(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-575740459 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setUsbConnected(boolean):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-575740459 < 0)
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
            public final void setUsbConnected(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-575740459 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setUsbConnected(boolean):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setUsbConnected(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1457762747 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setVolume(double):void, file: classes25.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1457762747 > 346388)
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
            public final void setVolume(double r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1457762747 > 346388) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setVolume(double):void, file: classes25.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.setVolume(double):void");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-372187302 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.<clinit>():void, file: classes13.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-372187302 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-372187302 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.<clinit>():void, file: classes13.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2063274411 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.<init>():void, file: classes13.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2063274411 > 389804)
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
        private AndroidKt() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2063274411 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.<init>():void, file: classes13.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.<init>():void");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes14.dex */
    public static final class Dsl {
        public static final Companion Companion = null;
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes28.dex */
        public static final class AccelerometerSamplesProxy extends DslProxy {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (891530286 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.AccelerometerSamplesProxy.<init>():void, file: classes28.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (891530286 > 401788)
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
            private AccelerometerSamplesProxy() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (891530286 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.AccelerometerSamplesProxy.<init>():void, file: classes28.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.AccelerometerSamplesProxy.<init>():void");
            }
        }

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes34.dex */
        public static final class Companion {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1794333134 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion.<init>():void, file: classes34.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1794333134 < 0)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1794333134 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion.<init>():void, file: classes34.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1794974015 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion.<init>(bd0):void, file: classes34.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1794974015 < 0)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1794974015 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion.<init>(bd0):void, file: classes34.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion.<init>(bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (242781424 > 358344) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl, file: classes34.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (242781424 > 358344)
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
            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (242781424 > 358344) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl, file: classes34.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1436466482 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<clinit>():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1436466482 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1436466482 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<clinit>():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1094059738 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1094059738 < 0)
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
        private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1094059738 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-291242349 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder, bd0):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-291242349 < 0)
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
        public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder r1, p000.bd0 r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-291242349 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder, bd0):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder, bd0):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (927231626 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (927231626 > 393876)
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
        public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (927231626 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1707026166 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.addAccelerometerSamples(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1707026166 < 0)
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
        public final /* synthetic */ void addAccelerometerSamples(com.google.protobuf.kotlin.DslList r1, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AccelerometerSample r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1707026166 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.addAccelerometerSamples(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.addAccelerometerSamples(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1335740970 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.addAllAccelerometerSamples(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1335740970 < 0)
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
        public final /* synthetic */ void addAllAccelerometerSamples(com.google.protobuf.kotlin.DslList r1, java.lang.Iterable r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1335740970 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.addAllAccelerometerSamples(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.addAllAccelerometerSamples(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1326496316 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAccelerometerSamples(com.google.protobuf.kotlin.DslList):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1326496316 < 0)
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
        public final /* synthetic */ void clearAccelerometerSamples(com.google.protobuf.kotlin.DslList r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1326496316 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAccelerometerSamples(com.google.protobuf.kotlin.DslList):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAccelerometerSamples(com.google.protobuf.kotlin.DslList):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1705123458 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAndroid():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1705123458 > 393876)
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
        public final void clearAndroid() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1705123458 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAndroid():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAndroid():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-942947527 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAppActive():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-942947527 < 0)
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
        public final void clearAppActive() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-942947527 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAppActive():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearAppActive():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1988208482 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearBatteryLevel():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1988208482 > 393876)
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
        public final void clearBatteryLevel() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1988208482 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearBatteryLevel():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearBatteryLevel():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (606805630 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearBatteryStatus():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (606805630 > 393876)
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
        public final void clearBatteryStatus() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (606805630 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearBatteryStatus():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearBatteryStatus():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1012427242 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearConnectionType():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1012427242 > 393876)
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
        public final void clearConnectionType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1012427242 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearConnectionType():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearConnectionType():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2058033454 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearFreeDiskSpace():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2058033454 > 393876)
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
        public final void clearFreeDiskSpace() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2058033454 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearFreeDiskSpace():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearFreeDiskSpace():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-457443786 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearFreeRamMemory():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-457443786 < 0)
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
        public final void clearFreeRamMemory() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-457443786 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearFreeRamMemory():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearFreeRamMemory():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1873819279 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearIos():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1873819279 < 0)
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
        public final void clearIos() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1873819279 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearIos():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearIos():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2103353963 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLanguage():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2103353963 > 393876)
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
        public final void clearLanguage() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2103353963 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLanguage():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLanguage():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1609600782 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLimitedOpenAdTracking():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1609600782 > 393876)
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
        public final void clearLimitedOpenAdTracking() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1609600782 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLimitedOpenAdTracking():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLimitedOpenAdTracking():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-39291162 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLimitedTracking():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-39291162 < 0)
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
        public final void clearLimitedTracking() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-39291162 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLimitedTracking():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLimitedTracking():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-826783990 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLowPowerMode():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-826783990 < 0)
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
        public final void clearLowPowerMode() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-826783990 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLowPowerMode():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearLowPowerMode():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-11216235 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearNetworkOperator():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-11216235 < 0)
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
        public final void clearNetworkOperator() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-11216235 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearNetworkOperator():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearNetworkOperator():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (455244230 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearNetworkOperatorName():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (455244230 > 393876)
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
        public final void clearNetworkOperatorName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (455244230 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearNetworkOperatorName():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearNetworkOperatorName():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2005083328 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearPlatformSpecific():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2005083328 < 0)
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
        public final void clearPlatformSpecific() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2005083328 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearPlatformSpecific():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearPlatformSpecific():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-357110106 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearScreenHeight():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-357110106 < 0)
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
        public final void clearScreenHeight() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-357110106 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearScreenHeight():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearScreenHeight():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1959834174 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearScreenWidth():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1959834174 > 393876)
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
        public final void clearScreenWidth() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1959834174 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearScreenWidth():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearScreenWidth():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (846425022 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearTimeZone():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (846425022 > 393876)
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
        public final void clearTimeZone() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (846425022 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearTimeZone():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearTimeZone():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1470455854 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearTimeZoneOffset():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1470455854 < 0)
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
        public final void clearTimeZoneOffset() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1470455854 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearTimeZoneOffset():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearTimeZoneOffset():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-296717029 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearUserId():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-296717029 < 0)
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
        public final void clearUserId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-296717029 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearUserId():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearUserId():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (290640881 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearWeb():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (290640881 > 393876)
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
        public final void clearWeb() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (290640881 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearWeb():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearWeb():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-877076966 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearWiredHeadset():void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-877076966 < 0)
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
        public final void clearWiredHeadset() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-877076966 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearWiredHeadset():void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.clearWiredHeadset():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1365515669 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAccelerometerSamples():com.google.protobuf.kotlin.DslList, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1365515669 < 0)
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
        public final /* synthetic */ com.google.protobuf.kotlin.DslList getAccelerometerSamples() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1365515669 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAccelerometerSamples():com.google.protobuf.kotlin.DslList, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAccelerometerSamples():com.google.protobuf.kotlin.DslList");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-780451698 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAndroid():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-780451698 < 0)
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
        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-780451698 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAndroid():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAndroid():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-711617736 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAppActive():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-711617736 < 0)
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
        public final boolean getAppActive() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-711617736 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAppActive():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getAppActive():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1133656390 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getBatteryLevel():double, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1133656390 < 0)
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
        public final double getBatteryLevel() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1133656390 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getBatteryLevel():double, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getBatteryLevel():double");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1445690574 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getBatteryStatus():int, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1445690574 > 393876)
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
        public final int getBatteryStatus() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1445690574 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getBatteryStatus():int, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getBatteryStatus():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2094418736 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getConnectionType():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2094418736 > 393876)
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
        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2094418736 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getConnectionType():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getConnectionType():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1344855021 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getConnectionTypeValue():int, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1344855021 < 0)
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
        public final int getConnectionTypeValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1344855021 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getConnectionTypeValue():int, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getConnectionTypeValue():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1061262426 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getFreeDiskSpace():long, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1061262426 > 393876)
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
        public final long getFreeDiskSpace() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1061262426 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getFreeDiskSpace():long, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getFreeDiskSpace():long");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1079537410 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getFreeRamMemory():long, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1079537410 < 0)
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
        public final long getFreeRamMemory() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1079537410 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getFreeRamMemory():long, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getFreeRamMemory():long");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1336782666 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getIos():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1336782666 < 0)
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
        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1336782666 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getIos():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getIos():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-955297034 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLanguage():java.lang.String, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-955297034 < 0)
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
        public final java.lang.String getLanguage() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-955297034 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLanguage():java.lang.String, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLanguage():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1726228047 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLimitedOpenAdTracking():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1726228047 < 0)
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
        public final boolean getLimitedOpenAdTracking() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1726228047 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLimitedOpenAdTracking():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLimitedOpenAdTracking():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1018218766 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLimitedTracking():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1018218766 < 0)
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
        public final boolean getLimitedTracking() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1018218766 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLimitedTracking():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLimitedTracking():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (757310957 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLowPowerMode():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (757310957 > 393876)
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
        public final boolean getLowPowerMode() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (757310957 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLowPowerMode():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getLowPowerMode():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-329315536 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getNetworkOperator():java.lang.String, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-329315536 < 0)
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
        public final java.lang.String getNetworkOperator() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-329315536 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getNetworkOperator():java.lang.String, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getNetworkOperator():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2090937846 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getNetworkOperatorName():java.lang.String, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2090937846 > 393876)
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
        public final java.lang.String getNetworkOperatorName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2090937846 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getNetworkOperatorName():java.lang.String, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getNetworkOperatorName():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1072161953 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getPlatformSpecificCase():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1072161953 > 393876)
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
        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1072161953 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getPlatformSpecificCase():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getPlatformSpecificCase():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1718588778 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getScreenHeight():int, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1718588778 > 393876)
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
        public final int getScreenHeight() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1718588778 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getScreenHeight():int, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getScreenHeight():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1902253387 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getScreenWidth():int, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1902253387 > 393876)
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
        public final int getScreenWidth() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1902253387 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getScreenWidth():int, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getScreenWidth():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-595961652 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getTimeZone():java.lang.String, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-595961652 < 0)
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
        public final java.lang.String getTimeZone() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-595961652 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getTimeZone():java.lang.String, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getTimeZone():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (849072944 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getTimeZoneOffset():long, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (849072944 > 393876)
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
        public final long getTimeZoneOffset() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (849072944 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getTimeZoneOffset():long, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getTimeZoneOffset():long");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1821107776 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getUserId():java.lang.String, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1821107776 > 393876)
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
        public final java.lang.String getUserId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1821107776 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getUserId():java.lang.String, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getUserId():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1928418810 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getWeb():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1928418810 > 393876)
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
        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web getWeb() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1928418810 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getWeb():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getWeb():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1086900683 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getWiredHeadset():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1086900683 < 0)
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
        public final boolean getWiredHeadset() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1086900683 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getWiredHeadset():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.getWiredHeadset():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-184708140 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasAndroid():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-184708140 < 0)
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
        public final boolean hasAndroid() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-184708140 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasAndroid():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasAndroid():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-997878230 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasAppActive():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-997878230 < 0)
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
        public final boolean hasAppActive() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-997878230 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasAppActive():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasAppActive():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-867208803 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasBatteryLevel():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-867208803 < 0)
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
        public final boolean hasBatteryLevel() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-867208803 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasBatteryLevel():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasBatteryLevel():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (503751162 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasBatteryStatus():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (503751162 > 393876)
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
        public final boolean hasBatteryStatus() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (503751162 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasBatteryStatus():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasBatteryStatus():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (217612750 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasConnectionType():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (217612750 > 393876)
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
        public final boolean hasConnectionType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (217612750 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasConnectionType():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasConnectionType():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (994584026 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasFreeDiskSpace():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (994584026 > 393876)
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
        public final boolean hasFreeDiskSpace() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (994584026 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasFreeDiskSpace():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasFreeDiskSpace():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1461227856 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasFreeRamMemory():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1461227856 < 0)
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
        public final boolean hasFreeRamMemory() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1461227856 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasFreeRamMemory():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasFreeRamMemory():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1876069858 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasIos():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1876069858 < 0)
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
        public final boolean hasIos() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1876069858 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasIos():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasIos():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1843939682 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLanguage():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1843939682 < 0)
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
        public final boolean hasLanguage() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1843939682 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLanguage():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLanguage():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-107529803 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLimitedOpenAdTracking():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-107529803 < 0)
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
        public final boolean hasLimitedOpenAdTracking() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-107529803 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLimitedOpenAdTracking():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLimitedOpenAdTracking():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1006142058 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLimitedTracking():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1006142058 < 0)
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
        public final boolean hasLimitedTracking() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1006142058 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLimitedTracking():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLimitedTracking():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2079983518 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLowPowerMode():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2079983518 > 393876)
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
        public final boolean hasLowPowerMode() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2079983518 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLowPowerMode():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasLowPowerMode():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-710906868 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasNetworkOperator():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-710906868 < 0)
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
        public final boolean hasNetworkOperator() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-710906868 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasNetworkOperator():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasNetworkOperator():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1233597020 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasNetworkOperatorName():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1233597020 > 393876)
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
        public final boolean hasNetworkOperatorName() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1233597020 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasNetworkOperatorName():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasNetworkOperatorName():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1192133442 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasScreenHeight():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1192133442 < 0)
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
        public final boolean hasScreenHeight() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1192133442 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasScreenHeight():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasScreenHeight():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1081134794 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasScreenWidth():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1081134794 > 393876)
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
        public final boolean hasScreenWidth() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1081134794 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasScreenWidth():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasScreenWidth():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1439570885 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasTimeZone():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1439570885 > 393876)
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
        public final boolean hasTimeZone() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1439570885 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasTimeZone():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasTimeZone():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1749391232 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasTimeZoneOffset():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1749391232 < 0)
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
        public final boolean hasTimeZoneOffset() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1749391232 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasTimeZoneOffset():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasTimeZoneOffset():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-349222300 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasUserId():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-349222300 < 0)
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
        public final boolean hasUserId() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-349222300 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasUserId():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasUserId():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-216619158 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasWeb():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-216619158 < 0)
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
        public final boolean hasWeb() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-216619158 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasWeb():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasWeb():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1689159504 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasWiredHeadset():boolean, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1689159504 < 0)
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
        public final boolean hasWiredHeadset() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1689159504 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasWiredHeadset():boolean, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.hasWiredHeadset():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (455107620 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.plusAssignAccelerometerSamples(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample, gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl$AccelerometerSamplesProxy>, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (455107620 > 393876)
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
        public final /* synthetic */ void plusAssignAccelerometerSamples(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AccelerometerSample, gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.AccelerometerSamplesProxy> r1, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AccelerometerSample r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (455107620 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.plusAssignAccelerometerSamples(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample, gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl$AccelerometerSamplesProxy>, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.plusAssignAccelerometerSamples(com.google.protobuf.kotlin.DslList, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (184692918 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.plusAssignAllAccelerometerSamples(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample, gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl$AccelerometerSamplesProxy>, java.lang.Iterable<gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample>):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (184692918 > 393876)
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
        public final /* synthetic */ void plusAssignAllAccelerometerSamples(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AccelerometerSample, gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.AccelerometerSamplesProxy> r1, java.lang.Iterable<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AccelerometerSample> r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (184692918 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.plusAssignAllAccelerometerSamples(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample, gatewayprotocol.v1.DynamicDeviceInfoKt$Dsl$AccelerometerSamplesProxy>, java.lang.Iterable<gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample>):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.plusAssignAllAccelerometerSamples(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (172670488 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAccelerometerSamples(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (172670488 > 393876)
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
        public final /* synthetic */ void setAccelerometerSamples(com.google.protobuf.kotlin.DslList r1, int r2, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AccelerometerSample r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (172670488 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAccelerometerSamples(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAccelerometerSamples(com.google.protobuf.kotlin.DslList, int, gatewayprotocol.v1.DynamicDeviceInfoOuterClass$AccelerometerSample):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-459965894 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-459965894 < 0)
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
        public final void setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-459965894 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-335836499 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAppActive(boolean):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-335836499 < 0)
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
        public final void setAppActive(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-335836499 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAppActive(boolean):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setAppActive(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1747359992 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setBatteryLevel(double):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1747359992 > 393876)
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
        public final void setBatteryLevel(double r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1747359992 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setBatteryLevel(double):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setBatteryLevel(double):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1905569926 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setBatteryStatus(int):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1905569926 > 393876)
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
        public final void setBatteryStatus(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1905569926 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setBatteryStatus(int):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setBatteryStatus(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2118161201 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2118161201 > 393876)
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
        public final void setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2118161201 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1052229834 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setConnectionTypeValue(int):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1052229834 < 0)
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
        public final void setConnectionTypeValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1052229834 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setConnectionTypeValue(int):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setConnectionTypeValue(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (751224958 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setFreeDiskSpace(long):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (751224958 > 393876)
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
        public final void setFreeDiskSpace(long r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (751224958 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setFreeDiskSpace(long):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setFreeDiskSpace(long):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1632699998 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setFreeRamMemory(long):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1632699998 > 393876)
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
        public final void setFreeRamMemory(long r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1632699998 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setFreeRamMemory(long):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setFreeRamMemory(long):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1872489741 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1872489741 > 393876)
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
        public final void setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1872489741 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (237373768 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLanguage(java.lang.String):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (237373768 > 393876)
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
        public final void setLanguage(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (237373768 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLanguage(java.lang.String):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLanguage(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2061369166 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLimitedOpenAdTracking(boolean):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2061369166 < 0)
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
        public final void setLimitedOpenAdTracking(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2061369166 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLimitedOpenAdTracking(boolean):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLimitedOpenAdTracking(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1701421361 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLimitedTracking(boolean):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1701421361 > 393876)
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
        public final void setLimitedTracking(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1701421361 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLimitedTracking(boolean):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLimitedTracking(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1307862508 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLowPowerMode(boolean):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1307862508 > 393876)
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
        public final void setLowPowerMode(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1307862508 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLowPowerMode(boolean):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setLowPowerMode(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (156351910 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setNetworkOperator(java.lang.String):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (156351910 > 393876)
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
        public final void setNetworkOperator(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (156351910 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setNetworkOperator(java.lang.String):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setNetworkOperator(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1703881109 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setNetworkOperatorName(java.lang.String):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1703881109 > 393876)
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
        public final void setNetworkOperatorName(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1703881109 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setNetworkOperatorName(java.lang.String):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setNetworkOperatorName(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1906919975 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setScreenHeight(int):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1906919975 > 393876)
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
        public final void setScreenHeight(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1906919975 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setScreenHeight(int):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setScreenHeight(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1464258286 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setScreenWidth(int):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1464258286 > 393876)
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
        public final void setScreenWidth(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1464258286 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setScreenWidth(int):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setScreenWidth(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1733215812 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setTimeZone(java.lang.String):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1733215812 > 393876)
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
        public final void setTimeZone(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1733215812 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setTimeZone(java.lang.String):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setTimeZone(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1074134068 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setTimeZoneOffset(long):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1074134068 > 393876)
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
        public final void setTimeZoneOffset(long r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1074134068 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setTimeZoneOffset(long):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setTimeZoneOffset(long):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-940637465 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setUserId(java.lang.String):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-940637465 < 0)
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
        public final void setUserId(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-940637465 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setUserId(java.lang.String):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setUserId(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (699686128 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setWeb(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (699686128 > 393876)
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
        public final void setWeb(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (699686128 > 393876) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setWeb(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setWeb(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2127429202 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setWiredHeadset(boolean):void, file: classes14.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2127429202 < 0)
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
        public final void setWiredHeadset(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2127429202 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setWiredHeadset(boolean):void, file: classes14.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.setWiredHeadset(boolean):void");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public static final class IosKt {
        public static final IosKt INSTANCE = null;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes10.dex */
        public static final class Dsl {
            public static final Companion Companion = null;
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes28.dex */
            public static final class Companion {
                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1243100081 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion.<init>():void, file: classes28.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1243100081 > 401788)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1243100081 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion.<init>():void, file: classes28.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion.<init>():void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (268107055 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion.<init>(bd0):void, file: classes28.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (268107055 > 401788)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (268107055 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion.<init>(bd0):void, file: classes28.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion.<init>(bd0):void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1653781530 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl, file: classes28.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1653781530 > 401788)
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
                public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder r1) {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1653781530 > 401788) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl, file: classes28.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl");
                }
            }

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes13.dex */
            public static final class LocaleListProxy extends DslProxy {
                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1068652634 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy.<init>():void, file: classes13.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1068652634 > 389804)
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
                private LocaleListProxy() {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1068652634 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy.<init>():void, file: classes13.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy.<init>():void");
                }
            }

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes30.dex */
            public static final class NwPathInterfacesProxy extends DslProxy {
                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-913262605 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy.<init>():void, file: classes30.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-913262605 < 0)
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
                private NwPathInterfacesProxy() {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-913262605 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy.<init>():void, file: classes30.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy.<init>():void");
                }
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1413035324 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<clinit>():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1413035324 > 376268)
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
            static {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1413035324 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<clinit>():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<clinit>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1131722594 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1131722594 > 376268)
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
            private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1131722594 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-631546001 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder, bd0):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-631546001 < 0)
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
            public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder r1, p000.bd0 r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-631546001 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder, bd0):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder, bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1736544356 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1736544356 > 376268)
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
            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1736544356 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-109817019 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addAllLocaleList(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-109817019 < 0)
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
            public final /* synthetic */ void addAllLocaleList(com.google.protobuf.kotlin.DslList r1, java.lang.Iterable r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-109817019 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addAllLocaleList(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addAllLocaleList(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (393251190 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addAllNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (393251190 > 376268)
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
            public final /* synthetic */ void addAllNwPathInterfaces(com.google.protobuf.kotlin.DslList r1, java.lang.Iterable r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (393251190 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addAllNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addAllNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1529176664 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addLocaleList(com.google.protobuf.kotlin.DslList, java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1529176664 > 376268)
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
            public final /* synthetic */ void addLocaleList(com.google.protobuf.kotlin.DslList r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1529176664 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addLocaleList(com.google.protobuf.kotlin.DslList, java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addLocaleList(com.google.protobuf.kotlin.DslList, java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-815573698 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-815573698 < 0)
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
            public final /* synthetic */ void addNwPathInterfaces(com.google.protobuf.kotlin.DslList r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-815573698 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.addNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1900530651 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearCurrentRadioAccessTechnology():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1900530651 < 0)
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
            public final void clearCurrentRadioAccessTechnology() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1900530651 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearCurrentRadioAccessTechnology():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearCurrentRadioAccessTechnology():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-865174174 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearCurrentUiTheme():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-865174174 < 0)
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
            public final void clearCurrentUiTheme() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-865174174 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearCurrentUiTheme():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearCurrentUiTheme():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1051896391 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceName():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1051896391 < 0)
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
            public final void clearDeviceName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1051896391 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceName():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceName():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1324916274 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceUpTimeWithSleep():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1324916274 > 376268)
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
            public final void clearDeviceUpTimeWithSleep() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1324916274 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceUpTimeWithSleep():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceUpTimeWithSleep():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1488213927 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceUpTimeWithoutSleep():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1488213927 > 376268)
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
            public final void clearDeviceUpTimeWithoutSleep() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1488213927 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceUpTimeWithoutSleep():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearDeviceUpTimeWithoutSleep():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1849271927 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearGrayscaleEnabled():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1849271927 < 0)
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
            public final void clearGrayscaleEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1849271927 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearGrayscaleEnabled():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearGrayscaleEnabled():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1514159330 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearInvertColorsEnabled():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1514159330 < 0)
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
            public final void clearInvertColorsEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1514159330 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearInvertColorsEnabled():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearInvertColorsEnabled():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (154762392 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearLocaleList(com.google.protobuf.kotlin.DslList):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (154762392 > 376268)
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
            public final /* synthetic */ void clearLocaleList(com.google.protobuf.kotlin.DslList r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (154762392 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearLocaleList(com.google.protobuf.kotlin.DslList):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearLocaleList(com.google.protobuf.kotlin.DslList):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-452584721 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearNetworkReachabilityFlags():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-452584721 < 0)
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
            public final void clearNetworkReachabilityFlags() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-452584721 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearNetworkReachabilityFlags():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearNetworkReachabilityFlags():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1419088374 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearNwPathInterfaces(com.google.protobuf.kotlin.DslList):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1419088374 < 0)
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
            public final /* synthetic */ void clearNwPathInterfaces(com.google.protobuf.kotlin.DslList r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1419088374 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearNwPathInterfaces(com.google.protobuf.kotlin.DslList):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearNwPathInterfaces(com.google.protobuf.kotlin.DslList):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1606400114 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearPreferredContentSizeCategory():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1606400114 > 376268)
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
            public final void clearPreferredContentSizeCategory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1606400114 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearPreferredContentSizeCategory():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearPreferredContentSizeCategory():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1365519778 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearReduceMotionEnabled():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1365519778 < 0)
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
            public final void clearReduceMotionEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1365519778 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearReduceMotionEnabled():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearReduceMotionEnabled():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-596300008 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearScreenBrightness():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-596300008 < 0)
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
            public final void clearScreenBrightness() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-596300008 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearScreenBrightness():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearScreenBrightness():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1628137104 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearTrackingAuthStatus():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1628137104 < 0)
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
            public final void clearTrackingAuthStatus() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1628137104 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearTrackingAuthStatus():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearTrackingAuthStatus():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (881944542 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearVolume():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (881944542 > 376268)
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
            public final void clearVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (881944542 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearVolume():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.clearVolume():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1365904030 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getCurrentRadioAccessTechnology():java.lang.String, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1365904030 < 0)
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
            public final java.lang.String getCurrentRadioAccessTechnology() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1365904030 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getCurrentRadioAccessTechnology():java.lang.String, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getCurrentRadioAccessTechnology():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (105486194 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getCurrentUiTheme():int, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (105486194 > 376268)
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
            public final int getCurrentUiTheme() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (105486194 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getCurrentUiTheme():int, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getCurrentUiTheme():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-959834152 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceName():java.lang.String, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-959834152 < 0)
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
            public final java.lang.String getDeviceName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-959834152 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceName():java.lang.String, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceName():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1680767340 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceUpTimeWithSleep():long, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1680767340 < 0)
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
            public final long getDeviceUpTimeWithSleep() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1680767340 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceUpTimeWithSleep():long, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceUpTimeWithSleep():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-928811000 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceUpTimeWithoutSleep():long, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-928811000 < 0)
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
            public final long getDeviceUpTimeWithoutSleep() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-928811000 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceUpTimeWithoutSleep():long, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getDeviceUpTimeWithoutSleep():long");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1289147573 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getGrayscaleEnabled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1289147573 < 0)
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
            public final boolean getGrayscaleEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1289147573 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getGrayscaleEnabled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getGrayscaleEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (287411030 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getInvertColorsEnabled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (287411030 > 376268)
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
            public final boolean getInvertColorsEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (287411030 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getInvertColorsEnabled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getInvertColorsEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-358513978 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getLocaleList():com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy>, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-358513978 < 0)
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
            public final com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy> getLocaleList() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-358513978 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getLocaleList():com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy>, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getLocaleList():com.google.protobuf.kotlin.DslList");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (115944401 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getNetworkReachabilityFlags():int, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (115944401 > 376268)
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
            public final int getNetworkReachabilityFlags() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (115944401 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getNetworkReachabilityFlags():int, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getNetworkReachabilityFlags():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-635490634 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getNwPathInterfaces():com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy>, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-635490634 < 0)
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
            public final com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy> getNwPathInterfaces() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-635490634 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getNwPathInterfaces():com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy>, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getNwPathInterfaces():com.google.protobuf.kotlin.DslList");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-969824869 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getPreferredContentSizeCategory():java.lang.String, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-969824869 < 0)
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
            public final java.lang.String getPreferredContentSizeCategory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-969824869 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getPreferredContentSizeCategory():java.lang.String, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getPreferredContentSizeCategory():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1549457202 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getReduceMotionEnabled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1549457202 > 376268)
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
            public final boolean getReduceMotionEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1549457202 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getReduceMotionEnabled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getReduceMotionEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1672992210 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getScreenBrightness():double, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1672992210 < 0)
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
            public final double getScreenBrightness() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1672992210 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getScreenBrightness():double, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getScreenBrightness():double");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-118100422 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getTrackingAuthStatus():int, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-118100422 < 0)
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
            public final int getTrackingAuthStatus() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-118100422 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getTrackingAuthStatus():int, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getTrackingAuthStatus():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1948408644 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getVolume():double, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1948408644 > 376268)
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
            public final double getVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1948408644 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getVolume():double, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.getVolume():double");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1752621314 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasCurrentRadioAccessTechnology():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1752621314 < 0)
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
            public final boolean hasCurrentRadioAccessTechnology() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1752621314 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasCurrentRadioAccessTechnology():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasCurrentRadioAccessTechnology():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-31862875 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasCurrentUiTheme():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-31862875 < 0)
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
            public final boolean hasCurrentUiTheme() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-31862875 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasCurrentUiTheme():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasCurrentUiTheme():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-192648563 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceName():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-192648563 < 0)
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
            public final boolean hasDeviceName() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-192648563 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceName():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceName():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (332273138 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceUpTimeWithSleep():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (332273138 > 376268)
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
            public final boolean hasDeviceUpTimeWithSleep() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (332273138 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceUpTimeWithSleep():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceUpTimeWithSleep():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1526468268 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceUpTimeWithoutSleep():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1526468268 > 376268)
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
            public final boolean hasDeviceUpTimeWithoutSleep() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1526468268 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceUpTimeWithoutSleep():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasDeviceUpTimeWithoutSleep():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1352309138 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasGrayscaleEnabled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1352309138 > 376268)
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
            public final boolean hasGrayscaleEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1352309138 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasGrayscaleEnabled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasGrayscaleEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1140437039 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasInvertColorsEnabled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1140437039 > 376268)
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
            public final boolean hasInvertColorsEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1140437039 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasInvertColorsEnabled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasInvertColorsEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1262260722 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasNetworkReachabilityFlags():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1262260722 < 0)
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
            public final boolean hasNetworkReachabilityFlags() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1262260722 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasNetworkReachabilityFlags():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasNetworkReachabilityFlags():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-684199074 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasPreferredContentSizeCategory():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-684199074 < 0)
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
            public final boolean hasPreferredContentSizeCategory() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-684199074 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasPreferredContentSizeCategory():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasPreferredContentSizeCategory():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-792326702 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasReduceMotionEnabled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-792326702 < 0)
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
            public final boolean hasReduceMotionEnabled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-792326702 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasReduceMotionEnabled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasReduceMotionEnabled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1667785126 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasScreenBrightness():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1667785126 < 0)
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
            public final boolean hasScreenBrightness() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1667785126 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasScreenBrightness():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasScreenBrightness():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1234809606 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasTrackingAuthStatus():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1234809606 > 376268)
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
            public final boolean hasTrackingAuthStatus() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1234809606 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasTrackingAuthStatus():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasTrackingAuthStatus():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-183065998 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasVolume():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-183065998 < 0)
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
            public final boolean hasVolume() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-183065998 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasVolume():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.hasVolume():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1151931195 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignAllLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy>, java.lang.Iterable<java.lang.String>):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1151931195 > 376268)
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
            public final /* synthetic */ void plusAssignAllLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy> r1, java.lang.Iterable<java.lang.String> r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1151931195 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignAllLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy>, java.lang.Iterable<java.lang.String>):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignAllLocaleList(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-289646527 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignAllNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy>, java.lang.Iterable<java.lang.String>):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-289646527 < 0)
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
            public final /* synthetic */ void plusAssignAllNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy> r1, java.lang.Iterable<java.lang.String> r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-289646527 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignAllNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy>, java.lang.Iterable<java.lang.String>):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignAllNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.Iterable):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1459770022 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy>, java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1459770022 > 376268)
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
            public final /* synthetic */ void plusAssignLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy> r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1459770022 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy>, java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignLocaleList(com.google.protobuf.kotlin.DslList, java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1987834114 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy>, java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1987834114 > 376268)
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
            public final /* synthetic */ void plusAssignNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy> r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1987834114 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy>, java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.plusAssignNwPathInterfaces(com.google.protobuf.kotlin.DslList, java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1116251342 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setCurrentRadioAccessTechnology(java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1116251342 < 0)
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
            public final void setCurrentRadioAccessTechnology(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1116251342 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setCurrentRadioAccessTechnology(java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setCurrentRadioAccessTechnology(java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1766165486 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setCurrentUiTheme(int):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1766165486 > 376268)
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
            public final void setCurrentUiTheme(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1766165486 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setCurrentUiTheme(int):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setCurrentUiTheme(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1747145402 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceName(java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1747145402 > 376268)
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
            public final void setDeviceName(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1747145402 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceName(java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceName(java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1362761386 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceUpTimeWithSleep(long):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1362761386 > 376268)
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
            public final void setDeviceUpTimeWithSleep(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1362761386 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceUpTimeWithSleep(long):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceUpTimeWithSleep(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-677489697 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceUpTimeWithoutSleep(long):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-677489697 < 0)
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
            public final void setDeviceUpTimeWithoutSleep(long r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-677489697 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceUpTimeWithoutSleep(long):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setDeviceUpTimeWithoutSleep(long):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (213191151 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setGrayscaleEnabled(boolean):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (213191151 > 376268)
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
            public final void setGrayscaleEnabled(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (213191151 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setGrayscaleEnabled(boolean):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setGrayscaleEnabled(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1510228981 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setInvertColorsEnabled(boolean):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1510228981 > 376268)
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
            public final void setInvertColorsEnabled(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1510228981 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setInvertColorsEnabled(boolean):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setInvertColorsEnabled(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1915231754 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setLocaleList(com.google.protobuf.kotlin.DslList, int, java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1915231754 > 376268)
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
            public final /* synthetic */ void setLocaleList(com.google.protobuf.kotlin.DslList r1, int r2, java.lang.String r3) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1915231754 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setLocaleList(com.google.protobuf.kotlin.DslList, int, java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setLocaleList(com.google.protobuf.kotlin.DslList, int, java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1936998878 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setNetworkReachabilityFlags(int):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1936998878 > 376268)
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
            public final void setNetworkReachabilityFlags(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1936998878 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setNetworkReachabilityFlags(int):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setNetworkReachabilityFlags(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1141442730 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setNwPathInterfaces(com.google.protobuf.kotlin.DslList, int, java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1141442730 < 0)
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
            public final /* synthetic */ void setNwPathInterfaces(com.google.protobuf.kotlin.DslList r1, int r2, java.lang.String r3) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1141442730 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setNwPathInterfaces(com.google.protobuf.kotlin.DslList, int, java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setNwPathInterfaces(com.google.protobuf.kotlin.DslList, int, java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (716540730 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setPreferredContentSizeCategory(java.lang.String):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (716540730 > 376268)
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
            public final void setPreferredContentSizeCategory(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (716540730 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setPreferredContentSizeCategory(java.lang.String):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setPreferredContentSizeCategory(java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1284175263 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setReduceMotionEnabled(boolean):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1284175263 > 376268)
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
            public final void setReduceMotionEnabled(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1284175263 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setReduceMotionEnabled(boolean):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setReduceMotionEnabled(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1333214996 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setScreenBrightness(double):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1333214996 > 376268)
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
            public final void setScreenBrightness(double r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1333214996 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setScreenBrightness(double):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setScreenBrightness(double):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (455359814 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setTrackingAuthStatus(int):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (455359814 > 376268)
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
            public final void setTrackingAuthStatus(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (455359814 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setTrackingAuthStatus(int):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setTrackingAuthStatus(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1660834150 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setVolume(double):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1660834150 > 376268)
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
            public final void setVolume(double r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1660834150 > 376268) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setVolume(double):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.setVolume(double):void");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1955497898 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.<clinit>():void, file: classes18.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1955497898 > 348964)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1955497898 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.<clinit>():void, file: classes18.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-607871826 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.<init>():void, file: classes18.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-607871826 < 0)
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
        private IosKt() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-607871826 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.<init>():void, file: classes18.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.<init>():void");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes24.dex */
    public static final class WebKt {
        public static final WebKt INSTANCE = null;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes13.dex */
        public static final class Dsl {
            public static final Companion Companion = null;
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder _builder;

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes32.dex */
            public static final class Companion {
                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1542868568 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion.<init>():void, file: classes32.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1542868568 < 0)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1542868568 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion.<init>():void, file: classes32.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion.<init>():void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (216108178 > 420208) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion.<init>(bd0):void, file: classes32.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (216108178 > 420208)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (216108178 > 420208) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion.<init>(bd0):void, file: classes32.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion.<init>(bd0):void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (564891941 > 420208) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$WebKt$Dsl, file: classes32.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (564891941 > 420208)
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
                public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder r1) {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (564891941 > 420208) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$WebKt$Dsl, file: classes32.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.Companion._create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder):gatewayprotocol.v1.DynamicDeviceInfoKt$WebKt$Dsl");
                }
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1126607088 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<clinit>():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1126607088 < 0)
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
            static {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1126607088 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<clinit>():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<clinit>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-418443552 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-418443552 < 0)
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
            private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-418443552 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (972354998 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder, bd0):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (972354998 > 389804)
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
            public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder r1, p000.bd0 r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (972354998 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder, bd0):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.<init>(gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder, bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1208750753 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1208750753 > 389804)
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
            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web _build() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1208750753 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl._build():gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (989541646 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkDownlink():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (989541646 > 389804)
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
            public final void clearNetworkDownlink() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (989541646 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkDownlink():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkDownlink():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1277066035 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkEffectiveType():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1277066035 < 0)
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
            public final void clearNetworkEffectiveType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1277066035 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkEffectiveType():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkEffectiveType():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (800834278 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkRtt():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (800834278 > 389804)
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
            public final void clearNetworkRtt() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (800834278 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkRtt():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkRtt():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2127574685 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkSaveData():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2127574685 < 0)
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
            public final void clearNetworkSaveData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2127574685 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkSaveData():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearNetworkSaveData():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (297513929 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearPrefersColorScheme():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (297513929 > 389804)
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
            public final void clearPrefersColorScheme() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (297513929 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearPrefersColorScheme():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearPrefersColorScheme():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1743431483 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearPrefersReducedMotion():void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1743431483 > 389804)
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
            public final void clearPrefersReducedMotion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1743431483 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearPrefersReducedMotion():void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.clearPrefersReducedMotion():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2108813542 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkDownlink():double, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2108813542 > 389804)
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
            public final double getNetworkDownlink() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2108813542 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkDownlink():double, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkDownlink():double");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (194593116 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkEffectiveType():java.lang.String, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (194593116 > 389804)
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
            public final java.lang.String getNetworkEffectiveType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (194593116 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkEffectiveType():java.lang.String, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkEffectiveType():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-853221510 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkRtt():int, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-853221510 < 0)
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
            public final int getNetworkRtt() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-853221510 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkRtt():int, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkRtt():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1105642781 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkSaveData():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1105642781 > 389804)
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
            public final boolean getNetworkSaveData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1105642781 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkSaveData():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getNetworkSaveData():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1676043640 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getPrefersColorScheme():java.lang.String, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1676043640 > 389804)
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
            public final java.lang.String getPrefersColorScheme() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1676043640 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getPrefersColorScheme():java.lang.String, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getPrefersColorScheme():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1626331150 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getPrefersReducedMotion():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1626331150 < 0)
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
            public final boolean getPrefersReducedMotion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1626331150 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getPrefersReducedMotion():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.getPrefersReducedMotion():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (453620267 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkDownlink():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (453620267 > 389804)
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
            public final boolean hasNetworkDownlink() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (453620267 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkDownlink():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkDownlink():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-779751561 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkEffectiveType():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-779751561 < 0)
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
            public final boolean hasNetworkEffectiveType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-779751561 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkEffectiveType():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkEffectiveType():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1027037394 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkRtt():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1027037394 > 389804)
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
            public final boolean hasNetworkRtt() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1027037394 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkRtt():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkRtt():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-54701946 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkSaveData():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-54701946 < 0)
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
            public final boolean hasNetworkSaveData() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-54701946 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkSaveData():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasNetworkSaveData():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (713196427 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasPrefersColorScheme():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (713196427 > 389804)
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
            public final boolean hasPrefersColorScheme() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (713196427 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasPrefersColorScheme():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasPrefersColorScheme():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (497252980 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasPrefersReducedMotion():boolean, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (497252980 > 389804)
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
            public final boolean hasPrefersReducedMotion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (497252980 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasPrefersReducedMotion():boolean, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.hasPrefersReducedMotion():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2014498502 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkDownlink(double):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2014498502 > 389804)
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
            public final void setNetworkDownlink(double r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2014498502 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkDownlink(double):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkDownlink(double):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1242429966 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkEffectiveType(java.lang.String):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1242429966 > 389804)
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
            public final void setNetworkEffectiveType(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1242429966 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkEffectiveType(java.lang.String):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkEffectiveType(java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1978908078 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkRtt(int):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1978908078 < 0)
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
            public final void setNetworkRtt(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1978908078 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkRtt(int):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkRtt(int):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-941627778 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkSaveData(boolean):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-941627778 < 0)
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
            public final void setNetworkSaveData(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-941627778 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkSaveData(boolean):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setNetworkSaveData(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-24649282 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setPrefersColorScheme(java.lang.String):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-24649282 < 0)
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
            public final void setPrefersColorScheme(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-24649282 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setPrefersColorScheme(java.lang.String):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setPrefersColorScheme(java.lang.String):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1995733710 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setPrefersReducedMotion(boolean):void, file: classes13.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1995733710 > 389804)
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
            public final void setPrefersReducedMotion(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1995733710 > 389804) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setPrefersReducedMotion(boolean):void, file: classes13.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.Dsl.setPrefersReducedMotion(boolean):void");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-211322505 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.<clinit>():void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-211322505 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-211322505 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.<clinit>():void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (480340014 > 383840) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.<init>():void, file: classes24.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (480340014 > 383840)
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
        private WebKt() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (480340014 > 383840) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.<init>():void, file: classes24.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.WebKt.<init>():void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (915795318 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.<clinit>():void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (915795318 > 348964)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (915795318 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.<clinit>():void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-417701782 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.<init>():void, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-417701782 < 0)
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
    private DynamicDeviceInfoKt() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-417701782 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.<init>():void, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-249431107 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.-initializeandroid(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-249431107 < 0)
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
    /* renamed from: -initializeandroid */
    public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m11648initializeandroid(p000.c41 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-249431107 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.-initializeandroid(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.m11648initializeandroid(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1413075635 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.-initializeios(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1413075635 > 348964)
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
    /* renamed from: -initializeios */
    public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m11649initializeios(p000.c41 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1413075635 > 348964) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.-initializeios(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.m11649initializeios(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-302124216 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.-initializeweb(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web, file: classes18.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-302124216 < 0)
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
    /* renamed from: -initializeweb */
    public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web m11650initializeweb(p000.c41 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-302124216 < 0) in method: gatewayprotocol.v1.DynamicDeviceInfoKt.-initializeweb(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web, file: classes18.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.DynamicDeviceInfoKt.m11650initializeweb(c41):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web");
    }
}

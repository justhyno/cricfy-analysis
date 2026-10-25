package uniffi.cr_android;

import com.sun.jna.Structure;
import uniffi.cr_android.UniffiRustCallStatus;

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
@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes44.dex */
public class UniffiForeignFutureStructU32 extends Structure {
    public UniffiRustCallStatus.ByValue callStatus;
    public int returnValue;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes31.dex */
    public static final class UniffiByValue extends UniffiForeignFutureStructU32 implements Structure.ByValue {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1761069141 > 364120) in method: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>():void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1761069141 > 364120)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public UniffiByValue() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1761069141 > 364120) in method: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>():void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (502327767 > 364120) in method: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (502327767 > 364120)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public UniffiByValue(int r1, uniffi.cr_android.UniffiRustCallStatus.ByValue r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (502327767 > 364120) in method: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2110255240 > 364120) in method: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue, int, bd0):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2110255240 > 364120)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public /* synthetic */ UniffiByValue(int r1, uniffi.cr_android.UniffiRustCallStatus.ByValue r2, int r3, p000.bd0 r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2110255240 > 364120) in method: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue, int, bd0):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.UniffiByValue.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue, int, bd0):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-246511247 < 0) in method: uniffi.cr_android.UniffiForeignFutureStructU32.<init>():void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-246511247 < 0)
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
    public UniffiForeignFutureStructU32() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-246511247 < 0) in method: uniffi.cr_android.UniffiForeignFutureStructU32.<init>():void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: ArrayIndexOutOfBoundsException: Index -43283 out of bounds for length 49 in method: uniffi.cr_android.UniffiForeignFutureStructU32.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index -43283 out of bounds for length 49
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:58)
        	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:86)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
        	... 6 more
        */
    public UniffiForeignFutureStructU32(int r1, uniffi.cr_android.UniffiRustCallStatus.ByValue r2) {
        /*
        // Can't load method instructions: Load method exception: ArrayIndexOutOfBoundsException: Index -43283 out of bounds for length 49 in method: uniffi.cr_android.UniffiForeignFutureStructU32.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1310631185 > 395592) in method: uniffi.cr_android.UniffiForeignFutureStructU32.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue, int, bd0):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1310631185 > 395592)
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
    public /* synthetic */ UniffiForeignFutureStructU32(int r1, uniffi.cr_android.UniffiRustCallStatus.ByValue r2, int r3, p000.bd0 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1310631185 > 395592) in method: uniffi.cr_android.UniffiForeignFutureStructU32.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue, int, bd0):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.<init>(int, uniffi.cr_android.UniffiRustCallStatus$ByValue, int, bd0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1799676647 > 395592) in method: uniffi.cr_android.UniffiForeignFutureStructU32.uniffiSetValue$sdk_release(uniffi.cr_android.UniffiForeignFutureStructU32):void, file: classes44.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1799676647 > 395592)
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
    public final void uniffiSetValue$sdk_release(uniffi.cr_android.UniffiForeignFutureStructU32 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1799676647 > 395592) in method: uniffi.cr_android.UniffiForeignFutureStructU32.uniffiSetValue$sdk_release(uniffi.cr_android.UniffiForeignFutureStructU32):void, file: classes44.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiForeignFutureStructU32.uniffiSetValue$sdk_release(uniffi.cr_android.UniffiForeignFutureStructU32):void");
    }
}

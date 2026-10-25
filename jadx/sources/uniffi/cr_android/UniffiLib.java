package uniffi.cr_android;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import p000.tl1;
import uniffi.cr_android.ForeignBytes;
import uniffi.cr_android.RustBuffer;

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
/* loaded from: classes22.dex */
public interface UniffiLib extends Library {
    public static final Companion Companion = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes38.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static final tl1 CLEANER$delegate = null;
        private static final tl1 INSTANCE$delegate = null;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (822172892 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.<clinit>():void, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (822172892 > 430712)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (822172892 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.<clinit>():void, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-970056019 < 0) in method: uniffi.cr_android.UniffiLib.Companion.<init>():void, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-970056019 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-970056019 < 0) in method: uniffi.cr_android.UniffiLib.Companion.<init>():void, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1188811830 < 0) in method: uniffi.cr_android.UniffiLib.Companion.CLEANER_delegate$lambda$2():uniffi.cr_android.UniffiCleaner, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1188811830 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private static final uniffi.cr_android.UniffiCleaner CLEANER_delegate$lambda$2() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1188811830 < 0) in method: uniffi.cr_android.UniffiLib.Companion.CLEANER_delegate$lambda$2():uniffi.cr_android.UniffiCleaner, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.CLEANER_delegate$lambda$2():uniffi.cr_android.UniffiCleaner");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1907170482 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.INSTANCE_delegate$lambda$1():uniffi.cr_android.UniffiLib, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1907170482 > 430712)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private static final uniffi.cr_android.UniffiLib INSTANCE_delegate$lambda$1() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1907170482 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.INSTANCE_delegate$lambda$1():uniffi.cr_android.UniffiLib, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.INSTANCE_delegate$lambda$1():uniffi.cr_android.UniffiLib");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2025496159 < 0) in method: uniffi.cr_android.UniffiLib.Companion.a():uniffi.cr_android.UniffiCleaner, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2025496159 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        /* renamed from: a */
        public static /* synthetic */ uniffi.cr_android.UniffiCleaner m9914a() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2025496159 < 0) in method: uniffi.cr_android.UniffiLib.Companion.a():uniffi.cr_android.UniffiCleaner, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.m9914a():uniffi.cr_android.UniffiCleaner");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (63589520 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.b():uniffi.cr_android.UniffiLib, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (63589520 > 430712)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        /* renamed from: b */
        public static /* synthetic */ uniffi.cr_android.UniffiLib m9915b() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (63589520 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.b():uniffi.cr_android.UniffiLib, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.m9915b():uniffi.cr_android.UniffiLib");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (188720566 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.getCLEANER$sdk_release():uniffi.cr_android.UniffiCleaner, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (188720566 > 430712)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final uniffi.cr_android.UniffiCleaner getCLEANER$sdk_release() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (188720566 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.getCLEANER$sdk_release():uniffi.cr_android.UniffiCleaner, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.getCLEANER$sdk_release():uniffi.cr_android.UniffiCleaner");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (444854494 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.getINSTANCE$sdk_release():uniffi.cr_android.UniffiLib, file: classes38.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (444854494 > 430712)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final uniffi.cr_android.UniffiLib getINSTANCE$sdk_release() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (444854494 > 430712) in method: uniffi.cr_android.UniffiLib.Companion.getINSTANCE$sdk_release():uniffi.cr_android.UniffiLib, file: classes38.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.Companion.getINSTANCE$sdk_release():uniffi.cr_android.UniffiLib");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-246805352 < 0) in method: uniffi.cr_android.UniffiLib.<clinit>():void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-246805352 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-246805352 < 0) in method: uniffi.cr_android.UniffiLib.<clinit>():void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiLib.<clinit>():void");
    }

    void ffi_cr_android_rust_future_cancel_f32(long j);

    void ffi_cr_android_rust_future_cancel_f64(long j);

    void ffi_cr_android_rust_future_cancel_i16(long j);

    void ffi_cr_android_rust_future_cancel_i32(long j);

    void ffi_cr_android_rust_future_cancel_i64(long j);

    void ffi_cr_android_rust_future_cancel_i8(long j);

    void ffi_cr_android_rust_future_cancel_pointer(long j);

    void ffi_cr_android_rust_future_cancel_rust_buffer(long j);

    void ffi_cr_android_rust_future_cancel_u16(long j);

    void ffi_cr_android_rust_future_cancel_u32(long j);

    void ffi_cr_android_rust_future_cancel_u64(long j);

    void ffi_cr_android_rust_future_cancel_u8(long j);

    void ffi_cr_android_rust_future_cancel_void(long j);

    float ffi_cr_android_rust_future_complete_f32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    double ffi_cr_android_rust_future_complete_f64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    short ffi_cr_android_rust_future_complete_i16(long j, UniffiRustCallStatus uniffiRustCallStatus);

    int ffi_cr_android_rust_future_complete_i32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    long ffi_cr_android_rust_future_complete_i64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    byte ffi_cr_android_rust_future_complete_i8(long j, UniffiRustCallStatus uniffiRustCallStatus);

    Pointer ffi_cr_android_rust_future_complete_pointer(long j, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue ffi_cr_android_rust_future_complete_rust_buffer(long j, UniffiRustCallStatus uniffiRustCallStatus);

    short ffi_cr_android_rust_future_complete_u16(long j, UniffiRustCallStatus uniffiRustCallStatus);

    int ffi_cr_android_rust_future_complete_u32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    long ffi_cr_android_rust_future_complete_u64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    byte ffi_cr_android_rust_future_complete_u8(long j, UniffiRustCallStatus uniffiRustCallStatus);

    void ffi_cr_android_rust_future_complete_void(long j, UniffiRustCallStatus uniffiRustCallStatus);

    void ffi_cr_android_rust_future_free_f32(long j);

    void ffi_cr_android_rust_future_free_f64(long j);

    void ffi_cr_android_rust_future_free_i16(long j);

    void ffi_cr_android_rust_future_free_i32(long j);

    void ffi_cr_android_rust_future_free_i64(long j);

    void ffi_cr_android_rust_future_free_i8(long j);

    void ffi_cr_android_rust_future_free_pointer(long j);

    void ffi_cr_android_rust_future_free_rust_buffer(long j);

    void ffi_cr_android_rust_future_free_u16(long j);

    void ffi_cr_android_rust_future_free_u32(long j);

    void ffi_cr_android_rust_future_free_u64(long j);

    void ffi_cr_android_rust_future_free_u8(long j);

    void ffi_cr_android_rust_future_free_void(long j);

    void ffi_cr_android_rust_future_poll_f32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_f64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_i16(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_i32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_i64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_i8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_pointer(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_rust_buffer(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_u16(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_u32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_u64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_u8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    void ffi_cr_android_rust_future_poll_void(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    RustBuffer.ByValue ffi_cr_android_rustbuffer_alloc(long j, UniffiRustCallStatus uniffiRustCallStatus);

    void ffi_cr_android_rustbuffer_free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue ffi_cr_android_rustbuffer_from_bytes(ForeignBytes.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue ffi_cr_android_rustbuffer_reserve(RustBuffer.ByValue byValue, long j, UniffiRustCallStatus uniffiRustCallStatus);

    int ffi_cr_android_uniffi_contract_version();

    short uniffi_cr_android_checksum_constructor_crshare_create();

    short uniffi_cr_android_checksum_constructor_crshare_create_branded();

    short uniffi_cr_android_checksum_constructor_crshare_create_headless();

    /* renamed from: uniffi_cr_android_checksum_constructor_crshare_create_with_branding */
    short m9912xa90f5327();

    short uniffi_cr_android_checksum_func_version();

    short uniffi_cr_android_checksum_method_crlistener_on_event();

    short uniffi_cr_android_checksum_method_crshare_app_id();

    short uniffi_cr_android_checksum_method_crshare_apply_consent_config();

    short uniffi_cr_android_checksum_method_crshare_auth_state();

    short uniffi_cr_android_checksum_method_crshare_auth_status();

    short uniffi_cr_android_checksum_method_crshare_autostart_enabled();

    short uniffi_cr_android_checksum_method_crshare_autostart_supported();

    short uniffi_cr_android_checksum_method_crshare_battery();

    short uniffi_cr_android_checksum_method_crshare_clear_last_error();

    short uniffi_cr_android_checksum_method_crshare_clear_listener();

    short uniffi_cr_android_checksum_method_crshare_consent_config_version();

    short uniffi_cr_android_checksum_method_crshare_consent_screen();

    short uniffi_cr_android_checksum_method_crshare_consent_status();

    short uniffi_cr_android_checksum_method_crshare_consent_text();

    short uniffi_cr_android_checksum_method_crshare_consent_theme();

    short uniffi_cr_android_checksum_method_crshare_device_id();

    short uniffi_cr_android_checksum_method_crshare_earnings();

    short uniffi_cr_android_checksum_method_crshare_event_seq();

    short uniffi_cr_android_checksum_method_crshare_events_since();

    short uniffi_cr_android_checksum_method_crshare_has_consent_decision();

    short uniffi_cr_android_checksum_method_crshare_is_opted_in();

    short uniffi_cr_android_checksum_method_crshare_is_paused();

    short uniffi_cr_android_checksum_method_crshare_is_running();

    short uniffi_cr_android_checksum_method_crshare_is_serving_allowed();

    short uniffi_cr_android_checksum_method_crshare_last_cash_out_id();

    short uniffi_cr_android_checksum_method_crshare_last_error();

    short uniffi_cr_android_checksum_method_crshare_metrics();

    short uniffi_cr_android_checksum_method_crshare_opt_in();

    short uniffi_cr_android_checksum_method_crshare_opt_out();

    short uniffi_cr_android_checksum_method_crshare_pause();

    short uniffi_cr_android_checksum_method_crshare_report_battery();

    short uniffi_cr_android_checksum_method_crshare_report_network();

    short uniffi_cr_android_checksum_method_crshare_request_cash_out();

    /* renamed from: uniffi_cr_android_checksum_method_crshare_request_cash_out_detailed */
    short m9913xf35fe872();

    short uniffi_cr_android_checksum_method_crshare_resolved_consent();

    short uniffi_cr_android_checksum_method_crshare_resume();

    short uniffi_cr_android_checksum_method_crshare_serving_status();

    short uniffi_cr_android_checksum_method_crshare_set_app_id();

    short uniffi_cr_android_checksum_method_crshare_set_autostart();

    short uniffi_cr_android_checksum_method_crshare_set_enabled();

    short uniffi_cr_android_checksum_method_crshare_set_listener();

    short uniffi_cr_android_checksum_method_crshare_set_mbps();

    short uniffi_cr_android_checksum_method_crshare_start();

    short uniffi_cr_android_checksum_method_crshare_stop();

    Pointer uniffi_cr_android_fn_clone_crshare(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    Pointer uniffi_cr_android_fn_constructor_crshare_create(RustBuffer.ByValue byValue, short s, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, UniffiRustCallStatus uniffiRustCallStatus);

    Pointer uniffi_cr_android_fn_constructor_crshare_create_branded(RustBuffer.ByValue byValue, short s, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, RustBuffer.ByValue byValue5, RustBuffer.ByValue byValue6, RustBuffer.ByValue byValue7, UniffiRustCallStatus uniffiRustCallStatus);

    Pointer uniffi_cr_android_fn_constructor_crshare_create_headless(RustBuffer.ByValue byValue, short s, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, UniffiRustCallStatus uniffiRustCallStatus);

    Pointer uniffi_cr_android_fn_constructor_crshare_create_with_branding(RustBuffer.ByValue byValue, short s, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, RustBuffer.ByValue byValue5, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_free_crshare(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_func_version(UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_init_callback_vtable_crlistener(UniffiVTableCallbackInterfaceCrListener uniffiVTableCallbackInterfaceCrListener);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_app_id(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_apply_consent_config(Pointer pointer, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_auth_state(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_auth_status(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_autostart_enabled(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_autostart_supported(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_battery(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_clear_last_error(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_clear_listener(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    long uniffi_cr_android_fn_method_crshare_consent_config_version(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_consent_screen(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_consent_status(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_consent_text(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_consent_theme(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_device_id(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_earnings(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    long uniffi_cr_android_fn_method_crshare_event_seq(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_events_since(Pointer pointer, long j, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_has_consent_decision(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_is_opted_in(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_is_paused(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_is_running(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_is_serving_allowed(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_last_cash_out_id(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_last_error(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_metrics(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_opt_in(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_opt_out(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_pause(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_report_battery(Pointer pointer, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_report_network(Pointer pointer, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_request_cash_out(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_request_cash_out_detailed(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_resolved_consent(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_resume(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    RustBuffer.ByValue uniffi_cr_android_fn_method_crshare_serving_status(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_set_app_id(Pointer pointer, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    byte uniffi_cr_android_fn_method_crshare_set_autostart(Pointer pointer, byte b, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_set_enabled(Pointer pointer, byte b, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_set_listener(Pointer pointer, long j, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_set_mbps(Pointer pointer, int i, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_start(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cr_android_fn_method_crshare_stop(Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);
}

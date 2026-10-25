package uniffi.cr_android;

import java.nio.ByteBuffer;
import uniffi.cr_android.RustBuffer;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes43.dex */
public interface FfiConverter<KotlinType, FfiType> {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes31.dex */
    public static final class DefaultImpls {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-628638158 < 0) in method: uniffi.cr_android.FfiConverter.DefaultImpls.liftFromRustBuffer(uniffi.cr_android.FfiConverter<KotlinType, FfiType>, uniffi.cr_android.RustBuffer$ByValue):KotlinType, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-628638158 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static <KotlinType, FfiType> KotlinType liftFromRustBuffer(uniffi.cr_android.FfiConverter<KotlinType, FfiType> r0, uniffi.cr_android.RustBuffer.ByValue r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-628638158 < 0) in method: uniffi.cr_android.FfiConverter.DefaultImpls.liftFromRustBuffer(uniffi.cr_android.FfiConverter<KotlinType, FfiType>, uniffi.cr_android.RustBuffer$ByValue):KotlinType, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.FfiConverter.DefaultImpls.liftFromRustBuffer(uniffi.cr_android.FfiConverter, uniffi.cr_android.RustBuffer$ByValue):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-256062014 < 0) in method: uniffi.cr_android.FfiConverter.DefaultImpls.lowerIntoRustBuffer(uniffi.cr_android.FfiConverter<KotlinType, FfiType>, KotlinType):uniffi.cr_android.RustBuffer$ByValue, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-256062014 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static <KotlinType, FfiType> uniffi.cr_android.RustBuffer.ByValue lowerIntoRustBuffer(uniffi.cr_android.FfiConverter<KotlinType, FfiType> r0, KotlinType r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-256062014 < 0) in method: uniffi.cr_android.FfiConverter.DefaultImpls.lowerIntoRustBuffer(uniffi.cr_android.FfiConverter<KotlinType, FfiType>, KotlinType):uniffi.cr_android.RustBuffer$ByValue, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.FfiConverter.DefaultImpls.lowerIntoRustBuffer(uniffi.cr_android.FfiConverter, java.lang.Object):uniffi.cr_android.RustBuffer$ByValue");
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    long mo11905allocationSizeI7RO_PI(KotlinType kotlintype);

    KotlinType lift(FfiType ffitype);

    KotlinType liftFromRustBuffer(RustBuffer.ByValue byValue);

    FfiType lower(KotlinType kotlintype);

    RustBuffer.ByValue lowerIntoRustBuffer(KotlinType kotlintype);

    KotlinType read(ByteBuffer byteBuffer);

    void write(KotlinType kotlintype, ByteBuffer byteBuffer);
}

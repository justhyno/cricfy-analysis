package okhttp3;

import java.io.IOException;
import p000.qp;

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
public abstract class RequestBody {
    public static final Companion Companion = null;
    public static final RequestBody EMPTY = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes17.dex */
    public static final class Companion {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-879755330 < 0) in method: okhttp3.RequestBody.Companion.<init>():void, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-879755330 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-879755330 < 0) in method: okhttp3.RequestBody.Companion.<init>():void, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1702256192 < 0) in method: okhttp3.RequestBody.Companion.<init>(bd0):void, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1702256192 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public /* synthetic */ Companion(p000.bd0 r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1702256192 < 0) in method: okhttp3.RequestBody.Companion.<init>(bd0):void, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.<init>(bd0):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1319758850 < 0) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.io.File, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1319758850 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.io.File r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1319758850 < 0) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.io.File, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.io.File, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-250885466 < 0) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.io.FileDescriptor, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-250885466 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.io.FileDescriptor r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-250885466 < 0) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.io.FileDescriptor, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.io.FileDescriptor, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1221462504 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.lang.String, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1221462504 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.lang.String r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1221462504 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.lang.String, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, java.lang.String, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1365169740 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, nk2, lv0, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1365169740 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, p000.nk2 r1, p000.lv0 r2, okhttp3.MediaType r3, int r4, java.lang.Object r5) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1365169740 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, nk2, lv0, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, nk2, lv0, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1599525094 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, okhttp3.MediaType, byte[], int, int, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1599525094 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, okhttp3.MediaType r1, byte[] r2, int r3, int r4, int r5, java.lang.Object r6) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1599525094 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, okhttp3.MediaType, byte[], int, int, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, okhttp3.MediaType, byte[], int, int, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (244895773 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, tq, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (244895773 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, p000.tq r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (244895773 > 368904) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, tq, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, tq, okhttp3.MediaType, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-211992195 < 0) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, byte[], okhttp3.MediaType, int, int, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-211992195 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, byte[] r1, okhttp3.MediaType r2, int r3, int r4, int r5, java.lang.Object r6) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-211992195 < 0) in method: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, byte[], okhttp3.MediaType, int, int, int, java.lang.Object):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, byte[], okhttp3.MediaType, int, int, int, java.lang.Object):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (834294244 > 368904) in method: okhttp3.RequestBody.Companion.create(java.io.File, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (834294244 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(java.io.File r1, okhttp3.MediaType r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (834294244 > 368904) in method: okhttp3.RequestBody.Companion.create(java.io.File, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(java.io.File, okhttp3.MediaType):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-593494579 < 0) in method: okhttp3.RequestBody.Companion.create(java.io.FileDescriptor, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-593494579 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(java.io.FileDescriptor r1, okhttp3.MediaType r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-593494579 < 0) in method: okhttp3.RequestBody.Companion.create(java.io.FileDescriptor, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(java.io.FileDescriptor, okhttp3.MediaType):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (319267159 > 368904) in method: okhttp3.RequestBody.Companion.create(java.lang.String, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (319267159 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(java.lang.String r1, okhttp3.MediaType r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (319267159 > 368904) in method: okhttp3.RequestBody.Companion.create(java.lang.String, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(java.lang.String, okhttp3.MediaType):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-412374910 < 0) in method: okhttp3.RequestBody.Companion.create(nk2, lv0, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-412374910 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(p000.nk2 r1, p000.lv0 r2, okhttp3.MediaType r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-412374910 < 0) in method: okhttp3.RequestBody.Companion.create(nk2, lv0, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(nk2, lv0, okhttp3.MediaType):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1192831770 > 368904) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, java.io.File):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1192831770 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, java.io.File r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1192831770 > 368904) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, java.io.File):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, java.io.File):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1030062149 > 368904) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, java.lang.String):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1030062149 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, java.lang.String r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1030062149 > 368904) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, java.lang.String):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, java.lang.String):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1225422055 < 0) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, tq):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1225422055 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, p000.tq r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1225422055 < 0) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, tq):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, tq):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (601323648 > 368904) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[]):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (601323648 > 368904)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (601323648 > 368904) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[]):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[]):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1840500758 < 0) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[], int):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1840500758 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1840500758 < 0) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[], int):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[], int):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-835138156 < 0) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[], int, int):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-835138156 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2, int r3, int r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-835138156 < 0) in method: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[], int, int):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(okhttp3.MediaType, byte[], int, int):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1850144384 < 0) in method: okhttp3.RequestBody.Companion.create(tq, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1850144384 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(p000.tq r1, okhttp3.MediaType r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1850144384 < 0) in method: okhttp3.RequestBody.Companion.create(tq, okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(tq, okhttp3.MediaType):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1140703608 < 0) in method: okhttp3.RequestBody.Companion.create(byte[]):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1140703608 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(byte[] r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1140703608 < 0) in method: okhttp3.RequestBody.Companion.create(byte[]):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(byte[]):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-998641616 < 0) in method: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-998641616 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(byte[] r1, okhttp3.MediaType r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-998641616 < 0) in method: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-881998304 < 0) in method: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType, int):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-881998304 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(byte[] r1, okhttp3.MediaType r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-881998304 < 0) in method: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType, int):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType, int):okhttp3.RequestBody");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-741371568 < 0) in method: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType, int, int):okhttp3.RequestBody, file: classes17.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-741371568 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final okhttp3.RequestBody create(byte[] r1, okhttp3.MediaType r2, int r3, int r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-741371568 < 0) in method: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType, int, int):okhttp3.RequestBody, file: classes17.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.Companion.create(byte[], okhttp3.MediaType, int, int):okhttp3.RequestBody");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1368253678 > 368420) in method: okhttp3.RequestBody.<clinit>():void, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1368253678 > 368420)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1368253678 > 368420) in method: okhttp3.RequestBody.<clinit>():void, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1602170452 < 0) in method: okhttp3.RequestBody.<init>():void, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1602170452 < 0)
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
    public RequestBody() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1602170452 < 0) in method: okhttp3.RequestBody.<init>():void, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1951962934 > 368420) in method: okhttp3.RequestBody.create(java.io.File, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1951962934 > 368420)
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
    public static final okhttp3.RequestBody create(java.io.File r0, okhttp3.MediaType r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1951962934 > 368420) in method: okhttp3.RequestBody.create(java.io.File, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(java.io.File, okhttp3.MediaType):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1274498222 > 368420) in method: okhttp3.RequestBody.create(java.io.FileDescriptor, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1274498222 > 368420)
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
    public static final okhttp3.RequestBody create(java.io.FileDescriptor r0, okhttp3.MediaType r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1274498222 > 368420) in method: okhttp3.RequestBody.create(java.io.FileDescriptor, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(java.io.FileDescriptor, okhttp3.MediaType):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1224057096 < 0) in method: okhttp3.RequestBody.create(java.lang.String, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1224057096 < 0)
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
    public static final okhttp3.RequestBody create(java.lang.String r0, okhttp3.MediaType r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1224057096 < 0) in method: okhttp3.RequestBody.create(java.lang.String, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(java.lang.String, okhttp3.MediaType):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1723299718 > 368420) in method: okhttp3.RequestBody.create(nk2, lv0, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1723299718 > 368420)
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
    public static final okhttp3.RequestBody create(p000.nk2 r0, p000.lv0 r1, okhttp3.MediaType r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1723299718 > 368420) in method: okhttp3.RequestBody.create(nk2, lv0, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(nk2, lv0, okhttp3.MediaType):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (349056844 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, java.io.File):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (349056844 > 368420)
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
    public static final okhttp3.RequestBody create(okhttp3.MediaType r0, java.io.File r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (349056844 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, java.io.File):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(okhttp3.MediaType, java.io.File):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1670788782 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, java.lang.String):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1670788782 > 368420)
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
    public static final okhttp3.RequestBody create(okhttp3.MediaType r0, java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1670788782 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, java.lang.String):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(okhttp3.MediaType, java.lang.String):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (605891083 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, tq):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (605891083 > 368420)
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
    public static final okhttp3.RequestBody create(okhttp3.MediaType r0, p000.tq r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (605891083 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, tq):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(okhttp3.MediaType, tq):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1726707466 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, byte[]):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1726707466 > 368420)
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
    public static final okhttp3.RequestBody create(okhttp3.MediaType r0, byte[] r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1726707466 > 368420) in method: okhttp3.RequestBody.create(okhttp3.MediaType, byte[]):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(okhttp3.MediaType, byte[]):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2099416391 < 0) in method: okhttp3.RequestBody.create(okhttp3.MediaType, byte[], int):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2099416391 < 0)
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
    public static final okhttp3.RequestBody create(okhttp3.MediaType r0, byte[] r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2099416391 < 0) in method: okhttp3.RequestBody.create(okhttp3.MediaType, byte[], int):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(okhttp3.MediaType, byte[], int):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-281331326 < 0) in method: okhttp3.RequestBody.create(okhttp3.MediaType, byte[], int, int):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-281331326 < 0)
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
    public static final okhttp3.RequestBody create(okhttp3.MediaType r0, byte[] r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-281331326 < 0) in method: okhttp3.RequestBody.create(okhttp3.MediaType, byte[], int, int):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(okhttp3.MediaType, byte[], int, int):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1082641106 > 368420) in method: okhttp3.RequestBody.create(tq, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1082641106 > 368420)
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
    public static final okhttp3.RequestBody create(p000.tq r0, okhttp3.MediaType r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1082641106 > 368420) in method: okhttp3.RequestBody.create(tq, okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(tq, okhttp3.MediaType):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1968806758 < 0) in method: okhttp3.RequestBody.create(byte[]):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1968806758 < 0)
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
    public static final okhttp3.RequestBody create(byte[] r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1968806758 < 0) in method: okhttp3.RequestBody.create(byte[]):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(byte[]):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1028120436 > 368420) in method: okhttp3.RequestBody.create(byte[], okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1028120436 > 368420)
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
    public static final okhttp3.RequestBody create(byte[] r0, okhttp3.MediaType r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1028120436 > 368420) in method: okhttp3.RequestBody.create(byte[], okhttp3.MediaType):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(byte[], okhttp3.MediaType):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1853665225 > 368420) in method: okhttp3.RequestBody.create(byte[], okhttp3.MediaType, int):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1853665225 > 368420)
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
    public static final okhttp3.RequestBody create(byte[] r0, okhttp3.MediaType r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1853665225 > 368420) in method: okhttp3.RequestBody.create(byte[], okhttp3.MediaType, int):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(byte[], okhttp3.MediaType, int):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-27975915 < 0) in method: okhttp3.RequestBody.create(byte[], okhttp3.MediaType, int, int):okhttp3.RequestBody, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-27975915 < 0)
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
    public static final okhttp3.RequestBody create(byte[] r0, okhttp3.MediaType r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-27975915 < 0) in method: okhttp3.RequestBody.create(byte[], okhttp3.MediaType, int, int):okhttp3.RequestBody, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.create(byte[], okhttp3.MediaType, int, int):okhttp3.RequestBody");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1389142843 > 368420) in method: okhttp3.RequestBody.contentLength():long, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1389142843 > 368420)
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
    public long contentLength() throws java.io.IOException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1389142843 > 368420) in method: okhttp3.RequestBody.contentLength():long, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.contentLength():long");
    }

    public abstract MediaType contentType();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1658998576 > 368420) in method: okhttp3.RequestBody.isDuplex():boolean, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1658998576 > 368420)
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
    public boolean isDuplex() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1658998576 > 368420) in method: okhttp3.RequestBody.isDuplex():boolean, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.isDuplex():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (704908171 > 368420) in method: okhttp3.RequestBody.isOneShot():boolean, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (704908171 > 368420)
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
    public boolean isOneShot() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (704908171 > 368420) in method: okhttp3.RequestBody.isOneShot():boolean, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.isOneShot():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1514954742 > 368420) in method: okhttp3.RequestBody.sha256():tq, file: classes20.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1514954742 > 368420)
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
    public final p000.tq sha256() throws java.io.IOException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1514954742 > 368420) in method: okhttp3.RequestBody.sha256():tq, file: classes20.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody.sha256():tq");
    }

    public abstract void writeTo(qp qpVar) throws IOException;
}

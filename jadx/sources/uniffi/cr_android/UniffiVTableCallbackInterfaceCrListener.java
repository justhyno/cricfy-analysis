package uniffi.cr_android;

import com.sun.jna.Structure;

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
@Structure.FieldOrder({"onEvent", "uniffiFree"})
/* loaded from: classes47.dex */
public class UniffiVTableCallbackInterfaceCrListener extends Structure {
    public UniffiCallbackInterfaceCrListenerMethod0 onEvent;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes18.dex */
    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCrListener implements Structure.ByValue {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1984681282 > 348964) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>():void, file: classes18.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1984681282 > 348964)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1984681282 > 348964) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>():void, file: classes18.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (438143600 > 348964) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree):void, file: classes18.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (438143600 > 348964)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public UniffiByValue(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0 r1, uniffi.cr_android.UniffiCallbackInterfaceFree r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (438143600 > 348964) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree):void, file: classes18.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (497607958 > 348964) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree, int, bd0):void, file: classes18.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (497607958 > 348964)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public /* synthetic */ UniffiByValue(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0 r1, uniffi.cr_android.UniffiCallbackInterfaceFree r2, int r3, p000.bd0 r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (497607958 > 348964) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree, int, bd0):void, file: classes18.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.UniffiByValue.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree, int, bd0):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (966247615 > 346160) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>():void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (966247615 > 346160)
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
    public UniffiVTableCallbackInterfaceCrListener() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (966247615 > 346160) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>():void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-384530176 < 0) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree):void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-384530176 < 0)
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
    public UniffiVTableCallbackInterfaceCrListener(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0 r1, uniffi.cr_android.UniffiCallbackInterfaceFree r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-384530176 < 0) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree):void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (822848202 > 346160) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree, int, bd0):void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (822848202 > 346160)
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
    public /* synthetic */ UniffiVTableCallbackInterfaceCrListener(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0 r1, uniffi.cr_android.UniffiCallbackInterfaceFree r2, int r3, p000.bd0 r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (822848202 > 346160) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree, int, bd0):void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.<init>(uniffi.cr_android.UniffiCallbackInterfaceCrListenerMethod0, uniffi.cr_android.UniffiCallbackInterfaceFree, int, bd0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2038163778 < 0) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.uniffiSetValue$sdk_release(uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener):void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2038163778 < 0)
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
    public final void uniffiSetValue$sdk_release(uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2038163778 < 0) in method: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.uniffiSetValue$sdk_release(uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener):void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener.uniffiSetValue$sdk_release(uniffi.cr_android.UniffiVTableCallbackInterfaceCrListener):void");
    }
}

package com.unity3d.ads.datastore;

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
/* loaded from: classes39.dex */
public final class WebviewConfigurationStore {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* renamed from: com.unity3d.ads.datastore.WebviewConfigurationStore$1 */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C01811 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4555xa1df5c61 = null;
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes15.dex */
    public static final class WebViewConfigurationStore extends GeneratedMessageLite<WebViewConfigurationStore, Builder> implements WebViewConfigurationStoreOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfigurationStore DEFAULT_INSTANCE = null;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser<WebViewConfigurationStore> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> additionalFiles_;
        private String entryPoint_;
        private String type_;
        private int version_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes33.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<WebViewConfigurationStore, Builder> implements WebViewConfigurationStoreOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (790882014 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.<init>():void, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (790882014 > 410888)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (790882014 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.<init>():void, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1352084970 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.<init>(com.unity3d.ads.datastore.WebviewConfigurationStore$1):void, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1352084970 > 410888)
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
            public /* synthetic */ Builder(com.unity3d.ads.datastore.WebviewConfigurationStore.C01811 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1352084970 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.<init>(com.unity3d.ads.datastore.WebviewConfigurationStore$1):void, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.<init>(com.unity3d.ads.datastore.WebviewConfigurationStore$1):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1089846427 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAdditionalFiles(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1089846427 < 0)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder addAdditionalFiles(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1089846427 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAdditionalFiles(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAdditionalFiles(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-445418955 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAdditionalFilesBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-445418955 < 0)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder addAdditionalFilesBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-445418955 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAdditionalFilesBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAdditionalFilesBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-198572325 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAllAdditionalFiles(java.lang.Iterable<java.lang.String>):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-198572325 < 0)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder addAllAdditionalFiles(java.lang.Iterable<java.lang.String> r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-198572325 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAllAdditionalFiles(java.lang.Iterable<java.lang.String>):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.addAllAdditionalFiles(java.lang.Iterable):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (711589338 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearAdditionalFiles():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (711589338 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder clearAdditionalFiles() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (711589338 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearAdditionalFiles():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearAdditionalFiles():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1022147894 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearEntryPoint():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1022147894 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder clearEntryPoint() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1022147894 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearEntryPoint():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearEntryPoint():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-398963211 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearType():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-398963211 < 0)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder clearType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-398963211 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearType():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearType():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1321421772 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearVersion():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1321421772 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder clearVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1321421772 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearVersion():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.clearVersion():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1651254531 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFiles(int):java.lang.String, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1651254531 < 0)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public java.lang.String getAdditionalFiles(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1651254531 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFiles(int):java.lang.String, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFiles(int):java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (75880234 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesBytes(int):com.google.protobuf.ByteString, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (75880234 > 410888)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public com.google.protobuf.ByteString getAdditionalFilesBytes(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (75880234 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesBytes(int):com.google.protobuf.ByteString, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesBytes(int):com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1318050102 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesCount():int, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1318050102 > 410888)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public int getAdditionalFilesCount() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1318050102 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesCount():int, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesCount():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (297839350 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesList():java.util.List<java.lang.String>, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (297839350 > 410888)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public java.util.List<java.lang.String> getAdditionalFilesList() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (297839350 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesList():java.util.List<java.lang.String>, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getAdditionalFilesList():java.util.List");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1174998772 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getEntryPoint():java.lang.String, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1174998772 > 410888)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public java.lang.String getEntryPoint() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1174998772 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getEntryPoint():java.lang.String, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getEntryPoint():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1621526234 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getEntryPointBytes():com.google.protobuf.ByteString, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1621526234 < 0)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public com.google.protobuf.ByteString getEntryPointBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1621526234 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getEntryPointBytes():com.google.protobuf.ByteString, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getEntryPointBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1623304779 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getType():java.lang.String, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1623304779 < 0)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public java.lang.String getType() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1623304779 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getType():java.lang.String, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getType():java.lang.String");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (220989359 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getTypeBytes():com.google.protobuf.ByteString, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (220989359 > 410888)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public com.google.protobuf.ByteString getTypeBytes() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (220989359 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getTypeBytes():com.google.protobuf.ByteString, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getTypeBytes():com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1602570869 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getVersion():int, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1602570869 > 410888)
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
            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public int getVersion() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1602570869 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getVersion():int, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.getVersion():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (727785774 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setAdditionalFiles(int, java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (727785774 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder setAdditionalFiles(int r1, java.lang.String r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (727785774 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setAdditionalFiles(int, java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setAdditionalFiles(int, java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2003894203 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setEntryPoint(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2003894203 < 0)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder setEntryPoint(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2003894203 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setEntryPoint(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setEntryPoint(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (477183856 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setEntryPointBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (477183856 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder setEntryPointBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (477183856 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setEntryPointBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setEntryPointBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-28426380 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setType(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-28426380 < 0)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder setType(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-28426380 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setType(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setType(java.lang.String):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (376925686 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setTypeBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (376925686 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder setTypeBytes(com.google.protobuf.ByteString r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (376925686 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setTypeBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setTypeBytes(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1989317366 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setVersion(int):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1989317366 > 410888)
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
            public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder setVersion(int r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1989317366 > 410888) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setVersion(int):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes33.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder.setVersion(int):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1513018978 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.<clinit>():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1513018978 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1513018978 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.<clinit>():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1131839865 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.<init>():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1131839865 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private WebViewConfigurationStore() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1131839865 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.<init>():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (85187940 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$000():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (85187940 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (85187940 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$000():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$000():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-898238523 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$100(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, int):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-898238523 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$100(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-898238523 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$100(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, int):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$100(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1466840230 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1000(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1466840230 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1000(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1466840230 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1000(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1000(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1482207822 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1100(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1482207822 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1100(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1482207822 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1100(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1100(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1378344317 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1200(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1378344317 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1200(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1378344317 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1200(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1200(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1704577130 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1300(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1704577130 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$1300(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1704577130 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1300(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$1300(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1252924518 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$200(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1252924518 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$200(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1252924518 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$200(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$200(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2115495931 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$300(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2115495931 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$300(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2115495931 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$300(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$300(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1528564578 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$400(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1528564578 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$400(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1528564578 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$400(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$400(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1728758559 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$500(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1728758559 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$500(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1728758559 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$500(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$500(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-844855130 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$600(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, int, java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-844855130 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$600(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, int r1, java.lang.String r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-844855130 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$600(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, int, java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$600(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, int, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1922418406 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$700(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1922418406 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$700(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1922418406 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$700(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$700(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (22198458 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$800(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.Iterable):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (22198458 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$800(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0, java.lang.Iterable r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (22198458 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$800(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.Iterable):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$800(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1893270332 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$900(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1893270332 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void access$900(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1893270332 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$900(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.access$900(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-73245326 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAdditionalFiles(java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-73245326 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addAdditionalFiles(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-73245326 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAdditionalFiles(java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAdditionalFiles(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1421820968 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAdditionalFilesBytes(com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1421820968 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addAdditionalFilesBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1421820968 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAdditionalFilesBytes(com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAdditionalFilesBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1204945574 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAllAdditionalFiles(java.lang.Iterable<java.lang.String>):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1204945574 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void addAllAdditionalFiles(java.lang.Iterable<java.lang.String> r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1204945574 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAllAdditionalFiles(java.lang.Iterable<java.lang.String>):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.addAllAdditionalFiles(java.lang.Iterable):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (44358496 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearAdditionalFiles():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (44358496 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearAdditionalFiles() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (44358496 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearAdditionalFiles():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearAdditionalFiles():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (716086137 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearEntryPoint():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (716086137 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearEntryPoint() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (716086137 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearEntryPoint():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearEntryPoint():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (394840919 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearType():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (394840919 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (394840919 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearType():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearType():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1586292468 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearVersion():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1586292468 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void clearVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1586292468 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearVersion():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.clearVersion():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1548662170 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.ensureAdditionalFilesIsMutable():void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1548662170 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void ensureAdditionalFilesIsMutable() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1548662170 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.ensureAdditionalFilesIsMutable():void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.ensureAdditionalFilesIsMutable():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1198929473 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1198929473 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1198929473 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1253438064 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1253438064 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1253438064 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder():com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1562862751 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1562862751 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder newBuilder(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1562862751 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder(com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1884246875 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1884246875 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1884246875 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1746500630 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1746500630 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1746500630 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2092831386 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2092831386 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2092831386 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1071088504 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1071088504 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1071088504 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-607947682 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-607947682 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-607947682 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-837605686 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-837605686 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-837605686 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1284951598 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1284951598 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1284951598 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (660467120 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (660467120 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (660467120 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (798708576 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (798708576 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (798708576 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1159020448 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1159020448 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1159020448 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (512422633 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(byte[]):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (512422633 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (512422633 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(byte[]):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(byte[]):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-48051679 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-48051679 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-48051679 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (902367004 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parser():com.google.protobuf.Parser<com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore>, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (902367004 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (902367004 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parser():com.google.protobuf.Parser<com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStore>, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (501987722 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setAdditionalFiles(int, java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (501987722 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setAdditionalFiles(int r1, java.lang.String r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (501987722 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setAdditionalFiles(int, java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setAdditionalFiles(int, java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2079374468 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setEntryPoint(java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2079374468 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setEntryPoint(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2079374468 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setEntryPoint(java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setEntryPoint(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1107603180 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setEntryPointBytes(com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1107603180 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setEntryPointBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1107603180 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setEntryPointBytes(com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setEntryPointBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2026334346 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setType(java.lang.String):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2026334346 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setType(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2026334346 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setType(java.lang.String):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setType(java.lang.String):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-868388640 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setTypeBytes(com.google.protobuf.ByteString):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-868388640 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setTypeBytes(com.google.protobuf.ByteString r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-868388640 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setTypeBytes(com.google.protobuf.ByteString):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setTypeBytes(com.google.protobuf.ByteString):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-570048516 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setVersion(int):void, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-570048516 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private void setVersion(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-570048516 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setVersion(int):void, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.setVersion(int):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1710037958 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1710037958 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1710037958 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-560474146 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFiles(int):java.lang.String, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-560474146 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public java.lang.String getAdditionalFiles(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-560474146 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFiles(int):java.lang.String, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFiles(int):java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1132537358 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesBytes(int):com.google.protobuf.ByteString, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1132537358 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public com.google.protobuf.ByteString getAdditionalFilesBytes(int r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1132537358 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesBytes(int):com.google.protobuf.ByteString, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesBytes(int):com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1895924468 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesCount():int, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1895924468 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public int getAdditionalFilesCount() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1895924468 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesCount():int, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesCount():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1267223310 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesList():java.util.List<java.lang.String>, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1267223310 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public java.util.List<java.lang.String> getAdditionalFilesList() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1267223310 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesList():java.util.List<java.lang.String>, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getAdditionalFilesList():java.util.List");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1663966610 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getEntryPoint():java.lang.String, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1663966610 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public java.lang.String getEntryPoint() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1663966610 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getEntryPoint():java.lang.String, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getEntryPoint():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (226342038 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getEntryPointBytes():com.google.protobuf.ByteString, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (226342038 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public com.google.protobuf.ByteString getEntryPointBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (226342038 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getEntryPointBytes():com.google.protobuf.ByteString, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getEntryPointBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (816628542 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getType():java.lang.String, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (816628542 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public java.lang.String getType() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (816628542 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getType():java.lang.String, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getType():java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1866503110 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getTypeBytes():com.google.protobuf.ByteString, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1866503110 > 493412)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public com.google.protobuf.ByteString getTypeBytes() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1866503110 > 493412) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getTypeBytes():com.google.protobuf.ByteString, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getTypeBytes():com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1698831217 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getVersion():int, file: classes15.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1698831217 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public int getVersion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1698831217 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getVersion():int, file: classes15.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getVersion():int");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes13.dex */
    public interface WebViewConfigurationStoreOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalFiles(int i);

        ByteString getAdditionalFilesBytes(int i);

        int getAdditionalFilesCount();

        List<String> getAdditionalFilesList();

        String getEntryPoint();

        ByteString getEntryPointBytes();

        String getType();

        ByteString getTypeBytes();

        int getVersion();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1402974746 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.<init>():void, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1402974746 < 0)
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
    private WebviewConfigurationStore() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1402974746 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.<init>():void, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2054846132 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes39.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2054846132 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2054846132 < 0) in method: com.unity3d.ads.datastore.WebviewConfigurationStore.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes39.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.WebviewConfigurationStore.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

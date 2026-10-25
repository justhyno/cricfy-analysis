package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.Map;

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
/* loaded from: classes6.dex */
public final class UniversalRequestStoreOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* renamed from: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$1 */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C01801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4554xa1df5c61 = null;
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes29.dex */
    public static final class UniversalRequestStore extends GeneratedMessageLite<UniversalRequestStore, Builder> implements UniversalRequestStoreOrBuilder {
        private static final UniversalRequestStore DEFAULT_INSTANCE = null;
        private static volatile Parser<UniversalRequestStore> PARSER = null;
        public static final int UNIVERSAL_REQUEST_MAP_FIELD_NUMBER = 1;
        private MapFieldLite<String, ByteString> universalRequestMap_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<UniversalRequestStore, Builder> implements UniversalRequestStoreOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1996748536 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.<init>():void, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1996748536 > 392004)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1996748536 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.<init>():void, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-789255528 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.<init>(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$1):void, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-789255528 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public /* synthetic */ Builder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.C01801 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-789255528 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.<init>(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$1):void, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.<init>(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$1):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-350557509 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.clearUniversalRequestMap():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-350557509 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder clearUniversalRequestMap() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-350557509 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.clearUniversalRequestMap():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.clearUniversalRequestMap():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2031347692 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.containsUniversalRequestMap(java.lang.String):boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2031347692 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public boolean containsUniversalRequestMap(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2031347692 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.containsUniversalRequestMap(java.lang.String):boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.containsUniversalRequestMap(java.lang.String):boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-123255402 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-123255402 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMap() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-123255402 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMap():java.util.Map");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1187928862 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapCount():int, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1187928862 > 392004)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public int getUniversalRequestMapCount() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1187928862 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapCount():int, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapCount():int");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1158281474 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1158281474 > 392004)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMapMap() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1158281474 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapMap():java.util.Map");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (235659869 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapOrDefault(java.lang.String, com.google.protobuf.ByteString):com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (235659869 > 392004)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public com.google.protobuf.ByteString getUniversalRequestMapOrDefault(java.lang.String r1, com.google.protobuf.ByteString r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (235659869 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapOrDefault(java.lang.String, com.google.protobuf.ByteString):com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapOrDefault(java.lang.String, com.google.protobuf.ByteString):com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1056703790 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapOrThrow(java.lang.String):com.google.protobuf.ByteString, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1056703790 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public com.google.protobuf.ByteString getUniversalRequestMapOrThrow(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1056703790 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapOrThrow(java.lang.String):com.google.protobuf.ByteString, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.getUniversalRequestMapOrThrow(java.lang.String):com.google.protobuf.ByteString");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-501194772 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.putAllUniversalRequestMap(java.util.Map<java.lang.String, com.google.protobuf.ByteString>):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-501194772 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder putAllUniversalRequestMap(java.util.Map<java.lang.String, com.google.protobuf.ByteString> r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-501194772 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.putAllUniversalRequestMap(java.util.Map<java.lang.String, com.google.protobuf.ByteString>):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.putAllUniversalRequestMap(java.util.Map):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (370766071 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.putUniversalRequestMap(java.lang.String, com.google.protobuf.ByteString):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (370766071 > 392004)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder putUniversalRequestMap(java.lang.String r1, com.google.protobuf.ByteString r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (370766071 > 392004) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.putUniversalRequestMap(java.lang.String, com.google.protobuf.ByteString):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.putUniversalRequestMap(java.lang.String, com.google.protobuf.ByteString):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-191108474 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.removeUniversalRequestMap(java.lang.String):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-191108474 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder removeUniversalRequestMap(java.lang.String r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-191108474 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.removeUniversalRequestMap(java.lang.String):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder.removeUniversalRequestMap(java.lang.String):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder");
            }
        }

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes.dex */
        public static final class UniversalRequestMapDefaultEntryHolder {
            static final MapEntryLite<String, ByteString> defaultEntry = null;

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1658325678 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.<clinit>():void, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1658325678 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1658325678 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.<clinit>():void, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.<clinit>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-671550470 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.<init>():void, file: classes.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-671550470 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            private UniversalRequestMapDefaultEntryHolder() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-671550470 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.<init>():void, file: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.<init>():void");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (754527790 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.<clinit>():void, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (754527790 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (754527790 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.<clinit>():void, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1291131999 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.<init>():void, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1291131999 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private UniversalRequestStore() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1291131999 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.<init>():void, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-100519571 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.access$000():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-100519571 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-100519571 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.access$000():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.access$000():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-369099645 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.access$100(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore):java.util.Map, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-369099645 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ java.util.Map access$100(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-369099645 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.access$100(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore):java.util.Map, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.access$100(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore):java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (647670024 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (647670024 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (647670024 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1804215951 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getMutableUniversalRequestMapMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1804215951 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private java.util.Map<java.lang.String, com.google.protobuf.ByteString> getMutableUniversalRequestMapMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1804215951 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getMutableUniversalRequestMapMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getMutableUniversalRequestMapMap():java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2127031585 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.internalGetMutableUniversalRequestMap():com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2127031585 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> internalGetMutableUniversalRequestMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2127031585 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.internalGetMutableUniversalRequestMap():com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.internalGetMutableUniversalRequestMap():com.google.protobuf.MapFieldLite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1174888576 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.internalGetUniversalRequestMap():com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1174888576 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> internalGetUniversalRequestMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1174888576 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.internalGetUniversalRequestMap():com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.internalGetUniversalRequestMap():com.google.protobuf.MapFieldLite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-549064568 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-549064568 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-549064568 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder():com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1262017200 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1262017200 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1262017200 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-363498572 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-363498572 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-363498572 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseDelimitedFrom(java.io.InputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1718838086 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1718838086 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1718838086 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1223786318 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1223786318 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1223786318 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.ByteString):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1153332645 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1153332645 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1153332645 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1630714220 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1630714220 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1630714220 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.CodedInputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1581971723 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1581971723 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1581971723 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1916637866 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1916637866 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1916637866 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.io.InputStream):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1784540022 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1784540022 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1784540022 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-720521560 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-720521560 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-720521560 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.nio.ByteBuffer):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1680589496 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1680589496 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1680589496 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1493992036 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(byte[]):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1493992036 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1493992036 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(byte[]):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(byte[]):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-188026700 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-188026700 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-188026700 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-531074022 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parser():com.google.protobuf.Parser<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore>, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-531074022 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static com.google.protobuf.Parser<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-531074022 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parser():com.google.protobuf.Parser<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore>, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-136562430 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.containsUniversalRequestMap(java.lang.String):boolean, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-136562430 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public boolean containsUniversalRequestMap(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-136562430 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.containsUniversalRequestMap(java.lang.String):boolean, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.containsUniversalRequestMap(java.lang.String):boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (239673284 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (239673284 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (239673284 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (176953187 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (176953187 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (176953187 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMap():java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1076541528 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapCount():int, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1076541528 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public int getUniversalRequestMapCount() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1076541528 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapCount():int, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapCount():int");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1839340539 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1839340539 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMapMap() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1839340539 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapMap():java.util.Map<java.lang.String, com.google.protobuf.ByteString>, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapMap():java.util.Map");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1753466978 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapOrDefault(java.lang.String, com.google.protobuf.ByteString):com.google.protobuf.ByteString, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1753466978 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public com.google.protobuf.ByteString getUniversalRequestMapOrDefault(java.lang.String r1, com.google.protobuf.ByteString r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1753466978 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapOrDefault(java.lang.String, com.google.protobuf.ByteString):com.google.protobuf.ByteString, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapOrDefault(java.lang.String, com.google.protobuf.ByteString):com.google.protobuf.ByteString");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1831504071 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapOrThrow(java.lang.String):com.google.protobuf.ByteString, file: classes29.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1831504071 > 390388)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public com.google.protobuf.ByteString getUniversalRequestMapOrThrow(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1831504071 > 390388) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapOrThrow(java.lang.String):com.google.protobuf.ByteString, file: classes29.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getUniversalRequestMapOrThrow(java.lang.String):com.google.protobuf.ByteString");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes5.dex */
    public interface UniversalRequestStoreOrBuilder extends MessageLiteOrBuilder {
        boolean containsUniversalRequestMap(String str);

        @Deprecated
        Map<String, ByteString> getUniversalRequestMap();

        int getUniversalRequestMapCount();

        Map<String, ByteString> getUniversalRequestMapMap();

        ByteString getUniversalRequestMapOrDefault(String str, ByteString byteString);

        ByteString getUniversalRequestMapOrThrow(String str);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1865176128 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.<init>():void, file: classes6.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1865176128 < 0)
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
    private UniversalRequestStoreOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1865176128 < 0) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.<init>():void, file: classes6.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (762129626 > 376096) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes6.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (762129626 > 376096)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (762129626 > 376096) in method: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes6.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

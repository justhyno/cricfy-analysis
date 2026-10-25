package com.google.protobuf;

import com.google.protobuf.MessageLite;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes12.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1274162139 > 362532) in method: com.google.protobuf.AbstractParser.<clinit>():void, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1274162139 > 362532)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1274162139 > 362532) in method: com.google.protobuf.AbstractParser.<clinit>():void, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1509086578 < 0) in method: com.google.protobuf.AbstractParser.<init>():void, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1509086578 < 0)
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
    public AbstractParser() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1509086578 < 0) in method: com.google.protobuf.AbstractParser.<init>():void, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-335564438 < 0) in method: com.google.protobuf.AbstractParser.checkMessageInitialized(MessageType extends com.google.protobuf.MessageLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-335564438 < 0)
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
    private MessageType checkMessageInitialized(MessageType r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-335564438 < 0) in method: com.google.protobuf.AbstractParser.checkMessageInitialized(MessageType extends com.google.protobuf.MessageLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.checkMessageInitialized(com.google.protobuf.MessageLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1082156768 < 0) in method: com.google.protobuf.AbstractParser.newUninitializedMessageException(MessageType extends com.google.protobuf.MessageLite):com.google.protobuf.UninitializedMessageException, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1082156768 < 0)
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
    private com.google.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1082156768 < 0) in method: com.google.protobuf.AbstractParser.newUninitializedMessageException(MessageType extends com.google.protobuf.MessageLite):com.google.protobuf.UninitializedMessageException, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.newUninitializedMessageException(com.google.protobuf.MessageLite):com.google.protobuf.UninitializedMessageException");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1531475293 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1531475293 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1531475293 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1067006001 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1067006001 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1067006001 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (211701082 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (211701082 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseDelimitedFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (211701082 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1104579970 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1104579970 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseDelimitedFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1104579970 > 362532) in method: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1081563476 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1081563476 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1081563476 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1848027100 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1848027100 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1848027100 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2089733004 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2089733004 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2089733004 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-425378383 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-425378383 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-425378383 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2108810815 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2108810815 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2108810815 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-170587802 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-170587802 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-170587802 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1670099338 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1670099338 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1670099338 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (294831158 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (294831158 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (294831158 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1092536812 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[]):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1092536812 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1092536812 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[]):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[]):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1410861956 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1410861956 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] r1, int r2, int r3) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1410861956 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1234189153 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1234189153 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] r1, int r2, int r3, com.google.protobuf.ExtensionRegistryLite r4) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1234189153 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-619107260 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-619107260 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-619107260 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (485338382 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (485338382 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.protobuf.ByteString r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (485338382 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1947177536 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1947177536 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.protobuf.ByteString r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1947177536 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1907976656 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1907976656 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.protobuf.CodedInputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1907976656 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-845771000 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-845771000 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.protobuf.CodedInputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-845771000 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (466662043 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (466662043 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (466662043 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1462443096 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1462443096 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1462443096 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1542793882 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1542793882 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.nio.ByteBuffer r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1542793882 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1531661351 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1531661351 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.nio.ByteBuffer r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1531661351 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1746235941 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[]):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1746235941 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1746235941 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[]):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[]):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1870631394 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1870631394 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, int r2, int r3) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1870631394 > 362532) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1098482582 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1098482582 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, int r2, int r3, com.google.protobuf.ExtensionRegistryLite r4) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1098482582 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-898346894 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-898346894 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-898346894 < 0) in method: com.google.protobuf.AbstractParser.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-626511232 < 0) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-626511232 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-626511232 < 0) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (176166526 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (176166526 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (176166526 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1913090795 < 0) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1913090795 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialDelimitedFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1913090795 < 0) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-284334046 < 0) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-284334046 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialDelimitedFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-284334046 < 0) in method: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1170242595 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1170242595 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1170242595 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (425855599 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (425855599 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (425855599 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (940497266 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.CodedInputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (940497266 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.CodedInputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (940497266 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.CodedInputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.CodedInputStream):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (695324638 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (695324638 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (695324638 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1359730634 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1359730634 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1359730634 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1488511010 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[]):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1488511010 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1488511010 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[]):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[]):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-459836882 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-459836882 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r1, int r2, int r3) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-459836882 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1920647347 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1920647347 > 362532)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r1, int r2, int r3, com.google.protobuf.ExtensionRegistryLite r4) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1920647347 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1018236900 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1018236900 < 0)
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
    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1018236900 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], com.google.protobuf.ExtensionRegistryLite):MessageType extends com.google.protobuf.MessageLite, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1802082306 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1802082306 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.protobuf.ByteString r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1802082306 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1035968523 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1035968523 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.protobuf.ByteString r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1035968523 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-162524126 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.CodedInputStream):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-162524126 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.protobuf.CodedInputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-162524126 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.CodedInputStream):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(com.google.protobuf.CodedInputStream):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-42959282 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-42959282 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(java.io.InputStream r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-42959282 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1426457470 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1426457470 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(java.io.InputStream r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1426457470 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1667808135 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[]):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1667808135 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1667808135 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[]):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[]):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1637945242 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1637945242 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1637945242 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-5434985 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-5434985 < 0)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3, com.google.protobuf.ExtensionRegistryLite r4) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-5434985 < 0) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], int, int, com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (329361506 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (329361506 > 362532)
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
    @Override // com.google.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, com.google.protobuf.ExtensionRegistryLite r2) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (329361506 > 362532) in method: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], com.google.protobuf.ExtensionRegistryLite):java.lang.Object, file: classes12.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractParser.parsePartialFrom(byte[], com.google.protobuf.ExtensionRegistryLite):java.lang.Object");
    }
}

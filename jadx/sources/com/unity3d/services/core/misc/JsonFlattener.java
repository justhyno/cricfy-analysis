package com.unity3d.services.core.misc;

import org.json.JSONObject;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes50.dex */
public class JsonFlattener {
    private final JSONObject _jsonData;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-254573584 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.<init>(org.json.JSONObject):void, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-254573584 < 0)
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
    public JsonFlattener(org.json.JSONObject r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-254573584 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.<init>(org.json.JSONObject):void, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.JsonFlattener.<init>(org.json.JSONObject):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1271493996 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.shouldIncludeKey(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>):boolean, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1271493996 < 0)
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
    private boolean shouldIncludeKey(java.lang.String r1, java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1271493996 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.shouldIncludeKey(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>):boolean, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.JsonFlattener.shouldIncludeKey(java.lang.String, java.util.List, java.util.List):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (682998110 > 405784) in method: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, com.unity3d.services.core.misc.JsonFlattenerRules):org.json.JSONObject, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (682998110 > 405784)
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
    public org.json.JSONObject flattenJson(java.lang.String r1, com.unity3d.services.core.misc.JsonFlattenerRules r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (682998110 > 405784) in method: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, com.unity3d.services.core.misc.JsonFlattenerRules):org.json.JSONObject, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, com.unity3d.services.core.misc.JsonFlattenerRules):org.json.JSONObject");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-838333261 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):org.json.JSONObject, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-838333261 < 0)
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
    public org.json.JSONObject flattenJson(java.lang.String r1, java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-838333261 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):org.json.JSONObject, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, java.util.List, java.util.List, java.util.List):org.json.JSONObject");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-672763112 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, java.lang.String, org.json.JSONObject, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void, file: classes50.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-672763112 < 0)
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
    public void flattenJson(java.lang.String r1, java.lang.String r2, org.json.JSONObject r3, java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5) throws org.json.JSONException {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-672763112 < 0) in method: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, java.lang.String, org.json.JSONObject, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void, file: classes50.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.JsonFlattener.flattenJson(java.lang.String, java.lang.String, org.json.JSONObject, java.util.List, java.util.List):void");
    }
}

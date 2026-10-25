package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import p000.ul1;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes37.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final ul1 f4246a = null;

    /* renamed from: b */
    public static final ul1 f4247b = null;

    /* renamed from: c */
    public static final ul1 f4248c = null;

    /* renamed from: d */
    public static final ul1 f4249d = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1418644706 < 0) in method: com.google.firebase.concurrent.ExecutorsRegistrar.getComponents():java.util.List, file: classes37.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1418644706 < 0)
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
    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List getComponents() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1418644706 < 0) in method: com.google.firebase.concurrent.ExecutorsRegistrar.getComponents():java.util.List, file: classes37.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.ExecutorsRegistrar.getComponents():java.util.List");
    }
}

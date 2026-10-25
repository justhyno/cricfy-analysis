package com.unity3d.services.core.di;

import java.util.Map;
import p000.tl1;
import p000.zj1;

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
/* loaded from: classes49.dex */
public interface IServicesRegistry {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes22.dex */
    public static final class DefaultImpls {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-686522758 < 0) in method: com.unity3d.services.core.di.IServicesRegistry.DefaultImpls.getService$default(com.unity3d.services.core.di.IServicesRegistry, java.lang.String, zj1, int, java.lang.Object):java.lang.Object, file: classes22.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-686522758 < 0)
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
        public static /* synthetic */ java.lang.Object getService$default(com.unity3d.services.core.di.IServicesRegistry r0, java.lang.String r1, p000.zj1 r2, int r3, java.lang.Object r4) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-686522758 < 0) in method: com.unity3d.services.core.di.IServicesRegistry.DefaultImpls.getService$default(com.unity3d.services.core.di.IServicesRegistry, java.lang.String, zj1, int, java.lang.Object):java.lang.Object, file: classes22.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.di.IServicesRegistry.DefaultImpls.getService$default(com.unity3d.services.core.di.IServicesRegistry, java.lang.String, zj1, int, java.lang.Object):java.lang.Object");
        }
    }

    <T> T getService(String str, zj1 zj1Var);

    Map<ServiceKey, tl1> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, tl1 tl1Var);
}

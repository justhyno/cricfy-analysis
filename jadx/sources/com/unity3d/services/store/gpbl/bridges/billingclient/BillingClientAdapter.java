package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import p000.ea2;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes13.dex */
public abstract class BillingClientAdapter {
    private final ea2 _isInitialized;

    public abstract String getAdapterVersion();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-258737888 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.get_isInitialized$unity_ads_defaultRelease():ea2, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-258737888 < 0)
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
    public final p000.ea2 get_isInitialized$unity_ads_defaultRelease() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-258737888 < 0) in method: com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.get_isInitialized$unity_ads_defaultRelease():ea2, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.get_isInitialized$unity_ads_defaultRelease():ea2");
    }

    public abstract void initialize(BillingInitializationListener billingInitializationListener);

    public abstract BillingResultResponseCode isFeatureSupported(String str);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1612524881 > 389804) in method: com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.isInitialized():boolean, file: classes13.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1612524881 > 389804)
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
    public final boolean isInitialized() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1612524881 > 389804) in method: com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.isInitialized():boolean, file: classes13.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.isInitialized():boolean");
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(String str, String str2, ProductDetailsListener productDetailsListener);

    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}

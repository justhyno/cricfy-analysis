package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import p000.ay0;
import p000.ea2;
import p000.z50;

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
/* loaded from: classes3.dex */
public interface DeviceInfoRepository {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes33.dex */
    public static final class DefaultImpls {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1890660642 > 410888) in method: com.unity3d.ads.core.data.repository.DeviceInfoRepository.DefaultImpls.getDynamicDeviceInfo$default(com.unity3d.ads.core.data.repository.DeviceInfoRepository, boolean, int, java.lang.Object):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes33.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1890660642 > 410888)
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
        public static /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo$default(com.unity3d.ads.core.data.repository.DeviceInfoRepository r0, boolean r1, int r2, java.lang.Object r3) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1890660642 > 410888) in method: com.unity3d.ads.core.data.repository.DeviceInfoRepository.DefaultImpls.getDynamicDeviceInfo$default(com.unity3d.ads.core.data.repository.DeviceInfoRepository, boolean, int, java.lang.Object):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo, file: classes33.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.DeviceInfoRepository.DefaultImpls.getDynamicDeviceInfo$default(com.unity3d.ads.core.data.repository.DeviceInfoRepository, boolean, int, java.lang.Object):gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo");
        }
    }

    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    ea2 getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(z50 z50Var);

    Object getAuidString(z50 z50Var);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo(boolean z);

    boolean getHasInternet();

    Object getIdfi(z50 z50Var);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    Object getUnityBuildGuid(z50 z50Var);

    ay0 getVolumeSettingsChange();

    Object staticDeviceInfo(z50 z50Var);
}

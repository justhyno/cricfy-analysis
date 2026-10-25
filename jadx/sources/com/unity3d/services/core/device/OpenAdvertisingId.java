package com.unity3d.services.core.device;

import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes7.dex */
public class OpenAdvertisingId {
    static long BINDER_TIMEOUT_SECONDS = 10;
    private static final String HW_DEVICE_NAME = "HUAWEI";
    private static final String HW_OPEN_ADVERTISING_ID_SERVICE_NAME = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static OpenAdvertisingId instance;
    private boolean limitedOpenAdTracking;
    private String openAdvertisingIdentifier;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public interface HWAdvertisingInfo extends IInterface {

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes44.dex */
        public static abstract class HWAdvertisingInfoBinder extends Binder implements HWAdvertisingInfo {

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes3.dex */
            public static class HWAdvertisingInfoImplementation implements HWAdvertisingInfo {
                private final IBinder _binder;

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1626647584 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.<init>(android.os.IBinder):void, file: classes3.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1626647584 < 0)
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
                public HWAdvertisingInfoImplementation(android.os.IBinder r1) {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1626647584 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.<init>(android.os.IBinder):void, file: classes3.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.<init>(android.os.IBinder):void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (677440750 > 389804) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.asBinder():android.os.IBinder, file: classes3.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (677440750 > 389804)
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
                @Override // android.os.IInterface
                public android.os.IBinder asBinder() {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (677440750 > 389804) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.asBinder():android.os.IBinder, file: classes3.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.asBinder():android.os.IBinder");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (645518974 > 389804) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.getEnabled(boolean):boolean, file: classes3.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (645518974 > 389804)
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
                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public boolean getEnabled(boolean r1) throws android.os.RemoteException {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (645518974 > 389804) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.getEnabled(boolean):boolean, file: classes3.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.getEnabled(boolean):boolean");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1911845979 > 389804) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.getId():java.lang.String, file: classes3.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1911845979 > 389804)
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
                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public java.lang.String getId() throws android.os.RemoteException {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1911845979 > 389804) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.getId():java.lang.String, file: classes3.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation.getId():java.lang.String");
                }
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-581412592 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.create(android.os.IBinder):com.unity3d.services.core.device.OpenAdvertisingId$HWAdvertisingInfo, file: classes44.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-581412592 < 0)
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
            public static com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo create(android.os.IBinder r0) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-581412592 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.create(android.os.IBinder):com.unity3d.services.core.device.OpenAdvertisingId$HWAdvertisingInfo, file: classes44.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.create(android.os.IBinder):com.unity3d.services.core.device.OpenAdvertisingId$HWAdvertisingInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-250112770 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean, file: classes44.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-250112770 < 0)
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
            @Override // android.os.Binder
            public boolean onTransact(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-250112770 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean, file: classes44.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
            }
        }

        boolean getEnabled(boolean z) throws RemoteException;

        String getId() throws RemoteException;
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes31.dex */
    public class HWAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> _binderQueue;
        boolean _consumed;
        final /* synthetic */ OpenAdvertisingId this$0;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1719576194 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.<init>(com.unity3d.services.core.device.OpenAdvertisingId):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1719576194 < 0)
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
        public HWAdvertisingServiceConnection(com.unity3d.services.core.device.OpenAdvertisingId r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1719576194 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.<init>(com.unity3d.services.core.device.OpenAdvertisingId):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.<init>(com.unity3d.services.core.device.OpenAdvertisingId):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-785342097 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.getBinder():android.os.IBinder, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-785342097 < 0)
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
        public android.os.IBinder getBinder() throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-785342097 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.getBinder():android.os.IBinder, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.getBinder():android.os.IBinder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1964387116 > 364120) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1964387116 > 364120)
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
        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1964387116 > 364120) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1551759273 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.onServiceDisconnected(android.content.ComponentName):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1551759273 < 0)
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
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1551759273 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.onServiceDisconnected(android.content.ComponentName):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection.onServiceDisconnected(android.content.ComponentName):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2031515254 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.fetchOAId(android.content.Context):boolean, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2031515254 > 408588)
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
    private boolean fetchOAId(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2031515254 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.fetchOAId(android.content.Context):boolean, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.fetchOAId(android.content.Context):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (819101124 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.getInstance():com.unity3d.services.core.device.OpenAdvertisingId, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (819101124 > 408588)
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
    private static com.unity3d.services.core.device.OpenAdvertisingId getInstance() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (819101124 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.getInstance():com.unity3d.services.core.device.OpenAdvertisingId, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.getInstance():com.unity3d.services.core.device.OpenAdvertisingId");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (507331134 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking():boolean, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (507331134 > 408588)
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
    public static boolean getLimitedOpenAdTracking() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (507331134 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking():boolean, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1432048478 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId():java.lang.String, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1432048478 < 0)
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
    public static java.lang.String getOpenAdvertisingTrackingId() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1432048478 < 0) in method: com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId():java.lang.String, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1709188674 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.init(android.content.Context):boolean, file: classes7.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1709188674 > 408588)
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
    public static boolean init(android.content.Context r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1709188674 > 408588) in method: com.unity3d.services.core.device.OpenAdvertisingId.init(android.content.Context):boolean, file: classes7.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.OpenAdvertisingId.init(android.content.Context):boolean");
    }
}

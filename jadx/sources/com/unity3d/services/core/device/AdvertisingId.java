package com.unity3d.services.core.device;

import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes36.dex */
public class AdvertisingId {
    private static final String ADVERTISING_ID_SERVICE_NAME = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    static long BINDER_TIMEOUT_SECONDS = 10;
    private static AdvertisingId instance;
    private String advertisingIdentifier;
    private boolean limitedAdvertisingTracking;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes9.dex */
    public interface GoogleAdvertisingInfo extends IInterface {

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        public static abstract class GoogleAdvertisingInfoBinder extends Binder implements GoogleAdvertisingInfo {

            /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
            /* loaded from: classes13.dex */
            public static class GoogleAdvertisingInfoImplementation implements GoogleAdvertisingInfo {
                private final IBinder _binder;

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-113288966 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.<init>(android.os.IBinder):void, file: classes13.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-113288966 < 0)
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
                public GoogleAdvertisingInfoImplementation(android.os.IBinder r1) {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-113288966 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.<init>(android.os.IBinder):void, file: classes13.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.<init>(android.os.IBinder):void");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1124976669 > 389804) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.asBinder():android.os.IBinder, file: classes13.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1124976669 > 389804)
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
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1124976669 > 389804) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.asBinder():android.os.IBinder, file: classes13.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.asBinder():android.os.IBinder");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1204814494 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.getEnabled(boolean):boolean, file: classes13.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1204814494 < 0)
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
                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public boolean getEnabled(boolean r1) throws android.os.RemoteException {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1204814494 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.getEnabled(boolean):boolean, file: classes13.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.getEnabled(boolean):boolean");
                }

                /*  JADX ERROR: Method load error
                    jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (420595662 > 389804) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.getId():java.lang.String, file: classes13.dex
                    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                    Caused by: java.lang.IllegalArgumentException: newPosition > limit: (420595662 > 389804)
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
                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public java.lang.String getId() throws android.os.RemoteException {
                    /*
                    // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (420595662 > 389804) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.getId():java.lang.String, file: classes13.dex
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation.getId():java.lang.String");
                }
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-854604530 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(android.os.IBinder):com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-854604530 < 0)
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
            public static com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo create(android.os.IBinder r0) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-854604530 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(android.os.IBinder):com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(android.os.IBinder):com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1862887808 > 392004) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean, file: classes9.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1862887808 > 392004)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1862887808 > 392004) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean, file: classes9.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
            }
        }

        boolean getEnabled(boolean z) throws RemoteException;

        String getId() throws RemoteException;
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes31.dex */
    public class GoogleAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> _binderQueue;
        boolean _consumed;
        final /* synthetic */ AdvertisingId this$0;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1506547122 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.<init>(com.unity3d.services.core.device.AdvertisingId):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1506547122 < 0)
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
        public GoogleAdvertisingServiceConnection(com.unity3d.services.core.device.AdvertisingId r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1506547122 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.<init>(com.unity3d.services.core.device.AdvertisingId):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.<init>(com.unity3d.services.core.device.AdvertisingId):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (338242825 > 364120) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.getBinder():android.os.IBinder, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (338242825 > 364120)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (338242825 > 364120) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.getBinder():android.os.IBinder, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.getBinder():android.os.IBinder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (781789656 > 364120) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (781789656 > 364120)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (781789656 > 364120) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2068650786 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.onServiceDisconnected(android.content.ComponentName):void, file: classes31.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2068650786 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2068650786 < 0) in method: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.onServiceDisconnected(android.content.ComponentName):void, file: classes31.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection.onServiceDisconnected(android.content.ComponentName):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1229858392 > 411420) in method: com.unity3d.services.core.device.AdvertisingId.fetchAdvertisingId(android.content.Context):boolean, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1229858392 > 411420)
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
    private boolean fetchAdvertisingId(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1229858392 > 411420) in method: com.unity3d.services.core.device.AdvertisingId.fetchAdvertisingId(android.content.Context):boolean, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.fetchAdvertisingId(android.content.Context):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-292243682 < 0) in method: com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId():java.lang.String, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-292243682 < 0)
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
    public static java.lang.String getAdvertisingTrackingId() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-292243682 < 0) in method: com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId():java.lang.String, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2143183628 < 0) in method: com.unity3d.services.core.device.AdvertisingId.getInstance():com.unity3d.services.core.device.AdvertisingId, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2143183628 < 0)
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
    private static com.unity3d.services.core.device.AdvertisingId getInstance() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2143183628 < 0) in method: com.unity3d.services.core.device.AdvertisingId.getInstance():com.unity3d.services.core.device.AdvertisingId, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.getInstance():com.unity3d.services.core.device.AdvertisingId");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-19069493 < 0) in method: com.unity3d.services.core.device.AdvertisingId.getLimitedAdTracking():boolean, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-19069493 < 0)
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
    public static boolean getLimitedAdTracking() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-19069493 < 0) in method: com.unity3d.services.core.device.AdvertisingId.getLimitedAdTracking():boolean, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.getLimitedAdTracking():boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1821435780 < 0) in method: com.unity3d.services.core.device.AdvertisingId.init(android.content.Context):boolean, file: classes36.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1821435780 < 0)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1821435780 < 0) in method: com.unity3d.services.core.device.AdvertisingId.init(android.content.Context):boolean, file: classes36.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.init(android.content.Context):boolean");
    }
}

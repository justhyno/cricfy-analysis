package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

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
/* loaded from: classes17.dex */
public final class NetworkCapabilityTransportsOuterClass {

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes8.dex */
    public static final class NetworkCapabilityTransports extends GeneratedMessageLite<NetworkCapabilityTransports, Builder> implements NetworkCapabilityTransportsOrBuilder {
        public static final int BLUETOOTH_FIELD_NUMBER = 1;
        public static final int CELLULAR_FIELD_NUMBER = 2;
        private static final NetworkCapabilityTransports DEFAULT_INSTANCE = null;
        public static final int ETHERNET_FIELD_NUMBER = 3;
        public static final int LOWPAN_FIELD_NUMBER = 4;
        private static volatile Parser<NetworkCapabilityTransports> PARSER = null;
        public static final int SATELLITE_FIELD_NUMBER = 5;
        public static final int THREAD_FIELD_NUMBER = 6;
        public static final int USB_FIELD_NUMBER = 7;
        public static final int VPN_FIELD_NUMBER = 8;
        public static final int WIFI_AWARE_FIELD_NUMBER = 10;
        public static final int WIFI_FIELD_NUMBER = 9;
        private int bitField0_;
        private boolean bluetooth_;
        private boolean cellular_;
        private boolean ethernet_;
        private boolean lowpan_;
        private boolean satellite_;
        private boolean thread_;
        private boolean usb_;
        private boolean vpn_;
        private boolean wifiAware_;
        private boolean wifi_;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes10.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<NetworkCapabilityTransports, Builder> implements NetworkCapabilityTransportsOrBuilder {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1280035866 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.<init>():void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1280035866 < 0)
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
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1280035866 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.<init>():void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-991784758 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.<init>(we2):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-991784758 < 0)
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
            public /* synthetic */ Builder(p000.we2 r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-991784758 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.<init>(we2):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.<init>(we2):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1860205444 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearBluetooth():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1860205444 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearBluetooth() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1860205444 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearBluetooth():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearBluetooth():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-631383245 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearCellular():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-631383245 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearCellular() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-631383245 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearCellular():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearCellular():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (910589066 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearEthernet():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (910589066 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearEthernet() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (910589066 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearEthernet():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearEthernet():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1562645852 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearLowpan():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1562645852 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearLowpan() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1562645852 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearLowpan():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearLowpan():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-402616439 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearSatellite():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-402616439 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearSatellite() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-402616439 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearSatellite():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearSatellite():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1331312324 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearThread():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1331312324 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearThread() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1331312324 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearThread():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearThread():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (943329666 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearUsb():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (943329666 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearUsb() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (943329666 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearUsb():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearUsb():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (110153954 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearVpn():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (110153954 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearVpn() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (110153954 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearVpn():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearVpn():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (571585552 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearWifi():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (571585552 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearWifi() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (571585552 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearWifi():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearWifi():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2112999235 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearWifiAware():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2112999235 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearWifiAware() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2112999235 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearWifiAware():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.clearWifiAware():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1196393329 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getBluetooth():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1196393329 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getBluetooth() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1196393329 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getBluetooth():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getBluetooth():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2058514819 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getCellular():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2058514819 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getCellular() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2058514819 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getCellular():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getCellular():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (699031905 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getEthernet():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (699031905 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getEthernet() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (699031905 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getEthernet():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getEthernet():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1611466672 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getLowpan():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1611466672 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getLowpan() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1611466672 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getLowpan():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getLowpan():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1766403262 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getSatellite():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1766403262 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getSatellite() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1766403262 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getSatellite():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getSatellite():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1774671616 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getThread():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1774671616 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getThread() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1774671616 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getThread():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getThread():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-21211096 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getUsb():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-21211096 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getUsb() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-21211096 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getUsb():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getUsb():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1354144068 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getVpn():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1354144068 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getVpn() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1354144068 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getVpn():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getVpn():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1096825163 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getWifi():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1096825163 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifi() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1096825163 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getWifi():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getWifi():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1432877140 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getWifiAware():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1432877140 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifiAware() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1432877140 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getWifiAware():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.getWifiAware():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1940763596 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasBluetooth():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1940763596 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasBluetooth() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1940763596 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasBluetooth():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasBluetooth():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-141128838 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasCellular():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-141128838 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasCellular() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-141128838 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasCellular():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasCellular():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1709041293 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasEthernet():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1709041293 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasEthernet() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1709041293 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasEthernet():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasEthernet():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (438306550 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasLowpan():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (438306550 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasLowpan() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (438306550 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasLowpan():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasLowpan():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (204092713 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasSatellite():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (204092713 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasSatellite() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (204092713 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasSatellite():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasSatellite():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (375753350 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasThread():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (375753350 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasThread() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (375753350 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasThread():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasThread():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (112824318 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasUsb():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (112824318 > 376268)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasUsb() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (112824318 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasUsb():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasUsb():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2133784710 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasVpn():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2133784710 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasVpn() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2133784710 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasVpn():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasVpn():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1204894158 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasWifi():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1204894158 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifi() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1204894158 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasWifi():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasWifi():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-289181201 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasWifiAware():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-289181201 < 0)
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
            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifiAware() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-289181201 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasWifiAware():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.hasWifiAware():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1612989364 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setBluetooth(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1612989364 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setBluetooth(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1612989364 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setBluetooth(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setBluetooth(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1937135706 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setCellular(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1937135706 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setCellular(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1937135706 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setCellular(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setCellular(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1966981034 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setEthernet(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1966981034 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setEthernet(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1966981034 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setEthernet(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setEthernet(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1483380856 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setLowpan(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1483380856 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setLowpan(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1483380856 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setLowpan(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setLowpan(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-766995976 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setSatellite(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-766995976 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setSatellite(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-766995976 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setSatellite(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setSatellite(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1904454003 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setThread(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1904454003 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setThread(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1904454003 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setThread(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setThread(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (107222726 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setUsb(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (107222726 > 376268)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setUsb(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (107222726 > 376268) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setUsb(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setUsb(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1089188645 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setVpn(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1089188645 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setVpn(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1089188645 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setVpn(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setVpn(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1258524678 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setWifi(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1258524678 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setWifi(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1258524678 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setWifi(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setWifi(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1203515150 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setWifiAware(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1203515150 < 0)
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
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setWifiAware(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1203515150 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setWifiAware(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder.setWifiAware(boolean):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-207116343 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.<clinit>():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-207116343 < 0)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-207116343 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.<clinit>():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (528020939 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.<init>():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (528020939 > 380432)
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
        private NetworkCapabilityTransports() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (528020939 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.<init>():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (451102305 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$000():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (451102305 > 380432)
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
        public static /* synthetic */ gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports access$000() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (451102305 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$000():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$000():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (649856030 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (649856030 > 380432)
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
        public static /* synthetic */ void access$100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (649856030 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1526341443 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1526341443 > 380432)
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
        public static /* synthetic */ void access$1000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1526341443 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (219526565 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (219526565 > 380432)
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
        public static /* synthetic */ void access$1100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (219526565 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1100(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2084158742 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2084158742 > 380432)
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
        public static /* synthetic */ void access$1200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2084158742 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-987924396 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-987924396 < 0)
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
        public static /* synthetic */ void access$1300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-987924396 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-306112445 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-306112445 < 0)
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
        public static /* synthetic */ void access$1400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-306112445 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1156814119 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1156814119 < 0)
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
        public static /* synthetic */ void access$1500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1156814119 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1898470419 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1898470419 > 380432)
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
        public static /* synthetic */ void access$1600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1898470419 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-589779253 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-589779253 < 0)
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
        public static /* synthetic */ void access$1700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-589779253 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-190962174 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-190962174 < 0)
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
        public static /* synthetic */ void access$1800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-190962174 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1053183074 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1053183074 > 380432)
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
        public static /* synthetic */ void access$1900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1053183074 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$1900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2101747647 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2101747647 < 0)
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
        public static /* synthetic */ void access$200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2101747647 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$200(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1661501782 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$2000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1661501782 > 380432)
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
        public static /* synthetic */ void access$2000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1661501782 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$2000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$2000(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1919931096 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1919931096 > 380432)
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
        public static /* synthetic */ void access$300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1919931096 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$300(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (946039198 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (946039198 > 380432)
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
        public static /* synthetic */ void access$400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (946039198 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$400(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (384233440 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (384233440 > 380432)
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
        public static /* synthetic */ void access$500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (384233440 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$500(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-563056962 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-563056962 < 0)
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
        public static /* synthetic */ void access$600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-563056962 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$600(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2047753002 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2047753002 > 380432)
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
        public static /* synthetic */ void access$700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2047753002 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$700(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1152206958 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1152206958 > 380432)
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
        public static /* synthetic */ void access$800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1152206958 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$800(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1079796710 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1079796710 < 0)
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
        public static /* synthetic */ void access$900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0, boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1079796710 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.access$900(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (302478174 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearBluetooth():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (302478174 > 380432)
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
        private void clearBluetooth() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (302478174 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearBluetooth():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearBluetooth():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (772291117 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearCellular():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (772291117 > 380432)
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
        private void clearCellular() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (772291117 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearCellular():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearCellular():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1912590122 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearEthernet():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1912590122 < 0)
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
        private void clearEthernet() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1912590122 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearEthernet():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearEthernet():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (203402330 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearLowpan():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (203402330 > 380432)
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
        private void clearLowpan() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (203402330 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearLowpan():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearLowpan():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1663817365 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearSatellite():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1663817365 < 0)
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
        private void clearSatellite() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1663817365 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearSatellite():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearSatellite():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1007523142 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearThread():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1007523142 < 0)
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
        private void clearThread() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1007523142 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearThread():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearThread():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1246106234 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearUsb():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1246106234 > 380432)
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
        private void clearUsb() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1246106234 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearUsb():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearUsb():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1444801406 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearVpn():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1444801406 < 0)
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
        private void clearVpn() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1444801406 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearVpn():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearVpn():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-497965210 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearWifi():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-497965210 < 0)
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
        private void clearWifi() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-497965210 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearWifi():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearWifi():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1245986742 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearWifiAware():void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1245986742 < 0)
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
        private void clearWifiAware() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1245986742 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearWifiAware():void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.clearWifiAware():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2064734787 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2064734787 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getDefaultInstance() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2064734787 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1660692986 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1660692986 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1660692986 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1909641170 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1909641170 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports r0) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1909641170 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (709256585 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (709256585 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseDelimitedFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (709256585 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseDelimitedFrom(java.io.InputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-317096389 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-317096389 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseDelimitedFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-317096389 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseDelimitedFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1164173273 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1164173273 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.ByteString r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1164173273 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.ByteString):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1292852106 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1292852106 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.ByteString r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1292852106 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1750446384 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1750446384 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.CodedInputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1750446384 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.CodedInputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1759976066 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1759976066 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.CodedInputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1759976066 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-160411302 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.io.InputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-160411302 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.io.InputStream r0) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-160411302 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.io.InputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.io.InputStream):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1254824208 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1254824208 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.io.InputStream r0, com.google.protobuf.ExtensionRegistryLite r1) throws java.io.IOException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1254824208 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.io.InputStream, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-337728706 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-337728706 < 0)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.nio.ByteBuffer r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-337728706 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.nio.ByteBuffer):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1564517916 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1564517916 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.nio.ByteBuffer r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1564517916 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1401924512 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(byte[]):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1401924512 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(byte[] r0) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1401924512 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(byte[]):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(byte[]):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1736101904 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1736101904 > 380432)
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
        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(byte[] r0, com.google.protobuf.ExtensionRegistryLite r1) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1736101904 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parseFrom(byte[], com.google.protobuf.ExtensionRegistryLite):gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1321962462 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parser():com.google.protobuf.Parser<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports>, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1321962462 > 380432)
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
        public static com.google.protobuf.Parser<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports> parser() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1321962462 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parser():com.google.protobuf.Parser<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports>, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.parser():com.google.protobuf.Parser");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-586315926 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setBluetooth(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-586315926 < 0)
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
        private void setBluetooth(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-586315926 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setBluetooth(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setBluetooth(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-821045390 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setCellular(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-821045390 < 0)
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
        private void setCellular(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-821045390 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setCellular(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setCellular(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1562583968 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setEthernet(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1562583968 < 0)
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
        private void setEthernet(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1562583968 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setEthernet(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setEthernet(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2066326788 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setLowpan(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2066326788 < 0)
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
        private void setLowpan(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2066326788 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setLowpan(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setLowpan(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1851584124 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setSatellite(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1851584124 < 0)
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
        private void setSatellite(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1851584124 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setSatellite(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setSatellite(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (149834792 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setThread(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (149834792 > 380432)
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
        private void setThread(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (149834792 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setThread(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setThread(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (600107288 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setUsb(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (600107288 > 380432)
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
        private void setUsb(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (600107288 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setUsb(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setUsb(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1774906786 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setVpn(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1774906786 < 0)
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
        private void setVpn(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1774906786 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setVpn(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setVpn(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (235611984 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setWifi(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (235611984 > 380432)
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
        private void setWifi(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (235611984 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setWifi(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setWifi(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1439461721 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setWifiAware(boolean):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1439461721 > 380432)
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
        private void setWifiAware(boolean r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1439461721 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setWifiAware(boolean):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.setWifiAware(boolean):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1101471587 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1101471587 > 380432)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1101471587 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (689016518 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getBluetooth():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (689016518 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getBluetooth() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (689016518 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getBluetooth():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getBluetooth():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-38956638 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getCellular():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-38956638 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getCellular() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-38956638 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getCellular():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getCellular():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1307870665 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getEthernet():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1307870665 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getEthernet() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1307870665 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getEthernet():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getEthernet():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-838248458 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getLowpan():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-838248458 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getLowpan() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-838248458 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getLowpan():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getLowpan():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-6085740 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getSatellite():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-6085740 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getSatellite() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-6085740 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getSatellite():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getSatellite():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1968616727 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getThread():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1968616727 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getThread() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1968616727 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getThread():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getThread():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-787890472 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getUsb():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-787890472 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getUsb() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-787890472 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getUsb():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getUsb():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (478529402 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getVpn():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (478529402 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getVpn() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (478529402 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getVpn():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getVpn():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1327486664 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getWifi():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1327486664 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifi() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1327486664 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getWifi():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getWifi():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-141523135 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getWifiAware():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-141523135 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifiAware() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-141523135 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getWifiAware():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getWifiAware():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (878951578 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasBluetooth():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (878951578 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasBluetooth() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (878951578 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasBluetooth():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasBluetooth():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-18978000 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasCellular():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-18978000 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasCellular() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-18978000 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasCellular():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasCellular():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (511893578 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasEthernet():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (511893578 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasEthernet() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (511893578 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasEthernet():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasEthernet():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1228569862 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasLowpan():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1228569862 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasLowpan() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1228569862 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasLowpan():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasLowpan():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1046877511 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasSatellite():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1046877511 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasSatellite() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1046877511 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasSatellite():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasSatellite():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1438705078 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasThread():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1438705078 > 380432)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasThread() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1438705078 > 380432) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasThread():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasThread():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-561754761 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasUsb():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-561754761 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasUsb() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-561754761 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasUsb():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasUsb():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-355605570 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasVpn():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-355605570 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasVpn() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-355605570 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasVpn():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasVpn():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1479557777 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasWifi():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1479557777 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifi() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1479557777 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasWifi():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasWifi():boolean");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2016040446 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasWifiAware():boolean, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2016040446 < 0)
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
        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifiAware() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2016040446 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasWifiAware():boolean, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.hasWifiAware():boolean");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes50.dex */
    public interface NetworkCapabilityTransportsOrBuilder extends MessageLiteOrBuilder {
        boolean getBluetooth();

        boolean getCellular();

        boolean getEthernet();

        boolean getLowpan();

        boolean getSatellite();

        boolean getThread();

        boolean getUsb();

        boolean getVpn();

        boolean getWifi();

        boolean getWifiAware();

        boolean hasBluetooth();

        boolean hasCellular();

        boolean hasEthernet();

        boolean hasLowpan();

        boolean hasSatellite();

        boolean hasThread();

        boolean hasUsb();

        boolean hasVpn();

        boolean hasWifi();

        boolean hasWifiAware();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1367718494 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.<init>():void, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1367718494 < 0)
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
    private NetworkCapabilityTransportsOuterClass() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1367718494 < 0) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.<init>():void, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1427959305 > 368904) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes17.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1427959305 > 368904)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1427959305 > 368904) in method: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void, file: classes17.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.registerAllExtensions(com.google.protobuf.ExtensionRegistryLite):void");
    }
}

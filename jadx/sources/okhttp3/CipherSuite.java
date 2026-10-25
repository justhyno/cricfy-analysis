package okhttp3;

import java.util.Comparator;
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
/* loaded from: classes47.dex */
public final class CipherSuite {
    public static final Companion Companion = null;
    private static final Map<String, CipherSuite> INSTANCES = null;
    private static final Comparator<String> ORDER_BY_NAME = null;
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256 = null;
    public static final CipherSuite TLS_AES_128_CCM_SHA256 = null;
    public static final CipherSuite TLS_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256 = null;
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = null;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = null;
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = null;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = null;
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = null;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = null;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = null;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = null;
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = null;
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = null;
    public static final CipherSuite TLS_FALLBACK_SCSV = null;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = null;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = null;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = null;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = null;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = null;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = null;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = null;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = null;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = null;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = null;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5 = null;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256 = null;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5 = null;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA = null;
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = null;
    private final String javaName;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes16.dex */
    public static final class Companion {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-681458818 < 0) in method: okhttp3.CipherSuite.Companion.<init>():void, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-681458818 < 0)
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
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-681458818 < 0) in method: okhttp3.CipherSuite.Companion.<init>():void, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-700900378 < 0) in method: okhttp3.CipherSuite.Companion.<init>(bd0):void, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-700900378 < 0)
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
        public /* synthetic */ Companion(p000.bd0 r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-700900378 < 0) in method: okhttp3.CipherSuite.Companion.<init>(bd0):void, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.<init>(bd0):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (972669846 > 492760) in method: okhttp3.CipherSuite.Companion.access$init(okhttp3.CipherSuite$Companion, java.lang.String, int):okhttp3.CipherSuite, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (972669846 > 492760)
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
        public static final /* synthetic */ okhttp3.CipherSuite access$init(okhttp3.CipherSuite.Companion r0, java.lang.String r1, int r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (972669846 > 492760) in method: okhttp3.CipherSuite.Companion.access$init(okhttp3.CipherSuite$Companion, java.lang.String, int):okhttp3.CipherSuite, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.access$init(okhttp3.CipherSuite$Companion, java.lang.String, int):okhttp3.CipherSuite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (846726154 > 492760) in method: okhttp3.CipherSuite.Companion.init(java.lang.String, int):okhttp3.CipherSuite, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (846726154 > 492760)
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
        private final okhttp3.CipherSuite init(java.lang.String r1, int r2) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (846726154 > 492760) in method: okhttp3.CipherSuite.Companion.init(java.lang.String, int):okhttp3.CipherSuite, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.init(java.lang.String, int):okhttp3.CipherSuite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (174724642 > 492760) in method: okhttp3.CipherSuite.Companion.secondaryName(java.lang.String):java.lang.String, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (174724642 > 492760)
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
        private final java.lang.String secondaryName(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (174724642 > 492760) in method: okhttp3.CipherSuite.Companion.secondaryName(java.lang.String):java.lang.String, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.secondaryName(java.lang.String):java.lang.String");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-699156970 < 0) in method: okhttp3.CipherSuite.Companion.forJavaName(java.lang.String):okhttp3.CipherSuite, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-699156970 < 0)
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
        public final synchronized okhttp3.CipherSuite forJavaName(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-699156970 < 0) in method: okhttp3.CipherSuite.Companion.forJavaName(java.lang.String):okhttp3.CipherSuite, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.forJavaName(java.lang.String):okhttp3.CipherSuite");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1216790473 > 492760) in method: okhttp3.CipherSuite.Companion.getORDER_BY_NAME$okhttp():java.util.Comparator<java.lang.String>, file: classes16.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1216790473 > 492760)
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
        public final java.util.Comparator<java.lang.String> getORDER_BY_NAME$okhttp() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1216790473 > 492760) in method: okhttp3.CipherSuite.Companion.getORDER_BY_NAME$okhttp():java.util.Comparator<java.lang.String>, file: classes16.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.Companion.getORDER_BY_NAME$okhttp():java.util.Comparator");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1992732776 > 346160) in method: okhttp3.CipherSuite.<clinit>():void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1992732776 > 346160)
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
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1992732776 > 346160) in method: okhttp3.CipherSuite.<clinit>():void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.<clinit>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (564096491 > 346160) in method: okhttp3.CipherSuite.<init>(java.lang.String):void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (564096491 > 346160)
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
    private CipherSuite(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (564096491 > 346160) in method: okhttp3.CipherSuite.<init>(java.lang.String):void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.<init>(java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1715974858 > 346160) in method: okhttp3.CipherSuite.<init>(java.lang.String, bd0):void, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1715974858 > 346160)
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
    public /* synthetic */ CipherSuite(java.lang.String r1, p000.bd0 r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1715974858 > 346160) in method: okhttp3.CipherSuite.<init>(java.lang.String, bd0):void, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.<init>(java.lang.String, bd0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1262330258 < 0) in method: okhttp3.CipherSuite.access$getINSTANCES$cp():java.util.Map, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1262330258 < 0)
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
    public static final /* synthetic */ java.util.Map access$getINSTANCES$cp() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1262330258 < 0) in method: okhttp3.CipherSuite.access$getINSTANCES$cp():java.util.Map, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.access$getINSTANCES$cp():java.util.Map");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1912222878 > 346160) in method: okhttp3.CipherSuite.access$getORDER_BY_NAME$cp():java.util.Comparator, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1912222878 > 346160)
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
    public static final /* synthetic */ java.util.Comparator access$getORDER_BY_NAME$cp() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1912222878 > 346160) in method: okhttp3.CipherSuite.access$getORDER_BY_NAME$cp():java.util.Comparator, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.access$getORDER_BY_NAME$cp():java.util.Comparator");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1881049252 > 346160) in method: okhttp3.CipherSuite.forJavaName(java.lang.String):okhttp3.CipherSuite, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1881049252 > 346160)
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
    public static final synchronized okhttp3.CipherSuite forJavaName(java.lang.String r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1881049252 > 346160) in method: okhttp3.CipherSuite.forJavaName(java.lang.String):okhttp3.CipherSuite, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.forJavaName(java.lang.String):okhttp3.CipherSuite");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-569477648 < 0) in method: okhttp3.CipherSuite.-deprecated_javaName():java.lang.String, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-569477648 < 0)
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
    /* renamed from: -deprecated_javaName */
    public final java.lang.String m11736deprecated_javaName() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-569477648 < 0) in method: okhttp3.CipherSuite.-deprecated_javaName():java.lang.String, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.m11736deprecated_javaName():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1721133106 < 0) in method: okhttp3.CipherSuite.javaName():java.lang.String, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1721133106 < 0)
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
    public final java.lang.String javaName() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1721133106 < 0) in method: okhttp3.CipherSuite.javaName():java.lang.String, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.javaName():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1443226090 > 346160) in method: okhttp3.CipherSuite.toString():java.lang.String, file: classes47.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1443226090 > 346160)
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
    public java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1443226090 > 346160) in method: okhttp3.CipherSuite.toString():java.lang.String, file: classes47.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.toString():java.lang.String");
    }
}

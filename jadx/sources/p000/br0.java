package p000;

import android.content.res.AssetManager;
import android.util.Log;
import com.sun.jna.Function;
import java.io.FileDescriptor;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes22.dex */
public final class br0 {

    /* renamed from: D */
    public static final String[] f2537D;

    /* renamed from: E */
    public static final int[] f2538E;

    /* renamed from: F */
    public static final byte[] f2539F;

    /* renamed from: G */
    public static final yq0 f2540G;

    /* renamed from: H */
    public static final yq0[][] f2541H;

    /* renamed from: I */
    public static final yq0[] f2542I;

    /* renamed from: J */
    public static final HashMap[] f2543J;

    /* renamed from: K */
    public static final HashMap[] f2544K;

    /* renamed from: L */
    public static final HashSet f2545L;

    /* renamed from: M */
    public static final HashMap f2546M;

    /* renamed from: N */
    public static final Charset f2547N;

    /* renamed from: O */
    public static final byte[] f2548O;

    /* renamed from: P */
    public static final byte[] f2549P;

    /* renamed from: a */
    public final FileDescriptor f2565a;

    /* renamed from: b */
    public final AssetManager.AssetInputStream f2566b;

    /* renamed from: c */
    public int f2567c;

    /* renamed from: d */
    public final HashMap[] f2568d;

    /* renamed from: e */
    public final HashSet f2569e;

    /* renamed from: f */
    public ByteOrder f2570f;

    /* renamed from: g */
    public boolean f2571g;

    /* renamed from: h */
    public int f2572h;

    /* renamed from: i */
    public int f2573i;

    /* renamed from: j */
    public int f2574j;

    /* renamed from: k */
    public int f2575k;

    /* renamed from: l */
    public static final boolean f2550l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m */
    public static final List f2551m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n */
    public static final List f2552n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o */
    public static final int[] f2553o = {8, 8, 8};

    /* renamed from: p */
    public static final int[] f2554p = {8};

    /* renamed from: q */
    public static final byte[] f2555q = {-1, -40, -1};

    /* renamed from: r */
    public static final byte[] f2556r = {102, 116, 121, 112};

    /* renamed from: s */
    public static final byte[] f2557s = {109, 105, 102, 49};

    /* renamed from: t */
    public static final byte[] f2558t = {104, 101, 105, 99};

    /* renamed from: u */
    public static final byte[] f2559u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v */
    public static final byte[] f2560v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w */
    public static final byte[] f2561w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x */
    public static final byte[] f2562x = {101, 88, 73, 102};

    /* renamed from: y */
    public static final byte[] f2563y = {73, 72, 68, 82};

    /* renamed from: z */
    public static final byte[] f2564z = {73, 69, 78, 68};

    /* renamed from: A */
    public static final byte[] f2534A = {82, 73, 70, 70};

    /* renamed from: B */
    public static final byte[] f2535B = {87, 69, 66, 80};

    /* renamed from: C */
    public static final byte[] f2536C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f2537D = new String[]{_UrlKt.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f2538E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2539F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        yq0[] yq0VarArr = {new yq0("NewSubfileType", 254, 4), new yq0("SubfileType", Function.USE_VARARGS, 4), new yq0(Function.MAX_NARGS, 3, 4, "ImageWidth"), new yq0(257, 3, 4, "ImageLength"), new yq0("BitsPerSample", 258, 3), new yq0("Compression", 259, 3), new yq0("PhotometricInterpretation", 262, 3), new yq0("ImageDescription", 270, 2), new yq0("Make", 271, 2), new yq0("Model", 272, 2), new yq0(273, 3, 4, "StripOffsets"), new yq0("Orientation", 274, 3), new yq0("SamplesPerPixel", 277, 3), new yq0(278, 3, 4, "RowsPerStrip"), new yq0(279, 3, 4, "StripByteCounts"), new yq0("XResolution", 282, 5), new yq0("YResolution", 283, 5), new yq0("PlanarConfiguration", 284, 3), new yq0("ResolutionUnit", 296, 3), new yq0("TransferFunction", 301, 3), new yq0("Software", 305, 2), new yq0("DateTime", 306, 2), new yq0("Artist", 315, 2), new yq0("WhitePoint", 318, 5), new yq0("PrimaryChromaticities", 319, 5), new yq0("SubIFDPointer", 330, 4), new yq0("JPEGInterchangeFormat", 513, 4), new yq0("JPEGInterchangeFormatLength", 514, 4), new yq0("YCbCrCoefficients", 529, 5), new yq0("YCbCrSubSampling", 530, 3), new yq0("YCbCrPositioning", 531, 3), new yq0("ReferenceBlackWhite", 532, 5), new yq0("Copyright", 33432, 2), new yq0("ExifIFDPointer", 34665, 4), new yq0("GPSInfoIFDPointer", 34853, 4), new yq0("SensorTopBorder", 4, 4), new yq0("SensorLeftBorder", 5, 4), new yq0("SensorBottomBorder", 6, 4), new yq0("SensorRightBorder", 7, 4), new yq0("ISO", 23, 3), new yq0("JpgFromRaw", 46, 7), new yq0("Xmp", 700, 1)};
        yq0[] yq0VarArr2 = {new yq0("ExposureTime", 33434, 5), new yq0("FNumber", 33437, 5), new yq0("ExposureProgram", 34850, 3), new yq0("SpectralSensitivity", 34852, 2), new yq0("PhotographicSensitivity", 34855, 3), new yq0("OECF", 34856, 7), new yq0("SensitivityType", 34864, 3), new yq0("StandardOutputSensitivity", 34865, 4), new yq0("RecommendedExposureIndex", 34866, 4), new yq0("ISOSpeed", 34867, 4), new yq0("ISOSpeedLatitudeyyy", 34868, 4), new yq0("ISOSpeedLatitudezzz", 34869, 4), new yq0("ExifVersion", 36864, 2), new yq0("DateTimeOriginal", 36867, 2), new yq0("DateTimeDigitized", 36868, 2), new yq0("OffsetTime", 36880, 2), new yq0("OffsetTimeOriginal", 36881, 2), new yq0("OffsetTimeDigitized", 36882, 2), new yq0("ComponentsConfiguration", 37121, 7), new yq0("CompressedBitsPerPixel", 37122, 5), new yq0("ShutterSpeedValue", 37377, 10), new yq0("ApertureValue", 37378, 5), new yq0("BrightnessValue", 37379, 10), new yq0("ExposureBiasValue", 37380, 10), new yq0("MaxApertureValue", 37381, 5), new yq0("SubjectDistance", 37382, 5), new yq0("MeteringMode", 37383, 3), new yq0("LightSource", 37384, 3), new yq0("Flash", 37385, 3), new yq0("FocalLength", 37386, 5), new yq0("SubjectArea", 37396, 3), new yq0("MakerNote", 37500, 7), new yq0("UserComment", 37510, 7), new yq0("SubSecTime", 37520, 2), new yq0("SubSecTimeOriginal", 37521, 2), new yq0("SubSecTimeDigitized", 37522, 2), new yq0("FlashpixVersion", 40960, 7), new yq0("ColorSpace", 40961, 3), new yq0(40962, 3, 4, "PixelXDimension"), new yq0(40963, 3, 4, "PixelYDimension"), new yq0("RelatedSoundFile", 40964, 2), new yq0("InteroperabilityIFDPointer", 40965, 4), new yq0("FlashEnergy", 41483, 5), new yq0("SpatialFrequencyResponse", 41484, 7), new yq0("FocalPlaneXResolution", 41486, 5), new yq0("FocalPlaneYResolution", 41487, 5), new yq0("FocalPlaneResolutionUnit", 41488, 3), new yq0("SubjectLocation", 41492, 3), new yq0("ExposureIndex", 41493, 5), new yq0("SensingMethod", 41495, 3), new yq0("FileSource", 41728, 7), new yq0("SceneType", 41729, 7), new yq0("CFAPattern", 41730, 7), new yq0("CustomRendered", 41985, 3), new yq0("ExposureMode", 41986, 3), new yq0("WhiteBalance", 41987, 3), new yq0("DigitalZoomRatio", 41988, 5), new yq0("FocalLengthIn35mmFilm", 41989, 3), new yq0("SceneCaptureType", 41990, 3), new yq0("GainControl", 41991, 3), new yq0("Contrast", 41992, 3), new yq0("Saturation", 41993, 3), new yq0("Sharpness", 41994, 3), new yq0("DeviceSettingDescription", 41995, 7), new yq0("SubjectDistanceRange", 41996, 3), new yq0("ImageUniqueID", 42016, 2), new yq0("CameraOwnerName", 42032, 2), new yq0("BodySerialNumber", 42033, 2), new yq0("LensSpecification", 42034, 5), new yq0("LensMake", 42035, 2), new yq0("LensModel", 42036, 2), new yq0("Gamma", 42240, 5), new yq0("DNGVersion", 50706, 1), new yq0(50720, 3, 4, "DefaultCropSize")};
        yq0[] yq0VarArr3 = {new yq0("GPSVersionID", 0, 1), new yq0("GPSLatitudeRef", 1, 2), new yq0(2, 5, 10, "GPSLatitude"), new yq0("GPSLongitudeRef", 3, 2), new yq0(4, 5, 10, "GPSLongitude"), new yq0("GPSAltitudeRef", 5, 1), new yq0("GPSAltitude", 6, 5), new yq0("GPSTimeStamp", 7, 5), new yq0("GPSSatellites", 8, 2), new yq0("GPSStatus", 9, 2), new yq0("GPSMeasureMode", 10, 2), new yq0("GPSDOP", 11, 5), new yq0("GPSSpeedRef", 12, 2), new yq0("GPSSpeed", 13, 5), new yq0("GPSTrackRef", 14, 2), new yq0("GPSTrack", 15, 5), new yq0("GPSImgDirectionRef", 16, 2), new yq0("GPSImgDirection", 17, 5), new yq0("GPSMapDatum", 18, 2), new yq0("GPSDestLatitudeRef", 19, 2), new yq0("GPSDestLatitude", 20, 5), new yq0("GPSDestLongitudeRef", 21, 2), new yq0("GPSDestLongitude", 22, 5), new yq0("GPSDestBearingRef", 23, 2), new yq0("GPSDestBearing", 24, 5), new yq0("GPSDestDistanceRef", 25, 2), new yq0("GPSDestDistance", 26, 5), new yq0("GPSProcessingMethod", 27, 7), new yq0("GPSAreaInformation", 28, 7), new yq0("GPSDateStamp", 29, 2), new yq0("GPSDifferential", 30, 3), new yq0("GPSHPositioningError", 31, 5)};
        yq0[] yq0VarArr4 = {new yq0("InteroperabilityIndex", 1, 2)};
        yq0[] yq0VarArr5 = {new yq0("NewSubfileType", 254, 4), new yq0("SubfileType", Function.USE_VARARGS, 4), new yq0(Function.MAX_NARGS, 3, 4, "ThumbnailImageWidth"), new yq0(257, 3, 4, "ThumbnailImageLength"), new yq0("BitsPerSample", 258, 3), new yq0("Compression", 259, 3), new yq0("PhotometricInterpretation", 262, 3), new yq0("ImageDescription", 270, 2), new yq0("Make", 271, 2), new yq0("Model", 272, 2), new yq0(273, 3, 4, "StripOffsets"), new yq0("ThumbnailOrientation", 274, 3), new yq0("SamplesPerPixel", 277, 3), new yq0(278, 3, 4, "RowsPerStrip"), new yq0(279, 3, 4, "StripByteCounts"), new yq0("XResolution", 282, 5), new yq0("YResolution", 283, 5), new yq0("PlanarConfiguration", 284, 3), new yq0("ResolutionUnit", 296, 3), new yq0("TransferFunction", 301, 3), new yq0("Software", 305, 2), new yq0("DateTime", 306, 2), new yq0("Artist", 315, 2), new yq0("WhitePoint", 318, 5), new yq0("PrimaryChromaticities", 319, 5), new yq0("SubIFDPointer", 330, 4), new yq0("JPEGInterchangeFormat", 513, 4), new yq0("JPEGInterchangeFormatLength", 514, 4), new yq0("YCbCrCoefficients", 529, 5), new yq0("YCbCrSubSampling", 530, 3), new yq0("YCbCrPositioning", 531, 3), new yq0("ReferenceBlackWhite", 532, 5), new yq0("Copyright", 33432, 2), new yq0("ExifIFDPointer", 34665, 4), new yq0("GPSInfoIFDPointer", 34853, 4), new yq0("DNGVersion", 50706, 1), new yq0(50720, 3, 4, "DefaultCropSize")};
        f2540G = new yq0("StripOffsets", 273, 3);
        f2541H = new yq0[][]{yq0VarArr, yq0VarArr2, yq0VarArr3, yq0VarArr4, yq0VarArr5, yq0VarArr, new yq0[]{new yq0("ThumbnailImage", Function.MAX_NARGS, 7), new yq0("CameraSettingsIFDPointer", 8224, 4), new yq0("ImageProcessingIFDPointer", 8256, 4)}, new yq0[]{new yq0("PreviewImageStart", 257, 4), new yq0("PreviewImageLength", 258, 4)}, new yq0[]{new yq0("AspectFrame", 4371, 3)}, new yq0[]{new yq0("ColorSpace", 55, 3)}};
        f2542I = new yq0[]{new yq0("SubIFDPointer", 330, 4), new yq0("ExifIFDPointer", 34665, 4), new yq0("GPSInfoIFDPointer", 34853, 4), new yq0("InteroperabilityIFDPointer", 40965, 4), new yq0("CameraSettingsIFDPointer", 8224, 1), new yq0("ImageProcessingIFDPointer", 8256, 1)};
        f2543J = new HashMap[10];
        f2544K = new HashMap[10];
        f2545L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2546M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f2547N = forName;
        f2548O = "Exif\u0000\u0000".getBytes(forName);
        f2549P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            yq0[][] yq0VarArr6 = f2541H;
            if (i >= yq0VarArr6.length) {
                HashMap hashMap = f2546M;
                yq0[] yq0VarArr7 = f2542I;
                hashMap.put(Integer.valueOf(yq0VarArr7[0].f23191a), 5);
                hashMap.put(Integer.valueOf(yq0VarArr7[1].f23191a), 1);
                hashMap.put(Integer.valueOf(yq0VarArr7[2].f23191a), 2);
                hashMap.put(Integer.valueOf(yq0VarArr7[3].f23191a), 3);
                hashMap.put(Integer.valueOf(yq0VarArr7[4].f23191a), 7);
                hashMap.put(Integer.valueOf(yq0VarArr7[5].f23191a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2543J[i] = new HashMap();
            f2544K[i] = new HashMap();
            for (yq0 yq0Var : yq0VarArr6[i]) {
                f2543J[i].put(Integer.valueOf(yq0Var.f23191a), yq0Var);
                f2544K[i].put(yq0Var.f23192b, yq0Var);
            }
            i++;
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2132162882 < 0) in method: br0.<init>(java.io.InputStream):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2132162882 < 0)
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
    public br0(java.io.InputStream r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2132162882 < 0) in method: br0.<init>(java.io.InputStream):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.<init>(java.io.InputStream):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-997388162 < 0) in method: br0.q(wq0):java.nio.ByteOrder, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-997388162 < 0)
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
    /* renamed from: q */
    public static java.nio.ByteOrder m1613q(p000.wq0 r0) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-997388162 < 0) in method: br0.q(wq0):java.nio.ByteOrder, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1613q(wq0):java.nio.ByteOrder");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-342963557 < 0) in method: br0.a():void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-342963557 < 0)
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
    /* renamed from: a */
    public final void m1614a() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-342963557 < 0) in method: br0.a():void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1614a():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1451073118 < 0) in method: br0.b(java.lang.String):java.lang.String, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1451073118 < 0)
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
    /* renamed from: b */
    public final java.lang.String m1615b(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1451073118 < 0) in method: br0.b(java.lang.String):java.lang.String, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1615b(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1281577854 > 384920) in method: br0.c(java.lang.String):xq0, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1281577854 > 384920)
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
    /* renamed from: c */
    public final p000.xq0 m1616c(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1281577854 > 384920) in method: br0.c(java.lang.String):xq0, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1616c(java.lang.String):xq0");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (230866447 > 384920) in method: br0.d(ar0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (230866447 > 384920)
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
    /* renamed from: d */
    public final void m1617d(p000.ar0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (230866447 > 384920) in method: br0.d(ar0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1617d(ar0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1747251778 < 0) in method: br0.e(wq0, int, int):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1747251778 < 0)
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
    /* renamed from: e */
    public final void m1618e(p000.wq0 r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1747251778 < 0) in method: br0.e(wq0, int, int):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1618e(wq0, int, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1615270146 > 384920) in method: br0.f(java.io.BufferedInputStream):int, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1615270146 > 384920)
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
    /* renamed from: f */
    public final int m1619f(java.io.BufferedInputStream r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1615270146 > 384920) in method: br0.f(java.io.BufferedInputStream):int, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1619f(java.io.BufferedInputStream):int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-644460162 < 0) in method: br0.g(ar0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-644460162 < 0)
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
    /* renamed from: g */
    public final void m1620g(p000.ar0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-644460162 < 0) in method: br0.g(ar0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1620g(ar0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1120571558 > 384920) in method: br0.h(wq0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1120571558 > 384920)
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
    /* renamed from: h */
    public final void m1621h(p000.wq0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1120571558 > 384920) in method: br0.h(wq0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1621h(wq0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1157510014 < 0) in method: br0.i(wq0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1157510014 < 0)
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
    /* renamed from: i */
    public final void m1622i(p000.wq0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1157510014 < 0) in method: br0.i(wq0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1622i(wq0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (324067706 > 384920) in method: br0.j(ar0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (324067706 > 384920)
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
    /* renamed from: j */
    public final void m1623j(p000.ar0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (324067706 > 384920) in method: br0.j(ar0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1623j(ar0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1404294018 < 0) in method: br0.k(ar0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1404294018 < 0)
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
    /* renamed from: k */
    public final void m1624k(p000.ar0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1404294018 < 0) in method: br0.k(ar0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1624k(ar0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2068839872 > 384920) in method: br0.l(wq0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2068839872 > 384920)
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
    /* renamed from: l */
    public final void m1625l(p000.wq0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2068839872 > 384920) in method: br0.l(wq0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1625l(wq0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-30899478 < 0) in method: br0.m(wq0, java.util.HashMap):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-30899478 < 0)
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
    /* renamed from: m */
    public final void m1626m(p000.wq0 r1, java.util.HashMap r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-30899478 < 0) in method: br0.m(wq0, java.util.HashMap):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1626m(wq0, java.util.HashMap):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-260550517 < 0) in method: br0.n(java.util.HashMap):boolean, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-260550517 < 0)
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
    /* renamed from: n */
    public final boolean m1627n(java.util.HashMap r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-260550517 < 0) in method: br0.n(java.util.HashMap):boolean, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1627n(java.util.HashMap):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-944515142 < 0) in method: br0.o(ar0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-944515142 < 0)
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
    /* renamed from: o */
    public final void m1628o(p000.ar0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-944515142 < 0) in method: br0.o(ar0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1628o(ar0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1607489689 > 384920) in method: br0.p():void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1607489689 > 384920)
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
    /* renamed from: p */
    public final void m1629p() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1607489689 > 384920) in method: br0.p():void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1629p():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (630205224 > 384920) in method: br0.r(int, byte[]):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (630205224 > 384920)
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
    /* renamed from: r */
    public final void m1630r(int r1, byte[] r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (630205224 > 384920) in method: br0.r(int, byte[]):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1630r(int, byte[]):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (361002001 > 384920) in method: br0.s(ar0, int):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (361002001 > 384920)
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
    /* renamed from: s */
    public final void m1631s(p000.ar0 r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (361002001 > 384920) in method: br0.s(ar0, int):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1631s(ar0, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1329494656 < 0) in method: br0.t(int, java.lang.String, java.lang.String):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1329494656 < 0)
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
    /* renamed from: t */
    public final void m1632t(int r1, java.lang.String r2, java.lang.String r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1329494656 < 0) in method: br0.t(int, java.lang.String, java.lang.String):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1632t(int, java.lang.String, java.lang.String):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-67644799 < 0) in method: br0.u(wq0):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-67644799 < 0)
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
    /* renamed from: u */
    public final void m1633u(p000.wq0 r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-67644799 < 0) in method: br0.u(wq0):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1633u(wq0):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1287101882 < 0) in method: br0.v(int, int):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1287101882 < 0)
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
    /* renamed from: v */
    public final void m1634v(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1287101882 < 0) in method: br0.v(int, int):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1634v(int, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1719438446 < 0) in method: br0.w(ar0, int):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1719438446 < 0)
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
    /* renamed from: w */
    public final void m1635w(p000.ar0 r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1719438446 < 0) in method: br0.w(ar0, int):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1635w(ar0, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-532494322 < 0) in method: br0.x():void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-532494322 < 0)
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
    /* renamed from: x */
    public final void m1636x() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-532494322 < 0) in method: br0.x():void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br0.m1636x():void");
    }
}

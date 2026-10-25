package p000;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes30.dex */
public interface rp extends sd3, ReadableByteChannel {
    /* renamed from: B */
    long mo4803B();

    /* renamed from: E */
    String mo4805E(long j);

    /* renamed from: N */
    boolean mo4807N(long j, tq tqVar);

    /* renamed from: S */
    String mo4809S(Charset charset);

    /* renamed from: Y */
    tq mo4813Y();

    /* renamed from: Z */
    boolean mo4814Z(long j);

    /* renamed from: b */
    hp mo4816b();

    String b0();

    byte[] c0(long j);

    long f0(tu2 tu2Var);

    /* renamed from: h */
    String mo4817h(long j);

    void i0(long j);

    /* renamed from: k */
    tq mo4819k(long j);

    long m0();

    InputStream o0();

    void p0(hp hpVar, long j);

    uu2 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    /* renamed from: s */
    long mo4821s(long j, tq tqVar);

    void skip(long j);

    /* renamed from: t */
    byte[] mo4822t();

    /* renamed from: w */
    boolean mo4824w();

    /* renamed from: x */
    int mo4825x(aj2 aj2Var);
}

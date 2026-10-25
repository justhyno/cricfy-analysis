package p000;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes47.dex */
public interface qp extends mc3, WritableByteChannel {
    /* renamed from: A */
    qp mo4802A();

    /* renamed from: O */
    qp mo4808O(String str);

    /* renamed from: U */
    qp mo4810U(tq tqVar);

    /* renamed from: V */
    qp mo4811V(String str, int i, int i2);

    /* renamed from: W */
    qp mo4812W(long j);

    /* renamed from: b */
    hp mo4816b();

    @Override // p000.mc3, java.io.Flushable
    void flush();

    qp j0(long j);

    /* renamed from: o */
    qp mo4820o(int i);

    qp write(byte[] bArr);

    qp write(byte[] bArr, int i, int i2);

    qp writeByte(int i);

    qp writeInt(int i);

    qp writeShort(int i);

    /* renamed from: z */
    long mo4827z(sd3 sd3Var);
}

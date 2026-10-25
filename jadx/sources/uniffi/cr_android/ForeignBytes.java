package uniffi.cr_android;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
@Structure.FieldOrder({"len", "data"})
/* loaded from: classes7.dex */
public class ForeignBytes extends Structure {
    public Pointer data;
    public int len;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public static final class ByValue extends ForeignBytes implements Structure.ByValue {
    }
}

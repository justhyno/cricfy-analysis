package androidx.media3.exoplayer;

import androidx.media3.exoplayer.image.ImageOutput;
import p000.fm2;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes11.dex */
public interface ExoPlayer extends fm2 {
    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}

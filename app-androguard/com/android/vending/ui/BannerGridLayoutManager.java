package com.android.vending.ui;
public final class BannerGridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    public static final synthetic int S;
    public final androidx.recyclerview.widget.j Q;
    public final vk3 R;

    public BannerGridLayoutManager(android.content.Context p3, int p4, androidx.recyclerview.widget.j p5)
    {
        super(p3, p4);
        super.Q = p5;
        super.R = new vk3(new kl(p3, 0));
        if (p5 != null) {
            super.K = new ll(super, p4);
        }
        return;
    }

    public final void Y(android.view.View p5, int p6)
    {
        p5.getClass();
        if (((Boolean) this.R.getValue()).booleanValue()) {
            try {
                int v5_1 = androidx.recyclerview.widget.k.G(p5);
                int v0_1 = this.B();
                int v1 = this.F;
                int v2 = (v5_1 + v1);
            } catch (Exception v4_1) {
                v4_1.printStackTrace();
            }
            if ((p6 == 130) && ((v5_1 > v1) && (v2 < v0_1))) {
                this.r0(v2);
            }
        }
        return;
    }
}

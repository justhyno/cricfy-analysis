package com.cricfytv.sports.databinding;
public final class DialogQualityToggleBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final android.widget.LinearLayout b;
    public final android.widget.ImageView c;
    public final android.widget.LinearLayout d;
    public final android.widget.Spinner e;
    public final android.widget.ImageView f;
    public final android.widget.TextView g;
    public final androidx.appcompat.widget.SwitchCompat h;
    public final android.widget.TextView i;
    public final android.widget.TextView j;

    public DialogQualityToggleBinding(android.widget.LinearLayout p1, android.widget.LinearLayout p2, android.widget.ImageView p3, android.widget.LinearLayout p4, android.widget.Spinner p5, android.widget.ImageView p6, android.widget.TextView p7, androidx.appcompat.widget.SwitchCompat p8, android.widget.TextView p9, android.widget.TextView p10)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10;
        return;
    }

    public static com.cricfytv.sports.databinding.DialogQualityToggleBinding bind(android.view.View p13)
    {
        int v0_0 = 2131362015;
        android.widget.LinearLayout v4_1 = ((android.widget.LinearLayout) tg.m(p13, 2131362015));
        if (v4_1 != null) {
            v0_0 = 2131362016;
            android.widget.ImageView v5_0 = ((android.widget.ImageView) tg.m(p13, 2131362016));
            if (v5_0 != null) {
                v0_0 = 2131362040;
                android.widget.LinearLayout v6_1 = ((android.widget.LinearLayout) tg.m(p13, 2131362040));
                if (v6_1 != null) {
                    v0_0 = 2131362041;
                    android.widget.Spinner v7_1 = ((android.widget.Spinner) tg.m(p13, 2131362041));
                    if (v7_1 != null) {
                        v0_0 = 2131362257;
                        android.widget.ImageView v8_1 = ((android.widget.ImageView) tg.m(p13, 2131362257));
                        if (v8_1 != null) {
                            v0_0 = 2131362431;
                            android.widget.TextView v9_1 = ((android.widget.TextView) tg.m(p13, 2131362431));
                            if (v9_1 != null) {
                                v0_0 = 2131362684;
                                androidx.appcompat.widget.SwitchCompat v10_1 = ((androidx.appcompat.widget.SwitchCompat) tg.m(p13, 2131362684));
                                if (v10_1 != null) {
                                    v0_0 = 2131362748;
                                    android.widget.TextView v11_1 = ((android.widget.TextView) tg.m(p13, 2131362748));
                                    if (v11_1 != null) {
                                        v0_0 = 2131362752;
                                        android.widget.TextView v12_1 = ((android.widget.TextView) tg.m(p13, 2131362752));
                                        if (v12_1 != null) {
                                            return new com.cricfytv.sports.databinding.DialogQualityToggleBinding(((android.widget.LinearLayout) p13), v4_1, v5_0, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p13.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.DialogQualityToggleBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.DialogQualityToggleBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.DialogQualityToggleBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.DialogQualityToggleBinding v2_1 = p2.inflate(2131558468, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.DialogQualityToggleBinding.bind(v2_1);
    }
}

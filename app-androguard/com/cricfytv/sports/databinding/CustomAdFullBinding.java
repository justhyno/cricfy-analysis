package com.cricfytv.sports.databinding;
public final class CustomAdFullBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final android.widget.ImageView b;
    public final androidx.media3.ui.PlayerView c;
    public final android.widget.FrameLayout d;
    public final android.widget.FrameLayout e;
    public final android.widget.TextView f;

    public CustomAdFullBinding(androidx.constraintlayout.widget.ConstraintLayout p1, android.widget.ImageView p2, androidx.media3.ui.PlayerView p3, android.widget.FrameLayout p4, android.widget.FrameLayout p5, android.widget.TextView p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public static com.cricfytv.sports.databinding.CustomAdFullBinding bind(android.view.View p9)
    {
        int v0_0 = 2131361873;
        android.widget.ImageView v4_1 = ((android.widget.ImageView) tg.m(p9, 2131361873));
        if (v4_1 != null) {
            v0_0 = 2131361879;
            androidx.media3.ui.PlayerView v5_0 = ((androidx.media3.ui.PlayerView) tg.m(p9, 2131361879));
            if (v5_0 != null) {
                v0_0 = 2131362016;
                android.widget.FrameLayout v6_1 = ((android.widget.FrameLayout) tg.m(p9, 2131362016));
                if (v6_1 != null) {
                    v0_0 = 2131362631;
                    android.widget.FrameLayout v7_1 = ((android.widget.FrameLayout) tg.m(p9, 2131362631));
                    if (v7_1 != null) {
                        v0_0 = 2131362789;
                        android.widget.TextView v8_1 = ((android.widget.TextView) tg.m(p9, 2131362789));
                        if (v8_1 != null) {
                            return new com.cricfytv.sports.databinding.CustomAdFullBinding(((androidx.constraintlayout.widget.ConstraintLayout) p9), v4_1, v5_0, v6_1, v7_1, v8_1);
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p9.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.CustomAdFullBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.CustomAdFullBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.CustomAdFullBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.CustomAdFullBinding v2_1 = p2.inflate(2131558449, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.CustomAdFullBinding.bind(v2_1);
    }
}

package com.cricfytv.sports.databinding;
public final class PlaylistDetailsLyBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final android.widget.LinearLayout b;
    public final android.widget.ImageView c;
    public final android.widget.LinearLayout d;
    public final android.view.View e;
    public final com.google.android.material.textfield.TextInputLayout f;
    public final com.google.android.material.textfield.TextInputEditText g;
    public final android.widget.LinearLayout h;
    public final android.widget.TextView i;
    public final com.google.android.material.textfield.TextInputEditText j;
    public final android.widget.TextView k;

    public PlaylistDetailsLyBinding(androidx.constraintlayout.widget.ConstraintLayout p1, android.widget.LinearLayout p2, android.widget.ImageView p3, android.widget.LinearLayout p4, android.view.View p5, com.google.android.material.textfield.TextInputLayout p6, com.google.android.material.textfield.TextInputEditText p7, android.widget.LinearLayout p8, android.widget.TextView p9, com.google.android.material.textfield.TextInputEditText p10, android.widget.TextView p11)
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
        this.k = p11;
        return;
    }

    public static com.cricfytv.sports.databinding.PlaylistDetailsLyBinding bind(android.view.View p14)
    {
        int v0_0 = 2131361963;
        if (((android.widget.LinearLayout) tg.m(p14, 2131361963)) != null) {
            v0_0 = 2131361968;
            android.widget.LinearLayout v4_1 = ((android.widget.LinearLayout) tg.m(p14, 2131361968));
            if (v4_1 != null) {
                v0_0 = 2131362016;
                android.widget.ImageView v5_1 = ((android.widget.ImageView) tg.m(p14, 2131362016));
                if (v5_1 != null) {
                    v0_0 = 2131362065;
                    android.widget.LinearLayout v6_1 = ((android.widget.LinearLayout) tg.m(p14, 2131362065));
                    if (v6_1 != null) {
                        v0_0 = 2131362085;
                        android.view.View v7 = tg.m(p14, 2131362085);
                        if (v7 != null) {
                            v0_0 = 2131362260;
                            if (((android.widget.FrameLayout) tg.m(p14, 2131362260)) != null) {
                                v0_0 = 2131362272;
                                if (((android.widget.ScrollView) tg.m(p14, 2131362272)) != null) {
                                    v0_0 = 2131362530;
                                    com.google.android.material.textfield.TextInputLayout v8_1 = ((com.google.android.material.textfield.TextInputLayout) tg.m(p14, 2131362530));
                                    if (v8_1 != null) {
                                        v0_0 = 2131362531;
                                        com.google.android.material.textfield.TextInputEditText v9_1 = ((com.google.android.material.textfield.TextInputEditText) tg.m(p14, 2131362531));
                                        if (v9_1 != null) {
                                            v0_0 = 2131362587;
                                            android.widget.LinearLayout v10_1 = ((android.widget.LinearLayout) tg.m(p14, 2131362587));
                                            if (v10_1 != null) {
                                                v0_0 = 2131362588;
                                                android.widget.TextView v11_1 = ((android.widget.TextView) tg.m(p14, 2131362588));
                                                if (v11_1 != null) {
                                                    v0_0 = 2131362745;
                                                    com.google.android.material.textfield.TextInputEditText v12_1 = ((com.google.android.material.textfield.TextInputEditText) tg.m(p14, 2131362745));
                                                    if (v12_1 != null) {
                                                        v0_0 = 2131362748;
                                                        android.widget.TextView v13_1 = ((android.widget.TextView) tg.m(p14, 2131362748));
                                                        if (v13_1 != null) {
                                                            return new com.cricfytv.sports.databinding.PlaylistDetailsLyBinding(((androidx.constraintlayout.widget.ConstraintLayout) p14), v4_1, v5_1, v6_1, v7, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p14.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.PlaylistDetailsLyBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.PlaylistDetailsLyBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.PlaylistDetailsLyBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.PlaylistDetailsLyBinding v2_1 = p2.inflate(2131558601, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.PlaylistDetailsLyBinding.bind(v2_1);
    }
}

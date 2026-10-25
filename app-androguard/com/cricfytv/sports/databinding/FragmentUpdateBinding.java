package com.cricfytv.sports.databinding;
public final class FragmentUpdateBinding implements dy3 {
    public final android.widget.ImageButton a;
    public final android.widget.LinearLayout b;
    public final android.widget.ProgressBar c;
    public final android.widget.Button d;
    public final android.widget.TextView e;
    public final android.widget.TextView f;
    public final android.widget.TextView g;
    public final android.widget.Button h;
    public final android.widget.Button i;

    public FragmentUpdateBinding(android.widget.ImageButton p1, android.widget.LinearLayout p2, android.widget.ProgressBar p3, android.widget.Button p4, android.widget.TextView p5, android.widget.TextView p6, android.widget.TextView p7, android.widget.Button p8, android.widget.Button p9)
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
        return;
    }

    public static com.cricfytv.sports.databinding.FragmentUpdateBinding bind(android.view.View p12)
    {
        int v0_0 = 2131362016;
        android.widget.ImageButton v3_1 = ((android.widget.ImageButton) tg.m(p12, 2131362016));
        if (v3_1 != null) {
            v0_0 = 2131362086;
            android.widget.LinearLayout v4_0 = ((android.widget.LinearLayout) tg.m(p12, 2131362086));
            if (v4_0 != null) {
                v0_0 = 2131362087;
                android.widget.ProgressBar v5_1 = ((android.widget.ProgressBar) tg.m(p12, 2131362087));
                if (v5_1 != null) {
                    v0_0 = 2131362287;
                    android.widget.Button v6_1 = ((android.widget.Button) tg.m(p12, 2131362287));
                    if (v6_1 != null) {
                        v0_0 = 2131362358;
                        android.widget.TextView v7_1 = ((android.widget.TextView) tg.m(p12, 2131362358));
                        if (v7_1 != null) {
                            v0_0 = 2131362554;
                            android.widget.TextView v8_1 = ((android.widget.TextView) tg.m(p12, 2131362554));
                            if (v8_1 != null) {
                                v0_0 = 2131362555;
                                android.widget.TextView v9_1 = ((android.widget.TextView) tg.m(p12, 2131362555));
                                if (v9_1 != null) {
                                    v0_0 = 2131362800;
                                    if (((android.widget.LinearLayout) tg.m(p12, 2131362800)) != null) {
                                        v0_0 = 2131362801;
                                        android.widget.Button v10_1 = ((android.widget.Button) tg.m(p12, 2131362801));
                                        if (v10_1 != null) {
                                            v0_0 = 2131362825;
                                            android.widget.Button v11_1 = ((android.widget.Button) tg.m(p12, 2131362825));
                                            if (v11_1 != null) {
                                                return new com.cricfytv.sports.databinding.FragmentUpdateBinding(v3_1, v4_0, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1);
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
        lr3.p("Missing required view with ID: ".concat(p12.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentUpdateBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentUpdateBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentUpdateBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentUpdateBinding v2_1 = p2.inflate(2131558491, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentUpdateBinding.bind(v2_1);
    }
}

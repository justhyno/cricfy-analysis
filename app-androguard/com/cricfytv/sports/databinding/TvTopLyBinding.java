package com.cricfytv.sports.databinding;
public final class TvTopLyBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final com.google.android.material.button.MaterialButton b;
    public final com.google.android.material.button.MaterialButton c;
    public final com.google.android.material.button.MaterialButton d;
    public final android.widget.ImageButton e;
    public final android.widget.ImageButton f;
    public final com.google.android.material.button.MaterialButton g;

    public TvTopLyBinding(android.widget.LinearLayout p1, com.google.android.material.button.MaterialButton p2, com.google.android.material.button.MaterialButton p3, com.google.android.material.button.MaterialButton p4, android.widget.ImageButton p5, android.widget.ImageButton p6, com.google.android.material.button.MaterialButton p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        return;
    }

    public static com.cricfytv.sports.databinding.TvTopLyBinding bind(android.view.View p10)
    {
        int v0_0 = 2131361990;
        com.google.android.material.button.MaterialButton v4_1 = ((com.google.android.material.button.MaterialButton) tg.m(p10, 2131361990));
        if (v4_1 != null) {
            v0_0 = 2131362130;
            com.google.android.material.button.MaterialButton v5_0 = ((com.google.android.material.button.MaterialButton) tg.m(p10, 2131362130));
            if (v5_0 != null) {
                v0_0 = 2131362200;
                com.google.android.material.button.MaterialButton v6_1 = ((com.google.android.material.button.MaterialButton) tg.m(p10, 2131362200));
                if (v6_1 != null) {
                    v0_0 = 2131362352;
                    android.widget.ImageButton v7_1 = ((android.widget.ImageButton) tg.m(p10, 2131362352));
                    if (v7_1 != null) {
                        v0_0 = 2131362602;
                        android.widget.ImageButton v8_1 = ((android.widget.ImageButton) tg.m(p10, 2131362602));
                        if (v8_1 != null) {
                            v0_0 = 2131362650;
                            com.google.android.material.button.MaterialButton v9_1 = ((com.google.android.material.button.MaterialButton) tg.m(p10, 2131362650));
                            if (v9_1 != null) {
                                v0_0 = 2131362749;
                                if (((android.widget.TextView) tg.m(p10, 2131362749)) != null) {
                                    return new com.cricfytv.sports.databinding.TvTopLyBinding(((android.widget.LinearLayout) p10), v4_1, v5_0, v6_1, v7_1, v8_1, v9_1);
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p10.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.TvTopLyBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.TvTopLyBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.TvTopLyBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.TvTopLyBinding v2_1 = p2.inflate(2131558613, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.TvTopLyBinding.bind(v2_1);
    }
}

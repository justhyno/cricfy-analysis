package com.cricfytv.sports.databinding;
public final class UnlockDilaogBinding implements dy3 {
    public final android.widget.FrameLayout a;
    public final android.widget.ImageButton b;
    public final android.widget.TextView c;
    public final android.widget.TextView d;
    public final android.widget.TextView e;
    public final android.widget.Button f;

    public UnlockDilaogBinding(android.widget.FrameLayout p1, android.widget.ImageButton p2, android.widget.TextView p3, android.widget.TextView p4, android.widget.TextView p5, android.widget.Button p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public static com.cricfytv.sports.databinding.UnlockDilaogBinding bind(android.view.View p9)
    {
        int v0_0 = 2131362016;
        android.widget.ImageButton v4_1 = ((android.widget.ImageButton) tg.m(p9, 2131362016));
        if (v4_1 != null) {
            v0_0 = 2131362312;
            android.widget.TextView v5_0 = ((android.widget.TextView) tg.m(p9, 2131362312));
            if (v5_0 != null) {
                v0_0 = 2131362313;
                android.widget.TextView v6_1 = ((android.widget.TextView) tg.m(p9, 2131362313));
                if (v6_1 != null) {
                    v0_0 = 2131362740;
                    android.widget.TextView v7_1 = ((android.widget.TextView) tg.m(p9, 2131362740));
                    if (v7_1 != null) {
                        v0_0 = 2131362797;
                        android.widget.Button v8_1 = ((android.widget.Button) tg.m(p9, 2131362797));
                        if (v8_1 != null) {
                            return new com.cricfytv.sports.databinding.UnlockDilaogBinding(((android.widget.FrameLayout) p9), v4_1, v5_0, v6_1, v7_1, v8_1);
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p9.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.UnlockDilaogBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.UnlockDilaogBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.UnlockDilaogBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.UnlockDilaogBinding v2_1 = p2.inflate(2131558614, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.UnlockDilaogBinding.bind(v2_1);
    }
}

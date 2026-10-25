package com.cricfytv.sports.databinding;
public final class NotItemBinding implements dy3 {
    public final com.google.android.material.card.MaterialCardView a;
    public final android.widget.TextView b;
    public final android.widget.TextView c;
    public final android.view.View d;
    public final android.widget.TextView e;

    public NotItemBinding(com.google.android.material.card.MaterialCardView p1, android.widget.TextView p2, android.widget.TextView p3, android.view.View p4, android.widget.TextView p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public static com.cricfytv.sports.databinding.NotItemBinding bind(android.view.View p8)
    {
        int v0_0 = 2131362031;
        android.widget.TextView v4_1 = ((android.widget.TextView) tg.m(p8, 2131362031));
        if (v4_1 != null) {
            v0_0 = 2131362057;
            android.widget.TextView v5_0 = ((android.widget.TextView) tg.m(p8, 2131362057));
            if (v5_0 != null) {
                v0_0 = 2131362559;
                android.view.View v6 = tg.m(p8, 2131362559);
                if (v6 != null) {
                    v0_0 = 2131362742;
                    android.widget.TextView v7_1 = ((android.widget.TextView) tg.m(p8, 2131362742));
                    if (v7_1 != null) {
                        return new com.cricfytv.sports.databinding.NotItemBinding(((com.google.android.material.card.MaterialCardView) p8), v4_1, v5_0, v6, v7_1);
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p8.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.NotItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.NotItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.NotItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.NotItemBinding v2_1 = p2.inflate(2131558584, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.NotItemBinding.bind(v2_1);
    }
}

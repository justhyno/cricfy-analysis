package com.cricfytv.sports.databinding;
public final class ErrorLayoutBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final android.widget.TextView b;
    public final com.google.android.material.button.MaterialButton c;

    public ErrorLayoutBinding(android.widget.LinearLayout p1, android.widget.TextView p2, com.google.android.material.button.MaterialButton p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.ErrorLayoutBinding bind(android.view.View p5)
    {
        int v0_0 = 2131362122;
        android.widget.TextView v1_1 = ((android.widget.TextView) tg.m(p5, 2131362122));
        if (v1_1 != null) {
            int v2 = 2131362125;
            if (((android.widget.TextView) tg.m(p5, 2131362125)) != null) {
                v2 = 2131362576;
                com.google.android.material.button.MaterialButton v3_2 = ((com.google.android.material.button.MaterialButton) tg.m(p5, 2131362576));
                if (v3_2 != null) {
                    v2 = 2131362827;
                    if (((com.google.android.material.button.MaterialButton) tg.m(p5, 2131362827)) != null) {
                        return new com.cricfytv.sports.databinding.ErrorLayoutBinding(((android.widget.LinearLayout) p5), v1_1, v3_2);
                    }
                }
            }
            v0_0 = v2;
        }
        lr3.p("Missing required view with ID: ".concat(p5.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.ErrorLayoutBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ErrorLayoutBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ErrorLayoutBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ErrorLayoutBinding v2_1 = p2.inflate(2131558471, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v2_1);
    }
}

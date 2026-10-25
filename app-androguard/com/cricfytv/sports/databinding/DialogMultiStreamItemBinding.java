package com.cricfytv.sports.databinding;
public final class DialogMultiStreamItemBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final android.widget.TextView b;
    public final android.widget.ImageView c;
    public final android.widget.ImageView d;
    public final android.widget.TextView e;

    public DialogMultiStreamItemBinding(android.widget.LinearLayout p1, android.widget.TextView p2, android.widget.ImageView p3, android.widget.ImageView p4, android.widget.TextView p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public static com.cricfytv.sports.databinding.DialogMultiStreamItemBinding bind(android.view.View p8)
    {
        int v0_0 = 2131362239;
        android.widget.TextView v4_1 = ((android.widget.TextView) tg.m(p8, 2131362239));
        if (v4_1 != null) {
            v0_0 = 2131362672;
            android.widget.ImageView v5_0 = ((android.widget.ImageView) tg.m(p8, 2131362672));
            if (v5_0 != null) {
                v0_0 = 2131362673;
                android.widget.ImageView v6_1 = ((android.widget.ImageView) tg.m(p8, 2131362673));
                if (v6_1 != null) {
                    v0_0 = 2131362674;
                    android.widget.TextView v7_1 = ((android.widget.TextView) tg.m(p8, 2131362674));
                    if (v7_1 != null) {
                        return new com.cricfytv.sports.databinding.DialogMultiStreamItemBinding(((android.widget.LinearLayout) p8), v4_1, v5_0, v6_1, v7_1);
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p8.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.DialogMultiStreamItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.DialogMultiStreamItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.DialogMultiStreamItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.DialogMultiStreamItemBinding v2_1 = p2.inflate(2131558467, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.DialogMultiStreamItemBinding.bind(v2_1);
    }
}

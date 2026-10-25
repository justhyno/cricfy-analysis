package com.cricfytv.sports.databinding;
public final class DialogMultiStreamBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final android.widget.LinearLayout b;
    public final android.widget.ImageView c;
    public final android.widget.ImageView d;
    public final android.widget.LinearLayout e;

    public DialogMultiStreamBinding(androidx.constraintlayout.widget.ConstraintLayout p1, android.widget.LinearLayout p2, android.widget.ImageView p3, android.widget.ImageView p4, android.widget.LinearLayout p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public static com.cricfytv.sports.databinding.DialogMultiStreamBinding bind(android.view.View p8)
    {
        int v0_0 = 2131361968;
        android.widget.LinearLayout v4_1 = ((android.widget.LinearLayout) tg.m(p8, 2131361968));
        if (v4_1 != null) {
            v0_0 = 2131362075;
            android.widget.ImageView v5_0 = ((android.widget.ImageView) tg.m(p8, 2131362075));
            if (v5_0 != null) {
                v0_0 = 2131362076;
                android.widget.ImageView v6_1 = ((android.widget.ImageView) tg.m(p8, 2131362076));
                if (v6_1 != null) {
                    v0_0 = 2131362240;
                    if (((android.widget.LinearLayout) tg.m(p8, 2131362240)) != null) {
                        v0_0 = 2131362675;
                        android.widget.LinearLayout v7_1 = ((android.widget.LinearLayout) tg.m(p8, 2131362675));
                        if (v7_1 != null) {
                            return new com.cricfytv.sports.databinding.DialogMultiStreamBinding(((androidx.constraintlayout.widget.ConstraintLayout) p8), v4_1, v5_0, v6_1, v7_1);
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p8.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.DialogMultiStreamBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.DialogMultiStreamBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.DialogMultiStreamBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.DialogMultiStreamBinding v2_1 = p2.inflate(2131558466, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.DialogMultiStreamBinding.bind(v2_1);
    }
}

package com.cricfytv.sports.databinding;
public final class DialogTgJoinBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final android.widget.ImageView b;
    public final android.widget.LinearLayout c;
    public final android.widget.LinearLayout d;
    public final android.widget.LinearLayout e;
    public final android.widget.TextView f;
    public final android.widget.TextView g;

    public DialogTgJoinBinding(android.widget.LinearLayout p1, android.widget.ImageView p2, android.widget.LinearLayout p3, android.widget.LinearLayout p4, android.widget.LinearLayout p5, android.widget.TextView p6, android.widget.TextView p7)
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

    public static com.cricfytv.sports.databinding.DialogTgJoinBinding bind(android.view.View p10)
    {
        int v0_0 = 2131362016;
        android.widget.ImageView v4_1 = ((android.widget.ImageView) tg.m(p10, 2131362016));
        if (v4_1 != null) {
            v0_0 = 2131362100;
            android.widget.LinearLayout v5_0 = ((android.widget.LinearLayout) tg.m(p10, 2131362100));
            if (v5_0 != null) {
                v0_0 = 2131362282;
                android.widget.LinearLayout v6_1 = ((android.widget.LinearLayout) tg.m(p10, 2131362282));
                if (v6_1 != null) {
                    v0_0 = 2131362287;
                    android.widget.LinearLayout v7_1 = ((android.widget.LinearLayout) tg.m(p10, 2131362287));
                    if (v7_1 != null) {
                        v0_0 = 2131362734;
                        if (((android.widget.ImageView) tg.m(p10, 2131362734)) != null) {
                            v0_0 = 2131362735;
                            if (((android.widget.ImageView) tg.m(p10, 2131362735)) != null) {
                                v0_0 = 2131362736;
                                android.widget.TextView v8_1 = ((android.widget.TextView) tg.m(p10, 2131362736));
                                if (v8_1 != null) {
                                    v0_0 = 2131362737;
                                    android.widget.TextView v9_1 = ((android.widget.TextView) tg.m(p10, 2131362737));
                                    if (v9_1 != null) {
                                        return new com.cricfytv.sports.databinding.DialogTgJoinBinding(((android.widget.LinearLayout) p10), v4_1, v5_0, v6_1, v7_1, v8_1, v9_1);
                                    }
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

    public static com.cricfytv.sports.databinding.DialogTgJoinBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.DialogTgJoinBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.DialogTgJoinBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.DialogTgJoinBinding v2_1 = p2.inflate(2131558469, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.DialogTgJoinBinding.bind(v2_1);
    }
}

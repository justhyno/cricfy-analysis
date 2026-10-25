package com.cricfytv.sports.databinding;
public final class ActivityCrashReportBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final android.widget.Button b;
    public final android.widget.Button c;
    public final android.widget.LinearLayout d;
    public final android.widget.LinearLayout e;
    public final android.widget.TextView f;
    public final android.widget.TextView g;
    public final android.widget.TextView h;
    public final android.widget.TextView i;
    public final android.widget.Button j;
    public final android.widget.Button k;

    public ActivityCrashReportBinding(android.widget.LinearLayout p1, android.widget.Button p2, android.widget.Button p3, android.widget.LinearLayout p4, android.widget.LinearLayout p5, android.widget.TextView p6, android.widget.TextView p7, android.widget.TextView p8, android.widget.TextView p9, android.widget.Button p10, android.widget.Button p11)
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

    public static com.cricfytv.sports.databinding.ActivityCrashReportBinding bind(android.view.View p14)
    {
        int v0_0 = 2131362014;
        android.widget.Button v4_1 = ((android.widget.Button) tg.m(p14, 2131362014));
        if (v4_1 != null) {
            v0_0 = 2131362038;
            android.widget.Button v5_0 = ((android.widget.Button) tg.m(p14, 2131362038));
            if (v5_0 != null) {
                v0_0 = 2131362045;
                android.widget.LinearLayout v6_1 = ((android.widget.LinearLayout) tg.m(p14, 2131362045));
                if (v6_1 != null) {
                    v0_0 = 2131362046;
                    android.widget.LinearLayout v7_1 = ((android.widget.LinearLayout) tg.m(p14, 2131362046));
                    if (v7_1 != null) {
                        v0_0 = 2131362047;
                        android.widget.TextView v8_1 = ((android.widget.TextView) tg.m(p14, 2131362047));
                        if (v8_1 != null) {
                            v0_0 = 2131362049;
                            if (((android.widget.ScrollView) tg.m(p14, 2131362049)) != null) {
                                v0_0 = 2131362050;
                                android.widget.TextView v9_1 = ((android.widget.TextView) tg.m(p14, 2131362050));
                                if (v9_1 != null) {
                                    v0_0 = 2131362314;
                                    android.widget.TextView v10_1 = ((android.widget.TextView) tg.m(p14, 2131362314));
                                    if (v10_1 != null) {
                                        v0_0 = 2131362570;
                                        android.widget.TextView v11_1 = ((android.widget.TextView) tg.m(p14, 2131362570));
                                        if (v11_1 != null) {
                                            v0_0 = 2131362574;
                                            android.widget.Button v12_1 = ((android.widget.Button) tg.m(p14, 2131362574));
                                            if (v12_1 != null) {
                                                v0_0 = 2131362621;
                                                android.widget.Button v13_1 = ((android.widget.Button) tg.m(p14, 2131362621));
                                                if (v13_1 != null) {
                                                    return new com.cricfytv.sports.databinding.ActivityCrashReportBinding(((android.widget.LinearLayout) p14), v4_1, v5_0, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1);
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

    public static com.cricfytv.sports.databinding.ActivityCrashReportBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ActivityCrashReportBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ActivityCrashReportBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ActivityCrashReportBinding v2_1 = p2.inflate(2131558428, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ActivityCrashReportBinding.bind(v2_1);
    }
}

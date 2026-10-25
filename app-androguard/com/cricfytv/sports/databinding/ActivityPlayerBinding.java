package com.cricfytv.sports.databinding;
public final class ActivityPlayerBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final com.cricfytv.sports.databinding.BannerLyBinding b;
    public final android.widget.TextView c;
    public final com.cricfytv.sports.databinding.MessageLyBinding d;
    public final android.widget.ProgressBar e;
    public final android.widget.FrameLayout f;
    public final androidx.recyclerview.widget.RecyclerView g;
    public final android.widget.HorizontalScrollView h;

    public ActivityPlayerBinding(androidx.constraintlayout.widget.ConstraintLayout p1, com.cricfytv.sports.databinding.BannerLyBinding p2, android.widget.TextView p3, com.cricfytv.sports.databinding.MessageLyBinding p4, android.widget.ProgressBar p5, android.widget.FrameLayout p6, androidx.recyclerview.widget.RecyclerView p7, android.widget.HorizontalScrollView p8)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        return;
    }

    public static com.cricfytv.sports.databinding.ActivityPlayerBinding bind(android.view.View p11)
    {
        int v0_0 = 2131361877;
        android.view.View v1_3 = tg.m(p11, 2131361877);
        if (v1_3 != null) {
            com.cricfytv.sports.databinding.BannerLyBinding v4 = com.cricfytv.sports.databinding.BannerLyBinding.bind(v1_3);
            v0_0 = 2131361879;
            if (((android.widget.LinearLayout) tg.m(p11, 2131361879)) != null) {
                v0_0 = 2131362033;
                if (((androidx.constraintlayout.widget.ConstraintLayout) tg.m(p11, 2131362033)) != null) {
                    v0_0 = 2131362112;
                    android.widget.TextView v5_1 = ((android.widget.TextView) tg.m(p11, 2131362112));
                    if (v5_1 != null) {
                        v0_0 = 2131362123;
                        android.view.View v1_4 = tg.m(p11, 2131362123);
                        if (v1_4 != null) {
                            com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_4);
                            v0_0 = 2131362356;
                            android.view.View v1_5 = tg.m(p11, 2131362356);
                            if (v1_5 != null) {
                                com.cricfytv.sports.databinding.MessageLyBinding v6 = com.cricfytv.sports.databinding.MessageLyBinding.bind(v1_5);
                                v0_0 = 2131362533;
                                android.widget.ProgressBar v7_1 = ((android.widget.ProgressBar) tg.m(p11, 2131362533));
                                if (v7_1 != null) {
                                    v0_0 = 2131362540;
                                    android.widget.FrameLayout v8_1 = ((android.widget.FrameLayout) tg.m(p11, 2131362540));
                                    if (v8_1 != null) {
                                        v0_0 = 2131362569;
                                        androidx.recyclerview.widget.RecyclerView v9_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p11, 2131362569));
                                        if (v9_1 != null) {
                                            v0_0 = 2131362619;
                                            if (((android.widget.LinearLayout) tg.m(p11, 2131362619)) != null) {
                                                v0_0 = 2131362620;
                                                android.widget.HorizontalScrollView v10_1 = ((android.widget.HorizontalScrollView) tg.m(p11, 2131362620));
                                                if (v10_1 != null) {
                                                    return new com.cricfytv.sports.databinding.ActivityPlayerBinding(((androidx.constraintlayout.widget.ConstraintLayout) p11), v4, v5_1, v6, v7_1, v8_1, v9_1, v10_1);
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
        lr3.p("Missing required view with ID: ".concat(p11.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.ActivityPlayerBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ActivityPlayerBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ActivityPlayerBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ActivityPlayerBinding v2_1 = p2.inflate(2131558430, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ActivityPlayerBinding.bind(v2_1);
    }
}

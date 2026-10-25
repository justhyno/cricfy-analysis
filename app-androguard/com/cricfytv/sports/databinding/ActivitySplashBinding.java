package com.cricfytv.sports.databinding;
public final class ActivitySplashBinding implements dy3 {
    public final android.widget.RelativeLayout a;
    public final com.airbnb.lottie.LottieAnimationView b;
    public final com.cricfytv.sports.databinding.ErrorLayoutBinding c;
    public final android.widget.LinearLayout d;
    public final android.widget.LinearLayout e;
    public final com.google.android.material.button.MaterialButton f;
    public final com.google.android.material.button.MaterialButton g;
    public final androidx.fragment.app.FragmentContainerView h;
    public final android.widget.TextView i;
    public final com.google.android.material.button.MaterialButton j;

    public ActivitySplashBinding(android.widget.RelativeLayout p1, com.airbnb.lottie.LottieAnimationView p2, com.cricfytv.sports.databinding.ErrorLayoutBinding p3, android.widget.LinearLayout p4, android.widget.LinearLayout p5, com.google.android.material.button.MaterialButton p6, com.google.android.material.button.MaterialButton p7, androidx.fragment.app.FragmentContainerView p8, android.widget.TextView p9, com.google.android.material.button.MaterialButton p10)
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
        return;
    }

    public static com.cricfytv.sports.databinding.ActivitySplashBinding bind(android.view.View p13)
    {
        int v0_0 = 2131361901;
        com.airbnb.lottie.LottieAnimationView v4_1 = ((com.airbnb.lottie.LottieAnimationView) tg.m(p13, 2131361901));
        if (v4_1 != null) {
            v0_0 = 2131362123;
            android.view.View v1_10 = tg.m(p13, 2131362123);
            if (v1_10 != null) {
                com.cricfytv.sports.databinding.ErrorLayoutBinding v5 = com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_10);
                v0_0 = 2131362317;
                android.widget.LinearLayout v6_1 = ((android.widget.LinearLayout) tg.m(p13, 2131362317));
                if (v6_1 != null) {
                    v0_0 = 2131362318;
                    android.widget.LinearLayout v7_1 = ((android.widget.LinearLayout) tg.m(p13, 2131362318));
                    if (v7_1 != null) {
                        v0_0 = 2131362361;
                        com.google.android.material.button.MaterialButton v8_1 = ((com.google.android.material.button.MaterialButton) tg.m(p13, 2131362361));
                        if (v8_1 != null) {
                            v0_0 = 2131362567;
                            com.google.android.material.button.MaterialButton v9_1 = ((com.google.android.material.button.MaterialButton) tg.m(p13, 2131362567));
                            if (v9_1 != null) {
                                v0_0 = 2131362646;
                                if (((android.widget.ImageView) tg.m(p13, 2131362646)) != null) {
                                    v0_0 = 2131362799;
                                    androidx.fragment.app.FragmentContainerView v10_1 = ((androidx.fragment.app.FragmentContainerView) tg.m(p13, 2131362799));
                                    if (v10_1 != null) {
                                        v0_0 = 2131362806;
                                        android.widget.TextView v11_1 = ((android.widget.TextView) tg.m(p13, 2131362806));
                                        if (v11_1 != null) {
                                            v0_0 = 2131362831;
                                            com.google.android.material.button.MaterialButton v12_1 = ((com.google.android.material.button.MaterialButton) tg.m(p13, 2131362831));
                                            if (v12_1 != null) {
                                                return new com.cricfytv.sports.databinding.ActivitySplashBinding(((android.widget.RelativeLayout) p13), v4_1, v5, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1);
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
        lr3.p("Missing required view with ID: ".concat(p13.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.ActivitySplashBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ActivitySplashBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ActivitySplashBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ActivitySplashBinding v2_1 = p2.inflate(2131558432, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ActivitySplashBinding.bind(v2_1);
    }
}

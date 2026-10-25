package com.cricfytv.sports.databinding;
public final class ActivityWebBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final android.widget.ImageButton b;
    public final android.widget.FrameLayout c;
    public final com.cricfytv.sports.databinding.ErrorLayoutBinding d;
    public final android.widget.ProgressBar e;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout f;
    public final android.widget.TextView g;
    public final android.webkit.WebView h;

    public ActivityWebBinding(androidx.constraintlayout.widget.ConstraintLayout p1, android.widget.ImageButton p2, android.widget.FrameLayout p3, com.cricfytv.sports.databinding.ErrorLayoutBinding p4, android.widget.ProgressBar p5, androidx.swiperefreshlayout.widget.SwipeRefreshLayout p6, android.widget.TextView p7, android.webkit.WebView p8)
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

    public static com.cricfytv.sports.databinding.ActivityWebBinding bind(android.view.View p11)
    {
        int v0_0 = 2131361920;
        android.widget.ImageButton v4_1 = ((android.widget.ImageButton) tg.m(p11, 2131361920));
        if (v4_1 != null) {
            v0_0 = 2131362016;
            android.widget.FrameLayout v5_0 = ((android.widget.FrameLayout) tg.m(p11, 2131362016));
            if (v5_0 != null) {
                v0_0 = 2131362124;
                android.view.View v1_0 = tg.m(p11, 2131362124);
                if (v1_0 != null) {
                    com.cricfytv.sports.databinding.ErrorLayoutBinding v6 = com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_0);
                    v0_0 = 2131362534;
                    android.widget.ProgressBar v7_1 = ((android.widget.ProgressBar) tg.m(p11, 2131362534));
                    if (v7_1 != null) {
                        v0_0 = 2131362683;
                        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v8_1 = ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) tg.m(p11, 2131362683));
                        if (v8_1 != null) {
                            v0_0 = 2131362789;
                            android.widget.TextView v9_1 = ((android.widget.TextView) tg.m(p11, 2131362789));
                            if (v9_1 != null) {
                                v0_0 = 2131362823;
                                android.webkit.WebView v10_1 = ((android.webkit.WebView) tg.m(p11, 2131362823));
                                if (v10_1 != null) {
                                    return new com.cricfytv.sports.databinding.ActivityWebBinding(((androidx.constraintlayout.widget.ConstraintLayout) p11), v4_1, v5_0, v6, v7_1, v8_1, v9_1, v10_1);
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

    public static com.cricfytv.sports.databinding.ActivityWebBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ActivityWebBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ActivityWebBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ActivityWebBinding v2_1 = p2.inflate(2131558433, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ActivityWebBinding.bind(v2_1);
    }
}

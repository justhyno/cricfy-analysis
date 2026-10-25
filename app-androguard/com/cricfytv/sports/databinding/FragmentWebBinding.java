package com.cricfytv.sports.databinding;
public final class FragmentWebBinding implements dy3 {
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout a;
    public final com.cricfytv.sports.databinding.ErrorLayoutBinding b;
    public final android.webkit.WebView c;

    public FragmentWebBinding(androidx.swiperefreshlayout.widget.SwipeRefreshLayout p1, com.cricfytv.sports.databinding.ErrorLayoutBinding p2, android.webkit.WebView p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.FragmentWebBinding bind(android.view.View p4)
    {
        int v0_0 = 2131362124;
        com.cricfytv.sports.databinding.FragmentWebBinding v1_1 = tg.m(p4, 2131362124);
        if (v1_1 != null) {
            int v0_2 = com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_1);
            com.cricfytv.sports.databinding.FragmentWebBinding v1_0 = 2131362823;
            android.webkit.WebView v2_1 = ((android.webkit.WebView) tg.m(p4, 2131362823));
            if (v2_1 != null) {
                v1_0 = 2131362826;
                if (((android.widget.FrameLayout) tg.m(p4, 2131362826)) != null) {
                    return new com.cricfytv.sports.databinding.FragmentWebBinding(((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) p4), v0_2, v2_1);
                }
            }
            v0_0 = v1_0;
        }
        lr3.p("Missing required view with ID: ".concat(p4.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentWebBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentWebBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentWebBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentWebBinding v2_1 = p2.inflate(2131558492, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentWebBinding.bind(v2_1);
    }
}

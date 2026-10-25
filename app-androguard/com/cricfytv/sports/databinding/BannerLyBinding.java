package com.cricfytv.sports.databinding;
public final class BannerLyBinding implements dy3 {
    public final com.google.android.material.card.MaterialCardView a;
    public final android.widget.LinearLayout b;

    public BannerLyBinding(com.google.android.material.card.MaterialCardView p1, android.widget.LinearLayout p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static com.cricfytv.sports.databinding.BannerLyBinding bind(android.view.View p3)
    {
        android.widget.LinearLayout v2_1 = ((android.widget.LinearLayout) tg.m(p3, 2131361878));
        if (v2_1 == null) {
            lr3.p("Missing required view with ID: ".concat(p3.getResources().getResourceName(2131361878)));
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.BannerLyBinding(((com.google.android.material.card.MaterialCardView) p3), v2_1);
        }
    }

    public static com.cricfytv.sports.databinding.BannerLyBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.BannerLyBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.BannerLyBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.BannerLyBinding v2_1 = p2.inflate(2131558437, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.BannerLyBinding.bind(v2_1);
    }
}

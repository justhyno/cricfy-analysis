package com.cricfytv.sports.databinding;
public final class SponsorLyBinding implements dy3 {

    public static com.cricfytv.sports.databinding.SponsorLyBinding bind(android.view.View p2)
    {
        if (((android.widget.ImageView) tg.m(p2, 2131362649)) == null) {
            lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(2131362649)));
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.SponsorLyBinding();
        }
    }

    public static com.cricfytv.sports.databinding.SponsorLyBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.SponsorLyBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.SponsorLyBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.SponsorLyBinding v2_1 = p2.inflate(2131558608, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.SponsorLyBinding.bind(v2_1);
    }
}

package com.cricfytv.sports.databinding;
public final class HeaderLayoutBinding implements dy3 {

    public static com.cricfytv.sports.databinding.HeaderLayoutBinding bind(android.view.View p2)
    {
        com.cricfytv.sports.databinding.HeaderLayoutBinding v0_0 = 2131362241;
        if (((android.widget.ImageView) tg.m(p2, 2131362241)) != null) {
            v0_0 = 2131362242;
            if (((android.widget.TextView) tg.m(p2, 2131362242)) != null) {
                return new com.cricfytv.sports.databinding.HeaderLayoutBinding();
            }
        }
        lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.HeaderLayoutBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.HeaderLayoutBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.HeaderLayoutBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.HeaderLayoutBinding v2_1 = p2.inflate(2131558493, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.HeaderLayoutBinding.bind(v2_1);
    }
}

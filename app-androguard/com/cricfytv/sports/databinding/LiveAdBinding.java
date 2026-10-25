package com.cricfytv.sports.databinding;
public final class LiveAdBinding implements dy3 {

    public static com.cricfytv.sports.databinding.LiveAdBinding bind(android.view.View p2)
    {
        if (((android.widget.LinearLayout) tg.m(p2, 2131361876)) == null) {
            lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(2131361876)));
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.LiveAdBinding();
        }
    }

    public static com.cricfytv.sports.databinding.LiveAdBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.LiveAdBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.LiveAdBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.LiveAdBinding v2_1 = p2.inflate(2131558499, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.LiveAdBinding.bind(v2_1);
    }
}

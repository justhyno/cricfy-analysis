package com.cricfytv.sports.databinding;
public final class LiveAnimBinding implements dy3 {

    public static com.cricfytv.sports.databinding.LiveAnimBinding bind(android.view.View p1)
    {
        if (p1 == 0) {
            lr3.p("rootView");
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.LiveAnimBinding();
        }
    }

    public static com.cricfytv.sports.databinding.LiveAnimBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.LiveAnimBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.LiveAnimBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.LiveAnimBinding v2_1 = p2.inflate(2131558500, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.LiveAnimBinding.bind(v2_1);
    }
}

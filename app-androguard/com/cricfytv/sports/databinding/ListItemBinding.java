package com.cricfytv.sports.databinding;
public final class ListItemBinding implements dy3 {

    public static com.cricfytv.sports.databinding.ListItemBinding bind(android.view.View p0)
    {
        if (p0 == 0) {
            lr3.p("rootView");
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.ListItemBinding();
        }
    }

    public static com.cricfytv.sports.databinding.ListItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ListItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ListItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ListItemBinding v2_1 = p2.inflate(2131558498, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ListItemBinding.bind(v2_1);
    }
}

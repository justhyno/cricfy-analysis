package com.cricfytv.sports.databinding;
public final class FragmentChannelsNewBinding implements dy3 {

    public static com.cricfytv.sports.databinding.FragmentChannelsNewBinding bind(android.view.View p2)
    {
        com.cricfytv.sports.databinding.FragmentChannelsNewBinding v0_0 = 2131362112;
        if (((android.widget.TextView) tg.m(p2, 2131362112)) != null) {
            v0_0 = 2131362123;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout v1_8 = tg.m(p2, 2131362123);
            if (v1_8 != null) {
                com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_8);
                v0_0 = 2131362561;
                if (((androidx.recyclerview.widget.RecyclerView) tg.m(p2, 2131362561)) != null) {
                    v0_0 = 2131362611;
                    if (((androidx.appcompat.widget.SearchView) tg.m(p2, 2131362611)) != null) {
                        v0_0 = 2131362683;
                        if (((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) tg.m(p2, 2131362683)) != null) {
                            return new com.cricfytv.sports.databinding.FragmentChannelsNewBinding();
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentChannelsNewBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentChannelsNewBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentChannelsNewBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentChannelsNewBinding v2_1 = p2.inflate(2131558484, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentChannelsNewBinding.bind(v2_1);
    }
}

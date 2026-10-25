package com.cricfytv.sports.databinding;
public final class ActivityPlaylistBinding implements dy3 {

    public static com.cricfytv.sports.databinding.ActivityPlaylistBinding bind(android.view.View p2)
    {
        int v0_0 = 2131362112;
        if (((android.widget.TextView) tg.m(p2, 2131362112)) != null) {
            v0_0 = 2131362123;
            com.google.android.material.appbar.AppBarLayout v1_12 = tg.m(p2, 2131362123);
            if (v1_12 != null) {
                com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_12);
                v0_0 = 2131362561;
                if (((androidx.recyclerview.widget.RecyclerView) tg.m(p2, 2131362561)) != null) {
                    v0_0 = 2131362683;
                    if (((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) tg.m(p2, 2131362683)) != null) {
                        v0_0 = 2131362688;
                        if (((com.google.android.material.tabs.TabLayout) tg.m(p2, 2131362688)) != null) {
                            v0_0 = 2131362753;
                            if (((androidx.appcompat.widget.Toolbar) tg.m(p2, 2131362753)) != null) {
                                v0_0 = 2131362754;
                                if (((com.google.android.material.appbar.AppBarLayout) tg.m(p2, 2131362754)) != null) {
                                    return new com.cricfytv.sports.databinding.ActivityPlaylistBinding();
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.ActivityPlaylistBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ActivityPlaylistBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ActivityPlaylistBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ActivityPlaylistBinding v2_1 = p2.inflate(2131558431, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ActivityPlaylistBinding.bind(v2_1);
    }
}

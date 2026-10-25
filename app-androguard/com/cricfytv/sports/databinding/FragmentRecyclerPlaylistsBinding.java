package com.cricfytv.sports.databinding;
public final class FragmentRecyclerPlaylistsBinding implements dy3 {

    public static com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding bind(android.view.View p2)
    {
        com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding v0_0 = 2131362112;
        if (((android.widget.TextView) tg.m(p2, 2131362112)) != null) {
            v0_0 = 2131362123;
            androidx.recyclerview.widget.RecyclerView v1_6 = tg.m(p2, 2131362123);
            if (v1_6 != null) {
                com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_6);
                v0_0 = 2131362532;
                if (((android.widget.ProgressBar) tg.m(p2, 2131362532)) != null) {
                    v0_0 = 2131362561;
                    if (((androidx.recyclerview.widget.RecyclerView) tg.m(p2, 2131362561)) != null) {
                        return new com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding();
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding v2_1 = p2.inflate(2131558490, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentRecyclerPlaylistsBinding.bind(v2_1);
    }
}

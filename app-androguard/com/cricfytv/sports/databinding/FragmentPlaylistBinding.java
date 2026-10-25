package com.cricfytv.sports.databinding;
public final class FragmentPlaylistBinding implements dy3 {
    public final android.widget.ImageButton a;
    public final android.widget.TextView b;
    public final com.cricfytv.sports.databinding.ErrorLayoutBinding c;
    public final androidx.recyclerview.widget.RecyclerView d;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout e;
    public final com.google.android.material.tabs.TabLayout f;
    public final android.widget.LinearLayout g;

    public FragmentPlaylistBinding(android.widget.ImageButton p1, android.widget.TextView p2, com.cricfytv.sports.databinding.ErrorLayoutBinding p3, androidx.recyclerview.widget.RecyclerView p4, androidx.swiperefreshlayout.widget.SwipeRefreshLayout p5, com.google.android.material.tabs.TabLayout p6, android.widget.LinearLayout p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        return;
    }

    public static com.cricfytv.sports.databinding.FragmentPlaylistBinding bind(android.view.View p10)
    {
        int v0_0 = 2131362005;
        android.widget.ImageButton v3_1 = ((android.widget.ImageButton) tg.m(p10, 2131362005));
        if (v3_1 != null) {
            v0_0 = 2131362112;
            android.widget.TextView v4_0 = ((android.widget.TextView) tg.m(p10, 2131362112));
            if (v4_0 != null) {
                v0_0 = 2131362123;
                android.view.View v1_0 = tg.m(p10, 2131362123);
                if (v1_0 != null) {
                    com.cricfytv.sports.databinding.ErrorLayoutBinding v5 = com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_0);
                    v0_0 = 2131362545;
                    if (((android.widget.LinearLayout) tg.m(p10, 2131362545)) != null) {
                        v0_0 = 2131362561;
                        androidx.recyclerview.widget.RecyclerView v6_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p10, 2131362561));
                        if (v6_1 != null) {
                            v0_0 = 2131362683;
                            androidx.swiperefreshlayout.widget.SwipeRefreshLayout v7_1 = ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) tg.m(p10, 2131362683));
                            if (v7_1 != null) {
                                v0_0 = 2131362688;
                                com.google.android.material.tabs.TabLayout v8_1 = ((com.google.android.material.tabs.TabLayout) tg.m(p10, 2131362688));
                                if (v8_1 != null) {
                                    v0_0 = 2131362689;
                                    android.widget.LinearLayout v9_1 = ((android.widget.LinearLayout) tg.m(p10, 2131362689));
                                    if (v9_1 != null) {
                                        return new com.cricfytv.sports.databinding.FragmentPlaylistBinding(v3_1, v4_0, v5, v6_1, v7_1, v8_1, v9_1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p10.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentPlaylistBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentPlaylistBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentPlaylistBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentPlaylistBinding v2_1 = p2.inflate(2131558487, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentPlaylistBinding.bind(v2_1);
    }
}

package com.cricfytv.sports.databinding;
public final class FragmentHomeBinding implements dy3 {
    public final androidx.recyclerview.widget.RecyclerView a;
    public final android.widget.TextView b;
    public final com.cricfytv.sports.databinding.ErrorLayoutBinding c;
    public final com.google.android.material.chip.ChipGroup d;
    public final com.cricfytv.sports.databinding.MessageLyBinding e;
    public final androidx.recyclerview.widget.RecyclerView f;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout g;

    public FragmentHomeBinding(androidx.recyclerview.widget.RecyclerView p1, android.widget.TextView p2, com.cricfytv.sports.databinding.ErrorLayoutBinding p3, com.google.android.material.chip.ChipGroup p4, com.cricfytv.sports.databinding.MessageLyBinding p5, androidx.recyclerview.widget.RecyclerView p6, androidx.swiperefreshlayout.widget.SwipeRefreshLayout p7)
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

    public static com.cricfytv.sports.databinding.FragmentHomeBinding bind(android.view.View p10)
    {
        int v0_0 = 2131361991;
        androidx.recyclerview.widget.RecyclerView v3_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p10, 2131361991));
        if (v3_1 != null) {
            v0_0 = 2131362112;
            android.widget.TextView v4_0 = ((android.widget.TextView) tg.m(p10, 2131362112));
            if (v4_0 != null) {
                v0_0 = 2131362123;
                android.view.View v1_0 = tg.m(p10, 2131362123);
                if (v1_0 != null) {
                    com.cricfytv.sports.databinding.ErrorLayoutBinding v5 = com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v1_0);
                    v0_0 = 2131362128;
                    if (((android.widget.LinearLayout) tg.m(p10, 2131362128)) != null) {
                        v0_0 = 2131362131;
                        com.google.android.material.chip.ChipGroup v6_1 = ((com.google.android.material.chip.ChipGroup) tg.m(p10, 2131362131));
                        if (v6_1 != null) {
                            v0_0 = 2131362251;
                            android.view.View v1_5 = tg.m(p10, 2131362251);
                            if (v1_5 != null) {
                                com.cricfytv.sports.databinding.MessageLyBinding v7 = com.cricfytv.sports.databinding.MessageLyBinding.bind(v1_5);
                                v0_0 = 2131362254;
                                if (((android.widget.HorizontalScrollView) tg.m(p10, 2131362254)) != null) {
                                    v0_0 = 2131362561;
                                    androidx.recyclerview.widget.RecyclerView v8_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p10, 2131362561));
                                    if (v8_1 != null) {
                                        return new com.cricfytv.sports.databinding.FragmentHomeBinding(v3_1, v4_0, v5, v6_1, v7, v8_1, ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) p10));
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

    public static com.cricfytv.sports.databinding.FragmentHomeBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentHomeBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentHomeBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentHomeBinding v2_1 = p2.inflate(2131558486, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentHomeBinding.bind(v2_1);
    }
}

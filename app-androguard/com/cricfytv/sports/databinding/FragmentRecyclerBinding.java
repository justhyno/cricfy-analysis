package com.cricfytv.sports.databinding;
public final class FragmentRecyclerBinding implements dy3 {
    public final android.widget.TextView a;
    public final com.cricfytv.sports.databinding.ErrorLayoutBinding b;
    public final androidx.recyclerview.widget.RecyclerView c;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout d;

    public FragmentRecyclerBinding(android.widget.TextView p1, com.cricfytv.sports.databinding.ErrorLayoutBinding p2, androidx.recyclerview.widget.RecyclerView p3, androidx.swiperefreshlayout.widget.SwipeRefreshLayout p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerBinding bind(android.view.View p5)
    {
        int v0_0 = 2131362112;
        android.widget.TextView v1_1 = ((android.widget.TextView) tg.m(p5, 2131362112));
        if (v1_1 != null) {
            v0_0 = 2131362123;
            com.cricfytv.sports.databinding.FragmentRecyclerBinding v2_3 = tg.m(p5, 2131362123);
            if (v2_3 != null) {
                int v0_1 = com.cricfytv.sports.databinding.ErrorLayoutBinding.bind(v2_3);
                com.cricfytv.sports.databinding.FragmentRecyclerBinding v2_0 = 2131362561;
                androidx.recyclerview.widget.RecyclerView v3_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p5, 2131362561));
                if (v3_1 != null) {
                    v2_0 = 2131362564;
                    if (((android.widget.LinearLayout) tg.m(p5, 2131362564)) != null) {
                        v2_0 = 2131362683;
                        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v4_3 = ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) tg.m(p5, 2131362683));
                        if (v4_3 != null) {
                            return new com.cricfytv.sports.databinding.FragmentRecyclerBinding(v1_1, v0_1, v3_1, v4_3);
                        }
                    }
                }
                v0_0 = v2_0;
            }
        }
        lr3.p("Missing required view with ID: ".concat(p5.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentRecyclerBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentRecyclerBinding v2_1 = p2.inflate(2131558488, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentRecyclerBinding.bind(v2_1);
    }
}

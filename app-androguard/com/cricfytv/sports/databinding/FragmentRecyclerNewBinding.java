package com.cricfytv.sports.databinding;
public final class FragmentRecyclerNewBinding implements dy3 {
    public final com.google.android.material.floatingactionbutton.FloatingActionButton a;
    public final android.widget.TextView b;
    public final androidx.recyclerview.widget.RecyclerView c;

    public FragmentRecyclerNewBinding(com.google.android.material.floatingactionbutton.FloatingActionButton p1, android.widget.TextView p2, androidx.recyclerview.widget.RecyclerView p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerNewBinding bind(android.view.View p4)
    {
        com.cricfytv.sports.databinding.FragmentRecyclerNewBinding v0_0 = 2131361883;
        com.google.android.material.floatingactionbutton.FloatingActionButton v1_1 = ((com.google.android.material.floatingactionbutton.FloatingActionButton) tg.m(p4, 2131361883));
        if (v1_1 != null) {
            v0_0 = 2131362112;
            android.widget.TextView v2_1 = ((android.widget.TextView) tg.m(p4, 2131362112));
            if (v2_1 != null) {
                v0_0 = 2131362561;
                androidx.recyclerview.widget.RecyclerView v3_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p4, 2131362561));
                if (v3_1 != null) {
                    return new com.cricfytv.sports.databinding.FragmentRecyclerNewBinding(v1_1, v2_1, v3_1);
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p4.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerNewBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.FragmentRecyclerNewBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.FragmentRecyclerNewBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.FragmentRecyclerNewBinding v2_1 = p2.inflate(2131558489, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.FragmentRecyclerNewBinding.bind(v2_1);
    }
}

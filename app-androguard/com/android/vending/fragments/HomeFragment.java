package com.android.vending.fragments;
public final class HomeFragment extends u11 implements t53 {
    public static final synthetic mk1[] v0;
    public final tl1 q0;
    public final d31 r0;
    public final vk3 s0;
    public final vk3 t0;
    public final vk3 u0;

    static HomeFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.HomeFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentHomeBinding;");
        com.android.vending.fragments.HomeFragment.v0 = v1_2;
        return;
    }

    public HomeFragment()
    {
        super(2131558486);
        super.q0 = re2.I(bm1.p, new qv(super, new st(super, 3), 2));
        super.r0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentHomeBinding);
        super.s0 = new vk3(new ra1(super, 1));
        super.t0 = new vk3(new ra1(super, 2));
        super.u0 = new vk3(new u2(21));
        return;
    }

    public final void C(android.view.View p9)
    {
        com.android.vending.activities.MainActivity v9_13;
        p9.getClass();
        this.O().b.setText(this.j(2132017329, new Object[] {"Live Events"})));
        this.O().c.c.setOnClickListener(new pm(this, 7));
        com.android.vending.activities.MainActivity v9_7 = this.O();
        qa1 v1_3 = v9_7.f;
        v9_7.a.setAdapter(((dq0) this.t0.getValue()));
        re2.c0(v9_7.e);
        v9_7.g.setOnRefreshListener(new v8(this, 29));
        qa1 v3_0 = this.s0;
        if (!re2.H(this.G())) {
            sa1 v5_2 = ((jl) this.u0.getValue());
            androidx.recyclerview.widget.j[] v6_0 = new androidx.recyclerview.widget.j[2];
            v6_0[0] = ((ip1) v3_0.getValue());
            v6_0[1] = v5_2;
            v9_13 = new m20(v6_0);
        } else {
            v1_3.setPadding(0, 0, 0, 0);
            v1_3.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this.I(), 3));
            v1_3.addItemDecoration(new m71(3, this.h().getDimensionPixelSize(2131165738), 0));
            v9_13 = ((ip1) v3_0.getValue());
        }
        v1_3.setAdapter(v9_13);
        this.P().k.d(this.k(), new sa1(new qa1(this, 0), 0));
        al.b(this.P().i).d(this.k(), new sa1(new qa1(this, 1), 0));
        this.P().h.d(this.k(), new sa1(new qa1(this, 2), 0));
        ((com.android.vending.activities.MainActivity) this.G()).G = new ra1(this, 0);
        return;
    }

    public final com.cricfytv.sports.databinding.FragmentHomeBinding O()
    {
        return ((com.cricfytv.sports.databinding.FragmentHomeBinding) this.r0.c1(this, com.android.vending.fragments.HomeFragment.v0[0]));
    }

    public final vz3 P()
    {
        return ((vz3) this.q0.getValue());
    }

    public final void a(String p2)
    {
        p2.getClass();
        ng3 v1_2 = this.P().e;
        v1_2.getClass();
        v1_2.k(0, p2);
        return;
    }
}

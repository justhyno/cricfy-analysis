package com.android.vending.fragments;
public final class PlaylistFragment extends u11 implements t53 {
    public static final synthetic mk1[] t0;
    public final tl1 q0;
    public final d31 r0;
    public final vk3 s0;

    static PlaylistFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.PlaylistFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentPlaylistBinding;");
        com.android.vending.fragments.PlaylistFragment.t0 = v1_2;
        return;
    }

    public PlaylistFragment()
    {
        super(2131558487);
        super.q0 = re2.I(bm1.p, new qv(super, new st(super, 7), 4));
        super.r0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentPlaylistBinding);
        super.s0 = new vk3(new bo2(super, 1));
        return;
    }

    public final void C(android.view.View p6)
    {
        p6.getClass();
        this.O().b.setText(this.j(2132017329, new Object[] {"Channels"})));
        com.android.vending.activities.MainActivity v6_1 = this.O();
        v6_1.e.setOnRefreshListener(new of1(this, 10));
        v6_1.c.c.setOnClickListener(new ao2(this, 0));
        v6_1.b.setText(this.j(2132017329, new Object[] {"Channels"})));
        bo2 v0_2 = v6_1.f;
        int v1_5 = new do2(this, 0);
        bo2 v0_3 = v0_2.c0;
        if (!v0_3.contains(v1_5)) {
            v0_3.add(v1_5);
        }
        re2.V(this.O().d, ((ml2) this.s0.getValue()));
        v6_1.a.setOnClickListener(new ao2(this, 1));
        ((com.android.vending.activities.MainActivity) this.G()).G = new bo2(this, 0);
        return;
    }

    public final com.cricfytv.sports.databinding.FragmentPlaylistBinding O()
    {
        return ((com.cricfytv.sports.databinding.FragmentPlaylistBinding) this.r0.c1(this, com.android.vending.fragments.PlaylistFragment.t0[0]));
    }

    public final d04 P()
    {
        return ((d04) this.q0.getValue());
    }

    public final void a(String p2)
    {
        p2.getClass();
        ng3 v1_2 = this.P().f;
        v1_2.getClass();
        v1_2.k(0, p2);
        return;
    }

    public final void t(android.os.Bundle p4)
    {
        super.t(p4);
        this.P().i.d(this, new sa1(new co2(this, 0), 2));
        al.b(this.P().g).d(this, new sa1(new co2(this, 1), 2));
        al.b(this.P().g()).d(this, new sa1(new co2(this, 2), 2));
        return;
    }
}

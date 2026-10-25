package com.android.vending.fragments;
public final class ChannelsFragment extends u11 implements t53 {
    public static final synthetic mk1[] u0;
    public final d31 q0;
    public final tl1 r0;
    public final vk3 s0;
    public final vk3 t0;

    static ChannelsFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.ChannelsFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentRecyclerBinding;");
        com.android.vending.fragments.ChannelsFragment.u0 = v1_2;
        return;
    }

    public ChannelsFragment()
    {
        super(2131558488);
        super.q0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentRecyclerBinding);
        super.r0 = re2.I(bm1.p, new qv(super, new st(super, 1), 0));
        super.s0 = new vk3(new ov(super, 1));
        super.t0 = new vk3(new ov(super, 2));
        return;
    }

    public final void C(android.view.View p3)
    {
        p3.getClass();
        this.O().a.setText(this.j(2132017329, new Object[] {"Channels"})));
        this.O().b.c.setOnClickListener(new pm(this, 3));
        com.android.vending.activities.MainActivity v3_5 = this.O();
        re2.V(this.O().c, ((nv) this.t0.getValue()));
        v3_5.d.setOnRefreshListener(new v8(this, 7));
        ((com.android.vending.activities.MainActivity) this.G()).G = new ov(this, 0);
        return;
    }

    public final com.cricfytv.sports.databinding.FragmentRecyclerBinding O()
    {
        return ((com.cricfytv.sports.databinding.FragmentRecyclerBinding) this.q0.c1(this, com.android.vending.fragments.ChannelsFragment.u0[0]));
    }

    public final gz3 P()
    {
        return ((gz3) this.r0.getValue());
    }

    public final void a(String p2)
    {
        p2.getClass();
        ng3 v1_2 = this.P().c;
        v1_2.getClass();
        v1_2.k(0, p2);
        return;
    }

    public final void t(android.os.Bundle p4)
    {
        super.t(p4);
        ((n7) this.s0.getValue()).c(((com.android.vending.activities.MainActivity) this.G()));
        this.P().e.d(this, new nt(new y(this, 4), 1));
        return;
    }
}

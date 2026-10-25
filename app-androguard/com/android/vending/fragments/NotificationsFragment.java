package com.android.vending.fragments;
public final class NotificationsFragment extends u11 {
    public static final synthetic mk1[] t0;
    public final tl1 q0;
    public final d31 r0;
    public final vk3 s0;

    static NotificationsFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.NotificationsFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentRecyclerNewBinding;");
        com.android.vending.fragments.NotificationsFragment.t0 = v1_2;
        return;
    }

    public NotificationsFragment()
    {
        super(2131558489);
        super.q0 = re2.I(bm1.p, new qv(super, new st(super, 5), 3));
        super.r0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentRecyclerNewBinding);
        super.s0 = new vk3(new dc2(super, 3));
        return;
    }

    public final void C(android.view.View p6)
    {
        p6.getClass();
        com.google.android.material.floatingactionbutton.FloatingActionButton v6_1 = com.android.vending.fragments.NotificationsFragment.t0;
        androidx.recyclerview.widget.LinearLayoutManager v2_5 = this.r0;
        int v1_3 = ((com.cricfytv.sports.databinding.FragmentRecyclerNewBinding) v2_5.c1(this, v6_1[0]));
        ((com.cricfytv.sports.databinding.FragmentRecyclerNewBinding) v2_5.c1(this, v6_1[0])).b.setText(this.j(2132017329, new Object[] {"Notifications"})));
        v1_3.c.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.I(), 1, 0));
        v1_3.c.setAdapter(((zf2) this.s0.getValue()));
        com.google.android.material.floatingactionbutton.FloatingActionButton v6_7 = v1_3.a;
        v6_7.setImageResource(2131231095);
        v6_7.setOnClickListener(new pm(this, 9));
        return;
    }

    public final void t(android.os.Bundle p4)
    {
        super.t(p4);
        ((yz3) this.q0.getValue()).c.d(this, new nt(new zg2(this, 0), 6));
        return;
    }
}

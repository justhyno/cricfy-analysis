package com.android.vending.fragments;
public final class CatFragment extends u11 implements t53 {
    public static final synthetic mk1[] u0;
    public final nz3 q0;
    public final d31 r0;
    public final vk3 s0;
    public final vk3 t0;

    static CatFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.CatFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentRecyclerBinding;");
        com.android.vending.fragments.CatFragment.u0 = v1_2;
        return;
    }

    public CatFragment()
    {
        super(2131558488);
        lt v0_1 = re2.I(bm1.p, new ot(new ot(super, 0), 1));
        super.q0 = new nz3(pw2.a(fz3), new pt(v0_1, 0), new qt(0, super, v0_1), new pt(v0_1, 1));
        super.r0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentRecyclerBinding);
        super.s0 = new vk3(new lt(super, 1));
        super.t0 = new vk3(new lt(super, 2));
        return;
    }

    public final void C(android.view.View p7)
    {
        p7.getClass();
        this.O().a.setText(this.j(2132017329, new Object[] {"Categories"})));
        this.O().b.c.setOnClickListener(new pm(this, 1));
        com.android.vending.activities.MainActivity v7_5 = this.O();
        int v3 = 2;
        if (this.h().getConfiguration().orientation == 2) {
            v3 = 4;
        }
        this.O().c.setPadding(0, 0, 0, 0);
        re2.U(1, this.O().c, ((kt) this.t0.getValue()), v3);
        v7_5.d.setOnRefreshListener(new v8(this, 4));
        ((com.android.vending.activities.MainActivity) this.G()).G = new lt(this, 0);
        return;
    }

    public final com.cricfytv.sports.databinding.FragmentRecyclerBinding O()
    {
        return ((com.cricfytv.sports.databinding.FragmentRecyclerBinding) this.r0.c1(this, com.android.vending.fragments.CatFragment.u0[0]));
    }

    public final fz3 P()
    {
        return ((fz3) this.q0.getValue());
    }

    public final void a(String p2)
    {
        p2.getClass();
        ng3 v1_2 = this.P().b;
        v1_2.getClass();
        v1_2.k(0, p2);
        return;
    }

    public final void t(android.os.Bundle p6)
    {
        super.t(p6);
        this.P().f();
        t60 v6_5 = this.P();
        al.b(mc4.l(bf4.n(new lz0(v6_5.c, v6_5.b, new dz3(3, 0, 0), 0)), fe0.p)).d(this, new nt(new mt(this, 0), 0));
        return;
    }
}

package com.android.vending.fragments;
public final class FavouriteFragment extends u11 {
    public static final synthetic mk1[] t0;
    public final d31 q0;
    public final tl1 r0;
    public yt0 s0;

    static FavouriteFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.FavouriteFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentPlaylistBinding;");
        com.android.vending.fragments.FavouriteFragment.t0 = v1_2;
        return;
    }

    public FavouriteFragment()
    {
        super(2131558487);
        super.q0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentPlaylistBinding);
        super.r0 = re2.I(bm1.p, new qv(super, new st(super, 2), 1));
        return;
    }

    public final void C(android.view.View p6)
    {
        p6.getClass();
        androidx.recyclerview.widget.RecyclerView v6_1 = com.android.vending.fragments.FavouriteFragment.t0;
        int v2_1 = this.q0;
        ((com.cricfytv.sports.databinding.FragmentPlaylistBinding) v2_1.c1(this, v6_1[0])).b.setText(this.j(2132017329, new Object[] {"Favorites"})));
        androidx.recyclerview.widget.RecyclerView v6_5 = ((com.cricfytv.sports.databinding.FragmentPlaylistBinding) v2_1.c1(this, v6_1[0])).d;
        re2.W(v6_5, 0, 0, 0, 14);
        String v5_1 = this.s0;
        if (v5_1 == null) {
            rg1.U("favAdapter");
            throw 0;
        } else {
            v6_5.setAdapter(v5_1);
            return;
        }
    }

    public final void t(android.os.Bundle p4)
    {
        super.t(p4);
        this.s0 = new yt0(new eu0(this, 0), new eu0(this, 1));
        ((jz3) this.r0.getValue()).d.d(this, new nt(new eu0(this, 2), 2));
        return;
    }
}

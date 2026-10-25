package com.android.vending.fragments;
public final class PlaylistsFragment extends u11 {
    public static final synthetic mk1[] v0;
    public final vk3 q0;
    public final d31 r0;
    public final tl1 s0;
    public final vk3 t0;
    public final o11 u0;

    static PlaylistsFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.PlaylistsFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentRecyclerNewBinding;");
        com.android.vending.fragments.PlaylistsFragment.v0 = v1_2;
        return;
    }

    public PlaylistsFragment()
    {
        super(2131558489);
        super.q0 = new vk3(new po2(super, 0));
        super.r0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentRecyclerNewBinding);
        super.s0 = re2.I(bm1.p, new qv(super, new st(super, 8), 5));
        super.t0 = new vk3(new po2(super, 1));
        super.u0 = ((o11) super.F(new b5(1), new qo2(super)));
        return;
    }

    public final void C(android.view.View p4)
    {
        p4.getClass();
        as v4_8 = ((com.cricfytv.sports.databinding.FragmentRecyclerNewBinding) this.r0.c1(this, com.android.vending.fragments.PlaylistsFragment.v0[0]));
        v4_8.b.setText(this.j(2132017329, new Object[] {"Playlists"})));
        v4_8.c.setAdapter(((mo2) this.t0.getValue()));
        com.google.android.material.floatingactionbutton.FloatingActionButton v0_2 = v4_8.a;
        v0_2.setOnClickListener(new qs(15, this, v4_8));
        if (!re2.H(this.I())) {
            re2.M(v0_2, new as(this, 5));
        }
        return;
    }

    public final void O(boolean p10, es1 p11)
    {
        android.widget.LinearLayout v0_0 = this.c0;
        if (v0_0 == null) {
            v0_0 = this.x(0);
            this.c0 = v0_0;
        }
        com.android.vending.fragments.PlaylistsFragment v5_1;
        et0 v2_0 = 0;
        com.cricfytv.sports.databinding.PlaylistDetailsLyBinding v4 = com.cricfytv.sports.databinding.PlaylistDetailsLyBinding.inflate(v0_0, 0, 0);
        android.widget.LinearLayout v0_1 = v4.d;
        int v1_1 = v4.g;
        if (p10 == null) {
            v5_1 = "Update";
        } else {
            v5_1 = "Enter";
        }
        com.android.vending.fragments.PlaylistsFragment v5_4;
        v4.k.setText(this.j(2132017735, new Object[] {v5_1})));
        if (p10 == null) {
            v5_4 = 2132017807;
        } else {
            v5_4 = 2132017188;
        }
        ns1 v3_9;
        v4.i.setText(v5_4);
        es1 v6_2 = p11.c;
        v4.j.setText(p11.b);
        v1_1.setText(v6_2);
        if ((v6_2.length() != 0) && ((!android.webkit.URLUtil.isValidUrl(v6_2)) || (!zh3.B(v6_2, "http", 0)))) {
            v3_9 = 0;
        } else {
            v3_9 = 1;
        }
        v1_1.setEnabled(v3_9);
        int v1_3 = v4.f;
        ns1 v3_10 = v1_3.getEditText();
        if (v3_10 != null) {
            e8 v7_3;
            com.android.vending.fragments.PlaylistsFragment v5_7 = v1_3.getContext().getDrawable(2131231086);
            es1 v6_5 = v1_3.getContext().getDrawable(2131231297);
            e8 v7_1 = v3_10.getText();
            if ((v7_1 != null) && (v7_1.length() != 0)) {
                v7_3 = v5_7;
            } else {
                v7_3 = v6_5;
            }
            v1_3.setEndIconDrawable(v7_3);
            v3_10.addTextChangedListener(new ht0(v1_3, v3_10, v6_5, v5_7));
            v1_3.setEndIconOnClickListener(new qs(7, v3_10, v1_3));
        }
        if (p10 != null) {
            v2_0 = 8;
        }
        v0_1.setVisibility(v2_0);
        android.widget.LinearLayout v10_3 = this.I();
        et0 v2_1 = v4.a;
        v2_1.getClass();
        e8 v7_6 = re2.t(v10_3, v2_1);
        v7_6.show();
        android.widget.LinearLayout v10_4 = v7_6.getWindow();
        if (v10_4 != null) {
            v10_4.setSoftInputMode(16);
        }
        v4.c.setOnClickListener(new et0(v7_6, 9));
        v4.b.setOnClickListener(new et0(v7_6, 8));
        v0_1.setOnClickListener(new c7(this, p11, v7_6, 5));
        v4.h.setOnClickListener(new ns1(v4, this, p11, v7_6, 2));
        return;
    }

    public final void t(android.os.Bundle p4)
    {
        super.t(p4);
        ((f04) this.s0.getValue()).c.d(this, new nt(new y(this, 21), 7));
        return;
    }
}

package com.android.vending.fragments;
public final class CategorySelectionFragment extends gi0 {
    public static final synthetic mk1[] I0;
    public final d31 G0;
    public final tl1 H0;

    static CategorySelectionFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.CategorySelectionFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/CatChoseDialogBinding;");
        com.android.vending.fragments.CategorySelectionFragment.I0 = v1_2;
        return;
    }

    public CategorySelectionFragment()
    {
        super(2131558446);
        super.r0 = new zi(super, 5);
        super.s0 = new ci0(super);
        super.t0 = new di0(super);
        super.u0 = 0;
        super.v0 = 0;
        super.w0 = 1;
        super.x0 = 1;
        super.y0 = -1;
        super.A0 = new ei0(super);
        super.F0 = 0;
        super.G0 = ke2.w(super, com.cricfytv.sports.databinding.CatChoseDialogBinding);
        vk3 v3_1 = new vk3(new st(super, 0));
        super.H0 = re2.I(bm1.p, new ut(super, new tt(v3_1, 0), new tt(v3_1, 1)));
        return;
    }

    public final void A()
    {
        super.A();
        android.view.Window v3_1 = this.B0;
        if (v3_1 != null) {
            android.graphics.drawable.ColorDrawable v0_2 = v3_1.getWindow();
            if (v0_2 != null) {
                v0_2.setLayout(-1, -2);
            }
            android.view.Window v3_2 = v3_1.getWindow();
            if (v3_2 != null) {
                v3_2.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            }
        }
        return;
    }

    public final void C(android.view.View p5)
    {
        p5.getClass();
        xm4 v5_2 = al.b(((d04) this.H0.getValue()).g).e;
        if (v5_2 == ap1.k) {
            v5_2 = 0;
        }
        xm4 v5_3 = ((java.util.List) v5_2);
        if (v5_3 == null) {
            v5_3 = po0.o;
        }
        android.widget.ArrayAdapter v0_1 = new android.widget.ArrayAdapter(this.I(), 2131558498, v5_3);
        xm4 v5_6 = ((com.cricfytv.sports.databinding.CatChoseDialogBinding) this.G0.c1(this, com.android.vending.fragments.CategorySelectionFragment.I0[0]));
        com.google.android.material.appbar.MaterialToolbar v3 = v5_6.c;
        v5_6.b.setAdapter(v0_1);
        v5_6.b.setOnItemClickListener(new rt(this));
        v3.setNavigationOnClickListener(new pm(this, 2));
        androidx.appcompat.widget.SearchView v4_1 = v3.getMenu();
        v4_1.getClass();
        androidx.appcompat.widget.SearchView v4_2 = v4_1.getItem(0);
        v4_2.getClass();
        androidx.appcompat.widget.SearchView v4_3 = v4_2.getActionView();
        v4_3.getClass();
        ((androidx.appcompat.widget.SearchView) v4_3).setOnQueryTextListener(new xm4(v0_1));
        return;
    }
}

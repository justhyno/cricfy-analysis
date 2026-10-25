package com.android.vending.fragments;
public final class WebFragment extends u11 {
    public static final synthetic mk1[] t0;
    public final d31 q0;
    public final cb2 r0;
    public boolean s0;

    static WebFragment()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.fragments.WebFragment, "binding", "getBinding()Lcom/cricfytv/sports/databinding/FragmentWebBinding;");
        com.android.vending.fragments.WebFragment.t0 = v1_2;
        return;
    }

    public WebFragment()
    {
        super(2131558492);
        super.q0 = ke2.w(super, com.cricfytv.sports.databinding.FragmentWebBinding);
        super.r0 = new cb2(pw2.a(o24), new st(super, 10));
        return;
    }

    public final void C(android.view.View p6)
    {
        p6.getClass();
        com.google.android.material.button.MaterialButton v6_1 = this.O();
        v6_1.a.setOnChildScrollUpCallback(new of1(v6_1, 28));
        v6_1.a.setOnRefreshListener(new of1(this, 29));
        pm v0_0 = v6_1.c;
        org.chromium.support_lib_boundary.WebSettingsBoundaryInterface v1_1 = v0_0.getSettings();
        v1_1.setJavaScriptEnabled(1);
        v1_1.setDomStorageEnabled(1);
        v1_1.setJavaScriptCanOpenWindowsAutomatically(1);
        if (i34.a("FORCE_DARK")) {
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface v1_4 = v0_0.getSettings();
            Class v2_2 = i34.e;
            if (!v2_2.a()) {
                if (!v2_2.b()) {
                    tq0.k("This method is not supported by the current version of the framework and the current WebView APK");
                    return;
                } else {
                    ((org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) vo.f(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface, ((org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) j34.a.p).convertSettings(v1_4))).setForceDark(2);
                }
            } else {
                xa.d(v1_4, 2);
            }
        }
        v0_0.setWebViewClient(new n24(this, v6_1));
        v6_1.b.c.setOnClickListener(new pm(this, 16));
        this.P();
        return;
    }

    public final com.cricfytv.sports.databinding.FragmentWebBinding O()
    {
        return ((com.cricfytv.sports.databinding.FragmentWebBinding) this.q0.c1(this, com.android.vending.fragments.WebFragment.t0[0]));
    }

    public final void P()
    {
        android.widget.LinearLayout v0_0 = this.O();
        v0_0.a.setRefreshing(1);
        android.webkit.WebView v1_1 = v0_0.c;
        v1_1.setVisibility(0);
        android.widget.LinearLayout v0_2 = v0_0.b.a;
        v0_2.getClass();
        v0_2.setVisibility(8);
        v1_1.loadUrl(((o24) this.r0.getValue()).b);
        return;
    }

    public final void t(android.os.Bundle p3)
    {
        super.t(p3);
        ne2.d(this.G().getOnBackPressedDispatcher(), this, new as3(this, 4), 2);
        return;
    }

    public final void v()
    {
        this.O().c.destroy();
        this.V = 1;
        return;
    }
}

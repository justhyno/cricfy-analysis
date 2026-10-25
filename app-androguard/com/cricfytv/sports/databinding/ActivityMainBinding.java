package com.cricfytv.sports.databinding;
public final class ActivityMainBinding implements dy3 {
    public final androidx.drawerlayout.widget.DrawerLayout a;
    public final android.widget.FrameLayout b;
    public final com.google.android.material.card.MaterialCardView c;
    public final me.ibrahimsn.lib.SmoothBottomBar d;
    public final androidx.drawerlayout.widget.DrawerLayout e;
    public final android.widget.LinearLayout f;
    public final androidx.fragment.app.FragmentContainerView g;
    public final com.google.android.material.navigation.NavigationView h;
    public final com.android.vending.ui.OverlayInsetsLayout i;
    public final com.google.android.material.appbar.MaterialToolbar j;
    public final androidx.appcompat.widget.SearchView k;
    public final com.cricfytv.sports.databinding.TvTopLyBinding l;
    public final android.widget.FrameLayout m;

    public ActivityMainBinding(androidx.drawerlayout.widget.DrawerLayout p1, android.widget.FrameLayout p2, com.google.android.material.card.MaterialCardView p3, me.ibrahimsn.lib.SmoothBottomBar p4, androidx.drawerlayout.widget.DrawerLayout p5, android.widget.LinearLayout p6, androidx.fragment.app.FragmentContainerView p7, com.google.android.material.navigation.NavigationView p8, com.android.vending.ui.OverlayInsetsLayout p9, com.google.android.material.appbar.MaterialToolbar p10, androidx.appcompat.widget.SearchView p11, com.cricfytv.sports.databinding.TvTopLyBinding p12, android.widget.FrameLayout p13)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10;
        this.k = p11;
        this.l = p12;
        this.m = p13;
        return;
    }

    public static com.cricfytv.sports.databinding.ActivityMainBinding bind(android.view.View p17)
    {
        int v1_0 = 2131361930;
        android.widget.FrameLayout v5_1 = ((android.widget.FrameLayout) tg.m(p17, 2131361930));
        if (v5_1 != null) {
            v1_0 = 2131361934;
            com.google.android.material.card.MaterialCardView v6_1 = ((com.google.android.material.card.MaterialCardView) tg.m(p17, 2131361934));
            if (v6_1 != null) {
                v1_0 = 2131361937;
                me.ibrahimsn.lib.SmoothBottomBar v7_1 = ((me.ibrahimsn.lib.SmoothBottomBar) tg.m(p17, 2131361937));
                if (v7_1 != null) {
                    v1_0 = 2131362322;
                    android.widget.LinearLayout v9_1 = ((android.widget.LinearLayout) tg.m(p17, 2131362322));
                    if (v9_1 != null) {
                        v1_0 = 2131362461;
                        androidx.fragment.app.FragmentContainerView v10_1 = ((androidx.fragment.app.FragmentContainerView) tg.m(p17, 2131362461));
                        if (v10_1 != null) {
                            v1_0 = 2131362463;
                            com.google.android.material.navigation.NavigationView v11_1 = ((com.google.android.material.navigation.NavigationView) tg.m(p17, 2131362463));
                            if (v11_1 != null) {
                                v1_0 = 2131362519;
                                com.android.vending.ui.OverlayInsetsLayout v12_1 = ((com.android.vending.ui.OverlayInsetsLayout) tg.m(p17, 2131362519));
                                if (v12_1 != null) {
                                    v1_0 = 2131362753;
                                    com.google.android.material.appbar.MaterialToolbar v13_1 = ((com.google.android.material.appbar.MaterialToolbar) tg.m(p17, 2131362753));
                                    if (v13_1 != null) {
                                        v1_0 = 2131362788;
                                        androidx.appcompat.widget.SearchView v14_1 = ((androidx.appcompat.widget.SearchView) tg.m(p17, 2131362788));
                                        if (v14_1 != null) {
                                            v1_0 = 2131362790;
                                            android.view.View v2_8 = tg.m(p17, 2131362790);
                                            if (v2_8 != null) {
                                                com.cricfytv.sports.databinding.TvTopLyBinding v15 = com.cricfytv.sports.databinding.TvTopLyBinding.bind(v2_8);
                                                v1_0 = 2131362791;
                                                android.widget.FrameLayout v16_1 = ((android.widget.FrameLayout) tg.m(p17, 2131362791));
                                                if (v16_1 != null) {
                                                    return new com.cricfytv.sports.databinding.ActivityMainBinding(((androidx.drawerlayout.widget.DrawerLayout) p17), v5_1, v6_1, v7_1, ((androidx.drawerlayout.widget.DrawerLayout) p17), v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15, v16_1);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p17.getResources().getResourceName(v1_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.ActivityMainBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ActivityMainBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ActivityMainBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ActivityMainBinding v2_1 = p2.inflate(2131558429, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ActivityMainBinding.bind(v2_1);
    }
}

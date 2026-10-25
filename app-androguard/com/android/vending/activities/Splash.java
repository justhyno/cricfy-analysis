package com.android.vending.activities;
public final class Splash extends androidx.appcompat.app.AppCompatActivity {
    public static final synthetic mk1[] A;
    public final j5 w;
    public final tl1 x;
    public final u00 y;
    public boolean z;

    static Splash()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.activities.Splash, "binding", "getBinding()Lcom/cricfytv/sports/databinding/ActivitySplashBinding;");
        com.android.vending.activities.Splash.A = v1_2;
        return;
    }

    public Splash()
    {
        super(2131558432);
        super.w = rg1.q(super, com.cricfytv.sports.databinding.ActivitySplashBinding);
        super.x = re2.I(bm1.p, new st(super, 9));
        super.y = hx4.a();
        return;
    }

    public final com.cricfytv.sports.databinding.ActivitySplashBinding T()
    {
        return ((com.cricfytv.sports.databinding.ActivitySplashBinding) this.w.c1(this, com.android.vending.activities.Splash.A[0]));
    }

    public final n04 U()
    {
        return ((n04) this.x.getValue());
    }

    public final void V(android.os.Bundle p10, Class p11)
    {
        com.android.vending.activities.Splash v2_0;
        p75 v0_4 = ((n7) rf2.g(this).d(pw2.a(n7), 0));
        String v6 = this.getString(2132017769);
        v6.getClass();
        if (!v0_4.a(6, v6)) {
            v2_0 = this;
            android.content.Intent v9_1 = new android.content.Intent;
            v9_1(this, p11);
            if (p10 != null) {
                v9_1.putExtras(p10);
            }
            this.startActivity(v9_1);
        } else {
            String v4 = this.getString(2132017801);
            v4.getClass();
            String v5 = this.getString(2132017800);
            v5.getClass();
            com.android.vending.activities.AlertNew.F.getClass();
            v2_0 = this;
            p75.B(this, 6, v4, v5, v6, p11, p10);
        }
        v2_0.finish();
        return;
    }

    public final Object W(c60 p5)
    {
        z60 v0_3;
        if (!(p5 instanceof oe3)) {
            v0_3 = new oe3(this, p5);
        } else {
            v0_3 = ((oe3) p5);
            int v1_2 = ((oe3) p5).q;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((oe3) p5).q = (v1_2 - -2147483648);
            }
        }
        io.cashraven.sdk.CashRavenService$Companion v5_1 = v0_3.o;
        int v1_1 = v0_3.q;
        if (v1_1 == 0) {
            rf2.t(v5_1);
            v0_3.q = 1;
            z60 v0_2 = z60.o;
            if (this.y.m(v0_3) == v0_2) {
                return v0_2;
            }
        } else {
            if (v1_1 != 1) {
                c.h("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                rf2.t(v5_1);
            }
        }
        io.cashraven.sdk.CashRavenService$Companion v5_4 = this.getApplication();
        v5_4.getClass();
        io.cashraven.sdk.CashRavenService$Companion v5_6 = ((com.android.vending.App) v5_4).o;
        if (v5_6 == null) {
            rg1.U("cashRaven");
            throw 0;
        } else {
            v5_6.optIn();
            io.cashraven.sdk.CashRavenService.Companion.start(this);
            return mu3.a;
        }
    }

    public final void X()
    {
        if (!this.z) {
            vo.r(s03.h(this), 0, new ne3(this, 0, 2), 3);
            return;
        } else {
            return;
        }
    }

    public final void onCreate(android.os.Bundle p13)
    {
        super.onCreate(p13);
        this.setContentView(this.T().a);
        String v13_29 = this.T().a;
        v13_29.getClass();
        zm0.a(this, 0, 3);
        ky3.c(v13_29, new tq0(4));
        this.registerForActivityResult(new b5(1), new of1(this, 17));
        this.T().c.c.setOnClickListener(new ke3(this, 1));
        String v13_23 = this.T();
        v13_23.j.setOnClickListener(new ke3(this, 2));
        v13_23.f.setOnClickListener(new ke3(this, 3));
        v13_23.g.setOnClickListener(new qs(16, v13_23, this));
        this.U().e.d(this, new nt(new y(this, 29), 8));
        f85 v2_15 = this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionName;
        if (v2_15 == null) {
            v2_15 = "";
        }
        this.T().i.setText(this.getString(2132017812, new Object[] {v2_15})));
        if (!"com.cricfytv.sports".equals(this.getPackageName())) {
            this.finishAffinity();
        } else {
            String v13_33 = this.getFilesDir().getPath();
            v13_33.getClass();
            f85 v2_19 = v13_33.length();
            w10 v3_28 = 0;
            tq0 v6_9 = 0;
            while (v3_28 < v2_19) {
                String v7_4 = v13_33.charAt(v3_28);
                if (v6_9 > 3) {
                    break;
                }
                if (v7_4 == 46) {
                    v6_9++;
                }
                v3_28++;
            }
            if ((sh3.F(v13_33, "999")) || (v6_9 > 3)) {
            } else {
                if ((!re2.H(this)) && (!re2.i(this))) {
                    this.finishAffinity();
                } else {
                    tq0 v6_1;
                    String v13_7 = ((yx2) com.google.firebase.FirebaseApp.getInstance().get(yx2)).c();
                    v13_7.getClass();
                    f85 v2_2 = v13_7.c;
                    w10 v3_1 = this.U().b;
                    if (!v3_1.getBoolean("PUSH_RC", 0)) {
                        v6_1 = 43200;
                    } else {
                        w10 v3_3 = v3_1.edit();
                        v3_3.getClass();
                        v3_3.putBoolean("PUSH_RC", 0);
                        v3_3.apply();
                        v6_1 = 0;
                    }
                    w10 v3_5 = new yw0();
                    v3_5.a = 43200;
                    if (v6_1 < 0) {
                        IllegalArgumentException v12_1 = new IllegalArgumentException;
                        String v13_9 = new StringBuilder("Minimum interval between fetches has to be a non-negative number. ");
                        v13_9.append(v6_1);
                        v13_9.append(" is an invalid argument");
                        v12_1(v13_9.toString());
                        throw v12_1;
                    } else {
                        v3_5.a = v6_1;
                        tq0 v6_3 = new yw0();
                        v6_3.a = v3_5.a;
                        jl4.f(v2_2, new e9(5, v13_7, v6_3));
                        v13_7.d();
                        w10 v3_8 = v13_7.g;
                        tq0 v6_6 = v3_8.g.a.getLong("minimum_fetch_interval_in_seconds", 43200);
                        java.util.HashMap v8_3 = new java.util.HashMap(v3_8.h);
                        v8_3.put("X-Firebase-RC-Fetch-Type", "BASE/1");
                        v3_8.e.b().d(v3_8.c, new z20(v3_8, v6_6, v8_3)).l(gw0.o, new tq0(17)).l(v2_2, new cb(v13_7)).i(new w10(21, v13_7, this));
                    }
                }
            }
        }
        vo.r(s03.h(this), 0, new ne3(this, 0, 0), 3);
        if ((android.os.Build$VERSION.SDK_INT < 33) || (re2.l(this, "android.permission.POST_NOTIFICATIONS") == 0)) {
            this.y.L(Boolean.TRUE);
            return;
        } else {
            re2.T(this, new String[] {"android.permission.POST_NOTIFICATIONS"}), 101);
            return;
        }
    }

    public final void onRequestPermissionsResult(int p1, String[] p2, int[] p3)
    {
        p2.getClass();
        p3.getClass();
        super.onRequestPermissionsResult(p1, p2, p3);
        if (p1 == 101) {
            this.y.L(Boolean.TRUE);
        }
        return;
    }
}

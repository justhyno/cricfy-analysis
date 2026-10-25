package com.android.vending.player;
public final class PlayerActivity extends com.android.vending.player.BasePlayerActivity implements dm2 {
    public static final synthetic mk1[] H;
    public final tl1 D;
    public final j5 E;
    public com.cricfytv.sports.databinding.PlayerViewBinding F;
    public final vk3 G;

    static PlayerActivity()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.player.PlayerActivity, "binding", "getBinding()Lcom/cricfytv/sports/databinding/ActivityPlayerBinding;");
        com.android.vending.player.PlayerActivity.H = v1_2;
        return;
    }

    public PlayerActivity()
    {
        this.D = re2.I(bm1.p, new st(this, 6));
        this.E = rg1.q(this, com.cricfytv.sports.databinding.ActivityPlayerBinding);
        this.G = new vk3(new hm2(this, 0));
        return;
    }

    public final com.cricfytv.sports.databinding.ActivityPlayerBinding T()
    {
        return ((com.cricfytv.sports.databinding.ActivityPlayerBinding) this.E.c1(this, com.android.vending.player.PlayerActivity.H[0]));
    }

    public final com.android.vending.player.CricfyPlayerView U()
    {
        int v0_1 = this.F;
        if (v0_1 == 0) {
            rg1.U("playerBinding");
            throw 0;
        } else {
            return v0_1.b;
        }
    }

    public final boolean Y()
    {
        return this.h0().c.c.a;
    }

    public final boolean Z()
    {
        int v1_5 = ((Boolean) this.h0().b.a("isFullScreen"));
        if (v1_5 == 0) {
            return 0;
        } else {
            return v1_5.booleanValue();
        }
    }

    public final void b0(ho2 p2)
    {
        java.util.List v0_0;
        rn2 v1_2 = this.h0().c;
        v1_2.getClass();
        java.util.List v0_2 = v1_2.c.e;
        if (v0_2 == null) {
            v0_0 = 0;
        } else {
            java.util.List v0_3 = v0_2.getItems();
            if (v0_3 == null) {
            } else {
                v0_0 = lz.T0(v0_3);
            }
        }
        if (v0_0 != null) {
            v1_2.b(p2, v0_0);
        }
        return;
    }

    public final void c0(int p1, String p2)
    {
        this.h0().c.g(p1, p2);
        return;
    }

    public final void e0(android.content.Intent p5)
    {
        String v5_1 = p5.getData();
        if (v5_1 != null) {
            rn2 v4_2 = this.h0().c;
            String v5_2 = v5_1.toString();
            v5_2.getClass();
            v4_2.f(new jm2(v5_2, 0, 60, 1));
            return;
        } else {
            return;
        }
    }

    public final void f0()
    {
        android.app.PictureInPictureParams v0_2 = new android.util.Rational(16, 9);
        android.app.PictureInPictureParams$Builder v1_2 = new android.app.PictureInPictureParams$Builder();
        v1_2.setAspectRatio(v0_2);
        if (android.os.Build$VERSION.SDK_INT == 31) {
            o61.i(v1_2);
        }
        this.enterPictureInPictureMode(v1_2.build());
        return;
    }

    public final t70 g0()
    {
        return ((t70) this.G.getValue());
    }

    public final zz3 h0()
    {
        return ((zz3) this.D.getValue());
    }

    public final boolean i0()
    {
        if ((android.os.Build$VERSION.SDK_INT < 26) || ((re2.H(this)) || (!this.getPackageManager().hasSystemFeature("android.software.picture_in_picture")))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void onConfigurationChanged(android.content.res.Configuration p3)
    {
        boolean v3_4;
        p3.getClass();
        super.onConfigurationChanged(p3);
        if (p3.orientation != 2) {
            v3_4 = 0;
        } else {
            v3_4 = 1;
        }
        this.h0().b.b(Boolean.valueOf(v3_4), "isFullScreen");
        this.V(this.Z());
        return;
    }

    public final void onCreate(android.os.Bundle p10)
    {
        im2 v0_0 = re2.H(this);
        tb.l();
        if (v0_0 != null) {
            this.setRequestedOrientation(6);
        }
        super.onCreate(p10);
        this.F = com.cricfytv.sports.databinding.PlayerViewBinding.inflate(this.getLayoutInflater(), 0, 0);
        android.content.Intent v10_10 = this.T();
        gm2 v3_0 = this.F;
        if (v3_0 == null) {
            rg1.U("playerBinding");
            throw 0;
        } else {
            v10_10.f.addView(v3_0.b);
            android.content.Intent v10_12 = this.F;
            if (v10_12 == null) {
                rg1.U("playerBinding");
                throw 0;
            } else {
                v10_12.b.setOnRetry(new hm2(this, 1));
                this.h0().c.h.d(this, new sa1(new im2(this, 1), 1));
                this.h0().c.g.d(this, new sa1(new im2(this, 2), 1));
                android.content.Intent v10_20 = this.F;
                if (v10_20 == null) {
                    rg1.U("playerBinding");
                    throw 0;
                } else {
                    gm2 v3_13;
                    android.content.Intent v10_22 = v10_20.b.getControllerBinding();
                    android.widget.ImageButton v4_1 = v10_22.g;
                    android.widget.ImageButton v7_2 = v10_22.k;
                    v10_22.m.setVisibility(0);
                    v10_22.e.setOnClickListener(new gm2(this, 2));
                    v10_22.m.setOnClickListener(new gm2(this, 3));
                    if ((!this.i0()) || (re2.H(this))) {
                        v3_13 = 8;
                    } else {
                        v3_13 = 0;
                    }
                    v7_2.setVisibility(v3_13);
                    if (v7_2.getVisibility() == 0) {
                        v7_2.setOnClickListener(new gm2(this, 4));
                    }
                    v4_1.setVisibility(0);
                    v4_1.setOnClickListener(new gm2(this, 0));
                    v10_22.d.setOnClickListener(new gm2(this, 1));
                    re2.c0(this.T().d);
                    this.W();
                    if (v0_0 == null) {
                        ((n7) rf2.g(this).d(pw2.a(n7), 0)).c(this);
                    }
                    al.b(this.h0().c.e).d(this, new sa1(new im2(this, 0), 1));
                    android.content.Intent v10_9 = this.getIntent();
                    v10_9.getClass();
                    this.e0(v10_9);
                    return;
                }
            }
        }
    }

    public final void onDestroy()
    {
        t70 v0 = this.g0();
        y83 v1_0 = v0.h;
        if (v1_0 != null) {
            bf4.f();
            y83 v1_1 = v1_0.c;
            if (v1_1 != null) {
                v1_1.e(v0.m);
            }
        }
        v0.i();
        super.onDestroy();
        return;
    }

    public final void onNewIntent(android.content.Intent p3)
    {
        p3.getClass();
        if (p3.getData() != null) {
            this.e0(p3);
        } else {
            boolean v0_5 = p3.getExtras();
            if (v0_5) {
                this.h0().c.f(s03.d(v0_5));
            }
        }
        this.d0(this.h0().c.c.a);
        super.onNewIntent(p3);
        return;
    }

    public final void onPause()
    {
        if ((!this.i0()) || (!this.isInPictureInPictureMode())) {
            cs0 v0_3 = this.g0().e;
            if (v0_3 != null) {
                v0_3.V(0);
            }
        }
        super.onPause();
        return;
    }

    public final void onPictureInPictureModeChanged(boolean p4, android.content.res.Configuration p5)
    {
        p5.getClass();
        t70 v0_0 = this.F;
        if (v0_0 == null) {
            rg1.U("playerBinding");
            throw 0;
        } else {
            t70 v0_6 = v0_0.b;
            if (!p4) {
                this.d0(0);
                v0_6.setUseController(1);
                v0_6.i();
            } else {
                v0_6.setUseController(0);
                this.d0(1);
            }
            if ((!p4) && (!mc4.u(new nm1[] {nm1.s, nm1.r})).contains(this.getLifecycle().b()))) {
                this.g0().i();
                this.finish();
            }
            super.onPictureInPictureModeChanged(p4, p5);
            return;
        }
    }

    public final void onResume()
    {
        super.onResume();
        this.V(this.Z());
        cs0 v0_3 = this.F;
        if (v0_3 == null) {
            rg1.U("playerBinding");
            throw 0;
        } else {
            int v1_4;
            cs0 v0_0 = v0_3.b;
            int v1_3 = ((Boolean) this.h0().b.a("locked"));
            if (v1_3 == 0) {
                v1_4 = 0;
            } else {
                v1_4 = v1_3.booleanValue();
            }
            v0_0.setLock(v1_4);
            int v3_1 = this.g0();
            cs0 v0_2 = v3_1.e;
            if (v0_2 == null) {
                t70.g(v3_1);
                return;
            } else {
                v0_2.V(1);
                return;
            }
        }
    }

    public final void onUserLeaveHint()
    {
        if ((!re2.H(this)) && (this.i0())) {
            this.f0();
        }
        super.onUserLeaveHint();
        return;
    }
}

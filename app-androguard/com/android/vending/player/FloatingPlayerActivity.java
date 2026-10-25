package com.android.vending.player;
public final class FloatingPlayerActivity extends com.android.vending.player.BasePlayerActivity {
    public static final synthetic mk1[] J;
    public final j5 D;
    public wx0 E;
    public com.android.vending.player.CricfyPlayerView F;
    public boolean G;
    public String H;
    public final z8 I;

    static FloatingPlayerActivity()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.player.FloatingPlayerActivity, "binding", "getBinding()Lcom/cricfytv/sports/databinding/ActivityPlayerBinding;");
        com.android.vending.player.FloatingPlayerActivity.J = v1_2;
        return;
    }

    public FloatingPlayerActivity()
    {
        this.D = rg1.q(this, com.cricfytv.sports.databinding.ActivityPlayerBinding);
        this.H = "";
        this.I = new z8(this, 4);
        return;
    }

    public final com.cricfytv.sports.databinding.ActivityPlayerBinding T()
    {
        return ((com.cricfytv.sports.databinding.ActivityPlayerBinding) this.D.c1(this, com.android.vending.player.FloatingPlayerActivity.J[0]));
    }

    public final com.android.vending.player.CricfyPlayerView U()
    {
        int v0_1 = this.F;
        if (v0_1 == 0) {
            rg1.U("playerView");
            throw 0;
        } else {
            return v0_1;
        }
    }

    public final boolean Y()
    {
        int v0_1 = this.E;
        if (v0_1 == 0) {
            rg1.U("playerManager");
            throw 0;
        } else {
            return v0_1.c().c.a;
        }
    }

    public final boolean Z()
    {
        return this.G;
    }

    public final void b0(ho2 p3)
    {
        String v2_1 = this.E;
        java.util.List v0 = 0;
        if (v2_1 == null) {
            rg1.U("playerManager");
            throw 0;
        } else {
            String v2_3 = v2_1.c();
            v2_3.getClass();
            java.util.List v1_0 = v2_3.c.e;
            if (v1_0 != null) {
                java.util.List v1_1 = v1_0.getItems();
                if (v1_1 != null) {
                    v0 = lz.T0(v1_1);
                }
            }
            if (v0 != null) {
                v2_3.b(p3, v0);
            }
            return;
        }
    }

    public final void c0(int p1, String p2)
    {
        int v0_1 = this.E;
        if (v0_1 == 0) {
            rg1.U("playerManager");
            throw 0;
        } else {
            v0_1.c().g(p1, p2);
            return;
        }
    }

    public final void i()
    {
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).sendBroadcast(new android.content.Intent(re2.g0("FLOATING_PLAYER_EXIT_FULLSCREEN", this.H)));
        this.finish();
        return;
    }

    public final void onConfigurationChanged(android.content.res.Configuration p2)
    {
        int v2_2;
        p2.getClass();
        super.onConfigurationChanged(p2);
        if (p2.orientation != 2) {
            v2_2 = 0;
        } else {
            v2_2 = 1;
        }
        this.G = v2_2;
        this.V(v2_2);
        return;
    }

    public final void onCreate(android.os.Bundle p5)
    {
        super.onCreate(p5);
        t60 v5_4 = this.getIntent().getStringExtra("key");
        if ((v5_4 == null) || (v5_4.length() == 0)) {
            v5_4 = 0;
        }
        if (v5_4 != null) {
            this.H = v5_4;
            nt v1_3 = com.android.vending.player.FloatingPlayerService.u;
            if (v1_3 != null) {
                t60 v5_6 = ((wx0) v1_3.q.get(v5_4));
                if (v5_6 != null) {
                    t60 v5_12;
                    this.E = v5_6;
                    this.F = v5_6.b().b;
                    t60 v5_11 = this.U().getParent();
                    if (!(v5_11 instanceof android.view.ViewGroup)) {
                        v5_12 = 0;
                    } else {
                        v5_12 = ((android.view.ViewGroup) v5_11);
                    }
                    if (v5_12 != null) {
                        v5_12.removeView(this.U());
                    }
                    this.U().setLayoutParams(new android.view.ViewGroup$LayoutParams(-1, -1));
                    this.T().f.addView(this.U());
                    t60 v5_17 = this.U().getControllerBinding();
                    v5_17.m.setVisibility(0);
                    v5_17.m.setOnClickListener(new qx0(this, 0));
                    nt v1_12 = v5_17.g;
                    v1_12.setVisibility(0);
                    v1_12.setOnClickListener(new qx0(this, 1));
                    v5_17.k.setVisibility(8);
                    re2.c0(this.T().d);
                    t60 v5_21 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this);
                    nt v1_15 = new android.content.IntentFilter();
                    v1_15.addAction(re2.g0("FLOATING_PLAYER_EXIT_FULLSCREEN", this.H));
                    v1_15.addAction(re2.g0("FLOATING_WINDOW_CLOSED", this.H));
                    v5_21.registerReceiver(this.I, v1_15);
                    this.W();
                    if (re2.H(this)) {
                        return;
                    } else {
                        t60 v5_23 = this.E;
                        if (v5_23 == null) {
                            rg1.U("playerManager");
                            throw 0;
                        } else {
                            al.b(v5_23.c().e).d(this, new nt(new y(this, 11), 3));
                            return;
                        }
                    }
                }
            }
            this.finish();
            return;
        } else {
            this.finish();
            return;
        }
    }

    public final void onDestroy()
    {
        if (this.F != null) {
            this.U().getControllerBinding().m.setOnClickListener(0);
        }
        android.widget.ImageButton v0_12 = com.android.vending.player.FloatingPlayerService.u;
        if (v0_12 != null) {
            int v1_0 = this.H;
            v1_0.getClass();
            android.widget.ImageButton v0_3 = ((wx0) v0_12.q.get(v1_0));
            if (v0_3 != null) {
                v0_3.o = 0;
                wx0.g(v0_3);
                v0_3.b().b.b0.g.setImageResource(2131230986);
            }
        }
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(this.I);
        super.onDestroy();
        return;
    }

    public final void onPause()
    {
        if (!this.isFinishing()) {
            fm2 v0_2 = this.U().getPlayer();
            if (v0_2 != null) {
                v0_2.pause();
            }
        }
        super.onPause();
        return;
    }

    public final void onResume()
    {
        super.onResume();
        this.V(this.G);
        this.U().setLock(0);
        fm2 v2_1 = this.U().getPlayer();
        if (v2_1 != null) {
            v2_1.l0();
        }
        return;
    }
}

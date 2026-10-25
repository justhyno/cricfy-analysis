package com.android.vending.player;
public final class CricfyPlayerView extends androidx.media3.ui.PlayerView {
    public static final synthetic int g0;
    public final com.cricfytv.sports.databinding.ExoPlayerViewBinding a0;
    public final com.cricfytv.sports.databinding.ExoPlayerControlViewBinding b0;
    public boolean c0;
    public final com.google.android.material.chip.ChipGroup d0;
    public rn2 e0;
    public boolean f0;

    public CricfyPlayerView(android.content.Context p3)
    {
        p3.getClass();
        this(p3, 0, 6);
        return;
    }

    public CricfyPlayerView(android.content.Context p2, android.util.AttributeSet p3)
    {
        p2.getClass();
        this(p2, p3, 4);
        return;
    }

    public CricfyPlayerView(android.content.Context p6, android.util.AttributeSet p7, int p8)
    {
        if ((p8 & 2) != 0) {
            p7 = 0;
        }
        super(p6, p7, 0);
        super.a0 = com.cricfytv.sports.databinding.ExoPlayerViewBinding.bind(super);
        android.view.GestureDetector v6_1 = com.cricfytv.sports.databinding.ExoPlayerControlViewBinding.bind(super);
        y6 v7_1 = v6_1.i;
        super.b0 = v6_1;
        super.d0 = v6_1.q;
        super.setErrorMessageProvider(new da5(super, 5));
        qs v1_3 = super.getContext();
        v1_3.getClass();
        if (re2.H(v1_3)) {
            super.setControllerVisibilityListener(new v8(super, 10));
        }
        v6_1.e.setOnClickListener(new u70(super, 0));
        v6_1.h.setOnClickListener(new qs(4, v6_1, super));
        v6_1.b.setOnClickListener(new u70(super, 1));
        qs v1_10 = super.getContext();
        v1_10.getClass();
        if (!re2.H(v1_10)) {
            super.setShowNextButton(0);
            super.setShowPreviousButton(0);
        }
        v70 v8_4 = new jw2();
        v7_1.setImageResource(2131231331);
        v7_1.setOnClickListener(new qs(5, super, v8_4));
        v6_1.j.setOnClickListener(new u70(super, 2));
        v6_1.l.setOnClickListener(new u70(super, 3));
        super.setOnTouchListener(new y6(new android.view.GestureDetector(super.getContext(), new v70(super)), 2));
        return;
    }

    public static void s(android.view.View p2, android.view.ViewGroup p3, Integer p4)
    {
        int v0_1;
        int v0_0 = p2.getParent();
        if (!(v0_0 instanceof android.view.ViewGroup)) {
            v0_1 = 0;
        } else {
            v0_1 = ((android.view.ViewGroup) v0_0);
        }
        if (!rg1.a(v0_1, p3)) {
            if (v0_1 != 0) {
                v0_1.removeView(p2);
            }
            if (p4 == 0) {
                p3.addView(p2);
                return;
            } else {
                p3.addView(p2, p4.intValue());
                return;
            }
        } else {
            return;
        }
    }

    public static com.android.vending.player.BasePlayerActivity t(android.content.Context p1)
    {
        if (!(p1 instanceof com.android.vending.player.BasePlayerActivity)) {
            if (!(p1 instanceof android.content.ContextWrapper)) {
                return 0;
            } else {
                int v1_5 = ((android.content.ContextWrapper) p1).getBaseContext();
                v1_5.getClass();
                return com.android.vending.player.CricfyPlayerView.t(v1_5);
            }
        } else {
            return ((com.android.vending.player.BasePlayerActivity) p1);
        }
    }

    public static void w(com.android.vending.player.CricfyPlayerView p6, boolean p7, com.android.vending.player.BasePlayerActivity p8, int p9)
    {
        if ((p9 & 2) != 0) {
            p8 = 0;
        }
        int v9_2;
        if ((p9 & 4) == 0) {
            v9_2 = 0;
        } else {
            v9_2 = 1;
        }
        if (p8 == null) {
            p8 = p6.getContext();
        } else {
            p6.getClass();
        }
        p8.getClass();
        if (!re2.H(p8)) {
            android.widget.LinearLayout v1_2 = p6.b0.s;
            androidx.mediarouter.app.MediaRouteButton v3_0 = v1_2.findViewWithTag("media_cast_btn");
            if (!p7) {
                if (v3_0 != null) {
                    v1_2.removeView(v3_0);
                }
            } else {
                if (v3_0 == null) {
                    androidx.mediarouter.app.MediaRouteButton v3_2 = new androidx.mediarouter.app.MediaRouteButton(p8);
                    v3_2.setTag("media_cast_btn");
                    int v4_2 = new android.widget.LinearLayout$LayoutParams(v3_2.getResources().getDimensionPixelSize(2131165416), v3_2.getResources().getDimensionPixelSize(2131165416));
                    int v2_4 = v3_2.getResources().getDimensionPixelSize(2131165516);
                    v4_2.setMarginEnd(v2_4);
                    v4_2.setMarginStart(v2_4);
                    v3_2.setLayoutParams(v4_2);
                    v3_2.setPadding(v3_2.getResources().getDimensionPixelSize(2131165738), v3_2.getResources().getDimensionPixelSize(2131165738), v3_2.getResources().getDimensionPixelSize(2131165738), v3_2.getResources().getDimensionPixelSize(2131165738));
                    try {
                        vs.a(p8, v3_2);
                        v1_2.addView(v3_2, 2);
                        p6.f0 = 1;
                    } catch (Exception v8_2) {
                        v8_2.printStackTrace();
                    }
                } else {
                    return;
                }
            }
            if (v9_2 != 0) {
                p6.f0 = p7;
            }
        }
        return;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p4)
    {
        p4.getClass();
        if (p4.getAction() == 0) {
            int v0_1 = p4.getKeyCode();
            if (v0_1 == 87) {
                this.v("next");
                return 1;
            } else {
                if (v0_1 == 88) {
                    this.v("previous");
                    return 1;
                }
            }
        }
        return super.dispatchKeyEvent(p4);
    }

    public final com.cricfytv.sports.databinding.ExoPlayerControlViewBinding getControllerBinding()
    {
        return this.b0;
    }

    public final android.view.View getDragHandle()
    {
        return this.a0.c;
    }

    public final rn2 getPlayerRepository()
    {
        int v0_1 = this.e0;
        if (v0_1 == 0) {
            rg1.U("playerRepository");
            throw 0;
        } else {
            return v0_1;
        }
    }

    public final android.widget.ImageView getResizeHandle()
    {
        return this.a0.j;
    }

    public final com.google.android.material.chip.ChipGroup getServersExo()
    {
        return this.d0;
    }

    public final void onConfigurationChanged(android.content.res.Configuration p4)
    {
        android.widget.LinearLayout v0_0 = 0;
        if ((p4 != null) && (p4.orientation == 2)) {
            v0_0 = 1;
        }
        android.widget.ImageButton v3_3 = this.b0;
        if (v0_0 == null) {
            android.widget.LinearLayout v0_1 = v3_3.t;
            com.android.vending.player.CricfyPlayerView.s(v3_3.m, v0_1, 0);
            com.android.vending.player.CricfyPlayerView.s(v3_3.i, v0_1, 0);
            return;
        } else {
            com.android.vending.player.CricfyPlayerView.s(v3_3.i, v3_3.p, Integer.valueOf(1));
            com.android.vending.player.CricfyPlayerView.s(v3_3.m, v3_3.o, Integer.valueOf(2));
            return;
        }
    }

    public final void setLock(boolean p7)
    {
        com.cricfytv.sports.databinding.ExoPlayerControlViewBinding v0 = this.b0;
        int v2 = 8;
        if (v0.k.hasOnClickListeners()) {
            boolean v4_0;
            if (p7) {
                v4_0 = 8;
            } else {
                v4_0 = 0;
            }
            v0.k.setVisibility(v4_0);
        }
        if ((this.f0) && (!this.c0)) {
            com.android.vending.player.CricfyPlayerView.w(this, (p7 ^ 1), 0, 2);
        }
        if ((this.c0) || (p7)) {
            boolean v4_3 = 8;
        } else {
            v4_3 = 0;
        }
        boolean v4_5;
        v0.b.setVisibility(v4_3);
        if ((this.c0) || (p7)) {
            v4_5 = 8;
        } else {
            v4_5 = 0;
        }
        boolean v4_6;
        v0.m.setVisibility(v4_5);
        if (p7) {
            v4_6 = 8;
        } else {
            v4_6 = 0;
        }
        android.widget.LinearLayout v6_2;
        v0.i.setVisibility(v4_6);
        int v1_8 = this.d0;
        if ((rg1.a(v1_8.getParent(), v0.n)) && ((this.c0) || (p7))) {
            v6_2 = 8;
        } else {
            v6_2 = 0;
        }
        int v1_9;
        v1_8.setVisibility(v6_2);
        if (p7) {
            v1_9 = 8;
        } else {
            v1_9 = 0;
        }
        int v1_10;
        v0.e.setVisibility(v1_9);
        if (p7) {
            v1_10 = 8;
        } else {
            v1_10 = 0;
        }
        v0.c.setVisibility(v1_10);
        if (!p7) {
            v2 = 0;
        }
        v0.r.setVisibility(v2);
        return;
    }

    public final void setOnRetry(a41 p3)
    {
        p3.getClass();
        this.a0.k.setOnClickListener(new pm(p3, 5));
        return;
    }

    public final void setPlayerRepository(rn2 p1)
    {
        p1.getClass();
        this.e0 = p1;
        return;
    }

    public void setResizeMode(int p3)
    {
        int v0_0;
        if (p3 == 0) {
            v0_0 = 2131231502;
        } else {
            if (p3 == 3) {
                v0_0 = 2131231501;
            } else {
                v0_0 = 2131231503;
            }
        }
        this.b0.b.setImageResource(v0_0);
        super.setResizeMode(p3);
        return;
    }

    public final void u(sz2 p5)
    {
        android.widget.TextView v4_2 = this.a0;
        if ((p5 instanceof qz2)) {
            v4_2.d.setVisibility(0);
        }
        int v3;
        int v5_3 = (p5 instanceof oz2);
        if (v5_3 == 0) {
            v3 = 8;
        } else {
            v3 = 0;
        }
        v4_2.k.setVisibility(v3);
        if (v5_3 != 0) {
            v4_2.d.setVisibility(8);
            android.widget.TextView v4_1 = v4_2.f;
            v4_1.setVisibility(0);
            v4_1.setText(2132017301);
        }
        return;
    }

    public final void v(String p7)
    {
        if (this.e0 != null) {
            java.util.List v0_1;
            java.util.List v0_12 = ((sz2) this.getPlayerRepository().e.getValue());
            java.util.List v4 = 0;
            if (!(v0_12 instanceof rz2)) {
                v0_1 = 0;
            } else {
                v0_1 = ((fv) ((rz2) v0_12).a);
            }
            if (v0_1 != null) {
                java.util.List v0_4;
                java.util.List v3_1 = v0_1.i;
                if (!p7.equals("next")) {
                    v0_4 = v0_1.f;
                } else {
                    v0_4 = v0_1.e;
                }
                if (v0_4 == null) {
                    if ((v3_1 != null) && (!v3_1.isEmpty())) {
                        rn2 v6_1 = this.getPlayerRepository();
                        ho2 v7_2 = ((ho2) lz.x0(v3_1));
                        v6_1.getClass();
                        v7_2.getClass();
                        java.util.List v0_7 = v6_1.c.e;
                        if (v0_7 != null) {
                            java.util.List v0_8 = v0_7.getItems();
                            if (v0_8 != null) {
                                v4 = lz.T0(v0_8);
                            }
                        }
                        if (v4 != null) {
                            v6_1.b(v7_2, v4);
                            return;
                        }
                    } else {
                        rn2 v6_2 = this.getContext();
                        android.widget.Toast.makeText(v6_2, v6_2.getString(2132017712, new Object[] {p7})), 0).show();
                    }
                } else {
                    this.getPlayerRepository().g(0, v0_4);
                    return;
                }
            }
            return;
        } else {
            rn2 v6_5 = this.getContext();
            android.widget.Toast.makeText(v6_5, v6_5.getString(2132017712, new Object[] {p7})), 0).show();
            return;
        }
    }

    public final void x(java.util.List p5, rn2 p6)
    {
        p6.getClass();
        com.google.android.material.chip.ChipGroup v2 = this.d0;
        if (p5.size() <= 1) {
            v2.removeAllViews();
            return;
        } else {
            re2.a(v2, ((Number) p6.f.getValue()).intValue(), p5, new o9(4, p6, this));
            return;
        }
    }

    public final void y(boolean p6)
    {
        int v2_2;
        this.c0 = p6;
        com.cricfytv.sports.databinding.ExoPlayerControlViewBinding v0 = this.b0;
        if (!p6) {
            v2_2 = 2131231069;
        } else {
            v2_2 = 2131231086;
        }
        int v2_0;
        v0.e.setImageResource(v2_2);
        if (!p6) {
            v2_0 = 2131231298;
        } else {
            v2_0 = 2131230986;
        }
        int v4_0;
        v0.k.setImageResource(v2_0);
        int v2_1 = 8;
        if (p6) {
            v4_0 = 8;
        } else {
            v4_0 = 0;
        }
        int v4_2;
        v0.g.setVisibility(v4_0);
        com.android.vending.player.CricfyPlayerView.w(this, 0, 0, 6);
        android.widget.ImageView vtmp1 = this.getResizeHandle();
        if (!p6) {
            v4_2 = 8;
        } else {
            v4_2 = 0;
        }
        vtmp1.setVisibility(v4_2);
        android.view.View v1_4 = this.getDragHandle();
        if (p6) {
            v2_1 = 0;
        }
        v1_4.setVisibility(v2_1);
        this.setLock(v0.h.isSelected());
        return;
    }

    public final void z(boolean p1)
    {
        int v1_1;
        if (p1 == 0) {
            v1_1 = 8;
        } else {
            v1_1 = 0;
        }
        this.a0.d.setVisibility(v1_1);
        return;
    }
}

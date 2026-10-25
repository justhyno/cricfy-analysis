package com.android.vending.player;
public abstract class BasePlayerActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final synthetic int C;
    public x8 A;
    public final vk3 B;
    public androidx.recyclerview.widget.j w;
    public ml2 x;
    public ip1 y;
    public nv z;

    public BasePlayerActivity()
    {
        super(2131558430);
        super.B = new vk3(new x6(super, 14));
        return;
    }

    public abstract com.cricfytv.sports.databinding.ActivityPlayerBinding T();

    public abstract com.android.vending.player.CricfyPlayerView U();

    public final void V(boolean p6)
    {
        p26 v1_3;
        this.d0(p6);
        android.view.Window v0_1 = this.U();
        if (p6 == 0) {
            v1_3 = 2131230986;
        } else {
            v1_3 = 2131230987;
        }
        v0_1.b0.g.setImageResource(v1_3);
        android.view.Window v0_0 = this.getWindow();
        if (p6 == 0) {
            v0_0.clearFlags(67108864);
            v0_0.clearFlags(134217728);
            v0_0.clearFlags(512);
        } else {
            v0_0.addFlags(67108864);
            v0_0.addFlags(134217728);
            v0_0.setFlags(512, 512);
        }
        j54 v5_4;
        p26 v1_2 = new p26(this.T().a);
        j54 v5_3 = android.os.Build$VERSION.SDK_INT;
        if (v5_3 < 35) {
            if (v5_3 < 30) {
                if (v5_3 < 26) {
                    v5_4 = new j54;
                    v5_4(v0_0, v1_2, 0);
                } else {
                    v5_4 = new k54;
                    v5_4(v0_0, v1_2, 0);
                }
            } else {
                v5_4 = new j54;
                v5_4(v0_0, v1_2, 1);
            }
        } else {
            v5_4 = new m54;
            v5_4(v0_0, v1_2, 1);
        }
        if (p6 == 0) {
            v5_4.w();
            v5_4.v(1);
            return;
        } else {
            v5_4.v(2);
            v5_4.m(519);
            return;
        }
    }

    public final void W()
    {
        if (android.os.Build$VERSION.SDK_INT >= 35) {
            zm0.a(this, new al3(-16777216, -16777216, 2, new vb2(17)), 2);
        }
        ky3.c(this.T().a, new c(14));
        if (!re2.H(this)) {
            ((n7) this.B.getValue()).b(this, this.T().b.b);
        }
        this.T().c.setText(this.getString(2132017329, new Object[] {this.getString(2132017746)})));
        this.d0(this.Z());
        com.android.vending.player.CricfyPlayerView.w(this.U(), 1, this, 4);
        ne2.d(this.getOnBackPressedDispatcher(), 0, new nm(this, 0), 3);
        return;
    }

    public final void X()
    {
        if ((re2.H(this)) || (this.getResources().getConfiguration().orientation != 2)) {
            this.i();
            return;
        } else {
            this.setRequestedOrientation(7);
            return;
        }
    }

    public abstract boolean Y();

    public abstract boolean Z();

    public final void a0(sz2 p16)
    {
        boolean v5_0;
        java.util.ArrayList v1_0 = (p16 instanceof qz2);
        java.util.Iterator v2_15 = this.T();
        com.android.vending.player.BasePlayerActivity v4_3 = v2_15.c;
        int v7 = 0;
        if (v1_0 == null) {
            v5_0 = 8;
        } else {
            v5_0 = 0;
        }
        Object v3_1;
        v2_15.e.setVisibility(v5_0);
        if (v1_0 != null) {
            v3_1 = 8;
        } else {
            v3_1 = 0;
        }
        v2_15.g.setVisibility(v3_1);
        if ((v1_0 != null) && (v4_3.getVisibility() == 0)) {
            v4_3.setVisibility(8);
        }
        if ((p16 instanceof rz2)) {
            android.widget.TextView v0_17 = ((fv) ((rz2) p16).a);
            java.util.ArrayList v1_17 = v0_17.h;
            if (v1_17 == null) {
                v1_17 = v0_17.i;
                if (v1_17 == null) {
                    v1_17 = po0.o;
                }
            }
            java.util.List v9 = v1_17;
            android.widget.TextView v0_18 = v0_17.g;
            java.util.ArrayList v1_19 = new java.util.ArrayList();
            java.util.Iterator v2_16 = v9.iterator();
            while (v2_16.hasNext()) {
                Object v3_5 = v2_16.next();
                if ((v3_5 instanceof tu)) {
                    v1_19.add(v3_5);
                }
            }
            int v11;
            if (v1_19.isEmpty()) {
                v11 = 0;
            } else {
                v11 = v1_19;
            }
            int v13;
            if (rg1.a(v0_18, "Live Events")) {
                v13 = 1;
            } else {
                if ((v11 != 0) && (!v11.isEmpty())) {
                    android.widget.TextView v0_21 = v11.size();
                    java.util.Iterator v2_18 = 0;
                    while (v2_18 < v0_21) {
                        Object v3_8 = v11.get(v2_18);
                        v2_18++;
                        if (rg1.a(((tu) v3_8).e, "Live Events")) {
                        }
                    }
                }
                v13 = 0;
            }
            android.widget.TextView v0_3;
            boolean v14 = re2.H(this);
            if (v11 != 0) {
                if (v13 == 0) {
                    android.widget.TextView v0_23 = new rm(0, 2, com.android.vending.player.BasePlayerActivity, this, "channelsAdapter", "getChannelsAdapter()Lcom/android/vending/adapters/ChannelsAdapter;");
                    if (v0_23.get() == null) {
                        v0_23.set(new nv(new om(this, 1), 0));
                    }
                    this.x = 0;
                    this.y = 0;
                    android.widget.TextView v0_24 = v0_23.get();
                    v0_24.getClass();
                    v0_3 = ((androidx.recyclerview.widget.j) v0_24);
                } else {
                    android.widget.TextView v0_1 = new rm(0, 1, com.android.vending.player.BasePlayerActivity, this, "liveEventsAdapter", "getLiveEventsAdapter()Lcom/android/vending/adapters/LiveEventsAdapter;");
                    if (v0_1.get() == null) {
                        v0_1.set(new ip1(new om(this, 0)));
                    }
                    this.x = 0;
                    this.z = 0;
                    android.widget.TextView v0_2 = v0_1.get();
                    v0_2.getClass();
                    v0_3 = ((androidx.recyclerview.widget.j) v0_2);
                }
            } else {
                android.widget.TextView v0_5 = new rm(0, 0, com.android.vending.player.BasePlayerActivity, this, "playlistAdapter", "getPlaylistAdapter()Lcom/android/vending/adapters/PlayListAdapter;");
                if (v0_5.get() == null) {
                    v0_5.set(new ml2(0, new nm(this, 1)));
                }
                this.y = 0;
                this.z = 0;
                android.widget.TextView v0_6 = v0_5.get();
                v0_6.getClass();
                v0_3 = ((androidx.recyclerview.widget.j) v0_6);
            }
            this.w = v0_3;
            if (!v14) {
                java.util.ArrayList v1_9 = this.T().g;
                if (!rg1.a(v1_9.getAdapter(), v0_3)) {
                    v1_9.setAdapter(0);
                    while (v1_9.getItemDecorationCount() > 0) {
                        v1_9.removeItemDecorationAt(0);
                    }
                    if (v13 == 0) {
                        re2.W(v1_9, 0, 0, 0, 15);
                    } else {
                        v1_9.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(v1_9.getContext(), 1, 0));
                    }
                    v1_9.post(new qb(8, v1_9, v0_3));
                }
            }
            java.util.ArrayList v1_11;
            android.widget.TextView v0_8 = this.U().getControllerBinding();
            if ((!v14) || (v9.isEmpty())) {
                v1_11 = 8;
            } else {
                v1_11 = 0;
            }
            v0_8.d.setVisibility(v1_11);
            if ((v11 == 0) || (v13 == 0)) {
                if (v11 == 0) {
                    android.widget.TextView v0_10 = this.x;
                    if (v0_10 != null) {
                        java.util.ArrayList v1_13 = new java.util.ArrayList();
                        java.util.Iterator v2_14 = v9.iterator();
                        while (v2_14.hasNext()) {
                            Object v3_4 = v2_14.next();
                            if ((v3_4 instanceof ho2)) {
                                v1_13.add(v3_4);
                            }
                        }
                        v0_10.t(v1_13);
                    }
                } else {
                    android.widget.TextView v0_11 = this.z;
                    if (v0_11 != null) {
                        v0_11.t(v11);
                    }
                }
            } else {
                android.widget.TextView v0_12 = this.y;
                if (v0_12 != null) {
                    v0_12.t(v11);
                }
            }
            if (!v9.isEmpty()) {
                v7 = 8;
            }
            this.T().c.setVisibility(v7);
        }
        return;
    }

    public abstract void b0(ho2 p0);

    public abstract void c0(int p0, String p1);

    public final void d0(boolean p9)
    {
        int v9_9;
        String v0_0 = this.T();
        androidx.constraintlayout.widget.ConstraintLayout v1 = v0_0.a;
        String v0_3 = v0_0.f;
        v1.getClass();
        x40 v2_1 = new x40();
        v2_1.b(v1);
        int v3_2 = this.Y();
        if ((p9 == 0) && ((v3_2 == 0) && (!re2.H(this)))) {
            v9_9 = 0;
        } else {
            v9_9 = 1;
        }
        int v5_0 = this.U();
        Integer v6_4 = v5_0.getServersExo().getParent();
        if (v9_9 == 0) {
            if (!rg1.a(v6_4, this.T().h)) {
                v6_4.getClass();
                ((android.view.ViewGroup) v6_4).removeView(v5_0.getServersExo());
                this.T().h.addView(v5_0.getServersExo());
            }
        } else {
            if (!rg1.a(v6_4, v5_0.getControllerBinding().n)) {
                v6_4.getClass();
                ((android.view.ViewGroup) v6_4).removeView(v5_0.getServersExo());
                v5_0.getControllerBinding().n.addView(v5_0.getServersExo());
            }
        }
        int v8_9;
        if (v3_2 != 0) {
            v8_9 = 0;
        } else {
            v8_9 = 3;
        }
        v5_0.setResizeMode(v8_9);
        int v3_1 = v2_1.b;
        if (v9_9 != 0) {
            int v5_2;
            int v5_1 = v0_3.getId();
            if (!v3_1.containsKey(Integer.valueOf(v5_1))) {
                v5_2 = 0;
            } else {
                v5_2 = ((s40) v3_1.get(Integer.valueOf(v5_1)));
            }
            if (v5_2.d.o == 0) {
                return;
            }
        }
        if (v9_9 == 0) {
            int v9_10 = v0_3.getId();
            if (v3_1.containsKey(Integer.valueOf(v9_10))) {
                int v9_13 = ((s40) v3_1.get(Integer.valueOf(v9_10)));
                if (v9_13 != 0) {
                    int v9_14 = v9_13.d;
                    v9_14.n = -1;
                    v9_14.o = -1;
                    v9_14.I = 0;
                    v9_14.P = -2147483648;
                }
            }
            v2_1.i(v0_3.getId(), "H,16:9");
        } else {
            int v9_2 = v0_3.getId();
            if (!v3_1.containsKey(Integer.valueOf(v9_2))) {
                v3_1.put(Integer.valueOf(v9_2), new s40());
            }
            int v9_5 = ((s40) v3_1.get(Integer.valueOf(v9_2)));
            if (v9_5 != 0) {
                int v9_6 = v9_5.d;
                v9_6.o = 0;
                v9_6.n = -1;
                v9_6.p = -1;
                v9_6.q = -1;
                v9_6.r = -1;
            }
            v2_1.i(v0_3.getId(), "");
        }
        v2_1.a(v1);
        v1.setConstraintSet(0);
        v1.requestLayout();
        return;
    }
}

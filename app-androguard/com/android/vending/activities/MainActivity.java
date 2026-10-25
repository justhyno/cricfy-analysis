package com.android.vending.activities;
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final synthetic mk1[] K;
    public long A;
    public android.widget.Toast B;
    public final tl1 C;
    public final vk3 D;
    public z6 E;
    public c5 F;
    public a41 G;
    public nj2 H;
    public final c5 I;
    public final vk3 J;
    public final j5 w;
    public jz5 x;
    public cc2 y;
    public androidx.navigation.fragment.NavHostFragment z;

    static MainActivity()
    {
        mk1[] v1_2 = new mk1[1];
        v1_2[0] = new is2(com.android.vending.activities.MainActivity, "binding", "getBinding()Lcom/cricfytv/sports/databinding/ActivityMainBinding;");
        com.android.vending.activities.MainActivity.K = v1_2;
        return;
    }

    public MainActivity()
    {
        super(2131558429);
        super.w = rg1.q(super, com.cricfytv.sports.databinding.ActivityMainBinding);
        super.C = re2.I(bm1.p, new st(super, 4));
        super.D = new vk3(new fs1(super, 0));
        super.I = super.registerForActivityResult(new b5(1), new gs1(super, 0));
        super.J = new vk3(new fs1(super, 1));
        return;
    }

    public static java.util.List U(com.cricfytv.sports.databinding.InputLyBinding p7)
    {
        String v1 = sh3.i0(String.valueOf(p7.q.getText())).toString();
        sh3.i0(String.valueOf(p7.o.getText())).toString();
        sh3.i0(String.valueOf(p7.l.getText())).toString();
        sh3.i0(String.valueOf(p7.i.getText())).toString();
        sh3.i0(String.valueOf(p7.g.getText())).toString();
        return mc4.u(new String[] {v1, String.valueOf(p7.b.isChecked())}));
    }

    public static void W(com.android.vending.activities.MainActivity p10, String p11, int p12, String p13, String p14, ct1 p15, com.cricfytv.sports.PP p16, String p17, int p18)
    {
        int v6;
        if ((p18 & 2) == 0) {
            v6 = p12;
        } else {
            v6 = 0;
        }
        if ((p18 & 4) != 0) {
            p13 = 0;
        }
        String v7;
        if ((p18 & 8) == 0) {
            v7 = p14;
        } else {
            v7 = "";
        }
        int v4;
        if ((p18 & 16) == 0) {
            v4 = 1;
        } else {
            v4 = 0;
        }
        android.content.Intent v12_6;
        if ((p18 & 32) == 0) {
            v12_6 = p15;
        } else {
            v12_6 = 0;
        }
        com.cricfytv.sports.PP v8;
        if ((p18 & 64) == 0) {
            v8 = p16;
        } else {
            v8 = 0;
        }
        p11.getClass();
        if (p13 == null) {
            int v9;
            if (!(v12_6 instanceof android.os.Parcelable)) {
                v9 = 0;
            } else {
                v9 = ((android.os.Parcelable) v12_6);
            }
            c5 v11_1 = new jm2(v4, p11, v6, v7, v8, v9).a();
            Object vtmp6 = rf2.g(p10).d(pw2.a(android.content.SharedPreferences), 0);
            if ((re2.H(p10)) || (!((android.content.SharedPreferences) vtmp6).getBoolean("hasFloatingPlayer", 0))) {
                p10.X(v11_1, p17);
                return;
            } else {
                if (android.provider.Settings.canDrawOverlays(p10)) {
                    p10.b0(v11_1, p17);
                    return;
                } else {
                    p10.H = new nj2(p17, v11_1);
                    c5 v11_2 = p10.I;
                    android.net.Uri v10_1 = p10.getPackageName();
                    String v13_7 = new StringBuilder("package:");
                    v13_7.append(v10_1);
                    android.net.Uri v10_3 = android.net.Uri.parse(v13_7.toString());
                    v10_3.getClass();
                    v11_2.a(new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", v10_3));
                    return;
                }
            }
        } else {
            c5 v11_4 = new android.content.Intent(p10, com.android.vending.activities.WebActivity);
            v11_4.putExtra("link", p13);
            p10.startActivity(v11_4);
            return;
        }
    }

    public final boolean S()
    {
        boolean v0_0 = this.y;
        if (!v0_0) {
            rg1.U("navController");
            throw 0;
        } else {
            jz5 v2 = this.x;
            if (v2 == null) {
                rg1.U("appBarConfiguration");
                throw 0;
            } else {
                if ((!al.w(v0_0, v2)) && (!super.S())) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }

    public final com.cricfytv.sports.databinding.ActivityMainBinding T()
    {
        return ((com.cricfytv.sports.databinding.ActivityMainBinding) this.w.c1(this, com.android.vending.activities.MainActivity.K[0]));
    }

    public final vz3 V()
    {
        return ((vz3) this.C.getValue());
    }

    public final void X(android.os.Bundle p4, String p5)
    {
        n7 v0_0 = this.J;
        if (!((n7) v0_0.getValue()).a(7, p5)) {
            if (!re2.H(this)) {
                ((n7) v0_0.getValue()).f(this, p5, new is1(this, p4, 1));
                return;
            } else {
                android.content.Intent v5_2 = new android.content.Intent(this, com.android.vending.player.PlayerActivity);
                v5_2.putExtras(p4);
                this.startActivity(v5_2);
                return;
            }
        } else {
            this.Y(p4, com.android.vending.player.PlayerActivity, p5);
            return;
        }
    }

    public final void Y(android.os.Bundle p10, Class p11, String p12)
    {
        p75 v0_5;
        if (p12.length() <= 0) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        Object[] v1_0;
        if (v0_5 == null) {
            v1_0 = this.getString(2132017800);
        } else {
            v1_0 = this.getString(2132017269, new Object[] {p12}));
        }
        p75 v0_2;
        String v4 = v1_0;
        v4.getClass();
        if (v0_5 == null) {
            v0_2 = this.getString(2132017801);
        } else {
            v0_2 = this.getString(2132017452, new Object[] {p12, p12}));
        }
        String v5 = v0_2;
        v5.getClass();
        com.android.vending.activities.AlertNew.F.getClass();
        p75.B(this, 7, v4, v5, p12, p11, p10);
        return;
    }

    public final void Z(com.google.android.material.textfield.TextInputEditText p8, com.google.android.material.textfield.TextInputLayout p9)
    {
        android.graphics.drawable.Drawable v5 = this.getDrawable(2131231086);
        android.graphics.drawable.Drawable v0_1 = p9.getEndIconDrawable();
        ns1 v1_4 = p8.getText();
        if ((v1_4 != null) && (v1_4.length() != 0)) {
            p9.setEndIconDrawable(v5);
        } else {
            p9.setEndIconDrawable(v0_1);
        }
        p8.addTextChangedListener(new ts1(p9, v0_1, v5));
        p9.setEndIconOnClickListener(new ns1(p8, this, p9, v5, 0));
        return;
    }

    public final void a0(String p10, int p11, int p12)
    {
        android.widget.ArrayAdapter v6_0;
        android.content.SharedPreferences v0_2 = ((android.content.SharedPreferences) rf2.g(this).d(pw2.a(android.content.SharedPreferences), 0));
        com.cricfytv.sports.databinding.DialogQualityToggleBinding v1_1 = com.cricfytv.sports.databinding.DialogQualityToggleBinding.inflate(this.getLayoutInflater(), 0, 0);
        androidx.appcompat.widget.SwitchCompat v2_0 = v1_1.h;
        int v4_0 = v1_1.a;
        v4_0.getClass();
        e8 v9_1 = re2.t(this, v4_0);
        int v4_2 = p10.equals("hasFloatingPlayer");
        if (v4_2 == 0) {
            v6_0 = 2131231099;
        } else {
            v6_0 = 2131231298;
        }
        v1_1.f.setImageResource(v6_0);
        v1_1.i.setText(p11);
        v1_1.g.setText(p12);
        v1_1.j.setText(p11);
        v2_0.setChecked(v0_2.getBoolean(p10, 0));
        if (v4_2 == 0) {
            v2_0.setOnCheckedChangeListener(new ms1(v0_2, p10));
        } else {
            v1_1.d.setVisibility(0);
            et0 v11_7 = mc4.u(new String[] {"Disable", "TWO", "Three", "FOUR", "FIVE (MAX)"}));
            int v12_6 = yf1.n((v0_2.getInt("floatingPlayersCount", 1) - 1), (v11_7.size() - 1));
            android.widget.Spinner v5_6 = v1_1.e;
            v5_6.setAdapter(new android.widget.ArrayAdapter(v5_6.getContext(), 17367049, v11_7));
            v5_6.setEnabled(v2_0.isChecked());
            v5_6.setSelection(v12_6, 0);
            v5_6.setOnItemSelectedListener(new ao1(v0_2, 1));
            v2_0.setOnCheckedChangeListener(new ls1(v0_2, v1_1, p10));
        }
        v1_1.c.setOnClickListener(new et0(v9_1, 5));
        v1_1.b.setOnClickListener(new et0(v9_1, 6));
        v9_1.show();
        return;
    }

    public final void b0(android.os.Bundle p4, String p5)
    {
        if (!android.provider.Settings.canDrawOverlays(this)) {
            this.X(p4, p5);
            return;
        } else {
            n7 v0_4 = this.J;
            if (!((n7) v0_4.getValue()).a(7, p5)) {
                ((n7) v0_4.getValue()).f(this, p5, new is1(this, p4, 0));
                return;
            } else {
                this.Y(p4, com.android.vending.player.FloatingPlayerService, p5);
                return;
            }
        }
    }

    public final void onCreate(android.os.Bundle p26)
    {
        int v5_4;
        void v2_0 = this;
        k7 v0_3 = Integer.valueOf(2131361985);
        qs v1_44 = Integer.valueOf(2131362476);
        com.cricfytv.sports.databinding.CustomAdFullBinding v3_27 = Integer.valueOf(2131362473);
        void v25_1 = super.onCreate(p26);
        v6 v4_0 = this.getWindow();
        v4_0.setNavigationBarColor(-16777216);
        boolean v6_1 = new p26(v4_0.getDecorView());
        int v5_2 = android.os.Build$VERSION.SDK_INT;
        if (v5_2 < 35) {
            if (v5_2 < 30) {
                if (v5_2 < 26) {
                    v5_4 = new j54(v4_0, v6_1, 0);
                } else {
                    v5_4 = new k54(v4_0, v6_1, 0);
                }
            } else {
                v5_4 = new j54(v4_0, v6_1, 1);
            }
        } else {
            v5_4 = new m54(v4_0, v6_1, 1);
        }
        qs v7_49;
        v5_4.u(0);
        v5_4.t(0);
        v6 v4_51 = this.w().E(this.T().g.getId());
        v4_51.getClass();
        v6 v4_56 = ((androidx.navigation.fragment.NavHostFragment) v4_51);
        this.z = v4_56;
        this.y = cu0.g(v4_56);
        boolean v6_2 = re2.H(this);
        v6 v4_59 = this.T();
        if (v6_2) {
            v7_49 = 8;
        } else {
            v7_49 = 0;
        }
        qs v7_50;
        v4_59.j.setVisibility(v7_49);
        v6 v4_67 = this.T();
        if (v6_2) {
            v7_50 = 8;
        } else {
            v7_50 = 0;
        }
        qs v7_51;
        v4_67.b.setVisibility(v7_50);
        v6 v4_69 = this.T();
        if (!v6_2) {
            v7_51 = 8;
        } else {
            v7_51 = 0;
        }
        v4_69.m.setVisibility(v7_51);
        if (v6_2) {
            this.T().h.getMenu().removeItem(2131362458);
            v6 v4_75 = this.T().k;
            v4_75.setOnQueryTextListener(new jz5(28, v4_75, this));
            v6 v4_77 = this.T().l;
            String v9_0 = v4_77.c;
            v4_77.e.setOnClickListener(new js1(this, 0));
            v4_77.f.setOnClickListener(new js1(this, 1));
            v9_0.setOnClickListener(new js1(this, 2));
            v9_0.setOnClickListener(new js1(this, 3));
            v4_77.g.setOnClickListener(new js1(this, 4));
            v4_77.b.setOnClickListener(new js1(this, 5));
            v4_77.d.setOnClickListener(new js1(this, 6));
        } else {
            this.T();
            zm0.a(this, 0, 3);
            if (android.os.Build$VERSION.SDK_INT >= 29) {
                vy.t(this.getWindow());
            }
            re2.M(this.T().f, new hs1());
            re2.M(this.T().b, new as(this, 3));
            ky3.c(this.T().h, new v8(new zd(16), 23));
            v6 v4_11 = ve.u0(new Integer[] {v3_27, v1_44, v0_3}));
            String v9_8 = this.T().e;
            int v12_9 = new java.util.HashSet();
            v12_9.addAll(v4_11);
            this.x = new jz5(v12_9, v9_8, new qs1());
            v6 v4_15 = this.T().j;
            String v9_9 = this.y;
            if (v9_9 == null) {
                rg1.U("navController");
                throw 0;
            } else {
                int v12_10 = this.x;
                if (v12_10 == 0) {
                    rg1.U("appBarConfiguration");
                    throw 0;
                } else {
                    v9_9.a(new xo3(v4_15, v12_10));
                    v4_15.setNavigationOnClickListener(new qs(12, v9_9, v12_10));
                    v6 v4_17 = new android.widget.PopupMenu(this, 0);
                    v4_17.inflate(2131689472);
                    v6 v4_18 = v4_17.getMenu();
                    qs v7_14 = this.T().d;
                    v4_18.getClass();
                    String v9_10 = this.y;
                    if (v9_10 == null) {
                        rg1.U("navController");
                        throw 0;
                    } else {
                        v7_14.setOnItemSelectedListener(new l72(4, v4_18, v9_10));
                        v9_10.a(new oc2(new ref.WeakReference(v7_14), v9_10, v4_18, v7_14));
                        v6 v4_20 = this.T().h;
                        qs v7_15 = this.y;
                        if (v7_15 == null) {
                            rg1.U("navController");
                            throw 0;
                        } else {
                            v4_20.setNavigationItemSelectedListener(new w10(17, v7_15, v4_20));
                            v7_15.a(new jd2(new ref.WeakReference(v4_20), v7_15));
                            v6 v4_24 = this.T().c;
                            qs v7_16 = v4_24.getContext();
                            v7_16.getClass();
                            qs v7_18 = re2.F(v7_16, 1109393408, 1073741824, 0);
                            v4_24.setForeground(v7_18);
                            v4_24.addOnAttachStateChangeListener(new ls(v7_18, 2));
                            if (v4_24.isAttachedToWindow()) {
                                v7_18.start();
                            }
                            v6 v4_29 = this.T().j.getMenu().findItem(2131362607);
                            v4_29.getClass();
                            v4_29.setOnActionExpandListener(new ss1(this));
                            v6 v4_30 = v4_29.getActionView();
                            v4_30.getClass();
                            v6 v4_31 = ((androidx.appcompat.widget.SearchView) v4_30);
                            v4_31.setIconifiedByDefault(0);
                            v4_31.setIconified(0);
                            v4_31.setQueryHint("Search here...");
                            v4_31.clearFocus();
                            qs v7_25 = v4_31.findViewById(2131362608);
                            v7_25.getClass();
                            qs v7_26 = ((android.widget.ImageView) v7_25);
                            v7_26.setImageDrawable(0);
                            v7_26.setVisibility(8);
                            v4_31.setOnQueryTextListener(new jz5(28, v4_31, this));
                            this.T().j.setOnMenuItemClickListener(new gs1(this, 1));
                        }
                    }
                }
            }
        }
        k7 v0_4 = ve.u0(new Integer[] {v3_27, v0_3, Integer.valueOf(2131362002), v1_44, Integer.valueOf(2131362542)}));
        qs v1_3 = this.T().j.getMenu().findItem(2131362568);
        com.cricfytv.sports.databinding.CustomAdFullBinding v3_1 = this.y;
        if (v3_1 == null) {
            rg1.U("navController");
            throw 0;
        } else {
            com.cricfytv.sports.databinding.CustomAdFullBinding v3_4;
            com.cricfytv.sports.databinding.CustomAdFullBinding v3_3 = v3_1.b.f();
            if (v3_3 == null) {
                v3_4 = 0;
            } else {
                v3_4 = Integer.valueOf(v3_3.p.b);
            }
            v1_3.setVisible(lz.u0(v0_4, v3_4));
            qs v1_4 = this.y;
            if (v1_4 == null) {
                rg1.U("navController");
                throw 0;
            } else {
                v1_4.a(new os1(v6_2, this, v0_4));
                this.T().h.setNavigationItemSelectedListener(new gs1(this, 2));
                this.getOnBackPressedDispatcher().a(this, new ps1(this, v6_2));
                k7 v0_9 = new cl(this);
                qs v1_9 = v0_9.s;
                v6 v4_36 = Boolean.TRUE;
                v1_9.a.H = v4_36;
                v1_9.b.H = v4_36;
                v0_9.setVisible(1, 0);
                v6 v4_37 = Integer.valueOf(-65536);
                String v9_21 = v1_9.b;
                v1_9.a.p = v4_37;
                v9_21.p = v4_37;
                com.cricfytv.sports.databinding.CustomAdFullBinding v3_13 = android.content.res.ColorStateList.valueOf(-65536);
                v6 v4_38 = v0_9.p;
                if (v4_38.p.c != v3_13) {
                    v4_38.r(v3_13);
                    v0_9.invalidateSelf();
                }
                v6 v4_39 = Integer.valueOf(-1);
                if (v0_9.q.a.getColor() != -1) {
                    v1_9.a.q = v4_39;
                    v9_21.q = v4_39;
                    v0_9.j();
                }
                this.V().l.d(this, new nt(new o9(10, v0_9, this), 5));
                k7 v0_12 = this.V();
                if ((!v0_12.d) && (!v6_2)) {
                    k7 v0_14;
                    v0_12.d = 1;
                    k7 v0_13 = this.V();
                    qs v1_14 = v0_13.b;
                    if (!v1_14.getBoolean("dialog_alert", 1)) {
                        v0_14 = 0;
                    } else {
                        qs v1_16 = v1_14.getString("start_alert", 0);
                        if (v1_16 == null) {
                        } else {
                            v0_14 = ((x7) v0_13.c.a(((nk1) x7.Companion.serializer()), re2.u(v1_16)));
                        }
                    }
                    if ((v0_14 != null) && (v0_14.a)) {
                        qs v1_20 = com.cricfytv.sports.databinding.DialogTgJoinBinding.inflate(this.getLayoutInflater(), 0, 0);
                        v6 v4_49 = v1_20.a;
                        v4_49.getClass();
                        v6 v4_50 = re2.t(this, v4_49);
                        v1_20.g.setText(v0_14.b);
                        v1_20.f.setText(v0_14.d);
                        v1_20.d.setOnClickListener(new c7(v4_50, this, v0_14));
                        v1_20.e.setOnClickListener(new et0(v4_50, 1));
                        v1_20.c.setOnClickListener(new qs(11, this, v4_50));
                        v1_20.b.setOnClickListener(new et0(v4_50, 2));
                        v4_50.show();
                    }
                }
                int v12_20;
                if (v6_2) {
                    v12_20 = 3;
                } else {
                    qs v1_27;
                    k7 v0_22 = ((n7) this.D.getValue());
                    qs v1_26 = ((ze3) lz.z0(0, v0_22.d.d));
                    if (v1_26 == null) {
                        v1_27 = 0;
                    } else {
                        v1_27 = v1_26.a;
                    }
                    if (v1_27 == null) {
                    } else {
                        qs v1_28 = v0_22.b;
                        qs v7_48 = ((ze3) lz.z0(0, v0_22.d.d));
                        if (v7_48 != null) {
                            v6 v4_55 = v7_48.d;
                            String v9_27 = v7_48.b;
                            nw2 v11_0 = v1_28.getInt("fullTries", v4_55);
                            if (v11_0 >= v4_55) {
                                com.cricfytv.sports.databinding.CustomAdFullBinding v3_15;
                                qs v1_29 = v1_28.edit();
                                v1_29.getClass();
                                v1_29.putInt("fullTries", 0);
                                v1_29.apply();
                                com.cricfytv.sports.databinding.CustomAdFullBinding v10_7 = com.cricfytv.sports.databinding.CustomAdFullBinding.inflate(this.getLayoutInflater(), 0, 0);
                                qs v1_31 = v10_7.b;
                                v6 v4_57 = v10_7.c;
                                nw2 v11_1 = v10_7.f;
                                int v12_16 = new StringBuilder();
                                v12_16.append(v7_48.c);
                                v11_1.setText(v12_16.toString());
                                nw2 v11_3 = new nw2();
                                String v19 = "png";
                                String v21 = "bmp";
                                int v12_19 = mc4.u(new String[] {"jpg", "svg"}));
                                java.util.Locale v13_3 = new java.io.File(v9_27).getName();
                                int v15_18 = v13_3.lastIndexOf(46);
                                if (v15_18 != -1) {
                                    v3_15 = v13_3.substring((v15_18 + 1));
                                } else {
                                    v3_15 = "";
                                }
                                com.cricfytv.sports.databinding.CustomAdFullBinding v3_16 = v3_15.toLowerCase(java.util.Locale.ROOT);
                                v3_16.getClass();
                                if (!v12_19.contains(v3_16)) {
                                    v1_31.setVisibility(8);
                                    v4_57.setVisibility(0);
                                    v4_57.setOnClickListener(new e7(v0_22, this, v7_48, 1));
                                    k7 v0_24 = new mr0(this);
                                    jl4.y((v0_24.n ^ 1));
                                    v0_24.n = 1;
                                    qs v1_37 = new cs0(v0_24);
                                    v4_57.setPlayer(v1_37);
                                    v1_37.s0(vx1.b(v9_27));
                                    v1_37.a();
                                    v1_37.V(1);
                                    v11_3.o = v1_37;
                                } else {
                                    v1_31.setVisibility(0);
                                    v4_57.setVisibility(8);
                                    com.cricfytv.sports.databinding.CustomAdFullBinding v3_19 = hn0.a(v1_31.getContext());
                                    v6 v4_61 = new ld1(v1_31.getContext());
                                    v4_61.c = v9_27;
                                    v4_61.b(v1_31);
                                    v3_19.a(v4_61.a());
                                    v1_31.setOnClickListener(new e7(v0_22, this, v7_48, 0));
                                }
                                k7 v0_27 = new nw2();
                                if (v11_3.o != null) {
                                    qs v1_40 = new f7(v11_3, 0);
                                    this.getLifecycle().a(v1_40);
                                    v0_27.o = v1_40;
                                }
                                com.cricfytv.sports.databinding.CustomAdFullBinding v3_24 = new android.app.Dialog(this, 2132082689);
                                v3_24.setContentView(v10_7.a);
                                v3_24.setCancelable(0);
                                re2.X(v3_24);
                                v3_24.show();
                                k7 v0_29 = new v6(v11_3, v0_27, v3_24, this, 0);
                                v10_7.e.setOnClickListener(new w6(v0_29, 0));
                                v2_0 = v25_1;
                                v12_20 = 3;
                                vo.r(s03.h(v25_1), 0, new k7(v7_48, v2_0, v10_7, v0_29, 0), 3);
                            } else {
                                k7 v0_32 = v1_28.edit();
                                v0_32.getClass();
                                v0_32.putInt("fullTries", (v11_0 + 1));
                                v0_32.apply();
                            }
                        }
                    }
                }
                if (!v6_2) {
                    v2_0.F = v2_0.registerForActivityResult(new b5(1), new gs1(v2_0, v12_20));
                }
                return;
            }
        }
    }

    public final void onResume()
    {
        super.onResume();
        re2.i(this);
        return;
    }
}

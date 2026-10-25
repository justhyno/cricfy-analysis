package com.android.vending.activities;
public final class AlertNew extends androidx.appcompat.app.AppCompatActivity {
    public static final p75 F;
    public static final synthetic mk1[] G;
    public boolean A;
    public boolean B;
    public long C;
    public android.os.CountDownTimer D;
    public android.animation.AnimatorSet E;
    public final j5 w;
    public final vk3 x;
    public final vk3 y;
    public final vk3 z;

    static AlertNew()
    {
        mk1[] v2_1 = new mk1[1];
        v2_1[0] = new is2(com.android.vending.activities.AlertNew, "binding", "getBinding()Lcom/cricfytv/sports/databinding/AlertNewActivityBinding;");
        com.android.vending.activities.AlertNew.G = v2_1;
        com.android.vending.activities.AlertNew.F = new p75(1);
        return;
    }

    public AlertNew()
    {
        super(2131558436);
        super.w = rg1.q(super, com.cricfytv.sports.databinding.AlertNewActivityBinding);
        super.x = new vk3(new f8(super, 3));
        super.y = new vk3(new f8(super, 4));
        super.z = new vk3(new f8(super, 5));
        return;
    }

    public static void T(android.view.View p10, a41 p11)
    {
        android.animation.AnimatorSet v0_1 = new android.animation.AnimatorSet();
        int v2_0 = new float[2];
        v2_0 = {1065353216, 1064178811};
        int v2_2 = android.animation.ObjectAnimator.ofFloat(p10, "scaleX", v2_0);
        v2_2.setDuration(80);
        android.animation.Animator[] v6_0 = new float[2];
        v6_0 = {1065353216, 1064178811};
        android.animation.Animator[] v6_1 = android.animation.ObjectAnimator.ofFloat(p10, "scaleY", v6_0);
        v6_1.setDuration(80);
        android.animation.AnimatorSet v4_0 = new float[2];
        v4_0 = {1064178811, 1065353216};
        android.animation.ObjectAnimator v3_0 = android.animation.ObjectAnimator.ofFloat(p10, "scaleX", v4_0);
        v3_0.setDuration(250);
        v3_0.setInterpolator(new android.view.animation.OvershootInterpolator(1074580685));
        float[] v8_2 = new float[2];
        v8_2 = {1064178811, 1065353216};
        y3 v10_1 = android.animation.ObjectAnimator.ofFloat(p10, "scaleY", v8_2);
        v10_1.setDuration(250);
        v10_1.setInterpolator(new android.view.animation.OvershootInterpolator(1074580685));
        android.animation.AnimatorSet v4_5 = new android.animation.AnimatorSet();
        android.animation.AnimatorSet v5_0 = new android.animation.Animator[2];
        v5_0[0] = v2_2;
        v5_0[1] = v6_1;
        v4_5.playTogether(v5_0);
        android.animation.AnimatorSet v5_2 = new android.animation.AnimatorSet();
        android.animation.Animator[] v6_2 = new android.animation.Animator[2];
        v6_2[0] = v3_0;
        v6_2[1] = v10_1;
        v5_2.playTogether(v6_2);
        y3 v10_2 = new android.animation.Animator[2];
        v10_2[0] = v4_5;
        v10_2[1] = v5_2;
        v0_1.playSequentially(v10_2);
        v0_1.addListener(new y3(p11, 1));
        v0_1.start();
        return;
    }

    private final void onAdCompleted()
    {
        try {
            tg2 v4_11;
            int v2_4 = this.getIntent().getStringExtra("destination");
            v2_4.getClass();
            xg2 v3_3 = this.getIntent().getBundleExtra("args");
            int v2_0 = Class.forName(v2_4);
            try {
                if (!android.app.Activity.isAssignableFrom(v2_0)) {
                    if (android.app.Service.isAssignableFrom(v2_0)) {
                        tg2 v4_10 = new android.content.Intent(this, v2_0);
                        if (v3_3 != null) {
                            v4_10.putExtras(v3_3);
                        }
                        if (android.os.Build$VERSION.SDK_INT < 26) {
                            this.startService(v4_10);
                        } else {
                            zx0.p(this, v4_10);
                        }
                    }
                    v4_11 = 0;
                } else {
                    v4_11 = new android.content.Intent(this, v2_0);
                    if (v3_3 != null) {
                        v4_11.putExtras(v3_3);
                    }
                    this.startActivity(v4_11);
                }
            } catch (int v2_3) {
                if (v4_11 != null) {
                    xg2 v3_5 = android.os.Build$VERSION.SDK_INT;
                    if (v3_5 >= 33) {
                        if (re2.l(this, "android.permission.POST_NOTIFICATIONS") != 0) {
                            v2_3.printStackTrace();
                            return;
                        }
                    }
                    tg2 v4_13 = android.app.PendingIntent.getActivity(this, 0, v4_11, 201326592);
                    if (v3_5 >= 26) {
                        wg2 v0_5 = this.getResources().getString(2132017196);
                        v0_5.getClass();
                        z2.k();
                        int v5_6 = new android.app.NotificationChannel("cricfy_notification_channel", v0_5, 4);
                        wg2 v0_7 = this.getSystemService("notification");
                        v0_7.getClass();
                        ((android.app.NotificationManager) v0_7).createNotificationChannel(v5_6);
                    }
                    wg2 v0_10 = new pg2(this, "cricfy_notification_channel");
                    v0_10.e = pg2.b("Reward Granted Success!");
                    v0_10.f = pg2.b(this.getString(2132017187, new Object[] {Integer.valueOf(this.V().d)})));
                    v0_10.t.icon = 2131231083;
                    v0_10.g = v4_13;
                    v0_10.c(16, 1);
                    v0_10.j = 1;
                    v0_10.n = "alarm";
                    xg2 v3_2 = new xg2(this);
                    wg2 v0_1 = v0_10.a();
                    tg2 v4_1 = v0_1.extras;
                    if (v4_1 != null) {
                        if (v4_1.getBoolean("android.support.useSideChannel")) {
                            tg2 v4_4 = new tg2(this.getPackageName(), v0_1);
                            wg2 v0_2 = xg2.f;
                            if (v0_2 == null) {
                                v0_2 = new wg2(this.getApplicationContext());
                                xg2.f = v0_2;
                            }
                            v0_2.p.obtainMessage(0, v4_4).sendToTarget();
                            v3_2.a.cancel(0, 1001);
                            v2_3.printStackTrace();
                            return;
                        }
                    }
                    v3_2.a.notify(0, 1001, v0_1);
                }
                v2_3.printStackTrace();
                return;
            }
            this.finish();
            return;
        } catch (int v2_3) {
            v4_11 = 0;
        }
    }

    public final com.cricfytv.sports.databinding.AlertNewActivityBinding U()
    {
        return ((com.cricfytv.sports.databinding.AlertNewActivityBinding) this.w.c1(this, com.android.vending.activities.AlertNew.G[0]));
    }

    public final ze3 V()
    {
        return ((ze3) this.z.getValue());
    }

    public final void W()
    {
        if (this.U().h.getVisibility() == 0) {
            this.U().h.animate().alpha(0).setDuration(200).withEndAction(new s4(this, 1)).start();
        }
        return;
    }

    public final void X()
    {
        this.U().d.setEnabled(0);
        this.U().d.setText(this.getString(2132017803));
        this.W();
        n7 v0_3 = ((n7) this.y.getValue());
        String v2_2 = this.getIntent().getStringExtra("name");
        v2_2.getClass();
        v0_3.g(this.getIntent().getIntExtra("sn", 0), v2_2);
        this.onAdCompleted();
        return;
    }

    public final void Y()
    {
        android.animation.ObjectAnimator v0_1 = this.U().d;
        android.animation.AnimatorSet v1_1 = new android.animation.AnimatorSet();
        int v4_4 = new float[2];
        v4_4 = {1065353216, 1065604874};
        long v2_0 = android.animation.ObjectAnimator.ofFloat(v0_1, android.view.View.SCALE_X, v4_4);
        v2_0.setDuration(800);
        v2_0.setRepeatMode(2);
        v2_0.setRepeatCount(-1);
        v2_0.setInterpolator(new android.view.animation.PathInterpolator(1053609165, 0, 1045220557, 1065353216));
        float[] v12 = new float[2];
        v12 = {1065353216, 1065604874};
        android.animation.ObjectAnimator v0_2 = android.animation.ObjectAnimator.ofFloat(v0_1, android.view.View.SCALE_Y, v12);
        v0_2.setDuration(800);
        v0_2.setRepeatMode(2);
        v0_2.setRepeatCount(-1);
        v0_2.setInterpolator(new android.view.animation.PathInterpolator(1053609165, 0, 1045220557, 1065353216));
        android.animation.Animator[] v3_0 = new android.animation.Animator[2];
        v3_0[0] = v2_0;
        v3_0[1] = v0_2;
        v1_1.playTogether(v3_0);
        v1_1.setStartDelay(1200);
        v1_1.start();
        this.E = v1_1;
        return;
    }

    public final void onCreate(android.os.Bundle p17)
    {
        super.onCreate(p17);
        if (android.os.Build$VERSION.SDK_INT < 30) {
            this.getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            android.animation.ObjectAnimator v1_9 = jd3.k(this.getWindow());
            if (v1_9 != null) {
                jd3.q(v1_9, (jd3.b() | jd3.t()));
                b3.v(v1_9);
            }
        }
        android.animation.ObjectAnimator v3_21;
        this.getWindow().addFlags(-2147483648);
        android.animation.ObjectAnimator v1_32 = this.V();
        int v2_25 = this.U().a;
        android.animation.ObjectAnimator v3_18 = this.getIntent().getStringExtra("destination");
        v3_18.getClass();
        if (com.android.vending.activities.MainActivity.isAssignableFrom(Class.forName(v3_18))) {
            v3_21 = 8;
        } else {
            v3_21 = 0;
        }
        v2_25.setVisibility(v3_21);
        this.U().q.setText(this.getIntent().getStringExtra("title"));
        android.animation.ObjectAnimator v3_24 = v1_32.d;
        android.animation.ObjectAnimator v1_34 = v1_32.c;
        this.U().l.setText(this.getString(2132017181, new Object[] {Integer.valueOf(v3_24)})));
        this.U().k.setText(this.getString(2132017182, new Object[] {Integer.valueOf(v3_24)})));
        this.U().n.setText(this.getString(2132017764, new Object[] {Integer.valueOf(v1_34)})));
        this.U().p.setText(this.getString(2132017186, new Object[] {Integer.valueOf(v3_24), Integer.valueOf(v1_34)})));
        int v2_1 = this.U().o;
        android.animation.ObjectAnimator v3_3 = new StringBuilder();
        v3_3.append(this.getIntent().getStringExtra("des"));
        v3_3.append(" ");
        v3_3.append(this.getString(2132017784, new Object[] {Integer.valueOf(v1_34)})));
        v2_1.setText(v3_3.toString());
        this.U().d.setOnClickListener(new g8(this, 0));
        this.U().c.setOnClickListener(new g8(this, 1));
        this.U().b.setOnClickListener(new g8(this, 2));
        this.U().a.setOnClickListener(new g8(this, 3));
        int v2_11 = this.U().l;
        android.animation.Animator[] v8_1 = this.U().q;
        int v9_1 = this.U().o;
        int v10_1 = this.U().s;
        android.widget.LinearLayout v11_1 = this.U().i;
        long v12_1 = this.U().d;
        android.widget.LinearLayout v13_1 = this.U().j;
        androidx.constraintlayout.widget.ConstraintLayout v14_1 = this.U().f;
        androidx.constraintlayout.widget.ConstraintLayout v15_1 = this.U().e;
        android.animation.ObjectAnimator v3_6 = new android.view.View[10];
        v3_6[0] = this.U().g;
        v3_6[1] = v2_11;
        v3_6[2] = v8_1;
        v3_6[3] = v9_1;
        v3_6[4] = v10_1;
        v3_6[5] = v11_1;
        v3_6[6] = v12_1;
        v3_6[7] = v13_1;
        v3_6[8] = v14_1;
        v3_6[9] = v15_1;
        android.animation.ObjectAnimator v1_22 = mc4.u(v3_6);
        int v2_14 = v1_22.iterator();
        while (v2_14.hasNext()) {
            android.animation.ObjectAnimator v3_16 = ((android.view.View) v2_14.next());
            v3_16.setAlpha(0);
            v3_16.setTranslationY(1103101952);
        }
        android.animation.ObjectAnimator v1_23 = v1_22.iterator();
        int v2_15 = 0;
        while (v1_23.hasNext()) {
            android.animation.ObjectAnimator v3_12 = v1_23.next();
            int v9_2 = (v2_15 + 1);
            if (v2_15 < 0) {
                mc4.C();
                throw 0;
            } else {
                android.animation.ObjectAnimator v3_13 = ((android.view.View) v3_12);
                int v10_4 = ((((long) v2_15) * 45) + 60);
                int v2_22 = new android.animation.AnimatorSet();
                android.animation.ObjectAnimator v7_3 = new float[2];
                v7_3 = {0, 1065353216};
                android.animation.ObjectAnimator v7_4 = android.animation.ObjectAnimator.ofFloat(v3_13, "alpha", v7_3);
                v7_4.setDuration(300);
                v7_4.setStartDelay(v10_4);
                android.animation.Animator[] v8_3 = new float[2];
                v8_3 = {1103101952, 0};
                android.animation.ObjectAnimator v3_14 = android.animation.ObjectAnimator.ofFloat(v3_13, "translationY", v8_3);
                v3_14.setDuration(340);
                v3_14.setStartDelay(v10_4);
                v3_14.setInterpolator(new android.view.animation.OvershootInterpolator(1065353216));
                android.animation.Animator[] v8_6 = new android.animation.Animator[2];
                v8_6[0] = v7_4;
                v8_6[1] = v3_14;
                v2_22.playTogether(v8_6);
                v2_22.start();
                v2_15 = v9_2;
            }
        }
        this.U().r.setScaleX(0);
        this.U().r.setPivotX(0);
        android.animation.ObjectAnimator v1_28 = this.U();
        int v2_16 = new float[2];
        v2_16 = {0, 1065353216};
        android.animation.ObjectAnimator v1_30 = android.animation.ObjectAnimator.ofFloat(v1_28.r, "scaleX", v2_16);
        v1_30.setDuration(500);
        v1_30.setStartDelay(60);
        v1_30.setInterpolator(new android.view.animation.DecelerateInterpolator(1073741824));
        v1_30.start();
        this.Y();
        return;
    }

    public final void onDestroy()
    {
        android.os.CountDownTimer v0_0 = this.E;
        if (v0_0 != null) {
            v0_0.cancel();
        }
        this.U().d.setScaleX(1065353216);
        this.U().d.setScaleY(1065353216);
        android.os.CountDownTimer v0_2 = this.D;
        if (v0_2 != null) {
            v0_2.cancel();
        }
        super.onDestroy();
        return;
    }

    public final void onResume()
    {
        super.onResume();
        if ((!this.B) || (this.A)) {
            if (this.A) {
                this.X();
            }
            return;
        } else {
            androidx.appcompat.widget.AppCompatButton v0_15 = this.D;
            if (v0_15 != null) {
                v0_15.cancel();
            }
            this.D = 0;
            this.B = 0;
            String v1_3 = this.getString(2132017184, new Object[] {Long.valueOf(this.C)}));
            v1_3.getClass();
            this.U().m.setText(v1_3);
            if (this.U().h.getVisibility() != 0) {
                String v1_8 = this.U().h;
                v1_8.setAlpha(0);
                v1_8.setVisibility(0);
                v1_8.animate().alpha(1065353216).setDuration(280).start();
                androidx.appcompat.widget.AppCompatButton v0_8 = this.U();
                String v1_12 = new float[8];
                v1_12 = {0, -1054867456, 1092616192, -1056964608, 1090519040, -1065353216, 1082130432, 0};
                androidx.appcompat.widget.AppCompatButton v0_10 = android.animation.ObjectAnimator.ofFloat(v0_8.h, "translationX", v1_12);
                v0_10.setDuration(400);
                v0_10.start();
            }
            this.U().d.setEnabled(1);
            this.U().d.setText(this.getString(2132017278));
            this.Y();
            return;
        }
    }
}

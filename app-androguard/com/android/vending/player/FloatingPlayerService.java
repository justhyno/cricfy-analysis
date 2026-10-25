package com.android.vending.player;
public final class FloatingPlayerService extends an1 {
    public static com.android.vending.player.FloatingPlayerService u;
    public final j4 p;
    public final java.util.LinkedHashMap q;
    public final vk3 r;
    public final vk3 s;
    public final z8 t;

    public FloatingPlayerService()
    {
        this.p = new j4(10);
        this.q = new java.util.LinkedHashMap();
        this.r = new vk3(new xx0(this, 0));
        this.s = new vk3(new xx0(this, 1));
        this.t = new z8(this, 5);
        return;
    }

    public final void onCreate()
    {
        super.onCreate();
        this.registerReceiver(this.t, new android.content.IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        com.android.vending.player.FloatingPlayerService.u = this;
        if (android.os.Build$VERSION.SDK_INT >= 26) {
            z2.k();
            android.app.Notification v0_2 = new android.app.NotificationChannel("floating_player_channel", "Floating Player", 2);
            v0_2.setDescription("Floating player notification channel");
            ((android.app.NotificationManager) this.getSystemService(android.app.NotificationManager)).createNotificationChannel(v0_2);
        }
        android.app.Notification v0_4 = new pg2(this, "floating_player_channel");
        v0_4.e = pg2.b("Floating Player");
        v0_4.f = pg2.b("Player is running in background");
        v0_4.t.icon = 2131231313;
        v0_4.j = -1;
        v0_4.c(2, 1);
        android.app.Notification v0_6 = v0_4.a();
        v0_6.getClass();
        this.startForeground(101, v0_6);
        return;
    }

    public final void onDestroy()
    {
        com.android.vending.player.FloatingPlayerService.u = 0;
        this.unregisterReceiver(this.t);
        int v0_5 = this.q.values().iterator();
        while (v0_5.hasNext()) {
            ((wx0) v0_5.next()).a();
        }
        this.stopForeground(1);
        super.onDestroy();
        return;
    }

    public final int onStartCommand(android.content.Intent p13, int p14, int p15)
    {
        super.onStartCommand(p13, p14, p15);
        int v14_1 = this.q;
        int v0_0 = this.r;
        if (v14_1.size() < ((android.content.SharedPreferences) v0_0.getValue()).getInt("floatingPlayersCount", 1)) {
            int v1_2;
            if (p13 == null) {
                if (p13 == null) {
                    v1_2 = 0;
                } else {
                    v1_2 = p13.getStringExtra("query");
                }
            } else {
                int v1_1 = p13.getData();
                if (v1_1 == 0) {
                } else {
                    v1_2 = v1_1.toString();
                    if (v1_2 == 0) {
                    }
                }
            }
            java.util.Iterator v2_0 = v14_1.values();
            if ((v2_0 == null) || (!v2_0.isEmpty())) {
                java.util.Iterator v2_1 = v2_0.iterator();
                while (v2_1.hasNext()) {
                    if (rg1.a(((wx0) v2_1.next()).c().c.b, v1_2)) {
                        return 1;
                    }
                }
            }
            String v9 = java.util.UUID.randomUUID().toString();
            v9.getClass();
            android.app.Application v5 = this.getApplication();
            v5.getClass();
            android.content.SharedPreferences v6_1 = ((android.content.SharedPreferences) v0_0.getValue());
            boolean v4_9 = new wx0(v5, v6_1, this, ((android.view.WindowManager) this.s.getValue()), v9, new yx0(this, 0), new o9(v9, 7, this));
            String v12_24 = this.p;
            v12_24.getClass();
            ((java.util.LinkedHashSet) v12_24.p).add(v9);
            v4_9.d(p13);
            v14_1.put(v9, v4_9);
            String v12_27 = new android.view.ContextThemeWrapper;
            v12_27(v5, 2132083088);
            v4_9.g = com.cricfytv.sports.databinding.PlayerViewBinding.inflate(android.view.LayoutInflater.from(v12_27), 0, 0);
            String v12_30 = new t70;
            v12_30(v4_9.b().b, v6_1, v4_9.c());
            v4_9.j = v12_30;
            String v12_1 = android.content.res.Resources.getSystem().getDisplayMetrics();
            v4_9.q = v12_1.widthPixels;
            v4_9.r = v12_1.heightPixels;
            String v12_5 = v4_9.b().b.getControllerBinding();
            v12_5.k.setVisibility(0);
            v12_5.k.setOnClickListener(new tx0(v4_9, 0));
            v12_5.e.setOnClickListener(new tx0(v4_9, 1));
            String v12_7 = new android.view.GestureDetector;
            v12_7(v5, new vx0(v4_9));
            v4_9.b().b.getDragHandle().setOnTouchListener(new rx0(v4_9, v12_7));
            v4_9.b().b.getResizeHandle().setOnTouchListener(new y6(v4_9, 4));
            wx0.g(v4_9);
            v4_9.b().b.setOnRetry(new sx0(v4_9, 1));
            String v12_13 = new ux0;
            v12_13(v4_9, 0);
            v4_9.s = v12_13;
            String v12_14 = v4_9.c();
            ux0 v13_15 = v4_9.s;
            if (v13_15 == null) {
                rg1.U("playerItemObserver");
                throw 0;
            } else {
                v12_14.h.d(this, v13_15);
                String v12_17 = new ux0;
                v12_17(v4_9, 1);
                v4_9.t = v12_17;
                String v12_18 = v4_9.c();
                ux0 v13_16 = v4_9.t;
                if (v13_16 == null) {
                    rg1.U("serversObserver");
                    throw 0;
                } else {
                    v12_18.g.d(this, v13_16);
                    return 1;
                }
            }
        } else {
            ((wx0) lz.D0(v14_1.values())).d(p13);
            return 1;
        }
    }
}

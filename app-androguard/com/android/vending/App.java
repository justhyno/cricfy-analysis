package com.android.vending;
public final class App extends android.app.Application implements hd1 {
    public static final synthetic int q;
    public io.cashraven.sdk.CashRaven o;
    public final tl1 p;

    public App()
    {
        this.p = re2.I(bm1.p, new x6(this, 12));
        return;
    }

    public final String a(int p2)
    {
        return String.format(java.util.Locale.US, "#%06X", java.util.Arrays.copyOf(new Object[] {Integer.valueOf((this.getColor(p2) & 16777215))}), 1));
    }

    public final zu2 b()
    {
        gd1 v0_1 = new gd1(this);
        zu2 v12_3 = v0_1.a;
        v0_1.b = ef0.a(v0_1.b, jl4.M(v12_3, 2131231630).mutate(), 0, 32255);
        v0_1.b = ef0.a(v0_1.b, 0, jl4.M(v12_3, 2131231630).mutate(), 31743);
        zu2 v12_5 = new java.util.ArrayList;
        v12_5();
        java.util.ArrayList v1_2 = new java.util.ArrayList();
        java.util.ArrayList v2_3 = new java.util.ArrayList();
        java.util.ArrayList v3_1 = new java.util.ArrayList();
        java.util.ArrayList v4_1 = new java.util.ArrayList();
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v4_1.add(new x51());
        } else {
            v4_1.add(new wc1());
        }
        v0_1.c = new x10(bf4.E(v12_5), bf4.E(v1_2), bf4.E(v2_3), bf4.E(v3_1), bf4.E(v4_1));
        return v0_1.a();
    }

    public final void onCreate()
    {
        f70.b = this;
        f70.c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(f70.a);
        tb.l();
        super.onCreate();
        boolean v0_5 = android.provider.Settings$Secure.getString(this.getContentResolver(), "android_id");
        u01 v1_1 = 0;
        if (!v0_5) {
            v0_5 = this.getPackageName();
        } else {
            if (sh3.N(v0_5)) {
                v0_5 = 0;
            }
            if (!v0_5) {
            }
        }
        ys4 v6_2 = v0_5;
        v6_2.getClass();
        String v7_0 = this.a(2131099719);
        String v8_0 = this.a(2131099721);
        String v9_0 = this.a(2131099718);
        String v10 = this.a(2131099720);
        String v11 = this.getString(2132017196);
        v11.getClass();
        ge2 v2_12 = io.cashraven.sdk.CashRaven.Companion.createBranded("edge.cashraven.io", 9000, "97a90ab6b90a5bc3774fa72c34d36cb55c64ed84", v6_2, v7_0, v8_0, v9_0, v10, v11, "", "", "");
        int v3_3 = this.getPackageName();
        v3_3.getClass();
        v2_12.setAppId(v3_3);
        this.o = v2_12;
        String v7_1 = this.getString(2132017196);
        v7_1.getClass();
        String v8_1 = this.getString(2132017782);
        v8_1.getClass();
        String v9_1 = this.getString(2132017781);
        v9_1.getClass();
        io.cashraven.sdk.CashRavenService.Companion.configure(v2_12, new io.cashraven.sdk.CashRavenService$Config(2131231313, com.android.vending.activities.Splash, v7_1, v8_1, v9_1));
        boolean v0_22 = new bb(this, 0);
        try {
            java.util.LinkedHashSet v4_8 = new el1();
        } catch (boolean v0_24) {
            throw v0_24;
        }
        if (dx5.q != null) {
            okhttp3.internal.cache.DiskLruCache v15_9 = new qh;
            v15_9("A Koin Application has already been started", 2);
            throw v15_9;
        } else {
            dx5.q = v4_8.a;
            v0_22.invoke(v4_8);
            v4_8.a.c();
            boolean v0_28 = com.google.firebase.messaging.FirebaseMessaging.getInstance(com.google.firebase.FirebaseApp.getInstance());
            v0_28.getClass();
            boolean v0_29 = v0_28.i;
            ge2 v2_0 = new tq0(15);
            v0_29.getClass();
            v0_29.b.d(new ys4(hm3.a, v2_0, new f85()));
            v0_29.q();
            boolean v0_4 = ((yx2) com.google.firebase.FirebaseApp.getInstance().get(yx2)).c();
            v0_4.getClass();
            v0_4.d();
            v0_4.a();
            jz5 v5_2 = v0_4.j;
            ((java.util.LinkedHashSet) v5_2.p).add(new db(v0_4, 0));
            v5_2.a();
            boolean v0_7 = v0_4.b("cric_api2");
            ge2 v2_6 = "/";
            if (zh3.s(v0_7, "/", 0)) {
                v2_6 = "";
            }
            boolean v0_9 = v0_7.concat(v2_6);
            ge2 v2_8 = new bb(this, 1);
            zd2.b = v0_9;
            zd2.a = this;
            okhttp3.internal.cache.DiskLruCache v15_3 = new okhttp3.OkHttpClient$Builder;
            v15_3();
            v2_8.invoke(v15_3);
            ge2 v2_9 = ge2.a;
            if (!v15_3.interceptors().contains(v2_9)) {
                v15_3.addInterceptor(v2_9);
            }
            okhttp3.internal.cache.DiskLruCache v15_4 = v15_3.build();
            v15_4.getClass();
            if (!v15_4.interceptors().contains(v2_9)) {
                v15_4 = v15_4.newBuilder().addInterceptor(v2_9).build();
            }
            zd2.c = v15_4;
            okhttp3.internal.cache.DiskLruCache v15_7 = v15_4.cache();
            if (v15_7 != null) {
                okhttp3.internal.cache.DiskLruCache v15_8 = okhttp3.OkHttpUtils.diskLruCache(v15_7);
                v15_8.getClass();
                v1_1 = new u01(v15_8);
            }
            zd2.d = v1_1;
            return;
        }
    }
}

package com.android.vending.helpers;
public final class PushService extends com.google.firebase.messaging.FirebaseMessagingService {
    public final android.content.SharedPreferences v;
    public final cg2 w;

    public PushService()
    {
        this.v = ((android.content.SharedPreferences) rf2.g(this).d(pw2.a(android.content.SharedPreferences), 0));
        this.w = ((cg2) rf2.g(this).d(pw2.a(cg2), 0));
        return;
    }

    public final void c(dy2 p17)
    {
        if (p17.p == null) {
            int v2_9 = p17.o;
            String v4_17 = new re(0);
            String v5_0 = v2_9.keySet().iterator();
            while (v5_0.hasNext()) {
                String v6_2 = ((String) v5_0.next());
                boolean v7_1 = v2_9.get(v6_2);
                if (((v7_1 instanceof String)) && ((!v6_2.startsWith("google.")) && ((!v6_2.startsWith("gcm.")) && ((!v6_2.equals("from")) && ((!v6_2.equals("message_type")) && (!v6_2.equals("collapse_key"))))))) {
                    v4_17.put(v6_2, ((String) v7_1));
                }
            }
            p17.p = v4_17;
        }
        String v6_3;
        int v2_5 = new java.util.HashMap(p17.p);
        android.app.Notification v0_11 = ((String) v2_5.get("type"));
        if (v0_11 == null) {
            v6_3 = 0;
        } else {
            v6_3 = Integer.parseInt(v0_11);
        }
        if (v6_3 != 3) {
            boolean v7_4;
            String v4_7 = this.getSharedPreferences("rtstv", 0);
            boolean v7_3 = v4_7.getInt("notId", 0);
            if (v7_3 >= 500000) {
                v7_4 = 0;
            } else {
                v7_4 = (v7_3 + 1);
            }
            String v4_12;
            v4_7.edit().putInt("notId", v7_4).apply();
            int v8_14 = ((String) v2_5.get("query"));
            if (v6_3 == 1) {
                og2 v12_6 = new android.content.Intent(this, com.android.vending.activities.Splash);
                v12_6.putExtra("query", v8_14);
                v12_6.putExtra("isStream", 0);
                v12_6.putExtra("notId", v7_4);
                v4_12 = v12_6;
            } else {
                try {
                    if (v6_3 == 2) {
                        v4_12 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(v8_14));
                    } else {
                        v4_12 = new android.content.Intent(this, com.android.vending.activities.Splash);
                        v4_12.putExtra("notId", v7_4);
                    }
                } catch (Exception) {
                    v4_12 = new android.content.Intent(this, com.android.vending.activities.Splash);
                }
            }
            String v4_1;
            v4_12.addFlags(67108864);
            String v5_12 = android.media.RingtoneManager.getDefaultUri(2);
            String v3_9 = android.app.PendingIntent.getActivity(this, 0, v4_12, 201326592);
            String v4_19 = this.getSystemService("notification");
            v4_19.getClass();
            android.app.NotificationManager v10_3 = ((android.app.NotificationManager) v4_19);
            if (android.os.Build$VERSION.SDK_INT < 26) {
                v4_1 = new pg2(this.getApplicationContext(), 0);
            } else {
                z2.k();
                pg2 v11_0 = new android.app.NotificationChannel("cricfy_notification_channel", this.getResources().getString(2132017196), 4);
                v10_3.createNotificationChannel(v11_0);
                v4_1 = new pg2(this.getApplicationContext(), v11_0.getId());
            }
            pg2 v11_2 = v4_1;
            String v4_4 = ((String) v2_5.get("title"));
            String v14_2 = "";
            if (v4_4 == null) {
                v4_4 = "";
            }
            x50 v15_2 = ((String) v2_5.get("body"));
            if (v15_2 != null) {
                v14_2 = v15_2;
            }
            int v9_3;
            String v3_4;
            int v9_0 = v11_2.t;
            v9_0.icon = 2131231313;
            v11_2.e = pg2.b(v4_4);
            v11_2.f = pg2.b(v14_2);
            v11_2.c(16, 1);
            v9_0.sound = v5_12;
            v9_0.audioStreamType = -1;
            v9_0.audioAttributes = new android.media.AudioAttributes$Builder().setContentType(4).setUsage(5).build();
            v11_2.g = v3_9;
            String v5_8 = ((String) v2_5.get("image"));
            int v2_1 = ((String) v2_5.get("image"));
            if ((v2_1 != 0) && (v2_1.length() != 0)) {
                int v2_4 = ((android.graphics.Bitmap) al.z(fe0.p, new j9(this, v2_1, 0, 20)));
                if (v2_4 == 0) {
                    v9_3 = 3;
                    v3_4 = new og2(3);
                    v3_4.q = pg2.b(v14_2);
                } else {
                    v9_3 = 3;
                    v3_4 = new ng2(3);
                    og2 v12_3 = new androidx.core.graphics.drawable.IconCompat(1);
                    v12_3.b = v2_4;
                    v3_4.q = v12_3;
                }
            } else {
                v9_3 = 3;
                v3_4 = new og2(3);
                v3_4.q = pg2.b(v14_2);
            }
            og2 v12_4 = v3_4;
            int v2_6 = v7_4;
            vo.r(ke2.b(fe0.p), 0, new ft2(this, v2_6, v4_4, v14_2, v5_8, v6_3, v8_14, 0), v9_3);
            v11_2.e(v12_4);
            v10_3.notify(v2_6, v11_2.a());
            return;
        } else {
            this.v.edit().putBoolean("PUSH_RC", 1).apply();
            return;
        }
    }
}

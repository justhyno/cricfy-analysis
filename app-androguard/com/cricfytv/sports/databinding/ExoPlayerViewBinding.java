package com.cricfytv.sports.databinding;
public final class ExoPlayerViewBinding implements dy3 {
    public final android.view.View a;
    public final android.widget.ImageView b;
    public final android.view.View c;
    public final android.widget.ProgressBar d;
    public final android.widget.TextView e;
    public final android.widget.TextView f;
    public final android.view.View g;
    public final android.widget.FrameLayout h;
    public final com.cricfytv.sports.CircularProgressBar i;
    public final android.widget.ImageView j;
    public final android.widget.Button k;

    public ExoPlayerViewBinding(android.view.View p1, android.widget.ImageView p2, android.view.View p3, android.widget.ProgressBar p4, android.widget.TextView p5, android.widget.TextView p6, android.view.View p7, android.widget.FrameLayout p8, com.cricfytv.sports.CircularProgressBar p9, android.widget.ImageView p10, android.widget.Button p11)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10;
        this.k = p11;
        return;
    }

    public static com.cricfytv.sports.databinding.ExoPlayerViewBinding bind(android.view.View p14)
    {
        int v0_0 = 2131361964;
        android.widget.ImageView v4_1 = ((android.widget.ImageView) tg.m(p14, 2131361964));
        if (v4_1 != null) {
            v0_0 = 2131362096;
            android.view.View v5 = tg.m(p14, 2131362096);
            if (v5 != null) {
                v0_0 = 2131362135;
                if (((android.widget.FrameLayout) tg.m(p14, 2131362135)) != null) {
                    v0_0 = 2131362136;
                    if (((android.widget.ImageView) tg.m(p14, 2131362136)) != null) {
                        v0_0 = 2131362142;
                        android.widget.ProgressBar v6_1 = ((android.widget.ProgressBar) tg.m(p14, 2131362142));
                        if (v6_1 != null) {
                            v0_0 = 2131362143;
                            android.widget.TextView v7_1 = ((android.widget.TextView) tg.m(p14, 2131362143));
                            if (v7_1 != null) {
                                v0_0 = 2131362146;
                                if (((androidx.media3.ui.AspectRatioFrameLayout) tg.m(p14, 2131362146)) != null) {
                                    v0_0 = 2131362147;
                                    if (((androidx.media3.ui.PlayerControlView) tg.m(p14, 2131362147)) != null) {
                                        v0_0 = 2131362151;
                                        android.widget.TextView v8_1 = ((android.widget.TextView) tg.m(p14, 2131362151));
                                        if (v8_1 != null) {
                                            v0_0 = 2131362171;
                                            if (((android.widget.FrameLayout) tg.m(p14, 2131362171)) != null) {
                                                v0_0 = 2131362187;
                                                android.view.View v9 = tg.m(p14, 2131362187);
                                                if (v9 != null) {
                                                    v0_0 = 2131362190;
                                                    if (((androidx.media3.ui.SubtitleView) tg.m(p14, 2131362190)) != null) {
                                                        v0_0 = 2131362222;
                                                        android.widget.FrameLayout v10_1 = ((android.widget.FrameLayout) tg.m(p14, 2131362222));
                                                        if (v10_1 != null) {
                                                            v0_0 = 2131362551;
                                                            com.cricfytv.sports.CircularProgressBar v11_1 = ((com.cricfytv.sports.CircularProgressBar) tg.m(p14, 2131362551));
                                                            if (v11_1 != null) {
                                                                v0_0 = 2131362572;
                                                                android.widget.ImageView v12_1 = ((android.widget.ImageView) tg.m(p14, 2131362572));
                                                                if (v12_1 != null) {
                                                                    v0_0 = 2131362576;
                                                                    android.widget.Button v13_1 = ((android.widget.Button) tg.m(p14, 2131362576));
                                                                    if (v13_1 != null) {
                                                                        return new com.cricfytv.sports.databinding.ExoPlayerViewBinding(p14, v4_1, v5, v6_1, v7_1, v8_1, v9, v10_1, v11_1, v12_1, v13_1);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p14.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.ExoPlayerViewBinding inflate(android.view.LayoutInflater p1, android.view.ViewGroup p2)
    {
        if (p2 == null) {
            lr3.p("parent");
            return 0;
        } else {
            p1.inflate(2131558479, p2);
            return com.cricfytv.sports.databinding.ExoPlayerViewBinding.bind(p2);
        }
    }
}

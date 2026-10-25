package com.cricfytv.sports.databinding;
public final class PlayerViewBinding implements dy3 {
    public final com.android.vending.player.CricfyPlayerView a;
    public final com.android.vending.player.CricfyPlayerView b;

    public PlayerViewBinding(com.android.vending.player.CricfyPlayerView p1, com.android.vending.player.CricfyPlayerView p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static com.cricfytv.sports.databinding.PlayerViewBinding bind(android.view.View p1)
    {
        if (p1 == 0) {
            lr3.p("rootView");
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.PlayerViewBinding(((com.android.vending.player.CricfyPlayerView) p1), ((com.android.vending.player.CricfyPlayerView) p1));
        }
    }

    public static com.cricfytv.sports.databinding.PlayerViewBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.PlayerViewBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.PlayerViewBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.PlayerViewBinding v2_1 = p2.inflate(2131558600, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.PlayerViewBinding.bind(v2_1);
    }
}

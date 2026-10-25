package com.cricfytv.sports.databinding;
public final class PlaylistItemBinding implements dy3 {
    public final com.google.android.material.card.MaterialCardView a;
    public final de.hdodenhof.circleimageview.CircleImageView b;
    public final android.widget.TextView c;

    public PlaylistItemBinding(com.google.android.material.card.MaterialCardView p1, de.hdodenhof.circleimageview.CircleImageView p2, android.widget.TextView p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.PlaylistItemBinding bind(android.view.View p3)
    {
        com.cricfytv.sports.databinding.PlaylistItemBinding v0_0 = 2131362001;
        de.hdodenhof.circleimageview.CircleImageView v1_1 = ((de.hdodenhof.circleimageview.CircleImageView) tg.m(p3, 2131362001));
        if (v1_1 != null) {
            v0_0 = 2131362746;
            android.widget.TextView v2_1 = ((android.widget.TextView) tg.m(p3, 2131362746));
            if (v2_1 != null) {
                return new com.cricfytv.sports.databinding.PlaylistItemBinding(((com.google.android.material.card.MaterialCardView) p3), v1_1, v2_1);
            }
        }
        lr3.p("Missing required view with ID: ".concat(p3.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.PlaylistItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.PlaylistItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.PlaylistItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.PlaylistItemBinding v2_1 = p2.inflate(2131558602, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.PlaylistItemBinding.bind(v2_1);
    }
}

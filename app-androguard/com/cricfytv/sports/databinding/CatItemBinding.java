package com.cricfytv.sports.databinding;
public final class CatItemBinding implements dy3 {
    public final com.google.android.material.card.MaterialCardView a;
    public final de.hdodenhof.circleimageview.CircleImageView b;
    public final com.cricfytv.sports.Utf8SafeTextView c;
    public final android.widget.ImageButton d;

    public CatItemBinding(com.google.android.material.card.MaterialCardView p1, de.hdodenhof.circleimageview.CircleImageView p2, com.cricfytv.sports.Utf8SafeTextView p3, android.widget.ImageButton p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public static com.cricfytv.sports.databinding.CatItemBinding bind(android.view.View p4)
    {
        com.cricfytv.sports.databinding.CatItemBinding v0_0 = 2131361986;
        de.hdodenhof.circleimageview.CircleImageView v1_1 = ((de.hdodenhof.circleimageview.CircleImageView) tg.m(p4, 2131361986));
        if (v1_1 != null) {
            v0_0 = 2131361988;
            com.cricfytv.sports.Utf8SafeTextView v2_1 = ((com.cricfytv.sports.Utf8SafeTextView) tg.m(p4, 2131361988));
            if (v2_1 != null) {
                v0_0 = 2131362106;
                android.widget.ImageButton v3_1 = ((android.widget.ImageButton) tg.m(p4, 2131362106));
                if (v3_1 != null) {
                    return new com.cricfytv.sports.databinding.CatItemBinding(((com.google.android.material.card.MaterialCardView) p4), v1_1, v2_1, v3_1);
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p4.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.CatItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.CatItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.CatItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.CatItemBinding v2_1 = p2.inflate(2131558447, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.CatItemBinding.bind(v2_1);
    }
}

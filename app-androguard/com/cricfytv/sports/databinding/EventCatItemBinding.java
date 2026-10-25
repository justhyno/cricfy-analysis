package com.cricfytv.sports.databinding;
public final class EventCatItemBinding implements dy3 {
    public final com.google.android.material.card.MaterialCardView a;
    public final android.widget.TextView b;
    public final android.widget.ImageView c;

    public EventCatItemBinding(com.google.android.material.card.MaterialCardView p1, android.widget.TextView p2, android.widget.ImageView p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.EventCatItemBinding bind(android.view.View p3)
    {
        com.cricfytv.sports.databinding.EventCatItemBinding v0_0 = 2131361987;
        android.widget.TextView v1_1 = ((android.widget.TextView) tg.m(p3, 2131361987));
        if (v1_1 != null) {
            v0_0 = 2131362127;
            android.widget.ImageView v2_1 = ((android.widget.ImageView) tg.m(p3, 2131362127));
            if (v2_1 != null) {
                return new com.cricfytv.sports.databinding.EventCatItemBinding(((com.google.android.material.card.MaterialCardView) p3), v1_1, v2_1);
            }
        }
        lr3.p("Missing required view with ID: ".concat(p3.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.EventCatItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.EventCatItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.EventCatItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.EventCatItemBinding v2_1 = p2.inflate(2131558472, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.EventCatItemBinding.bind(v2_1);
    }
}

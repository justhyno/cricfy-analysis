package com.cricfytv.sports.databinding;
public final class MessageLyBinding implements dy3 {
    public final com.google.android.material.card.MaterialCardView a;
    public final com.cricfytv.sports.Utf8SafeTextView b;

    public MessageLyBinding(com.google.android.material.card.MaterialCardView p1, com.cricfytv.sports.Utf8SafeTextView p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static com.cricfytv.sports.databinding.MessageLyBinding bind(android.view.View p3)
    {
        com.cricfytv.sports.Utf8SafeTextView v2_1 = ((com.cricfytv.sports.Utf8SafeTextView) tg.m(p3, 2131362357));
        if (v2_1 == null) {
            lr3.p("Missing required view with ID: ".concat(p3.getResources().getResourceName(2131362357)));
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.MessageLyBinding(((com.google.android.material.card.MaterialCardView) p3), v2_1);
        }
    }

    public static com.cricfytv.sports.databinding.MessageLyBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.MessageLyBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.MessageLyBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.MessageLyBinding v2_1 = p2.inflate(2131558536, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.MessageLyBinding.bind(v2_1);
    }
}

package com.cricfytv.sports.databinding;
public final class ChannelItemBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final de.hdodenhof.circleimageview.CircleImageView b;

    public ChannelItemBinding(androidx.constraintlayout.widget.ConstraintLayout p1, de.hdodenhof.circleimageview.CircleImageView p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static com.cricfytv.sports.databinding.ChannelItemBinding bind(android.view.View p2)
    {
        de.hdodenhof.circleimageview.CircleImageView v1_1 = ((de.hdodenhof.circleimageview.CircleImageView) tg.m(p2, 2131362001));
        if (v1_1 == null) {
            lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(2131362001)));
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.ChannelItemBinding(((androidx.constraintlayout.widget.ConstraintLayout) p2), v1_1);
        }
    }

    public static com.cricfytv.sports.databinding.ChannelItemBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ChannelItemBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ChannelItemBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ChannelItemBinding v2_1 = p2.inflate(2131558448, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ChannelItemBinding.bind(v2_1);
    }
}

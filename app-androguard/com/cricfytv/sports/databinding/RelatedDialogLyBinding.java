package com.cricfytv.sports.databinding;
public final class RelatedDialogLyBinding implements dy3 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public final android.widget.ImageButton b;
    public final androidx.recyclerview.widget.RecyclerView c;

    public RelatedDialogLyBinding(androidx.constraintlayout.widget.ConstraintLayout p1, android.widget.ImageButton p2, androidx.recyclerview.widget.RecyclerView p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.RelatedDialogLyBinding bind(android.view.View p4)
    {
        com.cricfytv.sports.databinding.RelatedDialogLyBinding v0_0 = 2131362016;
        android.widget.ImageButton v1_1 = ((android.widget.ImageButton) tg.m(p4, 2131362016));
        if (v1_1 != null) {
            v0_0 = 2131362569;
            androidx.recyclerview.widget.RecyclerView v2_1 = ((androidx.recyclerview.widget.RecyclerView) tg.m(p4, 2131362569));
            if (v2_1 != null) {
                v0_0 = 2131362722;
                if (((android.widget.TextView) tg.m(p4, 2131362722)) != null) {
                    return new com.cricfytv.sports.databinding.RelatedDialogLyBinding(((androidx.constraintlayout.widget.ConstraintLayout) p4), v1_1, v2_1);
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p4.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.RelatedDialogLyBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.RelatedDialogLyBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.RelatedDialogLyBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.RelatedDialogLyBinding v2_1 = p2.inflate(2131558603, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.RelatedDialogLyBinding.bind(v2_1);
    }
}

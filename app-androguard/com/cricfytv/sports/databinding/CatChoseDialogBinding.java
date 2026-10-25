package com.cricfytv.sports.databinding;
public final class CatChoseDialogBinding implements dy3 {
    public final android.widget.LinearLayout a;
    public final android.widget.ListView b;
    public final com.google.android.material.appbar.MaterialToolbar c;

    public CatChoseDialogBinding(android.widget.LinearLayout p1, android.widget.ListView p2, com.google.android.material.appbar.MaterialToolbar p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.cricfytv.sports.databinding.CatChoseDialogBinding bind(android.view.View p3)
    {
        com.cricfytv.sports.databinding.CatChoseDialogBinding v0_0 = 2131362513;
        android.widget.ListView v1_1 = ((android.widget.ListView) tg.m(p3, 2131362513));
        if (v1_1 != null) {
            v0_0 = 2131362753;
            com.google.android.material.appbar.MaterialToolbar v2_1 = ((com.google.android.material.appbar.MaterialToolbar) tg.m(p3, 2131362753));
            if (v2_1 != null) {
                return new com.cricfytv.sports.databinding.CatChoseDialogBinding(((android.widget.LinearLayout) p3), v1_1, v2_1);
            }
        }
        lr3.p("Missing required view with ID: ".concat(p3.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.CatChoseDialogBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.CatChoseDialogBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.CatChoseDialogBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.CatChoseDialogBinding v2_1 = p2.inflate(2131558446, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.CatChoseDialogBinding.bind(v2_1);
    }
}

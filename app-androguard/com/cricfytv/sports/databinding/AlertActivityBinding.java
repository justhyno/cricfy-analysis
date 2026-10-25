package com.cricfytv.sports.databinding;
public final class AlertActivityBinding implements dy3 {

    public static com.cricfytv.sports.databinding.AlertActivityBinding bind(android.view.View p2)
    {
        com.cricfytv.sports.databinding.AlertActivityBinding v0_0 = 2131362073;
        if (((android.widget.TextView) tg.m(p2, 2131362073)) != null) {
            v0_0 = 2131362132;
            if (((com.google.android.material.button.MaterialButton) tg.m(p2, 2131362132)) != null) {
                v0_0 = 2131362354;
                if (((android.widget.TextView) tg.m(p2, 2131362354)) != null) {
                    v0_0 = 2131362744;
                    if (((android.widget.TextView) tg.m(p2, 2131362744)) != null) {
                        return new com.cricfytv.sports.databinding.AlertActivityBinding();
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.AlertActivityBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.AlertActivityBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.AlertActivityBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.AlertActivityBinding v2_1 = p2.inflate(2131558435, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.AlertActivityBinding.bind(v2_1);
    }
}

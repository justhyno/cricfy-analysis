package com.cricfytv.sports.databinding;
public final class TrackSelectionDialogBinding implements dy3 {

    public static com.cricfytv.sports.databinding.TrackSelectionDialogBinding bind(android.view.View p2)
    {
        com.cricfytv.sports.databinding.TrackSelectionDialogBinding v0_0 = 2131362766;
        if (((android.widget.Button) tg.m(p2, 2131362766)) != null) {
            v0_0 = 2131362767;
            if (((android.widget.Button) tg.m(p2, 2131362767)) != null) {
                v0_0 = 2131362768;
                if (((com.google.android.material.tabs.TabLayout) tg.m(p2, 2131362768)) != null) {
                    v0_0 = 2131362769;
                    if (((com.android.vending.helpers.HeightWrappingViewPager) tg.m(p2, 2131362769)) != null) {
                        return new com.cricfytv.sports.databinding.TrackSelectionDialogBinding();
                    }
                }
            }
        }
        lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(v0_0)));
        return 0;
    }

    public static com.cricfytv.sports.databinding.TrackSelectionDialogBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.TrackSelectionDialogBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.TrackSelectionDialogBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.TrackSelectionDialogBinding v2_1 = p2.inflate(2131558612, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.TrackSelectionDialogBinding.bind(v2_1);
    }
}

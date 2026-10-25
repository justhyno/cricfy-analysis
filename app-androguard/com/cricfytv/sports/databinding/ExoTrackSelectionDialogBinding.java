package com.cricfytv.sports.databinding;
public final class ExoTrackSelectionDialogBinding implements dy3 {

    public static com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding bind(android.view.View p2)
    {
        if (((com.android.vending.helpers.TrackSelectionView) tg.m(p2, 2131362194)) == null) {
            lr3.p("Missing required view with ID: ".concat(p2.getResources().getResourceName(2131362194)));
            return 0;
        } else {
            return new com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding();
        }
    }

    public static com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding inflate(android.view.LayoutInflater p2)
    {
        return com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding.inflate(p2, 0, 0);
    }

    public static com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding inflate(android.view.LayoutInflater p2, android.view.ViewGroup p3, boolean p4)
    {
        com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding v2_1 = p2.inflate(2131558483, p3, 0);
        if (p4) {
            p3.addView(v2_1);
        }
        return com.cricfytv.sports.databinding.ExoTrackSelectionDialogBinding.bind(v2_1);
    }
}

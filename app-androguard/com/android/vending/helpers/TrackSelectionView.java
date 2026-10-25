package com.android.vending.helpers;
public class TrackSelectionView extends android.widget.LinearLayout {
    public static final synthetic int B;
    public aq3$a A;
    public final int o;
    public final android.view.LayoutInflater p;
    public final android.widget.CheckedTextView q;
    public final android.widget.CheckedTextView r;
    public final x3 s;
    public final java.util.ArrayList t;
    public final java.util.HashMap u;
    public boolean v;
    public boolean w;
    public tp3 x;
    public android.widget.CheckedTextView[][] y;
    public boolean z;

    public TrackSelectionView(android.content.Context p2)
    {
        this(p2, 0);
        return;
    }

    public TrackSelectionView(android.content.Context p7, android.util.AttributeSet p8)
    {
        super(p7, p8, 0);
        super.setOrientation(1);
        super.setSaveFromParentEnabled(0);
        x3 v1_0 = p7.getTheme().obtainStyledAttributes(new int[] {16843534}));
        int v2_0 = v1_0.getResourceId(0, 0);
        super.o = v2_0;
        v1_0.recycle();
        android.widget.CheckedTextView v7_1 = android.view.LayoutInflater.from(p7);
        super.p = v7_1;
        x3 v1_2 = new x3(super, 9);
        super.s = v1_2;
        super.x = new xm4(super.getResources());
        super.t = new java.util.ArrayList();
        super.u = new java.util.HashMap();
        android.view.View v4_2 = ((android.widget.CheckedTextView) v7_1.inflate(17367055, super, 0));
        super.q = v4_2;
        v4_2.setBackgroundResource(v2_0);
        v4_2.setText(2132017400);
        v4_2.setEnabled(0);
        v4_2.setFocusable(1);
        v4_2.setOnClickListener(v1_2);
        v4_2.setVisibility(8);
        super.addView(v4_2);
        super.addView(v7_1.inflate(2131558475, super, 0));
        android.widget.CheckedTextView v7_3 = ((android.widget.CheckedTextView) v7_1.inflate(17367055, super, 0));
        super.r = v7_3;
        v7_3.setBackgroundResource(v2_0);
        v7_3.setText(2132017399);
        v7_3.setEnabled(0);
        v7_3.setFocusable(1);
        v7_3.setOnClickListener(v1_2);
        super.addView(v7_3);
        return;
    }

    public static java.util.HashMap a(java.util.Map p4, java.util.ArrayList p5, boolean p6)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        int v1 = 0;
        while (v1 < p5.size()) {
            bq3 v2_2 = ((bq3) p4.get(((jq3) p5.get(v1)).b));
            if ((v2_2 != null) && ((p6) || (v0_1.isEmpty()))) {
                v0_1.put(v2_2.a, v2_2);
            }
            v1++;
        }
        return v0_1;
    }

    public final void b()
    {
        int v0_1;
        this.q.setChecked(this.z);
        java.util.HashMap v1_1 = this.u;
        if ((this.z) || (v1_1.size() != 0)) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        this.r.setChecked(v0_1);
        int v0_2 = 0;
        while (v0_2 < this.y.length) {
            bq3 v3_8 = ((bq3) v1_1.get(((jq3) this.t.get(v0_2)).b));
            int v4 = 0;
            while(true) {
                boolean v5_1 = this.y[v0_2];
                if (v4 >= v5_1.length) {
                    break;
                }
                if (v3_8 == null) {
                    v5_1[v4].setChecked(0);
                } else {
                    boolean v5_4 = v5_1[v4].getTag();
                    v5_4.getClass();
                    this.y[v0_2][v4].setChecked(v3_8.b.contains(Integer.valueOf(((gq3) v5_4).b)));
                }
                v4++;
            }
            v0_2++;
        }
        return;
    }

    public final void c()
    {
        java.util.ArrayList v0_1 = (this.getChildCount() - 1);
        while (v0_1 >= 3) {
            this.removeViewAt(v0_1);
            v0_1--;
        }
        java.util.ArrayList v0_2 = this.t;
        int v3_1 = this.r;
        int v5_0 = this.q;
        if (!v0_2.isEmpty()) {
            int v2_4;
            v5_0.setEnabled(1);
            v3_1.setEnabled(1);
            int v2_1 = new android.widget.CheckedTextView[][v0_2.size()];
            this.y = v2_1;
            if ((!this.w) || (v0_2.size() <= 1)) {
                v2_4 = 0;
            } else {
                v2_4 = 1;
            }
            int v3_0 = 0;
            while (v3_0 < v0_2.size()) {
                int v6_2;
                int v5_3 = ((jq3) v0_2.get(v3_0));
                if ((!this.v) || (!v5_3.c)) {
                    v6_2 = 0;
                } else {
                    v6_2 = 1;
                }
                int v8 = v5_3.a;
                android.widget.CheckedTextView v9_0 = new android.widget.CheckedTextView[v8];
                this.y[v3_0] = v9_0;
                gq3[] v7_1 = new gq3[v8];
                android.widget.CheckedTextView v9_1 = 0;
                while (v9_1 < v5_3.a) {
                    v7_1[v9_1] = new gq3(v5_3, v9_1);
                    v9_1++;
                }
                int v5_4 = 0;
                while (v5_4 < v8) {
                    android.widget.CheckedTextView v9_2 = this.p;
                    if (v5_4 == 0) {
                        this.addView(v9_2.inflate(2131558475, this, 0));
                    }
                    if ((v6_2 == 0) && (v2_4 == 0)) {
                        android.widget.CheckedTextView[] v10_3 = 17367055;
                    } else {
                        v10_3 = 17367056;
                    }
                    android.widget.CheckedTextView v9_4 = ((android.widget.CheckedTextView) v9_2.inflate(v10_3, this, 0));
                    v9_4.setBackgroundResource(this.o);
                    a11 v11_0 = v7_1[v5_4];
                    v9_4.setText(((xm4) this.x).y(v11_0.a.b.d[v11_0.b]));
                    v9_4.setTag(v7_1[v5_4]);
                    v9_4.setFocusable(1);
                    v9_4.setOnClickListener(this.s);
                    this.y[v3_0][v5_4] = v9_4;
                    this.addView(v9_4);
                    v5_4++;
                }
                v3_0++;
            }
            this.b();
            return;
        } else {
            v5_0.setEnabled(0);
            v3_1.setEnabled(0);
            return;
        }
    }

    public boolean getIsDisabled()
    {
        return this.z;
    }

    public java.util.Map getOverrides()
    {
        return this.u;
    }

    public void setAllowAdaptiveSelections(boolean p2)
    {
        if (this.v != p2) {
            this.v = p2;
            this.c();
        }
        return;
    }

    public void setAllowMultipleOverrides(boolean p3)
    {
        if (this.w != p3) {
            this.w = p3;
            if (p3 == null) {
                java.util.HashMap v3_1 = this.u;
                if (v3_1.size() > 1) {
                    java.util.HashMap v0_1 = com.android.vending.helpers.TrackSelectionView.a(v3_1, this.t, 0);
                    v3_1.clear();
                    v3_1.putAll(v0_1);
                }
            }
            this.c();
        }
        return;
    }

    public void setShowDisableOption(boolean p1)
    {
        int v1_1;
        if (p1 == 0) {
            v1_1 = 8;
        } else {
            v1_1 = 0;
        }
        this.q.setVisibility(v1_1);
        return;
    }

    public void setTrackNameProvider(tp3 p1)
    {
        p1.getClass();
        this.x = p1;
        this.c();
        return;
    }
}

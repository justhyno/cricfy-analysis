package com.android.vending.helpers;
public class HeightWrappingViewPager extends v04 {

    public HeightWrappingViewPager(android.content.Context p1)
    {
        super(p1);
        return;
    }

    public HeightWrappingViewPager(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        return;
    }

    public final void onMeasure(int p5, int p6)
    {
        int v0_0 = android.view.View$MeasureSpec.getMode(p6);
        if ((v0_0 == 0) || (v0_0 == -2147483648)) {
            super.onMeasure(p5, p6);
            int v0_1 = 0;
            int v1_0 = 0;
            while (v0_1 < this.getChildCount()) {
                int v2_1 = this.getChildAt(v0_1);
                v2_1.measure(p5, android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
                int v2_2 = v2_1.getMeasuredHeight();
                if (v2_2 > v1_0) {
                    v1_0 = v2_2;
                }
                v0_1++;
            }
            p6 = android.view.View$MeasureSpec.makeMeasureSpec(v1_0, 1073741824);
        }
        super.onMeasure(p5, p6);
        return;
    }
}

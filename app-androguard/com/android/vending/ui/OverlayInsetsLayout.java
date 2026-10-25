package com.android.vending.ui;
public final class OverlayInsetsLayout extends android.widget.FrameLayout {
    public int o;

    public OverlayInsetsLayout(android.content.Context p2)
    {
        p2.getClass();
        this(p2, 0);
        return;
    }

    public OverlayInsetsLayout(android.content.Context p1, android.util.AttributeSet p2)
    {
        p1.getClass();
        super(p1, p2);
        return;
    }

    public static synthetic void a(com.android.vending.ui.OverlayInsetsLayout p0)
    {
        com.android.vending.ui.OverlayInsetsLayout.setBottomOverlayHeight$lambda$0(p0);
        return;
    }

    private static final void setBottomOverlayHeight$lambda$0(com.android.vending.ui.OverlayInsetsLayout p0)
    {
        p0.b(p0);
        return;
    }

    public final void b(android.view.View p6)
    {
        int v1 = 0;
        if (!(p6 instanceof androidx.recyclerview.widget.RecyclerView)) {
            if ((!(p6 instanceof android.widget.ScrollView)) && ((!(p6 instanceof androidx.core.widget.NestedScrollView)) && (!(p6 instanceof android.widget.ListView)))) {
                if (p6.getId() == 2131362123) {
                    p6.setPadding(p6.getPaddingLeft(), p6.getPaddingTop(), p6.getPaddingRight(), this.o);
                }
            } else {
                ((android.view.ViewGroup) p6).setClipToPadding(0);
                p6.setPadding(p6.getPaddingLeft(), p6.getPaddingTop(), p6.getPaddingRight(), this.o);
            }
        } else {
            android.view.View v2_3 = ((androidx.recyclerview.widget.RecyclerView) p6).getLayoutManager();
            if (!(v2_3 instanceof androidx.recyclerview.widget.GridLayoutManager)) {
                if (!(v2_3 instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                    if ((!(v2_3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager)) || (((androidx.recyclerview.widget.StaggeredGridLayoutManager) v2_3).t != 1)) {
                        if ((p6 instanceof android.view.ViewGroup)) {
                            int v0_12 = ((android.view.ViewGroup) p6).getChildCount();
                            while (v1 < v0_12) {
                                android.view.View v2_11 = ((android.view.ViewGroup) p6).getChildAt(v1);
                                v2_11.getClass();
                                this.b(v2_11);
                                v1++;
                            }
                        }
                        return;
                    }
                } else {
                    if (((androidx.recyclerview.widget.LinearLayoutManager) v2_3).p != 1) {
                    }
                }
            } else {
                if (((androidx.recyclerview.widget.GridLayoutManager) v2_3).p != 1) {
                }
            }
            ((androidx.recyclerview.widget.RecyclerView) p6).setClipToPadding(0);
            p6.setPadding(p6.getPaddingLeft(), p6.getPaddingTop(), p6.getPaddingRight(), this.o);
        }
    }

    public final void setBottomOverlayHeight(int p2)
    {
        this.o = p2;
        this.post(new ka1(this, 8));
        return;
    }
}

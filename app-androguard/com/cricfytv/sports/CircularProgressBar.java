package com.cricfytv.sports;
public final class CircularProgressBar extends android.view.View {
    public int o;
    public int p;
    public final android.graphics.Paint q;
    public final android.graphics.Paint r;
    public final android.graphics.RectF s;

    public CircularProgressBar(android.content.Context p3, android.util.AttributeSet p4)
    {
        p3.getClass();
        p4.getClass();
        super(p3, p4);
        super.p = 100;
        int v4_7 = new android.graphics.Paint(1);
        v4_7.setColor(p3.getColor(2131099744));
        v4_7.setStyle(android.graphics.Paint$Style.FILL);
        super.q = v4_7;
        android.graphics.RectF v3_4 = new android.graphics.Paint(1);
        v3_4.setColor(-1);
        v3_4.setStyle(android.graphics.Paint$Style.STROKE);
        v3_4.setStrokeWidth(1092616192);
        super.setPadding(5, 5, 5, 5);
        super.r = v3_4;
        super.s = new android.graphics.RectF();
        return;
    }

    public final void onDraw(android.graphics.Canvas p12)
    {
        float v3_3;
        float v4_1;
        p12.getClass();
        super.onDraw(p12);
        float v0_6 = (((float) this.getWidth()) / 1073741824);
        float v2_0 = (((float) this.getHeight()) / 1073741824);
        android.graphics.Paint v10 = this.r;
        if (this.getWidth() >= this.getHeight()) {
            v3_3 = (((float) this.getHeight()) / 1073741824);
            v4_1 = v10.getStrokeWidth();
        } else {
            v3_3 = (((float) this.getWidth()) / 1073741824);
            v4_1 = v10.getStrokeWidth();
        }
        float v3_6 = (v3_3 - (v4_1 / 1073741824));
        p12.drawCircle(v0_6, v2_0, v3_6, this.q);
        android.graphics.RectF v6_3 = this.s;
        v6_3.set(((v10.getStrokeWidth() / 1073741824) + (v0_6 - v3_6)), ((v10.getStrokeWidth() / 1073741824) + (v2_0 - v3_6)), ((v0_6 + v3_6) - (v10.getStrokeWidth() / 1073741824)), ((v2_0 + v3_6) - (v10.getStrokeWidth() / 1073741824)));
        p12.drawArc(v6_3, -1028390912, ((((float) this.o) / ((float) this.p)) * 1135869952), 0, v10);
        return;
    }

    public final void setMaxProgress(int p1)
    {
        this.p = p1;
        return;
    }

    public final void setProgress(int p1)
    {
        this.o = p1;
        this.invalidate();
        return;
    }
}

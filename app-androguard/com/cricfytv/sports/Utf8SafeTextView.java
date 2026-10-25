package com.cricfytv.sports;
public final class Utf8SafeTextView extends md {
    public static final java.nio.charset.Charset x;
    public boolean w;

    static Utf8SafeTextView()
    {
        java.nio.charset.Charset v0_1 = java.nio.charset.Charset.forName("ISO-8859-1");
        v0_1.getClass();
        com.cricfytv.sports.Utf8SafeTextView.x = v0_1;
        return;
    }

    public Utf8SafeTextView(android.content.Context p3)
    {
        p3.getClass();
        this(p3, 0, 6);
        return;
    }

    public Utf8SafeTextView(android.content.Context p2, android.util.AttributeSet p3)
    {
        p2.getClass();
        this(p2, p3, 4);
        return;
    }

    public Utf8SafeTextView(android.content.Context p1, android.util.AttributeSet p2, int p3)
    {
        if ((p3 & 2) != 0) {
            p2 = 0;
        }
        super(p1, p2, 16842884);
        return;
    }

    public static boolean h(String p5)
    {
        int v0 = p5.length();
        int v2 = 0;
        while (v2 < v0) {
            char v3 = p5.charAt(v2);
            if ((v3 == 194) || ((v3 == 195) || ((v3 == 197) || (v3 == 226)))) {
                return 1;
            } else {
                v2++;
            }
        }
        return 0;
    }

    public final boolean getKeepMarquee()
    {
        return this.w;
    }

    public final boolean isFocused()
    {
        if (!this.w) {
            return super.isFocused();
        } else {
            return 1;
        }
    }

    public final void onWindowFocusChanged(boolean p2)
    {
        if (this.w) {
            p2 = 1;
        }
        super.onWindowFocusChanged(p2);
        return;
    }

    public final void setKeepMarquee(boolean p1)
    {
        this.w = p1;
        if (p1 != 0) {
            this.setSelected(1);
        }
        return;
    }

    public final void setSafeText(CharSequence p5)
    {
        byte[] v0_0 = com.cricfytv.sports.Utf8SafeTextView.x;
        if (p5 != null) {
            String v5_1 = p5.toString();
            try {
                if (com.cricfytv.sports.Utf8SafeTextView.h(v5_1)) {
                    try {
                        java.nio.charset.Charset v2_1 = v5_1.getBytes(v0_0);
                        v2_1.getClass();
                        v5_1 = new String(v2_1, jw.a);
                    } catch (Exception) {
                    }
                    if (com.cricfytv.sports.Utf8SafeTextView.h(v5_1)) {
                        byte[] v0_1 = v5_1.getBytes(v0_0);
                        v0_1.getClass();
                        v5_1 = new String(v0_1, jw.a);
                    }
                }
            } catch (Exception) {
            }
            String v5_2 = java.text.Normalizer.normalize(v5_1, java.text.Normalizer$Form.NFD);
            v5_2.getClass();
            byte[] v0_4 = java.util.regex.Pattern.compile("[\\p{M}&&[^\\uFE0F\\u20E3]]+");
            v0_4.getClass();
            String v5_4 = v0_4.matcher(v5_2).replaceAll("");
            v5_4.getClass();
            String v1_5 = java.util.regex.Pattern.compile("[^a-zA-Z0-9\\s:|.\\p{So}\\p{Cs}\\u200D\\uFE0F\\u20E3-]");
            v1_5.getClass();
            String v5_6 = v1_5.matcher(v5_4).replaceAll("");
            v5_6.getClass();
            byte[] v0_7 = java.util.regex.Pattern.compile("\\s+");
            v0_7.getClass();
            String v5_8 = v0_7.matcher(v5_6).replaceAll(" ");
            v5_8.getClass();
            this.setText(sh3.i0(v5_8).toString());
            return;
        } else {
            this.setText(0);
            return;
        }
    }
}

package com.android.vending.activities;
public final class WebActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final synthetic int C;
    public boolean A;
    public boolean B;
    public com.cricfytv.sports.databinding.ActivityWebBinding w;
    public android.webkit.WebView x;
    public int y;
    public Boolean z;

    static WebActivity()
    {
        return;
    }

    public WebActivity()
    {
        super(2131558433);
        super.y = -1;
        return;
    }

    public final void finish()
    {
        int v0_0 = this.z;
        if (v0_0 != 0) {
            int v0_2;
            if (!v0_0.booleanValue()) {
                v0_2 = 0;
            } else {
                v0_2 = -1;
            }
            this.setResult(v0_2);
        }
        super.finish();
        return;
    }

    public final void onCreate(android.os.Bundle p10)
    {
        super.onCreate(p10);
        this.w = com.cricfytv.sports.databinding.ActivityWebBinding.inflate(this.getLayoutInflater(), 0, 0);
        this.y = this.getIntent().getIntExtra("showTime", -1);
        androidx.constraintlayout.widget.ConstraintLayout v10_5 = this.w;
        if (v10_5 == null) {
            rg1.U("binding");
            throw 0;
        } else {
            this.x = v10_5.h;
            androidx.constraintlayout.widget.ConstraintLayout v10_19 = this.getIntent().getStringExtra("link");
            if (v10_19 != null) {
                if ((!zh3.B(v10_19, "http://", 1)) && (!zh3.B(v10_19, "https://", 1))) {
                    v10_19 = 0;
                }
                if (v10_19 != null) {
                    org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface v4_11 = this.x;
                    if (v4_11 == null) {
                        rg1.U("webView");
                        throw 0;
                    } else {
                        v4_11.setWebChromeClient(new android.webkit.WebChromeClient());
                        org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface v4_12 = this.w;
                        if (v4_12 == null) {
                            rg1.U("binding");
                            throw 0;
                        } else {
                            v4_12.d.b.setText(2132017301);
                            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface v4_15 = this.x;
                            if (v4_15 == null) {
                                rg1.U("webView");
                                throw 0;
                            } else {
                                org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface v4_16 = v4_15.getSettings();
                                v4_16.setJavaScriptEnabled(1);
                                v4_16.setDomStorageEnabled(0);
                                v4_16.setCacheMode(-1);
                                v4_16.setSupportZoom(0);
                                v4_16.setMediaPlaybackRequiresUserGesture(0);
                                if (i34.a("ALGORITHMIC_DARKENING")) {
                                    int v3_20 = (this.getResources().getConfiguration().uiMode & 48);
                                    if ((v3_20 == 0) || (v3_20 == 16)) {
                                        int v3_21 = this.x;
                                        if (v3_21 == 0) {
                                            rg1.U("webView");
                                            throw 0;
                                        } else {
                                            int v3_22 = v3_21.getSettings();
                                            if (!i34.d.b()) {
                                                tq0.k("This method is not supported by the current version of the framework and the current WebView APK");
                                                return;
                                            } else {
                                                ((org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) vo.f(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface, ((org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) j34.a.p).convertSettings(v3_22))).setAlgorithmicDarkeningAllowed(0);
                                            }
                                        }
                                    } else {
                                        if (v3_20 == 32) {
                                            int v3_1 = this.x;
                                            if (v3_1 == 0) {
                                                rg1.U("webView");
                                                throw 0;
                                            } else {
                                                int v3_2 = v3_1.getSettings();
                                                if (!i34.d.b()) {
                                                    tq0.k("This method is not supported by the current version of the framework and the current WebView APK");
                                                    return;
                                                } else {
                                                    ((org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) vo.f(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface, ((org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) j34.a.p).convertSettings(v3_2))).setAlgorithmicDarkeningAllowed(1);
                                                }
                                            }
                                        }
                                    }
                                }
                                int v3_7 = this.x;
                                if (v3_7 == 0) {
                                    rg1.U("webView");
                                    throw 0;
                                } else {
                                    v3_7.setWebViewClient(new m24(this, 0));
                                    int v3_8 = this.x;
                                    if (v3_8 == 0) {
                                        rg1.U("webView");
                                        throw 0;
                                    } else {
                                        v3_8.loadUrl(v10_19);
                                        androidx.constraintlayout.widget.ConstraintLayout v10_2 = this.w;
                                        if (v10_2 == null) {
                                            rg1.U("binding");
                                            throw 0;
                                        } else {
                                            v10_2.f.setOnRefreshListener(new of1(this, 27));
                                            androidx.constraintlayout.widget.ConstraintLayout v10_4 = this.w;
                                            if (v10_4 == null) {
                                                rg1.U("binding");
                                                throw 0;
                                            } else {
                                                v10_4.b.setOnClickListener(new k24(this, 0));
                                                androidx.constraintlayout.widget.ConstraintLayout v10_7 = this.w;
                                                if (v10_7 == null) {
                                                    rg1.U("binding");
                                                    throw 0;
                                                } else {
                                                    v10_7.d.c.setOnClickListener(new k24(this, 1));
                                                    androidx.constraintlayout.widget.ConstraintLayout v10_10 = this.x;
                                                    if (v10_10 == null) {
                                                        rg1.U("webView");
                                                        throw 0;
                                                    } else {
                                                        v10_10.getViewTreeObserver().addOnScrollChangedListener(new l24(this));
                                                        ne2.d(this.getOnBackPressedDispatcher(), this, new as3(this, 3), 2).e(1);
                                                        androidx.constraintlayout.widget.ConstraintLayout v10_14 = this.w;
                                                        if (v10_14 == null) {
                                                            rg1.U("binding");
                                                            throw 0;
                                                        } else {
                                                            this.setContentView(v10_14.a);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.finish();
            return;
        }
    }

    public final void onDestroy()
    {
        android.webkit.WebView v0 = this.x;
        if (v0 == null) {
            rg1.U("webView");
            throw 0;
        } else {
            v0.destroy();
            super.onDestroy();
            return;
        }
    }

    public final void onPause()
    {
        this.B = 0;
        android.webkit.WebView v0_1 = this.x;
        if (v0_1 == null) {
            rg1.U("webView");
            throw 0;
        } else {
            v0_1.onPause();
            super.onPause();
            return;
        }
    }

    public final void onResume()
    {
        super.onResume();
        int v0_1 = this.x;
        if (v0_1 == 0) {
            rg1.U("webView");
            throw 0;
        } else {
            v0_1.onResume();
            return;
        }
    }
}

package com.android.vending.activities;
public final class CrashReportActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final synthetic int z;
    public com.cricfytv.sports.databinding.ActivityCrashReportBinding w;
    public java.io.File x;
    public String y;

    public CrashReportActivity()
    {
        this.getSavedStateRegistry().c("androidx:appcompat", new gb(this));
        this.addOnContextAvailableListener(new hb(this));
        this.y = "";
        return;
    }

    public final void onCreate(android.os.Bundle p19)
    {
        zm0.a(this, 0, 3);
        super.onCreate(p19);
        int v3_28 = com.cricfytv.sports.databinding.ActivityCrashReportBinding.inflate(this.getLayoutInflater(), 0, 0);
        this.w = v3_28;
        this.setContentView(v3_28.a);
        int v3_4 = this.w;
        if (v3_4 == 0) {
            rg1.U("binding");
            throw 0;
        } else {
            android.widget.Button v6_4 = v3_4.e;
            if (v3_4 == 0) {
                rg1.U("binding");
                throw 0;
            } else {
                android.widget.Button v6_8;
                int v3_18 = v3_4.d;
                int v8_3 = v6_4.getPaddingStart();
                String v9_5 = v6_4.getPaddingTop();
                rz v10_2 = v6_4.getPaddingEnd();
                int v11_2 = v6_4.getPaddingBottom();
                String v13 = v3_18.getPaddingStart();
                String v14 = v3_18.getPaddingTop();
                String v15_1 = v3_18.getPaddingEnd();
                int v16 = v3_18.getPaddingBottom();
                ky3.c(v6_4, new h70(v8_3, v9_5, v10_2, v11_2, 0));
                ky3.c(v3_18, new h70(v13, v14, v15_1, v16, 1));
                int v3_20 = this.getIntent().getStringExtra("extra_report_path");
                if (v3_20 == 0) {
                    v6_8 = 0;
                } else {
                    v6_8 = new java.io.File(v3_20);
                    if (!v6_8.exists()) {
                    }
                }
                int v3_23;
                this.x = v6_8;
                if (v6_8 == null) {
                    v3_23 = 0;
                } else {
                    v3_23 = wv0.D(v6_8);
                }
                if (v3_23 == 0) {
                    v3_23 = "";
                }
                this.y = v3_23;
                android.widget.Button v6_9 = this.w;
                if (v6_9 == null) {
                    rg1.U("binding");
                    throw 0;
                } else {
                    boolean v7_14 = new kn1(v3_23);
                    while (v7_14.hasNext()) {
                        int v3_25 = v7_14.next();
                        if (zh3.B(((String) v3_25), "Message:", 0)) {
                        }
                        int v3_0;
                        int v3_26 = ((String) v3_25);
                        if (v3_26 == 0) {
                            v3_0 = "A technical report was created with the information needed to investigate the problem.";
                        } else {
                            v3_0 = sh3.i0(sh3.T(v3_26, "Message:")).toString();
                            if (v3_0 == 0) {
                            } else {
                                if ((sh3.N(v3_0)) || (v3_0.equals("No message"))) {
                                    v3_0 = 0;
                                }
                                if (v3_0 == 0) {
                                }
                            }
                        }
                        boolean v7_9;
                        v6_9.g.setText("Something went wrong");
                        v6_9.f.setText("Cricfy stopped unexpectedly. ".concat(v3_0));
                        int v3_3 = v6_9.i;
                        if (!sh3.N(this.y)) {
                            int v11 = "Thread:";
                            v13 = "Message:";
                            boolean v7_6 = mc4.u(new String[] {"Report Time:", "Model:"}));
                            String v9_1 = this.y;
                            v9_1.getClass();
                            v7_9 = q73.L(new zv0(new rz(v9_1, 4), 1, new y(v7_6, 6)), "\n");
                        } else {
                            v7_9 = "No diagnostic report was found.";
                        }
                        v3_3.setText(v7_9);
                        android.widget.Button v6_0 = this.y;
                        if (sh3.N(v6_0)) {
                            v6_0 = "Crash report file was not available.";
                        }
                        v6_9.h.setText(v6_0);
                        int v3_6 = this.w;
                        if (v3_6 == 0) {
                            rg1.U("binding");
                            throw 0;
                        } else {
                            v3_6.c.setOnClickListener(new g70(this, 0));
                            int v3_8 = this.w;
                            if (v3_8 == 0) {
                                rg1.U("binding");
                                throw 0;
                            } else {
                                v3_8.k.setOnClickListener(new g70(this, 1));
                                int v3_10 = this.w;
                                if (v3_10 == 0) {
                                    rg1.U("binding");
                                    throw 0;
                                } else {
                                    v3_10.j.setOnClickListener(new g70(this, 2));
                                    int v3_12 = this.w;
                                    if (v3_12 == 0) {
                                        rg1.U("binding");
                                        throw 0;
                                    } else {
                                        v3_12.b.setOnClickListener(new g70(this, 3));
                                        s4 v2_0 = this.w;
                                        if (v2_0 == null) {
                                            rg1.U("binding");
                                            throw 0;
                                        } else {
                                            s4 v2_3 = mc4.u(new android.widget.Button[] {v2_0.k, v2_0.c, v2_0.j, v2_0.b}));
                                            int v3_16 = new ay(v2_3, 1);
                                            s4 v2_5 = v2_3.iterator();
                                            while (v2_5.hasNext()) {
                                                ((android.widget.Button) v2_5.next()).setOnFocusChangeListener(v3_16);
                                            }
                                            s4 v2_6 = this.w;
                                            if (v2_6 == null) {
                                                rg1.U("binding");
                                                throw 0;
                                            } else {
                                                v2_6.k.setSelected(1);
                                                s4 v2_8 = this.w;
                                                if (v2_8 == null) {
                                                    rg1.U("binding");
                                                    throw 0;
                                                } else {
                                                    v2_8.k.post(new s4(this, 12));
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v3_25 = 0;
                }
            }
        }
    }
}

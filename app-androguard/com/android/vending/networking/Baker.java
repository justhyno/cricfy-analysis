package com.android.vending.networking;
public final class Baker {
    public static final com.android.vending.networking.Baker INSTANCE;

    static Baker()
    {
        com.android.vending.networking.Baker.INSTANCE = new com.android.vending.networking.Baker();
        System.loadLibrary("native-lib");
        return;
    }

    private Baker()
    {
        return;
    }

    public final native String merge(String p0, android.content.Context p1);
}

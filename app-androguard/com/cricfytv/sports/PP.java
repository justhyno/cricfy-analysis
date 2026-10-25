package com.cricfytv.sports;
public final class PP implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List items;

    static PP()
    {
        com.cricfytv.sports.PP.CREATOR = new nb4(27);
        return;
    }

    public PP(java.util.List p1)
    {
        p1.getClass();
        this.items = p1;
        return;
    }

    public static synthetic com.cricfytv.sports.PP copy$default(com.cricfytv.sports.PP p0, java.util.List p1, int p2, Object p3)
    {
        if ((p2 & 1) != 0) {
            p1 = p0.items;
        }
        return p0.copy(p1);
    }

    public final java.util.List component1()
    {
        return this.items;
    }

    public final com.cricfytv.sports.PP copy(java.util.List p1)
    {
        p1.getClass();
        this = new com.cricfytv.sports.PP;
        this(p1);
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof com.cricfytv.sports.PP)) {
                if (rg1.a(this.items, ((com.cricfytv.sports.PP) p4).items)) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final java.util.List getItems()
    {
        return this.items;
    }

    public int hashCode()
    {
        return this.items.hashCode();
    }

    public String toString()
    {
        String v2_1 = this.items;
        StringBuilder v0_1 = new StringBuilder("PP(items=");
        v0_1.append(v2_1);
        v0_1.append(")");
        return v0_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        p2.getClass();
        java.util.Iterator v1_1 = this.items;
        p2.writeInt(v1_1.size());
        java.util.Iterator v1_2 = v1_1.iterator();
        while (v1_2.hasNext()) {
            ((ho2) v1_2.next()).writeToParcel(p2, p3);
        }
        return;
    }
}

package com.android.vending.di;
public final class MyDatabase_Impl extends com.android.vending.di.MyDatabase {
    public final vk3 a;
    public final vk3 b;
    public final vk3 c;
    public final vk3 d;

    public MyDatabase_Impl()
    {
        this.a = new vk3(new ja2(this, 0));
        this.b = new vk3(new ja2(this, 1));
        this.c = new vk3(new ja2(this, 2));
        this.d = new vk3(new ja2(this, 3));
        return;
    }

    public final j90 b()
    {
        return ((j90) this.a.getValue());
    }

    public final du0 c()
    {
        return ((du0) this.c.getValue());
    }

    public final java.util.List createAutoMigrations(java.util.Map p1)
    {
        p1.getClass();
        this = new java.util.ArrayList;
        this();
        return this;
    }

    public final ah1 createInvalidationTracker()
    {
        return new ah1(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new String[] {"favourites", "cache", "playlists", "favplaylist", "notifications"}));
    }

    public final w03 createOpenDelegate()
    {
        return new ka2(this);
    }

    public final oo2 d()
    {
        return ((oo2) this.b.getValue());
    }

    public final cg2 e()
    {
        return ((cg2) this.d.getValue());
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses()
    {
        this = new java.util.LinkedHashSet;
        this();
        return this;
    }

    public final java.util.Map getRequiredTypeConverterClasses()
    {
        this = new java.util.LinkedHashMap;
        this();
        this.put(pw2.a(j90), mc4.t(pw2.a(e60)));
        po0 v1_0 = po0.o;
        this.put(pw2.a(oo2), v1_0);
        this.put(pw2.a(du0), v1_0);
        this.put(pw2.a(cg2), v1_0);
        return this;
    }
}

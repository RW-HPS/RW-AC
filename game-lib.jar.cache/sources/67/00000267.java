package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bg.class */
public final class bg {

    /* renamed from: a  reason: collision with root package name */
    String f272a;
    g b;
    h c;
    com.corrodinggames.rts.game.q d;
    float e;
    float f;
    float g;
    float h;
    boolean i;
    boolean j;
    int k;
    int l;
    boolean m;
    boolean n;
    bb o;
    boolean p;

    public boolean a() {
        return this.n || this.m;
    }

    public void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str) {
        this.b = abVar.a(str, "anyRuleInGroup", (g) null);
        this.c = abVar.a(lVar, str, "searchTags", (h) null);
        this.d = (com.corrodinggames.rts.game.q) abVar.a(str, "searchTeam", com.corrodinggames.rts.game.q.own, com.corrodinggames.rts.game.q.class);
        this.e = abVar.i(str, "searchDistance");
        this.f = this.e * this.e;
        this.g = abVar.a(str, "searchOffsetX", Float.valueOf(0.0f)).floatValue();
        this.h = abVar.a(str, "searchOffsetY", Float.valueOf(0.0f)).floatValue();
        this.i = abVar.a(str, "excludeIncompleteBuildings", (Boolean) false).booleanValue();
        this.j = abVar.a(str, "excludeNonBuildings", (Boolean) false).booleanValue();
        this.k = abVar.b(str, "minCount", (Integer) Integer.MIN_VALUE).intValue();
        this.l = abVar.b(str, "maxCount", (Integer) Integer.MAX_VALUE).intValue();
        this.p = abVar.a(str, "checkEachTile", (Boolean) true).booleanValue();
        this.m = abVar.a(str, "aiSuggestionOnly", (Boolean) false).booleanValue();
        this.n = abVar.a(str, "blocksPlacement", Boolean.valueOf(!this.m)).booleanValue();
        if (this.m && this.n) {
            throw new bo("[" + str + "]: Cannot use aiSuggestionOnly and blocksPlacement at the same time");
        }
        this.o = ag.a(abVar, str, "cannotPlaceMessage", (String) null);
    }
}
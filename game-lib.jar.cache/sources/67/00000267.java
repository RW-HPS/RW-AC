package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bg.class */
public final class C0409bg {

    /* renamed from: a */
    String f2522a;

    /* renamed from: b */
    C0453g f2523b;

    /* renamed from: c */
    C0454h f2524c;

    /* renamed from: d */
    EnumC0200q f2525d;

    /* renamed from: e */
    float f2526e;

    /* renamed from: f */
    float f2527f;

    /* renamed from: g */
    float f2528g;

    /* renamed from: h */
    float f2529h;

    /* renamed from: i */
    boolean f2530i;

    /* renamed from: j */
    boolean f2531j;

    /* renamed from: k */
    int f2532k;

    /* renamed from: l */
    int f2533l;

    /* renamed from: m */
    boolean f2534m;

    /* renamed from: n */
    boolean f2535n;

    /* renamed from: o */
    C0404bb f2536o;

    /* renamed from: p */
    boolean f2537p;

    /* renamed from: a */
    public boolean m3901a() {
        return this.f2535n || this.f2534m;
    }

    /* renamed from: a */
    public void m3900a(C0458l c0458l, C1107ab c1107ab, String str) {
        this.f2523b = c1107ab.m687a(str, "anyRuleInGroup", (C0453g) null);
        this.f2524c = c1107ab.m705a(c0458l, str, "searchTags", (C0454h) null);
        this.f2525d = (EnumC0200q) c1107ab.m684a(str, "searchTeam", EnumC0200q.own, EnumC0200q.class);
        this.f2526e = c1107ab.m643i(str, "searchDistance");
        this.f2527f = this.f2526e * this.f2526e;
        this.f2528g = c1107ab.m683a(str, "searchOffsetX", Float.valueOf(0.0f)).floatValue();
        this.f2529h = c1107ab.m683a(str, "searchOffsetY", Float.valueOf(0.0f)).floatValue();
        this.f2530i = c1107ab.m685a(str, "excludeIncompleteBuildings", (Boolean) false).booleanValue();
        this.f2531j = c1107ab.m685a(str, "excludeNonBuildings", (Boolean) false).booleanValue();
        this.f2532k = c1107ab.m667b(str, "minCount", (Integer) Integer.MIN_VALUE).intValue();
        this.f2533l = c1107ab.m667b(str, "maxCount", (Integer) Integer.MAX_VALUE).intValue();
        this.f2537p = c1107ab.m685a(str, "checkEachTile", (Boolean) true).booleanValue();
        this.f2534m = c1107ab.m685a(str, "aiSuggestionOnly", (Boolean) false).booleanValue();
        this.f2535n = c1107ab.m685a(str, "blocksPlacement", Boolean.valueOf(!this.f2534m)).booleanValue();
        if (this.f2534m && this.f2535n) {
            throw new C0417bo("[" + str + "]: Cannot use aiSuggestionOnly and blocksPlacement at the same time");
        }
        this.f2536o = C0349ag.m4031a(c1107ab, str, "cannotPlaceMessage", (String) null);
    }
}
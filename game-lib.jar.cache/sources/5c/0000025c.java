package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/j.class */
public class C0398j extends AbstractC0389a {

    /* renamed from: a */
    LogicBoolean f2406a;

    /* renamed from: b */
    float f2407b;

    /* renamed from: c */
    float f2408c;

    /* renamed from: d */
    C0454h f2409d;

    /* renamed from: e */
    boolean f2410e;

    /* renamed from: a */
    public static void m3936a(C0458l c0458l, C1107ab c1107ab) {
        if (c1107ab.m648g("movement_repelFromUnits")) {
            C0398j c0398j = new C0398j();
            c0398j.m3935a(c0458l, c1107ab, "movement_repelFromUnits", "movement_repelFromUnits");
            if (!LogicBoolean.isStaticFalse(c0398j.f2406a)) {
                c0458l.m3558a(c0398j);
            }
        }
    }

    /* renamed from: a */
    public void m3935a(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        this.f2406a = c1107ab.m707a(c0458l, str, "enabled");
        this.f2407b = c1107ab.m643i(str, "speed");
        this.f2408c = c1107ab.m683a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2409d = C0453g.m3680a(c1107ab.m666b(str, "otherUnitHasTag", (String) null), (C0454h) null);
        this.f2410e = c1107ab.m685a(str, "onlySameTeam", (Boolean) false).booleanValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        if (!this.f2406a.read(c0456j)) {
        }
    }
}
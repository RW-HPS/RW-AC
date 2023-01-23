package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/j.class */
public class j extends a {

    /* renamed from: a  reason: collision with root package name */
    LogicBoolean f261a;
    float b;
    float c;
    com.corrodinggames.rts.game.units.custom.h d;
    boolean e;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar) {
        if (abVar.g("movement_repelFromUnits")) {
            j jVar = new j();
            jVar.a(lVar, abVar, "movement_repelFromUnits", "movement_repelFromUnits");
            if (!LogicBoolean.isStaticFalse(jVar.f261a)) {
                lVar.a(jVar);
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2) {
        this.f261a = abVar.a(lVar, str, "enabled");
        this.b = abVar.i(str, "speed");
        this.c = abVar.a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.d = com.corrodinggames.rts.game.units.custom.g.a(abVar.b(str, "otherUnitHasTag", (String) null), (com.corrodinggames.rts.game.units.custom.h) null);
        this.e = abVar.a(str, "onlySameTeam", (Boolean) false).booleanValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        if (!this.f261a.read(jVar)) {
        }
    }
}
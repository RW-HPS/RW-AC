package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/l.class */
public class l extends a {

    /* renamed from: a  reason: collision with root package name */
    LogicBoolean f263a;
    float b;
    float c;
    int d;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar) {
        if (abVar.g("movement_random")) {
            l lVar2 = new l();
            lVar2.a(lVar, abVar, "movement_random", "movement_random");
            if (!LogicBoolean.isStaticFalse(lVar2.f263a)) {
                lVar.a(lVar2);
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2) {
        this.f263a = abVar.a(lVar, str, "enabled");
        this.b = abVar.i(str, "speed");
        this.c = abVar.a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.d = abVar.b(str, "awayFromEdge", (Integer) 75).intValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        if (!this.f263a.read(jVar)) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (jVar.bi()) {
            if (com.corrodinggames.rts.gameFramework.f.c(jVar.cc) < this.c) {
                jVar.cc += com.corrodinggames.rts.gameFramework.f.b(jVar, -this.b, this.b, 1);
            }
            if (com.corrodinggames.rts.gameFramework.f.c(jVar.cd) < this.c) {
                jVar.cd += com.corrodinggames.rts.gameFramework.f.b(jVar, -this.b, this.b, 2);
            }
        } else {
            if (com.corrodinggames.rts.gameFramework.f.c(jVar.cf) < this.c) {
                jVar.cf += com.corrodinggames.rts.gameFramework.f.b(jVar, -this.b, this.b, 1);
            }
            jVar.cg += com.corrodinggames.rts.gameFramework.f.b(jVar, -1.0f, 1.0f, 2);
        }
        if (this.d > 0) {
            if (jVar.ep > gameEngine.bL.j() - this.d) {
                jVar.cd -= com.corrodinggames.rts.gameFramework.f.b(jVar, 0.0f, this.b * 0.25f, 10);
            }
            if (jVar.ep < this.d) {
                jVar.cd += com.corrodinggames.rts.gameFramework.f.b(jVar, 0.0f, this.b * 0.25f, 11);
            }
            if (jVar.eo > gameEngine.bL.i() - this.d) {
                jVar.cc -= com.corrodinggames.rts.gameFramework.f.b(jVar, 0.0f, this.b * 0.25f, 12);
            }
            if (jVar.eo < this.d) {
                jVar.cc += com.corrodinggames.rts.gameFramework.f.b(jVar, 0.0f, this.b * 0.25f, 13);
            }
        }
        jVar.ay = true;
    }
}
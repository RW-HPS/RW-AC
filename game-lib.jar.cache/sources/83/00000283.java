package com.corrodinggames.rts.game.units.custom.e.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/d.class */
public class d extends a {
    public d() {
        this.u = true;
        this.t = true;
        this.b = "energy";
        this.c = bb.a("energy");
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public double a(am amVar) {
        return amVar.cB;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void a(am amVar, double d) {
        amVar.cB = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void b(am amVar, double d) {
        amVar.cB = (float) (amVar.cB + d);
    }
}
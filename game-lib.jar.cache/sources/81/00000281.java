package com.corrodinggames.rts.game.units.custom.e.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/b.class */
public class b extends a {
    public b() {
        this.u = true;
        this.t = true;
        this.b = "ammo";
        this.c = bb.a("ammo");
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public double a(am amVar) {
        return amVar.cE;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void a(am amVar, double d) {
        amVar.cE = (int) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void b(am amVar, double d) {
        amVar.cE = (int) (amVar.cE + d);
    }
}
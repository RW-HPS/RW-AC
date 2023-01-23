package com.corrodinggames.rts.game.units.custom.e.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/f.class */
public class f extends a {
    public f() {
        this.u = true;
        this.t = true;
        this.b = "shield";
        this.c = bb.a("shield");
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public double a(am amVar) {
        return amVar.cx;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void a(am amVar, double d) {
        amVar.cx = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void b(am amVar, double d) {
        amVar.cx = (float) (amVar.cx + d);
    }
}
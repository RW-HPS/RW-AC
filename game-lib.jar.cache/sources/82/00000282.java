package com.corrodinggames.rts.game.units.custom.e.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/c.class */
public class c extends a {
    public c() {
        this.u = true;
        this.t = true;
        this.b = "credits";
        this.c = bb.a("$");
        this.o = true;
        this.q = com.corrodinggames.rts.game.units.custom.e.b.space;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public double a(am amVar) {
        return amVar.bX.o;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void a(am amVar, double d) {
        amVar.bX.o = d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void b(am amVar, double d) {
        amVar.bX.o += d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public String a(boolean z) {
        return "$";
    }
}
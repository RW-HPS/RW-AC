package com.corrodinggames.rts.game.units.custom.e.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/e.class */
public class e extends a {
    public e() {
        this.u = true;
        this.t = true;
        this.b = "hp";
        this.c = bb.a("hp");
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public double a(am amVar) {
        return amVar.cu;
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void a(am amVar, double d) {
        amVar.o((float) d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.e.a
    public void b(am amVar, double d) {
        amVar.o(amVar.cu + ((float) d));
    }
}
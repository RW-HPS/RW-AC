package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/x.class */
public class x extends w {
    String g;
    bh h;

    @Override // com.corrodinggames.rts.game.units.custom.w, com.corrodinggames.rts.game.units.custom.v
    public void a() {
    }

    @Override // com.corrodinggames.rts.game.units.custom.v
    public void b() {
        super.a();
        this.h = c().f(this.g);
        if (this.h == null) {
            throw new bo("Could not find projectile:" + this.g + " on unit target:" + d() + " used on:" + this.a + " in section:" + this.b);
        }
    }

    public bh f() {
        return this.h;
    }
}
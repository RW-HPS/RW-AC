package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/w.class */
public class w extends v {
    @Override // com.corrodinggames.rts.game.units.custom.v
    public void a() {
        if (!this.e) {
            this.d = l.n(this.c);
            if (this.d == null) {
                throw new bo("Could not find customUnit target:" + d() + " used on:" + this.a + " in section:" + this.b);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.v
    /* renamed from: e */
    public l c() {
        return (l) this.d;
    }
}
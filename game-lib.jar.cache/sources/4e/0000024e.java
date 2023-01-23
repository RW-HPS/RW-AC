package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aw.class */
public abstract class aw extends at {
    public abstract double a(as asVar);

    public abstract void a(as asVar, double d);

    public aw(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.at
    public double a(j jVar, as asVar) {
        return a(asVar);
    }

    @Override // com.corrodinggames.rts.game.units.custom.at
    public void a(j jVar, double d) {
        jVar.dJ();
        a(jVar.y, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.at
    public boolean b() {
        return false;
    }
}
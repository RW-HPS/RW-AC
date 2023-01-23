package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ax.class */
public abstract class ax extends at {
    public abstract double a(j jVar);

    public abstract void b(j jVar, double d);

    public ax(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.at
    public double a(j jVar, as asVar) {
        return a(jVar);
    }

    @Override // com.corrodinggames.rts.game.units.custom.at
    public void a(j jVar, double d) {
        jVar.dJ();
        b(jVar, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.at
    public boolean b() {
        return true;
    }
}
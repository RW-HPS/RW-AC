package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aj.class */
public class aj extends com.corrodinggames.rts.game.units.f.i {

    /* renamed from: a  reason: collision with root package name */
    float f198a;
    float b;
    public ai c;

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(y yVar, float f) {
        this.c = null;
    }

    public void a(float f, float f2) {
        this.f198a = f;
        this.b = f2;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(y yVar, float f, am amVar) {
        if ((amVar instanceof ai) && !amVar.bV && amVar.c(this.f198a, this.b, 0.0f)) {
            this.c = (ai) amVar;
        }
    }
}
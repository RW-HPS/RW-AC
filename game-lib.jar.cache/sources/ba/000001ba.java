package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ae.class */
public class ae extends com.corrodinggames.rts.game.units.f.i {
    public int a;
    public float b;
    public boolean c;
    public boolean d;

    ae(boolean z) {
        this.c = z;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(y yVar) {
        return yVar.bX;
    }

    public void a(float f) {
        this.b = (f * f) + 1.0f;
        this.d = true;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(y yVar, float f) {
        this.a = 0;
        if (!this.d) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.d = false;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(y yVar, float f, am amVar) {
        if (yVar.b(amVar, true)) {
            this.a++;
            if (this.c) {
                if (!(amVar instanceof y)) {
                    return;
                }
                y yVar2 = (y) amVar;
                if (!yVar2.l() || !yVar2.k(yVar)) {
                    return;
                }
            }
            float a = com.corrodinggames.rts.gameFramework.f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep);
            if (a < this.b) {
                this.b = a;
                yVar.R = amVar;
            }
        }
    }
}
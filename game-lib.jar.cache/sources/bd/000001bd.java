package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ah.class */
public class ah extends com.corrodinggames.rts.game.units.f.i {
    public int a;
    public float[] b = new float[31];
    public boolean[] c = new boolean[31];
    int d;
    public boolean e;
    public boolean f;

    ah(boolean z) {
        this.e = z;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(y yVar) {
        return yVar.bX;
    }

    public void a(y yVar) {
        float b = yVar.b(false);
        this.d = yVar.bl();
        for (int i = 0; i < this.d; i++) {
            float z = yVar.z(i);
            if (z > b) {
                z = b;
            }
            this.b[i] = (z * z) + 1.0f;
            this.c[i] = false;
            if (yVar.v(i) == -1 && yVar.cL[i].j == null) {
                this.c[i] = true;
            }
        }
        this.f = true;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(y yVar, float f) {
        this.a = 0;
        if (!this.f) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f = false;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(y yVar, float f, am amVar) {
        if (yVar.b(amVar, true)) {
            this.a++;
            if (this.e) {
                if (!(amVar instanceof y)) {
                    return;
                }
                y yVar2 = (y) amVar;
                if (!yVar2.l() || !yVar2.k(yVar)) {
                    return;
                }
            }
            float a = com.corrodinggames.rts.gameFramework.f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep);
            for (int i = 0; i < this.d; i++) {
                if (this.c[i] && yVar.a(i, amVar, true, false) && a < this.b[i] && a > yVar.A(i)) {
                    this.b[i] = a;
                    yVar.cL[i].j = amVar;
                }
            }
        }
    }
}
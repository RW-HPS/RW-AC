package com.corrodinggames.rts.game.units.custom.a.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/n.class */
public class n extends com.corrodinggames.rts.game.units.f.i {
    public com.corrodinggames.rts.game.units.custom.h a;
    public float b;
    public boolean c;
    public q d;
    public com.corrodinggames.rts.gameFramework.utility.m e;

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(y yVar, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyTeam(y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(y yVar, float f, am amVar) {
        com.corrodinggames.rts.game.units.custom.h de = amVar.de();
        if ((this.a == null || (de != null && com.corrodinggames.rts.game.units.custom.g.a(this.a, de))) && com.corrodinggames.rts.gameFramework.f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep) < this.b) {
            if (amVar.cm < 1.0f && !this.c) {
                return;
            }
            if (this.d != null && !yVar.bX.a(this.d, amVar.bX)) {
                return;
            }
            this.e.add(amVar);
        }
    }
}
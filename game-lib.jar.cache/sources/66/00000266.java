package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.PlayerData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bf.class */
public class bf extends com.corrodinggames.rts.game.units.f.i {
    public float a;
    public float b;
    public bg c;
    public int d;

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(com.corrodinggames.rts.game.units.y yVar, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(com.corrodinggames.rts.game.units.y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(com.corrodinggames.rts.game.units.y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyTeam(com.corrodinggames.rts.game.units.y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(com.corrodinggames.rts.game.units.y yVar, float f, com.corrodinggames.rts.game.units.am amVar) {
        if (yVar == amVar) {
            return;
        }
        h de = amVar.de();
        h hVar = this.c.c;
        if ((hVar == null || (de != null && g.a(hVar, de))) && com.corrodinggames.rts.gameFramework.f.a(this.a, this.b, amVar.eo, amVar.ep) < this.c.f) {
            if (amVar.cm < 1.0f && this.c.i) {
                return;
            }
            if (this.c.j && !amVar.bI()) {
                return;
            }
            if (this.c.d != null && !yVar.bX.a(this.c.d, amVar.bX)) {
                return;
            }
            this.d++;
        }
    }
}
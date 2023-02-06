package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ac.class */
public class ac extends com.corrodinggames.rts.game.units.f.i {
    public float a;
    public float b;
    public com.corrodinggames.rts.game.units.custom.h c;
    public float d;
    public am e;
    public boolean f;
    public boolean g = false;

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
        if (this.f && amVar.g() <= 0.0f) {
            return;
        }
        float a = com.corrodinggames.rts.gameFramework.f.a(this.a, this.b, amVar.eo, amVar.ep);
        if (a < this.d) {
            if (amVar.cm < 1.0f && !this.g) {
                return;
            }
            if (this.c != null && !com.corrodinggames.rts.game.units.custom.g.a(this.c, amVar.de())) {
                return;
            }
            if ((this.f && !yVar.g(amVar, true)) || amVar.cN != null) {
                return;
            }
            this.e = amVar;
            this.d = a;
        }
    }
}
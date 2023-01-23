package com.corrodinggames.rts.game.units.custom.a.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/c.class */
public class c extends com.corrodinggames.rts.game.units.f.i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f219a;
    public com.corrodinggames.rts.game.units.custom.h b;
    public float c;
    public boolean d;
    public q e;
    public boolean f;
    public com.corrodinggames.rts.gameFramework.utility.m g = new com.corrodinggames.rts.gameFramework.utility.m();
    public am h;

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
        if (this.b == null || (de != null && com.corrodinggames.rts.game.units.custom.g.a(this.b, de))) {
            float a2 = com.corrodinggames.rts.gameFramework.f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep);
            if (a2 < this.c) {
                if (amVar.cm < 1.0f && !this.d) {
                    return;
                }
                if (this.e != null && !yVar.bX.a(this.e, amVar.bX)) {
                    return;
                }
                if (this.f219a && !com.corrodinggames.rts.gameFramework.utility.y.b(yVar, amVar.eo, amVar.ep)) {
                    return;
                }
                if (!this.f) {
                    this.h = amVar;
                    this.c = a2;
                    return;
                }
                this.g.add(amVar);
            }
        }
    }
}
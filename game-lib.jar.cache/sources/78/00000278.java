package com.corrodinggames.rts.game.units.custom.c;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.f.i;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/f.class */
public class f extends i {

    /* renamed from: a  reason: collision with root package name */
    public c f286a;
    public a b;
    public am c;
    public float d;

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(y yVar, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(y yVar) {
        return -3;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyTeam(y yVar) {
        return yVar.bX;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(y yVar, float f, am amVar) {
        h dh;
        if (yVar != amVar && (dh = amVar.dh()) != null && g.a(this.b.f282a, dh)) {
            if (yVar.bX != amVar.bX) {
                if (yVar.bX.d(amVar.bX)) {
                    if (!this.b.b) {
                        return;
                    }
                } else if (!yVar.bX.c(amVar.bX) || !this.b.c) {
                    return;
                }
            }
            float a2 = com.corrodinggames.rts.gameFramework.f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep);
            if (a2 < this.d) {
                e a3 = this.f286a.a(this.b, false);
                if (a3 == null || a3.a(amVar) == null) {
                    this.c = amVar;
                    this.d = a2;
                }
            }
        }
    }
}
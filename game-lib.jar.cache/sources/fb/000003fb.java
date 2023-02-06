package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/j.class */
class j extends com.corrodinggames.rts.game.units.a.x {
    boolean a;
    boolean b;

    public j(boolean z, boolean z2) {
        super("changeModFilter" + z + "d:" + z2);
        this.a = z;
        this.b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        h L = h.L();
        return L == null || L.G == n.modded;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        if (this.b) {
            h L = h.L();
            if (L != null) {
                if (L.E != null) {
                    return L.E.a();
                }
                return "All mods";
            }
            return "Mod Filter";
        } else if (this.a) {
            return "<- Set mod";
        } else {
            return "Set mod ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        if (!this.b) {
            if (this.a) {
                return "<-";
            }
            return "->";
        }
        h L = h.L();
        if (L == null) {
            return "NA";
        }
        if (L.E == null) {
            return "All mods";
        }
        return L.E.b();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Change filtered mod";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!InterfaceEngine.bP) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int m() {
        if (this.b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.t f() {
        if (this.b) {
            return com.corrodinggames.rts.game.units.a.t.infoOnly;
        }
        return super.f();
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.u e() {
        if (this.b) {
            return com.corrodinggames.rts.game.units.a.u.infoOnly;
        }
        return super.e();
    }
}
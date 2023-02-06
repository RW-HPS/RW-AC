package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/i.class */
public class i {
    public com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();

    public i() {
    }

    public i(h hVar) {
        if (hVar == null) {
            return;
        }
        for (g gVar : hVar.a) {
            this.a.add(gVar);
        }
    }

    public boolean a(h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean z = false;
        for (g gVar : hVar.a) {
            if (a(gVar)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(g gVar) {
        if (!this.a.contains(gVar)) {
            this.a.add(gVar);
            return true;
        }
        return false;
    }

    public boolean b(h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean z = false;
        for (g gVar : hVar.a) {
            if (this.a.remove(gVar)) {
                z = true;
            }
        }
        return z;
    }

    public h a() {
        if (this.a.size() == 0) {
            return g.d;
        }
        return new h((g[]) this.a.toArray(g.c));
    }
}
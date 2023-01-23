package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/i.class */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public com.corrodinggames.rts.gameFramework.utility.m f307a = new com.corrodinggames.rts.gameFramework.utility.m();

    public i() {
    }

    public i(h hVar) {
        if (hVar == null) {
            return;
        }
        for (g gVar : hVar.f306a) {
            this.f307a.add(gVar);
        }
    }

    public boolean a(h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean z = false;
        for (g gVar : hVar.f306a) {
            if (a(gVar)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(g gVar) {
        if (!this.f307a.contains(gVar)) {
            this.f307a.add(gVar);
            return true;
        }
        return false;
    }

    public boolean b(h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean z = false;
        for (g gVar : hVar.f306a) {
            if (this.f307a.remove(gVar)) {
                z = true;
            }
        }
        return z;
    }

    public h a() {
        if (this.f307a.size() == 0) {
            return g.d;
        }
        return new h((g[]) this.f307a.toArray(g.c));
    }
}
package com.corrodinggames.rts.game.units.custom.e;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.m;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/c.class */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final m f294a = new m();

    public void a(a aVar) {
        if (!this.f294a.contains(aVar)) {
            this.f294a.add(aVar);
        }
    }

    public void a(f fVar, am amVar, double d) {
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a.a(amVar) < eVar.b * d) {
                a(eVar.f296a);
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.d.b bVar, am amVar, double d) {
        if (!bVar.k.c()) {
            a(bVar.k, amVar, d);
        }
        if (bVar.b > 0 && amVar.bX.o < bVar.b * d) {
            a(com.corrodinggames.rts.game.units.custom.e.a.a.D);
        }
    }

    public boolean a(f fVar) {
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f294a.contains(((e) a2[i2]).f296a)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(com.corrodinggames.rts.game.units.custom.d.b bVar) {
        if (bVar.b > 0 && this.f294a.contains(com.corrodinggames.rts.game.units.custom.e.a.a.D)) {
            return true;
        }
        if (!bVar.k.c() && a(bVar.k)) {
            return true;
        }
        return false;
    }

    public void a() {
        this.f294a.clear();
    }
}
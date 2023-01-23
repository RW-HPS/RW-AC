package com.corrodinggames.rts.game.units.custom.b;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bh;
import com.corrodinggames.rts.game.units.custom.bn;
import com.corrodinggames.rts.game.units.d.p;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/k.class */
public class k extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f262a = new k();
    static final PointF b = new PointF();

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        com.corrodinggames.rts.game.units.custom.l lVar = jVar.x;
        int bl = jVar.bl();
        for (int i = 0; i < bl; i++) {
            bn bnVar = lVar.fQ[i];
            if (bnVar.aj != null && jVar.cB > 0.0f && !jVar.v) {
                float floatValue = bnVar.aj.floatValue();
                b.setSite(jVar.E(i));
                float m = jVar.m();
                if (bnVar.ab < 99999.0f) {
                    m = bnVar.ab;
                }
                if (p.a(jVar, b.x, b.y, jVar.eq, m, floatValue)) {
                }
                if (jVar.cB < 0.0f) {
                    jVar.cB = 0.0f;
                    jVar.v = true;
                }
            }
            if (bnVar.ak != null) {
                a(jVar, bnVar);
            }
        }
    }

    public static void a(com.corrodinggames.rts.game.units.custom.j jVar, bn bnVar) {
        if (!jVar.a(bnVar)) {
            return;
        }
        float f = bnVar.al;
        float f2 = bnVar.am;
        float f3 = bnVar.an;
        com.corrodinggames.rts.game.f fVar = null;
        com.corrodinggames.rts.game.units.custom.h hVar = bnVar.ak;
        Object[] a2 = com.corrodinggames.rts.game.f.f157a.a();
        int i = com.corrodinggames.rts.game.f.f157a.f689a;
        for (int i2 = 0; i2 < i; i2++) {
            com.corrodinggames.rts.game.f fVar2 = (com.corrodinggames.rts.game.f) a2[i2];
            if (fVar2.aE != null && fVar2.eq > f3 && com.corrodinggames.rts.game.units.custom.g.a(fVar2.aE, hVar) && com.corrodinggames.rts.gameFramework.f.a(jVar.eo, jVar.ep, fVar2.eo, fVar2.ep) < f2 * f2 && ((com.corrodinggames.rts.gameFramework.f.a(jVar.eo, jVar.ep, fVar2.n, fVar2.o) < f * f || f < 0.0f) && ((fVar2.j == null || (!fVar2.j.bX.d(jVar.bX) && fVar2.j.bX != jVar.bX)) && fVar2.h > 0.0f && !a(fVar2)))) {
                fVar = fVar2;
            }
        }
        if (fVar != null) {
            jVar.b(bnVar);
            com.corrodinggames.rts.game.f a3 = jVar.a((am) null, fVar.eo, fVar.ep, bnVar.e, (bh) null, 0);
            a3.aC = true;
            a3.q = fVar;
        }
    }

    public static boolean a(com.corrodinggames.rts.game.f fVar) {
        Object[] a2 = com.corrodinggames.rts.game.f.f157a.a();
        int i = com.corrodinggames.rts.game.f.f157a.f689a;
        for (int i2 = 0; i2 < i; i2++) {
            com.corrodinggames.rts.game.f fVar2 = (com.corrodinggames.rts.game.f) a2[i2];
            if (fVar2 != fVar && fVar2.q == fVar) {
                return true;
            }
        }
        return false;
    }
}
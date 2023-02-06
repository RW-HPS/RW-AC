package com.corrodinggames.rts.game.units.custom.b;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bh;
import com.corrodinggames.rts.game.units.custom.bn;
import com.corrodinggames.rts.game.units.d.p;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/k.class */
public class k extends a {
    public static final a a = new k();
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
        Projectile projectile = null;
        com.corrodinggames.rts.game.units.custom.h hVar = bnVar.ak;
        Object[] a2 = Projectile.a.a();
        int i = Projectile.a.a;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile2 = (Projectile) a2[i2];
            if (projectile2.aE != null && projectile2.eq > f3 && com.corrodinggames.rts.game.units.custom.g.a(projectile2.aE, hVar) && com.corrodinggames.rts.gameFramework.f.a(jVar.eo, jVar.ep, projectile2.eo, projectile2.ep) < f2 * f2 && ((com.corrodinggames.rts.gameFramework.f.a(jVar.eo, jVar.ep, projectile2.n, projectile2.o) < f * f || f < 0.0f) && ((projectile2.j == null || (!projectile2.j.bX.d(jVar.bX) && projectile2.j.bX != jVar.bX)) && projectile2.h > 0.0f && !a(projectile2)))) {
                projectile = projectile2;
            }
        }
        if (projectile != null) {
            jVar.b(bnVar);
            Projectile a3 = jVar.a((am) null, projectile.eo, projectile.ep, bnVar.e, (bh) null, 0);
            a3.aC = true;
            a3.q = projectile;
        }
    }

    public static boolean a(Projectile projectile) {
        Object[] a2 = Projectile.a.a();
        int i = Projectile.a.a;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile2 = (Projectile) a2[i2];
            if (projectile2 != projectile && projectile2.q == projectile) {
                return true;
            }
        }
        return false;
    }
}
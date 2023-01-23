package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/g.class */
public class g extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.game.units.custom.e.a f223a;
    com.corrodinggames.rts.game.units.custom.e.a b;
    double c;
    double d;
    float e;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        com.corrodinggames.rts.game.units.custom.e.a a2 = abVar.a(lVar, str, "convertResource_from", (com.corrodinggames.rts.game.units.custom.e.a) null, true);
        com.corrodinggames.rts.game.units.custom.e.a a3 = abVar.a(lVar, str, "convertResource_to", (com.corrodinggames.rts.game.units.custom.e.a) null, true);
        if ((a2 != null || a3 != null) && (a2 == null || a3 == null)) {
            throw new bo("[" + str + "] Both convertResource_from and convertResource_to are required together");
        }
        if (a2 != null && a3 != null) {
            g gVar = new g();
            gVar.f223a = a2;
            gVar.b = a3;
            gVar.c = abVar.a(str, "convertResource_minAmount", 0.0d);
            gVar.d = abVar.j(str, "convertResource_maxAmount");
            if (gVar.c < 0.0d) {
                throw new bo("[" + str + "] convertResource_minAmount cannot be < 0");
            }
            if (gVar.d < 0.0d) {
                throw new bo("[" + str + "] convertResource_maxAmount cannot be < 0");
            }
            if (gVar.d < gVar.c) {
                throw new bo("[" + str + "] convertResource_maxAmount cannot be < convertResource_minAmount");
            }
            gVar.e = abVar.a(str, "convertResource_multiplyAmountBy", Float.valueOf(1.0f)).floatValue();
            dVar.ac.add(gVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        double a2 = this.f223a.a(jVar);
        if (a2 > this.c) {
            double a3 = com.corrodinggames.rts.gameFramework.f.a(a2, this.d);
            this.f223a.b(jVar, -a3);
            this.b.b(jVar, a3 * this.e);
            return true;
        }
        return true;
    }
}
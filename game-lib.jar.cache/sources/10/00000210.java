package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/a.class */
public class a extends com.corrodinggames.rts.game.units.custom.a.a {
    com.corrodinggames.rts.game.units.custom.e.a a;
    com.corrodinggames.rts.game.units.custom.e.a c;
    com.corrodinggames.rts.game.units.custom.d.c e;
    com.corrodinggames.rts.game.units.custom.d.c f;
    double b = -1.7976931348623157E308d;
    float d = 1.0f;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        com.corrodinggames.rts.game.units.custom.e.a a = abVar.a(lVar, str, str2 + "resourceAmount", (com.corrodinggames.rts.game.units.custom.e.a) null, true);
        if (a != null) {
            a aVar = new a();
            aVar.a = a;
            aVar.b = abVar.a(str, str2 + "resourceAmount_setValue", -1.7976931348623157E308d);
            aVar.c = abVar.a(lVar, str, str2 + "resourceAmount_addOtherResource", (com.corrodinggames.rts.game.units.custom.e.a) null, true);
            aVar.d = abVar.a(str, str2 + "resourceAmount_multiplyBy", Float.valueOf(1.0f)).floatValue();
            dVar.ac.add(aVar);
        }
        com.corrodinggames.rts.game.units.custom.d.c a2 = com.corrodinggames.rts.game.units.custom.d.c.a(lVar, abVar, str, str2 + "addResourcesWithLogic", null);
        com.corrodinggames.rts.game.units.custom.d.c a3 = com.corrodinggames.rts.game.units.custom.d.c.a(lVar, abVar, str, str2 + "setResourcesWithLogic", null);
        if (a2 != null || a3 != null) {
            a aVar2 = new a();
            aVar2.f = a3;
            aVar2.e = a2;
            dVar.ac.add(aVar2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        double a;
        if (this.a != null) {
            if (this.b != -1.7976931348623157E308d) {
                a = this.b;
            } else {
                a = this.a.a(jVar);
            }
            if (this.c != null) {
                a += this.c.a(jVar);
            }
            this.a.a(jVar, a * this.d);
        }
        if (this.f != null) {
            this.f.d(jVar);
        }
        if (this.e != null) {
            this.e.e(jVar);
            return true;
        }
        return true;
    }
}
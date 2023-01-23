package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/k.class */
public class k extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    public bp f227a;
    public bp b;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        bp a2 = bp.a(lVar, abVar, str, str2 + "produceUnits");
        if (!a2.b()) {
            k kVar = new k();
            kVar.f227a = a2;
            dVar.ac.add(kVar);
        }
        bp a3 = bp.a(lVar, abVar, str, str2 + "spawnUnits");
        if (!a3.b()) {
            k kVar2 = new k();
            kVar2.b = a3;
            dVar.ac.add(kVar2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        if (this.f227a != null) {
            com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
            this.f227a.a(mVar, jVar.bX, (am) jVar, false);
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                am amVar2 = (am) it.next();
                jVar.E(amVar2);
                jVar.F(amVar2);
            }
        }
        if (this.b != null) {
            this.b.a(jVar.eo, jVar.ep, jVar.eq, jVar.cg, jVar.bX, false, jVar);
            return true;
        }
        return true;
    }
}
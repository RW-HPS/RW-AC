package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/o.class */
public class o extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    public bp f231a;
    public int b;
    public com.corrodinggames.rts.game.units.custom.h c;
    public boolean d;
    public boolean e;
    public int f = -1;
    public LogicBoolean g;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        bp a2 = bp.a(lVar, abVar, str, str2 + "addUnitsIntoTransport");
        int intValue = abVar.b(str, str2 + "deleteNumUnitsFromTransport", (Integer) 0).intValue();
        com.corrodinggames.rts.game.units.custom.h a3 = com.corrodinggames.rts.game.units.custom.g.a(abVar.b(str, "deleteNumUnitsFromTransport_onlyWithTags", (String) null), (com.corrodinggames.rts.game.units.custom.h) null);
        boolean booleanValue = abVar.a(str, str2 + "startUnloadingTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.a(str, str2 + "forceUnloadTransportNow", (Boolean) false).booleanValue();
        int intValue2 = abVar.b(str, str2 + "forceUnloadTransportNow_onlyOnSlot", (Integer) (-1)).intValue();
        LogicBoolean b = abVar.b(lVar, str, str2 + "transportTargetNow", null);
        if (intValue2 != -1 && !booleanValue2) {
            throw new bo("forceUnloadTransportNow_onlyOnSlot expects forceUnloadTransportNow");
        }
        if (!a2.b() || intValue > 0 || booleanValue || booleanValue2 || b != null) {
            o oVar = new o();
            if (!a2.b()) {
                oVar.f231a = a2;
            }
            if (intValue > 0) {
                oVar.b = intValue;
                oVar.c = a3;
            }
            oVar.d = booleanValue;
            oVar.e = booleanValue2;
            oVar.f = intValue2;
            oVar.g = b;
            dVar.ac.add(oVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        am readUnit;
        if (this.b != 0) {
            for (int i2 = 0; i2 < this.b; i2++) {
                if (jVar.B.size() > 0) {
                    for (int size = jVar.B.size() - 1; size >= 0; size--) {
                        am amVar2 = (am) jVar.B.get(size);
                        if (amVar2 == null) {
                            GameEngine.print("deleteNumUnitsFromTransport unit==null");
                        } else if (this.c == null || com.corrodinggames.rts.game.units.custom.g.a(this.c, amVar2.de())) {
                            jVar.B.remove(size);
                            jVar.D(amVar2);
                            if (amVar2 != null) {
                                amVar2.ci();
                            }
                        }
                    }
                }
            }
        }
        if (this.f231a != null) {
            com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
            this.f231a.a(mVar, jVar.bX, (am) jVar, false);
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                am amVar3 = (am) it.next();
                amVar3.eo = jVar.eo;
                amVar3.ep = jVar.ep;
                amVar3.eq = jVar.eq;
                jVar.C(amVar3);
            }
        }
        if (this.d) {
            jVar.L();
        }
        if (this.e) {
            for (int size2 = jVar.B.size() - 1; size2 >= 0; size2--) {
                if (this.f == -1 || this.f == size2) {
                    jVar.a((am) jVar.B.get(size2), true, jVar.B.size() % 2 == 0);
                }
            }
        }
        if (this.g != null && (readUnit = this.g.readUnit(jVar)) != null && readUnit.bL && jVar.d(readUnit, true)) {
            jVar.C(jVar);
            return true;
        }
        return true;
    }
}
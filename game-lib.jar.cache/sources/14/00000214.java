package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.ak;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/e.class */
public class e extends com.corrodinggames.rts.game.units.custom.a.a {
    public bp a;
    public ArrayList b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        bp a = bp.a(lVar, abVar, str, str2 + "attachments_addNewUnits");
        int intValue = abVar.b(str, str2 + "attachments_deleteNumUnits", (Integer) 0).intValue();
        boolean booleanValue = abVar.a(str, str2 + "attachments_disconnect", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.a(str, str2 + "attachments_unload", (Boolean) false).booleanValue();
        boolean booleanValue3 = abVar.a(str, str2 + "disconnectFromParent", (Boolean) false).booleanValue();
        if (!a.b() || intValue != 0 || booleanValue3 || booleanValue || booleanValue2) {
            e eVar = new e();
            eVar.a = a;
            String b = abVar.b(str, "attachments_onlyOnSlots", (String) null);
            if (b != null) {
                for (String str4 : b.split(",")) {
                    String trim = str4.trim();
                    if (!trim.equals(VariableScope.nullOrMissingString)) {
                        com.corrodinggames.rts.game.units.custom.b.n i = lVar.i(trim);
                        if (eVar.b == null) {
                            eVar.b = new ArrayList();
                        }
                        if (i == null) {
                            throw new bo("[" + str + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + trim);
                        }
                        eVar.b.add(i);
                    }
                }
            }
            eVar.c = intValue;
            eVar.f = booleanValue3;
            eVar.d = booleanValue;
            eVar.e = booleanValue2;
            dVar.ac.add(eVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        if ((this.d || this.e) && jVar.C != null && jVar.C.size() > 0) {
            int size = jVar.C.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                am amVar2 = (am) jVar.C.get(size);
                if (amVar2 != null) {
                    if (this.b != null) {
                        boolean z = false;
                        Iterator it = this.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((com.corrodinggames.rts.game.units.custom.b.n) it.next()).a() == size) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (!(amVar2 instanceof y)) {
                        GameEngine.m5e("Failed to deattach unit:" + amVar2.mo1r().i() + " is not an OrderableUnit");
                    } else {
                        y yVar = (y) amVar2;
                        if (this.e) {
                            jVar.a((am) yVar, true, jVar.B.size() % 2 == 0);
                        } else {
                            yVar.bx();
                        }
                    }
                }
                size--;
            }
        }
        if (this.c != 0) {
            for (int i2 = 0; i2 < this.c; i2++) {
                if (jVar.C != null && jVar.C.size() > 0) {
                    for (int size2 = jVar.C.size() - 1; size2 >= 0; size2--) {
                        am amVar3 = (am) jVar.C.get(size2);
                        if (amVar3 != null) {
                            if (this.b != null) {
                                boolean z2 = false;
                                Iterator it2 = this.b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((com.corrodinggames.rts.game.units.custom.b.n) it2.next()).a() == size2) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            amVar3.ci();
                            break;
                        }
                    }
                }
            }
        }
        if (this.a != null) {
            com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
            this.a.a(mVar, jVar.bX, (am) jVar, true);
            Iterator it3 = mVar.iterator();
            while (it3.hasNext()) {
                am amVar4 = (am) it3.next();
                boolean z3 = false;
                if (!(amVar4 instanceof y)) {
                    GameEngine.m5e("Failed to attach unit:" + amVar4.mo1r().i() + " is not an OrderableUnit");
                } else {
                    y yVar2 = (y) amVar4;
                    if (this.b != null) {
                        Iterator it4 = this.b.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            com.corrodinggames.rts.game.units.custom.b.n nVar = (com.corrodinggames.rts.game.units.custom.b.n) it4.next();
                            if (jVar.a(nVar) == null && jVar.a(yVar2, nVar)) {
                                yVar2.cQ = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        Iterator it5 = jVar.x.aA.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            com.corrodinggames.rts.game.units.custom.b.n nVar2 = (com.corrodinggames.rts.game.units.custom.b.n) it5.next();
                            if (jVar.a(nVar2) == null && jVar.a(yVar2, nVar2)) {
                                yVar2.cQ = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (!z3) {
                        yVar2.a();
                    }
                }
            }
        }
        if (this.f) {
            if (jVar.cO != null) {
                jVar.bx();
            }
            if (jVar.cN != null) {
                if (jVar.cN instanceof ak) {
                    ((ak) jVar.cN).e(jVar);
                    return true;
                }
                GameEngine.g("transportedBy is not a TransportInterface");
                jVar.cN = null;
                return true;
            }
            return true;
        }
        return true;
    }
}
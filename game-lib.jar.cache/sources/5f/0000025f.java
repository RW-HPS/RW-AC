package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f.an;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/m.class */
public final class m extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final m f264a = new m();

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar) {
        com.corrodinggames.rts.gameFramework.utility.m e = abVar.e("attachment_");
        if (e.size() > 0) {
            lVar.a(f264a);
            short s = 0;
            Iterator it = e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                n nVar = new n();
                a(nVar, lVar, abVar, str, substring);
                nVar.b = substring;
                nVar.f265a = s;
                s = (short) (s + 1);
                lVar.aA.add(nVar);
            }
        }
    }

    public static void a(n nVar, com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2) {
        nVar.c = abVar.i(str, "x");
        nVar.d = abVar.i(str, "y");
        nVar.e = abVar.a(str, "height", Float.valueOf(nVar.e)).floatValue();
        nVar.i = abVar.a(str, "lockDir", Boolean.valueOf(nVar.i)).booleanValue();
        nVar.j = abVar.a(str, "redirectDamageToParent", Boolean.valueOf(nVar.j)).booleanValue();
        nVar.k = abVar.a(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(nVar.k)).booleanValue();
        if (!nVar.j && nVar.k) {
            throw new bo("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
        }
        nVar.l = abVar.a(str, "canBeAttackedAndDamaged", Boolean.valueOf(nVar.l)).booleanValue();
        nVar.m = abVar.a(str, "isUnselectable", Boolean.valueOf(nVar.m)).booleanValue();
        nVar.n = abVar.a(str, "isUnselectableAsTarget", Boolean.valueOf(nVar.m)).booleanValue();
        nVar.o = abVar.a(str, "isVisible", Boolean.valueOf(nVar.o)).booleanValue();
        nVar.p = abVar.a(str, "showMiniHp", Boolean.valueOf(nVar.p)).booleanValue();
        nVar.q = abVar.a(str, "hideHp", Boolean.valueOf(nVar.q)).booleanValue();
        nVar.N = abVar.a(lVar, str, "showAllActionsFrom", (LogicBoolean) null);
        if (LogicBoolean.isStaticFalse(nVar.N)) {
            nVar.N = null;
        }
        Float a2 = abVar.a(str, "idleDir", (Float) null);
        Float a3 = abVar.a(str, "idleDirReversing", (Float) null);
        if (a2 != null) {
            nVar.f = a2.floatValue();
            nVar.g = a2.floatValue();
        }
        if (a3 != null) {
            nVar.g = a3.floatValue();
        } else {
            nVar.g = nVar.f;
        }
        nVar.h = abVar.a(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
        nVar.r = abVar.a(str, "rotateWithParent", Boolean.valueOf(nVar.r)).booleanValue();
        nVar.s = abVar.a(str, "lockLegMovement", Boolean.valueOf(nVar.s)).booleanValue();
        nVar.t = abVar.a(str, "freezeLegMovement", Boolean.valueOf(nVar.t)).booleanValue();
        nVar.u = abVar.a(str, "lockRotation", Boolean.valueOf(nVar.u)).booleanValue();
        if (nVar.u && nVar.h) {
            throw new bo("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        nVar.v = abVar.a(str, "keepAliveWhenParentDies", Boolean.valueOf(nVar.v)).booleanValue();
        nVar.w = bp.b(lVar, abVar, str, "onCreateSpawnUnitOf");
        if (nVar.w.b()) {
            nVar.w = null;
        }
        nVar.x = abVar.a(str, "createIncompleteIfParentIs", Boolean.valueOf(nVar.x)).booleanValue();
        nVar.y = abVar.a(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(nVar.y)).booleanValue();
        nVar.z = abVar.a(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(nVar.z)).booleanValue();
        nVar.B = abVar.a(str, "setDrawLayerOnBottom", Boolean.valueOf(nVar.B)).booleanValue();
        if (nVar.B) {
            nVar.A = false;
        }
        nVar.A = abVar.a(str, "setDrawLayerOnTop", Boolean.valueOf(nVar.A)).booleanValue();
        if (nVar.A && nVar.B) {
            throw new bo("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
        }
        nVar.D = abVar.a(str, "addTransportedUnits", Boolean.valueOf(nVar.D)).booleanValue();
        nVar.E = abVar.a(str, "unloadInCurrentPosition", Boolean.valueOf(nVar.E)).booleanValue();
        nVar.F = abVar.a(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(nVar.F)).booleanValue();
        if (nVar.F) {
            nVar.G = 500.0f;
        } else {
            nVar.G = 0.0f;
        }
        nVar.H = abVar.a(str, "deattachIfWantingToMove", Boolean.valueOf(nVar.H)).booleanValue();
        nVar.I = abVar.a(str, "hidden", Boolean.valueOf(nVar.I)).booleanValue();
        nVar.J = abVar.a(str, "prioritizeParentsMainTarget", Boolean.valueOf(nVar.J)).booleanValue();
        nVar.K = abVar.a(str, "onlyAttackParentsMainTarget", Boolean.valueOf(nVar.K)).booleanValue();
        nVar.L = abVar.a(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(nVar.L)).booleanValue();
        nVar.M = abVar.a(str, "canAttack", Boolean.valueOf(nVar.M)).booleanValue();
        nVar.O = abVar.a(str, "keepWaypointsNeedingMovement", Boolean.valueOf(nVar.O)).booleanValue();
        if (nVar.D) {
            lVar.aB = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void a(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        b(jVar, f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.custom.l lVar = jVar.x;
        com.corrodinggames.rts.gameFramework.utility.m mVar = lVar.aA;
        if (mVar.f689a == 0) {
            return;
        }
        if (lVar.aB) {
            Object[] a2 = mVar.a();
            for (int i = 0; i < mVar.f689a; i++) {
                n nVar = (n) a2[i];
                if (nVar.D && jVar.B.f689a > 0 && a(jVar, nVar) == null) {
                    Iterator it = jVar.B.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            am amVar = (am) it.next();
                            if ((amVar instanceof y) && amVar.cO == null && jVar.a((y) amVar, nVar)) {
                                amVar.cN = null;
                                break;
                            }
                        }
                    }
                }
            }
        }
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = jVar.C;
        if (mVar2 == null) {
            return;
        }
        float f3 = jVar.cg - jVar.D;
        jVar.D = jVar.cg;
        Object[] a3 = mVar2.a();
        for (int i2 = mVar2.f689a - 1; i2 >= 0; i2--) {
            y yVar = (y) a3[i2];
            if (yVar != null) {
                if (yVar.bV) {
                    yVar.bx();
                    a3[i2] = null;
                } else {
                    if (jVar.cN != null) {
                        if (yVar.cN == null) {
                            yVar.cN = jVar.cN;
                            gameEngine.bS.l(yVar);
                        }
                    } else if (yVar.cN != null && yVar.cN != jVar) {
                        yVar.cN = null;
                    }
                    n nVar2 = (n) mVar.get(i2);
                    float k = com.corrodinggames.rts.gameFramework.f.k(jVar.cg);
                    float j = com.corrodinggames.rts.gameFramework.f.j(jVar.cg);
                    float f4 = (k * nVar2.d) - (j * nVar2.c);
                    float f5 = (j * nVar2.d) + (k * nVar2.c);
                    float f6 = f4 + jVar.eo;
                    float f7 = f5 + jVar.ep;
                    float f8 = jVar.eq + nVar2.e;
                    if (com.corrodinggames.rts.gameFramework.utility.y.b(yVar.cQ, (int) nVar2.G)) {
                        yVar.eo += (f6 - yVar.eo) * 0.05f;
                        yVar.ep += (f7 - yVar.ep) * 0.05f;
                        yVar.eq += (f8 - yVar.eq) * 0.05f;
                    } else {
                        yVar.eo = f6;
                        yVar.ep = f7;
                        yVar.eq = f8;
                    }
                    if (yVar.cm < 1.0f && nVar2.x) {
                        yVar.r(jVar.cm);
                        yVar.cn = jVar.cm;
                    }
                    if (nVar2.A) {
                        if (yVar.em <= jVar.em) {
                            int i3 = 0;
                            if (yVar instanceof com.corrodinggames.rts.game.units.custom.j) {
                                i3 = ((com.corrodinggames.rts.game.units.custom.j) yVar).x.cI;
                            }
                            yVar.em = jVar.em;
                            yVar.en = jVar.en + 1 + i3;
                        }
                    } else if (nVar2.B && yVar.em >= jVar.em) {
                        yVar.em = jVar.em;
                        yVar.en = jVar.en - 1;
                    }
                    if (jVar.ci) {
                        f2 = jVar.cg + nVar2.g;
                    } else {
                        f2 = jVar.cg + nVar2.f;
                    }
                    if (!yVar.bI()) {
                        if (nVar2.u) {
                            yVar.h(f2);
                        } else {
                            if (f3 != 0.0f && nVar2.r) {
                                yVar.i(f3);
                            }
                            if (nVar2.h && yVar.R == null) {
                                yVar.c(f, f2);
                            }
                        }
                    }
                    if (nVar2.K) {
                        yVar.R = jVar.R;
                        yVar.S = 5.0f;
                    }
                    if (nVar2.L && yVar.R == null) {
                        yVar.R = jVar.R;
                    }
                    if (nVar2.J && jVar.R != null && yVar.R != jVar.R) {
                        boolean z = false;
                        if (nVar2.L) {
                            z = true;
                        }
                        if (yVar.a(jVar.R, z)) {
                            yVar.R = jVar.R;
                            yVar.S = 5.0f;
                        }
                    }
                    if (yVar instanceof com.corrodinggames.rts.game.units.custom.j) {
                        com.corrodinggames.rts.game.units.custom.j jVar2 = (com.corrodinggames.rts.game.units.custom.j) yVar;
                        if (nVar2.s) {
                            jVar2.dP = jVar2.eo;
                            jVar2.dP = jVar2.ep;
                            jVar2.dR = jVar2.eq;
                        }
                    }
                }
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.j jVar, boolean z) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = jVar.C;
        if (mVar == null) {
            return;
        }
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = jVar.x.aA;
        Object[] a2 = mVar.a();
        for (int i = mVar.f689a - 1; i >= 0; i--) {
            y yVar = (y) a2[i];
            if (yVar != null) {
                n nVar = (n) mVar2.get(i);
                yVar.bx();
                a2[i] = null;
                if (z && !nVar.v) {
                    yVar.ci();
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar) {
        a(jVar, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void c(com.corrodinggames.rts.game.units.custom.j jVar) {
        a(jVar, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void a(com.corrodinggames.rts.game.units.custom.j jVar) {
        boolean z = false;
        com.corrodinggames.rts.gameFramework.utility.m mVar = jVar.x.aA;
        Object[] a2 = mVar.a();
        for (int i = mVar.f689a - 1; i >= 0; i--) {
            n nVar = (n) a2[i];
            if (nVar.w != null) {
                y a3 = a(jVar, nVar);
                if (a3 != null) {
                    if (!nVar.y) {
                        a3.ci();
                    }
                }
                com.corrodinggames.rts.gameFramework.utility.m mVar2 = new com.corrodinggames.rts.gameFramework.utility.m();
                nVar.w.a(mVar2, jVar.bX, (am) jVar, true);
                if (mVar2.size() > 1) {
                    GameEngine.print("onCreateSpawnUnitOf: created an extra " + (mVar2.size() - 1) + " units");
                    for (int i2 = 1; i2 < mVar2.size(); i2++) {
                        ((am) mVar2.get(i2)).ci();
                    }
                }
                if (mVar2.size() == 0) {
                    GameEngine.print("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    am amVar = (am) mVar2.get(0);
                    if (!(amVar instanceof y)) {
                        GameEngine.print("onCreateSpawnUnitOf: Warning " + amVar.r().i() + " not an orderable unit type, cannot attach");
                        amVar.ci();
                    } else {
                        y yVar = (y) amVar;
                        if (jVar.a(yVar, nVar)) {
                            yVar.cQ = -9999;
                            if (jVar.cm < 1.0f && nVar.x) {
                                yVar.r(jVar.cm);
                                yVar.cn = jVar.cm;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            b(jVar, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void a(com.corrodinggames.rts.game.units.custom.j jVar, com.corrodinggames.rts.game.units.custom.l lVar) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = jVar.C;
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = jVar.x.aA;
        if (mVar2.size() == 0) {
            jVar.C = null;
        } else if (mVar != null) {
            for (int size = mVar.size() - 1; size >= 0; size--) {
                y yVar = (y) mVar.get(size);
                if (yVar != null && size >= mVar2.size()) {
                    yVar.ci();
                    mVar.remove(size);
                }
            }
            for (int size2 = mVar.size() - 1; size2 >= 0; size2--) {
                y yVar2 = (y) mVar.get(size2);
                if (yVar2 != null) {
                    yVar2.cP = (n) mVar2.get(size2);
                }
            }
        }
    }

    public static n a(com.corrodinggames.rts.game.units.custom.j jVar, short s) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = jVar.x.aA;
        if (mVar.f689a <= s) {
            return null;
        }
        return (n) mVar.get(s);
    }

    public static y a(com.corrodinggames.rts.game.units.custom.j jVar, n nVar) {
        short s;
        com.corrodinggames.rts.gameFramework.utility.m mVar = jVar.C;
        if (mVar == null || mVar.f689a <= (s = nVar.f265a)) {
            return null;
        }
        return (y) mVar.get(s);
    }

    public static boolean a(com.corrodinggames.rts.game.units.custom.j jVar, n nVar, y yVar) {
        com.corrodinggames.rts.game.units.custom.l lVar = jVar.x;
        short s = nVar.f265a;
        if (lVar.aA.f689a <= s && yVar != null) {
            GameEngine.print("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + lVar.aA.f689a);
            return false;
        }
        if (jVar.C == null) {
            jVar.C = new com.corrodinggames.rts.gameFramework.utility.m();
        }
        com.corrodinggames.rts.gameFramework.utility.m mVar = jVar.C;
        if (mVar.size() == 0) {
            jVar.D = jVar.cg;
        }
        if (yVar == null && s >= mVar.size()) {
            return true;
        }
        while (mVar.size() <= s) {
            mVar.add(null);
        }
        mVar.set(s, yVar);
        return true;
    }

    public static void a(com.corrodinggames.rts.game.units.custom.j jVar, com.corrodinggames.rts.gameFramework.utility.m mVar, boolean z) {
        n dn;
        boolean read;
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = jVar.C;
        if (mVar2 != null) {
            Iterator it = mVar2.iterator();
            while (it.hasNext()) {
                am amVar = (am) it.next();
                if (amVar != null && (amVar instanceof y) && (dn = amVar.dn()) != null && dn.N != null) {
                    Iterator it2 = amVar.N().iterator();
                    while (it2.hasNext()) {
                        s sVar = (s) it2.next();
                        if (z) {
                            read = an.a(dn.N, jVar);
                        } else {
                            read = dn.N.read(jVar);
                        }
                        if (read) {
                            mVar.add(new com.corrodinggames.rts.game.units.a.g(sVar, (y) amVar, sVar.N()));
                        }
                    }
                }
            }
        }
    }
}
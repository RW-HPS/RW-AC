package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0810an;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/m.class */
public final class C0401m extends AbstractC0389a {

    /* renamed from: a */
    public static final C0401m f2417a = new C0401m();

    /* renamed from: a */
    public static void m3921a(C0458l c0458l, C1107ab c1107ab) {
        C1136m m654e = c1107ab.m654e("attachment_");
        if (m654e.size() > 0) {
            c0458l.m3558a(f2417a);
            short s = 0;
            Iterator it = m654e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                C0402n c0402n = new C0402n();
                m3930a(c0402n, c0458l, c1107ab, str, substring);
                c0402n.f2419b = substring;
                c0402n.f2418a = s;
                s = (short) (s + 1);
                c0458l.f3258aA.add(c0402n);
            }
        }
    }

    /* renamed from: a */
    public static void m3930a(C0402n c0402n, C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        c0402n.f2420c = c1107ab.m643i(str, "x");
        c0402n.f2421d = c1107ab.m643i(str, "y");
        c0402n.f2422e = c1107ab.m683a(str, "height", Float.valueOf(c0402n.f2422e)).floatValue();
        c0402n.f2425i = c1107ab.m685a(str, "lockDir", Boolean.valueOf(c0402n.f2425i)).booleanValue();
        c0402n.f2426j = c1107ab.m685a(str, "redirectDamageToParent", Boolean.valueOf(c0402n.f2426j)).booleanValue();
        c0402n.f2427k = c1107ab.m685a(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(c0402n.f2427k)).booleanValue();
        if (!c0402n.f2426j && c0402n.f2427k) {
            throw new C0417bo("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
        }
        c0402n.f2440l = c1107ab.m685a(str, "canBeAttackedAndDamaged", Boolean.valueOf(c0402n.f2440l)).booleanValue();
        c0402n.f2441m = c1107ab.m685a(str, "isUnselectable", Boolean.valueOf(c0402n.f2441m)).booleanValue();
        c0402n.f2442n = c1107ab.m685a(str, "isUnselectableAsTarget", Boolean.valueOf(c0402n.f2441m)).booleanValue();
        c0402n.f2443o = c1107ab.m685a(str, "isVisible", Boolean.valueOf(c0402n.f2443o)).booleanValue();
        c0402n.f2444p = c1107ab.m685a(str, "showMiniHp", Boolean.valueOf(c0402n.f2444p)).booleanValue();
        c0402n.f2445q = c1107ab.m685a(str, "hideHp", Boolean.valueOf(c0402n.f2445q)).booleanValue();
        c0402n.f2437N = c1107ab.m704a(c0458l, str, "showAllActionsFrom", (LogicBoolean) null);
        if (LogicBoolean.isStaticFalse(c0402n.f2437N)) {
            c0402n.f2437N = null;
        }
        Float m683a = c1107ab.m683a(str, "idleDir", (Float) null);
        Float m683a2 = c1107ab.m683a(str, "idleDirReversing", (Float) null);
        if (m683a != null) {
            c0402n.f2423f = m683a.floatValue();
            c0402n.f2439g = m683a.floatValue();
        }
        if (m683a2 != null) {
            c0402n.f2439g = m683a2.floatValue();
        } else {
            c0402n.f2439g = c0402n.f2423f;
        }
        c0402n.f2424h = c1107ab.m685a(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
        c0402n.f2446r = c1107ab.m685a(str, "rotateWithParent", Boolean.valueOf(c0402n.f2446r)).booleanValue();
        c0402n.f2447s = c1107ab.m685a(str, "lockLegMovement", Boolean.valueOf(c0402n.f2447s)).booleanValue();
        c0402n.f2448t = c1107ab.m685a(str, "freezeLegMovement", Boolean.valueOf(c0402n.f2448t)).booleanValue();
        c0402n.f2428u = c1107ab.m685a(str, "lockRotation", Boolean.valueOf(c0402n.f2428u)).booleanValue();
        if (c0402n.f2428u && c0402n.f2424h) {
            throw new C0417bo("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        c0402n.f2449v = c1107ab.m685a(str, "keepAliveWhenParentDies", Boolean.valueOf(c0402n.f2449v)).booleanValue();
        c0402n.f2429w = C0418bp.m3871b(c0458l, c1107ab, str, "onCreateSpawnUnitOf");
        if (c0402n.f2429w.m3872b()) {
            c0402n.f2429w = null;
        }
        c0402n.f2450x = c1107ab.m685a(str, "createIncompleteIfParentIs", Boolean.valueOf(c0402n.f2450x)).booleanValue();
        c0402n.f2430y = c1107ab.m685a(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(c0402n.f2430y)).booleanValue();
        c0402n.f2431z = c1107ab.m685a(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(c0402n.f2431z)).booleanValue();
        c0402n.f2452B = c1107ab.m685a(str, "setDrawLayerOnBottom", Boolean.valueOf(c0402n.f2452B)).booleanValue();
        if (c0402n.f2452B) {
            c0402n.f2451A = false;
        }
        c0402n.f2451A = c1107ab.m685a(str, "setDrawLayerOnTop", Boolean.valueOf(c0402n.f2451A)).booleanValue();
        if (c0402n.f2451A && c0402n.f2452B) {
            throw new C0417bo("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
        }
        c0402n.f2454D = c1107ab.m685a(str, "addTransportedUnits", Boolean.valueOf(c0402n.f2454D)).booleanValue();
        c0402n.f2432E = c1107ab.m685a(str, "unloadInCurrentPosition", Boolean.valueOf(c0402n.f2432E)).booleanValue();
        c0402n.f2455F = c1107ab.m685a(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(c0402n.f2455F)).booleanValue();
        if (c0402n.f2455F) {
            c0402n.f2433G = 500.0f;
        } else {
            c0402n.f2433G = 0.0f;
        }
        c0402n.f2434H = c1107ab.m685a(str, "deattachIfWantingToMove", Boolean.valueOf(c0402n.f2434H)).booleanValue();
        c0402n.f2456I = c1107ab.m685a(str, "hidden", Boolean.valueOf(c0402n.f2456I)).booleanValue();
        c0402n.f2457J = c1107ab.m685a(str, "prioritizeParentsMainTarget", Boolean.valueOf(c0402n.f2457J)).booleanValue();
        c0402n.f2435K = c1107ab.m685a(str, "onlyAttackParentsMainTarget", Boolean.valueOf(c0402n.f2435K)).booleanValue();
        c0402n.f2436L = c1107ab.m685a(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(c0402n.f2436L)).booleanValue();
        c0402n.f2458M = c1107ab.m685a(str, "canAttack", Boolean.valueOf(c0402n.f2458M)).booleanValue();
        c0402n.f2438O = c1107ab.m685a(str, "keepWaypointsNeedingMovement", Boolean.valueOf(c0402n.f2438O)).booleanValue();
        if (c0402n.f2454D) {
            c0458l.f2974aB = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: a */
    public void mo3928a(C0456j c0456j, float f) {
        mo3919b(c0456j, f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0458l c0458l = c0456j.f2891x;
        C1136m c1136m = c0458l.f3258aA;
        if (c1136m.f7109a == 0) {
            return;
        }
        if (c0458l.f2974aB) {
            Object[] m535a = c1136m.m535a();
            for (int i = 0; i < c1136m.f7109a; i++) {
                C0402n c0402n = (C0402n) m535a[i];
                if (c0402n.f2454D && c0456j.f2895B.f7109a > 0 && m3927a(c0456j, c0402n) == null) {
                    Iterator it = c0456j.f2895B.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                            if ((abstractC0244am instanceof AbstractC0629y) && abstractC0244am.f1657cO == null && c0456j.mo2996a((AbstractC0629y) abstractC0244am, c0402n)) {
                                abstractC0244am.f1656cN = null;
                                break;
                            }
                        }
                    }
                }
            }
        }
        C1136m c1136m2 = c0456j.f2896C;
        if (c1136m2 == null) {
            return;
        }
        float f3 = c0456j.f1623cg - c0456j.f2897D;
        c0456j.f2897D = c0456j.f1623cg;
        Object[] m535a2 = c1136m2.m535a();
        for (int i2 = c1136m2.f7109a - 1; i2 >= 0; i2--) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) m535a2[i2];
            if (abstractC0629y != null) {
                if (abstractC0629y.f1612bV) {
                    abstractC0629y.m2888bx();
                    m535a2[i2] = null;
                } else {
                    if (c0456j.f1656cN != null) {
                        if (abstractC0629y.f1656cN == null) {
                            abstractC0629y.f1656cN = c0456j.f1656cN;
                            gameEngine.f6330bS.m1808l(abstractC0629y);
                        }
                    } else if (abstractC0629y.f1656cN != null && abstractC0629y.f1656cN != c0456j) {
                        abstractC0629y.f1656cN = null;
                    }
                    C0402n c0402n2 = (C0402n) c1136m.get(i2);
                    float m2107k = C0773f.m2107k(c0456j.f1623cg);
                    float m2110j = C0773f.m2110j(c0456j.f1623cg);
                    float f4 = (m2107k * c0402n2.f2421d) - (m2110j * c0402n2.f2420c);
                    float f5 = (m2110j * c0402n2.f2421d) + (m2107k * c0402n2.f2420c);
                    float f6 = f4 + c0456j.f7172eo;
                    float f7 = f5 + c0456j.f7173ep;
                    float f8 = c0456j.f7174eq + c0402n2.f2422e;
                    if (C1152y.m455b(abstractC0629y.f1659cQ, (int) c0402n2.f2433G)) {
                        abstractC0629y.f7172eo += (f6 - abstractC0629y.f7172eo) * 0.05f;
                        abstractC0629y.f7173ep += (f7 - abstractC0629y.f7173ep) * 0.05f;
                        abstractC0629y.f7174eq += (f8 - abstractC0629y.f7174eq) * 0.05f;
                    } else {
                        abstractC0629y.f7172eo = f6;
                        abstractC0629y.f7173ep = f7;
                        abstractC0629y.f7174eq = f8;
                    }
                    if (abstractC0629y.f1629cm < 1.0f && c0402n2.f2450x) {
                        abstractC0629y.m4193r(c0456j.f1629cm);
                        abstractC0629y.f1630cn = c0456j.f1629cm;
                    }
                    if (c0402n2.f2451A) {
                        if (abstractC0629y.f7170em <= c0456j.f7170em) {
                            int i3 = 0;
                            if (abstractC0629y instanceof C0456j) {
                                i3 = ((C0456j) abstractC0629y).f2891x.f3277cI;
                            }
                            abstractC0629y.f7170em = c0456j.f7170em;
                            abstractC0629y.f7171en = c0456j.f7171en + 1 + i3;
                        }
                    } else if (c0402n2.f2452B && abstractC0629y.f7170em >= c0456j.f7170em) {
                        abstractC0629y.f7170em = c0456j.f7170em;
                        abstractC0629y.f7171en = c0456j.f7171en - 1;
                    }
                    if (c0456j.f1625ci) {
                        f2 = c0456j.f1623cg + c0402n2.f2439g;
                    } else {
                        f2 = c0456j.f1623cg + c0402n2.f2423f;
                    }
                    if (!abstractC0629y.mo3397bI()) {
                        if (c0402n2.f2428u) {
                            abstractC0629y.mo2864h(f2);
                        } else {
                            if (f3 != 0.0f && c0402n2.f2446r) {
                                abstractC0629y.mo2860i(f3);
                            }
                            if (c0402n2.f2424h && abstractC0629y.f3928R == null) {
                                abstractC0629y.m2885c(f, f2);
                            }
                        }
                    }
                    if (c0402n2.f2435K) {
                        abstractC0629y.f3928R = c0456j.f3928R;
                        abstractC0629y.f3929S = 5.0f;
                    }
                    if (c0402n2.f2436L && abstractC0629y.f3928R == null) {
                        abstractC0629y.f3928R = c0456j.f3928R;
                    }
                    if (c0402n2.f2457J && c0456j.f3928R != null && abstractC0629y.f3928R != c0456j.f3928R) {
                        boolean z = false;
                        if (c0402n2.f2436L) {
                            z = true;
                        }
                        if (abstractC0629y.m3006a(c0456j.f3928R, z)) {
                            abstractC0629y.f3928R = c0456j.f3928R;
                            abstractC0629y.f3929S = 5.0f;
                        }
                    }
                    if (abstractC0629y instanceof C0456j) {
                        C0456j c0456j2 = (C0456j) abstractC0629y;
                        if (c0402n2.f2447s) {
                            c0456j2.f2906dP = c0456j2.f7172eo;
                            c0456j2.f2906dP = c0456j2.f7173ep;
                            c0456j2.f2908dR = c0456j2.f7174eq;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3922a(C0456j c0456j, boolean z) {
        C1136m c1136m = c0456j.f2896C;
        if (c1136m == null) {
            return;
        }
        C1136m c1136m2 = c0456j.f2891x.f3258aA;
        Object[] m535a = c1136m.m535a();
        for (int i = c1136m.f7109a - 1; i >= 0; i--) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) m535a[i];
            if (abstractC0629y != null) {
                C0402n c0402n = (C0402n) c1136m2.get(i);
                abstractC0629y.m2888bx();
                m535a[i] = null;
                if (z && !c0402n.f2449v) {
                    abstractC0629y.m4210ci();
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3920b(C0456j c0456j) {
        m3922a(c0456j, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: c */
    public void mo3918c(C0456j c0456j) {
        m3922a(c0456j, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: a */
    public void mo3929a(C0456j c0456j) {
        boolean z = false;
        C1136m c1136m = c0456j.f2891x.f3258aA;
        Object[] m535a = c1136m.m535a();
        for (int i = c1136m.f7109a - 1; i >= 0; i--) {
            C0402n c0402n = (C0402n) m535a[i];
            if (c0402n.f2429w != null) {
                AbstractC0629y m3927a = m3927a(c0456j, c0402n);
                if (m3927a != null) {
                    if (!c0402n.f2430y) {
                        m3927a.m4210ci();
                    }
                }
                C1136m c1136m2 = new C1136m();
                c0402n.f2429w.m3874a(c1136m2, c0456j.f1614bX, (AbstractC0244am) c0456j, true);
                if (c1136m2.size() > 1) {
                    GameEngine.print("onCreateSpawnUnitOf: created an extra " + (c1136m2.size() - 1) + " units");
                    for (int i2 = 1; i2 < c1136m2.size(); i2++) {
                        ((AbstractC0244am) c1136m2.get(i2)).m4210ci();
                    }
                }
                if (c1136m2.size() == 0) {
                    GameEngine.print("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) c1136m2.get(0);
                    if (!(abstractC0244am instanceof AbstractC0629y)) {
                        GameEngine.print("onCreateSpawnUnitOf: Warning " + abstractC0244am.mo5458r().mo3513i() + " not an orderable unit type, cannot attach");
                        abstractC0244am.m4210ci();
                    } else {
                        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                        if (c0456j.mo2996a(abstractC0629y, c0402n)) {
                            abstractC0629y.f1659cQ = -9999;
                            if (c0456j.f1629cm < 1.0f && c0402n.f2450x) {
                                abstractC0629y.m4193r(c0456j.f1629cm);
                                abstractC0629y.f1630cn = c0456j.f1629cm;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            mo3919b(c0456j, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: a */
    public void mo3925a(C0456j c0456j, C0458l c0458l) {
        C1136m c1136m = c0456j.f2896C;
        C1136m c1136m2 = c0456j.f2891x.f3258aA;
        if (c1136m2.size() == 0) {
            c0456j.f2896C = null;
        } else if (c1136m != null) {
            for (int size = c1136m.size() - 1; size >= 0; size--) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) c1136m.get(size);
                if (abstractC0629y != null && size >= c1136m2.size()) {
                    abstractC0629y.m4210ci();
                    c1136m.remove(size);
                }
            }
            for (int size2 = c1136m.size() - 1; size2 >= 0; size2--) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) c1136m.get(size2);
                if (abstractC0629y2 != null) {
                    abstractC0629y2.f1658cP = (C0402n) c1136m2.get(size2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0402n m3923a(C0456j c0456j, short s) {
        C1136m c1136m = c0456j.f2891x.f3258aA;
        if (c1136m.f7109a <= s) {
            return null;
        }
        return (C0402n) c1136m.get(s);
    }

    /* renamed from: a */
    public static AbstractC0629y m3927a(C0456j c0456j, C0402n c0402n) {
        short s;
        C1136m c1136m = c0456j.f2896C;
        if (c1136m == null || c1136m.f7109a <= (s = c0402n.f2418a)) {
            return null;
        }
        return (AbstractC0629y) c1136m.get(s);
    }

    /* renamed from: a */
    public static boolean m3926a(C0456j c0456j, C0402n c0402n, AbstractC0629y abstractC0629y) {
        C0458l c0458l = c0456j.f2891x;
        short s = c0402n.f2418a;
        if (c0458l.f3258aA.f7109a <= s && abstractC0629y != null) {
            GameEngine.print("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + c0458l.f3258aA.f7109a);
            return false;
        }
        if (c0456j.f2896C == null) {
            c0456j.f2896C = new C1136m();
        }
        C1136m c1136m = c0456j.f2896C;
        if (c1136m.size() == 0) {
            c0456j.f2897D = c0456j.f1623cg;
        }
        if (abstractC0629y == null && s >= c1136m.size()) {
            return true;
        }
        while (c1136m.size() <= s) {
            c1136m.add(null);
        }
        c1136m.set(s, abstractC0629y);
        return true;
    }

    /* renamed from: a */
    public static void m3924a(C0456j c0456j, C1136m c1136m, boolean z) {
        C0402n m4201dn;
        boolean read;
        C1136m c1136m2 = c0456j.f2896C;
        if (c1136m2 != null) {
            Iterator it = c1136m2.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am != null && (abstractC0244am instanceof AbstractC0629y) && (m4201dn = abstractC0244am.m4201dn()) != null && m4201dn.f2437N != null) {
                    Iterator it2 = abstractC0244am.mo3131N().iterator();
                    while (it2.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it2.next();
                        if (z) {
                            read = C0810an.m1952a(m4201dn.f2437N, c0456j);
                        } else {
                            read = m4201dn.f2437N.read(c0456j);
                        }
                        if (read) {
                            c1136m.add(new C0212g(abstractC0224s, (AbstractC0629y) abstractC0244am, abstractC0224s.m4309N()));
                        }
                    }
                }
            }
        }
    }
}
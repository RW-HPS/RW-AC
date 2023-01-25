package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p018b.C0399k;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.bn */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bn.class */
public class C0416bn {

    /* renamed from: a */
    public String f2567a;

    /* renamed from: b */
    public String f2568b;

    /* renamed from: c */
    public boolean f2569c;

    /* renamed from: d */
    public boolean f2570d;

    /* renamed from: e */
    public int f2571e;

    /* renamed from: f */
    public float f2572f;

    /* renamed from: g */
    public float f2573g;

    /* renamed from: h */
    public float f2574h;

    /* renamed from: j */
    public float f2576j;

    /* renamed from: k */
    public float f2577k;

    /* renamed from: l */
    public boolean f2578l;

    /* renamed from: t */
    public float f2586t;

    /* renamed from: v */
    public C0429b f2588v;

    /* renamed from: y */
    public C0416bn f2591y;

    /* renamed from: z */
    public C0416bn f2592z;

    /* renamed from: A */
    public boolean f2593A;

    /* renamed from: C */
    public LogicBoolean f2595C;

    /* renamed from: D */
    public C0414bl f2596D;

    /* renamed from: E */
    public C0473z f2597E;

    /* renamed from: F */
    public C0473z f2598F;

    /* renamed from: G */
    public Integer f2599G;

    /* renamed from: H */
    public boolean f2600H;

    /* renamed from: I */
    public boolean f2601I;

    /* renamed from: J */
    public LogicBoolean f2602J;

    /* renamed from: K */
    public LogicBoolean f2603K;

    /* renamed from: L */
    public LogicBoolean f2604L;

    /* renamed from: M */
    public LogicBoolean f2605M;

    /* renamed from: N */
    public LogicBoolean f2606N;

    /* renamed from: O */
    public C0454h f2607O;

    /* renamed from: P */
    public C0454h f2608P;

    /* renamed from: T */
    public LogicBoolean f2612T;

    /* renamed from: U */
    public Float f2613U;

    /* renamed from: X */
    public float f2616X;

    /* renamed from: Y */
    public float f2617Y;

    /* renamed from: aa */
    public float f2619aa;

    /* renamed from: ac */
    public Boolean f2621ac;

    /* renamed from: ad */
    public float f2622ad;

    /* renamed from: ae */
    public float f2623ae;

    /* renamed from: af */
    public float f2624af;

    /* renamed from: aj */
    public Float f2628aj;

    /* renamed from: ak */
    public C0454h f2629ak;

    /* renamed from: ao */
    public C0416bn f2633ao;

    /* renamed from: au */
    public float f2639au;

    /* renamed from: av */
    public LogicBoolean f2640av;

    /* renamed from: ax */
    public float f2642ax;

    /* renamed from: ay */
    public boolean f2643ay;

    /* renamed from: az */
    public int f2644az;

    /* renamed from: aA */
    public C0462o f2645aA;

    /* renamed from: aB */
    public float f2646aB;

    /* renamed from: aC */
    public C0468u f2647aC;

    /* renamed from: aD */
    public C0970e f2648aD;

    /* renamed from: aE */
    public C0970e[] f2649aE;

    /* renamed from: aF */
    public C0970e f2650aF;

    /* renamed from: aG */
    public float f2651aG;

    /* renamed from: aH */
    public float f2652aH;

    /* renamed from: aI */
    public int f2653aI;

    /* renamed from: aJ */
    public C0454h f2654aJ;

    /* renamed from: i */
    public float f2575i = 1.0f;

    /* renamed from: m */
    public float f2579m = -1.0f;

    /* renamed from: n */
    public float f2580n = 0.0f;

    /* renamed from: o */
    public float f2581o = 4.0f;

    /* renamed from: p */
    public float f2582p = 0.0f;

    /* renamed from: q */
    public float f2583q = 4.0f;

    /* renamed from: r */
    public float f2584r = 7.0f;

    /* renamed from: s */
    public boolean f2585s = false;

    /* renamed from: u */
    public float f2587u = 0.0f;

    /* renamed from: w */
    public int f2589w = -1;

    /* renamed from: x */
    public int f2590x = -1;

    /* renamed from: B */
    public boolean f2594B = true;

    /* renamed from: Q */
    public float f2609Q = 5.0f;

    /* renamed from: R */
    public int f2610R = 0;

    /* renamed from: S */
    public int f2611S = -1;

    /* renamed from: V */
    public float f2614V = -1.0f;

    /* renamed from: W */
    public float f2615W = -1.0f;

    /* renamed from: Z */
    public float f2618Z = 0.0f;

    /* renamed from: ab */
    public float f2620ab = 99999.0f;

    /* renamed from: ag */
    public float f2625ag = -1.0f;

    /* renamed from: ah */
    public float f2626ah = -1.0f;

    /* renamed from: ai */
    public float f2627ai = -1.0f;

    /* renamed from: al */
    public float f2630al = -1.0f;

    /* renamed from: am */
    public float f2631am = 2000.0f;

    /* renamed from: an */
    public float f2632an = -999.0f;

    /* renamed from: ap */
    public int f2634ap = -1;

    /* renamed from: aq */
    public boolean f2635aq = true;

    /* renamed from: ar */
    public float f2636ar = 0.0f;

    /* renamed from: as */
    public float f2637as = 0.0f;

    /* renamed from: at */
    public float f2638at = 10.0f;

    /* renamed from: aw */
    public float f2641aw = -1.0f;

    /* renamed from: a */
    public int m3881a(C0456j c0456j) {
        if (this.f2611S >= 0 && this.f2612T.read(c0456j)) {
            return this.f2611S;
        }
        return this.f2610R;
    }

    /* renamed from: a */
    public void m3883a(C0416bn c0416bn) {
        this.f2572f = c0416bn.f2572f;
        this.f2573g = c0416bn.f2573g;
        this.f2574h = c0416bn.f2574h;
        this.f2576j = c0416bn.f2576j;
        this.f2577k = c0416bn.f2577k;
        this.f2578l = c0416bn.f2578l;
        this.f2579m = c0416bn.f2579m;
        this.f2580n = c0416bn.f2580n;
        this.f2581o = c0416bn.f2581o;
        this.f2587u = c0416bn.f2587u;
        this.f2588v = c0416bn.f2588v;
        this.f2653aI = c0416bn.f2653aI;
        this.f2654aJ = c0416bn.f2654aJ;
        this.f2585s = c0416bn.f2585s;
        this.f2586t = c0416bn.f2586t;
        this.f2582p = c0416bn.f2582p;
        this.f2583q = c0416bn.f2583q;
        this.f2584r = c0416bn.f2584r;
        this.f2591y = c0416bn.f2591y;
        this.f2593A = c0416bn.f2593A;
        this.f2594B = c0416bn.f2594B;
        this.f2595C = c0416bn.f2595C;
        this.f2596D = c0416bn.f2596D;
        this.f2597E = c0416bn.f2597E;
        this.f2599G = c0416bn.f2599G;
        this.f2598F = c0416bn.f2598F;
        this.f2602J = c0416bn.f2602J;
        this.f2603K = c0416bn.f2603K;
        this.f2604L = c0416bn.f2604L;
        this.f2605M = c0416bn.f2605M;
        this.f2606N = c0416bn.f2606N;
        this.f2607O = c0416bn.f2607O;
        this.f2608P = c0416bn.f2608P;
        this.f2609Q = c0416bn.f2609Q;
        this.f2648aD = c0416bn.f2648aD;
        this.f2649aE = c0416bn.f2649aE;
        this.f2650aF = c0416bn.f2650aF;
        this.f2610R = c0416bn.f2610R;
        this.f2611S = c0416bn.f2611S;
        this.f2612T = c0416bn.f2612T;
        this.f2613U = c0416bn.f2613U;
        this.f2614V = c0416bn.f2614V;
        this.f2615W = c0416bn.f2615W;
        this.f2616X = c0416bn.f2616X;
        this.f2617Y = c0416bn.f2617Y;
        this.f2618Z = c0416bn.f2618Z;
        this.f2619aa = c0416bn.f2619aa;
        this.f2633ao = c0416bn.f2633ao;
        this.f2635aq = c0416bn.f2635aq;
        this.f2637as = c0416bn.f2637as;
        this.f2638at = c0416bn.f2638at;
        this.f2639au = c0416bn.f2639au;
        this.f2640av = c0416bn.f2640av;
        this.f2641aw = c0416bn.f2641aw;
        this.f2642ax = c0416bn.f2642ax;
        this.f2620ab = c0416bn.f2620ab;
        this.f2625ag = c0416bn.f2625ag;
        this.f2627ai = c0416bn.f2627ai;
        this.f2624af = c0416bn.f2624af;
        this.f2643ay = c0416bn.f2643ay;
        this.f2644az = c0416bn.f2644az;
        this.f2629ak = c0416bn.f2629ak;
        this.f2630al = c0416bn.f2630al;
        this.f2631am = c0416bn.f2631am;
        this.f2632an = c0416bn.f2632an;
        this.f2645aA = c0416bn.f2645aA;
        this.f2651aG = c0416bn.f2651aG;
        this.f2652aH = c0416bn.f2652aH;
    }

    /* renamed from: a */
    public static void m3882a(C0416bn c0416bn, C0458l c0458l, C1107ab c1107ab, String str) {
        c0416bn.f2569c = true;
        if (c0416bn.f2570d) {
            return;
        }
        Float valueOf = Float.valueOf(c1107ab.m643i(str, "x"));
        Float valueOf2 = Float.valueOf(c1107ab.m643i(str, "y"));
        String m666b = c1107ab.m666b(str, "copyFrom", (String) null);
        if (m666b != null) {
            C0416bn m3520e = c0458l.m3520e(m666b);
            if (m3520e == null) {
                throw new RuntimeException("[" + str + "] Could not find copy turret target with name:" + m666b);
            }
            if (m3520e.f2569c && !m3520e.f2570d) {
                throw new RuntimeException("[" + str + "] Infinite loop detected with turret copies:" + m666b);
            }
            if (!m3520e.f2570d) {
                m3882a(m3520e, c0458l, c1107ab, m3520e.f2568b);
            }
            c0416bn.m3883a(m3520e);
        } else {
            c0416bn.f2624af = c0458l.f3218ez;
            c0416bn.f2616X = c0458l.f3193ea;
        }
        c0416bn.f2572f = valueOf.floatValue();
        c0416bn.f2573g = valueOf2.floatValue();
        c0416bn.f2574h = c1107ab.m683a(str, "height", Float.valueOf(0.0f)).floatValue();
        c0416bn.f2575i = c1107ab.m683a(str, "yAxisScaling", Float.valueOf(1.0f)).floatValue();
        String m666b2 = c1107ab.m666b(str, "linkDelayWithTurret", (String) null);
        if (m666b2 != null) {
            c0416bn.f2633ao = c0458l.m3520e(m666b2);
            if (c0416bn.f2633ao == null) {
                throw new RuntimeException("[" + str + "] Could not find 'linkDelayWithTurret' turret target with name:" + m666b2);
            }
            c0416bn.f2579m = 9000.0f;
        }
        Float m668b = c1107ab.m668b(str, "delay", (Float) null);
        if (m668b != null) {
            c0416bn.f2579m = m668b.floatValue();
        }
        if (c0416bn.f2579m == -1.0f) {
            c0416bn.f2579m = c0458l.f3179dM;
        }
        Float m668b2 = c1107ab.m668b(str, "warmup", (Float) null);
        if (m668b2 != null) {
            c0416bn.f2580n = m668b2.floatValue();
        }
        Float m683a = c1107ab.m683a(str, "warmupCallDownRate", (Float) null);
        if (m683a != null) {
            c0416bn.f2581o = m683a.floatValue();
        }
        Boolean m685a = c1107ab.m685a(str, "warmupNoReset", (Boolean) null);
        if (m685a != null) {
            c0416bn.f2585s = m685a.booleanValue();
        }
        Float m683a2 = c1107ab.m683a(str, "warmupShootDelayTransfer", (Float) null);
        if (m683a2 != null) {
            c0416bn.f2586t = m683a2.floatValue();
        }
        c0416bn.f2582p = c1107ab.m683a(str, "recoilOffset", Float.valueOf(c0416bn.f2582p)).floatValue();
        c0416bn.f2583q = c1107ab.m683a(str, "recoilOutTime", Float.valueOf(c0416bn.f2583q)).floatValue();
        c0416bn.f2584r = c1107ab.m668b(str, "recoilReturnTime", Float.valueOf(c0416bn.f2584r)).floatValue();
        Float m683a3 = c1107ab.m683a(str, "energyUsage", (Float) null);
        if (m683a3 != null) {
            c0416bn.f2587u = m683a3.floatValue();
        }
        c0416bn.f2653aI = c1107ab.m667b(str, "unloadUpToXUnitsAndGiveAttackOrder", Integer.valueOf(c0416bn.f2653aI)).intValue();
        C0429b m3840a = C0429b.m3840a(c0458l, c1107ab, str, "resourceUsage", true);
        if (m3840a != null && m3840a.m3817d()) {
            c0416bn.f2588v = m3840a;
            c0458l.m3557a(m3840a);
        }
        String m666b3 = c1107ab.m666b(str, "attachedTo", (String) null);
        if (m666b3 != null) {
            c0416bn.f2591y = c0458l.m3520e(m666b3);
            if (c0416bn.f2591y == null) {
                throw new RuntimeException("[" + str + "] Could not find attachedTo turret target:" + m666b3);
            }
            if (c0416bn.f2591y == c0416bn) {
                throw new RuntimeException("Turret cannot be attachedTo self");
            }
            c0458l.f3291fU = true;
        }
        Float m683a4 = c1107ab.m683a(str, "idleDir", (Float) null);
        if (m683a4 != null) {
            c0416bn.f2576j = m683a4.floatValue();
        }
        Float m683a5 = c1107ab.m683a(str, "idleDirReversing", (Float) null);
        if (m683a5 != null) {
            c0416bn.f2577k = m683a5.floatValue();
            c0416bn.f2578l = true;
        } else if (!c0416bn.f2578l) {
            if (c0416bn.f2591y != null) {
                c0416bn.f2577k = 0.0f;
            } else {
                c0416bn.f2577k = c0416bn.f2576j + 180.0f;
            }
        }
        Boolean m685a2 = c1107ab.m685a(str, "canShoot", (Boolean) null);
        Boolean m685a3 = c1107ab.m685a(str, "canAttack", (Boolean) null);
        if (m685a2 != null && m685a3 != null) {
            throw new RuntimeException("[" + str + "] Cannot use canShoot and canAttack at the same time, they have the same meaning");
        }
        if (m685a2 != null) {
            c0416bn.f2594B = m685a2.booleanValue();
        } else if (m685a3 != null) {
            c0416bn.f2594B = m685a3.booleanValue();
        }
        c0416bn.f2596D = C0414bl.m3884a(c0458l, c1107ab.m666b(str, "shoot_sound", (String) null), c0416bn.f2596D);
        Float m683a6 = c1107ab.m683a(str, "shoot_sound_vol", (Float) null);
        if (m683a6 != null) {
            c0416bn.f2596D.m3888a(m683a6.floatValue());
        }
        c0416bn.f2597E = c0458l.m3542a(c1107ab.m666b(str, "shoot_flame", (String) null), c0416bn.f2597E);
        c0416bn.f2599G = c1107ab.m681a(str, "shoot_light", c0416bn.f2599G);
        c0416bn.f2598F = c0458l.m3542a(c1107ab.m666b(str, "warmupStartEffect", (String) null), c0416bn.f2598F);
        c0416bn.f2593A = c1107ab.m685a(str, "slave", Boolean.valueOf(c0416bn.f2593A)).booleanValue();
        if (c0416bn.f2593A) {
            if (c0416bn.f2591y == null) {
                throw new RuntimeException("Turret cannot be a slave without being 'attachedTo' to another turret");
            }
            c0416bn.f2592z = c0416bn.f2591y;
        }
        c0416bn.f2595C = c1107ab.m704a(c0458l, str, "invisible", c0416bn.f2595C);
        c0416bn.f2602J = c1107ab.m704a(c0458l, str, "canAttackFlyingUnits", c0416bn.f2602J);
        c0416bn.f2603K = c1107ab.m704a(c0458l, str, "canAttackLandUnits", c0416bn.f2603K);
        c0416bn.f2604L = c1107ab.m704a(c0458l, str, "canAttackUnderwaterUnits", c0416bn.f2604L);
        c0416bn.f2605M = c1107ab.m704a(c0458l, str, "canAttackNotTouchingWaterUnits", c0416bn.f2605M);
        c0416bn.f2606N = c1107ab.m704a(c0458l, str, "canAttackCondition", c0416bn.f2606N);
        c0416bn.f2607O = c1107ab.m705a(c0458l, str, "canOnlyAttackUnitsWithTags", c0416bn.f2607O);
        c0416bn.f2608P = c1107ab.m705a(c0458l, str, "canOnlyAttackUnitsWithoutTags", c0416bn.f2608P);
        String m666b4 = c1107ab.m666b(str, "projectile", (String) null);
        if (m666b4 != null) {
            C0410bh m3518f = c0458l.m3518f(m666b4);
            if (m3518f == null) {
                if ("0".equals(m666b4) && c0458l.f3290fT.size() == 1 && c0458l.m3518f("1") != null) {
                    c0416bn.f2610R = 0;
                } else {
                    throw new RuntimeException("[" + str + "] Could not find projectile with name:" + m666b4);
                }
            } else {
                c0416bn.f2610R = m3518f.f2539bi;
            }
        }
        String m666b5 = c1107ab.m666b(str, "altProjectile", (String) null);
        if (m666b5 != null) {
            C0410bh m3518f2 = c0458l.m3518f(m666b5);
            if (m3518f2 == null) {
                throw new RuntimeException("[" + str + "]altProjectile: Could not find projectile with name:" + m666b5);
            }
            c0416bn.f2611S = m3518f2.f2539bi;
        }
        c0416bn.f2612T = c1107ab.m704a(c0458l, str, "altProjectileCondition", c0416bn.f2612T);
        if (c0416bn.f2611S >= 0 && c0416bn.f2612T == null) {
            throw new RuntimeException("[" + str + "]altProjectileCondition is required with altProjectile");
        }
        c0416bn.f2609Q = c1107ab.m683a(str, "canAttackMaxAngle", Float.valueOf(c0416bn.f2609Q)).floatValue();
        c0416bn.f2613U = c1107ab.m683a(str, "turnSpeed", c0416bn.f2613U);
        c0416bn.f2614V = c1107ab.m683a(str, "turnSpeedAcceleration", Float.valueOf(c0416bn.f2614V)).floatValue();
        c0416bn.f2615W = c1107ab.m683a(str, "turnSpeedDeceleration", Float.valueOf(c0416bn.f2615W)).floatValue();
        Float m683a7 = c1107ab.m683a(str, "barrelY", (Float) null);
        Float m683a8 = c1107ab.m683a(str, "size", (Float) null);
        if (m683a7 != null && m683a8 != null) {
            throw new RuntimeException("Turret [" + str + "]: barrelY and size can not both be used at the same time as they have the same meaning");
        }
        if (m683a7 != null) {
            c0416bn.f2616X = m683a7.floatValue();
        }
        if (m683a8 != null) {
            c0416bn.f2616X = m683a8.floatValue();
        }
        c0416bn.f2617Y = c1107ab.m683a(str, "barrelX", Float.valueOf(c0416bn.f2617Y)).floatValue();
        c0416bn.f2618Z = c1107ab.m683a(str, "barrelOffsetX_onOddShots", Float.valueOf(c0416bn.f2618Z)).floatValue();
        c0416bn.f2619aa = c1107ab.m683a(str, "barrelHeight", Float.valueOf(c0416bn.f2619aa)).floatValue();
        c0416bn.f2620ab = c1107ab.m683a(str, "limitingRange", Float.valueOf(c0416bn.f2620ab)).floatValue();
        c0416bn.f2627ai = c1107ab.m683a(str, "limitingAngle", Float.valueOf(c0416bn.f2627ai)).floatValue();
        c0416bn.f2625ag = c1107ab.m683a(str, "limitingMinRange", Float.valueOf(c0416bn.f2625ag)).floatValue();
        c0416bn.f2624af = c1107ab.m683a(str, "aimOffsetSpread", Float.valueOf(c0416bn.f2624af)).floatValue();
        if (c0416bn.f2627ai >= 0.0f) {
            c0458l.f3069bG = true;
        }
        if (c0416bn.f2620ab < 99999.0f) {
            c0416bn.f2622ad = c0416bn.f2620ab;
        } else {
            c0416bn.f2622ad = c0458l.f3126cL.f2262i;
        }
        c0416bn.f2623ae = c0416bn.f2622ad * c0416bn.f2622ad;
        if (c0416bn.f2625ag > 0.0f) {
            c0416bn.f2626ah = c0416bn.f2625ag * c0416bn.f2625ag;
        } else {
            c0416bn.f2626ah = -1.0f;
        }
        c0416bn.f2621ac = c1107ab.m685a(str, "showRangeUIGuide", (Boolean) null);
        c0416bn.f2628aj = c1107ab.m683a(str, "laserDefenceEnergyUse", c0416bn.f2628aj);
        if (c0416bn.f2628aj != null) {
            c0458l.f3067bE = true;
            c0458l.m3558a(C0399k.f2411a);
        }
        c0416bn.f2629ak = C0453g.m3680a(c1107ab.m666b(str, "interceptProjectiles_withTags", (String) null), c0416bn.f2629ak);
        if (c0416bn.f2629ak != null) {
            c0458l.f3068bF = true;
            c0458l.m3558a(C0399k.f2411a);
            c0416bn.f2630al = c1107ab.m683a(str, "interceptProjectiles_andTargetingGroundUnderDistance", Float.valueOf(c0416bn.f2630al)).floatValue();
            c0416bn.f2631am = c1107ab.m683a(str, "interceptProjectiles_andUnderDistance", Float.valueOf(c0416bn.f2631am)).floatValue();
            c0416bn.f2632an = c1107ab.m683a(str, "interceptProjectiles_andOverHeight", Float.valueOf(c0416bn.f2632an)).floatValue();
        }
        c0416bn.f2635aq = c1107ab.m685a(str, "shouldResetTurret", Boolean.valueOf(c0416bn.f2635aq)).booleanValue();
        c0416bn.f2636ar = c1107ab.m683a(str, "idleSpin", Float.valueOf(c0416bn.f2636ar)).floatValue();
        c0416bn.f2637as = c1107ab.m683a(str, "idleSweepAngle", Float.valueOf(c0416bn.f2637as)).floatValue();
        c0416bn.f2638at = c1107ab.m683a(str, "idleSweepDelay", Float.valueOf(c0416bn.f2638at)).floatValue();
        c0416bn.f2639au = c1107ab.m683a(str, "idleSweepSpeed", Float.valueOf(c0416bn.f2639au)).floatValue();
        c0416bn.f2640av = c1107ab.m704a(c0458l, str, "idleSweepCondition", c0416bn.f2640av);
        c0416bn.f2640av = LogicBoolean.convertAlwaysTrueToNull(c0416bn.f2640av);
        c0416bn.f2641aw = c1107ab.m683a(str, "idleSweepAddRandomDelay", Float.valueOf(c0416bn.f2641aw)).floatValue();
        if (c0416bn.f2641aw < 0.0f) {
            float f = 1.0f;
            if (c0416bn.f2638at > 200.0f) {
                f = 20.0f;
            } else if (c0416bn.f2638at > 50.0f) {
                f = 5.0f;
            }
            c0416bn.f2641aw = f;
        }
        c0416bn.f2642ax = c1107ab.m683a(str, "idleSweepAddRandomAngle", Float.valueOf(c0416bn.f2642ax)).floatValue();
        if (c0416bn.f2642ax < 0.0f) {
            throw new RuntimeException("Turret [" + str + "]: idleSweepAddRandomAngle must be >= 0");
        }
        if (c0416bn.f2637as < 0.0f) {
            throw new RuntimeException("Turret [" + str + "]: idleSweepAngle must be >= 0");
        }
        c0416bn.f2643ay = c1107ab.m685a(str, "clearTurretTargetAfterFiring", Boolean.valueOf(c0416bn.f2643ay)).booleanValue();
        c0416bn.f2645aA = c0458l.m3543a(c1107ab.m666b(str, "onShoot_playAnimation", (String) null), c0416bn.f2645aA);
        c0416bn.f2646aB = c1107ab.m668b(str, "onShoot_freezeBodyMovementFor", Float.valueOf(c0416bn.f2646aB)).floatValue();
        c0416bn.f2647aC = c1107ab.m702a(c0458l, str, "onShoot_triggerActions", c0416bn.f2647aC);
        if (c1107ab.m685a(str, "isMainNanoTurret", (Boolean) false).booleanValue()) {
            c0458l.f3292fV = c0416bn;
        }
        C0970e m3547a = c0458l.m3547a(c1107ab, str, "image");
        if (m3547a != null) {
            c0416bn.f2648aD = m3547a;
            boolean z = c0458l.f2951s;
            Boolean m685a4 = c1107ab.m685a(str, "image_applyTeamColors", (Boolean) null);
            if (m685a4 != null) {
                z = m685a4.booleanValue();
            }
            if (z) {
                c0416bn.f2649aE = c0458l.m3548a(c0416bn.f2648aD, c0458l.f2987ac);
            } else {
                c0416bn.f2649aE = null;
            }
        }
        c0416bn.f2651aG = c1107ab.m683a(str, "image_drawOffsetX", Float.valueOf(c0416bn.f2651aG)).floatValue();
        c0416bn.f2652aH = c1107ab.m683a(str, "image_drawOffsetY", Float.valueOf(c0416bn.f2652aH)).floatValue();
        C0970e m3547a2 = c0458l.m3547a(c1107ab, str, "chargeEffectImage");
        if (m3547a2 != null) {
            c0416bn.f2650aF = m3547a2;
            c0458l.f3286fP = true;
        }
        if (c0458l.f3288fR[c0416bn.f2610R] == null) {
            throw new RuntimeException("Turret [" + str + "]: cannot find linked projectile:" + c0416bn.f2610R);
        }
        if (c0416bn.f2611S >= 0 && c0458l.f3288fR[c0416bn.f2611S] == null) {
            throw new RuntimeException("Turret [" + str + "]altProjectile: cannot find linked projectile");
        }
        c0416bn.f2602J = LogicBoolean.convertAlwaysTrueToNull(c0416bn.f2602J);
        c0416bn.f2603K = LogicBoolean.convertAlwaysTrueToNull(c0416bn.f2603K);
        c0416bn.f2604L = LogicBoolean.convertAlwaysTrueToNull(c0416bn.f2604L);
        c0416bn.f2605M = LogicBoolean.convertAlwaysTrueToNull(c0416bn.f2605M);
        c0416bn.f2606N = LogicBoolean.convertAlwaysTrueToNull(c0416bn.f2606N);
        if (c0416bn.f2627ai != -1.0f || c0416bn.f2602J != null || c0416bn.f2603K != null || c0416bn.f2604L != null || c0416bn.f2605M != null || c0416bn.f2606N != null) {
            c0416bn.f2600H = true;
        }
        if (c0416bn.f2620ab < 99999.0f || c0416bn.f2625ag > 0.0f) {
            c0416bn.f2600H = true;
            c0416bn.f2601I = true;
        }
        if (c0416bn.f2607O != null || c0416bn.f2608P != null) {
            c0416bn.f2600H = true;
        }
        c0416bn.f2570d = true;
    }
}
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ba.class */
public class C0403ba {

    /* renamed from: a */
    int f2459a;

    /* renamed from: b */
    String f2460b;

    /* renamed from: c */
    boolean f2461c;

    /* renamed from: d */
    public float f2462d;

    /* renamed from: e */
    public float f2463e;

    /* renamed from: i */
    public float f2467i;

    /* renamed from: j */
    public float f2468j;

    /* renamed from: k */
    public float f2469k;

    /* renamed from: l */
    public boolean f2470l;

    /* renamed from: p */
    public boolean f2474p;

    /* renamed from: q */
    public LogicBoolean f2475q;

    /* renamed from: w */
    public float f2481w;

    /* renamed from: x */
    public C0970e f2482x;

    /* renamed from: y */
    public C0970e[] f2483y;

    /* renamed from: z */
    public boolean f2484z;

    /* renamed from: A */
    public float f2485A;

    /* renamed from: B */
    public C0970e f2486B;

    /* renamed from: C */
    public C0970e[] f2487C;

    /* renamed from: D */
    public C0970e f2488D;

    /* renamed from: E */
    public boolean f2489E;

    /* renamed from: H */
    public boolean f2492H;

    /* renamed from: S */
    public int[] f2503S;

    /* renamed from: T */
    public float f2504T;

    /* renamed from: f */
    public float f2464f = 2.0f;

    /* renamed from: g */
    public float f2465g = 0.0f;

    /* renamed from: h */
    public boolean f2466h = true;

    /* renamed from: m */
    public float f2471m = 1.0f;

    /* renamed from: n */
    public boolean f2472n = true;

    /* renamed from: o */
    public boolean f2473o = false;

    /* renamed from: r */
    public float f2476r = 1.0f;

    /* renamed from: s */
    public float f2477s = 1.0f;

    /* renamed from: t */
    public float f2478t = 0.0f;

    /* renamed from: u */
    public float f2479u = 3.0f;

    /* renamed from: v */
    public float f2480v = 0.3f;

    /* renamed from: F */
    public boolean f2490F = true;

    /* renamed from: G */
    public boolean f2491G = true;

    /* renamed from: I */
    public boolean f2493I = true;

    /* renamed from: J */
    public boolean f2494J = true;

    /* renamed from: K */
    public float f2495K = 7.0f;

    /* renamed from: L */
    public int f2496L = 3;

    /* renamed from: M */
    public boolean f2497M = true;

    /* renamed from: N */
    public float f2498N = 16.0f;

    /* renamed from: O */
    public float f2499O = 50.0f;

    /* renamed from: P */
    public boolean f2500P = false;

    /* renamed from: Q */
    public boolean f2501Q = false;

    /* renamed from: R */
    public float f2502R = 0.0f;

    /* renamed from: a */
    public void m3915a(C0403ba c0403ba) {
        this.f2462d = c0403ba.f2462d;
        this.f2463e = c0403ba.f2463e;
        this.f2467i = c0403ba.f2467i;
        this.f2468j = c0403ba.f2468j;
        this.f2469k = c0403ba.f2469k;
        this.f2464f = c0403ba.f2464f;
        this.f2465g = c0403ba.f2465g;
        this.f2466h = c0403ba.f2466h;
        this.f2470l = c0403ba.f2470l;
        this.f2471m = c0403ba.f2471m;
        this.f2472n = c0403ba.f2472n;
        this.f2473o = c0403ba.f2473o;
        this.f2478t = c0403ba.f2478t;
        this.f2474p = c0403ba.f2474p;
        this.f2476r = c0403ba.f2476r;
        this.f2477s = c0403ba.f2477s;
        this.f2479u = c0403ba.f2479u;
        this.f2481w = c0403ba.f2481w;
        this.f2482x = c0403ba.f2482x;
        this.f2483y = c0403ba.f2483y;
        this.f2485A = c0403ba.f2485A;
        this.f2484z = c0403ba.f2484z;
        this.f2486B = c0403ba.f2486B;
        this.f2487C = c0403ba.f2487C;
        this.f2488D = c0403ba.f2488D;
        this.f2489E = c0403ba.f2489E;
        this.f2490F = c0403ba.f2490F;
        this.f2491G = c0403ba.f2491G;
        this.f2480v = c0403ba.f2480v;
        this.f2492H = c0403ba.f2492H;
        this.f2493I = c0403ba.f2493I;
        this.f2494J = c0403ba.f2494J;
        this.f2495K = c0403ba.f2495K;
        this.f2496L = c0403ba.f2496L;
        this.f2497M = c0403ba.f2497M;
        this.f2498N = c0403ba.f2498N;
        this.f2499O = c0403ba.f2499O;
        this.f2500P = c0403ba.f2500P;
        this.f2501Q = c0403ba.f2501Q;
        this.f2502R = c0403ba.f2502R;
        this.f2504T = c0403ba.f2504T;
    }

    /* renamed from: a */
    public static void m3914a(C0403ba c0403ba, C0458l c0458l, C1107ab c1107ab, String str, boolean z, ArrayList arrayList) {
        if (!z) {
            c0403ba.f2470l = true;
            c0403ba.f2494J = false;
        }
        int intValue = c1107ab.m667b(str, "copyFrom", (Integer) 0).intValue();
        if (intValue != 0) {
            if (intValue - 1 >= arrayList.size()) {
                throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + intValue);
            }
            c0403ba.m3915a((C0403ba) arrayList.get(intValue - 1));
        }
        c0403ba.f2462d = c1107ab.m643i(str, "x");
        c0403ba.f2463e = c1107ab.m643i(str, "y");
        c0403ba.f2460b = str.replace("_", VariableScope.nullOrMissingString);
        c0403ba.f2461c = z;
        Float m683a = c1107ab.m683a(str, "attach_x", (Float) null);
        if (m683a != null) {
            c0403ba.f2468j = m683a.floatValue();
        }
        Float m683a2 = c1107ab.m683a(str, "attach_y", (Float) null);
        if (m683a2 != null) {
            c0403ba.f2469k = m683a2.floatValue();
        }
        c0403ba.f2464f = c1107ab.m683a(str, "liftingHeightOffset", Float.valueOf(c0403ba.f2464f)).floatValue();
        c0403ba.f2465g = c1107ab.m683a(str, "targetHeight", Float.valueOf(c0403ba.f2465g)).floatValue();
        c0403ba.f2466h = c1107ab.m685a(str, "targetHeightRelative", Boolean.valueOf(c0403ba.f2466h)).booleanValue();
        c0403ba.f2467i = c1107ab.m683a(str, "endDirOffset", Float.valueOf(0.0f)).floatValue();
        c0403ba.f2470l = c1107ab.m685a(str, "lockMovement", Boolean.valueOf(c0403ba.f2470l)).booleanValue();
        c0403ba.f2471m = c1107ab.m683a(str, "estimatingPositionMultiplier", Float.valueOf(c0403ba.f2471m)).floatValue();
        c0403ba.f2475q = c1107ab.m704a(c0458l, str, "hidden", c0403ba.f2475q);
        c0403ba.f2474p = c0403ba.f2475q == LogicBoolean.trueBoolean;
        c0403ba.f2476r = c1107ab.m683a(str, "alpha", Float.valueOf(c0403ba.f2476r)).floatValue();
        Float m683a3 = c1107ab.m683a(str, "moveSpeed", (Float) null);
        if (m683a3 != null) {
            c0403ba.f2477s = m683a3.floatValue();
        }
        c0403ba.f2478t = c1107ab.m668b(str, "moveWarmUp", Float.valueOf(c0403ba.f2478t)).floatValue();
        c0403ba.f2479u = c1107ab.m683a(str, "rotateSpeed", Float.valueOf(c0403ba.f2479u)).floatValue();
        Float m683a4 = c1107ab.m683a(str, "resetAngle", (Float) null);
        if (m683a4 != null) {
            c0403ba.f2481w = m683a4.floatValue();
        }
        boolean booleanValue = c1107ab.m685a(str, "image_end_teamColors", (Boolean) false).booleanValue();
        C0970e m3547a = c0458l.m3547a(c1107ab, str, "image_foot");
        if (m3547a != null) {
            c0403ba.f2486B = m3547a;
            if (booleanValue) {
                c0403ba.f2487C = c0458l.m3548a(c0403ba.f2486B, c0458l.f2987ac);
            } else {
                c0403ba.f2487C = null;
            }
        }
        C0970e m3547a2 = c0458l.m3547a(c1107ab, str, "image_end");
        if (m3547a2 != null) {
            c0403ba.f2486B = m3547a2;
            if (booleanValue) {
                c0403ba.f2487C = c0458l.m3548a(c0403ba.f2486B, c0458l.f2987ac);
            } else {
                c0403ba.f2487C = null;
            }
        }
        C0970e m3547a3 = c0458l.m3547a(c1107ab, str, "image_foot_shadow");
        if (m3547a3 != null) {
            c0403ba.f2488D = m3547a3;
        }
        C0970e m3547a4 = c0458l.m3547a(c1107ab, str, "image_end_shadow");
        if (m3547a4 != null) {
            c0403ba.f2488D = m3547a4;
        }
        C0970e m3547a5 = c0458l.m3547a(c1107ab, str, "image_leg");
        if (m3547a5 != null) {
            c0403ba.f2482x = m3547a5;
        }
        C0970e m3547a6 = c0458l.m3547a(c1107ab, str, "image_middle");
        if (m3547a6 != null) {
            c0403ba.f2482x = m3547a6;
        }
        boolean booleanValue2 = c1107ab.m685a(str, "image_middle_teamColors", (Boolean) false).booleanValue();
        if (c0403ba.f2482x != null && booleanValue2) {
            c0403ba.f2483y = c0458l.m3548a(c0403ba.f2482x, c0458l.f2987ac);
        } else {
            c0403ba.f2483y = null;
        }
        Float m683a5 = c1107ab.m683a(str, "heightSpeed", (Float) null);
        if (m683a5 != null) {
            c0403ba.f2480v = m683a5.floatValue();
        }
        Boolean m685a = c1107ab.m685a(str, "draw_foot_on_top", (Boolean) null);
        if (m685a != null) {
            c0403ba.f2492H = m685a.booleanValue();
        }
        Boolean m685a2 = c1107ab.m685a(str, "dust_effect", (Boolean) null);
        if (m685a2 != null) {
            c0403ba.f2493I = m685a2.booleanValue();
        }
        Boolean m685a3 = c1107ab.m685a(str, "drawLegWhenZoomedOut", (Boolean) null);
        if (m685a3 != null) {
            c0403ba.f2490F = m685a3.booleanValue();
            c0403ba.f2489E = true;
        }
        Boolean m685a4 = c1107ab.m685a(str, "drawFootWhenZoomedOut", (Boolean) null);
        if (m685a4 != null) {
            c0403ba.f2491G = m685a4.booleanValue();
            c0403ba.f2489E = true;
        }
        if (!c0403ba.f2489E && !c0403ba.f2470l && !c0403ba.f2500P) {
            if (c0458l.f3137cW < 30) {
                c0403ba.f2490F = false;
            }
            if (c0458l.f3137cW < 20) {
                c0403ba.f2491G = false;
            }
        }
        Boolean m685a5 = c1107ab.m685a(str, "explodeOnDeath", (Boolean) null);
        if (m685a5 != null) {
            c0403ba.f2494J = m685a5.booleanValue();
        }
        Float m683a6 = c1107ab.m683a(str, "holdDisMin", (Float) null);
        if (m683a6 != null) {
            c0403ba.f2495K = m683a6.floatValue();
        }
        c0403ba.f2496L = c1107ab.m667b(str, "holdDisMin_maxMovingLegs", Integer.valueOf(c0403ba.f2496L)).intValue();
        c0403ba.f2497M = c1107ab.m685a(str, "hold_moveOnlyIfFurthest", Boolean.valueOf(c0403ba.f2497M)).booleanValue();
        c0403ba.f2472n = c1107ab.m685a(str, "holdDisMin_checkNeighbours", Boolean.valueOf(c0403ba.f2472n)).booleanValue();
        c0403ba.f2473o = c1107ab.m685a(str, "favourOppositeSideNeighbours", Boolean.valueOf(c0403ba.f2473o)).booleanValue();
        Float m683a7 = c1107ab.m683a(str, "holdDisMax", (Float) null);
        if (m683a7 != null) {
            c0403ba.f2498N = m683a7.floatValue();
        }
        Float m683a8 = c1107ab.m683a(str, "hardLimit", (Float) null);
        if (m683a8 != null) {
            c0403ba.f2499O = m683a8.floatValue();
        }
        c0403ba.f2500P = c1107ab.m685a(str, "drawOverBody", Boolean.valueOf(c0403ba.f2500P)).booleanValue();
        if (c0403ba.f2500P) {
            c0458l.f3009ay = true;
        }
        c0403ba.f2501Q = c1107ab.m685a(str, "drawUnderAllUnits", Boolean.valueOf(c0403ba.f2501Q)).booleanValue();
        if (c0403ba.f2501Q) {
            c0458l.f3010az = true;
        }
        if (c0403ba.f2501Q && c0403ba.f2500P) {
            throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
        }
        c0403ba.f2502R = c1107ab.m683a(str, "drawDirOffset", Float.valueOf(c0403ba.f2502R)).floatValue();
        c0403ba.f2504T = c1107ab.m683a(str, "spinRate", Float.valueOf(c0403ba.f2504T)).floatValue();
    }
}
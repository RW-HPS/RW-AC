package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/d.class */
public class C0392d implements Comparable {

    /* renamed from: a */
    String f2307a;

    /* renamed from: c */
    boolean f2308c;

    /* renamed from: d */
    boolean f2309d;

    /* renamed from: e */
    boolean f2310e;

    /* renamed from: f */
    boolean f2311f;

    /* renamed from: g */
    boolean f2312g;

    /* renamed from: i */
    boolean f2313i;

    /* renamed from: j */
    public float f2314j;

    /* renamed from: k */
    public boolean f2315k;

    /* renamed from: l */
    public boolean f2316l;

    /* renamed from: m */
    public boolean f2317m;

    /* renamed from: n */
    public boolean f2318n;

    /* renamed from: q */
    public boolean f2319q;

    /* renamed from: r */
    public LogicBoolean f2320r;

    /* renamed from: s */
    public LogicBoolean f2321s;

    /* renamed from: t */
    public LogicBoolean f2322t;

    /* renamed from: u */
    public boolean f2323u;

    /* renamed from: v */
    public C0393e f2324v;

    /* renamed from: w */
    public C0393e[] f2325w;

    /* renamed from: x */
    public float f2326x;

    /* renamed from: y */
    public int f2327y;

    /* renamed from: z */
    public boolean f2328z;

    /* renamed from: A */
    LogicBoolean f2329A;

    /* renamed from: B */
    LogicBoolean f2330B;

    /* renamed from: C */
    public C0970e f2331C;

    /* renamed from: D */
    public float f2332D;

    /* renamed from: E */
    public float f2333E;

    /* renamed from: F */
    public LogicBoolean f2334F;

    /* renamed from: G */
    public EnumC0394f f2335G;

    /* renamed from: H */
    public float f2336H;

    /* renamed from: I */
    public boolean f2337I;

    /* renamed from: M */
    public boolean f2338M;

    /* renamed from: N */
    public LogicBoolean f2339N;

    /* renamed from: O */
    public int f2340O;

    /* renamed from: P */
    public int f2341P;

    /* renamed from: Q */
    public float f2342Q;

    /* renamed from: R */
    public float f2343R;

    /* renamed from: S */
    public float f2344S;

    /* renamed from: T */
    public float f2345T;

    /* renamed from: U */
    public float f2346U;

    /* renamed from: V */
    public float f2347V;

    /* renamed from: W */
    public LogicBoolean f2348W;

    /* renamed from: X */
    public LogicBoolean f2349X;

    /* renamed from: Y */
    public boolean f2350Y;

    /* renamed from: Z */
    public boolean f2351Z;

    /* renamed from: aa */
    public float f2352aa;

    /* renamed from: ab */
    public float f2353ab;

    /* renamed from: ac */
    public LogicBoolean f2354ac;

    /* renamed from: ad */
    public LogicBoolean f2355ad;

    /* renamed from: af */
    public boolean f2356af;

    /* renamed from: ah */
    public C0966ag f2357ah;

    /* renamed from: ai */
    public LogicBoolean f2358ai;

    /* renamed from: b */
    boolean f2359b = false;

    /* renamed from: h */
    EnumC0200q f2360h = EnumC0200q.any;

    /* renamed from: o */
    public int f2361o = -1;

    /* renamed from: p */
    public float f2362p = 1.0f;

    /* renamed from: J */
    public int f2363J = -1;

    /* renamed from: K */
    public int f2364K = -1;

    /* renamed from: L */
    public int f2365L = -1;

    /* renamed from: ae */
    public int f2366ae = -1;

    /* renamed from: ag */
    public int f2367ag = -1;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo3940a(C0392d c0392d) {
        if (c0392d == null) {
            return 0;
        }
        float f = this.f2336H - c0392d.f2336H;
        if (f < 0.0f) {
            return -1;
        }
        return f > 0.0f ? 1 : 0;
    }
}
package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/e.class */
public class C0393e {

    /* renamed from: a */
    public C0970e f2368a;

    /* renamed from: b */
    public C0970e[] f2369b;

    /* renamed from: c */
    public int f2370c;

    /* renamed from: d */
    public int f2371d;

    /* renamed from: e */
    public int f2372e = 1;

    /* renamed from: f */
    public int f2373f = 1;

    /* renamed from: a */
    public void m3939a(C0392d c0392d) {
        int i = this.f2368a.f6620p;
        int i2 = this.f2368a.f6621q;
        this.f2370c = i;
        this.f2371d = i2;
        if (c0392d.f2364K > 0) {
            this.f2370c = c0392d.f2364K;
        } else if (c0392d.f2363J > 0) {
            this.f2370c = i / c0392d.f2363J;
        }
        if (c0392d.f2365L > 0) {
            this.f2371d = c0392d.f2365L;
        }
        if (this.f2370c > 0) {
            this.f2373f = i / this.f2370c;
        }
        if (this.f2371d > 0) {
            this.f2372e = i2 / this.f2371d;
        }
        if (this.f2373f <= 0) {
            this.f2373f = 1;
        }
        if (this.f2372e <= 0) {
            this.f2372e = 1;
        }
    }
}
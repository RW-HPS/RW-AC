package com.corrodinggames.rts.game.units;

/* renamed from: com.corrodinggames.rts.game.units.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ap.class */
public final class C0247ap {

    /* renamed from: a */
    public float f1717a;

    /* renamed from: b */
    public float f1718b;

    /* renamed from: c */
    public float f1719c;

    /* renamed from: d */
    public float f1720d;

    /* renamed from: e */
    public float f1721e;

    /* renamed from: f */
    public float f1722f;

    /* renamed from: g */
    public boolean f1723g;

    /* renamed from: h */
    public float f1724h;

    /* renamed from: i */
    public float f1725i;

    /* renamed from: j */
    public AbstractC0244am f1726j;

    /* renamed from: k */
    public float f1727k;

    /* renamed from: l */
    public float f1728l;

    /* renamed from: m */
    public boolean f1729m;

    /* renamed from: a */
    public void m4188a(float f) {
        this.f1717a = f;
        this.f1718b = this.f1717a;
        this.f1719c = 0.0f;
        this.f1720d = 0.0f;
        this.f1721e = 0.0f;
        this.f1722f = 0.0f;
        this.f1723g = false;
        this.f1724h = 0.0f;
        this.f1725i = 0.0f;
        this.f1726j = null;
        this.f1727k = 0.0f;
        this.f1728l = 0.0f;
        this.f1729m = false;
    }

    /* renamed from: a */
    public final void m4187a(int i) {
        if (this.f1720d < i && this.f1720d >= 0.0f) {
            this.f1720d = i;
        }
    }

    /* renamed from: b */
    public final void m4185b(int i) {
        if (this.f1720d > (-i)) {
            this.f1720d = -i;
        }
    }

    /* renamed from: a */
    public final boolean m4189a() {
        return this.f1720d == 0.0f;
    }

    /* renamed from: b */
    public final boolean m4186b() {
        return this.f1720d < 0.0f;
    }
}
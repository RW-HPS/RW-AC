package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b.class */
class C0388b extends C0320a {

    /* renamed from: e */
    public C0473z f2290e;

    /* renamed from: f */
    public float f2291f;

    /* renamed from: g */
    public float f2292g;

    /* renamed from: h */
    public boolean f2293h;

    public C0388b(float f, float f2) {
        super(f, f2);
    }

    /* renamed from: a */
    public void m3953a(C0458l c0458l, String str, String str2) {
        try {
            if (str.equalsIgnoreCase("x")) {
                this.f2291f = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("y")) {
                this.f2292g = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("name")) {
                this.f2290e = c0458l.m3542a(str2, (C0473z) null);
            } else {
                throw new C0417bo("Unknown event key:" + str + " on animation");
            }
        } catch (NumberFormatException e) {
            throw new C0417bo("Failed to parse float:" + str2);
        }
    }

    public void finalize() {
        this.f2293h = true;
        if (this.f2290e == null) {
            throw new C0417bo("Animation effect missing key 'name'");
        }
    }

    /* renamed from: a */
    public void m3954a(C0456j c0456j) {
        if (this.f2290e != null) {
            float f = c0456j.f7173eo;
            float f2 = c0456j.f7174ep;
            this.f2290e.m3465a(f + this.f2291f, f2 + this.f2292g, c0456j.f7175eq, c0456j.f1623cg, c0456j);
        }
    }
}
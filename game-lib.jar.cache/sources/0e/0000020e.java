package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a.class */
class C0320a implements Comparable {

    /* renamed from: a */
    public float f1912a;

    /* renamed from: b */
    public float f1913b;

    /* renamed from: c */
    public float f1914c;

    /* renamed from: d */
    public float f1915d;

    public C0320a(float f, float f2) {
        this.f1912a = f;
        this.f1913b = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C0320a c0320a) {
        if (this.f1912a == c0320a.f1912a) {
            return 0;
        }
        return this.f1912a > c0320a.f1912a ? 1 : -1;
    }
}
package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a.class */
class a implements Comparable {
    public float a;
    public float b;
    public float c;
    public float d;

    public a(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        if (this.a == aVar.a) {
            return 0;
        }
        return this.a > aVar.a ? 1 : -1;
    }
}
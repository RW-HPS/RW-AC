package com.corrodinggames.rts.game.units.custom;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a.class */
public class a implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public float f216a;
    public float b;
    public float c;
    public float d;

    public a(float f, float f2) {
        this.f216a = f;
        this.b = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        if (this.f216a == aVar.f216a) {
            return 0;
        }
        return this.f216a > aVar.f216a ? 1 : -1;
    }
}
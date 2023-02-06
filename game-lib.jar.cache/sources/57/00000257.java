package com.corrodinggames.rts.game.units.custom.b;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/e.class */
public class e {
    public com.corrodinggames.rts.gameFramework.unitAction.e a;
    public com.corrodinggames.rts.gameFramework.unitAction.e[] b;
    public int c;
    public int d;
    public int e = 1;
    public int f = 1;

    public void a(d dVar) {
        int i = this.a.p;
        int i2 = this.a.q;
        this.c = i;
        this.d = i2;
        if (dVar.K > 0) {
            this.c = dVar.K;
        } else if (dVar.J > 0) {
            this.c = i / dVar.J;
        }
        if (dVar.L > 0) {
            this.d = dVar.L;
        }
        if (this.c > 0) {
            this.f = i / this.c;
        }
        if (this.d > 0) {
            this.e = i2 / this.d;
        }
        if (this.f <= 0) {
            this.f = 1;
        }
        if (this.e <= 0) {
            this.e = 1;
        }
    }
}
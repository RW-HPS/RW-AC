package com.corrodinggames.rts.game.units;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ap.class */
public final class ap {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public am j;
    public float k;
    public float l;
    public boolean m;

    public void a(float f) {
        this.a = f;
        this.b = this.a;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = false;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = false;
    }

    public final void a(int i) {
        if (this.d < i && this.d >= 0.0f) {
            this.d = i;
        }
    }

    public final void b(int i) {
        if (this.d > (-i)) {
            this.d = -i;
        }
    }

    public final boolean a() {
        return this.d == 0.0f;
    }

    public final boolean b() {
        return this.d < 0.0f;
    }
}
package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aj.class */
public class aj {

    /* renamed from: a  reason: collision with root package name */
    al f428a;
    float[] b;
    int c;
    int d;
    int e;
    n f;
    int g;
    public ak h;
    b i;
    com.corrodinggames.rts.gameFramework.m.ae j;
    boolean k;
    int l;
    int m;
    float n;
    float o;
    float p;
    float q;
    float r;
    float s;
    float t;

    public void a(com.corrodinggames.rts.gameFramework.m.ae aeVar) {
        this.c = 0;
        this.d = 0;
        this.i = null;
        b(aeVar);
        a();
        n.q();
        this.f428a.d();
        n.q();
    }

    public void a() {
        this.h.c.a(this.f.d);
    }

    void b(com.corrodinggames.rts.gameFramework.m.ae aeVar) {
        if (aeVar != null) {
            this.f.a(aeVar.n);
            this.f.c(aeVar);
            this.k = false;
        } else {
            this.f.a(this.g);
        }
        this.j = aeVar;
    }

    public void b() {
        if (this.c > 0) {
            n.q();
            this.f428a.a(this.b, 0, this.c);
            this.f428a.b();
            n.q();
            this.f428a.a(this.l, 0, this.c);
            this.f428a.c();
            n.q();
            this.c = 0;
            this.d = 0;
        }
    }

    public void c() {
        b();
        this.i = null;
        this.f428a.e();
        n.q();
    }

    public void a(int i) {
        if (this.m == i) {
            return;
        }
        this.m = i;
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        this.n = f2;
        this.o = ((i >>> 8) & 255) * 0.003921569f * f;
        this.p = (i & 255) * 0.003921569f * f;
        this.q = f;
    }

    public void b(int i) {
        if (this.l != i) {
            b();
            this.l = i;
        }
    }

    public void a(float f) {
        if (this.t != f) {
            b();
            GLES20.glLineWidth(f);
            this.t = f;
        }
    }

    public void a(float f, float f2) {
        if (this.c + 8 + 24 >= this.e && this.l == 1 && this.d % 2 == 0) {
            b();
        }
        if (this.c + 8 >= this.e) {
            b();
        }
        n.q();
        if (this.k && this.j != null) {
            this.f.c(this.j);
            this.k = false;
        }
        n.q();
        float[] fArr = this.b;
        int i = this.c;
        this.c = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        fArr3[i3] = this.r;
        float[] fArr4 = this.b;
        int i4 = this.c;
        this.c = i4 + 1;
        fArr4[i4] = this.s;
        float[] fArr5 = this.b;
        int i5 = this.c;
        this.c = i5 + 1;
        fArr5[i5] = this.n;
        float[] fArr6 = this.b;
        int i6 = this.c;
        this.c = i6 + 1;
        fArr6[i6] = this.o;
        float[] fArr7 = this.b;
        int i7 = this.c;
        this.c = i7 + 1;
        fArr7[i7] = this.p;
        float[] fArr8 = this.b;
        int i8 = this.c;
        this.c = i8 + 1;
        fArr8[i8] = this.q;
        this.d++;
        n.q();
    }

    public void a(float f, float f2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[4];
        float f5 = fArr[1];
        float f6 = fArr[5];
        a((f * f3) + (f2 * f4) + fArr[12], (f * f5) + (f2 * f6) + fArr[13]);
    }
}
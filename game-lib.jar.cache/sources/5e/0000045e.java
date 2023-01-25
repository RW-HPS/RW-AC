package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.unitAction.C0964ae;

/* renamed from: com.corrodinggames.rts.gameFramework.b.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aj.class */
public class C0696aj {

    /* renamed from: a */
    C0698al f4383a;

    /* renamed from: b */
    float[] f4384b;

    /* renamed from: c */
    int f4385c;

    /* renamed from: d */
    int f4386d;

    /* renamed from: e */
    int f4387e;

    /* renamed from: f */
    C0712n f4388f;

    /* renamed from: g */
    int f4389g;

    /* renamed from: h */
    public C0697ak f4390h;

    /* renamed from: i */
    AbstractC0699b f4391i;

    /* renamed from: j */
    C0964ae f4392j;

    /* renamed from: k */
    boolean f4393k;

    /* renamed from: l */
    int f4394l;

    /* renamed from: m */
    int f4395m;

    /* renamed from: n */
    float f4396n;

    /* renamed from: o */
    float f4397o;

    /* renamed from: p */
    float f4398p;

    /* renamed from: q */
    float f4399q;

    /* renamed from: r */
    float f4400r;

    /* renamed from: s */
    float f4401s;

    /* renamed from: t */
    float f4402t;

    /* renamed from: a */
    public void m2657a(C0964ae c0964ae) {
        this.f4385c = 0;
        this.f4386d = 0;
        this.f4391i = null;
        m2654b(c0964ae);
        m2662a();
        C0712n.m2539q();
        this.f4383a.m2647d();
        C0712n.m2539q();
    }

    /* renamed from: a */
    public void m2662a() {
        this.f4390h.f4405c.m2533a(this.f4388f.f4448d);
    }

    /* renamed from: b */
    void m2654b(C0964ae c0964ae) {
        if (c0964ae != null) {
            this.f4388f.m2598a(c0964ae.f6577n);
            this.f4388f.m2555c(c0964ae);
            this.f4393k = false;
        } else {
            this.f4388f.m2598a(this.f4389g);
        }
        this.f4392j = c0964ae;
    }

    /* renamed from: b */
    public void m2656b() {
        if (this.f4385c > 0) {
            C0712n.m2539q();
            this.f4383a.m2650a(this.f4384b, 0, this.f4385c);
            this.f4383a.m2649b();
            C0712n.m2539q();
            this.f4383a.m2651a(this.f4394l, 0, this.f4385c);
            this.f4383a.m2648c();
            C0712n.m2539q();
            this.f4385c = 0;
            this.f4386d = 0;
        }
    }

    /* renamed from: c */
    public void m2653c() {
        m2656b();
        this.f4391i = null;
        this.f4383a.m2646e();
        C0712n.m2539q();
    }

    /* renamed from: a */
    public void m2658a(int i) {
        if (this.f4395m == i) {
            return;
        }
        this.f4395m = i;
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        this.f4396n = f2;
        this.f4397o = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f4398p = (i & 255) * 0.003921569f * f;
        this.f4399q = f;
    }

    /* renamed from: b */
    public void m2655b(int i) {
        if (this.f4394l != i) {
            m2656b();
            this.f4394l = i;
        }
    }

    /* renamed from: a */
    public void m2661a(float f) {
        if (this.f4402t != f) {
            m2656b();
            GLES20.glLineWidth(f);
            this.f4402t = f;
        }
    }

    /* renamed from: a */
    public void m2660a(float f, float f2) {
        if (this.f4385c + 8 + 24 >= this.f4387e && this.f4394l == 1 && this.f4386d % 2 == 0) {
            m2656b();
        }
        if (this.f4385c + 8 >= this.f4387e) {
            m2656b();
        }
        C0712n.m2539q();
        if (this.f4393k && this.f4392j != null) {
            this.f4388f.m2555c(this.f4392j);
            this.f4393k = false;
        }
        C0712n.m2539q();
        float[] fArr = this.f4384b;
        int i = this.f4385c;
        this.f4385c = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.f4384b;
        int i2 = this.f4385c;
        this.f4385c = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.f4384b;
        int i3 = this.f4385c;
        this.f4385c = i3 + 1;
        fArr3[i3] = this.f4400r;
        float[] fArr4 = this.f4384b;
        int i4 = this.f4385c;
        this.f4385c = i4 + 1;
        fArr4[i4] = this.f4401s;
        float[] fArr5 = this.f4384b;
        int i5 = this.f4385c;
        this.f4385c = i5 + 1;
        fArr5[i5] = this.f4396n;
        float[] fArr6 = this.f4384b;
        int i6 = this.f4385c;
        this.f4385c = i6 + 1;
        fArr6[i6] = this.f4397o;
        float[] fArr7 = this.f4384b;
        int i7 = this.f4385c;
        this.f4385c = i7 + 1;
        fArr7[i7] = this.f4398p;
        float[] fArr8 = this.f4384b;
        int i8 = this.f4385c;
        this.f4385c = i8 + 1;
        fArr8[i8] = this.f4399q;
        this.f4386d++;
        C0712n.m2539q();
    }

    /* renamed from: a */
    public void m2659a(float f, float f2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[4];
        float f5 = fArr[1];
        float f6 = fArr[5];
        m2660a((f * f3) + (f2 * f4) + fArr[12], (f * f5) + (f2 * f6) + fArr[13]);
    }
}
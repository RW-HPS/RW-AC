package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0679b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/d.class */
public class C0682d {

    /* renamed from: a */
    C0680b f4311a;

    /* renamed from: b */
    C0685g f4312b;

    /* renamed from: c */
    float[] f4313c;

    /* renamed from: e */
    int f4315e;

    /* renamed from: h */
    private float[] f4317h;

    /* renamed from: i */
    private int f4318i;

    /* renamed from: g */
    int f4319g;

    /* renamed from: d */
    int f4314d = 0;

    /* renamed from: f */
    int f4316f = 0;

    public C0682d(int i, AbstractC0679b abstractC0679b, C0680b c0680b) {
        this.f4311a = c0680b;
        this.f4313c = new float[i * 4 * 5];
        this.f4312b = new C0685g(i * 4, i * 6);
        this.f4315e = i;
        short[] sArr = new short[i * 6];
        int length = sArr.length;
        short s = 0;
        int i2 = 0;
        while (i2 < length) {
            sArr[i2 + 0] = (short) (s + 0);
            sArr[i2 + 1] = (short) (s + 1);
            sArr[i2 + 2] = (short) (s + 2);
            sArr[i2 + 3] = (short) (s + 2);
            sArr[i2 + 4] = (short) (s + 3);
            sArr[i2 + 5] = (short) (s + 0);
            i2 += 6;
            s = (short) (s + 4);
        }
        this.f4312b.m2683a(sArr, 0, length);
        this.f4318i = GLES20.glGetUniformLocation(abstractC0679b.m2718b(), "u_MVPMatrix");
    }

    /* renamed from: a */
    public void m2694a(float[] fArr) {
        this.f4316f = 0;
        this.f4314d = 0;
        this.f4317h = fArr;
        this.f4319g = -1;
    }

    /* renamed from: a */
    void m2695a(C0681c c0681c) {
        int i = c0681c.f4305b;
        if (this.f4319g == i) {
            return;
        }
        m2697a();
        GLES20.glBindTexture(3553, ((C0683e) this.f4311a.f4299s.get(i)).f4320a);
        this.f4319g = i;
    }

    /* renamed from: a */
    public void m2697a() {
        if (this.f4316f > 0) {
            GLES20.glUniformMatrix4fv(this.f4318i, 1, false, this.f4317h, 0);
            this.f4312b.m2684a(this.f4313c, 0, this.f4314d);
            this.f4312b.m2686a();
            this.f4312b.m2685a(4, 0, this.f4316f * 6);
            this.f4312b.m2682b();
            this.f4316f = 0;
            this.f4314d = 0;
        }
    }

    /* renamed from: a */
    public void m2696a(float f, float f2, float f3, float f4, C0681c c0681c) {
        if (this.f4316f == this.f4315e) {
            m2697a();
        }
        m2695a(c0681c);
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f + f5;
        float f10 = f2 + f6;
        float[] fArr = this.f4313c;
        int i = this.f4314d;
        this.f4314d = i + 1;
        fArr[i] = f7;
        float[] fArr2 = this.f4313c;
        int i2 = this.f4314d;
        this.f4314d = i2 + 1;
        fArr2[i2] = f8;
        float[] fArr3 = this.f4313c;
        int i3 = this.f4314d;
        this.f4314d = i3 + 1;
        fArr3[i3] = c0681c.f4307d;
        float[] fArr4 = this.f4313c;
        int i4 = this.f4314d;
        this.f4314d = i4 + 1;
        fArr4[i4] = c0681c.f4310g;
        float[] fArr5 = this.f4313c;
        int i5 = this.f4314d;
        this.f4314d = i5 + 1;
        fArr5[i5] = f9;
        float[] fArr6 = this.f4313c;
        int i6 = this.f4314d;
        this.f4314d = i6 + 1;
        fArr6[i6] = f8;
        float[] fArr7 = this.f4313c;
        int i7 = this.f4314d;
        this.f4314d = i7 + 1;
        fArr7[i7] = c0681c.f4309f;
        float[] fArr8 = this.f4313c;
        int i8 = this.f4314d;
        this.f4314d = i8 + 1;
        fArr8[i8] = c0681c.f4310g;
        float[] fArr9 = this.f4313c;
        int i9 = this.f4314d;
        this.f4314d = i9 + 1;
        fArr9[i9] = f9;
        float[] fArr10 = this.f4313c;
        int i10 = this.f4314d;
        this.f4314d = i10 + 1;
        fArr10[i10] = f10;
        float[] fArr11 = this.f4313c;
        int i11 = this.f4314d;
        this.f4314d = i11 + 1;
        fArr11[i11] = c0681c.f4309f;
        float[] fArr12 = this.f4313c;
        int i12 = this.f4314d;
        this.f4314d = i12 + 1;
        fArr12[i12] = c0681c.f4308e;
        float[] fArr13 = this.f4313c;
        int i13 = this.f4314d;
        this.f4314d = i13 + 1;
        fArr13[i13] = f7;
        float[] fArr14 = this.f4313c;
        int i14 = this.f4314d;
        this.f4314d = i14 + 1;
        fArr14[i14] = f10;
        float[] fArr15 = this.f4313c;
        int i15 = this.f4314d;
        this.f4314d = i15 + 1;
        fArr15[i15] = c0681c.f4307d;
        float[] fArr16 = this.f4313c;
        int i16 = this.f4314d;
        this.f4314d = i16 + 1;
        fArr16[i16] = c0681c.f4308e;
        this.f4316f++;
    }
}
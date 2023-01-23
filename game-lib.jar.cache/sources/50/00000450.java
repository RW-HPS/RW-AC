package com.corrodinggames.rts.gameFramework.b.a;

import android.opengl.GLES20;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/d.class */
public class d {

    /* renamed from: a  reason: collision with root package name */
    b f422a;
    g b;
    float[] c;
    int e;
    private float[] h;
    private int i;
    int g;
    int d = 0;
    int f = 0;

    public d(int i, com.corrodinggames.rts.gameFramework.b.a.a.b bVar, b bVar2) {
        this.f422a = bVar2;
        this.c = new float[i * 4 * 5];
        this.b = new g(i * 4, i * 6);
        this.e = i;
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
        this.b.a(sArr, 0, length);
        this.i = GLES20.glGetUniformLocation(bVar.b(), "u_MVPMatrix");
    }

    public void a(float[] fArr) {
        this.f = 0;
        this.d = 0;
        this.h = fArr;
        this.g = -1;
    }

    void a(c cVar) {
        int i = cVar.b;
        if (this.g == i) {
            return;
        }
        a();
        GLES20.glBindTexture(3553, ((e) this.f422a.s.get(i)).f423a);
        this.g = i;
    }

    public void a() {
        if (this.f > 0) {
            GLES20.glUniformMatrix4fv(this.i, 1, false, this.h, 0);
            this.b.a(this.c, 0, this.d);
            this.b.a();
            this.b.a(4, 0, this.f * 6);
            this.b.b();
            this.f = 0;
            this.d = 0;
        }
    }

    public void a(float f, float f2, float f3, float f4, c cVar) {
        if (this.f == this.e) {
            a();
        }
        a(cVar);
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f + f5;
        float f10 = f2 + f6;
        float[] fArr = this.c;
        int i = this.d;
        this.d = i + 1;
        fArr[i] = f7;
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f8;
        float[] fArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        fArr3[i3] = cVar.d;
        float[] fArr4 = this.c;
        int i4 = this.d;
        this.d = i4 + 1;
        fArr4[i4] = cVar.g;
        float[] fArr5 = this.c;
        int i5 = this.d;
        this.d = i5 + 1;
        fArr5[i5] = f9;
        float[] fArr6 = this.c;
        int i6 = this.d;
        this.d = i6 + 1;
        fArr6[i6] = f8;
        float[] fArr7 = this.c;
        int i7 = this.d;
        this.d = i7 + 1;
        fArr7[i7] = cVar.f;
        float[] fArr8 = this.c;
        int i8 = this.d;
        this.d = i8 + 1;
        fArr8[i8] = cVar.g;
        float[] fArr9 = this.c;
        int i9 = this.d;
        this.d = i9 + 1;
        fArr9[i9] = f9;
        float[] fArr10 = this.c;
        int i10 = this.d;
        this.d = i10 + 1;
        fArr10[i10] = f10;
        float[] fArr11 = this.c;
        int i11 = this.d;
        this.d = i11 + 1;
        fArr11[i11] = cVar.f;
        float[] fArr12 = this.c;
        int i12 = this.d;
        this.d = i12 + 1;
        fArr12[i12] = cVar.e;
        float[] fArr13 = this.c;
        int i13 = this.d;
        this.d = i13 + 1;
        fArr13[i13] = f7;
        float[] fArr14 = this.c;
        int i14 = this.d;
        this.d = i14 + 1;
        fArr14[i14] = f10;
        float[] fArr15 = this.c;
        int i15 = this.d;
        this.d = i15 + 1;
        fArr15[i15] = cVar.d;
        float[] fArr16 = this.c;
        int i16 = this.d;
        this.d = i16 + 1;
        fArr16[i16] = cVar.e;
        this.f++;
    }
}
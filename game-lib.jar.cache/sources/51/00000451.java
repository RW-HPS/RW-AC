package com.corrodinggames.rts.gameFramework.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/e.class */
public class e {

    /* renamed from: a  reason: collision with root package name */
    int f423a;
    int b;
    Canvas c;
    public Bitmap d;
    int e;
    int f;
    int g = 0;
    int h = 0;
    int i = 0;
    int j;
    int k;
    int l;
    int m;
    int n;

    public boolean a() {
        return this.g < this.e * this.f;
    }

    public e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.l = i2;
        this.b = i;
        this.e = i / i3;
        this.f = i / i4;
        this.j = i3;
        this.k = i4;
        this.m = i5;
        this.n = i6;
    }

    public void b() {
        this.d = Bitmap.a(this.b, this.b, Bitmap.Config.ALPHA_8);
        this.c = new Canvas();
        this.c.a(this.d);
        this.d.a(0);
    }

    public void c() {
        if (this.d == null) {
            return;
        }
        if (this.f423a == 0) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.f423a = iArr[0];
            if (this.f423a == 0) {
                b.b("Failed to gen texture page");
                return;
            }
        }
        GLES20.glBindTexture(3553, this.f423a);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.d, 0);
    }

    public c a(char c, Paint paint) {
        if (this.c == null) {
            b();
        }
        int i = this.g / this.e;
        int i2 = (this.g % this.e) * this.j;
        int i3 = i * this.k;
        float ceil = (float) Math.ceil(Math.abs(paint.n().c));
        float[] fArr = new float[2];
        char[] cArr = {c};
        paint.a(cArr, 0, 1, fArr);
        float f = (int) fArr[0];
        if (f > this.j) {
            b.b("Warning chr is larger then cellWidth: " + c);
        }
        this.c.a(cArr, 0, 1, i2 + this.m, (int) (((i3 + this.k) - ceil) - this.n), paint);
        c cVar = new c();
        cVar.f421a = c;
        cVar.b = this.l;
        a(cVar, i2, i3, this.j, this.k);
        cVar.c = f;
        this.g++;
        return cVar;
    }

    private void a(c cVar, float f, float f2, float f3, float f4) {
        cVar.d = f / this.b;
        cVar.e = f2 / this.b;
        cVar.f = cVar.d + (f3 / this.b);
        cVar.g = cVar.e + (f4 / this.b);
    }
}
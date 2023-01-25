package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/e.class */
public class C0683e {

    /* renamed from: a */
    int f4320a;

    /* renamed from: b */
    int f4321b;

    /* renamed from: c */
    Canvas f4322c;

    /* renamed from: d */
    public Bitmap f4323d;

    /* renamed from: e */
    int f4324e;

    /* renamed from: f */
    int f4325f;

    /* renamed from: g */
    int f4326g = 0;

    /* renamed from: h */
    int f4327h = 0;

    /* renamed from: i */
    int f4328i = 0;

    /* renamed from: j */
    int f4329j;

    /* renamed from: k */
    int f4330k;

    /* renamed from: l */
    int f4331l;

    /* renamed from: m */
    int f4332m;

    /* renamed from: n */
    int f4333n;

    /* renamed from: a */
    public boolean m2693a() {
        return this.f4326g < this.f4324e * this.f4325f;
    }

    public C0683e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f4331l = i2;
        this.f4321b = i;
        this.f4324e = i / i3;
        this.f4325f = i / i4;
        this.f4329j = i3;
        this.f4330k = i4;
        this.f4332m = i5;
        this.f4333n = i6;
    }

    /* renamed from: b */
    public void m2690b() {
        this.f4323d = Bitmap.m5284a(this.f4321b, this.f4321b, Bitmap.Config.ALPHA_8);
        this.f4322c = new Canvas();
        this.f4322c.m5258a(this.f4323d);
        this.f4323d.m5288a(0);
    }

    /* renamed from: c */
    public void m2689c() {
        if (this.f4323d == null) {
            return;
        }
        if (this.f4320a == 0) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.f4320a = iArr[0];
            if (this.f4320a == 0) {
                C0680b.m2701b("Failed to gen texture page");
                return;
            }
        }
        GLES20.glBindTexture(3553, this.f4320a);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.f4323d, 0);
    }

    /* renamed from: a */
    public C0681c m2692a(char c, Paint paint) {
        if (this.f4322c == null) {
            m2690b();
        }
        int i = this.f4326g / this.f4324e;
        int i2 = (this.f4326g % this.f4324e) * this.f4329j;
        int i3 = i * this.f4330k;
        float ceil = (float) Math.ceil(Math.abs(paint.m5183n().f207c));
        float[] fArr = new float[2];
        char[] cArr = {c};
        paint.m5208a(cArr, 0, 1, fArr);
        float f = (int) fArr[0];
        if (f > this.f4329j) {
            C0680b.m2701b("Warning chr is larger then cellWidth: " + c);
        }
        this.f4322c.m5249a(cArr, 0, 1, i2 + this.f4332m, (int) (((i3 + this.f4330k) - ceil) - this.f4333n), paint);
        C0681c c0681c = new C0681c();
        c0681c.f4304a = c;
        c0681c.f4305b = this.f4331l;
        m2691a(c0681c, i2, i3, this.f4329j, this.f4330k);
        c0681c.f4306c = f;
        this.f4326g++;
        return c0681c;
    }

    /* renamed from: a */
    private void m2691a(C0681c c0681c, float f, float f2, float f3, float f4) {
        c0681c.f4307d = f / this.f4321b;
        c0681c.f4308e = f2 / this.f4321b;
        c0681c.f4309f = c0681c.f4307d + (f3 / this.f4321b);
        c0681c.f4310g = c0681c.f4308e + (f4 / this.f4321b);
    }
}
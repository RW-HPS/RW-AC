package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.unitAction.C0964ae;

/* renamed from: com.corrodinggames.rts.gameFramework.b.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/y.class */
public class C0723y {

    /* renamed from: a */
    C0686aa f4511a;

    /* renamed from: b */
    float[] f4512b;

    /* renamed from: c */
    int f4513c;

    /* renamed from: d */
    int f4514d;

    /* renamed from: e */
    int f4515e;

    /* renamed from: f */
    C0712n f4516f;

    /* renamed from: g */
    int f4517g;

    /* renamed from: h */
    C0701d f4518h;

    /* renamed from: i */
    final C0724z f4519i;

    /* renamed from: j */
    public C0724z f4520j;

    /* renamed from: k */
    AbstractC0699b f4521k;

    /* renamed from: l */
    C0964ae f4522l;

    /* renamed from: m */
    boolean f4523m;

    /* renamed from: n */
    int f4524n;

    /* renamed from: o */
    float f4525o;

    /* renamed from: p */
    float f4526p;

    /* renamed from: q */
    float f4527q;

    /* renamed from: r */
    float f4528r;

    /* renamed from: a */
    public void m2512a(C0964ae c0964ae) {
        this.f4515e = 0;
        this.f4513c = 0;
        this.f4521k = null;
        m2510b(c0964ae);
        m2516a();
        C0712n.m2539q();
        this.f4511a.m2676d();
    }

    /* renamed from: a */
    public void m2516a() {
        this.f4520j.f4532d.m2533a(this.f4516f.f4448d);
    }

    /* renamed from: b */
    public void m2511b() {
        this.f4523m = true;
    }

    /* renamed from: b */
    void m2510b(C0964ae c0964ae) {
        if (c0964ae != null) {
            this.f4516f.m2598a(c0964ae.f6577n);
            this.f4516f.m2555c(c0964ae);
            this.f4523m = false;
        } else {
            this.f4516f.m2598a(this.f4517g);
        }
        this.f4522l = c0964ae;
    }

    /* renamed from: a */
    void m2514a(AbstractC0699b abstractC0699b) {
        int m2645a;
        if (this.f4521k == abstractC0699b) {
            return;
        }
        if (this.f4521k != null && (m2645a = this.f4521k.m2645a()) == abstractC0699b.m2645a() && m2645a != -1) {
            return;
        }
        m2509c();
        GLES20.glActiveTexture(33984);
        C0712n.m2539q();
        abstractC0699b.mo2520c(this.f4516f);
        GLES20.glBindTexture(abstractC0699b.mo2519g(), abstractC0699b.m2645a());
        C0712n.m2539q();
        GLES20.glUniform1i(this.f4520j.f4533e.f4498a, 0);
        C0712n.m2539q();
        this.f4521k = abstractC0699b;
    }

    /* renamed from: c */
    public void m2509c() {
        if (this.f4515e > 0) {
            C0712n.m2539q();
            this.f4511a.m2679a(this.f4512b, 0, this.f4513c);
            this.f4511a.m2678b();
            C0712n.m2539q();
            this.f4511a.m2680a(4, 0, this.f4515e * 6);
            this.f4511a.m2677c();
            C0712n.m2539q();
            this.f4515e = 0;
            this.f4513c = 0;
        }
    }

    /* renamed from: d */
    public void m2508d() {
        m2509c();
        this.f4521k = null;
        this.f4511a.m2675e();
    }

    /* renamed from: a */
    public void m2515a(int i) {
        if (this.f4524n == i) {
            return;
        }
        this.f4524n = i;
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        this.f4525o = f2;
        this.f4526p = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f4527q = (i & 255) * 0.003921569f * f;
        this.f4528r = f;
    }

    /* renamed from: a */
    public void m2513a(AbstractC0699b abstractC0699b, RectF rectF, RectF rectF2, float[] fArr) {
        if (this.f4515e == this.f4514d) {
            m2509c();
        }
        m2514a(abstractC0699b);
        if (this.f4523m && this.f4522l != null) {
            this.f4516f.m2555c(this.f4522l);
            this.f4523m = false;
        }
        float f = rectF2.f234a;
        float f2 = rectF2.f237d;
        float f3 = rectF2.f236c;
        float f4 = rectF2.f235b;
        float f5 = rectF.f234a;
        float f6 = rectF.f235b;
        float f7 = rectF.f236c;
        float f8 = rectF.f237d;
        float f9 = this.f4525o;
        float f10 = this.f4526p;
        float f11 = this.f4527q;
        float f12 = this.f4528r;
        float f13 = fArr[0];
        float f14 = fArr[4];
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = f * f13;
        float f20 = f3 * f13;
        float f21 = f * f15;
        float f22 = f3 * f15;
        float f23 = f2 * f14;
        float f24 = f2 * f16;
        float f25 = f4 * f14;
        float f26 = f4 * f16;
        int i = this.f4513c;
        int i2 = i + 1;
        this.f4512b[i] = f19 + f23 + f17;
        int i3 = i2 + 1;
        this.f4512b[i2] = f21 + f24 + f18;
        int i4 = i3 + 1;
        this.f4512b[i3] = f5;
        int i5 = i4 + 1;
        this.f4512b[i4] = f8;
        int i6 = i5 + 1;
        this.f4512b[i5] = f9;
        int i7 = i6 + 1;
        this.f4512b[i6] = f10;
        int i8 = i7 + 1;
        this.f4512b[i7] = f11;
        int i9 = i8 + 1;
        this.f4512b[i8] = f12;
        int i10 = i9 + 1;
        this.f4512b[i9] = f20 + f23 + f17;
        int i11 = i10 + 1;
        this.f4512b[i10] = f22 + f24 + f18;
        int i12 = i11 + 1;
        this.f4512b[i11] = f7;
        int i13 = i12 + 1;
        this.f4512b[i12] = f8;
        int i14 = i13 + 1;
        this.f4512b[i13] = f9;
        int i15 = i14 + 1;
        this.f4512b[i14] = f10;
        int i16 = i15 + 1;
        this.f4512b[i15] = f11;
        int i17 = i16 + 1;
        this.f4512b[i16] = f12;
        int i18 = i17 + 1;
        this.f4512b[i17] = f20 + f25 + f17;
        int i19 = i18 + 1;
        this.f4512b[i18] = f22 + f26 + f18;
        int i20 = i19 + 1;
        this.f4512b[i19] = f7;
        int i21 = i20 + 1;
        this.f4512b[i20] = f6;
        int i22 = i21 + 1;
        this.f4512b[i21] = f9;
        int i23 = i22 + 1;
        this.f4512b[i22] = f10;
        int i24 = i23 + 1;
        this.f4512b[i23] = f11;
        int i25 = i24 + 1;
        this.f4512b[i24] = f12;
        int i26 = i25 + 1;
        this.f4512b[i25] = f19 + f25 + f17;
        int i27 = i26 + 1;
        this.f4512b[i26] = f21 + f26 + f18;
        int i28 = i27 + 1;
        this.f4512b[i27] = f5;
        int i29 = i28 + 1;
        this.f4512b[i28] = f6;
        int i30 = i29 + 1;
        this.f4512b[i29] = f9;
        int i31 = i30 + 1;
        this.f4512b[i30] = f10;
        int i32 = i31 + 1;
        this.f4512b[i31] = f11;
        this.f4512b[i32] = f12;
        this.f4513c = i32 + 1;
        this.f4515e++;
    }
}
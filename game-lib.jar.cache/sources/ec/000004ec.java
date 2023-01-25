package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.unitAction.AbstractC0978m;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;

/* renamed from: com.corrodinggames.rts.gameFramework.f.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/s.class */
public class C0838s extends AbstractC0978m {

    /* renamed from: a */
    float[] f5541a;

    /* renamed from: c */
    Paint f5542c;

    /* renamed from: d */
    int f5543d;

    /* renamed from: e */
    boolean f5544e;

    /* renamed from: b */
    int f5545b = 0;

    /* renamed from: f */
    private final RectF f5546f = new RectF();

    C0838s(int i, Paint paint) {
        this.f5543d = i;
        this.f5541a = new float[i * 2];
        this.f5542c = paint;
    }

    /* renamed from: a */
    public final void m1752a(float f, float f2) {
        this.f5541a[this.f5545b] = f;
        this.f5541a[this.f5545b + 1] = f2;
        this.f5545b += 2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.AbstractC0978m
    /* renamed from: a */
    public void mo875a(InterfaceC1063y interfaceC1063y) {
        if (!this.f5544e) {
            interfaceC1063y.mo171a(this.f5541a, 0, this.f5545b, this.f5542c);
        } else {
            RectF rectF = this.f5546f;
            float m5190g = this.f5542c.m5190g();
            for (int i = 0; i < this.f5545b; i++) {
                float f = this.f5541a[i];
                float f2 = this.f5541a[i + 1];
                rectF.f234a = f;
                rectF.f235b = f2;
                rectF.f236c = f + m5190g;
                rectF.f237d = f2 + m5190g;
                interfaceC1063y.mo206a(rectF, this.f5542c);
            }
        }
        C0833o.m1767a(this);
    }
}
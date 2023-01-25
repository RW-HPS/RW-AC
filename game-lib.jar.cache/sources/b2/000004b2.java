package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.unitAction.C0960aa;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/e.class */
public class C0780e extends C0784h {

    /* renamed from: a */
    int f5081a;

    /* renamed from: b */
    int f5082b;

    /* renamed from: c */
    float f5083c;

    /* renamed from: d */
    float f5084d;

    /* renamed from: e */
    public boolean f5085e = true;

    /* renamed from: f */
    public boolean f5086f = false;

    /* renamed from: g */
    public float f5087g = 1.0f;

    /* renamed from: h */
    static Rect f5088h = new Rect();

    /* renamed from: i */
    static Rect f5089i = new Rect();

    public C0780e() {
    }

    public C0780e(C0970e c0970e, int i, int i2) {
        mo2031a(c0970e);
        m2043a(c0970e, i, i2);
    }

    /* renamed from: a */
    public void m2043a(C0970e c0970e, int i, int i2) {
        this.f5081a = i;
        this.f5082b = i2;
        this.f5083c = i / c0970e.f6620p;
        this.f5084d = i2 / c0970e.f6621q;
    }

    /* renamed from: a */
    public C0780e clone() {
        C0780e c0780e = new C0780e();
        c0780e.mo2032a(this);
        return c0780e;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.C0784h
    /* renamed from: a */
    public void mo2032a(C0784h c0784h) {
        C0780e c0780e = (C0780e) c0784h;
        this.f5081a = c0780e.f5081a;
        this.f5082b = c0780e.f5082b;
        this.f5083c = c0780e.f5083c;
        this.f5084d = c0780e.f5084d;
        this.f5085e = c0780e.f5085e;
        super.mo2032a(c0780e);
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.C0784h
    /* renamed from: a */
    public void mo2031a(C0970e c0970e) {
        super.mo2031a(c0970e);
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.C0784h
    /* renamed from: a */
    public void mo2030a(InterfaceC1063y interfaceC1063y, Rect rect) {
        m2039b(interfaceC1063y, rect);
        if (this.f5105q != null) {
        }
    }

    /* renamed from: b */
    public void m2039b(InterfaceC1063y interfaceC1063y, Rect rect) {
        m2040a(interfaceC1063y, this.f5092p, this.f5104o, rect);
    }

    /* renamed from: c */
    private boolean m2038c() {
        return true;
    }

    /* renamed from: a */
    private void m2040a(InterfaceC1063y interfaceC1063y, C0970e c0970e, Paint paint, Rect rect) {
        int i = rect.f230a;
        int i2 = rect.f231b;
        int m5170b = rect.m5170b();
        int m5166c = rect.m5166c();
        int i3 = this.f5081a;
        int i4 = this.f5082b;
        if (!this.f5085e) {
            if (i3 > m5170b / 2) {
                i3 = m5170b / 2;
            }
            if (i4 > m5166c / 2) {
                i4 = m5166c / 2;
            }
        } else {
            float f = 1.0f;
            int i5 = m5170b / 2;
            int i6 = m5166c / 2;
            if (i3 * 1.0f > i5) {
                f = i5 / i3;
            }
            if (i4 * f > i6) {
                f = i6 / i4;
            }
            i3 = (int) (this.f5081a * f);
            i4 = (int) (this.f5082b * f);
        }
        int i7 = m5170b - (2 * i3);
        int i8 = m5166c - (2 * i4);
        float f2 = this.f5083c;
        float f3 = this.f5084d;
        if (m2038c()) {
            m2041a(interfaceC1063y, c0970e, paint, i + i3, i2 + 0, i7, i4, f2, 0.0f, 1.0f - f2, f3, this.f5086f);
            m2041a(interfaceC1063y, c0970e, paint, i + 0, i2 + i4, i3, i8, 0.0f, f3, f2, 1.0f - f3, this.f5086f);
            m2041a(interfaceC1063y, c0970e, paint, i + i3, (i2 + m5166c) - i4, i7, i4, f2, 1.0f - f3, 1.0f - f2, 1.0f, this.f5086f);
            m2041a(interfaceC1063y, c0970e, paint, (i + m5170b) - i3, i2 + i4, i3, i8, 1.0f - f2, f3, 1.0f, 1.0f - f3, this.f5086f);
            m2042a(interfaceC1063y, c0970e, paint, i + 0, i2 + 0, i3, i4, 0.0f, 0.0f, this.f5083c, this.f5084d);
            m2042a(interfaceC1063y, c0970e, paint, (i + m5170b) - i3, i2 + 0, i3, i4, 1.0f - this.f5083c, 0.0f, 1.0f, this.f5084d);
            m2042a(interfaceC1063y, c0970e, paint, i + 0, (i2 + m5166c) - i4, i3, i4, 0.0f, 1.0f - this.f5084d, this.f5083c, 1.0f);
            m2042a(interfaceC1063y, c0970e, paint, (i + m5170b) - i3, (i2 + m5166c) - i4, i3, i4, 1.0f - this.f5083c, 1.0f - this.f5084d, 1.0f, 1.0f);
        }
        m2041a(interfaceC1063y, c0970e, paint, i + i3, i2 + i4, i7, i8, f2, f3, 1.0f - f2, 1.0f - f3, this.f5086f);
    }

    /* renamed from: a */
    public void m2042a(InterfaceC1063y interfaceC1063y, C0970e c0970e, Paint paint, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        m2041a(interfaceC1063y, c0970e, paint, i, i2, i3, i4, f, f2, f3, f4, false);
    }

    /* renamed from: a */
    public void m2041a(InterfaceC1063y interfaceC1063y, C0970e c0970e, Paint paint, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, boolean z) {
        Rect rect = f5088h;
        Rect rect2 = f5089i;
        rect.m5172a((int) (f * c0970e.f6620p), (int) (f2 * c0970e.f6621q), (int) (f3 * c0970e.f6620p), (int) (f4 * c0970e.f6621q));
        rect2.m5172a(i, i2, i + i3, i2 + i4);
        if (!z) {
            interfaceC1063y.mo194a(c0970e, rect, rect2, paint);
        } else {
            C0960aa.m945a(interfaceC1063y, c0970e, rect, rect2, paint, 0, 0, 0, 0, this.f5087g);
        }
    }
}
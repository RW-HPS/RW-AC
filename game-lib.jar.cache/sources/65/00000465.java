package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.Map;

/* renamed from: com.corrodinggames.rts.gameFramework.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/f.class */
public class C0703f {

    /* renamed from: a */
    protected final InterfaceC0709k f4428a;

    /* renamed from: b */
    private Map f4429b;

    /* renamed from: c */
    private C0676a f4430c;

    /* renamed from: d */
    private C0705g f4431d;

    /* renamed from: e */
    private InterfaceC0691af f4432e;

    /* renamed from: a */
    public void m2620a(AbstractC0699b abstractC0699b) {
        this.f4428a.mo2556c(abstractC0699b);
    }

    /* renamed from: a */
    public void m2627a() {
        this.f4428a.mo2554d();
    }

    /* renamed from: b */
    public InterfaceC0709k m2617b() {
        return this.f4428a;
    }

    /* renamed from: a */
    public AbstractC0699b m2621a(Bitmap bitmap, C0970e c0970e, InterfaceC0691af interfaceC0691af) {
        this.f4432e = interfaceC0691af;
        AbstractC0699b m2622a = m2622a(bitmap, c0970e);
        if (interfaceC0691af instanceof C0707i) {
            m2622a = ((C0707i) interfaceC0691af).m2608a(m2622a, this.f4428a, new InterfaceC0708j() { // from class: com.corrodinggames.rts.gameFramework.b.f.1
                @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0708j
                /* renamed from: a */
                public void mo2607a(AbstractC0699b abstractC0699b, InterfaceC0691af interfaceC0691af2, boolean z) {
                    C0703f.this.f4428a.mo2584a(abstractC0699b, 0, 0, abstractC0699b.mo2638b(), abstractC0699b.mo2637c(), interfaceC0691af2, null);
                }
            });
        }
        return m2622a;
    }

    /* renamed from: a */
    public void m2623a(Bitmap bitmap) {
        AbstractC0699b abstractC0699b = (AbstractC0699b) this.f4429b.get(bitmap);
        if (abstractC0699b != null && (abstractC0699b instanceof AbstractC0693ah)) {
            ((AbstractC0693ah) abstractC0699b).m2667l();
        }
        m2617b().mo2588a(bitmap);
    }

    /* renamed from: a */
    public AbstractC0699b m2622a(Bitmap bitmap, C0970e c0970e) {
        C0702e c0702e = (AbstractC0699b) this.f4429b.get(bitmap);
        if (c0702e == null) {
            this.f4428a.mo2551e();
            m2616c();
            c0702e = new C0702e(bitmap);
            c0702e.mo2520c(m2617b());
            c0702e.f4423j = c0970e.m900d();
            C0712n.m2564b(c0702e.f4416e, c0702e.f4417f);
            this.f4429b.put(bitmap, c0702e);
            m2615d();
        }
        return c0702e;
    }

    /* renamed from: a */
    public void m2625a(float f, float f2, float f3, C0720v c0720v) {
        if (c0720v.m2524c() == Paint.Style.FILL) {
            this.f4431d.m2613a(0.5f);
        } else {
            float m2525b = c0720v.m2525b();
            if (m2525b == 0.0f) {
                m2525b = 1.0f;
            }
            this.f4431d.m2613a(m2525b / (2.0f * f3));
        }
        this.f4428a.mo2599a(f - f3, f2 - f3, f3, c0720v, this.f4431d);
    }

    /* renamed from: a */
    public void m2626a(float f, float f2, float f3, float f4, C0720v c0720v) {
        this.f4428a.mo2600a(f, f2, f3, f4, c0720v, this.f4430c);
    }

    /* renamed from: c */
    public void m2616c() {
        this.f4428a.mo2566b();
    }

    /* renamed from: d */
    public void m2615d() {
        this.f4428a.mo2558c();
    }

    /* renamed from: e */
    public void m2614e() {
        for (AbstractC0699b abstractC0699b : this.f4429b.values()) {
            abstractC0699b.mo2632j();
        }
        this.f4429b.clear();
    }

    protected void finalize() {
        super.finalize();
        m2614e();
    }

    /* renamed from: a */
    public void m2624a(int i, int i2, int i3, int i4) {
        this.f4428a.mo2594a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m2619a(String str, float f, float f2, Paint paint) {
        this.f4428a.mo2576a(str, f, f2, paint);
    }

    /* renamed from: a */
    public void m2618a(float[] fArr, int i, int i2, C0720v c0720v) {
        this.f4428a.mo2571a(fArr, i, i2, c0720v, this.f4430c);
    }
}
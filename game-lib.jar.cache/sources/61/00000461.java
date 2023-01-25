package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import android.util.Log;
import java.util.WeakHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/b.class */
public abstract class AbstractC0699b implements InterfaceC0687ab {

    /* renamed from: a */
    protected int f4412a;

    /* renamed from: b */
    protected int f4413b;

    /* renamed from: c */
    protected int f4414c;

    /* renamed from: d */
    protected int f4415d;

    /* renamed from: e */
    protected int f4416e;

    /* renamed from: f */
    protected int f4417f;

    /* renamed from: g */
    protected float f4418g;

    /* renamed from: h */
    protected float f4419h;

    /* renamed from: l */
    private boolean f4420l;

    /* renamed from: m */
    private boolean f4421m;

    /* renamed from: i */
    public int f4422i;

    /* renamed from: j */
    public boolean f4423j;

    /* renamed from: k */
    protected InterfaceC0709k f4424k;

    /* renamed from: n */
    private static WeakHashMap f4425n = new WeakHashMap();

    /* renamed from: o */
    private static ThreadLocal f4426o = new ThreadLocal();

    /* renamed from: b */
    public abstract void mo2521b(InterfaceC0709k interfaceC0709k);

    /* renamed from: c */
    protected abstract boolean mo2520c(InterfaceC0709k interfaceC0709k);

    /* renamed from: g */
    protected abstract int mo2519g();

    /* renamed from: b */
    public abstract void mo2522b(int i);

    /* renamed from: h */
    public abstract int mo2518h();

    protected AbstractC0699b(InterfaceC0709k interfaceC0709k, int i, int i2) {
        this.f4412a = -1;
        this.f4414c = -1;
        this.f4415d = -1;
        this.f4424k = null;
        m2640a(interfaceC0709k);
        this.f4412a = i;
        this.f4413b = i2;
        synchronized (f4425n) {
            f4425n.put(this, null);
        }
    }

    protected AbstractC0699b() {
        this(null, 0, 0);
    }

    /* renamed from: a */
    protected void m2640a(InterfaceC0709k interfaceC0709k) {
        this.f4424k = interfaceC0709k;
    }

    /* renamed from: a */
    public void m2643a(int i, int i2) {
        this.f4414c = i;
        this.f4415d = i2;
        this.f4416e = i > 0 ? m2644a(i) : 0;
        this.f4417f = i2 > 0 ? m2644a(i2) : 0;
        if (this.f4416e == 0) {
            this.f4418g = 0.0f;
        } else {
            this.f4418g = 1.0f / this.f4416e;
        }
        if (this.f4417f == 0) {
            this.f4419h = 0.0f;
        } else {
            this.f4419h = 1.0f / this.f4417f;
        }
        if (this.f4416e > 4096 || this.f4417f > 4096) {
            Log.m5075a("BasicTexture", String.format("secondBitmap is too large: %d x %d", Integer.valueOf(this.f4416e), Integer.valueOf(this.f4417f)), new Exception());
        }
    }

    /* renamed from: a */
    public static int m2644a(int i) {
        if (i <= 0 || i > 1073741824) {
            throw new IllegalArgumentException("n is invalid: " + i);
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 16);
        int i4 = i3 | (i3 >> 8);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 2);
        return (i6 | (i6 >> 1)) + 1;
    }

    /* renamed from: a */
    public int m2645a() {
        return this.f4412a;
    }

    /* renamed from: b */
    public int mo2638b() {
        return this.f4414c;
    }

    /* renamed from: c */
    public int mo2637c() {
        return this.f4415d;
    }

    /* renamed from: d */
    public int m2636d() {
        return this.f4416e;
    }

    /* renamed from: e */
    public int m2635e() {
        return this.f4417f;
    }

    /* renamed from: f */
    public boolean m2634f() {
        return this.f4420l;
    }

    /* renamed from: a */
    protected void m2639a(boolean z) {
        this.f4420l = z;
    }

    /* renamed from: i */
    public boolean m2633i() {
        return this.f4413b == 1;
    }

    /* renamed from: j */
    public void mo2632j() {
        this.f4421m = true;
        m2631k();
    }

    /* renamed from: k */
    private void m2631k() {
        InterfaceC0709k interfaceC0709k = this.f4424k;
        if (interfaceC0709k != null && this.f4412a != -1) {
            interfaceC0709k.mo2587a(this);
            this.f4412a = -1;
        }
        this.f4413b = 0;
        m2640a((InterfaceC0709k) null);
    }

    protected void finalize() {
        f4426o.set(AbstractC0699b.class);
        mo2632j();
        f4426o.set(null);
    }

    /* renamed from: a */
    public void mo2642a(RectF rectF) {
        int mo2638b = mo2638b();
        int mo2637c = mo2637c();
        int m2636d = m2636d();
        int m2635e = m2635e();
        rectF.f234a /= m2636d;
        rectF.f236c /= m2636d;
        rectF.f235b /= m2635e;
        rectF.f237d /= m2635e;
        float f = mo2638b / m2636d;
        if (rectF.f236c > f) {
            rectF.f236c = f;
        }
        float f2 = mo2637c / m2635e;
        if (rectF.f237d > f2) {
            rectF.f237d = f2;
        }
    }

    /* renamed from: a */
    public void mo2641a(RectF rectF, RectF rectF2) {
        float mo2637c = mo2637c() / m2635e();
        float mo2638b = mo2638b() / m2636d();
        if (rectF.f236c > mo2638b) {
            rectF2.f236c = rectF2.f234a + ((rectF2.m5153b() * (mo2638b - rectF.f234a)) / rectF.m5153b());
        }
        if (rectF.f237d > mo2637c) {
            rectF2.f237d = rectF2.f235b + ((rectF2.m5149c() * (mo2637c - rectF.f235b)) / rectF.m5149c());
        }
    }
}
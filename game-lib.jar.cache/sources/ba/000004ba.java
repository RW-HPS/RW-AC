package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/l.class */
public abstract class AbstractC0788l {

    /* renamed from: g */
    float f5115g;

    /* renamed from: h */
    float f5116h;

    /* renamed from: k */
    float f5117k;

    /* renamed from: l */
    float f5118l;

    /* renamed from: m */
    float f5119m;

    /* renamed from: n */
    float f5120n;

    /* renamed from: o */
    float f5121o;

    /* renamed from: p */
    float f5122p;

    /* renamed from: q */
    float f5123q;

    /* renamed from: r */
    float f5124r;

    /* renamed from: u */
    boolean f5125u;

    /* renamed from: v */
    AbstractC0788l f5126v;

    /* renamed from: y */
    float f5127y;

    /* renamed from: z */
    float f5128z;

    /* renamed from: B */
    AbstractC0787k f5129B;

    /* renamed from: e */
    static final PointF f5130e = new PointF();

    /* renamed from: f */
    static final RectF f5131f = new RectF();

    /* renamed from: A */
    static final PointF f5132A = new PointF();

    /* renamed from: i */
    float f5133i = 50.0f;

    /* renamed from: j */
    float f5134j = 50.0f;

    /* renamed from: s */
    boolean f5135s = false;

    /* renamed from: t */
    boolean f5136t = false;

    /* renamed from: w */
    C1136m f5137w = new C1136m();

    /* renamed from: x */
    EnumC0789m f5138x = EnumC0789m.vertical;

    /* renamed from: a */
    public String mo2021a() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    public InterfaceC1063y m2005d() {
        return GameEngine.getGameEngine().f6326bO;
    }

    /* renamed from: a */
    public RectF m2017a(RectF rectF, float f, float f2) {
        rectF.f234a = 0.0f + f;
        rectF.f235b = 0.0f + f2;
        rectF.f236c = 0.0f + this.f5133i + f;
        rectF.f237d = 0.0f + this.f5134j + f2;
        return rectF;
    }

    /* renamed from: a */
    public RectF m2018a(RectF rectF) {
        f5132A.x = this.f5115g;
        f5132A.y = this.f5116h;
        if (this.f5126v != null) {
            this.f5126v.m2019a(f5132A);
        }
        rectF.f234a = 0.0f + f5132A.x;
        rectF.f235b = 0.0f + f5132A.y;
        rectF.f236c = 0.0f + this.f5133i + f5132A.x;
        rectF.f237d = 0.0f + this.f5134j + f5132A.y;
        return rectF;
    }

    /* renamed from: b */
    public void mo2012b() {
        Iterator it = this.f5137w.iterator();
        while (it.hasNext()) {
            ((AbstractC0788l) it.next()).mo2012b();
        }
        this.f5127y = 0.0f;
        this.f5128z = 0.0f;
        if (this.f5138x != EnumC0789m.none) {
            if (this.f5138x == EnumC0789m.vertical) {
                float f = 0.0f;
                float f2 = 0.0f;
                Iterator it2 = this.f5137w.iterator();
                while (it2.hasNext()) {
                    AbstractC0788l abstractC0788l = (AbstractC0788l) it2.next();
                    if (abstractC0788l.f5133i > f) {
                        f = abstractC0788l.m1999g();
                    }
                    f2 += abstractC0788l.m1998h();
                }
                this.f5127y = f2;
                this.f5128z = f;
                m2010b(this.f5128z * 0.5f, this.f5127y * 0.5f, this.f5137w);
            } else if (this.f5138x == EnumC0789m.horizontal) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                Iterator it3 = this.f5137w.iterator();
                while (it3.hasNext()) {
                    AbstractC0788l abstractC0788l2 = (AbstractC0788l) it3.next();
                    if (abstractC0788l2.f5134j > f3) {
                        f3 = abstractC0788l2.m1998h();
                    }
                    f4 += abstractC0788l2.m1999g();
                }
                this.f5127y = f3;
                this.f5128z = f4;
                m2020a(this.f5128z * 0.5f, this.f5127y * 0.5f, this.f5137w);
            } else {
                throw new RuntimeException("Unknown layout style:" + this.f5138x);
            }
        }
        this.f5135s = false;
    }

    /* renamed from: a */
    public static void m2020a(float f, float f2, C1136m c1136m) {
        float f3 = 0.0f;
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0788l) it.next()).m1999g();
        }
        float f4 = f - (f3 * 0.5f);
        Iterator it2 = c1136m.iterator();
        while (it2.hasNext()) {
            AbstractC0788l abstractC0788l = (AbstractC0788l) it2.next();
            float f5 = f4 + abstractC0788l.f5123q;
            abstractC0788l.f5115g = f5;
            f4 = f5 + abstractC0788l.f5133i + abstractC0788l.f5124r;
            abstractC0788l.m2004d(f2);
        }
    }

    /* renamed from: b */
    public static void m2010b(float f, float f2, C1136m c1136m) {
        float f3 = 0.0f;
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0788l) it.next()).m1998h();
        }
        float f4 = f2 - (f3 * 0.5f);
        Iterator it2 = c1136m.iterator();
        while (it2.hasNext()) {
            AbstractC0788l abstractC0788l = (AbstractC0788l) it2.next();
            float f5 = f4 + abstractC0788l.f5121o;
            abstractC0788l.f5116h = f5;
            f4 = f5 + abstractC0788l.f5134j + abstractC0788l.f5122p;
            abstractC0788l.m2007c(f);
        }
    }

    /* renamed from: a */
    public void m2019a(PointF pointF) {
        if (this.f5126v != null) {
            this.f5126v.m2019a(pointF);
        }
        pointF.x += this.f5115g;
        pointF.y += this.f5116h;
    }

    /* renamed from: a */
    public void m2014a(AbstractC0788l abstractC0788l) {
        abstractC0788l.m2008b(this);
    }

    /* renamed from: b */
    public void m2008b(AbstractC0788l abstractC0788l) {
        m2013a(abstractC0788l, false);
    }

    /* renamed from: a */
    public void m2013a(AbstractC0788l abstractC0788l, boolean z) {
        if (this.f5126v == abstractC0788l) {
            return;
        }
        if (this.f5126v != null) {
            this.f5126v.f5137w.remove(this);
        }
        this.f5126v = abstractC0788l;
        if (abstractC0788l != null) {
            if (!z) {
                abstractC0788l.f5137w.add(this);
            } else {
                abstractC0788l.f5137w.add(0, this);
            }
        }
        m2003e();
    }

    /* renamed from: e */
    public void m2003e() {
        this.f5135s = true;
        if (this.f5126v != null) {
            this.f5126v.m2003e();
        }
    }

    /* renamed from: b */
    public void m2011b(float f) {
        if (this.f5137w.size() > 0) {
            Iterator it = this.f5137w.iterator();
            while (it.hasNext()) {
                ((AbstractC0788l) it.next()).m2011b(f);
            }
        }
    }

    /* renamed from: f */
    public void m2001f() {
        f5132A.x = this.f5115g;
        f5132A.y = this.f5116h;
        if (this.f5126v != null) {
            this.f5126v.m2019a(f5132A);
        }
        mo1996a(f5132A.x, f5132A.y);
        if (this.f5137w.size() > 0) {
            Iterator it = this.f5137w.iterator();
            while (it.hasNext()) {
                ((AbstractC0788l) it.next()).m2001f();
            }
        }
    }

    /* renamed from: a */
    public void mo1996a(float f, float f2) {
        if (this.f5136t) {
            C0784h.f5099m.m2028a(m2005d(), m2017a(new RectF(), f, f2));
        }
    }

    /* renamed from: a */
    public void m2015a(AbstractC0787k abstractC0787k) {
        this.f5129B = abstractC0787k;
    }

    /* renamed from: a */
    public boolean m2016a(C0778c c0778c) {
        if (c0778c.m2048a() && m2006c(c0778c)) {
            GameEngine.m5460e("UI click " + mo2021a());
            if (this.f5129B != null) {
                return this.f5129B.mo1430a(c0778c);
            }
            return false;
        } else if (c0778c.m2046b()) {
            if (m2006c(c0778c)) {
                this.f5125u = true;
                return false;
            }
            this.f5125u = false;
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m2009b(C0778c c0778c) {
        if (this.f5137w.size() > 0) {
            Iterator it = this.f5137w.iterator();
            while (it.hasNext()) {
                if (((AbstractC0788l) it.next()).m2009b(c0778c)) {
                    return true;
                }
            }
        }
        if (m2016a(c0778c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m2006c(C0778c c0778c) {
        m2018a(f5131f);
        return f5131f.m5152b(c0778c.f5072a, c0778c.f5073b);
    }

    /* renamed from: c */
    public void m2007c(float f) {
        this.f5115g = f - (this.f5133i * 0.5f);
    }

    /* renamed from: d */
    public void m2004d(float f) {
        this.f5116h = f - (this.f5134j * 0.5f);
    }

    /* renamed from: e */
    public void m2002e(float f) {
        this.f5121o = f;
        this.f5122p = f;
        this.f5123q = f;
        this.f5124r = f;
    }

    /* renamed from: f */
    public void m2000f(float f) {
        this.f5117k = f;
        this.f5118l = f;
        this.f5119m = f;
        this.f5120n = f;
    }

    /* renamed from: g */
    public float m1999g() {
        return this.f5123q + this.f5133i + this.f5124r;
    }

    /* renamed from: h */
    public float m1998h() {
        return this.f5121o + this.f5134j + this.f5122p;
    }

    /* renamed from: i */
    public void m1997i() {
        m2008b((AbstractC0788l) null);
    }
}
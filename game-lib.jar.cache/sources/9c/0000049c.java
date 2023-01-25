package com.corrodinggames.rts.gameFramework.p035d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0964ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/c.class */
public final class C0758c {

    /* renamed from: h */
    public static boolean f4764h;

    /* renamed from: i */
    public int f4765i;

    /* renamed from: j */
    public int f4766j;

    /* renamed from: k */
    public static C0964ae f4767k;

    /* renamed from: l */
    public C0970e f4768l;

    /* renamed from: m */
    public C0970e f4769m;

    /* renamed from: s */
    public static C0762g[] f4770s;

    /* renamed from: f */
    public static C0760e[] f4771f = new C0760e[0];

    /* renamed from: g */
    public static int f4772g = 0;

    /* renamed from: n */
    public static final RectF f4773n = new RectF();

    /* renamed from: o */
    public static final Rect f4774o = new Rect();

    /* renamed from: p */
    public static final Rect f4775p = new Rect();

    /* renamed from: q */
    public static final Paint f4776q = new Paint();

    /* renamed from: r */
    public static final Paint f4777r = new Paint();

    /* renamed from: a */
    public int f4778a = 0;

    /* renamed from: b */
    public int f4779b = 80;

    /* renamed from: c */
    public int f4780c = 100;

    /* renamed from: d */
    public int f4781d = 110;

    /* renamed from: e */
    public int f4782e = 120;

    /* renamed from: y */
    private boolean[] f4783y = new boolean[5];

    /* renamed from: t */
    EnumC0763h f4784t = null;

    /* renamed from: u */
    boolean f4785u = false;

    /* renamed from: v */
    boolean f4786v = false;

    /* renamed from: w */
    public final Paint f4787w = new Paint();

    /* renamed from: x */
    float f4788x = 0.0f;

    /* renamed from: a */
    public C0760e m2378a(EnumC0763h enumC0763h) {
        int i = 0;
        int mo1023b = GameEngine.getGameEngine().mo1023b();
        if (mo1023b < 13) {
            i = -this.f4766j;
        } else if (mo1023b < 28) {
            i = -this.f4765i;
        }
        int i2 = this.f4778a;
        if (enumC0763h == EnumC0763h.verylow && i2 > this.f4779b + i) {
            return null;
        }
        if (enumC0763h == EnumC0763h.low && i2 > this.f4780c + i) {
            return null;
        }
        if (enumC0763h == EnumC0763h.high && i2 > this.f4781d + i) {
            return null;
        }
        if (enumC0763h == EnumC0763h.veryhigh && i2 > this.f4782e + i) {
            return null;
        }
        C0760e m2373a = m2373a(true, (EnumC0763h) null);
        if (m2373a == null && (enumC0763h == EnumC0763h.critical || enumC0763h == EnumC0763h.veryhigh)) {
            m2373a = m2373a(false, EnumC0763h.high);
        }
        if (m2373a != null) {
            if (!m2373a.f4804o) {
                m2373a.f4804o = true;
                this.f4778a++;
            }
            return m2373a;
        }
        return null;
    }

    /* renamed from: a */
    private C0760e m2373a(boolean z, EnumC0763h enumC0763h) {
        C0760e[] c0760eArr = f4771f;
        int length = c0760eArr.length;
        if (z && enumC0763h == null) {
            for (int i = 0; i < length; i++) {
                C0760e c0760e = c0760eArr[i];
                if (!c0760e.f4804o) {
                    if (f4772g == i) {
                        f4772g++;
                    }
                    return c0760e;
                }
            }
            return null;
        }
        for (C0760e c0760e2 : c0760eArr) {
            if ((!z || !c0760e2.f4804o) && (enumC0763h == null || c0760e2.f4866q.m2339a(enumC0763h))) {
                return c0760e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2391a(float f, float f2, float f3) {
        m2389a(f, f2, f3, 0.0f, 20.0f);
    }

    /* renamed from: a */
    public void m2389a(float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 7; i++) {
            C0760e m2370b = m2370b(f + C0773f.m2151c(-20.0f, 20.0f), f2 + C0773f.m2151c(-20.0f, 20.0f), f3);
            if (m2370b != null) {
                m2370b.f4830U = f4 + C0773f.m2151c(0.0f, f5);
                m2370b.f4844aj = C0773f.m2151c(0.3f, 0.6f);
            }
        }
    }

    /* renamed from: a */
    public float m2392a(float f, float f2) {
        return C0773f.m2151c(f, f2);
    }

    /* renamed from: b */
    public C0760e m2370b(float f, float f2, float f3) {
        m2394a();
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4849aq = 1;
            m2365b.f4839ae = true;
            m2365b.f4845ak = 0.0f;
            m2365b.f4844aj = 0.5f;
            m2365b.f4841ag = 12;
            m2365b.f4848ap = 0;
            m2365b.f4831V = 35.0f;
            m2365b.f4832W = m2365b.f4831V - 10.0f;
            m2365b.f4806r = true;
            m2365b.f4814E = 0.7f;
            m2365b.f4833Y = m2392a(-180.0f, 180.0f);
            float m2392a = m2392a(0.8f, 1.0f);
            m2365b.f4816G = m2392a;
            m2365b.f4815F = m2392a;
        }
        return m2365b;
    }

    /* renamed from: c */
    public C0760e m2363c(float f, float f2, float f3) {
        m2394a();
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4849aq = 13;
            m2365b.f4839ae = true;
            m2365b.f4845ak = 3.0f;
            m2365b.f4844aj = 0.5f;
            m2365b.f4841ag = 7;
            m2365b.f4848ap = 0;
            m2365b.f4831V = 35.0f;
            m2365b.f4832W = m2365b.f4831V - 10.0f;
            m2365b.f4806r = true;
            m2365b.f4814E = 1.0f;
            m2365b.f4816G = 0.5f;
            m2365b.f4815F = 0.5f;
        }
        return m2365b;
    }

    /* renamed from: a */
    public C0760e m2388a(float f, float f2, float f3, float f4, float f5, float f6) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.f6323bL.m4662a(f, f2, gameEngine.f6312bs) && !gameEngine.f6323bL.m4662a(f4, f5, gameEngine.f6312bs)) {
            return null;
        }
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, true, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4871an = false;
            m2365b.f4831V = 5.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = true;
            m2365b.f4814E = 1.0f;
            m2365b.f4821L = true;
            m2365b.f4822M = f4;
            m2365b.f4823N = f5;
            m2365b.f4824O = f6;
        }
        return m2365b;
    }

    /* renamed from: a */
    public C0760e m2390a(float f, float f2, float f3, float f4) {
        return m2387a(f, f2, f3, f4, 0);
    }

    /* renamed from: a */
    public C0760e m2387a(float f, float f2, float f3, float f4, int i) {
        return m2386a(f, f2, f3, f4, i, 0);
    }

    /* renamed from: b */
    public C0760e m2367b(float f, float f2, float f3, float f4, int i) {
        return m2386a(f, f2, f3, f4, i, 1);
    }

    /* renamed from: a */
    public C0760e m2386a(float f, float f2, float f3, float f4, int i, int i2) {
        m2394a();
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4803g = C0760e.f4855j;
            m2365b.f4839ae = true;
            if (i2 == 1) {
                m2365b.f4849aq = 3;
                m2365b.f4845ak = 1.0f;
                m2365b.f4844aj = 0.4f;
                m2365b.f4841ag = 4;
            } else {
                m2365b.f4849aq = 3;
                m2365b.f4845ak = 0.0f;
                m2365b.f4844aj = 0.5f;
                m2365b.f4841ag = 3;
            }
            m2365b.f4833Y = f4;
            m2365b.f4848ap = 0;
            m2365b.f4831V = 20.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = false;
            if (i != 0) {
                m2365b.f4869B = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: c */
    public C0760e m2362c(float f, float f2, float f3, float f4, int i) {
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.verylow);
        if (m2365b != null) {
            m2365b.f4849aq = 4;
            m2365b.f4803g = C0760e.f4854i;
            m2365b.f4848ap = C0773f.rand(0, 2);
            m2365b.f4833Y = f4;
            m2365b.f4871an = true;
            m2365b.f4825P = C0773f.m2107k(f4) * 0.15f;
            m2365b.f4826Q = C0773f.m2110j(f4) * 0.15f;
            m2365b.f4831V = 30.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = true;
            m2365b.f4873ar = (short) 1;
            m2365b.f4816G = 0.8f;
            m2365b.f4815F = 2.3f;
            if (i != 0) {
                m2365b.f4869B = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: a */
    public static void m2379a(C0760e c0760e, AbstractC1155w abstractC1155w) {
        if (c0760e == null) {
            return;
        }
        c0760e.f4800b = abstractC1155w;
        c0760e.f4818I -= abstractC1155w.f7172eo;
        c0760e.f4819J -= abstractC1155w.f7173ep;
        c0760e.f4820K -= abstractC1155w.f7174eq;
    }

    /* renamed from: a */
    public C0760e m2377a(AbstractC1155w abstractC1155w, int i) {
        return m2376a(abstractC1155w, i, 0.5f);
    }

    /* renamed from: a */
    public C0760e m2376a(AbstractC1155w abstractC1155w, int i, float f) {
        m2372b();
        C0760e m2366b = m2366b(abstractC1155w.f7172eo, abstractC1155w.f7173ep, abstractC1155w.f7174eq, i);
        if (m2366b != null) {
            m2366b.f4818I = 0.0f;
            m2366b.f4819J = 0.0f;
            m2366b.f4820K = 0.0f;
            m2366b.f4831V = 400.0f;
            m2366b.f4832W = m2366b.f4831V;
            m2366b.f4814E = 0.3f;
            m2366b.f4816G = f;
            m2366b.f4800b = abstractC1155w;
        }
        return m2366b;
    }

    /* renamed from: a */
    public C0760e m2385a(float f, float f2, float f3, int i) {
        if (this.f4784t == null && !this.f4786v) {
            m2394a();
        }
        return m2366b(f, f2, f3, i);
    }

    /* renamed from: b */
    public C0760e m2366b(float f, float f2, float f3, int i) {
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, true, EnumC0763h.low);
        if (m2365b != null) {
            m2365b.f4864e = false;
            m2365b.f4803g = C0760e.f4853h;
            m2365b.f4849aq = 2;
            m2365b.f4831V = 10.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = true;
            m2365b.f4814E = 0.5f;
            m2365b.f4873ar = (short) 2;
            m2365b.f4802d = true;
            if (i != 0) {
                m2365b.f4811x = i;
                m2365b.f4869B = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: b */
    public C0760e m2369b(float f, float f2, float f3, float f4) {
        m2394a();
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.low);
        if (m2365b != null) {
            m2365b.f4803g = C0760e.f4857l;
            m2365b.f4849aq = 0;
            m2365b.f4848ap = 13;
            m2365b.f4873ar = (short) 1;
            m2365b.f4806r = true;
            m2365b.f4814E = 0.8f;
            m2365b.f4832W = 80.0f;
            m2365b.f4831V = m2365b.f4832W;
            m2365b.f4833Y = C0773f.m2151c(-180.0f, 180.0f);
            m2365b.f4816G = C0773f.m2151c(0.6f, 0.8f);
            m2365b.f4815F = 1.5f;
            m2365b.f4825P = (C0773f.m2107k(f4) * 0.13f * C0773f.m2151c(1.0f, 1.5f)) + C0773f.m2151c(-0.01f, 0.01f);
            m2365b.f4826Q = (C0773f.m2110j(f4) * 0.13f * C0773f.m2151c(1.0f, 1.5f)) + C0773f.m2151c(-0.01f, 0.01f);
        }
        return m2365b;
    }

    /* renamed from: a */
    public C0760e m2384a(float f, float f2, float f3, int i, float f4, float f5) {
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4803g = C0760e.f4857l;
            m2365b.f4849aq = 6;
            m2365b.f4831V = 120.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = true;
            m2365b.f4816G = 0.2f;
            m2365b.f4815F = 0.9f;
            m2365b.f4873ar = (short) 1;
            m2365b.f4814E = 0.5f;
            m2365b.f4825P = f4;
            m2365b.f4826Q = f5;
            if (i != 0) {
                i = Color.m5243a(255, 0, 0, 200);
            }
            if (i != 0) {
                m2365b.f4869B = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: a */
    public void m2383a(float f, float f2, float f3, int i, float f4, float f5, float f6) {
        m2384a(f, f2, 0.0f, 0, 0.0f, 0.0f);
        for (int i2 = -180; i2 < 180; i2 += 45) {
            float f7 = f6 + i2;
            C0760e m2369b = m2369b(f + (C0773f.m2107k(f7) * (-5.0f)), f2 + (C0773f.m2110j(f7) * (-5.0f)), 0.0f, f7);
            if (m2369b != null) {
                m2369b.f4873ar = (short) 2;
                m2369b.f4807s = true;
                m2369b.f4808t = 7.0f;
            }
        }
    }

    /* renamed from: c */
    public C0760e m2361c(float f, float f2, float f3, int i) {
        C0760e m2359d = m2359d(f, f2, f3, i);
        if (m2359d != null) {
            m2359d.f4849aq = 11;
        }
        return m2359d;
    }

    /* renamed from: d */
    public C0760e m2359d(float f, float f2, float f3, int i) {
        m2394a();
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4849aq = 6;
            m2365b.f4831V = 30.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = true;
            m2365b.f4816G = 0.2f;
            m2365b.f4815F = 1.3f;
            m2365b.f4873ar = (short) 1;
            if (i != 0) {
                m2365b.f4869B = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: d */
    public C0760e m2360d(float f, float f2, float f3) {
        C0760e m2368b = m2368b(f, f2, f3, 0.3f, 0.7f);
        if (m2368b != null) {
            m2368b.f4849aq = 14;
            m2368b.f4848ap = C0773f.rand(0, 5);
            m2368b.f4867w = 0.5f;
        }
        return m2368b;
    }

    /* renamed from: e */
    public C0760e m2358e(float f, float f2, float f3) {
        C0760e m2368b = m2368b(f, f2, f3, 1.0f, 1.0f);
        if (m2368b != null) {
        }
        return m2368b;
    }

    /* renamed from: b */
    public C0760e m2368b(float f, float f2, float f3, float f4, float f5) {
        m2372b();
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
        if (m2365b != null) {
            m2365b.f4803g = C0760e.f4858m;
            m2365b.f4849aq = 12;
            m2365b.f4848ap = C0773f.rand(0, 7);
            m2365b.f4831V = C0773f.m2151c(400.0f, 800.0f);
            m2365b.f4832W = m2365b.f4831V - 150.0f;
            m2365b.f4806r = true;
            float m2151c = C0773f.m2151c(0.6f, 1.0f);
            m2365b.f4816G = m2151c;
            m2365b.f4815F = m2151c;
            m2365b.f4873ar = (short) 2;
            m2365b.f4810v = true;
            m2365b.f4874as = true;
            float m2151c2 = C0773f.m2151c(-180.0f, 180.0f);
            float m2151c3 = C0773f.m2151c(0.4f, 1.2f) * f4;
            m2365b.f4825P = C0773f.m2107k(m2151c2) * m2151c3;
            m2365b.f4826Q = C0773f.m2110j(m2151c2) * m2151c3;
            m2365b.f4827R = C0773f.m2151c(0.6f, 2.7f) * f5;
            m2365b.f4833Y = C0773f.m2151c(-180.0f, 180.0f);
            m2365b.f4820K += 1.0f;
        }
        return m2365b;
    }

    /* renamed from: f */
    public C0760e m2357f(float f, float f2, float f3) {
        C0760e m2365b = m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.low);
        if (m2365b != null) {
            m2365b.f4849aq = 8;
            m2365b.f4831V = 480.0f;
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4806r = false;
            m2365b.f4873ar = (short) 1;
            m2365b.f4839ae = true;
            m2365b.f4845ak = 0.0f;
            m2365b.f4816G = 0.5f;
            m2365b.f4816G = 1.0f;
            int rand = C0773f.rand(0, 100);
            if (rand > 80) {
                m2365b.f4844aj = C0773f.m2151c(0.1f, 0.15f);
                m2365b.f4841ag = 15;
            } else if (rand > 60) {
                m2365b.f4844aj = C0773f.m2151c(0.06f, 0.16f);
                m2365b.f4842ah = true;
                m2365b.f4841ag = 6;
                m2365b.f4806r = true;
            } else {
                m2365b.f4844aj = C0773f.m2151c(0.06f, 0.16f);
                m2365b.f4842ah = true;
                m2365b.f4841ag = 3;
                m2365b.f4806r = true;
            }
        }
        return m2365b;
    }

    /* renamed from: b */
    public void m2364b(EnumC0763h enumC0763h) {
        this.f4784t = enumC0763h;
    }

    /* renamed from: a */
    public void m2394a() {
        this.f4785u = true;
    }

    /* renamed from: b */
    public void m2372b() {
        this.f4786v = true;
    }

    /* renamed from: a */
    public C0760e m2382a(float f, float f2, float f3, EnumC0759d enumC0759d, boolean z, EnumC0763h enumC0763h) {
        C0760e m2365b = m2365b(f, f2, f3, enumC0759d, z, enumC0763h);
        if (m2365b != null) {
            m2365b.f4805p = true;
        }
        return m2365b;
    }

    /* renamed from: b */
    public C0760e m2365b(float f, float f2, float f3, EnumC0759d enumC0759d, boolean z, EnumC0763h enumC0763h) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f4784t != null) {
            enumC0763h = this.f4784t;
            this.f4784t = null;
        }
        boolean z2 = this.f4786v;
        this.f4786v = false;
        if (this.f4785u) {
            this.f4785u = false;
            if (!gameEngine.f6466cP.m5152b(f, f2)) {
                return null;
            }
        }
        if (!z && gameEngine.f6323bL != null && !gameEngine.f6323bL.m4662a(f, f2, gameEngine.f6312bs)) {
            return null;
        }
        if (gameEngine.f6465cO.m5152b(f, f2)) {
            if (enumC0763h == EnumC0763h.verylow) {
                enumC0763h = EnumC0763h.low;
            } else if (enumC0763h == EnumC0763h.low) {
                enumC0763h = EnumC0763h.high;
            } else if (enumC0763h == EnumC0763h.high) {
                enumC0763h = EnumC0763h.veryhigh;
            }
        } else if (z2 || gameEngine.f6466cP.m5152b(f, f2)) {
        }
        C0760e m2378a = m2378a(enumC0763h);
        if (m2378a == null) {
            return null;
        }
        m2378a.m2349c();
        m2378a.f4866q = enumC0763h;
        m2378a.f4849aq = 0;
        m2378a.f4871an = true;
        m2378a.f4818I = f;
        m2378a.f4819J = f2;
        m2378a.f4820K = f3;
        m2378a.f4814E = 1.0f;
        if (enumC0759d == EnumC0759d.hitGround || enumC0759d == EnumC0759d.playerLand || enumC0759d == EnumC0759d.playerJump) {
            m2378a.f4848ap = 7;
            m2378a.f4831V = 12.0f;
            m2378a.f4806r = true;
            m2378a.f4826Q = -0.3f;
            m2378a.f4814E = 0.7f;
            if (enumC0759d == EnumC0759d.playerJump) {
                m2378a.f4848ap = 3;
                m2378a.f4826Q = -0.7f;
                m2378a.f4831V = 24.0f;
                m2378a.f4814E = 0.7f;
            }
            if (enumC0759d == EnumC0759d.playerLand) {
                m2378a.f4848ap = 4;
                m2378a.f4831V = 15.0f;
                m2378a.f4814E = 0.4f;
            }
        }
        if (enumC0759d == EnumC0759d.teleport) {
            m2378a.f4848ap = 1;
            m2378a.f4831V = 25.0f;
            m2378a.f4806r = true;
        }
        if (enumC0759d == EnumC0759d.gemCollect) {
            m2378a.f4848ap = 5;
            m2378a.f4831V = 42.0f;
            m2378a.f4806r = true;
            m2378a.f4826Q = 0.1f;
            m2378a.f4814E = 2.0f;
        }
        if (enumC0759d == EnumC0759d.keyDoorOpen) {
            m2378a.f4848ap = 6;
            m2378a.f4831V = 39.0f;
            m2378a.f4806r = true;
            m2378a.f4826Q = 0.1f;
            m2378a.f4814E = 2.0f;
        }
        if (enumC0759d == EnumC0759d.blood) {
            m2378a.f4848ap = 14;
            m2378a.f4831V = 39.0f;
            m2378a.f4806r = true;
            m2378a.f4826Q = 0.1f;
            m2378a.f4814E = 0.7f;
        }
        m2378a.f4832W = m2378a.f4831V;
        return m2378a;
    }

    /* renamed from: a */
    public void m2380a(Context context) {
        int i;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f4787w.m5228a(130, 200, 0, 0);
        this.f4787w.mo914a(true);
        this.f4787w.m5231a(2.0f);
        this.f4787w.m5223a(Paint.Cap.f201b);
        if (GameEngine.f6420aW) {
            this.f4787w.m5231a(3.0f);
        }
        f4770s = new C0762g[20];
        C0762g c0762g = new C0762g();
        c0762g.f4901b = 25;
        c0762g.f4902c = 25;
        c0762g.f4903d = 1;
        c0762g.f4904e = 1;
        c0762g.f4905f = 26;
        c0762g.f4906g = 26;
        c0762g.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.effects, true);
        c0762g.f4900a = "effects";
        c0762g.m2341a();
        f4770s[0] = c0762g;
        C0762g c0762g2 = new C0762g();
        c0762g2.f4901b = 39;
        c0762g2.f4902c = 40;
        c0762g2.f4903d = 1;
        c0762g2.f4904e = 1;
        c0762g2.f4905f = 40;
        c0762g2.f4906g = 41;
        c0762g2.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.explode_big, true);
        c0762g2.f4900a = "explode_big";
        f4770s[1] = c0762g2;
        C0762g c0762g3 = new C0762g();
        c0762g3.f4910k = true;
        c0762g3.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.light_50, true);
        c0762g3.f4900a = "light_50";
        f4770s[2] = c0762g3;
        C0762g c0762g4 = new C0762g();
        c0762g4.f4901b = 20;
        c0762g4.f4902c = 25;
        c0762g4.f4903d = 0;
        c0762g4.f4904e = 0;
        c0762g4.f4905f = 20;
        c0762g4.f4906g = 25;
        c0762g4.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.flame, true);
        c0762g4.f4900a = "flame";
        f4770s[3] = c0762g4;
        C0762g c0762g5 = new C0762g();
        c0762g5.f4901b = 20;
        c0762g5.f4902c = 25;
        c0762g5.f4903d = 0;
        c0762g5.f4904e = 0;
        c0762g5.f4905f = c0762g5.f4901b;
        c0762g5.f4906g = c0762g5.f4902c;
        c0762g5.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.dust, true);
        c0762g5.f4900a = "dust";
        f4770s[4] = c0762g5;
        C0762g c0762g6 = new C0762g();
        c0762g6.f4901b = 50;
        c0762g6.f4902c = 40;
        c0762g6.f4903d = 0;
        c0762g6.f4904e = 0;
        c0762g6.f4905f = c0762g6.f4901b;
        c0762g6.f4906g = c0762g6.f4902c;
        c0762g6.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.smoke_black, true);
        c0762g6.f4900a = "smoke_black";
        c0762g6.m2341a();
        f4770s[5] = c0762g6;
        C0762g c0762g7 = new C0762g();
        c0762g7.f4901b = 50;
        c0762g7.f4902c = 50;
        c0762g7.f4903d = 0;
        c0762g7.f4904e = 0;
        c0762g7.f4905f = c0762g7.f4901b;
        c0762g7.f4906g = c0762g7.f4902c;
        c0762g7.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.shockwave, true);
        c0762g7.f4900a = "shockwave";
        f4770s[6] = c0762g7;
        C0762g c0762g8 = new C0762g();
        c0762g8.f4901b = 20;
        c0762g8.f4902c = 20;
        c0762g8.f4903d = 0;
        c0762g8.f4904e = 0;
        c0762g8.f4905f = c0762g8.f4901b;
        c0762g8.f4906g = c0762g8.f4902c;
        c0762g8.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.fire, true);
        c0762g8.f4900a = "fire";
        f4770s[7] = c0762g8;
        C0762g c0762g9 = new C0762g();
        c0762g9.f4901b = 20;
        c0762g9.f4902c = 30;
        c0762g9.f4905f = c0762g9.f4901b + 2;
        c0762g9.f4906g = c0762g9.f4902c;
        c0762g9.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.lava_bubble, true);
        c0762g9.f4900a = "lava_bubble";
        f4770s[8] = c0762g9;
        C0762g c0762g10 = new C0762g();
        c0762g10.f4901b = 28;
        c0762g10.f4902c = 28;
        c0762g10.f4903d = 0;
        c0762g10.f4904e = 0;
        c0762g10.f4905f = c0762g10.f4901b + 1;
        c0762g10.f4906g = c0762g10.f4902c + 1;
        c0762g10.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.effects2, true);
        c0762g10.f4900a = "effects2";
        f4770s[9] = c0762g10;
        C0762g c0762g11 = new C0762g();
        c0762g11.f4901b = 20;
        c0762g11.f4902c = 25;
        c0762g11.f4903d = 0;
        c0762g11.f4904e = 0;
        c0762g11.f4905f = 20;
        c0762g11.f4906g = 25;
        c0762g11.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.plasma_shot, true);
        c0762g11.f4900a = "plasma_shot";
        f4770s[10] = c0762g11;
        C0762g c0762g12 = new C0762g();
        c0762g12.f4901b = 104;
        c0762g12.f4902c = 104;
        c0762g12.f4903d = 0;
        c0762g12.f4904e = 0;
        c0762g12.f4905f = c0762g12.f4901b;
        c0762g12.f4906g = c0762g12.f4902c;
        c0762g12.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.shockwave_large, true);
        c0762g12.f4900a = "shockwave_large";
        f4770s[11] = c0762g12;
        C0762g c0762g13 = new C0762g();
        c0762g13.f4901b = 20;
        c0762g13.f4902c = 20;
        c0762g13.f4903d = 0;
        c0762g13.f4904e = 0;
        c0762g13.f4905f = c0762g13.f4901b;
        c0762g13.f4906g = c0762g13.f4902c;
        c0762g13.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.explode_bits, true);
        c0762g13.f4900a = "explode_bits";
        c0762g13.m2341a();
        f4770s[12] = c0762g13;
        C0762g c0762g14 = new C0762g();
        c0762g14.f4901b = 39;
        c0762g14.f4902c = 40;
        c0762g14.f4903d = 1;
        c0762g14.f4904e = 1;
        c0762g14.f4905f = 40;
        c0762g14.f4906g = 41;
        c0762g14.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.explode_big2, true);
        c0762g14.f4900a = "explode_big2";
        f4770s[13] = c0762g14;
        C0762g c0762g15 = new C0762g();
        c0762g15.f4901b = 20;
        c0762g15.f4902c = 20;
        c0762g15.f4903d = 0;
        c0762g15.f4904e = 0;
        c0762g15.f4905f = c0762g15.f4901b;
        c0762g15.f4906g = c0762g15.f4902c;
        c0762g15.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.explode_bits_bug, true);
        c0762g15.f4900a = "explode_bits_bug";
        c0762g15.m2341a();
        f4770s[14] = c0762g15;
        C0762g c0762g16 = new C0762g();
        c0762g16.f4901b = 20;
        c0762g16.f4902c = 20;
        c0762g16.f4903d = 0;
        c0762g16.f4904e = 0;
        c0762g16.f4905f = c0762g16.f4901b;
        c0762g16.f4906g = c0762g16.f4902c;
        c0762g16.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.projectiles, true);
        c0762g16.f4900a = "projectiles";
        c0762g16.m2341a();
        f4770s[15] = c0762g16;
        C0762g c0762g17 = new C0762g();
        c0762g17.f4901b = 20;
        c0762g17.f4902c = 20;
        c0762g17.f4903d = 0;
        c0762g17.f4904e = 0;
        c0762g17.f4905f = c0762g17.f4901b;
        c0762g17.f4906g = c0762g17.f4902c;
        c0762g17.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.projectiles2, true);
        c0762g17.f4900a = "projectiles2";
        c0762g17.m2341a();
        f4770s[16] = c0762g17;
        C0762g c0762g18 = new C0762g();
        c0762g18.f4901b = 30;
        c0762g18.f4902c = 30;
        c0762g18.f4903d = 0;
        c0762g18.f4904e = 0;
        c0762g18.f4905f = c0762g18.f4901b + 1;
        c0762g18.f4906g = c0762g18.f4902c + 1;
        c0762g18.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.effects3, true);
        c0762g18.f4900a = "effects3";
        f4770s[17] = c0762g18;
        C0762g c0762g19 = new C0762g();
        c0762g19.f4901b = 50;
        c0762g19.f4902c = 40;
        c0762g19.f4903d = 0;
        c0762g19.f4904e = 0;
        c0762g19.f4905f = c0762g19.f4901b;
        c0762g19.f4906g = c0762g19.f4902c;
        c0762g19.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.smoke_white, true);
        c0762g19.f4900a = "smoke_white";
        c0762g19.m2341a();
        f4770s[18] = c0762g19;
        C0762g c0762g20 = new C0762g();
        c0762g20.f4901b = 56;
        c0762g20.f4902c = 56;
        c0762g20.f4903d = 0;
        c0762g20.f4904e = 0;
        c0762g20.f4905f = c0762g20.f4901b;
        c0762g20.f4906g = c0762g20.f4902c;
        c0762g20.f4908i = gameEngine.f6326bO.mo216a(C0067R.drawable.shockwave2, true);
        c0762g20.f4900a = "shockwave2";
        c0762g20.m2341a();
        f4770s[19] = c0762g20;
        if (GameEngine.m1028av()) {
            i = 500;
            this.f4765i = 90;
            this.f4766j = 210;
        } else {
            i = 350;
            this.f4765i = 90;
            this.f4766j = 170;
        }
        f4771f = new C0760e[i];
        this.f4779b = i - 60;
        this.f4780c = i - 30;
        this.f4781d = i - 20;
        this.f4782e = i - 10;
        for (int i2 = 0; i2 < f4771f.length; i2++) {
            f4771f[i2] = new C0760e(this);
        }
    }

    /* renamed from: a */
    public int m2375a(String str) {
        for (int i = 0; i < f4770s.length; i++) {
            if (f4770s[i] != null) {
                if (f4770s[i].f4900a != null && f4770s[i].f4900a.equalsIgnoreCase(str)) {
                    return i;
                }
                if ((VariableScope.nullOrMissingString + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m2393a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0760e[] c0760eArr = f4771f;
        for (int i = 0; i < f4772g; i++) {
            C0760e c0760e = c0760eArr[i];
            if (c0760e.f4804o && !c0760e.f4805p) {
                c0760e.m2350b(f);
            }
        }
        if (f4764h) {
            while (f4772g > 0 && !c0760eArr[f4772g - 1].f4804o) {
                f4772g--;
            }
        }
        this.f4788x += f;
        if (this.f4788x > 10.0f) {
            this.f4788x = 0.0f;
            gameEngine.f6323bL.m4664a(gameEngine.f6355cu + C0773f.rand(0, (int) gameEngine.f6361cA), gameEngine.f6356cv + C0773f.rand(0, (int) gameEngine.f6362cB));
            int i2 = gameEngine.f6323bL.f802T;
            int i3 = gameEngine.f6323bL.f803U;
            C0180g m4615d = gameEngine.f6323bL.m4615d(i2, i3);
            if (m4615d != null && m4615d.f921g && !m4615d.f922h) {
                gameEngine.f6323bL.m4660a(i2, i3);
                m2357f(gameEngine.f6323bL.f802T + 10, (gameEngine.f6323bL.f803U - 10) + 10, 0.0f);
            }
        }
    }

    /* renamed from: b */
    public int m2371b(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        for (int i2 = 0; i2 < this.f4783y.length; i2++) {
            this.f4783y[i2] = false;
        }
        for (int i3 = 0; i3 < f4772g; i3++) {
            C0760e c0760e = f4771f[i3];
            if (c0760e.f4804o) {
                if (!this.f4783y[c0760e.f4873ar]) {
                    this.f4783y[c0760e.f4873ar] = true;
                }
                if (c0760e.f4805p) {
                    c0760e.m2350b(f);
                }
                if (c0760e.f4874as && c0760e.m2352a(gameEngine, true)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m2381a(float f, int i) {
        if (!this.f4783y[i]) {
            return 0;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i2 = 0;
        C0760e[] c0760eArr = f4771f;
        for (int i3 = 0; i3 < f4772g; i3++) {
            C0760e c0760e = c0760eArr[i3];
            if (c0760e.f4804o && c0760e.f4873ar == i && c0760e.m2352a(gameEngine, false)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m2374a(boolean z) {
        if (z) {
            return;
        }
        for (int i = 0; i < f4771f.length; i++) {
            C0760e c0760e = f4771f[i];
            if (c0760e.f4804o) {
                c0760e.f4804o = false;
                this.f4778a--;
            }
        }
        if (this.f4778a != 0) {
            GameEngine.m1066a("EffectEngine::removeAll: effectListActiveSize == " + this.f4778a);
        }
        f4772g = 0;
    }
}
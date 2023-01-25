package com.corrodinggames.rts.gameFramework.p035d;

import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/f.class */
public class C0761f extends AbstractC1155w {

    /* renamed from: a */
    public float f4876a;

    /* renamed from: c */
    float f4878c;

    /* renamed from: d */
    float f4879d;

    /* renamed from: e */
    float f4880e;

    /* renamed from: f */
    float f4881f;

    /* renamed from: g */
    float f4882g;

    /* renamed from: h */
    float f4883h;

    /* renamed from: i */
    C0760e f4884i;

    /* renamed from: m */
    float f4888m;

    /* renamed from: n */
    float f4889n;

    /* renamed from: o */
    float f4890o;

    /* renamed from: p */
    float f4891p;

    /* renamed from: q */
    float f4892q;

    /* renamed from: r */
    float f4893r;

    /* renamed from: s */
    EnumC0763h f4894s;

    /* renamed from: t */
    public float f4895t;

    /* renamed from: v */
    static C0760e f4897v;

    /* renamed from: w */
    static C0760e f4898w;

    /* renamed from: x */
    private final C0758c f4899x;

    /* renamed from: b */
    public boolean f4877b = true;

    /* renamed from: j */
    public int f4885j = 0;

    /* renamed from: k */
    public int f4886k = 0;

    /* renamed from: l */
    public int f4887l = -1;

    /* renamed from: u */
    public boolean f4896u = false;

    /* renamed from: b */
    public static void m2345b() {
        C0758c c0758c = GameEngine.getGameEngine().f6377bR;
        C0760e c0760e = new C0760e(c0758c);
        m2346a(c0760e, false);
        c0760e.f4868aq = 18;
        c0760e.f4819t = 15.0f;
        f4897v = c0760e;
        C0760e c0760e2 = new C0760e(c0758c);
        m2343b(c0760e2, false);
        f4898w = c0760e2;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f7173eo);
        gameOutputStream.writeFloat(this.f7174ep);
        gameOutputStream.writeFloat(this.f4876a);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f7173eo = gameInputStream.readFloat();
        this.f7174ep = gameInputStream.readFloat();
        this.f4876a = gameInputStream.readFloat();
        this.f4877b = false;
        super.mo441a(gameInputStream);
    }

    public C0761f(C0758c c0758c) {
        this.f4899x = c0758c;
    }

    /* renamed from: a */
    public static void m2346a(C0760e c0760e, boolean z) {
        c0760e.m2349c();
        c0760e.f4868aq = 5;
        if (z) {
            c0760e.f4867ap = C0773f.rand(0, 1);
        } else {
            c0760e.f4867ap = 0;
        }
        c0760e.f4850Y = 0.0f;
        c0760e.f4865an = true;
        c0760e.f4841P = 0.1f;
        c0760e.f4843R = 0.5f;
        c0760e.f4820u = true;
        c0760e.f4847V = 300.0f;
        c0760e.f4848W = c0760e.f4847V;
        c0760e.f4817r = true;
        c0760e.f4818s = true;
        c0760e.f4819t = 40.0f;
        c0760e.f4870as = false;
        c0760e.f4869ar = (short) 2;
        c0760e.f4832G = 0.4f;
        c0760e.f4831F = 1.5f;
        c0760e.f4806g = C0760e.f4810k;
    }

    /* renamed from: b */
    public static void m2343b(C0760e c0760e, boolean z) {
        c0760e.m2349c();
        c0760e.f4868aq = 7;
        if (z) {
            c0760e.f4867ap = C0773f.rand(0, 3);
        } else {
            c0760e.f4867ap = 0;
        }
        c0760e.f4850Y = 0.0f;
        c0760e.f4865an = true;
        c0760e.f4841P = 0.0f;
        c0760e.f4843R = 0.2f;
        c0760e.f4820u = true;
        c0760e.f4847V = 50.0f;
        c0760e.f4848W = c0760e.f4847V;
        c0760e.f4817r = true;
        c0760e.f4818s = true;
        c0760e.f4819t = 10.0f;
        c0760e.f4870as = false;
        c0760e.f4869ar = (short) 2;
        c0760e.f4806g = C0760e.f4813n;
    }

    /* renamed from: a */
    public static C0761f m2348a(float f, float f2) {
        C0761f m2347a = m2347a(f, f2, f4897v);
        m2347a.f4876a = 280.0f;
        m2347a.f4881f = 10.0f;
        m2347a.f4878c = 10.0f;
        m2347a.f4888m = 0.03f;
        m2347a.f4889n = 0.03f;
        m2347a.f4891p = 6.0f;
        m2347a.f4892q = 6.0f;
        m2347a.f4894s = EnumC0763h.verylow;
        m2347a.f4893r = 180.0f;
        m2347a.f4885j = -16777216;
        return m2347a;
    }

    /* renamed from: b */
    public static C0761f m2344b(float f, float f2) {
        C0761f m2347a = m2347a(f, f2, f4898w);
        m2347a.f4876a = 330.0f;
        m2347a.f4881f = 10.0f;
        m2347a.f4878c = 10.0f;
        m2347a.f4888m = 0.1f;
        m2347a.f4889n = 0.03f;
        m2347a.f4891p = 4.0f;
        m2347a.f4892q = 4.0f;
        m2347a.f4894s = EnumC0763h.verylow;
        return m2347a;
    }

    /* renamed from: a */
    public static C0761f m2347a(float f, float f2, C0760e c0760e) {
        C0758c c0758c = GameEngine.getGameEngine().f6377bR;
        C0761f c0761f = new C0761f(c0758c);
        c0761f.f7173eo = f;
        c0761f.f7174ep = f2;
        c0761f.f4876a = 100.0f;
        c0761f.f4881f = 10.0f;
        c0761f.f4884i = c0760e;
        if (c0760e == null) {
            c0761f.f4884i = new C0760e(c0758c);
            GameEngine.print("Error: Emitter create srcEffect==null");
        }
        return c0761f;
    }

    /* renamed from: c */
    public boolean m2342c() {
        return GameEngine.getGameEngine().f6427cP.m5146b(this.f7173eo, this.f7174ep);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        C0760e m2365b;
        this.f4895t = C0773f.m2218a(this.f4895t, f);
        if (this.f4895t > 0.0f) {
            return;
        }
        if (this.f4877b) {
            this.f4878c += f;
            if (this.f4878c > this.f4881f) {
                this.f4879d += f;
                if (this.f4879d > this.f4882g) {
                    this.f4879d = 0.0f;
                    this.f4880e += 1.0f;
                    if (this.f4880e > this.f4883h) {
                        this.f4878c = 0.0f;
                        this.f4880e = 0.0f;
                    }
                    if ((this.f4896u || m2342c()) && (m2365b = this.f4899x.m2365b(this.f7173eo, this.f7174ep, 0.0f, EnumC0759d.custom, false, this.f4894s)) != null) {
                        m2365b.m2353a(this.f4884i);
                        m2365b.f4841P += C0773f.m2151c(-this.f4888m, this.f4888m);
                        m2365b.f4842Q += C0773f.m2151c(-this.f4889n, this.f4889n);
                        m2365b.f4843R += C0773f.m2151c(-this.f4890o, this.f4890o);
                        m2365b.f4850Y = C0773f.m2151c(-this.f4893r, this.f4893r);
                        m2365b.f4834I = this.f7173eo;
                        m2365b.f4835J = this.f7174ep;
                        m2365b.f4834I += C0773f.m2151c(-this.f4891p, this.f4891p);
                        m2365b.f4835J += C0773f.m2151c(-this.f4892q, this.f4892q);
                        if (this.f4885j != 0) {
                            m2365b.f4823x = this.f4885j;
                        }
                        if (this.f4887l >= 0) {
                            m2365b.f4824y = this.f4886k;
                            m2365b.f4825z = this.f4887l;
                        }
                    }
                }
            }
        }
        this.f4876a -= f;
        if (this.f4876a < 0.0f) {
            mo447a();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public boolean mo440a(GameEngine gameEngine) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: d */
    public void mo437d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: f */
    public boolean mo433f(float f) {
        return false;
    }
}
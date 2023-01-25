package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0386ay;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0964ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/e.class */
public final class C0760e {

    /* renamed from: ay */
    private final C0758c f4799ay;

    /* renamed from: b */
    public AbstractC1155w f4800b;

    /* renamed from: c */
    public boolean f4801c;

    /* renamed from: d */
    public boolean f4802d;

    /* renamed from: g */
    public int f4803g;

    /* renamed from: o */
    public boolean f4804o;

    /* renamed from: p */
    public boolean f4805p;

    /* renamed from: r */
    public boolean f4806r;

    /* renamed from: s */
    public boolean f4807s;

    /* renamed from: t */
    public float f4808t;

    /* renamed from: u */
    public boolean f4809u;

    /* renamed from: v */
    public boolean f4810v;

    /* renamed from: x */
    public int f4811x;

    /* renamed from: y */
    public int f4812y;

    /* renamed from: A */
    public short f4813A;

    /* renamed from: E */
    public float f4814E;

    /* renamed from: F */
    public float f4815F;

    /* renamed from: G */
    public float f4816G;

    /* renamed from: H */
    public boolean f4817H;

    /* renamed from: I */
    public float f4818I;

    /* renamed from: J */
    public float f4819J;

    /* renamed from: K */
    public float f4820K;

    /* renamed from: L */
    public boolean f4821L;

    /* renamed from: M */
    public float f4822M;

    /* renamed from: N */
    public float f4823N;

    /* renamed from: O */
    public float f4824O;

    /* renamed from: P */
    public float f4825P;

    /* renamed from: Q */
    public float f4826Q;

    /* renamed from: R */
    public float f4827R;

    /* renamed from: S */
    public float f4828S;

    /* renamed from: T */
    public float f4829T;

    /* renamed from: U */
    public float f4830U;

    /* renamed from: V */
    public float f4831V;

    /* renamed from: W */
    public float f4832W;

    /* renamed from: Y */
    public float f4833Y;

    /* renamed from: Z */
    public float f4834Z;

    /* renamed from: aa */
    public String f4835aa;

    /* renamed from: ab */
    public Paint f4836ab;

    /* renamed from: ac */
    public float f4837ac;

    /* renamed from: ad */
    public float f4838ad;

    /* renamed from: ae */
    public boolean f4839ae;

    /* renamed from: af */
    public int f4840af;

    /* renamed from: ag */
    public int f4841ag;

    /* renamed from: ah */
    public boolean f4842ah;

    /* renamed from: ai */
    public boolean f4843ai;

    /* renamed from: aj */
    public float f4844aj;

    /* renamed from: ak */
    public float f4845ak;

    /* renamed from: al */
    public boolean f4846al;

    /* renamed from: am */
    public boolean f4847am;

    /* renamed from: ap */
    public int f4848ap;

    /* renamed from: aq */
    public int f4849aq;

    /* renamed from: au */
    public float f4850au;

    /* renamed from: av */
    public int f4851av;

    /* renamed from: aw */
    public boolean f4852aw;

    /* renamed from: h */
    public static int f4853h = 1;

    /* renamed from: i */
    public static int f4854i = 2;

    /* renamed from: j */
    public static int f4855j = 3;

    /* renamed from: k */
    public static int f4856k = 4;

    /* renamed from: l */
    public static int f4857l = 5;

    /* renamed from: m */
    public static int f4858m = 6;

    /* renamed from: n */
    public static int f4859n = 7;

    /* renamed from: C */
    public static LightingColorFilter f4860C = null;

    /* renamed from: D */
    public static int f4861D = 0;

    /* renamed from: ax */
    public static C0966ag[] f4862ax = new C0966ag[128];

    /* renamed from: a */
    public C0386ay f4863a = C0386ay.defaultEffectTemplate;

    /* renamed from: e */
    public boolean f4864e = true;

    /* renamed from: f */
    public boolean f4865f = false;

    /* renamed from: q */
    public EnumC0763h f4866q = EnumC0763h.verylow;

    /* renamed from: w */
    public float f4867w = 1.0f;

    /* renamed from: z */
    public float f4868z = -1.0f;

    /* renamed from: B */
    public LightingColorFilter f4869B = null;

    /* renamed from: X */
    public float f4870X = 0.0f;

    /* renamed from: an */
    public boolean f4871an = false;

    /* renamed from: ao */
    public float f4872ao = 0.0f;

    /* renamed from: ar */
    public short f4873ar = 2;

    /* renamed from: as */
    public boolean f4874as = false;

    /* renamed from: at */
    public C0966ag f4875at = m2356a();

    protected C0760e(C0758c c0758c) {
        this.f4799ay = c0758c;
    }

    static {
        for (int i = 0; i < f4862ax.length; i++) {
            f4862ax[i] = m2356a();
            f4862ax[i].m5201c((int) ((i / (f4862ax.length - 1)) * 255.0f));
        }
    }

    /* renamed from: a */
    public static C0966ag m2356a() {
        return C1152y.m459b();
    }

    /* renamed from: a */
    public C0966ag m2355a(float f) {
        int length = (int) (f * (f4862ax.length - 1));
        if (length < 0) {
            length = 0;
        }
        if (length > f4862ax.length - 1) {
            length = f4862ax.length - 1;
        }
        return f4862ax[length];
    }

    /* renamed from: b */
    public void m2351b() {
        if (this.f4804o) {
            this.f4804o = false;
            this.f4799ay.f4778a--;
            C0758c.f4764h = true;
            if (this.f4863a.alsoEmitEffectsOnDeath != null && this.f4813A < 20) {
                float f = this.f4818I;
                float f2 = this.f4819J;
                float f3 = this.f4820K;
                if (this.f4800b != null) {
                    f += this.f4800b.f7172eo;
                    f2 += this.f4800b.f7173ep;
                    f3 += this.f4800b.f7174eq;
                }
                this.f4863a.alsoEmitEffectsOnDeath.m3464a(f, f2, f3, this.f4833Y, this.f4800b, 0, this.f4813A);
            }
        }
    }

    /* renamed from: c */
    public void m2349c() {
        this.f4863a = C0386ay.defaultEffectTemplate;
        this.f4866q = EnumC0763h.verylow;
        this.f4800b = null;
        this.f4801c = false;
        this.f4802d = false;
        this.f4864e = true;
        this.f4865f = false;
        this.f4803g = 0;
        this.f4805p = false;
        this.f4818I = 0.0f;
        this.f4819J = 0.0f;
        this.f4821L = false;
        this.f4822M = 0.0f;
        this.f4823N = 0.0f;
        this.f4824O = 0.0f;
        this.f4820K = 0.0f;
        this.f4873ar = (short) 2;
        this.f4871an = false;
        this.f4872ao = 0.0f;
        this.f4839ae = false;
        this.f4845ak = 0.0f;
        this.f4844aj = 0.0f;
        this.f4841ag = 0;
        this.f4842ah = false;
        this.f4843ai = false;
        this.f4846al = false;
        this.f4847am = false;
        this.f4848ap = 0;
        this.f4849aq = 0;
        this.f4830U = 0.0f;
        this.f4831V = 15.0f;
        this.f4832W = this.f4831V;
        this.f4870X = 0.0f;
        this.f4806r = false;
        this.f4807s = false;
        this.f4808t = 0.0f;
        this.f4815F = 1.0f;
        this.f4816G = 1.0f;
        this.f4817H = false;
        this.f4809u = false;
        this.f4810v = false;
        this.f4867w = 1.0f;
        this.f4814E = 1.0f;
        this.f4833Y = 0.0f;
        this.f4834Z = 0.0f;
        this.f4825P = 0.0f;
        this.f4826Q = 0.0f;
        this.f4827R = 0.0f;
        this.f4828S = 0.0f;
        this.f4829T = 0.0f;
        this.f4835aa = null;
        this.f4836ab = null;
        this.f4837ac = 0.0f;
        this.f4838ad = 0.0f;
        this.f4813A = (short) 0;
        this.f4811x = -1;
        this.f4869B = null;
        this.f4812y = -1;
        this.f4868z = -1.0f;
        this.f4875at.m5225a((ColorFilter) null);
        this.f4852aw = false;
        this.f4875at.m915a((C0964ae) null);
        this.f4874as = false;
    }

    /* renamed from: a */
    public void m2353a(C0760e c0760e) {
        this.f4863a = c0760e.f4863a;
        this.f4866q = c0760e.f4866q;
        this.f4803g = c0760e.f4803g;
        this.f4800b = c0760e.f4800b;
        this.f4801c = c0760e.f4801c;
        this.f4802d = c0760e.f4802d;
        this.f4864e = c0760e.f4864e;
        this.f4805p = c0760e.f4805p;
        this.f4818I = c0760e.f4818I;
        this.f4819J = c0760e.f4819J;
        this.f4821L = c0760e.f4821L;
        this.f4822M = c0760e.f4822M;
        this.f4823N = c0760e.f4823N;
        this.f4824O = c0760e.f4824O;
        this.f4820K = c0760e.f4820K;
        this.f4873ar = c0760e.f4873ar;
        this.f4871an = c0760e.f4871an;
        this.f4872ao = c0760e.f4872ao;
        this.f4839ae = c0760e.f4839ae;
        this.f4845ak = c0760e.f4845ak;
        this.f4844aj = c0760e.f4844aj;
        this.f4841ag = c0760e.f4841ag;
        this.f4842ah = c0760e.f4842ah;
        this.f4843ai = c0760e.f4843ai;
        this.f4846al = c0760e.f4842ah;
        this.f4847am = c0760e.f4847am;
        this.f4848ap = c0760e.f4848ap;
        this.f4849aq = c0760e.f4849aq;
        this.f4830U = c0760e.f4830U;
        this.f4831V = c0760e.f4831V;
        this.f4832W = c0760e.f4832W;
        this.f4870X = c0760e.f4870X;
        this.f4806r = c0760e.f4806r;
        this.f4807s = c0760e.f4807s;
        this.f4808t = c0760e.f4808t;
        this.f4815F = c0760e.f4815F;
        this.f4816G = c0760e.f4816G;
        this.f4817H = c0760e.f4817H;
        this.f4809u = c0760e.f4809u;
        this.f4810v = c0760e.f4810v;
        this.f4867w = c0760e.f4867w;
        this.f4814E = c0760e.f4814E;
        this.f4833Y = c0760e.f4833Y;
        this.f4834Z = c0760e.f4834Z;
        this.f4825P = c0760e.f4825P;
        this.f4826Q = c0760e.f4826Q;
        this.f4827R = c0760e.f4827R;
        this.f4828S = c0760e.f4828S;
        this.f4829T = c0760e.f4829T;
        this.f4835aa = c0760e.f4835aa;
        this.f4836ab = c0760e.f4836ab;
        this.f4837ac = c0760e.f4837ac;
        this.f4838ad = c0760e.f4838ad;
        this.f4813A = c0760e.f4813A;
        this.f4811x = c0760e.f4811x;
        this.f4812y = c0760e.f4812y;
        this.f4868z = c0760e.f4868z;
        this.f4869B = c0760e.f4869B;
        this.f4874as = c0760e.f4874as;
    }

    /* renamed from: b */
    public void m2350b(float f) {
        this.f4830U = C0773f.m2218a(this.f4830U, f);
        if (this.f4830U > 0.0f) {
            return;
        }
        this.f4831V -= f;
        if (this.f4800b != null && this.f4800b.f7167ej && !this.f4863a.liveAfterAttachedDies) {
            this.f4831V = -1.0f;
        }
        if (this.f4831V < 0.0f) {
            m2351b();
            return;
        }
        if (this.f4839ae) {
            if (this.f4846al) {
                this.f4845ak -= this.f4844aj * f;
            } else {
                this.f4845ak += this.f4844aj * f;
            }
            if (this.f4842ah) {
                if (!this.f4846al) {
                    if (this.f4845ak >= this.f4841ag + 1) {
                        this.f4846al = true;
                        this.f4845ak = this.f4841ag;
                    }
                } else if (this.f4845ak < this.f4840af) {
                    if (!this.f4843ai) {
                        m2351b();
                        return;
                    } else {
                        this.f4846al = false;
                        this.f4845ak = this.f4840af;
                    }
                }
            } else if (this.f4845ak >= this.f4841ag + 1) {
                if (!this.f4843ai) {
                    m2351b();
                    return;
                }
                this.f4845ak = this.f4840af;
            }
            this.f4848ap = (int) this.f4845ak;
        }
        if (this.f4809u) {
            this.f4827R -= (this.f4827R * 0.002f) * f;
            this.f4825P -= f * 0.0015f;
        }
        if (this.f4810v) {
            if (this.f4820K > 0.0f) {
                this.f4827R -= (0.1f * this.f4867w) * f;
            } else {
                if (this.f4827R < 0.0f) {
                    this.f4827R = -this.f4827R;
                    this.f4827R *= 0.5f;
                    this.f4827R = C0773f.m2218a(this.f4827R, 1.3f);
                }
                if (this.f4820K < 0.0f) {
                    this.f4820K = 0.0f;
                }
                if (this.f4827R < 0.2d) {
                    this.f4873ar = (short) 1;
                }
                this.f4825P = C0773f.m2218a(this.f4825P, 0.15f * f);
                this.f4826Q = C0773f.m2218a(this.f4826Q, 0.15f * f);
                this.f4834Z = C0773f.m2218a(this.f4834Z, 1.0f * f);
            }
        }
        this.f4818I += this.f4825P * f;
        this.f4819J += this.f4826Q * f;
        this.f4820K += this.f4827R * f;
        this.f4833Y += this.f4834Z * f;
        if (this.f4863a.trailEffect != null) {
            this.f4870X += f;
            if (this.f4870X > this.f4863a.trailEffectRate) {
                this.f4870X = 0.0f;
                if (this.f4813A < 20) {
                    float f2 = this.f4818I;
                    float f3 = this.f4819J;
                    float f4 = this.f4820K;
                    if (this.f4800b != null) {
                        f2 += this.f4800b.f7172eo;
                        f3 += this.f4800b.f7173ep;
                        f4 += this.f4800b.f7174eq;
                    }
                    this.f4863a.trailEffect.m3464a(f2, f3, f4, this.f4833Y, this.f4800b, 0, this.f4813A);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2354a(int i, C0762g c0762g, Rect rect) {
        int i2 = 0;
        if (i >= c0762g.f4907h) {
            i2 = 0 + (i / c0762g.f4907h);
            i %= c0762g.f4907h;
        }
        int i3 = c0762g.f4903d + (i * c0762g.f4905f);
        int i4 = c0762g.f4904e + (i2 * c0762g.f4906g);
        rect.f230a = i3;
        rect.f231b = i4;
        rect.f232c = i3 + c0762g.f4901b;
        rect.f233d = i4 + c0762g.f4902c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v158, types: [android.graphics.Paint] */
    /* renamed from: a */
    public boolean m2352a(GameEngine gameEngine, boolean z) {
        C0762g c0762g;
        PointF m2139d;
        float f;
        C0966ag c0966ag;
        Rect rect = C0758c.f4774o;
        RectF rectF = C0758c.f4773n;
        if (this.f4830U > 0.0f) {
            return false;
        }
        if (z && this.f4820K < 1.0f) {
            return false;
        }
        if (this.f4863a.imageStrip != null) {
            c0762g = this.f4863a.imageStrip;
        } else {
            c0762g = C0758c.f4770s[this.f4849aq];
        }
        if (!c0762g.f4910k) {
            m2354a(this.f4848ap, c0762g, rect);
        } else {
            rect.m5172a(0, 0, c0762g.f4908i.mo387m(), c0762g.f4908i.mo388l());
        }
        if (!z) {
            m2139d = C0773f.m2139d(this.f4818I, this.f4819J, this.f4820K);
        } else {
            m2139d = C0773f.m2139d(this.f4818I, this.f4819J, 0.0f);
        }
        boolean z2 = this.f4873ar == 4;
        float f2 = 1.0f;
        if (this.f4816G != 1.0f || this.f4815F != 1.0f || this.f4817H) {
            f2 = C0773f.m2125f(this.f4816G, this.f4815F, 1.0f - (this.f4831V / this.f4832W));
            boolean z3 = this.f4873ar != 4;
            if (this.f4817H && z3) {
                f2 = f2 * (1.0f / gameEngine.f6470cX) * gameEngine.f6345cj;
            }
        }
        rectF.m5158a(m2139d.x, m2139d.y, m2139d.x + rect.m5170b(), m2139d.y + rect.m5166c());
        if (this.f4871an) {
            rectF.m5159a((-rectF.m5153b()) / 2.0f, (-rectF.m5149c()) / 2.0f);
        }
        if (this.f4872ao != 0.0f) {
            rectF.m5159a(0.0f, rectF.m5149c() * this.f4872ao * f2);
        }
        if (this.f4800b != null) {
            if (!z) {
                if (!this.f4801c) {
                    rectF.m5159a(this.f4800b.f7172eo, this.f4800b.f7173ep - this.f4800b.f7174eq);
                } else {
                    rectF.m5159a(this.f4800b.f7172eo, this.f4800b.f7173ep);
                }
            } else {
                rectF.m5159a(this.f4800b.f7172eo, this.f4800b.f7173ep);
            }
        }
        if ((!z2 || this.f4821L) && !C0773f.m2201a(gameEngine.f6464cN, rectF)) {
            return false;
        }
        if (!this.f4864e && !z2 && !this.f4865f) {
            if (!gameEngine.f6323bL.m4662a(rectF.m5147d(), rectF.m5146e(), gameEngine.f6312bs)) {
                return false;
            }
            this.f4865f = true;
        }
        if (!z2) {
            rectF.m5159a(-gameEngine.f6357cw, -gameEngine.f6358cx);
        }
        if (this.f4828S != 0.0f) {
            rectF.m5159a(0.0f, C0773f.m2110j(((this.f4832W - this.f4831V) / this.f4829T) * 360.0f) * this.f4828S);
        }
        float f3 = this.f4832W - this.f4831V;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        boolean z4 = false;
        if (this.f4811x != -1) {
            f4 = Color.m5245a(this.f4811x) * 0.003921569f;
            int m5241b = Color.m5241b(this.f4811x);
            int m5240c = Color.m5240c(this.f4811x);
            int m5239d = Color.m5239d(this.f4811x);
            if (m5241b != 255 || m5240c != 255 || m5239d != 255) {
                z4 = true;
                f5 = m5241b * 0.003921569f;
                f6 = m5240c * 0.003921569f;
                f7 = m5239d * 0.003921569f;
            }
        }
        if (this.f4868z >= 0.0f) {
            float m5245a = Color.m5245a(this.f4812y) * 0.003921569f;
            float m5241b2 = Color.m5241b(this.f4812y) * 0.003921569f;
            float m5240c2 = Color.m5240c(this.f4812y) * 0.003921569f;
            float m5239d2 = Color.m5239d(this.f4812y) * 0.003921569f;
            if (this.f4868z <= f3) {
                f4 = m5245a;
                z4 = true;
                f5 = m5241b2;
                f6 = m5240c2;
                f7 = m5239d2;
            } else {
                float f8 = f3 / this.f4868z;
                float f9 = 1.0f - f8;
                f4 = (f4 * f9) + (m5245a * f8);
                z4 = true;
                f5 = (f5 * f9) + (m5241b2 * f8);
                f6 = (f6 * f9) + (m5240c2 * f8);
                f7 = (f7 * f9) + (m5239d2 * f8);
            }
        }
        if (this.f4806r && f3 >= this.f4808t) {
            f = f4 * (this.f4831V / (this.f4832W - this.f4808t)) * this.f4814E;
        } else if (this.f4807s && f3 < this.f4808t) {
            f = f4 * (f3 / this.f4808t) * this.f4814E;
        } else {
            f = f4 * this.f4814E;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        boolean z5 = false;
        InterfaceC1063y interfaceC1063y = gameEngine.f6326bO;
        if (this.f4833Y != 0.0f) {
            if (0 == 0) {
                z5 = true;
                interfaceC1063y.mo136k();
            }
            interfaceC1063y.mo228a(this.f4833Y + 90.0f, rectF.m5147d(), rectF.m5146e());
        }
        if (f2 != 1.0f) {
            if (!z5) {
                z5 = true;
                interfaceC1063y.mo136k();
            }
            interfaceC1063y.mo227a(f2, f2, rectF.m5147d(), rectF.m5146e());
        }
        if (z) {
            f = C0773f.m2171b(f / 3.0f, 0.0f, 1.0f);
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            z4 = true;
        }
        if (z4 && GameEngine.m1030at() && !z && this.f4869B == null) {
            int m2165b = C0773f.m2165b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            if (f4860C != null && f4861D == m2165b) {
                this.f4869B = f4860C;
            } else {
                f4860C = new LightingColorFilter(m2165b, 0);
                f4861D = m2165b;
                this.f4869B = f4860C;
            }
        }
        LightingColorFilter lightingColorFilter = this.f4869B;
        if (lightingColorFilter != null) {
            if (!this.f4852aw) {
                this.f4875at.m5225a(lightingColorFilter);
                this.f4852aw = true;
            }
            z4 = true;
        } else if (this.f4852aw) {
            this.f4875at.m5225a((ColorFilter) null);
            this.f4852aw = false;
        }
        if (this.f4873ar == 3) {
            if (C0758c.f4767k == null) {
                GameEngine.m5460e("Loading displacement shader");
                try {
                    C0758c.f4767k = new C0964ae("assets/shaders/post_displacement.frag");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (this.f4799ay.f4768l != null) {
                C0964ae c0964ae = C0758c.f4767k;
                c0964ae.m929a("screenBase", this.f4799ay.f4768l);
                c0964ae.m926b("screenBaseSize", this.f4799ay.f4768l);
                c0964ae.m931a("u_resolution", gameEngine.f6347cl, gameEngine.f6348cm);
                c0964ae.m932a("u_offsetBy", 0.12f * gameEngine.f6470cX);
                this.f4875at.m915a(c0964ae);
                z4 = true;
            }
        }
        if (!z4) {
            c0966ag = m2355a(f);
        } else {
            c0966ag = this.f4875at;
            int m2165b2 = C0773f.m2165b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            float f10 = this.f4850au - f;
            if (f10 < -0.01f || f10 > 0.01f || this.f4851av != m2165b2) {
                this.f4850au = f;
                this.f4851av = m2165b2;
                this.f4875at.m5206b(C0773f.m2165b((int) (f * 255.0f), (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f)));
            }
        }
        if (this.f4835aa != null) {
            C0966ag c0966ag2 = c0966ag;
            if (this.f4836ab != null) {
                c0966ag2 = this.f4836ab;
            }
            interfaceC1063y.mo182a(this.f4835aa, rectF.m5147d() + this.f4837ac, rectF.m5146e() + this.f4838ad, c0966ag2);
        }
        if (this.f4821L) {
            PointF m2139d2 = C0773f.m2139d(this.f4822M, this.f4823N, this.f4824O);
            interfaceC1063y.mo226a(rectF.f234a, rectF.f235b, m2139d2.x - gameEngine.f6357cw, m2139d2.y - gameEngine.f6358cx, this.f4799ay.f4787w);
        } else if (z) {
            if (c0762g.f4909j != null) {
                interfaceC1063y.mo193a(c0762g.f4909j, rect, rectF, c0966ag);
            }
        } else {
            interfaceC1063y.mo193a(c0762g.f4908i, rect, rectF, c0966ag);
        }
        if (z5) {
            interfaceC1063y.mo135l();
            return true;
        }
        return true;
    }
}
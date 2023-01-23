package com.corrodinggames.rts.gameFramework.d;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.ay;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.ae;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.utility.y;
import com.corrodinggames.rts.gameFramework.w;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/e.class */
public final class e {
    private final c ay;
    public w b;
    public boolean c;
    public boolean d;
    public int g;
    public boolean o;
    public boolean p;
    public boolean r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public int x;
    public int y;
    public short A;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float Y;
    public float Z;
    public String aa;
    public Paint ab;
    public float ac;
    public float ad;
    public boolean ae;
    public int af;
    public int ag;
    public boolean ah;
    public boolean ai;
    public float aj;
    public float ak;
    public boolean al;
    public boolean am;
    public int ap;
    public int aq;
    public float au;
    public int av;
    public boolean aw;
    public static int h = 1;
    public static int i = 2;
    public static int j = 3;
    public static int k = 4;
    public static int l = 5;
    public static int m = 6;
    public static int n = 7;
    public static LightingColorFilter C = null;
    public static int D = 0;
    public static ag[] ax = new ag[128];

    /* renamed from: a */
    public ay f471a = ay.defaultEffectTemplate;
    public boolean e = true;
    public boolean f = false;
    public h q = h.verylow;
    public float w = 1.0f;
    public float z = -1.0f;
    public LightingColorFilter B = null;
    public float X = 0.0f;
    public boolean an = false;
    public float ao = 0.0f;
    public short ar = 2;
    public boolean as = false;
    public ag at = a();

    /* JADX INFO: Access modifiers changed from: protected */
    public e(c cVar) {
        this.ay = cVar;
    }

    static {
        for (int i2 = 0; i2 < ax.length; i2++) {
            ax[i2] = a();
            ax[i2].c((int) ((i2 / (ax.length - 1)) * 255.0f));
        }
    }

    public static ag a() {
        return y.b();
    }

    public ag a(float f) {
        int length = (int) (f * (ax.length - 1));
        if (length < 0) {
            length = 0;
        }
        if (length > ax.length - 1) {
            length = ax.length - 1;
        }
        return ax[length];
    }

    public void b() {
        if (this.o) {
            this.o = false;
            this.ay.f469a--;
            c.h = true;
            if (this.f471a.alsoEmitEffectsOnDeath != null && this.A < 20) {
                float f = this.I;
                float f2 = this.J;
                float f3 = this.K;
                if (this.b != null) {
                    f += this.b.eo;
                    f2 += this.b.ep;
                    f3 += this.b.eq;
                }
                this.f471a.alsoEmitEffectsOnDeath.a(f, f2, f3, this.Y, this.b, 0, this.A);
            }
        }
    }

    public void c() {
        this.f471a = ay.defaultEffectTemplate;
        this.q = h.verylow;
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = false;
        this.g = 0;
        this.p = false;
        this.I = 0.0f;
        this.J = 0.0f;
        this.L = false;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.K = 0.0f;
        this.ar = (short) 2;
        this.an = false;
        this.ao = 0.0f;
        this.ae = false;
        this.ak = 0.0f;
        this.aj = 0.0f;
        this.ag = 0;
        this.ah = false;
        this.ai = false;
        this.al = false;
        this.am = false;
        this.ap = 0;
        this.aq = 0;
        this.U = 0.0f;
        this.V = 15.0f;
        this.W = this.V;
        this.X = 0.0f;
        this.r = false;
        this.s = false;
        this.t = 0.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.H = false;
        this.u = false;
        this.v = false;
        this.w = 1.0f;
        this.E = 1.0f;
        this.Y = 0.0f;
        this.Z = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.aa = null;
        this.ab = null;
        this.ac = 0.0f;
        this.ad = 0.0f;
        this.A = (short) 0;
        this.x = -1;
        this.B = null;
        this.y = -1;
        this.z = -1.0f;
        this.at.a((ColorFilter) null);
        this.aw = false;
        this.at.a((ae) null);
        this.as = false;
    }

    public void a(e eVar) {
        this.f471a = eVar.f471a;
        this.q = eVar.q;
        this.g = eVar.g;
        this.b = eVar.b;
        this.c = eVar.c;
        this.d = eVar.d;
        this.e = eVar.e;
        this.p = eVar.p;
        this.I = eVar.I;
        this.J = eVar.J;
        this.L = eVar.L;
        this.M = eVar.M;
        this.N = eVar.N;
        this.O = eVar.O;
        this.K = eVar.K;
        this.ar = eVar.ar;
        this.an = eVar.an;
        this.ao = eVar.ao;
        this.ae = eVar.ae;
        this.ak = eVar.ak;
        this.aj = eVar.aj;
        this.ag = eVar.ag;
        this.ah = eVar.ah;
        this.ai = eVar.ai;
        this.al = eVar.ah;
        this.am = eVar.am;
        this.ap = eVar.ap;
        this.aq = eVar.aq;
        this.U = eVar.U;
        this.V = eVar.V;
        this.W = eVar.W;
        this.X = eVar.X;
        this.r = eVar.r;
        this.s = eVar.s;
        this.t = eVar.t;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.u = eVar.u;
        this.v = eVar.v;
        this.w = eVar.w;
        this.E = eVar.E;
        this.Y = eVar.Y;
        this.Z = eVar.Z;
        this.P = eVar.P;
        this.Q = eVar.Q;
        this.R = eVar.R;
        this.S = eVar.S;
        this.T = eVar.T;
        this.aa = eVar.aa;
        this.ab = eVar.ab;
        this.ac = eVar.ac;
        this.ad = eVar.ad;
        this.A = eVar.A;
        this.x = eVar.x;
        this.y = eVar.y;
        this.z = eVar.z;
        this.B = eVar.B;
        this.as = eVar.as;
    }

    public void b(float f) {
        this.U = com.corrodinggames.rts.gameFramework.f.a(this.U, f);
        if (this.U > 0.0f) {
            return;
        }
        this.V -= f;
        if (this.b != null && this.b.ej && !this.f471a.liveAfterAttachedDies) {
            this.V = -1.0f;
        }
        if (this.V < 0.0f) {
            b();
            return;
        }
        if (this.ae) {
            if (this.al) {
                this.ak -= this.aj * f;
            } else {
                this.ak += this.aj * f;
            }
            if (this.ah) {
                if (!this.al) {
                    if (this.ak >= this.ag + 1) {
                        this.al = true;
                        this.ak = this.ag;
                    }
                } else if (this.ak < this.af) {
                    if (!this.ai) {
                        b();
                        return;
                    } else {
                        this.al = false;
                        this.ak = this.af;
                    }
                }
            } else if (this.ak >= this.ag + 1) {
                if (!this.ai) {
                    b();
                    return;
                }
                this.ak = this.af;
            }
            this.ap = (int) this.ak;
        }
        if (this.u) {
            this.R -= (this.R * 0.002f) * f;
            this.P -= f * 0.0015f;
        }
        if (this.v) {
            if (this.K > 0.0f) {
                this.R -= (0.1f * this.w) * f;
            } else {
                if (this.R < 0.0f) {
                    this.R = -this.R;
                    this.R *= 0.5f;
                    this.R = com.corrodinggames.rts.gameFramework.f.a(this.R, 1.3f);
                }
                if (this.K < 0.0f) {
                    this.K = 0.0f;
                }
                if (this.R < 0.2d) {
                    this.ar = (short) 1;
                }
                this.P = com.corrodinggames.rts.gameFramework.f.a(this.P, 0.15f * f);
                this.Q = com.corrodinggames.rts.gameFramework.f.a(this.Q, 0.15f * f);
                this.Z = com.corrodinggames.rts.gameFramework.f.a(this.Z, 1.0f * f);
            }
        }
        this.I += this.P * f;
        this.J += this.Q * f;
        this.K += this.R * f;
        this.Y += this.Z * f;
        if (this.f471a.trailEffect != null) {
            this.X += f;
            if (this.X > this.f471a.trailEffectRate) {
                this.X = 0.0f;
                if (this.A < 20) {
                    float f2 = this.I;
                    float f3 = this.J;
                    float f4 = this.K;
                    if (this.b != null) {
                        f2 += this.b.eo;
                        f3 += this.b.ep;
                        f4 += this.b.eq;
                    }
                    this.f471a.trailEffect.a(f2, f3, f4, this.Y, this.b, 0, this.A);
                }
            }
        }
    }

    public static void a(int i2, g gVar, Rect rect) {
        int i3 = 0;
        if (i2 >= gVar.h) {
            i3 = 0 + (i2 / gVar.h);
            i2 %= gVar.h;
        }
        int i4 = gVar.d + (i2 * gVar.f);
        int i5 = gVar.e + (i3 * gVar.g);
        rect.f47a = i4;
        rect.b = i5;
        rect.c = i4 + gVar.b;
        rect.d = i5 + gVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v158, types: [android.graphics.Paint] */
    public boolean a(GameEngine gameEngine, boolean z) {
        g gVar;
        PointF d;
        float f;
        ag agVar;
        Rect rect = c.o;
        RectF rectF = c.n;
        if (this.U > 0.0f) {
            return false;
        }
        if (z && this.K < 1.0f) {
            return false;
        }
        if (this.f471a.imageStrip != null) {
            gVar = this.f471a.imageStrip;
        } else {
            gVar = c.s[this.aq];
        }
        if (!gVar.k) {
            a(this.ap, gVar, rect);
        } else {
            rect.a(0, 0, gVar.i.m(), gVar.i.l());
        }
        if (!z) {
            d = com.corrodinggames.rts.gameFramework.f.d(this.I, this.J, this.K);
        } else {
            d = com.corrodinggames.rts.gameFramework.f.d(this.I, this.J, 0.0f);
        }
        boolean z2 = this.ar == 4;
        float f2 = 1.0f;
        if (this.G != 1.0f || this.F != 1.0f || this.H) {
            f2 = com.corrodinggames.rts.gameFramework.f.f(this.G, this.F, 1.0f - (this.V / this.W));
            boolean z3 = this.ar != 4;
            if (this.H && z3) {
                f2 = f2 * (1.0f / gameEngine.cX) * gameEngine.cj;
            }
        }
        rectF.a(d.x, d.y, d.x + rect.b(), d.y + rect.c());
        if (this.an) {
            rectF.a((-rectF.b()) / 2.0f, (-rectF.c()) / 2.0f);
        }
        if (this.ao != 0.0f) {
            rectF.a(0.0f, rectF.c() * this.ao * f2);
        }
        if (this.b != null) {
            if (!z) {
                if (!this.c) {
                    rectF.a(this.b.eo, this.b.ep - this.b.eq);
                } else {
                    rectF.a(this.b.eo, this.b.ep);
                }
            } else {
                rectF.a(this.b.eo, this.b.ep);
            }
        }
        if ((!z2 || this.L) && !com.corrodinggames.rts.gameFramework.f.a(gameEngine.cN, rectF)) {
            return false;
        }
        if (!this.e && !z2 && !this.f) {
            if (!gameEngine.bL.a(rectF.d(), rectF.e(), gameEngine.bs)) {
                return false;
            }
            this.f = true;
        }
        if (!z2) {
            rectF.a(-gameEngine.cw, -gameEngine.cx);
        }
        if (this.S != 0.0f) {
            rectF.a(0.0f, com.corrodinggames.rts.gameFramework.f.j(((this.W - this.V) / this.T) * 360.0f) * this.S);
        }
        float f3 = this.W - this.V;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        boolean z4 = false;
        if (this.x != -1) {
            f4 = Color.a(this.x) * 0.003921569f;
            int b = Color.b(this.x);
            int c = Color.c(this.x);
            int d2 = Color.d(this.x);
            if (b != 255 || c != 255 || d2 != 255) {
                z4 = true;
                f5 = b * 0.003921569f;
                f6 = c * 0.003921569f;
                f7 = d2 * 0.003921569f;
            }
        }
        if (this.z >= 0.0f) {
            float a2 = Color.a(this.y) * 0.003921569f;
            float b2 = Color.b(this.y) * 0.003921569f;
            float c2 = Color.c(this.y) * 0.003921569f;
            float d3 = Color.d(this.y) * 0.003921569f;
            if (this.z <= f3) {
                f4 = a2;
                z4 = true;
                f5 = b2;
                f6 = c2;
                f7 = d3;
            } else {
                float f8 = f3 / this.z;
                float f9 = 1.0f - f8;
                f4 = (f4 * f9) + (a2 * f8);
                z4 = true;
                f5 = (f5 * f9) + (b2 * f8);
                f6 = (f6 * f9) + (c2 * f8);
                f7 = (f7 * f9) + (d3 * f8);
            }
        }
        if (this.r && f3 >= this.t) {
            f = f4 * (this.V / (this.W - this.t)) * this.E;
        } else if (this.s && f3 < this.t) {
            f = f4 * (f3 / this.t) * this.E;
        } else {
            f = f4 * this.E;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        boolean z5 = false;
        com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
        if (this.Y != 0.0f) {
            if (0 == 0) {
                z5 = true;
                yVar.k();
            }
            yVar.a(this.Y + 90.0f, rectF.d(), rectF.e());
        }
        if (f2 != 1.0f) {
            if (!z5) {
                z5 = true;
                yVar.k();
            }
            yVar.a(f2, f2, rectF.d(), rectF.e());
        }
        if (z) {
            f = com.corrodinggames.rts.gameFramework.f.b(f / 3.0f, 0.0f, 1.0f);
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            z4 = true;
        }
        if (z4 && GameEngine.at() && !z && this.B == null) {
            int b3 = com.corrodinggames.rts.gameFramework.f.b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            if (C != null && D == b3) {
                this.B = C;
            } else {
                C = new LightingColorFilter(b3, 0);
                D = b3;
                this.B = C;
            }
        }
        LightingColorFilter lightingColorFilter = this.B;
        if (lightingColorFilter != null) {
            if (!this.aw) {
                this.at.a(lightingColorFilter);
                this.aw = true;
            }
            z4 = true;
        } else if (this.aw) {
            this.at.a((ColorFilter) null);
            this.aw = false;
        }
        if (this.ar == 3) {
            if (c.k == null) {
                GameEngine.m22e("Loading displacement shader");
                try {
                    c.k = new ae("assets/shaders/post_displacement.frag");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (this.ay.l != null) {
                ae aeVar = c.k;
                aeVar.a("screenBase", this.ay.l);
                aeVar.b("screenBaseSize", this.ay.l);
                aeVar.a("u_resolution", gameEngine.cl, gameEngine.cm);
                aeVar.a("u_offsetBy", 0.12f * gameEngine.cX);
                this.at.a(aeVar);
                z4 = true;
            }
        }
        if (!z4) {
            agVar = a(f);
        } else {
            agVar = this.at;
            int b4 = com.corrodinggames.rts.gameFramework.f.b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            float f10 = this.au - f;
            if (f10 < -0.01f || f10 > 0.01f || this.av != b4) {
                this.au = f;
                this.av = b4;
                this.at.b(com.corrodinggames.rts.gameFramework.f.b((int) (f * 255.0f), (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f)));
            }
        }
        if (this.aa != null) {
            ag agVar2 = agVar;
            if (this.ab != null) {
                agVar2 = this.ab;
            }
            yVar.a(this.aa, rectF.d() + this.ac, rectF.e() + this.ad, agVar2);
        }
        if (this.L) {
            PointF d4 = com.corrodinggames.rts.gameFramework.f.d(this.M, this.N, this.O);
            yVar.a(rectF.f48a, rectF.b, d4.x - gameEngine.cw, d4.y - gameEngine.cx, this.ay.w);
        } else if (z) {
            if (gVar.j != null) {
                yVar.a(gVar.j, rect, rectF, agVar);
            }
        } else {
            yVar.a(gVar.i, rect, rectF, agVar);
        }
        if (z5) {
            yVar.l();
            return true;
        }
        return true;
    }
}
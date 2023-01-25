package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.p018b.C0397i;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e.class */
public final class C0432e {

    /* renamed from: a */
    public C0446f f2745a;

    /* renamed from: b */
    float f2746b;

    /* renamed from: c */
    float f2747c;

    /* renamed from: g */
    boolean f2751g;

    /* renamed from: h */
    boolean f2752h;

    /* renamed from: i */
    boolean f2753i;

    /* renamed from: j */
    int f2754j;

    /* renamed from: m */
    C0456j f2757m;

    /* renamed from: n */
    float[] f2758n;

    /* renamed from: d */
    float f2748d = 1.0f;

    /* renamed from: e */
    boolean f2749e = false;

    /* renamed from: f */
    boolean f2750f = false;

    /* renamed from: k */
    float f2755k = 0.0f;

    /* renamed from: l */
    float f2756l = 0.05f;

    public C0432e(C0456j c0456j) {
        this.f2757m = c0456j;
    }

    /* renamed from: a */
    public void m3791a(C0446f c0446f, int i) {
        m3790a(c0446f, i, false);
    }

    /* renamed from: a */
    public void m3790a(C0446f c0446f, int i, boolean z) {
        if (c0446f == null || !c0446f.m3708a()) {
            return;
        }
        if ((this.f2753i || (this.f2750f && this.f2749e)) && i <= this.f2754j && (!z || c0446f != this.f2745a)) {
            return;
        }
        this.f2753i = true;
        if (c0446f != this.f2745a || z || this.f2751g) {
            float f = 0.0f;
            if (this.f2745a != null && this.f2749e) {
                f = this.f2745a.f2841i;
            }
            this.f2745a = c0446f;
            this.f2754j = i;
            m3786c();
            this.f2750f = z;
            if (z) {
                this.f2752h = false;
            } else {
                this.f2752h = true;
            }
            this.f2746b = -1.0f;
            this.f2747c = -1.0f;
            this.f2748d = 1.0f;
            this.f2751g = false;
            float f2 = c0446f.f2840h;
            if (f > f2) {
                f2 = f;
            }
            if (f2 > 0.0f) {
                this.f2755k = 1.0f;
                this.f2756l = f2;
            } else {
                this.f2755k = 0.0f;
            }
        }
        this.f2749e = true;
    }

    /* renamed from: a */
    public void m3794a() {
        if (this.f2745a != null) {
            m3787b(true);
        }
        this.f2749e = false;
        this.f2745a = null;
        this.f2754j = -1;
    }

    /* renamed from: b */
    public void m3788b() {
        if (this.f2745a != null) {
            if (!this.f2751g) {
                float f = this.f2745a.f2841i;
                if (f > 0.0f) {
                    this.f2751g = true;
                    m3786c();
                    this.f2752h = false;
                    this.f2754j = -1;
                    this.f2755k = 1.0f;
                    this.f2756l = f;
                    return;
                }
            }
            m3787b(true);
        }
        this.f2749e = false;
        this.f2745a = null;
        this.f2754j = -1;
    }

    /* renamed from: a */
    public void m3793a(float f) {
        if (!this.f2749e) {
            return;
        }
        this.f2747c = this.f2746b;
        if (this.f2746b < 0.0f) {
            this.f2746b = 0.0f;
        }
        float f2 = this.f2748d;
        if (this.f2745a != null && this.f2745a.f2842j != null) {
            f2 *= this.f2745a.f2842j.readNumber(this.f2757m);
        }
        this.f2746b += f2 * f;
        if (this.f2752h && !this.f2753i) {
            m3788b();
        }
        this.f2753i = false;
        if (this.f2749e) {
            if (this.f2755k > 0.0f) {
                this.f2755k -= this.f2756l * f;
            } else if (this.f2751g) {
                m3788b();
                return;
            }
            if (!this.f2751g && this.f2745a != null) {
                if (this.f2745a.f2839g) {
                    if (this.f2746b > this.f2745a.f2846n) {
                        m3789a(false);
                        this.f2746b = this.f2745a.f2846n;
                        this.f2748d = -1.0f;
                    } else if (this.f2746b < 0.0f) {
                        this.f2746b = 0.0f;
                        this.f2748d = 1.0f;
                        if (this.f2750f) {
                            m3788b();
                            if (!this.f2751g) {
                                return;
                            }
                        }
                    }
                } else {
                    if (this.f2746b > this.f2745a.f2846n) {
                        if (this.f2750f) {
                            m3789a(false);
                            m3788b();
                            if (!this.f2751g) {
                                return;
                            }
                        } else {
                            m3789a(false);
                            this.f2746b = 0.0f;
                            this.f2748d = 1.0f;
                        }
                    }
                    if (this.f2746b < 0.0f && !this.f2750f && f2 < 0.0f) {
                        this.f2746b = this.f2745a.f2846n;
                    }
                }
            }
            boolean z = false;
            if (this.f2751g) {
                z = true;
            }
            m3787b(z);
        }
    }

    /* renamed from: c */
    void m3786c() {
        C1136m c1136m = this.f2745a.f2844l;
        if (this.f2758n == null || this.f2758n.length < c1136m.size()) {
            this.f2758n = new float[c1136m.size()];
        }
        for (int i = 0; i < c1136m.size(); i++) {
            C0420c c0420c = (C0420c) c1136m.get(i);
            EnumC0427d enumC0427d = c0420c.f2682a;
            if (enumC0427d == EnumC0427d.scale) {
                this.f2758n[i] = this.f2757m.f2870c;
            } else if (enumC0427d == EnumC0427d.frame) {
                this.f2758n[i] = -99.0f;
            } else if (enumC0427d == EnumC0427d.legX) {
                if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                    this.f2758n[i] = this.f2757m.f2914dT[c0420c.f2683b].f2402p;
                } else {
                    this.f2758n[i] = 0.0f;
                    GameEngine.print("setBaseBlendValues: Target leg out of range for: " + this.f2757m.mo1747r().mo3513i());
                }
            } else if (enumC0427d == EnumC0427d.legY) {
                if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                    this.f2758n[i] = this.f2757m.f2914dT[c0420c.f2683b].f2403q;
                }
            } else if (enumC0427d == EnumC0427d.legDir) {
                if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                    this.f2757m.f2914dT[c0420c.f2683b].f2404r = C0773f.m2212a(this.f2757m.f2914dT[c0420c.f2683b].f2404r, false);
                    this.f2758n[i] = this.f2757m.f2914dT[c0420c.f2683b].f2404r;
                }
            } else if (enumC0427d == EnumC0427d.legHeight) {
                if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                    this.f2758n[i] = this.f2757m.f2914dT[c0420c.f2683b].f2390d;
                }
            } else if (enumC0427d == EnumC0427d.legAlpha) {
                if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                    this.f2758n[i] = this.f2757m.f2914dT[c0420c.f2683b].f2405s;
                }
            } else if (enumC0427d != EnumC0427d.event) {
                this.f2758n[i] = 0.0f;
                GameEngine.print("Unsupported blend type:" + enumC0427d);
            }
        }
    }

    /* renamed from: a */
    void m3789a(boolean z) {
        C1136m c1136m = this.f2745a.f2844l;
        for (int i = 0; i < c1136m.size(); i++) {
            C0420c c0420c = (C0420c) c1136m.get(i);
            if (c0420c.f2682a == EnumC0427d.event) {
                c0420c.m3866a(this.f2757m, this.f2747c, this.f2746b, z);
            }
        }
    }

    /* renamed from: b */
    void m3787b(boolean z) {
        float m3863b;
        C1136m c1136m = this.f2745a.f2844l;
        for (int i = 0; i < c1136m.size(); i++) {
            C0420c c0420c = (C0420c) c1136m.get(i);
            EnumC0427d enumC0427d = c0420c.f2682a;
            if (enumC0427d != EnumC0427d.frame || this.f2757m.f7170el || z) {
                if (z) {
                    m3863b = 0.0f;
                    if (enumC0427d == EnumC0427d.scale) {
                        m3863b = 1.0f;
                    } else if (enumC0427d == EnumC0427d.frame) {
                        m3863b = this.f2757m.f2891x.f2983Y;
                    } else if (enumC0427d == EnumC0427d.legAlpha) {
                        m3863b = 1.0f;
                        C0403ba[] c0403baArr = this.f2757m.f2891x.f3008ax;
                        if (c0403baArr != null && c0420c.f2683b < c0403baArr.length) {
                            m3863b = c0403baArr[c0420c.f2683b].f2476r;
                        }
                    }
                } else {
                    m3863b = c0420c.m3863b(this.f2746b);
                }
                if (this.f2755k > 0.0f && enumC0427d != EnumC0427d.frame) {
                    m3863b = (m3863b * (1.0f - this.f2755k)) + (this.f2758n[i] * this.f2755k);
                }
                if (enumC0427d == EnumC0427d.frame) {
                    this.f2757m.f2868a = (int) m3863b;
                } else if (enumC0427d == EnumC0427d.scale) {
                    this.f2757m.f2870c = m3863b;
                } else if (enumC0427d == EnumC0427d.legX) {
                    if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                        C0397i c0397i = this.f2757m.f2914dT[c0420c.f2683b];
                        c0397i.f2402p = m3863b;
                        c0397i.f2397k = true;
                        c0397i.f2401o = true;
                    }
                } else if (enumC0427d == EnumC0427d.legY) {
                    if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                        C0397i c0397i2 = this.f2757m.f2914dT[c0420c.f2683b];
                        c0397i2.f2403q = m3863b;
                        c0397i2.f2397k = true;
                        c0397i2.f2401o = true;
                    }
                } else if (enumC0427d == EnumC0427d.legDir) {
                    if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                        this.f2757m.f2914dT[c0420c.f2683b].f2404r = m3863b;
                    }
                } else if (enumC0427d == EnumC0427d.legHeight) {
                    if (this.f2757m.f2914dT != null && c0420c.f2683b < this.f2757m.f2914dT.length) {
                        this.f2757m.f2914dT[c0420c.f2683b].f2390d = m3863b;
                    }
                } else if (enumC0427d == EnumC0427d.legAlpha) {
                    C0397i[] c0397iArr = this.f2757m.f2914dT;
                    if (c0397iArr != null && c0420c.f2683b < c0397iArr.length) {
                        c0397iArr[c0420c.f2683b].f2405s = m3863b;
                    }
                } else if (enumC0427d != EnumC0427d.turretX && enumC0427d == EnumC0427d.event) {
                    c0420c.m3866a(this.f2757m, this.f2747c, this.f2746b, z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m3792a(C0446f c0446f) {
        return this.f2749e && this.f2745a == c0446f;
    }
}
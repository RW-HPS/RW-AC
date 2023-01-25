package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0403ba;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/h.class */
public class C0396h extends AbstractC0389a {

    /* renamed from: a */
    public static final AbstractC0389a f2383a = new C0396h();

    /* renamed from: b */
    static final Rect f2384b = new Rect();

    /* renamed from: c */
    static final RectF f2385c = new RectF();

    /* renamed from: d */
    static final Paint f2386d = new Paint();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        C0760e m2362c;
        C0458l c0458l = c0456j.f2891x;
        C0397i[] c0397iArr = c0456j.f2910dT;
        if (c0397iArr == null) {
            return;
        }
        if (f != 0.0f && c0456j.f2873f > 0.3d) {
            return;
        }
        C0402n dn = c0456j.m4201dn();
        if (dn != null && dn.f2448t) {
            return;
        }
        if (c0456j.f1656cN != null && dn == null) {
            for (C0397i c0397i : c0397iArr) {
                c0397i.f2399m = true;
            }
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = c0456j.f1623cg;
        if (c0458l.f3106dE) {
            f2 = c0456j.f1654cL[c0458l.f3108dG].f1717a;
        }
        float f3 = c0456j.f7172eo - c0456j.f2906dP;
        float f4 = c0456j.f7173ep - c0456j.f2907dQ;
        float f5 = c0456j.f7174eq - c0456j.f2908dR;
        float f6 = f2 - c0456j.f2909dS;
        boolean z = (f3 == 0.0f && f4 == 0.0f && f6 == 0.0f) ? false : true;
        c0456j.f2906dP = c0456j.f7172eo;
        c0456j.f2907dQ = c0456j.f7173ep;
        c0456j.f2908dR = c0456j.f7174eq;
        c0456j.f2909dS = f2;
        PointF n = c0456j.m2842n(15.0f);
        float f7 = n.x;
        float f8 = n.y;
        if (f7 != 0.0f || f8 != 0.0f) {
            float m2216a = C0773f.m2216a(0.0f, 0.0f, f7, f8);
            float m2138d = C0773f.m2138d(0.0f, 0.0f, f7, f8);
            float f9 = m2216a * 240.0f;
            if (f9 > 15.0f) {
                f9 = 15.0f;
            }
            f7 = C0773f.m2107k(m2138d) * f9;
            f8 = C0773f.m2110j(m2138d) * f9;
        }
        int i = 0;
        float f10 = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < c0397iArr.length; i3++) {
            C0397i c0397i2 = c0397iArr[i3];
            C0403ba c0403ba = c0458l.f3255ax[i3];
            boolean z2 = false;
            boolean z3 = false;
            if (c0397i2.f2399m) {
                z2 = true;
                c0397i2.f2399m = false;
                c0397i2.f2401o = true;
                if (c0397i2.f2400n) {
                    z3 = true;
                }
                c0397i2.f2400n = false;
            }
            if (!c0403ba.f2466h) {
                c0397i2.f2390d -= f5;
            }
            if (!c0403ba.f2470l) {
                if (z) {
                    c0397i2.f2388b -= f3;
                    c0397i2.f2389c -= f4;
                    c0397i2.f2401o = true;
                }
            } else if (z && f6 != 0.0f) {
                C0773f.f4971c.setSite(c0397i2.f2388b, c0397i2.f2389c);
                C0773f.m2215a(0.0f, 0.0f, f6, C0773f.f4971c);
                c0397i2.f2388b = C0773f.f4971c.x;
                c0397i2.f2389c = C0773f.f4971c.y;
                c0397i2.f2395i += f6;
                c0397i2.f2401o = true;
            }
            if (!c0403ba.f2474p) {
                if (c0403ba.f2504T != 0.0f) {
                    c0397i2.f2404r += c0403ba.f2504T * f;
                    c0397i2.f2404r %= 360.0f;
                }
                if (c0397i2.f2401o) {
                    float m2107k = C0773f.m2107k(f2);
                    float m2110j = C0773f.m2110j(f2);
                    float f11 = c0403ba.f2462d + c0397i2.f2402p;
                    float f12 = c0403ba.f2463e + c0397i2.f2403q;
                    c0397i2.f2392f = (m2107k * f12) - (m2110j * f11);
                    c0397i2.f2393g = (m2110j * f12) + (m2107k * f11);
                    if (z2) {
                        c0397i2.f2388b = c0397i2.f2392f;
                        c0397i2.f2389c = c0397i2.f2393g;
                        c0397i2.f2395i = f2 + c0403ba.f2467i;
                        c0397i2.f2401o = true;
                        if (z3) {
                            c0397i2.f2388b *= 0.6f;
                            c0397i2.f2389c *= 0.6f;
                            c0397i2.f2390d = -3.0f;
                        }
                    }
                    if (!c0403ba.f2470l) {
                        c0397i2.f2392f += f7 * c0403ba.f2471m;
                        c0397i2.f2393g += f8 * c0403ba.f2471m;
                    }
                    c0397i2.f2394h = C0773f.m2216a(c0397i2.f2388b, c0397i2.f2389c, c0397i2.f2392f, c0397i2.f2393g);
                    if (c0397i2.f2394h > f10) {
                        i2 = i3;
                        f10 = c0397i2.f2394h;
                    }
                    if (c0397i2.f2397k && !c0403ba.f2470l) {
                        i++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < c0397iArr.length; i4++) {
            C0397i c0397i3 = c0397iArr[i4];
            C0403ba c0403ba2 = c0458l.f3255ax[i4];
            if (!c0403ba2.f2474p) {
                float f13 = c0403ba2.f2465g;
                if (!c0403ba2.f2466h) {
                    f13 -= c0456j.f7174eq;
                }
                float f14 = f13 + c0403ba2.f2464f;
                if (c0397i3.f2394h > 90000.0f) {
                    c0397i3.f2388b = c0403ba2.f2462d;
                    c0397i3.f2389c = c0403ba2.f2463e;
                } else if (c0397i3.f2394h > c0403ba2.f2499O * c0403ba2.f2499O) {
                    float m2138d2 = C0773f.m2138d(c0397i3.f2392f, c0397i3.f2393g, c0397i3.f2388b, c0397i3.f2389c);
                    c0397i3.f2388b = c0397i3.f2392f + (C0773f.m2107k(m2138d2) * c0403ba2.f2499O);
                    c0397i3.f2389c = c0397i3.f2393g + (C0773f.m2110j(m2138d2) * c0403ba2.f2499O);
                    c0397i3.f2397k = true;
                }
                if (!c0397i3.f2397k && c0397i3.f2390d <= f13 + 0.1f && i < c0403ba2.f2496L && (i4 == i2 || !c0403ba2.f2497M)) {
                    boolean z4 = false;
                    if (c0403ba2.f2472n) {
                        for (int i5 = 0; i5 < c0403ba2.f2503S.length; i5++) {
                            if (c0397iArr[c0403ba2.f2503S[i5]].f2397k) {
                                z4 = true;
                            }
                        }
                    }
                    float f15 = c0403ba2.f2495K;
                    if (z4) {
                        f15 = c0403ba2.f2498N;
                    }
                    if (c0397i3.f2394h > f15 * f15) {
                        c0397i3.f2397k = true;
                        i++;
                    }
                }
                if (c0403ba2.f2470l) {
                    c0397i3.f2397k = true;
                }
                if (c0397i3.f2397k) {
                    if (c0397i3.f2390d > f14 || c0403ba2.f2470l) {
                        float f16 = f * c0403ba2.f2477s;
                        if (c0397i3.f2394h <= f16 * f16) {
                            c0397i3.f2388b = c0397i3.f2392f;
                            c0397i3.f2389c = c0397i3.f2393g;
                            c0397i3.f2401o = true;
                            c0397i3.f2397k = false;
                        } else {
                            float m2138d3 = C0773f.m2138d(c0397i3.f2388b, c0397i3.f2389c, c0397i3.f2392f, c0397i3.f2393g);
                            c0397i3.f2388b += C0773f.m2107k(m2138d3) * f16;
                            c0397i3.f2389c += C0773f.m2110j(m2138d3) * f16;
                            c0397i3.f2401o = true;
                        }
                        if (c0403ba2.f2470l && c0397i3.f2390d > f13) {
                            c0397i3.f2390d -= f * c0403ba2.f2480v;
                            if (c0397i3.f2390d <= f13) {
                                c0397i3.f2390d = f13;
                            }
                        }
                        c0397i3.f2395i += C0773f.m2150c(c0397i3.f2395i, f2 + c0403ba2.f2467i, c0403ba2.f2479u * f);
                        c0397i3.f2396j = false;
                    } else if (c0397i3.f2391e < c0403ba2.f2478t) {
                        c0397i3.f2391e += f;
                    } else {
                        c0397i3.f2390d += f * c0403ba2.f2480v;
                    }
                } else {
                    c0397i3.f2391e = 0.0f;
                    if (c0397i3.f2390d > f13) {
                        c0397i3.f2390d -= f * c0403ba2.f2480v;
                        if (c0397i3.f2390d <= f13) {
                            c0397i3.f2390d = f13;
                            float f17 = c0456j.f7172eo + c0397i3.f2388b;
                            float f18 = c0456j.f7173ep + c0397i3.f2389c;
                            c0397i3.f2398l = C1152y.m452c(f17, f18);
                            if (c0403ba2.f2493I && !c0397i3.f2396j) {
                                c0397i3.f2396j = true;
                                if (c0397i3.f2398l) {
                                    if (gameEngine.f6473dd && c0456j.f7169el) {
                                        gameEngine.f6329bR.m2384a(f17, f18, c0397i3.f2390d, 0, 0.0f, 0.0f);
                                    }
                                } else if (gameEngine.f6472dc && c0456j.f7169el && (m2362c = gameEngine.f6329bR.m2362c(f17, f18, c0397i3.f2390d, c0397i3.f2395i, 0)) != null) {
                                    m2362c.f4825P = 0.0f;
                                    m2362c.f4826Q = 0.0f;
                                    m2362c.f4816G = 1.6f;
                                    m2362c.f4815F = 2.8f;
                                }
                            }
                        }
                    } else if (c0397i3.f2398l && c0397i3.f2390d > (-3.0f) + f13) {
                        c0397i3.f2390d -= f * 0.3f;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3937a(C0456j c0456j, float f, boolean z, boolean z2) {
        C0397i[] c0397iArr = c0456j.f2910dT;
        if (c0397iArr == null) {
            return;
        }
        C0458l c0458l = c0456j.f2891x;
        float f2 = c0456j.f1623cg;
        if (c0458l.f3106dE) {
            f2 = c0456j.f1654cL[c0458l.f3108dG].f1717a;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (c0456j.f1633cq || c0456j.f1632cp) {
            for (int i = 0; i < c0458l.f3255ax.length; i++) {
                c0397iArr[i].f2399m = true;
            }
            c0456j.m3587dv();
        }
        float mo3631cD = c0456j.mo3631cD();
        Paint paint = null;
        boolean z3 = gameEngine.f6476dg || c0456j.f1632cp;
        for (int i2 = 0; i2 < c0397iArr.length; i2++) {
            C0403ba c0403ba = c0458l.f3255ax[i2];
            if ((c0403ba.f2500P == z || c0403ba.f2488D != null) && c0403ba.f2501Q == z2 && !c0403ba.f2474p && (c0403ba.f2475q == null || !c0403ba.f2475q.read(c0456j))) {
                C0397i c0397i = c0397iArr[i2];
                if (c0397i.f2405s > 0.0f) {
                    float f3 = c0456j.f7174eq + c0397i.f2390d;
                    if (paint == null) {
                        paint = c0456j.mo2974aN();
                    }
                    Paint paint2 = paint;
                    float f4 = 1.0f;
                    if (f3 < -0.3f) {
                        f4 = c0456j.m2849l(f3) * 0.003921569f;
                    }
                    if (c0397i.f2405s < 1.0f) {
                        f4 *= c0397i.f2405s;
                    }
                    if (f4 < 1.0f) {
                        int i3 = (int) (255.0f * f4);
                        if (paint2.m5192f() != i3) {
                            f2386d.m5220a(paint2);
                            int m5192f = f2386d.m5192f();
                            if (m5192f < i3) {
                                i3 = m5192f;
                            }
                            f2386d.m5201c(i3);
                            paint2 = f2386d;
                        }
                    }
                    float f5 = (c0456j.f7172eo + c0397i.f2388b) - gameEngine.f6357cw;
                    float f6 = (((c0456j.f7173ep + c0397i.f2389c) - gameEngine.f6358cx) - c0397i.f2390d) - c0456j.f7174eq;
                    InterfaceC1063y interfaceC1063y = gameEngine.f6326bO;
                    if (mo3631cD != 1.0f) {
                        interfaceC1063y.mo136k();
                        interfaceC1063y.mo227a(mo3631cD, mo3631cD, f5, f6);
                    }
                    if (c0403ba.f2488D != null && !z && gameEngine.f6475df && c0397i.f2390d + c0456j.f7174eq > 0.0f) {
                        interfaceC1063y.mo200a(c0403ba.f2488D, f5, f6 + c0397i.f2390d + c0456j.f7174eq, c0397i.f2395i + c0397i.f2404r + c0403ba.f2502R, c0456j.m3042R());
                    }
                    if (c0403ba.f2500P == z) {
                        C0970e c0970e = c0403ba.f2486B;
                        if (c0403ba.f2487C != null) {
                            c0970e = c0403ba.f2487C[c0456j.f1614bX.m4454R()];
                        }
                        if (!c0403ba.f2492H && ((z3 || c0403ba.f2491G) && c0970e != null)) {
                            interfaceC1063y.mo200a(c0970e, f5, f6, c0397i.f2395i + c0397i.f2404r + c0403ba.f2502R, paint2);
                        }
                        C0970e c0970e2 = c0403ba.f2482x;
                        if (c0403ba.f2483y != null) {
                            c0970e2 = c0403ba.f2483y[c0456j.f1614bX.m4454R()];
                        }
                        if (c0970e2 != null && (z3 || c0403ba.f2490F)) {
                            float f7 = c0970e2.f6625u;
                            float f8 = f7;
                            float m2107k = C0773f.m2107k(f2);
                            float m2110j = C0773f.m2110j(f2);
                            float f9 = (m2107k * c0403ba.f2469k) - (m2110j * c0403ba.f2468j);
                            float f10 = (m2110j * c0403ba.f2469k) + (m2107k * c0403ba.f2468j);
                            float m2138d = C0773f.m2138d(c0397i.f2388b, c0397i.f2389c, f9, f10);
                            float m2216a = C0773f.m2216a(c0397i.f2388b, c0397i.f2389c, f9, f10);
                            if (m2216a < (f7 - 2.0f) * (f7 - 2.0f)) {
                                f8 = C0773f.m2211a((int) m2216a);
                            }
                            interfaceC1063y.mo136k();
                            interfaceC1063y.mo228a(m2138d + 90.0f, f5, f6);
                            f2384b.m5172a(0, (int) (f7 - f8), c0970e2.f6620p, (int) (f7 + f8));
                            f2385c.m5158a(f5 - c0970e2.f6622r, f6 - f8, f5 + c0970e2.f6622r, f6 + f8);
                            interfaceC1063y.mo193a(c0970e2, f2384b, f2385c, paint2);
                            interfaceC1063y.mo135l();
                        }
                        if (c0403ba.f2492H && ((z3 || c0403ba.f2491G) && c0970e != null)) {
                            interfaceC1063y.mo200a(c0970e, f5, f6, c0397i.f2395i + c0397i.f2404r + c0403ba.f2502R, paint2);
                        }
                    }
                    if (mo3631cD != 1.0f) {
                        interfaceC1063y.mo135l();
                    }
                }
            }
        }
    }
}
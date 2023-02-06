package com.corrodinggames.rts.game.units.custom.b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.ba;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/h.class */
public class h extends a {
    public static final a a = new h();
    static final Rect b = new Rect();
    static final RectF c = new RectF();
    static final Paint d = new Paint();

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        com.corrodinggames.rts.gameFramework.emitter.e c2;
        com.corrodinggames.rts.game.units.custom.l lVar = jVar.x;
        i[] iVarArr = jVar.dT;
        if (iVarArr == null) {
            return;
        }
        if (f != 0.0f && jVar.f > 0.3d) {
            return;
        }
        n dn = jVar.dn();
        if (dn != null && dn.t) {
            return;
        }
        if (jVar.cN != null && dn == null) {
            for (i iVar : iVarArr) {
                iVar.m = true;
            }
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = jVar.cg;
        if (lVar.dE) {
            f2 = jVar.cL[lVar.dG].a;
        }
        float f3 = jVar.eo - jVar.dP;
        float f4 = jVar.ep - jVar.dQ;
        float f5 = jVar.eq - jVar.dR;
        float f6 = f2 - jVar.dS;
        boolean z = (f3 == 0.0f && f4 == 0.0f && f6 == 0.0f) ? false : true;
        jVar.dP = jVar.eo;
        jVar.dQ = jVar.ep;
        jVar.dR = jVar.eq;
        jVar.dS = f2;
        PointF n = jVar.n(15.0f);
        float f7 = n.x;
        float f8 = n.y;
        if (f7 != 0.0f || f8 != 0.0f) {
            float a2 = com.corrodinggames.rts.gameFramework.f.a(0.0f, 0.0f, f7, f8);
            float d2 = com.corrodinggames.rts.gameFramework.f.d(0.0f, 0.0f, f7, f8);
            float f9 = a2 * 240.0f;
            if (f9 > 15.0f) {
                f9 = 15.0f;
            }
            f7 = com.corrodinggames.rts.gameFramework.f.k(d2) * f9;
            f8 = com.corrodinggames.rts.gameFramework.f.j(d2) * f9;
        }
        int i = 0;
        float f10 = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < iVarArr.length; i3++) {
            i iVar2 = iVarArr[i3];
            ba baVar = lVar.ax[i3];
            boolean z2 = false;
            boolean z3 = false;
            if (iVar2.m) {
                z2 = true;
                iVar2.m = false;
                iVar2.o = true;
                if (iVar2.n) {
                    z3 = true;
                }
                iVar2.n = false;
            }
            if (!baVar.h) {
                iVar2.d -= f5;
            }
            if (!baVar.l) {
                if (z) {
                    iVar2.b -= f3;
                    iVar2.c -= f4;
                    iVar2.o = true;
                }
            } else if (z && f6 != 0.0f) {
                com.corrodinggames.rts.gameFramework.f.c.setSite(iVar2.b, iVar2.c);
                com.corrodinggames.rts.gameFramework.f.a(0.0f, 0.0f, f6, com.corrodinggames.rts.gameFramework.f.c);
                iVar2.b = com.corrodinggames.rts.gameFramework.f.c.x;
                iVar2.c = com.corrodinggames.rts.gameFramework.f.c.y;
                iVar2.i += f6;
                iVar2.o = true;
            }
            if (!baVar.p) {
                if (baVar.T != 0.0f) {
                    iVar2.r += baVar.T * f;
                    iVar2.r %= 360.0f;
                }
                if (iVar2.o) {
                    float k = com.corrodinggames.rts.gameFramework.f.k(f2);
                    float j = com.corrodinggames.rts.gameFramework.f.j(f2);
                    float f11 = baVar.d + iVar2.p;
                    float f12 = baVar.e + iVar2.q;
                    iVar2.f = (k * f12) - (j * f11);
                    iVar2.g = (j * f12) + (k * f11);
                    if (z2) {
                        iVar2.b = iVar2.f;
                        iVar2.c = iVar2.g;
                        iVar2.i = f2 + baVar.i;
                        iVar2.o = true;
                        if (z3) {
                            iVar2.b *= 0.6f;
                            iVar2.c *= 0.6f;
                            iVar2.d = -3.0f;
                        }
                    }
                    if (!baVar.l) {
                        iVar2.f += f7 * baVar.m;
                        iVar2.g += f8 * baVar.m;
                    }
                    iVar2.h = com.corrodinggames.rts.gameFramework.f.a(iVar2.b, iVar2.c, iVar2.f, iVar2.g);
                    if (iVar2.h > f10) {
                        i2 = i3;
                        f10 = iVar2.h;
                    }
                    if (iVar2.k && !baVar.l) {
                        i++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < iVarArr.length; i4++) {
            i iVar3 = iVarArr[i4];
            ba baVar2 = lVar.ax[i4];
            if (!baVar2.p) {
                float f13 = baVar2.g;
                if (!baVar2.h) {
                    f13 -= jVar.eq;
                }
                float f14 = f13 + baVar2.f;
                if (iVar3.h > 90000.0f) {
                    iVar3.b = baVar2.d;
                    iVar3.c = baVar2.e;
                } else if (iVar3.h > baVar2.O * baVar2.O) {
                    float d3 = com.corrodinggames.rts.gameFramework.f.d(iVar3.f, iVar3.g, iVar3.b, iVar3.c);
                    iVar3.b = iVar3.f + (com.corrodinggames.rts.gameFramework.f.k(d3) * baVar2.O);
                    iVar3.c = iVar3.g + (com.corrodinggames.rts.gameFramework.f.j(d3) * baVar2.O);
                    iVar3.k = true;
                }
                if (!iVar3.k && iVar3.d <= f13 + 0.1f && i < baVar2.L && (i4 == i2 || !baVar2.M)) {
                    boolean z4 = false;
                    if (baVar2.n) {
                        for (int i5 = 0; i5 < baVar2.S.length; i5++) {
                            if (iVarArr[baVar2.S[i5]].k) {
                                z4 = true;
                            }
                        }
                    }
                    float f15 = baVar2.K;
                    if (z4) {
                        f15 = baVar2.N;
                    }
                    if (iVar3.h > f15 * f15) {
                        iVar3.k = true;
                        i++;
                    }
                }
                if (baVar2.l) {
                    iVar3.k = true;
                }
                if (iVar3.k) {
                    if (iVar3.d > f14 || baVar2.l) {
                        float f16 = f * baVar2.s;
                        if (iVar3.h <= f16 * f16) {
                            iVar3.b = iVar3.f;
                            iVar3.c = iVar3.g;
                            iVar3.o = true;
                            iVar3.k = false;
                        } else {
                            float d4 = com.corrodinggames.rts.gameFramework.f.d(iVar3.b, iVar3.c, iVar3.f, iVar3.g);
                            iVar3.b += com.corrodinggames.rts.gameFramework.f.k(d4) * f16;
                            iVar3.c += com.corrodinggames.rts.gameFramework.f.j(d4) * f16;
                            iVar3.o = true;
                        }
                        if (baVar2.l && iVar3.d > f13) {
                            iVar3.d -= f * baVar2.v;
                            if (iVar3.d <= f13) {
                                iVar3.d = f13;
                            }
                        }
                        iVar3.i += com.corrodinggames.rts.gameFramework.f.c(iVar3.i, f2 + baVar2.i, baVar2.u * f);
                        iVar3.j = false;
                    } else if (iVar3.e < baVar2.t) {
                        iVar3.e += f;
                    } else {
                        iVar3.d += f * baVar2.v;
                    }
                } else {
                    iVar3.e = 0.0f;
                    if (iVar3.d > f13) {
                        iVar3.d -= f * baVar2.v;
                        if (iVar3.d <= f13) {
                            iVar3.d = f13;
                            float f17 = jVar.eo + iVar3.b;
                            float f18 = jVar.ep + iVar3.c;
                            iVar3.l = y.c(f17, f18);
                            if (baVar2.I && !iVar3.j) {
                                iVar3.j = true;
                                if (iVar3.l) {
                                    if (gameEngine.dd && jVar.el) {
                                        gameEngine.bR.a(f17, f18, iVar3.d, 0, 0.0f, 0.0f);
                                    }
                                } else if (gameEngine.dc && jVar.el && (c2 = gameEngine.bR.c(f17, f18, iVar3.d, iVar3.i, 0)) != null) {
                                    c2.P = 0.0f;
                                    c2.Q = 0.0f;
                                    c2.G = 1.6f;
                                    c2.F = 2.8f;
                                }
                            }
                        }
                    } else if (iVar3.l && iVar3.d > (-3.0f) + f13) {
                        iVar3.d -= f * 0.3f;
                    }
                }
            }
        }
    }

    public static void a(com.corrodinggames.rts.game.units.custom.j jVar, float f, boolean z, boolean z2) {
        i[] iVarArr = jVar.dT;
        if (iVarArr == null) {
            return;
        }
        com.corrodinggames.rts.game.units.custom.l lVar = jVar.x;
        float f2 = jVar.cg;
        if (lVar.dE) {
            f2 = jVar.cL[lVar.dG].a;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (jVar.cq || jVar.cp) {
            for (int i = 0; i < lVar.ax.length; i++) {
                iVarArr[i].m = true;
            }
            jVar.dv();
        }
        float cD = jVar.cD();
        Paint paint = null;
        boolean z3 = gameEngine.dg || jVar.cp;
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            ba baVar = lVar.ax[i2];
            if ((baVar.P == z || baVar.D != null) && baVar.Q == z2 && !baVar.p && (baVar.q == null || !baVar.q.read(jVar))) {
                i iVar = iVarArr[i2];
                if (iVar.s > 0.0f) {
                    float f3 = jVar.eq + iVar.d;
                    if (paint == null) {
                        paint = jVar.aN();
                    }
                    Paint paint2 = paint;
                    float f4 = 1.0f;
                    if (f3 < -0.3f) {
                        f4 = jVar.l(f3) * 0.003921569f;
                    }
                    if (iVar.s < 1.0f) {
                        f4 *= iVar.s;
                    }
                    if (f4 < 1.0f) {
                        int i3 = (int) (255.0f * f4);
                        if (paint2.f() != i3) {
                            d.a(paint2);
                            int f5 = d.f();
                            if (f5 < i3) {
                                i3 = f5;
                            }
                            d.c(i3);
                            paint2 = d;
                        }
                    }
                    float f6 = (jVar.eo + iVar.b) - gameEngine.cw;
                    float f7 = (((jVar.ep + iVar.c) - gameEngine.cx) - iVar.d) - jVar.eq;
                    com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
                    if (cD != 1.0f) {
                        yVar.k();
                        yVar.a(cD, cD, f6, f7);
                    }
                    if (baVar.D != null && !z && gameEngine.df && iVar.d + jVar.eq > 0.0f) {
                        yVar.a(baVar.D, f6, f7 + iVar.d + jVar.eq, iVar.i + iVar.r + baVar.R, jVar.R());
                    }
                    if (baVar.P == z) {
                        com.corrodinggames.rts.gameFramework.unitAction.e eVar = baVar.B;
                        if (baVar.C != null) {
                            eVar = baVar.C[jVar.bX.R()];
                        }
                        if (!baVar.H && ((z3 || baVar.G) && eVar != null)) {
                            yVar.a(eVar, f6, f7, iVar.i + iVar.r + baVar.R, paint2);
                        }
                        com.corrodinggames.rts.gameFramework.unitAction.e eVar2 = baVar.x;
                        if (baVar.y != null) {
                            eVar2 = baVar.y[jVar.bX.R()];
                        }
                        if (eVar2 != null && (z3 || baVar.F)) {
                            float f8 = eVar2.u;
                            float f9 = f8;
                            float k = com.corrodinggames.rts.gameFramework.f.k(f2);
                            float j = com.corrodinggames.rts.gameFramework.f.j(f2);
                            float f10 = (k * baVar.k) - (j * baVar.j);
                            float f11 = (j * baVar.k) + (k * baVar.j);
                            float d2 = com.corrodinggames.rts.gameFramework.f.d(iVar.b, iVar.c, f10, f11);
                            float a2 = com.corrodinggames.rts.gameFramework.f.a(iVar.b, iVar.c, f10, f11);
                            if (a2 < (f8 - 2.0f) * (f8 - 2.0f)) {
                                f9 = com.corrodinggames.rts.gameFramework.f.a((int) a2);
                            }
                            yVar.k();
                            yVar.a(d2 + 90.0f, f6, f7);
                            b.a(0, (int) (f8 - f9), eVar2.p, (int) (f8 + f9));
                            c.a(f6 - eVar2.r, f7 - f9, f6 + eVar2.r, f7 + f9);
                            yVar.a(eVar2, b, c, paint2);
                            yVar.l();
                        }
                        if (baVar.H && ((z3 || baVar.G) && eVar != null)) {
                            yVar.a(eVar, f6, f7, iVar.i + iVar.r + baVar.R, paint2);
                        }
                    }
                    if (cD != 1.0f) {
                        yVar.l();
                    }
                }
            }
        }
    }
}
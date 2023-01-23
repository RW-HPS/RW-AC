package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aq.class */
public final class aq {

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f204a = new Paint();
    static final Point b = new Point();
    static final Rect c = new Rect();
    static final PointF d = new PointF();
    static final PointF e = new PointF();
    static final PointF f = new PointF();
    static final PointF g = new PointF();
    static final PointF h = new PointF();
    static final PointF i = new PointF();
    static final PointF j = new PointF();

    private static Point a(ao aoVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        com.corrodinggames.rts.gameFramework.k.l lVar = GameEngine.getGameEngine().bU;
        com.corrodinggames.rts.gameFramework.k.i a2 = lVar.a(aoVar);
        int d2 = com.corrodinggames.rts.gameFramework.f.d(i4 - i2);
        int d3 = com.corrodinggames.rts.gameFramework.f.d(i5 - i3);
        int i9 = i2;
        int i10 = i3;
        int i11 = 1 + d2 + d3;
        int i12 = i4 > i2 ? 1 : -1;
        int i13 = i5 > i3 ? 1 : -1;
        int i14 = d2 - d3;
        int i15 = d2 * 2;
        int i16 = d3 * 2;
        int i17 = 0;
        while (i11 > 0) {
            int i18 = i9;
            int i19 = i10;
            if (i7 != 0 && lVar.c(a2, i18, i19) < i7) {
                b.a(i18, i19);
                return b;
            }
            if (i6 != 0) {
                int b2 = lVar.b(a2, i18, i19);
                if (b2 == -1) {
                    b.a(i18, i19);
                    return b;
                }
                if (i8 > 0) {
                    i8--;
                } else {
                    i17 += b2;
                }
                if (i17 >= i6) {
                    b.a(i18, i19);
                    return b;
                }
            } else if (lVar.a(a2, i18, i19)) {
                b.a(i18, i19);
                return b;
            }
            if (i14 > 0) {
                i9 += i12;
                i14 -= i16;
            } else if (i14 < 0) {
                i10 += i13;
                i14 += i15;
            } else if (i14 == 0) {
                i9 += i12;
                i10 += i13;
                i14 = (i14 - i16) + i15;
                i11--;
            }
            i11--;
        }
        return null;
    }

    public static boolean a(ao aoVar, float f2, float f3, float f4, float f5, int i2, int i3, int i4) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bU.a(gameEngine.bU.a(aoVar), true);
        return b(aoVar, f2, f3, f4, f5, i2, i3, i4);
    }

    public static boolean b(ao aoVar, float f2, float f3, float f4, float f5, int i2, int i3, int i4) {
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        bVar.a(f2, f3);
        int i5 = bVar.T;
        int i6 = bVar.U;
        bVar.a(f4, f5);
        return a(aoVar, i5, i6, bVar.T, bVar.U, i2, i3, i4) == null;
    }

    public static PointF a(ao aoVar, float f2, float f3, float f4, float f5, int i2, int i3, boolean z) {
        com.corrodinggames.rts.gameFramework.k.l lVar = GameEngine.getGameEngine().bU;
        c.a(i2, i3, i2 + 1, i3 + 1);
        d.setSite(f2, f3);
        e.setSite(f4, f5);
        f.setSite(e);
        boolean z2 = true;
        g.setSite(c.f47a, c.d);
        h.setSite(c.c, c.b);
        i.setSite(c.f47a, c.b);
        j.setSite(c.c, c.d);
        if (d.y < e.y) {
            if ((z || !lVar.a(aoVar, i2, i3 - 1)) && com.corrodinggames.rts.gameFramework.f.a(d, e, i, h)) {
                z2 = true;
            }
        } else {
            if ((z || !lVar.a(aoVar, i2, i3 + 1)) && com.corrodinggames.rts.gameFramework.f.a(d, e, g, j)) {
                z2 = true;
            }
        }
        if (d.x < e.x) {
            if ((z || !lVar.a(aoVar, i2 - 1, i3)) && com.corrodinggames.rts.gameFramework.f.a(d, e, i, g)) {
                z2 = true;
            }
        } else {
            if ((z || !lVar.a(aoVar, i2 + 1, i3)) && com.corrodinggames.rts.gameFramework.f.a(d, e, h, j)) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        if (!z2) {
            f.x = i2 + 1 + 0.01f;
        }
        if (z2) {
            f.x = i2 - 0.01f;
        }
        if (z2) {
            f.y = i3 + 1 + 0.01f;
        }
        if (z2) {
            f.y = i3 - 0.01f;
        }
        return f;
    }

    public static boolean a(y yVar, am amVar) {
        if (amVar.cN != null || !yVar.k(amVar) || !amVar.d((am) yVar)) {
            return false;
        }
        return true;
    }

    public static boolean b(y yVar, am amVar) {
        if (!a(yVar, amVar) || !yVar.h(amVar) || !yVar.i(amVar)) {
            return false;
        }
        return true;
    }
}
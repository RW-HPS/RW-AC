package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p043k.C0940i;
import com.corrodinggames.rts.gameFramework.p043k.C0943l;

/* renamed from: com.corrodinggames.rts.game.units.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aq.class */
public final class C0248aq {

    /* renamed from: a */
    public static final Paint f1730a = new Paint();

    /* renamed from: b */
    static final Point f1731b = new Point();

    /* renamed from: c */
    static final Rect f1732c = new Rect();

    /* renamed from: d */
    static final PointF f1733d = new PointF();

    /* renamed from: e */
    static final PointF f1734e = new PointF();

    /* renamed from: f */
    static final PointF f1735f = new PointF();

    /* renamed from: g */
    static final PointF f1736g = new PointF();

    /* renamed from: h */
    static final PointF f1737h = new PointF();

    /* renamed from: i */
    static final PointF f1738i = new PointF();

    /* renamed from: j */
    static final PointF f1739j = new PointF();

    /* renamed from: a */
    private static Point m4182a(EnumC0246ao enumC0246ao, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C0943l c0943l = GameEngine.getGameEngine().f6380bU;
        C0940i m1178a = c0943l.m1178a(enumC0246ao);
        int m2137d = C0773f.m2137d(i3 - i);
        int m2137d2 = C0773f.m2137d(i4 - i2);
        int i8 = i;
        int i9 = i2;
        int i10 = 1 + m2137d + m2137d2;
        int i11 = i3 > i ? 1 : -1;
        int i12 = i4 > i2 ? 1 : -1;
        int i13 = m2137d - m2137d2;
        int i14 = m2137d * 2;
        int i15 = m2137d2 * 2;
        int i16 = 0;
        while (i10 > 0) {
            int i17 = i8;
            int i18 = i9;
            if (i6 != 0 && c0943l.m1159c(m1178a, i17, i18) < i6) {
                f1731b.m5175a(i17, i18);
                return f1731b;
            }
            if (i5 != 0) {
                int m1163b = c0943l.m1163b(m1178a, i17, i18);
                if (m1163b == -1) {
                    f1731b.m5175a(i17, i18);
                    return f1731b;
                }
                if (i7 > 0) {
                    i7--;
                } else {
                    i16 += m1163b;
                }
                if (i16 >= i5) {
                    f1731b.m5175a(i17, i18);
                    return f1731b;
                }
            } else if (c0943l.m1175a(m1178a, i17, i18)) {
                f1731b.m5175a(i17, i18);
                return f1731b;
            }
            if (i13 > 0) {
                i8 += i11;
                i13 -= i15;
            } else if (i13 < 0) {
                i9 += i12;
                i13 += i14;
            } else if (i13 == 0) {
                i8 += i11;
                i9 += i12;
                i13 = (i13 - i15) + i14;
                i10--;
            }
            i10--;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m4184a(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6380bU.m1173a(gameEngine.f6380bU.m1178a(enumC0246ao), true);
        return m4180b(enumC0246ao, f, f2, f3, f4, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m4180b(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        C0173b c0173b = GameEngine.getGameEngine().f6371bL;
        c0173b.m4662a(f, f2);
        int i4 = c0173b.f829T;
        int i5 = c0173b.f830U;
        c0173b.m4662a(f3, f4);
        return m4182a(enumC0246ao, i4, i5, c0173b.f829T, c0173b.f830U, i, i2, i3) == null;
    }

    /* renamed from: a */
    public static PointF m4183a(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        C0943l c0943l = GameEngine.getGameEngine().f6380bU;
        f1732c.m5166a(i, i2, i + 1, i2 + 1);
        f1733d.setSite(f, f2);
        f1734e.setSite(f3, f4);
        f1735f.setSite(f1734e);
        boolean z2 = true;
        f1736g.setSite(f1732c.f230a, f1732c.f233d);
        f1737h.setSite(f1732c.f232c, f1732c.f231b);
        f1738i.setSite(f1732c.f230a, f1732c.f231b);
        f1739j.setSite(f1732c.f232c, f1732c.f233d);
        if (f1733d.y < f1734e.y) {
            if ((z || !c0943l.m1177a(enumC0246ao, i, i2 - 1)) && C0773f.m2204a(f1733d, f1734e, f1738i, f1737h)) {
                z2 = true;
            }
        } else {
            if ((z || !c0943l.m1177a(enumC0246ao, i, i2 + 1)) && C0773f.m2204a(f1733d, f1734e, f1736g, f1739j)) {
                z2 = true;
            }
        }
        if (f1733d.x < f1734e.x) {
            if ((z || !c0943l.m1177a(enumC0246ao, i - 1, i2)) && C0773f.m2204a(f1733d, f1734e, f1738i, f1736g)) {
                z2 = true;
            }
        } else {
            if ((z || !c0943l.m1177a(enumC0246ao, i + 1, i2)) && C0773f.m2204a(f1733d, f1734e, f1737h, f1739j)) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        if (!z2) {
            f1735f.x = i + 1 + 0.01f;
        }
        if (z2) {
            f1735f.x = i - 0.01f;
        }
        if (z2) {
            f1735f.y = i2 + 1 + 0.01f;
        }
        if (z2) {
            f1735f.y = i2 - 0.01f;
        }
        return f1735f;
    }

    /* renamed from: a */
    public static boolean m4181a(AbstractC0629y abstractC0629y, AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1656cN != null || !abstractC0629y.mo2850k(abstractC0244am) || !abstractC0244am.mo3072d((AbstractC0244am) abstractC0629y)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4179b(AbstractC0629y abstractC0629y, AbstractC0244am abstractC0244am) {
        if (!m4181a(abstractC0629y, abstractC0244am) || !abstractC0629y.m2861h(abstractC0244am) || !abstractC0629y.m2857i(abstractC0244am)) {
            return false;
        }
        return true;
    }
}
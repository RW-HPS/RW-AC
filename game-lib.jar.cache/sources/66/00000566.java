package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0820d;

/* renamed from: com.corrodinggames.rts.gameFramework.m.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/aa.class */
public final class C0960aa {

    /* renamed from: b */
    static float f6531b;

    /* renamed from: c */
    static float f6532c;

    /* renamed from: d */
    static float f6533d;

    /* renamed from: f */
    static C0961ab[] f6534f;

    /* renamed from: g */
    static Paint f6535g;

    /* renamed from: a */
    static int f6536a = -1;

    /* renamed from: e */
    public static final Rect f6537e = new Rect();

    /* renamed from: h */
    static final Rect f6538h = new Rect();

    /* renamed from: i */
    static final Rect f6539i = new Rect();

    /* renamed from: j */
    static final RectF f6540j = new RectF();

    /* renamed from: a */
    public static final Bitmap m950a(C0970e c0970e) {
        return c0970e.mo391b();
    }

    /* renamed from: a */
    public static void m943a(String str, float f, float f2, Paint paint) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String[] m2145c = C0773f.m2145c(str, '\n');
        float m1922b = C0820d.m1922b(paint);
        float length = (m2145c.length - 1) * m1922b;
        int i = 0;
        for (String str2 : m2145c) {
            gameEngine.f6326bO.mo182a(str2, f, (f2 - (length / 2.0f)) + (i * m1922b) + (m1922b / 2.0f), paint);
            i++;
        }
    }

    /* renamed from: a */
    public static void m948a(InterfaceC1063y interfaceC1063y, float f, float f2, float f3, Paint paint) {
        if (GameEngine.m1030at()) {
            m949a(interfaceC1063y, f, f2, f3, 40, paint, GameEngine.getGameEngine().f6467cQ);
        } else {
            interfaceC1063y.mo224a(f, f2, f3, paint);
        }
    }

    /* renamed from: a */
    public static C0961ab m954a(float f, float f2, boolean z, InterfaceC1063y interfaceC1063y) {
        int i;
        int i2;
        int i3 = (int) f2;
        int i4 = 0;
        if (((int) f) > 20) {
            i4 = 1;
            i = 60;
        } else {
            i = 30;
        }
        int i5 = 0;
        if (i3 >= 2) {
            i5 = 1;
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i6 = i4 + (i5 * 2) + (z ? 0 : 2 + (2 * 2));
        if (f6534f == null) {
            f6534f = new C0961ab[((2 + (2 * 2)) * 2) + 1];
        }
        if (f6534f[i6] != null) {
            if (f6534f[i6].f6542b != i) {
                GameEngine.m5460e("Mismatch on index: " + i6 + " size:" + i);
            }
            return f6534f[i6];
        }
        C0961ab c0961ab = new C0961ab();
        c0961ab.f6544d = m952a(i, i2, z, interfaceC1063y);
        c0961ab.f6542b = i;
        c0961ab.f6541a = i2;
        c0961ab.f6543c = z;
        f6534f[i6] = c0961ab;
        return c0961ab;
    }

    /* renamed from: a */
    public static C0970e m952a(int i, int i2, boolean z, InterfaceC1063y interfaceC1063y) {
        Paint paint = new Paint();
        paint.m5206b(-1);
        paint.m5221a(z ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.m5231a(i2);
        C0970e mo166b = interfaceC1063y.mo166b((i * 2) + 4, (i * 2) + 4, true);
        InterfaceC1063y mo161b = interfaceC1063y.mo161b(mo166b);
        mo161b.mo168b(i + 2, i + 2, i, paint);
        mo161b.mo131p();
        mo166b.mo49p();
        mo161b.mo130q();
        return mo166b;
    }

    /* renamed from: a */
    public static void m947a(InterfaceC1063y interfaceC1063y, float f, float f2, float f3, Paint paint, float f4) {
        if (f6535g == null) {
            f6535g = new Paint();
            f6535g.mo914a(true);
            f6535g.m5203b(true);
        }
        int m5194e = paint.m5194e();
        if (GameEngine.m1030at()) {
            f6535g.m5225a(new LightingColorFilter(m5194e, 0));
        }
        f6535g.m5206b(m5194e);
        C0961ab m954a = m954a(f3 * f4, paint.m5190g(), paint.m5198d() == Paint.Style.FILL, interfaceC1063y);
        float f5 = f3 / m954a.f6542b;
        float f6 = (-f3) - (f5 * 2.0f);
        interfaceC1063y.mo198a(m954a.f6544d, f + f6, f2 + f6, f6535g, 0.0f, f5);
    }

    /* renamed from: a */
    public static void m949a(InterfaceC1063y interfaceC1063y, float f, float f2, float f3, int i, Paint paint, Rect rect) {
        if (f6536a != i) {
            f6536a = i;
            f6531b = 6.283185f / i;
            f6532c = C0773f.m2107k(f6531b);
            f6533d = C0773f.m2110j(f6531b);
        }
        float f4 = f6532c;
        float f5 = f6533d;
        int i2 = ((int) (f6531b * f3 * 0.5f)) + 50;
        f6537e.f230a = rect.f230a - i2;
        f6537e.f231b = rect.f231b - i2;
        f6537e.f232c = rect.f232c + i2;
        f6537e.f233d = rect.f233d + i2;
        float f6 = f3;
        float f7 = 0.0f;
        int i3 = i + 1;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z = true;
        for (int i4 = 0; i4 < i3; i4++) {
            float f12 = f6 + f;
            float f13 = f7 + f2;
            if (z) {
                z = false;
                f8 = f12;
                f9 = f13;
            } else if (f6537e.m5169b((int) f12, (int) f13) || f6537e.m5169b((int) f10, (int) f11)) {
                interfaceC1063y.mo226a(f12, f13, f10, f11, paint);
            }
            f10 = f12;
            f11 = f13;
            float f14 = f6;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f14) + (f4 * f7);
        }
        if (f6537e.m5169b((int) f8, (int) f9) || f6537e.m5169b((int) f10, (int) f11)) {
            interfaceC1063y.mo226a(f8, f9, f10, f11, paint);
        }
    }

    /* renamed from: a */
    public static final int m953a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static final int m942b(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: c */
    public static final int m941c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static final int m940d(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public static void m946a(InterfaceC1063y interfaceC1063y, C0970e c0970e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        int mo387m = c0970e.mo387m();
        int mo388l = c0970e.mo388l();
        if (i != 0) {
            i %= c0970e.mo387m();
            if (i < 0) {
                i += c0970e.mo387m();
            }
        }
        if (i2 != 0) {
            i2 %= c0970e.mo388l();
            if (i2 < 0) {
                i2 += c0970e.mo388l();
            }
        }
        int i5 = rect.f230a - i;
        int i6 = rect.f231b - i2;
        int i7 = mo387m - i3;
        int i8 = mo388l - i4;
        if (i7 <= 0 || i8 <= 0) {
            return;
        }
        int i9 = 0;
        while (i5 < rect.f232c) {
            while (i6 < rect.f233d) {
                i9++;
                if (i9 > 2000) {
                    GameEngine.m5460e("tileImage hit limit");
                    return;
                }
                int i10 = rect.f232c - i5;
                if (i10 > mo387m) {
                    i10 = mo387m;
                }
                int i11 = rect.f233d - i6;
                if (i11 > mo388l) {
                    i11 = mo388l;
                }
                if (i11 > 0 && i10 > 0) {
                    f6538h.m5172a(0, 0, i10, i11);
                    f6539i.m5172a(i5, i6, i5 + i10, i6 + i11);
                    int i12 = f6539i.f230a - rect.f230a;
                    if (i12 < 0) {
                        f6538h.f230a -= i12;
                        f6539i.f230a -= i12;
                    }
                    int i13 = f6539i.f231b - rect.f231b;
                    if (i13 < 0) {
                        f6538h.f231b -= i13;
                        f6539i.f231b -= i13;
                    }
                    interfaceC1063y.mo194a(c0970e, f6538h, f6539i, paint);
                    i6 += i8;
                }
                i5 += i7;
                i6 = rect.f231b - i2;
            }
            i5 += i7;
            i6 = rect.f231b - i2;
        }
    }

    /* renamed from: a */
    public static void m944a(InterfaceC1063y interfaceC1063y, C0970e c0970e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        Rect rect;
        Rect rect2;
        int mo387m = c0970e.mo387m();
        int mo388l = c0970e.mo388l();
        if (f != 0.0f) {
            f %= mo387m;
            if (f < 0.0f) {
                f += mo387m;
            }
        }
        if (f2 != 0.0f) {
            f2 %= mo388l;
            if (f2 < 0.0f) {
                f2 += mo388l;
            }
        }
        float f3 = rectF.f234a - f;
        float f4 = rectF.f235b - f2;
        int i3 = 0;
        int i4 = mo387m - i;
        int i5 = mo388l - i2;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        while (f3 < rectF.f236c) {
            while (f4 < rectF.f237d) {
                i3++;
                if (i3 > 2000) {
                    GameEngine.m5460e("tileImage hit limit");
                    return;
                }
                float f5 = rectF.f236c - f3;
                if (f5 > mo387m) {
                    f5 = mo387m;
                }
                float f6 = rectF.f237d - f4;
                if (f6 > mo388l) {
                    f6 = mo388l;
                }
                if (f6 > 0.0f && f5 > 0.0f) {
                    f6538h.m5172a(0, 0, (int) f5, (int) f6);
                    f6540j.m5158a(f3, f4, f3 + f5, f4 + f6);
                    float f7 = f6540j.f234a - rectF.f234a;
                    if (f7 < 0.0f) {
                        f6538h.f230a = (int) (rect2.f230a - f7);
                        f6540j.f234a -= f7;
                    }
                    float f8 = f6540j.f235b - rectF.f235b;
                    if (f8 < 0.0f) {
                        f6538h.f231b = (int) (rect.f231b - f8);
                        f6540j.f235b -= f8;
                    }
                    interfaceC1063y.mo193a(c0970e, f6538h, f6540j, paint);
                    f4 += i5;
                }
                f3 += i4;
                f4 = rectF.f235b - f2;
            }
            f3 += i4;
            f4 = rectF.f235b - f2;
        }
    }

    /* renamed from: a */
    public static void m945a(InterfaceC1063y interfaceC1063y, C0970e c0970e, Rect rect, Rect rect2, Paint paint, int i, int i2, int i3, int i4, float f) {
        int m5170b = rect.m5170b();
        int m5166c = rect.m5166c();
        if (i != 0) {
            i %= m5170b;
            if (i < 0) {
                i += m5170b;
            }
        }
        if (i2 != 0) {
            i2 %= m5166c;
            if (i2 < 0) {
                i2 += m5166c;
            }
        }
        int i5 = rect2.f230a - i;
        int i6 = rect2.f231b - i2;
        int i7 = rect2.f232c - i5;
        int i8 = rect2.f233d - i6;
        int i9 = (int) ((i7 / m5170b) + 0.5f);
        int i10 = (int) ((i8 / m5166c) + 0.5f);
        if (i9 < 1) {
            i9 = 1;
        }
        if (i10 < 1) {
            i10 = 1;
        }
        float f2 = i7 / (i9 * m5170b);
        float f3 = i8 / (i10 * m5166c);
        float m2125f = C0773f.m2125f(1.0f, f2, f);
        float m2125f2 = C0773f.m2125f(1.0f, f3, f);
        int i11 = (int) (m5170b * m2125f);
        int i12 = (int) (m5166c * m2125f2);
        float f4 = 1.0f / m2125f;
        float f5 = 1.0f / m2125f2;
        int i13 = i11 - i3;
        int i14 = i12 - i4;
        if (i13 <= 0 || i14 <= 0) {
            return;
        }
        int i15 = 0;
        while (i5 < rect2.f232c) {
            while (i6 < rect2.f233d) {
                i15++;
                if (i15 > 2000) {
                    GameEngine.m5460e("tileImage hit limit");
                    return;
                }
                int i16 = rect2.f232c - i5;
                if (i16 > i11) {
                    i16 = i11;
                }
                int i17 = rect2.f233d - i6;
                if (i17 > i12) {
                    i17 = i12;
                }
                if (i17 > 0 && i16 > 0) {
                    f6538h.m5172a(0, 0, (int) (i16 * f4), (int) (i17 * f5));
                    f6538h.m5173a(rect.f230a, rect.f231b);
                    f6539i.m5172a(i5, i6, i5 + i16, i6 + i17);
                    int i18 = f6539i.f230a - rect2.f230a;
                    if (i18 < 0) {
                        f6538h.f230a -= i18;
                        f6539i.f230a -= i18;
                    }
                    int i19 = f6539i.f231b - rect2.f231b;
                    if (i19 < 0) {
                        f6538h.f231b -= i19;
                        f6539i.f231b -= i19;
                    }
                    interfaceC1063y.mo194a(c0970e, f6538h, f6539i, paint);
                    i6 += i14;
                }
                i5 += i13;
                i6 = rect2.f231b - i2;
            }
            i5 += i13;
            i6 = rect2.f231b - i2;
        }
    }

    /* renamed from: a */
    public static void m951a(Paint paint) {
        if (GameEngine.m1030at()) {
            int m5194e = paint.m5194e();
            paint.m5225a(new LightingColorFilter(C0773f.m2165b(255, (m5194e >> 16) & 255, (m5194e >> 8) & 255, m5194e & 255), 0));
        }
    }
}
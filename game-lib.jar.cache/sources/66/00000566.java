package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.f.d;

/* renamed from: com.corrodinggames.rts.gameFramework.m.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/aa.class */
public final class aa {
    static float b;
    static float c;
    static float d;
    static ab[] f;
    static Paint g;

    /* renamed from: a */
    static int f622a = -1;
    public static final Rect e = new Rect();
    static final Rect h = new Rect();
    static final Rect i = new Rect();
    static final RectF j = new RectF();

    public static final Bitmap a(e eVar) {
        return eVar.b();
    }

    public static void a(String str, float f2, float f3, Paint paint) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String[] c2 = f.c(str, '\n');
        float b2 = d.b(paint);
        float length = (c2.length - 1) * b2;
        int i2 = 0;
        for (String str2 : c2) {
            gameEngine.bO.a(str2, f2, (f3 - (length / 2.0f)) + (i2 * b2) + (b2 / 2.0f), paint);
            i2++;
        }
    }

    public static void a(y yVar, float f2, float f3, float f4, Paint paint) {
        if (GameEngine.at()) {
            a(yVar, f2, f3, f4, 40, paint, GameEngine.getGameEngine().cQ);
        } else {
            yVar.a(f2, f3, f4, paint);
        }
    }

    public static ab a(float f2, float f3, boolean z, y yVar) {
        int i2;
        int i3;
        int i4 = (int) f3;
        int i5 = 0;
        if (((int) f2) > 20) {
            i5 = 1;
            i2 = 60;
        } else {
            i2 = 30;
        }
        int i6 = 0;
        if (i4 >= 2) {
            i6 = 1;
            i3 = 2;
        } else {
            i3 = 1;
        }
        int i7 = i5 + (i6 * 2) + (z ? 0 : 2 + (2 * 2));
        if (f == null) {
            f = new ab[((2 + (2 * 2)) * 2) + 1];
        }
        if (f[i7] != null) {
            if (f[i7].b != i2) {
                GameEngine.m2e("Mismatch on index: " + i7 + " size:" + i2);
            }
            return f[i7];
        }
        ab abVar = new ab();
        abVar.d = a(i2, i3, z, yVar);
        abVar.b = i2;
        abVar.f623a = i3;
        abVar.c = z;
        f[i7] = abVar;
        return abVar;
    }

    public static e a(int i2, int i3, boolean z, y yVar) {
        Paint paint = new Paint();
        paint.b(-1);
        paint.a(z ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.a(i3);
        e b2 = yVar.b((i2 * 2) + 4, (i2 * 2) + 4, true);
        y mo18b = yVar.mo18b(b2);
        mo18b.b(i2 + 2, i2 + 2, i2, paint);
        mo18b.p();
        b2.p();
        mo18b.q();
        return b2;
    }

    public static void a(y yVar, float f2, float f3, float f4, Paint paint, float f5) {
        if (g == null) {
            g = new Paint();
            g.a(true);
            g.b(true);
        }
        int e2 = paint.e();
        if (GameEngine.at()) {
            g.a(new LightingColorFilter(e2, 0));
        }
        g.b(e2);
        ab a2 = a(f4 * f5, paint.g(), paint.d() == Paint.Style.FILL, yVar);
        float f6 = f4 / a2.b;
        float f7 = (-f4) - (f6 * 2.0f);
        yVar.a(a2.d, f2 + f7, f3 + f7, g, 0.0f, f6);
    }

    public static void a(y yVar, float f2, float f3, float f4, int i2, Paint paint, Rect rect) {
        if (f622a != i2) {
            f622a = i2;
            b = 6.283185f / i2;
            c = f.k(b);
            d = f.j(b);
        }
        float f5 = c;
        float f6 = d;
        int i3 = ((int) (b * f4 * 0.5f)) + 50;
        e.f47a = rect.f47a - i3;
        e.b = rect.b - i3;
        e.c = rect.c + i3;
        e.d = rect.d + i3;
        float f7 = f4;
        float f8 = 0.0f;
        int i4 = i2 + 1;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z = true;
        for (int i5 = 0; i5 < i4; i5++) {
            float f13 = f7 + f2;
            float f14 = f8 + f3;
            if (z) {
                z = false;
                f9 = f13;
                f10 = f14;
            } else if (e.b((int) f13, (int) f14) || e.b((int) f11, (int) f12)) {
                yVar.a(f13, f14, f11, f12, paint);
            }
            f11 = f13;
            f12 = f14;
            float f15 = f7;
            f7 = (f5 * f7) - (f6 * f8);
            f8 = (f6 * f15) + (f5 * f8);
        }
        if (e.b((int) f9, (int) f10) || e.b((int) f11, (int) f12)) {
            yVar.a(f9, f10, f11, f12, paint);
        }
    }

    public static final int a(int i2) {
        return i2 >>> 24;
    }

    public static final int b(int i2) {
        return (i2 >> 16) & 255;
    }

    public static final int c(int i2) {
        return (i2 >> 8) & 255;
    }

    public static final int d(int i2) {
        return i2 & 255;
    }

    public static void a(y yVar, e eVar, Rect rect, Paint paint, int i2, int i3, int i4, int i5) {
        int m = eVar.m();
        int l = eVar.l();
        if (i2 != 0) {
            i2 %= eVar.m();
            if (i2 < 0) {
                i2 += eVar.m();
            }
        }
        if (i3 != 0) {
            i3 %= eVar.l();
            if (i3 < 0) {
                i3 += eVar.l();
            }
        }
        int i6 = rect.f47a - i2;
        int i7 = rect.b - i3;
        int i8 = m - i4;
        int i9 = l - i5;
        if (i8 <= 0 || i9 <= 0) {
            return;
        }
        int i10 = 0;
        while (i6 < rect.c) {
            while (i7 < rect.d) {
                i10++;
                if (i10 > 2000) {
                    GameEngine.m2e("tileImage hit limit");
                    return;
                }
                int i11 = rect.c - i6;
                if (i11 > m) {
                    i11 = m;
                }
                int i12 = rect.d - i7;
                if (i12 > l) {
                    i12 = l;
                }
                if (i12 > 0 && i11 > 0) {
                    h.a(0, 0, i11, i12);
                    i.a(i6, i7, i6 + i11, i7 + i12);
                    int i13 = i.f47a - rect.f47a;
                    if (i13 < 0) {
                        h.f47a -= i13;
                        i.f47a -= i13;
                    }
                    int i14 = i.b - rect.b;
                    if (i14 < 0) {
                        h.b -= i14;
                        i.b -= i14;
                    }
                    yVar.a(eVar, h, i, paint);
                    i7 += i9;
                }
                i6 += i8;
                i7 = rect.b - i3;
            }
            i6 += i8;
            i7 = rect.b - i3;
        }
    }

    public static void a(y yVar, e eVar, RectF rectF, Paint paint, float f2, float f3, int i2, int i3) {
        Rect rect;
        Rect rect2;
        int m = eVar.m();
        int l = eVar.l();
        if (f2 != 0.0f) {
            f2 %= m;
            if (f2 < 0.0f) {
                f2 += m;
            }
        }
        if (f3 != 0.0f) {
            f3 %= l;
            if (f3 < 0.0f) {
                f3 += l;
            }
        }
        float f4 = rectF.f48a - f2;
        float f5 = rectF.b - f3;
        int i4 = 0;
        int i5 = m - i2;
        int i6 = l - i3;
        if (i5 <= 0 || i6 <= 0) {
            return;
        }
        while (f4 < rectF.c) {
            while (f5 < rectF.d) {
                i4++;
                if (i4 > 2000) {
                    GameEngine.m2e("tileImage hit limit");
                    return;
                }
                float f6 = rectF.c - f4;
                if (f6 > m) {
                    f6 = m;
                }
                float f7 = rectF.d - f5;
                if (f7 > l) {
                    f7 = l;
                }
                if (f7 > 0.0f && f6 > 0.0f) {
                    h.a(0, 0, (int) f6, (int) f7);
                    j.a(f4, f5, f4 + f6, f5 + f7);
                    float f8 = j.f48a - rectF.f48a;
                    if (f8 < 0.0f) {
                        h.f47a = (int) (rect2.f47a - f8);
                        j.f48a -= f8;
                    }
                    float f9 = j.b - rectF.b;
                    if (f9 < 0.0f) {
                        h.b = (int) (rect.b - f9);
                        j.b -= f9;
                    }
                    yVar.a(eVar, h, j, paint);
                    f5 += i6;
                }
                f4 += i5;
                f5 = rectF.b - f3;
            }
            f4 += i5;
            f5 = rectF.b - f3;
        }
    }

    public static void a(y yVar, e eVar, Rect rect, Rect rect2, Paint paint, int i2, int i3, int i4, int i5, float f2) {
        int b2 = rect.b();
        int c2 = rect.c();
        if (i2 != 0) {
            i2 %= b2;
            if (i2 < 0) {
                i2 += b2;
            }
        }
        if (i3 != 0) {
            i3 %= c2;
            if (i3 < 0) {
                i3 += c2;
            }
        }
        int i6 = rect2.f47a - i2;
        int i7 = rect2.b - i3;
        int i8 = rect2.c - i6;
        int i9 = rect2.d - i7;
        int i10 = (int) ((i8 / b2) + 0.5f);
        int i11 = (int) ((i9 / c2) + 0.5f);
        if (i10 < 1) {
            i10 = 1;
        }
        if (i11 < 1) {
            i11 = 1;
        }
        float f3 = i8 / (i10 * b2);
        float f4 = i9 / (i11 * c2);
        float f5 = f.f(1.0f, f3, f2);
        float f6 = f.f(1.0f, f4, f2);
        int i12 = (int) (b2 * f5);
        int i13 = (int) (c2 * f6);
        float f7 = 1.0f / f5;
        float f8 = 1.0f / f6;
        int i14 = i12 - i4;
        int i15 = i13 - i5;
        if (i14 <= 0 || i15 <= 0) {
            return;
        }
        int i16 = 0;
        while (i6 < rect2.c) {
            while (i7 < rect2.d) {
                i16++;
                if (i16 > 2000) {
                    GameEngine.m2e("tileImage hit limit");
                    return;
                }
                int i17 = rect2.c - i6;
                if (i17 > i12) {
                    i17 = i12;
                }
                int i18 = rect2.d - i7;
                if (i18 > i13) {
                    i18 = i13;
                }
                if (i18 > 0 && i17 > 0) {
                    h.a(0, 0, (int) (i17 * f7), (int) (i18 * f8));
                    h.a(rect.f47a, rect.b);
                    i.a(i6, i7, i6 + i17, i7 + i18);
                    int i19 = i.f47a - rect2.f47a;
                    if (i19 < 0) {
                        h.f47a -= i19;
                        i.f47a -= i19;
                    }
                    int i20 = i.b - rect2.b;
                    if (i20 < 0) {
                        h.b -= i20;
                        i.b -= i20;
                    }
                    yVar.a(eVar, h, i, paint);
                    i7 += i15;
                }
                i6 += i14;
                i7 = rect2.b - i3;
            }
            i6 += i14;
            i7 = rect2.b - i3;
        }
    }

    public static void a(Paint paint) {
        if (GameEngine.at()) {
            int e2 = paint.e();
            paint.a(new LightingColorFilter(f.b(255, (e2 >> 16) & 255, (e2 >> 8) & 255, e2 & 255), 0));
        }
    }
}
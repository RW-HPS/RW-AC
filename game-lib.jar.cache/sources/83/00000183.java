package com.corrodinggames.rts.game.b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/h.class */
public class h {
    public com.corrodinggames.rts.gameFramework.m.e b;
    y c;
    int e;
    int f;
    int g;
    int h;
    float i;
    boolean j;
    h k;
    static final Rect l = new Rect();
    static final Rect m = new Rect();
    static final Rect n = new Rect();

    /* renamed from: a  reason: collision with root package name */
    int f153a = 0;
    Paint d = new Paint();
    Rect o = new Rect();
    int p = -1;

    public h(float f, boolean z) {
        this.i = 1.0f;
        this.i = f;
        this.j = z;
        this.e = (int) (20.0f * f);
        this.f = (int) (20.0f * f);
        this.g = this.e + 2;
        this.h = this.f + 2;
        if (!z) {
            this.k = new h(f, true);
        }
    }

    public void a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.b = gameEngine.bO.b(20 * this.g, 20 * this.h, this.j);
        this.c = gameEngine.bO.b(this.b);
        if (this.j) {
            this.b.m = true;
        }
        if (this.k != null) {
            this.k.a();
        }
    }

    public void b() {
        this.f153a = 0;
        this.c.b(-16777216);
        this.c.o();
        this.b.r();
        if (this.k != null) {
            this.k.b();
        }
    }

    public int a(j jVar, int i) {
        int a2;
        jVar.a(i, l);
        if (this.f153a >= 400) {
            return -1;
        }
        boolean z = true;
        if (!this.j) {
            z = !a(jVar.b, l);
        }
        if (z) {
            int i2 = this.f153a;
            this.f153a++;
            a(i2, jVar.b, l);
            return i2;
        } else if (this.k != null && (a2 = this.k.a(jVar, i)) != -1) {
            return a2 + 500;
        } else {
            return -1;
        }
    }

    public static boolean a(com.corrodinggames.rts.gameFramework.m.e eVar, Rect rect) {
        int i = rect.f47a;
        int i2 = rect.c;
        int i3 = rect.b;
        int i4 = rect.d;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i > eVar.m()) {
            i = eVar.m();
        }
        if (i2 > eVar.m()) {
            i2 = eVar.m();
        }
        if (i3 > eVar.l()) {
            i3 = eVar.l();
        }
        if (i4 > eVar.l()) {
            i4 = eVar.l();
        }
        if (!eVar.k()) {
            GameEngine.m328e("hasImageAlpha: Cannot get pixel data for: " + eVar.a());
            return true;
        }
        eVar.x();
        for (int i5 = i3; i5 < i4; i5++) {
            for (int i6 = i; i6 < i2; i6++) {
                if (Color.a(eVar.a(i6, i5)) != 255) {
                    return true;
                }
            }
        }
        eVar.y();
        return false;
    }

    public void c() {
        this.c.p();
        if (this.k != null) {
            this.k.c();
        }
    }

    public void a(int i, com.corrodinggames.rts.gameFramework.m.e eVar, Rect rect) {
        Rect rect2 = new Rect();
        a(i, rect2);
        boolean z = false;
        if (this.i < 1.0f) {
            z = true;
        }
        this.d.a(z);
        this.d.d(z);
        this.d.b(z);
        a(this.c, eVar, rect, rect2, this.d);
    }

    public static void a(y yVar, com.corrodinggames.rts.gameFramework.m.e eVar, Rect rect, Rect rect2, Paint paint) {
        for (int i = 0; i <= 3; i++) {
            a(rect, m, i, 0);
            a(rect2, n, i, 1);
            yVar.a(eVar, m, n, paint);
        }
        for (int i2 = 0; i2 <= 3; i2++) {
            a(rect, m, i2, 1, -1);
            a(rect2, n, i2, 1, 0);
            yVar.a(eVar, m, n, paint);
        }
        yVar.a(eVar, rect, rect2, paint);
    }

    public static Rect a(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 0) {
            rect2.f47a = rect.f47a - 0;
            rect2.c = rect.c + 0;
            rect2.b = (rect.b - i2) - i3;
            rect2.d = rect.b - i3;
        } else if (i == 1) {
            rect2.f47a = rect.c + i3;
            rect2.c = rect.c + i2 + i3;
            rect2.b = rect.b - 0;
            rect2.d = rect.d + 0;
        } else if (i == 2) {
            rect2.f47a = rect.f47a - 0;
            rect2.c = rect.c + 0;
            rect2.b = rect.d + i3;
            rect2.d = rect.d + i2 + i3;
        } else {
            rect2.f47a = rect.f47a - i3;
            rect2.c = (rect.f47a - i2) - i3;
            rect2.b = rect.b - 0;
            rect2.d = rect.d + 0;
        }
        return rect2;
    }

    public static Rect a(Rect rect, Rect rect2, int i, int i2) {
        if (i == 0) {
            rect2.f47a = (rect.c - 1) + i2;
            rect2.b = rect.b - i2;
        } else if (i == 1) {
            rect2.f47a = (rect.c - 1) + i2;
            rect2.b = (rect.d - 1) + i2;
        } else if (i == 2) {
            rect2.f47a = rect.f47a - i2;
            rect2.b = (rect.d - 1) + i2;
        } else {
            rect2.f47a = rect.f47a - i2;
            rect2.b = rect.b - i2;
        }
        rect2.c = rect2.f47a + 1;
        rect2.d = rect2.b + 1;
        return rect2;
    }

    public final com.corrodinggames.rts.gameFramework.m.e a(int i) {
        if (i >= 500) {
            return this.k.a(i - 500);
        }
        return this.b;
    }

    public final Rect b(int i) {
        if (i >= 500) {
            return this.k.b(i - 500);
        }
        if (this.p == i) {
            return this.o;
        }
        this.p = i;
        a(i, this.o);
        return this.o;
    }

    public void a(int i, Rect rect) {
        int i2 = ((i % 20) * this.g) + 1;
        int i3 = (((int) (i * 0.05f)) * this.h) + 1;
        rect.f47a = i2;
        rect.b = i3;
        rect.c = i2 + this.e;
        rect.d = i3 + this.f;
    }
}
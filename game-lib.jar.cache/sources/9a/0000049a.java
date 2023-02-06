package com.corrodinggames.rts.gameFramework.emitter;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.utility.o;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a.class */
public class a {
    float a;
    float b;
    public boolean c;
    public as d;
    public PlayerData e;
    public float g;
    public float h;
    public boolean i;
    public PlayerData j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public y o;
    public int r;
    public float s;
    public boolean u;
    public am v;
    static Paint D;
    public static o w = new o();
    static Point x = new Point();
    static RectF y = new RectF();
    static RectF z = new RectF();
    static RectF A = new RectF();
    static RectF E = new RectF();
    static Paint C = new ag();
    public int f = 1;
    boolean p = false;
    public boolean q = false;
    public float t = 0.04f;
    Paint B = new Paint();

    public a() {
        w.add(this);
        w.a();
    }

    static {
        C.a(90, 0, 0, 255);
        C.a(Paint.Style.STROKE);
        C.a(2.0f);
        D = new ag();
        D.a(40, 0, 0, 255);
        D.a(Paint.Style.STROKE);
        D.a(2.0f);
    }

    public static void a() {
        w.clear();
    }

    public static void a(float f) {
        Iterator it = w.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c(f);
        }
        w.a();
    }

    public static void b(float f) {
        Object[] b = w.b();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            ((a) b[i]).d(f);
        }
    }

    public static boolean a(PlayerData playerData, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bL.a(i, i2);
        float f = gameEngine.bL.T + gameEngine.bL.p;
        float f2 = gameEngine.bL.U + gameEngine.bL.q;
        y.a(f, f2, f + 1.0f, f2 + 1.0f);
        return a(playerData, y, i3);
    }

    public static boolean a(PlayerData playerData, y yVar, int i) {
        y = yVar.a(GameEngine.getGameEngine().bL, y);
        return a(playerData, y, i);
    }

    public static boolean a(y yVar, y yVar2) {
        b bVar = GameEngine.getGameEngine().bL;
        y = yVar.a(bVar, y);
        z = yVar2.a(bVar, z);
        if (f.a(y, z)) {
            return true;
        }
        return false;
    }

    public static boolean a(PlayerData playerData, RectF rectF, int i) {
        b bVar = GameEngine.getGameEngine().bL;
        RectF rectF2 = A;
        Iterator it = w.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.j == playerData && aVar.n && (i == -1 || i == aVar.r)) {
                am a = am.a(aVar.d);
                if (a == null) {
                    GameEngine.m5e("isTileRectOverBlueprint: Failed to get shared unit for: " + aVar.d);
                } else {
                    a.eo = aVar.g;
                    a.ep = aVar.h;
                    rectF2 = a.a(bVar, rectF2);
                    if (f.a(rectF2, rectF)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static a a(PlayerData playerData, float f, float f2) {
        Iterator it = w.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.j == playerData && aVar.n) {
                float a = f.a(aVar.g, aVar.h, f, f2);
                float f3 = am.a(aVar.d).cj + 1.0f;
                if (f3 < 20.0f) {
                    f3 = 20.0f;
                }
                if (a < f3 * f3) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public boolean b() {
        if (this.n) {
            if (this.o == null || this.o.bV || !ar.a(this.d, this.g, this.h, 0.0f, 0.0f, this.e)) {
                return false;
            }
            return true;
        } else if (this.v == null || this.v.cf()) {
            return false;
        } else {
            return true;
        }
    }

    public void c(float f) {
        this.a += 1.0f;
        this.b += f;
        boolean z2 = false;
        this.s = f.a(this.s, this.t * f);
        if (this.n) {
            if (this.a > 6.0f) {
                this.a = 0.0f;
                boolean a = this.o.a(this.d, this.g, this.h);
                if (!this.p && a) {
                    this.p = true;
                }
                if (!a) {
                    if (this.p) {
                        z2 = true;
                    } else if (this.b > 180.0f) {
                        z2 = true;
                    }
                }
                if (!b()) {
                    z2 = true;
                }
            }
        } else if (this.a > 2.0f && !b()) {
            z2 = true;
        }
        if (z2) {
            this.c = true;
            w.b(this);
        }
    }

    public void d(float f) {
        am c;
        Rect cd;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.playerTeam != this.j || !gameEngine.cO.b(this.g, this.h)) {
            return;
        }
        if (this.q && !this.p) {
            return;
        }
        float f2 = 0.0f;
        float f3 = this.g;
        float f4 = this.h;
        boolean z2 = false;
        boolean z3 = false;
        if (this.n) {
            z3 = true;
        } else {
            z2 = true;
        }
        boolean z4 = true;
        if (this.i) {
            z4 = false;
        }
        if (z3) {
            float f5 = this.s;
            if (f5 <= 0.0f) {
                f2 = 0.0f;
            } else if (this.s < 1.0f) {
                f2 = 1.0f - f.k(f5 * 90.0f);
            } else {
                f2 = 1.0f;
            }
        }
        if (z3 && this.s < 1.0f && (c = am.c(this.d)) != null && c.bI() && (cd = c.cd()) != null) {
            E.a(cd);
            E.b *= gameEngine.bL.o;
            E.d *= gameEngine.bL.o;
            E.a *= gameEngine.bL.n;
            E.c *= gameEngine.bL.n;
            E.a(-(c.cZ() - gameEngine.bL.p), -(c.da() - gameEngine.bL.q));
            f.a(E, (gameEngine.bL.p - 3) + (f2 * 5.0f));
            E.a(this.g - gameEngine.cw, (this.h - gameEngine.cx) - 0.0f);
            float f6 = 3.0f + (f2 * 7.0f);
            Paint paint = C;
            if (this.s <= 0.0f) {
                paint = D;
            }
            gameEngine.bO.a(E.a - f6, E.b, E.c + f6, E.b, paint);
            gameEngine.bO.a(E.a - f6, E.d, E.c + f6, E.d, paint);
            gameEngine.bO.a(E.a, E.b - f6, E.a, E.d + f6, paint);
            gameEngine.bO.a(E.c, E.b - f6, E.c, E.d + f6, paint);
        }
        float f7 = 0.0f;
        if (z3) {
            f7 = 0.0f - (10.0f * f2);
        }
        ar.a(this.d, f3, f4 + f7, 0.0f, 0.0f, this.e, 1.0f, 500.0f, z2, z3, this.f, z4, null);
    }
}
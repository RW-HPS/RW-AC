package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/y.class */
public final class y {
    static final Paint a = new Paint();
    static final RectF b = new RectF();
    static ArrayList c = new ArrayList();
    static final Rect d;
    static final RectF e;
    static Paint f;
    static z[] g;
    static boolean h;

    static {
        a.a(205, 255, 0, 0);
        a.a(Paint.Style.STROKE);
        d = new Rect();
        e = new RectF();
        f = new Paint();
        g = new z[30];
        h = false;
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, float f2) {
        a(amVar, f2, false, false);
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, float f2, boolean z) {
        a(amVar, f2, z, false);
    }

    public static boolean a(com.corrodinggames.rts.game.units.am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (amVar.cG && gameEngine.bS.q() == 1 && !gameEngine.bS.g.e) {
            return true;
        }
        return false;
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, float f2, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (a(amVar) || z) {
            float f3 = amVar.eo - gameEngine.cw;
            float f4 = amVar.ep - gameEngine.cx;
            Paint paint = com.corrodinggames.rts.game.units.am.dg;
            if (z2) {
                paint = com.corrodinggames.rts.game.units.am.dh;
            }
            gameEngine.bO.a(f3, f4, f2, paint);
        }
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, float f2, int i, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((amVar.cG && gameEngine.bS.q() < 10) || z) {
            float f3 = amVar.eo - gameEngine.cw;
            float f4 = amVar.ep - gameEngine.cx;
            Paint paint = com.corrodinggames.rts.game.units.am.dk;
            paint.b(i);
            paint.a(i2);
            gameEngine.bO.a(f3, f4, f2, paint);
        }
    }

    public static void b(com.corrodinggames.rts.game.units.am amVar, float f2, boolean z) {
        a(amVar, f2, z, com.corrodinggames.rts.game.units.am.di);
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, float f2, boolean z, Paint paint) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (a(amVar) || z) {
            gameEngine.bO.a(amVar.eo - gameEngine.cw, amVar.ep - gameEngine.cx, f2, paint);
        }
    }

    public static void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f2, float f3, float f4, float f5, float f6, Paint paint, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i4 = 0 + (i3 * i);
        d.a(i4, 0, i4 + i, 0 + i2);
        float f7 = f6 * 0.5f;
        float f8 = f3 - f4;
        float f9 = i * f7;
        float f10 = i2 * f7;
        e.a(f2 - f9, f8 - f10, f2 + f9, f8 + f10);
        com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
        yVar.k();
        yVar.a(f5 + 90.0f, f2, f8);
        if (f6 != 1.0f) {
            yVar.a(f6, f6, f2, f8);
        }
        yVar.a(eVar, d, e, paint);
        yVar.l();
    }

    public static boolean a(com.corrodinggames.rts.game.units.am amVar, boolean z, boolean z2) {
        if (amVar.cr() && z2) {
            return false;
        }
        if ((z && ((amVar instanceof com.corrodinggames.rts.game.units.b.b) || (amVar instanceof com.corrodinggames.rts.game.units.h.f))) || amVar.bI()) {
            return false;
        }
        if ((z && (amVar.cv() || amVar.ct())) || amVar.P() || amVar.cN != null || amVar.cO != null) {
            return false;
        }
        return true;
    }

    public static Paint a() {
        com.corrodinggames.rts.gameFramework.unitAction.ag agVar = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        if (GameEngine.getGameEngine().settingsEngine.renderAntiAlias) {
            agVar.a(true);
            agVar.d(true);
            agVar.b(true);
        } else {
            agVar.a(false);
            agVar.d(false);
            agVar.b(false);
        }
        return agVar;
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.ag b() {
        com.corrodinggames.rts.gameFramework.unitAction.ag agVar = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        agVar.a(false);
        agVar.d(false);
        agVar.b(false);
        return agVar;
    }

    public static void a(com.corrodinggames.rts.game.units.y yVar) {
        if (!yVar.bV) {
            int bl = yVar.bl();
            for (int i = 0; i < bl; i++) {
                a(yVar, i);
            }
        }
    }

    public static void a(com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f2, int i) {
        if (!yVar.bV && f2 != 0.0f) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            ai D = yVar.D(i);
            gameEngine.bO.k();
            gameEngine.bO.b(D.a - gameEngine.cw, ((D.b - D.c) - yVar.eq) - gameEngine.cx);
            gameEngine.bO.a(f2, f2);
            gameEngine.bO.a(eVar, 0.0f, 0.0f, (Paint) null);
            gameEngine.bO.l();
        }
    }

    public static void a(com.corrodinggames.rts.game.units.y yVar, int i) {
        com.corrodinggames.rts.gameFramework.unitAction.e d2 = yVar.d(i);
        if (d2 == null) {
            return;
        }
        float p = yVar.p(i);
        Paint aN = yVar.aN();
        GameEngine gameEngine = GameEngine.getGameEngine();
        ai F = yVar.F(i);
        float f2 = F.a - GameEngine.getGameEngine().cw;
        float f3 = ((F.b - GameEngine.getGameEngine().cx) - yVar.eq) - F.c;
        com.corrodinggames.rts.gameFramework.unitAction.y yVar2 = gameEngine.bO;
        yVar2.k();
        if (p != 1.0f) {
            yVar2.a(p, p, f2, f3);
        }
        yVar2.a(yVar.cL[i].a + 90.0f, f2, f3);
        yVar2.b(d2, (f2 - d2.t) - yVar.h(i), (f3 - d2.u) - yVar.i(i), aN);
        yVar2.l();
    }

    public static boolean a(com.corrodinggames.rts.game.units.am amVar, float f2, float f3) {
        return !a(f2, f3, amVar.h());
    }

    public static boolean a(float f2, float f3, ao aoVar) {
        PathEngine pathEngine = GameEngine.getGameEngine().bU;
        com.corrodinggames.rts.game.maps.b bVar = GameEngine.getGameEngine().bL;
        bVar.a(f2, f3);
        return pathEngine.a(aoVar, bVar.T, bVar.U);
    }

    public static short b(float f2, float f3, ao aoVar) {
        PathEngine pathEngine = GameEngine.getGameEngine().bU;
        com.corrodinggames.rts.game.maps.b bVar = GameEngine.getGameEngine().bL;
        com.corrodinggames.rts.gameFramework.path.i a2 = pathEngine.a(aoVar);
        if (a2.g == null) {
            return (short) -3;
        }
        bVar.a(f2, f3);
        int i = bVar.T;
        int i2 = bVar.U;
        if (!bVar.c(i, i2)) {
            return (short) -2;
        }
        return a2.g[(i * a2.c) + i2];
    }

    public static int c(float f2, float f3, ao aoVar) {
        short b2 = b(f2, f3, aoVar);
        if (b2 == -3 || b2 == -2 || b2 == -1 || b2 == 0) {
            return 0;
        }
        Integer num = (Integer) GameEngine.getGameEngine().bU.a(aoVar).h.get(Short.valueOf(b2));
        if (num == null) {
            GameEngine.print("Could not find groupSize for:" + ((int) b2) + " at X:" + f2 + " y:" + f3);
            return 0;
        }
        return num.intValue();
    }

    public static boolean a(float f2, float f3) {
        com.corrodinggames.rts.game.maps.b bVar = GameEngine.getGameEngine().bL;
        if (bVar == null) {
            GameEngine.m5e("isInMap called without map loaded");
            return false;
        }
        return bVar.c((int) (f2 * bVar.r), (int) (f3 * bVar.s));
    }

    public static boolean b(float f2, float f3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        if (bVar == null) {
            GameEngine.m5e("isOverClift called without map loaded");
            return false;
        }
        return gameEngine.bU.b((int) (f2 * bVar.r), (int) (f3 * bVar.s));
    }

    public static boolean c(float f2, float f3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        if (bVar == null) {
            GameEngine.m5e("isOverWater called without map loaded");
            return false;
        }
        return gameEngine.bU.a((int) (f2 * bVar.r), (int) (f3 * bVar.s));
    }

    public static boolean d(float f2, float f3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        if (bVar == null) {
            GameEngine.m5e("isOverLiquid called without map loaded");
            return false;
        }
        com.corrodinggames.rts.game.maps.g c2 = bVar.c(f2, f3);
        if (c2 == null) {
            return false;
        }
        if (c2.e || c2.g) {
            return true;
        }
        return gameEngine.bU.a((int) (f2 * bVar.r), (int) (f3 * bVar.s));
    }

    public static final Paint a(int i, int i2, int i3, int i4, Paint.Style style) {
        return a(com.corrodinggames.rts.gameFramework.f.b(i, i2, i3, i4), style);
    }

    public static final Paint a(int i, Paint.Style style) {
        for (int i2 = 0; i2 < g.length; i2++) {
            if (g[i2] == null) {
                z zVar = new z(i, style);
                g[i2] = zVar;
                return zVar.c;
            }
            z zVar2 = g[i2];
            if (zVar2.a == i && zVar2.b == style) {
                return zVar2.c;
            }
        }
        if (!h) {
            h = true;
            GameEngine.print("----- getCachingPaint --- Paint fallback was needed!!");
        }
        f.b(i);
        f.a(style);
        return f;
    }

    public static void a(float f2) {
        if (c.size() == 0) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            aa aaVar = (aa) it.next();
            if (aaVar.e <= 0.0f) {
                it.remove();
            } else {
                aaVar.e -= f2;
                if (f2 == 0.0f && aaVar.e < 1.0f) {
                    aaVar.e = -1.0f;
                }
            }
        }
    }

    public static void b(float f2) {
        if (c.size() == 0) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            aa aaVar = (aa) it.next();
            float f3 = aaVar.b.a;
            float f4 = aaVar.b.b;
            float f5 = aaVar.b.c;
            float f6 = aaVar.b.d;
            if (aaVar.d) {
                f3 -= GameEngine.getGameEngine().cw;
                f4 -= GameEngine.getGameEngine().cx;
                f5 -= GameEngine.getGameEngine().cw;
                f6 -= GameEngine.getGameEngine().cx;
            }
            if (aaVar.c) {
                gameEngine.bO.a(f3, f4, f5, f6, aaVar.a);
            } else {
                if (aaVar.d) {
                }
                gameEngine.bO.a(aaVar.b, aaVar.a);
            }
            if (aaVar.f != null) {
                gameEngine.bO.i();
                gameEngine.S();
                float f7 = f5;
                float f8 = f6;
                if (aaVar.d) {
                    f7 *= gameEngine.cX;
                    f8 *= gameEngine.cX;
                }
                gameEngine.bO.a(aaVar.f, f7, f8, aaVar.a);
                gameEngine.bO.j();
            }
        }
    }

    public static final boolean a(int i, int i2) {
        int i3 = GameEngine.getGameEngine().by;
        if (i + i2 < i3 || i3 < i - 1000) {
            return true;
        }
        return false;
    }

    public static final boolean b(int i, int i2) {
        int i3 = GameEngine.getGameEngine().by;
        if (i >= 0 && i + i2 >= i3 && i <= i3) {
            return true;
        }
        return false;
    }

    public static boolean a(float f2, float f3, float f4, float f5, ao aoVar) {
        if (aoVar == ao.AIR || aoVar == ao.NONE) {
            return true;
        }
        short b2 = b(f2, f3, aoVar);
        short b3 = b(f4, f5, aoVar);
        if (b2 == -3 || b3 == -3) {
            String str = "null";
            if (aoVar != null) {
                str = aoVar.name();
            }
            GameEngine.g("pathPossible: no isolatedGroups found! (" + str + ")");
        }
        if (b2 != -1 && b3 != -1 && b2 != -2 && b3 != -2 && b2 == b3) {
            return true;
        }
        return false;
    }

    public static boolean b(com.corrodinggames.rts.game.units.am amVar, float f2, float f3) {
        return a(amVar.eo, amVar.ep, f2, f3, amVar.h());
    }

    public static void a(PlayerData playerData, PointF pointF) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        for (int i = 0; i <= 2; i++) {
            Iterator it = com.corrodinggames.rts.game.units.am.bF().iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it.next();
                if ((amVar instanceof com.corrodinggames.rts.game.units.am) && !amVar.bV && amVar.bX == playerData) {
                    if (i == 0 && amVar.bO) {
                        pointF.setSite(amVar.eo, amVar.ep);
                        return;
                    } else if (i == 1 && amVar.bP) {
                        pointF.setSite(amVar.eo, amVar.ep);
                        return;
                    } else if (i == 2) {
                        pointF.setSite(amVar.eo, amVar.ep);
                        return;
                    }
                }
            }
        }
        pointF.setSite(gameEngine.bL.i() / 2.0f, gameEngine.bL.j() / 2.0f);
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.y yVar) {
        amVar.cN = null;
        if (amVar instanceof com.corrodinggames.rts.game.units.y) {
            com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) amVar;
            if (yVar2.cO == yVar) {
                if (yVar2.dn() == null) {
                    GameEngine.m5e("Unload, attachment data is null");
                }
                yVar2.bx();
            }
        }
    }
}
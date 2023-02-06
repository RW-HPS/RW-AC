package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Point;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.af;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.k.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/h.class */
public class h extends c {
    f a;
    af b = new af();
    static Point c = new Point();

    public h(f fVar) {
        this.a = fVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.path.c
    public af a(am amVar) {
        af a = a(amVar.eo, amVar.ep);
        if (a == null) {
            return null;
        }
        af a2 = a(a.a, a.b);
        if (a2 == null) {
            return a;
        }
        af a3 = a(a2.a, a2.b);
        if (a3 == null) {
            return a2;
        }
        return a3;
    }

    @Override // com.corrodinggames.rts.gameFramework.path.c
    public void d(am amVar) {
        if (this.a != null) {
            this.a.d();
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = gameEngine.cw;
        float f2 = gameEngine.cx;
        af e = e(amVar);
        if (e != null) {
            float f3 = e.a;
            float f4 = e.b;
            f.c.b(-16776961);
            gameEngine.bO.a(amVar.eo - f, amVar.ep - f2, f3 - f, f4 - f2, f.c);
            af b = b(amVar);
            if (b != null) {
                f.c.b(-7829368);
                gameEngine.bO.a(f3 - f, f4 - f2, b.a - f, b.b - f2, f.c);
            }
        }
        af a = a(amVar);
        if (a != null) {
            float f5 = a.a;
            float f6 = a.b;
            f.c.b(-256);
            gameEngine.bO.a(amVar.eo - f, amVar.ep - f2, f5 - f, f6 - f2, f.c);
        }
    }

    public af e(am amVar) {
        return a(amVar.eo, amVar.ep);
    }

    @Override // com.corrodinggames.rts.gameFramework.path.c
    public af b(am amVar) {
        af a = a(amVar.eo, amVar.ep);
        if (a == null) {
            return null;
        }
        return a(a.a, a.b);
    }

    @Override // com.corrodinggames.rts.gameFramework.path.c
    public void c(am amVar) {
    }

    public af a(float f, float f2) {
        byte a;
        if (this.a.b == null) {
            return null;
        }
        b bVar = GameEngine.getGameEngine().bL;
        int i = (int) (f * bVar.r);
        int i2 = (int) (f2 * bVar.s);
        if (!bVar.c(i, i2) || (a = this.a.a(i, i2)) == 0) {
            return null;
        }
        f.a(a, c);
        int i3 = i - c.a;
        int i4 = i2 - c.b;
        this.b.a = (i3 * bVar.n) + bVar.p;
        this.b.b = (i4 * bVar.o) + bVar.q;
        return this.b;
    }
}
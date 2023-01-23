package com.corrodinggames.rts.gameFramework.k;

import android.graphics.Point;
import com.corrodinggames.rts.game.units.af;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/h.class */
public class h extends c {

    /* renamed from: a  reason: collision with root package name */
    f f605a;
    af b = new af();
    static Point c = new Point();

    public h(f fVar) {
        this.f605a = fVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.k.c
    public af a(am amVar) {
        af a2 = a(amVar.eo, amVar.ep);
        if (a2 == null) {
            return null;
        }
        af a3 = a(a2.f194a, a2.b);
        if (a3 == null) {
            return a2;
        }
        af a4 = a(a3.f194a, a3.b);
        if (a4 == null) {
            return a3;
        }
        return a4;
    }

    @Override // com.corrodinggames.rts.gameFramework.k.c
    public void d(am amVar) {
        if (this.f605a != null) {
            this.f605a.d();
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = gameEngine.cw;
        float f2 = gameEngine.cx;
        af e = e(amVar);
        if (e != null) {
            float f3 = e.f194a;
            float f4 = e.b;
            f.c.b(-16776961);
            gameEngine.bO.a(amVar.eo - f, amVar.ep - f2, f3 - f, f4 - f2, f.c);
            af b = b(amVar);
            if (b != null) {
                f.c.b(-7829368);
                gameEngine.bO.a(f3 - f, f4 - f2, b.f194a - f, b.b - f2, f.c);
            }
        }
        af a2 = a(amVar);
        if (a2 != null) {
            float f5 = a2.f194a;
            float f6 = a2.b;
            f.c.b(-256);
            gameEngine.bO.a(amVar.eo - f, amVar.ep - f2, f5 - f, f6 - f2, f.c);
        }
    }

    public af e(am amVar) {
        return a(amVar.eo, amVar.ep);
    }

    @Override // com.corrodinggames.rts.gameFramework.k.c
    public af b(am amVar) {
        af a2 = a(amVar.eo, amVar.ep);
        if (a2 == null) {
            return null;
        }
        return a(a2.f194a, a2.b);
    }

    @Override // com.corrodinggames.rts.gameFramework.k.c
    public void c(am amVar) {
    }

    public af a(float f, float f2) {
        byte a2;
        if (this.f605a.b == null) {
            return null;
        }
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        int i = (int) (f * bVar.r);
        int i2 = (int) (f2 * bVar.s);
        if (!bVar.c(i, i2) || (a2 = this.f605a.a(i, i2)) == 0) {
            return null;
        }
        f.a(a2, c);
        int i3 = i - c.f45a;
        int i4 = i2 - c.b;
        this.b.f194a = (i3 * bVar.n) + bVar.p;
        this.b.b = (i4 * bVar.o) + bVar.q;
        return this.b;
    }
}
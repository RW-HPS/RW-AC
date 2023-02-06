package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.ae;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/j.class */
public class j {
    public com.corrodinggames.rts.gameFramework.unitAction.e a;
    y b;
    ag c;
    ae d;
    Paint e;
    Rect f;
    boolean g;

    public j() {
        this.e = new Paint();
        this.f = new Rect(-101, 0, -1, 100);
        this.c = new ag();
    }

    public j(String str) {
        this();
        try {
            this.d = new ae(str);
            this.c.a(this.d);
            if (this.d.o != 0) {
                this.g = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean a() {
        if ((this.d != null && this.d.o != 0) || this.g) {
            return true;
        }
        return false;
    }

    public void a(y yVar) {
        a(yVar, yVar.m(), yVar.n(), 10);
    }

    public void a(y yVar, int i, int i2, int i3) {
        if (this.g) {
            return;
        }
        if (this.a != null && (i > this.a.m() || i2 > this.a.l())) {
            this.a.o();
            this.a = null;
            this.b = null;
        }
        if (this.a == null) {
            try {
                this.a = yVar.a(i + i3, i2 + i3, true);
                this.b = yVar.mo9a(this.a);
            } catch (OutOfMemoryError e) {
                this.g = true;
                GameEngine.a(com.corrodinggames.rts.gameFramework.u.gameImageCreate, e);
                return;
            }
        }
        this.b.a(i, i2);
    }

    public void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bO.b(this.f, this.e);
        gameEngine.bO.b(this.a, 0.0f, 0.0f, this.c);
    }
}
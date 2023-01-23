package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.ae;
import com.corrodinggames.rts.gameFramework.m.ag;
import com.corrodinggames.rts.gameFramework.m.y;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/j.class */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public com.corrodinggames.rts.gameFramework.m.e f162a;
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
        if (this.f162a != null && (i > this.f162a.m() || i2 > this.f162a.l())) {
            this.f162a.o();
            this.f162a = null;
            this.b = null;
        }
        if (this.f162a == null) {
            try {
                this.f162a = yVar.a(i + i3, i2 + i3, true);
                this.b = yVar.a(this.f162a);
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
        gameEngine.bO.b(this.f162a, 0.0f, 0.0f, this.c);
    }
}
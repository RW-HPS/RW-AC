package com.corrodinggames.rts.game.b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.ag;
import com.corrodinggames.rts.gameFramework.m.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/d.class */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public y f150a;
    int b;
    int c;
    public com.corrodinggames.rts.gameFramework.m.e d;
    public com.corrodinggames.rts.gameFramework.m.e e;
    public y f;
    public float g;
    public int i;
    public int j;
    final /* synthetic */ c s;
    public Paint h = new ag();
    public boolean k = true;
    public boolean l = true;
    public int m = 0;
    public boolean n = false;
    public final Rect o = new Rect();
    public final Rect p = new Rect();
    public final RectF q = new RectF();
    public final Rect r = new Rect();

    public void a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.e = gameEngine.bO.a(this.d.p, this.d.q, true);
        if (this.e != null && !this.e.A()) {
            this.e.a("fadeOutBitmap");
        }
        if (this.e == null || this.e.A()) {
            throw new OutOfMemoryError("Failed to create fade out bitmap");
        }
        this.e.b(true);
        this.f = gameEngine.bO.b(this.e);
    }

    public Rect b() {
        this.r.a(c(), d(), c() + this.s.i, d() + this.s.i);
        return this.r;
    }

    public d(c cVar, int i, int i2) {
        this.s = cVar;
        this.i = i;
        this.j = i2;
    }

    public int c() {
        return this.s.f + (this.i * this.s.k);
    }

    public int d() {
        return this.s.g + (this.j * this.s.k);
    }
}
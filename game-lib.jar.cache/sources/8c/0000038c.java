package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/g.class */
class g extends c {
    final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(b bVar) {
        super(bVar);
        this.b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public String c() {
        return b.v;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int d() {
        return ar.turret.c() + b.dL.c() + b.dM.c();
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        com.corrodinggames.rts.gameFramework.unitAction.e eVar;
        eVar = b.c;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    float a() {
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a(int i) {
        return 13.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public PointF c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.E(i);
        float f = (this.b.E() ? this.b.cg : this.b.cL[i].a) + (this.b.k == 1 ? -90 : 90);
        E.x += com.corrodinggames.rts.gameFramework.f.k(f) * 4.0f;
        E.y += com.corrodinggames.rts.gameFramework.f.j(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(am amVar, int i) {
        PointF c = c(i);
        Projectile a = Projectile.a(this.b, c.x, c.y);
        PointF K = this.b.K(i);
        a.K = K.x;
        a.L = K.y;
        a.l = amVar;
        a.h = 60.0f;
        a.t = 9.0f;
        a.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 30, 30);
        a.U = b(i);
        a.P = (short) 5;
        a.x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(c.x, c.y, this.b.eq, -1127220);
        gameEngine.bR.a(c.x, c.y, this.b.eq, this.b.cL[i].a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.t, 0.15f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), c.x, c.y);
        this.b.k = this.b.k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(float f) {
        if (this.b.cu < this.b.cv) {
            this.b.cu += 0.1f * f;
            if (this.b.cu > this.b.cv) {
                this.b.cu = this.b.cv;
            }
        }
        this.b.s(f);
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int b() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(c cVar) {
        if (!(cVar instanceof f)) {
            this.b.cv += 400.0f;
            this.b.cu += 400.0f;
        }
        this.b.cv += 2800.0f;
        this.b.cu += 2800.0f;
    }
}
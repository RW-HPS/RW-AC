package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
class e extends c {
    final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(b bVar) {
        super(bVar);
        this.b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public String c() {
        return b.x;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int d() {
        return ar.turret.c() + b.dO.c();
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        com.corrodinggames.rts.gameFramework.unitAction.e eVar;
        eVar = b.e;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    float a() {
        return 155.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a(int i) {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float b(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(am amVar, int i) {
        PointF c = c(i);
        Projectile a = Projectile.a(this.b, c.x, c.y);
        a.h = 60.0f;
        a.t = 3.0f + ((this.b.k * 13) % 2.0f);
        a.aR = false;
        a.G = true;
        a.ar = Color.a(105, 255, 255, 255);
        a.P = (short) 3;
        a.x = 1.3f;
        PointF a2 = amVar.a(c.x, c.y, a.t, a.h, a());
        a.aC = true;
        a.m = true;
        a.n = a2.x;
        a.o = a2.y;
        a.n += (-15) + ((this.b.k * 13) % 30);
        a.o += (-15) + ((63 + (this.b.k * 33)) % 30);
        a.em = 3;
        a.Y = b(i);
        a.Z = 65.0f;
        a.aa = true;
        a.C = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.b.k++;
        if (this.b.k > 10) {
            this.b.k = 0;
            gameEngine.bR.a(c.x, c.y, this.b.eq, this.b.cL[i].a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(c cVar) {
        this.b.cv += 900.0f;
        this.b.cu += 900.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(float f) {
        if (this.b.cu < this.b.cv) {
            this.b.cu += 0.15f * f;
            if (this.b.cu > this.b.cv) {
                this.b.cu = this.b.cv;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float e(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float f(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float g(int i) {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float h(int i) {
        return 0.0f;
    }
}
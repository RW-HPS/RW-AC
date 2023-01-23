package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
public class e extends c {
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar) {
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
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        com.corrodinggames.rts.gameFramework.m.e eVar;
        eVar = b.e;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a() {
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
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this.b, c.x, c.y);
        a2.h = 60.0f;
        a2.t = 3.0f + ((this.b.k * 13) % 2.0f);
        a2.aR = false;
        a2.G = true;
        a2.ar = Color.a(105, 255, 255, 255);
        a2.P = (short) 3;
        a2.x = 1.3f;
        PointF a3 = amVar.a(c.x, c.y, a2.t, a2.h, a());
        a2.aC = true;
        a2.m = true;
        a2.n = a3.x;
        a2.o = a3.y;
        a2.n += (-15) + ((this.b.k * 13) % 30);
        a2.o += (-15) + ((63 + (this.b.k * 33)) % 30);
        a2.em = 3;
        a2.Y = b(i);
        a2.Z = 65.0f;
        a2.aa = true;
        a2.C = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.b.k++;
        if (this.b.k > 10) {
            this.b.k = 0;
            gameEngine.bR.a(c.x, c.y, this.b.eq, this.b.cL[i].f203a);
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
package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/f.class */
public class f extends c {
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(bVar);
        this.b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public String c() {
        return b.u;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int d() {
        return ar.turret.c() + b.dL.c();
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        com.corrodinggames.rts.gameFramework.m.e eVar;
        eVar = b.b;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a() {
        return 185.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float b(int i) {
        return 44.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public PointF c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.E(i);
        float f = (this.b.E() ? this.b.cg : this.b.cL[i].f203a) + (this.b.k == 1 ? -90 : 90);
        E.x += com.corrodinggames.rts.gameFramework.f.k(f) * 4.0f;
        E.y += com.corrodinggames.rts.gameFramework.f.j(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(am amVar, int i) {
        PointF c = c(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this.b, c.x, c.y);
        PointF K = this.b.K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.l = amVar;
        a2.h = 60.0f;
        a2.t = 6.0f;
        a2.ar = Color.a(255, 40, 30, 110);
        a2.U = b(i);
        a2.P = (short) 5;
        a2.x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(c.x, c.y, this.b.eq, -1127220);
        gameEngine.bR.a(c.x, c.y, this.b.eq, this.b.cL[i].f203a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.t, 0.3f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), c.x, c.y);
        this.b.k = this.b.k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(c cVar) {
        this.b.cv += 400.0f;
        this.b.cu += 400.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(float f) {
        this.b.s(f);
    }
}
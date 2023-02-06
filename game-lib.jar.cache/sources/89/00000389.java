package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
class d extends c {
    final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar) {
        super(bVar);
        this.b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public String c() {
        return b.w;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int d() {
        return ar.turret.c() + b.dN.c();
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        com.corrodinggames.rts.gameFramework.unitAction.e eVar;
        eVar = b.d;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    float a() {
        return 350.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a(int i) {
        return 220.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(am amVar, int i) {
        PointF c = c(i);
        Projectile a = Projectile.a(this.b, c.x, c.y);
        PointF K = this.b.K(i);
        a.K = K.x;
        a.L = K.y;
        a.h = 150.0f;
        a.t = 4.0f;
        a.aQ = true;
        a.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        a.R = (short) 2;
        a.P = (short) 0;
        a.x = 0.9f;
        PointF a2 = amVar.a(c.x, c.y, a.t, a.h, a());
        a.aC = true;
        a.m = true;
        a.n = a2.x;
        a.o = a2.y;
        a.Y = b(i);
        a.Z = 55.0f;
        a.aa = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.r, 0.3f, c.x, c.y);
        gameEngine.bR.a(c.x, c.y, this.b.eq, this.b.cL[i].a);
        gameEngine.bR.a(a, -1118482);
        com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(c.x, c.y, this.b.eq, -1118482);
        if (a3 != null) {
            a3.V = 15.0f;
            a3.W = a3.V;
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public int b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public void a(c cVar) {
        this.b.cv += 300.0f;
        this.b.cu += 300.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float e(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float h(int i) {
        return -2.0f;
    }
}
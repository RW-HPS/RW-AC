package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
public class d extends c {
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
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
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        com.corrodinggames.rts.gameFramework.m.e eVar;
        eVar = b.d;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.d.a.c
    public float a() {
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
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this.b, c.x, c.y);
        PointF K = this.b.K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.h = 150.0f;
        a2.t = 4.0f;
        a2.aQ = true;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        a2.R = (short) 2;
        a2.P = (short) 0;
        a2.x = 0.9f;
        PointF a3 = amVar.a(c.x, c.y, a2.t, a2.h, a());
        a2.aC = true;
        a2.m = true;
        a2.n = a3.x;
        a2.o = a3.y;
        a2.Y = b(i);
        a2.Z = 55.0f;
        a2.aa = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.r, 0.3f, c.x, c.y);
        gameEngine.bR.a(c.x, c.y, this.b.eq, this.b.cL[i].f203a);
        gameEngine.bR.a(a2, -1118482);
        com.corrodinggames.rts.gameFramework.d.e a4 = gameEngine.bR.a(c.x, c.y, this.b.eq, -1118482);
        if (a4 != null) {
            a4.V = 15.0f;
            a4.W = a4.V;
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
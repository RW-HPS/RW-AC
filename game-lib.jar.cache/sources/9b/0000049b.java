package com.corrodinggames.rts.gameFramework.emitter;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/b.class */
public class b {
    boolean a = false;
    e b = null;
    Paint c = new ag();
    RectF d = new RectF();
    float e = 0.0f;
    float f = 0.0f;

    public boolean a() {
        return GameEngine.getGameEngine().settingsEngine.renderClouds;
    }

    public void b() {
        this.b = GameEngine.getGameEngine().bO.a(AssetsID.drawable.noise, false);
        this.a = true;
    }

    public void a(float f) {
        if (!a()) {
            return;
        }
        if (!this.a) {
            b();
        }
        this.e += 0.2f * f;
        this.f += 0.07f * f;
        this.e %= this.b.m();
        this.f %= this.b.l();
    }

    public void b(float f) {
        if (!a()) {
            return;
        }
        if (!this.a) {
            b();
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bO.i();
        gameEngine.bO.a(3.0f, 3.0f);
        float f2 = (int) f.f((-gameEngine.cw) / 3.0f, 0.0f);
        float f3 = (int) f.f((-gameEngine.cx) / 3.0f, 0.0f);
        this.d.a(f2, f3, ((int) (gameEngine.cA / 3.0f)) + 1, ((int) (gameEngine.cB / 3.0f)) + 1);
        this.c.b(-16777216);
        this.c.c(40);
        gameEngine.bO.a(this.b, this.d, this.c, (gameEngine.cw / 3.0f) + f2 + this.e, (gameEngine.cx / 3.0f) + f3 + this.f, 0, 0);
        gameEngine.bO.j();
    }
}
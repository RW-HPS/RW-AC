package com.corrodinggames.rts.game.units.e;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/o.class */
public class o extends j {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    Rect e;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.tankDestroyer;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.tank2);
        a = gameEngine.bO.a(AssetsID.drawable.tank2_dead);
        c = gameEngine.bO.a(AssetsID.drawable.tank2_turret);
        d = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return a;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.b(this.eo, this.ep, this.eq);
        this.M = a;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, this.eo, this.ep);
        bq();
        return true;
    }

    public o(boolean z) {
        super(z);
        this.e = new Rect();
        T(16);
        U(30);
        this.cj = 11.0f;
        this.ck = this.cj + 2.0f;
        this.cv = 350.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        a2.U = 35.0f;
        a2.l = amVar;
        a2.h = 60.0f;
        a2.t = 3.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.q, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 150.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        if (!super.c(f)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 10.0f;
    }
}
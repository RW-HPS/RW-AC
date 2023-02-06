package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class k extends j {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] e = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e f = null;
    Rect g;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.laserTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.laser_tank_base);
        a = gameEngine.bO.a(AssetsID.drawable.laser_tank_dead);
        c = gameEngine.bO.a(AssetsID.drawable.laser_tank_turrent);
        d = gameEngine.bO.a(AssetsID.drawable.laser_tank_charge);
        e = PlayerData.a(b);
        f = a(b, b.m(), b.l());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return a;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine();
        this.M = a;
        S(0);
        this.bT = false;
        a(ab.small);
        return true;
    }

    public k(boolean z) {
        super(z);
        this.g = new Rect();
        a(b, 1);
        this.cj = 14.0f;
        this.ck = this.cj + 2.0f;
        this.cv = 300.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 8.0f;
        a2.B = true;
        a2.A = true;
        a2.aQ = true;
        a2.ar = Color.a(80, 255, 0, 0);
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.y, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bW() {
        if (this.cL[0].e > 0.0f) {
            return 1.0f - (this.cL[0].e / b(0));
        }
        if (this.cL[0].f != 0.0f) {
            return this.cL[0].f / e(0);
        }
        return super.bW();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bX() {
        return this.cL[0].e > 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 190.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        y.a((com.corrodinggames.rts.game.units.y) this);
        if (!this.bV) {
            float e2 = this.cL[0].f / e(0);
            if (e2 != 0.0f) {
                PointF E = E(0);
                gameEngine.bO.i();
                gameEngine.bO.b(E.x - gameEngine.cw, E.y - gameEngine.cx);
                gameEngine.bO.a(e2, e2);
                gameEngine.bO.a(d, 0.0f, 0.0f, (Paint) null);
                gameEngine.bO.j();
                return true;
            }
            return true;
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
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 19.0f;
    }
}
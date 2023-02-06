package com.corrodinggames.rts.game.units.e;

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

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class n extends j {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] e = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    int f;
    float g;
    float h;
    Rect i;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.tank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.tank2);
        a = gameEngine.bO.a(AssetsID.drawable.tank2_dead);
        c = gameEngine.bO.a(AssetsID.drawable.tank2_turret);
        d = gameEngine.bO.a(AssetsID.drawable.tank2_shadow);
        e = PlayerData.a(b);
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
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        this.M = a;
        S(0);
        this.bT = false;
        a(ab.small);
        return true;
    }

    public n(boolean z) {
        super(z);
        this.i = new Rect();
        a(b, 3);
        this.cj = 11.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 210.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!this.bV && this.cf != 0.0f) {
            this.g += f;
            if (this.g > 1.0f) {
                this.g = 0.0f;
                this.f++;
                if (this.f > 2) {
                    this.f = 0;
                }
            }
            if (this.cf > 0.0f && this.el) {
                this.h += f;
                if (this.h > 9.0f) {
                    this.h = 0.0f;
                    K();
                }
            }
        }
    }

    public void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            gameEngine.bR.c(this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg + 180.0f + f) * this.cj), this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg + 180.0f + f) * this.cj), this.eq, this.cg + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.U = 30.0f;
        a2.l = amVar;
        a2.h = 60.0f;
        a2.t = 3.0f;
        a2.P = (short) 1;
        a2.x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.q, 0.3f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 4.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        if (!super.c(f)) {
            return false;
        }
        y.a((com.corrodinggames.rts.game.units.y) this);
        if (!this.bV) {
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.17f;
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
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        if (z) {
            return super.a_(z);
        }
        if (this.bV) {
            return super.a_(z);
        }
        return super.a(z, this.f);
    }
}
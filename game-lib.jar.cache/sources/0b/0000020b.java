package com.corrodinggames.rts.game.units.b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/f.class */
public class f extends b {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e e = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] f = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    boolean g;
    float o;
    float p;
    float q;
    Rect r;
    Rect s;

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.p);
        gameOutputStream.writeFloat(this.o);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.b() >= 9) {
            this.p = gameInputStream.readFloat();
            this.o = gameInputStream.readFloat();
            if (gameInputStream.b() == 8) {
                this.g = gameInputStream.readBoolean();
            }
        } else {
            this.o = 0.5f;
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.helicopter;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.helicopter);
        c = gameEngine.bO.a(AssetsID.drawable.helicopter_blades);
        d = gameEngine.bO.a(AssetsID.drawable.helicopter_shadow);
        e = gameEngine.bO.a(AssetsID.drawable.helicopter_shadow_blades);
        a = gameEngine.bO.a(AssetsID.drawable.helicopter_dead);
        f = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return a;
        }
        return f[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = a;
        S(0);
        this.bT = false;
        return true;
    }

    public f(boolean z) {
        super(z);
        this.g = false;
        this.p = 0.0f;
        this.r = new Rect();
        this.s = new Rect();
        T(26);
        U(46);
        this.cj = 13.0f;
        this.ck = this.cj + 2.0f;
        this.cv = 150.0f;
        this.cu = this.cv;
        this.M = b;
        this.N = d;
        this.eq = 0.0f;
        this.o = 0.14f;
        this.q = 0.0f;
        S(5);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void n() {
        super.n();
        this.eq = 20.0f;
        this.o = 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.y
    public boolean I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (this.bV) {
            return;
        }
        this.o = com.corrodinggames.rts.gameFramework.f.a(this.o, 0.5f, 0.003f * f2);
        this.q += 70.0f * this.o * f2;
        if (this.q >= 360.0f) {
            this.q -= 360.0f;
            this.q += com.corrodinggames.rts.gameFramework.f.a(this, 0, 4);
        }
        if (this.o > 0.4f) {
            this.p += 2.0f * f2;
            if (this.p > 360.0f) {
                this.p -= 360.0f;
            }
            this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 20.0f + (com.corrodinggames.rts.gameFramework.f.j(this.p) * 1.5f), 0.1f * f2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y, this.eq, i);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.U = 17.0f;
        a2.l = amVar;
        a2.h = 30.0f;
        a2.t = 8.0f;
        a2.S = false;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        a2.A = true;
        a2.aR = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.s, 0.2f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.08f, 0.08f), E.x, E.y);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        gameEngine.bR.a(E.x, E.y, this.eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        if (this.eq < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        return super.a_(z);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        if (!this.bV) {
            Paint aN = aN();
            GameEngine gameEngine = GameEngine.getGameEngine();
            this.s.a(0, 0, c.m(), c.l());
            float f3 = this.q;
            if (this.co) {
            }
            gameEngine.bO.a(c, this.s, this.eo - GameEngine.getGameEngine().cw, (this.ep - GameEngine.getGameEngine().cx) - this.eq, f3, aN);
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
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 7.0f;
    }
}
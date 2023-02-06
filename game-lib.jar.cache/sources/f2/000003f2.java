package com.corrodinggames.rts.game.units.h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/a.class */
public class a extends f {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] e = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    Rect f;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.battleShip;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 9000.0f;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.battle_ship_t2);
        a = gameEngine.bO.a(AssetsID.drawable.battle_ship_t2_dead);
        c = gameEngine.bO.a(AssetsID.drawable.battle_ship_t2_turret);
        e = PlayerData.a(b);
        d = a(b, b.m(), b.l());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return a;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = a;
        S(0);
        this.bT = false;
        return true;
    }

    public a(boolean z) {
        super(z);
        this.f = new Rect();
        b(b);
        this.cj = 20.0f;
        this.ck = this.cj;
        this.cv = 1200.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 65.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y, this.eq, i);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 80.0f;
        a2.x = 2.0f;
        a2.t = 4.0f;
        a2.S = true;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        a2.aQ = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.r, 0.2f, E.x, E.y);
        gameEngine.bR.a(a2, -1118720);
        com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        if (a3 != null) {
            com.corrodinggames.rts.gameFramework.emitter.c.a(a3, this);
        }
        gameEngine.bR.a(E.x, E.y, this.eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C(int i) {
        if (this.ci && bc() > 0.95d) {
            if (i == 0) {
                return this.cg + 140.0f;
            }
            return this.cg - 140.0f;
        }
        return this.cg;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        if (!super.c(f)) {
            return false;
        }
        y.a((com.corrodinggames.rts.game.units.y) this);
        return true;
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
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i) {
        float f;
        PointF G = super.G(i);
        float f2 = G.x;
        float f3 = G.y;
        if (i == 0) {
            f = 22.0f;
        } else {
            f = 4.0f;
        }
        bh.setSite(f2 + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * f), f3 + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * f));
        return bh;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return i * 30;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float I(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float J(int i) {
        return 12.0f;
    }
}
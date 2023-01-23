package com.corrodinggames.rts.game.units.b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/e.class */
public class e extends b {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f213a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    float f;
    Rect g;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.gunShip;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(R.drawable.gunship);
        c = gameEngine.bO.a(R.drawable.gunship_shadow);
        f213a = gameEngine.bO.a(R.drawable.gunship_dead);
        e = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f213a;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = f213a;
        S(0);
        this.bT = false;
        return true;
    }

    public e(boolean z) {
        super(z);
        this.f = 0.0f;
        this.g = new Rect();
        T(25);
        U(35);
        this.cj = 15.0f;
        this.ck = this.cj + 0.0f;
        this.cv = 260.0f;
        this.cu = this.cv;
        this.M = b;
        this.N = c;
        this.eq = 0.0f;
        S(5);
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
    public void a(float f) {
        super.a(f);
        if (this.bV) {
            return;
        }
        this.f += 2.0f * f;
        if (this.f > 360.0f) {
            this.f -= 360.0f;
        }
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 20.0f + (com.corrodinggames.rts.gameFramework.f.j(this.f) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        float g = g(i);
        float f = this.cg;
        bg.setSite(this.eo + (com.corrodinggames.rts.gameFramework.f.k(f) * g), this.ep + (com.corrodinggames.rts.gameFramework.f.j(f) * g));
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 35.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq, i);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.ar = Color.a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 80.0f;
        a2.t = 4.0f;
        a2.x = 2.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].f203a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.u, 0.3f, this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        if (this.eq < 15.0f) {
            return 0.0f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 4.0f;
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
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.2f;
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
    public boolean af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 15.0f;
    }
}
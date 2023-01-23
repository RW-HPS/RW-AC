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

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/a.class */
public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f210a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    float f;
    Rect g;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.airShip;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(R.drawable.ship);
        c = gameEngine.bO.a(R.drawable.ship_shadow);
        f210a = gameEngine.bO.a(R.drawable.ship_dead);
        e = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f210a;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = f210a;
        S(0);
        this.bT = false;
        return true;
    }

    public a(boolean z) {
        super(z);
        this.g = new Rect();
        T(24);
        U(22);
        this.cj = 11.0f;
        this.ck = this.cj + 0.0f;
        this.cv = 250.0f;
        this.cu = this.cv;
        this.M = b;
        this.N = c;
        this.eq = 0.0f;
        this.f = 0.18f;
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
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 20.0f, 0.3f * f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq, i);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.U = 30.0f;
        a2.l = amVar;
        a2.h = 75.0f;
        a2.t = 6.0f;
        a2.x = 2.0f;
        a2.y = 4.0f;
        a2.ar = Color.a(250, 74, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 255);
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.d.e a3 = gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].f203a);
        if (a3 != null) {
            a3.aq = 10;
        }
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.y, 0.14f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 170.0f;
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
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bm() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.16f;
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
    public boolean ag() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float d(boolean z) {
        return this.cL[0].f203a + 90.0f;
    }
}
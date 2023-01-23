package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/g.class */
public class g extends h {

    /* renamed from: a  reason: collision with root package name */
    float f350a;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    Rect f;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.hoverTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        c = gameEngine.bO.a(R.drawable.hover_tank);
        b = gameEngine.bO.a(R.drawable.hover_tank_dead);
        d = gameEngine.bO.a(R.drawable.hover_tank_shadow);
        e = PlayerData.a(c);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return b;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        this.M = b;
        S(0);
        this.bT = false;
        a(ab.small);
        return true;
    }

    public g(boolean z) {
        super(z);
        this.f350a = 0.0f;
        this.f = new Rect();
        b(c);
        this.cj = 7.0f;
        this.ck = this.cj + 2.0f;
        this.cv = 150.0f;
        this.cu = this.cv;
        this.M = c;
        this.N = d;
    }

    @Override // com.corrodinggames.rts.game.units.e.h, com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.bV || !bT()) {
            return;
        }
        this.f350a += 3.0f * f;
        if (this.f350a > 360.0f) {
            this.f350a -= 360.0f;
        }
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 4.0f + (com.corrodinggames.rts.gameFramework.f.j(this.f350a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq, i);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.ar = Color.a(255, 50, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 85.0f;
        a2.t = 2.0f;
        a2.r = 6.0f;
        a2.s = 0.2f;
        a2.P = (short) 6;
        a2.x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -14483678);
        gameEngine.bR.a(a2, -16716288);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.z, 0.3f, 1.3f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void i(float f) {
        this.cg += f;
        if (this.cg > 180.0f) {
            this.cg -= 360.0f;
        }
        if (this.cg < -180.0f) {
            this.cg += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.09f;
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
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float d(boolean z) {
        return this.cL[0].f203a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
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
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.5f;
    }
}
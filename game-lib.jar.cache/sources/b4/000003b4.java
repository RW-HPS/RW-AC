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
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class e extends h {

    /* renamed from: a  reason: collision with root package name */
    float f348a;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    Rect f;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.heavyHoverTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        c = gameEngine.bO.a(R.drawable.heavy_hover_tank);
        b = gameEngine.bO.a(R.drawable.heavy_hover_tank_dead);
        d = gameEngine.bO.a(R.drawable.heavy_hover_tank_shadow);
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
        GameEngine.getGameEngine();
        this.M = b;
        S(0);
        this.bT = false;
        a(ab.normal);
        return true;
    }

    public e(boolean z) {
        super(z);
        this.f348a = 0.0f;
        this.f = new Rect();
        T(24);
        U(36);
        this.cj = 11.0f;
        this.ck = this.cj + 2.0f;
        this.cv = 450.0f;
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
        this.f348a += 3.0f * f;
        if (this.f348a > 360.0f) {
            this.f348a -= 360.0f;
        }
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 4.0f + (com.corrodinggames.rts.gameFramework.f.j(this.f348a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq, i);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 95.0f;
        a2.t = 1.0f;
        a2.r = 7.0f;
        a2.s = 0.2f;
        a2.P = (short) 7;
        a2.x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.d.e a3 = gameEngine.bR.a(E.x, E.y, this.eq, -56798);
        if (a3 != null) {
            a3.E = 0.7f;
            a3.V = 30.0f;
            a3.W = a3.V;
            com.corrodinggames.rts.gameFramework.d.c.a(a3, this);
        }
        gameEngine.bR.a(a2, -1179648);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.z, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 20.0f;
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
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 2.4f;
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
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }
}
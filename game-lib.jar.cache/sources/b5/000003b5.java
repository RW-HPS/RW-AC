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

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class f extends j {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f349a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e[] c = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    int e;
    float f;
    float g;
    Rect h;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.heavyTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.m.e a2 = gameEngine.bO.a(R.drawable.heavy_tank);
        c = PlayerData.a(a2);
        f349a = gameEngine.bO.a(R.drawable.heavy_tank_dead);
        b = gameEngine.bO.a(R.drawable.heavy_tank_turret);
        d = a(a2, a2.m() / 3, a2.l());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f349a;
        }
        return c[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return b;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV && this.cm >= 1.0f && !this.cq;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        this.M = f349a;
        S(0);
        this.bT = false;
        a(ab.normal);
        return true;
    }

    public f(boolean z) {
        super(z);
        this.h = new Rect();
        a(c[7], 3);
        this.cj = 15.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 600.0f;
        this.cu = this.cv;
        this.M = c[7];
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!this.bV && this.cf != 0.0f) {
            this.f += f;
            if (this.f > 1.4d) {
                this.f = 0.0f;
                this.e++;
                if (this.e > 2) {
                    this.e = 0;
                }
            }
            if (this.el) {
                this.g += f;
                if (this.g > 9.0f) {
                    this.g = 0.0f;
                    K();
                }
            }
        }
    }

    public void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = this.cg;
        if (this.cf < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            gameEngine.bR.c(this.eo + (com.corrodinggames.rts.gameFramework.f.k(f + 180.0f + f2) * this.cj), this.ep + (com.corrodinggames.rts.gameFramework.f.j(f + 180.0f + f2) * this.cj), this.eq, f + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!amVar.i()) {
            PointF E = E(i);
            com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y);
            PointF K = K(i);
            a2.K = K.x;
            a2.L = K.y;
            a2.ar = Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            a2.U = q(i);
            a2.l = amVar;
            a2.h = 60.0f;
            a2.t = 4.0f;
            a2.x = 2.0f;
            a2.aQ = true;
            a2.z = true;
            gameEngine.bR.a(a2, -16716288);
            gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
            gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].f203a);
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.u, 0.3f, this.eo, this.ep);
            return;
        }
        PointF E2 = E(i);
        E2.setSite(this.eo, this.ep);
        com.corrodinggames.rts.game.f a3 = com.corrodinggames.rts.game.f.a(this, this.eo, this.ep);
        a3.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a3.U = q(i);
        a3.l = amVar;
        a3.h = 190.0f;
        a3.t = 0.5f;
        a3.r = 5.0f;
        a3.aH = true;
        a3.aI = 10.0f;
        a3.aJ = 15.0f;
        a3.aM = true;
        a3.aQ = true;
        a3.aG = true;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.2f, this.eo, this.ep);
        gameEngine.bR.a(a3, -1118720);
        gameEngine.bR.a(E2.x, E2.y, this.eq, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 70.0f;
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
    public float A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.05f;
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
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        if (z) {
            return super.a_(z);
        }
        if (this.bV) {
            return super.a_(z);
        }
        return super.a(z, this.e);
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

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }
}
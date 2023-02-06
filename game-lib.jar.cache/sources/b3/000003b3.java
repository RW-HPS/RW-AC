package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class d extends j {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    int e;
    float f;
    Rect g;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.experimentalTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.unitAction.e a2 = gameEngine.bO.a(AssetsID.drawable.experimental_tank);
        d = PlayerData.a(a2);
        a = gameEngine.bO.a(AssetsID.drawable.experimental_tank_dead);
        b = gameEngine.bO.a(AssetsID.drawable.experimental_tank_turret);
        c = a(a2, a2.m() / 2, a2.l());
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
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq > -2.0f && this.cm >= 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        if (R(i)) {
            return null;
        }
        return b;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine();
        a(ab.largeUnit);
        this.M = a;
        S(0);
        this.bT = false;
        return true;
    }

    public d(boolean z) {
        super(z);
        this.g = new Rect();
        a(d[7], 2);
        this.cj = 37.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 6000.0f;
        this.cu = this.cv;
        this.M = d[7];
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!this.bV) {
            if (this.cl != 0.0f) {
                S(2);
            } else {
                S(4);
            }
        }
        if (this.cK) {
            this.f += f;
            if (this.f > 5.0f) {
                this.f = 0.0f;
                this.e = 1 - this.e;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        if (!R(i)) {
            PointF E = E(i);
            Projectile a2 = Projectile.a(this, E.x, E.y);
            PointF K = K(i);
            a2.K = K.x;
            a2.L = K.y;
            a2.ar = Color.a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            a2.h = 120.0f;
            a2.t = 5.0f;
            a2.l = amVar;
            a2.Y = 60.0f;
            a2.U = 40.0f;
            a2.Z = 45.0f;
            a2.aa = true;
            a2.x = 2.0f;
            a2.aQ = true;
            a2.P = (short) 9;
            a2.x = 1.0f;
            a2.em = this.em;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.bR.a(E.x, E.y, this.eq, 16745216);
            gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
            gameEngine.bR.a(a2, -1127220);
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.v, 0.3f, this.eo, this.ep);
            return;
        }
        PointF E2 = E(i);
        E2.setSite(this.eo, this.ep);
        Projectile a3 = Projectile.a(this, this.eo, this.ep);
        a3.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a3.U = 60.0f;
        a3.l = amVar;
        a3.h = 190.0f;
        a3.t = 3.0f;
        a3.r = 6.0f;
        a3.aH = true;
        a3.aI = 10.0f;
        a3.aJ = 15.0f;
        a3.aM = true;
        a3.aQ = true;
        a3.aG = true;
        a3.em = this.em;
        GameEngine gameEngine2 = GameEngine.getGameEngine();
        gameEngine2.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.2f, this.eo, this.ep);
        gameEngine2.bR.a(a3, -1118720);
        gameEngine2.bR.a(E2.x, E2.y, this.eq, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(int i, am amVar, boolean z, boolean z2) {
        if (!z && z2 && !h(amVar)) {
            return false;
        }
        if (R(i)) {
            if (!amVar.i()) {
                return false;
            }
            return true;
        } else if (amVar.i()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 310.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        if (R(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        if (R(i)) {
            i -= 4;
        }
        return i * 20;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int bh() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        if (R(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        if (R(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        if (this.bV && !z) {
            return super.a_(z);
        }
        if (z) {
            return super.a_(z);
        }
        int i = 0 + (this.e * this.es);
        this.g.a(i, 0, i + this.es, 0 + this.et);
        return this.g;
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
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i) {
        PointF G = super.G(i);
        float f = G.x;
        float f2 = G.y;
        if (!R(i)) {
            if (i <= 1) {
                f += com.corrodinggames.rts.gameFramework.f.k(this.cg) * 5.0f;
                f2 += com.corrodinggames.rts.gameFramework.f.j(this.cg) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += com.corrodinggames.rts.gameFramework.f.k(this.cg + f3) * 18.0f;
            f2 += com.corrodinggames.rts.gameFramework.f.j(this.cg + f3) * 18.0f;
        }
        bh.setSite(f, f2);
        return bh;
    }

    public boolean R(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int cw() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dd() {
        return true;
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
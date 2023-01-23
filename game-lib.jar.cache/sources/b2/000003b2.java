package com.corrodinggames.rts.game.units.e;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class c extends h {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f346a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    public static com.corrodinggames.rts.gameFramework.m.e d = null;
    public static com.corrodinggames.rts.gameFramework.m.e e = null;
    static com.corrodinggames.rts.gameFramework.m.e[] f = new com.corrodinggames.rts.gameFramework.m.e[10];
    int g;
    float h;
    com.corrodinggames.rts.game.f i;
    Rect j;
    Paint k;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.experimentalHoverTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.m.e a2 = gameEngine.bO.a(R.drawable.experimental_hovertank);
        f = PlayerData.a(a2);
        f346a = gameEngine.bO.a(R.drawable.experimental_hovertank_dead);
        b = gameEngine.bO.a(R.drawable.experimental_hovertank_turret);
        c = a(a2, a2.m() / 1, a2.l());
        d = gameEngine.bO.a(R.drawable.experimental_hovertank_shield);
        e = gameEngine.bO.a(R.drawable.shield_mid);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        if (this.i != null && this.i.ej) {
            this.i = null;
        }
        gameOutputStream.a(this.i);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.i = (com.corrodinggames.rts.game.f) gameInputStream.a(com.corrodinggames.rts.game.f.class);
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f346a;
        }
        return f[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq > -2.0f;
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
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return b;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e T() {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine();
        this.M = f346a;
        S(0);
        this.bT = false;
        a(ab.largeUnit);
        return true;
    }

    public c(boolean z) {
        super(z);
        this.h = 0.0f;
        this.j = new Rect();
        this.k = y.a();
        a(f[7], 1);
        this.cj = 30.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 3500.0f;
        this.cu = this.cv;
        this.cA = 5000.0f;
        this.cx = this.cA;
        this.M = f[7];
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bW() {
        if (this.cA > 0.0f && this.cx < this.cA) {
            return this.cx / this.cA;
        }
        return super.bW();
    }

    @Override // com.corrodinggames.rts.game.units.e.h, com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (this.bV || !bT()) {
            return;
        }
        if (!this.bV) {
            if (this.cl != 0.0f) {
                S(2);
            } else {
                S(4);
            }
        }
        if (this.cK) {
        }
        this.h += 1.0f * f2;
        if (this.h > 360.0f) {
            this.h -= 360.0f;
        }
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 4.0f + (com.corrodinggames.rts.gameFramework.f.j(this.h) * 2.0f), 0.1f * f2);
        this.cx = com.corrodinggames.rts.gameFramework.f.a(this.cx, this.cA, 0.25f * f2);
        this.cy = com.corrodinggames.rts.gameFramework.f.a(this.cy, 0.0f, 4.0f * f2);
        if (this.cy > 50.0f) {
            this.cy = 50.0f;
        }
        if (this.i != null) {
            PointF E = E(0);
            this.i.eo = E.x;
            this.i.ep = E.y;
            this.i.eq = this.eq;
            if (this.i.ej) {
                this.i = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float L(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF K(int i) {
        PointF K = super.K(i);
        if (this.i != null) {
            K.x += this.i.K;
            K.y += this.i.L;
        }
        return K;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        GameEngine.getGameEngine();
        PointF E = E(i);
        if (this.i != null) {
            boolean z = false;
            if (this.i.ej) {
                z = true;
            }
            if (this.i.l != amVar) {
                z = true;
            }
            if (z) {
                this.i = null;
            }
        }
        float b2 = b(i) + e(i) + 5.0f;
        if (this.i != null) {
            this.i.h = b2;
            return;
        }
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y);
        a2.U = 380.0f;
        a2.l = amVar;
        a2.h = b2;
        a2.B = true;
        a2.A = true;
        a2.aQ = true;
        a2.E = true;
        a2.J = 70.0f;
        a2.F = 230.0f;
        a2.ak = 0.75f;
        a2.em = this.em;
        this.i = a2;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        if (this.bV && !z) {
            return super.a_(z);
        }
        if (z) {
            return super.a_(z);
        }
        int i = 0 + (this.g * this.es);
        this.j.a(i, 0, i + this.es, 0 + this.et);
        return this.j;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        com.corrodinggames.rts.gameFramework.m.e T;
        if (!super.c(f2)) {
            return false;
        }
        y.a((com.corrodinggames.rts.game.units.y) this);
        if (!this.bV) {
            float f3 = 0.0f;
            if (this.i != null) {
                f3 = com.corrodinggames.rts.gameFramework.f.b(this.i.e(), 0.25f) * 3.0f;
            }
            y.a(this, l.e, f3, 0);
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.bV && this.cx > 0.0f && this.cz == 0.0f && (T = T()) != null) {
            this.k.a((int) ((0.09f + ((this.cx / this.cA) * 0.4f) + ((com.corrodinggames.rts.gameFramework.f.b(this.cy, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            gameEngine.bO.a(T, this.eo - gameEngine.cw, (this.ep - gameEngine.cx) - this.eq, d(false) - 90.0f, this.k);
            return true;
        }
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
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i) {
        bh.setSite(this.eo, this.ep);
        return bh;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        return 1;
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
    public int cw() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dd() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f2) {
        super.e(f2);
        y.a(this, m());
    }
}
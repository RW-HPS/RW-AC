package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g.class */
public class g extends com.corrodinggames.rts.game.units.e.j implements d {
    public boolean a;
    PointF[] b;
    PointF[] c;
    static Paint d;
    static Paint e;
    static Paint f;
    int g;
    float h;
    float i;
    int j;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: f */
    public ar mo1r() {
        return ar.builder;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] b() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] e_() {
        return this.c;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return dN[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(am amVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return com.corrodinggames.rts.game.units.e.b.b;
        }
        return com.corrodinggames.rts.game.units.e.b.d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.b(this.eo, this.ep, this.eq);
        this.M = com.corrodinggames.rts.game.units.e.b.b;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, this.eo, this.ep);
        bq();
        return true;
    }

    public g(boolean z) {
        super(z);
        this.b = new PointF[6];
        this.c = new PointF[this.b.length];
        d = new Paint();
        d.a(40, 0, 255, 0);
        d.a(true);
        d.a(2.0f);
        d.a(Paint.Cap.ROUND);
        e = new Paint();
        e.a(d);
        e.a(55, 255, 60, 60);
        f = new Paint();
        f.a(60, 255, 255, 255);
        T(20);
        U(20);
        this.cj = 10.0f;
        this.eo = -1000.0f;
        this.ep = -1000.0f;
        this.ck = this.cj;
        this.cv = 170000.0f;
        this.cu = this.cv;
        this.M = com.corrodinggames.rts.game.units.e.b.b;
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = new PointF();
            this.c[i] = new PointF();
        }
    }

    public static void a(float f2, d dVar) {
        y yVar = (y) dVar;
        PointF[] b = dVar.b();
        PointF[] e_ = dVar.e_();
        am X = yVar.X();
        yVar.aN = X != null;
        if (X != null) {
            for (int i = 0; i < b.length; i++) {
                PointF pointF = b[i];
                PointF pointF2 = e_[i];
                pointF.x = com.corrodinggames.rts.gameFramework.f.a(pointF.x, pointF2.x, 0.1f * f2);
                pointF.y = com.corrodinggames.rts.gameFramework.f.a(pointF.y, pointF2.y, 0.1f * f2);
                pointF.x += (pointF2.x - pointF.x) * 0.04f * f2;
                pointF.y += (pointF2.y - pointF.y) * 0.04f * f2;
                float f3 = X.cj * 0.75f;
                if (com.corrodinggames.rts.gameFramework.f.c(pointF.x - pointF2.x) < 1.0f) {
                    pointF2.x = com.corrodinggames.rts.gameFramework.f.d(-f3, f3);
                }
                if (com.corrodinggames.rts.gameFramework.f.c(pointF.y - pointF2.y) < 1.0f) {
                    pointF2.y = com.corrodinggames.rts.gameFramework.f.d(-f3, f3);
                }
            }
        } else if (b[0].x != 0.0f || b[0].y != 0.0f) {
            for (int i2 = 0; i2 < b.length; i2++) {
                PointF pointF3 = b[i2];
                PointF pointF4 = e_[i2];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (!this.bV) {
            a(f2, this);
        }
        this.cu = this.cv;
        this.g++;
        this.h += f2;
        this.i += f2;
        GameEngine.getGameEngine();
        if (this.a) {
            GameEngine.m5e("Stress test active");
            for (int i = 0; i < 6000; i++) {
                w();
            }
            ci();
        } else if (this.i > 3.0f) {
            this.i = 0.0f;
            w();
        }
    }

    public void w() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.j++;
        as asVar = (as) ar.ae.get(com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 0, ar.ae.size() - 1, 1 + this.j));
        boolean z = true;
        if (com.corrodinggames.rts.game.units.custom.l.b == asVar) {
            z = false;
        }
        if (asVar == ar.spreadingFire) {
            z = false;
        }
        if (z) {
            am a = asVar.a();
            a.eo = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 200, ((int) gameEngine.bL.i()) - 200, 2 + this.g + this.j);
            a.ep = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 200, ((int) gameEngine.bL.j()) - 200, 3 + this.g + this.j + (this.j * 9));
            try {
                a.Q(com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 0, 3, 4 + this.g + this.j + (this.j * 9)));
                PlayerData.c(a);
                if (a.u()) {
                    a.a();
                }
                if (a.bO()) {
                    a.a();
                }
            } catch (com.corrodinggames.rts.game.maps.f e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2, boolean z) {
        if (!this.bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        GameEngine.getGameEngine();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float b(am amVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float c(am amVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        if (cK()) {
            return 4.7f;
        }
        return 4.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.y
    public boolean I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(am amVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(am amVar, float f2, Projectile projectile) {
        return super.a(amVar, 0.0f, projectile);
    }
}
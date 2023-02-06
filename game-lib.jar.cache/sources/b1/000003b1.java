package com.corrodinggames.rts.game.units.e;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.v;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ai;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/b.class */
public class b extends j implements com.corrodinggames.rts.game.units.d {
    PointF[] i;
    PointF[] j;
    static Paint k;
    static Paint l;
    static Paint m;
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public static com.corrodinggames.rts.gameFramework.unitAction.e e = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e f = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e g = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] h = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static s n = new com.corrodinggames.rts.game.units.a.m(false);

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: f */
    public ar mo1r() {
        return ar.builder;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] b() {
        return this.i;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] e_() {
        return this.j;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return h[this.bX.R()];
    }

    public static void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.builder);
        b = gameEngine.bO.a(AssetsID.drawable.builder_dead);
        c = a(a, a.m(), a.l());
        d = PlayerData.a(a);
        e = gameEngine.bO.a(AssetsID.drawable.builder_charge);
        f = gameEngine.bO.a(AssetsID.drawable.builder_decharge);
        g = gameEngine.bO.a(AssetsID.drawable.unit_icon_builder);
        h = PlayerData.a(g);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(am amVar) {
        if (!amVar.q() && amVar.bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return b;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine();
        this.M = b;
        S(0);
        this.bT = false;
        a(ab.small);
        return true;
    }

    public b(boolean z) {
        super(z);
        this.i = new PointF[6];
        this.j = new PointF[this.i.length];
        k = new Paint();
        k.a(40, 0, 255, 0);
        k.a(true);
        k.a(2.0f);
        k.a(Paint.Cap.ROUND);
        l = new Paint();
        l.a(k);
        l.a(55, 255, 60, 60);
        m = new Paint();
        m.a(60, 255, 255, 255);
        T(20);
        U(20);
        this.cj = 10.0f;
        this.ck = this.cj + 2.0f;
        this.cv = 170.0f;
        this.cu = this.cv;
        this.M = a;
        for (int i = 0; i < this.i.length; i++) {
            this.i[i] = new PointF();
            this.j[i] = new PointF();
        }
    }

    public static void a(float f2, com.corrodinggames.rts.game.units.d dVar) {
        y yVar = (y) dVar;
        PointF[] b2 = dVar.b();
        PointF[] e_ = dVar.e_();
        am X = yVar.X();
        yVar.aN = X != null;
        if (X != null) {
            for (int i = 0; i < b2.length; i++) {
                PointF pointF = b2[i];
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
        } else if (b2[0].x != 0.0f || b2[0].y != 0.0f) {
            for (int i2 = 0; i2 < b2.length; i2++) {
                PointF pointF3 = b2[i2];
                PointF pointF4 = e_[i2];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    public static void b(float f2, com.corrodinggames.rts.game.units.d dVar) {
        y yVar = (y) dVar;
        am X = yVar.X();
        if (X != null) {
            boolean Y = yVar.Y();
            if (!Y && yVar.aO) {
                return;
            }
            GameEngine gameEngine = GameEngine.getGameEngine();
            PointF[] b2 = dVar.b();
            Paint paint = k;
            if (Y) {
                paint = l;
            }
            ai bn = yVar.bn();
            for (PointF pointF : b2) {
                float f3 = (X.eo + pointF.x) - gameEngine.cw;
                float f4 = ((X.ep - X.eq) + pointF.y) - gameEngine.cx;
                gameEngine.bO.a((bn.a + (pointF.x * 0.15f)) - gameEngine.cw, (((bn.b - bn.c) + (pointF.y * 0.15f)) - gameEngine.cx) - yVar.eq, f3, f4, paint);
                gameEngine.bO.k();
                gameEngine.bO.b(f3, f4);
                gameEngine.bO.a(0.5f, 0.5f);
                if (Y) {
                    gameEngine.bO.a(f, 0.0f, 0.0f, m);
                } else {
                    gameEngine.bO.a(e, 0.0f, 0.0f, m);
                }
                gameEngine.bO.l();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (!this.bV) {
            a(f2, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2, boolean z) {
        super.a(f2, z);
        if (!this.bV) {
            b(f2, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.bV) {
            float e2 = this.cL[0].f / e(0);
            if (e2 != 0.0f) {
                ai bn = bn();
                gameEngine.bO.i();
                gameEngine.bO.b(bn.a - gameEngine.cw, (bn.b - bn.c) - gameEngine.cx);
                gameEngine.bO.a(e2, e2);
                if (Y()) {
                    gameEngine.bO.a(f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.bO.a(e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.bO.j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
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
        if (cK()) {
            return 0.6f;
        }
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        if (cK()) {
            return 1.7f;
        }
        return 3.8f;
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

    @Override // com.corrodinggames.rts.game.units.am
    public void a(s sVar, boolean z) {
    }

    public static void a(ArrayList arrayList, int i) {
        arrayList.add(n);
        arrayList.add(new v(ar.extractor, 1, 1));
        arrayList.add(new v(ar.turret, 1, 2));
        arrayList.add(new v(ar.antiAirTurret, 1, 3));
        arrayList.add(new v(ar.landFactory, 1, 4));
        arrayList.add(new v(ar.airFactory, 1, 5));
        arrayList.add(new v(ar.seaFactory, 1, 6));
        arrayList.add(new v(ar.laserDefence, 1, 7));
        arrayList.add(new v(ar.repairbay, 1, 8));
        arrayList.add(new v(ar.fabricator, 1, 9));
        arrayList.add(new v(ar.experimentalLandFactory, 1, 10));
        arrayList.add(new v(ar.NukeLaucher, 1, 14));
        arrayList.add(new v(ar.AntiNukeLaucher, 1, 15));
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return r().a(V());
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
    public boolean g(am amVar, boolean z) {
        return true;
    }
}
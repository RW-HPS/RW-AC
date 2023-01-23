package com.corrodinggames.rts.game.units.h;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.m;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.v;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class b extends f implements com.corrodinggames.rts.game.units.d {
    PointF[] f;
    PointF[] g;
    Rect h;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f375a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    static s i = new m(false);

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.m.e v() {
        if (this.bX.k == -1) {
            return null;
        }
        return com.corrodinggames.rts.game.units.e.b.h[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: f */
    public ar r() {
        return ar.builderShip;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] b() {
        return this.f;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] e_() {
        return this.g;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 6000.0f;
    }

    public static void t_() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(R.drawable.builder_ship);
        f375a = gameEngine.bO.a(R.drawable.builder_ship_dead);
        c = gameEngine.bO.a(R.drawable.builder_ship_turret);
        e = PlayerData.a(b);
        d = a(b, b.m(), b.l());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f375a;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i2) {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
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
        this.M = f375a;
        S(0);
        this.bT = false;
        return true;
    }

    public b(boolean z) {
        super(z);
        this.f = new PointF[6];
        this.g = new PointF[this.f.length];
        this.h = new Rect();
        b(b);
        this.cj = 13.0f;
        this.ck = this.cj;
        this.cv = 500.0f;
        this.cu = this.cv;
        this.M = b;
        for (int i2 = 0; i2 < this.f.length; i2++) {
            this.f[i2] = new PointF();
            this.g[i2] = new PointF();
        }
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
    public float A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i2) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i2) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!this.bV) {
            com.corrodinggames.rts.game.units.e.b.a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
        super.a(f, z);
        if (!this.bV) {
            com.corrodinggames.rts.game.units.e.b.b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        if (!super.c(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        y.a((com.corrodinggames.rts.game.units.y) this);
        if (!this.bV) {
            float e2 = this.cL[0].f / e(0);
            if (e2 != 0.0f) {
                PointF E = E(0);
                gameEngine.bO.i();
                gameEngine.bO.b(E.x - gameEngine.cw, (E.y - gameEngine.cx) - this.eq);
                gameEngine.bO.a(e2, e2);
                if (Y()) {
                    gameEngine.bO.a(com.corrodinggames.rts.game.units.e.b.f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.bO.a(com.corrodinggames.rts.game.units.e.b.e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.bO.j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i2) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i2) {
        bh.setSite(this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * 8.0f), this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * 8.0f));
        return bh;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i2) {
        return 120 - (i2 * 28);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i2) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i2) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(am amVar) {
        if (!amVar.q() && amVar.bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(s sVar, boolean z) {
    }

    public static void a(ArrayList arrayList, int i2) {
        arrayList.add(i);
        arrayList.add(new v(ar.extractor, 1, 1));
        arrayList.add(new v(ar.turret, 1, 2));
        arrayList.add(new v(ar.antiAirTurret, 1, 3));
        arrayList.add(new v(ar.landFactory, 1, 4));
        arrayList.add(new v(ar.airFactory, 1, 5));
        arrayList.add(new v(ar.seaFactory, 1, 6));
        arrayList.add(new v(ar.fabricator, 1, 7));
        arrayList.add(new v(ar.laserDefence, 1, 8));
        arrayList.add(new v(ar.repairbay, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return r().a(V());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i2) {
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean g(am amVar, boolean z) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float f(as asVar) {
        int y = y();
        int a2 = asVar.a(this);
        if (a2 == 0 && asVar.p()) {
            a2 = 110;
        }
        return y + a2;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int u(am amVar) {
        return (int) f(amVar.r());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int v(am amVar) {
        return (int) f(amVar.r());
    }
}
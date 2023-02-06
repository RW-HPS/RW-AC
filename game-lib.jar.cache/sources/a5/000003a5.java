package com.corrodinggames.rts.game.units.d;

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
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class q extends i {
    int c;
    PointF f;
    Rect g;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] a = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] e = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.game.units.a.s h = new com.corrodinggames.rts.game.units.a.s(142) { // from class: com.corrodinggames.rts.game.units.d.q.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z) {
            return ((q) amVar).c;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: K */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return ((q) amVar).c > 0;
        }
    };
    static com.corrodinggames.rts.game.units.a.s i = new com.corrodinggames.rts.game.units.a.w(143) { // from class: com.corrodinggames.rts.game.units.d.q.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.buildNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.buildNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            q qVar = (q) amVar;
            if (qVar.c + qVar.a(N(), z) >= 4.0f) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.queueUnit;
        }
    };
    static ArrayList j = new ArrayList();

    static {
        j.add(h);
        j.add(i);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.c);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.c = gameInputStream.readInt();
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return e[this.bX.R()];
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.nuke_launcher_dead);
        com.corrodinggames.rts.gameFramework.unitAction.e a2 = gameEngine.bO.a(AssetsID.drawable.nuke_launcher);
        a = PlayerData.a(a2);
        a2.n();
        d = gameEngine.bO.a(AssetsID.drawable.unit_icon_building);
        e = PlayerData.a(d);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int bp() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.M = b;
        S(0);
        this.bT = false;
        a(ab.verylargeBuilding);
        float f = this.eo;
        float f2 = this.ep;
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, this.eq, Color.a(255, 255, 255, 255));
        if (a2 != null) {
            a2.G = 8.0f;
            a2.F = 5.0f;
            a2.E = 0.9f;
            a2.V = 20.0f;
            a2.W = a2.V;
            a2.r = true;
        }
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
        com.corrodinggames.rts.gameFramework.emitter.e c = gameEngine.bR.c(f, f2, 0.0f, -1127220);
        if (c != null) {
            c.G = 0.2f;
            c.F = 2.0f;
            c.ar = (short) 2;
            c.V = 45.0f;
            c.W = c.V;
            c.U = 0.0f;
        }
        gameEngine.bR.a(this.eo, this.ep, this.eq, 40.0f, 120.0f);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return b;
        }
        return a[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i2) {
    }

    public q(boolean z) {
        super(z);
        this.f = new PointF();
        this.g = new Rect();
        this.M = a[a.length - 1];
        b(this.M);
        this.cj = 40.0f;
        this.ck = this.cj;
        this.cv = 1500.0f;
        this.cu = this.cv;
        this.n.a(-2, -1, 2, 1);
        this.o.a(-2, -1, 2, 2);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!bT() || this.bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i2) {
        bg.setSite(this.eo, this.ep - 3.0f);
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i2) {
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float c(int i2) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(int i2, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        return ar.NukeLaucher;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i2) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public float bV() {
        return super.bV();
    }

    public void a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.c <= 0) {
            return;
        }
        if (com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f, f2) < 202500.0f) {
            if (this.bX == gameEngine.playerTeam) {
                gameEngine.bS.b("Nuke target too close");
                return;
            }
            return;
        }
        this.c--;
        PointF E = E(0);
        a(this, E.x, E.y, f, f2).i = 5.0f;
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        if (a2 != null) {
            a2.U = 5.0f;
            a2.G = 2.1f;
            a2.F = 2.1f;
            a2.ar = (short) 2;
            a2.s = true;
            a2.t = 70.0f;
            a2.V = 370.0f;
            a2.W = a2.V;
            a2.E = 1.0f;
        }
        com.corrodinggames.rts.gameFramework.emitter.e d2 = gameEngine.bR.d(E.x, E.y, 0.0f, -1);
        if (d2 != null) {
            d2.G = 1.0f;
            d2.F = 3.1f;
            d2.ar = (short) 2;
            d2.V = 170.0f;
            d2.W = d2.V;
            d2.U = 5.0f + 20.0f;
        }
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.D, 0.27f, 0.8f, E.x, E.y);
    }

    public static Projectile a(am amVar, float f, float f2, float f3, float f4) {
        Projectile a2 = Projectile.a(amVar, f, f2);
        a2.S(10);
        a2.P = (short) 0;
        a2.Q = (short) 1;
        a2.R = (short) 1;
        a2.x = 1.0f;
        a2.aC = true;
        a2.m = true;
        a2.n = f3;
        a2.o = f4;
        a2.h = 99999.0f;
        a2.t = 0.1f;
        a2.r = 2.7f;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        a2.U = 300.0f;
        a2.aH = true;
        a2.aM = true;
        a2.aQ = true;
        a2.C = true;
        a2.D = true;
        a2.aI = 80.0f;
        a2.aJ = 100.0f;
        a2.aL = 1.1f;
        a2.Y = 5400.0f;
        a2.Z = 250.0f;
        a2.ad = true;
        a2.ae = false;
        a2.ao = true;
        a2.W = 75.0f;
        a2.X = a2.W;
        a2.aY = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
        com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(a2, -1118720);
        if (a3 != null) {
            a3.V = 1300.0f;
            a3.W = a3.V;
            a3.E = 0.2f;
            a3.G = 1.0f;
        }
        return a2;
    }

    public void M() {
        this.c++;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(i.N())) {
            M();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z, PointF pointF, am amVar) {
        if (z) {
            return;
        }
        if (sVar == h) {
            if (pointF == null) {
                GameNetEngine.g("action:" + h.N() + " needs point but it is missing");
                return;
            } else {
                a(pointF.x, pointF.y);
                return;
            }
        }
        super.a(sVar, z, pointF, amVar);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return j;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.b((am) this, 450.0f, false);
    }
}
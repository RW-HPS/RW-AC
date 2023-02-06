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
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public class c extends i {
    boolean c;
    int d;
    float e;
    PointF h;
    Rect i;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] a = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e f = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] g = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.game.units.a.s j = new com.corrodinggames.rts.game.units.a.s(145) { // from class: com.corrodinggames.rts.game.units.d.c.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return VariableScope.nullOrMissingString;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.antiNukeCount", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            if (b(amVar, false) == 0) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: K */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.none;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.none;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z) {
            return ((c) amVar).d;
        }
    };
    static com.corrodinggames.rts.game.units.a.s k = new com.corrodinggames.rts.game.units.a.w(144) { // from class: com.corrodinggames.rts.game.units.d.c.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.buildAntiNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 4000;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            c cVar = (c) amVar;
            if (cVar.d + cVar.a(N(), z) >= 12.0f) {
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
    static ArrayList l = new ArrayList();

    static {
        l.add(j);
        l.add(k);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.c);
        gameOutputStream.writeInt(this.d);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.c = gameInputStream.readBoolean();
        if (gameInputStream.b() >= 30) {
            this.d = gameInputStream.readInt();
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return g[this.bX.R()];
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.antinuke_launcher_dead);
        com.corrodinggames.rts.gameFramework.unitAction.e a2 = gameEngine.bO.a(AssetsID.drawable.antinuke_launcher);
        a = PlayerData.a(a2);
        a2.n();
        f = gameEngine.bO.a(AssetsID.drawable.unit_icon_building_turrent);
        g = PlayerData.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine.getGameEngine();
        this.M = b;
        S(0);
        this.bT = false;
        a(ab.verylargeBuilding);
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
    public void a(int i) {
    }

    public c(boolean z) {
        super(z);
        this.h = new PointF();
        this.i = new Rect();
        this.M = a[a.length - 1];
        b(this.M);
        this.cj = 24.0f;
        this.ck = this.cj;
        this.cv = 2800.0f;
        this.cu = this.cv;
        this.n.a(-1, -1, 1, 1);
        this.o.a(-1, -1, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (bT() && !this.bV && this.d > 0) {
            Projectile projectile = null;
            this.e = com.corrodinggames.rts.gameFramework.f.a(this.e, f2);
            if (this.e == 0.0f) {
                this.e = 15.0f;
                Iterator it = Projectile.a.iterator();
                while (it.hasNext()) {
                    Projectile projectile2 = (Projectile) it.next();
                    if (projectile2.D && projectile2.eq > 50.0f && com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, projectile2.eo, projectile2.ep) < 2200.0f * 2200.0f && com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, projectile2.n, projectile2.o) < 1000000.0f && (projectile2.j == null || (!projectile2.j.bX.d(this.bX) && projectile2.j.bX != this.bX))) {
                        if (!a(projectile2)) {
                            projectile = projectile2;
                        }
                    }
                }
            }
            if (projectile != null) {
                b(projectile);
            }
        }
    }

    public boolean a(Projectile projectile) {
        Object[] a2 = Projectile.a.a();
        int i = Projectile.a.a;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile2 = (Projectile) a2[i2];
            if (projectile2 != projectile && projectile2.q == projectile) {
                return true;
            }
        }
        return false;
    }

    public void b(Projectile projectile) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.d <= 0) {
            return;
        }
        this.d--;
        PointF E = E(0);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        a2.S(10);
        a2.P = (short) 10;
        a2.R = (short) 0;
        a2.x = 1.0f;
        a2.aC = true;
        a2.q = projectile;
        a2.h = 99999.0f;
        a2.t = 0.2f;
        a2.r = 6.5f;
        a2.ar = Color.a(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        a2.U = 600.0f;
        a2.aH = true;
        a2.aM = true;
        a2.aQ = true;
        a2.C = true;
        a2.aI = 80.0f;
        a2.aJ = 100.0f;
        a2.aL = 2.0f;
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        com.corrodinggames.rts.gameFramework.emitter.e d = gameEngine.bR.d(E.x, E.y, 0.0f, -1);
        if (d != null) {
            d.G = 0.5f;
            d.F = 2.1f;
            d.ar = (short) 2;
            d.V = 90.0f;
            d.W = d.V;
            d.U = 0.0f;
        }
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.D, 0.15f, 1.5f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        bg.setSite(this.eo, this.ep - 9.0f);
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float m() {
        return 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(int i, float f2) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        return super.c(f2);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        return ar.AntiNukeLaucher;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public float bV() {
        return super.bV();
    }

    public void M() {
        this.d++;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(k.N())) {
            M();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (this.d < 4) {
            return k.N();
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ck() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return l;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f2) {
        super.e(f2);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void O() {
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void cb() {
        y.a((am) this, 990.0f, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        if (this.cG) {
            return true;
        }
        return super.a(gameEngine);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(am amVar, float f2, Projectile projectile) {
        if (f2 > 2600.0f) {
            f2 = 2600.0f;
        }
        return super.a(amVar, f2, projectile);
    }
}
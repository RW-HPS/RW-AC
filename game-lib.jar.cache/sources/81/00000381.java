package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.t;
import com.corrodinggames.rts.game.units.a.w;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.d.j;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class a extends b {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public static s e = new w(102) { // from class: com.corrodinggames.rts.game.units.d.a.a.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            b bVar = (b) amVar;
            if (bVar.j || bVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((b) amVar).j) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public t f() {
            return t.upgrade;
        }
    };
    static ArrayList f = new ArrayList();

    static {
        f.add(e);
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return d[this.bX.R()];
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.anti_air_top);
        b = gameEngine.bO.a(AssetsID.drawable.anti_air_top_l2);
        c = gameEngine.bO.a(AssetsID.drawable.unit_icon_building_air_turrent);
        d = PlayerData.a(c);
    }

    public a(boolean z) {
        super(z);
        this.cv = 800.0f;
        this.cu = this.cv;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float m() {
        if (!this.j) {
            return 250.0f;
        }
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float b(int i) {
        if (!this.j) {
            return 80.0f;
        }
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        if (!this.j) {
            return super.e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.e(i);
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        if (!this.j || i == 0) {
            return super.E(i);
        }
        float f2 = E() ? this.cg : this.cL[i].a;
        PointF G = G(i);
        float f3 = f2 + (i == 1 ? -30.0f : 30.0f);
        bg.setSite(G.x + (com.corrodinggames.rts.gameFramework.f.k(f3) * 10.0f), G.y + (com.corrodinggames.rts.gameFramework.f.j(f3) * 10.0f));
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.t = 0.3f;
        a2.r = 6.0f;
        if (!this.j) {
            a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            a2.U = 60.0f;
            a2.h = 220.0f;
        } else {
            a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            a2.U = 60.0f;
            a2.h = 250.0f;
            a2.t = 0.5f;
            a2.r = 7.0f;
        }
        a2.P = (short) 4;
        a2.x = 1.0f;
        a2.l = amVar;
        a2.aH = false;
        a2.aI = 0.0f;
        a2.aJ = 0.0f;
        a2.aM = true;
        a2.aQ = true;
        a2.aG = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.3f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), E.x, E.y);
        gameEngine.bR.a(a2, -1118720);
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        if (this.j) {
            return ar.antiAirTurretT2;
        }
        return ar.antiAirTurret;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        if (!this.j) {
            return a;
        }
        return b;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.y
    public boolean af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ag() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b
    public void s(float f2) {
        if (this.cL[0].a()) {
            this.cL[0].a += c(0) * f2 * 0.1f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 9.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean u(int i) {
        if (!this.j) {
            return super.u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.u(i);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int v(int i) {
        if (!this.j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean r(int i) {
        if (!this.j && i > 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(e.N())) {
            a(2);
            W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (!this.j) {
            return e.N();
        }
        return s.i;
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.am
    public void a(ArrayList arrayList) {
        arrayList.clear();
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
        if (i == 1) {
            this.j = false;
        } else if (i == 2 && !this.j) {
            this.j = true;
            this.cv += 600.0f;
            this.cu += 600.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.a.b, com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return f;
    }
}
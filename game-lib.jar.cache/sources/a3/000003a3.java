package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class p extends i {
    boolean d;
    boolean e;
    float f;
    PointF i;
    Rect j;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e[] f336a = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e[] b = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e g = null;
    static com.corrodinggames.rts.gameFramework.m.e[] h = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.game.units.a.s k = new com.corrodinggames.rts.game.units.a.w(102) { // from class: com.corrodinggames.rts.game.units.d.p.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.h.a.a("units.laserDefence.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.h.a.a("units.laserDefence.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return ar.laserDefence.c(2);
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            p pVar = (p) amVar;
            if (pVar.d || pVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((p) amVar).d) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.upgrade;
        }
    };
    static ArrayList l = new ArrayList();

    static {
        l.add(k);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.d);
        gameOutputStream.writeFloat(this.cB);
        gameOutputStream.writeBoolean(this.e);
        gameOutputStream.writeFloat(this.f);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.d = gameInputStream.readBoolean();
        this.cB = gameInputStream.readFloat();
        this.e = gameInputStream.readBoolean();
        if (gameInputStream.b() >= 38) {
            this.f = gameInputStream.readFloat();
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.m.e v() {
        if (this.bX.k == -1) {
            return null;
        }
        return h[this.bX.R()];
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        c = gameEngine.bO.a(R.drawable.laser_defence_dead);
        com.corrodinggames.rts.gameFramework.m.e a2 = gameEngine.bO.a(R.drawable.laser_defence);
        com.corrodinggames.rts.gameFramework.m.e a3 = gameEngine.bO.a(R.drawable.laser_defence_t2);
        f336a = PlayerData.a(a2);
        b = PlayerData.a(a3);
        a2.n();
        a3.n();
        g = gameEngine.bO.a(R.drawable.unit_icon_building_turrent);
        h = PlayerData.a(g);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(this.eo, this.ep, this.eq);
        this.M = c;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return c;
        }
        if (this.bX == null) {
            return f336a[f336a.length - 1];
        }
        if (!this.d) {
            return f336a[this.bX.R()];
        }
        return b[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    public p(boolean z) {
        super(z);
        this.i = new PointF();
        this.j = new Rect();
        a(f336a[0], 2);
        this.cB = 1.0f;
        this.cj = 19.0f;
        this.ck = this.cj;
        this.cv = 500.0f;
        this.cu = this.cv;
        this.M = f336a[f336a.length - 1];
        this.n.a(0, 0, 1, 1);
        this.o.a(0, 0, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        float f2;
        super.a(f);
        if (!bT() || this.bV) {
            return;
        }
        GameEngine.getGameEngine();
        float f3 = 4.0E-4f * f;
        if (this.d) {
            f3 += 2.0E-4f * f;
        }
        this.cB = com.corrodinggames.rts.gameFramework.f.a(this.cB, 1.0f, f3);
        if (this.cB >= 1.0f) {
            this.e = false;
        }
        this.f -= f;
        this.i.setSite(E(0));
        if (this.cB > 0.0f && !this.e) {
            if (!this.d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (a(this, this.i.x, this.i.y, this.eq, m(), f2)) {
                this.f = 3.0f;
            }
            if (this.cB < 0.0f) {
                this.cB = 0.0f;
                this.e = true;
            }
        }
        if (this.e) {
            this.s = 1;
        } else {
            this.s = 0;
        }
    }

    public static boolean a(y yVar, float f, float f2, float f3, float f4, float f5) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f6 = f4 * f4;
        Object[] a2 = com.corrodinggames.rts.game.f.f157a.a();
        int i = com.corrodinggames.rts.game.f.f157a.f689a;
        for (int i2 = 0; i2 < i; i2++) {
            com.corrodinggames.rts.game.f fVar = (com.corrodinggames.rts.game.f) a2[i2];
            if (!fVar.A && !fVar.C && ((fVar.J > 7.0f || (fVar.J > 2.0f && fVar.t > 8.0f)) && !fVar.aS && ((fVar.eo - f) * (fVar.eo - f)) + ((fVar.ep - f2) * (fVar.ep - f2)) < f6 && fVar.eq >= -1.0f)) {
                boolean z = false;
                if (fVar.l != null && yVar.bX.d(fVar.l.bX)) {
                    z = true;
                }
                if (!z && fVar.j != null && yVar.bX.c(fVar.j.bX)) {
                    z = true;
                }
                if (z) {
                    com.corrodinggames.rts.gameFramework.d.e a3 = gameEngine.bR.a(f, f2, f3, fVar.eo, fVar.ep, fVar.eq);
                    if (a3 != null) {
                        a3.V = 10.0f;
                        a3.W = a3.V;
                    }
                    com.corrodinggames.rts.gameFramework.d.e b2 = gameEngine.bR.b(f, f2, f3, com.corrodinggames.rts.gameFramework.d.d.custom, false, com.corrodinggames.rts.gameFramework.d.h.high);
                    if (b2 != null) {
                        b2.P = 0.0f;
                        b2.Q = 0.0f;
                        b2.ap = 4;
                        b2.V = 39.0f;
                        b2.W = b2.V;
                        b2.r = true;
                        b2.E = 1.3f;
                        b2.G = 1.1f;
                        b2.F = 0.7f;
                    }
                    fVar.H -= 1.01f;
                    if (fVar.H <= 0.0f) {
                        fVar.d();
                        com.corrodinggames.rts.gameFramework.d.e b3 = gameEngine.bR.b(fVar.eo, fVar.ep, fVar.eq, com.corrodinggames.rts.gameFramework.d.d.custom, false, com.corrodinggames.rts.gameFramework.d.h.high);
                        if (b3 != null) {
                            b3.P = 0.0f;
                            b3.Q = 0.0f;
                            b3.ap = 4;
                            b3.V = 23.0f;
                            b3.W = b3.V;
                            b3.r = true;
                            b3.E = 0.9f;
                            b3.G = 0.5f;
                            b3.F = 0.2f;
                        }
                        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.F, 0.2f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), fVar.eo, fVar.ep);
                    }
                    yVar.cB -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        bg.setSite(this.eo, this.ep - 13.0f);
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float m() {
        if (!this.d) {
            return 160.0f;
        }
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar r() {
        return ar.laserDefence;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bW() {
        if (this.cB != 1.0f) {
            return this.cB;
        }
        return super.bW();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bX() {
        return this.e;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public float bd() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(k.N())) {
            PlayerData.b((am) this);
            a(2);
            PlayerData.c(this);
            W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (!this.d) {
            return k.N();
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        if (this.d) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
        if (i == 1) {
            this.d = false;
        } else if (i == 2 && !this.d) {
            this.d = true;
            this.cv += 900.0f;
            this.cu += 900.0f;
        }
        S();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return l;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        com.corrodinggames.rts.gameFramework.utility.y.a(this, m());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cZ() {
        return GameEngine.getGameEngine().bL.n;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float da() {
        return GameEngine.getGameEngine().bL.o;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float db() {
        return super.db() - 8.0f;
    }
}
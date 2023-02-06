package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public class h extends i {
    float h;
    float i;
    int j;
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] e = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] f = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e g = null;
    static com.corrodinggames.rts.game.units.a.s k = new com.corrodinggames.rts.game.units.a.w(102) { // from class: com.corrodinggames.rts.game.units.d.h.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("units.fabricator.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("units.fabricator.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return ar.fabricator.c(2);
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            h hVar = (h) amVar;
            if (hVar.r != 1 || hVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((h) amVar).r != 1) {
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
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.upgrade;
        }
    };
    static com.corrodinggames.rts.game.units.a.s l = new com.corrodinggames.rts.game.units.a.w(103) { // from class: com.corrodinggames.rts.game.units.d.h.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return ar.fabricator.c(3);
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            h hVar = (h) amVar;
            if (hVar.r != 2 || hVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((h) amVar).r != 2) {
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
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.upgrade;
        }
    };
    static ArrayList t = new ArrayList();

    static {
        t.add(k);
        t.add(l);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.h);
        gameOutputStream.writeBoolean(this.r == 2);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.h = gameInputStream.readFloat();
        boolean readBoolean = gameInputStream.readBoolean();
        if (gameInputStream.b() < 51 && readBoolean) {
            a(2);
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public void R(int i) {
        a(i);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.fabricator;
    }

    public static void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.power);
        b = gameEngine.bO.a(AssetsID.drawable.power_t2);
        c = gameEngine.bO.a(AssetsID.drawable.power_t3);
        d = PlayerData.a(a);
        e = PlayerData.a(b);
        f = PlayerData.a(c);
        g = gameEngine.bO.a(AssetsID.drawable.power_dead);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(this.eo, this.ep, this.eq);
        this.M = g;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
        com.corrodinggames.rts.gameFramework.emitter.e c2 = gameEngine.bR.c(this.eo, this.ep, this.eq, -1127220);
        if (c2 != null) {
            c2.G = 0.15f;
            c2.F = 1.0f;
            c2.ar = (short) 2;
            c2.V = 35.0f;
            c2.W = c2.V;
            c2.U = 0.0f;
            c2.x = -14492382;
        }
        bo();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return g;
        }
        if (this.bX == null) {
            return d[d.length - 1];
        }
        if (this.r == 1) {
            return d[this.bX.R()];
        }
        if (this.r == 2) {
            return e[this.bX.R()];
        }
        if (this.r == 3) {
            return f[this.bX.R()];
        }
        GameEngine.m5e("Unknown tech level:" + this.r);
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    public h(boolean z) {
        super(z);
        this.i = 0.0f;
        this.j = 0;
        this.M = a;
        a(this.M, 3);
        this.cj = 25.0f;
        this.ck = this.cj;
        this.cv = 800.0f;
        this.cu = this.cv;
        this.n.a(-1, -1, 1, 1);
        this.o.a(this.n);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (!bT() || this.bV) {
            return;
        }
        this.i = com.corrodinggames.rts.gameFramework.f.a(this.i, f2);
        if (this.i == 0.0f) {
            this.i = 17.0f;
            this.j++;
            if (this.j > 5) {
                this.j = 0;
            }
            if (this.j <= 2) {
                this.s = this.j;
            } else {
                this.s = 5 - this.j;
            }
        }
        this.h += f2;
        if (this.h > PlayerData.ap - 0.1f) {
            this.h -= PlayerData.ap;
            this.bX.b(cy() * (PlayerData.ap / PlayerData.ao));
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cy() {
        if (this.r == 1) {
            return 2.0f;
        }
        if (this.r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(k.N())) {
            a(2);
            W();
        }
        if (jVar.j.equals(l.N())) {
            a(3);
            W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (this.r == 1) {
            return k.N();
        }
        if (this.r == 2) {
            return l.N();
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        return this.r;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
        PlayerData.b((am) this);
        if (this.r > i) {
            this.r = 1;
            this.cv = 800.0f;
            if (this.cu > this.cv) {
                this.cu = this.cv;
            }
        }
        if (this.r < 2 && i >= 2) {
            this.cv += 500.0f;
            this.cu += 500.0f;
        }
        if (this.r < 3 && i >= 3) {
            this.cv += 1300.0f;
            this.cu += 1300.0f;
        }
        this.r = i;
        PlayerData.c(this);
        S();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return t;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float db() {
        return super.db() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int bp() {
        return 12;
    }
}
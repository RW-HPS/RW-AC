package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v.class */
public class v extends i {
    int f;
    float g;
    int h;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f341a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e[] c = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e[] d = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e e = null;
    public static int i = 0;
    static com.corrodinggames.rts.game.units.a.s j = new com.corrodinggames.rts.game.units.a.w(102) { // from class: com.corrodinggames.rts.game.units.d.v.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return com.corrodinggames.rts.gameFramework.h.a.a("units.supplyDepot.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.h.a.a("units.supplyDepot.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            v vVar = (v) amVar;
            if (vVar.f != 1 || vVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
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
    static ArrayList k = new ArrayList();

    static {
        k.add(j);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        a(gameInputStream.readInt());
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.supplyDepot;
    }

    public static void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f341a = gameEngine.bO.a(R.drawable.supply_depot);
        b = gameEngine.bO.a(R.drawable.supply_depot_t2);
        c = PlayerData.a(f341a);
        d = PlayerData.a(b);
        e = gameEngine.bO.a(R.drawable.supply_depot_dead);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(this.eo, this.ep, this.eq);
        this.M = e;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return e;
        }
        if (this.bX == null) {
            return c[c.length - 1];
        }
        if (this.f == 1) {
            return c[this.bX.R()];
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    public v(boolean z) {
        super(z);
        this.f = 1;
        this.g = 0.0f;
        this.h = 0;
        this.M = f341a;
        a(this.M, 1);
        this.cj = 20.0f;
        this.ck = this.cj;
        this.cv = 800.0f;
        this.cu = this.cv;
        this.n.a(-1, -1, 0, 0);
        this.o.a(this.n);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!bT() || this.bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(j.N())) {
            M();
            W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i2) {
        this.f = i2;
    }

    public void M() {
        if (this.f == 1) {
            this.f = 2;
            S();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (this.f == 1) {
            return j.N();
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return k;
    }
}
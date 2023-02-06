package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class f extends i {
    boolean f;
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] c = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e e = null;
    static com.corrodinggames.rts.game.units.a.s g = new com.corrodinggames.rts.game.units.a.w(110) { // from class: com.corrodinggames.rts.game.units.d.f.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Allows factory to build Tech 2 units";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            f fVar = (f) amVar;
            if (fVar.f || fVar.a(N(), z) > 0) {
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
            return com.corrodinggames.rts.game.units.a.t.upgrade;
        }
    };

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f);
        gameOutputStream.writeByte(0);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            M();
        }
        gameInputStream.readByte();
        super.a(gameInputStream);
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.experimental_unit_factory_front);
        b = gameEngine.bO.a(AssetsID.drawable.experimental_unit_factory_base);
        e = gameEngine.bO.a(AssetsID.drawable.experimental_unit_factory_dead);
        c = PlayerData.a(a);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        return ar.experimentalLandFactory;
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine.getGameEngine();
        this.m = null;
        this.M = e;
        S(0);
        this.bT = false;
        a(ab.verylargeBuilding);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return e;
        }
        if (this.bX == null) {
            return c[c.length - 1];
        }
        if (!this.f) {
            return c[this.bX.R()];
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void S() {
        super.S();
        if (this.bV) {
            this.m = null;
        } else {
            this.m = b;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    public f(boolean z) {
        super(z);
        this.M = a;
        this.m = b;
        b(this.M);
        this.cj = 55.0f;
        this.ck = this.cj;
        this.cv = 3200.0f;
        this.cu = this.cv;
        S(4);
        this.n.a(-2, -2, 2, 2);
        this.o.a(-2, -2, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(g.N())) {
            M();
        } else {
            super.a(jVar);
        }
    }

    public void M() {
        if (!this.f) {
            this.f = true;
            S();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public static void a(ArrayList arrayList, int i) {
        arrayList.add(new com.corrodinggames.rts.game.units.a.o());
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.experimentalTank, 2.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.experimentalHoverTank, 3.0f));
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return mo1r().a(V());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        return 2;
    }
}
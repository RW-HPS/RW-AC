package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class t extends i {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f340a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e[] d = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e f = null;
    static final com.corrodinggames.rts.game.units.a.c g = com.corrodinggames.rts.game.units.a.c.a(String.valueOf(110));

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f340a = gameEngine.bO.a(R.drawable.sea_factory);
        b = gameEngine.bO.a(R.drawable.sea_factory_t2);
        f = gameEngine.bO.a(R.drawable.sea_factory_dead);
        d = PlayerData.a(f340a);
        e = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar r() {
        return ar.seaFactory;
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        this.m = null;
        this.M = f;
        S(0);
        this.bT = false;
        a(ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f;
        }
        if (this.bX == null) {
            return d[d.length - 1];
        }
        if (this.r == 1) {
            return d[this.bX.R()];
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    public t(boolean z) {
        super(z);
        this.M = f340a;
        b(f340a);
        this.cj = 45.0f;
        this.ck = this.cj;
        this.cv = 1000.0f;
        this.cu = this.cv;
        S(2);
        this.n.a(-1, -1, 1, 2);
        this.o.a(-2, -1, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(g)) {
            PlayerData.b((am) this);
            a(2);
            PlayerData.c(this);
            W();
            return;
        }
        super.a(jVar);
    }

    @Override // com.corrodinggames.rts.game.units.d.i
    public int dv() {
        return -20;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        return this.r;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
        if (i == 1) {
            this.r = 1;
        } else if (i == 2 && this.r == 1) {
            this.r = 2;
        }
        S();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (this.r == 1) {
            return g;
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public static void a(ArrayList arrayList, int i) {
        arrayList.add(new com.corrodinggames.rts.game.units.a.o());
        arrayList.add(new u());
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.builderShip, 1.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.gunBoat, 2.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.missileShip, 3.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.hovercraft, 4.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.battleShip, 5.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.attackSubmarine, 6.0f));
        if (i > 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return r().a(V());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bJ() {
        return true;
    }
}
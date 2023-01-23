package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class m extends i {
    boolean g;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f335a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e[] d = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e f = null;
    static final com.corrodinggames.rts.game.units.a.c h = com.corrodinggames.rts.game.units.a.c.a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.g);
        gameOutputStream.writeByte(0);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            a(2);
        }
        gameInputStream.readByte();
        super.a(gameInputStream);
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f335a = gameEngine.bO.a(R.drawable.land_factory_front);
        b = gameEngine.bO.a(R.drawable.land_factory_front_t2);
        c = gameEngine.bO.a(R.drawable.land_factory_back);
        f = gameEngine.bO.a(R.drawable.land_factory_dead);
        d = PlayerData.a(f335a);
        e = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar r() {
        return ar.landFactory;
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(this.eo, this.ep, this.eq);
        this.m = null;
        this.M = f;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void S() {
        super.S();
        if (this.bV) {
            this.m = null;
        } else {
            this.m = c;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f;
        }
        if (this.bX == null) {
            return d[d.length - 1];
        }
        if (!this.g) {
            return d[this.bX.R()];
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    public m(boolean z) {
        super(z);
        this.M = f335a;
        this.m = c;
        b(this.M);
        this.cj = 30.0f;
        this.ck = this.cj;
        this.cv = 1200.0f;
        this.cu = this.cv;
        S(3);
        this.n.a(-1, -1, 1, 1);
        this.o.a(-1, -1, 1, 3);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (h.a(jVar.j)) {
            PlayerData.b((am) this);
            a(2);
            PlayerData.c(this);
            W();
            return;
        }
        super.a(jVar);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
        if (i == 1) {
            this.g = false;
        } else if (i == 2 && !this.g) {
            this.g = true;
        }
        S();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (!this.g) {
            return h;
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public static void a(ArrayList arrayList, int i) {
        arrayList.add(new com.corrodinggames.rts.game.units.a.o());
        if (i == 1) {
            arrayList.add(new n());
        }
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.builder, 1.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.tank, 2.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.hoverTank, 3.0f));
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.artillery, 4.0f));
        if (i >= 2) {
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.hovercraft, 5.0f));
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.heavyTank, 6.0f));
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.heavyHoverTank, 7.0f));
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.laserTank, 8.0f));
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return r().a(V());
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        if (this.g) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.d.i
    public k du() {
        return new o(this);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float db() {
        return super.db() - 8.0f;
    }
}
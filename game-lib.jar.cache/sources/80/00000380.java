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

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class a extends i {
    int f;
    float g;
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] c = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e e = null;
    static final com.corrodinggames.rts.game.units.a.c h = com.corrodinggames.rts.game.units.a.c.a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.b() >= 17) {
            a(gameInputStream.readInt());
        }
        super.a(gameInputStream);
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.air_factory);
        b = gameEngine.bO.a(AssetsID.drawable.air_factory_t2);
        e = gameEngine.bO.a(AssetsID.drawable.air_factory_dead);
        c = PlayerData.a(a);
        d = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        return ar.airFactory;
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        this.M = e;
        S(0);
        this.bT = false;
        a(ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
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
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    public a(boolean z) {
        super(z);
        this.f = 1;
        this.g = 0.0f;
        this.M = a;
        T(40);
        U(61);
        this.cj = 30.0f;
        this.ck = this.cj;
        this.cv = 1000.0f;
        this.cu = this.cv;
        this.n.a(-1, -1, 1, 1);
        this.o.a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!bT() || this.bV) {
            return;
        }
        this.g = com.corrodinggames.rts.gameFramework.f.a(this.g, f);
        if (this.g == 0.0f) {
            this.g = 27.0f;
            this.s++;
            if (this.s > 4) {
                this.s = 0;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        if (jVar.j.equals(h)) {
            PlayerData.b((am) this);
            a(2);
            PlayerData.c(this);
            W();
            return;
        }
        super.a(jVar);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        return this.f;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
        if (i == 1) {
            this.f = 1;
        } else if (i == 2 && this.f == 1) {
            this.f = 2;
        }
        S();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (this.f == 1) {
            return h;
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public static void a(ArrayList arrayList, int i) {
        arrayList.add(new com.corrodinggames.rts.game.units.a.o());
        if (i == 1) {
            arrayList.add(new b());
        }
        if (i > 1) {
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.dropship, 3.2f));
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.gunShip, 4.0f));
            arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.amphibiousJet, 5.0f));
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return mo1r().a(V());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bJ() {
        return true;
    }
}
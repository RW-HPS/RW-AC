package com.corrodinggames.rts.game.units.d;

import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class g extends i {

    /* renamed from: a */
    float f331a;
    int b;
    float c;
    int d;
    Rect j;
    Rect k;
    static ArrayList w;
    static ArrayList x;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] e = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] f = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] g = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e h = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e i = null;
    public static int l = 0;
    static com.corrodinggames.rts.game.units.a.s t = new AnonymousClass1(102);
    static com.corrodinggames.rts.game.units.a.s u = new AnonymousClass2(103);
    static ArrayList v = new ArrayList();

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f331a);
        gameOutputStream.writeBoolean(this.b > 1);
        gameOutputStream.writeInt(this.b);
        super.a(gameOutputStream);
    }

    public void a(GameInputStream gameInputStream) {
        this.f331a = gameInputStream.readFloat();
        int i2 = 1;
        if (gameInputStream.readBoolean()) {
            i2 = 2;
        }
        if (gameInputStream.b() >= 31) {
            i2 = gameInputStream.readInt();
        }
        if (i2 != 1) {
            a(i2);
        }
        super.a(gameInputStream);
    }

    /* renamed from: b */
    public ar mo5r() {
        return ar.extractor;
    }

    static {
        v.add(t);
        w = new ArrayList();
        w.add(u);
        x = new ArrayList();
    }

    public boolean c(PlayerData playerData) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bL.a(this.eo, this.ep);
        com.corrodinggames.rts.game.b.g e2 = gameEngine.bL.e(gameEngine.bL.T, gameEngine.bL.U);
        if (e2 == null || !e2.i) {
            return false;
        }
        return super.c(playerData);
    }

    public static void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.unitAction.e a2 = gameEngine.bO.a(R.drawable.extractor);
        com.corrodinggames.rts.gameFramework.unitAction.e a3 = gameEngine.bO.a(R.drawable.extractor_t2);
        com.corrodinggames.rts.gameFramework.unitAction.e a4 = gameEngine.bO.a(R.drawable.extractor_t3);
        i = gameEngine.bO.a(R.drawable.extractor_dead);
        e = PlayerData.a(a2);
        f = PlayerData.a(a3);
        g = PlayerData.a(a4);
        a2.n();
        a3.n();
        a4.n();
        h = gameEngine.bO.a(R.drawable.extractor_back);
    }

    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(this.eo, this.ep, this.eq);
        this.M = i;
        this.m = null;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
        com.corrodinggames.rts.gameFramework.d.f.a(this.eo, this.ep).j = -6684775;
        com.corrodinggames.rts.gameFramework.d.f b = com.corrodinggames.rts.gameFramework.d.f.b(this.eo, this.ep);
        b.f472a = 500.0f;
        b.j = -6684775;
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.d.h.critical);
        com.corrodinggames.rts.gameFramework.d.e c = gameEngine.bR.c(this.eo, this.ep, this.eq, -1127220);
        if (c != null) {
            c.G = 0.15f;
            c.F = 1.0f;
            c.ar = (short) 2;
            c.V = 35.0f;
            c.W = c.V;
            c.U = 0.0f;
            c.x = -13378253;
        }
        bo();
        return false;
    }

    public int bp() {
        return 16;
    }

    public void S() {
        super.S();
        if (this.bV) {
            this.m = null;
        } else {
            this.m = h;
        }
    }

    public boolean ds() {
        return true;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return i;
        }
        if (this.bX == null) {
            return e[e.length - 1];
        }
        if (this.b == 3) {
            return g[this.bX.R()];
        }
        if (this.b == 2) {
            return f[this.bX.R()];
        }
        return e[this.bX.R()];
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    public g(boolean z) {
        super(z);
        this.b = 1;
        this.c = 0.0f;
        this.d = 0;
        this.j = new Rect();
        this.k = new Rect();
        this.M = e[9];
        T(37);
        U(56);
        this.cj = 18.0f;
        this.ck = this.cj;
        this.cv = 800.0f;
        this.cu = this.cv;
        this.n.a(0, -1, 0, 0);
        this.o.a(this.n);
        S();
    }

    public void a(float f2) {
        super.a(f2);
        if (!bT() || this.bV) {
            return;
        }
        this.c = com.corrodinggames.rts.gameFramework.f.a(this.c, f2 * this.b);
        if (this.c == 0.0f) {
            this.c = 17.0f;
            this.d++;
            if (this.d > 7) {
                this.d = 0;
            }
            if (this.d <= 3) {
                this.s = this.d;
            } else {
                this.s = 7 - this.d;
            }
        }
        this.f331a += f2;
        if (this.f331a > PlayerData.ap - 0.1f) {
            this.f331a -= PlayerData.ap;
            this.bX.b(cy() * (PlayerData.ap / PlayerData.ao));
        }
    }

    public float cy() {
        if (this.b == 3) {
            return 18.0f;
        }
        if (this.b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    public boolean c(float f2) {
        return super.c(f2);
    }

    public boolean l() {
        return false;
    }

    public void a(am amVar, int i2) {
        throw new RuntimeException("Unit cannot shoot");
    }

    public float m() {
        return 0.0f;
    }

    public float b(int i2) {
        return 0.0f;
    }

    public float c(int i2) {
        return 0.0f;
    }

    public void a(j jVar) {
        if (jVar.j.equals(t.N())) {
            a(2);
            W();
        }
        if (jVar.j.equals(u.N())) {
            a(3);
            W();
        }
    }

    public com.corrodinggames.rts.game.units.a.c cm() {
        if (this.b == 1) {
            return t.N();
        }
        if (this.b == 2) {
            return u.N();
        }
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public int V() {
        return this.b;
    }

    public void a(int i2) {
        PlayerData.b((am) this);
        if (this.b > i2) {
            this.b = 1;
            this.cv = 800.0f;
            if (this.cu > this.cv) {
                this.cu = this.cv;
            }
        }
        if (this.b < 2 && i2 >= 2) {
            this.cv += 200.0f;
            this.cu += 200.0f;
        }
        if (this.b < 3 && i2 >= 3) {
            this.cv += 1000.0f;
            this.cu += 1000.0f;
        }
        this.b = i2;
        PlayerData.c(this);
        S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$1.class */
    final class AnonymousClass1 extends com.corrodinggames.rts.game.units.a.w {
        AnonymousClass1(int i) {
            super(i);
        }

        public boolean g() {
            return false;
        }

        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("units.extractor.upgrade.description", new Object[0]);
        }

        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeT2", new Object[0]);
        }

        public int c() {
            return ar.extractor.c(2);
        }

        public float K() {
            return 6.0E-4f;
        }

        public boolean a(am amVar, boolean z) {
            g gVar = (g) amVar;
            if (gVar.b != 1 || gVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        /* renamed from: L */
        public ar mo4i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.upgrade;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$2.class */
    final class AnonymousClass2 extends com.corrodinggames.rts.game.units.a.w {
        AnonymousClass2(int i) {
            super(i);
        }

        public boolean g() {
            return false;
        }

        public String a() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeT3", new Object[0]);
        }

        public int c() {
            return ar.extractor.c(3);
        }

        public float K() {
            return 3.0E-4f;
        }

        public boolean a(am amVar, boolean z) {
            g gVar = (g) amVar;
            if (gVar.b != 2 || gVar.a(N(), z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        /* renamed from: L */
        public ar mo4i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.upgrade;
        }
    }

    public ArrayList N() {
        if (this.b == 1) {
            return v;
        }
        if (this.b == 2) {
            return w;
        }
        return x;
    }
}
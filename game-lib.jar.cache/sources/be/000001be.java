package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ai.class */
public class ai extends v {
    com.corrodinggames.rts.gameFramework.m.e b;
    int c;
    int d;
    float e;
    float f;
    int g;
    int h;
    float i;
    float j;
    boolean k;
    float l;
    float m;
    float n;
    float o;
    float p;
    float q;
    boolean r;
    Rect u;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e[] f197a = new com.corrodinggames.rts.gameFramework.m.e[2];
    static Point s = new Point();
    public static aj t = new aj();

    public static void b() {
        f197a[0] = GameEngine.getGameEngine().bO.a(R.drawable.fire);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.c);
        gameOutputStream.writeInt(this.d);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeByte(0);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.c = gameInputStream.readInt();
        this.d = gameInputStream.readInt();
        this.e = gameInputStream.readFloat();
        gameInputStream.readByte();
        super.a(gameInputStream);
    }

    public com.corrodinggames.rts.gameFramework.m.e d() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        return false;
    }

    public ai(boolean z) {
        super(z);
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.k = false;
        this.u = new Rect();
        a(0);
        this.cj = 20.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 100.0f;
        this.cu = this.cv;
        this.cg = -90.0f;
        this.bT = false;
        this.o = 0.05f;
        this.p = 120.0f;
        S(3);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void f_() {
        this.bT = false;
    }

    public void a(int i) {
        this.c = i;
        if (this.c == 0) {
            T(20);
            U(20);
            this.g = 0;
            this.h = 0;
            this.b = f197a[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.c + " is not supported");
    }

    public void f() {
        this.k = true;
        this.i = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, -5, 5, 1);
        this.j = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, -5, 5, 2);
        this.e = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 1, 10, 3);
        this.d = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 0, 2, 4);
        this.f = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 7, 13, 5);
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.b.b bVar = gameEngine.bL;
        gameEngine.bL.a(this.eo, this.ep);
        int i = gameEngine.bL.T;
        int i2 = gameEngine.bL.U;
        if (!bVar.c(i, i2)) {
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 2.0f;
            return;
        }
        com.corrodinggames.rts.game.b.g a2 = gameEngine.bL.u.a(i, i2);
        boolean z = false;
        if (a2.e || a2.h || a2.k || a2.f) {
            z = true;
        }
        if (z) {
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 2.0f;
            return;
        }
        this.l = 5.0E-4f;
        this.m = 1.0f;
        this.n = 0.3f;
        this.o += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 0, 10, 10) / 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!this.k) {
            f();
        }
        if (this.o < this.m) {
            this.o += this.l * f;
            if (this.o > this.m) {
                this.o = this.m;
            }
        }
        if (this.o > this.n) {
            this.q = (float) (this.q + (0.01d * f));
            if ((!this.r && this.q > 1.0f) || this.q > 8.0f) {
                this.q = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, 0, 10, 10) / 1000.0f;
                k();
            }
        }
        this.e += f;
        if (this.e > 10.0f) {
            this.e = 0.0f;
            this.d++;
            if (this.d > 3) {
                this.d = 0;
            }
        }
        if (this.o < 0.0f) {
            bv();
        }
    }

    public void k() {
        this.r = true;
        b(-1, -1);
        b(0, -1);
        b(1, -1);
        b(-1, 0);
        b(1, 0);
        b(-1, 1);
        b(0, 1);
        b(1, 1);
    }

    public void b(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = (int) (this.eo + (i * gameEngine.bL.n));
        float f2 = (int) (this.ep + (i2 * gameEngine.bL.o));
        if (a(f, f2) == null) {
            ai aiVar = new ai(false);
            aiVar.eo = f;
            aiVar.ep = f2;
            aiVar.b(this.bX);
            gameEngine.cc.a(aiVar);
            PlayerData.c(aiVar);
            this.r = false;
        }
    }

    public static ai a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        t.a(f, f2);
        gameEngine.cc.a(f, f2, 30.0f, null, 1.0f, t);
        return t.c;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        int i = this.g;
        int i2 = this.h;
        int i3 = i + (this.d * this.es);
        dC.a(i3, i2, i3 + this.es, i2 + this.et);
        return dC;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        com.corrodinggames.rts.gameFramework.m.e d = d();
        GameEngine gameEngine = GameEngine.getGameEngine();
        du.a(cF());
        du.a(0.0f, (int) (-this.eq));
        du.a(this.i, this.j);
        dv.a(a_(false));
        gameEngine.bO.k();
        float d2 = du.d();
        float e = du.e();
        gameEngine.bO.a(d(false), d2, e);
        gameEngine.bO.a(this.o * 2.7f, this.o * 2.7f, d2, e);
        gameEngine.bO.a(d, dv, du, (Paint) null);
        gameEngine.bO.l();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean Q() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ak() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean aj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean s_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean c_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: s */
    public ar r() {
        return ar.spreadingFire;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void n() {
        super.n();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float x() {
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean P() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(am amVar, float f, com.corrodinggames.rts.game.f fVar) {
        this.o -= f / 100.0f;
        return super.a(amVar, 0.0f, fVar);
    }
}
package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/al.class */
public class al extends v {
    static com.corrodinggames.rts.gameFramework.unitAction.e[] a = new com.corrodinggames.rts.gameFramework.unitAction.e[3];
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    com.corrodinggames.rts.gameFramework.unitAction.e c;
    int d;
    int e;
    int f;
    float g;
    boolean h;
    float i;
    int j;
    int k;
    float l;
    boolean m;

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a[0] = gameEngine.bO.a(AssetsID.drawable.palm_tree);
        a[1] = gameEngine.bO.a(AssetsID.drawable.trees);
        a[2] = gameEngine.bO.a(AssetsID.drawable.trees_snow);
        b = gameEngine.bO.a(AssetsID.drawable.palm_leaves);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.d);
        gameOutputStream.writeInt(this.f);
        gameOutputStream.writeFloat(this.g);
        gameOutputStream.writeBoolean(this.h);
        gameOutputStream.writeFloat(this.i);
        gameOutputStream.writeByte(2);
        gameOutputStream.writeFloat(this.l);
        gameOutputStream.writeInt(this.e);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.d = gameInputStream.readInt();
        this.f = gameInputStream.readInt();
        this.g = gameInputStream.readFloat();
        this.h = gameInputStream.readBoolean();
        this.i = gameInputStream.readFloat();
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.l = gameInputStream.readFloat();
        } else {
            this.l = 1.0f;
        }
        if (readByte >= 2) {
            this.e = gameInputStream.readInt();
        } else {
            this.e = 0;
        }
        b(this.d, this.e);
        super.a(gameInputStream);
        if (this.bV) {
            this.m = false;
        }
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        return this.c;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        k();
        return true;
    }

    public al(boolean z) {
        super(z);
        this.f = 0;
        this.j = 0;
        this.k = 0;
        this.l = 1.0f;
        this.m = false;
        b(1, -1);
        this.cj = 3.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 100.0f;
        this.cu = this.cv;
        this.cg = -90.0f;
        S(3);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a_(String str) {
        int i = -1;
        String[] split = str.split("\\.");
        if (split.length != 0 && split.length != 1) {
            if (split.length == 2) {
                str = split[0];
                try {
                    i = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Tree sub type format error:" + split[1]);
                }
            } else {
                throw new RuntimeException("Tree sub unknown format with parts:" + split.length);
            }
        }
        try {
            b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    public void b(int i, int i2) {
        this.d = i;
        this.e = i2;
        if (this.d == 0) {
            T(27);
            U(41);
            this.j = 1;
            this.k = 1;
            this.c = a[0];
        } else if (this.d == 1 || this.d == 2) {
            if (i2 == -1) {
                i2 = com.corrodinggames.rts.gameFramework.f.a(0, 4, (int) this.eh);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            T(25);
            U(30);
            if (this.d == 1) {
                this.c = a[1];
            } else {
                this.c = a[2];
            }
            this.j = 0;
            this.k = 30 * i2;
            if (i2 == 0) {
                this.l = com.corrodinggames.rts.gameFramework.f.a(1.0f, 1.2f, ((int) this.eh) + 1);
            } else {
                this.l = com.corrodinggames.rts.gameFramework.f.a(1.0f, 2.0f, ((int) this.eh) + 1);
            }
            this.m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.d + " is not supported");
        }
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        if (this.d == 0) {
            if (this.h) {
                if (this.f < 4) {
                    this.g += f;
                    if (this.g > 5.0f) {
                        this.g = 0.0f;
                        this.f++;
                    }
                }
            } else if (this.i != 0.0f) {
                this.i = com.corrodinggames.rts.gameFramework.f.a(this.i, 0.1f * f);
                this.f = 2;
            } else if (this.f > 1) {
                this.f = 1;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        int i = this.j;
        int i2 = this.k;
        int i3 = i + (this.f * (this.es + 1));
        dC.a(i3, i2, i3 + this.es, i2 + this.et);
        return dC;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        com.corrodinggames.rts.gameFramework.unitAction.e d = d();
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.cX < 0.15d) {
            return false;
        }
        du.a(cF());
        du.a(0.0f, (int) (-this.eq));
        float d2 = du.d();
        float e = du.e();
        dv.a(a_(false));
        com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
        yVar.k();
        if (this.l != 1.0f) {
            yVar.a(this.l, this.l, d2, e);
        }
        if (this.m) {
            dv.a(this.es, 0);
            gameEngine.bO.a(d, dv, du, (Paint) null);
            dv.a(-this.es, 0);
        }
        yVar.a(d(false), d2, e);
        yVar.a(d, dv, du, (Paint) null);
        yVar.l();
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
    public boolean aj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ak() {
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
    /* renamed from: f */
    public ar mo1r() {
        return ar.tree;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean a(am amVar, float f) {
        if (!this.h) {
            if (this.i == 0.0f) {
            }
            this.cu -= (((amVar.bN() / 3000.0f) * this.cv) * 0.06f) * f;
            this.i = 1.0f;
            this.dp = 1000.0f;
            if (this.cu <= 0.0f) {
                this.cg = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, amVar.eo, amVar.ep) + 180.0f;
                k();
            }
            if (!this.h) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void k() {
        if (!this.h) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            this.f = 2;
            this.g = 0.0f;
            S(0);
            this.bT = false;
            this.bV = true;
            this.bW = gameEngine.by;
            this.h = true;
            this.m = false;
            for (int i = 0; i < 1; i++) {
                gameEngine.bR.a();
                com.corrodinggames.rts.gameFramework.emitter.e b2 = gameEngine.bR.b(this.eo + com.corrodinggames.rts.gameFramework.f.c(-12.0f, 12.0f), this.ep + com.corrodinggames.rts.gameFramework.f.c(-12.0f, 12.0f), this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.high);
                if (b2 != null) {
                    b2.aq = 9;
                    b2.ap = com.corrodinggames.rts.gameFramework.f.rand(4, 5);
                    b2.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
                    b2.an = true;
                    b2.K = 5.0f + com.corrodinggames.rts.gameFramework.f.c(0.0f, 3.0f);
                    b2.P = com.corrodinggames.rts.gameFramework.f.c(-0.05f, 0.05f) + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * 0.4f);
                    b2.Q = com.corrodinggames.rts.gameFramework.f.c(-0.05f, 0.05f) + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * 0.4f);
                    b2.v = true;
                    b2.w = 0.2f;
                    b2.G = 0.4f * this.l;
                    b2.F = 0.4f * this.l;
                    b2.V = 90 + com.corrodinggames.rts.gameFramework.f.rand(0, 40);
                    b2.W = b2.V;
                    b2.r = true;
                    b2.ar = (short) 2;
                }
            }
            float k = this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * (this.et - 5));
            float j = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * (this.et - 5));
            boolean z = true;
            for (int i2 = 0; i2 < 1; i2++) {
                gameEngine.bR.a();
                com.corrodinggames.rts.gameFramework.emitter.e b3 = gameEngine.bR.b(k + com.corrodinggames.rts.gameFramework.f.c(-17, 17), j + com.corrodinggames.rts.gameFramework.f.c(-17, 17), this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.high);
                if (b3 != null) {
                    b3.aq = 9;
                    b3.ap = com.corrodinggames.rts.gameFramework.f.rand(4, 5);
                    if (z) {
                        z = false;
                        b3.ap = 3;
                    }
                    b3.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
                    b3.an = true;
                    if (b3.ap == 3) {
                        b3.P = com.corrodinggames.rts.gameFramework.f.c(-0.05f, 0.05f);
                        b3.Q = com.corrodinggames.rts.gameFramework.f.c(-0.05f, 0.05f);
                        b3.G = 1.5f * this.l;
                        b3.F = 2.2f * this.l;
                        b3.V = 90 + com.corrodinggames.rts.gameFramework.f.rand(0, 40);
                        b3.ar = (short) 2;
                    } else {
                        b3.P = com.corrodinggames.rts.gameFramework.f.c(-0.05f, 0.05f);
                        b3.Q = com.corrodinggames.rts.gameFramework.f.c(-0.05f, 0.0f);
                        b3.G = 1.3f;
                        b3.F = 1.3f;
                        b3.V = 60 + com.corrodinggames.rts.gameFramework.f.rand(0, 40);
                        b3.ar = (short) 1;
                    }
                    b3.W = b3.V;
                    b3.r = true;
                }
            }
            if (this.d == 1 || this.d == 2) {
                this.eo += com.corrodinggames.rts.gameFramework.f.k(this.cg) * ((this.et / 2) - 3);
                this.ep += com.corrodinggames.rts.gameFramework.f.j(this.cg) * ((this.et / 2) - 3);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void n() {
        super.n();
        this.cg = com.corrodinggames.rts.gameFramework.f.a((this.ep * 5.0f) + (this.eo * 3.0f), false);
        if (this.d == 0) {
            this.f = ((int) ((this.ep * 5.0f) + (this.eo * 3.0f))) % 1;
        }
        if (this.d == 1) {
        }
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
    public float a(am amVar, float f, Projectile projectile) {
        boolean z = this.bV;
        float a2 = super.a(amVar, f, projectile);
        if (!z && this.bV && projectile != null) {
            this.cg = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, projectile.eo, projectile.ep) + 180.0f;
        }
        return a2;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean q() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean t() {
        return true;
    }
}
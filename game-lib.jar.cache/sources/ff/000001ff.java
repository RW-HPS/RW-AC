package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/au.class */
public final class au {

    /* renamed from: a  reason: collision with root package name */
    av f207a;
    as b;
    com.corrodinggames.rts.game.units.a.c c;
    int d;
    am h;
    public com.corrodinggames.rts.gameFramework.ab i;
    public boolean j;
    public boolean m;
    public boolean n;
    float e = 1.0f;
    float f = 1.0f;
    long g = -1;
    public float k = -1.0f;
    public float l = -1.0f;

    public boolean a(au auVar) {
        if (com.corrodinggames.rts.gameFramework.f.c(this.e - auVar.e) > 3.0f || com.corrodinggames.rts.gameFramework.f.c(this.f - auVar.f) > 3.0f) {
            return false;
        }
        return true;
    }

    public boolean b(au auVar) {
        if (auVar == null || this.f207a != auVar.f207a || this.b != auVar.b || com.corrodinggames.rts.gameFramework.f.c(this.e - auVar.e) > 1.0f || com.corrodinggames.rts.gameFramework.f.c(this.f - auVar.f) > 1.0f || this.d != auVar.d || this.h != auVar.h) {
            return false;
        }
        return true;
    }

    public as a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeEnum(this.f207a);
        gameOutputStream.a(this.b);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.f);
        if (this.g != -1) {
            gameOutputStream.writeLong(this.g);
        } else {
            gameOutputStream.a(this.h);
        }
        gameOutputStream.writeByte(this.d);
        gameOutputStream.writeFloat(this.k);
        gameOutputStream.writeFloat(this.l);
        gameOutputStream.writeBoolean(this.m);
        gameOutputStream.writeBoolean(this.j);
        gameOutputStream.writeBoolean(this.n);
        com.corrodinggames.rts.game.units.a.c.a(gameOutputStream, this.c);
    }

    public void a(GameInputStream gameInputStream) {
        this.f207a = (av) gameInputStream.b(av.class);
        this.b = gameInputStream.q();
        this.e = gameInputStream.readFloat();
        this.f = gameInputStream.readFloat();
        this.g = gameInputStream.m318n();
        this.h = null;
        if (gameInputStream.b() >= 40) {
            this.d = gameInputStream.readByte();
        }
        if (gameInputStream.b() >= 46) {
            this.k = gameInputStream.readFloat();
            this.l = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 58) {
            this.m = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 65) {
            this.j = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 79) {
            this.n = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 82) {
            this.c = com.corrodinggames.rts.game.units.a.c.a(gameInputStream);
        }
    }

    public void c() {
        if (this.g != -1) {
            this.h = com.corrodinggames.rts.gameFramework.w.a(this.g, true);
            if (this.h == null) {
                GameEngine.print("convertUnitIds failed");
                if (this.f207a != null) {
                    GameEngine.print("convertUnitIds: type:" + this.f207a.toString());
                }
                if (this.b != null) {
                    GameEngine.print("convertUnitIds: build:" + this.b.toString());
                }
                GameEngine.print("convertUnitIds: x:" + this.e + ", y:" + this.f);
            }
            this.g = -1L;
        }
    }

    public av d() {
        return this.f207a;
    }

    public void e() {
        this.f207a = av.move;
        this.b = null;
        this.d = 1;
        this.e = 2.0f;
        this.f = 2.0f;
        this.g = -1L;
        this.h = null;
        this.i = null;
        this.k = -1.0f;
        this.l = -1.0f;
        this.m = false;
        this.j = false;
        this.n = false;
        this.c = null;
    }

    public boolean f() {
        return this.f207a == av.attack || this.f207a == av.repair || this.f207a == av.reclaim || this.f207a == av.loadInto || this.f207a == av.loadUp || this.f207a == av.guard || this.f207a == av.touchTarget || this.f207a == av.follow;
    }

    public float g() {
        if (f() && this.h != null) {
            return this.h.eo;
        }
        return this.e;
    }

    public float h() {
        if (f() && this.h != null) {
            return this.h.ep;
        }
        return this.f;
    }

    public am i() {
        return this.h;
    }

    public void a(float f, float f2) {
        e();
        this.f207a = av.move;
        this.e = f;
        this.f = f2;
    }

    public void b(float f, float f2) {
        e();
        this.f207a = av.attackMove;
        this.e = f;
        this.f = f2;
    }

    public void a(am amVar) {
        e();
        this.f207a = av.attack;
        this.h = amVar;
    }

    public void a(float f, float f2, as asVar, int i) {
        e();
        this.f207a = av.build;
        this.e = f;
        this.f = f2;
        this.b = asVar;
        this.d = (byte) i;
    }

    public void b(am amVar) {
        e();
        this.f207a = av.repair;
        this.h = amVar;
    }

    public void c(am amVar) {
        e();
        this.f207a = av.guard;
        this.h = amVar;
    }

    public void d(am amVar) {
        e();
        this.f207a = av.touchTarget;
        this.h = amVar;
    }

    public void e(am amVar) {
        e();
        this.f207a = av.follow;
        this.h = amVar;
    }

    public void c(float f, float f2) {
        e();
        this.f207a = av.patrol;
        this.e = f;
        this.f = f2;
    }

    public void f(am amVar) {
        e();
        this.f207a = av.reclaim;
        this.h = amVar;
    }

    public void g(am amVar) {
        e();
        this.f207a = av.loadInto;
        this.h = amVar;
    }

    public void h(am amVar) {
        e();
        this.f207a = av.loadUp;
        this.h = amVar;
    }

    public void c(au auVar) {
        e();
        this.f207a = auVar.f207a;
        this.b = auVar.b;
        this.e = auVar.e;
        this.f = auVar.f;
        this.h = auVar.h;
        this.i = auVar.i;
        this.d = auVar.d;
        this.j = auVar.j;
        this.c = auVar.c;
    }

    public long j() {
        long j = 0;
        if (this.f207a != null) {
            j = 0 + this.f207a.ordinal();
        }
        return j;
    }

    public void k() {
        if (this.h != null) {
            this.g = this.h.eh;
            this.h = null;
        }
        this.i = null;
    }

    public am l() {
        if (f()) {
            return i();
        }
        y yVar = PlayerData.i.t;
        yVar.cg = 0.0f;
        yVar.eo = this.e;
        yVar.ep = this.f;
        yVar.eq = 0.0f;
        return yVar;
    }
}
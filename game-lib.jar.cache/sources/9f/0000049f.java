package com.corrodinggames.rts.gameFramework.emitter;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.w;

/* renamed from: com.corrodinggames.rts.gameFramework.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/f.class */
public class Emitter extends w {
    public float a;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    e i;
    float m;
    float n;
    float o;
    float p;
    float q;
    float r;
    h s;
    public float t;
    static e v;
    static e w;
    private final c x;
    public boolean b = true;
    public int j = 0;
    public int k = 0;
    public int l = -1;
    public boolean u = false;

    /* renamed from: b */
    public static void load() {
        c cVar = GameEngine.getGameEngine().bR;
        e eVar = new e(cVar);
        a(eVar, false);
        eVar.aq = 18;
        eVar.t = 15.0f;
        v = eVar;
        e eVar2 = new e(cVar);
        b(eVar2, false);
        w = eVar2;
    }

    @Override // com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.eo);
        gameOutputStream.writeFloat(this.ep);
        gameOutputStream.writeFloat(this.a);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.eo = gameInputStream.readFloat();
        this.ep = gameInputStream.readFloat();
        this.a = gameInputStream.readFloat();
        this.b = false;
        super.a(gameInputStream);
    }

    public Emitter(c cVar) {
        this.x = cVar;
    }

    public static void a(e eVar, boolean z) {
        eVar.c();
        eVar.aq = 5;
        if (z) {
            eVar.ap = f.rand(0, 1);
        } else {
            eVar.ap = 0;
        }
        eVar.Y = 0.0f;
        eVar.an = true;
        eVar.P = 0.1f;
        eVar.R = 0.5f;
        eVar.u = true;
        eVar.V = 300.0f;
        eVar.W = eVar.V;
        eVar.r = true;
        eVar.s = true;
        eVar.t = 40.0f;
        eVar.as = false;
        eVar.ar = (short) 2;
        eVar.G = 0.4f;
        eVar.F = 1.5f;
        eVar.g = e.k;
    }

    public static void b(e eVar, boolean z) {
        eVar.c();
        eVar.aq = 7;
        if (z) {
            eVar.ap = f.rand(0, 3);
        } else {
            eVar.ap = 0;
        }
        eVar.Y = 0.0f;
        eVar.an = true;
        eVar.P = 0.0f;
        eVar.R = 0.2f;
        eVar.u = true;
        eVar.V = 50.0f;
        eVar.W = eVar.V;
        eVar.r = true;
        eVar.s = true;
        eVar.t = 10.0f;
        eVar.as = false;
        eVar.ar = (short) 2;
        eVar.g = e.n;
    }

    public static Emitter a(float f, float f2) {
        Emitter a = a(f, f2, v);
        a.a = 280.0f;
        a.f = 10.0f;
        a.c = 10.0f;
        a.m = 0.03f;
        a.n = 0.03f;
        a.p = 6.0f;
        a.q = 6.0f;
        a.s = h.verylow;
        a.r = 180.0f;
        a.j = -16777216;
        return a;
    }

    public static Emitter b(float f, float f2) {
        Emitter a = a(f, f2, w);
        a.a = 330.0f;
        a.f = 10.0f;
        a.c = 10.0f;
        a.m = 0.1f;
        a.n = 0.03f;
        a.p = 4.0f;
        a.q = 4.0f;
        a.s = h.verylow;
        return a;
    }

    public static Emitter a(float f, float f2, e eVar) {
        c cVar = GameEngine.getGameEngine().bR;
        Emitter emitter = new Emitter(cVar);
        emitter.eo = f;
        emitter.ep = f2;
        emitter.a = 100.0f;
        emitter.f = 10.0f;
        emitter.i = eVar;
        if (eVar == null) {
            emitter.i = new e(cVar);
            GameEngine.print("Error: Emitter create srcEffect==null");
        }
        return emitter;
    }

    public boolean c() {
        return GameEngine.getGameEngine().cP.b(this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        e b;
        this.t = f.a(this.t, f);
        if (this.t > 0.0f) {
            return;
        }
        if (this.b) {
            this.c += f;
            if (this.c > this.f) {
                this.d += f;
                if (this.d > this.g) {
                    this.d = 0.0f;
                    this.e += 1.0f;
                    if (this.e > this.h) {
                        this.c = 0.0f;
                        this.e = 0.0f;
                    }
                    if ((this.u || c()) && (b = this.x.b(this.eo, this.ep, 0.0f, d.custom, false, this.s)) != null) {
                        b.a(this.i);
                        b.P += f.c(-this.m, this.m);
                        b.Q += f.c(-this.n, this.n);
                        b.R += f.c(-this.o, this.o);
                        b.Y = f.c(-this.r, this.r);
                        b.I = this.eo;
                        b.J = this.ep;
                        b.I += f.c(-this.p, this.p);
                        b.J += f.c(-this.q, this.q);
                        if (this.j != 0) {
                            b.x = this.j;
                        }
                        if (this.l >= 0) {
                            b.y = this.k;
                            b.z = this.l;
                        }
                    }
                }
            }
        }
        this.a -= f;
        if (this.a < 0.0f) {
            a();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean f(float f) {
        return false;
    }
}
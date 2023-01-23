package com.corrodinggames.rts.gameFramework.d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.ae;
import com.corrodinggames.rts.gameFramework.w;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/c.class */
public final class c {
    public static boolean h;
    public int i;
    public int j;
    public static ae k;
    public com.corrodinggames.rts.gameFramework.unitAction.e l;
    public com.corrodinggames.rts.gameFramework.unitAction.e m;
    public static g[] s;
    public static e[] f = new e[0];
    public static int g = 0;
    public static final RectF n = new RectF();
    public static final Rect o = new Rect();
    public static final Rect p = new Rect();
    public static final Paint q = new Paint();
    public static final Paint r = new Paint();

    /* renamed from: a */
    public int f469a = 0;
    public int b = 80;
    public int c = 100;
    public int d = 110;
    public int e = 120;
    private boolean[] y = new boolean[5];
    h t = null;
    boolean u = false;
    boolean v = false;
    public final Paint w = new Paint();
    float x = 0.0f;

    public e a(h hVar) {
        int i = 0;
        int b = GameEngine.getGameEngine().b();
        if (b < 13) {
            i = -this.j;
        } else if (b < 28) {
            i = -this.i;
        }
        int i2 = this.f469a;
        if (hVar == h.verylow && i2 > this.b + i) {
            return null;
        }
        if (hVar == h.low && i2 > this.c + i) {
            return null;
        }
        if (hVar == h.high && i2 > this.d + i) {
            return null;
        }
        if (hVar == h.veryhigh && i2 > this.e + i) {
            return null;
        }
        e a2 = a(true, (h) null);
        if (a2 == null && (hVar == h.critical || hVar == h.veryhigh)) {
            a2 = a(false, h.high);
        }
        if (a2 != null) {
            if (!a2.o) {
                a2.o = true;
                this.f469a++;
            }
            return a2;
        }
        return null;
    }

    private e a(boolean z, h hVar) {
        e[] eVarArr = f;
        int length = eVarArr.length;
        if (z && hVar == null) {
            for (int i = 0; i < length; i++) {
                e eVar = eVarArr[i];
                if (!eVar.o) {
                    if (g == i) {
                        g++;
                    }
                    return eVar;
                }
            }
            return null;
        }
        for (e eVar2 : eVarArr) {
            if ((!z || !eVar2.o) && (hVar == null || eVar2.q.a(hVar))) {
                return eVar2;
            }
        }
        return null;
    }

    public void a(float f2, float f3, float f4) {
        a(f2, f3, f4, 0.0f, 20.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6) {
        for (int i = 0; i < 7; i++) {
            e b = b(f2 + com.corrodinggames.rts.gameFramework.f.c(-20.0f, 20.0f), f3 + com.corrodinggames.rts.gameFramework.f.c(-20.0f, 20.0f), f4);
            if (b != null) {
                b.U = f5 + com.corrodinggames.rts.gameFramework.f.c(0.0f, f6);
                b.aj = com.corrodinggames.rts.gameFramework.f.c(0.3f, 0.6f);
            }
        }
    }

    public float a(float f2, float f3) {
        return com.corrodinggames.rts.gameFramework.f.c(f2, f3);
    }

    public e b(float f2, float f3, float f4) {
        a();
        e b = b(f2, f3, f4, d.custom, false, h.high);
        if (b != null) {
            b.aq = 1;
            b.ae = true;
            b.ak = 0.0f;
            b.aj = 0.5f;
            b.ag = 12;
            b.ap = 0;
            b.V = 35.0f;
            b.W = b.V - 10.0f;
            b.r = true;
            b.E = 0.7f;
            b.Y = a(-180.0f, 180.0f);
            float a2 = a(0.8f, 1.0f);
            b.G = a2;
            b.F = a2;
        }
        return b;
    }

    public e c(float f2, float f3, float f4) {
        a();
        e b = b(f2, f3, f4, d.custom, false, h.high);
        if (b != null) {
            b.aq = 13;
            b.ae = true;
            b.ak = 3.0f;
            b.aj = 0.5f;
            b.ag = 7;
            b.ap = 0;
            b.V = 35.0f;
            b.W = b.V - 10.0f;
            b.r = true;
            b.E = 1.0f;
            b.G = 0.5f;
            b.F = 0.5f;
        }
        return b;
    }

    public e a(float f2, float f3, float f4, float f5, float f6, float f7) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.bL.a(f2, f3, gameEngine.bs) && !gameEngine.bL.a(f5, f6, gameEngine.bs)) {
            return null;
        }
        e b = b(f2, f3, f4, d.custom, true, h.high);
        if (b != null) {
            b.an = false;
            b.V = 5.0f;
            b.W = b.V;
            b.r = true;
            b.E = 1.0f;
            b.L = true;
            b.M = f5;
            b.N = f6;
            b.O = f7;
        }
        return b;
    }

    public e a(float f2, float f3, float f4, float f5) {
        return a(f2, f3, f4, f5, 0);
    }

    public e a(float f2, float f3, float f4, float f5, int i) {
        return a(f2, f3, f4, f5, i, 0);
    }

    public e b(float f2, float f3, float f4, float f5, int i) {
        return a(f2, f3, f4, f5, i, 1);
    }

    public e a(float f2, float f3, float f4, float f5, int i, int i2) {
        a();
        e b = b(f2, f3, f4, d.custom, false, h.high);
        if (b != null) {
            b.g = e.j;
            b.ae = true;
            if (i2 == 1) {
                b.aq = 3;
                b.ak = 1.0f;
                b.aj = 0.4f;
                b.ag = 4;
            } else {
                b.aq = 3;
                b.ak = 0.0f;
                b.aj = 0.5f;
                b.ag = 3;
            }
            b.Y = f5;
            b.ap = 0;
            b.V = 20.0f;
            b.W = b.V;
            b.r = false;
            if (i != 0) {
                b.B = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    public e c(float f2, float f3, float f4, float f5, int i) {
        e b = b(f2, f3, f4, d.custom, false, h.verylow);
        if (b != null) {
            b.aq = 4;
            b.g = e.i;
            b.ap = com.corrodinggames.rts.gameFramework.f.a(0, 2);
            b.Y = f5;
            b.an = true;
            b.P = com.corrodinggames.rts.gameFramework.f.k(f5) * 0.15f;
            b.Q = com.corrodinggames.rts.gameFramework.f.j(f5) * 0.15f;
            b.V = 30.0f;
            b.W = b.V;
            b.r = true;
            b.ar = (short) 1;
            b.G = 0.8f;
            b.F = 2.3f;
            if (i != 0) {
                b.B = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    public static void a(e eVar, w wVar) {
        if (eVar == null) {
            return;
        }
        eVar.b = wVar;
        eVar.I -= wVar.eo;
        eVar.J -= wVar.ep;
        eVar.K -= wVar.eq;
    }

    public e a(w wVar, int i) {
        return a(wVar, i, 0.5f);
    }

    public e a(w wVar, int i, float f2) {
        b();
        e b = b(wVar.eo, wVar.ep, wVar.eq, i);
        if (b != null) {
            b.I = 0.0f;
            b.J = 0.0f;
            b.K = 0.0f;
            b.V = 400.0f;
            b.W = b.V;
            b.E = 0.3f;
            b.G = f2;
            b.b = wVar;
        }
        return b;
    }

    public e a(float f2, float f3, float f4, int i) {
        if (this.t == null && !this.v) {
            a();
        }
        return b(f2, f3, f4, i);
    }

    public e b(float f2, float f3, float f4, int i) {
        e b = b(f2, f3, f4, d.custom, true, h.low);
        if (b != null) {
            b.e = false;
            b.g = e.h;
            b.aq = 2;
            b.V = 10.0f;
            b.W = b.V;
            b.r = true;
            b.E = 0.5f;
            b.ar = (short) 2;
            b.d = true;
            if (i != 0) {
                b.x = i;
                b.B = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    public e b(float f2, float f3, float f4, float f5) {
        a();
        e b = b(f2, f3, f4, d.custom, false, h.low);
        if (b != null) {
            b.g = e.l;
            b.aq = 0;
            b.ap = 13;
            b.ar = (short) 1;
            b.r = true;
            b.E = 0.8f;
            b.W = 80.0f;
            b.V = b.W;
            b.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
            b.G = com.corrodinggames.rts.gameFramework.f.c(0.6f, 0.8f);
            b.F = 1.5f;
            b.P = (com.corrodinggames.rts.gameFramework.f.k(f5) * 0.13f * com.corrodinggames.rts.gameFramework.f.c(1.0f, 1.5f)) + com.corrodinggames.rts.gameFramework.f.c(-0.01f, 0.01f);
            b.Q = (com.corrodinggames.rts.gameFramework.f.j(f5) * 0.13f * com.corrodinggames.rts.gameFramework.f.c(1.0f, 1.5f)) + com.corrodinggames.rts.gameFramework.f.c(-0.01f, 0.01f);
        }
        return b;
    }

    public e a(float f2, float f3, float f4, int i, float f5, float f6) {
        e b = b(f2, f3, f4, d.custom, false, h.high);
        if (b != null) {
            b.g = e.l;
            b.aq = 6;
            b.V = 120.0f;
            b.W = b.V;
            b.r = true;
            b.G = 0.2f;
            b.F = 0.9f;
            b.ar = (short) 1;
            b.E = 0.5f;
            b.P = f5;
            b.Q = f6;
            if (i != 0) {
                i = Color.a(255, 0, 0, 200);
            }
            if (i != 0) {
                b.B = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    public void a(float f2, float f3, float f4, int i, float f5, float f6, float f7) {
        a(f2, f3, 0.0f, 0, 0.0f, 0.0f);
        for (int i2 = -180; i2 < 180; i2 += 45) {
            float f8 = f7 + i2;
            e b = b(f2 + (com.corrodinggames.rts.gameFramework.f.k(f8) * (-5.0f)), f3 + (com.corrodinggames.rts.gameFramework.f.j(f8) * (-5.0f)), 0.0f, f8);
            if (b != null) {
                b.ar = (short) 2;
                b.s = true;
                b.t = 7.0f;
            }
        }
    }

    public e c(float f2, float f3, float f4, int i) {
        e d = d(f2, f3, f4, i);
        if (d != null) {
            d.aq = 11;
        }
        return d;
    }

    public e d(float f2, float f3, float f4, int i) {
        a();
        e b = b(f2, f3, f4, d.custom, false, h.high);
        if (b != null) {
            b.aq = 6;
            b.V = 30.0f;
            b.W = b.V;
            b.r = true;
            b.G = 0.2f;
            b.F = 1.3f;
            b.ar = (short) 1;
            if (i != 0) {
                b.B = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    public e d(float f2, float f3, float f4) {
        e b = b(f2, f3, f4, 0.3f, 0.7f);
        if (b != null) {
            b.aq = 14;
            b.ap = com.corrodinggames.rts.gameFramework.f.a(0, 5);
            b.w = 0.5f;
        }
        return b;
    }

    public e e(float f2, float f3, float f4) {
        e b = b(f2, f3, f4, 1.0f, 1.0f);
        if (b != null) {
        }
        return b;
    }

    public e b(float f2, float f3, float f4, float f5, float f6) {
        b();
        e b = b(f2, f3, f4, d.custom, false, h.high);
        if (b != null) {
            b.g = e.m;
            b.aq = 12;
            b.ap = com.corrodinggames.rts.gameFramework.f.a(0, 7);
            b.V = com.corrodinggames.rts.gameFramework.f.c(400.0f, 800.0f);
            b.W = b.V - 150.0f;
            b.r = true;
            float c = com.corrodinggames.rts.gameFramework.f.c(0.6f, 1.0f);
            b.G = c;
            b.F = c;
            b.ar = (short) 2;
            b.v = true;
            b.as = true;
            float c2 = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
            float c3 = com.corrodinggames.rts.gameFramework.f.c(0.4f, 1.2f) * f5;
            b.P = com.corrodinggames.rts.gameFramework.f.k(c2) * c3;
            b.Q = com.corrodinggames.rts.gameFramework.f.j(c2) * c3;
            b.R = com.corrodinggames.rts.gameFramework.f.c(0.6f, 2.7f) * f6;
            b.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
            b.K += 1.0f;
        }
        return b;
    }

    public e f(float f2, float f3, float f4) {
        e b = b(f2, f3, f4, d.custom, false, h.low);
        if (b != null) {
            b.aq = 8;
            b.V = 480.0f;
            b.W = b.V;
            b.r = false;
            b.ar = (short) 1;
            b.ae = true;
            b.ak = 0.0f;
            b.G = 0.5f;
            b.G = 1.0f;
            int a2 = com.corrodinggames.rts.gameFramework.f.a(0, 100);
            if (a2 > 80) {
                b.aj = com.corrodinggames.rts.gameFramework.f.c(0.1f, 0.15f);
                b.ag = 15;
            } else if (a2 > 60) {
                b.aj = com.corrodinggames.rts.gameFramework.f.c(0.06f, 0.16f);
                b.ah = true;
                b.ag = 6;
                b.r = true;
            } else {
                b.aj = com.corrodinggames.rts.gameFramework.f.c(0.06f, 0.16f);
                b.ah = true;
                b.ag = 3;
                b.r = true;
            }
        }
        return b;
    }

    public void b(h hVar) {
        this.t = hVar;
    }

    public void a() {
        this.u = true;
    }

    public void b() {
        this.v = true;
    }

    public e a(float f2, float f3, float f4, d dVar, boolean z, h hVar) {
        e b = b(f2, f3, f4, dVar, z, hVar);
        if (b != null) {
            b.p = true;
        }
        return b;
    }

    public e b(float f2, float f3, float f4, d dVar, boolean z, h hVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.t != null) {
            hVar = this.t;
            this.t = null;
        }
        boolean z2 = this.v;
        this.v = false;
        if (this.u) {
            this.u = false;
            if (!gameEngine.cP.b(f2, f3)) {
                return null;
            }
        }
        if (!z && gameEngine.bL != null && !gameEngine.bL.a(f2, f3, gameEngine.bs)) {
            return null;
        }
        if (gameEngine.cO.b(f2, f3)) {
            if (hVar == h.verylow) {
                hVar = h.low;
            } else if (hVar == h.low) {
                hVar = h.high;
            } else if (hVar == h.high) {
                hVar = h.veryhigh;
            }
        } else if (z2 || gameEngine.cP.b(f2, f3)) {
        }
        e a2 = a(hVar);
        if (a2 == null) {
            return null;
        }
        a2.c();
        a2.q = hVar;
        a2.aq = 0;
        a2.an = true;
        a2.I = f2;
        a2.J = f3;
        a2.K = f4;
        a2.E = 1.0f;
        if (dVar == d.hitGround || dVar == d.playerLand || dVar == d.playerJump) {
            a2.ap = 7;
            a2.V = 12.0f;
            a2.r = true;
            a2.Q = -0.3f;
            a2.E = 0.7f;
            if (dVar == d.playerJump) {
                a2.ap = 3;
                a2.Q = -0.7f;
                a2.V = 24.0f;
                a2.E = 0.7f;
            }
            if (dVar == d.playerLand) {
                a2.ap = 4;
                a2.V = 15.0f;
                a2.E = 0.4f;
            }
        }
        if (dVar == d.teleport) {
            a2.ap = 1;
            a2.V = 25.0f;
            a2.r = true;
        }
        if (dVar == d.gemCollect) {
            a2.ap = 5;
            a2.V = 42.0f;
            a2.r = true;
            a2.Q = 0.1f;
            a2.E = 2.0f;
        }
        if (dVar == d.keyDoorOpen) {
            a2.ap = 6;
            a2.V = 39.0f;
            a2.r = true;
            a2.Q = 0.1f;
            a2.E = 2.0f;
        }
        if (dVar == d.blood) {
            a2.ap = 14;
            a2.V = 39.0f;
            a2.r = true;
            a2.Q = 0.1f;
            a2.E = 0.7f;
        }
        a2.W = a2.V;
        return a2;
    }

    public void a(Context context) {
        int i;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.w.a(130, 200, 0, 0);
        this.w.a(true);
        this.w.a(2.0f);
        this.w.a(Paint.Cap.ROUND);
        if (GameEngine.aW) {
            this.w.a(3.0f);
        }
        s = new g[20];
        g gVar = new g();
        gVar.b = 25;
        gVar.c = 25;
        gVar.d = 1;
        gVar.e = 1;
        gVar.f = 26;
        gVar.g = 26;
        gVar.i = gameEngine.bO.a(R.drawable.effects, true);
        gVar.f473a = "effects";
        gVar.a();
        s[0] = gVar;
        g gVar2 = new g();
        gVar2.b = 39;
        gVar2.c = 40;
        gVar2.d = 1;
        gVar2.e = 1;
        gVar2.f = 40;
        gVar2.g = 41;
        gVar2.i = gameEngine.bO.a(R.drawable.explode_big, true);
        gVar2.f473a = "explode_big";
        s[1] = gVar2;
        g gVar3 = new g();
        gVar3.k = true;
        gVar3.i = gameEngine.bO.a(R.drawable.light_50, true);
        gVar3.f473a = "light_50";
        s[2] = gVar3;
        g gVar4 = new g();
        gVar4.b = 20;
        gVar4.c = 25;
        gVar4.d = 0;
        gVar4.e = 0;
        gVar4.f = 20;
        gVar4.g = 25;
        gVar4.i = gameEngine.bO.a(R.drawable.flame, true);
        gVar4.f473a = "flame";
        s[3] = gVar4;
        g gVar5 = new g();
        gVar5.b = 20;
        gVar5.c = 25;
        gVar5.d = 0;
        gVar5.e = 0;
        gVar5.f = gVar5.b;
        gVar5.g = gVar5.c;
        gVar5.i = gameEngine.bO.a(R.drawable.dust, true);
        gVar5.f473a = "dust";
        s[4] = gVar5;
        g gVar6 = new g();
        gVar6.b = 50;
        gVar6.c = 40;
        gVar6.d = 0;
        gVar6.e = 0;
        gVar6.f = gVar6.b;
        gVar6.g = gVar6.c;
        gVar6.i = gameEngine.bO.a(R.drawable.smoke_black, true);
        gVar6.f473a = "smoke_black";
        gVar6.a();
        s[5] = gVar6;
        g gVar7 = new g();
        gVar7.b = 50;
        gVar7.c = 50;
        gVar7.d = 0;
        gVar7.e = 0;
        gVar7.f = gVar7.b;
        gVar7.g = gVar7.c;
        gVar7.i = gameEngine.bO.a(R.drawable.shockwave, true);
        gVar7.f473a = "shockwave";
        s[6] = gVar7;
        g gVar8 = new g();
        gVar8.b = 20;
        gVar8.c = 20;
        gVar8.d = 0;
        gVar8.e = 0;
        gVar8.f = gVar8.b;
        gVar8.g = gVar8.c;
        gVar8.i = gameEngine.bO.a(R.drawable.fire, true);
        gVar8.f473a = "fire";
        s[7] = gVar8;
        g gVar9 = new g();
        gVar9.b = 20;
        gVar9.c = 30;
        gVar9.f = gVar9.b + 2;
        gVar9.g = gVar9.c;
        gVar9.i = gameEngine.bO.a(R.drawable.lava_bubble, true);
        gVar9.f473a = "lava_bubble";
        s[8] = gVar9;
        g gVar10 = new g();
        gVar10.b = 28;
        gVar10.c = 28;
        gVar10.d = 0;
        gVar10.e = 0;
        gVar10.f = gVar10.b + 1;
        gVar10.g = gVar10.c + 1;
        gVar10.i = gameEngine.bO.a(R.drawable.effects2, true);
        gVar10.f473a = "effects2";
        s[9] = gVar10;
        g gVar11 = new g();
        gVar11.b = 20;
        gVar11.c = 25;
        gVar11.d = 0;
        gVar11.e = 0;
        gVar11.f = 20;
        gVar11.g = 25;
        gVar11.i = gameEngine.bO.a(R.drawable.plasma_shot, true);
        gVar11.f473a = "plasma_shot";
        s[10] = gVar11;
        g gVar12 = new g();
        gVar12.b = 104;
        gVar12.c = 104;
        gVar12.d = 0;
        gVar12.e = 0;
        gVar12.f = gVar12.b;
        gVar12.g = gVar12.c;
        gVar12.i = gameEngine.bO.a(R.drawable.shockwave_large, true);
        gVar12.f473a = "shockwave_large";
        s[11] = gVar12;
        g gVar13 = new g();
        gVar13.b = 20;
        gVar13.c = 20;
        gVar13.d = 0;
        gVar13.e = 0;
        gVar13.f = gVar13.b;
        gVar13.g = gVar13.c;
        gVar13.i = gameEngine.bO.a(R.drawable.explode_bits, true);
        gVar13.f473a = "explode_bits";
        gVar13.a();
        s[12] = gVar13;
        g gVar14 = new g();
        gVar14.b = 39;
        gVar14.c = 40;
        gVar14.d = 1;
        gVar14.e = 1;
        gVar14.f = 40;
        gVar14.g = 41;
        gVar14.i = gameEngine.bO.a(R.drawable.explode_big2, true);
        gVar14.f473a = "explode_big2";
        s[13] = gVar14;
        g gVar15 = new g();
        gVar15.b = 20;
        gVar15.c = 20;
        gVar15.d = 0;
        gVar15.e = 0;
        gVar15.f = gVar15.b;
        gVar15.g = gVar15.c;
        gVar15.i = gameEngine.bO.a(R.drawable.explode_bits_bug, true);
        gVar15.f473a = "explode_bits_bug";
        gVar15.a();
        s[14] = gVar15;
        g gVar16 = new g();
        gVar16.b = 20;
        gVar16.c = 20;
        gVar16.d = 0;
        gVar16.e = 0;
        gVar16.f = gVar16.b;
        gVar16.g = gVar16.c;
        gVar16.i = gameEngine.bO.a(R.drawable.projectiles, true);
        gVar16.f473a = "projectiles";
        gVar16.a();
        s[15] = gVar16;
        g gVar17 = new g();
        gVar17.b = 20;
        gVar17.c = 20;
        gVar17.d = 0;
        gVar17.e = 0;
        gVar17.f = gVar17.b;
        gVar17.g = gVar17.c;
        gVar17.i = gameEngine.bO.a(R.drawable.projectiles2, true);
        gVar17.f473a = "projectiles2";
        gVar17.a();
        s[16] = gVar17;
        g gVar18 = new g();
        gVar18.b = 30;
        gVar18.c = 30;
        gVar18.d = 0;
        gVar18.e = 0;
        gVar18.f = gVar18.b + 1;
        gVar18.g = gVar18.c + 1;
        gVar18.i = gameEngine.bO.a(R.drawable.effects3, true);
        gVar18.f473a = "effects3";
        s[17] = gVar18;
        g gVar19 = new g();
        gVar19.b = 50;
        gVar19.c = 40;
        gVar19.d = 0;
        gVar19.e = 0;
        gVar19.f = gVar19.b;
        gVar19.g = gVar19.c;
        gVar19.i = gameEngine.bO.a(R.drawable.smoke_white, true);
        gVar19.f473a = "smoke_white";
        gVar19.a();
        s[18] = gVar19;
        g gVar20 = new g();
        gVar20.b = 56;
        gVar20.c = 56;
        gVar20.d = 0;
        gVar20.e = 0;
        gVar20.f = gVar20.b;
        gVar20.g = gVar20.c;
        gVar20.i = gameEngine.bO.a(R.drawable.shockwave2, true);
        gVar20.f473a = "shockwave2";
        gVar20.a();
        s[19] = gVar20;
        if (GameEngine.av()) {
            i = 500;
            this.i = 90;
            this.j = 210;
        } else {
            i = 350;
            this.i = 90;
            this.j = 170;
        }
        f = new e[i];
        this.b = i - 60;
        this.c = i - 30;
        this.d = i - 20;
        this.e = i - 10;
        for (int i2 = 0; i2 < f.length; i2++) {
            f[i2] = new e(this);
        }
    }

    public int a(String str) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                if (s[i].f473a != null && s[i].f473a.equalsIgnoreCase(str)) {
                    return i;
                }
                if ((VariableScope.nullOrMissingString + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void a(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        e[] eVarArr = f;
        for (int i = 0; i < g; i++) {
            e eVar = eVarArr[i];
            if (eVar.o && !eVar.p) {
                eVar.b(f2);
            }
        }
        if (h) {
            while (g > 0 && !eVarArr[g - 1].o) {
                g--;
            }
        }
        this.x += f2;
        if (this.x > 10.0f) {
            this.x = 0.0f;
            gameEngine.bL.a(gameEngine.cu + com.corrodinggames.rts.gameFramework.f.a(0, (int) gameEngine.cA), gameEngine.cv + com.corrodinggames.rts.gameFramework.f.a(0, (int) gameEngine.cB));
            int i2 = gameEngine.bL.T;
            int i3 = gameEngine.bL.U;
            com.corrodinggames.rts.game.b.g d = gameEngine.bL.d(i2, i3);
            if (d != null && d.g && !d.h) {
                gameEngine.bL.a(i2, i3);
                f(gameEngine.bL.T + 10, (gameEngine.bL.U - 10) + 10, 0.0f);
            }
        }
    }

    public int b(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        for (int i2 = 0; i2 < this.y.length; i2++) {
            this.y[i2] = false;
        }
        for (int i3 = 0; i3 < g; i3++) {
            e eVar = f[i3];
            if (eVar.o) {
                if (!this.y[eVar.ar]) {
                    this.y[eVar.ar] = true;
                }
                if (eVar.p) {
                    eVar.b(f2);
                }
                if (eVar.as && eVar.a(gameEngine, true)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int a(float f2, int i) {
        if (!this.y[i]) {
            return 0;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i2 = 0;
        e[] eVarArr = f;
        for (int i3 = 0; i3 < g; i3++) {
            e eVar = eVarArr[i3];
            if (eVar.o && eVar.ar == i && eVar.a(gameEngine, false)) {
                i2++;
            }
        }
        return i2;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        for (int i = 0; i < f.length; i++) {
            e eVar = f[i];
            if (eVar.o) {
                eVar.o = false;
                this.f469a--;
            }
        }
        if (this.f469a != 0) {
            GameEngine.a("EffectEngine::removeAll: effectListActiveSize == " + this.f469a);
        }
        g = 0;
    }
}
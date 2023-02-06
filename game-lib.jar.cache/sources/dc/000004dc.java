package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.appFramework.g;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.emitter.e;
import com.corrodinggames.rts.gameFramework.emitter.h;
import com.corrodinggames.rts.gameFramework.translations.a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/f.class */
public class f {
    Paint a;
    boolean n;
    boolean o;
    static String p = a.a("gui.rategame.text", new Object[0]);
    static String q = a.a("gui.rategame.yes", new Object[0]);
    static String r = a.a("gui.rategame.no", new Object[0]);
    boolean b = false;
    float c = 0.0f;
    float d = 0.0f;
    Rect e = new Rect();
    Rect f = new Rect();
    Rect g = new Rect();
    y h = null;
    ArrayList i = new ArrayList();
    int j = 30;
    int k = 140;
    int l = 30;
    final Rect m = new Rect();
    boolean s = false;
    float t = 0.0f;

    public f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a();
        this.a = new Paint();
        this.a.a(true);
        this.a.a(Paint.Align.CENTER);
        this.a.a(255, 0, 255, 0);
        gameEngine.a(this.a, 34.0f);
    }

    void a() {
        this.i.clear();
        this.i.add(new b("Finish game") { // from class: com.corrodinggames.rts.gameFramework.f.f.1
            @Override // com.corrodinggames.rts.gameFramework.Interface.b
            void b() {
                GameEngine.getGameEngine().du = true;
            }
        });
        this.i.add(new b("Keep playing") { // from class: com.corrodinggames.rts.gameFramework.f.f.2
            @Override // com.corrodinggames.rts.gameFramework.Interface.b
            void b() {
                GameEngine.getGameEngine().dr = true;
            }
        });
    }

    boolean b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((gameEngine.dq || gameEngine.dt) && !gameEngine.dr) {
            return true;
        }
        return false;
    }

    public void a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceEngine interfaceEngine = gameEngine.bS;
        boolean b = b();
        this.m.h();
        this.n = false;
        if (b && !interfaceEngine.u) {
            int a = gameEngine.a(this.j);
            int a2 = gameEngine.a(this.k);
            int a3 = a + gameEngine.a(this.l);
            int a4 = a2 + gameEngine.a(this.l);
            int size = this.i.size();
            float f2 = 0.0f;
            if (interfaceEngine.c) {
                interfaceEngine.d += (2.0f * f) / 60.0f;
                f2 = com.corrodinggames.rts.gameFramework.f.i(com.corrodinggames.rts.gameFramework.f.b(interfaceEngine.d, 0.0f, 1.0f));
            }
            int a5 = gameEngine.a(40) + (a4 * size);
            int a6 = gameEngine.a(140);
            if (interfaceEngine.b) {
                a6 += gameEngine.a(50);
            }
            if (interfaceEngine.c) {
                a5 = (int) com.corrodinggames.rts.gameFramework.f.f(a5, gameEngine.cF * 0.9f, f2);
                a6 = (int) com.corrodinggames.rts.gameFramework.f.f(a6, gameEngine.cH * 0.9f, f2);
            }
            float f3 = gameEngine.cp - (a6 / 2);
            if (!interfaceEngine.c) {
                f3 = com.corrodinggames.rts.gameFramework.f.f(f3, f3 / 2.0f, 1.0f - f2);
            }
            if (f3 < 20.0f) {
                f3 = 20.0f;
            }
            this.g.b = (int) f3;
            this.g.d = this.g.b + a6;
            this.g.a = (int) ((gameEngine.cF / 2.0f) - (a5 / 2));
            this.g.c = (int) ((gameEngine.cF / 2.0f) + (a5 / 2));
            this.m.a(this.g);
            if (this.m.b((int) interfaceEngine.z, (int) interfaceEngine.A)) {
                this.n = interfaceEngine.U;
                interfaceEngine.U = false;
                this.o = interfaceEngine.I;
                interfaceEngine.I = false;
            }
            interfaceEngine.a(this.m);
        }
    }

    public void b(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceEngine interfaceEngine = gameEngine.bS;
        boolean b = b();
        if (!gameEngine.dq) {
            this.b = false;
        } else if (!this.b) {
            this.b = true;
            if (!gameEngine.ar && gameEngine.settingsEngine.numberOfWins >= 5 && !gameEngine.settingsEngine.rateGameShown && GameEngine.au) {
                this.s = true;
                gameEngine.settingsEngine.rateGameShown = true;
                gameEngine.settingsEngine.save();
            }
        }
        if (!b) {
            this.c = 0.0f;
        }
        if (b && !interfaceEngine.u) {
            this.c += f;
            if (gameEngine.tick < 120) {
                this.c = 100000.0f;
            }
            if (this.n) {
                interfaceEngine.U = true;
            }
            if (this.o) {
                interfaceEngine.I = true;
            }
            boolean z = this.c > 80.0f;
            boolean z2 = this.c > 100.0f;
            boolean z3 = this.c > 110.0f;
            int a = gameEngine.a(this.j);
            int a2 = gameEngine.a(this.k);
            int a3 = a + gameEngine.a(this.l);
            int a4 = a2 + gameEngine.a(this.l);
            int size = this.i.size();
            int i = (int) ((gameEngine.cF / 2.0f) - (((a2 * size) + ((size - 1) * a3)) / 2));
            float f2 = 0.0f;
            if (interfaceEngine.c) {
                f2 = com.corrodinggames.rts.gameFramework.f.i(com.corrodinggames.rts.gameFramework.f.b(interfaceEngine.d, 0.0f, 1.0f)) >= 1.0f ? 1.0f : 0.0f;
            }
            if (z) {
                float f3 = interfaceEngine.bt.g;
                interfaceEngine.bt.g = f2;
                interfaceEngine.bt.c(gameEngine.bO, this.m);
                interfaceEngine.bt.g = f3;
            }
            int a5 = this.m.b + gameEngine.a(40);
            int i2 = (int) (gameEngine.cF / 2.0f);
            int a6 = this.m.d - gameEngine.a(45);
            int a7 = Color.a(140, 100, 100, 100);
            Paint paint = this.a;
            String str = "Victory!";
            if (gameEngine.dt) {
                str = "Defeat";
            }
            float f4 = 1.0f;
            if (this.c < 95.0f) {
                f4 = this.c / 95.0f;
            }
            int k = (int) (a5 - (com.corrodinggames.rts.gameFramework.f.k(f4 * 90.0f) * 100.0f));
            paint.a(str, 0, str.length(), this.e);
            gameEngine.bO.a(str, i2, k - ((paint.l() + paint.m()) / 2.0f), paint);
            if (this.c < 100.0f && !gameEngine.dt) {
                this.d += f;
                if (this.d > 0.5f) {
                    this.d = 0.0f;
                    gameEngine.bR.b(h.critical);
                    gameEngine.bR.b();
                    e b2 = gameEngine.bR.b(0.0f, 0.0f, 0.0f, Color.a(255, com.corrodinggames.rts.gameFramework.f.rand(0, 255), com.corrodinggames.rts.gameFramework.f.rand(0, 255), com.corrodinggames.rts.gameFramework.f.rand(0, 255)));
                    if (b2 != null) {
                        b2.ar = (short) 4;
                        b2.I = i2 + com.corrodinggames.rts.gameFramework.f.c(-70.0f, 70.0f);
                        b2.J = k + com.corrodinggames.rts.gameFramework.f.c(-15.0f, 15.0f);
                        b2.J += gameEngine.cp / 2.0f;
                        b2.K += gameEngine.cp / 2.0f;
                        b2.V = com.corrodinggames.rts.gameFramework.f.c(140.0f, 380.0f);
                        b2.W = b2.V;
                        b2.r = true;
                        b2.s = true;
                        b2.t = 5.0f;
                        b2.E = 2.0f;
                        b2.Q = com.corrodinggames.rts.gameFramework.f.c(-2.7f, 2.7f);
                        b2.P = com.corrodinggames.rts.gameFramework.f.c(-12.7f, 12.7f);
                        b2.G = 0.4f;
                        b2.F = 0.2f;
                        b2.R = com.corrodinggames.rts.gameFramework.f.c(2.0f, 4.0f);
                        b2.w = 2.0f;
                        b2.v = true;
                        b2.p = true;
                    }
                }
            }
            int i3 = k + 60;
            if (z3) {
                Rect rect = this.e;
                Rect rect2 = this.f;
                rect.a(this.m.a + gameEngine.a(10), this.m.b + gameEngine.a(60), this.m.c - gameEngine.a(10), a6 - gameEngine.a(10));
                rect2.a(rect);
                if (!interfaceEngine.c) {
                    rect.b = this.m.d + gameEngine.a(15);
                    rect.d = rect.b + gameEngine.a(200);
                }
                boolean z4 = interfaceEngine.d >= 1.0f;
                if (this.h != null) {
                    this.h.a(rect, rect2, f, z4, interfaceEngine.b);
                }
            }
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                if (z2) {
                    b bVar = (b) this.i.get(i4);
                    if (interfaceEngine.a(i, a6, a2, a, bVar.a(), i.none, false, a7, interfaceEngine.aD, (com.corrodinggames.rts.gameFramework.Interface.a.h) interfaceEngine.br)) {
                        this.s = false;
                        bVar.b();
                    }
                }
                i += a3 + a2;
            }
            if (this.s) {
                c(f);
            }
            if (this.m.b((int) interfaceEngine.z, (int) interfaceEngine.A)) {
            }
            interfaceEngine.a(this.m);
        }
    }

    void c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceEngine interfaceEngine = gameEngine.bS;
        int a = gameEngine.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((gameEngine.cF / 2.0f) - (a / 2));
        int a2 = gameEngine.a(120);
        int i2 = (int) (gameEngine.cH - a2);
        this.g.a(i, i2, a, a2);
        gameEngine.bO.b(this.g, interfaceEngine.aP);
        int i3 = i + (a / 2);
        Paint paint = this.a;
        String str = p;
        paint.a(str, 0, str.length(), this.e);
        gameEngine.bO.a(str, i3, i2 - ((paint.l() + paint.m()) / 2.0f), paint);
        int c = i2 + this.e.c();
        int a3 = gameEngine.a(70);
        int a4 = gameEngine.a(30);
        int a5 = ((i + (a / 2)) - gameEngine.a(10)) - a3;
        int a6 = Color.a(140, 100, 100, 100);
        if (interfaceEngine.a(a5, c, a3, a4, q, i.none, false, a6, interfaceEngine.aD, (com.corrodinggames.rts.gameFramework.Interface.a.h) null)) {
            this.s = false;
            com.corrodinggames.rts.appFramework.f fVar = gameEngine.ao;
            if (fVar == null) {
                GameEngine.print("showRateNow: gameView==null");
                return;
            }
            g i4 = fVar.i();
            if (i4 == null) {
                GameEngine.print("showRateNow: inGameActivity==null");
                return;
            }
            i4.l();
        }
        if (interfaceEngine.a(i + (a / 2) + gameEngine.a(10), c, a3, a4, r, i.none, false, a6, interfaceEngine.aD, (com.corrodinggames.rts.gameFramework.Interface.a.h) null)) {
            this.s = false;
        }
    }

    public void c() {
        this.h = y.a();
    }
}
package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0784h;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/f.class */
public class C0822f {

    /* renamed from: a */
    Paint f5240a;

    /* renamed from: n */
    boolean f5253n;

    /* renamed from: o */
    boolean f5254o;

    /* renamed from: p */
    static String f5255p = C0855a.m1714a("gui.rategame.text", new Object[0]);

    /* renamed from: q */
    static String f5256q = C0855a.m1714a("gui.rategame.yes", new Object[0]);

    /* renamed from: r */
    static String f5257r = C0855a.m1714a("gui.rategame.no", new Object[0]);

    /* renamed from: b */
    boolean f5241b = false;

    /* renamed from: c */
    float f5242c = 0.0f;

    /* renamed from: d */
    float f5243d = 0.0f;

    /* renamed from: e */
    Rect f5244e = new Rect();

    /* renamed from: f */
    Rect f5245f = new Rect();

    /* renamed from: g */
    Rect f5246g = new Rect();

    /* renamed from: h */
    C0844y f5247h = null;

    /* renamed from: i */
    ArrayList f5248i = new ArrayList();

    /* renamed from: j */
    int f5249j = 30;

    /* renamed from: k */
    int f5250k = 140;

    /* renamed from: l */
    int f5251l = 30;

    /* renamed from: m */
    final Rect f5252m = new Rect();

    /* renamed from: s */
    boolean f5258s = false;

    /* renamed from: t */
    float f5259t = 0.0f;

    public C0822f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        m1920a();
        this.f5240a = new Paint();
        this.f5240a.mo914a(true);
        this.f5240a.m5218a(Paint.Align.CENTER);
        this.f5240a.m5222a(255, 0, 255, 0);
        gameEngine.m1071a(this.f5240a, 34.0f);
    }

    /* renamed from: a */
    void m1920a() {
        this.f5248i.clear();
        this.f5248i.add(new AbstractC0818b("Finish game") { // from class: com.corrodinggames.rts.gameFramework.f.f.1
            @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0818b
            /* renamed from: b */
            void mo1914b() {
                GameEngine.getGameEngine().f6458du = true;
            }
        });
        this.f5248i.add(new AbstractC0818b("Keep playing") { // from class: com.corrodinggames.rts.gameFramework.f.f.2
            @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0818b
            /* renamed from: b */
            void mo1914b() {
                GameEngine.getGameEngine().f6455dr = true;
            }
        });
    }

    /* renamed from: b */
    boolean m1918b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((gameEngine.f6454dq || gameEngine.f6457dt) && !gameEngine.f6455dr) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m1919a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0825g c0825g = gameEngine.f6378bS;
        boolean m1918b = m1918b();
        this.f5252m.m5155h();
        this.f5253n = false;
        if (m1918b && !c0825g.f5282u) {
            int m1078a = gameEngine.m1078a(this.f5249j);
            int m1078a2 = gameEngine.m1078a(this.f5250k);
            int m1078a3 = m1078a + gameEngine.m1078a(this.f5251l);
            int m1078a4 = m1078a2 + gameEngine.m1078a(this.f5251l);
            int size = this.f5248i.size();
            float f2 = 0.0f;
            if (c0825g.f5264c) {
                c0825g.f5265d += (2.0f * f) / 60.0f;
                f2 = C0773f.m2113i(C0773f.m2171b(c0825g.f5265d, 0.0f, 1.0f));
            }
            int m1078a5 = gameEngine.m1078a(40) + (m1078a4 * size);
            int m1078a6 = gameEngine.m1078a(140);
            if (c0825g.f5263b) {
                m1078a6 += gameEngine.m1078a(50);
            }
            if (c0825g.f5264c) {
                m1078a5 = (int) C0773f.m2125f(m1078a5, gameEngine.f6417cF * 0.9f, f2);
                m1078a6 = (int) C0773f.m2125f(m1078a6, gameEngine.f6419cH * 0.9f, f2);
            }
            float f3 = gameEngine.f6401cp - (m1078a6 / 2);
            if (!c0825g.f5264c) {
                f3 = C0773f.m2125f(f3, f3 / 2.0f, 1.0f - f2);
            }
            if (f3 < 20.0f) {
                f3 = 20.0f;
            }
            this.f5246g.f231b = (int) f3;
            this.f5246g.f233d = this.f5246g.f231b + m1078a6;
            this.f5246g.f230a = (int) ((gameEngine.f6417cF / 2.0f) - (m1078a5 / 2));
            this.f5246g.f232c = (int) ((gameEngine.f6417cF / 2.0f) + (m1078a5 / 2));
            this.f5252m.m5165a(this.f5246g);
            if (this.f5252m.m5163b((int) c0825g.f5287z, (int) c0825g.f5288A)) {
                this.f5253n = c0825g.f5308U;
                c0825g.f5308U = false;
                this.f5254o = c0825g.f5296I;
                c0825g.f5296I = false;
            }
            c0825g.m1883a(this.f5252m);
        }
    }

    /* renamed from: b */
    public void m1917b(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0825g c0825g = gameEngine.f6378bS;
        boolean m1918b = m1918b();
        if (!gameEngine.f6454dq) {
            this.f5241b = false;
        } else if (!this.f5241b) {
            this.f5241b = true;
            if (!gameEngine.f6299ar && gameEngine.settingsEngine.numberOfWins >= 5 && !gameEngine.settingsEngine.rateGameShown && GameEngine.f6302au) {
                this.f5258s = true;
                gameEngine.settingsEngine.rateGameShown = true;
                gameEngine.settingsEngine.save();
            }
        }
        if (!m1918b) {
            this.f5242c = 0.0f;
        }
        if (m1918b && !c0825g.f5282u) {
            this.f5242c += f;
            if (gameEngine.tick < 120) {
                this.f5242c = 100000.0f;
            }
            if (this.f5253n) {
                c0825g.f5308U = true;
            }
            if (this.f5254o) {
                c0825g.f5296I = true;
            }
            boolean z = this.f5242c > 80.0f;
            boolean z2 = this.f5242c > 100.0f;
            boolean z3 = this.f5242c > 110.0f;
            int m1078a = gameEngine.m1078a(this.f5249j);
            int m1078a2 = gameEngine.m1078a(this.f5250k);
            int m1078a3 = m1078a + gameEngine.m1078a(this.f5251l);
            int m1078a4 = m1078a2 + gameEngine.m1078a(this.f5251l);
            int size = this.f5248i.size();
            int i = (int) ((gameEngine.f6417cF / 2.0f) - (((m1078a2 * size) + ((size - 1) * m1078a3)) / 2));
            float f2 = 0.0f;
            if (c0825g.f5264c) {
                f2 = C0773f.m2113i(C0773f.m2171b(c0825g.f5265d, 0.0f, 1.0f)) >= 1.0f ? 1.0f : 0.0f;
            }
            if (z) {
                float f3 = c0825g.f5385bt.f5087g;
                c0825g.f5385bt.f5087g = f2;
                c0825g.f5385bt.m2026c(gameEngine.f6374bO, this.f5252m);
                c0825g.f5385bt.f5087g = f3;
            }
            int m1078a5 = this.f5252m.f231b + gameEngine.m1078a(40);
            int i2 = (int) (gameEngine.f6417cF / 2.0f);
            int m1078a6 = this.f5252m.f233d - gameEngine.m1078a(45);
            int m5237a = Color.m5237a(140, 100, 100, 100);
            Paint paint = this.f5240a;
            String str = "Victory!";
            if (gameEngine.f6457dt) {
                str = "Defeat";
            }
            float f4 = 1.0f;
            if (this.f5242c < 95.0f) {
                f4 = this.f5242c / 95.0f;
            }
            int m2107k = (int) (m1078a5 - (C0773f.m2107k(f4 * 90.0f) * 100.0f));
            paint.m5208a(str, 0, str.length(), this.f5244e);
            gameEngine.f6374bO.mo182a(str, i2, m2107k - ((paint.m5179l() + paint.m5178m()) / 2.0f), paint);
            if (this.f5242c < 100.0f && !gameEngine.f6457dt) {
                this.f5243d += f;
                if (this.f5243d > 0.5f) {
                    this.f5243d = 0.0f;
                    gameEngine.f6377bR.m2364b(EnumC0763h.critical);
                    gameEngine.f6377bR.m2372b();
                    C0760e m2366b = gameEngine.f6377bR.m2366b(0.0f, 0.0f, 0.0f, Color.m5237a(255, C0773f.rand(0, 255), C0773f.rand(0, 255), C0773f.rand(0, 255)));
                    if (m2366b != null) {
                        m2366b.f4869ar = (short) 4;
                        m2366b.f4834I = i2 + C0773f.m2151c(-70.0f, 70.0f);
                        m2366b.f4835J = m2107k + C0773f.m2151c(-15.0f, 15.0f);
                        m2366b.f4835J += gameEngine.f6401cp / 2.0f;
                        m2366b.f4836K += gameEngine.f6401cp / 2.0f;
                        m2366b.f4847V = C0773f.m2151c(140.0f, 380.0f);
                        m2366b.f4848W = m2366b.f4847V;
                        m2366b.f4817r = true;
                        m2366b.f4818s = true;
                        m2366b.f4819t = 5.0f;
                        m2366b.f4830E = 2.0f;
                        m2366b.f4842Q = C0773f.m2151c(-2.7f, 2.7f);
                        m2366b.f4841P = C0773f.m2151c(-12.7f, 12.7f);
                        m2366b.f4832G = 0.4f;
                        m2366b.f4831F = 0.2f;
                        m2366b.f4843R = C0773f.m2151c(2.0f, 4.0f);
                        m2366b.f4822w = 2.0f;
                        m2366b.f4821v = true;
                        m2366b.f4815p = true;
                    }
                }
            }
            int i3 = m2107k + 60;
            if (z3) {
                Rect rect = this.f5244e;
                Rect rect2 = this.f5245f;
                rect.m5166a(this.f5252m.f230a + gameEngine.m1078a(10), this.f5252m.f231b + gameEngine.m1078a(60), this.f5252m.f232c - gameEngine.m1078a(10), m1078a6 - gameEngine.m1078a(10));
                rect2.m5165a(rect);
                if (!c0825g.f5264c) {
                    rect.f231b = this.f5252m.f233d + gameEngine.m1078a(15);
                    rect.f233d = rect.f231b + gameEngine.m1078a(200);
                }
                boolean z4 = c0825g.f5265d >= 1.0f;
                if (this.f5247h != null) {
                    this.f5247h.m1742a(rect, rect2, f, z4, c0825g.f5263b);
                }
            }
            for (int i4 = 0; i4 < this.f5248i.size(); i4++) {
                if (z2) {
                    AbstractC0818b abstractC0818b = (AbstractC0818b) this.f5248i.get(i4);
                    if (c0825g.m1886a(i, m1078a6, m1078a2, m1078a, abstractC0818b.m1932a(), EnumC0827i.none, false, m5237a, c0825g.f5343aD, (C0784h) c0825g.f5383br)) {
                        this.f5258s = false;
                        abstractC0818b.mo1914b();
                    }
                }
                i += m1078a3 + m1078a2;
            }
            if (this.f5258s) {
                m1915c(f);
            }
            if (this.f5252m.m5163b((int) c0825g.f5287z, (int) c0825g.f5288A)) {
            }
            c0825g.m1883a(this.f5252m);
        }
    }

    /* renamed from: c */
    void m1915c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0825g c0825g = gameEngine.f6378bS;
        int m1078a = gameEngine.m1078a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((gameEngine.f6417cF / 2.0f) - (m1078a / 2));
        int m1078a2 = gameEngine.m1078a(120);
        int i2 = (int) (gameEngine.f6419cH - m1078a2);
        this.f5246g.m5166a(i, i2, m1078a, m1078a2);
        gameEngine.f6374bO.mo163b(this.f5246g, c0825g.f5355aP);
        int i3 = i + (m1078a / 2);
        Paint paint = this.f5240a;
        String str = f5255p;
        paint.m5208a(str, 0, str.length(), this.f5244e);
        gameEngine.f6374bO.mo182a(str, i3, i2 - ((paint.m5179l() + paint.m5178m()) / 2.0f), paint);
        int m5160c = i2 + this.f5244e.m5160c();
        int m1078a3 = gameEngine.m1078a(70);
        int m1078a4 = gameEngine.m1078a(30);
        int m1078a5 = ((i + (m1078a / 2)) - gameEngine.m1078a(10)) - m1078a3;
        int m5237a = Color.m5237a(140, 100, 100, 100);
        if (c0825g.m1886a(m1078a5, m5160c, m1078a3, m1078a4, f5256q, EnumC0827i.none, false, m5237a, c0825g.f5343aD, (C0784h) null)) {
            this.f5258s = false;
            InterfaceC0096f interfaceC0096f = gameEngine.f6296ao;
            if (interfaceC0096f == null) {
                GameEngine.print("showRateNow: gameView==null");
                return;
            }
            ActivityC0097g mo243i = interfaceC0096f.mo243i();
            if (mo243i == null) {
                GameEngine.print("showRateNow: inGameActivity==null");
                return;
            }
            mo243i.m4916l();
        }
        if (c0825g.m1886a(i + (m1078a / 2) + gameEngine.m1078a(10), m5160c, m1078a3, m1078a4, f5257r, EnumC0827i.none, false, m5237a, c0825g.f5343aD, (C0784h) null)) {
            this.f5258s = false;
        }
    }

    /* renamed from: c */
    public void m1916c() {
        this.f5247h = C0844y.m1744a();
    }
}
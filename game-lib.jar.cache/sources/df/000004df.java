package com.corrodinggames.rts.gameFramework.Interface;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.d;
import com.corrodinggames.rts.game.units.a.f;
import com.corrodinggames.rts.game.units.a.g;
import com.corrodinggames.rts.game.units.a.i;
import com.corrodinggames.rts.game.units.a.j;
import com.corrodinggames.rts.game.units.a.q;
import com.corrodinggames.rts.game.units.a.r;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.aq;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.h;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.a.a;
import com.corrodinggames.rts.gameFramework.Interface.a.c;
import com.corrodinggames.rts.gameFramework.Interface.a.l;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.ac;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.mod.b;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.u;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/g.class */
public final class InterfaceEngine extends bq {
    h f;
    public a g;
    public m h;
    public ap i;
    public k j;
    public f k;
    double v;
    boolean C;
    boolean D;
    float E;
    public float F;
    public float G;
    public am W;
    public float X;
    public int Y;
    public float Z;
    public am aa;
    public s ac;
    public int ad;
    public boolean ae;
    public float af;
    public float ag;
    public float ah;
    public boolean ai;
    public float aj;
    public float ak;
    public float al;
    public float am;
    public float an;
    public float ao;
    public boolean ap;
    public float aq;
    public float ar;
    public int as;
    public Paint au;
    public Paint av;
    public Paint aw;
    public Paint ax;
    public Paint ay;
    public Paint az;
    public Paint aA;
    public Paint aB;
    public Paint aC;
    public Paint aD;
    public Paint aE;
    public Paint aF;
    public Paint aG;
    public Paint aH;
    public Paint aI;
    public Paint aJ;
    Paint aK;
    Paint aL;
    Paint aM;
    Paint aN;
    Paint aO;
    Paint aP;
    ag aQ;
    ag aR;
    ag aS;
    public float aT;
    int aX;
    public boolean aZ;
    boolean bd;
    float be;
    Paint bf;
    Paint bg;
    public e bn;
    public e bo;
    com.corrodinggames.rts.gameFramework.Interface.a.e bp;
    com.corrodinggames.rts.gameFramework.Interface.a.e bq;
    com.corrodinggames.rts.gameFramework.Interface.a.e br;
    com.corrodinggames.rts.gameFramework.Interface.a.e bs;
    com.corrodinggames.rts.gameFramework.Interface.a.e bt;
    com.corrodinggames.rts.gameFramework.Interface.a.e bu;
    String bG;
    String bH;
    bb bI;
    String bJ;
    String bK;
    String bL;
    private int cf;
    private int cg;
    private int ch;
    private float ci;
    private int cj;
    private int ck;
    private int cl;
    public static boolean bR;
    long bW;
    boolean bX;
    public static am ca;
    static boolean ce;
    public static boolean a = false;
    public static boolean bO = false;
    public static boolean bP = false;
    public static boolean bQ = false;
    static int cd = 1;
    public boolean b = true;
    public boolean c = false;
    public float d = 0.0f;
    public boolean e = false;
    com.corrodinggames.rts.game.units.a.e l = new com.corrodinggames.rts.game.units.a.e();
    f m = new f();
    i n = new i();
    d o = new d();
    public j p = new j();
    r q = new r();
    q r = new q();
    l s = new a();
    boolean t = false;
    public boolean u = false;
    float w = 0.0f;
    public float x = 0.0f;
    public float y = 0.0f;
    float z = 40.0f;
    float A = 40.0f;
    int B = 0;
    boolean H = false;
    boolean I = false;
    boolean J = false;
    boolean K = false;
    boolean L = false;
    boolean M = false;
    float N = 0.0f;
    float O = 0.0f;
    float P = 0.0f;
    float Q = 0.0f;
    float R = 0.0f;
    float S = 0.0f;
    boolean T = false;
    boolean U = false;
    boolean V = false;
    public final boolean ab = true;
    public final Paint at = new Paint();
    public float aU = 0.0f;
    public float aV = 0.0f;
    public float aW = 0.0f;
    public float aY = 0.0f;
    e ba = null;
    e bb = null;
    e bc = null;
    e bh = null;
    e bi = null;
    public e bj = null;
    public e bk = null;
    public e bl = null;
    e bm = null;
    final Rect bv = new Rect();
    final Rect bw = new Rect();
    final Rect bx = new Rect();
    final Rect by = new Rect();
    final Rect bz = new Rect();
    final Paint bA = new Paint();
    final Paint bB = new Paint();
    final Paint bC = new ag();
    public final Paint bD = new ag();
    final Paint bE = new ag();
    final Paint bF = new Paint();
    public ArrayList bM = new ArrayList();
    public boolean bN = false;
    c bS = c.b(-1, -1);
    com.corrodinggames.rts.game.units.custom.e.f bT = new com.corrodinggames.rts.game.units.custom.e.f();
    long bU = -1;
    long bV = -1;
    public u bY = new u();
    public u bZ = new u();
    Paint cb = new Paint();
    Rect cc = new Rect();

    public boolean a() {
        if (GameEngine.aw()) {
            return false;
        }
        return GameEngine.getGameEngine().settingsEngine.useCircleSelect;
    }

    float b() {
        return Math.min(this.w * 2.5f, 290.0f) + 10.0f;
    }

    float c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = 0.7f;
        if (GameEngine.av()) {
            f = 0.9f;
        }
        if (gameEngine.cX < 1.0f) {
            float f2 = gameEngine.cX;
            if (f2 < 0.4d) {
                f2 = 0.4f;
            }
            f *= f2;
        }
        return f;
    }

    public void a(String str, int i) {
        this.g.a(str, i);
    }

    public void b(String str, int i) {
        this.g.b(str, i);
    }

    public void a(String str) {
        this.g.a(str);
    }

    public void b(String str) {
        this.g.a(str, 100);
    }

    public void c(String str) {
        this.g.a(str, 50);
    }

    public void d(String str) {
        this.g.a(str, 5);
    }

    public void d() {
        this.U = false;
        this.V = false;
        this.I = false;
    }

    public boolean a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!bO || this.g.ap) {
            return f < gameEngine.cl - gameEngine.cq;
        } else if (gameEngine.bW.c(f, f2) != null) {
            return false;
        } else {
            return true;
        }
    }

    public void e() {
        if (this.g != null) {
            this.g.a();
        }
    }

    public void a(boolean z) {
        if (z) {
            this.g.j();
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.g.k();
        l();
        this.u = false;
        this.c = false;
        this.d = 0.0f;
        this.bM.clear();
        if (!z) {
            gameEngine.bt = 1.0f;
            gameEngine.bw = false;
            gameEngine.bv = false;
            gameEngine.bl = false;
            gameEngine.bn = false;
        }
        if (gameEngine.N() && gameEngine.P()) {
            gameEngine.bv = gameEngine.netEngine.p;
        }
        an.a();
        K();
    }

    public void f() {
        bO = false;
        bP = false;
        bQ = false;
        if (GameEngine.av()) {
            bO = true;
            bP = true;
            a = true;
            bQ = true;
        }
        if (GameEngine.aY) {
            bO = true;
            bP = true;
            bQ = true;
        }
        if (GameEngine.at() && !GameEngine.getGameEngine().settingsEngine.classicInterface) {
            bO = true;
            bP = true;
            bQ = true;
        }
    }

    public void a(Context context) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.C()) {
            this.bN = true;
        }
        f();
        this.bG = com.corrodinggames.rts.gameFramework.translations.a.a("gui.notAvailableInDemoText", new Object[0]);
        this.bH = "Locked";
        this.bI = bb.b("gui.notEnoughResources");
        this.bJ = com.corrodinggames.rts.gameFramework.translations.a.a("gui.cannotPlace.general", new Object[0]);
        this.bK = com.corrodinggames.rts.gameFramework.translations.a.a("gui.cannotPlace.needsResourcePool", new Object[0]);
        this.bL = com.corrodinggames.rts.gameFramework.translations.a.a("gui.cannotPlace.needsWater", new Object[0]);
        this.g = new a(gameEngine, this);
        e();
        this.h = new m(gameEngine, this);
        this.i = new ap(gameEngine);
        this.j = new k(gameEngine, this);
        this.k = new f();
        if (GameEngine.au()) {
            this.b = true;
        }
        this.ba = gameEngine.bO.a(AssetsID.drawable.button_no);
        this.bb = gameEngine.bO.a(AssetsID.drawable.button_yes);
        this.bc = gameEngine.bO.a(AssetsID.drawable.button_more);
        this.bf = new Paint();
        this.bf.d(true);
        this.bg = new Paint();
        this.bg.d(true);
        this.bg.a(40, 255, 255, 255);
        this.bh = gameEngine.bO.a(AssetsID.drawable.button_add);
        this.bi = gameEngine.bO.a(AssetsID.drawable.button_subtract);
        this.bj = gameEngine.bO.a(AssetsID.drawable.icon_rally);
        this.bn = gameEngine.bO.a(AssetsID.drawable.rounded_glow_button);
        this.bo = gameEngine.bO.a(AssetsID.drawable.rounded_white_button);
        this.bp = new com.corrodinggames.rts.gameFramework.Interface.a.e(this.bn, 32, 27);
        this.bq = new com.corrodinggames.rts.gameFramework.Interface.a.e(gameEngine.bO.a(AssetsID.drawable.rounded_glow_highlight_button), 32, 27);
        this.br = this.bp.clone();
        this.br.v = this.bq;
        this.bs = new com.corrodinggames.rts.gameFramework.Interface.a.e(gameEngine.bO.a(AssetsID.drawable.rounded_dark_box), 32, 27);
        this.bt = new com.corrodinggames.rts.gameFramework.Interface.a.e(gameEngine.bO.a(AssetsID.drawable.rounded_dark_box_titled), 36, 36);
        this.bt.r = new com.corrodinggames.rts.gameFramework.Interface.a.e(gameEngine.bO.a(AssetsID.drawable.rounded_shadow), 36, 36);
        this.bt.f = true;
        this.bu = new com.corrodinggames.rts.gameFramework.Interface.a.e(gameEngine.bO.a(AssetsID.drawable.rounded_green), 36, 36);
        this.bu.r = this.bt.r;
        this.bu.u = 20;
        this.bk = gameEngine.bO.a(AssetsID.drawable.icon_upgrade);
        this.bl = gameEngine.bO.a(AssetsID.drawable.metal_dark, false);
        this.bm = gameEngine.bO.a(AssetsID.drawable.touch_indicator, false);
        com.corrodinggames.rts.gameFramework.Interface.a.h.b();
        this.bE.a(145, 0, 175, 0);
        this.bE.a(6.0f);
        ag.b(this.bE);
        this.bD.a(true);
        this.au = new Paint();
        this.av = new ag();
        this.av.a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.av.a(true);
        this.av.c(true);
        this.av.a(Typeface.a(Typeface.c, 1));
        gameEngine.a(this.av, 20.0f);
        this.av.a(Paint.Align.LEFT);
        this.ay = new ag();
        this.ay.a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.ay.a(true);
        this.ay.c(true);
        this.ay.a(Typeface.a(Typeface.c, 1));
        gameEngine.a(this.ay, 18.0f);
        this.ay.a(Paint.Align.LEFT);
        this.aw = new ag();
        this.aw.a(this.av);
        this.aw.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.ax = new ag();
        this.ax.b(Color.a(100, 0, 0, 0));
        this.ax.a(Paint.Style.FILL_AND_STROKE);
        this.az = new ag();
        this.az.a(100, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.az.a(Paint.Align.LEFT);
        this.az.c(true);
        this.az.a(true);
        gameEngine.a(this.az, 12.0f);
        ag.b(this.az);
        this.aC = new ag();
        if (this.bN) {
            this.aC.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.aC.a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.aC.a(Paint.Align.CENTER);
        this.aC.c(true);
        this.aC.a(true);
        gameEngine.a(this.aC, 12.0f);
        ag.b(this.aC);
        GameEngine.m5e("smallTextPaint size: " + this.aC.k());
        this.aB = new ag();
        this.aB.a(this.aC);
        gameEngine.a(this.aB, 10.0f);
        ag.b(this.aB);
        this.aA = new ag();
        this.aA.a(this.aC);
        gameEngine.a(this.aA, 8.0f);
        ag.b(this.aA);
        this.aD = new ag();
        if (this.bN) {
            this.aD.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.aD.a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.aD.a(Paint.Align.CENTER);
        this.aD.c(true);
        this.aD.a(true);
        gameEngine.a(this.aD, 20.0f);
        ag.b(this.aD);
        this.aE = new ag();
        this.aE.a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.aE.a(Paint.Align.CENTER);
        this.aE.c(true);
        this.aE.a(true);
        gameEngine.a(this.aE, 20.0f);
        ag.b(this.aE);
        this.aI = new ag();
        this.aI.a(150, 20, 20, 20);
        gameEngine.a(this.aI);
        ag.b(this.aI);
        this.aF = new ag();
        this.aF.a(this.aD);
        this.aF.a(255, 128, 0, 0);
        gameEngine.a(this.aF, 14.0f);
        this.aF.a(Paint.Align.CENTER);
        ag.b(this.aF);
        this.aG = new ag();
        this.aG.a(this.aF);
        this.aG.a(255, 220, 222, 49);
        this.aH = new ag();
        this.aH.a(this.aD);
        gameEngine.a(this.aH, 12.0f);
        this.aH.a(125, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.aH.a(Paint.Align.CENTER);
        ag.b(this.aH);
        this.aQ = new ag();
        this.aQ.b(-16777216);
        this.aQ.a(true);
        this.aQ.c(true);
        this.aQ.a(Typeface.a(Typeface.c, 0));
        gameEngine.a(this.aQ, 14.0f);
        this.aR = new ag();
        this.aR.a(this.aQ);
        this.aR.a(Typeface.a(Typeface.c, 1));
        gameEngine.a(this.aR, 16.0f);
        this.aS = new ag();
        this.aS.a(this.aR);
        this.aS.b(Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 63, 80));
        gameEngine.a(this.aS, 16.0f);
        this.aK = new ag();
        this.aK.b(-16777216);
        this.aK.a(Paint.Align.CENTER);
        this.aK.a(true);
        this.aK.c(true);
        this.aK.a(Typeface.a(Typeface.c, 0));
        gameEngine.a(this.aK, 20.0f);
        this.aL = new ag();
        this.aL.b(-1);
        this.aL.c(160);
        if (GameEngine.av()) {
            this.aL.c(140);
        }
        gameEngine.a(this.aL);
        this.aM = new ag();
        this.aM.b(-16777216);
        this.aM.c(210);
        gameEngine.a(this.aM);
        this.aP = new ag();
        this.aP.b(-7829368);
        this.aP.c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.aP.a(Paint.Style.STROKE);
        this.aP.a(1.0f);
        gameEngine.a(this.aP);
        this.aN = new ag();
        this.aN.b(-16711936);
        this.aN.c(80);
        this.aN.a(Paint.Style.FILL);
        this.aN.a(4.0f);
        gameEngine.a(this.aN);
        this.aO = new ag();
        this.aO.b(Color.a(120, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 167, 49));
        this.aO.a(Paint.Style.FILL);
        this.aO.a(8.0f);
        gameEngine.a(this.aO);
        this.aJ = new ag();
        this.aJ.c(true);
        this.aJ.a(true);
        gameEngine.a(this.aJ, 12.0f);
        ag.b(this.aJ);
    }

    public void g() {
        this.h.b();
        this.i.b();
        this.bX = false;
    }

    public void a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.v += f;
        this.aU = com.corrodinggames.rts.gameFramework.f.a(this.aU, f);
        this.aV = com.corrodinggames.rts.gameFramework.f.a(this.aV, f);
        this.aY = com.corrodinggames.rts.gameFramework.f.a(this.aY, 0.08f * f);
        this.aW = com.corrodinggames.rts.gameFramework.f.a(this.aW, f);
        this.E += f;
        this.aT += 0.05f * f;
        if (this.aT > 1.0f) {
            this.aT -= 1.0f;
            if (this.aT > 1.0f) {
                this.aT = 0.0f;
            }
        }
        gameEngine.dx = 4.0f * this.aY;
        float f2 = 1.0f * f;
        if (!this.I) {
            float f3 = this.R * f;
            float f4 = this.S * f;
            float g = com.corrodinggames.rts.gameFramework.f.g(80.0f, f3);
            float g2 = com.corrodinggames.rts.gameFramework.f.g(80.0f, f4);
            gameEngine.cy += g;
            gameEngine.cz += g2;
        } else {
            f2 *= 4.0f;
        }
        float b = com.corrodinggames.rts.gameFramework.f.b(0.0f, 0.0f, this.R, this.S);
        float d = com.corrodinggames.rts.gameFramework.f.d(0.0f, 0.0f, this.R, this.S);
        if (b > 30.0f) {
            b = 30.0f;
        }
        float a2 = com.corrodinggames.rts.gameFramework.f.a(b, f2);
        this.R = com.corrodinggames.rts.gameFramework.f.k(d) * a2;
        this.S = com.corrodinggames.rts.gameFramework.f.j(d) * a2;
        this.aZ = false;
        this.I = gameEngine.ac() && gameEngine.dM[0] && this.aU == 0.0f;
        if (this.aV != 0.0f) {
            if (!this.I) {
                this.aV = 0.0f;
            }
            this.I = false;
            this.H = false;
        }
        boolean z = false;
        if (this.aW > 0.0f) {
            z = true;
        }
        if (gameEngine.ac() && gameEngine.ae() > 1) {
            z = true;
            this.aW = 4.0f;
        }
        if (z) {
            this.I = false;
            this.H = false;
            this.T = false;
            this.w = 0.0f;
        }
        this.M = false;
        this.L = gameEngine.af() > gameEngine.cF;
        this.U = !this.I && this.H;
        this.V = this.I && !this.H;
        if (GameEngine.av() && gameEngine.settingsEngine.mouseSupport) {
            this.z = gameEngine.af();
            this.A = gameEngine.ag();
        }
        if (!this.I && !this.U) {
            this.D = false;
        }
        if (this.I) {
            this.w += f;
            this.x = gameEngine.b(0);
            this.y = gameEngine.c(0);
            this.z = this.x;
            this.A = this.y;
            this.B = gameEngine.d(0);
            this.C = a(this.x, this.y);
            boolean z2 = false;
            if (this.C && !this.H) {
                if (this.E < 30.0f) {
                    float a3 = com.corrodinggames.rts.gameFramework.f.a(this.F, this.G, this.x, this.y);
                    float f5 = 10.0f * gameEngine.cj;
                    if (GameEngine.au()) {
                        f5 = (float) (f5 * 1.5d);
                    }
                    if (a3 < f5 * f5) {
                        z2 = true;
                    }
                }
                this.E = 0.0f;
                this.F = this.x;
                this.G = this.y;
            }
            if (z2) {
                this.D = true;
            }
            if (!this.H) {
                this.T = false;
                this.N = this.x;
                this.O = this.y;
                this.P = this.x;
                this.Q = this.y;
                this.J = gameEngine.bW.c(this.x, this.y) != null;
                this.K = false;
                if (!this.J) {
                    this.K = this.x > gameEngine.cF;
                }
            }
            this.H = true;
        }
        if (this.I && (this.w <= 20.0f || !a())) {
            float a4 = com.corrodinggames.rts.gameFramework.f.a(this.N, this.O, this.x, this.y);
            if (!this.J) {
                float f6 = 30.0f * gameEngine.cj;
                if (GameEngine.av() && gameEngine.settingsEngine.mouseSupport && gameEngine.e(3)) {
                    f6 = 0.0f;
                }
                if (!this.T && a4 > f6 * f6) {
                    boolean z3 = false;
                    int i = 1;
                    if (gameEngine.settingsEngine.mouseOrders == 2) {
                        i = 2;
                    }
                    if ((!gameEngine.settingsEngine.mouseSupport || this.B != i) && !c(gameEngine)) {
                        z3 = true;
                    }
                    if (z3) {
                        this.T = true;
                    }
                    this.P = this.x;
                    this.Q = this.y;
                }
            }
        }
        if (GameEngine.av() && !gameEngine.aq && gameEngine.ao != null && ((gameEngine.ao.f() || GameEngine.aR) && (!this.I || this.g.c))) {
            float f7 = (24.0f * gameEngine.settingsEngine.edgeScrollSpeed) / gameEngine.cX;
            float f8 = gameEngine.cy;
            float f9 = gameEngine.cz;
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.z <= 1.0f) {
                f10 = 0.0f - (f7 * f);
            }
            if (this.z >= gameEngine.cl - 1.0f) {
                f10 += f7 * f;
            }
            if (this.A <= 1.0f) {
                f11 = 0.0f - (f7 * f);
            }
            if (this.A >= gameEngine.cm - 1.0f) {
                f11 += f7 * f;
            }
            gameEngine.cy += f10;
            gameEngine.cz += f11;
            gameEngine.Q();
            this.g.y.a -= (gameEngine.cy - f8) * gameEngine.cX;
            this.g.y.b -= (gameEngine.cz - f9) * gameEngine.cX;
        }
        ac acVar = gameEngine.bT;
        if (gameEngine.settingsEngine.keyboardSupport) {
            if (gameEngine.E()) {
                float f12 = 12.0f * gameEngine.settingsEngine.scrollSpeed;
                if (acVar.p.b()) {
                    gameEngine.cy -= f12 * f;
                }
                if (acVar.q.b()) {
                    gameEngine.cy += f12 * f;
                }
                if (acVar.n.b()) {
                    gameEngine.cz -= f12 * f;
                }
                if (acVar.o.b()) {
                    gameEngine.cz += f12 * f;
                }
                if (acVar.r.b()) {
                    gameEngine.cV += 0.1f;
                }
                if (acVar.s.b()) {
                    gameEngine.cV -= 0.1f;
                }
            }
            if (acVar.y.a()) {
                l();
                y();
            }
            if (acVar.z.a()) {
                this.i.d();
            }
            if (acVar.A.a()) {
                l();
                y();
                Iterator it = w.er.iterator();
                while (it.hasNext()) {
                    w wVar = (w) it.next();
                    if (wVar instanceof y) {
                        y yVar = (y) wVar;
                        if (!yVar.bV && yVar.bX == gameEngine.playerTeam && yVar.l() && !yVar.ak() && yVar.aS() && yVar.cN == null) {
                            j(yVar);
                        }
                    }
                }
            }
            if (acVar.B.a()) {
                l();
                y();
                Iterator it2 = w.er.iterator();
                while (it2.hasNext()) {
                    w wVar2 = (w) it2.next();
                    if (wVar2 instanceof y) {
                        y yVar2 = (y) wVar2;
                        if (yVar2.bX == gameEngine.playerTeam && yVar2.mo1r() == ar.commandCenter && !yVar2.bV && yVar2.cN == null) {
                            j(yVar2);
                            gameEngine.b(yVar2.eo, yVar2.ep);
                        }
                    }
                }
            }
            if (acVar.C.a()) {
                al.a(this.bM, al.a, al.b);
            }
            if (acVar.D.a()) {
                al.a(this.bM, al.c, null);
            }
            if (acVar.E.a()) {
                al.a(this.bM, al.d, null);
            }
            if (acVar.F.a()) {
                al.a(this.bM, al.e, null);
            }
            if (acVar.G.a()) {
                al.a(this.bM, al.f, null);
            }
            if (acVar.x.a()) {
                this.g.a(12);
            }
            if (acVar.N.a() && B() && C()) {
                l();
                this.aa = null;
                this.ac = this.l;
                return;
            } else if (acVar.P.a() && A()) {
                l();
                this.aa = null;
                this.ac = this.m;
                return;
            } else if (acVar.Q.a() && C()) {
                l();
                this.aa = null;
                this.ac = this.n;
                return;
            } else {
                if (acVar.O.a()) {
                    v();
                }
                if (acVar.v.a()) {
                    I();
                }
                if (acVar.t.a() && gameEngine.N()) {
                    GameEngine.m5e("showing send chat");
                    this.g.a(13);
                }
                if (acVar.u.a() && gameEngine.N()) {
                    GameEngine.m5e("showing send team chat");
                    this.g.a(16);
                }
                if (gameEngine.P() || gameEngine.replayEngine.j()) {
                    if (acVar.L.a()) {
                        if (gameEngine.bt != 0.0f) {
                            if (!gameEngine.replayEngine.j()) {
                                GameNetEngine.a((String) null, "Game paused");
                            }
                            gameEngine.bt = 0.0f;
                        } else {
                            gameEngine.bt = 1.0f;
                        }
                    }
                    boolean a5 = acVar.J.a();
                    boolean a6 = acVar.K.a();
                    if (a5 || a6) {
                        if (a5) {
                            boolean z4 = gameEngine.bt > 1.0f;
                            if (gameEngine.bt < 2.0f) {
                                gameEngine.bt = (float) (gameEngine.bt - 0.25d);
                            } else if (gameEngine.bt < 6.0f) {
                                gameEngine.bt = (float) (gameEngine.bt - 0.5d);
                            } else if (gameEngine.bt < 16.0f) {
                                gameEngine.bt -= 2.0f;
                            } else {
                                gameEngine.bt -= 4.0f;
                            }
                            if (gameEngine.bt < 0.0f) {
                                gameEngine.bt = 0.0f;
                            }
                            if (z4 && gameEngine.bt < 1.0f) {
                                gameEngine.bt = 1.0f;
                            }
                        } else if (a6) {
                            boolean z5 = gameEngine.bt < 1.0f;
                            if (gameEngine.bt < 2.0f) {
                                gameEngine.bt = (float) (gameEngine.bt + 0.25d);
                            } else if (gameEngine.bt < 6.0f) {
                                gameEngine.bt = (float) (gameEngine.bt + 0.5d);
                            } else if (gameEngine.bt < 16.0f) {
                                gameEngine.bt += 2.0f;
                            } else {
                                gameEngine.bt += 4.0f;
                            }
                            if (gameEngine.replayEngine.j()) {
                                if (gameEngine.bt > 64.0f) {
                                    gameEngine.bt = 64.0f;
                                }
                            } else if (gameEngine.bt > 5.0f) {
                                gameEngine.bt = 5.0f;
                            }
                            if (z5 && gameEngine.bt > 1.0f) {
                                gameEngine.bt = 1.0f;
                            }
                        }
                        if (!gameEngine.replayEngine.j()) {
                            GameNetEngine.a((String) null, "Game speed now: " + gameEngine.bt);
                        }
                    }
                } else if (acVar.L.a() && gameEngine.netEngine.isServer && gameEngine.netEngine.aW) {
                    gameEngine.netEngine.e(!gameEngine.netEngine.al);
                }
                gameEngine.cT = com.corrodinggames.rts.gameFramework.f.a(gameEngine.cT, f);
                if (acVar.Y.a()) {
                    gameEngine.cT = 180.0f;
                }
                if (gameEngine.bv && acVar.ab.a()) {
                    gameEngine.bl = !gameEngine.bl;
                    GameEngine.m5e("debugTempMode now: " + gameEngine.bl);
                    b("debug: " + gameEngine.bl);
                }
                if (gameEngine.bv && gameEngine.bl && acVar.ac.a()) {
                    com.corrodinggames.rts.game.a.a.as = !com.corrodinggames.rts.game.a.a.as;
                    b("AI debug view: " + com.corrodinggames.rts.game.a.a.as);
                }
                if (gameEngine.bv && gameEngine.bl && acVar.ad.a()) {
                    com.corrodinggames.rts.gameFramework.status.f.a = !com.corrodinggames.rts.gameFramework.status.f.a;
                    b("Map debug: " + com.corrodinggames.rts.gameFramework.status.f.a);
                }
                if (gameEngine.P() || gameEngine.replayEngine.j()) {
                    if (gameEngine.bv) {
                        if (acVar.V.a()) {
                            gameEngine.bp = !gameEngine.bp;
                        }
                        if (acVar.W.a()) {
                            if (gameEngine.bt == 1.0f) {
                                gameEngine.bt = 0.1f;
                            } else {
                                gameEngine.bt = 1.0f;
                            }
                        }
                        if (acVar.X.a()) {
                            GameEngine.m5e("Adding test popup");
                            gameEngine.netEngine.U();
                        }
                        if (acVar.Z.a()) {
                            gameEngine.bw = !gameEngine.bw;
                        }
                        if (acVar.aa.a()) {
                            Iterator it3 = w.er.iterator();
                            while (it3.hasNext()) {
                                w wVar3 = (w) it3.next();
                                if (wVar3 instanceof y) {
                                    y yVar3 = (y) wVar3;
                                    if (yVar3.cG) {
                                        yVar3.U();
                                    }
                                }
                            }
                        }
                    }
                    if (acVar.U.a()) {
                        gameEngine.bv = !gameEngine.bv;
                        if (gameEngine.bv) {
                            y();
                        }
                    }
                }
            }
        }
        if (gameEngine.bv && !gameEngine.P() && !gameEngine.replayEngine.j()) {
            gameEngine.bv = false;
        }
        if (gameEngine.bv) {
            if (this.f != null && (this.f.ej || this.f.bV)) {
                this.f = null;
            }
            if (this.f == null) {
                GameEngine.m5e("Creating new debug editor");
                this.f = new h(false);
                this.f.b(gameEngine.playerTeam);
            }
            if (q() == 0) {
                y();
                j(this.f);
            }
            if (gameEngine.settingsEngine.liveReloading && gameEngine.tick % 100 == 0 && !gameEngine.replayEngine.i()) {
                com.corrodinggames.rts.game.units.custom.ag.c();
            }
        } else {
            if (this.f != null && (this.f.ej || this.f.bV)) {
                this.f = null;
            }
            if (this.f != null && !gameEngine.replayEngine.j()) {
                h();
            }
        }
        if (this.T) {
            if (this.K) {
                this.g.ao = this.Q - this.y;
            } else {
                int i2 = 1;
                if (gameEngine.settingsEngine.mouseOrders == 2) {
                    i2 = 2;
                }
                if ((!gameEngine.settingsEngine.mouseSupport || this.B != i2) && !c(gameEngine)) {
                    SettingsEngine settingsEngine = gameEngine.settingsEngine;
                    double d2 = this.P - this.x;
                    double d3 = this.Q - this.y;
                    float b2 = com.corrodinggames.rts.gameFramework.f.b(0.0f, 0.0f, (float) d2, (float) d3);
                    double d4 = (d2 * settingsEngine.scrollSpeed) / gameEngine.cX;
                    double d5 = (d3 * settingsEngine.scrollSpeed) / gameEngine.cX;
                    if (f != 0.0f && b2 > 50.0d * f) {
                        float f13 = 0.7f;
                        if (GameEngine.av()) {
                            f13 = 1.7f;
                        }
                        this.R = (float) (d4 * f13);
                        this.S = (float) (d5 * f13);
                    }
                    gameEngine.cy = (float) (gameEngine.cy + (d4 * 2.0d));
                    gameEngine.cz = (float) (gameEngine.cz + (d5 * 2.0d));
                }
            }
            this.P = this.x;
            this.Q = this.y;
        }
        if (gameEngine.settingsEngine.mouseSupport && (this.bS.a != ((int) gameEngine.af()) || this.bS.b != ((int) gameEngine.ag()))) {
            this.bS.a = (int) gameEngine.af();
            this.bS.b = (int) gameEngine.ag();
            this.s.b(this.bS);
        }
        if (this.U && J()) {
            this.s.b(c.a((int) this.z, (int) this.A));
        }
        this.s.b(f);
        this.k.a(f);
    }

    public void h() {
        if (this.f != null) {
            l(this.f);
            this.f.ci();
            this.f = null;
        }
    }

    public h i() {
        return this.f;
    }

    public void a(h hVar) {
        this.f = hVar;
    }

    public boolean a(GameEngine gameEngine) {
        if (!gameEngine.settingsEngine.keyboardSupport) {
            return false;
        }
        return gameEngine.c(59, 60);
    }

    public boolean b(GameEngine gameEngine) {
        if (!gameEngine.settingsEngine.keyboardSupport) {
            return false;
        }
        return gameEngine.c(113, 114);
    }

    public boolean c(GameEngine gameEngine) {
        if (!gameEngine.settingsEngine.keyboardSupport) {
            return false;
        }
        return gameEngine.c(57, 58);
    }

    public void b(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.Z += 0.2f * f;
        if (this.Z > 360.0f) {
            this.Z -= 360.0f;
        }
        this.bx.a((int) (gameEngine.cl - gameEngine.cq), 0, (int) gameEngine.cl, (int) gameEngine.cm);
        if (!bO) {
            if (this.bN) {
                this.bA.a();
                this.bA.b(Color.a(255, 33, 40, 52));
                this.bA.a(Paint.Style.FILL);
                gameEngine.bO.b(this.bx, this.bA);
            } else {
                gameEngine.bO.a(this.bl, this.bx, (Paint) null);
            }
            this.bA.a();
            this.bA.b(Color.a(255, 0, 0, 0));
            this.bA.a(Paint.Style.STROKE);
            gameEngine.bO.b(this.bx, this.bA);
        }
        this.cf = 0;
        this.ch = 0;
        this.cg = 0;
        this.ck = this.cl;
        this.cl = 0;
        if (gameEngine.replayEngine.j() || (gameEngine.playerTeam != null && gameEngine.playerTeam.b())) {
            y s = s();
            if (s != null) {
                a(gameEngine, s.bX, false, true);
            }
        } else {
            y t = t();
            if (gameEngine.playerTeam != null && gameEngine.playerTeam != PlayerData.i && !gameEngine.playerTeam.b() && !gameEngine.replayEngine.j()) {
                a(gameEngine, gameEngine.playerTeam, false, true);
            }
            if (t != null && gameEngine.playerTeam != t.bX && m(t)) {
                a(gameEngine, t.bX, true, true);
            }
        }
        if (gameEngine.bv && !gameEngine.replayEngine.j()) {
            String str = VariableScope.nullOrMissingString;
            if (gameEngine.bv) {
                str = str + "Editor Active\n";
            }
            if (gameEngine.bt != 1.0f) {
                str = str + "Game Speed: " + gameEngine.bt + "x\n";
            }
            if (gameEngine.bw) {
                str = str + "Invincible Units\n";
            }
            boolean z = false;
            Iterator it = PlayerData.c().iterator();
            while (it.hasNext()) {
                PlayerData playerData = (PlayerData) it.next();
                if (playerData instanceof com.corrodinggames.rts.game.a.a) {
                    z = ((com.corrodinggames.rts.game.a.a) playerData).bG > 0.0f;
                }
            }
            if (z) {
                str = str + "AIs frozen\n";
            }
            this.bA.a();
            this.bA.b(Color.a(0, 0, 0, 0));
            this.bA.a(Paint.Style.FILL);
            float f2 = 70.0f * gameEngine.cj;
            float f3 = 40.0f;
            if (gameEngine.cl < 600.0f && gameEngine.cm > 650.0f) {
                f2 = 10.0f;
                f3 = 60.0f * gameEngine.cj;
            }
            gameEngine.bO.a(str, f2, f3, this.ay, this.bA, 6.0f);
        }
        j();
        this.s.f();
    }

    public void j() {
        GameEngine.getGameEngine();
    }

    public void a(GameEngine gameEngine, PlayerData playerData, boolean z, boolean z2) {
        if (playerData.n) {
            a(gameEngine, playerData, z, com.corrodinggames.rts.game.units.custom.e.a.c.D, playerData.aa(), (com.corrodinggames.rts.game.units.custom.e.f) null, 0, (com.corrodinggames.rts.game.units.custom.e.a) null);
        }
        if (z2) {
            this.bT.g(playerData.ab());
            Iterator it = com.corrodinggames.rts.game.units.custom.e.a.f().iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.custom.e.a aVar = (com.corrodinggames.rts.game.units.custom.e.a) it.next();
                if (aVar.d() && (aVar.p || aVar.j)) {
                    this.bT.c(aVar);
                }
            }
            this.bT.e();
            a(gameEngine, playerData, z, this.bT);
        }
    }

    public void a(GameEngine gameEngine, PlayerData playerData, boolean z, com.corrodinggames.rts.game.units.custom.e.f fVar) {
        Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.e.e eVar = (com.corrodinggames.rts.game.units.custom.e.e) it.next();
            if (!eVar.a.a()) {
                a(gameEngine, playerData, z, eVar.a, eVar.b, fVar, 0, (com.corrodinggames.rts.game.units.custom.e.a) null);
            }
        }
    }

    public boolean a(GameEngine gameEngine, PlayerData playerData, boolean z, com.corrodinggames.rts.game.units.custom.e.a aVar, double d, com.corrodinggames.rts.game.units.custom.e.f fVar, int i, com.corrodinggames.rts.game.units.custom.e.a aVar2) {
        float f;
        float f2;
        com.corrodinggames.rts.game.units.custom.e.a aVar3;
        if (i == 0) {
            this.cj = 0;
        }
        boolean z2 = false;
        if (i < 6 && fVar != null && (aVar3 = aVar.i) != null && ((aVar.j || d != 0.0d) && a(gameEngine, playerData, z, aVar3, fVar.a(aVar3), fVar, i + 1, aVar))) {
            z2 = true;
        }
        if ((d == 0.0d && !aVar.p) || (i == 0 && !aVar.l)) {
            if (z2) {
                return true;
            }
            return false;
        }
        String a2 = aVar.a(d, true);
        int b = playerData.b(aVar);
        int a3 = playerData.a(aVar);
        if (a3 != 0) {
            a2 = a2 + "(+" + b + ")(-" + a3 + ")";
        } else if (b != 0) {
            if (b >= 0) {
                a2 = a2 + "(+" + b + ")";
            } else {
                a2 = a2 + "(" + b + ")";
            }
        }
        int i2 = ((int) (gameEngine.cl - gameEngine.cq)) - this.cj;
        Paint paint = this.av;
        if (z) {
            paint = this.aw;
        } else {
            Integer h = aVar.h();
            if (h != null) {
                this.at.a(paint);
                paint = this.at;
                paint.b(h.intValue());
            }
        }
        float b2 = gameEngine.bO.b(a2, paint);
        float a4 = gameEngine.bO.a(a2, paint);
        this.ci = a4 + 6;
        if (this.cl < b2) {
            this.cl = (int) b2;
        }
        int i3 = this.ch;
        if (aVar.w) {
            i3 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        if (i3 == 0) {
            i4 = this.cg;
        } else {
            i5 = this.cf;
        }
        int i6 = 0;
        int i7 = 6;
        int i8 = 6;
        int i9 = 6;
        boolean z3 = false;
        float f3 = b2 + 6 + 6;
        if (aVar.k) {
            f3 += 80.0f;
        }
        if (i2 < f3 && aVar.i != null) {
            z3 = true;
            this.cf = (int) (this.cf + this.ci);
            i5 = this.cf;
            i2 += this.cj;
            this.cj = 0;
        }
        if (i3 != 0) {
            i7 = 0;
        }
        if (aVar2 != null && !aVar2.k) {
            i8 = 0;
        }
        if (z2 && !aVar.k) {
            i2 += 6;
            i9 = 0;
        }
        if (z2 && aVar.k && !z3) {
            i6 = gameEngine.bO.b("AA", paint);
        }
        int i10 = i2 - i6;
        e k = aVar.k();
        float f4 = 1.0f;
        if (k != null) {
            float f5 = a4 - 3.0f;
            if (f5 < 3.0f) {
                f5 = 3.0f;
            }
            f4 = d.a(k, a4 * 3.0f, f5);
            f = (k.p * f4) + 3.0f;
            i8 += (int) f;
        } else {
            f = 0.0f;
        }
        d.a(a2, ((i10 - b2) - i4) - 6, i5 + 6, paint, this.ax, i8, i7, i9, 6);
        if (k != null) {
            gameEngine.bO.a(k, (int) (((f2 - (f / 2.0f)) - (k.r * f4)) - 3.0f), (int) (((i5 + 6) + (a4 / 2.0f)) - (k.s * f4)), this.bD, 0.0f, f4);
        }
        if (i == 0) {
            if (i3 == 0) {
                this.cg = (int) (this.cg + b2 + i9 + i8);
            }
            if (this.ch == i3) {
                this.cf = (int) (this.cf + this.ci);
                this.ch++;
            }
        }
        this.cj = (int) (this.cj + b2 + i9 + i8 + i6);
        return true;
    }

    public boolean k() {
        return a(h.no, true);
    }

    public boolean b(boolean z) {
        return a(z ? h.yes : h.no, false);
    }

    public boolean a(h hVar) {
        return a(hVar, false);
    }

    public boolean a(h hVar, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.av() && !z) {
            return false;
        }
        this.bd = true;
        float f = gameEngine.cj * 0.6f;
        int i = (int) (100.0f * f);
        int i2 = (int) (10.0f * f);
        int i3 = (int) ((gameEngine.cm - ((int) (9.0f * f))) - (i * this.be));
        if (bR) {
            i3 = (int) (i3 - gameEngine.bW.d);
        }
        if (hVar == h.more) {
            int i4 = ((int) (20.0f * f)) + i + ((int) (20.0f * f)) + i;
            this.by.a(i2 + i4, i3, i2 + i4 + i, i3 + i);
            gameEngine.bO.a(this.bc, this.by.a, this.by.b, this.bf, 0.0f, f);
        } else if (hVar == h.yes) {
            this.by.a(i2, i3, i2 + i, i3 + i);
            gameEngine.bO.a(this.bb, this.by.a, this.by.b, this.bf, 0.0f, f);
        } else {
            int i5 = ((int) (20.0f * f)) + i;
            this.by.a(i2 + i5, i3, i2 + i5 + i, i3 + i);
            gameEngine.bO.a(this.ba, this.by.a, this.by.b, this.bf, 0.0f, f);
        }
        boolean z2 = false;
        com.corrodinggames.rts.gameFramework.f.a(this.by, 10.0f * f);
        if (this.U && !this.T && this.by.b((int) this.x, (int) this.y)) {
            z2 = true;
        }
        a(this.by.a, this.by.b, this.by.b(), this.by.c());
        return z2;
    }

    public boolean l() {
        GameEngine.getGameEngine();
        if (this.ac != null) {
            if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.placeBuilding) {
                this.ac = null;
                this.ae = false;
                this.ai = false;
                this.aa = null;
                this.ap = false;
                this.ad++;
            } else {
                this.ac = null;
            }
            this.as = 0;
            return true;
        }
        return false;
    }

    public void c(float f) {
        float f2;
        float f3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        Point c = gameEngine.bW.c(this.x, this.y);
        if (c != null) {
            f2 = c.a;
            f3 = c.b;
        } else {
            f2 = (this.x / gameEngine.cX) + gameEngine.cw;
            f3 = (this.y / gameEngine.cX) + gameEngine.cx;
        }
        this.af = com.corrodinggames.rts.gameFramework.f.a(this.af, f);
        this.bx.a((int) (gameEngine.cl - gameEngine.cq), 0, (int) gameEngine.cl, (int) gameEngine.cm);
        if (!bO && ((this.U || this.I) && this.bx.b((int) this.x, (int) this.y))) {
            this.aZ = true;
        }
        this.g.a(f);
        this.g.b(f);
        this.X += f;
        if (!gameEngine.A()) {
            this.g.a(f, this.g.d(f));
            this.g.e(f);
            this.h.a(f, m.a);
            this.i.a(f);
            this.j.a(f, Math.max((int) (this.cf + (this.ci * 2.0f)), 130));
            if (this.u) {
                this.g.c(f);
            }
            this.k.b(f);
            this.g.a(f, true);
        }
        a(f, f2, f3, c);
        if (!gameEngine.A() && !this.u) {
            this.g.c(f);
        }
        boolean z = false;
        if (!this.T) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            if (GameEngine.av() && gameEngine.settingsEngine.mouseSupport) {
                if (gameEngine.settingsEngine.mouseOrders == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (gameEngine.settingsEngine.mouseOrders == 1) {
                        if (gameEngine.e(1)) {
                            z3 = true;
                        } else if (gameEngine.e(2)) {
                            z4 = true;
                        }
                    } else if (gameEngine.e(2)) {
                        z3 = true;
                    } else if (gameEngine.e(1)) {
                        z4 = true;
                    }
                }
            }
            float f4 = f2;
            float f5 = f3;
            if (this.I && c != null && this.J) {
                boolean z5 = false;
                if (!z2 && !z4) {
                    z5 = true;
                }
                z5 = (q() == 0 || !C()) ? true : true;
                if (z2 && this.w > 20.0f) {
                    z5 = true;
                }
                if (z5) {
                    gameEngine.b(f4, f5);
                    z = true;
                }
            }
            if ((this.C || (c != null && (z2 || z4))) && !z && this.ac == null && this.U) {
                if (this.w > 30.0f) {
                    if (a() && c == null) {
                        y();
                        b(f4, f5, b() / gameEngine.cX);
                        E();
                    }
                } else {
                    gameEngine.cU = false;
                    if (!z2) {
                        if (z3) {
                            am amVar = null;
                            if (c == null) {
                                amVar = a(f4, f5, true);
                            }
                            a(amVar);
                        } else if (z4) {
                            am amVar2 = null;
                            if (c == null) {
                                amVar2 = a(f4, f5, false);
                            }
                            boolean z6 = false;
                            if (amVar2 == null) {
                                z6 = true;
                            } else if (!a(amVar2, false, f4, f5, c)) {
                                z6 = true;
                            }
                            if (z6) {
                                c(f4, f5, c);
                            }
                        }
                    } else {
                        am amVar3 = null;
                        am amVar4 = null;
                        if (c == null) {
                            amVar3 = a(f4, f5, true);
                            amVar4 = a(f4, f5, false);
                        }
                        if (amVar3 == null && amVar4 == null) {
                            c(f4, f5, c);
                        } else if (amVar4 != null) {
                            if (!a(amVar4, true, f4, f5, c)) {
                                if (!amVar4.t()) {
                                    a(amVar4);
                                } else if (amVar3 != null) {
                                    a(amVar3);
                                }
                            }
                        } else {
                            a(amVar3);
                        }
                    }
                }
            }
        }
        if (this.ac == null && this.I && !this.T && !this.J && !this.aZ) {
            this.au.a(Paint.Style.FILL);
            this.au.a(1.0f);
            if (this.w > 20.0f && a()) {
                float b = b();
                this.au.a(100, 0, 255, 0);
                gameEngine.bO.a(this.x, this.y, b, this.au);
                this.au.a(Paint.Style.STROKE);
                this.au.a(1.0f);
                this.au.a(200, 0, 255, 0);
                gameEngine.bO.a(this.x, this.y, b, this.au);
            }
        }
        if (gameEngine.bk && gameEngine.ac() && gameEngine.ae() > 0) {
            Paint paint = new Paint();
            paint.c(100);
            for (int i = 0; i < gameEngine.ae(); i++) {
                gameEngine.bO.i();
                gameEngine.bO.a(0.7f, 0.7f, gameEngine.b(i), gameEngine.c(i));
                gameEngine.bO.a(this.bm, gameEngine.b(i), gameEngine.c(i), paint);
                gameEngine.bO.j();
            }
        }
        if (!this.I) {
            this.w = 0.0f;
            this.T = false;
        }
        this.H = this.I;
        gameEngine.ad();
        if (ce) {
            K();
            ce = false;
        }
    }

    public void a(float f, float f2, float f3, Point point) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        y f4 = this.g.f();
        if (this.bd) {
            this.be = com.corrodinggames.rts.gameFramework.f.a(this.be, 1.0f, 0.05f * f);
            this.be = (float) (this.be + (0.08d * (1.0f - this.be)));
        } else {
            this.be = com.corrodinggames.rts.gameFramework.f.a(this.be, 0.0f, 0.3f * f);
        }
        this.bd = false;
        if (this.ac != null) {
            if (this.ac instanceof g) {
                g gVar = (g) this.ac;
                if (gVar.b != null) {
                    f4 = gVar.b;
                }
            }
            if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.reclaimTarget) {
                a(this.ac, false, f4, false, true);
                if (b(false) || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m()) {
                    am a2 = a(f2, f3, false);
                    if (a2 != null && this.ac.o(a2)) {
                        b(a2);
                        if (!a(gameEngine)) {
                            l();
                        }
                    } else {
                        a(f2, f3, 0.0f);
                    }
                    this.U = false;
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.repairTarget) {
                a(this.ac, false, f4, false, true);
                if (b(false) || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m()) {
                    am a3 = a(f2, f3, true);
                    if (a3 != null && this.ac.o(a3)) {
                        d(a3);
                        if (!a(gameEngine)) {
                            l();
                        }
                    } else {
                        a(f2, f3, 0.0f);
                    }
                    this.U = false;
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.setRally) {
                a(this.ac, false, f4, false, true);
                if (b(false) || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m()) {
                    b(f2, f3);
                    l();
                    this.U = false;
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.targetGround) {
                a(this.ac, false, f4, false, true);
                y f5 = this.g.f();
                s sVar = this.ac;
                if (this.ac instanceof g) {
                    g gVar2 = (g) sVar;
                    if (gVar2.b != null) {
                        f5 = gVar2.b;
                    }
                    sVar = gVar2.a;
                }
                boolean k = k();
                boolean z = (!this.U || this.M || !this.C || this.T || m()) ? false : true;
                if (this.ac.p()) {
                    if (GameEngine.aw()) {
                        z = o() && !this.M && this.C && !this.K && J();
                    } else {
                        z = this.I && !this.M && this.C && !this.K && J();
                    }
                }
                if (f5 != null && (f5 instanceof y)) {
                    gameEngine.bO.i();
                    gameEngine.R();
                    boolean z2 = (!this.I || this.T || this.M || this.K || point != null) ? false : true;
                    float f6 = f2;
                    float f7 = f3;
                    if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport) {
                        f6 = (gameEngine.af() / gameEngine.cX) + gameEngine.cw;
                        f7 = (gameEngine.ag() / gameEngine.cX) + gameEngine.cx;
                        z2 = true;
                        if (this.M) {
                            z2 = false;
                        }
                    }
                    if (!a(this.z, this.A)) {
                        z2 = false;
                    }
                    ((y) f5).a(sVar, z2, f6, f7);
                    gameEngine.bO.j();
                }
                if (k || n()) {
                    l();
                    this.U = false;
                } else if (z && point == null) {
                    boolean z3 = false;
                    if (a(this.ac, f2, f3)) {
                        z3 = true;
                    }
                    if (!z3) {
                        b(this.ac, f2, f3);
                        if (!a(gameEngine) && !this.ac.o()) {
                            l();
                        }
                    } else {
                        a(f2, f3, 0.0f);
                    }
                    this.U = false;
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.attackMove) {
                a(this.ac, false, f4, false, true);
                if (b(false) || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m()) {
                    d(f2, f3, point);
                    if (!a(gameEngine)) {
                        l();
                        this.U = false;
                    }
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.guardUnit) {
                a(this.ac, false, f4, false, true);
                if (b(false) || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m()) {
                    am a4 = a(f2, f3, true);
                    if (a4 != null && this.ac.o(a4)) {
                        e(a4);
                        l();
                    } else {
                        a(f2, f3, 0.0f);
                    }
                    this.U = false;
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.patrol) {
                a(this.ac, false, f4, false, true);
                if (a(h.yes, true) || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m()) {
                    a(f2, f3, point, this.as == 0);
                    this.as++;
                }
            } else if (this.ac.e() == com.corrodinggames.rts.game.units.a.u.pingMap) {
                a(this.ac, false, f4, false, true);
                if (k() || n()) {
                    l();
                    this.U = false;
                } else if (this.U && !this.T && !m() && point == null) {
                    if (this.ac instanceof j) {
                        a(f2, f3, point, (j) this.ac);
                    } else {
                        GameEngine.print("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.ac.getClass().getName());
                    }
                    l();
                    this.U = false;
                }
            } else if (this.ac.mo3i() != null && this.ac.e() == com.corrodinggames.rts.game.units.a.u.placeBuilding) {
                a(f2, f3, point);
            }
        }
    }

    public void a(float f, float f2, Point point) {
        boolean z;
        Point a2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        am f3 = this.g.f();
        boolean z2 = false;
        if (f3 != null && f3.a(this.ac.N()) != null) {
            z2 = this.ac.a(f3, true) && !a.a(this.ac);
            if (!this.ac.b(f3)) {
                z2 = false;
            }
        }
        a(this.ac, false, f3, !z2, true);
        float f4 = this.z / gameEngine.cX;
        float f5 = this.A / gameEngine.cX;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport) {
            z3 = true;
            z6 = this.L;
        }
        if (z3) {
            if (o()) {
                if (!this.ap) {
                    this.ap = true;
                    this.an = f4 + gameEngine.cw;
                    this.ao = f5 + gameEngine.cx;
                }
            } else {
                this.ap = false;
            }
            if (this.ap) {
                float f6 = f4 - (this.an - gameEngine.cw);
                float f7 = f5 - (this.ao - gameEngine.cx);
                if (com.corrodinggames.rts.gameFramework.f.c(f6) > 4.0f || com.corrodinggames.rts.gameFramework.f.c(f7) > 4.0f) {
                    z4 = true;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = false;
        if (GameEngine.av() && gameEngine.settingsEngine.mouseSupport) {
            z12 = true;
        }
        if (this.ae && !z12) {
            if (z2) {
                if (!this.ai && a(h.yes)) {
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.h, 0.5f);
                    this.U = false;
                    z7 = true;
                }
                if (a(h.more)) {
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.h, 0.5f);
                    this.U = false;
                    z9 = true;
                }
            }
            if (a(h.no)) {
                gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.i, 0.7f);
                this.U = false;
                z8 = true;
            }
        }
        boolean z13 = false;
        if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport) {
            z13 = true;
        }
        if (this.U && !this.T) {
            z13 = true;
        }
        if (GameEngine.au()) {
            z5 = true;
            if (gameEngine.ae() == 2) {
                z13 = true;
                f4 = gameEngine.b(0) / gameEngine.cX;
                f5 = gameEngine.c(0) / gameEngine.cX;
                float b = gameEngine.b(1) / gameEngine.cX;
                this.ap = true;
                this.an = b;
                this.ao = gameEngine.c(1) / gameEngine.cX;
            } else if (this.U && !this.T) {
                this.ap = false;
            }
            if (this.ap) {
                z4 = true;
            }
        }
        if (z13) {
            this.ae = true;
            this.ag = f4 * gameEngine.cX;
            this.ah = f5 * gameEngine.cX;
            if (!a(gameEngine.af(), gameEngine.ag())) {
                this.ae = false;
                z11 = false;
            }
        }
        float f8 = this.an;
        float f9 = this.ao;
        if (z5) {
            f8 += gameEngine.cw + gameEngine.cr;
            f9 += gameEngine.cx + gameEngine.cs;
        }
        as mo3i = this.ac.mo3i();
        int t = this.ac.t();
        boolean z14 = false;
        if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport && !gameEngine.cK.b((int) this.z, (int) this.A)) {
            z14 = true;
        }
        am c = am.c(mo3i);
        if ((c == null || !(c instanceof y)) && com.corrodinggames.rts.game.units.custom.l.b != null) {
            c = am.c(com.corrodinggames.rts.game.units.custom.l.b);
        }
        if (this.ae && !z14) {
            y yVar = (y) c;
            gameEngine.bL.b((this.ag / gameEngine.cX) + gameEngine.cw, (this.ah / gameEngine.cX) + gameEngine.cx);
            yVar.eo = gameEngine.bL.T;
            yVar.ep = gameEngine.bL.U;
            if (mo3i.p()) {
                z4 = false;
                if (j.a((int) yVar.eo, (int) yVar.ep, 3) != null) {
                    yVar.eo = a2.a;
                    yVar.ep = a2.b;
                }
            }
            if (!yVar.bI()) {
                yVar.cg = 0.0f;
            } else {
                yVar.cg = -90.0f;
            }
            yVar.eo += yVar.cZ();
            yVar.ep += yVar.da();
            yVar.b(this.aa.bX);
            yVar.a(t);
            yVar.cp = true;
            String b2 = yVar.b(false, gameEngine.playerTeam);
            if (com.corrodinggames.rts.gameFramework.emitter.a.a(gameEngine.playerTeam, yVar, this.ad)) {
                b2 = "{0}";
            }
            if (q() == 1 && f3 != null && (f3 instanceof y)) {
                y yVar2 = (y) f3;
                if (!yVar2.aR()) {
                    float a3 = com.corrodinggames.rts.gameFramework.f.a(yVar2.eo, yVar2.ep, yVar.eo, yVar.ep);
                    float f10 = yVar2.f(yVar.mo1r());
                    if (f10 > 800000.0f) {
                        z = true;
                    } else {
                        z = a3 <= f10 * f10;
                    }
                    if (!z) {
                        b2 = "{0}";
                    }
                }
            }
            if (z4) {
            }
            am amVar = null;
            if (q() == 1) {
                amVar = f3;
            }
            if (z2) {
                if (z4) {
                    if (GameEngine.av() || (GameEngine.au() && gameEngine.ae() == 2)) {
                        gameEngine.bO.a(f4 * gameEngine.cX, f5 * gameEngine.cX, (f8 - gameEngine.cw) * gameEngine.cX, (f9 - gameEngine.cx) * gameEngine.cX, this.bE);
                    } else {
                        gameEngine.bO.a((yVar.eo - gameEngine.cw) * gameEngine.cX, (yVar.ep - gameEngine.cx) * gameEngine.cX, (f8 - gameEngine.cw) * gameEngine.cX, (f9 - gameEngine.cx) * gameEngine.cX, this.bE);
                    }
                    b2 = null;
                    a(yVar, f8, f9, yVar.eo, yVar.ep, true, (ArrayList) null, amVar);
                } else {
                    a(yVar, yVar.eo, yVar.ep, true, z6, amVar);
                }
            }
            yVar.a(1);
            if (z11 && p()) {
                this.U = false;
                if (a(gameEngine)) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                }
            }
            if (n()) {
                this.U = false;
                z8 = true;
            }
            if (this.U && !this.T) {
                float f11 = f5;
                float f12 = this.aq;
                float f13 = this.ar;
                if (com.corrodinggames.rts.gameFramework.f.c(f12 - f4) < 15.0f && com.corrodinggames.rts.gameFramework.f.c(f13 - f11) < 15.0f && this.af != 0.0f) {
                    this.U = false;
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.h, 0.5f);
                    if (this.ai) {
                        z9 = true;
                    } else {
                        z7 = true;
                    }
                }
                this.af = 80.0f;
                this.aq = f4;
                this.ar = f5;
            }
            if (z7 || z9) {
                if (!z2) {
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.7f);
                    if (b2 == null && f3 != null && this.ac != null && f3.a(this.ac.N()) != null) {
                        b2 = this.ac.j(f3);
                        if (b2 == null && f(this.ac) != null) {
                            b2 = this.bI.b();
                        }
                    }
                    if (b2 != "{0}") {
                        c(b2);
                    }
                } else if (b2 != null) {
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.7f);
                    if (b2 != "{0}") {
                        String str = b2;
                        if (str == "{2}") {
                            str = this.bK;
                        }
                        if (str == "{3}") {
                            str = this.bL;
                        }
                        if (str == "{1}") {
                            str = this.bJ;
                        }
                        c(str);
                    }
                } else {
                    float f14 = yVar.eo;
                    float f15 = yVar.ep;
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        a(yVar, f8, f9, yVar.eo, yVar.ep, false, arrayList, (am) null);
                    } else {
                        arrayList.add(new PointF(f14, f15));
                    }
                    int i = 0;
                    boolean z15 = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PointF pointF = (PointF) it.next();
                        if (this.ac.A()) {
                            SyncPacket x = x();
                            a(x);
                            x.a(this.ac.N(), pointF, (am) null);
                        } else {
                            SyncPacket x2 = x();
                            if (z15) {
                                z15 = false;
                                if (z9) {
                                    if (!x2.e) {
                                        x2.f = true;
                                    }
                                    this.ai = true;
                                }
                            } else {
                                x2.e = true;
                            }
                            y t2 = t();
                            if (this.ac instanceof g) {
                                y yVar3 = ((g) this.ac).b;
                                x2.a(yVar3);
                                t2 = yVar3;
                            } else {
                                a(x2);
                            }
                            x2.a(pointF.x, pointF.y, mo3i, t);
                            if (t2 != null) {
                                com.corrodinggames.rts.gameFramework.emitter.a aVar = new com.corrodinggames.rts.gameFramework.emitter.a();
                                aVar.d = mo3i;
                                aVar.g = pointF.x;
                                aVar.h = pointF.y;
                                aVar.n = true;
                                aVar.o = t2;
                                aVar.e = gameEngine.playerTeam;
                                aVar.f = t;
                                aVar.j = gameEngine.playerTeam;
                                aVar.r = this.ad;
                                aVar.s = 1.0f + (0.15f * i);
                                if (t2.av() >= 29) {
                                    aVar.q = true;
                                }
                            }
                            i++;
                        }
                    }
                    this.aU = 5.0f;
                    if (GameEngine.aw()) {
                        this.aU = 1.0f;
                    }
                    this.ap = false;
                    if (!z9) {
                        if (i > 0) {
                            boolean z16 = true;
                            if (yVar != null && !p(yVar)) {
                                z16 = false;
                            }
                            this.ac = null;
                            this.ae = false;
                            this.ai = false;
                            this.aa = null;
                            if (z16) {
                                y();
                            }
                            this.ad++;
                        }
                    } else if (!z10) {
                        float f16 = yVar.eo;
                        float f17 = yVar.ep;
                        boolean z17 = false;
                        if (com.corrodinggames.rts.gameFramework.f.c(f16 - this.aj) < (yVar.cd().b() * gameEngine.bL.n * 2.0f) + (3 * gameEngine.bL.n) && com.corrodinggames.rts.gameFramework.f.c(f17 - this.ak) < (yVar.cd().c() * gameEngine.bL.o * 2.0f) + (3 * gameEngine.bL.o)) {
                            this.al = f16 - this.aj;
                            this.am = f17 - this.ak;
                            if (com.corrodinggames.rts.gameFramework.f.c(this.al) > com.corrodinggames.rts.gameFramework.f.c(this.am)) {
                                this.am = 0.0f;
                            } else {
                                this.al = 0.0f;
                            }
                        }
                        if (yVar.cd().c() > yVar.cd().b() + 1) {
                            this.am = 0.0f;
                        }
                        this.aj = f16;
                        this.ak = f17;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        if (this.am < 0.0f) {
                            f18 = -1.0f;
                        }
                        if (this.al < 0.0f) {
                            f19 = -1.0f;
                        }
                        if (this.am > 0.0f) {
                            f18 = 1.0f;
                        }
                        if (this.al > 0.0f) {
                            f19 = 1.0f;
                        }
                        if (f19 == 0.0f && f18 == 0.0f) {
                            f19 = 1.0f;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        float f20 = f16 + (200.0f * f19);
                        float f21 = f17 + (200.0f * f18);
                        float f22 = (-yVar.cZ()) + 1.0f;
                        float f23 = (-yVar.da()) + 1.0f;
                        a(yVar, f16 + f22, f17 + f23, f20 + f22, f21 + f23, false, arrayList2, (am) null);
                        if (arrayList2.size() > 0) {
                            yVar.eo = ((PointF) arrayList2.get(0)).x;
                            yVar.ep = ((PointF) arrayList2.get(0)).y;
                            z17 = true;
                        }
                        if (!z17) {
                            a(yVar, f16 + f22, f17 + f23, f16 + (200.0f * (-f19)) + f22, f17 + (200.0f * (-f18)) + f23, false, arrayList2, (am) null);
                            if (arrayList2.size() > 0) {
                                yVar.eo = ((PointF) arrayList2.get(0)).x;
                                yVar.ep = ((PointF) arrayList2.get(0)).y;
                                z17 = true;
                            }
                        }
                        if (!z17) {
                            yVar.eo += 3 * gameEngine.bL.n;
                            yVar.ep += gameEngine.bL.n;
                        }
                        if (z17) {
                            float f24 = yVar.eo - f16;
                            float f25 = yVar.ep - f17;
                            float f26 = gameEngine.cy;
                            float f27 = gameEngine.cz;
                            gameEngine.cr += f24;
                            gameEngine.cs += f25;
                            gameEngine.cy += gameEngine.cr;
                            gameEngine.cz += gameEngine.cs;
                            float f28 = gameEngine.cy;
                            float f29 = gameEngine.cz;
                            gameEngine.Q();
                            gameEngine.cr += gameEngine.cy - f28;
                            gameEngine.cs += gameEngine.cz - f29;
                            float f30 = (f26 + f24) - gameEngine.cy;
                            float f31 = (f27 + f25) - gameEngine.cz;
                            if (com.corrodinggames.rts.gameFramework.f.c(f30) > 1.0f) {
                                this.ag += f30 * gameEngine.cX;
                            }
                            if (com.corrodinggames.rts.gameFramework.f.c(f31) > 1.0f) {
                                this.ah += f31 * gameEngine.cX;
                            }
                            gameEngine.cy -= gameEngine.cr;
                            gameEngine.cz -= gameEngine.cs;
                        }
                    }
                }
            }
            if (z8) {
                l();
                if (this.ai) {
                    y();
                }
            }
        }
    }

    public boolean m() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport && !n() && !p()) {
            return true;
        }
        return false;
    }

    public boolean n() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport && this.U && !this.T && !this.aZ) {
            int i = 1;
            int i2 = 2;
            if (gameEngine.settingsEngine.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (gameEngine.e(i)) {
            }
            if (gameEngine.e(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean o() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.av() && gameEngine.settingsEngine.mouseSupport) {
            if (this.U || this.I) {
                int i = 1;
                int i2 = 2;
                if (gameEngine.settingsEngine.mousePlacement == 2) {
                    i = 2;
                    i2 = 1;
                }
                if (gameEngine.e(i)) {
                    return true;
                }
                if (gameEngine.e(i2)) {
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean p() {
        if (this.U && !this.T && !this.aZ) {
            return o();
        }
        return false;
    }

    public void a(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (amVar != null && this.W == amVar && this.X < 40.0f && !b(gameEngine)) {
            if (!a(gameEngine)) {
                y();
            }
            h(amVar);
        } else if (amVar != null) {
            if (!a(gameEngine) && !b(gameEngine)) {
                y();
            }
            a(amVar, b(gameEngine));
            this.W = amVar;
            this.X = 0.0f;
        }
    }

    public boolean a(am amVar, boolean z, float f, float f2, Point point) {
        GameEngine.getGameEngine();
        PlayerData r = r();
        boolean c = r.c(amVar.bX);
        if (c && B() && q(amVar)) {
            c(amVar);
            return true;
        }
        if (r.d(amVar.bX) && ((amVar.cu < amVar.cv || amVar.cm < 1.0f) && q() != 0)) {
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            if (amVar.cr() && n(amVar)) {
                z3 = true;
            }
            Iterator it = this.bZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w wVar = (w) it.next();
                if (wVar instanceof y) {
                    y yVar = (y) wVar;
                    if (!yVar.cG) {
                        continue;
                    } else if (!m(yVar)) {
                        z2 = false;
                        break;
                    } else if (!yVar.a(amVar)) {
                        z2 = false;
                        break;
                    } else {
                        if (yVar.aS()) {
                            z5 = true;
                        }
                        au ar = yVar.ar();
                        if (ar != null && ar.d() == av.repair) {
                            z4 = true;
                        }
                    }
                }
            }
            if (z2 && (!z4 || !z3)) {
                if (z5) {
                    d(amVar);
                    return true;
                }
                d(amVar);
                return true;
            }
        }
        if (amVar.g() > 0.0f && q() != 0) {
            boolean z6 = true;
            Iterator it2 = w.er.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                w wVar2 = (w) it2.next();
                if (wVar2 instanceof y) {
                    y yVar2 = (y) wVar2;
                    if (!yVar2.cG) {
                        continue;
                    } else if (!m(yVar2)) {
                        z6 = false;
                        break;
                    } else if (!yVar2.h(amVar, true)) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6) {
                b(amVar);
                return true;
            }
        }
        if (amVar.cr() && n(amVar)) {
            f(amVar);
            return true;
        } else if (GameEngine.av() && C() && o(amVar)) {
            g(amVar);
            return true;
        } else {
            boolean z7 = false;
            if ((!z || amVar.t()) && !r.c(amVar.bX)) {
                if (amVar.bI()) {
                    if (amVar.cc().a()) {
                        z7 = true;
                    }
                } else if (!amVar.bT) {
                    z7 = true;
                }
                if (!z7 && !amVar.i() && D()) {
                    z7 = true;
                }
            }
            if (!z7 && c && B()) {
                a(amVar.eo, amVar.ep, amVar.eq);
                return true;
            }
            return false;
        }
    }

    public int q() {
        return this.aX;
    }

    void a(SyncPacket syncPacket) {
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof y) {
                y yVar = (y) wVar;
                if (yVar.cG && m(yVar)) {
                    syncPacket.a(yVar);
                }
            }
        }
    }

    public PlayerData r() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.bX == gameEngine.playerTeam) {
                    return yVar.bX;
                }
            }
        }
        Iterator it2 = this.bZ.iterator();
        while (it2.hasNext()) {
            am amVar2 = (am) it2.next();
            if (amVar2 instanceof y) {
                y yVar2 = (y) amVar2;
                if (m(yVar2)) {
                    return yVar2.bX;
                }
            }
        }
        return gameEngine.playerTeam;
    }

    public y s() {
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                return (y) amVar;
            }
        }
        return null;
    }

    public y t() {
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (m(yVar)) {
                    return yVar;
                }
            }
        }
        return null;
    }

    void a(SyncPacket syncPacket, s sVar, boolean z) {
        s a2;
        if (sVar instanceof g) {
            syncPacket.a(((g) sVar).b);
            return;
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        y yVar = null;
        int i = -99;
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof y) {
                y yVar2 = (y) wVar;
                if (yVar2.cG && m(yVar2) && (a2 = yVar2.a(N)) != null && a2.b(yVar2) && (a2.a((am) yVar2, true) || z)) {
                    int i2 = 0;
                    if (yVar2 instanceof com.corrodinggames.rts.game.units.d.l) {
                        i2 = ((com.corrodinggames.rts.game.units.d.l) yVar2).a(N, true);
                        if (yVar != null) {
                            if (!z) {
                                if (i2 >= i) {
                                    break;
                                }
                            } else if (i2 <= i) {
                                break;
                            }
                        }
                    }
                    yVar = yVar2;
                    i = i2;
                }
            }
        }
        if (yVar != null) {
            syncPacket.a(yVar);
        }
    }

    boolean a(s sVar, float f, float f2) {
        s a2;
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            y yVar = gVar.b;
            s p_ = gVar.p_();
            boolean z = false;
            if (p_.b(yVar) && p_.a((am) yVar, true) && !yVar.a(p_, f, f2)) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof y) {
                y yVar2 = (y) wVar;
                if (yVar2.cG && m(yVar2) && (a2 = yVar2.a(sVar.N())) != null && a2.b(yVar2) && a2.a((am) yVar2, true)) {
                    if (!yVar2.a(a2, f, f2)) {
                        z2 = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    void a(SyncPacket syncPacket, s sVar) {
        s a2;
        if (sVar instanceof g) {
            syncPacket.a(((g) sVar).b);
            return;
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof y) {
                y yVar = (y) wVar;
                if (yVar.cG && m(yVar) && (a2 = yVar.a(N)) != null && a2.b(yVar)) {
                    syncPacket.a(yVar);
                }
            }
        }
    }

    public boolean a(s sVar, boolean z) {
        s a2;
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            return gVar.a((am) gVar.b, true);
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar) && (a2 = yVar.a(N)) != null && a2.a(yVar, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(s sVar) {
        s a2;
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        if (sVar.o_()) {
            return false;
        }
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            return gVar.a((am) gVar.b);
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar) && (a2 = yVar.a(N)) != null && a2.a((am) yVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(s sVar) {
        s a2;
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            return gVar.b(gVar.b);
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar) && (a2 = yVar.a(N)) != null && a2.b(yVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean c(s sVar) {
        s a2;
        boolean z = false;
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            return gVar.g(gVar.b);
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar) && (a2 = yVar.a(N)) != null) {
                    if (!a2.g(yVar)) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public String d(s sVar) {
        s a2;
        String j;
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            return gVar.j(gVar.b);
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar) && (a2 = yVar.a(N)) != null && a2.g(yVar) && (j = a2.j(yVar)) != null) {
                    return j;
                }
            }
        }
        return null;
    }

    public u e(s sVar) {
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            this.bY.clear();
            if (gVar.b != null) {
                this.bY.add(gVar.b);
            }
            return this.bY;
        }
        return this.bZ;
    }

    public String f(s sVar) {
        s a2;
        u e = e(sVar);
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        String str = null;
        boolean z = false;
        Iterator it = e.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (m(yVar) && (a2 = yVar.a(N)) != null) {
                    if (a2.B() != null && !a2.B().b(yVar)) {
                        String a3 = a2.B().a((am) yVar, 4, true);
                        if (a3 != null) {
                            str = a3;
                        }
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return null;
        }
        return str;
    }

    public boolean u() {
        if (this.aX == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (!yVar.cG) {
                    continue;
                } else if (!m(yVar)) {
                    return false;
                } else {
                    ArrayList N = yVar.N();
                    boolean z = false;
                    if (N != null) {
                        Iterator it2 = N.iterator();
                        while (it2.hasNext()) {
                            if (((s) it2.next()).e() == com.corrodinggames.rts.game.units.a.u.setRally) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean a(com.corrodinggames.rts.game.units.ag agVar) {
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (m(yVar) && a(agVar, yVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(com.corrodinggames.rts.game.units.ag agVar, am amVar) {
        if (amVar instanceof y) {
            y yVar = (y) amVar;
            if ((agVar == com.corrodinggames.rts.game.units.ag.attack || agVar == com.corrodinggames.rts.game.units.ag.move) && !GameEngine.a(this.bU, 1000L)) {
                return true;
            }
            if (agVar == com.corrodinggames.rts.game.units.ag.newSelection) {
                if (GameEngine.getGameEngine().tick < 10) {
                    return false;
                }
                if (!GameEngine.a(this.bV, 1000L)) {
                    return true;
                }
            }
            if (yVar.a(agVar)) {
                if (agVar == com.corrodinggames.rts.game.units.ag.attack || agVar == com.corrodinggames.rts.game.units.ag.move) {
                    this.bU = GameEngine.V();
                }
                if (agVar == com.corrodinggames.rts.game.units.ag.newSelection) {
                    this.bV = GameEngine.V();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!C()) {
            if (gameEngine.settingsEngine.quickRally && u()) {
                b(f, f2);
                return;
            }
            return;
        }
        SyncPacket x = x();
        x.h = true;
        x.a(f, f2);
        a(x);
        if (!a(com.corrodinggames.rts.game.units.ag.move)) {
            gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
        }
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.ap = 8;
            a2.V = 30.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.G = 2.8f * c();
            a2.F = 1.6f * c();
            a2.H = true;
        }
        if (point != null) {
            Point b = gameEngine.bW.b(point.a, point.b);
            com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(b.a, b.b, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a3 != null) {
                a3.ar = (short) 4;
                a3.ap = 8;
                a3.V = 35.0f;
                a3.W = a2.V;
                a3.r = true;
                a3.E = 2.0f;
                a3.G = 1.3f;
                a3.F = 0.6f;
            }
        }
    }

    public void c(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.D && gameEngine.settingsEngine.doubleClickToAttackMove && B() && C()) {
            d(f, f2, point);
        } else {
            b(f, f2, point);
        }
    }

    public void d(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        x.h = true;
        x.b(f, f2);
        a(x);
        if (!a(com.corrodinggames.rts.game.units.ag.move)) {
            gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
        }
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.aq = 17;
            a2.ap = 2;
            a2.V = 30.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.Z = 1.0f;
            a2.G = 1.9f * c();
            a2.F = 3.5f * c();
            a2.H = true;
        }
        if (point != null) {
            Point b = gameEngine.bW.b(point.a, point.b);
            com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(b.a, b.b, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a3 != null) {
                a3.ar = (short) 4;
                a3.ap = 9;
                a3.V = 35.0f;
                a3.W = a2.V;
                a3.r = true;
                a3.E = 2.0f;
                a3.G = 1.3f;
                a3.F = 0.6f;
            }
        }
    }

    public void v() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        x.h();
        a(x);
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
    }

    public void a(s sVar, PointF pointF, am amVar, SyncPacket syncPacket) {
        if (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) {
            com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) sVar;
            GameEngine.getGameEngine();
        }
    }

    public void b(s sVar, float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF pointF = new PointF(f, f2);
        SyncPacket x = x();
        if (!sVar.I()) {
            a(x, sVar);
        } else {
            a(x, sVar, false);
        }
        x.a(sVar.N(), pointF, (am) null);
        a(sVar, pointF, (am) null, x);
        if (!sVar.a(f, f2)) {
            gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
            com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a2 != null) {
                a2.ap = 9;
                a2.V = 60.0f;
                a2.W = a2.V;
                a2.r = true;
                a2.E = 2.0f;
                a2.G = 3.8f * c();
                a2.F = 2.0f * c();
                a2.H = true;
                a2.Z = 1.5f;
            }
        }
    }

    public void b(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        a(x);
        x.d(amVar);
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.ap = 12;
            a2.V = 25.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.H = true;
            a2.G = 1.2f * c();
            a2.F = 1.8f * c();
        }
    }

    public void b(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket w = w();
        a(w);
        w.a(new PointF(f, f2));
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.ap = 8;
            a2.V = 65.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.H = true;
            a2.Z = 2.0f;
            a2.G = 2.0f * c();
            a2.F = 1.5f * c();
        }
    }

    public void a(float f, float f2, Point point, j jVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.settingsEngine.showMapPingsOnBattlefield && !gameEngine.settingsEngine.showMapPingsOnMinimap) {
            b("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
            return;
        }
        x().a(jVar.N(), new PointF(f, f2), (am) null);
        if (this.bW == 0 || this.bW + 15000 < System.currentTimeMillis()) {
            this.bW = System.currentTimeMillis();
            gameEngine.netEngine.l("MAP PING - [i:" + jVar.K() + "]");
        }
    }

    public void a(float f, float f2, PlayerData playerData, j jVar) {
        com.corrodinggames.rts.gameFramework.emitter.e a2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int ordinal = 7 + jVar.a.ordinal();
        if (!gameEngine.settingsEngine.showMapPingsOnBattlefield && !gameEngine.settingsEngine.showMapPingsOnMinimap) {
            if (!this.bX && !gameEngine.replayEngine.j()) {
                this.bX = true;
                this.h.a((String) null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
                return;
            }
            return;
        }
        if (gameEngine.settingsEngine.showMapPingsOnBattlefield) {
            com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a3 != null) {
                a3.aq = 9;
                a3.ap = 6;
                a3.E = 0.7f;
                a3.V = 490.0f;
                a3.W = a3.V;
                a3.r = true;
                a3.S = 6.0f;
                a3.T = 60.0f;
                a3.J -= a3.S;
                a3.G = 2.0f * 1.0f;
                a3.F = a3.G;
                a3.ao = -0.5f;
                a3.H = true;
                if (playerData != null) {
                    a3.x = playerData.K();
                    if (GameEngine.at()) {
                        a3.B = new LightingColorFilter(a3.x, 0);
                    }
                }
            }
            if (ordinal != -1 && (a2 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical)) != null) {
                a2.aq = 9;
                a2.ap = ordinal;
                a2.V = 490.0f;
                a2.W = a2.V;
                a2.r = true;
                a2.E = 1.2f;
                a2.S = 6.0f;
                a2.T = 60.0f;
                a2.J -= a2.S;
                a2.G = 2.0f * 1.0f;
                a2.F = a2.G;
                a2.ao = -0.7f;
                a2.H = true;
            }
        }
        if (gameEngine.settingsEngine.showMapPingsOnMinimap) {
            Point b = gameEngine.bW.b(f, f2);
            com.corrodinggames.rts.gameFramework.emitter.e a4 = gameEngine.bR.a(b.a, b.b, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a4 != null) {
                a4.ar = (short) 4;
                a4.aq = 9;
                a4.ap = 6;
                a4.E = 0.8f;
                a4.V = 470.0f;
                a4.W = a4.V;
                a4.r = true;
                a4.J -= 2.0f;
                a4.S = 2.0f;
                a4.T = 60.0f;
                a4.ao = -0.5f;
                if (playerData != null) {
                    a4.x = playerData.K();
                    if (GameEngine.at()) {
                        a4.B = new LightingColorFilter(a4.x, 0);
                    }
                }
                a4.G = 1.0f;
                a4.F = 1.0f;
            }
            com.corrodinggames.rts.gameFramework.emitter.e a5 = gameEngine.bR.a(b.a, b.b, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a5 != null) {
                a5.ar = (short) 4;
                a5.aq = 9;
                a5.ap = ordinal;
                a5.V = 470.0f;
                a5.W = a5.V;
                a5.r = true;
                a5.E = 0.8f;
                a5.J -= 2.0f;
                a5.S = 2.0f;
                a5.T = 60.0f;
                if (playerData != null) {
                }
                a5.G = 1.0f;
                a5.F = 1.0f;
                a5.ao = -0.7f;
            }
        }
    }

    public SyncPacket w() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket b = gameEngine.cf.b(gameEngine.playerTeam);
        if (gameEngine.netEngine.B) {
            b.p = gameEngine.playerTeam;
        }
        return b;
    }

    public SyncPacket x() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket w = w();
        if (a(gameEngine)) {
            w.e = true;
        }
        return w;
    }

    public void c(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        x.a(amVar);
        a(x);
        if (!a(com.corrodinggames.rts.game.units.ag.attack)) {
            gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.d, 1.0f);
        }
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.b = amVar;
            a2.I = 0.0f;
            a2.J = 0.0f;
            a2.K = 0.0f;
            a2.ap = 9;
            a2.V = 35.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 1.5f;
            a2.H = true;
            a2.Z = 0.8f;
            a2.G = 1.9f * c();
            a2.F = 3.3f * c();
        }
        com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a3 != null) {
            a3.b = amVar;
            a3.I = 0.0f;
            a3.J = 0.0f;
            a3.K = 0.0f;
            a3.aq = 17;
            a3.ap = 0;
            a3.V = 25.0f;
            a3.W = a3.V;
            a3.r = true;
            a3.E = 1.0f;
            a3.H = true;
            a3.Z = 0.8f;
            a3.G = 2.2f * c();
            a3.F = 1.1f * c();
        }
    }

    public void d(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        a(x);
        x.b(amVar);
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.d, 1.0f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.ap = 10;
            a2.V = 35.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.H = true;
            a2.G = 1.5f * c();
            a2.F = 2.2f * c();
        }
    }

    public void e(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        a(x);
        x.c(amVar);
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.d, 1.0f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.aq = 17;
            a2.ap = 1;
            a2.V = 40.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 1.0f;
            a2.H = true;
            a2.Z = 0.0f;
            a2.G = 1.2f * c();
            a2.F = 1.9f * c();
        }
    }

    public void a(float f, float f2, float f3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.2f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, f3, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.aq = 9;
            a2.ap = 14;
            a2.V = 10.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.Z = 0.0f;
            a2.G = 1.1f * c();
            a2.F = 1.6f * c();
            a2.H = true;
        }
    }

    public void a(float f, float f2, Point point, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        a(x);
        x.c(f, f2);
        if (!z) {
            x.e = true;
        }
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.f, 0.2f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.aq = 17;
            a2.ap = 0;
            a2.V = 40.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.Z = 8.0f;
            a2.G = 1.1f * c();
            a2.F = 1.9f * c();
            a2.H = true;
        }
        if (point != null) {
            Point b = gameEngine.bW.b(point.a, point.b);
            com.corrodinggames.rts.gameFramework.emitter.e a3 = gameEngine.bR.a(b.a, b.b, 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
            if (a3 != null) {
                a3.ar = (short) 4;
                a3.ap = 9;
                a3.V = 35.0f;
                a3.W = a2.V;
                a3.r = true;
                a3.E = 2.0f;
                a3.G = 1.3f;
                a3.F = 0.6f;
            }
        }
    }

    public void f(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        a(x);
        x.e(amVar);
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.d, 1.0f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.ap = 11;
            a2.V = 25.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.H = true;
            a2.G = 1.8f * c();
            a2.F = 1.6f * c();
        }
    }

    public void g(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket x = x();
        a(x);
        x.f(amVar);
        gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.d, 1.0f);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, true, com.corrodinggames.rts.gameFramework.emitter.h.critical);
        if (a2 != null) {
            a2.ap = 11;
            a2.V = 25.0f;
            a2.W = a2.V;
            a2.r = true;
            a2.E = 2.0f;
            a2.H = true;
            a2.G = 1.8f * c();
            a2.F = 1.6f * c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public am a(float f, float f2, boolean z) {
        float a2;
        float f3;
        boolean c;
        GameEngine gameEngine = GameEngine.getGameEngine();
        am amVar = null;
        float f4 = -1.0f;
        float f5 = 10.0f / gameEngine.cX;
        float f6 = 5.0f / gameEngine.cX;
        float f7 = 5.0f / gameEngine.cX;
        PlayerData r = r();
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (z) {
                if (!amVar2.t()) {
                    if (!amVar2.bV && amVar2.cN == null) {
                        a2 = com.corrodinggames.rts.gameFramework.f.a(f, f2, amVar2.eo, amVar2.ep - amVar2.eq);
                        float mo146do = amVar2.mo146do();
                        if (amVar2.cG) {
                            f3 = mo146do + f5;
                        } else {
                            f3 = mo146do + f6;
                        }
                        c = r.c(amVar2.bX);
                        if (c) {
                            f3 += f7;
                        }
                        if (a2 < f3 * f3 && (!c || amVar2.cg())) {
                            if (amVar != null || a2 < f4) {
                                amVar = amVar2;
                                f4 = a2;
                            }
                        }
                    }
                }
            } else if (!amVar2.cV()) {
                if (!amVar2.bV) {
                    a2 = com.corrodinggames.rts.gameFramework.f.a(f, f2, amVar2.eo, amVar2.ep - amVar2.eq);
                    float mo146do2 = amVar2.mo146do();
                    if (amVar2.cG) {
                    }
                    c = r.c(amVar2.bX);
                    if (c) {
                    }
                    if (a2 < f3 * f3) {
                        if (amVar != null) {
                        }
                        amVar = amVar2;
                        f4 = a2;
                    }
                }
            }
        }
        if (amVar != null && amVar.bX != gameEngine.playerTeam && !amVar.cf()) {
            return null;
        }
        return amVar;
    }

    public void b(float f, float f2, float f3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof am) {
                am amVar = (am) wVar;
                if (!amVar.bV && amVar.cN == null && amVar.bX == gameEngine.playerTeam && com.corrodinggames.rts.gameFramework.f.a(f, f2, amVar.eo, amVar.ep - amVar.eq) < f3 * f3) {
                    j(amVar);
                }
            }
        }
    }

    public void h(am amVar) {
        this.W = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof am) {
                am amVar2 = (am) wVar;
                if (!amVar2.bV && amVar2.cN == null && amVar2.bX == amVar.bX && amVar2.s_() && a.a(amVar2, amVar) && (amVar2.bX == gameEngine.playerTeam || amVar2.cf())) {
                    j(amVar2);
                }
            }
        }
    }

    public void y() {
        this.W = null;
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof am) {
                ((am) wVar).cG = false;
            }
        }
        this.aX = 0;
        this.Y++;
        this.bZ.clear();
        K();
    }

    public boolean i(am amVar) {
        if (amVar.t()) {
            return false;
        }
        PlayerData playerData = GameEngine.getGameEngine().playerTeam;
        if (playerData != null && playerData.c(amVar.bX) && !amVar.cg()) {
            return false;
        }
        return true;
    }

    public boolean j(am amVar) {
        if (amVar.cG) {
            return true;
        }
        if (!i(amVar)) {
            return false;
        }
        k(amVar);
        a(com.corrodinggames.rts.game.units.ag.newSelection, amVar);
        return true;
    }

    public void k(am amVar) {
        if (amVar.cG || !i(amVar)) {
            return;
        }
        amVar.cG = true;
        amVar.cH = GameEngine.getGameEngine().bA;
        this.aX++;
        if (!(amVar instanceof h)) {
            ca = amVar;
        }
        this.Y++;
        this.bZ.add(amVar);
        K();
    }

    public static b z() {
        as mo1r;
        am amVar = ca;
        if (amVar == null || (mo1r = amVar.mo1r()) == null || !(mo1r instanceof com.corrodinggames.rts.game.units.custom.l)) {
            return null;
        }
        return ((com.corrodinggames.rts.game.units.custom.l) mo1r).J;
    }

    public void a(am amVar, boolean z) {
        if (!z) {
            j(amVar);
        } else if (amVar.cG) {
            l(amVar);
        } else {
            j(amVar);
        }
    }

    public void l(am amVar) {
        if (amVar.cG) {
            amVar.cG = false;
            this.aX--;
            this.bZ.remove(amVar);
            this.Y++;
            K();
        }
    }

    public boolean A() {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean B() {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && m(yVar) && yVar.l()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean C() {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && yVar.aS() && m(yVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean D() {
        if (q() == 0) {
            return true;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && !yVar.i()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean m(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (amVar.cW()) {
            return false;
        }
        if (amVar.bX == gameEngine.playerTeam) {
            return true;
        }
        if ((amVar.bX != null && amVar.bX.b(gameEngine.playerTeam)) || gameEngine.bv || gameEngine.replayEngine.j()) {
            return true;
        }
        return false;
    }

    public boolean n(am amVar) {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (amVar2 instanceof y) {
                y yVar = (y) amVar2;
                if (yVar.cG && yVar != amVar && m(yVar) && amVar.d(yVar, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o(am amVar) {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (amVar2 instanceof y) {
                y yVar = (y) amVar2;
                if (yVar.cG && yVar != amVar && m(yVar) && yVar.d(amVar, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(am amVar) {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (amVar2 instanceof y) {
                y yVar = (y) amVar2;
                if (yVar.cG && yVar != amVar && m(yVar) && yVar.a(amVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q(am amVar) {
        if (q() == 0) {
            return false;
        }
        Iterator it = this.bZ.iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (amVar2 instanceof y) {
                y yVar = (y) amVar2;
                if (yVar.cG && yVar != amVar && m(yVar) && aq.a(yVar, amVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void E() {
    }

    public boolean F() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        this.g.a(gameOutputStream);
        gameOutputStream.writeByte(1);
        gameOutputStream.writeInt(this.ad);
    }

    public void a(GameInputStream gameInputStream, boolean z) {
        this.g.a(gameInputStream, z);
        if (gameInputStream.readByte() >= 1) {
            this.ad = gameInputStream.readInt();
        }
    }

    public void a(y yVar, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f5 = yVar.eo;
        float f6 = yVar.ep;
        y yVar2 = null;
        am d = am.d(yVar.mo1r());
        if (!(d instanceof y)) {
            GameEngine.m5e("buildingBlockoutUnit not OrderableUnit is: " + d.getClass().getName());
        } else {
            yVar2 = (y) d;
        }
        boolean z2 = false;
        gameEngine.bL.b(f, f2);
        float f7 = gameEngine.bL.T;
        float f8 = gameEngine.bL.U;
        float cZ = f7 + yVar.cZ();
        float da = f8 + yVar.da();
        float cZ2 = f3 + yVar.cZ();
        float da2 = f4 + yVar.da();
        float b = com.corrodinggames.rts.gameFramework.f.b(cZ, da, cZ2, da2);
        float d2 = com.corrodinggames.rts.gameFramework.f.d(cZ, da, cZ2, da2);
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            float f10 = f9;
            if (f10 <= b) {
                gameEngine.bL.b((cZ + (com.corrodinggames.rts.gameFramework.f.k(d2) * f10)) - yVar.cZ(), (da + (com.corrodinggames.rts.gameFramework.f.j(d2) * f10)) - yVar.da());
                float f11 = gameEngine.bL.T;
                float f12 = gameEngine.bL.U;
                float cZ3 = f11 + yVar.cZ();
                float da3 = f12 + yVar.da();
                yVar.eo = cZ3;
                yVar.ep = da3;
                if ((!z2 || yVar2 == null || (!com.corrodinggames.rts.gameFramework.emitter.a.a(yVar, yVar2) && !yVar.r(yVar2))) && 0 == 0) {
                    boolean a2 = a(yVar, cZ3, da3, z, false, amVar);
                    if (arrayList != null && a2) {
                        arrayList.add(new PointF(cZ3, da3));
                    }
                    if (a2) {
                        i++;
                        if (i >= 29) {
                            return;
                        }
                    }
                    z2 = true;
                    if (yVar2 != null) {
                        yVar2.eo = cZ3;
                        yVar2.ep = da3;
                    }
                }
                f9 = f10 + gameEngine.bL.p;
            } else {
                yVar.eo = f5;
                yVar.ep = f6;
                return;
            }
        }
    }

    public boolean a(y yVar, float f, float f2, boolean z, boolean z2, am amVar) {
        boolean z3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f3 = yVar.eo;
        float f4 = yVar.ep;
        yVar.eo = f;
        yVar.ep = f2;
        boolean c = yVar.c(gameEngine.playerTeam);
        if (com.corrodinggames.rts.gameFramework.emitter.a.a(gameEngine.playerTeam, yVar, this.ad)) {
            c = false;
        }
        if (amVar != null && amVar != null && (amVar instanceof y)) {
            y yVar2 = (y) amVar;
            if (!yVar2.aR()) {
                float a2 = com.corrodinggames.rts.gameFramework.f.a(yVar2.eo, yVar2.ep, yVar.eo, yVar.ep);
                float f5 = yVar2.f(yVar.mo1r());
                if (f5 > 800000.0f) {
                    z3 = true;
                } else {
                    z3 = a2 <= f5 * f5;
                }
                if (!z3) {
                    c = false;
                }
            }
        }
        boolean z4 = yVar.cp;
        yVar.cp = true;
        yVar.cs = c;
        yVar.ct = !c;
        yVar.cr = z2;
        if (z) {
            gameEngine.bO.k();
            gameEngine.R();
            yVar.d(0.0f);
            yVar.c(0.0f);
            yVar.a(0.0f, false);
            float m = yVar.m();
            if (m > 30.0f) {
                com.corrodinggames.rts.gameFramework.utility.y.a((am) yVar, m, true, true);
            }
            yVar.cb();
            if (!z2) {
                yVar.N(-1);
            }
            gameEngine.bO.l();
        }
        yVar.eo = f3;
        yVar.ep = f4;
        yVar.cr = false;
        yVar.cp = z4;
        return c;
    }

    public void G() {
        l();
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.dq = true;
        gameEngine.stats.c();
        if (gameEngine.by < 1500 && gameEngine.bS.f != null) {
            gameEngine.dr = true;
        }
        this.k.a(0.0f);
        this.k.c();
    }

    public void H() {
        l();
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.dt = true;
        gameEngine.stats.c();
        this.k.a(0.0f);
        this.k.c();
    }

    public void I() {
        l();
        this.aa = null;
        this.ac = this.p;
    }

    public void a(String str, Rect rect, Paint paint, Paint paint2) {
        String[] c;
        Paint paint3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        for (String str2 : com.corrodinggames.rts.gameFramework.f.c(str, '\n')) {
            if (i == 0) {
                paint3 = paint;
            } else {
                paint3 = paint2;
            }
            Paint paint4 = paint3;
            int a2 = d.a(paint4);
            gameEngine.bO.a(str2, rect.d(), rect.b + (a2 / 2) + (i * a2), paint4);
            i++;
        }
    }

    public boolean a(s sVar, boolean z, am amVar, boolean z2, boolean z3) {
        return a(sVar, z, amVar, z2, false, -1.0f, z3);
    }

    public boolean a(s sVar, boolean z, am amVar, boolean z2, boolean z3, float f, boolean z4) {
        int i;
        int a2;
        Paint paint;
        Paint paint2;
        int a3;
        int a4;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        String d;
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = null;
        boolean z5 = false;
        boolean z6 = true;
        if (GameEngine.aw()) {
            z6 = false;
        }
        if (amVar != null && sVar.l(amVar)) {
            z6 = false;
        }
        if (z4) {
            z6 = false;
        }
        boolean z7 = false;
        boolean z8 = false;
        if (a.a(sVar)) {
            z7 = true;
            z8 = true;
        }
        if (c(sVar)) {
            z7 = true;
            str = this.bH;
            String d2 = d(sVar);
            if (d2 != null) {
                str = d2;
            }
        }
        if (!z7 && z2 && (d = d(sVar)) != null) {
            str = d;
        }
        if (str == null) {
            float b = this.g.b(sVar);
            if (b > 0.0f) {
                str = com.corrodinggames.rts.gameFramework.f.h(b / 1000.0f);
            }
        }
        String f2 = f(sVar);
        boolean z9 = f2 != null;
        if (f2 != null) {
        }
        if (z2 && str == null && f2 != null) {
            str = this.bI.b();
        }
        ae aeVar = new ae();
        aeVar.d = this.aQ;
        aeVar.e = this.aR;
        ag agVar = null;
        if (z9) {
            agVar = this.aS;
        }
        aeVar.a(true);
        sVar.a(amVar, aeVar, null, agVar);
        if (str != null) {
            aeVar.a("\n" + str, this.aS);
        }
        aeVar.a(false);
        sVar.a(amVar, aeVar);
        if (z8) {
            aeVar.b();
            aeVar.a(this.bG, this.aR);
        }
        this.bv.a = 20;
        int i2 = (int) ((gameEngine.cl - gameEngine.cq) - 20);
        this.bv.c = i2;
        boolean z10 = gameEngine.settingsEngine.showActionInfoHoverNearMouse;
        if (z) {
            i = (int) (gameEngine.cp - 40.0f);
        } else {
            i = 40;
        }
        if (GameEngine.au() && f > 0.0f) {
            i = (int) f;
            z5 = true;
        }
        if (GameEngine.av() && z10 && z3) {
            i = (int) (gameEngine.ag() - 40.0f);
        }
        this.bv.b = i;
        this.bv.d = this.bv.b;
        boolean z11 = true;
        boolean z12 = true;
        int i3 = 7;
        if (GameEngine.av()) {
            if (!z10) {
                z11 = false;
                z12 = false;
            } else if (!z3) {
                z12 = false;
                z11 = true;
                i3 = 20;
            }
        } else if (!z) {
            z12 = false;
        }
        if (!GameEngine.av() || z || !z10 || !z3) {
        }
        if (str != null) {
        }
        ag agVar2 = this.aR;
        if (z2) {
            ag agVar3 = this.aS;
        }
        aj a5 = aeVar.a(this.bv.b(), z11);
        float d3 = this.bv.d();
        this.bv.a = (int) (d3 - (a5.b.b() / 2));
        this.bv.c = (int) (d3 + (a5.b.b() / 2));
        this.bv.d = this.bv.b + a5.b.c();
        if (z11) {
            this.bv.a = (int) (rect3.a - (i3 * gameEngine.cj));
            this.bv.c = (int) (rect4.c + (i3 * gameEngine.cj));
        }
        if (z12) {
            this.bv.a((int) ((i2 - (7.0f * gameEngine.cj)) - this.bv.c), 0);
        }
        this.bw.a(this.bv);
        this.bw.b -= 20;
        this.bw.d += 15;
        int i4 = -1;
        if (amVar != null) {
            i4 = sVar.b(amVar, true);
        }
        if (amVar != null && z6 && i4 != -1) {
            this.bw.d = (int) (rect2.d + (55.0f * gameEngine.cj));
        }
        if (this.bw.d > gameEngine.cm) {
            int i5 = (int) (gameEngine.cm - this.bw.d);
            this.bv.a(0, i5);
            this.bw.a(0, i5);
        }
        as mo3i = sVar.mo3i();
        if (!sVar.D()) {
            mo3i = null;
        }
        if (mo3i != null && amVar != null) {
            this.bw.b = (int) (rect.b - (40.0f * gameEngine.cj));
        }
        if (z5) {
            int i6 = -this.bv.c();
            this.bv.a(0, i6);
            this.bw.a(0, i6);
        }
        if (0 != 0) {
            int i7 = (int) ((gameEngine.cm - 30.0f) - this.bw.d);
            this.bw.a(0, i7);
            this.bv.a(0, i7);
        }
        if (this.bw.b < 0) {
            int i8 = 0 - this.bw.b;
            this.bw.a(0, i8);
            this.bv.a(0, i8);
        }
        if (this.bw.d > gameEngine.cm - 20.0f) {
            int i9 = (int) ((gameEngine.cm - 20.0f) - this.bw.d);
            this.bw.a(0, i9);
            this.bv.a(0, i9);
        }
        gameEngine.bO.b(this.bw, this.aP);
        gameEngine.bO.b(this.bw, this.aL);
        if (z7) {
        }
        if (mo3i != null && amVar != null) {
            ar.a(mo3i, this.bw.d(), this.bw.b + (22.0f * gameEngine.cj), this.Z, 0.0f, amVar.bX, 30.0f * gameEngine.cj, 100.0f * gameEngine.cj, false, false, sVar.t(), null);
        }
        a5.a(this.bv.d(), this.bv.b);
        if (amVar != null && i4 != -1 && z6) {
            float f3 = gameEngine.cj * 0.5f;
            int i10 = (int) (60.0f * f3);
            float b2 = c.b(amVar, sVar, true);
            if (!z7 || i4 > 0) {
                this.aK.b(-16777216);
                if (b2 != 0.0f) {
                    float b3 = com.corrodinggames.rts.gameFramework.f.b((com.corrodinggames.rts.gameFramework.f.c(b2) * 0.5f) - 0.4f, 0.0f, 1.0f);
                    if (b2 > 0.0f) {
                        a2 = Color.a(110, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                    } else {
                        a2 = Color.a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30, 30);
                    }
                    com.corrodinggames.rts.gameFramework.f.a(a2, this.aK.e(), b3);
                }
                float b4 = (this.bw.d - ((65.0f * f3) / 2.0f)) + (d.b(this.aK) / 2);
                if (b2 > 0.5d) {
                    b4 += 1.0f;
                }
                if (b2 < -0.5d) {
                    b4 -= 1.0f;
                }
                gameEngine.bO.a(VariableScope.nullOrMissingString + i4, this.bw.d(), b4, this.aK);
            }
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = !z7 && a(sVar, true);
            boolean z16 = i4 > 0 && sVar.d(amVar, true);
            int d4 = (int) (this.bw.d() + (60.0f * f3));
            int i11 = (int) (this.bw.d - (65.0f * f3));
            this.by.a(d4, i11, d4 + i10, i11 + i10);
            if (z15) {
                paint = this.bf;
            } else {
                paint = this.bg;
            }
            if (b2 > 0.0f) {
                float b5 = com.corrodinggames.rts.gameFramework.f.b((com.corrodinggames.rts.gameFramework.f.c(b2) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (b2 > 0.0f) {
                    a4 = Color.a(110, 210, 210, 210);
                } else {
                    a4 = Color.a(110, 210, 110, 110);
                }
                int a6 = com.corrodinggames.rts.gameFramework.f.a(a4, paint.e(), b5);
                paint = this.bA;
                paint.b(a6);
            }
            if (b2 > 0.5d) {
                this.by.a(0, 1);
            }
            gameEngine.bO.a(this.bh, this.by.a, this.by.b, paint, 0.0f, f3);
            com.corrodinggames.rts.gameFramework.f.a(this.by, this.by.b() * 0.8f);
            if (this.U && !this.T && !z8 && this.by.b((int) this.x, (int) this.y)) {
                this.U = false;
                z13 = true;
            }
            int d5 = (int) ((this.bw.d() - i10) - (60.0f * f3));
            int i12 = (int) (this.bw.d - (65.0f * f3));
            this.by.a(d5, i12, d5 + i10, i12 + i10);
            if (z16) {
                paint2 = this.bf;
            } else {
                paint2 = this.bg;
            }
            if (b2 < 0.0f) {
                float b6 = com.corrodinggames.rts.gameFramework.f.b((com.corrodinggames.rts.gameFramework.f.c(b2) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (b2 > 0.0f) {
                    a3 = Color.a(110, 210, 210, 210);
                } else {
                    a3 = Color.a(110, 210, 110, 110);
                }
                int a7 = com.corrodinggames.rts.gameFramework.f.a(a3, paint2.e(), b6);
                paint2 = this.bA;
                paint2.b(a7);
            }
            if (b2 < -0.5d) {
                this.by.a(0, 1);
            }
            gameEngine.bO.a(this.bi, this.by.a, this.by.b, paint2, 0.0f, f3);
            com.corrodinggames.rts.gameFramework.f.a(this.by, this.by.b() * 0.8f);
            if (this.U && !this.T && this.by.b((int) this.x, (int) this.y)) {
                this.U = false;
                z14 = true;
            }
            int i13 = 1;
            if ((z13 || z14) && sVar.g()) {
                if (a(gameEngine)) {
                    i13 = 5;
                }
                if (b(gameEngine)) {
                    i13 = 10;
                }
            }
            if (z13) {
                if (sVar.g() && gameEngine.playerTeam.x() <= gameEngine.playerTeam.w()) {
                    b(this.g.al);
                }
                if (z15) {
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.h, 0.5f);
                    c.a(amVar, sVar, false, true);
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    SyncPacket w = w();
                    if (a(gameEngine)) {
                        w.e = true;
                    }
                    a(w, sVar);
                    w.a(sVar.z());
                    a(sVar, (PointF) null, (am) null, w);
                }
            }
            if (z14) {
                if (z16) {
                    c.a(amVar, sVar, true, true);
                    gameEngine.bM.b(com.corrodinggames.rts.gameFramework.a.e.i, 0.5f);
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    SyncPacket w2 = w();
                    a(w2, sVar);
                    w2.g = true;
                    w2.a(sVar.z());
                }
            }
            if (!z13 && !z14 && this.U && !this.T && !this.bw.b((int) this.x, (int) this.y)) {
                return true;
            }
        }
        if (!z6 && GameEngine.au() && this.U && !this.T && !this.bw.b((int) this.x, (int) this.y)) {
            return true;
        }
        return false;
    }

    public void a(Rect rect, Paint paint, Paint paint2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (bO) {
            gameEngine.bO.a(this.bl, rect, paint2, rect.a, rect.b, 0, 0);
            if (paint != null) {
                int f = paint.f() + 0;
                if (f > 255) {
                    f = 255;
                }
                paint.c(f);
            }
        }
        if (paint != null) {
            gameEngine.bO.b(rect, paint);
        }
    }

    public void a(Rect rect, int i, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.bF.b(i);
        this.bF.a(Paint.Style.STROKE);
        this.bF.a(1.0f);
        gameEngine.bO.b(rect, this.bF);
        if (this.bN) {
            this.bF.b(Color.a(255, 116, 136, 160));
            int i2 = 1;
            if (z && rect.b() > 100) {
                i2 = 2;
            }
            this.bF.a(i2);
            this.bz.a(rect);
            this.bz.d -= i2;
            this.bz.b += i2;
            this.bz.a += i2;
            this.bz.c -= i2;
            gameEngine.bO.b(this.bz, this.bF);
        }
    }

    public void a(int i, int i2, int i3, int i4, String str, int i5, Paint paint, boolean z, com.corrodinggames.rts.gameFramework.Interface.a.h hVar, com.corrodinggames.rts.gameFramework.Interface.a.i iVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.bx.a(i, i2, i + i3, i2 + i4);
        this.bF.b(i5);
        if (hVar != null) {
            hVar.a(gameEngine.bO, this.bx, iVar);
        } else if (!z) {
            this.bF.a(Paint.Style.FILL);
            gameEngine.bO.b(this.bx, this.bF);
        } else {
            a(this.bx, (Paint) null, this.bF);
        }
        if (hVar == null) {
            int a2 = Color.a(255, 0, 0, 0);
            if (bO) {
                a2 = Color.a(100, 0, 0, 0);
            }
            a(this.bx, a2, false);
        }
        a(i, i2, i3, i4, str, i5, paint);
    }

    public void a(int i, int i2, int i3, int i4, String str, int i5, Paint paint) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.bx.a(i, i2, i + i3, i2 + i4);
        if (GameEngine.aW) {
            gameEngine.bO.a(str, this.bx.d(), this.bx.e() + (gameEngine.bO.a(str, paint) / 2), paint);
        } else {
            gameEngine.bO.a(str, this.bx.d(), this.bx.e() - ((paint.l() + paint.m()) / 2.0f), paint);
        }
    }

    public boolean J() {
        if (this.T) {
            return false;
        }
        return true;
    }

    public boolean a(int i, int i2, int i3, int i4, String str, i iVar, boolean z, int i5) {
        return a(i, i2, i3, i4, str, iVar, z, i5, this.aC, false, null);
    }

    public boolean b(int i, int i2, int i3, int i4, String str, i iVar, boolean z, int i5) {
        return a(i, i2, i3, i4, str, iVar, z, i5, this.aC, true, null);
    }

    public boolean a(int i, int i2, int i3, int i4, String str, i iVar, boolean z, int i5, Paint paint, com.corrodinggames.rts.gameFramework.Interface.a.h hVar) {
        return a(i, i2, i3, i4, str, iVar, z, i5, paint, false, hVar);
    }

    public boolean a(int i, int i2, int i3, int i4, String str, i iVar, boolean z, int i5, Paint paint, boolean z2, com.corrodinggames.rts.gameFramework.Interface.a.h hVar) {
        boolean a2 = a(i, i2, i3, i4, iVar);
        boolean a3 = a(i, i2, i3, i4, iVar, z);
        com.corrodinggames.rts.gameFramework.Interface.a.i iVar2 = com.corrodinggames.rts.gameFramework.Interface.a.i.normal;
        if (a2) {
            iVar2 = com.corrodinggames.rts.gameFramework.Interface.a.i.hovered;
        }
        a(i, i2, i3, i4, str, i5, paint, z2, hVar, iVar2);
        return a3;
    }

    public void a(Rect rect) {
        if (rect.b((int) this.z, (int) this.A)) {
            this.L = true;
            this.M = true;
            if (this.V) {
                this.K = true;
            }
        }
    }

    public void a(float f, float f2, float f3, float f4) {
        this.cc.a((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        a(this.cc);
    }

    public boolean a(int i, int i2, int i3, int i4, i iVar, boolean z) {
        a(i, i2, i3, i4);
        this.bx.a(i, i2, i + i3, i2 + i4);
        if (((z && this.I) || this.U) && this.bx.b((int) this.x, (int) this.y)) {
            return true;
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, i iVar) {
        this.bx.a(i, i2, i + i3, i2 + i4);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.aw() && gameEngine.settingsEngine.mouseSupport && this.bx.b((int) gameEngine.af(), (int) gameEngine.ag())) {
            return true;
        }
        return false;
    }

    public boolean b(int i, int i2, int i3, int i4, i iVar) {
        this.bx.a(i, i2, i + i3, i2 + i4);
        if (this.V && this.bx.b((int) this.x, (int) this.y)) {
            return true;
        }
        return false;
    }

    public float r(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (amVar.cH < gameEngine.bA && amVar.cH + 200 > gameEngine.bA) {
            return (1.0f - ((gameEngine.bA - amVar.cH) / 200.0f)) * 6.0f;
        }
        return GameEngine.getGameEngine().dx;
    }

    public void a(com.corrodinggames.rts.gameFramework.Interface.a.f fVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        fVar.u_();
        fVar.c(gameEngine.co);
        fVar.d(gameEngine.cp);
        this.s.a(fVar);
    }

    public static void K() {
        cd++;
        ce = true;
    }
}
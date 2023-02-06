package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.d;
import com.corrodinggames.rts.game.units.a.g;
import com.corrodinggames.rts.game.units.a.n;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.t;
import com.corrodinggames.rts.game.units.a.u;
import com.corrodinggames.rts.game.units.a.y;
import com.corrodinggames.rts.game.units.a.z;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.c;
import com.corrodinggames.rts.game.units.custom.d.b;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.h;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.a.i;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.ad;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.aa;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a.class */
public class a extends bq {
    InterfaceEngine a;
    GameEngine b;
    public boolean e;
    public float f;
    ag n;
    ag o;
    Paint q;
    Paint r;
    boolean D;
    float E;
    float F;
    float G;
    int H;
    boolean I;
    float J;
    float K;
    float L;
    float M;
    float N;
    float O;
    int P;
    float Q;
    float R;
    static Paint Y = new Paint();
    static PorterDuffColorFilter Z = new PorterDuffColorFilter(Color.a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
    am aa;
    s ab;
    float ac;
    long ad;
    float ae;
    float af;
    String ag;
    String ah;
    String ai;
    String aj;
    String ak;
    public String al;
    public float ao;
    public boolean ap;
    float aC;
    public boolean c = false;
    public boolean d = false;
    Paint g = new Paint();
    Paint h = new Paint();
    Paint i = new Paint();
    Paint j = new Paint();
    Paint k = new Paint();
    Paint l = new Paint();
    Paint m = new Paint();
    Paint p = new Paint();
    Rect s = new Rect();
    RectF t = new RectF();
    Rect u = new Rect();
    Rect v = new Rect();
    Rect w = new Rect();
    RectF x = new RectF();
    RectF y = new RectF();
    Rect z = new Rect();
    RectF A = new RectF();
    Rect B = new Rect();
    RectF C = new RectF();
    e S = null;
    e T = null;
    e U = null;
    e V = null;
    e W = null;
    e X = null;
    String am = null;
    float an = 0.0f;
    ArrayList aq = new ArrayList();
    y ar = new y(false);
    y as = new y(true);
    d at = new d();
    ArrayList au = new ArrayList();
    ArrayList av = new ArrayList();
    m aw = new m();
    ArrayList ax = new ArrayList();
    RectF ay = new RectF();
    HashMap az = new HashMap();
    ArrayList aA = new ArrayList();
    Rect aB = new Rect();
    v aD = new v();

    a(GameEngine gameEngine, InterfaceEngine interfaceEngine) {
        this.a = interfaceEngine;
        this.b = gameEngine;
        b();
    }

    public void a() {
        this.ag = com.corrodinggames.rts.gameFramework.translations.a.a("gui.unselectall", new Object[0]);
        this.ah = com.corrodinggames.rts.gameFramework.translations.a.a("gui.common.allyUnit", new Object[0]);
        this.ai = com.corrodinggames.rts.gameFramework.translations.a.a("gui.common.enemyUnit", new Object[0]);
        this.aj = com.corrodinggames.rts.gameFramework.translations.a.a("gui.common.neutralUnit", new Object[0]);
        this.ak = com.corrodinggames.rts.gameFramework.translations.a.a("gui.infoText.ownedBy", new Object[0]);
        this.al = com.corrodinggames.rts.gameFramework.translations.a.a("gui.infoText.unitCapReached", new Object[0]);
    }

    public void b() {
        a();
        this.S = this.b.bO.a(AssetsID.drawable.zoom_button);
        this.T = this.b.bO.a(AssetsID.drawable.lock_icon_menu);
        this.U = this.b.bO.a(AssetsID.drawable.pause);
        this.V = this.b.bO.a(AssetsID.drawable.replay_pause);
        this.W = this.b.bO.a(AssetsID.drawable.fast);
        this.X = this.b.bO.a(AssetsID.drawable.replay_leaderboard);
        Y.a(255, 30, 30, 30);
        Y.a(Z);
        Y.d(true);
        this.q = new Paint();
        this.q.a(255, 255, 255, 255);
        this.q.a(Paint.Align.LEFT);
        this.q.c(true);
        this.q.a(true);
        this.r = new Paint();
        this.r.a(255, 255, 255, 255);
        this.r.a(Paint.Align.LEFT);
        this.r.c(true);
        this.r.a(true);
        this.n = new ag();
        this.n.b(Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.n.o();
        this.o = new ag();
        this.o.b(Color.a(133, 255, 255, 255));
        this.o.o();
        this.aA.clear();
        int i = 0;
        while (i < 10) {
            this.aA.add(new am(this, i < 3));
            i++;
        }
    }

    private float p() {
        float f = 4.6f / this.b.cY;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    private float q() {
        return r() / this.b.cY;
    }

    private float r() {
        if (this.b.cF / this.b.bL.i() < this.b.cH / this.b.bL.j()) {
            return this.b.cF / this.b.bL.i();
        }
        return this.b.cH / this.b.bL.j();
    }

    void a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.b.settingsEngine.showZoomButton) {
            float f6 = this.b.cj * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.b.cp;
            float c = com.corrodinggames.rts.gameFramework.l.a.c();
            if (c > 20.0f) {
                i = (int) (i + (c - 20.0f));
            }
            if (this.D) {
                this.s.a(i - 4, (int) (i2 - (50.0f * this.b.cj)), i + 4, (int) (i2 + (50.0f * this.b.cj)));
                this.i.a();
                this.i.b(Color.a(255, 0, 0, 0));
                this.b.bO.b(this.s, this.i);
            }
            float f7 = i2;
            if (this.b.cV > 1.0f) {
                f5 = f7 - (((this.b.cV - 1.0f) * 3.0f) * this.b.cj);
            } else {
                f5 = f7 + (((this.b.cV * (-20.0f)) + 20.0f + 1.0f) * this.b.cj);
            }
            float f8 = 48.0f * f6;
            float f9 = 54.0f * f6;
            float f10 = f8 / 2.0f;
            float f11 = f9 / 2.0f;
            if (f5 < f11) {
                f5 = f11;
            }
            if (f5 > this.b.cm - f11) {
                f5 = (int) (this.b.cm - f11);
            }
            this.s.a((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.D) {
                Y.a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                Y.a(255, 255, 255, 255);
            }
            this.b.bO.a(this.S, this.s.a, this.s.b, Y, 0.0f, f6);
            boolean z = this.D;
            if (!this.D && this.a.b(this.s.a, this.s.b, this.s.b(), this.s.c(), i.zoomButton)) {
                this.D = true;
                this.E = this.a.y;
            }
            if (!this.a.I) {
                this.D = false;
            }
            if (this.D) {
                this.F += f;
                this.a.d();
                float f12 = this.a.y - this.E;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.b.cV;
                if (f13 > 2.0f) {
                    this.b.cV -= (5.0E-4f * f.c(f13)) * f;
                    this.b.cW = false;
                    if (this.b.cV < q()) {
                        this.b.cV = q();
                        this.b.cW = true;
                    }
                } else if (f13 < -2.0f) {
                    this.b.cV += 5.0E-4f * f.c(f13) * f;
                    this.b.cW = false;
                    if (this.b.cV > p()) {
                        this.b.cV = p();
                        this.b.cW = true;
                    }
                }
            } else {
                if (!z || this.F < 12.0f) {
                }
                this.F = 0.0f;
            }
        }
        if (this.b.settingsEngine.mouseSupport) {
            if (this.a.a(this.b.af(), this.b.ag()) && !this.a.L) {
                int ai = this.b.ai();
                if (ai != 0) {
                    this.G += (ai / 120.0f) * 0.18f;
                }
                if (this.G > 1.0f) {
                    this.G = 1.0f;
                }
                if (this.G < -1.0f) {
                    this.G = -1.0f;
                }
            }
            if (this.G != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.G < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.G * 0.18f * f);
                float f16 = this.G;
                this.G = f.a(this.G, f.c(f15));
                if (this.G == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.b.cV;
                this.b.cV += f17;
                this.b.cZ = true;
                this.b.da = this.b.af();
                this.b.db = this.b.ag();
                if (f17 != 0.0f) {
                    this.b.cW = false;
                }
            }
        }
        if (this.b.settingsEngine.gestureZoom && this.b.ac() && this.b.ae() >= 3) {
            this.R = 20.0f;
        }
        if (this.R < 10.0f) {
            this.I = false;
        }
        if (this.R > 0.0f) {
            this.R = f.a(this.R, f);
            boolean z2 = this.b.ac() && this.b.ae() >= 3;
            this.a.aU = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.b.ae(); i3++) {
                    f18 += this.b.b(i3);
                    f19 += this.b.c(i3);
                }
                f2 = f18 / this.b.ae();
                f3 = f19 / this.b.ae();
                f4 = 0.0f;
                for (int i4 = 0; i4 < this.b.ae(); i4++) {
                    f4 += f.b(f2, f3, this.b.b(i4), this.b.c(i4));
                }
            } else {
                f2 = this.M;
                f3 = this.N;
                f4 = this.O;
            }
            if (this.I && this.P != this.b.ae()) {
                this.I = false;
            }
            if (!this.I && z2) {
                this.I = true;
                this.J = f2;
                this.K = f3;
                this.L = f4;
                this.Q = this.b.cV;
                this.M = f2;
                this.N = f3;
                this.O = f4;
                this.P = this.b.ae();
            }
            if (z2) {
                float f20 = (this.N - f3) * 2.0f * this.b.cV;
                this.b.cV += (f20 / 250.0f) / this.b.cj;
                this.b.cW = false;
                float f21 = this.O - f4;
                if (0 != 0) {
                    this.b.cV -= (f21 / 350.0f) / this.b.cj;
                    this.b.cW = false;
                }
                this.M = f2;
                this.N = f3;
                this.O = f4;
                this.P = this.b.ae();
                for (int i5 = 0; i5 < this.b.ae(); i5++) {
                    this.b.bO.a(f2, f3, this.b.b(i5), this.b.c(i5), this.a.aN);
                }
                this.b.bO.a(f2, f3, f2, this.K, this.a.aO);
                this.b.bO.a(f2, f3, 6.0f, this.a.aN);
            }
        }
        if (this.b.cV > p()) {
            this.b.cV = p();
            this.b.cW = true;
        }
        if (this.b.cV < q()) {
            this.b.cV = q();
            this.b.cW = true;
        }
    }

    void b(float f) {
        this.e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (GameEngine.aw()) {
            i = 14;
        }
        if (this.b.ac() && this.a.ac == null) {
            boolean c = this.a.c(this.b);
            int i2 = 1;
            if (this.b.settingsEngine.mouseOrders == 2) {
                i2 = 2;
            }
            int f2 = this.b.f(i2);
            if (c || (this.b.settingsEngine.mouseSupport && f2 != -1 && !this.a.J && !this.a.K)) {
                float b = this.b.b(0);
                float c2 = this.b.c(0);
                if (f2 != -1) {
                    b = this.b.b(f2);
                    c2 = this.b.c(f2);
                }
                if (!this.c) {
                    z2 = true;
                    this.y.a = (int) b;
                    this.y.b = (int) c2;
                }
                this.y.c = (int) b;
                this.y.d = (int) c2;
                if (Math.abs(this.y.a - this.y.c) > i || Math.abs(this.y.b - this.y.d) > i) {
                    this.d = true;
                }
                z = true;
            } else if (this.b.ae() == 2 && this.R == 0.0f) {
                this.y.a = (int) this.b.b(0);
                this.y.b = (int) this.b.c(0);
                this.y.c = (int) this.b.b(1);
                this.y.d = (int) this.b.c(1);
                this.d = false;
                z = true;
            }
            if (z) {
                this.f += f;
                if (this.f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f = 0.0f;
            }
            if (z) {
                this.c = true;
                if (Math.abs(this.y.a - this.y.c) > i || Math.abs(this.y.b - this.y.d) > i) {
                    this.z.d = (int) this.y.d;
                    this.z.b = (int) this.y.b;
                    this.z.a = (int) this.y.a;
                    this.z.c = (int) this.y.c;
                    f.a(this.z);
                    this.g.b(Color.a(255, 0, 255, 0));
                    this.g.a(Paint.Style.STROKE);
                    this.g.a(1.0f);
                    this.b.bO.b(this.z, this.g);
                    this.e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.c && !z) {
            if (z3 && this.b.ae() == 3) {
                z5 = true;
            } else {
                z4 = true;
            }
        }
        if (z5) {
            this.d = false;
            this.c = false;
        }
        if ((z && !z3) || z4) {
            if (z2) {
                Iterator it = w.er.iterator();
                while (it.hasNext()) {
                    w wVar = (w) it.next();
                    if (wVar instanceof c) {
                        c cVar = (c) wVar;
                        cVar.cI = cVar.cG;
                    }
                }
            }
            if (z4) {
                this.d = false;
                this.c = false;
            }
            this.A.a(this.y);
            f.a(this.A);
            if (Math.abs(this.A.a - this.A.c) > i || Math.abs(this.A.b - this.A.d) > i) {
                this.A.d /= this.b.cX;
                this.A.b /= this.b.cX;
                this.A.a /= this.b.cX;
                this.A.c /= this.b.cX;
                this.A.a(this.b.cu, this.b.cv);
                this.a.aU = 4.0f;
                this.a.aV = 40.0f;
                this.a.U = false;
                boolean a = this.a.a(this.b);
                boolean b2 = this.a.b(this.b);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.b.settingsEngine.smartSelection_v2) {
                    Iterator it2 = w.er.iterator();
                    while (it2.hasNext()) {
                        w wVar2 = (w) it2.next();
                        if (wVar2 instanceof com.corrodinggames.rts.game.units.y) {
                            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) wVar2;
                            if (a(yVar) && (!a || !yVar.cI)) {
                                if (!yVar.bI()) {
                                    z6 = false;
                                }
                                if (yVar.aS() && yVar.l()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (b2) {
                    z6 = true;
                }
                Iterator it3 = w.er.iterator();
                while (it3.hasNext()) {
                    w wVar3 = (w) it3.next();
                    if (wVar3 instanceof c) {
                        c cVar2 = (c) wVar3;
                        boolean z9 = false;
                        if (a(cVar2)) {
                            z9 = true;
                            if (!z6 && cVar2.bI()) {
                                z9 = false;
                            }
                            if (!z7 && cVar2.ak() && !cVar2.l()) {
                                z9 = false;
                            }
                        }
                        if (b2) {
                            if (z9) {
                                z9 = !cVar2.cI;
                            } else if (cVar2.cI) {
                                z9 = true;
                            }
                        } else if (a && cVar2.cI) {
                            z9 = true;
                        }
                        if (z9) {
                            this.a.j(cVar2);
                            if (z4 && cVar2.cH + 900 < this.b.bA && ((!a && !b2) || !cVar2.cI)) {
                                z8 = true;
                            }
                        } else {
                            this.a.l(cVar2);
                        }
                    }
                }
                if (z8) {
                    Iterator it4 = w.er.iterator();
                    while (it4.hasNext()) {
                        w wVar4 = (w) it4.next();
                        if (wVar4 instanceof c) {
                            ((c) wVar4).cH = this.b.bA;
                        }
                    }
                }
                this.a.E();
            }
        }
    }

    private boolean a(c cVar) {
        if (!cVar.bV && cVar.cN == null) {
            float f = cVar.eo;
            float f2 = cVar.ep - cVar.eq;
            if (f2 <= 0.0f) {
                f2 += cVar.eq;
            }
            if (this.A.b(f, f2)) {
                if ((this.a.m(cVar) || this.b.playerTeam.b()) && !cVar.t()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void a(String str, int i) {
        this.am = str;
        this.an = i;
    }

    public void b(String str, int i) {
        if (this.an <= 0.0f || str.equals(this.am)) {
            this.am = str;
            this.an = i;
        }
    }

    public void a(String str) {
        if (this.an > 0.0f && str.equals(this.am)) {
            this.an = 0.0f;
        }
    }

    public void c(float f) {
        if (this.an > 0.0f && this.am != null) {
            this.an = f.a(this.an, f);
            this.b.bO.a(this.am, this.b.co, this.b.cp, this.a.aD, this.a.aI, 8.0f);
        }
    }

    public static boolean a(s sVar) {
        return GameEngine.getGameEngine().ar && sVar.n_();
    }

    public void c() {
        this.H = 0;
    }

    public ad a(s sVar, int i, ArrayList arrayList) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!GameEngine.av()) {
            return null;
        }
        if (sVar.M() != null) {
            return sVar.M();
        }
        if ((sVar instanceof n) || (sVar instanceof d)) {
            return null;
        }
        if (sVar.f() == t.rally) {
            return gameEngine.bT.T;
        }
        if (sVar.e() == u.patrol) {
            return gameEngine.bT.Q;
        }
        if (sVar.e() == u.guardUnit) {
            return gameEngine.bT.P;
        }
        if (sVar.e() == u.reclaimTarget) {
            return gameEngine.bT.R;
        }
        if (sVar.f() == t.upgrade) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar2 = (s) it.next();
                if (sVar2 != sVar && sVar2.f() == t.upgrade && this.a.b(sVar2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return gameEngine.bT.S;
            }
        }
        t f = sVar.f();
        if (f == t.infoOnly || f == t.infoOnlyNoBox || f == t.infoOnlyStockpile) {
            return null;
        }
        ad adVar = null;
        ad[] adVarArr = gameEngine.bT.ag;
        if (this.H < adVarArr.length) {
            adVar = adVarArr[this.H];
            this.H++;
        }
        return adVar;
    }

    public ArrayList d() {
        this.au.clear();
        am[] a = this.a.bZ.a();
        int size = this.a.bZ.size();
        for (int i = 0; i < size; i++) {
            as mo1r = a[i].mo1r();
            if (!this.au.contains(mo1r)) {
                this.au.add(mo1r);
            }
        }
        return this.au;
    }

    public ArrayList a(am amVar, ArrayList arrayList) {
        m e;
        ArrayList N;
        int i = 0;
        this.aq.clear();
        int q = this.a.q();
        if (q == 0) {
            if (this.b.settingsEngine.showChatAndPingShortcuts && this.b.M()) {
                this.aq.add(0, this.a.q);
                this.aq.add(0, this.a.r);
            }
            return this.aq;
        }
        if (InterfaceEngine.bO && amVar != null && !(amVar instanceof h)) {
            this.aq.add(this.ar);
            this.aq.add(this.as);
        }
        if (amVar == null) {
        }
        if (amVar != null) {
            i = this.aq.size();
            if (amVar.cG) {
                if (this.a.m(amVar)) {
                    ArrayList N2 = amVar.N();
                    if (N2 != null) {
                        this.aq.addAll(N2);
                    }
                } else {
                    ArrayList N3 = amVar.N();
                    if (N3 != null) {
                        this.aq.addAll(N3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                am amVar2 = (am) arrayList.get(i2);
                if (this.a.m(amVar2) && ((amVar2.mo1r() != amVar.mo1r() || amVar2.V() != amVar.V()) && (N = amVar2.N()) != null)) {
                    Iterator it = N.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        boolean z = false;
                        Iterator it2 = this.aq.iterator();
                        while (it2.hasNext()) {
                            if (((s) it2.next()).N().equals(sVar.N())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.aq.add(sVar);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            am amVar3 = (am) arrayList.get(i3);
            if (this.a.m(amVar3) && (amVar3 instanceof com.corrodinggames.rts.game.units.y) && !((com.corrodinggames.rts.game.units.y) amVar3).aS()) {
                z2 = true;
            }
        }
        am e2 = e();
        if (!z2 && e2 != null && this.a.m(e2)) {
            this.aq.add(i, this.a.m);
            this.aq.add(i, this.a.n);
        }
        boolean z3 = false;
        if (InterfaceEngine.bO && (this.b.settingsEngine.showSelectedUnitsList || q == 1)) {
            z3 = true;
        }
        if (GameEngine.at() && q > 0) {
            z3 = true;
        }
        if (z3 && !(amVar instanceof h)) {
            if (q == 1 && e2 != null && (e = e2.e(true)) != null && e.size() > 0) {
                for (int i4 = 0; i4 < e.a; i4++) {
                    s sVar2 = (s) e.get(i4);
                    if (sVar2 instanceof g) {
                        g gVar = (g) sVar2;
                        Iterator it3 = this.aw.iterator();
                        while (it3.hasNext()) {
                            g gVar2 = (g) it3.next();
                            if (gVar2.a(gVar)) {
                                e.set(i4, gVar2);
                            }
                        }
                    }
                }
                this.aw.clear();
                Iterator it4 = e.iterator();
                while (it4.hasNext()) {
                    s sVar3 = (s) it4.next();
                    if (sVar3 instanceof g) {
                        this.aw.add((g) sVar3);
                    }
                    this.aq.add(sVar3);
                }
            }
            ArrayList d = d();
            this.av.clear();
            Iterator it5 = d.iterator();
            while (it5.hasNext()) {
                z d2 = ((as) it5.next()).d();
                d2.K();
                this.av.add(d2);
            }
            Collections.sort(this.av);
            if (InterfaceEngine.bO) {
                Collections.reverse(this.av);
            }
            Iterator it6 = this.av.iterator();
            while (it6.hasNext()) {
                z zVar = (z) it6.next();
                if (InterfaceEngine.bO) {
                    this.aq.add(0, zVar);
                } else {
                    this.aq.add(zVar);
                }
            }
        }
        return this.aq;
    }

    am e() {
        if (this.a.bZ.size() > 0) {
            return this.a.bZ.get(0);
        }
        return null;
    }

    am f() {
        am amVar = null;
        if (this.a.aX > 0) {
            am[] a = this.a.bZ.a();
            int i = 0;
            int size = this.a.bZ.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                am amVar2 = a[i];
                if (amVar2.cG) {
                    if (amVar == null) {
                        amVar = amVar2;
                    } else if (!a(amVar, amVar2)) {
                        amVar = null;
                        break;
                    } else if (amVar.V() > amVar2.V()) {
                        amVar = amVar2;
                    }
                }
                i++;
            }
        }
        return amVar;
    }

    public static boolean a(am amVar, am amVar2) {
        as mo1r = amVar.mo1r();
        as mo1r2 = amVar2.mo1r();
        if (mo1r == mo1r2) {
            return true;
        }
        if ((mo1r instanceof l) && (mo1r2 instanceof l)) {
            l lVar = (l) mo1r;
            l lVar2 = (l) mo1r2;
            if (lVar.fL.contains(mo1r2)) {
                return true;
            }
            if (lVar.fO != null && com.corrodinggames.rts.game.units.custom.g.a(lVar.fO, lVar2.x())) {
                return true;
            }
            if (lVar2.fO != null && com.corrodinggames.rts.game.units.custom.g.a(lVar2.fO, lVar.x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    ArrayList g() {
        this.ax.clear();
        am[] a = this.a.bZ.a();
        int size = this.a.bZ.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                this.ax.add((com.corrodinggames.rts.game.units.y) amVar);
            }
        }
        return this.ax;
    }

    float h() {
        return f.b((this.b.cm / 14.0f) / this.b.cj, 25.0f * this.b.cj, 40.0f * this.b.cj);
    }

    private boolean c(s sVar) {
        if (sVar.s()) {
            return true;
        }
        if (sVar instanceof g) {
            return this.a.m(((g) sVar).b);
        }
        ArrayList g = g();
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) it.next();
            if (yVar.a(N) != null && this.a.m(yVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(s sVar, ArrayList arrayList) {
        com.corrodinggames.rts.game.units.a.h hVar = null;
        if (sVar instanceof com.corrodinggames.rts.game.units.a.h) {
            hVar = (com.corrodinggames.rts.game.units.a.h) sVar;
        }
        if (hVar != null && hVar.d == InterfaceEngine.cd) {
            return hVar.e;
        }
        boolean b = b(sVar, arrayList);
        if (hVar != null) {
            hVar.d = InterfaceEngine.cd;
            hVar.e = b;
        }
        return b;
    }

    private boolean b(s sVar, ArrayList arrayList) {
        if (sVar.s()) {
            return true;
        }
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            if (!gVar.r(gVar.b)) {
                return false;
            }
            if (this.a.m(gVar.b) || gVar.a(gVar.b, this.b.playerTeam)) {
                return true;
            }
            return false;
        }
        com.corrodinggames.rts.game.units.a.c N = sVar.N();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            am amVar = (com.corrodinggames.rts.game.units.y) it.next();
            s a = amVar.a(N);
            if (a != null && a.r(amVar) && (this.a.m(amVar) || a.a(amVar, this.b.playerTeam))) {
                return true;
            }
        }
        return false;
    }

    private boolean c(s sVar, ArrayList arrayList) {
        if (sVar.s()) {
            return true;
        }
        if (sVar instanceof g) {
            g gVar = (g) sVar;
            if (gVar.a((am) gVar.b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            am amVar = (com.corrodinggames.rts.game.units.y) it.next();
            s a = amVar.a(sVar.N());
            if (a != null && a.a(amVar, true)) {
                return true;
            }
        }
        return false;
    }

    private float d(s sVar, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (sVar.o_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            am amVar = (com.corrodinggames.rts.game.units.y) it.next();
            s a = amVar.a(sVar.N());
            if (a != null) {
                float p = a.p(amVar);
                if (p > f) {
                    f = p;
                    i++;
                }
            }
        }
        return f;
    }

    private com.corrodinggames.rts.game.units.g.e d(s sVar) {
        float f = -1.0f;
        com.corrodinggames.rts.game.units.g.e eVar = null;
        if (sVar.o_()) {
            return null;
        }
        if (sVar instanceof g) {
            com.corrodinggames.rts.game.units.g.e b = com.corrodinggames.rts.game.units.g.e.b(((g) sVar).b, sVar.N());
            if (b != null) {
                if (-1.0f < b.a()) {
                    f = b.a();
                    eVar = b;
                }
            } else {
                return null;
            }
        }
        Iterator it = this.a.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.a(sVar.N()) == null) {
                    continue;
                } else {
                    com.corrodinggames.rts.game.units.g.e b2 = com.corrodinggames.rts.game.units.g.e.b(yVar, sVar.N());
                    if (b2 != null) {
                        if (f < b2.a()) {
                            f = b2.a();
                            eVar = b2;
                        }
                    } else {
                        return null;
                    }
                }
            }
        }
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    private float e(s sVar) {
        com.corrodinggames.rts.game.units.g.e d = d(sVar);
        if (d == null) {
            return 0.0f;
        }
        return d.c();
    }

    float b(s sVar) {
        com.corrodinggames.rts.game.units.g.e d = d(sVar);
        if (d == null) {
            return 0.0f;
        }
        return d.d();
    }

    int d(float f) {
        ArrayList a;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        ag agVar;
        Rect rect;
        Rect rect2;
        int a2;
        int ai;
        this.ap = false;
        int i = 1;
        if (InterfaceEngine.bP) {
            i = 2;
        }
        int i2 = 0;
        boolean z = false;
        c.a(f);
        ArrayList g = g();
        am f8 = f();
        ArrayList arrayList = null;
        if (this.a.ac != null) {
            arrayList = this.a.ac.q(f8);
        }
        if (arrayList != null) {
            a = arrayList;
        } else {
            a = a(f8, g);
        }
        if (f8 == null && a.size() > 0) {
            f8 = e();
            if (f8 == null && l.b != null) {
                f8 = am.c(l.b);
            }
        }
        this.a.t = false;
        if (a.contains(this.a.m)) {
            this.a.t = true;
        }
        if (f8 == null) {
            f8 = e();
        }
        boolean z2 = true;
        if (f8 == null) {
            this.ad = -1L;
        }
        if (f8 != null && a.size() > 0) {
            ArrayList arrayList2 = a;
            float f9 = 2.0f;
            float h = h();
            float f10 = 2.0f;
            float f11 = h + 2.0f;
            boolean z3 = false;
            if (!InterfaceEngine.bR) {
                f2 = this.b.bW.b() + 2;
                f3 = this.b.cl - this.b.bW.c;
                f4 = this.b.bW.c;
            } else {
                f2 = this.b.bW.b;
                f3 = this.b.bW.c;
                f4 = this.b.bW.c;
                z3 = true;
            }
            if (InterfaceEngine.bO) {
                h += 15.0f * this.b.cj;
                float f12 = f11 + (15.0f * this.b.cj);
                f9 = 2.0f * this.b.cj;
                if (GameEngine.au()) {
                    f9 = 2.0f * this.b.cj;
                }
                f11 = f12 + 2.0f;
                f10 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!InterfaceEngine.a) {
                boolean z4 = true;
                if (this.a.f != null && this.a.aX == 1 && this.a.f.cG) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + i() + 2.0f;
                }
            }
            int i3 = 0;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                if (a(sVar, g)) {
                    i3++;
                    float l = f11 * sVar.l();
                    int i4 = i;
                    if (sVar.m() > 0) {
                        i4 = sVar.m();
                    }
                    float f16 = f4 / i4;
                    boolean z5 = false;
                    if ((f14 + f16) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f13 > 0.0f && l + 0.1f < f13) {
                        z5 = true;
                    }
                    if (z5) {
                        f15 += f13;
                        f13 = 0.0f;
                        f14 = 0.0f;
                    }
                    if (f13 < l) {
                        f13 = l;
                    }
                    f14 += f16;
                }
            }
            if (f14 > 0.0f) {
                f15 += f13;
            }
            float f17 = f2 + f15;
            float f18 = f2;
            float f19 = f2 + 1.0f;
            if (this.b.settingsEngine.showUnitGroups) {
                f5 = this.b.cH - (34.0f * this.b.cj);
            } else {
                f5 = this.b.cH;
            }
            this.ad = f8.eh;
            float f20 = f19 - ((int) f8.br);
            float f21 = 0.0f;
            float f22 = 1.0f + (h * 0.25f);
            boolean z6 = f17 - f8.br > f5 + f22;
            boolean z7 = f8.br > f22;
            this.ap = z6 || z7;
            if (this.b.settingsEngine.mouseSupport && !this.a.a(this.b.af(), this.b.ag()) && (ai = this.b.ai()) != 0) {
                f21 = -(ai / 120.0f);
            }
            float f23 = 0.0f;
            if (f21 > 0.0f) {
                this.ao = (float) (this.ao + (0.5d * f11));
            }
            if (f21 < 0.0f) {
                this.ao = (float) (this.ao - (0.5d * f11));
            }
            if (z6) {
                this.s.a = (int) (f3 + 2.0f);
                this.s.c = (int) ((f3 + f4) - 2.0f);
                this.s.b = (int) (f5 - (h * 0.4f));
                this.s.d = (int) (this.s.b + (h * 0.4f));
                if (this.a.a(this.s.a, this.s.b, this.s.b(), this.s.c(), "\\/", i.none, false, Color.a(80, 100, 150, 100), this.a.aC, (com.corrodinggames.rts.gameFramework.Interface.a.h) null) && this.a.J()) {
                    f23 = 0.0f + (3.0f * f11);
                    this.a.U = false;
                }
                f5 -= (f11 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.s.a = (int) (f3 + 2.0f);
                this.s.c = (int) ((f3 + f4) - 2.0f);
                this.s.b = (int) f18;
                this.s.d = (int) (this.s.b + (h * 0.4f));
                if (this.a.a(this.s.a, this.s.b, this.s.b(), this.s.c(), "/\\", i.none, false, Color.a(80, 100, 150, 100), this.a.aC, (com.corrodinggames.rts.gameFramework.Interface.a.h) null) && this.a.J()) {
                    f23 -= 3.0f * f11;
                    this.a.U = false;
                }
                f18 += (f11 * 0.4f) + 2.0f;
            }
            this.b.bO.i();
            this.ay.a(0.0f, f18 - 1.0f, this.b.cl, f5 + 1.0f);
            this.b.bO.a(this.ay);
            if (GameEngine.au()) {
                if (this.ad != f8.eh) {
                    this.ae = 0.0f;
                    this.af = f8.br;
                } else if (this.ao != 0.0f) {
                    this.ae = this.ao;
                } else {
                    if (!this.a.I) {
                        this.ao += this.ae * f;
                    }
                    this.ae = f.a(this.ae, f);
                }
            }
            f8.br += this.ao + f23;
            this.ao = 0.0f;
            int i5 = (int) (f17 - f5);
            if (i5 > 0) {
                if (f8.br > i5 + 0.0f) {
                    f8.br = i5 + 0.0f;
                }
                if (f8.br < 0.0f - 0.0f) {
                    f8.br = 0.0f - 0.0f;
                }
            } else {
                f8.br = 0.0f;
            }
            int i6 = -1;
            float f24 = 0.0f;
            float f25 = 0.0f;
            float f26 = 0.0f;
            c();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                s sVar2 = (s) it2.next();
                if (a(sVar2, g)) {
                    i2++;
                    boolean c = c(sVar2, g);
                    i6++;
                    float l2 = h * sVar2.l();
                    int i7 = i;
                    if (sVar2.m() > 0) {
                        i7 = sVar2.m();
                    }
                    float f27 = f4 / i7;
                    if (!z3) {
                        f6 = l2;
                        f7 = f27;
                    } else {
                        f6 = f27;
                        f7 = l2;
                    }
                    boolean z8 = false;
                    if ((f26 + f7) - 0.1f > f4) {
                        z8 = true;
                    }
                    if (!z8 && f25 > 0.0f && f6 + 0.1f < f25) {
                        z8 = true;
                    }
                    if (z8) {
                        f24 += f25 + f10;
                        f25 = 0.0f;
                        f26 = 0.0f;
                    }
                    if (f25 < f6) {
                        f25 = f6;
                    }
                    if (!z3) {
                        this.s.a = (int) (f3 + f9);
                        this.s.c = (int) ((this.s.a + f27) - (f9 * 2.0f));
                        this.s.b = (int) (f24 + f20);
                        this.s.d = (int) (this.s.b + l2);
                        this.s.a((int) f26, 0);
                    } else {
                        this.s.a = (int) (f3 + f9 + f24);
                        this.s.c = (int) ((this.s.a + f27) - (f9 * 2.0f));
                        this.s.b = (int) f20;
                        this.s.d = (int) (this.s.b + l2);
                        this.s.a(0, (int) f26);
                    }
                    boolean z9 = true;
                    this.t.a(this.s);
                    if (!this.t.b(this.ay)) {
                        z9 = false;
                    }
                    f26 += f7;
                    t f28 = sVar2.f();
                    boolean z10 = false;
                    z10 = (f28 == t.infoOnly || f28 == t.infoOnlyNoBox || f28 == t.infoOnlyStockpile) ? true : true;
                    boolean a3 = a(sVar2);
                    boolean G = sVar2.G();
                    Paint paint = this.j;
                    boolean z11 = c;
                    if (f28 == t.infoOnlyStockpile) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.b(Color.a(70, 100, 100, 100));
                    } else {
                        paint.b(Color.a(50, 170, 100, 100));
                    }
                    if (a3) {
                        paint.b(Color.a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.aa == f8 && this.ab == sVar2) {
                        z12 = true;
                    }
                    if (this.a.ac == sVar2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.b(Color.a(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.b(Color.a(80, 100, 200, 100));
                    }
                    if (G) {
                        paint.c((int) (paint.f() * 0.7f));
                        agVar = this.o;
                    } else {
                        agVar = this.n;
                    }
                    float f29 = 0.0f;
                    if (z9) {
                        f29 = c.b(f8, sVar2, false);
                        if (sVar2.f() != t.infoOnlyNoBox) {
                            boolean a4 = this.a.a(sVar2);
                            float f30 = 0.0f;
                            if (a4) {
                                f30 = f.c(f.k((((float) (GameEngine.V() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f29 != 0.0f) {
                                float b = f.b((f.c(f29) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f29 > 0.0f) {
                                    a2 = Color.a(110, 210, 210, 210);
                                } else {
                                    a2 = Color.a(110, 210, 110, 110);
                                }
                                int a5 = f.a(a2, paint.e(), b);
                                paint = this.i;
                                paint.b(a5);
                            }
                            this.a.a(this.s, paint, agVar);
                            float d = d(sVar2, g);
                            if (d >= 0.0f) {
                                this.l.a(80, 0, 0, 100);
                                this.B.a(this.s);
                                this.B.c = (int) (rect2.c - ((1.0f - d) * this.B.b()));
                                this.b.bO.b(this.B, this.l);
                                this.m.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.b.bO.a(this.B.c, this.B.b, this.B.c, this.B.d, this.l);
                            } else {
                                float e = e(sVar2);
                                if (e > 0.0f) {
                                    this.l.a(80, 100, 0, 0);
                                    this.B.a(this.s);
                                    this.B.c = (int) (rect.c - ((1.0f - e) * this.B.b()));
                                    this.b.bO.b(this.B, this.l);
                                    this.m.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.b.bO.a(this.B.c, this.B.b, this.B.c, this.B.d, this.l);
                                }
                            }
                            int a6 = Color.a(255, 0, 0, 0);
                            if (InterfaceEngine.bO) {
                                a6 = Color.a(100, 0, 0, 0);
                                if (G) {
                                    a6 = Color.a(50, 155, 155, 155);
                                }
                            }
                            boolean z14 = false;
                            if (a4) {
                                z14 = true;
                                a6 = Color.a((int) (100.0f + (150.0f * f30)), 255, 255, 255);
                            }
                            this.a.a(this.s, a6, z14);
                        }
                    }
                    ad a7 = a(sVar2, i6, arrayList2);
                    if (a7 != null && z9) {
                        this.b.bO.a(a7.c(), this.s.a + 3, this.s.b + this.b.bO.a("A", this.a.az) + 1.0f, this.a.az);
                    }
                    boolean z15 = false;
                    as mo3i = sVar2.mo3i();
                    e j = sVar2.j();
                    am i8 = sVar2.i(f8);
                    if (i8 != null) {
                        mo3i = i8.mo1r();
                    }
                    if (j == null && mo3i != null) {
                        j = mo3i.z();
                    }
                    if (j != null) {
                        Rect v = sVar2.v();
                        if (v == null) {
                            v = this.B;
                            v.a(0, 0, j.m(), j.l());
                        }
                        float c2 = (this.s.c() * 0.7f) / v.c();
                        int d2 = (int) (this.s.d() - ((v.b() * 0.5f) * c2));
                        int e2 = (int) (this.s.e() - ((v.c() * 0.5f) * c2));
                        this.p.a(100, 255, 255, 255);
                        RectF rectF = this.C;
                        rectF.a(d2, e2, d2 + (v.b() * c2), e2 + (v.c() * c2));
                        this.b.bO.a(j, v, rectF, this.p);
                        z15 = true;
                    } else if (mo3i != null) {
                        float d3 = this.s.d();
                        float e3 = this.s.e();
                        if (f29 > 0.5d) {
                            e3 += 1.0f;
                        }
                        if (f29 < -0.5d) {
                            e3 -= 1.0f;
                        }
                        float c3 = this.s.c() * 0.7f;
                        float c4 = this.s.c() * 0.95f;
                        if (InterfaceEngine.bO) {
                            c3 = this.s.c() * 0.4f;
                            c4 = this.s.c() * 0.85f;
                        }
                        this.x.a(this.s);
                        if (this.x.b(this.ay)) {
                            this.b.bO.i();
                            this.b.bO.a(this.x);
                            ar.a(mo3i, d3, e3, 0.0f, 0.0f, f8.bX, c3, c4, false, false, sVar2.t(), i8);
                            if (i8 != null) {
                                float x = i8.x();
                                float bV = i8.bV();
                                if (bV != -1.0f && sVar2.t(f8)) {
                                    int b2 = f.b(200, 0, 0, 150);
                                    int b3 = f.b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint a8 = com.corrodinggames.rts.gameFramework.utility.y.a(b2, Paint.Style.FILL);
                                    Paint a9 = com.corrodinggames.rts.gameFramework.utility.y.a(b3, Paint.Style.STROKE);
                                    int b4 = ((int) (this.x.b() / 3.0f)) - 3;
                                    int i9 = b4 * 2;
                                    this.C.a(d3 - b4, e3 + 0, (d3 - b4) + (i9 * bV), e3 + 0 + 3);
                                    this.b.bO.a(this.C, a8);
                                    this.C.a(d3 - b4, e3 + 0, (d3 - b4) + i9, e3 + 0 + 3);
                                    this.b.bO.a(this.C, a9);
                                } else if (x != -1.0f && sVar2.s(f8)) {
                                    int b5 = f.b(200, 0, 150, 0);
                                    int b6 = f.b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint a10 = com.corrodinggames.rts.gameFramework.utility.y.a(b5, Paint.Style.FILL);
                                    Paint a11 = com.corrodinggames.rts.gameFramework.utility.y.a(b6, Paint.Style.STROKE);
                                    int b7 = ((int) (this.x.b() / 3.0f)) - 3;
                                    int i10 = b7 * 2;
                                    this.C.a(d3 - b7, e3 + 0, (d3 - b7) + (i10 * x), e3 + 0 + 3);
                                    this.b.bO.a(this.C, a10);
                                    this.C.a(d3 - b7, e3 + 0, (d3 - b7) + i10, e3 + 0 + 3);
                                    this.b.bO.a(this.C, a11);
                                }
                            }
                            this.b.bO.j();
                        }
                        z15 = true;
                    }
                    e h2 = sVar2.h(f8);
                    if (h2 != null) {
                        Rect v2 = sVar2.v();
                        if (v2 == null) {
                            v2 = this.B;
                            v2.a(0, 0, h2.m(), h2.l());
                        }
                        float c5 = (this.s.c() * 0.7f) / v2.c();
                        int d4 = (int) (this.s.d() - ((v2.b() * 0.5f) * c5));
                        int e4 = (int) (this.s.e() - ((v2.c() * 0.5f) * c5));
                        this.p.b(sVar2.J());
                        RectF rectF2 = this.C;
                        rectF2.a(d4, e4, d4 + (v2.b() * c5), e4 + (v2.c() * c5));
                        this.b.bO.a(h2, v2, rectF2, this.p);
                        z15 = true;
                    }
                    if (z9) {
                        String d5 = sVar2.d();
                        if (a3) {
                            this.b.bO.a(this.T, this.s.a + 25, this.s.g(), (Paint) null);
                        }
                        if (this.b.bO.b(d5, this.a.aC) > this.s.b() - 2) {
                            if (this.b.bO.b(d5, this.a.aB) > this.s.b() - 2) {
                                this.i.a(this.a.aA);
                            } else {
                                this.i.a(this.a.aB);
                            }
                        } else {
                            this.i.a(this.a.aC);
                        }
                        if (!z11) {
                            this.i.b(Color.a(255, 0, 100, 0));
                        }
                        if (f28 == t.rally) {
                            this.i.a(255, 255, 255, 255);
                        } else if (f28 == t.upgrade || f28 == t.action) {
                            if (!z11) {
                                this.i.a(255, 19, 101, 94);
                            } else {
                                this.i.a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (f28 == t.queueUnit) {
                            as mo3i2 = sVar2.mo3i();
                            if (mo3i2 != null && mo3i2.g() > 1) {
                                if (!z11) {
                                    this.i.a(255, 117, 120, 15);
                                } else {
                                    this.i.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.i.a(155, 255, 255, 255);
                        }
                        int a12 = this.b.bO.a(d5, this.i);
                        float g2 = this.s.g() + (a12 / 2);
                        if (z10) {
                            g2 = this.s.g();
                        }
                        if (z15 && !d5.contains("\n")) {
                            if (z10) {
                                g2 = (this.s.d - (a12 / 2)) - 1;
                            } else {
                                g2 = this.s.d - 6;
                            }
                        }
                        if (z10) {
                            aa.a(d5, this.s.f(), g2, this.i);
                        } else {
                            this.b.bO.a(d5, this.s.f(), g2, this.i);
                        }
                    }
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    if (a7 != null && a7.a()) {
                        z16 = true;
                        z18 = true;
                    }
                    this.u.a(this.s);
                    if (GameEngine.au()) {
                        f.b(this.u, 2.0f);
                    }
                    this.a.a(this.u.a, this.u.b, this.u.b(), this.u.c());
                    if (!this.d && this.u.b((int) this.a.z, (int) this.a.A) && this.ay.b((int) this.a.z, (int) this.a.A)) {
                        z = true;
                        if (GameEngine.av()) {
                            z17 = true;
                        }
                        if ((this.a.U || this.a.I) && this.a.U && this.a.J()) {
                            this.a.U = false;
                            z16 = true;
                        }
                    }
                    if (GameEngine.av() && this.a.ac == null) {
                        if (z17) {
                            this.aa = f8;
                            this.ab = sVar2;
                            this.ac = f24 + f20;
                        } else if (s.a(this.ab, sVar2)) {
                            this.aa = null;
                            this.ab = null;
                        }
                    }
                    boolean z19 = false;
                    if (z16 && !z18 && this.b.settingsEngine.mouseSupport && this.b.e(2)) {
                        z19 = true;
                    }
                    if (z16) {
                        InterfaceEngine.K();
                        if (sVar2.c(f8, z19)) {
                            z16 = false;
                        }
                        if (this.b.replayEngine.j()) {
                            z16 = false;
                        }
                        if (!c(sVar2)) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        if (sVar2.e() == u.none || sVar2.e() == u.popupQueue) {
                            this.a.ac = null;
                            boolean z20 = false;
                            if (z18) {
                                z20 = true;
                            } else if (!sVar2.u()) {
                                z20 = true;
                            } else {
                                if (sVar2.k(f8)) {
                                    z20 = true;
                                } else if (this.aa == f8 && s.a(this.ab, sVar2)) {
                                    z20 = true;
                                }
                                this.aa = f8;
                                this.ab = sVar2;
                                this.ac = f24 + f20;
                            }
                            if (z20) {
                                int i11 = 1;
                                if (sVar2.g()) {
                                    if (this.a.a(this.b)) {
                                        i11 = 5;
                                    }
                                    if (this.a.b(this.b)) {
                                        i11 = 10;
                                    }
                                }
                                boolean z21 = false;
                                if (!z18) {
                                    boolean z22 = false;
                                    if (f8 != null && sVar2.b(f8, false) != -1) {
                                        z22 = true;
                                    }
                                    if (z19 && z22) {
                                        z21 = true;
                                    }
                                }
                                if (a(sVar2)) {
                                    this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.8f);
                                } else if (!c && !z21) {
                                    this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.8f);
                                } else {
                                    boolean g3 = sVar2.g();
                                    if (g3 && !z21 && this.b.playerTeam.x() <= this.b.playerTeam.w()) {
                                        this.a.b(this.al);
                                    }
                                    if (g3) {
                                        if (!z21) {
                                            this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.h, 0.5f);
                                        } else {
                                            this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.i, 0.5f);
                                        }
                                    } else {
                                        this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.g, 0.8f);
                                    }
                                    c.a(f8, sVar2, z21, false);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        SyncPacket x2 = this.a.x();
                                        if (!sVar2.I()) {
                                            this.a.a(x2, sVar2);
                                        } else {
                                            this.a.a(x2, sVar2, z21);
                                        }
                                        if (z21) {
                                            x2.g = true;
                                        }
                                        x2.a(sVar2.z());
                                        if (!z21) {
                                            this.a.a(sVar2, (PointF) null, (am) null, x2);
                                        }
                                    }
                                }
                            }
                        } else if (sVar2.e() == u.patrol || sVar2.e() == u.guardUnit || sVar2.e() == u.pingMap) {
                            if (z19) {
                                if (sVar2 != null && sVar2.equals(this.a.ac)) {
                                    this.a.l();
                                }
                            } else if (!c) {
                                this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.8f);
                            } else {
                                c.a(f8, sVar2, false, false);
                                this.aa = null;
                                this.ab = null;
                                this.a.ac = sVar2;
                            }
                        } else if (sVar2.e() == u.setRally || sVar2.e() == u.reclaimTarget || sVar2.e() == u.repairTarget || sVar2.e() == u.targetGround) {
                            boolean z23 = false;
                            boolean z24 = false;
                            if (sVar2.e() == u.targetGround) {
                                z24 = true;
                            }
                            if (z19 && z24) {
                                z23 = true;
                            }
                            if (!z23) {
                                GameEngine.m5e("Clicked button: actionActive: " + c);
                                if (!c) {
                                    this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.8f);
                                } else {
                                    c.a(f8, sVar2, false, false);
                                    this.aa = null;
                                    this.ab = null;
                                    this.a.ac = sVar2;
                                }
                            } else {
                                SyncPacket x3 = this.a.x();
                                if (!sVar2.I()) {
                                    this.a.a(x3, sVar2);
                                } else {
                                    this.a.a(x3, sVar2, z23);
                                }
                                x3.g = true;
                                x3.a(sVar2.z());
                            }
                        } else if (sVar2.e() == u.placeBuilding) {
                            if (a(sVar2)) {
                                this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.8f);
                            } else if (!c) {
                                this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.l, 0.8f);
                            } else {
                                this.b.bM.b(com.corrodinggames.rts.gameFramework.a.e.g, 0.8f);
                            }
                            c.a(f8, sVar2, false, false);
                            this.aa = null;
                            this.ab = null;
                            if (this.a.ac == null) {
                                this.a.ai = false;
                            }
                            this.a.aa = f8;
                            this.a.ac = sVar2;
                            this.a.af = 0.0f;
                            this.a.aq = -99.0f;
                            this.a.ar = -99.0f;
                            if (!this.a.ae) {
                                this.a.ag = this.b.cI * this.b.cX;
                                this.a.ah = this.b.cJ * this.b.cX;
                            }
                            this.a.ae = true;
                            this.b.bL.e();
                        } else if (sVar2.e() == u.directToAction) {
                            c.a(f8, sVar2, false, false);
                            sVar2.c(f8);
                        } else if (sVar2.e() == u.infoOnly) {
                            if (sVar2.C()) {
                                this.aa = f8;
                                this.ab = sVar2;
                                this.ac = f24 + f20;
                                this.a.ac = null;
                            }
                        } else {
                            throw new RuntimeException("unknown gui action:" + sVar2.e());
                        }
                    }
                    if (this.ab == sVar2) {
                        z2 = c;
                    }
                }
            }
            this.b.bO.j();
            this.ay.f();
        }
        if (f8 != null && f8 == this.aa) {
            if (this.ab != null) {
                boolean z25 = true;
                if (GameEngine.av()) {
                    z25 = false;
                }
                boolean z26 = false;
                if (this.ab.u()) {
                    z26 = true;
                }
                if (GameEngine.av() && this.ab.h()) {
                    z26 = true;
                }
                if (z26) {
                    boolean z27 = true;
                    if (!z2) {
                        z27 = false;
                    }
                    if (this.a.a(this.ab, z25, this.aa, !z27, true, this.ac, false)) {
                        this.aa = null;
                    }
                }
            }
        } else {
            this.aa = null;
        }
        if (GameEngine.av() && !z) {
            this.aa = null;
            this.ab = null;
        }
        return i2;
    }

    float i() {
        return (float) (f.b((this.b.cm / 14.0f) / this.b.cj, 25.0f * this.b.cj, 40.0f * this.b.cj) * 0.9d);
    }

    void a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (InterfaceEngine.a) {
            z = false;
        }
        if (this.a.aX > 0) {
            if (this.a.f != null && this.a.aX == 1 && this.a.f.cG) {
                z = false;
            }
            if (z) {
                if (this.a.b((int) ((this.b.cl - this.b.bW.c) + 2.0f), this.b.bW.b() + 2, (int) (this.b.bW.c - 4.0f), (int) i(), this.ag, i.unselectAllButton, false, Color.a(140, 100, 100, 100)) && !this.a.T) {
                    this.a.d();
                    this.a.l();
                    this.a.y();
                }
            }
            PlayerData playerData = null;
            boolean z2 = false;
            this.az.clear();
            am amVar = null;
            am[] a = this.a.bZ.a();
            int size = this.a.bZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                am amVar2 = a[i2];
                if (amVar2.cG) {
                    amVar = amVar2;
                    if (this.a.m(amVar2)) {
                        as mo1r = amVar2.mo1r();
                        Integer num = (Integer) this.az.get(mo1r);
                        if (num == null) {
                            this.az.put(mo1r, 1);
                        } else {
                            this.az.put(mo1r, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        playerData = amVar2.bX;
                    }
                }
            }
            boolean z3 = this.b.bv;
            if (playerData != null && this.b.playerTeam != null && playerData.b(this.b.playerTeam)) {
                z3 = true;
            }
            int h = (int) h();
            int i3 = h + 2;
            int i4 = (int) (10.0f * this.b.cj);
            float b = this.b.bW.b() + h + 30;
            float f2 = (this.b.cl - this.b.cq) + i4;
            float f3 = b + 5.0f;
            if (amVar != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.a.t) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.s.a((int) f2, (int) f3, (int) ((f2 + this.b.cq) - (i4 * 2)), (int) (f3 + h));
            boolean z4 = false;
            if (!InterfaceEngine.bQ) {
                if (i < 3 && !z2 && playerData != null) {
                    Paint paint = this.a.aF;
                    if (this.b.playerTeam.d(playerData)) {
                        paint = this.a.aG;
                    }
                    this.a.a(a(playerData), this.s, paint, paint);
                    z4 = true;
                }
                if (this.a.q() == 1 && amVar != null) {
                    if (amVar.cq() <= 3 || (playerData != null && !z3)) {
                        String a2 = a(amVar, false);
                        if (z4) {
                            a2 = "\n" + ("\n" + ("\n" + a2));
                        }
                        Paint paint2 = this.i;
                        paint2.a();
                        paint2.b(Color.a(50, 100, 100, 100));
                        this.a.a(a2, this.s, this.a.aH, this.a.aH);
                    }
                }
            }
        }
    }

    public String a(PlayerData playerData) {
        String str = VariableScope.nullOrMissingString;
        boolean z = false;
        if (this.b.playerTeam.b()) {
            z = true;
        } else if (this.b.playerTeam.d(playerData)) {
            str = str + this.ah;
        } else if (this.b.playerTeam.c(playerData)) {
            str = str + this.ai;
        } else {
            z = true;
        }
        if (z) {
            if (playerData == PlayerData.i) {
                str = str + this.aj;
            } else {
                str = str + "Team - " + playerData.getPlayerTeamName();
            }
        }
        String str2 = str + "\n";
        if (playerData.name != null) {
            str2 = str2 + playerData.name;
        }
        if (!playerData.w && this.b.N() && playerData.isTimeOut()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    public String a(am amVar, boolean z) {
        String str;
        String str2 = VariableScope.nullOrMissingString;
        if (z) {
            str2 = str2 + amVar.mo1r().e() + "\n";
        }
        if (amVar.g() > 0.0f) {
            str = str2 + b.a(amVar.cM(), amVar.cu / amVar.cv).a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(amVar.cu)) + "/" + ((int) amVar.cv) + "\n";
        }
        if (amVar.cA != 0.0f) {
            str = str + "(" + ((int) amVar.cx) + "/" + ((int) amVar.cA) + ")\n";
        }
        b dq = amVar.dq();
        com.corrodinggames.rts.game.units.custom.e.f cz = amVar.cz();
        if (dq != null) {
            cz = com.corrodinggames.rts.game.units.custom.e.f.d(cz);
            cz.a(dq);
        }
        if (!cz.c()) {
            Iterator it = cz.b.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.custom.e.e eVar = (com.corrodinggames.rts.game.units.custom.e.e) it.next();
                if (eVar.b != 0.0d && !eVar.a.a()) {
                    str = str + eVar.a.a(eVar.b, true, false) + "\n";
                }
            }
        }
        return f.j(str);
    }

    public static String a(s sVar, boolean z) {
        String str;
        com.corrodinggames.rts.game.units.a.w wVar;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        if (sVar instanceof com.corrodinggames.rts.game.units.a.w) {
            if (((com.corrodinggames.rts.game.units.a.w) sVar).K() < 1.0f) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                float f = -1.0f;
                am[] a = gameEngine.bS.bZ.a();
                int size = gameEngine.bS.bZ.size();
                for (int i = 0; i < size; i++) {
                    float cx = a[i].cx();
                    if (f == -1.0f || cx < f) {
                        f = cx;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + f.h((1.0f / ((wVar.K() * f) * 60.0f)) + 1.0E-4f) + str;
            }
        }
        return f.a(str2, str);
    }

    public static String a(am amVar, boolean z, boolean z2, boolean z3) {
        String str;
        com.corrodinggames.rts.gameFramework.mod.b bVar;
        float f;
        if (z2) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        j jVar = null;
        l lVar = null;
        if (amVar instanceof j) {
            jVar = (j) amVar;
            lVar = jVar.x;
        }
        if (z) {
            str2 = str2 + amVar.mo1r().e() + str;
        }
        if (lVar == null || !lVar.aO) {
            if (!z3) {
                str2 = str2 + "HP: " + ((int) Math.ceil(amVar.cu)) + "/" + ((int) amVar.cv) + str;
            } else {
                str2 = str2 + "HP: " + ((int) amVar.cv) + str;
            }
        }
        if (amVar.cA != 0.0f) {
            if (!z3) {
                str2 = str2 + "Shield: " + ((int) amVar.cx) + "/" + ((int) amVar.cA) + str;
            } else {
                str2 = str2 + "Shield: " + ((int) amVar.cA) + str;
            }
        }
        if (jVar != null) {
            if (jVar.y.l >= 1.0f) {
                str2 = str2 + "Armour: " + ((int) f) + str;
            }
        }
        b dq = amVar.dq();
        float cy = amVar.cy();
        if (dq != null) {
            cy += dq.a();
        }
        if (cy != 0.0f) {
            if (cy < 0.0f) {
                str2 = str2 + "Income: -$" + f.a(-cy, 1) + str;
            } else {
                str2 = str2 + "Income: +$" + f.a(cy, 1) + str;
            }
        }
        if (amVar instanceof com.corrodinggames.rts.game.units.y) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
            if (yVar.bd() != 0.0f && !z3) {
                str2 = str2 + "Energy: " + f.g(amVar.cB) + "/" + f.g(yVar.bd()) + str;
            }
            float z4 = yVar.z();
            if (!yVar.aR()) {
                z4 = 0.0f;
            }
            if (z4 != 0.0f) {
                str2 = str2 + "Speed: " + f.g(z4) + str;
            }
            if (yVar.l()) {
                ArrayList aX = yVar.aX();
                if (aX.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z5 = true;
                    Iterator it = aX.iterator();
                    while (it.hasNext()) {
                        com.corrodinggames.rts.game.units.aa aaVar = (com.corrodinggames.rts.game.units.aa) it.next();
                        if (!z5) {
                            str3 = str3 + ", ";
                        }
                        z5 = false;
                        String str4 = str3 + f.g(aaVar.a);
                        if (aaVar.d > 1) {
                            str4 = str4 + "x" + aaVar.d;
                        }
                        str3 = str4 + "/" + f.g(aaVar.a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float m = yVar.m();
            if (!yVar.l()) {
                m = 0.0f;
            }
            if (m != 0.0f) {
                str2 = str2 + "Range: " + f.g(m) + str;
            }
            if (z3 && yVar.ck()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z3 && amVar.cU > 0) {
            str2 = str2 + "Kills: " + amVar.cU + str;
        }
        boolean z6 = false;
        if (GameEngine.getGameEngine().bl) {
            as mo1r = amVar.mo1r();
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + mo1r.i() + str;
            if ((mo1r instanceof l) && (bVar = ((l) mo1r).J) != null) {
                str2 = str2 + "(mod: " + f.a(bVar.a(), 30) + ")" + str;
            }
            if (amVar.eh != 0) {
                str2 = str2 + "id: " + amVar.eh + str;
            }
            if (amVar.cF != 0) {
                String str5 = VariableScope.nullOrMissingString;
                for (int i = 0; i < 32; i++) {
                    if (b.a(amVar.cF, i)) {
                        if (str5.length() > 0) {
                            str5 = str5 + ",";
                        }
                        str5 = str5 + i;
                    }
                }
                str2 = str2 + "flags: " + str5 + str;
            }
            if (amVar.cE != 0) {
                str2 = str2 + "ammo: " + amVar.cE + str;
            }
            if (!amVar.cp) {
                str2 = (str2 + "x: " + f.g(amVar.eo) + str) + "y: " + f.g(amVar.ep) + str;
            }
            if (amVar.cc != 0.0f || amVar.cd != 0.0f) {
                str2 = str2 + "x/y speed: " + f.g(amVar.cc) + ", " + f.g(amVar.cd) + str;
            }
            if (!amVar.cp) {
                str2 = (str2 + "height: " + f.g(amVar.eq) + str) + "dir: " + f.g(amVar.cg) + str;
            }
            if (amVar.cm < 1.0f) {
                str2 = str2 + "built: " + f.g(amVar.cm) + str;
            }
            if (amVar instanceof j) {
                j jVar2 = (j) amVar;
                str2 = (str2 + "frame: " + jVar2.a + str) + "drawLayer: " + jVar2.em + str;
                if (jVar2.de() != null) {
                    str2 = str2 + "tags: " + jVar2.de() + str;
                }
                if (jVar2.cO != null) {
                    str2 = str2 + "attachedTo: " + jVar2.cO.cB() + str;
                }
                if (jVar2.bu != null && !jVar2.bu.bV) {
                    str2 = str2 + "customTarget1: " + jVar2.bu.cB() + str;
                }
                if (jVar2.bv != null && !jVar2.bv.bV) {
                    str2 = str2 + "customTarget2: " + jVar2.bv.cB() + str;
                }
                if (jVar2.bA != -9999) {
                    str2 = str2 + "customTimer: " + f.h(jVar2.bA / 1000.0f) + str;
                }
                if (jVar2.bw != null && !jVar2.bw.isEmpty()) {
                    str2 = str2 + "-- memory --: " + str + jVar2.bw.debugMemory(true, true) + str;
                }
            }
            z6 = true;
        }
        com.corrodinggames.rts.game.units.custom.e.f df = amVar.df();
        if (df != null && !df.c()) {
            String a = df.a(z2, true, 10, z6, false);
            if (!a.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + a + str;
            }
        }
        return f.a(str2, str);
    }

    void j() {
        Iterator it = this.aA.iterator();
        while (it.hasNext()) {
            ((am) it.next()).h = true;
        }
    }

    void k() {
        Iterator it = this.aA.iterator();
        while (it.hasNext()) {
            ((am) it.next()).b();
        }
        this.am = null;
        this.an = 0.0f;
    }

    void a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.b.cj);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.b.cj));
        this.aB.a(i6 - (i4 / 2), i7, i4, i5);
        this.a.a(this.aB.a, this.aB.b, this.aB.c, this.aB.d, VariableScope.nullOrMissingString, Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.a.aC, false, (com.corrodinggames.rts.gameFramework.Interface.a.h) null, (i) null);
        this.s.a(this.aB.a, this.aB.b, this.aB.c, this.aB.d);
        Rect rect = this.s;
        rect.c = (int) (rect.c * f);
        this.b.bO.c(this.s, paint);
        this.b.bO.a(str, i6, i7 + ((this.a.aC.k() + 5.0f) * 1.0f), this.a.aC);
        this.b.bO.a(str2, i6, i7 + ((this.a.aC.k() + 5.0f) * 2.0f), this.a.aC);
    }

    void a(float f, boolean z) {
        int i;
        int i2;
        com.corrodinggames.rts.gameFramework.player.a aVar;
        float f2 = this.b.cj * 0.7f;
        if (GameEngine.au() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int m = (int) (this.U.m() * f2);
        int i3 = 4 + (m / 2);
        int i4 = 4 + (m / 2);
        if (this.b.g(111)) {
            boolean z2 = false;
            if (!this.a.u) {
                z2 = this.a.l();
            }
            if (!z2) {
                this.a.u = !this.a.u;
            }
        }
        if (this.a.u) {
            this.aC += 0.008f * f;
            if (this.aC > 1.0f) {
                this.aC = 0.0f;
            }
            this.h.c(150 + ((int) (100.0f * f.j(this.aC * 180.0f))));
        } else {
            this.aC = 0.0f;
            this.h.c(80);
        }
        this.v.a(i3, i4, i3 + m, i4 + m);
        this.v.a(-(m / 2), -(m / 2));
        if (z) {
            this.b.bO.a(this.U, this.v.a, this.v.b, this.h, 0.0f, f2);
            if (this.b.settingsEngine.newRender) {
                this.B.a(this.v.d() - 4, this.v.e() - 4, this.v.d() + 4, this.v.e() + 4);
                this.p.a(100, 0, 155, 0);
                this.b.bO.b(this.B, this.p);
            }
        }
        if (GameEngine.au()) {
            f.a(this.v, 4.0f);
        }
        if (this.a.U && !this.a.T && this.v.b((int) this.a.x, (int) this.a.y)) {
            this.a.U = false;
            this.a.u = !this.a.u;
        }
        this.a.a(this.v);
        if (this.b.replayEngine.j()) {
            this.h.c(80);
            if (this.b.replayEngine.v != 1) {
                this.h.c(200);
            }
            int i5 = (int) (this.W.q * this.b.cj * 1.6f);
            int i6 = (int) (this.b.cF / 2.0f);
            int k = 7 + ((int) this.a.aE.k());
            this.b.bO.a(f.a(this.b.by / 1000), i6, k, this.a.aE);
            int i7 = k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.v.a(i8, i7, i8 + i5, i7 + i5);
            this.v.a((-this.v.b()) / 2, (-this.v.c()) / 2);
            if (z) {
                this.b.bO.a(this.W, this.v.a, this.v.b, this.h, 0.0f, i5 / i);
            }
            if (this.a.U && !this.a.T && this.v.b((int) this.a.x, (int) this.a.y)) {
                this.a.U = false;
                this.b.replayEngine.b();
            }
            if (this.b.bt != 1.0f && z) {
                this.b.bO.a("x" + this.b.bt, this.v.d() + (i5 / 2), this.v.e(), this.a.aC);
            }
            e eVar = this.V;
            int i9 = (int) (eVar.q * this.b.cj * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.v.a(i10, i7, i10 + i9, i7 + i9);
            this.v.a((-this.v.b()) / 2, (-this.v.c()) / 2);
            if (z) {
                this.b.bO.a(eVar, this.v.a, this.v.b, this.h, 0.0f, i9 / i2);
            }
            if (this.a.U && !this.a.T && this.v.b((int) this.a.x, (int) this.a.y)) {
                this.a.U = false;
                this.b.replayEngine.a();
            }
            e eVar2 = this.X;
            int i11 = (int) ((this.b.cl - this.b.cq) - (i9 + 5));
            this.v.a(i11, i7, i11 + i9, i7 + i9);
            this.v.a((-this.v.b()) / 2, (-this.v.c()) / 2);
            if (z) {
                this.b.bO.a(eVar2, this.v.a, this.v.b, this.h, 0.0f, i9 / i2);
            }
            if (this.a.U && !this.a.T && this.v.b((int) this.a.x, (int) this.a.y) && (aVar = this.b.cg) != null) {
                aVar.c();
            }
        }
        if (this.a.u) {
            this.b.cU = false;
            int a = this.b.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3);
            this.s.a = (int) ((this.b.cF / 2.0f) - (a / 2));
            this.s.c = (int) ((this.b.cF / 2.0f) + (a / 2));
            int a2 = this.b.a(34);
            int a3 = a2 + this.b.a(15);
            Menu o = o();
            int a4 = this.b.a(50) + (a3 * (1 + o.size()));
            this.s.b = (int) (this.b.cp - (a4 / 2));
            this.s.d = (int) (this.b.cp + (a4 / 2));
            if (z) {
                this.a.bt.c(this.b.bO, this.s);
            }
            int a5 = this.s.b + this.b.a(40);
            int a6 = this.b.a(152);
            int i12 = (int) ((this.b.cF / 2.0f) - (a6 / 2));
            int a7 = Color.a(140, 100, 100, 100);
            if (this.a.a(i12, a5, a6, a2, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.resume", new Object[0]), i.none, false, a7, this.a.aD, (com.corrodinggames.rts.gameFramework.Interface.a.h) this.a.br)) {
                this.a.U = false;
                this.a.aV = 40.0f;
                this.a.u = false;
            }
            int i13 = a5 + a3;
            for (int i14 = 0; i14 < o.size(); i14++) {
                MenuItem item = o.getItem(i14);
                if (this.a.a(i12, i13, a6, a2, item.getTitle().toString(), i.none, false, a7, this.a.aD, (com.corrodinggames.rts.gameFramework.Interface.a.h) this.a.br)) {
                    a(item.getItemId());
                    this.a.U = false;
                    this.a.aV = 40.0f;
                }
                i13 += a3;
            }
            this.a.a(this.s);
        }
    }

    public void l() {
        a(20);
    }

    public void m() {
        a(21);
    }

    public void n() {
        a(16);
    }

    void a(int i) {
        com.corrodinggames.rts.appFramework.f fVar = this.b.ao;
        if (fVar == null) {
            GameEngine.print("selectMenuOption: gameView==null");
            return;
        }
        com.corrodinggames.rts.appFramework.g i2 = fVar.i();
        if (i2 == null) {
            GameEngine.print("selectMenuOption: inGameActivity==null");
        } else {
            i2.c(i);
        }
    }

    Menu o() {
        this.aD.clear();
        com.corrodinggames.rts.appFramework.f fVar = this.b.ao;
        if (fVar == null) {
            GameEngine.print("selectMenuOption: gameView==null");
            return this.aD;
        }
        com.corrodinggames.rts.appFramework.g i = fVar.i();
        if (i == null) {
            GameEngine.print("selectMenuOption: inGameActivity==null");
            return this.aD;
        }
        i.a(this.aD);
        return this.aD;
    }

    void e(float f) {
        String str;
        int i = (int) (this.b.cH - (30.0f * this.b.cj));
        int i2 = (int) ((this.b.cl - this.b.cq) + 10.0f);
        int i3 = ((int) (this.b.cq - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.aA.size(); i5++) {
            am amVar = (am) this.aA.get(i5);
            if (amVar.h) {
                amVar.e();
                amVar.h = false;
            }
            amVar.d();
            if (this.b.settingsEngine.keyboardSupport && i5 < this.b.bT.ai.length) {
                if (this.b.bT.ak[i5].a()) {
                    amVar.b();
                    amVar.c();
                }
                if (this.b.bT.aj[i5].a()) {
                    this.a.l();
                    amVar.a();
                }
                if (this.b.bT.ai[i5].a()) {
                    this.a.l();
                    this.a.y();
                    amVar.a();
                }
            }
            if (this.b.settingsEngine.showUnitGroups && i5 < 3) {
                if (amVar.a.size() == 0) {
                    if (this.a.bN) {
                        str = "Empty";
                    } else {
                        str = "(" + (i5 + 1) + ")";
                    }
                } else {
                    str = VariableScope.nullOrMissingString + amVar.a.size();
                }
                boolean z = false;
                amVar.d = f.a(amVar.d, 0.01f * f);
                amVar.e = f.a(amVar.e, 0.01f * f);
                amVar.f = f.a(amVar.f, 0.01f * f);
                if (this.a.a(i2, i, i4, (int) (31.0f * this.b.cj), str, i.none, true, Color.a(50, (int) (100.0f + (amVar.f * 100.0f)), (int) (100.0f + (amVar.e * 100.0f)), (int) (100.0f + (amVar.d * 100.0f)))) && this.a.ac == null && !this.a.T) {
                    z = true;
                    amVar.b += f;
                    this.a.d();
                    float f2 = 1.0f;
                    this.i.a();
                    this.i.b(Color.a(120, 200, 0, 0));
                    if (amVar.b < 50.0f) {
                        f2 = amVar.b / 50.0f;
                        this.i.b(Color.a((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        a(i2, i, i4, "Select Group", "(Hold for more..)", this.i, f2);
                    } else if (amVar.b < 100.0f) {
                        f2 = (amVar.b - 50.0f) / 50.0f;
                        this.i.b(Color.a((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        a(i2, i, i4, "Add to Group", "(Hold for more..)", this.i, f2);
                    } else {
                        a(i2, i, i4, "Replace Group", VariableScope.nullOrMissingString, this.i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.b.cj);
                    this.s.a(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.b.bO.b(this.s, this.i);
                }
                if (!z) {
                    if (amVar.b != 0.0f && !this.a.I) {
                        if (amVar.b > 100.0f) {
                            amVar.b();
                            amVar.c();
                            amVar.f = 1.0f;
                        } else if (amVar.b > 50.0f) {
                            amVar.c();
                            this.a.l();
                            this.a.y();
                            amVar.a();
                            amVar.e = 1.0f;
                        } else if (amVar.a.size() != 0) {
                            this.a.l();
                            this.a.y();
                            amVar.a();
                            amVar.d = 1.0f;
                        } else {
                            amVar.b();
                            amVar.c();
                            amVar.e = 1.0f;
                        }
                    }
                    if (!z) {
                        amVar.b = 0.0f;
                    }
                }
                i2 += i3;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.aA.size());
        Iterator it = this.aA.iterator();
        while (it.hasNext()) {
            ((am) it.next()).a(gameOutputStream);
        }
        gameOutputStream.writeByte(0);
    }

    public void a(GameInputStream gameInputStream, boolean z) {
        if (!z) {
            this.aA.clear();
        }
        int readInt = gameInputStream.readInt();
        int i = 0;
        while (i < readInt) {
            am amVar = new am(this, i < 3);
            amVar.a(gameInputStream);
            if (!z) {
                this.aA.add(amVar);
            }
            i++;
        }
        gameInputStream.readByte();
    }
}
package com.corrodinggames.rts.gameFramework.Interface;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.emitter.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.unitAction.m;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/o.class */
public class o {
    float a;
    float b;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public float i;
    public float j;
    int k;
    int l;
    boolean m;
    e F;
    y G;
    e H;
    y I;
    public e J;
    y K;
    float M;
    float N;
    public e T;
    public e U;
    ag[] W;
    ag X;
    float Y;
    static ArrayList ac = new ArrayList();
    public float c = 120.0f;
    public float d = 120.0f;
    final Paint n = new Paint();
    final Paint o = new Paint();
    final Paint p = new Paint();
    float q = 0.0f;
    float r = 0.0f;
    final Paint s = new ag();
    final Paint t = new Paint();
    final Paint u = new Paint();
    final Paint v = new Paint();
    public final Rect w = new Rect();
    final Paint x = new ag();
    final Paint y = new ag();
    final Paint z = new ag();
    final Paint A = new ag();
    final Paint B = new ag();
    final Paint C = new ag();
    final Paint D = new ag();
    final Rect E = new Rect();
    float L = 0.0f;
    public boolean O = false;
    public boolean P = false;
    public float Q = 0.0f;
    int R = 30;
    int S = -1;
    final Rect V = new Rect();
    public final ArrayList Z = new ArrayList();
    public final ArrayList aa = new ArrayList();
    private final ArrayList ag = new ArrayList();
    Rect ab = new Rect();
    Point ad = new Point();
    m ae = new m() { // from class: com.corrodinggames.rts.gameFramework.f.o.1
        @Override // com.corrodinggames.rts.gameFramework.unitAction.m
        public void a(y yVar) {
            o.this.a(yVar, 0, 0, 0.0f, 1.0f);
        }
    };
    ArrayList af = new ArrayList();

    public void a(int i, int i2, float f, am amVar) {
        boolean z = amVar != null && amVar.bI();
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.a == z && f.d(i - qVar.b) < 40 && f.d(i2 - qVar.c) < 40) {
                qVar.d += f;
                return;
            }
        }
        this.Z.add(new q(this, f, i, i2, z));
    }

    public void a(Context context) {
        this.o.a(Paint.Style.STROKE);
        this.o.a(1.0f);
        this.s.a(255, 255, 255, 255);
        this.s.a(Paint.Style.STROKE);
        this.s.a(1.0f);
        this.W = new ag[11];
        for (int i = 0; i <= 10; i++) {
            this.W[i] = new ag();
            this.W[i].b(-16777216);
            this.W[i].a(Paint.Style.FILL);
            this.W[i].c(i * 25);
        }
        this.X = new ag();
        this.X.b(-16777216);
        this.X.a(Paint.Style.FILL);
        this.t.a(255, 255, 0, 0);
        this.t.a(Paint.Style.STROKE);
        this.t.a(2.0f);
        this.u.a(155, 255, 0, 0);
        this.u.a(Paint.Style.STROKE);
        this.u.a(2.0f);
        this.v.a(200, 12, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_11, 219);
        this.v.a(Paint.Style.STROKE);
        this.v.a(2.0f);
        this.x.b(-16711936);
        this.y.b(-256);
        this.z.b(-65536);
        this.A.b(a(this.x.e()));
        this.B.b(a(this.y.e()));
        this.C.b(a(this.z.e()));
        this.D.a(210, 255, 255, 255);
    }

    public static int a(int i) {
        return Color.a(Color.a(i), (int) (Color.b(i) * 0.5f), (int) (Color.c(i) * 0.5f), (int) (Color.d(i) * 0.5f));
    }

    public void a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!InterfaceEngine.bR) {
            this.a = (int) (gameEngine.cl - (this.c + 0.0f));
            this.b = 0.0f;
            return;
        }
        this.a = 0.0f;
        this.b = (int) (gameEngine.cm - (this.d + 0.0f));
    }

    public int b() {
        return (int) (this.b + this.d);
    }

    public void a(b bVar, boolean z) {
        this.af.clear();
        if (z) {
            this.m = true;
            return;
        }
        this.g = 1;
        this.h = 1;
        this.i = 1.0f;
        this.j = 1.0f;
        this.f = false;
        this.e = false;
    }

    public void c() {
        if (this.J != null) {
            this.J.o();
            this.J = null;
        }
        if (this.F != null) {
            this.F.o();
            this.F = null;
        }
        if (this.T != null) {
            this.T.o();
            this.T = null;
        }
        if (this.U != null) {
            this.U.o();
            this.U = null;
        }
        if (this.I != null) {
            this.I.q();
            this.I = null;
        }
        if (this.H != null) {
            this.H.o();
            this.H = null;
        }
        this.K = null;
        this.e = false;
    }

    public float d() {
        return GameEngine.getGameEngine().cq;
    }

    public void e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f();
        GameEngine.m5e("Creating minimap image buffers..");
        if (this.F == null) {
            this.F = gameEngine.bO.a((int) this.c, (int) this.d, false);
            this.G = gameEngine.bO.mo10b(this.F);
        }
        if (this.J == null) {
            this.J = gameEngine.bO.a((int) this.c, (int) this.d, false);
            this.K = gameEngine.bO.mo10b(this.J);
        }
        if (this.H == null) {
            this.H = gameEngine.bO.a((int) this.c, (int) this.d, false);
            this.I = gameEngine.bO.mo10b(this.H);
        }
    }

    public void f() {
        this.c = d();
        this.d = this.c;
        a();
    }

    public void g() {
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        GameEngine.m5e("--setting up minimap--");
        GameEngine gameEngine = GameEngine.getGameEngine();
        f();
        this.g = gameEngine.bL.width * gameEngine.bL.n;
        this.h = gameEngine.bL.height * gameEngine.bL.o;
        if (this.g <= 0) {
            this.g = 1;
        }
        if (this.h <= 0) {
            this.h = 1;
        }
        this.i = 1.0f / this.g;
        this.j = 1.0f / this.h;
        this.f = true;
        e();
        this.Z.clear();
        this.aa.clear();
        this.ag.clear();
        Iterator it = gameEngine.bL.A.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            this.ag.add(new t(this, point.a, point.b));
        }
        this.G.b(-16777216);
        this.K.b(-16777216);
        if (1 == 0) {
            Rect rect = new Rect(0, 0, (int) this.c, (int) this.d);
            gameEngine.bL.u.a(this.G, 0.0f, 0.0f, 0.0f, 0.0f, this.g, this.h, this.c / this.g, this.d / this.h, false, false, false);
            Paint paint = new Paint();
            paint.a(50, 0, 0, 0);
            this.G.b(rect, paint);
        } else {
            for (int i = 0; i < 2; i++) {
                for (int i2 = 0; i2 < 2; i2++) {
                    this.I.b(-16777216);
                    int i3 = ((int) this.c) / 2;
                    int i4 = ((int) this.d) / 2;
                    int i5 = this.g / 2;
                    int i6 = this.h / 2;
                    gameEngine.bL.u.a(this.I, i5 * i, i6 * i2, i5 * i, i6 * i2, i5, i6, this.c / i5, this.d / i6, false, false, false);
                    Rect rect2 = new Rect(0, 0, (int) this.c, (int) this.d);
                    Rect rect3 = new Rect(i3 * i, i4 * i2, i3 * (i + 1), i4 * (i2 + 1));
                    Paint paint2 = new Paint();
                    paint2.a(true);
                    paint2.d(true);
                    paint2.b(true);
                    this.K.a(this.H, rect2, rect3, paint2);
                }
            }
            Rect rect4 = new Rect(0, 0, (int) this.c, (int) this.d);
            this.G.b(-16777216);
            Paint paint3 = new Paint();
            paint3.a(true);
            paint3.d(true);
            paint3.b(true);
            paint3.a(200, 255, 255, 255);
            this.G.a(this.J, rect4, rect4, paint3);
        }
        this.I.b(-16777216);
        this.K.b(-16777216);
        this.M = 50.0f;
        a(0.0f, 1.0f);
        this.e = true;
        GameEngine.m5e("Minimap map render took:" + Unit.a(Unit.a(loadAllUnitsTook)));
    }

    void a(float f, float f2) {
        ag agVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.ab.a(0, (int) (f * this.d), (int) this.c, (int) (f2 * this.d));
        this.I.a(this.F, this.ab, this.ab, (Paint) null);
        b bVar = gameEngine.bL;
        if (bVar.E) {
            boolean z = bVar.G;
            ag agVar2 = this.W[5];
            ag agVar3 = this.W[10];
            ag agVar4 = this.X;
            agVar4.c(255);
            if (z) {
                agVar4.c((int) ((1.0f - ((1.0f - (agVar2.f() / 255.0f)) * (1.0f - (this.W[7].f() / 255.0f)))) * 255.0f));
            }
            float f3 = this.c / bVar.width;
            float f4 = this.d / bVar.height;
            int i = ((int) (f * bVar.height)) - 1;
            int i2 = ((int) (f2 * bVar.height)) + 1;
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > gameEngine.bL.height) {
                i = bVar.height;
            }
            if (i2 > gameEngine.bL.height) {
                i2 = bVar.height;
            }
            int i3 = 0;
            byte[][] bArr = gameEngine.playerTeam.N;
            if (bArr != null) {
                int i4 = bVar.width;
                Rect rect = this.V;
                for (int i5 = i; i5 < i2; i5++) {
                    int i6 = 0;
                    while (i6 < i4) {
                        byte b = bArr[i6][i5];
                        if (b != 0) {
                            int i7 = i6;
                            int i8 = i6;
                            while (i8 < i4 - 1 && bArr[i8][i5] == b) {
                                i8++;
                            }
                            i6 = i8;
                            rect.a(0 + ((int) (i7 * f3)), 0 + ((int) (i5 * f4)), 0 + ((int) ((i8 + 1) * f3)), 0 + ((int) ((i5 + 1) * f4)));
                            if (b == 10) {
                                agVar = agVar4;
                            } else {
                                agVar = agVar2;
                            }
                            this.I.b(rect, agVar);
                            i3++;
                            if (i3 > 2) {
                                i3 = 0;
                            }
                        }
                        i6++;
                    }
                }
            }
        }
        this.K.a(this.H, this.ab, this.ab, (Paint) null);
        this.J.p();
        if (GameEngine.aY) {
        }
    }

    static s a(int i, Paint paint) {
        synchronized (ac) {
            s sVar = null;
            Iterator it = ac.iterator();
            while (it.hasNext()) {
                s sVar2 = (s) it.next();
                if (sVar2.d >= i && (sVar == null || sVar2.d < sVar.d)) {
                    sVar = sVar2;
                }
            }
            if (sVar != null) {
                ac.remove(sVar);
                sVar.c = paint;
                return sVar;
            }
            return new s(i + 15, paint);
        }
    }

    static void a(s sVar) {
        sVar.c = null;
        sVar.b = 0;
        synchronized (ac) {
            if (ac.size() < 20) {
                ac.add(sVar);
                return;
            }
            Iterator it = ac.iterator();
            while (it.hasNext()) {
                if (((s) it.next()).d < sVar.d) {
                    it.remove();
                    ac.add(sVar);
                    return;
                }
            }
        }
    }

    void a(y yVar, int i, int i2, float f, float f2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.c < 50.0f) {
            i3 = 0;
            i4 = 0;
            i5 = 1;
            i6 = 1;
            i7 = 1;
        } else if (this.c < 120.0f) {
            i3 = 0;
            i4 = 0;
            i5 = 2;
            i6 = 2;
            i7 = 2;
        } else {
            i3 = -1;
            i4 = -1;
            i5 = 2;
            i6 = 2;
            i7 = 3;
        }
        int i8 = i4 + i;
        int i9 = i5 + i;
        int i10 = i6 + i2;
        int i11 = i3 + i2;
        boolean z = false;
        z = (gameEngine.playerTeam.b() || gameEngine.replayEngine.j()) ? true : true;
        for (int i12 = -1; i12 < PlayerData.c; i12++) {
            PlayerData playerData = PlayerData.getPlayerData(i12);
            if (playerData != null) {
                Paint paint = playerData.ae;
                if (gameEngine.settingsEngine.useMinimapAllyColors) {
                    if (z) {
                        this.p.b(PlayerData.i(playerData.team));
                        paint = this.p;
                    } else if (gameEngine.playerTeam == playerData) {
                        paint = this.x;
                    } else if (gameEngine.playerTeam.d(playerData)) {
                        paint = this.y;
                    } else if (gameEngine.playerTeam.c(playerData)) {
                        paint = this.z;
                    }
                }
                int i13 = 0;
                if (playerData.a(true, false) > 0) {
                    am[] a = am.bE.a();
                    int size = am.bE.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        am amVar = a[i14];
                        if (amVar.bX == playerData && amVar.cR) {
                            i13++;
                        }
                    }
                }
                if (i13 > 0) {
                    paint.a(i7);
                    s a2 = a(i13, paint);
                    a2.e = !gameEngine.settingsEngine.renderWithLineWidth;
                    am[] a3 = am.bE.a();
                    int size2 = am.bE.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        am amVar2 = a3[i15];
                        if (amVar2.bX == playerData && amVar2.cR) {
                            a2.a(amVar2.cS, amVar2.cT);
                        }
                    }
                    if (a2.b != 0) {
                        gameEngine.bO.a(a2);
                    }
                }
                Paint paint2 = playerData.af;
                if (gameEngine.settingsEngine.useMinimapAllyColors) {
                    if (z) {
                        this.p.b(PlayerData.i(playerData.team));
                        Paint paint3 = this.p;
                    } else if (gameEngine.playerTeam == playerData) {
                        paint2 = this.A;
                    } else if (gameEngine.playerTeam.d(playerData)) {
                        paint2 = this.B;
                    } else if (gameEngine.playerTeam.c(playerData)) {
                        paint2 = this.C;
                    }
                }
                int i16 = 0;
                Object[] b = a.w.b();
                int size3 = a.w.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    a aVar = (a) b[i17];
                    if (aVar.e == playerData && aVar.k) {
                        i16++;
                    }
                }
                if (i16 > 0) {
                    paint2.a(i7);
                    s a4 = a(i16, paint2);
                    Object[] b2 = a.w.b();
                    int size4 = a.w.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        a aVar2 = (a) b2[i18];
                        if (aVar2.e == playerData && aVar2.k) {
                            a4.a(aVar2.l, aVar2.m);
                        }
                    }
                    if (a4.b != 0) {
                        gameEngine.bO.a(a4);
                    }
                }
            }
        }
    }

    public void a(int i, int i2, r rVar) {
        p pVar = new p(this);
        pVar.a = i;
        pVar.b = i2;
        pVar.e = rVar;
        pVar.c = 0.9f;
        pVar.d = 0.9f;
        this.aa.add(pVar);
    }

    public void h() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.m = false;
        this.k = (int) this.a;
        this.l = (int) this.b;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (!amVar.bV && amVar.cN == null && amVar.cf() && amVar.c_() && !amVar.u()) {
                Point b = b(amVar.eo, amVar.ep);
                amVar.cS = b.a;
                amVar.cT = b.b;
                amVar.cR = true;
            } else {
                amVar.cR = false;
            }
        }
        Object[] b2 = a.w.b();
        int size2 = a.w.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a aVar = (a) b2[i2];
            if (!aVar.n && aVar.u) {
                Point b3 = b(aVar.g, aVar.h);
                aVar.l = b3.a;
                aVar.m = b3.b;
                aVar.k = true;
            }
        }
        PlayerData playerData = gameEngine.playerTeam;
        Iterator it = this.ag.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            tVar.e = false;
            if (gameEngine.bL.a(playerData, tVar.a, tVar.b)) {
                tVar.e = true;
                Point b4 = b(tVar.a * gameEngine.bL.n, tVar.b * gameEngine.bL.o);
                tVar.c = b4.a;
                tVar.d = b4.b;
            }
        }
    }

    public void a(float f) {
        if (GameEngine.aU && !GameEngine.aW) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.L = f.a(this.L, f);
        if (this.L == 0.0f) {
            this.L = 15.0f;
            h();
        }
        this.Y += f;
        if (this.Y > 15.0f) {
            q qVar = null;
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                q qVar2 = (q) it.next();
                if (qVar2.e != 0.0f) {
                    qVar2.d = 0.0f;
                } else if (qVar2.d > 15.0f) {
                    qVar2.d = 0.0f;
                    qVar2.e = 300.0f;
                    p pVar = new p(this);
                    pVar.a = qVar2.b;
                    pVar.b = qVar2.c;
                    if (qVar2.a) {
                        pVar.e = r.base;
                    } else {
                        pVar.e = r.unit;
                        pVar.c = 0.4f;
                        pVar.d = 0.8f;
                    }
                    this.aa.add(pVar);
                }
                qVar2.d = f.a(qVar2.d, 2.0f * this.Y);
                qVar2.e = f.a(qVar2.e, this.Y);
                if (qVar2.d == 0.0f && qVar2.e == 0.0f) {
                    qVar = qVar2;
                }
            }
            if (qVar != null) {
                this.Z.remove(qVar);
            }
            Iterator it2 = this.aa.iterator();
            while (it2.hasNext()) {
                p pVar2 = (p) it2.next();
                if (pVar2.e != r.message && gameEngine.cQ.b(pVar2.a, pVar2.b)) {
                    pVar2.c = 0.0f;
                    pVar2.d = 0.0f;
                }
            }
            this.Y = 0.0f;
        }
    }

    public float b(float f) {
        return f * this.i * this.c;
    }

    public Point b(float f, float f2) {
        if (!this.f) {
            this.ad.a(-1, -1);
            return this.ad;
        }
        this.ad.a((int) ((f * this.i * this.c) + this.a), (int) ((f2 * this.j * this.d) + this.b));
        return this.ad;
    }

    public Point c(float f, float f2) {
        if (f < this.a || f2 < this.b || f > this.a + this.c || f2 > this.b + this.d) {
            return null;
        }
        this.ad.a((int) (((f - this.a) / this.c) * this.g), (int) (((f2 - this.b) / this.d) * this.h));
        return this.ad;
    }

    public float c(float f) {
        return f < this.a ? this.a : f > this.a + this.c ? this.a + this.c : f;
    }

    public float d(float f) {
        return f < this.b ? this.b : f > this.b + this.d ? this.b + this.d : f;
    }

    public void e(float f) {
        Paint paint;
        GameEngine gameEngine = GameEngine.getGameEngine();
        y yVar = gameEngine.bO;
        a();
        if (this.J != null && !f.e(this.c, d(), 5.0f)) {
            GameEngine.b("minimap", "minimap size has changed, reseting");
            c();
        }
        if (!this.e || this.J == null) {
            g();
        }
        if (this.k != ((int) this.a) || this.l != ((int) this.b) || this.m) {
            h();
        }
        if (gameEngine.bL.E) {
            if (this.O && !this.P) {
                this.M = f.a(this.M, 1.0f);
                if (this.M == 0.0f) {
                    this.M = 40.0f;
                    this.O = false;
                    this.Q = 0.0f;
                    this.P = true;
                }
            }
            if (this.P) {
                this.N = f.a(this.N, 1.0f);
                if (this.N == 0.0f) {
                    this.N = 3.0f;
                    if (this.J != null) {
                        float f2 = this.Q - 0.005f;
                        this.Q = (float) (this.Q + 0.04d);
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (this.Q >= 1.0f) {
                            this.Q = 1.0f;
                            this.P = false;
                        }
                        a(f2, this.Q);
                    }
                }
            }
        }
        yVar.b(this.J, this.a, this.b, this.n);
        this.w.a((int) this.a, (int) this.b, (int) (this.a + this.c), (int) ((this.b + this.d) - 0.4d));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object[] a = Projectile.a.a();
        int i = Projectile.a.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Projectile) a[i2]).D) {
                z3 = true;
                z2 = true;
            }
        }
        Iterator it = this.aa.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar.e != r.unit) {
                z = true;
                if (pVar.e != r.message) {
                    z2 = true;
                }
            }
        }
        if (!z && !z3) {
            this.o.a(255, 100, 100, 100);
            this.o.a(1.0f);
            if (InterfaceEngine.bO) {
                this.o.a(115, 0, 0, 0);
                this.o.a(2.0f);
            }
        } else {
            this.q += 5.0f * f;
            if (this.q > 180.0f) {
                this.q -= 180.0f;
            }
            float j = f.j(this.q);
            if (z3) {
                this.o.a(255, 0, (int) (0.0f + (j * 230.0f)), 0);
            } else if (!z2) {
                this.o.a(255, 12, (int) (0.0f + (j * 220.0f)), (int) (0.0f + (j * 220.0f)));
            } else {
                this.o.a(255, (int) (0.0f + (j * 230.0f)), 0, 0);
            }
            this.o.a(2.0f);
        }
        yVar.b(this.w, this.o);
        Iterator it2 = this.ag.iterator();
        while (it2.hasNext()) {
            t tVar = (t) it2.next();
            if (tVar.e) {
                this.V.a(tVar.c, tVar.d, tVar.c + 2, tVar.d + 2);
                yVar.b(this.V, this.D);
            }
        }
        a(yVar, 0, 0, 0.0f, 1.0f);
        if (this.af.size() != 0) {
            Iterator it3 = this.af.iterator();
            while (it3.hasNext()) {
                u uVar = (u) it3.next();
                if (uVar.a.bV) {
                    it3.remove();
                } else {
                    am amVar = uVar.a;
                    Point b = b(amVar.eo, amVar.ep);
                    if (!amVar.a(b.a, b.b)) {
                        yVar.a(b.a, b.b, 4.0f, amVar.bX.ae);
                    }
                }
            }
        }
        int i3 = Projectile.a.a;
        for (int i4 = 0; i4 < i3; i4++) {
            Projectile projectile = (Projectile) a[i4];
            if ((projectile.D || (projectile.q != null && projectile.q.D)) && projectile.j != null) {
                Point b2 = b(projectile.eo, projectile.ep);
                float f3 = 2.0f;
                if (projectile.D) {
                    f3 = 4.0f;
                }
                yVar.a(b2.a, b2.b, f3, projectile.j.bX.ae);
            }
        }
        Point b3 = b(gameEngine.cw, gameEngine.cx);
        this.E.a = b3.a;
        this.E.b = b3.b;
        Point b4 = b(gameEngine.cw + gameEngine.cA, gameEngine.cx + gameEngine.cB);
        this.E.c = b4.a;
        this.E.d = b4.b;
        if (this.E.a < this.w.a) {
            this.E.a = this.w.a;
        }
        if (this.E.c > this.w.c) {
            this.E.c = this.w.c;
        }
        if (this.E.b < this.w.b) {
            this.E.b = this.w.b;
        }
        if (this.E.d > this.w.d) {
            this.E.d = this.w.d;
        }
        yVar.b(this.E, this.s);
        this.r += 6.0f * f;
        if (this.r > 180.0f) {
            this.r -= 180.0f;
        }
        Iterator it4 = this.aa.iterator();
        while (it4.hasNext()) {
            p pVar2 = (p) it4.next();
            Point b5 = b(pVar2.a, pVar2.b);
            float f4 = pVar2.c;
            float f5 = 0.05f;
            if (pVar2.e == r.unit) {
                paint = this.u;
                f5 = 0.03f;
                float j2 = f.j(this.r);
                paint.a((int) (50.0f + (j2 * 190.0f)), (int) (50.0f + (j2 * 190.0f)), 0, 0);
            } else if (pVar2.e == r.message) {
                paint = this.v;
            } else {
                paint = this.t;
                float j3 = f.j(this.r);
                paint.a((int) (50.0f + (j3 * 190.0f)), (int) (50.0f + (j3 * 190.0f)), 0, 0);
            }
            float b6 = f.b(f4, f5, 1.0f);
            if (pVar2.e == r.unit) {
                float f6 = this.c * b6;
                float f7 = this.d * b6;
                yVar.a(c(b5.a - f6), d(b5.b - f7), c(b5.a + f6), d(b5.b + f7), paint);
                yVar.a(c(b5.a + f6), d(b5.b - f7), c(b5.a - f6), d(b5.b + f7), paint);
            } else {
                yVar.a(c(b5.a - (this.c * b6)), d(b5.b), c(b5.a + (this.c * b6)), d(b5.b), paint);
                yVar.a(c(b5.a), d(b5.b - (this.d * b6)), c(b5.a), d(b5.b + (this.d * b6)), paint);
            }
            pVar2.c = f.a(pVar2.c, 0.04f * f);
            if (pVar2.c == 0.0f) {
                pVar2.d = f.a(pVar2.d, 0.005f * f);
                if (pVar2.d == 0.0f) {
                    it4.remove();
                }
            }
        }
    }

    public void a(am amVar) {
        if (this.af.contains(amVar)) {
            return;
        }
        u uVar = new u(this);
        uVar.a = amVar;
        this.af.add(uVar);
    }
}
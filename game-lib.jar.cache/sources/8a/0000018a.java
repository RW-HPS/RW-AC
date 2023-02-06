package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.af;
import com.corrodinggames.rts.game.units.custom.ay;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.z;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.az;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.ai;
import com.corrodinggames.rts.gameFramework.w;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class Projectile extends az {
    public g g;
    public float h;
    public float i;
    public am j;
    public short k;
    public am l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public Projectile q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public float N;
    public float[] O;
    public short P;
    public short Q;
    public short R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public float ag;
    public float ah;
    public float ai;
    public float aj;
    public float ak;
    public float al;
    public float am;
    public float an;
    public boolean ao;
    public com.corrodinggames.rts.gameFramework.utility.m ap;
    public int ar;
    public boolean as;
    public boolean at;
    public w au;
    public int av;
    public float aw;
    public float ax;
    public float ay;
    public float az;
    public float aA;
    public boolean aB;
    public boolean aC;
    public int aD;
    public com.corrodinggames.rts.game.units.custom.h aE;
    public float aF;
    public boolean aG;
    public boolean aH;
    public float aI;
    public float aJ;
    public boolean aK;
    public float aL;
    public boolean aM;
    public float aN;
    public float aO;
    public com.corrodinggames.rts.gameFramework.emitter.e aP;
    public boolean aQ;
    public boolean aR;
    private boolean bn;
    public boolean aS;
    public float aT;
    public boolean aU;
    float aV;
    float aW;
    float aX;
    public boolean aY;
    public boolean aZ;
    public static final com.corrodinggames.rts.gameFramework.utility.u bi;
    public ag bj;
    public static ag bk;
    public static int bl;
    public static final com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();
    private static final Projectile bm = new Projectile(true);
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static final Rect e = new Rect();
    static final RectF f = new RectF();
    static final int aq = Color.a(255, 255, 255, 255);
    public static final ag ba = new ag();
    public static final Paint bb = new Paint();
    public static final Paint bd = new Paint();
    public static final Paint be = new Paint();
    public static final Paint bf = new Paint();
    public static final Paint bg = new Paint();
    public static final Paint bh = new Paint();
    public static final Paint bc = new ag();

    static {
        bc.b(-16777216);
        bc.c(108);
        bd.a(80, 255, 0, 0);
        bd.a(true);
        bd.a(5.0f);
        be.a(30, 255, 0, 0);
        be.a(true);
        be.a(8.0f);
        bf.a(80, 128, 166, 255);
        bf.a(true);
        bf.a(5.0f);
        bg.a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        bg.a(true);
        bg.a(3.0f);
        bh.a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        bh.a(true);
        bh.a(8.0f);
        bi = new com.corrodinggames.rts.gameFramework.utility.u();
        bk = null;
        bl = 0;
    }

    public Projectile(boolean z) {
        super(z);
        this.g = g.a;
        this.k = (short) -1;
        this.r = -1.0f;
        this.s = 0.1f;
        this.x = 2.0f;
        this.y = -1.0f;
        this.z = true;
        this.H = 1.0f;
        this.P = (short) -1;
        this.Q = (short) -1;
        this.R = (short) 0;
        this.S = true;
        this.V = false;
        this.W = 0.0f;
        this.X = 0.0f;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = true;
        this.ai = 1.0f;
        this.aj = 1.0f;
        this.ak = 1.0f;
        this.al = 1.0f;
        this.am = 1.0f;
        this.ar = aq;
        this.av = -1;
        this.aI = 40.0f;
        this.aJ = 60.0f;
        this.aK = false;
        this.aL = 2.0f;
        this.aR = true;
        this.aT = 0.0f;
        if (!z) {
            a.add(this);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a() {
        a.remove(this);
        super.a();
    }

    public static Projectile a(Projectile projectile) {
        Projectile projectile2 = bm;
        projectile2.aD = -1;
        if (projectile == null) {
            projectile2.am = 1.0f;
            projectile2.ak = 1.0f;
            projectile2.al = 1.0f;
            projectile2.an = 0.0f;
        } else {
            projectile2.am = projectile.am;
            projectile2.ak = projectile.ak;
            projectile2.al = projectile.al;
            projectile2.an = projectile.an;
        }
        return projectile2;
    }

    public void a(am amVar, float f2, float f3, float f4) {
        this.j = amVar;
        this.eo = f2;
        this.ep = f3;
        this.eq = f4;
        this.bn = false;
        this.V = false;
    }

    public void b() {
        if (this.D) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            com.corrodinggames.rts.gameFramework.emitter.e d2 = gameEngine.bR.d(this.eo, this.ep, this.eq, 0);
            if (d2 != null) {
                d2.G = 0.7f;
                d2.F = 2.1f;
                d2.ar = (short) 2;
                d2.V = 90.0f;
                d2.W = d2.V;
            }
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
        }
        a();
    }

    @Override // com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.h);
        gameOutputStream.a(this.j);
        gameOutputStream.a(this.l);
        gameOutputStream.writeFloat(this.t);
        gameOutputStream.writeInt(99);
        gameOutputStream.writeBoolean(this.A);
        gameOutputStream.writeBoolean(this.B);
        gameOutputStream.writeBoolean(this.S);
        gameOutputStream.writeBoolean(this.T);
        gameOutputStream.writeFloat(this.U);
        gameOutputStream.writeFloat(this.Y);
        gameOutputStream.writeFloat(this.Z);
        gameOutputStream.writeInt(this.ar);
        gameOutputStream.writeBoolean(this.aH);
        gameOutputStream.writeFloat(this.aI);
        gameOutputStream.writeFloat(this.aJ);
        gameOutputStream.writeBoolean(this.aK);
        gameOutputStream.writeFloat(this.aL);
        gameOutputStream.writeBoolean(this.aM);
        gameOutputStream.writeFloat(this.aN);
        gameOutputStream.writeBoolean(this.aQ);
        gameOutputStream.writeBoolean(this.aR);
        gameOutputStream.writeBoolean(this.bn);
        gameOutputStream.writeBoolean(this.aS);
        gameOutputStream.writeBoolean(this.M);
        gameOutputStream.a(this.P);
        gameOutputStream.writeFloat(this.r);
        gameOutputStream.writeFloat(this.s);
        gameOutputStream.writeBoolean(this.as);
        gameOutputStream.writeBoolean(this.at);
        gameOutputStream.writeFloat(this.az);
        gameOutputStream.writeFloat(this.aA);
        gameOutputStream.writeBoolean(this.aB);
        gameOutputStream.writeBoolean(this.aC);
        gameOutputStream.writeBoolean(false);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.writeBoolean(this.E);
        gameOutputStream.writeFloat(this.F);
        gameOutputStream.writeFloat(this.J);
        gameOutputStream.writeFloat(this.K);
        gameOutputStream.writeFloat(this.L);
        gameOutputStream.writeBoolean(this.m);
        gameOutputStream.writeFloat(this.n);
        gameOutputStream.writeFloat(this.o);
        gameOutputStream.writeBoolean(this.C);
        gameOutputStream.writeBoolean(this.D);
        gameOutputStream.a(this.q);
        gameOutputStream.writeFloat(this.aV);
        gameOutputStream.writeFloat(this.aW);
        gameOutputStream.writeFloat(this.aX);
        gameOutputStream.writeBoolean(this.V);
        gameOutputStream.writeFloat(this.W);
        gameOutputStream.writeFloat(this.X);
        gameOutputStream.writeBoolean(this.aU);
        gameOutputStream.a(this.R);
        gameOutputStream.writeBoolean(this.ao);
        gameOutputStream.a(this.ap);
        gameOutputStream.a(this.Q);
        gameOutputStream.writeFloat(this.x);
        gameOutputStream.writeBoolean(this.aa);
        gameOutputStream.writeBoolean(this.ad);
        gameOutputStream.writeBoolean(this.G);
        gameOutputStream.writeFloat(this.H);
        gameOutputStream.writeBoolean(this.ae);
        gameOutputStream.writeBoolean(this.aG);
        gameOutputStream.writeBoolean(this.z);
        gameOutputStream.writeFloat(this.y);
        gameOutputStream.writeFloat(this.aO);
        gameOutputStream.writeFloat(this.i);
        gameOutputStream.writeBoolean(this.aY);
        gameOutputStream.writeBoolean(this.af);
        gameOutputStream.writeFloat(this.ag);
        gameOutputStream.writeFloat(this.ah);
        gameOutputStream.writeFloat(this.ai);
        gameOutputStream.writeFloat(this.aj);
        gameOutputStream.writeInt(0);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.a((as) null);
        gameOutputStream.writeInt(0);
        gameOutputStream.writeBoolean(false);
        com.corrodinggames.rts.game.units.custom.g.a(this.aE, gameOutputStream);
        gameOutputStream.writeFloat(this.ak);
        gameOutputStream.writeFloat(this.al);
        gameOutputStream.writeBoolean(this.ab);
        gameOutputStream.writeBoolean(this.ac);
        gameOutputStream.writeFloat(this.an);
        gameOutputStream.writeBoolean(false);
        g.a(this.g, gameOutputStream);
        boolean z = (this.au == null || this.au.ej) ? false : true;
        gameOutputStream.writeBoolean(z);
        if (z) {
            gameOutputStream.a(this.au);
            gameOutputStream.writeFloat(this.aw);
            gameOutputStream.writeFloat(this.ax);
            gameOutputStream.writeFloat(this.ay);
        }
        gameOutputStream.a(this.k);
        gameOutputStream.writeInt(this.aD);
        gameOutputStream.writeFloat(this.am);
        gameOutputStream.writeFloat(this.p);
        gameOutputStream.writeInt(this.av);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.h = gameInputStream.readFloat();
        this.j = gameInputStream.o();
        this.l = gameInputStream.a(com.corrodinggames.rts.gameFramework.net.m.expected);
        this.t = gameInputStream.readFloat();
        this.x = gameInputStream.readInt();
        this.A = gameInputStream.readBoolean();
        this.B = gameInputStream.readBoolean();
        this.S = gameInputStream.readBoolean();
        this.T = gameInputStream.readBoolean();
        this.U = gameInputStream.readFloat();
        this.Y = gameInputStream.readFloat();
        this.Z = gameInputStream.readFloat();
        this.ar = gameInputStream.readInt();
        this.aH = gameInputStream.readBoolean();
        this.aI = gameInputStream.readFloat();
        this.aJ = gameInputStream.readFloat();
        this.aK = gameInputStream.readBoolean();
        this.aL = gameInputStream.readFloat();
        this.aM = gameInputStream.readBoolean();
        this.aN = gameInputStream.readFloat();
        this.aQ = gameInputStream.readBoolean();
        this.aR = gameInputStream.readBoolean();
        this.bn = gameInputStream.readBoolean();
        if (gameInputStream.b() >= 7) {
            this.aS = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 13) {
            this.M = gameInputStream.readBoolean();
            this.P = gameInputStream.readShort();
        }
        if (gameInputStream.b() >= 16) {
            this.r = gameInputStream.readFloat();
            this.s = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 17) {
            this.as = gameInputStream.readBoolean();
            this.at = gameInputStream.readBoolean();
            this.az = gameInputStream.readFloat();
            this.aA = gameInputStream.readFloat();
            this.aB = gameInputStream.readBoolean();
            this.aC = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 18) {
            gameInputStream.readBoolean();
            gameInputStream.readFloat();
            gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 28) {
            this.E = gameInputStream.readBoolean();
            this.F = gameInputStream.readFloat();
            this.J = gameInputStream.readFloat();
            this.K = gameInputStream.readFloat();
            this.L = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 29) {
            this.m = gameInputStream.readBoolean();
            this.n = gameInputStream.readFloat();
            this.o = gameInputStream.readFloat();
            this.C = gameInputStream.readBoolean();
            this.D = gameInputStream.readBoolean();
            this.q = (Projectile) gameInputStream.a(Projectile.class);
            this.aV = gameInputStream.readFloat();
            this.aW = gameInputStream.readFloat();
            this.aX = gameInputStream.readFloat();
            this.V = gameInputStream.readBoolean();
            this.W = gameInputStream.readFloat();
            this.X = gameInputStream.readFloat();
            this.aU = gameInputStream.readBoolean();
            this.R = gameInputStream.readShort();
            this.ao = gameInputStream.readBoolean();
            com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
            gameInputStream.a(mVar, am.class);
            if (mVar.size() > 0) {
                this.ap = mVar;
            }
            this.Q = gameInputStream.readShort();
        }
        if (gameInputStream.b() >= 35) {
            this.x = gameInputStream.readFloat();
            this.aa = gameInputStream.readBoolean();
            this.ad = gameInputStream.readBoolean();
            this.G = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 38) {
            this.H = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 39) {
            this.ae = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 41) {
            this.aG = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 43) {
            this.z = gameInputStream.readBoolean();
            this.y = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 44) {
            this.aO = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 47) {
            this.i = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 48) {
            this.aY = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 59) {
            this.af = gameInputStream.readBoolean();
            this.ag = gameInputStream.readFloat();
            this.ah = gameInputStream.readFloat();
            this.ai = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 60) {
            this.aj = gameInputStream.readFloat();
            gameInputStream.readInt();
            gameInputStream.readFloat();
            gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 62) {
            gameInputStream.q();
            gameInputStream.readInt();
            gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 63) {
            this.aE = com.corrodinggames.rts.game.units.custom.g.a(gameInputStream);
        }
        if (gameInputStream.b() >= 64) {
            this.ak = gameInputStream.readFloat();
            this.al = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 66) {
            this.ab = gameInputStream.readBoolean();
            this.ac = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 67 && gameInputStream.b() < 78) {
            bp.a(gameInputStream, true);
        }
        if (gameInputStream.b() >= 68) {
            this.an = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 77) {
            gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 78) {
            this.g = g.a(gameInputStream);
        }
        if (gameInputStream.b() >= 81 && gameInputStream.readBoolean()) {
            this.au = gameInputStream.a(w.class);
            this.aw = gameInputStream.readFloat();
            this.ax = gameInputStream.readFloat();
            this.ay = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 83) {
            this.k = gameInputStream.readShort();
            this.aD = gameInputStream.readInt();
        }
        if (gameInputStream.b() >= 88) {
            this.am = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 89) {
            this.p = gameInputStream.readFloat();
            this.av = gameInputStream.readInt();
        }
        super.a(gameInputStream);
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.projectiles);
        c = gameEngine.bO.a(AssetsID.drawable.projectiles2);
        d = gameEngine.bO.a(AssetsID.drawable.projectiles_large);
    }

    public void d() {
        this.aS = true;
    }

    public static Projectile a(am amVar, float f2, float f3) {
        Projectile projectile = new Projectile(false);
        projectile.j = amVar;
        projectile.eo = f2;
        projectile.ep = f3;
        projectile.ar = Color.a(255, 100, 30, 30);
        projectile.en = amVar.en + 1;
        projectile.em = 4;
        return projectile;
    }

    public static Projectile a(am amVar, float f2, float f3, float f4, int i) {
        Projectile a2 = a(amVar, f2, f3);
        a2.eq = f4;
        a2.k = (short) i;
        a2.I = com.corrodinggames.rts.gameFramework.f.b(amVar, 0.0f, 1.0f, amVar.bC);
        amVar.bC++;
        return a2;
    }

    public void a(am amVar) {
        float f2;
        if ((this.ag == 0.0f && this.ah == 0.0f) || amVar.bI()) {
            return;
        }
        if (com.corrodinggames.rts.gameFramework.f.a(this.aV, this.aW, amVar.eo, amVar.ep) > 100.0f) {
            f2 = com.corrodinggames.rts.gameFramework.f.d(this.aV, this.aW, amVar.eo, amVar.ep);
        } else {
            f2 = this.az;
        }
        float bN = this.ah + (this.ag / amVar.bN());
        amVar.cc += com.corrodinggames.rts.gameFramework.f.k(f2) * bN;
        amVar.cd += com.corrodinggames.rts.gameFramework.f.j(f2) * bN;
    }

    public static void a(am amVar, am amVar2, float f2, Projectile projectile, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bw && f2 > 0.0f) {
            f2 = 0.0f;
        }
        if (amVar2 != null && !amVar2.bV) {
            if (projectile != null && projectile.g.bc && amVar != null) {
                amVar2.e(amVar.bX);
            }
            if (projectile != null) {
                if (projectile.ai != 1.0f && amVar2.bI()) {
                    f2 *= projectile.ai;
                }
                if (projectile.aj != 1.0f && amVar2.i()) {
                    f2 *= projectile.aj;
                }
            }
            if (f2 < 0.0f) {
                amVar2.b(amVar, -f2, projectile);
            } else {
                boolean z2 = !amVar2.bV && amVar2.cu > 0.0f;
                amVar2.a(amVar, f2, projectile);
                float f3 = f2;
                if (amVar2.J()) {
                    f3 = 0.0f;
                }
                if (f3 > 0.0f) {
                    gameEngine.stats.a(amVar, amVar2, f3);
                }
                if (amVar != null) {
                    amVar.cV += f3;
                    if (z2 && (amVar2.bV || amVar2.cu < 0.0f)) {
                        amVar.cU++;
                        amVar.a(af.killedAnyUnit, amVar2);
                    }
                }
            }
            if (projectile != null && !amVar2.bV) {
                float bQ = amVar2.bQ();
                if (bQ != -1.0f) {
                    float d2 = com.corrodinggames.rts.gameFramework.f.d(projectile.eo, projectile.ep, amVar2.eo, amVar2.ep);
                    float f4 = 100.0f / bQ;
                    amVar2.cc += com.corrodinggames.rts.gameFramework.f.k(d2) * f4;
                    amVar2.cd += com.corrodinggames.rts.gameFramework.f.j(d2) * f4;
                }
            }
        }
    }

    public float e() {
        float f2 = 1.0f;
        if (this.J < this.F) {
            f2 = this.J / this.F;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        float d2;
        float a2;
        float f3;
        float f4;
        com.corrodinggames.rts.gameFramework.emitter.e d3;
        com.corrodinggames.rts.gameFramework.emitter.e d4;
        z a3;
        com.corrodinggames.rts.gameFramework.emitter.e b2;
        float f5;
        float f6;
        float f7;
        float f8;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.aS) {
            a();
        }
        if (this.l == null && !this.aC) {
            a();
            return;
        }
        if (this.i > 0.0f) {
            this.i = com.corrodinggames.rts.gameFramework.f.a(this.i, f2);
            if (this.i > 0.0f) {
                return;
            }
        }
        g gVar = this.g;
        if (this.i == 0.0f) {
            this.i = -1.0f;
            if (gVar.al != null) {
                gVar.al.a(this.eo, this.ep, this.eq, this.az, this.j, null, false, this.aD + 1, this, null);
            }
        }
        this.h = com.corrodinggames.rts.gameFramework.f.a(this.h, f2);
        boolean z = false;
        if (this.aG) {
            if (this.l == null) {
                z = true;
            } else if (this.l.bV) {
                z = true;
            }
        }
        if (z) {
            a(gVar.ax, gVar.ay, (com.corrodinggames.rts.game.units.custom.h) null);
        }
        if (gVar.az) {
            this.aF = com.corrodinggames.rts.gameFramework.f.a(this.aF, f2);
            if (this.aF == 0.0f) {
                this.aF = gVar.aA;
                a(gVar.aB, gVar.aC, gVar.aD);
            }
        }
        if (gVar.R != 0.0f || gVar.S != 0.0f) {
            float f9 = gVar.R;
            if (this.l != null) {
                f9 += this.l.cj * gVar.S;
            }
            this.K = com.corrodinggames.rts.gameFramework.f.j(((360.0f * this.I) + (this.J * 1.0f)) % 360.0f) * f9;
            this.L = com.corrodinggames.rts.gameFramework.f.j(((360.0f * this.I) + (this.J * 1.5f)) % 360.0f) * f9;
        }
        if (this.E && this.l != null) {
            this.K = com.corrodinggames.rts.gameFramework.f.j((this.J * 1.0f) % 360.0f) * this.l.cj * 0.4f;
            this.L = com.corrodinggames.rts.gameFramework.f.j((this.J * 1.5f) % 360.0f) * this.l.cj * 0.4f;
            float f10 = this.l.eo + this.K;
            float f11 = this.l.ep + this.L;
            if (this.el) {
                this.aN += f2;
                this.aO += f2;
                if (this.aN > 11.0f) {
                    this.aN = com.corrodinggames.rts.gameFramework.f.c(1.0f, 4.0f);
                    com.corrodinggames.rts.gameFramework.emitter.e b3 = gameEngine.bR.b(f10, f11, this.l.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.low);
                    if (b3 != null) {
                        b3.aq = 0;
                        b3.ap = 0;
                        b3.ar = (short) 2;
                        b3.r = true;
                        b3.E = 0.5f;
                        b3.W = 60.0f;
                        b3.V = 60.0f;
                        b3.G = 0.7f;
                        b3.F = 0.3f;
                        b3.as = false;
                        b3.P = com.corrodinggames.rts.gameFramework.f.c(-0.3f, 0.3f);
                        b3.Q = (-0.9f) + com.corrodinggames.rts.gameFramework.f.c(-0.3f, 0.3f);
                    }
                }
                if (this.aO > 75.0f) {
                    this.aO = com.corrodinggames.rts.gameFramework.f.c(1.0f, 20.0f);
                    gameEngine.bR.b(f10, f11, this.l.eq);
                }
            }
        }
        float f12 = 5.0f;
        boolean z2 = false;
        boolean z3 = false;
        if (!this.aC) {
            float f13 = this.l.eo + this.K;
            float f14 = this.l.ep + this.L;
            float f15 = this.l.eq;
            d2 = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f13, f14);
            a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f13, f14);
            f3 = f15;
            f4 = f3 - this.eq;
            f12 = this.l.cj;
            z2 = this.l instanceof com.corrodinggames.rts.game.units.d.d;
            z3 = this.l.cx > 10.0f + this.U;
        } else {
            float f16 = this.az;
            if (this.q != null) {
                float f17 = this.q.eo + this.K;
                float f18 = this.q.ep + this.L;
                float f19 = this.q.eq;
                d2 = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f17, f18);
                a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f17, f18);
                f3 = f19;
                f4 = f3 - this.eq;
            } else if (this.l != null) {
                float f20 = this.l.eo + this.K;
                float f21 = this.l.ep + this.L;
                float f22 = this.l.eq;
                d2 = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f20, f21);
                a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f20, f21);
                f3 = f22;
                f4 = f3 - this.eq;
                f12 = this.l.cj;
                z2 = this.l instanceof com.corrodinggames.rts.game.units.d.d;
                z3 = this.l.cx > 10.0f + this.U;
            } else if (this.m) {
                float f23 = this.n + this.K;
                float f24 = this.o + this.L;
                float f25 = this.p;
                d2 = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f23, f24);
                a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f23, f24);
                f3 = f25;
                f4 = f3 - this.eq;
            } else {
                float f26 = this.n + this.K;
                float f27 = this.o + this.L;
                d2 = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f26, f27);
                a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f26, f27);
                f3 = 0.0f;
                f4 = 0.0f - this.eq;
            }
        }
        float f28 = gVar.O;
        if (a2 < 225.0f) {
            f28 = gVar.P;
        }
        if (f28 >= 0.0f) {
            this.az += com.corrodinggames.rts.gameFramework.f.c(this.az, d2, f28 * f2);
            d2 = this.az;
        } else {
            this.az = d2;
        }
        boolean z4 = false;
        boolean z5 = false;
        float f29 = d2;
        if (this.au != null && !this.au.ej) {
            if (this.av >= 0) {
                y yVar = (y) this.au;
                if (this.av >= yVar.bl()) {
                    this.av = 0;
                }
                ai D = yVar.D(this.av);
                f6 = D.a;
                f7 = D.b;
                f8 = this.j.eq + D.c;
            } else {
                f6 = this.au.eo;
                f7 = this.au.ep;
                f8 = this.au.eq;
            }
            float f30 = f6 - this.aw;
            float f31 = f7 - this.ax;
            float f32 = f8 - this.ay;
            this.eo += f30;
            this.ep += f31;
            this.eq += f32;
            this.aw = f6;
            this.ax = f7;
            this.ay = f8;
        }
        if (!this.A) {
            this.eo += this.u * f2;
            this.ep += this.v * f2;
            if (this.w != 0.0f) {
                this.eq += this.w * f2;
                f4 = f3 - this.eq;
            }
            if (this.eq > 0.0f) {
                if (gVar.G != 0.0f) {
                    this.eq -= gVar.G * f2;
                    f4 = f3 - this.eq;
                }
                if (gVar.H != 0.0f) {
                    this.w -= gVar.H * f2;
                }
            }
            if (!this.aH || this.aI < this.eq || this.aK) {
                float f33 = this.t * f2;
                z4 = true;
                if (a2 < f33 * f33) {
                    f33 = com.corrodinggames.rts.gameFramework.f.a(a2);
                    a2 = 0.0f;
                }
                this.eo += com.corrodinggames.rts.gameFramework.f.k(d2) * f33;
                this.ep += com.corrodinggames.rts.gameFramework.f.j(d2) * f33;
            }
            if (this.aH) {
                if (this.aL < 0.0f) {
                    f5 = this.t * f2;
                    z4 = true;
                } else {
                    f5 = this.aL * f2;
                }
                if (!this.aK) {
                    this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, this.aJ, f5);
                    if (this.eq < this.aI) {
                        f29 = -90.0f;
                    }
                    if (this.eq >= this.aJ) {
                        this.aK = true;
                    }
                } else if (a2 < 400.0f) {
                    this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, f3, f5);
                    if (com.corrodinggames.rts.gameFramework.f.c(this.eq - f3) > 0.5f) {
                        f29 = 90.0f;
                        z5 = true;
                    }
                }
            } else {
                float f34 = f4;
                float f35 = this.t * f2;
                z4 = true;
                if (f34 != 0.0f) {
                    if (a2 > 0.1d) {
                        f35 = com.corrodinggames.rts.gameFramework.f.b((com.corrodinggames.rts.gameFramework.f.c(f34) / com.corrodinggames.rts.gameFramework.f.a(a2)) * this.t * f2, this.t * f2);
                    }
                    this.eq += com.corrodinggames.rts.gameFramework.f.b(f4, f35);
                    f4 = f3 - this.eq;
                }
            }
        }
        if (z4 && this.r > 0.0f) {
            this.t = com.corrodinggames.rts.gameFramework.f.a(this.t, this.r, this.s * f2);
        }
        if (gVar.am != 0.0f) {
            float j = com.corrodinggames.rts.gameFramework.f.j((((this.J * 360.0f) / gVar.an) + (360.0f * this.I)) % 360.0f) * gVar.am * f2;
            this.eo += com.corrodinggames.rts.gameFramework.f.k(d2 + 90.0f) * j;
            this.ep += com.corrodinggames.rts.gameFramework.f.j(d2 + 90.0f) * j;
        }
        if (this.el && ((this.aM || gVar.ah != null) && !this.bn)) {
            this.aN += f2;
            if (this.aN > gVar.ag) {
                this.aN = 0.0f;
                boolean z6 = false;
                if (this.D) {
                    z6 = true;
                }
                if (gVar.ah != null) {
                    gVar.ah.a(this.eo, this.ep, this.eq, this.aT, this);
                }
                if (this.aM && (b2 = gameEngine.bR.b(this.eo, this.ep, this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, z6, com.corrodinggames.rts.gameFramework.emitter.h.low)) != null) {
                    if (this.eq >= 0.0f) {
                        b2.aq = 0;
                        b2.ap = 0;
                        b2.ar = (short) 2;
                        b2.r = true;
                        b2.E = 0.5f;
                        b2.V = 70.0f;
                        b2.W = b2.V;
                        b2.as = true;
                        if (z5) {
                            b2.as = false;
                        }
                        b2.Q = 0.1f;
                        b2.s = true;
                        b2.t = 5.0f;
                        b2.G = 0.5f;
                        b2.F = 1.2f;
                        b2.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
                        if (this.D) {
                            b2.G = 0.5f;
                            b2.F = 2.1f;
                        }
                    } else {
                        b2.aq = 9;
                        b2.ap = 1;
                        b2.ar = (short) 1;
                        b2.r = true;
                        b2.E = 0.5f;
                        b2.W = 60.0f;
                        b2.V = 60.0f;
                        b2.Q = 0.1f;
                    }
                }
            }
        }
        if (!this.bn) {
            boolean z7 = false;
            am amVar = null;
            boolean z8 = false;
            float f36 = 6.0f;
            if (z2) {
                f36 = f12 * 0.8f;
                if (f36 < 6.0f) {
                    f36 = 6.0f;
                }
            }
            if (z3) {
                f36 = f12 * 1.1f;
            }
            float f37 = 3.0f;
            if (this.w != 0.0f || gVar.G != 0.0f) {
                f37 = 3.0f + com.corrodinggames.rts.gameFramework.f.c(this.w * f2) + com.corrodinggames.rts.gameFramework.f.c(gVar.G * f2);
            }
            if (a2 < f36 * f36 && com.corrodinggames.rts.gameFramework.f.c(f4) < f37) {
                z7 = true;
                amVar = this.l;
            }
            if (this.A) {
                z7 = true;
                amVar = this.l;
            }
            if (this.af && this.h == 0.0f) {
                z7 = true;
            }
            if (this.as) {
                float f38 = this.aA + 50.0f;
                am[] a4 = am.bE.a();
                int size = am.bE.size();
                for (int i = 0; i < size; i++) {
                    am amVar2 = a4[i];
                    if (amVar2.eo + f38 > this.eo && amVar2.eo - f38 < this.eo && amVar2.ep + f38 > this.ep && amVar2.ep - f38 < this.ep && amVar2.bT && false == amVar2.i() && amVar2.cN == null) {
                        float a5 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar2.eo, amVar2.ep);
                        float f39 = this.aA + amVar2.cj;
                        if (a5 < f39 * f39) {
                            z7 = true;
                            amVar = amVar2;
                        }
                    }
                }
            }
            if (this.at) {
                gameEngine.bL.a(this.eo, this.ep);
                if (gameEngine.bU.a(ao.HOVER, gameEngine.bL.T, gameEngine.bL.U)) {
                    z7 = true;
                    z8 = true;
                }
            }
            if (this.aC) {
            }
            if (this.aY && (((this.aH && z5 && this.eq < 30.0f) || z7) && this.j != null)) {
                this.aY = false;
                com.corrodinggames.rts.game.units.u uVar = new com.corrodinggames.rts.game.units.u(false);
                uVar.eo = this.eo;
                uVar.ep = this.ep;
                uVar.b(this.j.bX);
                uVar.a = 15;
                uVar.b = 360.0f;
                PlayerData.c(uVar);
            }
            if (z7) {
                this.bn = true;
                this.aV = this.eo;
                this.aW = this.ep;
                this.aX = this.eq;
                if (this.A) {
                    if (this.aC) {
                        this.aV = this.n;
                        this.aW = this.o;
                        this.aX = 0.0f;
                    }
                    if (this.l != null) {
                        this.aV = this.l.eo + this.K;
                        this.aW = this.l.ep + this.L;
                        this.aX = this.l.eq;
                    }
                }
                if (!this.B && !this.M && !gVar.X) {
                    this.S = false;
                }
                boolean z9 = false;
                if (this.l != null) {
                    z9 = this.l.cx > 10.0f;
                }
                z zVar = gVar.aX;
                if (z9) {
                    zVar = gVar.aY;
                }
                if (this.l != null && (a3 = gVar.a(this.l)) != null) {
                    zVar = a3;
                }
                if (zVar != null) {
                    zVar.a(this.aV, this.aW, this.aX, this.aT, this.l);
                }
                if (gVar.aj != null) {
                    gVar.aj.a(this.eo, this.ep, this.eq, this.az, this.j, null, false, this.aD + 1, this, this.l);
                }
                if (gVar.aZ != null && this.j != null) {
                    gVar.aZ.a(this.aV, this.aW, 0.0f, this.az, this.j.bX, false, this.j);
                }
                if (gVar.ba > 0 && this.j != null && (this.j instanceof com.corrodinggames.rts.game.units.custom.j)) {
                    com.corrodinggames.rts.game.units.custom.j jVar = (com.corrodinggames.rts.game.units.custom.j) this.j;
                    for (int i2 = 0; i2 < gVar.ba; i2++) {
                        if (jVar.B != null && jVar.B.size() > 0) {
                            am amVar3 = (am) jVar.B.remove(jVar.B.size() - 1);
                            com.corrodinggames.rts.gameFramework.utility.y.a(amVar3, jVar);
                            amVar3.eo = this.aV;
                            amVar3.ep = this.aW;
                            amVar3.cg = this.az;
                            amVar3.cd = 0.0f;
                            amVar3.cc = 0.0f;
                            amVar3.bZ = 0.0f;
                            amVar3.ca = 0.0f;
                            if (amVar3 instanceof y) {
                                y yVar2 = (y) amVar3;
                                yVar2.az();
                                yVar2.j(amVar3.cg);
                                if (amVar3 instanceof com.corrodinggames.rts.game.units.custom.j) {
                                    ((com.corrodinggames.rts.game.units.custom.j) amVar3).dF();
                                }
                            }
                            jVar.D(amVar3);
                        }
                    }
                }
                if (gVar.bb && this.j != null) {
                    this.j.f(this.aV, this.aW);
                }
                if (!z8 && amVar != null) {
                    if (this.E) {
                        this.bn = false;
                        float e2 = (this.U / 60.0f) * f2 * e();
                        if (this.Z == 0.0f) {
                            a(amVar);
                        }
                        a(this.j, amVar, gVar.a(amVar, e2, true), this, false);
                    } else {
                        if (this.Z == 0.0f) {
                            a(amVar);
                        }
                        a(this.j, amVar, gVar.a(amVar, this.U, false), this, false);
                    }
                }
                if (this.q != null) {
                    if (gVar.d) {
                        this.q.h = 0.0f;
                    } else {
                        this.q.b();
                    }
                    a();
                }
                if (!this.E) {
                    boolean z10 = true;
                    if (this.l != null && this.l.cx > 10.0f) {
                        z10 = false;
                        if (gVar.aY == null && (d4 = gameEngine.bR.d(this.aV, this.aW, this.aX, -1127220)) != null) {
                            d4.V = 10.0f;
                            d4.F = 0.5f;
                            if (this.aQ) {
                                d4.V = 25.0f;
                                d4.F = 1.0f;
                            }
                            d4.ar = (short) 2;
                            d4.W = d4.V;
                        }
                    }
                    if (this.G) {
                        z10 = false;
                        Emitter.b(this.eo, this.ep).a = 21.0f;
                    }
                    if (z10) {
                        if (!this.aQ) {
                            if (gVar.aX == null) {
                                gameEngine.bR.c(this.aV, this.aW, this.aX);
                            }
                        } else if (gVar.aX == null) {
                            if (this.Z > 10.0f && (d3 = gameEngine.bR.d(this.aV, this.aW, this.aX, 0)) != null) {
                                d3.F = this.Z / 25.0f;
                                d3.E = 0.7f;
                                if (this.aX > 5.0f) {
                                    d3.ar = (short) 2;
                                }
                            }
                            gameEngine.bR.b(this.aV, this.aW, this.aX);
                            if (this.aR && !this.D) {
                                gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.n, 0.5f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.06f, 0.06f), this.aV, this.aW);
                            }
                        }
                        if (this.D && gVar.aX == null) {
                            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.C, 1.6f, 0.7f, this.aV, this.aW);
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a6 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, 255, 255, 255));
                            if (a6 != null) {
                                a6.G = 14.0f;
                                a6.F = 8.0f;
                                a6.E = 0.9f;
                                a6.V = 35.0f;
                                a6.W = a6.V;
                                a6.r = true;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e c2 = gameEngine.bR.c(this.aV, this.aW, this.aX, -1127220);
                            if (c2 != null) {
                                c2.G = 1.5f;
                                c2.F = 3.0f;
                                c2.ar = (short) 2;
                                c2.V = 20.0f;
                                c2.W = c2.V;
                                c2.U = 0.0f;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e c3 = gameEngine.bR.c(this.aV, this.aW, this.aX, -1127220);
                            if (c3 != null) {
                                c3.G = 0.2f;
                                c3.F = 5.0f;
                                c3.ar = (short) 2;
                                c3.V = 65.0f;
                                c3.W = c3.V;
                                c3.U = 0.0f;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a7 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, 255, 255, 255));
                            if (a7 != null) {
                                a7.G = 3.0f;
                                a7.F = 6.0f;
                                a7.E = 0.9f;
                                a7.V = 290.0f;
                                a7.W = a7.V;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a8 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                            if (a8 != null) {
                                a8.G = 2.0f;
                                a8.F = 6.0f;
                                a8.E = 0.5f;
                                a8.V = 370.0f;
                                a8.W = a8.V;
                                a8.U = 10.0f;
                            }
                            for (int i3 = 0; i3 < 1; i3++) {
                                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                                com.corrodinggames.rts.gameFramework.emitter.e a9 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (a9 != null) {
                                    a9.G = 0.2f;
                                    a9.F = 9.0f;
                                    a9.E = 0.7f;
                                    a9.V = 210.0f;
                                    a9.W = a9.V;
                                    a9.U = 20 + (i3 * 110);
                                }
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a10 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, 255, 255, 255));
                            if (a10 != null) {
                                a10.G = 3.0f;
                                a10.F = 4.0f;
                                a10.E = 0.2f;
                                a10.V = 870.0f;
                                a10.W = a10.V;
                                a10.r = true;
                                a10.U = 70.0f;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a11 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                            if (a11 != null) {
                                a11.G = 4.0f;
                                a11.F = 1.0f;
                                a11.E = 0.9f;
                                a11.V = 320.0f;
                                a11.W = a11.V;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a12 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                            if (a12 != null) {
                                a12.G = 2.0f;
                                a12.F = 1.0f;
                                a12.E = 1.0f;
                                a12.V = 340.0f;
                                a12.W = a12.V;
                                a12.s = true;
                                a12.t = 20.0f;
                            }
                            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                            com.corrodinggames.rts.gameFramework.emitter.e a13 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                            if (a13 != null) {
                                a13.G = 1.5f;
                                a13.F = 1.5f;
                                a13.E = 0.3f;
                                a13.V = 1340.0f;
                                a13.W = a13.V;
                                a13.s = true;
                                a13.t = 40.0f;
                                a13.U = 140.0f;
                            }
                            for (int i4 = 0; i4 < 4; i4++) {
                                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                                com.corrodinggames.rts.gameFramework.emitter.e a14 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (a14 != null) {
                                    a14.G = 1.5f;
                                    a14.F = 1.4f;
                                    a14.E = 1.3f;
                                    a14.V = 340.0f;
                                    a14.W = a14.V;
                                    a14.Q = -0.29f;
                                    a14.s = true;
                                    a14.t = 50.0f;
                                    a14.U = 30 + (i4 * 40);
                                }
                            }
                            for (int i5 = 0; i5 < 2; i5++) {
                                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                                com.corrodinggames.rts.gameFramework.emitter.e a15 = gameEngine.bR.a(this.aV, this.aW, this.eq, Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (a15 != null) {
                                    a15.G = 1.3f;
                                    a15.F = 1.0f;
                                    a15.E = 1.0f;
                                    a15.V = 340.0f;
                                    a15.W = a15.V;
                                    a15.Q = -0.14f;
                                    a15.s = true;
                                    a15.t = 50.0f;
                                    a15.U = 70 + (i5 * 70);
                                }
                            }
                            for (int i6 = 0; i6 < 4; i6++) {
                                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                                com.corrodinggames.rts.gameFramework.emitter.e a16 = gameEngine.bR.a(this.aV, this.aW - 30.0f, this.eq, -16711936);
                                if (a16 != null) {
                                    a16.G = 1.5f;
                                    a16.F = 2.6f;
                                    a16.E = 1.3f;
                                    a16.V = 510.0f;
                                    a16.W = a16.V;
                                    a16.Q = -0.2f;
                                    a16.s = true;
                                    a16.t = 50.0f;
                                    a16.B = null;
                                    a16.x = Color.a(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                    a16.U = 20 + (i6 * 40);
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                                com.corrodinggames.rts.gameFramework.emitter.e a17 = gameEngine.bR.a(this.aV, this.aW - 30.0f, this.eq, -16711936);
                                if (a17 != null) {
                                    a17.G = 1.5f;
                                    a17.F = 3.8f;
                                    a17.E = 0.8f;
                                    a17.V = 590.0f;
                                    a17.W = a17.V;
                                    a17.Q = -0.2f;
                                    a17.s = true;
                                    a17.t = 50.0f;
                                    a17.B = null;
                                    a17.x = Color.a(105, 115, 115, 115);
                                    a17.U = 20 + (i7 * 40);
                                }
                            }
                            for (int i8 = 0; i8 < 1; i8++) {
                                Emitter a18 = Emitter.a(this.aV + com.corrodinggames.rts.gameFramework.f.a(-10.0f, 10.0f, (int) this.eh), this.aW + com.corrodinggames.rts.gameFramework.f.a(-10.0f, 10.0f, ((int) this.eh) + i8));
                                if (a18 != null) {
                                    a18.t = 200 + (i8 * 70);
                                    a18.a = 980 + (i8 * 800);
                                }
                            }
                            if (!com.corrodinggames.rts.gameFramework.utility.y.d(this.aV, this.aW)) {
                                ScorchMark.a(this.aV, this.aW, m.nuke);
                            }
                            if (GameEngine.aB()) {
                                if (gameEngine.bR.m == null) {
                                    gameEngine.bR.m = gameEngine.bO.a(AssetsID.drawable.shockwave_normal_256, true);
                                }
                                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                                com.corrodinggames.rts.gameFramework.emitter.e a19 = gameEngine.bR.a(this.aV, this.aW, this.eq, -1);
                                if (a19 != null && gameEngine.bR.m != null) {
                                    a19.a = new ay((com.corrodinggames.rts.game.units.custom.az) null);
                                    a19.a.imageStrip = new com.corrodinggames.rts.gameFramework.emitter.g();
                                    a19.a.imageStrip.k = true;
                                    a19.a.imageStrip.i = gameEngine.bR.m;
                                    a19.a.imageStrip.b = a19.a.imageStrip.i.m();
                                    a19.a.imageStrip.c = a19.a.imageStrip.i.l();
                                    a19.ar = (short) 3;
                                    a19.G = 0.5f;
                                    a19.F = 3.5f;
                                    a19.E = 0.5f;
                                    a19.V = 60.0f;
                                    a19.W = a19.V;
                                    a19.Q = -0.2f;
                                    a19.s = true;
                                    a19.t = 1.0f;
                                    a19.B = null;
                                    a19.U = 0.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.bn && !this.V) {
            this.W = com.corrodinggames.rts.gameFramework.f.a(this.W, f2);
            if (this.ao) {
                b(1.0f - (this.W / this.X));
            }
            if (this.W == 0.0f) {
                this.V = true;
                b(1.0f);
                if (!this.B && !this.M && !gVar.X) {
                    a();
                }
            }
        }
        this.J += f2;
        if (this.h == 0.0f && (!this.bn || this.V)) {
            if (gVar.ak != null) {
                gVar.ak.a(this.eo, this.ep, this.eq, this.az, this.j, null, false, this.aD + 1, this, null);
            }
            a();
        }
        if (!this.aU) {
            this.aT = f29;
            this.aU = true;
        }
        this.aT += com.corrodinggames.rts.gameFramework.f.c(this.aT, f29, 12.0f * f2);
    }

    public void b(float f2) {
        boolean z = false;
        if (this.g.f) {
            return;
        }
        if (this.g.e) {
            z = true;
        }
        if (!z) {
            if (this.Y != 0.0f && this.Z > 0.0f) {
                z = true;
            }
            if ((this.ag != 0.0f || this.ah != 0.0f) && this.Z > 0.0f) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        float f3 = this.Z * f2;
        float f4 = f3;
        if (this.g.h) {
            f4 += 150.0f;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        bi.clear();
        gameEngine.cc.b(this.aV, this.aW, f4, bi);
        am[] a2 = bi.a();
        int size = bi.size();
        for (int i = 0; i < size; i++) {
            b(a2[i], f2, f3);
        }
        bi.clear();
    }

    public void b(am amVar, float f2, float f3) {
        if (amVar.cN != null) {
            return;
        }
        if (this.ap != null && this.ap.contains(amVar)) {
            return;
        }
        if (this.j != null) {
            PlayerData playerData = this.j.bX;
            PlayerData playerData2 = amVar.bX;
            if (playerData2 != playerData && playerData.d(playerData2)) {
                return;
            }
            if (this.aa && !playerData.c(playerData2)) {
                return;
            }
            if (this.ab && playerData.c(playerData2)) {
                return;
            }
        }
        if (amVar.eq < -5.0f && this.aX >= -2.0f && !this.ac) {
            return;
        }
        if (this.ae) {
            if (amVar.i() != (this.aX >= 5.0f)) {
                return;
            }
        } else if (!this.ad && amVar.i()) {
            return;
        }
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.aV, this.aW, amVar.eo, amVar.ep);
        if (a2 > f3 * f3 && !this.g.h) {
            return;
        }
        float sqrt = (float) StrictMath.sqrt(a2);
        if (this.g.h) {
            sqrt -= amVar.cj;
            if (sqrt < 0.0f) {
                sqrt = 0.0f;
            }
        }
        if (sqrt > f3 || sqrt < this.g.j) {
            return;
        }
        a(f2, amVar, sqrt);
    }

    public void a(float f2, am amVar, float f3) {
        float f4 = (float) ((1.0f - (f3 / this.Z)) + 0.1d);
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (this.g.g) {
            f4 = 1.0f;
        }
        float f5 = f4 * this.Y;
        a(amVar);
        a(this.j, amVar, this.g.a(amVar, f5, true), this, true);
        if (this.ao) {
            if (this.ap == null) {
                this.ap = new com.corrodinggames.rts.gameFramework.utility.m();
            }
            this.ap.add(amVar);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        if (gameEngine.cO.b(this.eo, this.ep)) {
            return true;
        }
        if ((this.B || this.E || this.g.X) && this.l != null && gameEngine.cO.b(this.l.eo, this.l.ep)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        float f3;
        float f4;
        float f5;
        if (!this.S || this.i > 0.0f) {
            return false;
        }
        g gVar = this.g;
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
        float f6 = this.eo - gameEngine.cw;
        float f7 = this.ep - gameEngine.cx;
        if (this.l != null) {
            f3 = this.l.eo;
            f4 = this.l.ep;
            f5 = this.l.eq;
        } else {
            f3 = this.n;
            f4 = this.o;
            f5 = this.p;
        }
        if (!this.aZ && !this.D) {
            boolean z = false;
            if (this.A) {
                if (this.l != null) {
                    if (!gameEngine.bL.a(this.l.eo, this.l.ep, gameEngine.playerTeam)) {
                        z = true;
                    }
                } else if (this.m && !gameEngine.bL.a(this.n, this.o, gameEngine.playerTeam)) {
                    z = true;
                }
            }
            if (!gameEngine.bL.a(this.eo, this.ep, gameEngine.playerTeam) && !z) {
                return false;
            }
            this.aZ = true;
        }
        if (this.E || gVar.X) {
            if (gVar.Y != null) {
                Paint f8 = f();
                float f9 = 0.0f;
                if (gVar.ad != 0.0f) {
                    f9 = 0.0f + (gVar.ad * this.J);
                }
                float f10 = this.eo - gameEngine.cw;
                float f11 = (this.ep - gameEngine.cx) - this.eq;
                float f12 = (f3 - gameEngine.cw) + this.K;
                float f13 = ((f4 - f5) - gameEngine.cx) + this.L;
                float f14 = (f12 + f10) * 0.5f;
                float f15 = (f13 + f11) * 0.5f;
                float b2 = com.corrodinggames.rts.gameFramework.f.b(f14, f15, f12, f13);
                float d2 = com.corrodinggames.rts.gameFramework.f.d(f14, f15, f12, f13);
                yVar.k();
                f.a(f14 - gVar.Y.r, f15 - b2, f14 + gVar.Y.r, f15 + b2);
                yVar.a(d2 + 90.0f, f14, f15);
                yVar.a(gVar.Y, f, f8, 0.0f, f9, 0, 0);
                yVar.l();
                if (gVar.Z != null) {
                    if (gVar.aa) {
                        yVar.k();
                        yVar.a(d2 + 90.0f, f10, f11);
                        yVar.a(gVar.Z, f10, f11, f8);
                        yVar.l();
                    } else {
                        yVar.a(gVar.Z, f10, f11, f8);
                    }
                }
                if (gVar.ab != null) {
                    if (gVar.ac) {
                        yVar.k();
                        yVar.a(d2 + 90.0f, f12, f13);
                        yVar.a(gVar.ab, f12, f13, f8);
                        yVar.l();
                        return true;
                    }
                    yVar.a(gVar.ab, f12, f13, f8);
                    return true;
                }
                return true;
            }
            bf.c((int) (60.0f + (e() * 60.0f)));
            float f16 = (f3 - gameEngine.cw) + this.K;
            float f17 = ((f4 - f5) - gameEngine.cx) + this.L;
            bf.a(6.0f);
            yVar.a(this.eo - gameEngine.cw, (this.ep - gameEngine.cx) - this.eq, f16, f17, bf);
            bf.a(3.0f);
            yVar.a(this.eo - gameEngine.cw, (this.ep - gameEngine.cx) - this.eq, f16, f17, bf);
            yVar.a(f16, f17, 8.0f, bf);
            yVar.a(f16, f17, 5.0f, bf);
            return true;
        } else if (this.B) {
            float f18 = (f3 - gameEngine.cw) + this.K;
            float f19 = ((f4 - f5) - gameEngine.cx) + this.L;
            bd.b(this.ar);
            be.b(this.ar);
            be.c((int) (be.f() * 0.5f));
            yVar.a(this.eo - gameEngine.cw, (this.ep - gameEngine.cx) - this.eq, f18, f19, be);
            yVar.a(this.eo - gameEngine.cw, (this.ep - gameEngine.cx) - this.eq, f18, f19, bd);
            yVar.a(f18, f19, 5.0f, bd);
            return true;
        } else if (this.M) {
            this.N = com.corrodinggames.rts.gameFramework.f.a(this.N, f2);
            if (this.O == null) {
                this.O = new float[20];
                this.N = 0.0f;
            }
            if (this.N == 0.0f) {
                this.N = 4.0f;
                for (int i = 0; i < this.O.length; i++) {
                    this.O[i] = com.corrodinggames.rts.gameFramework.f.c(-10.0f, 10.0f);
                }
            }
            float f20 = this.eo - gameEngine.cw;
            float f21 = (this.ep - gameEngine.cx) - this.eq;
            float f22 = f3 - gameEngine.cw;
            float f23 = (f4 - f5) - gameEngine.cx;
            float c2 = com.corrodinggames.rts.gameFramework.f.c(f20, f21, f22, f23);
            int length = this.O.length;
            if (c2 < 200.0f) {
                length = com.corrodinggames.rts.gameFramework.f.b(0, length - 5);
            } else if (c2 < 100.0f) {
                length = com.corrodinggames.rts.gameFramework.f.b(0, length - 10);
            }
            float f24 = c2 / (length - 1);
            float d3 = com.corrodinggames.rts.gameFramework.f.d(f20, f21, f22, f23);
            float f25 = f20;
            float f26 = f21;
            float k = com.corrodinggames.rts.gameFramework.f.k(d3);
            float j = com.corrodinggames.rts.gameFramework.f.j(d3);
            for (int i2 = 0; i2 < length; i2++) {
                float f27 = this.O[i2];
                float f28 = f20 + (k * i2 * f24);
                float f29 = f21 + (j * i2 * f24);
                if (i2 != length - 1) {
                    f28 -= j * f27;
                    f29 += k * f27;
                }
                yVar.a(f25, f26, f28, f29, bg);
                f25 = f28;
                f26 = f29;
            }
            return true;
        } else if (this.P != -1) {
            com.corrodinggames.rts.gameFramework.unitAction.e eVar = b;
            int i3 = 20;
            int i4 = 20;
            if (this.R == 1) {
                eVar = d;
                i3 = 60;
                i4 = 60;
            } else if (this.R == 2) {
                eVar = c;
                i3 = 20;
                i4 = 20;
            }
            if (gVar.C != null) {
                com.corrodinggames.rts.gameFramework.utility.y.a(gVar.C, f6, f7, 0.0f, this.aT, this.x, bc, gVar.C.p, gVar.C.q, 0);
            } else if (this.Q != -1 && this.z) {
                com.corrodinggames.rts.gameFramework.utility.y.a(eVar, f6, f7, 0.0f, this.aT, this.x, bc, i3, i4, this.Q);
            }
            if (gVar.B != null) {
                eVar = gVar.B;
                i3 = gVar.B.p;
                i4 = gVar.B.q;
            }
            com.corrodinggames.rts.gameFramework.utility.y.a(eVar, f6, f7, this.eq, this.aT, this.x, f(), i3, i4, this.P);
            return true;
        } else {
            bb.b(this.ar);
            if (this.eq > 0.0f && this.z) {
                yVar.a(f6, f7, this.x, bc);
            }
            yVar.a(f6, f7 - this.eq, this.x, bb);
            if (this.y > 0.0f) {
                bb.c(bb.f() / 3);
                yVar.a(f6, f7 - this.eq, this.y, bb);
                return true;
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f2, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void d(float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void e(float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean f(float f2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    public Paint f() {
        ag agVar;
        if (this.ar != aq) {
            if (GameEngine.at()) {
                agVar = a(this.ar);
            } else {
                agVar = bb;
                agVar.b(this.ar);
            }
        } else {
            agVar = ba;
        }
        return agVar;
    }

    public ag a(int i) {
        if (this.bj != null) {
            return this.bj;
        }
        if (bk != null && bl == i) {
            this.bj = bk;
            return this.bj;
        }
        ag agVar = new ag();
        agVar.a(new LightingColorFilter(i, 0));
        agVar.b(i);
        bk = agVar;
        bl = i;
        this.bj = agVar;
        return this.bj;
    }

    public void a(float f2, float f3, com.corrodinggames.rts.game.units.custom.h hVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.j == null) {
            GameEngine.print("Projectile: cannot Retarget: source==null");
            return;
        }
        float k = this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.az) * f3);
        float j = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.az) * f3);
        float f4 = f2 * f2;
        float f5 = -1.0f;
        y yVar = null;
        am amVar = null;
        if (this.j instanceof y) {
            yVar = (y) this.j;
            amVar = yVar.ab();
        }
        Iterator it = gameEngine.cc.a(k, j, f2).iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (this.j.bX != amVar2.bX) {
                boolean z = true;
                if (yVar != null) {
                    z = yVar.b(amVar2, true);
                }
                if (z && this.k >= 0 && yVar != null && this.k < yVar.bl() && !yVar.a((int) this.k, amVar2, true, false)) {
                    z = false;
                }
                if (hVar != null && !com.corrodinggames.rts.game.units.custom.g.a(hVar, amVar2.de())) {
                    z = false;
                }
                if (z) {
                    float a2 = com.corrodinggames.rts.gameFramework.f.a(k, j, amVar2.eo, amVar2.ep);
                    boolean z2 = false;
                    if (f5 == -1.0f || a2 < f5) {
                        z2 = true;
                    }
                    if (amVar == amVar2) {
                        z2 = true;
                    }
                    if (z2 && a2 < f4) {
                        f5 = a2;
                        this.l = amVar2;
                    }
                }
            }
        }
    }
}
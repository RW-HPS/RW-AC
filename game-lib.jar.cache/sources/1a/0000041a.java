package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.custom.be;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bs;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/y.class */
public abstract class y extends c {
    protected com.corrodinggames.rts.gameFramework.unitAction.e M;
    protected com.corrodinggames.rts.gameFramework.unitAction.e N;
    private int a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private au[] g;
    public a P;
    int Q;
    public am R;
    public float S;
    public float T;
    public float U;
    private boolean h;
    private int i;
    public float V;
    public float W;
    public float X;
    public float Y;
    private boolean j;
    private boolean k;
    private float l;
    private float m;
    private int n;
    private float o;
    private float p;
    private byte q;
    private int r;
    private float s;
    private boolean t;
    public am Z;
    public int aa;
    public float ab;
    public int ac;
    public y ad;
    public boolean ae;
    public boolean af;
    public int ag;
    public short ah;
    public float ai;
    public boolean aj;
    public float ak;
    public float al;
    public float am;
    public int an;
    public float ao;
    public boolean ap;
    public float aq;
    public boolean ar;
    public boolean as;
    public com.corrodinggames.rts.gameFramework.path.c au;
    protected af[] av;
    protected int aw;
    private boolean u;
    private int v;
    private int w;
    public boolean ax;
    public boolean ay;
    public float az;
    public float aA;
    public com.corrodinggames.rts.game.a.h aB;
    public com.corrodinggames.rts.game.a.i aC;
    public boolean aD;
    public static final com.corrodinggames.rts.gameFramework.unitAction.ag aF;
    public static final PointF aG;
    private com.corrodinggames.rts.gameFramework.unitAction.ag x;
    private int y;
    private com.corrodinggames.rts.gameFramework.unitAction.ag z;
    private int A;
    private static final Paint B;
    private static int C;
    private static final com.corrodinggames.rts.gameFramework.unitAction.ag D;
    private static final com.corrodinggames.rts.gameFramework.unitAction.ag E;
    public static com.corrodinggames.rts.game.units.f.j aH;
    public byte aI;
    public am[] aJ;
    public float[] aK;
    public int aL;
    public static final com.corrodinggames.rts.gameFramework.utility.u aM;
    public boolean aN;
    public boolean aO;
    static final ad aP;
    public static ae aQ;
    public static ae aR;
    public static ah aS;
    public static ah aT;
    com.corrodinggames.rts.gameFramework.path.k aU;
    static com.corrodinggames.rts.gameFramework.utility.m aV;
    public static final af aW;
    protected static PorterDuffColorFilter aX;
    protected static PorterDuffColorFilter aY;
    protected static PorterDuffColorFilter aZ;
    protected static PorterDuffColorFilter ba;
    protected static Paint bb;
    protected static Paint bc;
    protected static Paint bd;
    static final PointF be;
    protected static final com.corrodinggames.rts.gameFramework.utility.ai bf;
    protected static final PointF bg;
    protected static final PointF bh;
    protected static final com.corrodinggames.rts.gameFramework.utility.ai bi;
    protected static final PointF bj;
    static final Point bk;
    static final Point bl;
    static final PointF bm;
    static final z bn;
    public static final ac bo;
    public com.corrodinggames.rts.gameFramework.utility.m bp;
    static com.corrodinggames.rts.gameFramework.utility.m bq;
    public static boolean L = false;
    public static final au[] O = new au[0];
    public static final af[] at = new af[0];
    public static final com.corrodinggames.rts.gameFramework.unitAction.ag aE = new com.corrodinggames.rts.gameFramework.unitAction.ag();

    public abstract com.corrodinggames.rts.gameFramework.unitAction.e d();

    public abstract com.corrodinggames.rts.gameFramework.unitAction.e k();

    public abstract com.corrodinggames.rts.gameFramework.unitAction.e d(int i);

    public abstract boolean I();

    public abstract float m();

    public abstract float b(int i);

    public abstract float A();

    public abstract float c(int i);

    public abstract float z();

    public abstract void a(am amVar, int i);

    static {
        aE.a(128, 255, 255, 255);
        aE.o();
        aF = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        aF.a(aE);
        aF.a(true);
        aF.d(true);
        aF.b(true);
        aF.o();
        aG = new PointF();
        B = new Paint();
        D = a(false);
        E = a(true);
        aH = new com.corrodinggames.rts.game.units.f.j() { // from class: com.corrodinggames.rts.game.units.y.1
            @Override // com.corrodinggames.rts.game.units.f.j
            public void callback(y yVar, float f, am amVar) {
                yVar.a(amVar, f, true);
            }
        };
        aM = new com.corrodinggames.rts.gameFramework.utility.u();
        aP = new ad();
        aQ = new ae(true);
        aR = new ae(false);
        aS = new ah(true);
        aT = new ah(false);
        aV = new com.corrodinggames.rts.gameFramework.utility.m();
        aW = new af();
        aX = new PorterDuffColorFilter(Color.a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
        aY = new PorterDuffColorFilter(Color.a(70, 255, 70), PorterDuff.Mode.MULTIPLY);
        aZ = new PorterDuffColorFilter(Color.a(255, 40, 40), PorterDuff.Mode.MULTIPLY);
        ba = new PorterDuffColorFilter(Color.a(120, 120, 255), PorterDuff.Mode.MULTIPLY);
        bb = com.corrodinggames.rts.gameFramework.utility.y.b();
        bc = com.corrodinggames.rts.gameFramework.utility.y.b();
        bd = com.corrodinggames.rts.gameFramework.utility.y.b();
        be = new PointF();
        bf = new com.corrodinggames.rts.gameFramework.utility.ai();
        bg = new PointF();
        bh = new PointF();
        bi = new com.corrodinggames.rts.gameFramework.utility.ai();
        bj = new PointF();
        bk = new Point();
        bl = new Point();
        bm = new PointF();
        bn = new z();
        bo = new ac();
        bq = new com.corrodinggames.rts.gameFramework.utility.m();
    }

    public void b(float f) {
        if (this.az < f) {
            this.az = f;
        }
    }

    public Paint R() {
        if (aO()) {
            return aF;
        }
        return aE;
    }

    public static void a(y yVar, y yVar2) {
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            int i = yVar.f;
            for (int i2 = 0; i2 < i; i2++) {
                yVar.g[i2].a(gameOutputStream);
            }
            GameInputStream gameInputStream = new GameInputStream(gameOutputStream.toByteArray());
            yVar2.f = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3;
                yVar2.m(i4);
                if (i4 >= yVar2.g.length) {
                    GameEngine.print("Too many waypoints:" + i3);
                    i4 = yVar2.g.length - 1;
                }
                if (yVar2.g[i4] == null) {
                    yVar2.g[i4] = new au();
                }
                yVar2.g[i4].a(gameInputStream);
                yVar2.g[i4].c();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.b);
        gameOutputStream.writeFloat(this.c);
        gameOutputStream.writeFloat(this.cL[0].e);
        gameOutputStream.writeInt(this.f);
        int i = this.f;
        gameOutputStream.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2].a(gameOutputStream);
        }
        gameOutputStream.writeEnum(this.P);
        am amVar = this.R;
        if (amVar != null && amVar.bV) {
            amVar = null;
        }
        gameOutputStream.a(amVar);
        gameOutputStream.writeFloat(this.S);
        gameOutputStream.writeFloat(this.U);
        gameOutputStream.writeFloat(this.V);
        gameOutputStream.d("pathing_active:");
        gameOutputStream.writeBoolean(this.k);
        gameOutputStream.writeFloat(this.l);
        gameOutputStream.writeFloat(this.m);
        gameOutputStream.writeFloat(this.s);
        gameOutputStream.a(this.ad);
        gameOutputStream.writeBoolean(this.ae);
        gameOutputStream.writeBoolean(this.af);
        gameOutputStream.writeBoolean(this.aj);
        gameOutputStream.writeFloat(this.ak);
        gameOutputStream.writeFloat(this.al);
        gameOutputStream.writeFloat(this.am);
        gameOutputStream.writeInt(this.an);
        gameOutputStream.writeInt(this.ac);
        gameOutputStream.d("activePathCount:");
        gameOutputStream.writeInt(this.aw);
        for (int i3 = 0; i3 < this.aw; i3++) {
            this.av[i3].a(gameOutputStream);
        }
        gameOutputStream.writeInt(this.aw);
        gameOutputStream.writeInt(this.v);
        if (gameOutputStream.f()) {
        }
        gameOutputStream.writeByte(12);
        gameOutputStream.writeFloat(this.o);
        gameOutputStream.writeFloat(this.p);
        gameOutputStream.writeFloat(this.d);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeBoolean(this.u);
        gameOutputStream.writeFloat(this.ai);
        gameOutputStream.writeInt(this.n);
        gameOutputStream.writeFloat(this.W);
        gameOutputStream.writeFloat(this.aq);
        gameOutputStream.writeBoolean(this.ar);
        gameOutputStream.writeBoolean(this.as);
        gameOutputStream.a(this.ah);
        gameOutputStream.writeFloat(this.ab);
        gameOutputStream.writeInt(this.w);
        gameOutputStream.writeFloat(this.X);
        gameOutputStream.writeFloat(this.az);
        gameOutputStream.writeFloat(this.aA);
        com.corrodinggames.rts.game.units.g.c.a(this, gameOutputStream);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.b = gameInputStream.readFloat();
        this.c = gameInputStream.readFloat();
        this.cL[0].e = gameInputStream.readFloat();
        this.f = gameInputStream.readInt();
        if (this.f > 0) {
            m(com.corrodinggames.rts.gameFramework.f.c(this.f - 1, 29));
        }
        int i = 30;
        if (gameInputStream.b() >= 42) {
            i = gameInputStream.readInt();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            m(i3);
            if (i3 >= this.g.length) {
                GameEngine.print("Too many waypoints:" + i2);
                i3 = this.g.length - 1;
            }
            if (this.g[i3] == null) {
                this.g[i3] = new au();
            }
            this.g[i3].a(gameInputStream);
        }
        this.P = (a) gameInputStream.b(a.class);
        if (this.P == a.outOfRange) {
            if (!I()) {
                this.P = a.onlyInRange;
            }
            if (gameInputStream.b() < 74) {
                this.P = a.onlyInRange;
            }
        }
        long m4n = gameInputStream.m4n();
        this.S = gameInputStream.readFloat();
        this.U = gameInputStream.readFloat();
        this.V = gameInputStream.readFloat();
        this.k = gameInputStream.readBoolean();
        this.l = gameInputStream.readFloat();
        this.m = gameInputStream.readFloat();
        this.s = gameInputStream.readFloat();
        a(gameInputStream.p());
        this.ae = gameInputStream.readBoolean();
        this.af = gameInputStream.readBoolean();
        this.aj = gameInputStream.readBoolean();
        this.ak = gameInputStream.readFloat();
        this.al = gameInputStream.readFloat();
        this.am = gameInputStream.readFloat();
        this.an = gameInputStream.readInt();
        if (gameInputStream.b() >= 18) {
            this.ac = gameInputStream.readInt();
        }
        if (gameInputStream.b() >= 21) {
            int readInt = gameInputStream.readInt();
            for (int i4 = 0; i4 < readInt; i4++) {
                l(i4);
                if (this.av[i4] == null) {
                    this.av[i4] = new af();
                }
                this.av[i4].a(gameInputStream);
            }
        } else {
            for (int i5 = 0; i5 < 60; i5++) {
                l(i5);
                if (this.av[i5] == null) {
                    this.av[i5] = new af();
                }
                this.av[i5].a(gameInputStream);
            }
        }
        this.aw = gameInputStream.readInt();
        this.v = gameInputStream.readInt();
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.o = gameInputStream.readFloat();
            this.p = gameInputStream.readFloat();
        }
        if (readByte >= 2) {
            this.d = gameInputStream.readFloat();
            this.e = gameInputStream.readFloat();
        }
        if (readByte >= 3) {
            this.u = gameInputStream.readBoolean();
        }
        if (readByte >= 4) {
            this.ai = gameInputStream.readFloat();
            this.n = gameInputStream.readInt();
        }
        if (readByte >= 5) {
            this.W = gameInputStream.readFloat();
        }
        if (readByte >= 6) {
            this.aq = gameInputStream.readFloat();
            this.ar = gameInputStream.readBoolean();
            this.as = gameInputStream.readBoolean();
        }
        if (readByte >= 7) {
            this.ah = gameInputStream.readShort();
        }
        if (readByte >= 8) {
            this.ab = gameInputStream.readFloat();
        }
        if (readByte >= 9) {
            this.w = gameInputStream.readInt();
        }
        if (readByte >= 10) {
            this.X = gameInputStream.readFloat();
        }
        if (readByte >= 11) {
            this.az = gameInputStream.readFloat();
            this.aA = gameInputStream.readFloat();
        }
        if (readByte >= 12) {
            com.corrodinggames.rts.game.units.g.c.a(this, gameInputStream);
        }
        super.a(gameInputStream);
        if (!this.bV) {
            this.R = com.corrodinggames.rts.gameFramework.w.a(m4n, false);
            for (int i6 = 0; i6 < this.f; i6++) {
                if (this.g[i6] == null) {
                    GameEngine.m5e("readIn: convertUnitIds is null: " + i6 + " waypointsCount:" + this.f);
                } else {
                    this.g[i6].c();
                }
            }
        }
        S();
        if (this.bV) {
            this.ew = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void b(PlayerData playerData) {
        super.b(playerData);
        S();
    }

    public void S() {
        this.M = d();
        this.N = k();
    }

    public float h(int i) {
        return 0.0f;
    }

    public float i(int i) {
        return 0.0f;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e T() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.graphics.Paint] */
    public Paint a(int i, ColorFilter colorFilter, boolean z) {
        com.corrodinggames.rts.gameFramework.unitAction.ag agVar;
        int i2;
        if (i == -1 && colorFilter == null) {
            if (z) {
                return E;
            }
            return D;
        }
        if (this.cp) {
            if (colorFilter == null) {
                agVar = B;
                i2 = C;
                C = i;
            } else {
                agVar = B;
                i2 = -1;
                if (colorFilter == aZ) {
                    agVar = bc;
                }
                if (colorFilter == aY) {
                    agVar = bb;
                }
                if (colorFilter == ba) {
                    agVar = bd;
                }
            }
        } else if (z) {
            if (this.z == null) {
                this.z = a(true);
            }
            agVar = this.z;
            i2 = this.A;
            this.A = i;
        } else {
            if (this.x == null) {
                this.x = a(false);
            }
            agVar = this.x;
            i2 = this.y;
            this.y = i;
        }
        if (i2 != i) {
            agVar.b(i);
        }
        if (agVar.h() != colorFilter) {
            agVar.a(colorFilter);
        }
        return agVar;
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.ag a(boolean z) {
        com.corrodinggames.rts.gameFramework.unitAction.ag agVar = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        if (z) {
            agVar.a(true);
            agVar.d(true);
            agVar.b(true);
        } else {
            agVar.a(false);
            agVar.d(false);
            agVar.b(false);
        }
        return agVar;
    }

    public y(boolean z) {
        super(z);
        this.f = 0;
        this.g = O;
        this.P = a.onlyInRange;
        this.Q = -9999;
        this.i = -9999;
        this.l = 3.0f;
        this.m = 3.0f;
        this.aj = false;
        this.ak = 0.0f;
        this.al = 0.0f;
        this.am = 0.0f;
        this.an = 0;
        this.ao = 0.0f;
        this.aq = -999.0f;
        this.ar = false;
        this.as = false;
        this.av = at;
        this.aw = 0;
        this.v = 0;
        this.ax = true;
        this.x = null;
        this.z = null;
        this.aI = (byte) 0;
        this.aL = -9999;
        this.aU = null;
    }

    public final void j(int i) {
        int bl2 = bl();
        for (int i2 = 0; i2 < bl2; i2++) {
            this.cL[i2].a(i);
        }
    }

    public void a(String str) {
        String str2;
        if (mo1r() != null) {
            str2 = mo1r().i();
        } else {
            str2 = "<NO UNIT TYPE>";
        }
        GameEngine.m5e("(Unit log:" + str2 + " id:" + this.eh + "): " + str);
    }

    public void U() {
        String str;
        if (mo1r() != null) {
            str = mo1r().i();
        } else {
            str = "<NO UNIT TYPE>";
        }
        GameEngine.m5e("---- Debug for:" + str + " id:" + this.eh + "---");
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        float D2;
        float f2;
        float f3;
        super.a(f);
        if (this.ay) {
            this.ay = false;
        }
        if (this.cl != 0.0f) {
            this.cl = com.corrodinggames.rts.gameFramework.f.a(this.cl, f);
        }
        if (!this.bV && bT()) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.az > 0.0f) {
                this.az = com.corrodinggames.rts.gameFramework.f.a(this.az, f);
            }
            if (this.aA > 0.0f) {
                this.aA = com.corrodinggames.rts.gameFramework.f.a(this.aA, f);
            }
            if (this.bp != null) {
                com.corrodinggames.rts.game.units.g.c.a(this, f);
            }
            float f4 = this.eo;
            float f5 = this.ep;
            int bl2 = bl();
            for (int i = 0; i < bl2; i++) {
                ap apVar = this.cL[i];
                if (apVar.d == 0.0f) {
                    float C2 = C(i);
                    if (b(i, f) && apVar.a != C2) {
                        if (com.corrodinggames.rts.gameFramework.f.c(com.corrodinggames.rts.gameFramework.f.c(apVar.a, C2, 360.0f)) < 0.5f) {
                            apVar.d = 20.0f;
                            apVar.c = 0.0f;
                        } else {
                            a(f, C2, i);
                        }
                    }
                } else {
                    apVar.d = com.corrodinggames.rts.gameFramework.f.a(apVar.d, f);
                }
            }
            if (!bk()) {
                k(f);
            }
            for (int i2 = 0; i2 < bl2; i2++) {
                ap apVar2 = this.cL[i2];
                if (apVar2.e != 0.0f) {
                    apVar2.e = com.corrodinggames.rts.gameFramework.f.a(apVar2.e, f);
                }
            }
            boolean bi2 = bi();
            boolean z = (this.cc == 0.0f && this.cd == 0.0f) ? false : true;
            if ((this.cf != 0.0f || z) && I()) {
                float f6 = this.cg;
                float z2 = z();
                if (bj()) {
                    f6 = this.ch;
                }
                if (!bi2) {
                    float f7 = z2 * this.cf * f;
                    f4 += com.corrodinggames.rts.gameFramework.f.k(f6) * f7;
                    f5 += com.corrodinggames.rts.gameFramework.f.j(f6) * f7 * aZ();
                    if (z) {
                        f4 += this.cc * f;
                        f5 += this.cd * f * aZ();
                        if (com.corrodinggames.rts.gameFramework.f.a(0.0f, 0.0f, this.cc, this.cd) > z2 * z2) {
                            this.cc = (float) (this.cc - ((this.cc * 0.05d) * f));
                            this.cd = (float) (this.cd - ((this.cd * 0.05d) * f));
                        }
                        this.cc = com.corrodinggames.rts.gameFramework.f.a(this.cc, 0.0f, 0.5f * z2 * f);
                        this.cd = com.corrodinggames.rts.gameFramework.f.a(this.cd, 0.0f, 0.5f * z2 * f);
                    }
                } else {
                    if (this.cf != 0.0f) {
                        D2 = C() * 1.41f;
                        f2 = com.corrodinggames.rts.gameFramework.f.k(f6) * z2 * this.cf;
                        f3 = com.corrodinggames.rts.gameFramework.f.j(f6) * z2 * this.cf;
                    } else {
                        D2 = D() * 1.41f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    float a = com.corrodinggames.rts.gameFramework.f.a(this.cc, this.cd, f2, f3);
                    if (a > z2 * z2) {
                        this.cc = (float) (this.cc - ((this.cc * 0.05d) * f));
                        this.cd = (float) (this.cd - ((this.cd * 0.05d) * f));
                    }
                    float f8 = D2 * f;
                    if (a < f8 * f8) {
                        this.cc = f2;
                        this.cd = f3;
                    } else {
                        float d = com.corrodinggames.rts.gameFramework.f.d(this.cc, this.cd, f2, f3);
                        this.cc += com.corrodinggames.rts.gameFramework.f.k(d) * f8;
                        this.cd += com.corrodinggames.rts.gameFramework.f.j(d) * f8;
                    }
                    f4 += this.cc * f;
                    f5 += this.cd * f * aZ();
                }
                this.ay = true;
            }
            if (this.bZ != 0.0f || this.ca != 0.0f) {
                this.bZ = com.corrodinggames.rts.gameFramework.f.b(this.bZ, -9.0f, 9.0f);
                this.ca = com.corrodinggames.rts.gameFramework.f.b(this.ca, -9.0f, 9.0f);
                f4 += this.bZ;
                f5 += this.ca;
                this.ca = 0.0f;
                this.bZ = 0.0f;
                this.ay = true;
            }
            if (this.ay && I() && this.cO == null) {
                a(f, gameEngine, f4, f5);
            }
            if (this.ax) {
                this.ax = false;
                c(false);
                this.ay = true;
            }
        }
    }

    private void a(float f, GameEngine gameEngine, float f2, float f3) {
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        float f4 = bVar.r;
        float f5 = bVar.s;
        float f6 = this.eo * f4;
        float f7 = this.ep * f5;
        float f8 = f2 * f4;
        float f9 = f3 * f5;
        PointF pointF = null;
        boolean z = false;
        int f10 = com.corrodinggames.rts.gameFramework.f.f(f6);
        int f11 = com.corrodinggames.rts.gameFramework.f.f(f7);
        int f12 = com.corrodinggames.rts.gameFramework.f.f(f8);
        int f13 = com.corrodinggames.rts.gameFramework.f.f(f9);
        if ((f10 != f12 || f11 != f13) && this.cl == 0.0f && gameEngine.bU.a(h(), f12, f13)) {
            if (f10 != f12 && f11 != f13) {
                boolean a = gameEngine.bU.a(h(), f10, f13);
                boolean a2 = gameEngine.bU.a(h(), f12, f11);
                if (a && a2) {
                    z = true;
                    aG.setSite(f6, f7);
                    pointF = aG;
                }
                if (pointF == null && a) {
                    pointF = aq.a(h(), f6, f7, f8, f9, f10, f13, false);
                }
                if (pointF == null && a2) {
                    pointF = aq.a(h(), f6, f7, f8, f9, f12, f11, false);
                }
            }
            if (pointF == null) {
                pointF = aq.a(h(), f6, f7, f8, f9, f12, f13, false);
            }
            if (pointF == null) {
                z = true;
                aG.setSite(f6, f7);
                pointF = aG;
            }
        }
        boolean z2 = false;
        if (pointF != null) {
            boolean z3 = false;
            if (gameEngine.bU.a(h(), f10, f11) && !gameEngine.bU.b(h(), f12, f13)) {
                z3 = true;
            }
            if (!z3) {
                f2 = pointF.x * bVar.n;
                f3 = pointF.y * bVar.o;
                z2 = true;
            } else {
                z = false;
            }
        }
        if (z2) {
            this.b += f;
            this.a = 0;
        } else if (this.b != 0.0f && f > 0.0f) {
            this.a++;
            if (this.a >= 3) {
                this.b = 0.0f;
            }
        }
        if (!z) {
            int f14 = com.corrodinggames.rts.gameFramework.f.f(f2 * f4);
            int f15 = com.corrodinggames.rts.gameFramework.f.f(f3 * f5);
            this.eo = f2;
            this.ep = f3;
            if (f10 != f14 || f11 != f15) {
                c(true);
            }
        }
    }

    public void b(float f, float f2) {
        com.corrodinggames.rts.game.maps.b bVar = GameEngine.getGameEngine().bL;
        float f3 = bVar.r;
        float f4 = bVar.s;
        int f5 = com.corrodinggames.rts.gameFramework.f.f(this.eo * f3);
        int f6 = com.corrodinggames.rts.gameFramework.f.f(this.ep * f4);
        int f7 = com.corrodinggames.rts.gameFramework.f.f(f * f3);
        int f8 = com.corrodinggames.rts.gameFramework.f.f(f2 * f4);
        this.eo = f;
        this.ep = f2;
        if (f5 != f7 || f6 != f8) {
            c(true);
        }
    }

    public static void g(float f) {
        int i;
        float f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.cd.a(bs.update_do_all_collisions);
        int i2 = gameEngine.by;
        com.corrodinggames.rts.gameFramework.utility.u uVar = aM;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i3 = 0; i3 < size; i3++) {
            a[i3].bR();
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (a[i4] instanceof y) {
                y yVar = (y) a[i4];
                if ((yVar.ay || yVar.cb) && yVar.I() && yVar.aL <= i2) {
                    yVar.cb = false;
                    yVar.ay = true;
                    if (yVar.cK) {
                        f2 = yVar.cj + 7.0f;
                        if (yVar.aI > 9) {
                            yVar.aL = i2 + 200 + (i4 % 50);
                        } else {
                            yVar.aL = i2 + 50 + (i4 % 50);
                        }
                    } else {
                        f2 = yVar.cj + 5.0f;
                        yVar.aL = i2 + 250 + (i4 % 50);
                    }
                    yVar.aI = (byte) 0;
                    uVar.clear();
                    gameEngine.cc.b(yVar.eo, yVar.ep, f2, uVar);
                    am[] a2 = uVar.a();
                    int i5 = uVar.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        yVar.a(a2[i6], f, true);
                    }
                    if (yVar.aI > 9 && yVar.bz > i2 - 400) {
                        yVar.aL = gameEngine.by + 5 + (i4 % 5);
                        yVar.cb = true;
                    }
                }
            }
        }
        gameEngine.cd.b(bs.update_do_all_collisions);
        gameEngine.cd.a(bs.update_do_all_collisions2);
        for (int i7 = 0; i7 < size; i7++) {
            if (a[i7] instanceof y) {
                y yVar2 = (y) a[i7];
                if (yVar2.ay && (i = yVar2.aI) > 0 && yVar2.I()) {
                    if (!yVar2.cb) {
                        yVar2.cb = true;
                    }
                    for (int i8 = 0; i8 < i; i8++) {
                        yVar2.a(yVar2.aJ[i8], f, false);
                    }
                }
            }
        }
        gameEngine.cd.b(bs.update_do_all_collisions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(am amVar, float f, boolean z) {
        int i;
        au ar;
        au ar2;
        if (amVar == this || (i = this.bU) == -1 || i != amVar.bU || this.bQ == amVar || amVar.bQ == this) {
            return;
        }
        float f2 = this.eo + this.bZ;
        float f3 = this.ep + this.ca;
        float f4 = amVar.eo + amVar.bZ;
        float f5 = amVar.ep + amVar.ca;
        float a = com.corrodinggames.rts.gameFramework.f.a(f2, f3, f4, f5);
        float f6 = this.cj + amVar.cj;
        if (z) {
            float f7 = a;
            if (a < f6 * f6) {
                f7 = 0.0f;
            }
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                int i2 = yVar.aI;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (yVar.aJ[i3] == this) {
                        return;
                    }
                }
            }
            if (this.aJ == null) {
                this.aJ = new am[10];
                this.aK = new float[10];
            }
            am[] amVarArr = this.aJ;
            float[] fArr = this.aK;
            byte b = -1;
            int i4 = 0;
            while (true) {
                if (i4 < this.aI) {
                    if (f7 >= fArr[i4]) {
                        i4++;
                    } else {
                        b = i4;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (b == -1) {
                if (this.aI < amVarArr.length) {
                    b = this.aI;
                } else {
                    return;
                }
            }
            if (this.aI < amVarArr.length) {
                this.aI = (byte) (this.aI + 1);
            }
            for (int i5 = this.aI - 1; i5 > b; i5--) {
                amVarArr[i5] = amVarArr[i5 - 1];
            }
            amVarArr[b] = amVar;
            fArr[b] = f7;
        } else if (a < f6 * f6 && !amVar.a(this, f) && !a(amVar, f)) {
            float d = com.corrodinggames.rts.gameFramework.f.d(f2, f3, f4, f5);
            float sqrt = (f6 - ((float) Math.sqrt(a))) + 0.001f;
            if (sqrt <= 0.0f) {
                return;
            }
            int s = s(amVar);
            int s2 = amVar.s(this);
            int i6 = s > s2 ? s : s2;
            if (i6 != 0) {
                float f8 = (sqrt / i6) * f;
                if (f8 > sqrt) {
                    f8 = sqrt;
                }
                sqrt = f8;
            }
            float f9 = sqrt * 0.95f;
            if (f9 > 1.0f) {
                f9 *= 0.7f;
            }
            if (f9 > 3.0f) {
                f9 = 3.0f + ((f9 - 3.0f) * 0.7f);
            }
            if (f9 > 6.0f) {
                f9 = 6.0f + ((f9 - 6.0f) * 0.7f);
            }
            if (f9 > 10.0f) {
                f9 = 10.0f + ((f9 - 10.0f) * 0.7f);
            }
            float f10 = 0.0f;
            float bN = bN();
            float bN2 = amVar.bN();
            y yVar2 = null;
            if (amVar instanceof y) {
                yVar2 = (y) amVar;
            }
            if (this.bX == amVar.bX) {
                boolean z2 = false;
                float f11 = 1.7f;
                if (yVar2 != null) {
                    y yVar3 = yVar2;
                    f11 = (this.W > 200.0f || yVar3.W > 200.0f) ? 5.0f : 5.0f;
                    if (this.ad == yVar3) {
                        bN2 *= f11;
                        z2 = true;
                    }
                    if (yVar3.ad == this) {
                        bN *= f11;
                        z2 = true;
                    }
                    if (!z2) {
                        if (this.ae && yVar3.ad != null) {
                            bN *= f11;
                        } else if (yVar3.ae && this.ad != null) {
                            bN2 *= f11;
                        } else if (this.c == 0.0f && yVar3.c != 0.0f) {
                            bN *= f11;
                        } else if (yVar3.c == 0.0f && this.c != 0.0f) {
                            bN2 *= f11;
                        }
                    }
                }
            }
            if (amVar instanceof w) {
                f10 = bN / (bN + bN2);
            }
            float f12 = 1.0f - f10;
            float k = com.corrodinggames.rts.gameFramework.f.k(d);
            float j = com.corrodinggames.rts.gameFramework.f.j(d);
            if (amVar instanceof w) {
                float f13 = f9 * f10;
                amVar.bZ += k * f13;
                amVar.ca += j * f13;
            }
            float f14 = f9 * f12;
            this.bZ -= k * f14;
            this.ca -= j * f14;
            int i7 = GameEngine.getGameEngine().tick;
            this.Z = amVar;
            this.aa = i7;
            if (yVar2 != null) {
                y yVar4 = yVar2;
                yVar4.Z = this;
                yVar4.aa = i7;
                if (this.ac != 0 && this.ac == yVar4.ac) {
                    if (ar() == null && (ar2 = yVar4.ar()) != null && (ar2.a == av.move || ar2.a == av.attackMove)) {
                        yVar4.ay();
                    }
                    if (yVar4.ar() == null && (ar = ar()) != null) {
                        if (ar.a == av.move || ar.a == av.attackMove) {
                            ay();
                        }
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int V() {
        return 1;
    }

    public void a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.bX == gameEngine.playerTeam) {
            gameEngine.bS.i.b(this);
        }
    }

    public float b(float f, float f2, float f3) {
        if (E()) {
            if (bI()) {
                return 0.0f;
            }
            return c(f, com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f2, f3));
        } else if (bl() < 1) {
            return 0.0f;
        } else {
            int aT2 = aT();
            if (aT2 == -1) {
                aT2 = 0;
            }
            PointF G = G(aT2);
            float d = com.corrodinggames.rts.gameFramework.f.d(G.x, G.y, f2, f3);
            this.cL[aT2].a(70);
            return a(f, d, aT2);
        }
    }

    public float c(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (this.ci && bb()) {
            z = true;
            z2 = true;
        }
        return a(f, f2, z, z2);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void h(float f) {
        float c = com.corrodinggames.rts.gameFramework.f.c(this.cg, f, 360.0f);
        if (com.corrodinggames.rts.gameFramework.f.c(c) > 0.01d) {
            i(c);
        }
    }

    public float a(float f, float f2, boolean z, boolean z2) {
        this.ch = f2;
        if (com.corrodinggames.rts.gameFramework.f.c(this.cg - f2) < 0.01f) {
            if (z && this.ci) {
                j(25);
                this.ci = false;
                return 0.0f;
            }
            return 0.0f;
        }
        float c = com.corrodinggames.rts.gameFramework.f.c(this.cg, f2, 360.0f);
        if (z) {
            if (z2 && com.corrodinggames.rts.gameFramework.f.c(c) > 100.0f) {
                c = com.corrodinggames.rts.gameFramework.f.c(this.cg, f2 + 180.0f, 360.0f);
                if (!this.ci) {
                    j(25);
                    this.ci = true;
                }
            } else if (this.ci) {
                j(25);
                this.ci = false;
            }
        }
        if (com.corrodinggames.rts.gameFramework.f.c(c) < 0.01f) {
            return 0.0f;
        }
        if (this.az <= 0.0f) {
            float B2 = B();
            if (B2 <= 0.0f) {
                float A = (c > 0.0f ? 1.0f : -1.0f) * A() * f;
                if (com.corrodinggames.rts.gameFramework.f.c(A) > com.corrodinggames.rts.gameFramework.f.c(c)) {
                    A = c;
                }
                i(A);
            } else {
                float f3 = c > 0.0f ? 1.0f : -1.0f;
                if (com.corrodinggames.rts.gameFramework.f.c(c) < com.corrodinggames.rts.gameFramework.f.c(this.ce) / B2) {
                    this.ce = com.corrodinggames.rts.gameFramework.f.a(this.ce, f3 * B2, B2 * f);
                } else {
                    this.ce = com.corrodinggames.rts.gameFramework.f.a(this.ce, f3 * A(), B2 * f);
                }
                float f4 = this.ce * f;
                if (com.corrodinggames.rts.gameFramework.f.c(f4) > com.corrodinggames.rts.gameFramework.f.c(c)) {
                    this.ce = 0.0f;
                    f4 = c;
                }
                i(f4);
            }
        }
        return c;
    }

    public void i(float f) {
        this.cg += f;
        if (this.cg > 180.0f) {
            this.cg -= 360.0f;
        }
        if (this.cg < -180.0f) {
            this.cg += 360.0f;
        }
        if (bm()) {
            int bl2 = bl();
            for (int i = 0; i < bl2; i++) {
                ap apVar = this.cL[i];
                apVar.a += f;
                if (apVar.a > 180.0f) {
                    apVar.a -= 360.0f;
                }
                if (apVar.a < -180.0f) {
                    apVar.a += 360.0f;
                }
            }
        }
    }

    public void j(float f) {
        int bl2 = bl();
        for (int i = 0; i < bl2; i++) {
            this.cL[i].a = f + B(i);
        }
    }

    public void a(int i, float f) {
        this.cL[i].a += f;
    }

    public float a(float f, float f2, int i) {
        float f3;
        ap apVar = this.cL[i];
        float c = com.corrodinggames.rts.gameFramework.f.c(apVar.a, f2, 360.0f);
        if (c == 0.0f) {
            return c;
        }
        float w = w(i);
        if (w <= 0.0f) {
            float c2 = com.corrodinggames.rts.gameFramework.f.c(apVar.a, f2, c(i) * f);
            a(i, c2);
            f3 = c - c2;
        } else {
            float y = y(i);
            float f4 = c > 0.0f ? 1.0f : -1.0f;
            float c3 = com.corrodinggames.rts.gameFramework.f.c(apVar.c) / y;
            boolean z = ((c > 0.0f ? 1 : (c == 0.0f ? 0 : -1)) > 0) == ((apVar.c > 0.0f ? 1 : (apVar.c == 0.0f ? 0 : -1)) > 0);
            if (com.corrodinggames.rts.gameFramework.f.c(c) < c3 && z) {
                apVar.c = com.corrodinggames.rts.gameFramework.f.a(apVar.c, f4 * y, y * f);
            } else {
                apVar.c = com.corrodinggames.rts.gameFramework.f.a(apVar.c, f4 * c(i), w * f);
            }
            float f5 = apVar.c * f;
            if (com.corrodinggames.rts.gameFramework.f.c(f5) > com.corrodinggames.rts.gameFramework.f.c(c)) {
                apVar.c = 0.0f;
                f5 = c;
            }
            a(i, f5);
            f3 = c - f5;
        }
        return f3;
    }

    public am X() {
        au ar;
        if (this.h && (ar = ar()) != null) {
            if ((ar.a == av.repair || ar.a == av.reclaim) && ar.h != null && !ar.h.bV) {
                return ar.h;
            }
            return null;
        }
        return null;
    }

    public boolean Y() {
        au ar = ar();
        if (ar != null && ar.a == av.reclaim) {
            return true;
        }
        return false;
    }

    private void a(float f, au auVar, ad adVar) {
        if (auVar.c == null) {
            ay();
            auVar = null;
        }
        if (auVar != null) {
            if (auVar.a == av.triggerActionWhenInRange) {
            }
            if (1 != 0) {
                com.corrodinggames.rts.game.units.a.s a = a(auVar.c);
                U();
                if (a == null) {
                    a("Failed to find action:" + auVar.c.a());
                } else {
                    a(a, false, new PointF(auVar.e, auVar.f), auVar.h);
                }
                ay();
            }
        }
    }

    private void b(float f, au auVar, ad adVar) {
        am i = auVar.i();
        if (i != null) {
            this.R = i;
            if (this.T > 5.0f) {
                this.T = 5.0f;
            }
        }
        ay();
    }

    private void c(float f, au auVar, ad adVar) {
        float f2;
        am X;
        au ao;
        au ao2;
        float g = auVar.g();
        float h = auVar.h();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        boolean z = auVar.a == av.guard || auVar.a == av.follow;
        boolean z2 = auVar.a == av.guard;
        am amVar = auVar.h;
        if (z) {
            if (amVar == null || amVar.bV) {
                ay();
                auVar = null;
            }
            if (auVar != null && amVar != null && !amVar.cg() && this.bX.c(amVar.bX)) {
                ay();
                auVar = null;
            }
        }
        if (auVar != null) {
            boolean z3 = false;
            float f3 = this.cj;
            if (z) {
                f3 += amVar.cj;
            }
            if (auVar.a == av.follow) {
                if (this.cK) {
                    f2 = f3 + 30.0f;
                } else {
                    f2 = f3 + 50.0f;
                }
            } else if (this.cK) {
                f2 = f3 + 80.0f;
            } else {
                f2 = f3 + 100.0f;
            }
            if (a > f2 * f2) {
                this.k = true;
                this.l = g;
                this.m = h;
                this.n = 2;
                if (this.s > 90.0f) {
                    this.s = 90.0f;
                }
                this.r = 18;
                if (this.ad != null && !this.ad.bT()) {
                    adVar.d = false;
                }
            } else {
                this.w = 0;
            }
            adVar.d = false;
            if (0 == 0 && this.R != null && !this.R.bV) {
                boolean z4 = false;
                if (b(this.R, false)) {
                    z4 = true;
                }
                if (z4) {
                    float a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, this.R.eo, this.R.ep);
                    float o = o(this.R);
                    boolean z5 = false;
                    boolean z6 = false;
                    if (a2 < o * o) {
                        z6 = true;
                    }
                    if (z6 && !aa()) {
                        z6 = false;
                    }
                    if (a < 22500.0f) {
                        this.w = 0;
                    }
                    if (!z6 && (this.w == 1 || a > 122500.0f)) {
                        z5 = true;
                        this.w = 1;
                    }
                    if (a > 302500.0f || (this.w == 1 && a > 202500.0f)) {
                        z5 = true;
                        this.w = 1;
                    }
                    if (!z5) {
                        z3 = true;
                        this.w = 0;
                        if (z6) {
                            this.k = false;
                        } else {
                            if (this.s > 90.0f) {
                                this.s = 90.0f;
                            }
                            this.k = true;
                            this.l = this.R.eo;
                            this.m = this.R.ep;
                            this.n = 0;
                            this.j = true;
                        }
                    }
                }
            }
            if (z2 && !z3) {
                am q = amVar.q(2.0f);
                if (q != null && !b(q, true)) {
                    q = null;
                }
                if (q == null && this.w != 1) {
                    q = q(2.0f);
                    if (q != null && !b(q, true)) {
                        q = null;
                    }
                }
                if (q != null) {
                    z3 = true;
                    if (this.s > 90.0f) {
                        this.s = 90.0f;
                    }
                    this.k = true;
                    this.l = q.eo;
                    this.m = q.ep;
                    this.n = 0;
                    this.j = true;
                }
            }
            if (z2 && !z3 && a(amVar) && ((amVar.cu < amVar.cv || amVar.cm < 1.0f) && a(amVar) && (ao2 = ao()) != null)) {
                ao2.b(amVar);
                ao2.m = true;
                z3 = true;
                if (this.s > 20.0f) {
                    this.s = 20.0f;
                }
            }
            if (z2 && !z3 && ak() && (amVar instanceof y) && (X = ((y) amVar).X()) != null && a(X) && (ao = ao()) != null) {
                ao.b(X);
                ao.m = true;
                if (this.s > 20.0f) {
                    this.s = 20.0f;
                }
            }
        }
    }

    private void d(float f, au auVar, ad adVar) {
        float g = auVar.g();
        float h = auVar.h();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        if (auVar.h == null || auVar.h.bV) {
            ay();
            auVar = null;
        }
        if (auVar != null) {
            boolean z = false;
            if (auVar.h.bI()) {
                if (a < 961.0f) {
                    this.Y += f;
                }
                if (this.Y > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (auVar.h.cc().a()) {
                    f2 = 11.0f;
                }
                if (this.b > 0.0f) {
                    f2 = auVar.h.cj + this.cj + 31.0f;
                }
                if (a < f2 * f2) {
                    z = true;
                }
            } else {
                float f3 = auVar.h.cj + this.cj + 5.0f;
                if (a < f3 * f3) {
                    z = true;
                }
            }
            if (!z) {
                this.k = true;
                this.l = g;
                this.m = h;
                this.n = 0;
                if (auVar.h.bI()) {
                    Rect cc = auVar.h.cc();
                    this.n = com.corrodinggames.rts.gameFramework.f.c(cc.c() / 2, cc.b() / 2) + 1;
                }
                if (this.s > 90.0f) {
                    this.s = 90.0f;
                }
                this.r = 18;
                if (a < 48400.0f) {
                    adVar.d = false;
                    if (this.s > 0.0f && aE() == null) {
                        this.j = true;
                    }
                }
                if (this.ad != null && !this.ad.bT()) {
                    adVar.d = false;
                }
            }
            if (z) {
                a(com.corrodinggames.rts.game.units.custom.af.touchTargetSuccess, auVar.h);
                ay();
            }
        }
    }

    private void e(float f, au auVar, ad adVar) {
        float g = auVar.g();
        float h = auVar.h();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        if (auVar.h == null || auVar.h.bV || !auVar.h.bT()) {
            ay();
            auVar = null;
        }
        if (auVar != null && !d(auVar.h, false)) {
            ay();
        }
        if (auVar != null) {
            this.bQ = auVar.h;
            float cs = cs();
            if (a > cs * cs) {
                this.k = true;
                this.l = g;
                this.m = h;
                if (this.s > 90.0f) {
                    this.s = 90.0f;
                }
                this.r = 18;
                if (a < 72900.0f) {
                    adVar.d = false;
                    if (this.s > 0.0f && this.aU == null) {
                        this.j = true;
                    }
                }
                if (this.ad != null && !this.ad.bT()) {
                    adVar.d = false;
                    return;
                }
                return;
            }
            e(auVar.h, false);
            ay();
        }
    }

    private void a(float f, au auVar, ad adVar, boolean z) {
        au a;
        am q;
        float g = auVar.g();
        float h = auVar.h();
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!aR()) {
            boolean z2 = false;
            com.corrodinggames.rts.game.units.custom.b.n dn = dn();
            if (dn != null && dn.H) {
                bx();
                z2 = true;
            }
            if (!z2) {
                ax();
                auVar = null;
            }
        }
        float f2 = 7.0f;
        if (a2 < 1681.0f) {
            this.Y += f;
        }
        if (this.Y > 240.0f) {
            f2 = 16.0f;
        }
        if (this.Y > 340.0f) {
            f2 = 36.0f;
        }
        if (auVar != null && auVar.a == av.patrol) {
            if (av() != 1) {
                f2 = 20.0f;
                float f3 = 30.0f;
                if (!z || this.aa == gameEngine.tick || this.aa == gameEngine.tick - 1) {
                    f3 = 70.0f;
                }
                if (a2 < f3 * f3) {
                    d(auVar);
                    ax();
                    auVar = null;
                }
            } else {
                f2 = 30.0f;
                if (!z || this.aa == gameEngine.tick || this.aa == gameEngine.tick - 1) {
                    f2 = 80.0f;
                }
            }
        }
        if (auVar != null) {
            if (a2 < f2 * f2) {
                if (auVar.a == av.patrol) {
                    if (av() == 1) {
                    }
                } else if (auVar.a == av.attackMove) {
                    boolean z3 = false;
                    if (this.R != null && !this.R.bV && a(this.R, false)) {
                        z3 = true;
                    }
                    if (!z3) {
                        ax();
                        auVar = null;
                    }
                } else {
                    ax();
                    auVar = null;
                }
            } else {
                this.k = true;
                this.l = g;
                this.m = h;
                this.n = 0;
                if (auVar.a == av.patrol) {
                    this.t = true;
                    aB();
                }
            }
        }
        if (auVar != null) {
            if (auVar.a == av.attackMove || auVar.a == av.patrol) {
                if (this.R != null && !this.R.bV && a(this.R, false)) {
                    a(f, this.R, adVar, true);
                }
                if (this.ad != null && this.ad.R != null) {
                    adVar.d = false;
                }
            }
            if (auVar.a == av.patrol) {
                if (this.R == null && (q = q(3.0f)) != null && b(q, true)) {
                    if (this.s > 90.0f) {
                        this.s = 90.0f;
                    }
                    this.k = true;
                    this.l = q.eo;
                    this.m = q.ep;
                    this.n = 0;
                    this.j = true;
                }
                if (ak() && gameEngine.tick % 10 == this.eh % 10 && (a = com.corrodinggames.rts.game.units.d.r.a(this, f, 150.0f, true)) != null) {
                    a.m = false;
                    a.k = 200.0f;
                    this.k = false;
                    aH();
                }
            }
        }
    }

    private void f(float f, au auVar, ad adVar) {
        boolean z;
        float g = auVar.g();
        float h = auVar.h();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        GameEngine gameEngine = GameEngine.getGameEngine();
        as asVar = auVar.b;
        if (asVar == null) {
            a("activeBuildingType==null, removing waypoint");
            ay();
            auVar = null;
        }
        if (auVar != null) {
            float f2 = f(asVar);
            boolean z2 = false;
            if (f2 <= 30.0f) {
            }
            if (f2 <= 25.0f && this.eq > 4.0f) {
                z2 = true;
            }
            if (this.ad != null) {
                au ar = this.ad.ar();
                if (ar == null || ar.a != av.build) {
                    adVar.d = false;
                }
                if (ar != null && !auVar.b(ar)) {
                    adVar.d = false;
                }
            }
            boolean z3 = false;
            if (!com.corrodinggames.rts.gameFramework.utility.y.a(this.Q, 200)) {
                z3 = true;
            }
            if (f2 > 800000.0f) {
                z = true;
            } else {
                z = a <= f2 * f2;
            }
            if (!z || z2) {
                if (!aR()) {
                    ay();
                    return;
                }
                this.k = true;
                this.l = g;
                this.m = h;
                if (f2 > 58.0f) {
                    this.n = (int) ((f2 - 41.0f) / (gameEngine.bL.n * 1.414f));
                }
                if (this.s > 90.0f) {
                    this.s = 90.0f;
                }
                if (this.q > 3) {
                    ay();
                }
            } else if (!z3) {
                if (!b_() || com.corrodinggames.rts.gameFramework.f.c(b(f, g, h)) <= 30.0f) {
                    z a2 = a(auVar, auVar.b, auVar.d, auVar.e, auVar.f);
                    am amVar = null;
                    if (a2.a != null) {
                        amVar = a2.a;
                    } else if (a2.b != null) {
                        amVar = a2.b;
                    }
                    if (amVar != null) {
                        a2.d.a(this, amVar);
                        if (a(amVar)) {
                            if (b(amVar) > 10000.0f) {
                                amVar.r(1.0f);
                                ax();
                            } else {
                                auVar.e();
                                auVar.a = av.repair;
                                auVar.h = amVar;
                                aH();
                            }
                        } else {
                            ay();
                        }
                        this.Q = -9999;
                        return;
                    }
                    if (auVar.b == null) {
                        GameEngine.m5e("active.build==null");
                    }
                    if (!a2.c) {
                        ay();
                    }
                }
            }
        }
    }

    private void a(float f, am amVar, ad adVar, boolean z) {
        b be2 = be();
        float f2 = amVar.eo;
        float f3 = amVar.ep;
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f2, f3);
        if (this.ad != null) {
            if (a < 490000.0f) {
                if (a < 48400.0f) {
                    adVar.d = false;
                }
                float a2 = com.corrodinggames.rts.gameFramework.f.a(this.ad.eo, this.ad.ep, f2, f3);
                if (a2 < 48400.0f) {
                    adVar.d = false;
                }
                if (a2 < 270400.0f && aV()) {
                    adVar.d = false;
                }
            }
            if (this.ad.R == amVar) {
                adVar.d = false;
            }
            if (adVar.d) {
                this.ai = 0.0f;
            } else {
                this.ai += f;
            }
        } else {
            this.ai = 500.0f;
        }
        float o = o(amVar);
        boolean z2 = true;
        if (a < o * o) {
            if (this.R != amVar) {
                if (aq.a(this, amVar)) {
                    this.R = amVar;
                    this.S = 10.0f;
                    M(-1);
                }
            } else {
                this.S = 10.0f;
            }
            float f4 = o;
            if (!E()) {
                f4 -= 1.0f;
                if (aV()) {
                    f4 -= 2.0f;
                }
                if (e(0) > 5.0f) {
                    f4 -= 3.0f;
                }
            }
            if (a < f4 * f4 && be() != b.bomber) {
                if (amVar == null) {
                    z2 = false;
                } else if (i(amVar)) {
                    z2 = false;
                    if (z) {
                        this.k = false;
                    }
                } else if (!j(amVar)) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.k = true;
            this.l = f2;
            this.m = f3;
            this.n = 0;
            if (be2 == b.bomber) {
                a(a, f2, f3);
            }
            this.n = q(amVar);
            if (this.s > 90.0f) {
                this.s = 90.0f;
            }
            if (a < 810000.0f) {
                if (ct() || aV()) {
                    this.j = true;
                }
                if (!adVar.d && this.ai < 120.0f) {
                    this.s = 0.1f;
                    this.j = true;
                }
            }
        }
    }

    private void g(float f, au auVar, ad adVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (be() == b.bomber) {
            if (auVar != null && ((auVar.h == null || auVar.h.bV || auVar.h.bX == this.bX) && !this.as)) {
                if (this.R != null && this.R.bV) {
                    this.R = null;
                }
                a(gameEngine, f, b(true) + 200.0f);
                if (this.R != null) {
                    auVar.h = this.R;
                    aB();
                    aH();
                } else {
                    this.as = true;
                    this.ar = true;
                }
            }
            if (auVar != null && (auVar.h == null || auVar.h.bV || auVar.h.bX == this.bX)) {
                if (auVar.h == null) {
                    ay();
                    auVar = null;
                } else if (!this.ar) {
                    ay();
                    auVar = null;
                }
            }
        } else if (auVar.h == null || auVar.h.bV || auVar.h.bX == this.bX) {
            boolean z = true;
            if (av() > 1) {
                z = false;
            }
            auVar.h = null;
            if (z) {
                if (this.R != null && this.R.bV) {
                    this.R = null;
                }
                a(gameEngine, f, b(true));
                if (this.R != null) {
                    auVar.h = this.R;
                    aB();
                    aH();
                }
            }
            if (auVar.h == null) {
                ay();
                auVar = null;
            }
        }
        if (auVar != null && auVar.h != null && !auVar.h.bV && !auVar.h.cg() && this.bX.c(auVar.h.bX) && !aq.b(this, auVar.h)) {
            ay();
            return;
        }
        if (auVar != null && !aR() && !l()) {
            ay();
            auVar = null;
        }
        if (auVar != null) {
            a(f, auVar.h, adVar, false);
        }
    }

    private void h(float f, au auVar, ad adVar) {
        float g = auVar.g();
        float h = auVar.h();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        if (auVar.h == null || auVar.h.bV) {
            ay();
            auVar = null;
        }
        if (auVar != null && !auVar.h.d(this, false)) {
            ay();
        }
        if (auVar != null) {
            am amVar = auVar.h;
            this.bQ = amVar;
            boolean z = false;
            if (amVar.bI()) {
                float cs = amVar.cs() + 10.0f;
                if (a < cs * cs) {
                    this.Y += f;
                }
                if (this.Y > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (amVar.cc().a()) {
                    f2 = 11.0f;
                }
                if (this.b > 0.0f) {
                    f2 = amVar.cj + 31.0f;
                }
                if (a < f2 * f2) {
                    z = true;
                }
            } else {
                float cs2 = amVar.cs();
                if (a < cs2 * cs2) {
                    z = true;
                }
            }
            if (!z) {
                this.k = true;
                this.l = g;
                this.m = h;
                if (this.s > 90.0f) {
                    this.s = 90.0f;
                }
                this.r = 18;
                if (a < 48400.0f) {
                    adVar.d = false;
                    if (this.s > 0.0f && this.aU == null) {
                        this.j = true;
                    }
                }
                if (this.ad != null && !this.ad.bT()) {
                    adVar.d = false;
                }
            }
            if (z) {
                auVar.h.e(this, false);
                ay();
            }
        }
    }

    public float a_(am amVar) {
        float D2 = amVar.mo1r().D();
        if (amVar.V() == 2) {
            D2 *= 0.5f;
        }
        if (amVar.V() == 3) {
            D2 *= 0.25f;
        }
        return D2 * b(amVar);
    }

    public float f(am amVar) {
        return 0.001f * 5.1f;
    }

    public com.corrodinggames.rts.game.units.custom.d.b g(am amVar) {
        if (amVar.by != null) {
            return amVar.by;
        }
        return amVar.mo1r().B();
    }

    private void i(float f, au auVar, ad adVar) {
        int u;
        boolean x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        boolean z2 = false;
        if (auVar == null) {
            return;
        }
        float g = auVar.g();
        float h = auVar.h();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
        if (auVar != null && auVar.a == av.reclaim && auVar.h != null && auVar.h.g() > 0.0f) {
            z2 = true;
        }
        if (auVar != null && (auVar.h == null || auVar.h.bV || auVar.h.cN != null)) {
            if (z2) {
                z = true;
            } else {
                ax();
                auVar = null;
            }
        }
        if (auVar != null && !z && z2 && auVar.h != null) {
            boolean z3 = true;
            if (this.i < gameEngine.by - 100) {
                z3 = false;
            }
            if (!g(auVar.h, z3)) {
                z = true;
            }
            if (!z) {
                this.i = gameEngine.by;
            }
        }
        if (auVar != null && z) {
            com.corrodinggames.rts.game.units.custom.h hVar = null;
            if (auVar.h != null) {
                hVar = auVar.h.cR();
            }
            am a2 = a(this, auVar.h.eo, auVar.h.ep, cS(), hVar);
            if (a2 != null) {
                auVar.h = a2;
                g = auVar.g();
                h = auVar.h();
                a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, g, h);
                aB();
            } else {
                ax();
                auVar = null;
            }
        }
        if (auVar != null) {
            if (auVar.a == av.repair) {
                if (!a(auVar.h)) {
                    ay();
                    auVar = null;
                }
            } else if (!z2 && !l(auVar.h)) {
                ay();
                auVar = null;
            }
        }
        if (auVar != null && auVar.a == av.repair && auVar.h != null && auVar.h.cu >= auVar.h.cv && auVar.h.cm >= 1.0f) {
            ax();
            auVar = null;
        }
        if (auVar != null && auVar.h == this) {
            ay();
            auVar = null;
        }
        if (auVar != null && auVar != null && auVar.h != null && auVar.h.g() != 0.0f) {
            boolean z4 = false;
            if (auVar.a == av.repair) {
                z4 = true;
            }
            if (z4) {
                ay();
                auVar = null;
            }
        }
        if (auVar != null && auVar.a == av.reclaim && auVar.h.bX != this.bX && auVar.h.g() == 0.0f) {
            boolean z5 = true;
            if (gameEngine.P() && this.bX.d(auVar.h.bX)) {
                z5 = false;
            }
            if (z5) {
                ay();
                auVar = null;
            }
        }
        if (auVar != null) {
            if (auVar.a == av.reclaim) {
                u = v(auVar.h);
                x = w(auVar.h);
            } else {
                u = u(auVar.h);
                x = x(auVar.h);
            }
            if (this.ad != null) {
                int i = u + 80;
                if (com.corrodinggames.rts.gameFramework.f.a(this.ad.eo, this.ad.ep, g, h) < i * i) {
                    adVar.d = false;
                }
                au ar = this.ad.ar();
                if (ar == null) {
                    adVar.d = false;
                }
                if (ar != null && !auVar.b(ar)) {
                    adVar.d = false;
                }
            }
            float f2 = u;
            if (this.h) {
                f2 += 5.0f;
            }
            if (u <= 30) {
            }
            if (a > f2 * f2) {
                if (!aR() || auVar.k == 0.0f) {
                    ay();
                    return;
                }
                boolean z6 = false;
                if (auVar.k >= 0.0f) {
                    if (auVar.k < com.corrodinggames.rts.gameFramework.f.a((int) a) - f2) {
                        z6 = true;
                    }
                }
                if (z6) {
                    ay();
                    return;
                }
                this.k = true;
                this.l = g;
                this.m = h;
                if (u > 58) {
                    this.n = (int) ((u - 41.0f) / (gameEngine.bL.n * 1.414f));
                } else {
                    this.n = 0;
                }
                if (u < 30 || x) {
                    if (a < 841.0f) {
                        this.j = true;
                    }
                    float f3 = u + 14;
                    if (a < f3 * f3 && this.s > 0.0f && this.aU == null) {
                        this.j = true;
                    }
                }
                this.r = this.n;
                if (this.s > 90.0f) {
                    this.s = 90.0f;
                    return;
                }
                return;
            }
            int aT2 = aT();
            if (aT2 == -1) {
                aT2 = 0;
            }
            float f4 = 0.0f;
            if (b_()) {
                f4 = b(f, g, h);
            }
            boolean z7 = false;
            if (com.corrodinggames.rts.gameFramework.f.c(f4) < 30.0f || !b_()) {
                this.h = true;
                adVar.a = true;
                ap apVar = this.cL[aT2];
                if (apVar.f < e(aT2)) {
                    apVar.f += f;
                } else {
                    apVar.f = e(aT2);
                    z7 = true;
                }
            }
            if (z7) {
                am amVar = auVar.h;
                if (auVar.a != av.reclaim) {
                    if (amVar.cm < 1.0f) {
                        bC();
                        float a_ = a_(amVar);
                        float f5 = a_ * f;
                        boolean z8 = false;
                        boolean z9 = false;
                        com.corrodinggames.rts.game.units.custom.d.b g2 = g(amVar);
                        if (g2 != null) {
                            if (amVar.cm + f5 > 1.0f) {
                                f5 = 1.0f - amVar.cm;
                                z8 = true;
                            }
                            double d = (amVar.cm + f5) - amVar.cn;
                            double d2 = 0.0d;
                            if (z8) {
                                d2 = 1.0f - amVar.cn;
                            } else if (d >= 0.0010000000474974513d) {
                                d2 = ((int) (d / 0.0010000000474974513d)) * 0.0010000000474974513d;
                            }
                            boolean z10 = false;
                            if (d2 > 0.0d && this.bX.am.a(g2)) {
                                z10 = true;
                            }
                            if (!z10 && (d2 <= 0.0d || g2.c(this, d2))) {
                                amVar.cn = (float) (amVar.cn + d2);
                            } else {
                                if (!z10) {
                                    this.bX.am.a(g2, this, d2);
                                }
                                f5 = 0.0f;
                                z8 = false;
                                z9 = true;
                            }
                        }
                        if (!z9) {
                            a(amVar, f, aT2);
                            float f6 = amVar.cm + f5;
                            if (z8) {
                                f6 = 1.0f;
                            }
                            amVar.r(f6);
                            if (f6 >= 1.0f && a_ < 0.3d && amVar.bX == gameEngine.playerTeam) {
                                gameEngine.bS.i.a(amVar);
                            }
                            this.aO = false;
                            return;
                        }
                        this.aO = true;
                        return;
                    }
                    a(amVar, f, aT2);
                    amVar.cu += c(amVar) * f;
                    if (amVar.cu > amVar.cv) {
                        amVar.cu = amVar.cv;
                        ay();
                    }
                    this.aO = false;
                    return;
                }
                b(amVar, f, aT2);
                this.aO = false;
                bC();
                boolean z11 = false;
                boolean y = y(amVar);
                float z12 = z(amVar);
                boolean z13 = auVar.h.g() > 0.0f;
                com.corrodinggames.rts.game.units.custom.d.b g3 = g(amVar);
                if (z13 || g3 != null) {
                }
                boolean z14 = false;
                if (!z13 && this.V < 100.0f && !z13) {
                    if (amVar.cm < 0.5d) {
                        if (g3 == null) {
                            z14 = true;
                        }
                    } else if (amVar.cu / amVar.cv < 0.5d) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    if (amVar.cm < 1.0f) {
                        float f7 = f(amVar) * f;
                        if (f7 >= amVar.cm) {
                            f7 = amVar.cm;
                            amVar.cm = 0.0f;
                        } else {
                            amVar.cm -= f7;
                        }
                        amVar.cn = amVar.cm;
                        if (g3 != null) {
                            g3.a((am) this, f7, true);
                        }
                        if (amVar.cm <= 0.0f) {
                            z11 = true;
                        }
                    } else {
                        float f8 = z12 * f;
                        if (f8 >= amVar.cu) {
                            f8 = amVar.cu;
                            amVar.cu = -1.0f;
                        } else {
                            amVar.cu -= f8;
                        }
                        amVar.dp = 1000.0f;
                        if (y) {
                            float f9 = f8 / amVar.cv;
                            com.corrodinggames.rts.game.units.custom.d.b cM = amVar.cM();
                            com.corrodinggames.rts.game.units.custom.d.b cN = amVar.cN();
                            if (cN != null) {
                                cM = cN;
                            }
                            if (z13 || g3 != null) {
                            }
                            if (cM.a() > 0) {
                                this.ab += f9 * cM.a();
                                if (this.ab > 1.0f) {
                                    this.bX.credits += (int) this.ab;
                                    this.ab -= (int) this.ab;
                                }
                                cM.a((am) this, f9, false);
                            } else {
                                cM.a((am) this, f9, true);
                            }
                        }
                        if (amVar.cu <= 0.0f) {
                            z11 = true;
                        }
                    }
                }
                if (z11 && !amVar.bV) {
                    if (!y) {
                        com.corrodinggames.rts.game.units.custom.d.b cN2 = amVar.cN();
                        if (cN2 != null) {
                            GameEngine.m5e("refund: " + cN2.a(false, true, 10, true));
                            cN2.a((am) this, 1.0d, true);
                        } else {
                            com.corrodinggames.rts.game.units.custom.d.b cM2 = amVar.cM();
                            if (amVar.bx != null) {
                                cM2 = amVar.bx;
                                GameEngine.m5e("refund==null overridePriceBuildCost: " + cM2.a(false, true, 10, true));
                            }
                            cM2.a((am) this, 0.800000011920929d, true);
                            if (amVar.cm >= 1.0f && g3 != null) {
                                g3.a((am) this, 0.800000011920929d, true);
                            }
                        }
                    }
                    amVar.bV = true;
                    amVar.bW = gameEngine.by;
                    amVar.ci();
                    if ((amVar instanceof y) && amVar.bI()) {
                        gameEngine.bU.a((y) amVar);
                    }
                }
            }
        }
    }

    public void k(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.bQ != null) {
            this.bQ = null;
        }
        if (this.bR != null) {
            this.bS = com.corrodinggames.rts.gameFramework.f.a(this.bS, f);
            this.bQ = this.bR;
            if (this.bS == 0.0f) {
                this.bR = null;
            }
        }
        if (this.s != 0.0f) {
            this.s = com.corrodinggames.rts.gameFramework.f.a(this.s, f);
        }
        if (this.cf != 0.0f) {
            this.c = com.corrodinggames.rts.gameFramework.f.a(this.c, f);
        }
        au ar = ar();
        this.j = false;
        boolean z = this.k;
        this.k = false;
        this.t = false;
        this.r = 150;
        if (ar != null && ar.l > 0.0f && ar.l < this.V) {
            ax();
            ar = null;
        }
        ad adVar = aP;
        adVar.a();
        if (ar != null) {
            this.V += f;
            av avVar = ar.a;
            if (avVar == av.move || avVar == av.attackMove || avVar == av.patrol) {
                a(f, ar, adVar, z);
            } else if (avVar == av.attack) {
                g(f, ar, adVar);
            } else if (avVar == av.build) {
                f(f, ar, adVar);
            } else if (avVar == av.repair || avVar == av.reclaim) {
                i(f, ar, adVar);
            } else if (avVar == av.loadInto) {
                h(f, ar, adVar);
            } else if (avVar == av.loadUp) {
                e(f, ar, adVar);
            } else if (avVar == av.touchTarget) {
                d(f, ar, adVar);
            } else if (avVar == av.guard || avVar == av.guardAt || avVar == av.follow) {
                c(f, ar, adVar);
            } else if (avVar == av.triggerAction || avVar == av.triggerActionWhenInRange) {
                a(f, ar, adVar);
            } else if (avVar == av.setPassiveTarget) {
                b(f, ar, adVar);
            }
            if (ar != ar()) {
                ar = null;
            }
        }
        this.h = adVar.a;
        if (ar != null && ar.m && this.f > 1) {
            boolean z2 = true;
            au k = k(1);
            if (k != null && (k.a == av.guard || k.a == av.patrol)) {
                z2 = false;
            }
            if (z2) {
                ay();
                ar = null;
            }
        }
        if (ar == null) {
            this.k = false;
        }
        if (this.k) {
            com.corrodinggames.rts.game.units.custom.b.n dn = dn();
            if (dn != null && dn.H) {
                bx();
            }
        } else if (this.q != 0) {
            this.q = (byte) 0;
        }
        b(gameEngine, f);
        a(gameEngine, f, ar, adVar);
    }

    private void a(float f, float f2, float f3) {
        if (this.aq < -900.0f) {
            this.aq = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f2, f3);
        }
        if (f < 10000.0f && bX()) {
            this.ar = true;
        }
        if (this.ar) {
            if (this.cB < bd() * 0.6d || (f < 40000.0f && this.cB < bd())) {
                this.l += com.corrodinggames.rts.gameFramework.f.k(this.aq + 180.0f) * 600.0f;
                this.m += com.corrodinggames.rts.gameFramework.f.j(this.aq + 180.0f) * 600.0f;
                return;
            }
            this.ar = false;
            this.aq = -999.0f;
            aH();
        }
    }

    private void a(float f, af afVar, ad adVar, au auVar) {
        af o;
        af o2;
        float f2;
        float f3;
        float f4;
        GameEngine gameEngine = GameEngine.getGameEngine();
        y yVar = this.ad;
        float f5 = yVar.eo + this.ak;
        float f6 = yVar.ep + this.al;
        int i = gameEngine.by - yVar.an;
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f5, f6);
        if (i > 300 || this.b > 1.0f) {
            this.d += f;
        }
        boolean z = false;
        if (this.d > 300.0f) {
            z = true;
        }
        if (i > 300 && a > 250000.0f) {
            z = true;
        }
        if (this.b > 1.0f) {
            if (this.c != 0.0f) {
                z = true;
            }
            if (this.d > 10.0f) {
                z = true;
            }
        }
        if (z) {
            this.c = 90.0f;
        }
        if (this.c == 0.0f) {
            aH();
            adVar.e = f5;
            adVar.f = f6;
            af afVar2 = null;
            if (i < 3000 && 0 == 0 && yVar.v > 2 && yVar.v - yVar.aw <= 2) {
                afVar2 = yVar.o(2);
            }
            if (i < 1500 && afVar2 == null && yVar.v > 0 && yVar.aw + 0 >= yVar.v) {
                af o3 = yVar.o(0);
                afVar2 = aW;
                float d = com.corrodinggames.rts.gameFramework.f.d(yVar.eo, yVar.ep, o3.a, o3.b);
                float f7 = 80.0f;
                if (i > 300) {
                    f7 = 80.0f - ((i - 300) * 0.06666667f);
                }
                afVar2.a = yVar.eo + (com.corrodinggames.rts.gameFramework.f.k(d) * f7);
                afVar2.b = yVar.ep + (com.corrodinggames.rts.gameFramework.f.j(d) * f7);
            }
            if (afVar2 != null) {
                adVar.c = true;
                adVar.e = afVar2.a + this.ak;
                adVar.f = afVar2.b + this.al;
            } else if (yVar.v >= 2 && yVar.aw >= 1) {
                if (yVar.aw >= 2) {
                    o = yVar.o(0);
                    o2 = yVar.o(1);
                } else {
                    o = yVar.o(0);
                    o2 = yVar.o(0);
                }
                if (o != null && o2 != null) {
                    float c = 1.0f - ((com.corrodinggames.rts.gameFramework.f.c(yVar.eo, yVar.ep, o.a, o.b) - 15.0f) * 0.05f);
                    if (c > 2.0f) {
                        c = 2.0f;
                    }
                    if (c < 0.0f) {
                        c = 0.0f;
                    }
                    if (c > 1.0f) {
                        if (yVar.aw >= 3) {
                            af o4 = yVar.o(2);
                            float f8 = o2.a - o.a;
                            float f9 = o2.b - o.b;
                            f2 = f8 + ((o4.a - o2.a) * (c - 1.0f));
                            f3 = f9 + ((o4.b - o2.b) * (c - 1.0f));
                        } else {
                            f2 = o2.a - o.a;
                            f3 = o2.b - o.b;
                        }
                    } else {
                        f2 = (o2.a - o.a) * c;
                        f3 = (o2.b - o.b) * c;
                    }
                    adVar.e = o.a + this.ak + f2;
                    adVar.f = o.b + this.al + f3;
                }
            }
            float f10 = 45.0f;
            if (this.b <= 1.0f) {
                f10 = 60.0f;
            } else if (i < 500 && this.b <= 1.0f) {
                f10 = 110.0f;
            }
            if (a < f10 * f10) {
                this.d = 0.0f;
            }
            boolean z2 = false;
            au ar = yVar.ar();
            if (ar == null || auVar != null) {
            }
            if (ar == null || 0 != 0) {
                this.e += f;
                boolean z3 = false;
                if (auVar != null && (auVar.a == av.move || auVar.a == av.attackMove || auVar.a == av.patrol)) {
                    z3 = true;
                }
                if (z3 && this.e > 600.0f) {
                    f4 = 260.0f;
                } else if (z3 && this.e > 360.0f) {
                    f4 = 140.0f;
                } else if (z3 && this.e > 180.0f) {
                    f4 = 70.0f;
                } else if (z3 && this.e > 120.0f) {
                    f4 = 50.0f;
                } else {
                    f4 = 16.0f;
                }
                if (a < f4 * f4) {
                    z2 = true;
                }
                if (0 != 0) {
                    z2 = true;
                }
            }
            if (z2) {
                boolean z4 = false;
                if (ar == null) {
                    z4 = true;
                }
                if (0 != 0) {
                    z4 = true;
                }
                if (z4 && com.corrodinggames.rts.gameFramework.f.c(c(f, this.am)) < 3.0f && auVar != null) {
                    if (auVar.a == av.move || auVar.a == av.attackMove) {
                        ay();
                        if (yVar != null) {
                            boolean z5 = false;
                            au ar2 = ar();
                            au ar3 = yVar.ar();
                            if (ar2 != null && ar3 != null && ar2.b(ar3)) {
                                z5 = true;
                            }
                            if (!z5) {
                                a((y) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (0 == 0) {
                adVar.b = true;
                return;
            } else {
                return;
            }
        }
        af afVar3 = null;
        if (0 == 0 && yVar.v > 2 && 8 < yVar.aw) {
            afVar3 = yVar.o(8);
        }
        if (afVar3 == null) {
            afVar3 = aW;
            afVar3.a = yVar.eo;
            afVar3.b = yVar.ep;
        }
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, afVar3.a, afVar3.b);
        float f11 = this.cj + yVar.cj + 15.0f;
        float f12 = this.cj + yVar.cj + 100.0f;
        if (a2 < f11 * f11) {
            this.d = 0.0f;
            this.c = 0.0f;
        } else if (a2 < f12 * f12) {
        }
        if (this.aU == null && afVar != null && ((com.corrodinggames.rts.gameFramework.f.c(this.o - afVar3.a) > 300.0f || com.corrodinggames.rts.gameFramework.f.c(this.p - afVar3.b) > 300.0f) && this.s > 30.0f)) {
            this.s = 30.0f;
        }
        if (this.s == 0.0f && this.aU == null) {
            this.s = 700.0f;
            a(afVar3.a, afVar3.b, 0, false, false);
        }
        if (afVar != null) {
            adVar.e = afVar.a;
            adVar.f = afVar.b;
            if (0 == 0) {
                adVar.b = true;
            }
        }
    }

    private void a(GameEngine gameEngine, float f, au auVar, ad adVar) {
        au ar;
        boolean I = I();
        if (this.aU != null) {
            b(gameEngine);
        }
        if (this.ad != null && (this.ad.bV || !this.ad.bT())) {
            a((y) null);
        }
        if (this.k) {
            af aE2 = aE();
            au ar2 = ar();
            if (ar2 == null) {
                adVar.d = false;
            }
            if (L) {
                adVar.d = false;
            }
            if (this.ae && this.ag > 0 && aG()) {
                this.an = gameEngine.by;
            }
            if (ar2 != null && this.ad != null && adVar.d && (ar = this.ad.ar()) != null && !ar.b(ar2)) {
                adVar.d = false;
            }
            if (this.ad != null && adVar.d) {
                a(f, aE2, adVar, auVar);
            } else if (this.cl != 0.0f) {
                adVar.e = this.l;
                adVar.f = this.m;
                adVar.b = true;
            } else {
                boolean z = false;
                if (this.aU == null) {
                    if (aE2 == null) {
                        if (this.u && this.s < 450.0f && this.aU == null) {
                            z = true;
                        }
                        if (this.s == 0.0f) {
                            z = true;
                        }
                    }
                    if (this.s == 0.0f && (ct() || aV())) {
                        float m = m() - 1.0f;
                        if (com.corrodinggames.rts.gameFramework.f.c(this.o - this.l) > m || com.corrodinggames.rts.gameFramework.f.c(this.p - this.m) > m) {
                            z = true;
                        }
                    }
                    if (auVar != null && this.s == 0.0f && ((auVar.a == av.loadInto || auVar.a == av.loadUp) && (com.corrodinggames.rts.gameFramework.f.c(this.o - this.l) > 12.0f || com.corrodinggames.rts.gameFramework.f.c(this.p - this.m) > 12.0f))) {
                        z = true;
                    }
                    if (auVar != null) {
                        float f2 = this.r;
                        if (com.corrodinggames.rts.gameFramework.f.c(this.o - this.l) > f2 || com.corrodinggames.rts.gameFramework.f.c(this.p - this.m) > f2) {
                            if (this.s > 30.0f) {
                                this.s = 30.0f;
                            }
                            if (this.s == 0.0f) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    this.s = 500.0f;
                    a(this.l, this.m, this.n, this.ae && this.ah > 1, this.t);
                }
                if (aE2 != null && this.au == null && this.aw >= 2 && z() > 5.0f) {
                    af afVar = this.av[1];
                    float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, aE2.a, aE2.b);
                    float a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, afVar.a, afVar.b);
                    if (a < 36.0f) {
                        aJ();
                        aE2 = aE();
                    } else if (a2 < 361.0f) {
                        aJ();
                        aE2 = aE();
                    }
                }
                if (aE2 != null) {
                    adVar.e = aE2.a;
                    adVar.f = aE2.b;
                    adVar.b = true;
                } else if (this.j) {
                    adVar.e = this.l;
                    adVar.f = this.m;
                    adVar.b = true;
                }
            }
        }
        a(f, adVar, auVar, I);
    }

    private void a(float f, ad adVar, au auVar, boolean z) {
        float f2 = 0.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.k && adVar.b && z) {
            float f3 = adVar.e;
            float f4 = adVar.f;
            float z2 = z();
            float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f3, f4);
            float d = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f3, ((f4 - this.ep) * ba()) + this.ep);
            boolean z3 = false;
            float bc2 = bc();
            if (bc2 > 0.95f) {
                z3 = true;
            } else if (bc2 > 0.87d) {
                if (this.ah <= 1 && this.aw > 0 && this.aw <= 9 && this.ae && a < 250000.0f) {
                    z3 = true;
                }
            } else if (bc2 > 0.7d) {
                if (this.ah <= 1 && this.aw > 0 && this.aw <= 4 && this.ae && a < 40000.0f) {
                    z3 = true;
                }
            } else if (bc2 > 0.4d && this.ah <= 1 && this.aw > 0 && this.aw <= 2 && this.ae && a < 10000.0f) {
                z3 = true;
            }
            float f5 = 179.0f;
            if (this.R != null && E() && bj() && !aV()) {
                this.ch = d;
            } else if (this.az <= 0.0f) {
                f5 = a(f, d, true, z3);
            }
            float f6 = 20.0f;
            if (a > 361.0f) {
                f6 = 46.0f;
            }
            if (a > 3600.0f) {
                f6 = 89.0f;
            }
            float A = A();
            if (A < 1.4d) {
                if (a > 6400.0f) {
                    f6 *= 0.5f;
                } else {
                    f6 = 17.0f;
                }
            }
            if (z2 > 5.0f && this.cf < 0.01d && this.cf > -0.01d) {
                f6 = 1.0f;
            }
            if (A < 1.1d) {
                f6 *= 0.7f;
            }
            if (this.cf > 0.4d && a > 16900.0f) {
                f6 = 180.0f;
            }
            if (aY() && this.v == this.aw) {
                f6 = 1.0f;
            }
            if (bj()) {
                f6 = 181.0f;
            }
            boolean z4 = this.aw == 1;
            if ((!z4 || a >= 4.0f * 4.0f) && com.corrodinggames.rts.gameFramework.f.c(f5) <= f6) {
                f2 = 1.0f;
                if (adVar.c) {
                    if (a < 2500.0f) {
                        f2 = 1.0f - 0.15f;
                    }
                    if (a < 900.0f) {
                        f2 -= 0.15f;
                    }
                    if (a < 225.0f) {
                        f2 -= 0.3f;
                    }
                } else if (this.ad != null) {
                    if (a > 400.0f) {
                        f2 = 1.0f + 0.2f;
                    }
                    if (a < 49.0f) {
                        f2 -= 0.15f;
                    }
                    if (a < 9.0f) {
                        f2 -= 0.15f;
                    }
                }
                if (a < 9.0f) {
                    f2 = 0.0f;
                }
            }
            if (z4 && f2 != 0.0f) {
                if (a < 324.0f && D() < 0.13f && z() > 1.0f) {
                    f2 = 0.5f * f2;
                }
                if (a < 169.0f && D() < 0.15f && z() > 0.9f) {
                    f2 = 0.5f * f2;
                }
                if (z2 > 5.0f) {
                    if (a < 324.0f && f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    if (a < 81.0f && f2 > 0.25f) {
                        f2 = 0.25f;
                    }
                }
            }
            boolean z5 = false;
            if (!z4 && a < 256.0f) {
                z5 = true;
            }
            if (z4 && a < 4.0f * 4.0f) {
                z5 = true;
            }
            if ((this.aa == gameEngine.tick || this.aa == gameEngine.tick - 1) && this.Z != null && this.Z.c(f3, f4, 2.0f)) {
                z5 = true;
            }
            if (f2 > 0.0f) {
                this.W += f;
                if (this.W > 200.0f && a < 3600.0f && this.aw >= 2) {
                    float f7 = this.W;
                    aJ();
                    this.W = f7;
                }
                if (this.W > 600.0f && this.aw >= 2 && this.au == null) {
                    aH();
                }
                if (this.W > 80.0f && this.b > 30.0f) {
                    aH();
                }
                if (this.W > 40.0f && this.aw >= 2 && this.au == null) {
                    af afVar = this.av[1];
                    if (com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, afVar.a, afVar.b) < a) {
                        float f8 = this.W;
                        aJ();
                        this.W = f8;
                    }
                }
            }
            if (z5) {
                aJ();
                if (z4) {
                    this.d = 0.0f;
                    this.c = 0.0f;
                    if (!this.u && this.ad == null && auVar != null && auVar.a == av.move) {
                        ax();
                    }
                }
            }
        }
        if (this.ci && !bj()) {
            f2 = (-f2) * bc();
        }
        if (this.az > 0.0f) {
            f2 = 0.0f;
        }
        if (!bi()) {
            if (this.cf < f2) {
                this.cf = com.corrodinggames.rts.gameFramework.f.a(this.cf, f2, C() * f);
            }
            if (this.cf > f2) {
                this.cf = com.corrodinggames.rts.gameFramework.f.a(this.cf, f2, D() * f);
            }
        } else {
            this.cf = f2;
        }
        this.cK = adVar.b && z;
    }

    @Deprecated
    public boolean Z() {
        return this.R != null;
    }

    public boolean aa() {
        if (this.R != null && !this.R.bV) {
            int bl2 = bl();
            for (int i = 0; i < bl2; i++) {
                if (this.cL[i].j != null && r(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public am ab() {
        if (this.R != null && !this.R.bV) {
            return this.R;
        }
        au ar = ar();
        if (ar != null && ar.h != null && !ar.h.bV) {
            return ar.h;
        }
        return null;
    }

    private void a(GameEngine gameEngine, float f, float f2) {
        aQ.a(f2);
        gameEngine.cc.a(this.eo, this.ep, f2, this, f, aQ);
        if (aQ.a != 0) {
            if (this.R == null || !h(this.R)) {
                aR.a(f2);
                gameEngine.cc.a(this.eo, this.ep, f2, this, f, aR);
            }
        }
    }

    public boolean ac() {
        return bl() > 1;
    }

    private void a(GameEngine gameEngine, float f) {
        int bl2 = bl();
        if (!ac()) {
            for (int i = 0; i < bl2; i++) {
                this.cL[i].j = this.R;
            }
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < bl2; i2++) {
            ap apVar = this.cL[i2];
            if (v(i2) == -1) {
                if (a(i2, this.R, false, false)) {
                    apVar.j = this.R;
                } else {
                    z = true;
                    if (apVar.j == this.R) {
                        apVar.j = null;
                    }
                }
            }
        }
        if (z) {
            float b = b(false);
            aT.a(this);
            gameEngine.cc.a(this.eo, this.ep, b, this, f, aT);
        }
        for (int i3 = 0; i3 < bl2; i3++) {
            int v = v(i3);
            if (v != -1) {
                this.cL[i3].j = this.cL[v].j;
            }
        }
    }

    public boolean ad() {
        if (!l()) {
            return false;
        }
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && !dn.M) {
            return false;
        }
        return true;
    }

    private void b(GameEngine gameEngine, float f) {
        int bl2 = bl();
        boolean z = false;
        if (ad()) {
            boolean z2 = false;
            boolean z3 = false;
            if (this.R != null) {
                com.corrodinggames.rts.game.units.custom.b.n dn = dn();
                if (dn != null && this.cO != null && dn.L && this.cO.R == this.R) {
                    z2 = true;
                }
                if (!a(this.R, false) && !z2 && 1 != 0) {
                    this.R = null;
                }
            }
            if (this.R != null && !z2) {
                z3 = !h(this.R);
            }
            this.S = com.corrodinggames.rts.gameFramework.f.a(this.S, f);
            this.T = com.corrodinggames.rts.gameFramework.f.a(this.T, f);
            if ((this.R == null || z3) && this.S == 0.0f && bf()) {
                this.S = 20.0f + (this.eo % 5.0f) + (this.ep % 5.0f);
                a(gameEngine, f, b(false));
                if (this.R != null) {
                    this.T = 0.0f;
                }
            }
            if (this.R != null && this.T == 0.0f) {
                this.T = 20.0f + (this.eo % 5.0f) + (this.ep % 5.0f);
                a(gameEngine, f);
            }
            for (int i = 0; i < bl2; i++) {
                this.cL[i].g = false;
            }
            if (this.R != null) {
                float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, this.R.eo, this.R.ep);
                float o = o(this.R);
                if (a < o * o || z2) {
                    int aT2 = aT();
                    for (int i2 = 0; i2 < bl2; i2++) {
                        ap apVar = this.cL[i2];
                        am amVar = apVar.j;
                        if (amVar != null) {
                            boolean z4 = amVar == this.R;
                            if (!z4 && !b(amVar, true)) {
                                apVar.j = null;
                            } else if (!a(i2, amVar, false, !z4)) {
                                apVar.j = null;
                            } else {
                                PointF G = G(i2);
                                PointF K = K(i2);
                                K.x += amVar.eo;
                                K.y += amVar.ep;
                                float d = com.corrodinggames.rts.gameFramework.f.d(G.x, G.y, K.x, K.y);
                                if (v(i2) == -1 && i2 != aT2) {
                                    if (!E()) {
                                        apVar.a(70);
                                        apVar.b = apVar.a;
                                        float f2 = 179.0f;
                                        if (!apVar.b()) {
                                            f2 = a(f, d, i2);
                                        }
                                        if (com.corrodinggames.rts.gameFramework.f.c(f2) < x(i2)) {
                                            apVar.g = true;
                                        }
                                    } else {
                                        boolean z5 = false;
                                        au ar = ar();
                                        if (ar != null && (ar.a == av.build || ar.a == av.repair || ar.a == av.reclaim)) {
                                            z5 = true;
                                        }
                                        if (!z5 && (!this.k || bj())) {
                                            float c = c(f, d);
                                            apVar.b = apVar.a;
                                            if (com.corrodinggames.rts.gameFramework.f.c(c) < x(i2)) {
                                                apVar.g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int i3 = 0; i3 < bl2; i3++) {
                        ap apVar2 = this.cL[i3];
                        am amVar2 = apVar2.j;
                        if (amVar2 != null) {
                            if (u(i3) && apVar2.e == 0.0f) {
                                z = true;
                            }
                            if (u(i3)) {
                                a(f, amVar2, i3);
                            }
                        }
                    }
                } else if (!this.k && an()) {
                    this.j = true;
                    this.k = true;
                    this.l = this.R.eo;
                    this.m = this.R.ep;
                    this.n = 0;
                }
            }
        }
        if (this.aN && X() != null) {
            z = true;
        }
        for (int i4 = 0; i4 < bl2; i4++) {
            ap apVar3 = this.cL[i4];
            if (!z && apVar3.f != 0.0f) {
                apVar3.f = com.corrodinggames.rts.gameFramework.f.a(apVar3.f, f(i4) * f);
            }
        }
    }

    public void b(am amVar, int i) {
    }

    public boolean a(float f, am amVar, int i) {
        ap apVar = this.cL[i];
        int v = v(i);
        if (v != -1) {
            apVar.a = this.cL[v].a;
        }
        boolean s = s(i);
        boolean z = false;
        if (s) {
            if (apVar.f < e(i)) {
                if (apVar.f == 0.0f) {
                    b(amVar, i);
                }
                apVar.f += f;
            } else {
                apVar.f = e(i);
            }
            z = true;
        }
        if (apVar.e == 0.0f && r(i)) {
            if (!a(i, amVar, false, false)) {
                apVar.e = -10.0f;
                return false;
            }
            if (!s) {
                if (apVar.f < e(i)) {
                    if (apVar.f == 0.0f) {
                        b(amVar, i);
                    }
                    apVar.f += f;
                } else {
                    z = true;
                }
            }
            if (z) {
                apVar.e = b(i) + t(i);
                if (!s) {
                    apVar.f = 0.0f;
                }
                a(amVar, i);
                M(i);
                apVar.m = !apVar.m;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean h(am amVar) {
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar.eo, amVar.ep);
        float o = o(amVar);
        if (a < o * o) {
            return true;
        }
        return false;
    }

    public boolean ae() {
        return false;
    }

    public boolean af() {
        return true;
    }

    public boolean ag() {
        return true;
    }

    public boolean ah() {
        return true;
    }

    public boolean i(am amVar) {
        int v;
        int bl2 = bl();
        for (int i = 0; i < bl2; i++) {
            if (r(i) && a(i, amVar, false, false) && ((v = v(i)) == -1 || a(v, amVar, false, false))) {
                return true;
            }
        }
        return false;
    }

    public boolean j(am amVar) {
        int v;
        int bl2 = bl();
        for (int i = 0; i < bl2; i++) {
            if (r(i) && a(i, amVar, true, false) && ((v = v(i)) == -1 || a(v, amVar, true, false))) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i, am amVar, boolean z, boolean z2) {
        if (!z && z2 && !h(amVar)) {
            return false;
        }
        return true;
    }

    public boolean k(am amVar) {
        if (amVar.i()) {
            return af();
        }
        if (amVar.Q()) {
            return ae();
        }
        if (!ah() && !amVar.cH()) {
            return false;
        }
        return ag();
    }

    public boolean a(am amVar) {
        return false;
    }

    public boolean l(am amVar) {
        if (amVar.g() != 0.0f && h(amVar, true)) {
            return true;
        }
        return a(amVar);
    }

    public com.corrodinggames.rts.game.units.a.s a(as asVar, boolean z) {
        return a(asVar, -1, z);
    }

    public boolean ai() {
        Iterator it = N().iterator();
        while (it.hasNext()) {
            if (((com.corrodinggames.rts.game.units.a.s) it.next()).g()) {
                return true;
            }
        }
        return false;
    }

    public com.corrodinggames.rts.game.units.a.s a(as asVar, int i, boolean z) {
        as E2;
        ArrayList N = N();
        com.corrodinggames.rts.game.units.a.s sVar = null;
        if (N.size() > 0) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.a.s sVar2 = (com.corrodinggames.rts.game.units.a.s) it.next();
                as y = sVar2.y();
                if (z && (E2 = sVar2.E()) != null) {
                    y = E2;
                }
                if (y == asVar && (i == -1 || i == sVar2.t())) {
                    sVar = sVar2;
                    if (sVar2.b(this) && sVar2.a((am) this, false)) {
                        return sVar2;
                    }
                }
            }
        }
        return sVar;
    }

    public boolean b(as asVar, boolean z) {
        com.corrodinggames.rts.game.units.a.s a = a(asVar, z);
        if (a == null || a.g(this) || !a.b(this)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean aj() {
        return mo1r().m();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ak() {
        return mo1r().l();
    }

    public void m(am amVar) {
    }

    public boolean al() {
        return false;
    }

    public final boolean a(am amVar, boolean z) {
        if (this.bX == amVar.bX || amVar.bV || !this.bX.c(amVar.bX) || this.P == a.holdFire || this.P == a.returnFire || amVar.cN != null || !k(amVar) || !amVar.d((am) this)) {
            return false;
        }
        if (!z) {
            float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar.eo, amVar.ep);
            float b = b(false);
            if (a < b * b) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean b(am amVar, boolean z) {
        if (amVar.cu()) {
            return false;
        }
        return a(amVar, z);
    }

    public float am() {
        return 0.0f;
    }

    public boolean an() {
        return this.P == a.outOfRange || this.P == a.guardArea || this.P == a.aggressive;
    }

    public float b(boolean z) {
        float am;
        float m = m();
        au ar = ar();
        if (ar != null && (ar.a == av.attackMove || ar.a == av.patrol || ar.a == av.guard)) {
            if (ar.a == av.patrol) {
                m += 110.0f;
            } else if (ar.a == av.guard) {
                m += 90.0f;
            } else {
                m += 20.0f;
            }
            if (m < 190.0f) {
                m = 190.0f;
            }
        }
        if (this.P == a.outOfRange) {
            am = m + 250.0f;
        } else if (this.P == a.guardArea) {
            am = m + 150.0f;
        } else if (this.P == a.aggressive) {
            am = m + 180.0f;
        } else {
            am = m + am();
            if (z) {
                am += 110.0f;
            }
        }
        return am;
    }

    public au ao() {
        m(29);
        if (this.f > 0) {
            b(this.g[0]);
        }
        au auVar = this.g[29];
        for (int i = 29; i >= 1; i--) {
            this.g[i] = this.g[i - 1];
        }
        this.g[0] = auVar;
        if (this.f < 29) {
            this.f++;
        }
        if (this.g[0] == null) {
            this.g[0] = new au();
        }
        au auVar2 = this.g[0];
        auVar2.e();
        this.V = 0.0f;
        this.Y = 0.0f;
        this.W = 0.0f;
        c(auVar2);
        aH();
        return auVar2;
    }

    public void a(au auVar) {
    }

    public final void b(au auVar) {
        this.h = false;
    }

    public void c(au auVar) {
        bC();
        this.i = -9999;
        if (this.R != null && this.R.cu()) {
            this.R = null;
        }
    }

    public au ap() {
        m(this.f);
        if (this.g[this.f] == null) {
            this.g[this.f] = new au();
        }
        au auVar = this.g[this.f];
        auVar.e();
        if (this.f < 29) {
            this.f++;
        }
        if (this.f > 0) {
            c(this.g[0]);
        }
        return auVar;
    }

    public au d(float f, float f2) {
        au ap = ap();
        ap.a(f, f2);
        return ap;
    }

    public au n(am amVar) {
        au ap = ap();
        ap.a(amVar);
        return ap;
    }

    public au e(float f, float f2) {
        au ap = ap();
        ap.b(f, f2);
        return ap;
    }

    public boolean a(au auVar, boolean z) {
        if (auVar == null) {
            if (z) {
                GameEngine.print("isValidNewWaypoint: Skipping null waypoint");
                return false;
            }
            return false;
        } else if (auVar.d() == av.build) {
            if (auVar.b == null) {
                if (z) {
                    GameEngine.print("isValidNewWaypoint: Skipping build waypoint with no buildType");
                    return false;
                }
                return false;
            }
            com.corrodinggames.rts.game.units.a.s a = a(auVar.b, auVar.d, false);
            if (a == null) {
                if (z) {
                    GameEngine.print("Unit '" + mo1r().i() + "' can not queue build:" + auVar.b.i());
                    return false;
                }
                return false;
            } else if (!auVar.n) {
                if (a.g(this)) {
                    if (z) {
                        GameEngine.print("Builder '" + mo1r().i() + "' tried to queue a locked building:" + a.O());
                        return false;
                    }
                    return false;
                } else if (!a.b(this)) {
                    if (z) {
                        GameEngine.print("Builder '" + mo1r().i() + "' tried to queue a unavailable building:" + a.O());
                        return false;
                    }
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public au d(au auVar) {
        au ap = ap();
        ap.c(auVar);
        return ap;
    }

    public boolean aq() {
        return ar() == null;
    }

    public au ar() {
        if (this.f == 0) {
            return null;
        }
        return this.g[0];
    }

    public au as() {
        if (this.f <= 1) {
            return null;
        }
        return this.g[1];
    }

    public au at() {
        if (this.f == 0) {
            return null;
        }
        return this.g[this.f - 1];
    }

    public void au() {
        if (this.f == 0) {
            return;
        }
        if (this.f == 1) {
            ay();
        } else {
            this.f--;
        }
    }

    public au k(int i) {
        return this.g[i];
    }

    public int av() {
        return this.f;
    }

    public boolean aw() {
        au ar = ar();
        if (ar != null && ar.a == av.attack) {
            return true;
        }
        return false;
    }

    public boolean a(as asVar, float f, float f2) {
        for (int i = 0; i < this.f; i++) {
            au auVar = this.g[i];
            if (auVar.a == av.build && auVar.b == asVar && com.corrodinggames.rts.gameFramework.f.c(auVar.e - f) < 10.0f && com.corrodinggames.rts.gameFramework.f.c(auVar.f - f2) < 10.0f) {
                return true;
            }
        }
        return false;
    }

    public void l(int i) {
        if (i >= 120) {
            throw new RuntimeException("PathNode index:" + i + " too large");
        }
        if (this.av == at) {
            this.av = new af[120];
        }
    }

    public void m(int i) {
        if (i >= 30) {
            throw new RuntimeException("Waypoint index:" + i + " too large");
        }
        if (this.g == O) {
            this.g = new au[30];
        }
    }

    public void n(int i) {
        if (this.f <= i) {
            throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f + ", waypointIndex:" + i);
        }
        if (i == 0) {
            ay();
            return;
        }
        if (this.g.length > 0) {
            au auVar = this.g[i];
            for (int i2 = i; i2 < this.f - 1; i2++) {
                this.g[i2] = this.g[i2 + 1];
            }
            this.g[this.f - 1] = auVar;
        }
        this.f--;
    }

    public void ax() {
        aC();
        ay();
    }

    public void ay() {
        this.V = 0.0f;
        this.Y = 0.0f;
        this.W = 0.0f;
        this.ar = false;
        this.aq = -999.0f;
        this.as = false;
        this.w = 0;
        if (this.f == 0) {
            aH();
            this.e = 0.0f;
            this.d = 0.0f;
            this.c = 0.0f;
        } else if (this.f == 1) {
            b(this.g[0]);
            this.f = 0;
            aH();
            this.e = 0.0f;
            this.d = 0.0f;
            this.c = 0.0f;
            c((au) null);
        } else {
            if (this.g.length > 0) {
                au auVar = this.g[0];
                b(auVar);
                for (int i = 0; i < this.f - 1; i++) {
                    this.g[i] = this.g[i + 1];
                }
                this.g[this.f - 1] = auVar;
            }
            this.f--;
            if (this.f > 0) {
                c(this.g[0]);
            } else {
                c((au) null);
            }
            aH();
        }
    }

    public void az() {
        int i = this.f;
        if (this.f > 0) {
            b(this.g[0]);
        }
        this.V = 0.0f;
        this.Y = 0.0f;
        this.ar = false;
        this.aq = -999.0f;
        this.as = false;
        this.f = 0;
        aH();
        aD();
        a((y) null);
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.w = 0;
        if (i > 0) {
            c((au) null);
        }
    }

    public void aA() {
        for (int i = 0; i < this.f; i++) {
            au auVar = this.g[i];
            if (auVar != null && auVar.a != av.build && auVar.a != av.repair) {
                n(i);
            }
        }
    }

    public void a(y yVar) {
        if (this.ad != null) {
            this.ad.ag--;
        }
        this.ad = yVar;
        if (yVar != null) {
            this.ad.ag++;
        }
    }

    public void aB() {
        a((y) null);
        this.ae = false;
        this.aj = false;
        this.ak = 0.0f;
        this.al = 0.0f;
        this.ac = 0;
        this.c = 0.0f;
    }

    public void aC() {
        if (this.ag == 0) {
            return;
        }
        au as = as();
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.ad == this) {
                    boolean z = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, yVar.eo, yVar.ep) < 108900.0f;
                    boolean z2 = false;
                    boolean z3 = false;
                    au as2 = yVar.as();
                    if (as != null && as2 != null) {
                        if (as.b(as2)) {
                            z2 = true;
                        }
                    } else if (as == null && as2 == null) {
                        z3 = true;
                    }
                    if (z2 && z) {
                        yVar.ay();
                    } else if (!z3) {
                        yVar.a((y) null);
                    }
                }
            }
        }
    }

    public void aD() {
        au ar;
        com.corrodinggames.rts.gameFramework.ab abVar;
        y yVar = null;
        if (this.ag == 0) {
            return;
        }
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar instanceof y) {
                y yVar2 = (y) amVar;
                if (yVar2.ad == this) {
                    yVar2.a((y) null);
                    yVar = yVar2;
                }
            }
        }
        if (this.ag != 0) {
            this.ag = 0;
        }
        if (yVar != null && (ar = yVar.ar()) != null && (abVar = ar.i) != null) {
            abVar.c();
        }
    }

    public af aE() {
        if (this.aw == 0) {
            return null;
        }
        if (this.au != null) {
            return this.au.a(this);
        }
        return this.av[0];
    }

    public af aF() {
        if (this.aw < 2) {
            return null;
        }
        if (this.au != null) {
            return this.au.b(this);
        }
        return this.av[1];
    }

    public void a(int i, float f, float f2) {
        l(i);
        if (this.av[i] == null) {
            this.av[i] = new af();
        }
        this.av[i].a = f;
        this.av[i].b = f2;
    }

    public boolean aG() {
        if (this.au == null && this.aw >= 2) {
            if (z() > 0.5d) {
                if (this.W > 150.0f || this.X > 150.0f) {
                    return true;
                }
                return false;
            } else if (this.W > 300.0f || this.X > 300.0f) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void aH() {
        this.aw = 0;
        this.u = false;
        this.v = 0;
        this.s = 0.0f;
        this.W = 0.0f;
        this.X = 0.0f;
        this.q = (byte) 0;
    }

    public void aI() {
        aH();
        this.av = at;
        this.aI = (byte) 0;
        this.aJ = null;
        this.aK = null;
    }

    public void aJ() {
        this.X = this.W;
        this.W = 0.0f;
        if (this.au != null) {
            this.au.c(this);
        } else if (this.aw != 0) {
            if (this.aw == 1) {
                this.aw = 0;
                return;
            }
            af afVar = this.av[0];
            for (int i = 0; i < this.aw - 1; i++) {
                this.av[i] = this.av[i + 1];
            }
            this.av[this.aw - 1] = afVar;
            this.aw--;
        }
    }

    public boolean aK() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        if (ct()) {
            z = true;
        }
        gameEngine.bL.a(this.eo, this.ep);
        int i = gameEngine.bL.T;
        int i2 = gameEngine.bL.U;
        if (gameEngine.bU.a(h(), i, i2) && !gameEngine.bU.b(h(), i, i2)) {
            z = true;
        }
        return z;
    }

    public void a(float f, float f2, int i, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PathEngine pathEngine = gameEngine.bU;
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        this.cK = true;
        boolean z3 = false;
        boolean z4 = false;
        if (ct()) {
            z3 = true;
        }
        bVar.a(this.eo, this.ep);
        int i2 = bVar.T;
        int i3 = bVar.U;
        if (pathEngine.a(h(), i2, i3) && !pathEngine.b(h(), i2, i3)) {
            z3 = true;
            z4 = true;
        }
        if (f != this.o || this.p != f2) {
            this.q = (byte) 0;
        }
        this.o = f;
        this.p = f2;
        if (z3) {
            this.u = false;
            this.aw = 0;
            this.au = null;
            float a = bVar.a(f);
            float b = bVar.b(f2);
            if (z4) {
                float d = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, a, b);
                float b2 = com.corrodinggames.rts.gameFramework.f.b(this.eo, this.ep, a, b);
                if (b2 > 60.0f) {
                    b2 = 60.0f;
                    this.u = true;
                    if (this.s > 10.0f) {
                        this.s = 10.0f;
                    }
                }
                a = this.eo + (com.corrodinggames.rts.gameFramework.f.k(d) * b2);
                b = this.ep + (com.corrodinggames.rts.gameFramework.f.j(d) * b2);
            }
            a(this.aw, a, b);
            this.aw++;
            this.v = this.aw;
            return;
        }
        int i4 = 0;
        if (z) {
            i4 = 3;
        }
        if (aq.a(h(), this.eo, this.ep, f, f2, 80, i4, 1)) {
            this.u = false;
            this.aw = 0;
            this.au = null;
            float a2 = bVar.a(f);
            float b3 = bVar.b(f2);
            float f3 = this.eo;
            float f4 = this.ep;
            float d2 = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, a2, b3);
            float b4 = com.corrodinggames.rts.gameFramework.f.b(this.eo, this.ep, a2, b3);
            float k = com.corrodinggames.rts.gameFramework.f.k(d2);
            float j = com.corrodinggames.rts.gameFramework.f.j(d2);
            int i5 = (int) ((b4 * 0.05f) - 1.0f);
            int i6 = 1;
            if (i5 < 4) {
                i6 = 0;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= i5) {
                    break;
                }
                f3 += k * 20.0f;
                f4 += j * 20.0f;
                if (i6 > 0) {
                    i6--;
                } else {
                    a(this.aw, f3, f4);
                    this.aw++;
                    if (this.aw >= 119) {
                        this.u = true;
                        break;
                    }
                }
                i7++;
            }
            if (!this.u) {
                if (this.aw < 119) {
                    a(this.aw, a2, b3);
                    this.aw++;
                } else {
                    this.u = true;
                }
            }
            this.v = this.aw;
            return;
        }
        com.corrodinggames.rts.gameFramework.ab abVar = null;
        au ar = ar();
        if (ar != null) {
            abVar = ar.i;
            if (abVar == null) {
            }
        }
        if (abVar != null && abVar.g != null) {
            com.corrodinggames.rts.gameFramework.d dVar = null;
            Iterator it = abVar.g.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.gameFramework.d dVar2 = (com.corrodinggames.rts.gameFramework.d) it.next();
                if (dVar2.a != null && dVar2.a.a() != null && com.corrodinggames.rts.gameFramework.f.c(dVar2.e - f) <= 10.0f && com.corrodinggames.rts.gameFramework.f.c(dVar2.f - f2) <= 10.0f && dVar2.g + SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT >= gameEngine.tick && dVar2.h == h() && com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, dVar2.c, dVar2.d) < 3600.0f) {
                    dVar = dVar2;
                }
            }
            if (dVar != null) {
                this.aU = dVar.a;
                return;
            }
        }
        if (L && i > 2) {
            i = 2;
        }
        this.aU = a(f, f2, i, z, true, z2);
    }

    public com.corrodinggames.rts.gameFramework.path.k a(float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PathEngine pathEngine = gameEngine.bU;
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        com.corrodinggames.rts.gameFramework.path.k a = pathEngine.a(z2);
        bVar.a(this.eo, this.ep);
        boolean z4 = false;
        if (bb() || this.ci) {
            z4 = true;
        }
        a.a(h(), (short) bVar.T, (short) bVar.U, Float.valueOf(this.cg), z4);
        bVar.a(f, f2);
        a.a((short) bVar.T, (short) bVar.U, (short) i);
        a.p = z;
        a.q = bh();
        a.r = z3;
        boolean z5 = this.cK;
        this.cK = true;
        if (z2 && a.b()) {
            Iterator it = aV.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.gameFramework.path.k kVar = (com.corrodinggames.rts.gameFramework.path.k) it.next();
                if (kVar.g + 60 < gameEngine.tick) {
                    it.remove();
                } else if (kVar.a(a)) {
                    return kVar;
                }
            }
        }
        pathEngine.a(a, z2);
        this.cK = z5;
        if (z2 && a.b()) {
            aV.add(a);
        }
        return a;
    }

    void b(GameEngine gameEngine) {
        if (this.aU != null) {
            com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
            LinkedList a = this.aU.a();
            if (a != null) {
                this.au = this.aU.a(this);
                com.corrodinggames.rts.gameFramework.path.k kVar = this.aU;
                this.aw = 0;
                this.u = false;
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.corrodinggames.rts.gameFramework.path.p pVar = (com.corrodinggames.rts.gameFramework.path.p) it.next();
                    bVar.a((int) pVar.a, (int) pVar.b);
                    a(this.aw, bVar.T + bVar.p, bVar.U + bVar.q);
                    this.aw++;
                    if (this.aw >= 120) {
                        this.u = true;
                        break;
                    }
                }
                if (this.aw == 1) {
                    this.q = (byte) (this.q + 1);
                }
                boolean z = false;
                if (a.size() != 0) {
                    bVar.a(this.o, this.p);
                    if (!this.u && ((com.corrodinggames.rts.gameFramework.path.p) a.getLast()).a == bVar.T && ((com.corrodinggames.rts.gameFramework.path.p) a.getLast()).b == bVar.U) {
                        z = true;
                    }
                }
                if (z) {
                    if (1 == 0) {
                        if (this.aw < 120) {
                            a(this.aw, this.o, this.p);
                            this.aw++;
                        }
                    } else {
                        if (this.aw == 0) {
                            this.aw++;
                        }
                        a(this.aw - 1, this.o, this.p);
                    }
                }
                this.aU = null;
                if (this.aw > 120) {
                    GameEngine.print("activePathCount>maxPathNodes: activePathCount:" + this.aw);
                    this.aw = 120;
                }
                this.v = this.aw;
            }
        }
    }

    public long aL() {
        af afVar;
        long j = 0;
        for (int i = 0; i < this.aw; i++) {
            if (this.av[i] != null) {
                j = j + Float.floatToRawIntBits(afVar.a) + Float.floatToRawIntBits(afVar.b);
            }
        }
        return j;
    }

    af o(int i) {
        if (this.au != null) {
            if (i == 0) {
                return aE();
            }
            return aF();
        } else if (i >= this.aw) {
            return null;
        } else {
            return this.av[i];
        }
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void d(float f) {
        super.d(f);
    }

    public float aM() {
        return 1.0f;
    }

    public int l(float f) {
        if (f < -0.3f) {
            int i = (int) (((1.0f - ((-f) / 10.0f)) * 130.0f) + 45.0f);
            if (i < 45) {
                i = 45;
            }
            return i;
        }
        return 255;
    }

    public Paint aN() {
        int i;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.eq < -0.3f) {
            i = Color.a(l(this.eq), 255, 255, 255);
        } else {
            i = -1;
        }
        if (this.cm < 1.0f && this.cm < aM()) {
            i = Color.a((int) (20.0f + ((this.cm / aM()) * 220.0f)), 140, 255, 140);
            porterDuffColorFilter = aX;
        }
        if (this.cp) {
            if (this.cs) {
                i = Color.a(200, 20, 255, 20);
                porterDuffColorFilter = aY;
            }
            if (this.ct) {
                i = Color.a(200, 255, 20, 20);
                porterDuffColorFilter = aZ;
            }
            if (this.cq) {
                i = Color.a(50, 70, 70, 245);
                porterDuffColorFilter = ba;
                if (this.ct) {
                    i = Color.a(50, 255, 20, 20);
                    porterDuffColorFilter = aZ;
                }
            }
            if (this.cr) {
                i = Color.a(150, 100, 100, 100);
            }
        }
        return a(i, porterDuffColorFilter, aO());
    }

    public boolean aO() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = gameEngine.settingsEngine.renderAntiAlias;
        if (!dk()) {
            z = false;
            if (gameEngine.cX < 1.0f) {
                z = true;
            }
        }
        if (this.co) {
            z = ar.ag;
        }
        return z;
    }

    public float p(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
        Paint aN = aN();
        float cD = cD();
        if (this.ew) {
            PointF cY = cY();
            float f2 = (this.eo + cY.x) - gameEngine.cw;
            float f3 = ((this.ep + cY.y) - gameEngine.cx) - this.eq;
            aQ();
            if (cD != 1.0f) {
                yVar.k();
                yVar.a(cD, cD, f2, f3);
            }
            yVar.a(this.M, f2, f3, d(false) - 90.0f, aN);
            if (cD != 1.0f) {
                yVar.l();
                return true;
            }
            return true;
        }
        PointF cY2 = cY();
        RectF cF = cF();
        float f4 = cY2.x;
        float f5 = cY2.y - this.eq;
        cF.a += f4;
        cF.b += f5;
        cF.c += f4;
        cF.d += f5;
        Rect a_ = a_(false);
        float f6 = (cF.a + cF.c) * 0.5f;
        float f7 = (cF.b + cF.d) * 0.5f;
        yVar.k();
        aQ();
        if (cD != 1.0f) {
            yVar.a(cD, cD, f6, f7);
        }
        yVar.a(d(false), f6, f7);
        yVar.a(this.M, a_, cF, aN);
        yVar.l();
        return true;
    }

    public boolean F() {
        return this.eq > 0.0f && this.cm >= 1.0f && !this.cq;
    }

    public PointF aP() {
        be.setSite(G(), H());
        return be;
    }

    public float G() {
        return 0.0f;
    }

    public float H() {
        return 0.0f;
    }

    public boolean aQ() {
        if (this.N != null && F()) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (!gameEngine.de && this.cj < 18.0f && this.eq < 0.5d) {
                return true;
            }
            if (!gameEngine.df && this.cj < 28.0f && this.eq < 5.0f) {
                return true;
            }
            PointF aP2 = aP();
            float f = (this.eo + aP2.x) - gameEngine.cw;
            float f2 = (this.ep + aP2.y) - gameEngine.cx;
            float cD = cD();
            com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
            if (cD != 1.0f) {
                yVar.k();
                yVar.a(cD, cD, f, f2);
            }
            if (cG()) {
                Rect a_ = a_(true);
                RectF rectF = dB;
                rectF.a(f - this.eu, f2 - this.ev, f + this.eu, f2 + this.ev);
                yVar.k();
                yVar.a(d(true), f, f2);
                yVar.a(this.N, a_, rectF, R());
                yVar.l();
            } else {
                yVar.a(this.N, f, f2, d(true) - 90.0f, R());
            }
            if (cD != 1.0f) {
                yVar.l();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean s_() {
        return RectF.a(GameEngine.getGameEngine().cM, cE());
    }

    public boolean aR() {
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && !dn.O) {
            return false;
        }
        return I();
    }

    public boolean aS() {
        return aR();
    }

    public boolean b_() {
        return true;
    }

    public int aT() {
        return -1;
    }

    public float o(am amVar) {
        if (aV() && amVar != null) {
            return m() + this.cj + amVar.cj;
        }
        return m();
    }

    public float p(am amVar) {
        if (aV() && amVar != null) {
            return aU() + this.cj + amVar.cj;
        }
        return aU();
    }

    public float aU() {
        return m();
    }

    public int q(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        float p = p(amVar);
        if (p > 58.0f) {
            i = (int) ((p - 41.0f) / (gameEngine.bL.n * 1.414f));
        }
        return i;
    }

    public boolean aV() {
        return false;
    }

    public float q(int i) {
        return 0.0f;
    }

    public void aW() {
        int bl2 = bl();
        for (int i = 0; i < bl2; i++) {
            if (i < this.cL.length) {
                ap apVar = this.cL[i];
                if (apVar.e > b(i)) {
                    apVar.e = b(i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList aX() {
        ArrayList arrayList = new ArrayList();
        if (l()) {
            int bl2 = bl();
            for (int i = 0; i < bl2; i++) {
                float q = q(i);
                if (q != 0.0f) {
                    float b = b(i);
                    if (b == 9000.0f) {
                        b = 0.0f;
                    }
                    boolean z = false;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aa aaVar = (aa) it.next();
                        if (aaVar.a == q && (aaVar.b == b || b == 0.0f || aaVar.b == 0.0f)) {
                            aaVar.d++;
                            if (aaVar.b == 0.0f) {
                                aaVar.b = b;
                            }
                            z = true;
                            if (z) {
                                aa aaVar2 = new aa();
                                aaVar2.a = q;
                                aaVar2.b = b;
                                aaVar2.c = e(i);
                                arrayList.add(aaVar2);
                            }
                        }
                    }
                    if (z) {
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean r(int i) {
        return true;
    }

    public float e(int i) {
        return 0.0f;
    }

    public boolean s(int i) {
        return false;
    }

    public float t(int i) {
        return 0.0f;
    }

    public float f(int i) {
        return 4.0f;
    }

    public boolean u(int i) {
        int v = v(i);
        if (v == -1) {
            return this.cL[i].g;
        }
        return this.cL[v].g;
    }

    public int v(int i) {
        return -1;
    }

    public float B() {
        return -1.0f;
    }

    public float w(int i) {
        return -1.0f;
    }

    public float x(int i) {
        return 5.0f;
    }

    public float y(int i) {
        return w(i);
    }

    public boolean E() {
        return false;
    }

    public boolean aY() {
        return false;
    }

    public float aZ() {
        return 1.0f;
    }

    public float ba() {
        return 1.0f;
    }

    public boolean bb() {
        return bc() > 0.95f;
    }

    public float bc() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bd() {
        return 0.0f;
    }

    public b be() {
        return b.normal;
    }

    public boolean bf() {
        return true;
    }

    public boolean bg() {
        return true;
    }

    public int bh() {
        return 0;
    }

    public float C() {
        return 99.0f;
    }

    public float D() {
        return 99.0f;
    }

    public boolean bi() {
        return false;
    }

    public boolean bj() {
        return false;
    }

    public boolean b(int i, float f) {
        return true;
    }

    public boolean bk() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bl() {
        return 1;
    }

    public boolean bm() {
        return true;
    }

    public float g(int i) {
        return 0.0f;
    }

    public float z(int i) {
        return 99999.0f;
    }

    public float A(int i) {
        return -1.0f;
    }

    public float B(int i) {
        return 0.0f;
    }

    public float C(int i) {
        if (this.ci && bb()) {
            return this.cg + 180.0f;
        }
        return this.cg;
    }

    public com.corrodinggames.rts.gameFramework.utility.ai bn() {
        int aT2 = aT();
        if (aT2 == -1) {
            return D(0);
        }
        return D(aT2);
    }

    public com.corrodinggames.rts.gameFramework.utility.ai D(int i) {
        bf.a(E(i));
        return bf;
    }

    public PointF E(int i) {
        ap apVar = this.cL[i];
        float g = g(i);
        float f = E() ? this.cg : apVar.a;
        PointF G = G(i);
        bg.setSite(G.x + (com.corrodinggames.rts.gameFramework.f.k(f) * g), G.y + (com.corrodinggames.rts.gameFramework.f.j(f) * g));
        return bg;
    }

    public com.corrodinggames.rts.gameFramework.utility.ai F(int i) {
        bi.a(G(i));
        bi.c = 0.0f;
        return bi;
    }

    public PointF G(int i) {
        ap apVar = this.cL[i];
        float f = this.eo;
        float f2 = this.ep;
        float H = H(i);
        if (apVar.e != 0.0f && H != 0.0f) {
            float I = I(i);
            float J = J(i);
            float f3 = 0.0f;
            float b = b(i) - apVar.e;
            if (b < I) {
                f3 = (b / I) * H;
            } else if (b < J + I) {
                f3 = H - (((b - I) / J) * H);
            }
            if (f3 != 0.0f) {
                f += com.corrodinggames.rts.gameFramework.f.k(apVar.a) * f3;
                f2 += com.corrodinggames.rts.gameFramework.f.j(apVar.a) * f3;
            }
        }
        bh.setSite(f, f2);
        return bh;
    }

    public float H(int i) {
        return 0.0f;
    }

    public float I(int i) {
        return 4.0f;
    }

    public float J(int i) {
        return 6.0f;
    }

    public PointF K(int i) {
        PointF pointF = bj;
        pointF.setSite(0.0f, 0.0f);
        ap apVar = this.cL[i];
        pointF.x += apVar.h;
        pointF.y += apVar.i;
        return pointF;
    }

    public float L(int i) {
        return 0.6f;
    }

    public void M(int i) {
        if (i == -1) {
            int bl2 = bl();
            for (int i2 = 0; i2 < bl2; i2++) {
                M(i2);
            }
            return;
        }
        ap apVar = this.cL[i];
        apVar.h = 0.0f;
        apVar.i = 0.0f;
        if (this.R != null && L(i) != 0.0f) {
            float L2 = this.R.cj * L(i);
            apVar.h += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, (int) (-L2), (int) L2, 1 + i);
            apVar.i += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) this, (int) (-L2), (int) L2, 2 + i);
        }
    }

    public void a(ab abVar) {
        a(abVar, true);
    }

    public void a(ab abVar, boolean z) {
        com.corrodinggames.rts.gameFramework.emitter.e d;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (abVar == ab.verylargeBuilding) {
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
            gameEngine.bR.a(this.eo, this.ep, this.eq);
            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
            com.corrodinggames.rts.gameFramework.emitter.e c = gameEngine.bR.c(this.eo, this.ep, this.eq, -1127220);
            if (c != null) {
                c.G = 0.2f;
                c.F = 2.0f;
                c.ar = (short) 2;
                c.V = 45.0f;
                c.W = c.V;
                c.U = 0.0f;
            }
        } else if (abVar == ab.large || abVar == ab.building || abVar == ab.buildingNoShockwaveOrSmoke) {
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.p, 0.8f, this.eo, this.ep);
            gameEngine.bR.a(this.eo, this.ep, this.eq);
        } else if (abVar == ab.verysmall) {
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.4f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), this.eo, this.ep);
            gameEngine.bR.b(this.eo, this.ep, this.eq);
        } else if (abVar == ab.largeUnit) {
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), this.eo, this.ep);
            gameEngine.bR.b(this.eo, this.ep, this.eq);
            gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
            com.corrodinggames.rts.gameFramework.emitter.e c2 = gameEngine.bR.c(this.eo, this.ep, this.eq, -1127220);
            if (c2 != null) {
                c2.G = 0.2f;
                c2.F = 2.0f;
                c2.ar = (short) 2;
                c2.V = 45.0f;
                c2.W = c2.V;
                c2.U = 0.0f;
            }
        } else {
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f), this.eo, this.ep);
            gameEngine.bR.b(this.eo, this.ep, this.eq);
        }
        if (abVar != ab.verysmall) {
            if (abVar != ab.buildingNoShockwaveOrSmoke && (d = gameEngine.bR.d(this.eo, this.ep, this.eq, 0)) != null) {
                d.E = 0.9f;
            }
            if (z) {
                if (!bO()) {
                    bo();
                }
                if (abVar != ab.buildingNoShockwaveOrSmoke && !cK()) {
                    Emitter.a(this.eo, this.ep);
                    Emitter.b(this.eo, this.ep);
                    bq();
                }
            }
        }
    }

    public void bo() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = 1.0f;
        float f2 = 1.0f;
        int bp = bp();
        if (bp >= 10) {
            f = 1.2f;
            f2 = 1.4f;
        }
        if (bp >= 20) {
            f = 1.5f;
            f2 = 1.7f;
        }
        if (this.eq > -1.0f) {
            for (int i = 0; i < bp; i++) {
                gameEngine.bR.b(this.eo, this.ep, this.eq, f, f2);
            }
        }
    }

    public int bp() {
        if (dd()) {
            return 8;
        }
        if (bI()) {
            return 7;
        }
        return 4;
    }

    public void bq() {
        if (!cK()) {
            ScorchMark.a(this.eo, this.ep);
        }
    }

    public int s() {
        return 15;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void c(boolean z) {
        int s;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.cN == null && this.cO == null && (s = s()) > 0) {
            gameEngine.bL.a(this.eo, this.ep, s, this.bX, z);
        }
    }

    public void br() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        RectF rectF = new RectF();
        rectF.a(cd());
        rectF.b *= gameEngine.bL.o;
        rectF.d *= gameEngine.bL.o;
        rectF.a *= gameEngine.bL.n;
        rectF.c *= gameEngine.bL.n;
        rectF.a(this.eo, this.ep);
        rectF.a(-cZ(), -da());
        rectF.b -= 10.0f;
        rectF.d += 10.0f;
        rectF.a -= 10.0f;
        rectF.c += 10.0f;
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if ((amVar instanceof am) && amVar != this && amVar.a(rectF)) {
                if ((amVar instanceof y) && amVar.bV) {
                    amVar.a();
                }
                if (amVar instanceof al) {
                    ((al) amVar).k();
                }
            }
        }
    }

    public boolean c(PlayerData playerData) {
        return b(false, playerData) == null;
    }

    public boolean a(boolean z, PlayerData playerData) {
        return b(z, playerData) == null;
    }

    public String b(boolean z, PlayerData playerData) {
        String a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        be q = mo1r().q();
        if (q != null && (a = q.a(this, this.eo, this.ep)) != null) {
            return a;
        }
        if (mo1r().p()) {
            gameEngine.bL.a(this.eo, this.ep);
            com.corrodinggames.rts.game.maps.g e = gameEngine.bL.e(gameEngine.bL.T, gameEngine.bL.U);
            if (e == null || !e.i) {
                return "{2}";
            }
        }
        if (!z && a((am) null, playerData)) {
            return "{0}";
        }
        if (!mo1r().p()) {
            Rect cd = cd();
            Point a2 = a(gameEngine.bL, bk);
            int i = a2.a;
            int i2 = a2.b;
            as r = mo1r();
            ao o = r.o();
            for (int i3 = i + cd.a; i3 <= i + cd.c; i3++) {
                for (int i4 = i2 + cd.b; i4 <= i2 + cd.d; i4++) {
                    String a3 = com.corrodinggames.rts.game.units.d.d.a(this, r, o, i3, i4, false, playerData);
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public void N(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!mo1r().p()) {
            Rect cd = cd();
            Point a = a(gameEngine.bL, bl);
            int i2 = a.a;
            int i3 = a.b;
            mo1r();
            int i4 = i2 + cd.a;
            int i5 = i3 + cd.b;
            int i6 = i2 + cd.c;
            int i7 = i3 + cd.d;
            if (i != -2) {
                gameEngine.bL.a(this, i4, i5, i6, i7, (int) gameEngine.cw, (int) gameEngine.cx, gameEngine.bO, true, i);
            }
        }
    }

    public boolean r(am amVar) {
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar.eo, amVar.ep);
        float f = 9.0f;
        if (!amVar.bI()) {
            f = this.cj + amVar.cj;
            if (f < 11.0f) {
                f = 11.0f;
            }
        }
        if (a < f * f) {
            return true;
        }
        return false;
    }

    public boolean a(am amVar, PlayerData playerData) {
        boolean z = false;
        if (!bI()) {
            z = true;
        }
        float f = this.cj + com.corrodinggames.rts.game.units.custom.ag.p + 10.0f;
        float f2 = this.eo - f;
        float f3 = this.eo + f;
        float f4 = this.ep - f;
        float f5 = this.ep + f;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar2 = a[i];
            float f6 = amVar2.eo;
            float f7 = amVar2.ep;
            if (f2 <= f6 && f6 <= f3 && f4 <= f7 && f7 <= f5 && amVar2 != this && ((z || amVar2.bI()) && !amVar2.bV && r(amVar2) && amVar2 != amVar && (playerData == null || amVar2.d(playerData)))) {
                return true;
            }
        }
        return false;
    }

    public y bs() {
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar != this && (amVar instanceof y)) {
                y yVar = (y) amVar;
                if (!yVar.bV && yVar.bX == this.bX && yVar.mo1r() == mo1r() && t(yVar)) {
                    return yVar;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.ay, com.corrodinggames.rts.gameFramework.w
    public void a() {
        if (this.cO != null) {
            bx();
        }
        az();
        aI();
        super.a();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void bt() {
        a((y) null);
        this.R = null;
        az();
        aI();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void bu() {
        if (this.cO != null) {
            bx();
        }
        super.bu();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void bv() {
        super.bv();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bw() {
        return (((((((((((0 * 31) + super.bw()) * 31) + ((int) (z() * 100.0f))) * 31) + ((int) (A() * 100.0f))) * 31) + ((int) (m() * 100.0f))) * 31) + ((int) b(0))) * 31) + ((int) (C() * 100.0f));
    }

    @Override // com.corrodinggames.rts.game.units.am
    PointF m(float f) {
        PointF n = n(f);
        dE.setSite(this.eo + n.x, this.ep + n.y);
        return dE;
    }

    public PointF n(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (I() && this.b == 0.0f) {
            if (bi()) {
                f2 = this.cc * f;
                f3 = this.cd * f;
            } else if (this.cf != 0.0f) {
                float f4 = this.cg;
                if (bj()) {
                    f4 = this.ch;
                }
                float z = z() * this.cf * f;
                f2 = com.corrodinggames.rts.gameFramework.f.k(f4) * z;
                f3 = com.corrodinggames.rts.gameFramework.f.j(f4) * z;
            }
        }
        bm.setSite(f2, f3);
        return bm;
    }

    public boolean a(ag agVar) {
        return false;
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z, float f, float f2) {
    }

    public boolean a(com.corrodinggames.rts.game.units.a.s sVar, float f, float f2) {
        return true;
    }

    public void a(am amVar, float f, int i) {
        this.U = com.corrodinggames.rts.gameFramework.f.a(this.U, f);
        if (this.U == 0.0f) {
            this.U = 5.0f;
            if (s_()) {
                com.corrodinggames.rts.gameFramework.utility.ai bn2 = bn();
                com.corrodinggames.rts.gameFramework.emitter.e b = GameEngine.getGameEngine().bR.b(bn2.a, bn2.b, this.eq + bn2.c, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.low);
                if (b != null) {
                    float d = com.corrodinggames.rts.gameFramework.f.d(bn2.a, bn2.b, (float) (amVar.eo + (-8.0d) + (Math.random() * 16.0d)), (float) (amVar.ep + (-8.0d) + (Math.random() * 16.0d)));
                    b.P = com.corrodinggames.rts.gameFramework.f.k(d) * com.corrodinggames.rts.gameFramework.f.c(2.0f, 4.0f);
                    b.Q = com.corrodinggames.rts.gameFramework.f.j(d) * com.corrodinggames.rts.gameFramework.f.c(2.0f, 4.0f);
                    b.ap = 6;
                    b.V = 20.0f;
                    b.W = b.V;
                    b.r = true;
                    b.E = 0.8f;
                    b.G = 0.2f;
                    b.F = 1.0f;
                }
            }
        }
    }

    public void b(am amVar, float f, int i) {
        this.U = com.corrodinggames.rts.gameFramework.f.a(this.U, f);
        if (this.U == 0.0f) {
            this.U = 5.0f;
            if (s_()) {
                PointF E2 = E(0);
                com.corrodinggames.rts.gameFramework.emitter.e b = GameEngine.getGameEngine().bR.b(amVar.eo, amVar.ep, amVar.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.low);
                if (b != null) {
                    float d = com.corrodinggames.rts.gameFramework.f.d(amVar.eo, amVar.ep - amVar.eq, (float) (E2.x + (-8.0d) + (Math.random() * 16.0d)), (float) (E2.y + (-8.0d) + (Math.random() * 16.0d)));
                    b.P = com.corrodinggames.rts.gameFramework.f.k(d) * com.corrodinggames.rts.gameFramework.f.c(2.0f, 4.0f);
                    b.Q = com.corrodinggames.rts.gameFramework.f.j(d) * com.corrodinggames.rts.gameFramework.f.c(2.0f, 4.0f);
                    b.ap = 5;
                    b.V = 20.0f;
                    b.W = b.V;
                    b.r = true;
                    b.E = 0.8f;
                    b.G = 0.2f;
                    b.F = 1.0f;
                }
            }
        }
    }

    public z a(au auVar, as asVar, int i, float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.a.s a = a(asVar, i, false);
        if (a == null) {
            GameEngine.print("Unit '" + mo1r().i() + "' can not build:" + asVar.i());
            return bn.a();
        }
        if (!auVar.n) {
            if (a.g(this)) {
                GameEngine.print("Builder '" + mo1r().i() + "' tried to build a locked building:" + a.O());
                return bn.a();
            } else if (!a.b(this) && !a.u(this)) {
                GameEngine.print("Builder '" + mo1r().i() + "' tried to build a unavailable building:" + a.O() + " (add isLocked:false to fix)");
                return bn.a();
            }
        }
        if (!asVar.k() && !a.x() && this.bX.w() >= this.bX.x()) {
            if (this.bX == gameEngine.playerTeam) {
                gameEngine.bS.b(gameEngine.bS.g.al);
            }
            return bn.a();
        } else if (am.a(asVar) == null) {
            String str = "{build is null}";
            if (auVar.b != null) {
                str = auVar.b.i();
            }
            GameEngine.m5e("Build unit type missing: " + str);
            return bn.a();
        } else {
            am g = com.corrodinggames.rts.game.units.d.d.g(asVar);
            if (!com.corrodinggames.rts.game.units.custom.d.b.b(asVar.u(), a.B()) || !com.corrodinggames.rts.game.units.custom.d.b.b(asVar.B(), a.r_())) {
                g.bx = a.B();
                g.by = a.r_();
            }
            if (a instanceof com.corrodinggames.rts.game.units.a.h) {
                g.bx = null;
                g.by = null;
            }
            g.cm = 0.0f;
            g.cn = 0.0f;
            gameEngine.bL.b((f - g.cZ()) + 1.0f, (f2 - g.da()) + 1.0f);
            g.eo = gameEngine.bL.T + g.cZ();
            g.ep = gameEngine.bL.U + g.da();
            g.f(this.bX);
            g.B(this);
            if (i != 1 && (g instanceof y)) {
                ((y) g).a(i);
            }
            g.cP();
            if (g instanceof y) {
                y yVar = (y) g;
                boolean z = false;
                y yVar2 = null;
                if (al()) {
                    yVar2 = this;
                } else if (!this.bT && !bI()) {
                    yVar2 = this;
                }
                if (yVar.a(yVar2, (PlayerData) null)) {
                    z = true;
                }
                if (!z && !yVar.a(true, (PlayerData) null)) {
                    z = true;
                }
                if (z) {
                    g.a();
                    z a2 = bn.a();
                    y bs = ((y) g).bs();
                    a2.b = bs;
                    a2.d = a;
                    if (bs == null) {
                    }
                    return a2;
                }
            }
            com.corrodinggames.rts.game.units.custom.d.b B2 = a.B();
            if (auVar.n) {
                B2 = com.corrodinggames.rts.game.units.custom.d.b.a;
            }
            if (!B2.c(this)) {
                g.a();
                z a3 = bn.a();
                this.Q = gameEngine.by;
                if (this.V < 1000.0f) {
                    a3.c = true;
                    com.corrodinggames.rts.gameFramework.emitter.a a4 = com.corrodinggames.rts.gameFramework.emitter.a.a(this.bX, g.eo, g.ep);
                    if (a4 != null) {
                        a4.i = true;
                    }
                }
                return a3;
            }
            m(g);
            if (g instanceof y) {
                y yVar3 = (y) g;
                yVar3.br();
                if (g.bI()) {
                    gameEngine.bU.a(yVar3);
                }
            }
            PlayerData.c(g);
            z a5 = bn.a();
            a5.a = g;
            a5.d = a;
            return a5;
        }
    }

    public boolean a(y yVar, com.corrodinggames.rts.game.units.custom.b.n nVar) {
        return false;
    }

    public boolean b(y yVar) {
        return false;
    }

    public void bx() {
        if (this.cO == null) {
            return;
        }
        if (this.cO.bV) {
        }
        if (!this.cO.b(this)) {
            GameEngine.print("Deattach failed, forcing deattach. Child:" + cB() + " Parent:" + this.cO.cB());
            this.cO = null;
            this.cP = null;
        }
    }

    public com.corrodinggames.rts.game.units.custom.b.n a(short s) {
        return null;
    }

    public static am a(y yVar, float f, float f2, float f3, com.corrodinggames.rts.game.units.custom.h hVar) {
        if (f3 <= 0.0f) {
            return null;
        }
        bo.f = true;
        bo.g = false;
        bo.e = null;
        bo.d = f3 * f3;
        bo.c = hVar;
        bo.a = f;
        bo.b = f2;
        GameEngine.getGameEngine().cc.a(f, f2, f3, yVar, 0.0f, bo);
        return bo.e;
    }

    public com.corrodinggames.rts.game.units.custom.d.b by() {
        return com.corrodinggames.rts.game.units.custom.d.b.a;
    }

    public com.corrodinggames.rts.gameFramework.utility.m bz() {
        return bq;
    }

    public boolean bA() {
        return false;
    }

    public int bB() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void bC() {
        com.corrodinggames.rts.game.units.custom.d.b a;
        com.corrodinggames.rts.game.units.custom.d.b bE = bE();
        com.corrodinggames.rts.game.units.custom.d.b bD = bD();
        if (bE == null) {
            a = bD;
        } else if (bD == null) {
            a = bE;
        } else {
            a = com.corrodinggames.rts.game.units.custom.d.b.a(bE, bD);
        }
        if (this.dJ == null && a == null) {
            return;
        }
        if (this.dJ != null && a != null && this.dJ.b(a)) {
            return;
        }
        PlayerData.b((am) this);
        this.dJ = a;
        PlayerData.c(this);
    }

    public com.corrodinggames.rts.game.units.custom.d.b bD() {
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.d.b bE() {
        au ar;
        am X = X();
        if (X != null && (ar = ar()) != null) {
            if (ar.a == av.repair && X.cm < 1.0f) {
                com.corrodinggames.rts.game.units.custom.d.b g = g(X);
                float a_ = a_(X) * 60.0f;
                if (g != null) {
                    return com.corrodinggames.rts.game.units.custom.d.b.a(g, -a_);
                }
            }
            if (ar.a == av.reclaim) {
                if (X.cm < 1.0f) {
                    com.corrodinggames.rts.game.units.custom.d.b g2 = g(X);
                    float f = f(X) * 60.0f;
                    if (g2 != null) {
                        return com.corrodinggames.rts.game.units.custom.d.b.a(g2, f);
                    }
                    return null;
                } else if (y(X)) {
                    float z = z(X);
                    com.corrodinggames.rts.game.units.custom.d.b cM = X.cM();
                    com.corrodinggames.rts.game.units.custom.d.b cN = X.cN();
                    if (cN != null) {
                        cM = cN;
                    }
                    return com.corrodinggames.rts.game.units.custom.d.b.a(cM, (z * 60.0f) / X.cv);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
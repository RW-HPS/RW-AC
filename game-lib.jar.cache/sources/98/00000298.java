package com.corrodinggames.rts.game.units.custom;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.mod.ModEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/l.class */
public final class l implements com.corrodinggames.rts.game.units.as {
    public static l b;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public boolean B;
    public Rect C;
    public String D;
    public String E;
    public String F;
    public int H;
    public String I;
    public com.corrodinggames.rts.gameFramework.mod.b J;
    public String K;
    public String L;
    public String M;
    public h O;
    public h P;
    public String Q;
    public int R;
    public int S;
    public ad T;
    public int Y;
    public LogicBoolean Z;
    public boolean aa;
    public boolean ab;
    public com.corrodinggames.rts.game.o ac;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public float aj;
    public boolean ak;
    public boolean am;
    public boolean aq;
    public com.corrodinggames.rts.gameFramework.unitAction.e[] as;
    public com.corrodinggames.rts.gameFramework.unitAction.e aw;
    public boolean aB;
    public bb aC;
    public bb aD;
    public String aE;
    public boolean aF;
    public boolean aH;
    public boolean aI;
    public boolean aJ;
    public boolean aK;
    public float aL;
    public boolean aM;
    public boolean aN;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public boolean aR;
    public h aS;
    public boolean aT;
    public boolean aU;
    public boolean aV;
    public boolean aW;
    public boolean aY;
    public boolean ba;
    public float bb;
    public float bc;
    public float be;
    public float bf;
    public boolean bg;
    public float bh;
    public boolean bi;
    public boolean bj;
    public boolean bk;
    public boolean bl;
    public int bm;
    public boolean bn;
    public float bo;
    public float bp;
    public int bq;
    public boolean br;
    public boolean bs;
    public com.corrodinggames.rts.game.units.ab bt;
    public boolean bu;
    public boolean bv;
    public z bw;
    public z bx;
    public z by;
    public bl bz;
    public bp bC;
    public boolean bD;
    public boolean bE;
    public boolean bF;
    public boolean bG;
    boolean bJ;
    boolean bK;
    boolean bL;
    boolean bM;
    boolean bN;
    z bO;
    z bP;
    boolean bQ;
    float bR;
    boolean bS;
    float bT;
    z bU;
    z bV;
    boolean bW;
    float bX;
    z bY;
    z bZ;
    public boolean cc;
    public boolean cd;
    public boolean ce;
    public boolean cf;
    public boolean cg;
    public com.corrodinggames.rts.game.units.custom.d.b ch;
    public com.corrodinggames.rts.game.units.custom.d.b ci;
    public com.corrodinggames.rts.game.units.custom.d.b cj;
    public int cl;
    public boolean cm;
    public boolean cn;
    public int cr;
    public float cs;
    public LogicBoolean cx;
    public boolean cy;
    public boolean cz;
    public boolean cA;
    public boolean cB;
    public boolean cC;
    public boolean cD;
    public boolean cE;
    public float cF;
    public int cG;
    public h cH;
    public float cJ;
    public float cK;
    public boolean cM;
    public float cN;
    public boolean cO;
    public float cP;
    public float cQ;
    public boolean cR;
    public float cS;
    public bb cT;
    public boolean cU;
    public float cV;
    public int cW;
    public float da;
    public float db;
    public boolean dc;
    public int dd;
    public float de;
    public int df;
    public int dg;
    public int dh;
    public float di;
    public float dj;
    public Float dk;
    public float dl;
    public boolean dm;
    public Float dn;

    /* renamed from: do  reason: not valid java name */
    public bl f1do;
    public bl dp;
    public bl dq;
    f dv;
    f dw;
    f dx;
    f dy;
    f dz;
    f dA;
    public boolean dB;
    public boolean dC;
    public boolean dD;
    public boolean dE;
    public bn dF;
    public int dG;
    public float dH;
    m dI;
    public float dJ;
    public Boolean dK;
    public boolean dL;
    public float dM;
    public float dN;
    public float dO;
    public boolean dP;
    public boolean dQ;
    public boolean dR;
    public float dT;
    public boolean dX;
    public boolean dY;
    public int dZ;
    public float ea;
    public float eb;
    public com.corrodinggames.rts.game.units.b ec;
    public float ed;
    public float ee;
    public boolean ef;
    public boolean eg;
    public boolean eh;
    public boolean ei;
    public float ej;
    public float ek;
    public float el;
    public float eo;
    public boolean ep;
    public LogicBoolean eq;
    public LogicBoolean er;
    public LogicBoolean es;
    public LogicBoolean et;
    public boolean eu;
    public h ev;
    public h ew;
    public boolean ex;
    public boolean ey;
    public float ez;
    public boolean eA;
    public int eB;
    public boolean eC;
    public boolean eD;
    public boolean eE;
    public boolean eF;
    public float eG;
    public boolean eH;
    public boolean eI;
    public float eN;
    public boolean eO;
    public h eP;
    public boolean eR;
    public boolean eS;
    public boolean eT;
    public LogicBoolean eU;
    public LogicBoolean eV;
    public LogicBoolean eW;
    public boolean eX;
    public float eY;
    public LogicBoolean fc;
    public LogicBoolean fd;
    public be ff;
    public com.corrodinggames.rts.game.units.ao fg;
    public com.corrodinggames.rts.game.units.ao fh;
    public boolean fi;
    public boolean fj;
    public boolean fk;
    public h fl;
    public int fm;
    public h fn;
    public h fo;
    public boolean fp;
    public boolean fq;
    public boolean fr;
    public boolean fs;
    public boolean ft;
    public boolean fu;
    public h fv;
    public boolean fw;
    public int fx;
    public int fy;
    public float fz;
    public int fA;
    public float fB;
    public float fC;
    public float fD;
    public int fE;
    public int fF;
    public boolean fG;
    public h fH;
    public String fI;
    public boolean fJ;
    public boolean fM;
    public boolean fN;
    public h fO;
    public boolean fP;
    public bh[] fR;
    boolean fX;
    r[] fY;
    r[] fZ;
    r[] ga;
    public boolean gi;
    String gk;
    String gl;
    HashMap gm;
    com.corrodinggames.rts.game.units.at[] gn;
    public boolean gr;
    public boolean gs;
    public static final Rect a = new Rect();
    public static final ArrayList c = new ArrayList();
    public static ArrayList d = new ArrayList();
    public static ArrayList e = null;
    public static final HashMap f = new HashMap();
    public static ArrayList g = new ArrayList();
    public static LogicBoolean fa = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");
    public static LogicBoolean fb = LogicBoolean.create(null, "if not self.isOverLiquid()");
    static final ay[] ge = new ay[0];
    static final ay[] gf = new ay[0];
    public final com.corrodinggames.rts.gameFramework.utility.m h = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m i = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m j = new com.corrodinggames.rts.gameFramework.utility.m();
    final com.corrodinggames.rts.gameFramework.utility.m k = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m l = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m m = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m n = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m o = new com.corrodinggames.rts.gameFramework.utility.m();
    final com.corrodinggames.rts.gameFramework.utility.m p = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m q = new com.corrodinggames.rts.gameFramework.utility.m();
    public final VariableScope.VariableMapping r = new VariableScope.VariableMapping();
    public boolean A = true;
    public boolean G = true;
    public com.corrodinggames.rts.gameFramework.utility.m N = new com.corrodinggames.rts.gameFramework.utility.m();
    public int U = 1;
    public int V = Integer.MAX_VALUE;
    public int W = -1;
    public int X = -1;
    public com.corrodinggames.rts.gameFramework.unitAction.e ad = null;
    public boolean ae = true;
    public com.corrodinggames.rts.gameFramework.unitAction.e al = null;
    public com.corrodinggames.rts.gameFramework.unitAction.e an = null;
    public com.corrodinggames.rts.gameFramework.unitAction.e ao = null;
    public com.corrodinggames.rts.gameFramework.unitAction.e ap = null;
    public com.corrodinggames.rts.gameFramework.unitAction.e[] ar = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public com.corrodinggames.rts.gameFramework.unitAction.e[] at = null;
    public com.corrodinggames.rts.gameFramework.unitAction.e au = null;
    public boolean av = false;
    public ba[] ax = null;
    public boolean ay = false;
    public boolean az = false;
    public final com.corrodinggames.rts.gameFramework.utility.m aA = new com.corrodinggames.rts.gameFramework.utility.m();
    public float aG = 1.0f;
    public int aX = -1;
    public int aZ = -1;
    public float bd = 1.0f;
    public int bA = -1;
    public int bB = -1;
    public float bH = 1.0f;
    public float bI = 1.0f;
    public float ca = 60.0f;
    public s cb = s.everyFrame;
    public float ck = 0.001f;
    public com.corrodinggames.rts.game.units.custom.d.b co = com.corrodinggames.rts.game.units.custom.d.b.a;
    public com.corrodinggames.rts.game.units.custom.e.f cp = com.corrodinggames.rts.game.units.custom.e.f.a;
    public com.corrodinggames.rts.game.units.custom.e.f cq = com.corrodinggames.rts.game.units.custom.e.f.a;
    public VariableScope.CachedWriter ct = null;
    public float cu = 1.0f;
    public com.corrodinggames.rts.game.units.custom.d.b cv = com.corrodinggames.rts.game.units.custom.d.b.a;
    public com.corrodinggames.rts.game.units.custom.d.b cw = com.corrodinggames.rts.game.units.custom.d.b.a;
    public int cI = -2;
    public as cL = new as(true);
    public Rect cX = new Rect();
    public Rect cY = new Rect();
    public Rect cZ = new Rect();
    com.corrodinggames.rts.gameFramework.utility.m dr = new com.corrodinggames.rts.gameFramework.utility.m();
    f ds = new f("moving");
    f dt = new f("idle");
    f du = new f("attack");
    public float dS = 0.0f;
    public float dU = -1.0f;
    public float dV = 0.03f;
    public float dW = 0.06f;
    public int em = -1;
    public int en = -1;
    public boolean eJ = false;
    public boolean eK = false;
    public boolean eL = false;
    public int eM = 0;
    public com.corrodinggames.rts.gameFramework.utility.m eQ = new com.corrodinggames.rts.gameFramework.utility.m();
    public int eZ = 1;
    public boolean fe = true;
    public float fK = -1.0f;
    public com.corrodinggames.rts.gameFramework.utility.m fL = new com.corrodinggames.rts.gameFramework.utility.m();
    public bn[] fQ = null;
    ArrayList fS = new ArrayList();
    ArrayList fT = new ArrayList();
    boolean fU = false;
    bn fV = null;
    com.corrodinggames.rts.gameFramework.utility.m fW = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m gb = new com.corrodinggames.rts.gameFramework.utility.m();
    ArrayList gc = new ArrayList();
    ArrayList gd = new ArrayList();
    ArrayList gg = new ArrayList();
    ArrayList gh = new ArrayList();
    int gj = -1;
    com.corrodinggames.rts.game.units.a.z go = new com.corrodinggames.rts.game.units.a.z(this);
    com.corrodinggames.rts.gameFramework.utility.m gp = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m gq = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m gt = new com.corrodinggames.rts.gameFramework.utility.m();

    public String b() {
        String str = this.D;
        if (this.J != null) {
            String str2 = this.J.q;
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            str = str + " (in mod " + this.J.a() + ")";
        }
        return str;
    }

    public o a(String str, o oVar) {
        if (str != null) {
            o oVar2 = new o(this);
            oVar2.a = str;
            oVar2.a();
            return oVar2;
        } else if (oVar != null) {
            o oVar3 = new o(this);
            oVar3.a = oVar.a;
            oVar3.a();
            return oVar3;
        } else {
            return null;
        }
    }

    f a(n nVar, f fVar, boolean z) {
        f a2 = a(nVar);
        if (a2 != null) {
            if (z && fVar != null && fVar.a()) {
                throw new bo("Cannot define animation " + nVar.name() + " on graphics and with onAction at same time");
            }
            return a2;
        }
        return fVar;
    }

    public static String a(String str) {
        String trim = str.toLowerCase(Locale.ROOT).trim();
        if (trim.startsWith("arm_")) {
            trim = "arm" + trim.substring("arm_".length());
        }
        if (trim.startsWith("leg_")) {
            trim = "leg" + trim.substring("leg_".length());
        }
        return trim;
    }

    public int b(String str) {
        String a2 = a(str);
        GameEngine.m5e("name:" + a2);
        for (int i = 0; i < this.ax.length; i++) {
            GameEngine.m5e("checking:" + this.ax[i].b);
            if (a2.equals(this.ax[i].b)) {
                GameEngine.m5e("got");
                return i;
            }
        }
        return -1;
    }

    f a(n nVar) {
        Iterator it = this.dr.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.a(nVar)) {
                return fVar;
            }
        }
        return null;
    }

    public void a(t tVar) {
        this.gb.add(tVar);
    }

    public z a(String str, z zVar) {
        if (str == null && zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this, str);
        zVar2.c();
        return zVar2;
    }

    public z c(String str) {
        return new z(this, str);
    }

    public ay d(String str) {
        boolean z = false;
        boolean z2 = false;
        String upperCase = str.toUpperCase();
        if (upperCase.startsWith("CUSTOM:")) {
            str = str.substring("CUSTOM:".length()).trim();
            z = true;
        }
        if (upperCase.startsWith("CUSTOM|")) {
            str = str.substring("CUSTOM|".length()).trim();
            z = true;
        }
        if (upperCase.startsWith("BUILTIN:") || upperCase.startsWith("BUILTIN|")) {
            str = str.substring("BUILTIN:".length()).trim();
            z2 = true;
        }
        if (z) {
            Iterator it = this.gd.iterator();
            while (it.hasNext()) {
                ay ayVar = (ay) it.next();
                if (str.equalsIgnoreCase(ayVar.name)) {
                    return ayVar;
                }
            }
            throw new bo("Failed to find custom effect with the name:" + str);
        } else if (str.contains(":")) {
            throw new bo("Unknown effect format:" + str + " expected built-in effect or CUSTOM:");
        } else {
            if (str.contains("|")) {
                throw new bo("Unknown effect format:" + str + " expected built-in effect or CUSTOM|");
            }
            if (!z2) {
                Iterator it2 = this.gd.iterator();
                while (it2.hasNext()) {
                    ay ayVar2 = (ay) it2.next();
                    if (str.equalsIgnoreCase(ayVar2.name)) {
                        return ayVar2;
                    }
                }
            }
            if ("small".equalsIgnoreCase(str)) {
                return new ay(az.small);
            }
            if ("medium".equalsIgnoreCase(str)) {
                return new ay(az.medium);
            }
            if ("large".equalsIgnoreCase(str)) {
                return new ay(az.large);
            }
            if ("smoke".equalsIgnoreCase(str)) {
                return new ay(az.smoke);
            }
            if ("shockwave".equalsIgnoreCase(str)) {
                return new ay(az.shockwave);
            }
            if ("largeExplosion".equalsIgnoreCase(str)) {
                return new ay(az.largeExplosion);
            }
            if ("smallExplosion".equalsIgnoreCase(str)) {
                return new ay(az.smallExplosion);
            }
            if ("resourcePoolSmoke".equalsIgnoreCase(str)) {
                return new ay(az.resourcePoolSmoke);
            }
            if ("none".equalsIgnoreCase(str)) {
                return new ay(az.noneExplosion);
            }
            throw new bo("Failed to find built-in or custom effect with the name:" + str);
        }
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean C() {
        return this.ce;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean w() {
        if (this.cg) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.O() && gameEngine.netEngine.gameMapData.nukes) {
                return true;
            }
        }
        return this.cf;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int c() {
        return this.ch.a();
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.d.b u() {
        return this.ch;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        return this.cj;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.d.b d(int i) {
        return this.ch;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public float D() {
        return this.ck;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int g() {
        return this.cl;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.am a() {
        return a(false, this);
    }

    public com.corrodinggames.rts.game.units.am a(boolean z) {
        return a(z, this);
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String e() {
        if (this.gj != com.corrodinggames.rts.gameFramework.translations.a.c || this.gk == null) {
            this.gj = com.corrodinggames.rts.gameFramework.translations.a.c;
            String b2 = this.aC != null ? this.aC.b() : this.M;
            String str = this.M;
            if (this.aE != null) {
                str = this.aE;
            }
            this.gk = com.corrodinggames.rts.gameFramework.translations.a.a("units." + str + ".name", b2, new Object[0]);
        }
        return this.gk;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String f() {
        if (this.gj != com.corrodinggames.rts.gameFramework.translations.a.c || this.gl == null) {
            this.gj = com.corrodinggames.rts.gameFramework.translations.a.c;
            String b2 = this.aD != null ? this.aD.b() : this.M;
            String str = this.M;
            if (this.aE != null) {
                str = this.aE;
            }
            this.gl = com.corrodinggames.rts.gameFramework.translations.a.a("units." + str + ".description", b2, new Object[0]);
        }
        return this.gl;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean j() {
        return this.aH;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean k() {
        return this.aI;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean m() {
        return this.fq;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean n() {
        return this.fr;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean l() {
        return this.fp;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.ao o() {
        return this.fg;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean p() {
        return this.aJ;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public be q() {
        return this.ff;
    }

    public void a(ArrayList arrayList, int i) {
        if (this.eM != 0 && this.eT) {
            arrayList.add(com.corrodinggames.rts.game.units.e.i.i);
            arrayList.add(com.corrodinggames.rts.game.units.e.i.j);
        }
    }

    @Override // com.corrodinggames.rts.game.units.as
    public void h() {
        this.gm = null;
        this.gn = new com.corrodinggames.rts.game.units.at[3];
        for (int i = 1; i <= 3; i++) {
            com.corrodinggames.rts.game.units.at atVar = new com.corrodinggames.rts.game.units.at();
            a(atVar.a, i);
            this.gn[i - 1] = atVar;
        }
    }

    @Override // com.corrodinggames.rts.game.units.as
    public ArrayList a(int i) {
        if (this.gn == null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            throw new RuntimeException("specialActionLists==null for:" + this.M + " t:" + i + " networked:" + gameEngine.N() + " replay:" + gameEngine.replayEngine.j() + " sandbox:" + gameEngine.bv + " active: " + d.contains(this));
        }
        return this.gn[i - 1].a;
    }

    public void r() {
        ArrayList a2 = a(this.cl);
        if (a2.size() > 4) {
            this.gm = new HashMap();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) a2.get(i);
                if (this.gm.get(sVar.N()) == null) {
                    this.gm.put(sVar.N(), sVar);
                }
            }
        }
    }

    public com.corrodinggames.rts.game.units.a.s a(com.corrodinggames.rts.game.units.a.c cVar) {
        if (this.gm != null) {
            return (com.corrodinggames.rts.game.units.a.s) this.gm.get(cVar);
        }
        ArrayList a2 = a(this.cl);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) a2.get(i);
            if (sVar.d(cVar)) {
                return sVar;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String i() {
        return this.M;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String v() {
        return this.M;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int b(int i) {
        return c();
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.a.z d() {
        return this.go;
    }

    public v a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        v vVar = new v();
        vVar.a = str2;
        vVar.b = str3;
        vVar.c = str;
        this.p.add(vVar);
        return vVar;
    }

    public x b(String str, String str2, String str3) {
        x xVar = new x();
        xVar.a = str2;
        xVar.b = str3;
        xVar.c = "(known unit:)" + i();
        xVar.d = this;
        xVar.e = true;
        xVar.g = str;
        this.p.add(xVar);
        return xVar;
    }

    public u c(String str, String str2, String str3) {
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        u uVar = new u();
        uVar.c = str2;
        uVar.d = str3;
        for (String str4 : com.corrodinggames.rts.gameFramework.f.c(str, ',')) {
            uVar.a.add(str4.trim());
        }
        this.gp.add(uVar);
        return uVar;
    }

    public static v a(com.corrodinggames.rts.game.units.as asVar) {
        if (asVar == null) {
            return null;
        }
        v vVar = new v();
        vVar.a = "known";
        vVar.d = asVar;
        vVar.e = true;
        return vVar;
    }

    public static l c(int i) {
        int i2;
        if (i >= 100 && (i2 = i - 100) < g.size()) {
            return (l) g.get(i2);
        }
        return null;
    }

    public static ArrayList s() {
        ArrayList arrayList = new ArrayList();
        int i = 100;
        Iterator it = g.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return arrayList;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public h x() {
        return this.O;
    }

    public bn e(String str) {
        Iterator it = this.fS.iterator();
        while (it.hasNext()) {
            bn bnVar = (bn) it.next();
            if (bnVar.a.equalsIgnoreCase(str)) {
                return bnVar;
            }
        }
        return null;
    }

    public bh f(String str) {
        Iterator it = this.fT.iterator();
        while (it.hasNext()) {
            bh bhVar = (bh) it.next();
            if (bhVar.bh.equalsIgnoreCase(str)) {
                return bhVar;
            }
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.a.d g(String str) {
        Iterator it = this.gh.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.a.d dVar = (com.corrodinggames.rts.game.units.custom.a.d) it.next();
            if (dVar.c != null && dVar.c.equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.a.s h(String str) {
        Iterator it = a(this.cl).iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) it.next();
            if (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) {
                com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) sVar;
                if (gVar.a.c.equalsIgnoreCase(str)) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public void a(com.corrodinggames.rts.game.units.custom.b.a aVar) {
        if (!this.h.contains(aVar)) {
            this.h.add(aVar);
        }
    }

    public void b(com.corrodinggames.rts.game.units.custom.b.a aVar) {
        if (!this.i.contains(aVar)) {
            this.i.add(aVar);
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.d.b bVar) {
        if (bVar != null && bVar.b != 0) {
            if (this.gs) {
                GameEngine.g("usesCreditResources:" + bVar);
            }
            this.gr = true;
        }
    }

    public com.corrodinggames.rts.game.units.custom.b.n i(String str) {
        Iterator it = this.aA.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.b.n nVar = (com.corrodinggames.rts.game.units.custom.b.n) it.next();
            if (nVar.b().equalsIgnoreCase(str)) {
                return nVar;
            }
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.e.a j(String str) {
        com.corrodinggames.rts.game.units.custom.e.a a2 = com.corrodinggames.rts.game.units.custom.e.a.a(str);
        if (a2 != null) {
            return a2;
        }
        return k(str);
    }

    public com.corrodinggames.rts.game.units.custom.e.a k(String str) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.e.d dVar = (com.corrodinggames.rts.game.units.custom.e.d) it.next();
            if (dVar.a.equalsIgnoreCase(str)) {
                return dVar.b;
            }
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.e.d a(com.corrodinggames.rts.game.units.custom.e.a aVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.e.d dVar = (com.corrodinggames.rts.game.units.custom.e.d) it.next();
            if (dVar.b == aVar) {
                return dVar;
            }
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.c.a a(g gVar) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.c.a aVar = (com.corrodinggames.rts.game.units.custom.c.a) it.next();
            if (aVar.g == gVar) {
                return aVar;
            }
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.c.a l(String str) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.custom.c.a aVar = (com.corrodinggames.rts.game.units.custom.c.a) it.next();
            if (aVar.g.a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean y() {
        return this.gr;
    }

    public String t() {
        if (this.J != null) {
            return this.J.a();
        }
        return null;
    }

    public static void a(GameOutputStream gameOutputStream) {
        gameOutputStream.e("customUnits");
        gameOutputStream.writeInt(1);
        gameOutputStream.writeInt(d.size());
        Iterator it = d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            gameOutputStream.writeString(lVar.M);
            gameOutputStream.writeInt(lVar.H);
            gameOutputStream.writeBoolean(true);
            gameOutputStream.writeIsString(lVar.t());
            long j = 0;
            if (lVar.J != null && lVar.J.k != 0) {
                j = lVar.J.k;
            }
            gameOutputStream.writeLong(j);
            gameOutputStream.writeLong(0L);
        }
        gameOutputStream.endBlock("customUnits");
    }

    public static void a(ab abVar, HashMap hashMap) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!(abVar.a == null)) {
            for (ac acVar : hashMap.values()) {
                if (acVar.b == 0 && acVar.d == 0 && acVar.c > 0) {
                    arrayList.add(acVar);
                } else if (acVar.c > 0 || acVar.d > 0) {
                    arrayList2.add(acVar);
                }
            }
            String str2 = null;
            String str3 = VariableScope.nullOrMissingString;
            if (arrayList.size() > 0) {
                String str4 = VariableScope.nullOrMissingString;
                boolean z = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ac acVar2 = (ac) it.next();
                    if (z) {
                        z = false;
                    } else {
                        str4 = str4 + ", \n";
                    }
                    str4 = str4 + "'" + acVar2.a + "'";
                }
                String b2 = com.corrodinggames.rts.gameFramework.f.b(str4, 200);
                if (arrayList.size() == 1) {
                    str2 = "Missing 1 mod.";
                    str = "Missing mod: '" + ((ac) arrayList.get(0)).a + "'";
                } else {
                    str2 = "Missing " + arrayList.size() + " mods";
                    str = "missing mods: " + b2;
                }
                str3 = str + "\n Required by this server.";
                if (arrayList2.size() > 0) {
                    str3 = str3 + "\n and " + arrayList2.size() + " mods are different.";
                }
            } else if (arrayList2.size() > 0) {
                String str5 = VariableScope.nullOrMissingString;
                boolean z2 = true;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ac acVar3 = (ac) it2.next();
                    if (z2) {
                        z2 = false;
                    } else {
                        str5 = str5 + ", \n";
                    }
                    str5 = str5 + "'" + acVar3.a + "'";
                }
                str2 = "Different mod data.";
                str3 = "Different mod data for: " + com.corrodinggames.rts.gameFramework.f.b(str5, 200) + " \n Check these mods are the same version as the server you are connecting to.";
            } else {
                GameEngine.m5e("Skipping nice message: completelyMissedMods:" + arrayList.size() + " differentMods:" + arrayList2.size());
            }
            if (str2 != null) {
                bd bdVar = new bd(str3, VariableScope.nullOrMissingString);
                bdVar.a = str2;
                throw bdVar;
            }
        }
        String str6 = "from internal units";
        if (abVar.a != null) {
            str6 = "from mod:'" + abVar.a + "'";
        }
        com.corrodinggames.rts.gameFramework.mod.b f2 = GameEngine.getGameEngine().bZ.f(abVar.a);
        if (f2 != null) {
            if (!f2.m()) {
                str6 = str6 + " (You seem to have this mod but it is not enabled)";
            } else {
                str6 = str6 + " (You seem to have this mod but it might be a different version)";
            }
        }
        if (abVar.d == -1) {
            throw new bd("The server requires the unit:" + abVar.b + " that was not found " + str6, VariableScope.nullOrMissingString);
        }
        throw new bd("Found unit:" + abVar.b + " but it does not match the server's copy " + str6, "checksum c:" + abVar.d + " s:" + abVar.c);
    }

    public static void a(GameInputStream gameInputStream) {
        gameInputStream.startBlock("customUnits");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            boolean z = false;
            if (gameInputStream.readInt() >= 2) {
                z = gameInputStream.readBoolean();
                gameInputStream.readBoolean();
            }
            int readInt = gameInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                String readString = gameInputStream.readString();
                int readInt2 = gameInputStream.readInt();
                gameInputStream.readBoolean();
                String isReadString = gameInputStream.isReadString();
                gameInputStream.readLong();
                gameInputStream.readLong();
                String str = null;
                if (z) {
                    str = gameInputStream.isReadString();
                }
                l lVar = null;
                int i2 = -1;
                l lVar2 = null;
                synchronized (c) {
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        l lVar3 = (l) it.next();
                        if (readString.equals(lVar3.M)) {
                            if (readInt2 == lVar3.H) {
                                lVar = lVar3;
                            } else {
                                lVar2 = lVar3;
                                i2 = lVar3.H;
                            }
                        }
                    }
                }
                ac acVar = (ac) hashMap.get(isReadString);
                if (acVar == null) {
                    acVar = new ac(isReadString);
                    hashMap.put(isReadString, acVar);
                }
                if (lVar == null) {
                    if (lVar2 != null) {
                        acVar.d++;
                    } else {
                        acVar.c++;
                    }
                    ab abVar = new ab();
                    abVar.a = isReadString;
                    abVar.b = readString;
                    abVar.d = i2;
                    abVar.c = readInt2;
                    abVar.f = lVar2;
                    abVar.e = str;
                    arrayList2.add(abVar);
                    GameEngine.print(abVar.a());
                } else {
                    acVar.b++;
                    arrayList.add(lVar);
                }
            }
            if (arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ab abVar2 = (ab) it2.next();
                    if (abVar2.a == null) {
                        a(abVar2, hashMap);
                    }
                }
                a((ab) arrayList2.get(0), hashMap);
            }
            e = arrayList;
            gameInputStream.endBlock("customUnits");
        } catch (Throwable th) {
            gameInputStream.endBlock("customUnits");
            throw th;
        }
    }

    public void b(com.corrodinggames.rts.game.units.as asVar) {
        if (!this.fL.contains(asVar) && asVar != this) {
            this.fL.add(asVar);
        }
        if (asVar instanceof l) {
            Iterator it = ((l) asVar).fL.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.as asVar2 = (com.corrodinggames.rts.game.units.as) it.next();
                if (!this.fL.contains(asVar2) && asVar != this) {
                    this.fL.add(asVar2);
                }
            }
        }
    }

    public static l a(l lVar) {
        Iterator it = d.iterator();
        while (it.hasNext()) {
            l lVar2 = (l) it.next();
            if (lVar.D.equals(lVar2.D)) {
                return lVar2;
            }
        }
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            l lVar3 = (l) it2.next();
            if (lVar.M.equals(lVar3.M)) {
                return lVar3;
            }
        }
        return null;
    }

    public static void A() {
        Iterator it = com.corrodinggames.rts.game.units.am.bF().iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it.next();
            if (amVar instanceof j) {
                j jVar = (j) amVar;
                l lVar = jVar.x;
                if (!d.contains(lVar)) {
                    l a2 = a(lVar);
                    if (a2 == null) {
                        a2 = b;
                    }
                    if (a2 != null) {
                        jVar.a(a2, false, true);
                    }
                }
            }
        }
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e[] a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, com.corrodinggames.rts.game.o oVar) {
        boolean z = false;
        if ((this.J != null || this.eE) && !GameEngine.getGameEngine().settingsEngine.disableModLazyLoad) {
            z = true;
        }
        if ((this.cy && this.cz) || this.cE) {
            z = true;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e[] a2 = PlayerData.a(eVar, oVar, z);
        for (int i = 0; i < a2.length; i++) {
            if (z && this.J != null && this.eE && i == 1) {
                a2[i].w();
            }
        }
        ag.a(a2);
        return a2;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e a(com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2) {
        return a(abVar, str, str2, this.ab);
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e a(com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, boolean z) {
        return a(this.F, abVar.b(str, str2, (String) null), z, str, str2);
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e a(String str, String str2, boolean z, String str3, String str4) {
        return ag.a(str, str2, z, this, str3, str4);
    }

    public static com.corrodinggames.rts.game.units.as m(String str) {
        for (com.corrodinggames.rts.game.units.as asVar : f.keySet()) {
            if (asVar.i().equals(str)) {
                return (com.corrodinggames.rts.game.units.as) f.get(asVar);
            }
        }
        return null;
    }

    public static com.corrodinggames.rts.game.units.as c(com.corrodinggames.rts.game.units.as asVar) {
        return (com.corrodinggames.rts.game.units.as) f.get(asVar);
    }

    public static l n(String str) {
        Iterator it = d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (str.equals(lVar.M)) {
                return lVar;
            }
        }
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            l lVar2 = (l) it2.next();
            if (lVar2.N.contains(str)) {
                return lVar2;
            }
        }
        return null;
    }

    public static String E() {
        Iterator it;
        Iterator it2;
        String str = VariableScope.nullOrMissingString;
        while (d.iterator().hasNext()) {
            str = str + ((l) it.next()).M + ", ";
        }
        Iterator it3 = d.iterator();
        while (it3.hasNext()) {
            while (((l) it3.next()).N.iterator().hasNext()) {
                str = str + ((String) it2.next()) + ", ";
            }
        }
        return str;
    }

    public static j a(boolean z, l lVar) {
        return new j(z, lVar);
    }

    public void o(String str) {
        if (com.corrodinggames.rts.gameFramework.utility.ag.i(str)) {
            return;
        }
        this.k.add(new aa(str));
    }

    public void p(String str) {
        ag.a(i(), new bo(str), this);
    }

    public void q(String str) {
        String str2 = "Warning (on " + b() + "): " + str;
        GameEngine.print(str2);
        this.gt.add(str);
        if (this.J == null) {
            GameEngine.getGameEngine().a(str2, 1);
            if (GameEngine.aT) {
                GameEngine.m5e("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
        }
    }

    public void r(String str) {
        String str2 = "Warning (on " + b() + "): " + str;
        GameEngine.print(str2);
        this.gt.add(str);
        if (this.J == null) {
            GameEngine.getGameEngine().a(str2, 1);
            if (GameEngine.aT) {
                GameEngine.m5e("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
            return;
        }
        this.J.b(str2);
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.gameFramework.unitAction.e z() {
        return this.aw;
    }

    public static void F() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            ad adVar = lVar.T;
            if (adVar != null) {
                if (adVar == ad.emptyResourcePools_asNeutral || adVar == ad.emptyOrOccupiedResourcePools_asNeutral) {
                    Iterator it2 = gameEngine.bL.A.iterator();
                    while (it2.hasNext()) {
                        Point point = (Point) it2.next();
                        com.corrodinggames.rts.game.units.am a2 = lVar.a();
                        a2.b(PlayerData.i);
                        gameEngine.bL.a(point.a, point.b);
                        a2.eo = gameEngine.bL.T;
                        a2.ep = gameEngine.bL.U;
                        a2.eo += a2.cZ();
                        a2.ep += a2.da();
                        if (adVar == ad.emptyResourcePools_asNeutral && (a2 instanceof com.corrodinggames.rts.game.units.y) && ((com.corrodinggames.rts.game.units.y) a2).a((com.corrodinggames.rts.game.units.am) null, (PlayerData) null)) {
                            a2.ci();
                        } else {
                            PlayerData.c(a2);
                        }
                    }
                } else if (adVar == ad.mapCenter_asNeutral || adVar == ad.mapCenter_eachActiveTeam) {
                    if (adVar == ad.mapCenter_asNeutral) {
                        com.corrodinggames.rts.game.units.am a3 = lVar.a();
                        a3.b(PlayerData.i);
                        gameEngine.bL.b(gameEngine.bL.i() / 2.0f, gameEngine.bL.j() / 2.0f);
                        a3.eo = gameEngine.bL.T;
                        a3.ep = gameEngine.bL.U;
                        a3.eo += a3.cZ();
                        a3.ep += a3.da();
                        PlayerData.c(a3);
                    }
                    if (adVar == ad.mapCenter_eachActiveTeam) {
                        Iterator it3 = PlayerData.c().iterator();
                        while (it3.hasNext()) {
                            PlayerData playerData = (PlayerData) it3.next();
                            if (playerData.a(true, false) > 0) {
                                com.corrodinggames.rts.game.units.am a4 = lVar.a();
                                a4.b(playerData);
                                gameEngine.bL.b(gameEngine.bL.i() / 2.0f, gameEngine.bL.j() / 2.0f);
                                a4.eo = gameEngine.bL.T;
                                a4.ep = gameEngine.bL.U;
                                a4.eo += a4.cZ();
                                a4.ep += a4.da();
                                PlayerData.c(a4);
                            }
                        }
                    }
                } else if (adVar == ad.spawnPoint_eachActiveTeam) {
                    Iterator it4 = PlayerData.c().iterator();
                    while (it4.hasNext()) {
                        PlayerData playerData2 = (PlayerData) it4.next();
                        if (playerData2.a(true, false) > 0) {
                            PointF pointF = new PointF();
                            com.corrodinggames.rts.gameFramework.utility.y.a(playerData2, pointF);
                            com.corrodinggames.rts.game.units.am a5 = lVar.a();
                            a5.b(playerData2);
                            gameEngine.bL.b(pointF.x, pointF.y);
                            a5.eo = gameEngine.bL.T;
                            a5.ep = gameEngine.bL.U;
                            a5.eo += a5.cZ();
                            a5.ep += a5.da();
                            PlayerData.c(a5);
                        }
                    }
                } else {
                    GameEngine.print("onNewMapSpawn unhandled: " + lVar.T);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int a(com.corrodinggames.rts.game.units.am amVar) {
        int i = 0;
        if (this.aL > 0.0f) {
            return (int) this.aL;
        }
        if (this.aJ && this.aH && amVar.y() < 20) {
            i = 0 + 17;
        }
        return i;
    }

    public void a(String str, int i, String str2, String str3) {
        if (this.J == null || this.J.w >= i || !this.J.r) {
            return;
        }
        if (this.J.v == null) {
            throw new bo("[" + str2 + "] minVersion of " + str + " is required to be set in mod-info.txt at the root of this mod to use " + str3);
        }
        try {
            ModEngine.a(str, this.J.v);
            this.J.w = i;
        } catch (bo e2) {
            throw new bo("[" + str2 + "]" + str3 + " " + e2.getMessage() + " to be set as minVersion in mod-info.txt");
        }
    }

    public static com.corrodinggames.rts.game.units.as s(String str) {
        return a(str, true);
    }

    public static com.corrodinggames.rts.game.units.as a(String str, boolean z) {
        com.corrodinggames.rts.game.units.as a2 = com.corrodinggames.rts.game.units.ar.a(str, z);
        if (a2 == com.corrodinggames.rts.game.units.ar.editorOrBuilder) {
            return com.corrodinggames.rts.game.units.ar.builder;
        }
        return a2;
    }
}
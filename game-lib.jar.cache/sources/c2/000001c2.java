package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ay;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/am.class */
public abstract class am extends ay {
    public float br;
    public int bs;
    public am bt;
    public am bu;
    public am bv;
    public VariableScope bw;
    public com.corrodinggames.rts.game.units.custom.d.b bx;
    public com.corrodinggames.rts.game.units.custom.d.b by;
    public int bz;
    public int bA;
    public int bB;
    public int bC;
    public boolean bD;
    public static final com.corrodinggames.rts.gameFramework.utility.u bE = new com.corrodinggames.rts.gameFramework.utility.u();
    private static final com.corrodinggames.rts.gameFramework.utility.o a = new com.corrodinggames.rts.gameFramework.utility.o();
    public static HashMap bF = new HashMap();
    public static HashMap bG = new HashMap();
    public static HashMap bH = new HashMap();
    public static final Paint bI = new com.corrodinggames.rts.gameFramework.unitAction.ag();
    public static final Paint bJ;
    static final LightingColorFilter bK;
    public boolean bL;
    public boolean bM;
    public boolean bN;
    public boolean bO;
    public boolean bP;
    public am bQ;
    public am bR;
    public float bS;
    public boolean bT;
    public int bU;
    public boolean bV;
    public long bW;
    public PlayerData bX;
    public boolean bY;
    public float bZ;
    public float ca;
    public boolean cb;
    public float cc;
    public float cd;
    public float ce;
    public float cf;
    public float cg;
    public float ch;
    public boolean ci;
    public float cj;
    public float ck;
    public float cl;
    public float cm;
    public float cn;
    public boolean co;
    public boolean cp;
    public boolean cq;
    public boolean cr;
    public boolean cs;
    public boolean ct;
    public float cu;
    public float cv;
    public float cw;
    public float cx;
    public float cy;
    public float cz;
    public float cA;
    public float cB;
    public float cC;
    public float cD;
    public int cE;
    public int cF;
    public boolean cG;
    public int cH;
    public boolean cI;
    public float cJ;
    public boolean cK;
    public ap[] cL;
    public boolean cM;
    public am cN;
    public y cO;
    public com.corrodinggames.rts.game.units.custom.b.n cP;
    public int cQ;
    public boolean cR;
    public int cS;
    public int cT;
    public int cU;
    public float cV;
    public static final Paint cW;
    public static final Paint cX;
    public static final Paint cY;
    public static final Paint cZ;
    public static final Paint da;
    public static final Paint db;
    public static final Paint dc;
    public static final Paint dd;
    public static final Paint de;
    public static final Paint df;
    public static final Paint dg;
    public static final Paint dh;
    public static final Paint di;
    public static final Paint dj;
    public static final Paint dk;
    public int dl;
    public int dm;
    public int dn;

    /* renamed from: do  reason: not valid java name */
    public float f0do;
    public float dp;
    public float dq;
    static final RectF dr;
    static Paint ds;
    static Paint dt;
    public static final RectF du;
    public static final Rect dv;
    static final Rect dw;
    static final ArrayList dx;
    static ArrayList dy;
    public as dz;
    static final RectF dA;
    static final RectF dB;
    static final Rect dC;
    static final PointF dD;
    static final PointF dE;
    an[] dF;
    static final PointF dG;
    com.corrodinggames.rts.game.units.custom.e.f dH;
    public com.corrodinggames.rts.game.units.custom.c.c dI;
    com.corrodinggames.rts.game.units.custom.d.b dJ;

    public abstract ao h();

    public abstract boolean i();

    public abstract boolean Q();

    public abstract boolean aj();

    public abstract boolean ak();

    public abstract boolean s_();

    /* renamed from: r */
    public abstract as mo1r();

    public abstract boolean l();

    @Override // com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.bM);
        gameOutputStream.a(this.bQ);
        gameOutputStream.a(this.bR);
        gameOutputStream.writeFloat(this.bS);
        gameOutputStream.writeBoolean(this.bT);
        gameOutputStream.writeBoolean(this.bV);
        gameOutputStream.writeLong(this.bW);
        gameOutputStream.a(this.bX);
        gameOutputStream.writeFloat(this.bZ);
        gameOutputStream.writeFloat(this.ca);
        gameOutputStream.writeFloat(this.cc);
        gameOutputStream.writeFloat(this.cd);
        gameOutputStream.writeFloat(this.cf);
        gameOutputStream.writeFloat(this.cg);
        gameOutputStream.writeFloat(this.cj);
        gameOutputStream.writeFloat(this.ck);
        gameOutputStream.writeFloat(this.cl);
        gameOutputStream.writeFloat(this.cm);
        gameOutputStream.writeBoolean(this.cp);
        gameOutputStream.writeBoolean(this.cs);
        gameOutputStream.writeFloat(this.cu);
        gameOutputStream.writeFloat(this.cv);
        gameOutputStream.writeBoolean(this.cK);
        gameOutputStream.writeFloat(this.cL[0].a);
        gameOutputStream.writeFloat(this.cL[0].d);
        gameOutputStream.a(this.cN);
        gameOutputStream.writeByte(26);
        gameOutputStream.writeInt(this.cU);
        gameOutputStream.writeFloat(this.cV);
        gameOutputStream.writeFloat(this.ce);
        gameOutputStream.writeFloat(this.ch);
        int bl = bl();
        gameOutputStream.writeInt(bl);
        for (int i = 0; i < bl; i++) {
            ap apVar = this.cL[i];
            gameOutputStream.writeFloat(apVar.a);
            gameOutputStream.writeFloat(apVar.c);
            gameOutputStream.writeFloat(apVar.d);
            gameOutputStream.writeFloat(apVar.e);
            gameOutputStream.writeFloat(apVar.f);
            gameOutputStream.writeFloat(apVar.h);
            gameOutputStream.writeFloat(apVar.i);
            am amVar = apVar.j;
            if (amVar != null && amVar.bV) {
                amVar = null;
            }
            gameOutputStream.a(amVar);
            gameOutputStream.writeBoolean(this.cM);
        }
        gameOutputStream.writeInt(this.bs);
        gameOutputStream.writeFloat(this.cx);
        gameOutputStream.writeFloat(this.cy);
        gameOutputStream.writeFloat(this.cz);
        gameOutputStream.writeFloat(this.cA);
        gameOutputStream.writeBoolean(this.cq);
        gameOutputStream.writeBoolean(this.cr);
        gameOutputStream.writeBoolean(this.ct);
        gameOutputStream.writeBoolean(this.bN);
        gameOutputStream.writeFloat(this.cB);
        gameOutputStream.writeBoolean(this.ci);
        gameOutputStream.writeBoolean(this.dF != null);
        if (this.dF != null) {
            gameOutputStream.writeInt(this.dF.length);
            for (int i2 = 0; i2 < this.dF.length; i2++) {
                an anVar = this.dF[i2];
                gameOutputStream.writeBoolean(anVar.a);
                gameOutputStream.writeInt(anVar.b);
            }
        }
        gameOutputStream.writeFloat(this.cw);
        gameOutputStream.b(this.bt);
        gameOutputStream.writeInt(this.cE);
        gameOutputStream.writeInt(this.cF);
        gameOutputStream.writeInt(this.bz);
        gameOutputStream.writeInt(this.bA);
        gameOutputStream.writeInt(this.bB);
        gameOutputStream.writeInt(this.bC);
        gameOutputStream.writeBoolean(this.bO);
        gameOutputStream.writeBoolean(this.bP);
        this.dH.a(gameOutputStream);
        this.dI.a(gameOutputStream);
        gameOutputStream.b((am) this.cO);
        short s = -1;
        if (this.cO != null && this.cP != null) {
            s = this.cP.a();
        }
        gameOutputStream.a(s);
        gameOutputStream.writeInt(this.cQ);
        VariableScope.writeOutUnitOrPlaceholder(gameOutputStream, this.bu);
        VariableScope.writeOutUnitOrPlaceholder(gameOutputStream, this.bv);
        VariableScope.writeOut(gameOutputStream, this.bw);
        com.corrodinggames.rts.game.units.custom.d.b.a(gameOutputStream, this.bx);
        com.corrodinggames.rts.game.units.custom.d.b.a(gameOutputStream, this.by);
        gameOutputStream.writeFloat(this.cn);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        com.corrodinggames.rts.game.units.custom.b.n a2;
        this.bM = gameInputStream.readBoolean();
        this.bQ = gameInputStream.o();
        this.bR = gameInputStream.o();
        this.bS = gameInputStream.readFloat();
        this.bT = gameInputStream.readBoolean();
        this.bV = gameInputStream.readBoolean();
        this.bW = gameInputStream.readLong();
        b(gameInputStream.r());
        this.bZ = gameInputStream.readFloat();
        this.ca = gameInputStream.readFloat();
        this.cc = gameInputStream.readFloat();
        this.cd = gameInputStream.readFloat();
        this.cf = gameInputStream.readFloat();
        this.cg = gameInputStream.readFloat();
        gameInputStream.readFloat();
        gameInputStream.readFloat();
        this.cl = gameInputStream.readFloat();
        this.cm = gameInputStream.readFloat();
        this.cp = gameInputStream.readBoolean();
        this.cs = gameInputStream.readBoolean();
        o(gameInputStream.readFloat());
        this.cv = gameInputStream.readFloat();
        this.cK = gameInputStream.readBoolean();
        this.cL[0].a = gameInputStream.readFloat();
        this.cL[0].d = gameInputStream.readFloat();
        this.cN = gameInputStream.o();
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.cU = gameInputStream.readInt();
            this.cV = gameInputStream.readFloat();
        }
        if (readByte >= 2) {
            this.ce = gameInputStream.readFloat();
            this.ch = gameInputStream.readFloat();
            int readInt = gameInputStream.readInt();
            O(readInt);
            for (int i = 0; i < readInt; i++) {
                ap apVar = this.cL[i];
                apVar.a = gameInputStream.readFloat();
                apVar.c = gameInputStream.readFloat();
                apVar.d = gameInputStream.readFloat();
                apVar.e = gameInputStream.readFloat();
                apVar.f = gameInputStream.readFloat();
                if (readByte >= 8) {
                    apVar.h = gameInputStream.readFloat();
                    apVar.i = gameInputStream.readFloat();
                    apVar.j = gameInputStream.o();
                }
                if (readByte >= 12) {
                    this.cM = gameInputStream.readBoolean();
                }
            }
        }
        if (readByte >= 3) {
            this.bs = gameInputStream.readInt();
        }
        if (readByte >= 4) {
            this.cx = gameInputStream.readFloat();
            this.cy = gameInputStream.readFloat();
            this.cz = gameInputStream.readFloat();
            this.cA = gameInputStream.readFloat();
        }
        if (readByte >= 5) {
            this.cq = gameInputStream.readBoolean();
            this.cr = gameInputStream.readBoolean();
        }
        if (readByte >= 6) {
            this.ct = gameInputStream.readBoolean();
        }
        if (readByte >= 7) {
            this.bN = gameInputStream.readBoolean();
        }
        if (readByte >= 9) {
            this.cB = gameInputStream.readFloat();
        }
        if (readByte >= 10) {
            this.ci = gameInputStream.readBoolean();
        }
        if (readByte >= 11 && gameInputStream.readBoolean()) {
            this.dF = new an[gameInputStream.readInt()];
            for (int i2 = 0; i2 < this.dF.length; i2++) {
                this.dF[i2] = new an();
                an anVar = this.dF[i2];
                anVar.a = gameInputStream.readBoolean();
                anVar.b = gameInputStream.readInt();
            }
        }
        if (readByte >= 13) {
            this.cw = gameInputStream.readFloat();
        }
        if (readByte >= 14) {
            this.bt = gameInputStream.o();
        }
        if (readByte >= 15) {
            this.cE = gameInputStream.readInt();
            this.cF = gameInputStream.readInt();
        }
        if (readByte >= 16) {
            this.bz = gameInputStream.readInt();
            this.bA = gameInputStream.readInt();
            this.bB = gameInputStream.readInt();
        }
        if (readByte >= 17) {
            this.bC = gameInputStream.readInt();
        }
        if (readByte >= 18) {
            this.bO = gameInputStream.readBoolean();
            this.bP = gameInputStream.readBoolean();
        }
        if (readByte >= 19) {
            this.dH.a(gameInputStream);
            this.dI.a(this, gameInputStream);
        }
        if (readByte >= 20) {
            y p = gameInputStream.p();
            short readShort = gameInputStream.readShort();
            if (readShort != -1) {
                boolean z = false;
                if (p != null && (this instanceof y) && (a2 = p.a(readShort)) != null && p.a((y) this, a2)) {
                    z = true;
                }
                if (!z) {
                    cj();
                }
            }
        }
        if (readByte >= 21) {
            this.cQ = gameInputStream.readInt();
        }
        if (readByte >= 22) {
            if (readByte < 24) {
                throw new IOException("extension >=22 but <24");
            }
            this.bu = VariableScope.readInUnitOrPlaceholder(gameInputStream);
            this.bv = VariableScope.readInUnitOrPlaceholder(gameInputStream);
        }
        if (readByte >= 23) {
            this.bw = VariableScope.readIn(gameInputStream);
        }
        if (readByte >= 25) {
            this.bx = com.corrodinggames.rts.game.units.custom.d.b.a(gameInputStream);
            this.by = com.corrodinggames.rts.game.units.custom.d.b.a(gameInputStream);
        }
        if (readByte >= 26) {
            this.cn = gameInputStream.readFloat();
        }
        if (this.bV) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            bE.remove(this);
            gameEngine.cc.a(this);
        }
        super.a(gameInputStream);
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e a(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        return a(eVar, eVar.m(), eVar.l());
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, int i, int i2) {
        com.corrodinggames.rts.gameFramework.unitAction.e a2 = eVar.a(i, i2, false);
        eVar.x();
        a2.j();
        int m = a2.m();
        int l = a2.l();
        for (int i3 = 0; i3 < m; i3++) {
            for (int i4 = 0; i4 < l; i4++) {
                a2.a(i3, i4, Color.a(Color.a(eVar.a(i3, i4)), 0, 0, 0));
            }
        }
        a2.p();
        a2.s();
        eVar.y();
        a2.a("shadow:" + eVar.a());
        a2.n = true;
        return a2;
    }

    static {
        bI.a(true);
        bI.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
        bJ = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        bJ.a(true);
        bK = new LightingColorFilter(Color.a(255, 255, 255), Color.a(100, 100, 100));
        bJ.a(255, 255, 255, 255);
        bJ.a(bK);
        cW = new Paint();
        cX = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        cY = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        cZ = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        da = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        db = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        dc = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        dd = new Paint();
        de = new Paint();
        df = new Paint();
        dg = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        dh = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        di = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        dj = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        dk = new Paint();
        cW.a(Paint.Style.STROKE);
        cW.a(2.0f);
        a(cW);
        cX.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        cX.a(Paint.Style.STROKE);
        cX.a(2.0f);
        a(cX, true);
        cY.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        cY.a(Paint.Style.STROKE);
        cY.a(2.0f);
        a(cY);
        cZ.a(130, 0, 255, 0);
        cZ.a(Paint.Style.STROKE);
        cZ.a(2.0f);
        a(cZ);
        dd.a(70, 0, 255, 0);
        dd.a(Paint.Style.STROKE);
        dd.a(1.0f);
        a(dd);
        da.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 0, 0);
        da.a(Paint.Style.STROKE);
        da.a(2.0f);
        a(da);
        de.a(70, 255, 0, 0);
        de.a(Paint.Style.STROKE);
        de.a(1.0f);
        a(de);
        dc.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 0);
        dc.a(Paint.Style.STROKE);
        dc.a(2.0f);
        a(dc);
        df.a(70, 255, 255, 0);
        df.a(Paint.Style.STROKE);
        df.a(1.0f);
        a(df);
        db.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 255);
        db.a(Paint.Style.STROKE);
        db.a(2.0f);
        a(db);
        dg.a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        dg.a(Paint.Style.STROKE);
        dg.a(1.0f);
        a(dg);
        dh.a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        dh.a(Paint.Style.STROKE);
        dh.a(2.0f);
        a(dh);
        di.a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 0, 0);
        di.a(Paint.Style.STROKE);
        di.a(1.0f);
        a(di);
        dj.a(Paint.Style.STROKE);
        dk.a(Paint.Style.STROKE);
        dr = new RectF();
        ds = new Paint();
        dt = new Paint();
        du = new RectF();
        dv = new Rect();
        dw = new Rect();
        dx = new ArrayList();
        dy = new ArrayList();
        dA = new RectF();
        dB = new RectF();
        dC = new Rect();
        dD = new PointF();
        dE = new PointF();
        dG = new PointF();
    }

    public static com.corrodinggames.rts.gameFramework.utility.o bF() {
        a.a();
        return a;
    }

    public static void bG() {
        a.a();
    }

    public static void bH() {
        com.corrodinggames.rts.game.units.e.j.dt();
        com.corrodinggames.rts.game.units.d.d.dt();
        com.corrodinggames.rts.game.units.e.h.K();
        com.corrodinggames.rts.game.units.h.f.M();
        com.corrodinggames.rts.game.units.b.b.K();
        if (GameEngine.getGameEngine().as()) {
            Iterator it = EnumSet.allOf(ar.class).iterator();
            while (it.hasNext()) {
                ((ar) it.next()).b();
            }
        } else {
            com.corrodinggames.rts.game.units.e.b.K();
            com.corrodinggames.rts.game.units.d.p.b();
            com.corrodinggames.rts.game.units.d.r.M();
            al.b();
        }
        ar.t();
    }

    public boolean bI() {
        return false;
    }

    public boolean bJ() {
        return false;
    }

    public static HashMap bK() {
        HashMap hashMap = new HashMap();
        if (GameEngine.getGameEngine().as()) {
            Iterator it = EnumSet.allOf(ar.class).iterator();
            while (it.hasNext()) {
                ar arVar = (ar) it.next();
                am a2 = arVar.a(true);
                a2.a();
                a2.b(PlayerData.i);
                a2.cp = true;
                hashMap.put(arVar, a2);
            }
        }
        Iterator it2 = com.corrodinggames.rts.game.units.custom.l.d.iterator();
        while (it2.hasNext()) {
            com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) it2.next();
            am a3 = lVar.a(true);
            a3.a();
            a3.b(PlayerData.i);
            a3.cp = true;
            hashMap.put(lVar, a3);
        }
        return hashMap;
    }

    public static void bL() {
        bG = bK();
        bH = bK();
        bF = bK();
    }

    public static am a(as asVar) {
        return (am) bF.get(asVar);
    }

    public static am b(as asVar) {
        return c(asVar);
    }

    public static am c(as asVar) {
        am amVar = (am) bG.get(asVar);
        if (amVar == null) {
            if (com.corrodinggames.rts.game.units.custom.l.b == null) {
                GameEngine.m5e("Could not find:" + asVar.i() + " and missing place holder is null");
                return null;
            }
            amVar = (am) bG.get(com.corrodinggames.rts.game.units.custom.l.b);
            if (amVar == null) {
                GameEngine.m5e("name: " + com.corrodinggames.rts.game.units.custom.l.b.M);
                GameEngine.m5e("contains:" + bG.containsKey(com.corrodinggames.rts.game.units.custom.l.b));
                Iterator it = bG.keySet().iterator();
                while (it.hasNext()) {
                    GameEngine.m5e("has:" + ((as) it.next()).i());
                }
                GameEngine.m5e("Could not find:" + asVar.i() + " and missing place holder could not be found");
            }
        }
        return amVar;
    }

    public static am d(as asVar) {
        am amVar = (am) bH.get(asVar);
        if (amVar == null) {
            amVar = (am) bH.get(com.corrodinggames.rts.game.units.custom.l.b);
        }
        return amVar;
    }

    public static int bM() {
        int i = 0;
        if (GameEngine.getGameEngine().as()) {
            Iterator it = EnumSet.allOf(ar.class).iterator();
            while (it.hasNext()) {
                i = (i * 31) + a((ar) it.next()).bw();
            }
        }
        return i;
    }

    protected am(boolean z) {
        super(z);
        this.bs = -9999;
        this.bt = null;
        this.bu = null;
        this.bv = null;
        this.bz = -9999;
        this.bA = -9999;
        this.bB = -9999;
        this.bM = false;
        this.bN = false;
        this.bO = false;
        this.bP = false;
        this.bQ = null;
        this.bT = true;
        this.bU = 1;
        this.bV = false;
        this.bW = 0L;
        this.bZ = 0.0f;
        this.ca = 0.0f;
        this.cb = false;
        this.cc = 0.0f;
        this.cd = 0.0f;
        this.ce = 0.0f;
        this.cf = 0.0f;
        this.cm = 1.0f;
        this.cn = 1.0f;
        this.co = false;
        this.cp = false;
        this.cq = false;
        this.cr = false;
        this.cs = false;
        this.ct = false;
        this.cH = -9999;
        this.cJ = 0.0f;
        this.cK = true;
        this.cN = null;
        this.cO = null;
        this.cP = null;
        this.cQ = -9999;
        this.dl = -1;
        this.dm = -1;
        this.dn = -99;
        this.dq = 70.0f;
        this.dH = new com.corrodinggames.rts.game.units.custom.e.f();
        this.dI = new com.corrodinggames.rts.game.units.custom.c.c();
        this.dJ = null;
        bS();
        if (!z) {
            this.bL = true;
            bE.add(this);
            a.a(this);
        }
        this.bz = GameEngine.getGameEngine().by;
        this.dz = mo1r();
    }

    @Override // com.corrodinggames.rts.gameFramework.ay, com.corrodinggames.rts.gameFramework.w
    public void a() {
        PlayerData.a(this);
        if (this.bL) {
            bE.remove(this);
            a.b(this);
        }
        GameEngine.getGameEngine().bS.l(this);
        super.a();
    }

    public float bN() {
        return 3000.0f;
    }

    public int s(am amVar) {
        return 0;
    }

    public boolean bO() {
        return false;
    }

    public boolean bP() {
        return false;
    }

    public float bQ() {
        return -1.0f;
    }

    final void bR() {
        int i = 1;
        if (i()) {
            i = 3;
        } else if (Q()) {
            i = 2;
        }
        if (this.cN != null) {
            i = -1;
        }
        if (!this.bT) {
            i = -1;
        }
        this.bU = i;
    }

    public void o(float f) {
        this.cu = f;
    }

    public void bS() {
        O(1);
    }

    public void O(int i) {
        int length;
        int bl = bl();
        if (bl < i) {
            bl = i;
        }
        if (this.cL == null) {
            length = 0;
            this.cL = new ap[bl];
        } else if (this.cL.length < bl) {
            length = this.cL.length;
            this.cL = (ap[]) Arrays.copyOf(this.cL, bl);
        } else {
            return;
        }
        for (int i2 = length; i2 < this.cL.length; i2++) {
            this.cL[i2] = new ap();
        }
    }

    public static void a(Paint paint) {
        a(paint, false);
    }

    public static void a(Paint paint, boolean z) {
        if (!GameEngine.av() && z) {
            paint.a(0.0f);
        }
    }

    public float d(boolean z) {
        return this.cg + 90.0f;
    }

    public final boolean bT() {
        return this.cN == null && this.cm >= 1.0f;
    }

    public float x() {
        if (this.cu < this.cv) {
            return this.cu / this.cv;
        }
        return -1.0f;
    }

    public boolean bU() {
        return true;
    }

    public float bV() {
        if (this.cm < 1.0f) {
            if (this.cO == null || this.cO.cm >= 1.0f) {
                return this.cm;
            }
            return -1.0f;
        }
        return -1.0f;
    }

    public float bW() {
        return -1.0f;
    }

    public boolean bX() {
        return false;
    }

    public int bY() {
        return -1;
    }

    public int bZ() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
        float f2;
        int b;
        int b2;
        int b3;
        int b4;
        if (this.bV || this.cN != null) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f3 = this.cj;
        if (z) {
            return;
        }
        boolean z2 = false;
        int bY = bY();
        if (bV() >= 0.0f) {
            z2 = true;
        }
        if (bW() >= 0.0f) {
            z2 = true;
        }
        if (this.cG || gameEngine.settingsEngine.showHp) {
            if (x() >= 0.0f) {
                z2 = true;
            }
            if (bY >= 0) {
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        float f4 = this.eo - gameEngine.cw;
        float f5 = (this.ep - gameEngine.cx) - this.eq;
        float f6 = f3 + 4.0f;
        int i = 4;
        float f7 = 2.0f * f3;
        if (this.co) {
            f2 = 1.0f;
        } else {
            f2 = gameEngine.cX;
        }
        if (f2 < 1.0f) {
            gameEngine.bO.k();
            gameEngine.S();
            f4 *= gameEngine.cX;
            f5 *= gameEngine.cX;
            f6 *= gameEngine.cX;
        }
        float f8 = 3.0f;
        if (this.cG || gameEngine.settingsEngine.showHp) {
            if (x() >= 0.0f) {
                boolean z3 = false;
                boolean z4 = false;
                com.corrodinggames.rts.game.units.custom.b.n dn = dn();
                if (dn != null) {
                    z3 = dn.p;
                    z4 = dn.q;
                }
                if (!z4) {
                    if (gameEngine.playerTeam.c(this.bX)) {
                        b = com.corrodinggames.rts.gameFramework.f.b(200, 183, 44, 44);
                        b2 = com.corrodinggames.rts.gameFramework.f.b(120, 255, 60, 60);
                    } else {
                        b = com.corrodinggames.rts.gameFramework.f.b(200, 0, 150, 0);
                        b2 = com.corrodinggames.rts.gameFramework.f.b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                    }
                    Paint a2 = com.corrodinggames.rts.gameFramework.utility.y.a(b, Paint.Style.FILL);
                    Paint a3 = com.corrodinggames.rts.gameFramework.utility.y.a(b2, Paint.Style.STROKE);
                    int i2 = 4;
                    if (z3) {
                        i2 = 1;
                    }
                    dr.a(f4 - f3, f5 + f6, (f4 - f3) + (f7 * x()), f5 + f6 + i2);
                    gameEngine.bO.a(dr, a2);
                    dr.a(f4 - f3, f5 + f6, (f4 - f3) + f7, f5 + f6 + i2);
                    gameEngine.bO.a(dr, a3);
                    if (this.cC != 0.0f && bU() && gameEngine.settingsEngine.showHpChanges) {
                        float x = x();
                        float f9 = x + ((-this.cC) / this.cv);
                        if (f9 < 0.0f) {
                            f9 = 0.0f;
                        }
                        if (f9 >= 1.0f) {
                            f9 = 1.0f;
                        }
                        Paint a4 = com.corrodinggames.rts.gameFramework.utility.y.a(com.corrodinggames.rts.gameFramework.f.b(100, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 208, 26), Paint.Style.FILL);
                        dr.a((f4 - f3) + (f7 * x), f5 + f6, (f4 - f3) + (f7 * f9), f5 + f6 + i2);
                        gameEngine.bO.a(dr, a4);
                    }
                }
            }
            if (bY >= 0) {
                int bZ = bZ();
                float f10 = f7;
                if (bZ > 10) {
                    f10 += 20.0f;
                }
                float f11 = f4 - (f10 / 2.0f);
                float f12 = (int) ((f10 / bZ) + 0.5f);
                float f13 = f12 - 2.0f;
                for (int i3 = 1; i3 <= bZ; i3++) {
                    float f14 = f11 + ((i3 - 1) * f12);
                    dr.a(f14, f5 + f6 + 3.0f, f14 + f13, f5 + f6 + 3.0f + 3.0f);
                    if (bY >= i3) {
                        gameEngine.bO.a(dr, com.corrodinggames.rts.gameFramework.utility.y.a((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0, 0, 255, Paint.Style.FILL));
                    }
                    gameEngine.bO.a(dr, com.corrodinggames.rts.gameFramework.utility.y.a(110, 0, 0, 210, Paint.Style.STROKE));
                }
                f8 = 3.0f + 5.0f;
            }
        }
        if (bW() >= 0.0f) {
            int i4 = 2 + 1;
            boolean bX = bX();
            dr.a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + (f7 * bW()), f5 + f6 + i4 + 2 + f8);
            if (bX) {
                b3 = com.corrodinggames.rts.gameFramework.f.b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 103, 117, 119);
            } else {
                b3 = com.corrodinggames.rts.gameFramework.f.b(200, 23, 179, 207);
            }
            gameEngine.bO.a(dr, com.corrodinggames.rts.gameFramework.utility.y.a(b3, Paint.Style.FILL));
            dr.a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + f7, f5 + f6 + i4 + 2 + f8);
            if (bX) {
                b4 = com.corrodinggames.rts.gameFramework.f.b(105, 123, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6);
            } else {
                b4 = com.corrodinggames.rts.gameFramework.f.b(120, 45, 211, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_NETWORK);
            }
            gameEngine.bO.a(dr, com.corrodinggames.rts.gameFramework.utility.y.a(b4, Paint.Style.STROKE));
            f8 += 2;
            i = 4;
        }
        if (bV() >= 0.0f) {
            int i5 = i + 1;
            dr.a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + (f7 * bV()), f5 + f6 + i5 + i + f8);
            gameEngine.bO.a(dr, com.corrodinggames.rts.gameFramework.utility.y.a(200, 0, 0, 150, Paint.Style.FILL));
            dr.a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + f7, f5 + f6 + i5 + i + f8);
            gameEngine.bO.a(dr, com.corrodinggames.rts.gameFramework.utility.y.a(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, Paint.Style.STROKE));
            float f15 = f8 + i;
        }
        if (f2 < 1.0f) {
            gameEngine.bO.l();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void p(float f) {
        if (!this.bV && this.cN == null && this.cG) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.bX == gameEngine.playerTeam || gameEngine.bS.m(this)) {
                if (gameEngine.settingsEngine.showUnitWaypoints && gameEngine.dw <= 40) {
                    gameEngine.dw++;
                    O();
                }
                ca();
            }
            if (com.corrodinggames.rts.gameFramework.utility.y.a(this)) {
                cb();
            }
        }
    }

    public void ca() {
    }

    public void O() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        au auVar = null;
        au auVar2 = null;
        if (this instanceof y) {
            y yVar = (y) this;
            int av = yVar.av();
            float f = this.eo;
            float f2 = this.ep;
            for (int i = 0; i < av; i++) {
                au k = yVar.k(i);
                if (k != null) {
                    if (GameEngine.av()) {
                        ds.a(2.0f);
                    } else {
                        ds.a(0.0f);
                    }
                    if (k.d() == av.attack) {
                        ds.b(Color.a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 0));
                    } else if (k.d() == av.attackMove) {
                        ds.b(Color.a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    } else if (k.d() == av.build) {
                        ds.b(Color.a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (k.d() == av.repair) {
                        ds.b(Color.a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (k.d() == av.loadInto || k.d() == av.loadUp) {
                        ds.b(Color.a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (k.d() == av.reclaim) {
                        ds.b(Color.a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 42));
                    } else if (k.d() == av.guard || k.d() == av.guardAt) {
                        ds.b(Color.a(160, 97, 20, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL));
                    } else if (k.d() == av.patrol) {
                        ds.b(Color.a(160, 0, 210, 210));
                        if (auVar == null) {
                            auVar = k;
                        } else {
                            auVar2 = k;
                        }
                    } else {
                        ds.b(Color.a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    }
                    float g = k.g();
                    float h = k.h();
                    am i2 = k.i();
                    if (i2 != null && k.f() && !i2.bI() && !i2.d(gameEngine.playerTeam)) {
                        float d = com.corrodinggames.rts.gameFramework.f.d(f, f2, g, h);
                        g = f + (com.corrodinggames.rts.gameFramework.f.k(d) * 400.0f);
                        h = f2 + (com.corrodinggames.rts.gameFramework.f.j(d) * 400.0f);
                    }
                    gameEngine.bO.a(f - gameEngine.cw, f2 - gameEngine.cx, g - gameEngine.cw, h - gameEngine.cx, ds);
                    if (0 != 0) {
                        float b = com.corrodinggames.rts.gameFramework.f.b(f, f2, g, h);
                        float d2 = com.corrodinggames.rts.gameFramework.f.d(f, f2, g, h);
                        float f3 = gameEngine.bS.aT * b;
                        float k2 = f + (com.corrodinggames.rts.gameFramework.f.k(d2) * f3);
                        float j = f2 + (com.corrodinggames.rts.gameFramework.f.j(d2) * f3);
                        dr.a(k2 - 1.0f, j - 1.0f, k2 + 1.0f, j + 1.0f);
                        dr.a(-gameEngine.cw, -gameEngine.cx);
                        gameEngine.bO.a(dr, ds);
                    }
                    f = g;
                    f2 = h;
                }
            }
        }
        if (auVar != null && auVar2 != null && auVar != auVar2) {
            ds.b(Color.a(50, 0, 210, 210));
            au auVar3 = auVar;
            gameEngine.bO.a(auVar2.g() - gameEngine.cw, auVar2.h() - gameEngine.cx, auVar3.g() - gameEngine.cw, auVar3.h() - gameEngine.cx, ds);
        }
    }

    public void cb() {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        Paint paint;
        boolean z = false;
        if (this.cJ != 0.0f) {
            this.cJ = com.corrodinggames.rts.gameFramework.f.a(this.cJ, f);
            if (this.cJ % 15.0f < 7.0f) {
                z = true;
            }
        }
        if (this.cG || z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (dp()) {
                float f2 = this.eo - gameEngine.cw;
                float f3 = (this.ep - gameEngine.cx) - this.eq;
                PlayerData playerData = gameEngine.playerTeam;
                if (playerData == this.bX) {
                    if (this.ck < 8.0f) {
                        paint = cX;
                    } else {
                        paint = cY;
                    }
                } else if (playerData.c(this.bX)) {
                    paint = da;
                } else if (this.bX != null && gameEngine.replayEngine.j()) {
                    cW.b(PlayerData.i(this.bX.team));
                    paint = cW;
                } else {
                    paint = dc;
                }
                if (z) {
                    paint = db;
                }
                if (bI()) {
                    if (paint == cY) {
                        paint = cZ;
                    }
                    Rect ce = ce();
                    if (ce != null) {
                        dr.a(ce);
                        dr.b *= gameEngine.bL.o;
                        dr.d *= gameEngine.bL.o;
                        dr.a *= gameEngine.bL.n;
                        dr.c *= gameEngine.bL.n;
                        float db2 = db();
                        dr.a(-(cZ() - gameEngine.bL.p), -(da() - gameEngine.bL.q));
                        com.corrodinggames.rts.gameFramework.f.a(dr, db2);
                        dr.a(f2, f3);
                        gameEngine.bO.a(dr.a - 11.0f, dr.b, dr.c + 11.0f, dr.b, paint);
                        gameEngine.bO.a(dr.a - 11.0f, dr.d, dr.c + 11.0f, dr.d, paint);
                        gameEngine.bO.a(dr.a, dr.b - 11.0f, dr.a, dr.d + 11.0f, paint);
                        gameEngine.bO.a(dr.c, dr.b - 11.0f, dr.c, dr.d + 11.0f, paint);
                        return;
                    }
                    return;
                }
                float r = this.ck + gameEngine.bS.r(this);
                if (gameEngine.a(f2, f3, r)) {
                    gameEngine.bO.a(f2, f3, r, paint);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return true;
    }

    public Rect cc() {
        return dw;
    }

    public Rect cd() {
        return dw;
    }

    public Rect ce() {
        return cc();
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean f(float f) {
        Paint paint;
        com.corrodinggames.rts.gameFramework.unitAction.e v = v();
        if (v == null) {
            return false;
        }
        if (this.bV) {
            return true;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bO.l();
        float f2 = (int) (this.eo - gameEngine.cw);
        float f3 = (int) (this.ep - gameEngine.cx);
        float f4 = f2 * gameEngine.cX;
        float f5 = f3 * gameEngine.cX;
        if (this.cG) {
            paint = bJ;
        } else {
            paint = bI;
        }
        gameEngine.bO.a(v, f4, f5, paint);
        gameEngine.bO.k();
        gameEngine.R();
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        if (!gameEngine.cO.b(this.eo, this.ep) || this.cN != null) {
            return false;
        }
        if ((this.cP != null && (this.cP.I || this.cP.C)) || !d(gameEngine.playerTeam)) {
            return false;
        }
        return true;
    }

    public boolean c_() {
        return true;
    }

    public final boolean cf() {
        return d(GameEngine.getGameEngine().playerTeam);
    }

    public boolean d(PlayerData playerData) {
        com.corrodinggames.rts.game.maps.b bVar = GameEngine.getGameEngine().bL;
        if ((this.bX != playerData || this.cO != null) && bVar.E && playerData.N != null) {
            bVar.a(this.eo, this.ep);
            int i = bVar.T;
            int i2 = bVar.U;
            if (bVar.c(i, i2) && playerData.N[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean cg() {
        return true;
    }

    public void f_() {
        if (this.bV) {
            this.bT = false;
        } else {
            this.bT = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        com.corrodinggames.rts.gameFramework.emitter.e b;
        if (!this.bV) {
            if (this.cw > 0.0f) {
                if (this.cw > this.cv * 2.0f) {
                    this.cw = this.cv * 2.0f;
                }
                this.cw = com.corrodinggames.rts.gameFramework.f.a(this.cw, f);
            }
            if (this.cu < this.cv * 0.33f && this.eq > -1.0f) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                this.f0do += f;
                this.dp += f;
                this.dq += f;
                if (this.f0do > 10.0f && this.dp < 300.0f && !dl()) {
                    this.f0do = 0.0f;
                    if (this.el && gameEngine.dd && (b = gameEngine.bR.b(this.eo, this.ep, this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.verylow)) != null) {
                        Emitter.b(b, true);
                        b.I = this.eo;
                        b.J = this.ep;
                        b.K = this.eq;
                        b.P += com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f) + this.cc;
                        b.Q += com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f) + this.cd;
                        b.I += com.corrodinggames.rts.gameFramework.f.c(-4.0f, 4.0f);
                        b.J += com.corrodinggames.rts.gameFramework.f.c(-4.0f, 4.0f);
                    }
                }
                if (this.dq > 30.0f && this.dp < 600.0f && !dm()) {
                    this.dq = 0.0f;
                    gameEngine.bR.a();
                    com.corrodinggames.rts.gameFramework.emitter.e b2 = gameEngine.bR.b(this.eo, this.ep, this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.verylow);
                    if (b2 != null) {
                        Emitter.a(b2, true);
                        b2.I = this.eo;
                        b2.J = this.ep;
                        b2.K = this.eq;
                        b2.P += com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f);
                        b2.Q += com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f);
                        b2.I += com.corrodinggames.rts.gameFramework.f.c(-4.0f, 4.0f);
                        b2.J += com.corrodinggames.rts.gameFramework.f.c(-4.0f, 4.0f);
                    }
                }
            } else if (this.dp != 0.0f) {
                this.dp = 0.0f;
            }
            if (this.cC != 0.0f) {
                this.cC = com.corrodinggames.rts.gameFramework.f.a(this.cC, this.cv * this.cD * 0.005f * f);
                this.cD += f + (0.2f * this.cD * f);
                if (this.cC == 0.0f) {
                    this.cD = 0.0f;
                }
            }
            if (this.cu <= 0.0f) {
                ch();
            }
        }
    }

    public float b(am amVar, float f, Projectile projectile) {
        float f2 = f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        if (projectile != null) {
            f3 = projectile.ak;
            f4 = projectile.al;
            f5 = projectile.am;
        }
        if (this.cx < this.cA) {
            float f6 = f2 * f3;
            if (this.cA - this.cx > f6) {
                this.cx += f6;
                f2 -= f6 * f4;
            } else {
                this.cx = this.cA;
                f2 -= f6 * f4;
            }
        }
        if (f2 > 0.0f && this.cu < this.cv) {
            float f7 = f2 * f5;
            float f8 = this.cv - this.cu;
            if (f8 > f7) {
                o(this.cu + f7);
                return 0.0f;
            }
            o(this.cv);
            float f9 = f2 - f8;
            return 0.0f;
        }
        return 0.0f;
    }

    public boolean J() {
        return false;
    }

    public float a(am amVar, float f, Projectile projectile) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.cm < 1.0f) {
            f *= 1.75f;
        }
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (projectile != null) {
            f2 = projectile.ak;
            f3 = projectile.al;
            f4 = projectile.am;
        }
        float f5 = f;
        float f6 = 0.0f;
        if (this.cz == 0.0f && this.cx > 0.0f) {
            float f7 = f5 * f2;
            if (this.cx < f7) {
                f5 -= this.cx * f3;
                f6 = 0.0f + this.cx;
                this.cy += this.cx;
                this.cx = 0.0f;
            } else {
                this.cx -= f7;
                this.cy += f7;
                f6 = 0.0f + f7;
                f5 -= f5 * f3;
            }
        }
        if (f5 > 0.0f) {
            float f8 = f5 * f4;
            if (this.cu < f8) {
                f5 -= this.cu;
                float f9 = f6 + this.cu;
                o(0.0f);
                this.cC += this.cu;
            } else {
                o(this.cu - f8);
                float f10 = f6 + f8;
                f5 -= f8;
                this.cC -= f8;
            }
        }
        this.bs = gameEngine.by;
        if (amVar != null) {
            this.bt = amVar;
        } else {
            this.bt = null;
        }
        ch();
        return f5;
    }

    public am q(float f) {
        if (GameEngine.getGameEngine().by - (f * 1000.0f) < this.bs) {
            return this.bt;
        }
        return null;
    }

    public void ch() {
        if (!this.bV && this.cu <= 0.0f) {
            bv();
        }
    }

    public void n() {
    }

    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        return false;
    }

    public void bt() {
    }

    public void bu() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bS.l(this);
        PlayerData.a(this);
        if (bE.remove(this)) {
        }
        this.bV = true;
        this.bW = gameEngine.by;
        if (this.cu > 0.0f) {
            this.cu = 0.0f;
        }
        if (this.cL != null) {
            int bl = bl();
            for (int i = 0; i < bl; i++) {
                this.cL[i].j = null;
            }
        }
        gameEngine.cc.a(this);
    }

    public void ci() {
        bu();
        a();
        bt();
    }

    public void cj() {
        this.cu = -1.0f;
    }

    public void bv() {
        bu();
        if (!e()) {
            a();
        }
        bt();
    }

    public boolean a(RectF rectF) {
        if (this.eo + this.cj > rectF.a && this.eo - this.cj < rectF.c && this.ep + this.cj > rectF.b && this.ep - this.cj < rectF.d) {
            return true;
        }
        return false;
    }

    public final boolean c(float f, float f2, float f3) {
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f, f2);
        float f4 = this.cj + f3;
        if (a2 < f4 * f4) {
            return true;
        }
        return false;
    }

    public boolean t(am amVar) {
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar.eo, amVar.ep);
        float f = this.cj + amVar.cj;
        if (a2 < f * f) {
            return true;
        }
        return false;
    }

    public final void P(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            throw new com.corrodinggames.rts.game.maps.f("Could not find team with id: " + i);
        }
        e(playerData);
    }

    public void e(PlayerData playerData) {
        if (this.bX == playerData) {
            return;
        }
        if (playerData == null) {
            throw new RuntimeException("Could not set team to null");
        }
        if (this.bX != null) {
            PlayerData.b(this);
            this.bX.d(this);
        }
        b(playerData);
        PlayerData.c(this);
        if (playerData != PlayerData.i) {
            c(false);
        }
    }

    public void b(PlayerData playerData) {
        if (playerData == null) {
            throw new RuntimeException("Could not set team to null");
        }
        this.bX = playerData;
    }

    public final void Q(int i) {
        this.bX = PlayerData.getPlayerData(i);
        if (this.bX == null) {
            throw new com.corrodinggames.rts.game.maps.f("Could not find team with id: " + i);
        }
        b(this.bX);
    }

    public ArrayList N() {
        return dx;
    }

    public int V() {
        return 1;
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z, PointF pointF, am amVar) {
        a(sVar, z);
    }

    public void b(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar) {
    }

    public com.corrodinggames.rts.game.units.a.s a(com.corrodinggames.rts.game.units.a.c cVar) {
        ArrayList N = N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) N.get(i);
            if (sVar.d(cVar)) {
                return sVar;
            }
        }
        return null;
    }

    public boolean ck() {
        if (bI()) {
            return com.corrodinggames.rts.game.units.a.s.c(cm());
        }
        return false;
    }

    public boolean cl() {
        return false;
    }

    public com.corrodinggames.rts.game.units.a.c cm() {
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public float cn() {
        return -1.0f;
    }

    public boolean co() {
        return false;
    }

    public void a(ArrayList arrayList) {
        arrayList.clear();
    }

    public com.corrodinggames.rts.game.units.a.c cp() {
        return com.corrodinggames.rts.game.units.a.s.i;
    }

    public com.corrodinggames.rts.game.units.a.s e(as asVar) {
        return null;
    }

    public final int cq() {
        int i = 0;
        Iterator it = N().iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) it.next();
            if (sVar.b(this) || sVar.s()) {
                i++;
            }
        }
        return i;
    }

    public boolean c(am amVar, boolean z) {
        am amVar2 = amVar.cN;
        y yVar = amVar.cO;
        amVar.cN = null;
        amVar.cO = null;
        boolean d = d(amVar, z);
        amVar.cN = amVar2;
        amVar.cO = yVar;
        return d;
    }

    public boolean d(am amVar, boolean z) {
        return false;
    }

    public boolean e(am amVar, boolean z) {
        return false;
    }

    public boolean cr() {
        return false;
    }

    public float cs() {
        return 21.0f;
    }

    public boolean ct() {
        return i();
    }

    public boolean cu() {
        return false;
    }

    public boolean cv() {
        return false;
    }

    public boolean P() {
        return false;
    }

    public int cw() {
        return 1;
    }

    public int y() {
        return 85;
    }

    public float f(as asVar) {
        return asVar.a(this) + y();
    }

    public int u(am amVar) {
        return y() + amVar.mo1r().a(this);
    }

    public int v(am amVar) {
        return y() + amVar.mo1r().a(this);
    }

    public boolean w(am amVar) {
        return false;
    }

    public boolean x(am amVar) {
        return false;
    }

    public float b(am amVar) {
        return 1.0f;
    }

    public float c(am amVar) {
        return 0.2f;
    }

    public boolean y(am amVar) {
        boolean z = false;
        if (amVar.g() > 0.0f) {
            z = true;
        }
        return z;
    }

    public float z(am amVar) {
        float c = c(amVar) * 5.1f;
        if (amVar.g() > 0.0f) {
            c = amVar.g();
        }
        return c;
    }

    public float cx() {
        return 1.0f;
    }

    public float cy() {
        return 0.0f;
    }

    public com.corrodinggames.rts.game.units.custom.e.f cz() {
        float cy = cy();
        if (cy == 0.0f) {
            return com.corrodinggames.rts.game.units.custom.e.f.a;
        }
        com.corrodinggames.rts.game.units.custom.e.f fVar = new com.corrodinggames.rts.game.units.custom.e.f();
        fVar.b(com.corrodinggames.rts.game.units.custom.e.a.D, cy);
        return fVar;
    }

    public com.corrodinggames.rts.game.units.custom.e.f cA() {
        return com.corrodinggames.rts.game.units.custom.e.f.a;
    }

    public String cB() {
        return mo1r().i() + "(id:" + this.eh + ")";
    }

    public static String f(am amVar, boolean z) {
        if (amVar != null) {
            return amVar.mo1r().e();
        }
        return "No unit";
    }

    public static String A(am amVar) {
        if (amVar != null) {
            return amVar.c();
        }
        return "<null unit>";
    }

    public String c() {
        String str = mo1r().i() + "(pos:" + ((int) this.eo) + "," + ((int) this.ep) + " id:" + this.eh + VariableScope.nullOrMissingString;
        if (this.bX != null) {
            str = str + " t:" + this.bX.site;
        }
        if (this.bV) {
            str = str + " [dead]";
        }
        if (this.ej) {
            str = str + " [deleted]";
        }
        return str + ")";
    }

    public String cC() {
        String str = (mo1r().i() + "(pos:" + ((int) this.eo) + "," + ((int) this.ep) + " id:" + this.eh + VariableScope.nullOrMissingString) + ", hp:" + this.cu + ", dead:" + this.bV + ", deleted:" + this.ej + " tags:" + de();
        if (this.bX != null) {
            str = str + " t:" + this.bX.site;
        }
        return str + ")";
    }

    public float cD() {
        return 1.0f;
    }

    public RectF cE() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float cD = cD();
        dA.a((this.eo - (this.eu * cD)) - gameEngine.cw, (this.ep - (this.ev * cD)) - gameEngine.cx, (this.eo + (this.eu * cD)) - gameEngine.cw, (this.ep + (this.ev * cD)) - gameEngine.cx);
        return dA;
    }

    public RectF cF() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        RectF rectF = dA;
        float f = gameEngine.cw;
        float f2 = gameEngine.cx;
        float f3 = this.eu;
        float f4 = this.ev;
        rectF.a = (this.eo - f3) - f;
        rectF.c = (this.eo + f3) - f;
        rectF.b = (this.ep - f4) - f2;
        rectF.d = (this.ep + f4) - f2;
        return rectF;
    }

    public boolean cG() {
        return false;
    }

    public Rect a_(boolean z) {
        dC.a = 0;
        dC.b = 0;
        dC.c = 0 + this.es;
        dC.d = 0 + this.et;
        return dC;
    }

    public Rect a(boolean z, int i) {
        int i2 = 0 + (i * this.es);
        dC.a(i2, 0, i2 + this.es, 0 + this.et);
        return dC;
    }

    public Rect a(boolean z, int i, int i2) {
        int i3 = this.es;
        int i4 = this.et;
        int i5 = i * i3;
        int i6 = i2 * i4;
        dC.a = i5;
        dC.b = i6;
        dC.c = i5 + i3;
        dC.d = i6 + i4;
        return dC;
    }

    public boolean a(am amVar, float f) {
        return false;
    }

    public void a_(String str) {
    }

    public final boolean cH() {
        if (!cJ() || this.eq > 2.0f) {
            return false;
        }
        return true;
    }

    public boolean cI() {
        return com.corrodinggames.rts.gameFramework.utility.y.b(this.eo, this.ep);
    }

    public boolean cJ() {
        return com.corrodinggames.rts.gameFramework.utility.y.c(this.eo, this.ep);
    }

    public boolean cK() {
        return com.corrodinggames.rts.gameFramework.utility.y.d(this.eo, this.ep);
    }

    public int bw() {
        return (((0 * 31) + ((int) bN())) * 31) + ((int) this.cv);
    }

    public int cL() {
        return mo1r().b(V());
    }

    public com.corrodinggames.rts.game.units.custom.d.b cM() {
        return mo1r().d(V());
    }

    public com.corrodinggames.rts.game.units.custom.d.b cN() {
        return null;
    }

    public PointF a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (f3 > 0.1d && this.cK) {
            float f7 = 1.0f / f3;
            for (int i = 0; i < 3; i++) {
                PointF m = m(f6);
                f6 = com.corrodinggames.rts.gameFramework.f.b(f, f2, m.x, m.y) * f7;
            }
        }
        if (f6 > f4) {
            f6 = f4;
        }
        PointF m2 = m(f6);
        float a2 = com.corrodinggames.rts.gameFramework.f.a(f, f2, m2.x, m2.y);
        if (f5 >= 0.0f && f5 * f5 < a2) {
            float d = com.corrodinggames.rts.gameFramework.f.d(f, f2, m2.x, m2.y);
            m2.x = f + (com.corrodinggames.rts.gameFramework.f.k(d) * f5);
            m2.y = f2 + (com.corrodinggames.rts.gameFramework.f.j(d) * f5);
        }
        dD.setSite(m2);
        return dD;
    }

    PointF m(float f) {
        dE.setSite(this.eo + (this.cc * f), this.ep + (this.cd * f));
        return dE;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean cO() {
        return false;
    }

    public void f(PlayerData playerData) {
        if (p()) {
            b(PlayerData.i);
        } else {
            b(playerData);
        }
    }

    public void B(am amVar) {
        if (amVar instanceof h) {
            amVar = null;
        }
        this.bu = amVar;
    }

    public void cP() {
    }

    public float g() {
        return 0.0f;
    }

    public int cQ() {
        return Integer.MAX_VALUE;
    }

    public com.corrodinggames.rts.game.units.custom.h cR() {
        return null;
    }

    public boolean g(am amVar, boolean z) {
        return false;
    }

    public boolean h(am amVar, boolean z) {
        return g(amVar, z);
    }

    public int cS() {
        return 500;
    }

    public boolean c(y yVar) {
        int cQ = cQ();
        if (cQ < Integer.MAX_VALUE && d(yVar) >= cQ) {
            return true;
        }
        return false;
    }

    public int d(y yVar) {
        au ar;
        int i = 0;
        PlayerData playerData = yVar.bX;
        am[] a2 = bE.a();
        int size = bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a2[i2];
            if (amVar.bX == playerData && (amVar instanceof y) && (ar = ((y) amVar).ar()) != null && ar.d() == av.reclaim && ar.h == this && amVar != yVar) {
                i++;
            }
        }
        return i;
    }

    public int e(y yVar) {
        au ar;
        int i = 0;
        PlayerData playerData = yVar.bX;
        am[] a2 = bE.a();
        int size = bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a2[i2];
            if (amVar.bX == playerData && (amVar instanceof y) && (ar = ((y) amVar).ar()) != null && ar.d() == av.repair && ar.h == this && amVar != yVar) {
                i++;
            }
        }
        return i;
    }

    public int bl() {
        return 1;
    }

    public boolean u() {
        return false;
    }

    public boolean cT() {
        return u() || this.cm < 1.0f || this.bX == PlayerData.h;
    }

    public boolean cU() {
        return !u();
    }

    public boolean t() {
        return false;
    }

    public boolean cV() {
        return t();
    }

    public boolean cW() {
        return false;
    }

    public boolean d(am amVar) {
        return true;
    }

    public void g(PlayerData playerData) {
        if (this.dF == null || this.dF.length != PlayerData.c) {
            this.dF = new an[PlayerData.c];
            for (int i = 0; i < this.dF.length; i++) {
                this.dF[i] = new an();
            }
        }
        an anVar = this.dF[playerData.site];
        if (this.bV) {
            if (anVar.a && d(playerData)) {
                anVar.a = false;
            }
        } else if (d(playerData)) {
            anVar.a = true;
            anVar.b = V();
        }
    }

    public void cX() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.playerTeam != null && this.bX != gameEngine.playerTeam && gameEngine.playerTeam.site >= 0 && gameEngine.playerTeam.site < PlayerData.c) {
            an anVar = this.dF[gameEngine.playerTeam.site];
            if (anVar.c != null && anVar.c.c) {
                anVar.c = null;
            }
            if (anVar.c == null && anVar.a && !d(gameEngine.playerTeam)) {
                com.corrodinggames.rts.gameFramework.emitter.a aVar = new com.corrodinggames.rts.gameFramework.emitter.a();
                anVar.c = aVar;
                aVar.d = mo1r();
                aVar.g = this.eo;
                aVar.h = this.ep;
                aVar.n = false;
                aVar.e = this.bX;
                aVar.f = anVar.b;
                aVar.j = gameEngine.playerTeam;
                aVar.u = c_();
                aVar.v = this;
            }
        }
    }

    public PointF cY() {
        dG.setSite(0.0f, 0.0f);
        return dG;
    }

    public float cZ() {
        return GameEngine.getGameEngine().bL.p;
    }

    public float da() {
        return GameEngine.getGameEngine().bL.q;
    }

    public float db() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        return gameEngine.bL.p + 2 + gameEngine.bS.r(this);
    }

    public Point a(com.corrodinggames.rts.game.maps.b bVar, Point point) {
        point.a = (int) (((this.eo - cZ()) + 1.0f) * bVar.r);
        point.b = (int) (((this.ep - da()) + 1.0f) * bVar.s);
        return point;
    }

    public RectF a(com.corrodinggames.rts.game.maps.b bVar, RectF rectF) {
        bVar.a((int) (((this.eo - cZ()) + 1.0f) * bVar.r), (int) (((this.ep - da()) + 1.0f) * bVar.s));
        float f = bVar.T;
        float f2 = bVar.U;
        Rect cd = cd();
        rectF.a(f + (cd.a * bVar.n), f2 + (cd.b * bVar.o), f + ((cd.c + 1) * bVar.n), f2 + ((cd.d + 1) * bVar.o));
        return rectF;
    }

    public void dc() {
    }

    public boolean dd() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public com.corrodinggames.rts.game.units.custom.h de() {
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.e.f df() {
        return this.dH;
    }

    public double a(com.corrodinggames.rts.game.units.custom.e.a aVar) {
        return this.dH.a(aVar);
    }

    public com.corrodinggames.rts.game.units.custom.c.c dg() {
        return this.dI;
    }

    public com.corrodinggames.rts.game.units.custom.h dh() {
        return null;
    }

    public float bd() {
        return 0.0f;
    }

    public void di() {
    }

    public void dj() {
    }

    public boolean dk() {
        return false;
    }

    public boolean dl() {
        return bO();
    }

    public boolean dm() {
        return bO();
    }

    public final com.corrodinggames.rts.game.units.custom.b.n dn() {
        return this.cP;
    }

    public String toString() {
        return "unit(id=" + this.eh + ",type=" + mo1r().i() + ")";
    }

    public void r(float f) {
        if (f >= 1.0f) {
            if (!(this.cm >= 1.0f)) {
                PlayerData.b(this);
                this.cm = 1.0f;
                PlayerData.c(this);
                return;
            }
            return;
        }
        if (this.cm >= 1.0f) {
            PlayerData.b(this);
            this.cm = f;
            PlayerData.c(this);
            return;
        }
        this.cm = f;
    }

    public final void a(com.corrodinggames.rts.game.units.custom.af afVar) {
        a(afVar, (am) null, (com.corrodinggames.rts.game.units.custom.h) null, (VariableScope) null);
    }

    public final void a(com.corrodinggames.rts.game.units.custom.af afVar, am amVar) {
        a(afVar, amVar, (com.corrodinggames.rts.game.units.custom.h) null, (VariableScope) null);
    }

    public void a(com.corrodinggames.rts.game.units.custom.af afVar, am amVar, com.corrodinggames.rts.game.units.custom.h hVar, VariableScope variableScope) {
    }

    public void h(float f) {
        this.cg = f;
    }

    public int a(com.corrodinggames.rts.game.units.custom.g gVar) {
        return 0;
    }

    public com.corrodinggames.rts.gameFramework.utility.m e(boolean z) {
        return null;
    }

    public boolean a(int i, int i2) {
        return false;
    }

    public void c(boolean z) {
    }

    /* renamed from: do  reason: not valid java name */
    public float mo146do() {
        return this.cj;
    }

    public boolean dp() {
        return true;
    }

    public void bC() {
    }

    public final com.corrodinggames.rts.game.units.custom.d.b dq() {
        return this.dJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.game.units.am] */
    public final am dr() {
        y yVar = this.cO;
        if (yVar == null && this.cN != null) {
            yVar = this.cN;
        }
        return yVar;
    }

    public void f(float f, float f2) {
        this.eo = f;
        this.ep = f2;
        c(true);
    }
}
package com.corrodinggames.rts.game.a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.w;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.aq;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.d.t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.u;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a.class */
public final class a extends PlayerData {
    public static boolean as;
    final int at = 3000;
    int au;
    int av;
    int aw;
    int ax;
    int ay;
    int az;
    int aA;
    int aB;
    int aC;
    int aD;
    int aE;
    int aF;
    int aG;
    int aH;
    public int aI;
    int aJ;
    boolean aK;
    float aL;
    float aM;
    float aN;
    float aO;
    float aP;
    float aQ;
    float aR;
    float aS;
    float aT;
    float aU;
    int aV;
    float aW;
    public boolean aX;
    public boolean aY;
    public boolean aZ;
    int ba;
    int bb;
    int bc;
    boolean bd;
    boolean be;
    boolean bf;
    com.corrodinggames.rts.game.units.f bg;
    boolean bh;
    boolean bi;
    boolean bj;
    boolean bk;
    int bl;
    ConcurrentLinkedQueue bm;
    ArrayList bn;
    PointF bo;
    Paint bp;
    ArrayList bq;
    d br;
    d bs;
    d bt;
    d bu;
    d bv;
    d bw;
    d bx;
    d by;
    d bz;
    d bA;
    d bB;
    d bC;
    d bD;
    public c bE;
    int bF;
    public float bG;
    ArrayList bH;
    private static ArrayList bK = new ArrayList();
    public static final u bI = new u();
    public final com.corrodinggames.rts.gameFramework.utility.m bJ;

    public boolean ac() {
        return ag() == 3 || ag() > 300;
    }

    public boolean ad() {
        return ag() >= 2;
    }

    public boolean ae() {
        return (1 & this.aJ) == 1;
    }

    public boolean af() {
        return ae();
    }

    public int ag() {
        return this.bF;
    }

    public boolean ah() {
        if (GameEngine.getGameEngine().bU.A.i > 3000) {
            return true;
        }
        return false;
    }

    public boolean ai() {
        if (ah() || !this.bh || !this.bi || !this.bj || !this.bk) {
            return true;
        }
        return false;
    }

    public boolean aj() {
        if (this.bk && ai() && this.bi) {
            return true;
        }
        return false;
    }

    public boolean a(float f, float f2, o oVar, ao aoVar) {
        if (a(f, f2, oVar.S, oVar.T, aoVar)) {
            return true;
        }
        float f3 = -180.0f;
        while (true) {
            float f4 = f3;
            if (f4 < 180.0f) {
                if (!a(f, f2, oVar.S + (com.corrodinggames.rts.gameFramework.f.k(f4) * oVar.U * 0.4f), oVar.T + (com.corrodinggames.rts.gameFramework.f.j(f4) * oVar.U * 0.4f), aoVar)) {
                    f3 = f4 + 90.0f;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public boolean a(float f, float f2, float f3, float f4, ao aoVar) {
        if (aoVar == ao.AIR || aoVar == ao.NONE) {
            return true;
        }
        short b = y.b(f, f2, aoVar);
        short b2 = y.b(f3, f4, aoVar);
        if (b == -3 || b2 == -3) {
            String str = "null";
            if (aoVar != null) {
                str = aoVar.name();
            }
            d("pathPossible: no isolatedGroups found! (" + str + ")");
            GameEngine.T();
        }
        if (b != -1 && b2 != -1 && b != -2 && b2 != -2 && b == b2) {
            return true;
        }
        return false;
    }

    public boolean a(am amVar, float f, float f2) {
        return a(amVar.eo, amVar.ep, f, f2, amVar.h());
    }

    public boolean b(am amVar, float f, float f2) {
        ao h = amVar.h();
        return a(amVar.eo, amVar.ep, f, f2, h) || a(amVar.eo, amVar.ep, f + 60.0f, f2, h) || a(amVar.eo, amVar.ep, f - 60.0f, f2, h) || a(amVar.eo, amVar.ep, f, f2 + 60.0f, h) || a(amVar.eo, amVar.ep, f, f2 - 60.0f, h);
    }

    public boolean a(am amVar, am amVar2) {
        return b(amVar, amVar2.eo, amVar2.ep);
    }

    @Override // com.corrodinggames.rts.game.PlayerData, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        int i;
        gameOutputStream.writeBoolean(this.aK);
        gameOutputStream.writeFloat(this.aL);
        gameOutputStream.writeFloat(this.aM);
        gameOutputStream.writeFloat(this.aN);
        gameOutputStream.writeFloat(this.aO);
        gameOutputStream.writeFloat(this.aT);
        gameOutputStream.writeInt(this.aV);
        gameOutputStream.writeFloat(this.aW);
        gameOutputStream.writeBoolean(this.aX);
        gameOutputStream.writeInt(this.ba);
        gameOutputStream.writeInt(this.bm.size());
        Iterator it = this.bm.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i = 1;
            } else if (oVar instanceof g) {
                i = 2;
            } else if (oVar instanceof n) {
                i = 3;
            } else if (oVar instanceof m) {
                i = 4;
            } else if (oVar instanceof l) {
                i = 5;
            } else {
                throw new RuntimeException("zone not instance not supported:" + oVar.getClass().getName());
            }
            gameOutputStream.writeByte(i);
            gameOutputStream.writeInt(oVar.Q);
        }
        Iterator it2 = this.bm.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            gameOutputStream.writeInt(oVar2.Q);
            oVar2.a(gameOutputStream);
        }
        gameOutputStream.writeByte(9);
        gameOutputStream.writeInt(this.aI);
        gameOutputStream.writeBoolean(this.bd);
        gameOutputStream.writeBoolean(this.bh);
        gameOutputStream.writeBoolean(this.bi);
        gameOutputStream.writeBoolean(this.bj);
        gameOutputStream.writeBoolean(this.bk);
        gameOutputStream.writeFloat(this.aU);
        gameOutputStream.writeInt(this.bl);
        gameOutputStream.writeInt(this.au);
        gameOutputStream.writeInt(this.av);
        gameOutputStream.writeInt(this.aw);
        gameOutputStream.writeBoolean(this.aY);
        gameOutputStream.writeInt(this.aJ);
        gameOutputStream.e();
        gameOutputStream.writeInt(this.bJ.a);
        for (int i2 = 0; i2 < this.bJ.a; i2++) {
            com.corrodinggames.rts.game.a.a.a aVar = (com.corrodinggames.rts.game.a.a.a) this.bJ.get(i2);
            gameOutputStream.writeEnum(aVar.a());
            aVar.a(gameOutputStream);
        }
        gameOutputStream.e();
        super.a(gameOutputStream);
    }

    public o l(int i) {
        if (i == 1) {
            return new i(this, -1.0f, -1.0f);
        }
        if (i == 2) {
            return new g(this);
        }
        if (i == 3) {
            return new n(this);
        }
        if (i == 4) {
            return new m(this);
        }
        if (i == 5) {
            return new l(this);
        }
        if (i == 0) {
            GameEngine.print("Found zone type 0, loading PlainZone instead");
            return new m(this);
        }
        throw new RuntimeException("Unknown zone type:" + i);
    }

    @Override // com.corrodinggames.rts.game.PlayerData
    public void c(GameInputStream gameInputStream) {
        o m;
        this.aK = gameInputStream.readBoolean();
        this.aL = gameInputStream.readFloat();
        this.aM = gameInputStream.readFloat();
        this.aN = gameInputStream.readFloat();
        this.aO = gameInputStream.readFloat();
        this.aT = gameInputStream.readFloat();
        this.aV = gameInputStream.readInt();
        this.aW = gameInputStream.readFloat();
        this.aX = gameInputStream.readBoolean();
        this.ba = gameInputStream.readInt();
        int readInt = gameInputStream.readInt();
        this.bm.clear();
        boolean z = false;
        if (gameInputStream.b() >= 20) {
            z = true;
            for (int i = 0; i < readInt; i++) {
                l((int) gameInputStream.readByte()).Q = gameInputStream.readInt();
            }
        }
        for (int i2 = 0; i2 < readInt; i2++) {
            if (!z) {
                m = l((int) gameInputStream.readByte());
            } else {
                m = m(gameInputStream.readInt());
            }
            m.a(gameInputStream);
        }
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.aI = gameInputStream.readInt();
        }
        this.bn.clear();
        this.bn.addAll(this.bm);
        if (readByte >= 2) {
            this.bd = gameInputStream.readBoolean();
            this.bh = gameInputStream.readBoolean();
            this.bi = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.bj = gameInputStream.readBoolean();
            this.bk = gameInputStream.readBoolean();
        }
        if (readByte >= 4) {
            this.aU = gameInputStream.readFloat();
        }
        if (readByte >= 5) {
            this.bl = gameInputStream.readInt();
        }
        if (readByte >= 6) {
            this.au = gameInputStream.readInt();
            this.av = gameInputStream.readInt();
            this.aw = gameInputStream.readInt();
        }
        if (readByte >= 7) {
            this.aY = gameInputStream.readBoolean();
        }
        if (readByte >= 8) {
            this.aJ = gameInputStream.readInt();
        }
        if (readByte >= 9) {
            gameInputStream.checkMark("ai-c s");
            this.bJ.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                com.corrodinggames.rts.game.a.a.a a = ((com.corrodinggames.rts.game.a.a.b) gameInputStream.b(com.corrodinggames.rts.game.a.a.b.class)).a();
                a.a(gameInputStream);
                a(a);
            }
            gameInputStream.checkMark("ai-c e");
        }
        super.c(gameInputStream);
        ak();
    }

    public o m(int i) {
        Iterator it = this.bm.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar.Q == i) {
                return oVar;
            }
        }
        return null;
    }

    public int a(o oVar) {
        if (oVar == null) {
            return -1;
        }
        return oVar.Q;
    }

    void ak() {
        this.az = 0;
        this.aC = 0;
        this.aD = 0;
        this.aE = 0;
        this.aA = 0;
        this.aB = 0;
        this.aF = 0;
        this.aG = 0;
        this.ax = 0;
        this.ay = 0;
        this.aH = 0;
        Iterator it = this.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar = (i) oVar;
                this.ax++;
                if (iVar.u() >= 2) {
                    this.ay++;
                }
                if (iVar.n) {
                    this.aH++;
                }
            }
            if (oVar instanceof g) {
                g gVar = (g) oVar;
                if (!gVar.a) {
                    if (gVar.h) {
                        this.az++;
                        if (!gVar.v && !gVar.d()) {
                            if (!gVar.B) {
                                this.aA++;
                            } else {
                                this.aB++;
                            }
                        }
                    } else {
                        this.aC++;
                        if (gVar.d()) {
                            this.aD++;
                        }
                        this.aE += gVar.l();
                    }
                }
            }
            if (oVar instanceof n) {
                this.aF++;
                if (((h) oVar).l() > 0) {
                    this.aG++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(as asVar) {
        am b = am.b(asVar);
        if (!b.bI() && (b instanceof com.corrodinggames.rts.game.units.y) && !g(b) && !b.aj() && ((com.corrodinggames.rts.game.units.y) b).l()) {
            if (asVar instanceof com.corrodinggames.rts.game.units.custom.l) {
                com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) asVar;
                if (lVar.fw || !lVar.fs) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public a(int i) {
        this(i, true);
    }

    public a(int i, boolean z) {
        super(i, z);
        this.at = 3000;
        this.aJ = 0;
        this.aR = 0.0f;
        this.aS = 0.0f;
        this.bd = true;
        this.be = true;
        this.bf = false;
        this.bm = new ConcurrentLinkedQueue();
        this.bn = new ArrayList();
        this.bo = new PointF();
        this.bq = new ArrayList();
        this.br = new d("attackingUnitsLand") { // from class: com.corrodinggames.rts.game.a.a.1
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                return a.this.a(asVar) && a(asVar, ao.LAND);
            }
        };
        this.bs = new d("attackingUnitsHover") { // from class: com.corrodinggames.rts.game.a.a.6
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                return a.this.a(asVar) && a(asVar, ao.HOVER);
            }
        };
        this.bt = new d("attackingUnitsAir") { // from class: com.corrodinggames.rts.game.a.a.7
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                return a.this.a(asVar) && a(asVar, ao.AIR);
            }
        };
        this.bu = new d("attackingUnitsWater") { // from class: com.corrodinggames.rts.game.a.a.8
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                return a.this.a(asVar) && a(asVar, ao.WATER);
            }
        };
        this.bv = new d("buildingUnits") { // from class: com.corrodinggames.rts.game.a.a.9
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                if (am.b(asVar).bI()) {
                    if ((asVar instanceof com.corrodinggames.rts.game.units.custom.l) && ((com.corrodinggames.rts.game.units.custom.l) asVar).fw) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        };
        this.bw = new d("transportUnits") { // from class: com.corrodinggames.rts.game.a.a.10
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                if (a.this.g(am.b(asVar))) {
                    if ((asVar instanceof com.corrodinggames.rts.game.units.custom.l) && ((com.corrodinggames.rts.game.units.custom.l) asVar).fw) {
                        return false;
                    }
                    if (asVar.o() == ao.AIR || asVar.o() == ao.HOVER || asVar.o() == ao.OVER_CLIFF_WATER) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.bx = new d("transportUnitsFlying") { // from class: com.corrodinggames.rts.game.a.a.11
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                if (a.this.bw.a(asVar) && asVar.o() == ao.AIR) {
                    return true;
                }
                return false;
            }
        };
        this.by = new d("transportUnitsNonFlying") { // from class: com.corrodinggames.rts.game.a.a.12
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                if (a.this.bw.a(asVar) && asVar.o() != ao.AIR) {
                    return true;
                }
                return false;
            }
        };
        this.bz = new d("builderUnits") { // from class: com.corrodinggames.rts.game.a.a.13
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                if (asVar.m()) {
                    if ((!(asVar instanceof com.corrodinggames.rts.game.units.custom.l) || !((com.corrodinggames.rts.game.units.custom.l) asVar).fw) && asVar.o() != ao.WATER) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.bA = new d("harvesterUnits") { // from class: com.corrodinggames.rts.game.a.a.2
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                am.b(asVar);
                if (asVar.n()) {
                    if ((!(asVar instanceof com.corrodinggames.rts.game.units.custom.l) || !((com.corrodinggames.rts.game.units.custom.l) asVar).fw) && asVar.o() != ao.WATER) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.bB = new d("extractorUnits") { // from class: com.corrodinggames.rts.game.a.a.3
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                if (am.b(asVar).bI() && asVar.p()) {
                    if ((asVar instanceof com.corrodinggames.rts.game.units.custom.l) && ((com.corrodinggames.rts.game.units.custom.l) asVar).fw) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        };
        this.bC = new d("buildingFactories") { // from class: com.corrodinggames.rts.game.a.a.4
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                as i2;
                am b = am.b(asVar);
                if (b.bI()) {
                    if ((asVar instanceof com.corrodinggames.rts.game.units.custom.l) && ((com.corrodinggames.rts.game.units.custom.l) asVar).fw) {
                        return false;
                    }
                    boolean z2 = false;
                    Iterator it = b.N().iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        if (sVar != null && (sVar instanceof w)) {
                            w wVar = (w) sVar;
                            if (!wVar.F() && (i2 = wVar.mo3i()) != null && !i2.j()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.bD = new d("buildingFactoriesForBuilders") { // from class: com.corrodinggames.rts.game.a.a.5
            @Override // com.corrodinggames.rts.game.a.d
            public boolean a(as asVar) {
                as i2;
                am b = am.b(asVar);
                if (b.bI()) {
                    if ((asVar instanceof com.corrodinggames.rts.game.units.custom.l) && ((com.corrodinggames.rts.game.units.custom.l) asVar).fw) {
                        return false;
                    }
                    boolean z2 = false;
                    Iterator it = b.N().iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        if (sVar != null && (sVar instanceof w)) {
                            w wVar = (w) sVar;
                            if (!wVar.F() && (i2 = wVar.mo3i()) != null && !i2.j() && i2.m()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.bE = new c();
        this.bG = 0.0f;
        this.bH = new ArrayList();
        this.bJ = new com.corrodinggames.rts.gameFramework.utility.m();
        av();
    }

    private void av() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.aL = 100 + (this.site * 9);
        this.aN = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15 + (this.site * 19);
        this.aP = 50 + (this.site * 2);
        this.aW = 4200 + (this.site * 5);
        this.aT = 3500 + (this.site * 5);
        this.aU = 7500 + (this.site * 5);
        this.bp = new Paint();
        this.bp.b(Color.a(0, 255, 0));
        this.bp.a(Paint.Style.STROKE);
        this.bp.a(true);
        gameEngine.b(this.bp, 14.0f);
        al();
    }

    public void al() {
        Iterator it = this.bq.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b();
        }
    }

    public void d(String str) {
        GameEngine.b("ai_debug(" + this.site + ")", str);
    }

    public PointF am() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bL.a(com.corrodinggames.rts.gameFramework.f.rand(0, gameEngine.bL.width), com.corrodinggames.rts.gameFramework.f.rand(0, gameEngine.bL.height));
        this.bo.setSite(gameEngine.bL.T, gameEngine.bL.U);
        return this.bo;
    }

    public PointF an() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bL.A.size() == 0) {
            return null;
        }
        Point point = (Point) gameEngine.bL.A.get(com.corrodinggames.rts.gameFramework.f.c(gameEngine.bL.A.size()));
        gameEngine.bL.a(point.a, point.b);
        this.bo.setSite(gameEngine.bL.T, gameEngine.bL.U);
        return this.bo;
    }

    public PointF a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f3 = -1.0f;
        PointF pointF = new PointF();
        for (int i = 0; i < gameEngine.bL.A.size(); i++) {
            Point point = (Point) gameEngine.bL.A.get(i);
            gameEngine.bL.a(point.a, point.b);
            this.bo.setSite(gameEngine.bL.T, gameEngine.bL.U);
            PointF pointF2 = this.bo;
            float a = com.corrodinggames.rts.gameFramework.f.a(pointF2.x, pointF2.y, f, f2);
            if (a < f3 || f3 == -1.0f) {
                f3 = a;
                pointF.setSite(pointF2);
            }
        }
        if (f3 == -1.0f) {
            return null;
        }
        return pointF;
    }

    i e(am amVar) {
        Iterator it = this.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar = (i) oVar;
                if (iVar.b(amVar)) {
                    return iVar;
                }
            }
        }
        return null;
    }

    i b(float f, float f2) {
        Iterator it = this.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar = (i) oVar;
                if (iVar.c(f, f2)) {
                    return iVar;
                }
            }
        }
        return null;
    }

    i f(am amVar) {
        return c(amVar.eo, amVar.ep);
    }

    i c(float f, float f2) {
        float f3 = -1.0f;
        i iVar = null;
        Iterator it = this.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar2 = (i) oVar;
                float d = iVar2.d(f, f2);
                if (iVar == null || d < f3) {
                    f3 = d;
                    iVar = iVar2;
                }
            }
        }
        return iVar;
    }

    i a(ao aoVar, float f, float f2, boolean z) {
        float f3 = -1.0f;
        i iVar = null;
        Iterator it = this.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar2 = (i) oVar;
                float d = iVar2.d(f, f2);
                if (a(f, f2, iVar2, aoVar) && (!z || !iVar2.t)) {
                    if (iVar == null || d < f3) {
                        f3 = d;
                        iVar = iVar2;
                    }
                }
            }
        }
        return iVar;
    }

    public static boolean a(am amVar, float f, float f2, float f3) {
        if (com.corrodinggames.rts.gameFramework.f.a(amVar.eo, amVar.ep, f, f2) < f3 * f3) {
            return true;
        }
        return false;
    }

    private boolean a(PointF pointF) {
        if (a(this, pointF.x, pointF.y, 290.0f) != null) {
            return false;
        }
        i c = c(pointF.x, pointF.y);
        if (c != null && c.d(pointF.x, pointF.y) < 490000.0f) {
            return false;
        }
        PointF a = a(pointF.x, pointF.y);
        if ((a != null && com.corrodinggames.rts.gameFramework.f.a(pointF.x, pointF.y, a.x, a.y) < 160000.0f) || y.d(pointF.x, pointF.y) || y.d(pointF.x + 60.0f, pointF.y) || y.d(pointF.x, pointF.y + 60.0f) || y.d(pointF.x - 60.0f, pointF.y) || y.d(pointF.x, pointF.y + 60.0f)) {
            return false;
        }
        return true;
    }

    private boolean b(PointF pointF) {
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar.bX != this && (amVar instanceof com.corrodinggames.rts.game.units.d.e)) {
                if (amVar.bX.c(this) && a(amVar, pointF.x, pointF.y, 300.0f)) {
                    return false;
                }
                if (amVar.bX.d(this) && a(amVar, pointF.x, pointF.y, 320.0f)) {
                    return false;
                }
            }
        }
        if (b(this, pointF.x, pointF.y, 360.0f) >= 4 || a((PlayerData) this, pointF.x, pointF.y, 360.0f, true) >= 2) {
            return false;
        }
        return true;
    }

    public int a(d dVar, b bVar) {
        int i = 0;
        Iterator it = dVar.c.iterator();
        while (it.hasNext()) {
            i += a(((e) it.next()).a, bVar);
        }
        return i;
    }

    public int a(as asVar, b bVar) {
        return a(asVar, true, bVar);
    }

    public int a(as asVar, boolean z, b bVar) {
        boolean j = asVar.j();
        Integer a = this.bE.a(j, asVar, z);
        if (a != null) {
            return a.intValue();
        }
        int i = 0;
        if (j) {
            z = false;
        }
        am[] a2 = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a2[i2];
            if (amVar.bX == this && (bVar == b.include || !amVar.bM)) {
                if (amVar.dz == asVar) {
                    i++;
                }
                if (z && (amVar instanceof com.corrodinggames.rts.game.units.d.l)) {
                    i += ((com.corrodinggames.rts.game.units.d.l) amVar).h(asVar);
                }
            }
        }
        this.bE.a(j, asVar, z, Integer.valueOf(i));
        return i;
    }

    public int ao() {
        int i = 0;
        Iterator it = this.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof g) {
                i += ((g) oVar).G.size();
            }
        }
        return i;
    }

    public boolean g(am amVar) {
        if (amVar instanceof com.corrodinggames.rts.game.units.y) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
            if (yVar.cr()) {
                as r = yVar.mo1r();
                if ((r instanceof com.corrodinggames.rts.game.units.custom.l) && !((com.corrodinggames.rts.game.units.custom.l) r).ft) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean h(am amVar) {
        if (amVar instanceof com.corrodinggames.rts.game.units.y) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
            if (!yVar.bI() && yVar.l() && !g(yVar) && !yVar.aj()) {
                as r = yVar.mo1r();
                if ((r instanceof com.corrodinggames.rts.game.units.custom.l) && !((com.corrodinggames.rts.game.units.custom.l) r).fs) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean b(am amVar, am amVar2) {
        if (this.U) {
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.aq() && aq.a(yVar, amVar2)) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (h(amVar) && (amVar instanceof com.corrodinggames.rts.game.units.y) && aq.a((com.corrodinggames.rts.game.units.y) amVar, amVar2)) {
            return true;
        } else {
            return false;
        }
    }

    public void i(float f) {
        String[] split;
        n nVar;
        String[] split2;
        if (!as || !GameEngine.getGameEngine().bl || this.aZ || this.aX) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this && gameEngine.cN.b((int) (amVar.eo - 200.0f), (int) (amVar.ep - 200.0f), (int) (amVar.eo + 200.0f), (int) (amVar.ep + 200.0f))) {
                if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                    com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                }
                String str = VariableScope.nullOrMissingString;
                float f2 = (amVar.ep - gameEngine.cx) - 60.0f;
                this.bp.b(Color.a(0, 255, 0));
                if (amVar instanceof com.corrodinggames.rts.game.units.d.e) {
                    f2 -= 80.0f;
                    str = ((((((str + "Base ( Team:" + this.site + " )") + "\nuseTransportsOnThisMap: " + ai()) + "\nuseHoverTransportsOnThisMap: " + aj()) + "\nattackingCount: " + this.ba) + "\ndefendingCount: " + this.bb) + "\nnumOfUnitsNeedingTransport: " + ao()) + "\ntransport: " + this.aG;
                    if (ae()) {
                        str = str + "\nTurtling: true";
                    }
                    this.bp.b(Color.a(255, 255, 255));
                }
                if (str.length() != 0) {
                    for (String str2 : str.split("\n")) {
                        float f3 = amVar.eo - gameEngine.cw;
                        float f4 = f2;
                        float m = (-this.bp.l()) + this.bp.m();
                        gameEngine.bO.k();
                        if (gameEngine.cX > 1.0f) {
                            gameEngine.S();
                            f3 *= gameEngine.cX;
                            f4 *= gameEngine.cX;
                            m /= gameEngine.cX;
                        }
                        gameEngine.bO.a(str2, f3, f4, this.bp);
                        gameEngine.bO.l();
                        f2 += m;
                    }
                }
            }
        }
        Iterator it = this.bm.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (gameEngine.cN.b((int) (oVar.S - oVar.U), (int) (oVar.T - oVar.U), (int) (oVar.S + oVar.U), (int) (oVar.T + oVar.U))) {
                this.bp.b(K());
                gameEngine.bO.a(oVar.S - gameEngine.cw, oVar.T - gameEngine.cx, oVar.U + 2.0f, this.bp);
                int a2 = Color.a(0, 255, 0);
                String str3 = VariableScope.nullOrMissingString + "\n" + oVar.getClass().getSimpleName() + " ( Team:" + this.site + " )";
                float f5 = oVar.T - gameEngine.cx;
                if (oVar instanceof i) {
                    f5 -= 50.0f;
                    i iVar = (i) oVar;
                    String str4 = (((str3 + "\nState: " + iVar.b.name() + "(id:" + iVar.Q + ")") + "\nunsafe: " + iVar.f() + " (" + iVar.s + ")") + "\nunsafeBaseTimer: " + iVar.v) + "\nallowedUnits: " + iVar.d;
                    if (iVar.z != null) {
                        str4 = str4 + "\nlastAttemptedBuilding: " + iVar.z.i();
                    }
                    if (iVar.A != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordPrice: " + iVar.A.a(false, true, 4, true);
                    }
                    if (iVar.B != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordBy: " + iVar.B.a(false, true, 4, true);
                    }
                    String str5 = ((((str4 + "\nlastAttemptedBuildingCount: " + iVar.C) + "\nlastAttemptedBuildingFailed: " + iVar.D) + "\nlastUnitAttempt: " + iVar.E + " (" + iVar.F + " - " + iVar.G + ")") + "\nbuildBuildingDelay: " + iVar.e) + "\ncredits: " + com.corrodinggames.rts.gameFramework.f.c(this.credits) + " (x" + com.corrodinggames.rts.gameFramework.f.g(E()) + ")";
                    if (iVar.b == j.Pre) {
                        str5 = str5 + "\nclaimedBaseTimer: " + iVar.l;
                    }
                    if (iVar.k > 100.0f) {
                        str5 = str5 + "\nabandonedTimer: " + iVar.k;
                    }
                    if (iVar.g > 0.0f) {
                        str5 = str5 + "\nrequestedBuildersDelay: " + iVar.g + " (" + iVar.h + ")";
                    }
                    str3 = (str5 + "\nBuilders: " + iVar.J) + "\nIdle Builders: " + iVar.K;
                }
                if (oVar instanceof g) {
                    g gVar = (g) oVar;
                    if (gVar.c) {
                        str3 = str3 + "\nVIP Mode";
                    }
                    String str6 = (((str3 + "\n" + (gVar.b() ? "Defensive Type" : "Attack Type")) + "\nUnits: " + gVar.F.size() + " / " + gVar.A) + "\nStagingForAttack: " + gVar.q) + "\nAttackDelay: " + gVar.l;
                    if (gVar.u != 0.0f) {
                        str6 = str6 + "\nStagingTimer: " + gVar.u;
                    }
                    String str7 = str6 + "\nStagingTargetFound: " + gVar.r;
                    if (gVar.o != 0.0f) {
                        str7 = str7 + "\nattackingFor: " + gVar.o;
                    }
                    str3 = str7 + "\ncommonMovement: " + gVar.i().name();
                    if (gVar.B) {
                        str3 = str3 + " (seaGroup)";
                    }
                    if (gVar.G.size() > 0) {
                        str3 = str3 + "\nunitsNeedingTransport:" + gVar.G.size();
                    }
                    if (gVar.b != null) {
                        str3 = str3 + "\nlast action:" + gVar.b;
                    }
                    if (!gVar.v && !gVar.q) {
                        str3 = str3 + "\nnext move:" + ((int) k(gVar.n)) + "s";
                    }
                }
                if (oVar instanceof n) {
                    str3 = ((str3 + "\nUnitsWanted: " + nVar.l) + "\nunits: " + nVar.F.size()) + "\nreadyToMoveOut: " + nVar.q;
                    if (((n) oVar).m != null) {
                        str3 = str3 + "\nCurrentlyHelping: " + nVar.m.Q;
                    }
                }
                if (oVar instanceof l) {
                    str3 = str3 + "\nneedsTransportGroup: " + ((l) oVar).a;
                }
                this.bp.b(K());
                for (String str8 : str3.split("\n")) {
                    if (!str8.trim().equals(VariableScope.nullOrMissingString)) {
                        float f6 = oVar.S - gameEngine.cw;
                        float f7 = f5;
                        float m2 = (-this.bp.l()) + this.bp.m();
                        gameEngine.bO.k();
                        if (gameEngine.cX > 1.0f) {
                            gameEngine.S();
                            f6 *= gameEngine.cX;
                            f7 *= gameEngine.cX;
                            m2 /= gameEngine.cX;
                        }
                        gameEngine.bO.a(str8, f6, f7, this.bp);
                        gameEngine.bO.l();
                        f5 += m2;
                        this.bp.b(a2);
                    }
                }
            }
        }
    }

    public am e(PlayerData playerData) {
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar.bX == playerData && ((amVar instanceof com.corrodinggames.rts.game.units.d.e) || amVar.bP)) {
                return amVar;
            }
        }
        Iterator it2 = am.bE.iterator();
        while (it2.hasNext()) {
            am amVar2 = (am) it2.next();
            if (amVar2.bX == playerData && amVar2.bO) {
                return amVar2;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.PlayerData
    public void a(float f) {
        am e;
        super.a(f);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.aX || this.aZ) {
            return;
        }
        if (gameEngine.netEngine.B && (!gameEngine.netEngine.isServer || gameEngine.replayEngine.j())) {
            return;
        }
        if (this.bG > 0.0f) {
            this.bG -= f;
            return;
        }
        this.bF = C();
        if (this.be && gameEngine.by > 3000) {
            this.be = false;
            am[] a = am.bE.a();
            int i = 0;
            int size = am.bE.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                am amVar = a[i];
                if (!(amVar instanceof com.corrodinggames.rts.game.units.f)) {
                    i++;
                } else {
                    d("firstRunDelayed: Found damagingBorder");
                    this.bg = (com.corrodinggames.rts.game.units.f) amVar;
                    break;
                }
            }
        }
        if (this.bd) {
            this.bd = false;
            this.bh = true;
            this.bi = true;
            this.bj = true;
            this.bk = true;
            am e2 = e(this);
            if (e2 == null) {
                d("firstRun: no command center found");
            }
            if (e2 != null) {
                for (int i2 = 0; i2 < PlayerData.c; i2++) {
                    PlayerData playerData = PlayerData.getPlayerData(i2);
                    if (playerData != null && playerData != this && (e = e(playerData)) != null) {
                        if (!a(e2.eo, e2.ep, e.eo, e.ep, ao.LAND)) {
                            this.bh = false;
                        }
                        if (!a(e2.eo, e2.ep, e.eo, e.ep, ao.HOVER)) {
                            this.bi = false;
                        }
                    }
                }
                Iterator it = gameEngine.bL.A.iterator();
                while (it.hasNext()) {
                    PointF a2 = gameEngine.bL.a((Point) it.next());
                    if (!a(e2.eo, e2.ep, a2.x, a2.y + gameEngine.bL.o, ao.LAND)) {
                        this.bj = false;
                    }
                    if (!a(e2.eo, e2.ep, a2.x, a2.y + gameEngine.bL.o, ao.HOVER)) {
                        this.bk = false;
                    }
                }
            }
        }
        this.aP += f;
        this.aQ += f;
        if (this.aP > 25.0f) {
            this.aP -= 25.0f;
            if (this.aP > 25.0f) {
                this.aP = 25.0f;
            }
            if (this.aP < -1.0f) {
                this.aP = -1.0f;
            }
            Iterator it2 = this.bm.iterator();
            while (it2.hasNext()) {
                o oVar = (o) it2.next();
                if (oVar instanceof i) {
                    ((i) oVar).a += this.aQ;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                i iVar = null;
                Iterator it3 = this.bm.iterator();
                while (it3.hasNext()) {
                    o oVar2 = (o) it3.next();
                    if (oVar2 instanceof i) {
                        i iVar2 = (i) oVar2;
                        if (iVar == null || iVar.a < iVar2.a) {
                            iVar = iVar2;
                        }
                    }
                }
                if (iVar == null || iVar.a < 50.0f) {
                    break;
                }
                i iVar3 = iVar;
                iVar3.b(iVar3.a);
                iVar3.d(iVar3.a);
                iVar3.a = 0.0f;
            }
            this.aQ = 0.0f;
        }
        this.aL += f;
        this.aM += f;
        if (this.aL > 80.0f) {
            n(this.aM);
            this.aL -= 80.0f;
            if (this.aL > 80.0f) {
                this.aL = 80.0f;
            }
            if (this.aL < -1.0f) {
                this.aL = -1.0f;
            }
            this.aM = 0.0f;
        }
        this.aN += f;
        this.aO += f;
        if (this.aN > 250.0f) {
            m(this.aO);
            this.aN -= 250.0f;
            if (this.aN > 250.0f) {
                this.aN = 250.0f;
            }
            if (this.aN < -1.0f) {
                this.aN = -1.0f;
            }
            this.aO = 0.0f;
        }
    }

    public float j(float f) {
        return (f / 60.0f) * 1000.0f;
    }

    public float k(float f) {
        return f / 60.0f;
    }

    public void a(com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.game.units.a.c cVar) {
        SyncPacket a = GameEngine.getGameEngine().cf.a(this);
        a.a(yVar);
        a.a(cVar);
    }

    public void l(float f) {
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar.bX == this && (amVar instanceof com.corrodinggames.rts.game.units.y) && i(amVar)) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar instanceof com.corrodinggames.rts.game.units.h.e) {
                    boolean z = false;
                    am ab = yVar.ab();
                    if (ab != null && yVar.h(ab)) {
                        z = !ab.cH();
                    }
                    boolean z2 = !yVar.Q();
                    if (z && z != z2) {
                        a(yVar, com.corrodinggames.rts.game.units.h.e.j.N());
                    }
                    if (!z && z != z2) {
                        a(yVar, com.corrodinggames.rts.game.units.h.e.k.N());
                    }
                }
                if (yVar instanceof com.corrodinggames.rts.game.units.b.c) {
                    boolean z3 = true;
                    am ab2 = yVar.ab();
                    if (ab2 != null && yVar.h(ab2)) {
                        z3 = !ab2.Q();
                    }
                    boolean z4 = !yVar.Q();
                    if (z3 && z3 != z4) {
                        a(yVar, com.corrodinggames.rts.game.units.b.c.y.N());
                    }
                    if (!z3 && z3 != z4) {
                        a(yVar, com.corrodinggames.rts.game.units.b.c.z.N());
                    }
                }
                if (yVar.be() == com.corrodinggames.rts.game.units.b.bomber && yVar.aq() && yVar.ab() != null) {
                    SyncPacket a = GameEngine.getGameEngine().cf.a(this);
                    a.a(yVar);
                    a.a(yVar.ab());
                }
            }
        }
    }

    public com.corrodinggames.rts.game.units.a c(com.corrodinggames.rts.game.units.y yVar) {
        if (yVar.aS()) {
            boolean z = true;
            if (yVar.aj()) {
                z = false;
            }
            if (g(yVar)) {
                z = false;
            }
            if (z) {
                if (this.aY) {
                    return com.corrodinggames.rts.game.units.a.aggressive;
                }
                return com.corrodinggames.rts.game.units.a.outOfRange;
            }
        }
        return com.corrodinggames.rts.game.units.a.onlyInRange;
    }

    public ArrayList ap() {
        bK.clear();
        return bK;
    }

    public void d(com.corrodinggames.rts.game.units.y yVar) {
        Iterator it = this.bJ.iterator();
        while (it.hasNext()) {
            ((com.corrodinggames.rts.game.a.a.a) it.next()).a(this, yVar);
        }
    }

    public void e(com.corrodinggames.rts.game.units.y yVar) {
        Iterator it = this.bJ.iterator();
        while (it.hasNext()) {
            ((com.corrodinggames.rts.game.a.a.a) it.next()).b(this, yVar);
        }
    }

    public void m(float f) {
        boolean z;
        am ar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.bE.b();
        Iterator it = this.bJ.iterator();
        while (it.hasNext()) {
            ((com.corrodinggames.rts.game.a.a.a) it.next()).b(j(f), this);
        }
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if (amVar.bX == this && !amVar.u()) {
                i++;
                if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                    com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                    if (!yVar.bD) {
                        yVar.bD = true;
                        d(yVar);
                    }
                    if (amVar.cN == null) {
                        i iVar = yVar.aC;
                        yVar.aC = f(yVar);
                        if (yVar.aC != null && iVar != yVar.aC) {
                            if (yVar.bI()) {
                                yVar.aD = a(amVar.eo, amVar.ep, yVar.aC.S, yVar.aC.T, ao.LAND);
                                if (!yVar.aD && yVar.mo1r().p()) {
                                    yVar.aD = a(amVar.eo, amVar.ep + 15.0f, yVar.aC.S, yVar.aC.T, ao.LAND);
                                }
                            } else {
                                yVar.aD = a(amVar.eo, amVar.ep, yVar.aC.S, yVar.aC.T, ao.LAND);
                            }
                        }
                    }
                }
            }
        }
        l(f);
        Iterator it2 = am.bE.iterator();
        while (it2.hasNext()) {
            am amVar2 = (am) it2.next();
            if (amVar2.bX == this && (amVar2 instanceof com.corrodinggames.rts.game.units.y)) {
                com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) amVar2;
                com.corrodinggames.rts.game.units.a c = c(yVar2);
                if (yVar2.P != c && i(yVar2)) {
                    SyncPacket a2 = gameEngine.cf.a(this);
                    a2.a(yVar2);
                    a2.a(c);
                }
                if (yVar2.aj() && yVar2.dd() && yVar2.aB == null && i(yVar2)) {
                    g.a(this, yVar2);
                }
            }
        }
        if (i == 0 && !this.U) {
            this.aZ = true;
        }
        this.aU = com.corrodinggames.rts.gameFramework.f.a(this.aU, f);
        this.aT = com.corrodinggames.rts.gameFramework.f.a(this.aT, f);
        if (ac()) {
            this.aT = com.corrodinggames.rts.gameFramework.f.a(this.aT, 4.0f * f);
        }
        if (this.aT == 0.0f) {
            int i3 = 0;
            Iterator it3 = this.bn.iterator();
            while (it3.hasNext()) {
                o oVar = (o) it3.next();
                if ((oVar instanceof i) && ((i) oVar).b == j.Pre) {
                    i3++;
                }
            }
            boolean z2 = false;
            if (i3 > 2) {
                z2 = true;
            }
            if (z2) {
                this.aT = 300.0f;
            } else {
                PointF an = an();
                if (an != null) {
                    an.y += gameEngine.bL.o;
                    if (b(an.x, an.y) == null && b(an)) {
                        this.aT = 2000.0f;
                        i iVar2 = new i(this, an.x, an.y);
                        iVar2.U = 360.0f;
                        iVar2.b = j.Pre;
                        iVar2.c = k.ResourceOutpost;
                        this.aw++;
                    }
                }
            }
        }
        if (this.aU == 0.0f) {
            this.aU = 100.0f;
            int i4 = 0;
            Iterator it4 = this.bn.iterator();
            while (it4.hasNext()) {
                o oVar2 = (o) it4.next();
                if ((oVar2 instanceof i) && ((i) oVar2).c == k.ForwardOutpost) {
                    i4++;
                }
            }
            if (i4 < 3 && (ar = ar()) != null) {
                PointF pointF = new PointF();
                pointF.x = ar.eo;
                pointF.y = ar.ep;
                if (pointF != null && b(pointF.x, pointF.y) == null && a(pointF)) {
                    this.aU = 5000.0f;
                    i iVar3 = new i(this, pointF.x, pointF.y);
                    iVar3.U = 310.0f;
                    iVar3.b = j.Pre;
                    iVar3.c = k.ForwardOutpost;
                    this.aw++;
                }
            }
        }
        this.bc = 0;
        this.ba = 0;
        this.bb = 0;
        am[] a3 = am.bE.a();
        int size2 = am.bE.size();
        for (int i5 = 0; i5 < size2; i5++) {
            am amVar3 = a3[i5];
            if (amVar3.bX == this && (amVar3 instanceof com.corrodinggames.rts.game.units.y)) {
                com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) amVar3;
                if (!amVar3.bI()) {
                    if (yVar3.aB != null && yVar3.aB.b()) {
                        this.bb++;
                    } else if (h(yVar3) && !yVar3.bM) {
                        if (yVar3.h() == ao.WATER) {
                            this.bc++;
                        } else {
                            this.ba++;
                        }
                    }
                }
            }
        }
        this.aR = com.corrodinggames.rts.gameFramework.f.a(this.aR, f);
        this.aS += f;
        if (this.aR == 0.0f) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            Iterator it5 = am.bE.iterator();
            while (it5.hasNext()) {
                am amVar4 = (am) it5.next();
                if (amVar4.bX == this && amVar4.bT()) {
                    if (((amVar4 instanceof com.corrodinggames.rts.game.units.d.m) || (amVar4 instanceof com.corrodinggames.rts.game.units.d.a) || (amVar4 instanceof t)) && (amVar4 instanceof com.corrodinggames.rts.game.units.d.a)) {
                        i7++;
                        if (((com.corrodinggames.rts.game.units.d.a) amVar4).V() > 1) {
                            i6++;
                        }
                    }
                    if (amVar4.mo1r().p()) {
                        i8++;
                        if (s.c(amVar4.cm())) {
                            i9++;
                        }
                    }
                }
            }
            if (a(4100.0d) || this.aS > 2400.0f || this.aH == 0) {
                Iterator it6 = am.bE.iterator();
                while (it6.hasNext()) {
                    am amVar5 = (am) it6.next();
                    if (amVar5.bX == this && (amVar5 instanceof com.corrodinggames.rts.game.units.y)) {
                        com.corrodinggames.rts.game.units.y yVar4 = (com.corrodinggames.rts.game.units.y) amVar5;
                        if (yVar4.cl()) {
                            ArrayList N = yVar4.N();
                            ArrayList ap = ap();
                            Iterator it7 = N.iterator();
                            while (it7.hasNext()) {
                                s sVar = (s) it7.next();
                                if (sVar.n(yVar4)) {
                                    ap.add(sVar);
                                }
                            }
                            if (ap.size() > 0) {
                                a(yVar4, (s) f.a(ap));
                            }
                        }
                    }
                }
                boolean z3 = false;
                if (a(30000.0d)) {
                    z3 = true;
                }
                Iterator it8 = am.bE.iterator();
                while (it8.hasNext()) {
                    am amVar6 = (am) it8.next();
                    if (amVar6.bX == this && (amVar6 instanceof com.corrodinggames.rts.game.units.y)) {
                        com.corrodinggames.rts.game.units.y yVar5 = (com.corrodinggames.rts.game.units.y) amVar6;
                        com.corrodinggames.rts.game.units.a.c cm = yVar5.cm();
                        if (s.c(cm)) {
                            float cn = yVar5.cn();
                            if (cn < 0.0f) {
                                cn = 6.0f;
                                z = false;
                            } else {
                                z = true;
                            }
                            if (cn == 0.0f) {
                                continue;
                            } else {
                                int c2 = com.corrodinggames.rts.gameFramework.f.c(100);
                                float f2 = 100.0f - cn;
                                if (z3) {
                                    f2 -= 4.0f;
                                }
                                if (!z) {
                                    if (amVar6.mo1r().p() && i9 > 0) {
                                        f2 = 50.0f;
                                    }
                                    if (i7 > 0 && i6 == 0) {
                                        f2 = 99.0f;
                                        if (amVar6 instanceof com.corrodinggames.rts.game.units.d.a) {
                                            f2 = 40.0f;
                                        }
                                    }
                                }
                                if (f2 < 10.0f) {
                                    f2 = 10.0f;
                                }
                                if (((float) c2) > f2) {
                                    if (yVar5.co()) {
                                    }
                                    if (com.corrodinggames.rts.gameFramework.f.c(100) > 50) {
                                        yVar5.a(this.bH);
                                        if (this.bH.size() != 0) {
                                            cm = (com.corrodinggames.rts.game.units.a.c) this.bH.get(new Random().nextInt(this.bH.size()));
                                        }
                                    }
                                    boolean z4 = false;
                                    s a4 = yVar5.a(cm);
                                    if (a4 != null) {
                                        if (a4.m(yVar5)) {
                                            z4 = true;
                                        }
                                        if (a4.e() == com.corrodinggames.rts.game.units.a.u.targetGround) {
                                            z4 = true;
                                        }
                                        if (!a4.b(yVar5)) {
                                            z4 = true;
                                        }
                                        if (!a4.a((am) yVar5, false)) {
                                            z4 = true;
                                        }
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        a(yVar5, cm);
                                        a(yVar5, a4.B(), true);
                                        this.aR = 900.0f;
                                        this.aS = 0.0f;
                                        if (!z3) {
                                            break;
                                        } else if (a(40000.0d)) {
                                            if (com.corrodinggames.rts.gameFramework.f.c(100) > 95) {
                                                break;
                                            }
                                        } else if (com.corrodinggames.rts.gameFramework.f.c(100) > 80) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        Iterator it9 = this.bm.iterator();
        while (it9.hasNext()) {
            o oVar3 = (o) it9.next();
            if (oVar3 instanceof h) {
                ((h) oVar3).b(f);
            }
        }
    }

    public boolean a(com.corrodinggames.rts.game.units.y yVar, s sVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (sVar.b(yVar) && sVar.a((am) yVar, false)) {
            SyncPacket a = gameEngine.cf.a(this);
            a.a(yVar);
            a.a(sVar.z());
            return true;
        }
        return false;
    }

    public boolean a(com.corrodinggames.rts.game.units.y yVar, s sVar, PointF pointF, am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (sVar.b(yVar) && sVar.a((am) yVar, false)) {
            SyncPacket a = gameEngine.cf.a(this);
            a.a(yVar);
            a.a(sVar.z(), pointF, amVar);
            return true;
        }
        return false;
    }

    public void aq() {
        Iterator it = this.bm.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                ((i) oVar).t();
            }
        }
        Iterator it2 = this.bm.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            Iterator it3 = this.bm.iterator();
            while (it3.hasNext()) {
                o oVar3 = (o) it3.next();
                if (oVar2 != oVar3 && oVar2.Q == oVar3.Q) {
                    GameEngine.a("Id overlap on:" + oVar2.Q);
                    GameEngine.a("zone x:" + oVar2.S);
                    GameEngine.a("zone y:" + oVar2.T);
                    GameEngine.a("zone radius:" + oVar2.U);
                    GameEngine.a("zone type:" + oVar2.getClass().getName());
                }
            }
        }
        int i = 0;
        Iterator it4 = this.bm.iterator();
        while (it4.hasNext()) {
            if (((o) it4.next()) instanceof i) {
                i++;
            }
        }
        int i2 = 0;
        Iterator it5 = this.bm.iterator();
        while (it5.hasNext()) {
            o oVar4 = (o) it5.next();
            if (oVar4 instanceof i) {
                Iterator it6 = this.bm.iterator();
                while (it6.hasNext()) {
                    o oVar5 = (o) it6.next();
                    if ((oVar5 instanceof i) && oVar4 != oVar5 && com.corrodinggames.rts.gameFramework.f.a(oVar4.S, oVar4.T, oVar5.S, oVar5.T) < 400.0f) {
                        i2++;
                    }
                }
            }
        }
        if (i2 > 0) {
            d("baseOverlapCount:" + i2);
        }
    }

    @Override // com.corrodinggames.rts.game.PlayerData
    public void a(com.corrodinggames.rts.game.units.y yVar) {
        if (yVar.bX == this) {
            this.bE.a(yVar);
        }
    }

    public void n(float f) {
        int i;
        au ar;
        i f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.bE.a();
        Iterator it = this.bJ.iterator();
        while (it.hasNext()) {
            ((com.corrodinggames.rts.game.a.a.a) it.next()).a(j(f), this);
        }
        Iterator it2 = this.bm.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            if (oVar instanceof h) {
                ((h) oVar).c(f);
            }
        }
        if (this.bg != null) {
            Iterator it3 = this.bm.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                o oVar2 = (o) it3.next();
                if (this.bg.a(oVar2.S, oVar2.T)) {
                    if (oVar2 instanceof i) {
                        oVar2.p();
                        break;
                    } else if (oVar2 instanceof g) {
                        PointF a = this.bg.a(oVar2.S, oVar2.T, oVar2.U + 20.0f);
                        oVar2.S = a.x;
                        oVar2.T = a.y;
                    }
                }
            }
        }
        this.aW = com.corrodinggames.rts.gameFramework.f.a(this.aW, f);
        int i2 = 0;
        Iterator it4 = this.bn.iterator();
        while (it4.hasNext()) {
            if (((o) it4.next()) instanceof i) {
                i2++;
            }
        }
        if (i2 < 1) {
            Iterator it5 = am.bE.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                am amVar = (am) it5.next();
                if (amVar.bX == this && (amVar instanceof com.corrodinggames.rts.game.units.d.e)) {
                    i iVar = new i(this, amVar.eo, amVar.ep);
                    iVar.U = 420.0f;
                    iVar.b = j.Active;
                    iVar.c = k.Main;
                    i2++;
                    break;
                }
            }
            if (i2 < 1) {
                Iterator it6 = am.bE.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    am amVar2 = (am) it6.next();
                    if (amVar2.bX == this && this.bz.b(amVar2.mo1r())) {
                        i iVar2 = new i(this, amVar2.eo, amVar2.ep);
                        iVar2.U = 420.0f;
                        iVar2.b = j.Active;
                        iVar2.c = k.Main;
                        i2++;
                        break;
                    }
                }
            }
            if (i2 < 1) {
                Iterator it7 = am.bE.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    am amVar3 = (am) it7.next();
                    if (amVar3.bX == this && (amVar3 instanceof com.corrodinggames.rts.game.units.y)) {
                        com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar3;
                        boolean z = false;
                        Iterator it8 = this.bz.c.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (yVar.b(((e) it8.next()).a, true)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            i iVar3 = new i(this, amVar3.eo, amVar3.ep);
                            iVar3.U = 420.0f;
                            iVar3.b = j.Active;
                            iVar3.c = k.Main;
                            i2++;
                            break;
                        }
                    }
                }
            }
            if (i2 < 1) {
                Iterator it9 = am.bE.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    am amVar4 = (am) it9.next();
                    if (amVar4.bX == this && (amVar4 instanceof com.corrodinggames.rts.game.units.y) && ((com.corrodinggames.rts.game.units.y) amVar4).ai()) {
                        i iVar4 = new i(this, amVar4.eo, amVar4.ep);
                        iVar4.U = 420.0f;
                        iVar4.b = j.Active;
                        iVar4.c = k.Main;
                        int i3 = i2 + 1;
                        break;
                    }
                }
            }
            if (!this.bf) {
                this.bf = true;
                if (a(this.bB, b.include) >= 1) {
                    for (int i4 = 0; i4 < gameEngine.bL.A.size(); i4++) {
                        Point point = (Point) gameEngine.bL.A.get(i4);
                        gameEngine.bL.a(point.a, point.b);
                        this.bo.setSite(gameEngine.bL.T, gameEngine.bL.U);
                        PointF pointF = this.bo;
                        pointF.y += gameEngine.bL.o;
                        if (b(pointF.x, pointF.y) == null && a(this.bB, pointF.x, pointF.y, 200) >= 1 && b(pointF)) {
                            i iVar5 = new i(this, pointF.x, pointF.y);
                            iVar5.U = 360.0f;
                            iVar5.b = j.Pre;
                            iVar5.c = k.ResourceOutpost;
                        }
                    }
                }
            }
        }
        am[] a2 = am.bE.a();
        int size = am.bE.size();
        for (int i5 = 0; i5 < size; i5++) {
            am amVar5 = a2[i5];
            if (amVar5.bX == this && amVar5.cN == null && (amVar5 instanceof com.corrodinggames.rts.game.units.y) && amVar5.aj() && i(amVar5)) {
                com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) amVar5;
                if (e((am) yVar2) != null) {
                    if (yVar2.aq()) {
                    }
                } else if (yVar2.aq() && (f2 = f(yVar2)) != null) {
                    PointF w = f2.w();
                    SyncPacket a3 = gameEngine.cf.a(this);
                    a3.a(yVar2);
                    a3.a(w.x, w.y);
                }
            }
        }
        int size2 = am.bE.size();
        for (int i6 = 0; i6 < size2; i6++) {
            am amVar6 = a2[i6];
            if (amVar6.bX == this && (amVar6 instanceof com.corrodinggames.rts.game.units.y)) {
                com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) amVar6;
                if (yVar3.V > 2400.0f && i(yVar3)) {
                    if (!yVar3.aN || yVar3.V >= 24000.0f) {
                        SyncPacket a4 = gameEngine.cf.a(this);
                        a4.a(yVar3);
                        a4.h();
                    }
                }
                if (yVar3.aj() && i(yVar3) && (ar = yVar3.ar()) != null && ar.d() == av.build && yVar3.V > 700.0f) {
                    SyncPacket a5 = gameEngine.cf.a(this);
                    a5.a(yVar3);
                    a5.h();
                }
            }
        }
        if (!this.U) {
            ak();
            int i7 = 1;
            boolean z2 = true;
            if (af()) {
                i7 = 1 + 1;
                z2 = false;
            }
            if (this.ay > 6) {
                i7 = 2;
            }
            if (this.ay > 11) {
                i7 = 3;
            }
            if (this.aC < i7) {
                g gVar = new g(this, false);
                gVar.A = 8;
                if (ac()) {
                    gVar.A = 10;
                }
                gVar.k();
                this.av++;
            }
            if ((this.aD >= i7 || this.aE > 6) && this.aA < 1 && z2) {
                g gVar2 = new g(this, true);
                if (this.au < 2) {
                    gVar2.A = 3;
                } else if (this.au < 5) {
                    gVar2.A = 5;
                } else {
                    gVar2.A = 7;
                    if (ac()) {
                        if (this.au < 25) {
                            gVar2.A = 14;
                        } else {
                            gVar2.A = 18;
                        }
                    }
                }
                gVar2.k();
                this.au++;
            }
            if (ah() && this.aB < 1 && z2) {
                g gVar3 = new g(this, true);
                gVar3.B = true;
                gVar3.A = 5;
                if (ac()) {
                    gVar3.A = 10;
                }
                gVar3.k();
            }
            if (ai() && this.aF < 3) {
                n nVar = new n(this);
                nVar.l = 1;
                nVar.f();
            }
        }
        if (this.U) {
            if (this.aW > 30.0f) {
                this.aW = 30.0f;
            }
            if (this.aW == 0.0f) {
                this.aV++;
                if (this.aV == 1) {
                    this.aW = 1000.0f;
                } else if (this.aV == 2) {
                    this.aW = 3000.0f;
                    am as2 = as();
                    if (as2 != null) {
                        if (this.U) {
                            i = 0;
                        } else {
                            i = 2;
                            if (this.ba < 4) {
                                i = 5;
                            }
                        }
                        SyncPacket a6 = gameEngine.cf.a(this);
                        int size3 = am.bE.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            am amVar7 = a2[i8];
                            if (amVar7.bX == this && (amVar7 instanceof com.corrodinggames.rts.game.units.y)) {
                                com.corrodinggames.rts.game.units.y yVar4 = (com.corrodinggames.rts.game.units.y) amVar7;
                                if (!yVar4.bM && b(yVar4, as2)) {
                                    if (i <= 0) {
                                        a6.a(yVar4);
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        }
                        a6.b(as2.eo, as2.ep);
                    }
                } else {
                    this.aV = 0;
                }
            }
        }
    }

    public boolean i(am amVar) {
        if (amVar.u() || amVar.t() || amVar.cW() || amVar.bN) {
            return false;
        }
        return true;
    }

    public am ar() {
        am amVar = null;
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar2 = a[i2];
            if (!amVar2.bV && amVar2.cN == null && this == amVar2.bX && h(amVar2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = am.bE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            am amVar3 = (am) it.next();
            if (!amVar3.bV && amVar3.cN == null && this == amVar3.bX && h(amVar3)) {
                if (i3 == random) {
                    amVar = amVar3;
                    break;
                }
                i3++;
            }
        }
        return amVar;
    }

    public am as() {
        am amVar = null;
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar2 = a[i2];
            if (!amVar2.bV && amVar2.cN == null && !amVar2.u() && c(amVar2.bX) && j(amVar2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = am.bE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            am amVar3 = (am) it.next();
            if (!amVar3.bV && amVar3.cN == null && !amVar3.u() && c(amVar3.bX) && j(amVar3)) {
                if (i3 == random) {
                    amVar = amVar3;
                    break;
                }
                i3++;
            }
        }
        return amVar;
    }

    public PointF at() {
        am amVar = null;
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar2 = a[i2];
            if (!amVar2.bV && amVar2.cN == null && !amVar2.u() && c(amVar2.bX) && j(amVar2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = am.bE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            am amVar3 = (am) it.next();
            if (!amVar3.bV && amVar3.cN == null && !amVar3.u() && c(amVar3.bX) && j(amVar3)) {
                if (i3 == random) {
                    amVar = amVar3;
                    break;
                }
                i3++;
            }
        }
        if (amVar != null) {
            return new PointF(amVar.eo, amVar.ep);
        }
        return null;
    }

    public static am a(PlayerData playerData, float f, float f2, float f3) {
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.eo + f3 > f && amVar.eo - f3 < f && amVar.ep + f3 > f2 && amVar.ep - f3 < f2 && amVar.bX != playerData && a(amVar, f, f2, f3) && amVar.bX.c(playerData)) {
                return amVar;
            }
        }
        return null;
    }

    public static int a(PlayerData playerData, float f, float f2, float f3, boolean z) {
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if (amVar.eo + f3 > f && amVar.eo - f3 < f && amVar.ep + f3 > f2 && amVar.ep - f3 < f2 && amVar.bX != playerData && a(amVar, f, f2, f3) && amVar.bX.d(playerData) && (!z || amVar.bI())) {
                i++;
            }
        }
        return i;
    }

    public static int b(PlayerData playerData, float f, float f2, float f3) {
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if (amVar.eo + f3 > f && amVar.eo - f3 < f && amVar.ep + f3 > f2 && amVar.ep - f3 < f2 && amVar.bX != playerData && a(amVar, f, f2, f3) && amVar.bX.c(playerData)) {
                i++;
            }
        }
        return i;
    }

    public int a(d dVar, float f, float f2, int i) {
        int i2 = 0;
        Iterator it = dVar.c.iterator();
        while (it.hasNext()) {
            i2 += a(((e) it.next()).a, f, f2, i);
        }
        return i2;
    }

    public int a(as asVar, float f, float f2, int i) {
        int i2 = 0;
        GameEngine gameEngine = GameEngine.getGameEngine();
        bI.clear();
        gameEngine.cc.a(this, f, f2, i, bI);
        am[] a = bI.a();
        int size = bI.size();
        for (int i3 = 0; i3 < size; i3++) {
            am amVar = a[i3];
            if (amVar.bX == this && amVar.dz == asVar && a(amVar, f, f2, i)) {
                i2++;
            }
        }
        return i2;
    }

    public int au() {
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            i++;
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.PlayerData
    public void T() {
        if (this.aZ && au() != 0) {
            GameEngine.m5e("waking up AI");
            this.aZ = false;
        }
    }

    @Override // com.corrodinggames.rts.game.PlayerData
    public void d(am amVar) {
        if (!(amVar instanceof com.corrodinggames.rts.game.units.y)) {
            return;
        }
        com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
        yVar.bD = false;
        if (yVar.aC != null) {
            yVar.aC.a(yVar);
            yVar.aC = null;
        }
        if (yVar.aB != null) {
            yVar.aB.b(yVar);
            yVar.aB = null;
        }
        e(yVar);
    }

    public void a(com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.game.units.custom.d.b bVar, boolean z) {
        if (yVar.aC != null) {
            yVar.aC.a(yVar, bVar, z);
        }
    }

    public boolean j(am amVar) {
        if (!amVar.cg() && c(amVar.bX)) {
            return false;
        }
        return true;
    }

    public boolean a(com.corrodinggames.rts.game.units.custom.d.b bVar, am amVar) {
        return a(bVar, amVar, false);
    }

    public boolean a(com.corrodinggames.rts.game.units.custom.d.b bVar, am amVar, boolean z) {
        return bVar.b(amVar);
    }

    public void a(com.corrodinggames.rts.game.a.a.a aVar) {
        if (!this.bJ.contains(aVar)) {
            this.bJ.add(aVar);
        } else {
            c("Skipping add of component: " + aVar.a().name());
        }
    }
}
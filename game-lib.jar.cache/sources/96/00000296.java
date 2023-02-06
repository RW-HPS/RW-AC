package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/j.class */
public class j extends com.corrodinggames.rts.game.units.w implements com.corrodinggames.rts.game.units.ak, com.corrodinggames.rts.game.units.d, com.corrodinggames.rts.game.units.d.l {
    public int a;
    public final e b;
    float c;
    float d;
    float e;
    public float f;
    boolean g;
    public boolean h;
    public boolean i;
    float j;
    boolean k;
    boolean l;
    float m;
    boolean n;
    float o;
    public boolean p;
    float q;
    boolean r;
    float s;
    float t;
    public float u;
    public boolean v;
    float w;
    public l x;
    public as y;
    public l z;
    public at[] A;
    public final com.corrodinggames.rts.gameFramework.utility.m B;
    public com.corrodinggames.rts.gameFramework.utility.m C;
    public float D;
    PointF[] E;
    PointF[] F;
    Projectile[] G;
    Paint J;
    final com.corrodinggames.rts.game.units.d.k dL;
    public static PointF dM;
    public static com.corrodinggames.rts.game.units.am dN;
    public static int dO;
    public float dP;
    public float dQ;
    public float dR;
    public float dS;
    public com.corrodinggames.rts.game.units.custom.b.i[] dT;
    static boolean dY;
    static final HashMap dZ;
    static int ea;
    static String eb;
    static final PointF ec;
    h ed;
    protected static final com.corrodinggames.rts.gameFramework.utility.ai ee;
    protected static final PointF ef;
    com.corrodinggames.rts.gameFramework.utility.m eg;
    static final PointF H = new PointF();
    static final PointF I = new PointF();
    protected static final PointF K = new PointF();
    protected static final com.corrodinggames.rts.gameFramework.utility.ai dK = new com.corrodinggames.rts.gameFramework.utility.ai();
    static ArrayList dU = new ArrayList();
    public static com.corrodinggames.rts.gameFramework.utility.m dV = new com.corrodinggames.rts.gameFramework.utility.m();
    public static com.corrodinggames.rts.gameFramework.utility.m dW = new com.corrodinggames.rts.gameFramework.utility.m();
    public static com.corrodinggames.rts.gameFramework.utility.m dX = new com.corrodinggames.rts.gameFramework.utility.m();

    public void K() {
        this.E = new PointF[6];
        this.F = new PointF[this.E.length];
        for (int i = 0; i < this.E.length; i++) {
            this.E[i] = new PointF();
            this.F[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] b() {
        if (this.E == null) {
            K();
        }
        return this.E;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] e_() {
        if (this.E == null) {
            K();
        }
        return this.F;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(11);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.m);
        gameOutputStream.writeBoolean(this.n);
        gameOutputStream.writeInt(this.B.size());
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((com.corrodinggames.rts.game.units.am) it.next());
        }
        gameOutputStream.writeBoolean(this.r);
        gameOutputStream.writeFloat(this.o);
        gameOutputStream.writeFloat(this.f);
        gameOutputStream.writeFloat(this.s);
        gameOutputStream.writeBoolean(this.v);
        byte b = 0;
        if (this.dT != null) {
            b = (byte) this.dT.length;
        }
        gameOutputStream.writeByte(b);
        if (this.dT != null) {
            for (int i = 0; i < b; i++) {
                com.corrodinggames.rts.game.units.custom.b.i iVar = this.dT[i];
                gameOutputStream.writeFloat(iVar.b);
                gameOutputStream.writeFloat(iVar.c);
                gameOutputStream.writeFloat(iVar.d);
                gameOutputStream.writeFloat(iVar.i);
                gameOutputStream.writeBoolean(iVar.k);
                gameOutputStream.writeBoolean(iVar.j);
                gameOutputStream.writeBoolean(iVar.m);
                gameOutputStream.writeBoolean(iVar.n);
            }
        }
        this.dL.a(gameOutputStream);
        gameOutputStream.a(this.z);
        gameOutputStream.writeBoolean(this.i);
        gameOutputStream.writeBoolean(this.h);
        boolean z = this.ed != this.x.O;
        gameOutputStream.writeBoolean(z);
        if (z) {
            g.a(this.ed, gameOutputStream);
        }
        as.a(this.y, this, gameOutputStream);
        gameOutputStream.writeFloat(this.q);
        super.a(gameOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        com.corrodinggames.rts.game.units.as q;
        byte readByte;
        com.corrodinggames.rts.game.units.custom.b.i iVar;
        if (gameInputStream.b() >= 32) {
            int readInt = gameInputStream.readInt();
            this.e = gameInputStream.readFloat();
            this.m = gameInputStream.readFloat();
            this.n = gameInputStream.readBoolean();
            this.B.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i = 0; i < readInt2; i++) {
                com.corrodinggames.rts.game.units.am o = gameInputStream.o();
                if (o != null) {
                    this.B.add(o);
                }
            }
            if (readInt >= 1) {
                this.r = gameInputStream.readBoolean();
            }
            if (readInt >= 2) {
                this.o = gameInputStream.readFloat();
            }
            if (readInt >= 3) {
                this.f = gameInputStream.readFloat();
                this.s = gameInputStream.readFloat();
            }
            if (readInt >= 4) {
                this.v = gameInputStream.readBoolean();
            }
            if (readInt >= 5 && (readByte = gameInputStream.readByte()) != 0) {
                du();
                if (this.dT == null) {
                    GameEngine.m5e("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < readByte; i2++) {
                    if (this.dT == null) {
                        iVar = new com.corrodinggames.rts.game.units.custom.b.i();
                    } else if (i2 >= this.dT.length) {
                        GameEngine.m5e("readIn: legs " + ((int) i2) + ">=" + this.dT.length);
                        iVar = new com.corrodinggames.rts.game.units.custom.b.i();
                    } else {
                        iVar = this.dT[i2];
                    }
                    com.corrodinggames.rts.game.units.custom.b.i iVar2 = iVar;
                    iVar2.b = gameInputStream.readFloat();
                    iVar2.c = gameInputStream.readFloat();
                    iVar2.d = gameInputStream.readFloat();
                    iVar2.i = gameInputStream.readFloat();
                    iVar2.k = gameInputStream.readBoolean();
                    iVar2.o = true;
                    iVar2.j = gameInputStream.readBoolean();
                    iVar2.m = gameInputStream.readBoolean();
                    iVar2.n = gameInputStream.readBoolean();
                }
            }
            if (readInt >= 6) {
                this.dL.a(gameInputStream);
            }
            if (readInt >= 7 && (q = gameInputStream.q()) != null) {
                if (q instanceof l) {
                    this.z = (l) q;
                } else {
                    GameEngine.print("Got non CustomUnitMetadata object of:" + q.i() + " loading real_meta");
                    this.z = l.b;
                }
            }
            if (readInt >= 8) {
                this.i = gameInputStream.readBoolean();
                this.h = gameInputStream.readBoolean();
            }
            if (readInt >= 9 && gameInputStream.readBoolean()) {
                a(g.a(gameInputStream), true);
            }
            if (readInt >= 10) {
                as.a(this, gameInputStream, readInt);
            }
            if (readInt >= 11) {
                this.q = gameInputStream.readFloat();
            }
        }
        super.a(gameInputStream);
        if (this.dT != null) {
            this.dP = this.eo;
            this.dQ = this.ep;
            this.dR = this.eq;
            this.dS = this.cg;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cr() {
        return this.x.eM > 0;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.ak
    public int bB() {
        return this.B.size();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.ak
    public boolean bA() {
        return this.n;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(com.corrodinggames.rts.game.units.am amVar, boolean z) {
        if (this.x.eM == 0 || this.n || this.cm < 1.0f || !G(amVar) || amVar == this) {
            return false;
        }
        if (this.bX != amVar.bX && !z && (!this.x.cB || this.bX != PlayerData.i)) {
            return false;
        }
        if (this.x.eP != null && !this.x.eP.a() && !g.a(this.x.eP, amVar.de())) {
            return false;
        }
        if (this.x.eQ.size() > 0) {
            boolean z2 = false;
            Iterator it = this.x.eQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((com.corrodinggames.rts.game.units.ao) it.next()) == amVar.h()) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                return false;
            }
        }
        return com.corrodinggames.rts.gameFramework.utility.y.a(amVar, this.x.eR, this.x.eS);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e(com.corrodinggames.rts.game.units.am amVar, boolean z) {
        if (!d(amVar, z)) {
            return false;
        }
        C(amVar);
        return true;
    }

    public void C(com.corrodinggames.rts.game.units.am amVar) {
        amVar.cN = this;
        this.B.add(amVar);
        if (this.x.cC && this.bX == PlayerData.i) {
            e(amVar.bX);
        }
        a(af.transportingNewUnit, amVar);
        amVar.a(af.enteredTransport, this);
        GameEngine.getGameEngine().bS.l(amVar);
    }

    public void D(com.corrodinggames.rts.game.units.am amVar) {
        a(af.transportUnloadedOrRemovedUnit, amVar);
        amVar.a(af.leftTransport, this);
        if (this.x.cD && this.B.size() == 0) {
            e(PlayerData.i);
        }
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public void e(com.corrodinggames.rts.game.units.am amVar) {
        if (amVar.cN == this) {
            this.B.remove(amVar);
            amVar.cN = null;
            D(amVar);
            return;
        }
        GameEngine.g("Unit is not being transported");
    }

    public void L() {
        if (this.x.eM == 0) {
            return;
        }
        this.n = true;
        this.m = 30.0f;
    }

    public void M() {
        if (this.x.eM == 0) {
            return;
        }
        this.n = false;
    }

    public boolean g(boolean z) {
        if (this.B.size() == 0) {
            return false;
        }
        return b((com.corrodinggames.rts.game.units.am) this.B.remove(this.B.size() - 1), z, this.B.size() % 2 == 0);
    }

    public boolean a(com.corrodinggames.rts.game.units.am amVar, boolean z, boolean z2) {
        this.B.remove(amVar);
        return b(amVar, z, z2);
    }

    private boolean b(com.corrodinggames.rts.game.units.am amVar, boolean z, boolean z2) {
        boolean z3;
        float f = 180.0f;
        if (this.x.dk != null) {
            f = this.x.dk.floatValue();
        }
        float f2 = 70.0f;
        if (this.x.dn != null) {
            f2 = this.x.dn.floatValue();
        }
        float f3 = this.x.di;
        float f4 = this.x.dj;
        float k = (this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg + f) * f4)) - (com.corrodinggames.rts.gameFramework.f.j(this.cg + f) * f3);
        float j = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg + f) * f4) + (com.corrodinggames.rts.gameFramework.f.k(this.cg + f) * f3);
        float k2 = k + (com.corrodinggames.rts.gameFramework.f.k(this.cg + 90.0f) * (z2 ? -7.0f : 7.0f));
        float j2 = j + (com.corrodinggames.rts.gameFramework.f.j(this.cg + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !bI()) {
            if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j2)) {
                k2 += 10.0f;
            }
            if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j2)) {
                k2 -= 20.0f;
            }
            if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j2)) {
                k2 -= 10.0f;
                j2 += 10.0f;
            }
            if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j2)) {
                j2 -= 20.0f;
            }
        }
        if (!z && !com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j2) && !bI()) {
            z3 = false;
        } else {
            z3 = true;
            boolean z4 = false;
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.cO == this) {
                    com.corrodinggames.rts.game.units.custom.b.n dn = yVar.dn();
                    if (dn == null) {
                        GameEngine.m5e("Unload, attachment data is null");
                    }
                    if (dn != null) {
                        z4 = dn.E;
                    }
                }
            }
            com.corrodinggames.rts.gameFramework.utility.y.a(amVar, this);
            float f5 = this.cg + f;
            if (!z4) {
                amVar.eo = k2;
                amVar.ep = j2;
                amVar.cg = f5;
                amVar.cd = 0.0f;
                amVar.cc = 0.0f;
                amVar.bZ = 0.0f;
                amVar.ca = 0.0f;
                amVar.bZ += 0.1f;
            }
            amVar.bR = this;
            amVar.bS = 45.0f;
            if (z4) {
                amVar.bS = 85.0f;
            }
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) amVar;
                if (!z4) {
                    yVar2.j(amVar.cg);
                }
                if (!this.x.eW.read(this)) {
                    yVar2.az();
                    if (f2 != 0.0f) {
                        yVar2.d(amVar.eo + (com.corrodinggames.rts.gameFramework.f.k(f5 + (z2 ? -7.0f : 7.0f)) * f2), amVar.ep + (com.corrodinggames.rts.gameFramework.f.j(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    yVar2.ac = 0;
                } else {
                    yVar2.aH();
                }
            }
            if (!z4) {
                if (!this.x.dm) {
                    amVar.eq = this.eq;
                }
                amVar.eq += this.x.dl;
            }
            if (amVar instanceof j) {
                ((j) amVar).dF();
            }
        }
        if (!z3) {
            this.B.add(amVar);
        } else {
            D(amVar);
        }
        return z3;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bY() {
        if (this.x.eM == 0 || !this.x.x) {
            return -1;
        }
        return dI();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bZ() {
        if (this.x.eM == 0 || !this.x.x) {
            return -1;
        }
        return this.x.eM;
    }

    public void ds() {
        if (this.B.a > 0) {
            h(this.x.eV.read(this));
        }
    }

    public void h(boolean z) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it.next();
            amVar.cN = null;
            amVar.eo = this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * (-9.0f));
            amVar.ep = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * (-9.0f));
            if (z) {
                amVar.cj();
            }
        }
        this.B.clear();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public void bu() {
        if (!this.bV) {
            a(af.destroyed);
        }
        Object[] a = this.x.h.a();
        for (int i = this.x.h.a - 1; i >= 0; i--) {
            ((com.corrodinggames.rts.game.units.custom.b.a) a[i]).b(this);
        }
        super.bu();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.ay, com.corrodinggames.rts.gameFramework.w
    public void a() {
        ds();
        Object[] a = this.x.h.a();
        for (int i = this.x.h.a - 1; i >= 0; i--) {
            ((com.corrodinggames.rts.game.units.custom.b.a) a[i]).c(this);
        }
        PlayerData.a((com.corrodinggames.rts.game.units.am) this);
        this.dL.a(true);
        super.a();
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: dt */
    public l mo1r() {
        return this.x;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.y
    public boolean I() {
        if (this.x.aH || this.g || this.cO != null) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean aR() {
        if (this.x.dP) {
            return false;
        }
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && !dn.O) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean aS() {
        if (this.x.aH) {
            return false;
        }
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && !dn.H) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.ao h() {
        return this.x.fh;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean i() {
        return this.x.fh == com.corrodinggames.rts.game.units.ao.AIR && this.eq >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean Q() {
        return this.eq <= -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cv() {
        if (h() == com.corrodinggames.rts.game.units.ao.WATER) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ct() {
        if (h() == com.corrodinggames.rts.game.units.ao.AIR) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1 || this.x.as == null) {
            return null;
        }
        return this.x.as[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV && this.x.an != null) {
            return this.x.an;
        }
        return this.x.ar[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return this.x.ap;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && (!this.bV || this.eq >= 1.0f) && this.eq >= -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        bn bnVar = this.x.fQ[i];
        if (bnVar.C != null && bnVar.C.read(this)) {
            return null;
        }
        if (bnVar.aE != null) {
            return bnVar.aE[this.bX.R()];
        }
        if (bnVar.aD != null) {
            return bnVar.aD;
        }
        if (this.x.at != null) {
            return this.x.at[this.bX.R()];
        }
        return this.x.ao;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float h(int i) {
        return this.x.fQ[i].aG;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float i(int i) {
        return this.x.fQ[i].aH;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        PlayerData playerData;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (bI()) {
            gameEngine.bU.a(this);
        }
        if (this.cm < 1.0f) {
            if (this.x.bx != null && this.x.bx.b()) {
                this.x.bx.a(this.eo, this.ep, this.eq, this.cg, null);
                return false;
            } else if (this.x.by != null && this.x.by.b()) {
                this.x.by.a(this.eo, this.ep, this.eq, this.cg, null);
                return false;
            } else {
                a(com.corrodinggames.rts.game.units.ab.verysmall);
                return false;
            }
        }
        if (!this.x.fi) {
            S(0);
        }
        if (this.x.by != null && this.x.by.b()) {
            this.x.by.a(this.eo, this.ep, this.eq, this.cg, null);
        }
        if (this.x.bB != -1) {
            a((com.corrodinggames.rts.game.units.am) null, this.eo, this.ep, this.x.bB, (bh) null, 0);
        }
        if (this.x.bC != null) {
            if (this.x.bD && this.bt != null && this.bt.bX != null) {
                playerData = this.bt.bX;
            } else {
                playerData = this.bX;
            }
            if (!playerData.E) {
                this.x.bC.a(this.eo, this.ep, this.eq, this.cg, playerData, this.cG, this);
            }
        }
        this.bT = false;
        if (!this.x.fi) {
            ds();
        }
        if (this.x.bn) {
            boolean z = false;
            if (this.x.br && gameEngine.O() && gameEngine.netEngine.gameMapData.nukes) {
                z = true;
            }
            if (!z) {
                Projectile a = com.corrodinggames.rts.game.units.d.q.a(this, this.eo, this.ep, this.eo, this.ep);
                a.aH = false;
                a.Z = this.x.bo;
                a.Y = this.x.bp;
            }
        }
        if (this.x.bm != 0) {
            com.corrodinggames.rts.game.units.ai aiVar = new com.corrodinggames.rts.game.units.ai(false);
            aiVar.eo = this.eo;
            aiVar.ep = this.ep;
            aiVar.b(PlayerData.h);
            PlayerData.c(aiVar);
        }
        if (this.x.bz != null) {
            this.x.bz.a(this.eo, this.ep, 1.0f);
        }
        if (this.x.eD) {
            if (this.x.bz == null) {
                gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.A, 0.8f, this.eo, this.ep);
            }
            if (this.x.bu) {
                if (!i() && !this.x.eJ) {
                    ScorchMark.a(this, 1);
                }
                if (this.x.bt != null) {
                    a(this.x.bt, true);
                } else if (this.x.bj) {
                    a(com.corrodinggames.rts.game.units.ab.large);
                }
            }
            if (this.x.eE) {
                for (int i = 0; i < bp(); i++) {
                    gameEngine.bR.d(this.eo, this.ep, this.eq);
                }
            }
        } else {
            if (this.dT != null) {
                dv();
                for (int i2 = 0; i2 < this.dT.length; i2++) {
                    com.corrodinggames.rts.game.units.custom.b.i iVar = this.dT[i2];
                    ba baVar = this.x.ax[i2];
                    float f = this.eo + iVar.b;
                    float f2 = this.ep + iVar.c;
                    if (baVar.J && !baVar.p && (baVar.q == null || !baVar.q.read(this))) {
                        if (!com.corrodinggames.rts.gameFramework.utility.y.d(f, f2) && !this.x.eJ) {
                            ScorchMark.a(f, f2);
                        }
                        gameEngine.bR.b(f, f2, 0.0f);
                    }
                }
            }
            if (!i()) {
                if (this.x.bu) {
                    if (this.x.bt != null) {
                        a(this.x.bt, true);
                    } else {
                        a(com.corrodinggames.rts.game.units.ab.small);
                    }
                }
            } else {
                if (this.x.bu) {
                    if (this.x.bt != null) {
                        a(this.x.bt, false);
                    } else {
                        gameEngine.bR.b(this.eo, this.ep, this.eq);
                    }
                }
                for (int i3 = 0; i3 < bp(); i3++) {
                    gameEngine.bR.e(this.eo, this.ep, this.eq);
                }
            }
        }
        if (this.x.fi) {
            return true;
        }
        if (this.x.an != null) {
            this.M = this.x.an;
            this.a = 0;
            this.ew = true;
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void bq() {
        if (!this.x.eJ) {
            super.bq();
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void U() {
        float C;
        super.U();
        for (int i = 0; i < this.x.fQ.length; i++) {
            com.corrodinggames.rts.game.units.ap apVar = this.cL[i];
            GameEngine.m5e("Dir was:" + apVar.a + " for name:" + this.x.fQ[i].a);
            GameEngine.m5e("lockDelay:" + apVar.d + " shootCooldown:" + apVar.e);
            GameEngine.m5e("updateAndShouldResetTurret:" + b(i, 0.0f));
            GameEngine.m5e("idleDir:" + C(i));
            GameEngine.m5e("diffDir:" + com.corrodinggames.rts.gameFramework.f.c(apVar.a, C, 360.0f));
        }
    }

    public void a(l lVar, boolean z, boolean z2) {
        a(lVar, z, z2, (at[]) null);
    }

    public void a(l lVar, boolean z, boolean z2, at[] atVarArr) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        l lVar2 = this.x;
        as asVar = this.y;
        this.x = lVar;
        this.dz = this.x;
        this.y = lVar.cL;
        if (z2) {
            as.a(this, asVar, lVar2);
        } else if (atVarArr != null) {
            as.a(this, asVar, atVarArr);
        }
        bS();
        if (!z2) {
            j(true);
        }
        if (!z) {
            if (lVar.fQ.length > 1) {
                boolean z3 = true;
                if (lVar.fQ.length != lVar2.fQ.length) {
                    z3 = false;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= lVar.fQ.length) {
                            break;
                        }
                        if (lVar.fQ[i].a.equalsIgnoreCase(lVar2.fQ[i].a)) {
                            i++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    com.corrodinggames.rts.game.units.ap[] apVarArr = new com.corrodinggames.rts.game.units.ap[lVar.fQ.length];
                    for (int i2 = 0; i2 < lVar.fQ.length; i2++) {
                        bn bnVar = lVar.fQ[i2];
                        bn e = lVar2.e(bnVar.a);
                        if (e != null) {
                            apVarArr[bnVar.e] = this.cL[e.e];
                            this.cL[e.e] = null;
                        }
                    }
                    for (int i3 = 0; i3 < lVar.fQ.length; i3++) {
                        if (apVarArr[i3] == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 < lVar.fQ.length) {
                                    if (this.cL[i4] == null) {
                                        i4++;
                                    } else {
                                        apVarArr[i3] = this.cL[i4];
                                        this.cL[i4] = null;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (apVarArr[i3] == null) {
                                apVarArr[i3] = new com.corrodinggames.rts.game.units.ap();
                            }
                            apVarArr[i3].a(this.cg);
                        }
                    }
                    this.cL = apVarArr;
                }
            }
        } else {
            for (int i5 = 0; i5 < lVar.fQ.length; i5++) {
                this.cL[i5].a(this.cg + B(i5));
            }
        }
        if (this.x.ae) {
            V(this.x.af);
            W(this.x.ag);
        } else {
            T(this.x.af);
            U(this.x.ag);
        }
        this.ew = false;
        this.cj = this.x.cW;
        this.ck = this.x.dd;
        if (this.bV) {
            this.a = 0;
        } else {
            this.a = this.x.Y;
        }
        this.g = false;
        if (z) {
            this.eq += this.x.dS;
        }
        float f = this.cv;
        this.cv = this.y.c;
        if (z) {
            o(this.cv);
        } else if (f == 0.0f) {
            o(this.cv);
        } else {
            o((this.cu / f) * this.cv);
        }
        float f2 = this.cA;
        this.cA = this.y.g;
        if (this.x.cM) {
            if (this.cx > this.cA) {
                this.cx = this.cA;
            }
        } else if (z) {
            this.cx = this.cA;
        } else if (f2 == 0.0f) {
            this.cx = this.cA;
        } else {
            this.cx = (this.cx / f2) * this.cA;
        }
        if (this.x.cO) {
            if (this.cB > this.y.d) {
                this.cB = this.y.d;
            }
        } else if (z) {
            this.cB = this.y.d * this.x.cS;
        } else if (asVar.d == 0.0f) {
            this.cB = this.y.d;
        } else {
            this.cB = (this.cB / asVar.d) * this.y.d;
        }
        if (this.bX == null) {
            this.M = this.x.ad;
        } else {
            S();
        }
        if (this.x.aH && z) {
            this.cg = -90.0f;
        }
        f_();
        if (!z && ((this.bx != null || this.by != null) && (!com.corrodinggames.rts.game.units.custom.d.b.b(this.x.ch, lVar2.ch) || !com.corrodinggames.rts.game.units.custom.d.b.b(this.x.cj, lVar2.cj)))) {
            this.bx = null;
            this.by = null;
        }
        if (!z) {
            boolean z4 = this.x.j() != lVar2.j();
            if (this.x.j()) {
                this.cd = 0.0f;
                this.cc = 0.0f;
                if (lVar2.j() && !this.x.cX.equals(lVar2.cX)) {
                    z4 = true;
                }
            }
            if (z4) {
                gameEngine.bU.a(this);
            }
        }
        this.j = 1.0f;
        if (this.x.cI != -2) {
        }
        if (!this.bV) {
            dF();
        }
        if (this.x.eF) {
        }
        du();
        dg().a(this.x);
        if (!z) {
            int bl = bl();
            for (int i6 = 0; i6 < bl; i6++) {
                com.corrodinggames.rts.game.units.ap apVar = this.cL[i6];
                bn bnVar2 = this.x.fQ[i6];
                if (bnVar2 != null) {
                    if (apVar.e > bnVar2.m) {
                        apVar.e = bnVar2.m;
                    }
                    if (apVar.f > bnVar2.n) {
                        apVar.f = bnVar2.n;
                    }
                }
            }
        }
        if (!z) {
            if (!this.x.dc) {
                this.dL.b = null;
            }
            if (this.x.fg != lVar2.fg) {
                aH();
            }
        }
        if (this.x.cD && this.B.size() == 0) {
            b(PlayerData.i);
        }
        if (this.cG && !gameEngine.bS.i(this)) {
            gameEngine.bS.l(this);
        }
        if (!z) {
            Object[] a = this.x.h.a();
            for (int i7 = this.x.h.a - 1; i7 >= 0; i7--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a[i7]).a(this, lVar2);
            }
            if (this.cm >= 1.0f) {
                if (this.y.n > asVar.n) {
                    c(false);
                }
            } else {
                if ((this.x.dh != -1 ? this.x.dh : this.y.n) > (lVar2.dh != -1 ? lVar2.dh : asVar.n)) {
                    c(false);
                }
            }
        }
        if (this.i && this.x.dv != null) {
            this.b.a(this.x.dv, 7, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void f_() {
        if (this.x.aH) {
            this.bT = false;
        } else if (!this.bV) {
            this.bT = true;
            if (this.x.eC) {
                this.bT = false;
            }
        } else {
            this.bT = false;
        }
        if (this.cO != null) {
            this.bT = false;
        }
    }

    public j(boolean z, l lVar) {
        super(z);
        this.b = new e(this);
        this.c = 1.0f;
        this.h = true;
        this.i = true;
        this.j = 1.0f;
        this.k = false;
        this.p = true;
        this.B = new com.corrodinggames.rts.gameFramework.utility.m();
        this.C = null;
        this.E = null;
        this.F = null;
        this.dL = new com.corrodinggames.rts.game.units.d.k(this);
        this.dT = null;
        this.eg = new com.corrodinggames.rts.gameFramework.utility.m();
        a(lVar, true, false);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        float f2;
        com.corrodinggames.rts.gameFramework.emitter.e c;
        float a;
        com.corrodinggames.rts.game.units.as c2;
        float f3;
        float f4;
        float f5;
        com.corrodinggames.rts.gameFramework.emitter.e b;
        boolean z = this.i;
        if (z) {
            this.i = false;
            Object[] a2 = this.x.h.a();
            for (int i = this.x.h.a - 1; i >= 0; i--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a2[i]).a(this);
            }
            b(af.created);
        }
        l lVar = this.x;
        super.a(f);
        if (this.bV && !this.l) {
            if (this.eq > 0.0f) {
                if (lVar.fi && !(this.cf == 0.0f && this.cc == 0.0f && this.cd == 0.0f)) {
                    this.f += 0.017f * f;
                    this.eq -= this.f * f;
                    PointF n = n(f);
                    this.eo += n.x;
                    this.ep += n.y;
                    if (lVar.fg == com.corrodinggames.rts.game.units.ao.AIR) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        this.dq += f;
                        this.f0do += f;
                        if (lVar.fj && this.dq > 9.0f) {
                            this.dq = com.corrodinggames.rts.gameFramework.f.c(1.0f, 3.0f);
                            com.corrodinggames.rts.gameFramework.emitter.e b2 = gameEngine.bR.b(this.eo, this.ep, this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.low);
                            if (b2 != null) {
                                b2.aq = 0;
                                b2.ap = 0;
                                b2.ar = (short) 2;
                                b2.r = true;
                                b2.E = 0.5f;
                                b2.W = 60.0f;
                                b2.V = 60.0f;
                                b2.G = 0.9f;
                                b2.F = 1.2f;
                                b2.as = false;
                                b2.P = 0.0f;
                                b2.Q = 0.0f;
                            }
                        }
                        if (this.f0do > 7.0f) {
                            this.f0do = 0.0f;
                            com.corrodinggames.rts.gameFramework.emitter.e b3 = gameEngine.bR.b(this.eo, this.ep, this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.verylow);
                            if (b3 != null) {
                                Emitter.b(b3, true);
                                b3.I = this.eo;
                                b3.J = this.ep;
                                b3.K = this.eq;
                                b3.P += com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f) + this.cc;
                                b3.Q += com.corrodinggames.rts.gameFramework.f.c(-0.1f, 0.1f) + this.cd;
                                b3.I += com.corrodinggames.rts.gameFramework.f.c(-4.0f, 4.0f);
                                b3.J += com.corrodinggames.rts.gameFramework.f.c(-4.0f, 4.0f);
                            }
                        }
                    }
                } else {
                    this.f += lVar.dW * f;
                    this.eq -= this.f * f;
                }
            } else if (!this.k) {
                this.k = true;
                if (lVar.fi) {
                    ds();
                    S(0);
                    if (lVar.an != null) {
                        this.M = lVar.an;
                        this.a = 0;
                        this.ew = true;
                    } else {
                        ci();
                    }
                }
                if (this.f > 0.5d) {
                    if (lVar.bw != null && lVar.bw.a()) {
                        lVar.bw.a(this.eo, this.ep, this.eq, this.cg, null);
                    }
                    if (cK()) {
                        if (lVar.bv) {
                            a(com.corrodinggames.rts.game.units.ab.verysmall);
                        }
                        if (cJ()) {
                            GameEngine.getGameEngine().bR.a(this.eo, this.ep, 0.0f, 0, 0.0f, 0.0f, this.cg);
                        }
                    } else if (lVar.bv) {
                        a(com.corrodinggames.rts.game.units.ab.small);
                    }
                }
                this.f = 0.0f;
            } else if (cK()) {
                if (this.eq > -10.0f) {
                    this.f += 8.0E-4f * f;
                    this.eq -= this.f * f;
                    if (cJ()) {
                        this.t += f;
                        if (this.t > 30.0f) {
                            this.t = 0.0f;
                            if (s_() && (b = GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq, this.cg)) != null) {
                                b.P = 0.0f;
                                b.Q = -0.1f;
                            }
                        }
                    }
                } else {
                    this.l = true;
                }
            } else {
                this.eq = 0.0f;
                this.l = true;
            }
        }
        if (this.bV) {
            return;
        }
        GameEngine gameEngine2 = GameEngine.getGameEngine();
        if (lVar.bh != 0.0f && this.cm < 1.0f) {
            float f6 = this.cm + (lVar.bh * f);
            if (f6 >= 1.0f) {
                PlayerData.b((com.corrodinggames.rts.game.units.am) this);
                this.cm = 1.0f;
                this.cn = 1.0f;
                PlayerData.c(this);
            } else {
                this.cm = f6;
                this.cn = f6;
            }
        }
        if (!bT()) {
            if (this.cm < 1.0f) {
                if (lVar.dw != null) {
                    this.b.a(lVar.dw, 8);
                    this.b.a(f);
                } else if (lVar.dx != null) {
                    this.b.a(lVar.dx, 99);
                    this.b.b = this.cm;
                    this.b.d = 0.0f;
                    this.b.a(f);
                }
            }
            Object[] a3 = lVar.h.a();
            for (int i2 = lVar.h.a - 1; i2 >= 0; i2--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a3[i2]).a(this, f);
            }
            boolean z2 = true;
            if ((this.cm < 1.0f && !lVar.cd) || (this.cN != null && !lVar.cc)) {
                z2 = false;
            }
            if (z2) {
                b(f, z);
                l lVar2 = this.x;
                return;
            }
            return;
        }
        Object[] a4 = lVar.h.a();
        for (int i3 = lVar.h.a - 1; i3 >= 0; i3--) {
            ((com.corrodinggames.rts.game.units.custom.b.a) a4[i3]).b(this, f);
        }
        if (this.h) {
            this.h = false;
            a(af.completeAndActive);
        }
        if (this.y.p != 0.0f && (this.cu < this.cv || this.y.p < 0.0f)) {
            this.cu += this.y.p * f;
            if (this.cu > this.cv) {
                this.cu = this.cv;
            }
        }
        if (this.y.d != 0.0f) {
            if (!this.v) {
                f5 = lVar.cP;
            } else {
                f5 = lVar.cQ;
            }
            if (this.cB < this.y.d || f5 < 0.0f) {
                this.cB += f5 * f;
            }
            if (this.cB >= this.y.d) {
                this.cB = this.y.d;
                this.v = false;
            }
            if (this.cB <= 0.0f) {
                if (lVar.bk) {
                    bv();
                    return;
                }
                this.cB = 0.0f;
            }
        }
        if (this.cA != 0.0f) {
            if (this.y.h != 0.0f) {
                this.cx += this.y.h * f;
                if (this.cx > this.cA) {
                    this.cx = this.cA;
                }
            }
            if (this.cx < 0.0f) {
                this.cx = 0.0f;
            }
            if (this.cy != 0.0f) {
                this.cy -= (this.cy * 0.02f) * f;
                this.cy = com.corrodinggames.rts.gameFramework.f.a(this.cy, 0.0f, lVar.cV * f);
                if (this.cy > 50.0f) {
                    this.cy = 50.0f;
                }
            }
        }
        this.dL.a(f);
        l lVar3 = this.x;
        if (lVar3.fp) {
            com.corrodinggames.rts.game.units.e.b.a(f, this);
        }
        if (lVar3.cn) {
            this.o += f;
            if (this.o > lVar3.cr - 0.1f) {
                this.o -= lVar3.cr;
                boolean read = lVar3.cx.read(this);
                if (this.p != read) {
                    PlayerData.a((com.corrodinggames.rts.game.units.am) this);
                    this.p = read;
                    PlayerData.c(this);
                }
                if (this.p) {
                    lVar3.co.g(this);
                }
            }
        }
        if (lVar3.ct != null) {
            this.q += f;
            if (this.q >= lVar3.cu) {
                this.q = 0.0f;
                lVar3.ct.writeToUnit(this);
            }
        }
        if (this.cK) {
            this.b.a(lVar3.ds, 3);
        } else if (!this.b.e || this.b.a == lVar3.dt) {
            this.b.a(lVar3.dt, 2);
        }
        if (lVar3.bL) {
            if (lVar3.bJ && gameEngine2.dd) {
                if (this.cf > 0.0f || (this.cf < 0.0f && lVar3.bK)) {
                    this.t += f;
                }
                if (this.t > 10.0f) {
                    this.t = 0.0f;
                    if (this.el && cJ()) {
                        float f7 = this.cg + 180.0f;
                        if (this.cf < 0.0f) {
                            f7 += 180.0f;
                        }
                        float f8 = this.cj - 6.0f;
                        if (f8 < 4.0f) {
                            f8 = 4.0f;
                        }
                        gameEngine2.bR.b(this.eo + (com.corrodinggames.rts.gameFramework.f.k(f7) * f8), this.ep + (com.corrodinggames.rts.gameFramework.f.j(f7) * f8), 0.0f, f7);
                    }
                }
            }
            if (gameEngine2.dc && ((this.cf > 0.0f || this.cf < 0.0f) && this.el)) {
                this.d += f;
                if (this.d > lVar3.bR) {
                    this.d = 0.0f;
                    if (this.cf > 0.0f) {
                        if (lVar3.bO != null) {
                            lVar3.bO.a(this.eo, this.ep, this.eq, this.cg, this);
                        }
                    } else if (lVar3.bP != null) {
                        float f9 = this.cg;
                        if (lVar3.bQ) {
                            f9 += 180.0f;
                        }
                        lVar3.bP.a(this.eo, this.ep, this.eq, f9, this);
                    }
                    if (lVar3.bM && ((this.cf > 0.0f || lVar3.bN) && !cJ())) {
                        int i4 = 0;
                        while (i4 <= 1) {
                            float f10 = i4 == 0 ? -20 : 20;
                            float f11 = this.cg + 180.0f;
                            if (this.cf < 0.0f) {
                                f10 += 180.0f;
                                f11 += 180.0f;
                            }
                            com.corrodinggames.rts.gameFramework.emitter.e c3 = gameEngine2.bR.c(this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg + 180.0f + f10) * (this.cj - 1.0f)), this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg + 180.0f + f10) * (this.cj - 1.0f)), this.eq, f11 + com.corrodinggames.rts.gameFramework.f.c(-7.0f, 7.0f), 0);
                            if (c3 != null) {
                                c3.P += com.corrodinggames.rts.gameFramework.f.c(-0.15f, 0.15f);
                                c3.Q += com.corrodinggames.rts.gameFramework.f.c(-0.15f, 0.15f);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        if (lVar3.eM > 0) {
            if (lVar3.eY != 0.0f && this.B.a > 0) {
                Object[] a5 = this.B.a();
                for (int i5 = 0; i5 < this.B.a; i5++) {
                    com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) a5[i5];
                    if (amVar.cu < amVar.cv || lVar3.eY < 0.0f) {
                        amVar.cu += lVar3.eY * f;
                        if (amVar.cu > amVar.cv) {
                            amVar.cu = amVar.cv;
                        }
                    }
                }
            }
            if (this.n && lVar3.fc.read(this)) {
                this.m = com.corrodinggames.rts.gameFramework.f.a(this.m, f);
                if (this.m == 0.0f) {
                    this.m = lVar3.eN;
                    if (this.B.size() == 0) {
                        this.n = false;
                    } else {
                        g(false);
                        if (this.B.size() == 0) {
                            this.n = false;
                        }
                    }
                }
            }
        }
        if (this.cK) {
            this.s = 0.0f;
        } else {
            this.s += f;
        }
        if (lVar3.fg != com.corrodinggames.rts.game.units.ao.AIR && this.cO == null) {
            dF();
        }
        if ((lVar3.fg == com.corrodinggames.rts.game.units.ao.OVER_CLIFF || lVar3.fg == com.corrodinggames.rts.game.units.ao.OVER_CLIFF_WATER) && this.cK) {
            if (cI()) {
                this.j = 0.7f;
            } else {
                this.j = 1.0f;
            }
        }
        if (lVar3.fg == com.corrodinggames.rts.game.units.ao.AIR) {
            this.e += 2.0f * f;
            if (this.e > 360.0f) {
                this.e -= 360.0f;
            }
            boolean i6 = i();
            boolean z3 = false;
            if (lVar3.dQ) {
                boolean cK = cK();
                if (!this.cK && !cK && this.s > 3.0f && (!lVar3.dR || aq())) {
                    z3 = true;
                }
            }
            if (this.cO == null) {
                if (z3) {
                    if (lVar3.dU < 0.0f) {
                        f4 = (com.corrodinggames.rts.gameFramework.f.c(this.eq - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f4 = lVar3.dU;
                    }
                    this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 2.0f, f4 * f);
                } else {
                    float j = this.y.q + (com.corrodinggames.rts.gameFramework.f.j(this.e) * lVar3.dT);
                    if (lVar3.dU < 0.0f) {
                        f3 = (com.corrodinggames.rts.gameFramework.f.c(this.eq - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f3 = lVar3.dU;
                    }
                    this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, j, com.corrodinggames.rts.gameFramework.f.b(f3, (com.corrodinggames.rts.gameFramework.f.c(this.eq - j) * 0.05f * 0.3f) + 0.1f) * f);
                }
                if (i6 != i()) {
                    this.ay = true;
                    dF();
                }
            }
        } else {
            float f12 = this.y.q - lVar3.dT;
            if (this.eq < f12) {
                this.eq += 0.2f * f;
                if (this.eq >= f12) {
                    this.eq = f12;
                }
            }
            if ((this.y.q != 0.0f || lVar3.dT != 0.0f || this.eq > 0.0f) && this.cO == null) {
                float f13 = this.y.q;
                if (lVar3.dT != 0.0f) {
                    this.e += 2.0f * f;
                    if (this.e > 360.0f) {
                        this.e -= 360.0f;
                    }
                    f13 += com.corrodinggames.rts.gameFramework.f.j(this.e) * lVar3.dT;
                }
                if (lVar3.dU < 0.0f) {
                    f2 = (com.corrodinggames.rts.gameFramework.f.c(this.eq - 2.0f) * 0.05f * 0.4f) + 0.2f;
                } else {
                    f2 = lVar3.dU;
                }
                this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, f13, com.corrodinggames.rts.gameFramework.f.b(f2, (com.corrodinggames.rts.gameFramework.f.c(this.eq - f13) * 0.05f * 0.3f) + 0.1f) * f);
                boolean z4 = false;
                if (this.eq > this.y.q + lVar3.dT + 1.0f) {
                    this.f += lVar3.dV * f;
                    if (this.eq < 0.0f) {
                        this.f = com.corrodinggames.rts.gameFramework.f.b(this.f, 0.2f);
                    }
                    this.eq -= this.f * f;
                    if (this.f > 1.5d) {
                        this.dq += f;
                        if (this.dq > 0.5d) {
                            this.dq = 0.0f;
                            com.corrodinggames.rts.gameFramework.emitter.e b4 = gameEngine2.bR.b(this.eo + com.corrodinggames.rts.gameFramework.f.c(-this.cj, this.cj), this.ep + com.corrodinggames.rts.gameFramework.f.c(-this.cj, this.cj), this.eq, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.high);
                            if (b4 != null) {
                                b4.aq = 0;
                                b4.ap = 0;
                                b4.ar = (short) 2;
                                b4.r = true;
                                b4.s = true;
                                b4.t = 40.0f;
                                b4.an = true;
                                b4.P = 0.1f;
                                b4.R = 0.0f;
                                b4.u = true;
                                b4.E = 0.4f;
                                b4.W = 380.0f;
                                b4.V = b4.W;
                                b4.G = 0.8f;
                                b4.F = 1.7f;
                                b4.as = false;
                                b4.P += com.corrodinggames.rts.gameFramework.f.c(-0.04f, 0.04f);
                                b4.Q += com.corrodinggames.rts.gameFramework.f.c(-0.04f, 0.04f);
                            }
                        }
                    }
                    if (this.eq <= this.y.q + lVar3.dT + 1.0f) {
                        if (this.f > 2.0f) {
                            z4 = true;
                        }
                        if (this.eq < this.y.q + lVar3.dT) {
                            this.eq = this.y.q + lVar3.dT;
                        }
                        this.f = 0.0f;
                    }
                } else {
                    if (this.f > 2.0f) {
                        z4 = true;
                    }
                    this.f = 0.0f;
                }
                if (z4 && (c = gameEngine2.bR.c(this.eo, this.ep, this.eq, 0)) != null) {
                    c.G = 0.8f;
                    c.F = 1.4f;
                    c.V = 60.0f;
                    c.W = c.V;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        if (lVar3.bg) {
            z6 = true;
        }
        if (this.z != null && this.z.bg) {
            z6 = true;
        }
        if (z6) {
            com.corrodinggames.rts.game.units.a.s d = this.dL.d();
            boolean z7 = false;
            if (d != null) {
                if (d instanceof com.corrodinggames.rts.game.units.custom.a.g) {
                    com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) d;
                    com.corrodinggames.rts.game.units.custom.a.d dVar = gVar.a;
                    boolean z8 = false;
                    z7 = gVar.L();
                    if (dVar.l != null && (c2 = dVar.l.c()) != null && (c2 instanceof l)) {
                        z5 = true;
                        if (c2 != lVar3) {
                            if (this.z != null) {
                                PlayerData.b((com.corrodinggames.rts.game.units.am) this);
                                a(this.z, false, false, this.A);
                                this.z = null;
                                this.A = null;
                                lVar3 = this.x;
                                PlayerData.c(this);
                            }
                            PlayerData.b((com.corrodinggames.rts.game.units.am) this);
                            this.z = lVar3;
                            this.A = dVar.m;
                            a((l) c2, false, false, dVar.m);
                            lVar3 = this.x;
                            PlayerData.c(this);
                        }
                    }
                    if (dVar.W != null) {
                        float floatValue = dVar.W.floatValue();
                        if (dVar.Z) {
                            float f14 = this.eo;
                            float f15 = this.ep;
                            com.corrodinggames.rts.game.units.d.j b5 = this.dL.b();
                            if (b5 != null) {
                                float f16 = Float.MIN_VALUE;
                                float f17 = Float.MIN_VALUE;
                                if (b5.i != null) {
                                    f16 = b5.i.eo;
                                    f17 = b5.i.ep;
                                } else if (b5.h != null) {
                                    f16 = b5.h.x;
                                    f17 = b5.h.y;
                                }
                                if (f16 > Float.MIN_VALUE) {
                                    floatValue += com.corrodinggames.rts.gameFramework.f.d(f14, f15, f16, f17);
                                }
                            }
                        }
                        if (dVar.aa == null) {
                            a = a(f, floatValue, true, dVar.X);
                        } else {
                            int i7 = dVar.aa.e;
                            a = a(f, floatValue, i7);
                            com.corrodinggames.rts.game.units.ap apVar = this.cL[i7];
                            apVar.b(5);
                            apVar.b = apVar.a;
                        }
                        if (dVar.Y && com.corrodinggames.rts.gameFramework.f.c(a) > 5.0f) {
                            z8 = true;
                        }
                    }
                    if (dVar.V != null && !z8) {
                        this.b.a(dVar.V.b(), 10);
                    }
                    if (z8) {
                        this.dL.e = 0.0f;
                    }
                }
                if (lVar3.dy != null && d.mo3i() != null && this.dL.e >= lVar3.dy.q) {
                    this.b.a(lVar3.dy, 5);
                }
            }
            this.g = z7;
            if (this.g) {
                this.cc = 0.0f;
                this.cd = 0.0f;
                this.cf = 0.0f;
            }
        }
        if (this.z != null && !z5) {
            PlayerData.b((com.corrodinggames.rts.game.units.am) this);
            a(this.z, false, false, this.A);
            this.z = null;
            this.A = null;
            l lVar4 = this.x;
            PlayerData.c(this);
        }
        this.b.a(f);
        b(f, z);
        l lVar5 = this.x;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cy() {
        int i = this.x.co.b;
        if (!this.p) {
            return 0.0f;
        }
        return i * this.x.cs;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.custom.e.f cz() {
        if (!this.p) {
            return com.corrodinggames.rts.game.units.custom.e.f.a;
        }
        return this.x.cp;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.custom.e.f cA() {
        if (!this.p) {
            return com.corrodinggames.rts.game.units.custom.e.f.a;
        }
        return this.x.cq;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(int i, com.corrodinggames.rts.game.units.am amVar, boolean z, boolean z2) {
        return a(this.x.fQ[i], i, amVar, z, z2);
    }

    public final boolean a(bn bnVar, int i, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, f, f2);
        if (a > bnVar.ae) {
            if (this.bX == gameEngine.playerTeam) {
                gameEngine.bS.b("Location too far");
                return false;
            }
            return false;
        } else if (a < bnVar.ah) {
            if (this.bX == gameEngine.playerTeam) {
                gameEngine.bS.b("Location too close");
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(bn bnVar, int i, com.corrodinggames.rts.game.units.am amVar, boolean z, boolean z2) {
        float f;
        if (!z && (bnVar.I || z2)) {
            float a = com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar.eo, amVar.ep);
            if (a > bnVar.ae || a < bnVar.ah) {
                return false;
            }
        }
        if (!bnVar.H) {
            return true;
        }
        if (bnVar.ai != -1.0f) {
            if (bnVar.w != -1) {
                f = this.cL[bnVar.w].a + bnVar.j;
            } else {
                f = this.cg + bnVar.j;
            }
            if (com.corrodinggames.rts.gameFramework.f.c(com.corrodinggames.rts.gameFramework.f.c(f, com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, amVar.eo, amVar.ep), 360.0f)) > bnVar.ai) {
                return false;
            }
        }
        if (bnVar.N != null && !bnVar.N.read(this)) {
            return false;
        }
        if (bnVar.O != null && !g.a(bnVar.O, amVar.de())) {
            return false;
        }
        if (bnVar.P != null && g.a(bnVar.P, amVar.de())) {
            return false;
        }
        if (amVar.i()) {
            if (bnVar.J != null) {
                return bnVar.J.read(this);
            }
            return true;
        } else if (amVar.Q()) {
            if (bnVar.L != null) {
                return bnVar.L.read(this);
            }
            return true;
        } else if (bnVar.M != null && !bnVar.M.read(this) && !amVar.cH()) {
            return false;
        } else {
            if (bnVar.K != null) {
                return bnVar.K.read(this);
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(com.corrodinggames.rts.game.units.am amVar, int i) {
        bn bnVar = this.x.fQ[i];
        if (!bnVar.B || !a(bnVar, i, amVar, false, false)) {
            return;
        }
        for (int i2 = 0; i2 < this.x.fQ.length; i2++) {
            bn bnVar2 = this.x.fQ[i2];
            if (bnVar2 != null && i2 != i && bnVar2.ao != null && bnVar2.ao == bnVar && this.cL[i2].e < 9000.0f - ((b(i) * 0.5f) - bnVar2.n)) {
                this.cL[i2].e = 0.0f;
            }
        }
        if (bnVar.w != -1) {
            bn bnVar3 = this.x.fQ[bnVar.w];
            if (!bnVar3.B && bnVar3.p != 0.0f) {
                this.cL[bnVar.w].e = b(bnVar.w) + t(bnVar.w);
            }
        }
        this.b.a(this.x.du, 11, true);
        b(bnVar);
        a(amVar, -1.0f, -1.0f, i, (bh) null, 0);
    }

    public boolean a(bn bnVar) {
        if (bnVar.u > 0.0f && (bnVar.u > this.cB || this.v)) {
            return false;
        }
        if (bnVar.v != null && !bnVar.v.b(this)) {
            return false;
        }
        return true;
    }

    public void b(bn bnVar) {
        if (bnVar.u > 0.0f) {
            this.cB -= bnVar.u;
            if (this.cB < bnVar.u && this.x.cR) {
                this.v = true;
            }
        }
        if (bnVar.v != null) {
            bnVar.v.a(this);
        }
    }

    public static Projectile a(com.corrodinggames.rts.game.units.am amVar, int i, bh bhVar, float f, float f2, float f3, float f4) {
        Projectile a = Projectile.a(amVar, f, f2, f3, i);
        a(a, amVar, i, bhVar, f, f2, f3, f4);
        return a;
    }

    public static void a(Projectile projectile, com.corrodinggames.rts.game.units.am amVar, int i, bh bhVar, float f, float f2, float f3, float f4) {
        com.corrodinggames.rts.gameFramework.emitter.e a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        projectile.az = f4;
        projectile.aT = f4;
        if (amVar == null) {
            throw new RuntimeException("Source cannot be null");
        }
        projectile.g = bhVar;
        projectile.G = bhVar.aI;
        projectile.aR = bhVar.aJ;
        projectile.U = bhVar.b;
        projectile.Y = bhVar.c;
        if (!bhVar.aN && (amVar instanceof j)) {
            j jVar = (j) amVar;
            projectile.U *= jVar.y.f;
            projectile.Y *= jVar.y.f;
        }
        projectile.Z = bhVar.i;
        if (bhVar.l) {
            projectile.aa = false;
            projectile.ab = true;
        } else {
            projectile.aa = !bhVar.k;
        }
        projectile.ac = bhVar.n;
        if (bhVar.m) {
            projectile.ad = true;
            projectile.ae = false;
        }
        projectile.D = bhVar.p;
        projectile.aY = bhVar.q;
        projectile.aZ = bhVar.r;
        if (bhVar.o < 0.5d) {
            projectile.C = true;
        } else {
            projectile.H = bhVar.o;
        }
        projectile.h = bhVar.v;
        projectile.i = bhVar.u;
        projectile.t = bhVar.w;
        if (bhVar.aM != 0.0f) {
            projectile.t += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar, (int) ((-bhVar.aM) * 100.0f), (int) (bhVar.aM * 100.0f), 1) / 100.0f;
        }
        if (bhVar.T && i != -1) {
            projectile.au = amVar;
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                projectile.av = i;
                com.corrodinggames.rts.gameFramework.utility.ai D = ((com.corrodinggames.rts.game.units.y) amVar).D(i);
                projectile.aw = D.a;
                projectile.ax = D.b;
                projectile.ay = amVar.eq + D.c;
            } else {
                projectile.aw = amVar.eo;
                projectile.ax = amVar.ep;
                projectile.ay = amVar.eq;
            }
        }
        projectile.w = bhVar.D;
        projectile.u = bhVar.E;
        projectile.v = bhVar.F;
        projectile.af = bhVar.aO;
        projectile.ag = bhVar.aP;
        projectile.ah = bhVar.aQ;
        projectile.ai = bhVar.aR;
        projectile.ak = bhVar.aS;
        projectile.al = bhVar.aT;
        projectile.am = bhVar.aU;
        projectile.an = bhVar.aV;
        if (bhVar.aW > 0.0f) {
            projectile.ao = true;
            projectile.W = bhVar.aW;
            projectile.X = projectile.W;
        }
        projectile.ar = bhVar.aE;
        if (bhVar.aG != 0.0f) {
            float f5 = bhVar.aH;
            int a2 = Color.a(projectile.ar);
            int b = (int) (Color.b(projectile.ar) * f5);
            int c = (int) (Color.c(projectile.ar) * f5);
            int d = (int) (Color.d(projectile.ar) * f5);
            int K2 = amVar.bX.K();
            projectile.ar = Color.a(a2, com.corrodinggames.rts.gameFramework.f.b((int) (b + (Color.b(K2) * bhVar.aG)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (c + (Color.c(K2) * bhVar.aG)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (d + (Color.d(K2) * bhVar.aG)), 0, 255));
        }
        projectile.P = bhVar.x;
        projectile.R = bhVar.y;
        projectile.S = !bhVar.A;
        projectile.Q = bhVar.z;
        if (bhVar.B != null) {
            projectile.P = (short) 0;
            projectile.R = (short) 0;
        }
        projectile.x = bhVar.aF;
        projectile.m = bhVar.s;
        projectile.A = bhVar.I;
        projectile.M = bhVar.V;
        projectile.B = bhVar.W;
        projectile.aH = bhVar.ae;
        projectile.aG = bhVar.aw;
        projectile.aM = bhVar.af;
        if (bhVar.ai != null) {
            bhVar.ai.a(projectile.eo, projectile.ep, projectile.eq, projectile.az, projectile);
        }
        if (bhVar.ao != -1) {
            boolean z = false;
            com.corrodinggames.rts.gameFramework.emitter.e eVar = projectile.aP;
            if (eVar != null && eVar.b == projectile && eVar.d && eVar != null) {
                if (eVar.V < 150.0f) {
                    eVar.V = 200.0f;
                }
                z = true;
            }
            if (!z && (a = gameEngine.bR.a(projectile, bhVar.ao, bhVar.ap)) != null) {
                if (bhVar.aq) {
                    a.c = true;
                }
                if (bhVar.L) {
                    projectile.aP = a;
                }
            }
        }
        projectile.aQ = bhVar.ar;
        if (bhVar.as != -1.0f) {
            projectile.aI = bhVar.as;
        }
        if (bhVar.at != -1.0f) {
            projectile.aJ = bhVar.at;
        }
        projectile.aL = -1.0f;
        if (bhVar.au != -1.0f) {
            projectile.r = bhVar.au;
        }
        projectile.s = bhVar.av;
        if (bhVar.aZ != null) {
        }
        projectile.aE = bhVar.bd;
        projectile.em = amVar.em;
        if (projectile.em < 4 && f3 >= -1.0f) {
            projectile.em = 4;
        }
        if (bhVar.U) {
            projectile.em = 1;
        }
    }

    public Projectile a(com.corrodinggames.rts.game.units.am amVar, float f, float f2, int i, bh bhVar, int i2) {
        bh bhVar2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        bn bnVar = this.x.fQ[i];
        if (bnVar.aA != null) {
            this.b.a(bnVar.aA.b(), 6, true);
        }
        if (bnVar.aB > 0.0f) {
            b(bnVar.aB);
        }
        if (bnVar.aC != null) {
            bnVar.aC.a(this, new PointF(f, f2), amVar, i2 + 1, 0);
        }
        if (bhVar == null) {
            bhVar2 = this.x.fR[bnVar.a(this)];
        } else {
            bhVar2 = bhVar;
        }
        PointF K2 = K(i);
        com.corrodinggames.rts.gameFramework.utility.ai D = D(i);
        if (bnVar.aI > 0) {
            for (int i3 = 0; i3 < bnVar.aI; i3++) {
                if (this.B != null && this.B.size() > 0) {
                    com.corrodinggames.rts.game.units.am amVar2 = (com.corrodinggames.rts.game.units.am) this.B.remove(this.B.size() - 1);
                    com.corrodinggames.rts.game.units.ap apVar = this.cL[i];
                    com.corrodinggames.rts.gameFramework.utility.y.a(amVar2, this);
                    amVar2.eo = D.a;
                    amVar2.ep = D.b;
                    amVar2.cg = apVar.a;
                    if (amVar2 instanceof com.corrodinggames.rts.game.units.y) {
                        com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar2;
                        yVar.az();
                        if (amVar != null) {
                            yVar.n(amVar);
                        } else {
                            yVar.e(f, f2);
                        }
                    }
                }
            }
        }
        Projectile projectile = null;
        if (bhVar2.L && bhVar == null) {
            if (this.G == null) {
                this.G = new Projectile[31];
            }
            if (this.G[i] != null && !this.G[i].ej) {
                projectile = this.G[i];
                projectile.a(this, D.a, D.b, this.eq + D.c);
                if (!bhVar2.N && projectile.ap != null) {
                    projectile.ap.clear();
                }
            }
        }
        this.bC = (int) (this.bC + 1 + this.eh);
        float f3 = this.cL[i].a;
        boolean z = false;
        if (projectile == null) {
            projectile = Projectile.a(this, D.a, D.b, this.eq + D.c, i);
            if (bhVar2.L && bhVar == null) {
                this.G[i] = projectile;
            }
        } else {
            projectile.g = bhVar2;
            z = true;
        }
        a(projectile, this, i, bhVar2, D.a, D.b, this.eq + D.c, f3);
        bhVar2.a(this, projectile, amVar, f, f2, m());
        if (!z && bhVar2.R == 0.0f && bhVar2.S == 0.0f) {
            projectile.K = K2.x;
            projectile.L = K2.y;
        }
        if (bnVar.G != null) {
            gameEngine.bR.a(D.a, D.b, this.eq + D.c, bnVar.G.intValue());
        }
        if (bnVar.E != null) {
            bnVar.E.a(D.a, D.b, this.eq + D.c, this.cL[i].a, this);
        }
        if (bnVar.D != null) {
            bnVar.D.a(D.a, D.b, 1.0f + com.corrodinggames.rts.gameFramework.f.c(-0.07f, 0.07f));
        }
        if (this.x.eg) {
            this.R = null;
        }
        if (bnVar.ay) {
            this.cL[i].j = null;
        }
        if (this.x.bj && !this.bV) {
            bv();
        }
        if (this.x.bl && !this.bV) {
            a();
            this.bV = true;
        }
        return projectile;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return this.y.i;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int y() {
        if (this.y.o != -1) {
            return this.y.o;
        }
        return super.y();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int u(com.corrodinggames.rts.game.units.am amVar) {
        int a = amVar.mo1r().a(this);
        if (this.x.aX != -1) {
            if (this.x.aY) {
                int i = (int) (this.x.aX + this.cj);
                if (amVar != null) {
                    i = (int) (i + amVar.cj);
                }
                return i + a;
            }
            return this.x.aX + a;
        }
        return y() + a;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int v(com.corrodinggames.rts.game.units.am amVar) {
        int a = amVar.mo1r().a(this);
        if (this.x.aZ != -1) {
            if (this.x.ba) {
                int i = (int) (this.x.aZ + this.cj);
                if (amVar != null) {
                    i = (int) (i + amVar.cj);
                }
                return i + a;
            }
            return this.x.aZ + a;
        }
        return y() + a;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean w(com.corrodinggames.rts.game.units.am amVar) {
        return this.x.ba;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean x(com.corrodinggames.rts.game.units.am amVar) {
        return this.x.aY;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cx() {
        return this.y.r;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float c(com.corrodinggames.rts.game.units.am amVar) {
        return this.x.bb;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float z(com.corrodinggames.rts.game.units.am amVar) {
        float f = this.x.bc;
        if (amVar.g() > 0.0f) {
            f = amVar.g() * this.x.bd;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(com.corrodinggames.rts.game.units.am amVar) {
        return this.x.be;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float b(com.corrodinggames.rts.game.units.am amVar) {
        return this.x.bf;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return this.y.j * this.j;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float aZ() {
        return this.x.ej;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float ba() {
        return this.x.ek;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return this.y.k;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        bn bnVar = this.x.fQ[i];
        if (bnVar.U != null) {
            return bnVar.U.floatValue();
        }
        return this.x.eb;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float x(int i) {
        return this.x.fQ[i].Q;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return this.x.fQ[i].V;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float y(int i) {
        return this.x.fQ[i].W;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return this.x.eo;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cD() {
        return this.x.bH * this.c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float p(int i) {
        return this.x.bI;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float d(boolean z) {
        if (!this.x.dB) {
            return 0.0f;
        }
        if (z && this.x.dD) {
            return this.cL[this.x.dG].a + 90.0f;
        }
        if (this.x.dC) {
            return this.cL[this.x.dG].a + 90.0f;
        }
        return super.d(z);
    }

    static {
        for (int i = 0; i < 10; i++) {
            dX.add(new k());
        }
        dY = true;
        dZ = new HashMap();
        ea = 0;
        eb = VariableScope.nullOrMissingString;
        ec = new PointF();
        ee = new com.corrodinggames.rts.gameFramework.utility.ai();
        ef = new PointF();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public PointF cY() {
        PointF pointF = H;
        l lVar = this.x;
        if (lVar.dC && this.cL[lVar.dG].e != 0.0f && lVar.dF.p != 0.0f) {
            pointF.setSite(G(lVar.dG));
            pointF.moveAdd(-this.eo, -this.ep);
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        return pointF;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF aP() {
        l lVar = this.x;
        PointF cY = cY();
        I.x = cY.x + lVar.cJ;
        I.y = cY.y + lVar.cK;
        return I;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        com.corrodinggames.rts.gameFramework.unitAction.e T;
        float f2;
        float f3;
        l lVar = this.x;
        boolean z = this.bV;
        if (this.dT != null && !z) {
            com.corrodinggames.rts.game.units.custom.b.h.a(this, f, false, false);
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.unitAction.y yVar = gameEngine.bO;
        Paint aN = aN();
        float cD = cD();
        PointF cY = cY();
        aQ();
        int i = lVar.i.a;
        if (i > 0) {
            Object[] a = lVar.i.a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a[i2]).d(this, f);
            }
        }
        if (this.ew) {
            float f4 = (this.eo + cY.x) - gameEngine.cw;
            float f5 = ((this.ep + cY.y) - gameEngine.cx) - this.eq;
            if (cD != 1.0f) {
                yVar.k();
                yVar.a(cD, cD, f4, f5);
            }
            yVar.a(this.M, f4, f5, d(false) - 90.0f, aN);
            if (cD != 1.0f) {
                yVar.l();
            }
        } else {
            RectF cF = cF();
            float f6 = cY.x;
            float f7 = cY.y - this.eq;
            cF.a += f6;
            cF.b += f7;
            cF.c += f6;
            cF.d += f7;
            Rect a_ = a_(false);
            float f8 = (cF.a + cF.c) * 0.5f;
            float f9 = (cF.b + cF.d) * 0.5f;
            yVar.k();
            if (cD != 1.0f) {
                yVar.a(cD, cD, f8, f9);
            }
            yVar.a(d(false), f8, f9);
            yVar.a(this.M, a_, cF, aN);
            yVar.l();
        }
        if (i > 0) {
            Object[] a2 = lVar.i.a();
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a2[i3]).e(this, f);
            }
        }
        com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.units.y) this);
        if (this.dT != null && !z && lVar.ay) {
            com.corrodinggames.rts.game.units.custom.b.h.a(this, f, true, false);
        }
        if (ak() && lVar.fV != null && !z) {
            float e = this.cL[lVar.fV.e].f / e(lVar.fV.e);
            if (e != 0.0f) {
                boolean z2 = true;
                boolean Y = Y();
                if (Y && lVar.bW) {
                    z2 = false;
                } else if (!Y && lVar.bS) {
                    z2 = false;
                }
                if (z2 && lVar.fQ[lVar.fV.e].aF == null) {
                    com.corrodinggames.rts.gameFramework.utility.ai bn = bn();
                    gameEngine.bO.k();
                    gameEngine.bO.b(bn.a - gameEngine.cw, ((bn.b - bn.c) - gameEngine.cx) - this.eq);
                    gameEngine.bO.a(e, e);
                    if (Y) {
                        gameEngine.bO.a(com.corrodinggames.rts.game.units.e.b.f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        gameEngine.bO.a(com.corrodinggames.rts.game.units.e.b.e, 0.0f, 0.0f, (Paint) null);
                    }
                    gameEngine.bO.l();
                }
            }
        }
        if (lVar.fP && !z) {
            int bl = bl();
            for (int i4 = 0; i4 < bl; i4++) {
                float e2 = this.cL[i4].f / e(i4);
                bn bnVar = lVar.fQ[i4];
                if (bnVar != null && e2 != 0.0f && bnVar.aF != null) {
                    com.corrodinggames.rts.gameFramework.utility.y.a(this, bnVar.aF, e2, i4);
                }
            }
        }
        if (!z && this.cx > 0.0f && this.cz == 0.0f && (T = T()) != null) {
            if (!lVar.cU) {
                f2 = 0.0f + 0.09f + ((this.cx / this.cA) * 0.4f) + ((com.corrodinggames.rts.gameFramework.f.b(this.cy, 50.0f) / 50.0f) * 0.5f);
            } else {
                float b = 0.0f + ((com.corrodinggames.rts.gameFramework.f.b(this.cy, 50.0f) / 50.0f) * 0.5f);
                float f10 = this.cy;
                if (f10 > 5.0f) {
                    f10 = 5.0f;
                }
                f2 = b + ((f10 / 5.0f) * 0.2f);
            }
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (this.J == null) {
                    this.J = com.corrodinggames.rts.gameFramework.utility.y.a();
                }
                Paint paint = this.J;
                paint.a((int) (f2 * 255.0f), 255, 255, 255);
                float f11 = this.eo - gameEngine.cw;
                float f12 = (this.ep - gameEngine.cx) - this.eq;
                if (!lVar.av) {
                    f3 = ((lVar.df * 2) / 87.0f) * 1.25f;
                } else {
                    f3 = ((lVar.df * 2) / T.p) * 1.25f;
                }
                gameEngine.bO.k();
                gameEngine.bO.a(f3, f3, f11, f12);
                gameEngine.bO.a(T, f11, f12, d(false) - 90.0f, paint);
                gameEngine.bO.l();
            }
        }
        if (i > 0) {
            Object[] a3 = lVar.i.a();
            for (int i5 = i - 1; i5 >= 0; i5--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a3[i5]).c(this, f);
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e T() {
        return this.x.au;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return this.x.dN;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return this.x.dO;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bi() {
        return this.x.dX;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bj() {
        return this.x.dY;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return this.x.ep;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ag() {
        return this.x.er.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        return this.x.eq.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ae() {
        return this.x.es.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ah() {
        if (this.x.et == null) {
            return true;
        }
        return this.x.et.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean k(com.corrodinggames.rts.game.units.am amVar) {
        l lVar = this.x;
        if (lVar.eu) {
            if (lVar.ev != null && !g.a(lVar.ev, amVar.de())) {
                return false;
            }
            if (lVar.ew != null && g.a(lVar.ew, amVar.de())) {
                return false;
            }
            if (lVar.ex) {
                boolean z = false;
                for (int i = 0; i < lVar.fQ.length; i++) {
                    bn bnVar = lVar.fQ[i];
                    if ((bnVar.P == null || !g.a(bnVar.P, amVar.de())) && (bnVar.O == null || g.a(bnVar.O, amVar.de()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
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

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return this.x.ey;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return this.x.fQ[i].X;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z(int i) {
        return this.x.fQ[i].ab;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A(int i) {
        return this.x.fQ[i].ah;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B(int i) {
        return this.x.fQ[i].j;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C(int i) {
        float f;
        float f2;
        bn bnVar = this.x.fQ[i];
        if (bnVar.w != -1) {
            f = this.cL[bnVar.w].a;
        } else {
            f = this.cg;
        }
        if (this.ci && bc() > 0.95d) {
            f2 = f + bnVar.k;
        } else {
            f2 = f + bnVar.j;
        }
        if (bnVar.ar != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bm() {
        return this.x.dL;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        bn bnVar = this.x.fQ[i];
        if (!bnVar.B) {
            return 0.0f;
        }
        bh bhVar = this.x.fR[bnVar.a(this)];
        float f = 0.0f;
        if (!bhVar.s) {
            f = 0.0f + bhVar.b;
        }
        float f2 = f + bhVar.c;
        if (!bhVar.aN) {
            f2 *= this.y.f;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return this.x.fQ[i].m * this.y.e;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return this.x.fQ[i].n;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i) {
        return this.x.fQ[i].o;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean s(int i) {
        return this.x.fQ[i].s;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float t(int i) {
        bn bnVar = this.x.fQ[i];
        if (bnVar.t == 0.0f || bnVar.n == 0.0f) {
            return 0.0f;
        }
        return -(bnVar.t * (this.cL[i].f / bnVar.n));
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean r(int i) {
        if (this.x.fQ[i].B) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void b(com.corrodinggames.rts.game.units.am amVar, int i) {
        bn bnVar = this.x.fQ[i];
        if (bnVar.F != null) {
            PointF E = E(i);
            bnVar.F.a(E.x, E.y, this.eq, this.cL[i].a, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean u(int i) {
        if (!a(this.x.fQ[i])) {
            return false;
        }
        return super.u(i);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int s(com.corrodinggames.rts.game.units.am amVar) {
        return this.x.eB;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bO() {
        return this.x.eD;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bP() {
        return this.x.eE;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return this.y.b;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cG() {
        return this.x.aq;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        float f;
        if (z && !this.x.aq) {
            return super.a_(z);
        }
        if (this.bV) {
            return super.a_(z);
        }
        l lVar = this.x;
        int i = this.a;
        int i2 = 0;
        m mVar = lVar.dI;
        if (this.b.a != null && this.b.a.k != null) {
            mVar = this.b.a.k;
        }
        if (mVar != null) {
            float f2 = mVar.b;
            if (f2 < 0.0f) {
                f2 = -f2;
                f = -this.cg;
                if (mVar.a) {
                    f = -this.cL[lVar.dG].a;
                }
            } else {
                f = this.cg;
                if (mVar.a) {
                    f = this.cL[lVar.dG].a;
                }
            }
            int i3 = (int) (360.0f / f2);
            int i4 = ((int) (((f - mVar.e) - (f2 * 0.5f)) / f2)) % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            if (mVar.c > 0) {
                i += i4 * mVar.c;
            }
            if (mVar.d > 0) {
                i2 = 0 + (i4 * mVar.d);
            }
        }
        if (i >= lVar.V) {
            i2 += i / lVar.V;
            i %= lVar.V;
        }
        return super.a(z, i, i2);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public RectF cF() {
        RectF cF = super.cF();
        if (this.x.ak) {
            cF.a(this.x.ah, this.x.ai - this.x.aj);
        }
        return cF;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        if (this.x == null) {
            return 1;
        }
        return this.x.fQ.length;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int v(int i) {
        return this.x.fQ[i].x;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.utility.ai F(int i) {
        return a(i, false);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i) {
        com.corrodinggames.rts.gameFramework.utility.ai a = a(i, false);
        K.x = a.a;
        K.y = a.b;
        return K;
    }

    public com.corrodinggames.rts.gameFramework.utility.ai a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        bn bnVar = this.x.fQ[i];
        if (bnVar.w == -1) {
            f = this.eo;
            f2 = this.ep;
            f3 = 0.0f;
            f4 = this.cg;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            com.corrodinggames.rts.gameFramework.utility.ai a = a(bnVar.w, true);
            f = a.a;
            f2 = a.b;
            f3 = a.c;
            f4 = this.cL[bnVar.w].a;
        }
        if (this.cL[i].e > 0.0f && bnVar.p != 0.0f) {
            float f5 = 0.0f;
            float b = (b(i) + t(i)) - this.cL[i].e;
            if (b < bnVar.q) {
                f5 = (b / bnVar.q) * bnVar.p;
            } else if (b < bnVar.q + bnVar.r) {
                f5 = bnVar.p - (((b - bnVar.q) / bnVar.r) * bnVar.p);
            }
            if (f5 != 0.0f) {
                f += com.corrodinggames.rts.gameFramework.f.k(this.cL[i].a) * f5;
                f2 += com.corrodinggames.rts.gameFramework.f.j(this.cL[i].a) * f5;
            }
        }
        float f6 = bnVar.f;
        float f7 = bnVar.g;
        float f8 = bnVar.h;
        if (f6 != 0.0f || f7 != 0.0f) {
            float j = com.corrodinggames.rts.gameFramework.f.j(f4);
            float k = com.corrodinggames.rts.gameFramework.f.k(f4);
            f += (k * f7) - (j * f6);
            f2 += ((j * f7) + (k * f6)) * bnVar.i;
        }
        dK.a = f;
        dK.b = f2;
        dK.c = f3 + f8;
        return dK;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        if (this.z != null) {
            return this.z.a(V());
        }
        return this.x.a(V());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.s a(com.corrodinggames.rts.game.units.a.c cVar) {
        l lVar;
        if (this.z != null) {
            lVar = this.z;
        } else {
            lVar = this.x;
        }
        return lVar.a(cVar);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int V() {
        return this.x.cl;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.s e(com.corrodinggames.rts.game.units.as asVar) {
        return this.dL.b(asVar);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z, PointF pointF, com.corrodinggames.rts.game.units.am amVar) {
        if (sVar == com.corrodinggames.rts.game.units.e.i.i) {
            if (!z) {
                L();
            } else {
                M();
            }
        } else if (sVar == com.corrodinggames.rts.game.units.e.i.j) {
            if (!z) {
                M();
            }
        } else {
            if (!z) {
                if (pointF != null && !a(sVar, pointF.x, pointF.y)) {
                    return;
                }
                if (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) {
                    com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) sVar;
                    if (gVar.a.ax != null) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        if (this.bX == gameEngine.playerTeam && !gameEngine.I()) {
                            gVar.a.ax.a();
                        }
                    }
                    if (gVar.a.at != null) {
                        gVar.a.at.a(this.eo, this.ep, this.eq, this.cg, this);
                    }
                }
            }
            if (z && (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) && !((com.corrodinggames.rts.game.units.custom.a.g) sVar).a.M) {
                return;
            }
            com.corrodinggames.rts.game.units.d.j a = this.dL.a(sVar, z, pointF, amVar);
            if (!z) {
                if (a != null) {
                    a(af.queueItemAdded, (com.corrodinggames.rts.game.units.am) null, sVar.P(), (VariableScope) null);
                }
            } else if (a != null) {
                a(af.queueItemCancelled, (com.corrodinggames.rts.game.units.am) null, sVar.P(), (VariableScope) null);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        a(sVar, z, (PointF) null, (com.corrodinggames.rts.game.units.am) null);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void b(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        this.dL.a(sVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar) {
        this.dL.a(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(com.corrodinggames.rts.game.units.a.s sVar, float f, float f2) {
        if (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) sVar;
            if (gVar.a.ag != null && gVar.a.ah == null) {
                if (gVar.a.ag.intValue() >= this.x.fQ.length) {
                    a("checkTargetedActionOrder: " + gVar.a.ag + " larger than max turret size");
                    return true;
                } else if (!a(this.x.fQ[gVar.a.ag.intValue()], gVar.a.ag.intValue(), f, f2, true)) {
                    return false;
                } else {
                    if (gVar.a.al != null && com.corrodinggames.rts.gameFramework.utility.y.a(f, f2, gVar.a.al)) {
                        if (this.bX == gameEngine.playerTeam) {
                            gameEngine.bS.b("Invalid map location (Must be passable by " + gVar.a.al.name() + ")");
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z, float f, float f2) {
        com.corrodinggames.rts.game.units.a.s a;
        if ((sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) && (a = a(sVar.N())) != null) {
            com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) a;
            Integer num = gVar.a.ag;
            if (num != null && gVar.a.ah == null && num.intValue() < this.x.fQ.length) {
                bn bnVar = this.x.fQ[num.intValue()];
                if (bnVar.ag > 0.0f) {
                    com.corrodinggames.rts.gameFramework.utility.y.b((com.corrodinggames.rts.game.units.am) this, bnVar.ag, true);
                }
                com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.units.am) this, bnVar.ad, true, true);
            }
            if (z && gVar.a.am != null) {
                gVar.a.am.a(this, f, f2);
            }
        }
        super.a(sVar, z, f, f2);
    }

    public boolean a(com.corrodinggames.rts.game.units.a.s sVar, PointF pointF, com.corrodinggames.rts.game.units.am amVar, int i, int i2) {
        PointF pointF2 = null;
        com.corrodinggames.rts.game.units.am amVar2 = null;
        int i3 = 0;
        if (i > 0) {
            pointF2 = dM;
            amVar2 = dN;
            i3 = dO;
        }
        dM = pointF;
        dN = amVar;
        dO = i2;
        boolean a = a(sVar, pointF, amVar, i);
        dM = pointF2;
        dN = amVar2;
        dO = i3;
        return a;
    }

    public boolean a(com.corrodinggames.rts.game.units.a.s sVar, PointF pointF, com.corrodinggames.rts.game.units.am amVar, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (i > 10) {
            return false;
        }
        sVar.a(this, amVar);
        if (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) {
            com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) sVar;
            com.corrodinggames.rts.game.units.custom.a.d dVar = gVar.a;
            if (dVar.t != null && !dVar.t.read(this)) {
                return true;
            }
            boolean z = false;
            if (dVar.ad != null) {
                this.cB += gVar.a.ad.floatValue();
                z = true;
            }
            if (dVar.ae != null) {
                dVar.ae.h(this);
                z = true;
            }
            if (dVar.af != null) {
                dVar.af.a((com.corrodinggames.rts.game.units.am) this, this.bX.E(), true);
                z = true;
            }
            if (dVar.aH != null) {
                if (dVar.aH.read(this)) {
                    this.bA = gameEngine.by;
                }
                z = true;
            }
            if (dVar.ag != null) {
                PointF pointF2 = pointF;
                for (int i2 = 0; i2 < dVar.ak; i2++) {
                    if (dVar.ah != null) {
                        pointF2 = new PointF();
                        if (dVar.ai == null) {
                            pointF2.setSite(this.eo, this.ep);
                        } else {
                            com.corrodinggames.rts.game.units.am readUnit = dVar.ai.readUnit(this);
                            if (readUnit != null) {
                                pointF2.setSite(readUnit.eo, readUnit.ep);
                            } else {
                                pointF2.setSite(this.eo, this.ep);
                            }
                        }
                        float k = com.corrodinggames.rts.gameFramework.f.k(this.cg);
                        float j = com.corrodinggames.rts.gameFramework.f.j(this.cg);
                        float f = dVar.ah.x;
                        float f2 = dVar.ah.y;
                        pointF2.moveAdd((k * f2) - (j * f), (j * f2) + (k * f));
                    }
                    if (pointF2 == null) {
                        GameNetEngine.g("completeQueueItem:" + gVar.N() + " for fireTurretXAtGround needs points but it is missing");
                    } else {
                        a((com.corrodinggames.rts.game.units.am) null, pointF2.x, pointF2.y, gVar.a.ag.intValue(), gVar.a.aj, i);
                    }
                }
                z = true;
            }
            if (dVar.as != null) {
                dVar.as.a(this.eo, this.ep, this.eq, this.cg, this);
                z = true;
            }
            if (dVar.au != null) {
                dVar.au.a(this.eo, this.ep, 1.0f);
                z = true;
            }
            if (dVar.av != null && !gameEngine.I()) {
                dVar.av.a();
                z = true;
            }
            if (dVar.aw != null) {
                if (this.bX == gameEngine.playerTeam && !gameEngine.I()) {
                    dVar.aw.a();
                }
                z = true;
            }
            if (dVar.ac.a > 0) {
                Object[] a = dVar.ac.a();
                for (int i3 = 0; i3 < dVar.ac.a; i3++) {
                    if (((com.corrodinggames.rts.game.units.custom.a.a) a[i3]).a(this, sVar, pointF, amVar, i)) {
                        z = true;
                    }
                }
            }
            PointF pointF3 = pointF;
            com.corrodinggames.rts.game.units.am amVar2 = amVar;
            if ((dVar.ap != null || gVar.a.aq != null) && dVar.an != null) {
                amVar2 = dVar.an.readUnit(this);
                pointF3 = new PointF();
                if (amVar2 != null) {
                    pointF3.x = amVar2.eo;
                    pointF3.y = amVar2.ep;
                } else {
                    pointF3.x = this.eo;
                    pointF3.y = this.ep;
                }
            }
            if (dVar.ap != null) {
                if (dVar.ao == null || dVar.ao.read(this)) {
                    int i4 = 1;
                    if (dVar.ar != null) {
                        i4 = (int) dVar.ar.readNumber(this);
                        if (i4 > 10000) {
                            i4 = 10000;
                        }
                    }
                    for (int i5 = 0; i5 < i4; i5++) {
                        gVar.a.ap.a(this, pointF3, amVar2, i + 1, i5);
                    }
                }
                z = true;
            }
            if (gVar.a.aq != null) {
                if (dVar.ao == null || dVar.ao.read(this)) {
                    gVar.a.aq.a(this, pointF3, amVar2);
                }
                z = true;
            }
            l lVar = null;
            if (dVar.H != null) {
                lVar = dVar.H.c();
            }
            if (lVar != null) {
                if (GameEngine.aw) {
                    GameEngine.print(c() + ": converting unit: " + sVar.O());
                }
                if (!(lVar instanceof l)) {
                    com.corrodinggames.rts.game.units.am a2 = lVar.a();
                    a2.eo = this.eo;
                    a2.ep = this.ep;
                    if (!a2.bI()) {
                        a2.cg = this.cg;
                    }
                    a2.f(this.bX);
                    a2.B(null);
                    float f3 = this.cv;
                    float f4 = a2.cv;
                    if (f3 == 0.0f) {
                        a2.o(a2.cv);
                    } else {
                        a2.o((this.cu / f3) * f4);
                    }
                    if (this.cG) {
                        GameEngine.getGameEngine().bS.k(a2);
                    }
                    PlayerData.c(a2);
                    ci();
                } else {
                    h hVar = null;
                    if (dVar.Q) {
                        hVar = de();
                    }
                    PlayerData.b((com.corrodinggames.rts.game.units.am) this);
                    this.z = null;
                    a(lVar, false, false, dVar.R);
                    if (hVar != null) {
                        a(hVar, true);
                    }
                    S();
                    this.dL.e();
                    this.bB = GameEngine.getGameEngine().by;
                    PlayerData.c(this);
                }
                z = true;
                if (!gVar.B().c()) {
                    W();
                }
            }
            if (!z && dVar.n) {
                GameEngine.m5e("completeQueueItem:" + gVar.N() + " had no effect (but should have)");
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void b(com.corrodinggames.rts.game.units.d.j jVar) {
        com.corrodinggames.rts.game.units.a.s a = a(jVar.j);
        if (a != null && (a instanceof com.corrodinggames.rts.game.units.custom.a.g)) {
            com.corrodinggames.rts.game.units.custom.a.d dVar = ((com.corrodinggames.rts.game.units.custom.a.g) a).a;
            if (dVar.ab != null) {
                ec.x = this.eo;
                ec.y = this.ep;
                dVar.ab.a(this, ec, null, 0, 0);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public boolean c(com.corrodinggames.rts.game.units.d.j jVar) {
        return true;
    }

    public void i(boolean z) {
        this.dL.a(z);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void a(com.corrodinggames.rts.game.units.d.j jVar) {
        float f;
        com.corrodinggames.rts.game.units.a.s a = a(jVar.j);
        if (a != null && a(a, jVar.h, jVar.i, 0, 0)) {
            return;
        }
        float f2 = 0.0f;
        if (this.x.aH && this.x.dk != null) {
            f2 = this.cg + this.x.dk.floatValue() + 90.0f;
        }
        if (this.x.dn != null) {
            f = this.x.dn.floatValue();
        } else if (this.dL.b != null) {
            f = this.cj * 3.0f;
        } else {
            f = this.cj * 2.0f;
        }
        com.corrodinggames.rts.game.units.am a2 = this.dL.a(jVar, f, this.r, f2);
        if (a2 != null) {
            F(a2);
            PlayerData.c(a2);
            a(af.queuedUnitFinished, a2);
        }
    }

    public void E(com.corrodinggames.rts.game.units.am amVar) {
        float f = 0.0f;
        if (this.x.aH && this.x.dk != null) {
            f = this.cg + this.x.dk.floatValue() + 90.0f;
        }
        amVar.cg = 90.0f + f;
        float f2 = 70.0f;
        if (this.x.dn != null) {
            f2 = this.x.dn.floatValue();
        }
        this.dL.a(amVar, f2, this.r);
    }

    public void F(com.corrodinggames.rts.game.units.am amVar) {
        amVar.eo = this.eo + this.x.di;
        amVar.ep = this.ep + this.x.dj;
        if (!this.x.aH) {
            float f = 180.0f;
            if (this.x.dk != null) {
                f = this.x.dk.floatValue();
            }
            float f2 = 70.0f;
            if (this.x.dn != null) {
                f2 = this.x.dn.floatValue();
            }
            boolean a = com.corrodinggames.rts.game.units.e.i.a(this, amVar, this.r, 7.0f, f, f2, this.x.di, this.x.dj);
            if (!this.x.dm) {
                amVar.eq = this.eq;
            }
            amVar.eq += this.x.dl;
            if (amVar instanceof j) {
                ((j) amVar).dF();
            }
            if ((i() || !a || this.x.eU.read(this)) && cr()) {
                C(amVar);
            }
        }
        this.r = !this.r;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.game.units.custom.d.b by() {
        com.corrodinggames.rts.gameFramework.utility.m g = this.dL.g();
        int size = g.size();
        if (size == 0) {
            return com.corrodinggames.rts.game.units.custom.d.b.a;
        }
        com.corrodinggames.rts.game.units.custom.d.b bVar = new com.corrodinggames.rts.game.units.custom.d.b();
        Object[] a = g.a();
        for (int i = 0; i < size; i++) {
            com.corrodinggames.rts.game.units.a.s a2 = a(((com.corrodinggames.rts.game.units.d.j) a[i]).j);
            if (a2 != null && (a2 instanceof com.corrodinggames.rts.game.units.custom.a.g)) {
                com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) a2;
                if (gVar.a.ad != null) {
                    bVar.c += gVar.a.ad.floatValue();
                }
                if (gVar.a.ae != null) {
                    com.corrodinggames.rts.game.units.custom.d.b bVar2 = gVar.a.ae;
                    if (!bVar2.c()) {
                        bVar = com.corrodinggames.rts.game.units.custom.d.b.a(bVar, bVar2);
                    }
                }
                if (gVar.a.af != null) {
                    com.corrodinggames.rts.game.units.custom.d.b bVar3 = gVar.a.af;
                    if (!bVar3.c()) {
                        bVar = com.corrodinggames.rts.game.units.custom.d.b.a(bVar, bVar3);
                    }
                }
            }
        }
        return bVar;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public boolean dA() {
        return this.x.eM > 0 && dI() > this.x.eM;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public int h(com.corrodinggames.rts.game.units.as asVar) {
        return this.dL.a(asVar);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public int f(boolean z) {
        return this.dL.a(com.corrodinggames.rts.game.units.a.s.i, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public int a(com.corrodinggames.rts.game.units.a.c cVar, boolean z) {
        return this.dL.a(cVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public com.corrodinggames.rts.game.units.d.j dw() {
        return this.dL.b();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.game.units.custom.d.b bD() {
        return this.dL.c();
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public com.corrodinggames.rts.gameFramework.utility.m dx() {
        return this.dL.c;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void dz() {
        this.dL.e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public boolean dy() {
        return this.dL.a();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int a(g gVar) {
        return this.dL.a(gVar);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void a(PointF pointF) {
        if (this.x.dc) {
            this.dL.b = pointF;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float x() {
        if (!this.x.t) {
            return -1.0f;
        }
        return super.x();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bU() {
        return this.x.u;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bV() {
        if (bT() && !this.dL.a() && this.x.z) {
            return this.dL.e;
        }
        return super.bV();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bW() {
        if (this.y.d > 0.0f && this.cB < this.y.d && this.x.v) {
            return this.cB / this.y.d;
        }
        if (this.cA > 0.0f && this.cx < this.cA && this.x.y) {
            return this.cx / this.cA;
        }
        if (this.y.d == 0.0f && this.cA == 0.0f) {
            if (this.x.em != -1 && this.cL[this.x.em].e > 0.0f) {
                return 1.0f - (this.cL[this.x.em].e / b(this.x.em));
            }
            if (this.x.en != -1 && this.cL[this.x.en].f != 0.0f) {
                return this.cL[this.x.en].f / e(this.x.en);
            }
        }
        return super.bW();
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean f(float f) {
        return super.f(f);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void p(float f) {
        int i = this.x.i.a;
        if (i > 0) {
            Object[] a = this.x.i.a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((com.corrodinggames.rts.game.units.custom.b.a) a[i2]).f(this, f);
            }
        }
        super.p(f);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void ca() {
        if (this.dL.b != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.bO.a((int) (this.eo - gameEngine.cw), (int) (this.ep - gameEngine.cx), (int) (this.dL.b.x - gameEngine.cw), (int) (this.dL.b.y - gameEngine.cx), com.corrodinggames.rts.game.units.d.i.y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void cb() {
        boolean z = false;
        if ((this.y.i > 70.0f && this.x.ep && this.x.dK == null) || (this.x.dK != null && this.x.dK.booleanValue())) {
            com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.units.am) this, m(), true);
            z = true;
        } else if (this.x.aH && this.y.o > 50 && !this.x.ep) {
            com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.units.am) this, this.y.o, true);
            z = true;
        }
        if (this.x.o.size() != 0) {
            Iterator it = this.x.o.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.units.am) this, ((y) it.next()).a, true);
                z = true;
            }
        }
        if (this.x.bF) {
            int bl = bl();
            for (int i = 0; i < bl; i++) {
                bn bnVar = this.x.fQ[i];
                if (bnVar.ak != null && bnVar.al > 0.0f) {
                    int i2 = 90;
                    if (z) {
                        i2 = 40;
                    }
                    com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.units.am) this, bnVar.al, Color.a(i2, 35, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 35), 1, true);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void d(float f) {
        super.d(f);
        if (this.bV) {
            return;
        }
        this.dI.a(f, this);
        if (this.x.al != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            float f2 = this.eo - gameEngine.cw;
            float f3 = (this.ep - gameEngine.cx) - this.eq;
            float cD = cD();
            if (cD != 1.0f) {
                gameEngine.bO.k();
                gameEngine.bO.a(cD, cD, f2, f3);
            }
            if (this.x.am) {
                int i = this.x.al.p;
                int i2 = this.x.al.q;
                int i3 = i / 2;
                int i4 = i2 / 2;
                du.a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                dv.a(0, 0, 0 + i, 0 + i2);
            } else {
                du.a(f2 - this.eu, f3 - this.ev, f2 + this.eu, f3 + this.ev);
                dv.a(0, 0, 0 + this.es, 0 + this.et);
            }
            gameEngine.bO.a(this.x.al, dv, du, aN());
            if (cD != 1.0f) {
                gameEngine.bO.l();
            }
        }
        if (this.x.az && this.dT != null && !this.bV) {
            com.corrodinggames.rts.game.units.custom.b.h.a(this, f, false, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float aM() {
        return this.x.dH;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public Paint aN() {
        return super.aN();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean aV() {
        return this.x.eF;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bI() {
        return this.x.aH;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean q() {
        if (this.cO != null && this.cO.cm < 1.0f) {
            return true;
        }
        return this.x.aK;
    }

    private boolean H(com.corrodinggames.rts.game.units.am amVar) {
        if (amVar.q() || amVar == this) {
            return false;
        }
        if (amVar.bI()) {
            if (this.x.aU) {
                return true;
            }
            return false;
        } else if (this.x.aV) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(com.corrodinggames.rts.game.units.am amVar) {
        if (this.x.fo != null && !g.a(this.x.fo, amVar.de())) {
            return false;
        }
        return H(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean l(com.corrodinggames.rts.game.units.am amVar) {
        if (amVar.g() != 0.0f && h(amVar, true)) {
            return true;
        }
        if (this.x.fn != null && !g.a(this.x.fn, amVar.de())) {
            return false;
        }
        return H(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void m(com.corrodinggames.rts.game.units.am amVar) {
        com.corrodinggames.rts.gameFramework.ab abVar;
        if (this.x.bi) {
            com.corrodinggames.rts.game.units.au ar = ar();
            if (ar != null && (abVar = ar.i) != null) {
                abVar.a(ar);
            }
            if (this.cG && amVar != null) {
                GameEngine.getGameEngine().bS.k(amVar);
            }
            ci();
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean al() {
        if (this.x.bi) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public boolean aj() {
        return this.x.fq;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cu() {
        return this.x.fN;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public boolean ak() {
        return this.x.fp;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean g(com.corrodinggames.rts.game.units.am amVar, boolean z) {
        if (!h(amVar, z)) {
            return false;
        }
        if (z && amVar.c((com.corrodinggames.rts.game.units.y) this)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean h(com.corrodinggames.rts.game.units.am amVar, boolean z) {
        if (!this.x.fk) {
            return false;
        }
        if (this.x.fl != null && !g.a(this.x.fl, amVar.de())) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int cS() {
        return this.x.fm;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bJ() {
        return this.x.fu;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
        super.a(f, z);
        if (!this.bV && ak()) {
            if (Y()) {
                if (!this.x.bW) {
                    com.corrodinggames.rts.game.units.e.b.b(f, this);
                }
            } else if (!this.x.bS) {
                com.corrodinggames.rts.game.units.e.b.b(f, this);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean o() {
        return this.x.cy;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean p() {
        return this.x.cz;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cO() {
        return this.x.cA;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void f(PlayerData playerData) {
        if (this.x.cE) {
            b(PlayerData.h);
        } else if (this.x.cD && this.B.size() == 0) {
            b(PlayerData.i);
        } else {
            super.f(playerData);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void B(com.corrodinggames.rts.game.units.am amVar) {
        super.B(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float g() {
        return this.x.cF;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int cQ() {
        return this.x.cG;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public h cR() {
        return this.x.cH;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void cP() {
        if (this.x.bh == 0.0f && g() > 0.0f) {
            PlayerData.b((com.corrodinggames.rts.game.units.am) this);
            this.cm = 1.0f;
            PlayerData.c(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cp() {
        if (this.x.eM != 0) {
            return com.corrodinggames.rts.game.units.e.i.i.N();
        }
        return super.cp();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float L(int i) {
        return this.x.fQ[i].af;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF K(int i) {
        Projectile projectile;
        PointF K2 = super.K(i);
        if (this.x.eA) {
            if (this.x.fR[this.x.fQ[i].a(this)].M && this.G != null && (projectile = this.G[i]) != null && !projectile.ej) {
                K2.x += projectile.K;
                K2.y += projectile.L;
            }
        }
        return K2;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public float bd() {
        return this.y.d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.game.units.b be() {
        return this.x.ec;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bf() {
        if (this.x.ef) {
            return false;
        }
        if (this.x.ec == com.corrodinggames.rts.game.units.b.bomber) {
            com.corrodinggames.rts.game.units.au ar = ar();
            if ((ar != null && (ar.d() == com.corrodinggames.rts.game.units.av.attackMove || ar.d() == com.corrodinggames.rts.game.units.av.patrol)) || this.P == com.corrodinggames.rts.game.units.a.outOfRange) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bX() {
        return this.v;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bg() {
        return this.x.ei;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return this.x.el;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void f(float f, float f2) {
        super.f(f, f2);
        a(af.teleported);
        float f3 = this.cg;
        if (this.x.dE) {
            f3 = this.cL[this.x.dG].a;
        }
        this.dP = this.eo;
        this.dQ = this.ep;
        this.dR = this.eq;
        this.dS = f3;
    }

    public void du() {
        if (this.x.ax == null && this.dT == null) {
            return;
        }
        if (this.x.ax == null || this.x.ax.length == 0) {
            this.dT = null;
        } else if (this.dT == null || this.dT.length != this.x.ax.length) {
            this.dT = new com.corrodinggames.rts.game.units.custom.b.i[this.x.ax.length];
            for (int i = 0; i < this.x.ax.length; i++) {
                com.corrodinggames.rts.game.units.custom.b.i iVar = new com.corrodinggames.rts.game.units.custom.b.i();
                this.dT[i] = iVar;
                iVar.a = i;
                iVar.s = this.x.ax[i].r;
            }
            float f = this.cg;
            if (this.x.dE) {
                f = this.cL[this.x.dG].a;
            }
            this.dP = this.eo;
            this.dQ = this.ep;
            this.dR = this.eq;
            this.dS = f;
            dv();
            for (int i2 = 0; i2 < this.x.ax.length; i2++) {
                this.dT[i2].m = true;
            }
        }
    }

    public void dv() {
        com.corrodinggames.rts.game.units.custom.b.h.a.b(this, 0.0f);
    }

    public void dB() {
        if (this.dT != null) {
            for (int i = 0; i < this.dT.length; i++) {
                this.dT[i].n = true;
                this.dT[i].m = true;
            }
            dv();
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int aT() {
        if (this.x.fV == null) {
            return -1;
        }
        return this.x.fV.e;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int s() {
        return this.y.n;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public void c(boolean z) {
        l lVar = this.x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.cN != null || this.cO != null) {
            return;
        }
        int i = this.y.n;
        if (this.cm < 1.0f && lVar.dh != -1) {
            i = lVar.dh;
        }
        if (i > 0) {
            gameEngine.bL.a(this.eo, this.ep, i, this.bX, z);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect cc() {
        return this.x.cX;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect ce() {
        return this.x.cZ;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect cd() {
        return this.x.cY;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(int i, float f) {
        float C;
        bn bnVar = this.x.fQ[i];
        if (bnVar.as != 0.0f) {
            boolean z = true;
            if (bnVar.av != null && !bnVar.av.read(this)) {
                z = false;
            }
            if (z) {
                com.corrodinggames.rts.game.units.ap apVar = this.cL[i];
                if (bnVar.ar != 0.0f) {
                    C = apVar.a;
                } else if (!bnVar.aq) {
                    C = apVar.b;
                } else {
                    C = C(i);
                }
                apVar.k += f;
                float f2 = f * bnVar.au;
                if (apVar.l > 0.0f) {
                    if (apVar.l < Float.POSITIVE_INFINITY && a(f2, C + apVar.l, i) == 0.0f) {
                        apVar.l = Float.POSITIVE_INFINITY;
                    }
                } else if (apVar.l > Float.NEGATIVE_INFINITY && a(f2, C + apVar.l, i) == 0.0f) {
                    apVar.l = Float.NEGATIVE_INFINITY;
                }
                if (apVar.k > bnVar.at) {
                    apVar.k = -com.corrodinggames.rts.gameFramework.f.a(this, 0, (int) bnVar.aw);
                    float f3 = bnVar.as;
                    if (bnVar.ax > 0.0f) {
                        f3 += com.corrodinggames.rts.gameFramework.f.b(this, 0.0f, bnVar.ax, i);
                    }
                    apVar.l = apVar.l > 0.0f ? -f3 : f3;
                    return false;
                }
                return false;
            }
        }
        if (bnVar.ar != 0.0f) {
            this.cL[i].a += bnVar.ar * f;
            if (this.cL[i].a > 180.0f) {
                this.cL[i].a -= 360.0f;
            }
            if (this.cL[i].a < -180.0f) {
                this.cL[i].a += 360.0f;
                return false;
            }
            return false;
        }
        return bnVar.aq;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int cw() {
        return this.x.eZ;
    }

    public ArrayList dC() {
        dU.clear();
        ArrayList N = N();
        if (N.size() != 0) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) it.next();
                if (sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) {
                    com.corrodinggames.rts.game.units.custom.a.g gVar = (com.corrodinggames.rts.game.units.custom.a.g) sVar;
                    if (gVar.c == com.corrodinggames.rts.game.units.custom.a.e.upgrade) {
                        dU.add(gVar);
                    }
                }
            }
        }
        return dU;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        ArrayList dC = dC();
        if (dC.size() > 0) {
            return ((com.corrodinggames.rts.game.units.a.s) dC.get(0)).N();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList dC = dC();
        if (dC.size() < 2) {
            return;
        }
        dC.remove(0);
        Iterator it = dC.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.corrodinggames.rts.game.units.a.s) it.next()).N());
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cZ() {
        return this.x.da;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float da() {
        return this.x.db;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public void bv() {
        PlayerData.a((com.corrodinggames.rts.game.units.am) this);
        this.dL.a(true);
        super.bv();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void dc() {
        this.eq = 170.0f;
        this.f = 1.5f;
        dB();
        super.dc();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dd() {
        return this.x.cm;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int bp() {
        return this.x.bq;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(int i, float f) {
        this.cL[i].a += f;
        if (this.x.fU) {
            for (int i2 = 0; i2 < this.x.fQ.length; i2++) {
                if (this.x.fQ[i2].w == i) {
                    this.cL[i2].a += f;
                    this.cL[i2].a(2);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float db() {
        return super.db() + this.x.dg;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H(int i) {
        return this.x.fQ[i].p;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float I(int i) {
        return this.x.fQ[i].q;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float J(int i) {
        return this.x.fQ[i].r;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(com.corrodinggames.rts.game.units.am amVar, float f, Projectile projectile) {
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && this.cO != null && dn.j) {
            int i = 0;
            if (projectile != null) {
                i = projectile.aD;
            }
            if (i >= 0) {
                Projectile a = Projectile.a(projectile);
                if (dn.k) {
                    a.am = 0.0f;
                }
                f = this.cO.a(amVar, f, a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (J()) {
            f = 0.0f;
        }
        if (this.y.l > 0.0f && f > this.x.cN) {
            float f2 = this.y.l;
            if (projectile != null) {
                f2 -= projectile.an;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            f -= f2;
            if (f < this.x.cN) {
                f = this.x.cN;
            }
        }
        if (projectile != null) {
            a(af.tookDamage, amVar, projectile.aE, (VariableScope) null);
        } else {
            a(af.tookDamage, amVar);
        }
        return super.a(amVar, f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float aU() {
        return this.x.dJ;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ac() {
        if (!this.x.eh) {
            return false;
        }
        return super.ac();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(com.corrodinggames.rts.game.units.ag agVar) {
        if (agVar == com.corrodinggames.rts.game.units.ag.attack) {
            return this.x.f1do.a();
        }
        if (agVar == com.corrodinggames.rts.game.units.ag.move) {
            return this.x.dp.a();
        }
        if (agVar == com.corrodinggames.rts.game.units.ag.newSelection) {
            return this.x.dq.a();
        }
        return false;
    }

    public void b(af afVar) {
        l lVar = this.x;
        if (lVar.gq.a == 0) {
            return;
        }
        Object[] a = lVar.gq.a();
        for (int i = lVar.gq.a - 1; i >= 0; i--) {
            ae aeVar = (ae) a[i];
            if (aeVar.a == afVar) {
                ec.x = this.eo;
                ec.y = this.ep;
                a(aeVar.b, ec, (com.corrodinggames.rts.game.units.am) null, 0, 0);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(af afVar, com.corrodinggames.rts.game.units.am amVar, h hVar, VariableScope variableScope) {
        k kVar;
        l lVar = this.x;
        if (lVar.gq.a == 0) {
            return;
        }
        Object[] a = lVar.gq.a();
        for (int i = lVar.gq.a - 1; i >= 0; i--) {
            ae aeVar = (ae) a[i];
            if (aeVar.a == afVar && (aeVar.d == null || g.a(aeVar.d, hVar))) {
                if (dX.size() > 0) {
                    kVar = (k) dX.b();
                } else {
                    kVar = new k();
                }
                kVar.a = aeVar;
                kVar.b = this;
                kVar.c = amVar;
                kVar.d = hVar;
                kVar.e = variableScope;
                dW.add(kVar);
            }
        }
    }

    public static void s(float f) {
    }

    public static void dD() {
        if (dW.a == 0) {
            return;
        }
        dW = new com.corrodinggames.rts.gameFramework.utility.m();
    }

    public static void a(float f, int i) {
        int i2;
        if (dW.a == 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 105 || (i2 = dW.a) == 0) {
                break;
            }
            Object[] a = dW.a();
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                k kVar = (k) a[i4];
                ae aeVar = kVar.a;
                j jVar = kVar.b;
                if (aeVar.c == jVar.x) {
                    ec.x = jVar.eo;
                    ec.y = jVar.ep;
                    PointF pointF = ec;
                    LogicBoolean.setContextEventSource(kVar);
                    jVar.a(aeVar.b, pointF, (com.corrodinggames.rts.game.units.am) null, 0, 0);
                    LogicBoolean.clearContext();
                }
            }
            if (i3 < 105) {
                if (i2 == dW.a) {
                    break;
                }
                Object[] a2 = dW.a();
                int i5 = 0;
                for (int i6 = i2; i6 < dW.a; i6++) {
                    if (i3 < ((k) a2[i6]).a.e) {
                        i5++;
                    }
                }
                if (i5 <= 0) {
                    break;
                }
                dV.clear();
                for (int i7 = 0; i7 < dW.a; i7++) {
                    k kVar2 = (k) a2[i7];
                    boolean z = true;
                    if (i7 < i2) {
                        z = false;
                    } else if (i3 >= kVar2.a.e) {
                        z = false;
                    }
                    if (!z) {
                        kVar2.a();
                        dX.add(kVar2);
                    } else {
                        dV.add(kVar2);
                    }
                }
                dW.clear();
                com.corrodinggames.rts.gameFramework.utility.m mVar = dV;
                dV = dW;
                dW = mVar;
                if (i5 != dW.a) {
                    GameEngine.m5e("processAllQueuedEvents: " + i5 + "!=" + dW.a);
                }
                i3++;
            } else {
                GameEngine.m5e("processAllQueuedEvents: recursion limit reached");
                break;
            }
        }
        Object[] a3 = dW.a();
        for (int i8 = dW.a - 1; i8 >= 0; i8--) {
            k kVar3 = (k) a3[i8];
            kVar3.a();
            dX.add(kVar3);
        }
        dW.clear();
    }

    public static void dE() {
    }

    public void b(float f, boolean z) {
        l lVar = this.x;
        if (!lVar.fX) {
            return;
        }
        if (this.w != 0.0f) {
            this.w = com.corrodinggames.rts.gameFramework.f.a(this.w, f);
            if (this.w == 0.0f) {
                z = true;
            } else {
                return;
            }
        }
        r[] rVarArr = lVar.fY;
        if (rVarArr != null) {
            a(f, rVarArr);
            if (lVar != this.x) {
                return;
            }
        }
        r[] rVarArr2 = lVar.fZ;
        if (rVarArr2 != null && (((int) (GameEngine.getGameEngine().tick + this.eh)) % 4 == 0 || z)) {
            a(f, rVarArr2);
            if (lVar != this.x) {
                return;
            }
        }
        r[] rVarArr3 = lVar.ga;
        if (rVarArr3 != null) {
            if (((int) (GameEngine.getGameEngine().tick + this.eh)) % 8 == 0 || z) {
                a(f, rVarArr3);
                if (lVar != this.x) {
                }
            }
        }
    }

    public void a(float f, r[] rVarArr) {
        l lVar = this.x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        for (r rVar : rVarArr) {
            if (rVar.a.read(this)) {
                if (gameEngine.bl && gameEngine.bn && this.cG) {
                    if (rVar.d != null) {
                        String str = VariableScope.nullOrMissingString + rVar.d.O();
                    }
                    String str2 = "autoTrigger fired on: " + cB() + " details: " + rVar.a.getDebugDetails(this);
                    GameEngine.m5e(str2);
                    gameEngine.bS.i.a(str2, 2000);
                }
                ec.x = this.eo;
                ec.y = this.ep;
                a(rVar.d, ec, (com.corrodinggames.rts.game.units.am) null, 0, 0);
                this.w = this.x.ca;
                if (lVar != this.x) {
                    return;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public h de() {
        return this.ed;
    }

    public void a(h hVar, boolean z) {
        if (z) {
            this.ed = hVar;
            return;
        }
        PlayerData.b((com.corrodinggames.rts.game.units.am) this);
        this.ed = hVar;
        PlayerData.c(this);
    }

    public void j(boolean z) {
        a(this.x.O, z);
    }

    public void a(h hVar) {
        h de = de();
        if (de == null || de.b() == 0) {
            a(hVar, false);
        } else if (g.b(de, hVar)) {
        } else {
            i iVar = new i(de);
            if (iVar.a(hVar)) {
                a(iVar.a(), false);
            }
        }
    }

    public void b(h hVar) {
        h de = de();
        if (de == null || de.b() == 0 || !g.a(hVar, de)) {
            return;
        }
        i iVar = new i(de);
        if (iVar.b(hVar)) {
            a(iVar.a(), false);
        }
    }

    public final void dF() {
        if (this.x.fg == com.corrodinggames.rts.game.units.ao.AIR) {
            if (i()) {
                S(5);
            } else if (cr() && this.cl == 0.0f) {
                S(3);
            } else {
                S(2);
            }
        } else if (this.cl == 0.0f) {
            S(this.x.cI);
        } else {
            S(2);
        }
        this.en = 0;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ck() {
        if (!this.x.gi) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public boolean f() {
        return this.x.fd.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public boolean j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.utility.ai D(int i) {
        com.corrodinggames.rts.game.units.ap apVar = this.cL[i];
        bn bnVar = this.x.fQ[i];
        float f = bnVar.X;
        float f2 = bnVar.Y;
        if (bnVar.Z != 0.0f && apVar.m) {
            f2 += bnVar.Z;
        }
        float f3 = E() ? this.cg : apVar.a;
        com.corrodinggames.rts.gameFramework.utility.ai F = F(i);
        float k = com.corrodinggames.rts.gameFramework.f.k(f3);
        float j = com.corrodinggames.rts.gameFramework.f.j(f3);
        float f4 = F.a;
        float f5 = F.b;
        float f6 = F.c;
        ee.a = f4 + ((k * f) - (j * f2));
        ee.b = f5 + (j * f) + (k * f2);
        ee.c = f6 + bnVar.aa;
        return ee;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        com.corrodinggames.rts.gameFramework.utility.ai D = D(i);
        ef.x = D.a;
        ef.y = D.b;
        return ef;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cl() {
        return this.x.fJ;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cn() {
        return this.x.fK;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(com.corrodinggames.rts.game.units.am amVar, float f, int i) {
        if (this.x.dz != null) {
            this.b.a(this.x.dz, 5);
        }
        if (this.x.bS) {
            this.U = com.corrodinggames.rts.gameFramework.f.a(this.U, f);
            if (this.U == 0.0f) {
                this.U = this.x.bT;
                if (this.x.bU != null) {
                    com.corrodinggames.rts.game.units.ap apVar = this.cL[i];
                    PointF E = E(i);
                    this.x.bU.a(E.x, E.y, this.eq, apVar.a, this);
                }
                if (this.x.bV != null) {
                    this.x.bV.a(amVar.eo, amVar.ep, amVar.eq, amVar.cg, amVar);
                    return;
                }
                return;
            }
            return;
        }
        super.a(amVar, f, i);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void b(com.corrodinggames.rts.game.units.am amVar, float f, int i) {
        if (this.x.dA != null) {
            this.b.a(this.x.dA, 5);
        }
        if (this.x.bW) {
            this.U = com.corrodinggames.rts.gameFramework.f.a(this.U, f);
            if (this.U == 0.0f) {
                this.U = this.x.bX;
                if (this.x.bY != null) {
                    com.corrodinggames.rts.game.units.ap apVar = this.cL[i];
                    PointF E = E(i);
                    this.x.bY.a(E.x, E.y, this.eq, apVar.a, this);
                }
                if (this.x.bZ != null) {
                    this.x.bZ.a(amVar.eo, amVar.ep, amVar.eq, amVar.cg, amVar);
                    return;
                }
                return;
            }
            return;
        }
        super.b(amVar, f, i);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cg() {
        return this.y.m;
    }

    public boolean dG() {
        if (this.x.Z != null && !this.x.Z.read(this)) {
            return false;
        }
        if (!this.y.m) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.playerTeam.c(this.bX) && !gameEngine.playerTeam.b()) {
                return false;
            }
        }
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && !dn.o) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean t() {
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && dn.m) {
            return true;
        }
        return this.x.aM;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cV() {
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && dn.n) {
            return true;
        }
        return this.x.aN;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(com.corrodinggames.rts.game.units.am amVar) {
        l lVar = this.x;
        return ((lVar.aS != null && !g.a(lVar.aS, amVar.de())) || dH() || lVar.aO) ? false : true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cW() {
        return this.x.aT;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cT() {
        return this.x.aO || u() || (this.cm < 1.0f && this.x.bh <= 0.0f);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public h dh() {
        return this.x.P;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float am() {
        return this.x.eG;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean an() {
        return super.an() || this.x.eF;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        if (!gameEngine.cO.b(this.eo, this.ep)) {
            if (!this.x.B) {
                return false;
            }
            boolean z = false;
            if (this.x.C != null) {
                l.a.a(this.x.C);
                l.a.a((int) this.eo, (int) this.ep);
                if (gameEngine.cQ.b(l.a)) {
                    z = true;
                }
            }
            if (gameEngine.cO.b(this.eo, this.ep - this.eq)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.cN != null) {
            return false;
        }
        if ((this.cP != null && this.cP.I) || !d(gameEngine.playerTeam) || !dG()) {
            return false;
        }
        return true;
    }

    public com.corrodinggames.rts.game.units.y a(com.corrodinggames.rts.game.units.custom.b.n nVar) {
        return com.corrodinggames.rts.game.units.custom.b.m.a(this, nVar);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.game.units.custom.b.n a(short s) {
        return com.corrodinggames.rts.game.units.custom.b.m.a(this, s);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.game.units.custom.b.n nVar) {
        if (yVar == this) {
            return false;
        }
        if (nVar == null) {
            GameEngine.print("attachRequest: No attachedSlotData");
            return false;
        }
        com.corrodinggames.rts.game.units.y a = com.corrodinggames.rts.game.units.custom.b.m.a(this, nVar);
        if (a != null) {
            GameEngine.print("attachRequest: a unit is already in slot (parent:" + cB() + " slot:" + nVar.b() + " existing:" + a.cC() + ")");
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.custom.b.m.a(this, nVar, yVar);
        yVar.cO = this;
        yVar.cP = nVar;
        yVar.cQ = gameEngine.by;
        yVar.bT = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(com.corrodinggames.rts.game.units.y yVar) {
        if (yVar.cO != this) {
            GameEngine.print("deattachRequest: unit is not attached");
            return false;
        }
        com.corrodinggames.rts.game.units.custom.b.n nVar = yVar.cP;
        if (nVar == null) {
            GameEngine.print("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        com.corrodinggames.rts.game.units.y a = com.corrodinggames.rts.game.units.custom.b.m.a(this, nVar);
        if (a == null) {
            GameEngine.print("deattachRequest: Failed, no unit in slot");
            GameEngine.g("deattachRequest");
            return false;
        } else if (yVar != a) {
            String str = "null";
            if (a != null) {
                str = a.cB();
            }
            GameEngine.print("deattachRequest: unit and slot don't match - requested:" + yVar.cB() + " current:" + str);
            return false;
        } else {
            if (this.B.remove(yVar)) {
                D(yVar);
            }
            com.corrodinggames.rts.game.units.custom.b.m.a(this, nVar, (com.corrodinggames.rts.game.units.y) null);
            yVar.cO = null;
            yVar.cP = null;
            yVar.f_();
            a(af.attachmentRemoved, this);
            return true;
        }
    }

    public boolean dH() {
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && !dn.l) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean J() {
        if (dH() || this.x.aP) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void di() {
        l lVar = this.x;
        if (!lVar.cv.c()) {
            lVar.cv.a(this);
        }
        if (!lVar.cw.c() && this.cm >= 1.0f) {
            lVar.cw.a(this);
        }
        super.di();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void dj() {
        l lVar = this.x;
        if (!lVar.cv.c()) {
            lVar.cv.h(this);
        }
        if (!lVar.cw.c() && this.cm >= 1.0f) {
            lVar.cw.h(this);
        }
        super.dj();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(com.corrodinggames.rts.game.units.au auVar) {
        a(af.newWaypointGivenByPlayer);
        com.corrodinggames.rts.game.units.custom.b.n dn = dn();
        if (dn != null && dn.H) {
            com.corrodinggames.rts.game.units.av d = auVar.d();
            if (d == com.corrodinggames.rts.game.units.av.attackMove || d == com.corrodinggames.rts.game.units.av.move) {
                bx();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean c_() {
        l lVar = this.x;
        if (!lVar.aR && GameEngine.getGameEngine().playerTeam.c(this.bX)) {
            return false;
        }
        return lVar.aQ;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dk() {
        return this.x.aa;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dl() {
        return this.x.eK;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dm() {
        return this.x.eL;
    }

    public boolean G(com.corrodinggames.rts.game.units.am amVar) {
        int dI = dI();
        int cw = amVar.cw();
        if (this.x.eO) {
            cw = 1;
        }
        if (dI + cw <= this.x.eM) {
            return true;
        }
        return false;
    }

    public int dI() {
        int i = 0;
        if (this.x.eO) {
            i = 0 + this.B.size();
        } else if (this.B.a > 0) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                i += ((com.corrodinggames.rts.game.units.am) it.next()).cw();
            }
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void e(PlayerData playerData) {
        com.corrodinggames.rts.game.units.custom.b.n dn;
        if (this.bX == playerData) {
            return;
        }
        super.e(playerData);
        if (this.B != null && !this.x.eX) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((com.corrodinggames.rts.game.units.am) it.next()).e(playerData);
            }
        }
        if (this.C != null) {
            Iterator it2 = this.C.iterator();
            while (it2.hasNext()) {
                com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it2.next();
                if (amVar != null && (dn = amVar.dn()) != null && !dn.z) {
                    amVar.e(playerData);
                }
            }
        }
        a(af.teamChanged);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.custom.d.b cN() {
        return this.x.ci;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void ch() {
        if (this.x.bs) {
            if (this.cu <= -1.0f) {
                this.cu = -1.0f;
                return;
            }
            return;
        }
        super.ch();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.utility.m bz() {
        return this.B;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.utility.m e(boolean z) {
        this.eg.clear();
        if (this.x.aA.a > 0) {
            com.corrodinggames.rts.game.units.custom.b.m.a(this, this.eg, z);
        }
        if (this.eg.a > 0) {
            return this.eg;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: do */
    public float mo146do() {
        return this.x.de;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean dp() {
        return this.x.A;
    }

    public void dJ() {
        if (this.y.a) {
            this.y = this.y.b();
        }
    }
}
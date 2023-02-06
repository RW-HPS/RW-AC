package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.u;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/i.class */
public class i extends o {
    float a;
    j b;
    k c;
    float d;
    float e;
    float f;
    float g;
    int h;
    float i;
    float j;
    float k;
    float l;
    float m;
    boolean n;
    boolean o;
    com.corrodinggames.rts.gameFramework.utility.m p;
    u q;
    u r;
    boolean s;
    boolean t;
    float u;
    float v;
    PointF w;
    PointF x;
    int y;
    as z;
    com.corrodinggames.rts.game.units.custom.d.b A;
    com.corrodinggames.rts.game.units.custom.d.b B;
    int C;
    int D;
    String E;
    int F;
    int G;
    boolean H;
    int I;
    int J;
    int K;
    int L;
    boolean M;
    ArrayList N;
    as O;
    com.corrodinggames.rts.game.units.custom.d.b P;

    @Override // com.corrodinggames.rts.game.a.o, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeEnum(this.b);
        gameOutputStream.writeEnum(this.c);
        gameOutputStream.writeFloat(this.d);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.f);
        gameOutputStream.writeFloat(this.g);
        gameOutputStream.writeFloat(this.i);
        gameOutputStream.writeFloat(this.j);
        gameOutputStream.writeFloat(this.k);
        gameOutputStream.writeFloat(this.l);
        gameOutputStream.writeByte(4);
        gameOutputStream.writeFloat(this.v);
        gameOutputStream.writeFloat(this.m);
        gameOutputStream.writeBoolean(this.n);
        gameOutputStream.writeBoolean(this.o);
        gameOutputStream.writeInt(this.h);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.a.o
    public void a(GameInputStream gameInputStream) {
        this.b = (j) gameInputStream.b(j.class);
        this.c = (k) gameInputStream.b(k.class);
        this.d = gameInputStream.readFloat();
        this.e = gameInputStream.readFloat();
        this.f = gameInputStream.readFloat();
        this.g = gameInputStream.readFloat();
        this.i = gameInputStream.readFloat();
        this.j = gameInputStream.readFloat();
        this.k = gameInputStream.readFloat();
        this.l = gameInputStream.readFloat();
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.v = gameInputStream.readFloat();
        }
        if (readByte >= 2) {
            this.m = gameInputStream.readFloat();
        }
        if (readByte >= 3) {
            this.n = gameInputStream.readBoolean();
            this.o = gameInputStream.readBoolean();
        }
        if (readByte >= 4) {
            this.h = gameInputStream.readInt();
        }
        super.a(gameInputStream);
    }

    public i(a aVar, float f, float f2) {
        super(aVar, f, f2);
        this.d = -1.0f;
        this.g = 100.0f;
        this.i = 50.0f;
        this.j = 50.0f;
        this.p = new com.corrodinggames.rts.gameFramework.utility.m();
        this.q = new u();
        this.r = new u();
        this.v = 0.0f;
        this.w = new PointF();
        this.x = new PointF();
        this.H = false;
        this.N = new ArrayList();
    }

    public PointF a() {
        com.corrodinggames.rts.game.maps.g e;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF pointF = null;
        int i = (int) (this.U * gameEngine.bL.r);
        gameEngine.bL.a(this.S, this.T);
        int i2 = gameEngine.bL.T;
        int i3 = gameEngine.bL.U;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (gameEngine.bL.c(i4, i5) && (e = gameEngine.bL.e(i4, i5)) != null && e.i) {
                    am b = com.corrodinggames.rts.game.units.d.d.b(i4, i5);
                    boolean z = false;
                    if (b == null) {
                        z = true;
                    }
                    if (b != null && (b instanceof y) && !((y) b).mo1r().p()) {
                        z = true;
                    }
                    if (z) {
                        gameEngine.bL.a(i4, i5);
                        if (pointF == null || com.corrodinggames.rts.gameFramework.f.rand(0, 100) < 50) {
                            this.w.setSite(gameEngine.bL.T + gameEngine.bL.p, gameEngine.bL.U + gameEngine.bL.q);
                            pointF = this.w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    public void a(y yVar) {
        this.q.remove(yVar);
    }

    public void b() {
        this.p.clear();
        this.q.clear();
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this.R && !amVar.bV && !amVar.u() && a(amVar)) {
                this.q.add(amVar);
                as asVar = amVar.dz;
                if (!this.p.contains(asVar)) {
                    this.p.add(asVar);
                }
            }
        }
    }

    public boolean a(as asVar) {
        if (a(asVar, false, true) != null) {
            return true;
        }
        return false;
    }

    public boolean b(as asVar) {
        if ((GameEngine.getGameEngine().ar && !asVar.C()) || asVar.w()) {
            return false;
        }
        Object[] a = this.p.a();
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            as asVar2 = (as) a[i];
            am[] a2 = this.q.a();
            int i2 = 0;
            int size2 = this.q.size();
            while (true) {
                if (i2 < size2) {
                    am amVar = a2[i2];
                    if (amVar.mo1r() != asVar2 || !(amVar instanceof y)) {
                        i2++;
                    } else if (((y) amVar).b(asVar, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public as c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.R.aY) {
            return null;
        }
        int a = a(this.R.bC);
        as asVar = null;
        float f = -1.0f;
        Iterator it = ar.ae.iterator();
        while (it.hasNext()) {
            as asVar2 = (as) it.next();
            if (asVar2.j() && b(asVar2)) {
                int a2 = this.R.a(asVar2, b.include);
                int c = c(asVar2);
                boolean z = false;
                if (asVar2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                    z = true;
                    com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) asVar2;
                    if (lVar.fL.size() != 0) {
                        Iterator it2 = lVar.fL.iterator();
                        while (it2.hasNext()) {
                            as asVar3 = (as) it2.next();
                            a2 += this.R.a(asVar3, b.include);
                            c += c(asVar3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (asVar2.p() && !z) {
                    int i = c;
                    if (a() != null && com.corrodinggames.rts.gameFramework.f.rand(0, 100) < 90) {
                        if (i == 0) {
                            if (this.R.credits < 5000.0d) {
                                f2 = 0.98f;
                            } else {
                                f2 = 0.58f;
                            }
                        }
                        if (i == 1) {
                            f2 = 0.55f;
                        }
                        if (i == 2) {
                            f2 = 0.4f;
                        }
                        if (i >= 3) {
                            f2 = 0.25f / i;
                        }
                        if (a2 >= 3) {
                            f2 = (float) (f2 * 0.6d);
                        }
                    }
                }
                if (asVar2 == ar.landFactory && (a2 < 5 || a == 0)) {
                    if (a2 == 0) {
                        f2 = 0.8f;
                    } else if (c < 2) {
                        f2 = 0.46f / (a2 + (c * 2));
                    }
                }
                if (asVar2 == ar.seaFactory && this.R.ah() && (a2 < 5 || a == 0)) {
                    if (a2 == 0) {
                        f2 = 0.3f;
                    } else if (c < 1) {
                        f2 = 0.1f / (a2 + (c * 2));
                    }
                }
                if (asVar2 == ar.airFactory && (a2 < 5 || a == 0)) {
                    if (a2 == 0) {
                        f2 = 0.48f;
                    } else if (c < 2) {
                        f2 = 0.29f / (a2 + c);
                    }
                }
                if (asVar2 == ar.turret) {
                    if (c == 0) {
                        f2 = 0.47f;
                    } else if (c < 3) {
                        f2 = 0.35f / c;
                    } else if (c < 4) {
                        f2 = 0.025f / c;
                    }
                }
                if (asVar2 == ar.laserDefence && c == 0) {
                    f2 = 0.018f;
                }
                if (asVar2 == ar.repairbay && c == 0) {
                    f2 = 0.02f;
                }
                if (asVar2 == ar.antiAirTurret) {
                    if (c == 0) {
                        f2 = 0.42f;
                    } else if (this.R.ac()) {
                        if (c < 4) {
                            f2 = 0.3f / c;
                        }
                    } else if (c < 3) {
                        f2 = 0.3f / c;
                    } else if (c < 4) {
                        f2 = 0.02f / c;
                    }
                }
                if (asVar2 == ar.fabricator && this.R.credits > 2000.0d && c < 5) {
                    if (a2 == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * a2) + c);
                    }
                }
                if (asVar2 == ar.AntiNukeLaucher && ((!gameEngine.O() || !gameEngine.netEngine.gameMapData.nukes) && this.R.credits > 2200.0d && a2 < 4)) {
                    if (a2 == 0) {
                        f2 = 0.06f;
                    } else if (c < 1) {
                        f2 = 0.05f / (a2 + (c * 2));
                    }
                }
                if (z) {
                    com.corrodinggames.rts.game.units.custom.l lVar2 = (com.corrodinggames.rts.game.units.custom.l) asVar2;
                    if (!lVar2.fw && ((a2 < lVar2.fx || lVar2.fx == -1) && (c < lVar2.fy || lVar2.fy == -1))) {
                        f2 = lVar2.fz;
                        if (c < lVar2.fA) {
                            f2 = lVar2.fB;
                        }
                        if (c == 0) {
                            f2 += lVar2.fC;
                        }
                        if (a2 == 0) {
                            f2 += lVar2.fD;
                        }
                        if (asVar2.p() && a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.R.ad() && asVar2 == ar.experimentalLandFactory && this.R.credits > 15000.0d) {
                    if (a2 == 0) {
                        f2 = 0.04f;
                    }
                    if (this.R.credits > 55000.0d && a2 == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || com.corrodinggames.rts.gameFramework.f.c(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    asVar = asVar2;
                }
            }
        }
        this.f = f;
        return asVar;
    }

    public int a(d dVar) {
        int i = 0;
        Iterator it = dVar.c.iterator();
        while (it.hasNext()) {
            i += c(((e) it.next()).a);
        }
        return i;
    }

    public int c(as asVar) {
        int i = 0;
        u uVar = this.q;
        am[] a = uVar.a();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if (amVar.bX == this.R && amVar.dz == asVar && a(amVar)) {
                i++;
            }
        }
        return i;
    }

    public int d() {
        int i = 0;
        u uVar = this.q;
        am[] a = uVar.a();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if (amVar.bX == this.R && (amVar instanceof y)) {
                y yVar = (y) amVar;
                if (a(yVar, false) && !yVar.bM && yVar.aB == null && this.R.h(yVar) && this.R.i(yVar)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int e() {
        return this.K;
    }

    public boolean f() {
        return h() != 0;
    }

    public am g() {
        float f = this.U + 120.0f;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.eo + f > this.S && amVar.eo - f < this.S && amVar.ep + f > this.T && amVar.ep - f < this.T && amVar.bX != this.R && a(amVar, 120.0f) && amVar.bX.c(this.R) && this.R.j(amVar)) {
                return amVar;
            }
        }
        return null;
    }

    public int h() {
        return a(60.0f);
    }

    public int a(float f) {
        int i = 0;
        float f2 = this.U + f;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if (amVar.eo + f2 > this.S && amVar.eo - f2 < this.S && amVar.ep + f2 > this.T && amVar.ep - f2 < this.T && amVar.bX != this.R && a(amVar, f) && amVar.bX.c(this.R) && amVar.l() && this.R.j(amVar)) {
                i++;
            }
        }
        return i;
    }

    public void i() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        am g = g();
        if (g != null) {
            SyncPacket a = gameEngine.cf.a(this.R);
            am[] a2 = am.bE.a();
            int size = am.bE.size();
            for (int i = 0; i < size; i++) {
                am amVar = a2[i];
                if (amVar instanceof y) {
                    y yVar = (y) amVar;
                    if (amVar.bX == this.R && this.R.b(amVar, g) && this.R.i(yVar) && yVar.aq()) {
                        if (!amVar.bM) {
                            if (a.a(amVar, this.S, this.T, 800.0f)) {
                                a.a(yVar);
                            }
                        } else if (a.a(amVar, this.S, this.T, 540.0f)) {
                            a.a(yVar);
                        }
                    }
                }
            }
            a.a(g);
        }
    }

    public boolean a(am amVar) {
        return a(amVar, false);
    }

    public boolean a(am amVar, boolean z) {
        if ((amVar instanceof y) && ((y) amVar).aC == this) {
            if (!z || b(amVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean a(y yVar, boolean z) {
        if (yVar.aC == this) {
            if (!z || b(yVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int j() {
        int i = 0;
        Iterator it = k().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (this.R != amVar.bX && amVar.bX.c(this.R) && (amVar instanceof y) && b(amVar)) {
                i++;
            }
        }
        return i;
    }

    public com.corrodinggames.rts.game.units.f.f k() {
        return GameEngine.getGameEngine().cc.b(this.S, this.T, this.U);
    }

    private y x() {
        return a((as) null, (PointF) null, true);
    }

    private y y() {
        return f(null);
    }

    private y f(as asVar) {
        return a(asVar, (PointF) null, false);
    }

    private y a(as asVar, PointF pointF, boolean z) {
        if (this.K == 0) {
            return null;
        }
        this.y = 0;
        float f = Float.MAX_VALUE;
        y yVar = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (asVar != null && ((gameEngine.ar && !asVar.C()) || asVar.w())) {
            return null;
        }
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this.R && a(amVar) && amVar.cN == null && amVar.aj() && (amVar instanceof y) && this.R.i(amVar)) {
                y yVar2 = (y) amVar;
                if (f.a(yVar2) && (!z || yVar2.I())) {
                    this.y++;
                    if (asVar == null || yVar2.b(asVar, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = com.corrodinggames.rts.gameFramework.f.a(pointF.x, pointF.y, amVar.eo, amVar.ep);
                        }
                        if (yVar == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (com.corrodinggames.rts.gameFramework.f.c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            yVar = (y) amVar;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return yVar;
    }

    private y a(am amVar, PointF pointF, boolean z) {
        if (this.L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        y yVar = null;
        GameEngine.getGameEngine();
        am[] a = this.q.a();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            am amVar2 = a[i];
            if (amVar2.bX == this.R && a(amVar2) && amVar2.cN == null) {
                as mo1r = amVar2.mo1r();
                if (mo1r.n() && (amVar2 instanceof y) && this.R.i(amVar2)) {
                    y yVar2 = (y) amVar2;
                    if (f.b(yVar2) && ((!z || yVar2.I()) && (amVar == null || yVar2.h(amVar, true)))) {
                        boolean z2 = false;
                        if (mo1r instanceof com.corrodinggames.rts.game.units.custom.l) {
                            com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) mo1r;
                            if (lVar.fH != null && !a(lVar.fH)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = com.corrodinggames.rts.gameFramework.f.a(pointF.x, pointF.y, amVar2.eo, amVar2.ep);
                        }
                        if (yVar == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (com.corrodinggames.rts.gameFramework.f.c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            yVar = (y) amVar2;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return yVar;
    }

    private boolean g(as asVar) {
        PointF e;
        y a;
        this.z = asVar;
        this.A = null;
        this.B = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (asVar.p()) {
            e = a();
        } else {
            e = e(asVar);
        }
        if (e == null || (a = a(asVar, e, false)) == null) {
            return false;
        }
        if (asVar == ar.seaFactory) {
            int c = com.corrodinggames.rts.gameFramework.utility.y.c(e.x, e.y, ao.WATER);
            this.R.getClass();
            if (c < 3000) {
                return false;
            }
        }
        int i = 1;
        s a2 = a.a(asVar, true);
        if (a2 != null) {
            i = a2.t();
        } else {
            GameEngine.print("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + asVar.i());
        }
        if (!a2.b(a) || !a2.a((am) a, false)) {
            if (!this.R.a(a2.B(), a)) {
                this.A = a2.B();
                this.B = this.A.i(a);
                return true;
            }
            return true;
        } else if (a2.A()) {
            SyncPacket a3 = gameEngine.cf.a(this.R);
            a3.a(a);
            a3.a(a2.N(), e, (am) null);
            return true;
        } else {
            SyncPacket a4 = gameEngine.cf.a(this.R);
            a4.a(a);
            a4.a(e.x, e.y, asVar, i);
            return true;
        }
    }

    private boolean z() {
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this.R && a(amVar) && amVar.bT() && !amVar.u() && (amVar instanceof y) && ((y) amVar).ai()) {
                return true;
            }
        }
        return false;
    }

    public boolean a(com.corrodinggames.rts.game.units.custom.h hVar) {
        com.corrodinggames.rts.game.units.custom.h de;
        am[] a = this.q.a();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this.R && amVar.bT() && (de = amVar.de()) != null && com.corrodinggames.rts.game.units.custom.g.a(hVar, de)) {
                return true;
            }
        }
        return false;
    }

    private y a(as asVar, boolean z, boolean z2) {
        am[] a = this.q.a();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this.R && amVar.bT() && this.R.i(amVar) && (amVar instanceof com.corrodinggames.rts.game.units.d.l) && (amVar instanceof y)) {
                y yVar = (y) amVar;
                com.corrodinggames.rts.game.units.d.l lVar = (com.corrodinggames.rts.game.units.d.l) amVar;
                s e = amVar.e(asVar);
                if (e != null && ((lVar.dy() || !z) && !e.m(amVar) && e.b(yVar) && e.a((am) yVar, false) && ((!(amVar instanceof com.corrodinggames.rts.game.units.d.e) || asVar.m() || u() <= 2 || this.s || !z) && (!z2 || yVar.aD)))) {
                    return yVar;
                }
            }
        }
        return null;
    }

    private boolean a(d dVar, boolean z) {
        Iterator it = dVar.a().iterator();
        while (it.hasNext()) {
            if (a(((e) it.next()).a, z)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(as asVar, boolean z) {
        return a(asVar, z, 1);
    }

    private boolean a(as asVar, boolean z, int i) {
        if (i < 1) {
            GameEngine.b("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        y a = a(asVar, true, z);
        if (a == null) {
        }
        if (a == null) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        s e = a.e(asVar);
        if (e == null) {
            GameEngine.b("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.b(a)) {
            GameEngine.b("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.a((am) a, false)) {
            GameEngine.b("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.g(a)) {
            return false;
        } else {
            if (e.n_() && gameEngine.ar) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                SyncPacket a2 = gameEngine.cf.a(this.R);
                a2.a(a);
                a2.a(e.z());
            }
            return true;
        }
    }

    i l() {
        i iVar;
        float f = -1.0f;
        i iVar2 = null;
        Iterator it = this.R.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if ((oVar instanceof i) && (iVar = (i) oVar) != this && iVar.e() > 1) {
                float a = iVar.a(this);
                if (iVar2 == null || a < f) {
                    f = a;
                    iVar2 = iVar;
                }
            }
        }
        return iVar2;
    }

    public void m() {
        y x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        i l = l();
        if (l != null && l.e() > 1 && (x = l.x()) != null) {
            PointF w = w();
            if (com.corrodinggames.rts.gameFramework.utility.y.a(x, w.x, w.y)) {
                boolean a = this.R.a(x, w.x, w.y);
                if (a || this.R.aG != 0) {
                    SyncPacket a2 = gameEngine.cf.a(this.R);
                    a2.a(x);
                    a2.a(w.x, w.y);
                    this.h++;
                    this.g = com.corrodinggames.rts.gameFramework.f.rand(1800, 2500);
                    if (this.h >= 2) {
                        this.g += 11000.0f;
                    }
                    l.K--;
                    if (!a) {
                        boolean z = true;
                        if (x.aB != null) {
                            if (!x.aB.a()) {
                                x.aB.b(x);
                            } else {
                                z = false;
                                if (!x.aB.G.contains(x)) {
                                    x.aB.G.add(x);
                                }
                            }
                        }
                        if (z) {
                            l lVar = new l(this.R);
                            lVar.c(x);
                            lVar.S = w.x;
                            lVar.T = w.y;
                        }
                        this.g = com.corrodinggames.rts.gameFramework.f.rand(12000, 14000);
                    }
                }
            }
        }
    }

    private am A() {
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bX == this.R && a(amVar, true) && amVar.bI() && (amVar.cu < amVar.cv - 1.0f || amVar.cm < 1.0f)) {
                return amVar;
            }
        }
        return null;
    }

    public void n() {
        GameEngine.getGameEngine();
        if (this.r.size() == 0 || this.s) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            as c = this.R.bA.c();
            if (c != null && a(c) && d(c)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(as asVar) {
        if (!(asVar instanceof com.corrodinggames.rts.game.units.custom.l)) {
            return false;
        }
        com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) asVar;
        if (lVar.fE == -1 && lVar.fF == -1) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        boolean z = lVar.fG;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i3 = 0; i3 < size; i3++) {
            am amVar = a[i3];
            if (amVar.bX == this.R && amVar.cN == null && (amVar instanceof y) && this.R.i(amVar)) {
                y yVar = (y) amVar;
                as mo1r = amVar.mo1r();
                if (z) {
                    if (!mo1r.n()) {
                    }
                    i2++;
                    if (!a(amVar)) {
                        i++;
                    }
                } else {
                    if (mo1r != lVar && !lVar.fL.contains(mo1r)) {
                    }
                    i2++;
                    if (!a(amVar)) {
                    }
                }
            }
        }
        if (lVar.fE != -1 && i >= lVar.fE) {
            return false;
        }
        if (lVar.fF != -1 && i2 >= lVar.fF) {
            return false;
        }
        return a((as) lVar, true);
    }

    public void o() {
        am r;
        if (this.r.size() != 0 && (r = r()) != null) {
            this.x.setSite(r.eo, r.ep);
            y a = a(r, this.x, true);
            if (a != null) {
                a(a, r);
            }
        }
    }

    public void q() {
        y yVar;
        au ar;
        am i;
        if (this.r.size() != 0 && this.B != null) {
            am[] a = this.q.a();
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                am amVar = a[i2];
                if (amVar.bX == this.R && a(amVar) && amVar.cN == null && amVar.mo1r().n() && (amVar instanceof y) && this.R.i(amVar) && com.corrodinggames.rts.gameFramework.f.c(0.0f, 1.0f) <= 0.3d && (ar = (yVar = (y) amVar).ar()) != null && ar.d() == av.reclaim && (i = ar.i()) != null && i.g() > 0.0f && !this.B.c(i.cM())) {
                    a(yVar, r());
                    return;
                }
            }
        }
    }

    public am r() {
        am amVar = null;
        for (int i = 0; i < 20; i++) {
            amVar = this.r.get(com.corrodinggames.rts.gameFramework.f.rand(0, this.r.size() - 1));
            if (amVar == null || this.B == null || this.B.c(amVar.cM())) {
                break;
            }
        }
        return amVar;
    }

    public void a(y yVar, am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (yVar.g(amVar, true)) {
            SyncPacket a = gameEngine.cf.a(this.R);
            a.a(yVar);
            a.d(amVar);
        }
    }

    public void s() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        am A = A();
        if (A != null) {
            this.x.setSite(A.eo, A.ep);
            y a = a((as) null, this.x, true);
            if (a != null && a.a(A) && A.e(a) < 2) {
                SyncPacket a2 = gameEngine.cf.a(this.R);
                a2.a(a);
                a2.b(A);
            }
        }
    }

    public void b(float f) {
        c(f);
        int i = this.J;
        int i2 = this.I;
        b();
        this.n = z();
        if (this.n) {
            this.o = true;
        }
        if (i >= 1) {
            s();
        }
        if (this.M && this.I > 0) {
            n();
            q();
            o();
        }
        if (i < 2 && this.i == 0.0f) {
            this.i = 300.0f;
            int a = this.R.a(this.R.bz, b.include);
            if (!this.s || a <= 2) {
                boolean z = com.corrodinggames.rts.gameFramework.f.rand(0, 100) < 5;
                if (!z && a(this.R.bz, true)) {
                    this.H = false;
                    this.i = 900.0f;
                } else {
                    if (!z) {
                        this.H = true;
                    }
                    if (!this.s && this.v == 0.0f && i < 1 && this.g == 0.0f) {
                        m();
                    }
                }
            }
        }
        int j = j();
        if (i == 0 && i2 == 0) {
            this.k += f;
            if (j > 2) {
                this.k += 2.0f * f;
            }
            if (j > 5) {
                this.k += 4.0f * f;
            }
        } else {
            this.k = com.corrodinggames.rts.gameFramework.f.a(this.k, f);
        }
        if (this.k > 11000.0f) {
            p();
        }
        if (this.b == j.Pre && ((i != 0 && i2 != 0) || (i2 > 5 && j == 0))) {
            this.l += f;
            if (this.l > 2000.0f) {
                this.b = j.Active;
            }
        }
        t();
    }

    public void t() {
        if (this.b == null) {
            GameEngine.a("fixOverlaps: this.state==null");
            GameEngine.a("id:" + this.Q);
            GameEngine.a("x:" + this.S);
            GameEngine.a("y:" + this.T);
            GameEngine.a("radius:" + this.U);
            if (this.R != null) {
                GameEngine.a("team:" + this.R.site);
                return;
            }
            return;
        }
        Iterator it = this.R.bm.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if ((oVar instanceof i) && oVar != this) {
                i iVar = (i) oVar;
                if (com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, iVar.S, iVar.T) < 400.0f) {
                    if (iVar.b == null) {
                        GameEngine.a("fixOverlaps: targetBase.state==null");
                    } else if (iVar.b.a() < this.b.a()) {
                        iVar.p();
                    } else {
                        p();
                    }
                }
            }
        }
    }

    public int u() {
        return this.I;
    }

    public void c(float f) {
        this.I = 0;
        this.J = 0;
        this.L = 0;
        this.K = 0;
        this.M = false;
        this.r.clear();
        if (1 != 0) {
            Iterator it = k().iterator();
            while (it.hasNext()) {
                am amVar = (am) it.next();
                if (amVar.g() > 0.0f && b(amVar)) {
                    this.M = true;
                    this.r.add(amVar);
                }
            }
        }
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar2 = a[i];
            if (amVar2.bX == this.R && (amVar2 instanceof y)) {
                y yVar = (y) amVar2;
                if (a(yVar, false) && amVar2.bT() && this.R.i(amVar2) && !amVar2.u()) {
                    as mo1r = amVar2.mo1r();
                    if (mo1r.j()) {
                        this.I++;
                    }
                    if (mo1r.m()) {
                        this.J++;
                        if (f.a(yVar)) {
                            this.K++;
                        }
                    }
                    if (mo1r.n()) {
                        this.L++;
                    }
                    if (amVar2 instanceof com.corrodinggames.rts.game.units.d.l) {
                        this.J += ((com.corrodinggames.rts.game.units.d.l) amVar2).h(ar.builder);
                    }
                }
            }
        }
    }

    public void d(float f) {
        as c;
        this.s = f();
        this.t = this.s;
        if (this.s) {
            this.v += f;
            this.u = 100.0f;
        } else {
            this.v = 0.0f;
        }
        if (this.v > 6000.0f) {
            this.s = false;
        }
        this.m = com.corrodinggames.rts.gameFramework.f.a(this.m, f);
        this.e = com.corrodinggames.rts.gameFramework.f.a(this.e, f);
        this.g = com.corrodinggames.rts.gameFramework.f.a(this.g, f);
        this.i = com.corrodinggames.rts.gameFramework.f.a(this.i, f);
        this.j = com.corrodinggames.rts.gameFramework.f.a(this.j, f);
        if (this.s && this.j == 0.0f) {
            this.j = 100 + (this.Q % 15);
            if (!this.R.aY) {
                i();
            }
        }
        if (this.e <= 0.0f) {
            this.e = 270 + (this.Q % 15);
            if (this.R.ac()) {
                this.e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.Q % 15);
            }
            if (this.f < 0.2d) {
                this.e += 180.0f;
            }
            if (this.f < 0.08d) {
                this.e += 180.0f;
            }
            if ((y() != null) && (c = c()) != null && ((this.f > 0.8d || this.R.a(1300.0d)) && ((this.f > 0.4d || this.R.a(1700.0d)) && ((this.f > 0.2d || this.R.a(2100.0d)) && ((this.f > 0.1d || this.R.a(2800.0d)) && ((this.f > 0.05d || this.R.a(3100.0d)) && (this.f > 0.01d || this.R.a(4800.0d)))))))) {
                this.C++;
                if (!g(c)) {
                    this.e -= 120.0f;
                    this.D++;
                }
            }
        }
        float u = u() / 3.0f;
        if (u < 1.0f) {
            u = 1.0f;
        }
        if (this.s) {
            this.d = (float) (this.d + (f * 0.015d));
        }
        if (this.f < 0.6d) {
            if (this.R.bb < 2) {
                this.d = (float) (this.d + (f * 7.0E-4d * u));
            } else if (this.R.a(1200.0d)) {
                this.d = (float) (this.d + (f * 1.0E-4d * u));
            }
            if (this.R.a(1600.0d)) {
                this.d = (float) (this.d + (f * 0.001d));
            }
            if (this.R.a(2200.0d)) {
                this.d = (float) (this.d + (f * 0.001d));
            }
            if (this.R.a(2600.0d)) {
                this.d = (float) (this.d + (f * 0.001d));
            }
            if (this.R.a(8000.0d)) {
                this.d = (float) (this.d + (f * 0.005d));
            }
            if (this.R.a(9000.0d)) {
                this.d = (float) (this.d + (f * 0.01d));
            }
            if (this.R.a(10100.0d)) {
                this.d = (float) (this.d + (f * 0.01d));
            }
            if (this.R.a(30000.0d)) {
                this.d = (float) (this.d + (f * 0.05d));
            }
        }
        if (this.R.a(5000.0d)) {
            this.d = (float) (this.d + (f * 0.001d));
        }
        if (!this.R.a(800.0d) && !this.s && this.d > 1.2f) {
            this.d = 1.2f;
        }
        if (this.d > 3.5f) {
            this.d = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            v();
            if (this.d < 3.0f) {
                return;
            }
        }
    }

    public void a(ArrayList arrayList, d dVar, ao aoVar, int i) {
        this.N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            as a = dVar.a(aoVar);
            if (a != null && !this.N.contains(a)) {
                this.N.add(a);
            }
        }
        arrayList.addAll(this.N);
    }

    public void v() {
        ao aoVar;
        am g;
        int d = d();
        int i = 12;
        int i2 = 50;
        if (this.R.ac()) {
            i2 = 65;
            i = 16;
        }
        boolean a = this.R.a(25000.0d);
        ArrayList arrayList = new ArrayList();
        boolean ai = this.R.ai();
        boolean aj = this.R.aj();
        float f = 0.4f;
        float f2 = 0.3f;
        if (!this.R.bh) {
            f = 0.1f;
            f2 = 0.5f;
        }
        if (!this.R.bi) {
            f = 0.2f;
            f2 = 0.1f;
        }
        float c = com.corrodinggames.rts.gameFramework.f.c(0.0f, 1.0f);
        if (c < f) {
            aoVar = ao.LAND;
        } else if (c < f + f2) {
            aoVar = ao.HOVER;
        } else {
            aoVar = ao.AIR;
        }
        if ((this.R.a(1300.0d) && this.d >= 1.0f) || (this.R.a(300.0d) && this.d >= 3.0f)) {
            if (this.R.ah() && this.R.bc < i && com.corrodinggames.rts.gameFramework.f.c(100) < 35) {
                a(arrayList, this.R.bu, null, 2);
                if (a) {
                }
            }
            if (d < 3 && this.R.ba < i2) {
                if (aoVar == ao.LAND) {
                    a(arrayList, this.R.br, null, 4);
                    if (a) {
                    }
                } else if (aoVar == ao.HOVER) {
                    a(arrayList, this.R.bs, null, 4);
                    if (a) {
                    }
                } else {
                    a(arrayList, this.R.bt, null, 4);
                    if (a) {
                    }
                }
            }
            if (this.d >= 1.0f && ai && this.m == 0.0f) {
                int a2 = this.R.a(this.R.bx, b.include);
                int a3 = a2 + this.R.a(this.R.by, b.include);
                int ao = this.R.ao();
                if ((this.R.a(1700.0d) || ao > 10 || (this.R.bl == 0 && ao >= 1 && a2 == 0)) && (a3 < 3 || (ao > 20 && a3 < 5))) {
                    if (aj && a3 < 2) {
                        a(arrayList, this.R.bw, null, 2);
                    } else {
                        a(arrayList, this.R.bw, ao.AIR, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.F++;
        }
        while (arrayList.size() != 0) {
            as asVar = (as) arrayList.remove(arrayList.size() - 1);
            am b = am.b(asVar);
            boolean z = true;
            if (this.s && com.corrodinggames.rts.gameFramework.f.c(100) < 10 && (g = g()) != null && !this.R.b(b, g)) {
                this.F++;
                z = false;
            }
            if (z) {
                if (a(asVar, false)) {
                    this.F++;
                    this.R.bE.a(asVar);
                    this.d -= 1.0f;
                    if (this.R.g(b)) {
                        this.m = 1000.0f;
                        this.R.bl++;
                        return;
                    }
                    return;
                }
                this.G++;
            }
        }
    }

    public void a(y yVar, com.corrodinggames.rts.game.units.custom.d.b bVar, boolean z) {
        this.O = yVar.mo1r();
        if (z) {
            this.P = null;
            this.B = null;
            return;
        }
        this.P = bVar;
        this.B = bVar.i(yVar);
    }
}
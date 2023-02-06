package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.ak;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/n.class */
public class n extends h {
    boolean a;
    int b;
    int c;
    i d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;
    int l;
    h m;
    y n;
    float o;
    boolean p;
    boolean q;
    float r;
    float s;

    @Override // com.corrodinggames.rts.game.a.o, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.a);
        gameOutputStream.writeInt(this.b);
        gameOutputStream.writeInt(this.c);
        gameOutputStream.writeInt(this.F.size());
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((y) it.next());
        }
        gameOutputStream.writeByte(5);
        gameOutputStream.writeInt(this.R.a(this.m));
        gameOutputStream.writeBoolean(this.q);
        gameOutputStream.a(this.n);
        gameOutputStream.writeFloat(this.o);
        gameOutputStream.writeBoolean(this.p);
        gameOutputStream.writeFloat(this.r);
        gameOutputStream.writeFloat(this.s);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.a.o
    public void a(GameInputStream gameInputStream) {
        this.a = gameInputStream.readBoolean();
        this.b = gameInputStream.readInt();
        this.c = gameInputStream.readInt();
        q();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            y p = gameInputStream.p();
            if (p != null) {
                if (!this.R.g(p)) {
                    GameEngine.print("TransporterGroup:readIn: Unit is not transporterUnit");
                } else {
                    a(p);
                }
            }
        }
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.m = (h) this.R.m(gameInputStream.readInt());
        }
        if (readByte >= 2) {
            this.q = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.n = gameInputStream.p();
        }
        if (readByte >= 4) {
            this.o = gameInputStream.readFloat();
            this.p = gameInputStream.readBoolean();
        }
        if (readByte >= 5) {
            this.r = gameInputStream.readFloat();
            this.s = gameInputStream.readFloat();
        }
        super.a(gameInputStream);
    }

    public n(a aVar) {
        super(aVar);
        this.e = 100.0f;
        this.f = 4000.0f;
        this.g = 100.0f;
        this.o = 0.0f;
        this.p = false;
    }

    public void c() {
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (!amVar.bV && amVar.bX == this.R && this.l > this.F.size() && (amVar instanceof y)) {
                y yVar = (y) amVar;
                if (!yVar.bN && yVar.aB == null && this.R.g(yVar) && this.R.i(yVar)) {
                    a(yVar);
                }
            }
        }
    }

    public boolean d() {
        return this.m != null;
    }

    @Override // com.corrodinggames.rts.game.a.h
    public void c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.h += f;
        n();
        if (this.l <= this.F.size()) {
        }
        this.i = com.corrodinggames.rts.gameFramework.f.a(this.i, f);
        this.j = com.corrodinggames.rts.gameFramework.f.a(this.j, f);
        this.k = com.corrodinggames.rts.gameFramework.f.a(this.k, f);
        if (!d() && !this.q && this.l > this.F.size() && this.i == 0.0f) {
            this.i = 300.0f;
            c();
        }
        if (!d() && this.F.size() != 0) {
            if (!d()) {
                this.f = com.corrodinggames.rts.gameFramework.f.a(this.f, f);
                if (this.f == 0.0f) {
                    this.f = 4000.0f;
                    if (this.d != null) {
                        PointF w = this.d.w();
                        this.S = w.x;
                        this.T = w.y;
                    }
                }
            }
            if (this.j == 0.0f) {
                this.j = 400.0f;
                SyncPacket a = gameEngine.cf.a(this.R);
                Iterator it = this.F.iterator();
                while (it.hasNext()) {
                    y yVar = (y) it.next();
                    if (c(yVar) > 28900.0f && !yVar.aw()) {
                        a.a(yVar);
                    } else if (((ak) yVar).bB() != 0) {
                        com.corrodinggames.rts.game.units.a.c cp = yVar.cp();
                        SyncPacket a2 = gameEngine.cf.a(this.R);
                        a2.a(yVar);
                        a2.a(cp);
                    }
                }
                a.a(this.S, this.T);
            }
            if (this.m == null) {
                this.g = com.corrodinggames.rts.gameFramework.f.a(this.g, f);
                if (this.g == 0.0f) {
                    this.g = 100.0f;
                    if (com.corrodinggames.rts.gameFramework.f.rand(0, 100) < 80) {
                        a(f, true);
                    }
                    if (this.m == null) {
                        a(f, false);
                    }
                }
            }
        }
        if (this.m != null && this.m.V) {
            this.m = null;
        }
        if (!this.q) {
            if (this.m != null) {
                ArrayList arrayList = this.m.G;
                if (this.n != null && (this.n.bV || this.n.cN != null || this.n.cO != null)) {
                    arrayList.remove(this.n);
                    this.n = null;
                }
                if (this.n == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        y yVar2 = (y) it2.next();
                        if (yVar2.cN == null) {
                            Iterator it3 = this.F.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                } else if (((y) it3.next()).d((am) yVar2, false)) {
                                    this.n = yVar2;
                                    break;
                                }
                            }
                        }
                    }
                    if (this.n == null) {
                        this.q = true;
                        this.j = 0.0f;
                        this.k = 0.0f;
                        this.r = this.m.S;
                        this.s = this.m.T;
                    }
                }
                if (this.n != null) {
                    if (this.j == 0.0f) {
                        this.j = 400.0f;
                        SyncPacket a3 = gameEngine.cf.a(this.R);
                        Iterator it4 = this.F.iterator();
                        while (it4.hasNext()) {
                            a3.a((y) it4.next());
                        }
                        a3.a(this.n.eo, this.n.ep);
                    }
                    if (this.k == 0.0f) {
                        this.k = 80.0f;
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            y yVar3 = (y) it5.next();
                            Iterator it6 = this.F.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    y yVar4 = (y) it6.next();
                                    if (yVar4.d((am) yVar3, false) && com.corrodinggames.rts.gameFramework.f.a(yVar4.eo, yVar4.ep, yVar3.eo, yVar3.ep) < 14400.0f) {
                                        SyncPacket a4 = gameEngine.cf.a(this.R);
                                        a4.a(yVar3);
                                        a4.e(yVar4);
                                        break;
                                    }
                                }
                            }
                        }
                        boolean z = false;
                        Iterator it7 = this.F.iterator();
                        while (it7.hasNext()) {
                            if (((y) it7.next()).d((am) this.n, false)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.n = null;
                        }
                    }
                }
            }
        } else if (this.m == null) {
            e();
        } else {
            if (this.j == 0.0f) {
                this.j = 400.0f;
                float c = this.m.S + com.corrodinggames.rts.gameFramework.f.c(-40.0f, 40.0f);
                float c2 = this.m.T + com.corrodinggames.rts.gameFramework.f.c(-40.0f, 40.0f);
                if (this.o > 600.0f) {
                    c += com.corrodinggames.rts.gameFramework.f.c(-300.0f, 300.0f);
                    c2 += com.corrodinggames.rts.gameFramework.f.c(-300.0f, 300.0f);
                }
                if (this.o > 1200.0f) {
                    c += com.corrodinggames.rts.gameFramework.f.c(-300.0f, 300.0f);
                    c2 += com.corrodinggames.rts.gameFramework.f.c(-300.0f, 300.0f);
                }
                if (com.corrodinggames.rts.gameFramework.utility.y.a(c, c2, ao.LAND)) {
                    c += com.corrodinggames.rts.gameFramework.f.c(-100.0f, 100.0f);
                    c2 += com.corrodinggames.rts.gameFramework.f.c(-100.0f, 100.0f);
                }
                if (com.corrodinggames.rts.gameFramework.utility.y.a(c, c2, ao.LAND)) {
                    c += com.corrodinggames.rts.gameFramework.f.c(-200.0f, 200.0f);
                    c2 += com.corrodinggames.rts.gameFramework.f.c(-200.0f, 200.0f);
                }
                if (com.corrodinggames.rts.gameFramework.utility.y.a(c, c2, ao.LAND)) {
                    c += com.corrodinggames.rts.gameFramework.f.c(-200.0f, 200.0f);
                    c2 += com.corrodinggames.rts.gameFramework.f.c(-200.0f, 200.0f);
                }
                if (com.corrodinggames.rts.gameFramework.utility.y.a(c, c2, ao.LAND)) {
                    this.j = 30.0f;
                } else {
                    this.r = c;
                    this.s = c2;
                    SyncPacket a5 = gameEngine.cf.a(this.R);
                    Iterator it8 = this.F.iterator();
                    while (it8.hasNext()) {
                        y yVar5 = (y) it8.next();
                        if (((ak) yVar5).bB() != 0) {
                            if (com.corrodinggames.rts.gameFramework.f.a(yVar5.eo, yVar5.ep, this.r, this.s) > 1600.0f) {
                                a5.a(yVar5);
                            }
                        } else {
                            SyncPacket a6 = gameEngine.cf.a(this.R);
                            a6.a(yVar5);
                            a6.a(this.S, this.T);
                        }
                    }
                    a5.a(this.r, this.s);
                }
            }
            if (this.k == 0.0f) {
                this.k = 100.0f;
                Iterator it9 = this.F.iterator();
                while (it9.hasNext()) {
                    y yVar6 = (y) it9.next();
                    if (com.corrodinggames.rts.gameFramework.f.a(yVar6.eo, yVar6.ep, this.r, this.s) < 6400.0f) {
                        this.p = true;
                        com.corrodinggames.rts.game.units.a.c cp2 = yVar6.cp();
                        SyncPacket a7 = gameEngine.cf.a(this.R);
                        a7.a(yVar6);
                        a7.a(cp2);
                    }
                }
            }
            if (this.p) {
                this.m.o();
                this.o += f;
            }
            boolean z2 = false;
            Iterator it10 = this.F.iterator();
            while (it10.hasNext()) {
                y yVar7 = (y) it10.next();
                if (!yVar7.bV && ((ak) yVar7).bB() != 0) {
                    z2 = true;
                }
            }
            if (!z2 || this.o > 1700.0f) {
                e();
            }
        }
        if (this.h > 1500.0f && this.F.size() == 0) {
            p();
        }
    }

    public void e() {
        this.q = false;
        this.m = null;
        this.o = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.p = false;
        f();
    }

    public void a(float f, boolean z) {
        Iterator it = this.R.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if ((oVar instanceof h) && !(oVar instanceof n) && (!z || (oVar instanceof l))) {
                h hVar = (h) oVar;
                if (hVar.G.size() != 0 && !hVar.m()) {
                    this.m = hVar;
                    this.n = null;
                    return;
                }
            }
        }
    }

    public i a(boolean z) {
        i iVar = null;
        Iterator it = this.R.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar2 = (i) oVar;
                if (!iVar2.s || !z) {
                    if (iVar2.b == j.Active) {
                        iVar = iVar2;
                        if (com.corrodinggames.rts.gameFramework.f.c(3) == 0) {
                            return iVar;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return iVar;
    }

    public void f() {
        PointF pointF = null;
        if (1 != 0) {
            this.d = a(true);
            if (this.d == null) {
                this.d = a(false);
            }
            if (this.d != null) {
                pointF = this.d.w();
            }
        }
        if (pointF == null) {
            pointF = this.R.am();
            this.d = null;
        }
        this.S = pointF.x;
        this.T = pointF.y;
    }
}
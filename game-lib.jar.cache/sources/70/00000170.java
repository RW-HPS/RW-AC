package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.aq;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.AbstractList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/g.class */
public class g extends h {

    /* renamed from: a  reason: collision with root package name */
    boolean f139a;
    String b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    y g;
    boolean h;
    int i;
    int j;
    i k;
    float l;
    float m;
    float n;
    float o;
    float p;
    boolean q;
    boolean r;
    boolean s;
    float t;
    float u;
    boolean v;
    am w;
    float x;
    float y;
    float z;
    int A;
    boolean B;
    public int C;
    public am D;
    ao E;

    @Override // com.corrodinggames.rts.game.a.h
    public boolean a() {
        return this.f139a;
    }

    @Override // com.corrodinggames.rts.game.a.h
    public boolean b() {
        if (!this.h) {
            return true;
        }
        return false;
    }

    public static g a(a aVar, y yVar) {
        g gVar = new g(aVar, false);
        gVar.f139a = true;
        gVar.c = true;
        gVar.d = true;
        gVar.e = true;
        gVar.g = yVar;
        gVar.a(yVar);
        gVar.A = 0;
        gVar.k();
        return gVar;
    }

    @Override // com.corrodinggames.rts.game.a.o, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.h);
        gameOutputStream.writeInt(this.i);
        gameOutputStream.writeInt(this.j);
        gameOutputStream.writeInt(this.F.size());
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((y) it.next());
        }
        gameOutputStream.writeByte(7);
        gameOutputStream.writeBoolean(false);
        gameOutputStream.writeBoolean(this.s);
        gameOutputStream.writeFloat(this.o);
        gameOutputStream.writeInt(this.G.size());
        Iterator it2 = this.G.iterator();
        while (it2.hasNext()) {
            gameOutputStream.a((y) it2.next());
        }
        gameOutputStream.writeBoolean(this.B);
        gameOutputStream.writeBoolean(this.f139a);
        gameOutputStream.writeBoolean(this.c);
        gameOutputStream.writeBoolean(this.d);
        gameOutputStream.writeBoolean(this.e);
        gameOutputStream.writeBoolean(this.f);
        gameOutputStream.a(this.g);
        gameOutputStream.writeInt(this.A);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.a.o
    public void a(GameInputStream gameInputStream) {
        this.h = gameInputStream.readBoolean();
        this.i = gameInputStream.readInt();
        this.j = gameInputStream.readInt();
        q();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            y p = gameInputStream.p();
            if (p != null) {
                a(p);
            }
        }
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            gameInputStream.readBoolean();
        }
        if (readByte >= 2) {
            this.s = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.o = gameInputStream.readFloat();
        }
        if (readByte >= 4) {
            this.G.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                y p2 = gameInputStream.p();
                if (p2 != null) {
                    this.G.add(p2);
                }
            }
        }
        if (readByte >= 5) {
            this.B = gameInputStream.readBoolean();
        }
        if (readByte >= 6) {
            this.f139a = gameInputStream.readBoolean();
            this.c = gameInputStream.readBoolean();
            this.d = gameInputStream.readBoolean();
            this.e = gameInputStream.readBoolean();
            this.f = gameInputStream.readBoolean();
            this.g = gameInputStream.p();
        }
        if (readByte >= 7) {
            this.A = gameInputStream.readInt();
        }
        if (!this.B) {
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                if (yVar instanceof com.corrodinggames.rts.game.units.h.f) {
                    if (yVar != null && yVar.aB == this) {
                        yVar.aB = null;
                    }
                    if (yVar != null) {
                        this.G.remove(yVar);
                    }
                    it.remove();
                }
            }
        }
        super.a(gameInputStream);
    }

    public g(a aVar) {
        super(aVar);
        this.h = true;
        this.l = 1000.0f;
        this.m = 100.0f;
        this.n = 4000.0f;
        this.o = 0.0f;
        this.p = 1000.0f;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = 0.0f;
        this.u = 0.0f;
        this.C = -9999;
        this.D = null;
        this.E = ao.NONE;
    }

    public g(a aVar, boolean z) {
        this(aVar);
        this.h = z;
    }

    @Override // com.corrodinggames.rts.game.a.h
    protected void a(y yVar) {
        super.a(yVar);
        this.E = j();
    }

    public void c() {
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (!amVar.bV && amVar.bX == this.R && this.A > this.F.size() && (amVar instanceof y)) {
                y yVar = (y) amVar;
                if (!yVar.bM && !yVar.bN && yVar.aB == null && this.R.h(yVar) && this.R.i(yVar)) {
                    if (this.B) {
                        if (amVar.h() != ao.LAND) {
                            if (!this.R.a(yVar, this.S, this.T) || (!b() && com.corrodinggames.rts.gameFramework.f.a(0, 100) <= 2)) {
                                a(yVar);
                            }
                        }
                    } else if (amVar.h() != ao.WATER) {
                        if (!this.R.a(yVar, this.S, this.T)) {
                        }
                        a(yVar);
                    }
                }
            }
        }
    }

    public boolean d() {
        if (this.A <= this.F.size()) {
            return true;
        }
        return false;
    }

    public am a(float f) {
        if (GameEngine.getGameEngine().by - (f * 1000.0f) < this.C) {
            return this.D;
        }
        return null;
    }

    public am e() {
        am a2 = a(6.0f);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public am f() {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            am ab = ((y) it.next()).ab();
            if (ab != null) {
                return ab;
            }
        }
        return null;
    }

    public void a(SyncPacket syncPacket, boolean z, am amVar) {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (!z || yVar.aq()) {
                if (amVar == null || this.R.a(yVar, amVar)) {
                    syncPacket.a(yVar);
                }
            }
        }
    }

    public void a(String str) {
        this.b = str;
    }

    public PointF a(am amVar) {
        PointF pointF = new PointF();
        pointF.x = this.S;
        pointF.y = this.T;
        float random = (float) (Math.random() * 360.0d);
        float c = com.corrodinggames.rts.gameFramework.f.c(50.0f, 100.0f);
        pointF.x += com.corrodinggames.rts.gameFramework.f.k(random) * c;
        pointF.y += com.corrodinggames.rts.gameFramework.f.j(random) * c;
        if (amVar != null) {
            float d = com.corrodinggames.rts.gameFramework.f.d(pointF.x, pointF.y, amVar.eo, amVar.ep);
            float c2 = com.corrodinggames.rts.gameFramework.f.c(100.0f, 200.0f);
            pointF.x += com.corrodinggames.rts.gameFramework.f.k(d) * (-c2);
            pointF.y += com.corrodinggames.rts.gameFramework.f.j(d) * (-c2);
        }
        return pointF;
    }

    @Override // com.corrodinggames.rts.game.a.h
    public void b(float f) {
        am e;
        super.b(f);
        n();
        this.E = j();
        if (!this.f && (e = e()) != null && f() == null) {
            if (a(e, false)) {
                a("fighting attacker");
                SyncPacket a2 = GameEngine.getGameEngine().cf.a(this.R);
                a(a2, true, e);
                a2.a(e.eo, e.ep, false);
                return;
            }
            a("flight from attacker");
            PointF a3 = a(e);
            this.S = a3.x;
            this.T = a3.y;
            if (this.z > 200.0f) {
                this.z = 200.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.a.h
    public void c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.x += f;
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar != null && this.C < yVar.bs) {
                this.C = yVar.bs;
                this.D = yVar.bt;
            }
        }
        n();
        if (d()) {
            this.l = com.corrodinggames.rts.gameFramework.f.a(this.l, f);
        } else if (this.v) {
        }
        this.y = com.corrodinggames.rts.gameFramework.f.a(this.y, f);
        this.z = com.corrodinggames.rts.gameFramework.f.a(this.z, f);
        this.p = com.corrodinggames.rts.gameFramework.f.a(this.p, f);
        if (!this.v && !this.r && !d() && this.y == 0.0f) {
            this.y = 200 + com.corrodinggames.rts.gameFramework.f.c(200);
            c();
        }
        if (!this.v || this.q) {
            if (!this.q) {
                this.n = com.corrodinggames.rts.gameFramework.f.a(this.n, f);
                if (this.n == 0.0f) {
                    if (this.k == null) {
                        this.k = g();
                    }
                    if (this.k != null) {
                        PointF w = this.k.w();
                        if (!a(w.x, w.y)) {
                            this.n = 100.0f;
                            a("random move: bad target");
                        } else {
                            this.n = 4000.0f;
                            this.S = w.x;
                            this.T = w.y;
                            a("random move");
                        }
                    } else {
                        a("random move: no linked base");
                    }
                }
            }
            if (this.z == 0.0f) {
                this.z = 800.0f;
                SyncPacket a2 = gameEngine.cf.a(this.R);
                Iterator it2 = this.F.iterator();
                while (it2.hasNext()) {
                    y yVar2 = (y) it2.next();
                    boolean z = true;
                    if (c(yVar2) < 28900.0f) {
                        z = false;
                    }
                    if (!this.f && yVar2.aj() && !yVar2.aq()) {
                        z = false;
                    }
                    if (z) {
                        a2.a(yVar2);
                    }
                }
                if (this.f) {
                    a2.a(this.S, this.T);
                } else {
                    a2.b(this.S, this.T);
                }
            }
        }
        if (this.h) {
            e(f);
        } else {
            d(f);
        }
        if (this.A == 0 && this.F.size() == 0) {
            p();
        }
        if (this.c) {
            if (this.g == null || this.g.bV) {
                p();
            }
        }
    }

    i g() {
        float f = -1.0f;
        i iVar = null;
        Iterator it = this.R.bn.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof i) {
                i iVar2 = (i) oVar;
                if (b(iVar2.S, iVar2.T)) {
                    float d = iVar2.d(this.S, this.T);
                    if (iVar == null || d < f) {
                        f = d;
                        iVar = iVar2;
                    }
                }
            }
        }
        return iVar;
    }

    public void d(float f) {
        if (this.k == null || this.k.V) {
            k();
        }
        if (this.c && this.g != null) {
            if (this.e && !this.f) {
                if (this.g.cu / this.g.cv < 0.5d) {
                    this.f = true;
                    if (this.z > 100.0f) {
                        this.z = 100.0f;
                    }
                }
                if (this.w == null) {
                    k();
                }
            } else {
                if (this.g.cu / this.g.cv > 0.6d) {
                    this.f = false;
                }
                boolean z = false;
                if (this.k != null && !this.k.t) {
                    z = true;
                }
                if (!z) {
                    i a2 = this.R.a(this.g.h(), this.g.eo, this.g.ep, true);
                    if (a2 != null) {
                        this.k = a2;
                    }
                    if (this.k != null) {
                        PointF w = this.k.w();
                        this.S = w.x;
                        this.T = w.y;
                        if (this.z > 100.0f) {
                            this.z = 100.0f;
                        }
                        a("moving to new base");
                    }
                }
            }
        }
        if (this.k != null) {
            for (int i = 0; i < 2; i++) {
                if (this.p == 0.0f) {
                    am g = this.k.g();
                    if (g == null) {
                        break;
                    } else if (a(g, false)) {
                        this.w = g;
                        this.p = 500.0f;
                        this.n = 2000.0f;
                        if (!this.f) {
                            this.S = g.eo;
                            this.T = g.ep;
                        }
                        if (this.z > 100.0f) {
                            this.z = 100.0f;
                        }
                        a("defending base");
                    }
                }
            }
            if (this.p == 0.0f) {
                this.f = false;
                this.w = null;
            }
        }
    }

    public void e(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.v) {
            if (this.l == 0.0f) {
                this.v = true;
                this.q = true;
            }
        } else {
            if (this.w == null || !this.w.bT() || this.w.bV || !this.r) {
                this.w = this.R.as();
                if (this.w != null && !a(this.w, true)) {
                    this.w = null;
                }
            }
            if (this.w != null) {
                if (this.q) {
                    this.u += f;
                    if (!this.r) {
                        this.t = com.corrodinggames.rts.gameFramework.f.a(this.t, f);
                        if (this.t == 0.0f) {
                            this.t = 20.0f;
                            h();
                        }
                    } else {
                        boolean z = false;
                        Iterator it = this.F.iterator();
                        while (it.hasNext()) {
                            if (c((y) it.next()) > 28900.0f) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.q = false;
                        }
                        Iterator it2 = this.F.iterator();
                        while (it2.hasNext()) {
                            if (((y) it2.next()).bs > gameEngine.by - 1000) {
                                this.q = false;
                                a("Not staging due to damage");
                            }
                        }
                    }
                    if (this.u > 17000.0f) {
                        this.q = false;
                        a("attacking target");
                    }
                } else {
                    this.o += f;
                    if (this.z == 0.0f) {
                        this.z = 800.0f;
                        boolean z2 = false;
                        AbstractList mVar = new com.corrodinggames.rts.gameFramework.utility.m();
                        Iterator it3 = this.F.iterator();
                        while (it3.hasNext()) {
                            y yVar = (y) it3.next();
                            boolean z3 = true;
                            if (this.w != null) {
                                if (!this.R.a(yVar, this.w)) {
                                    z3 = false;
                                }
                                if (z3 && !aq.a(yVar, this.w)) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                z2 = true;
                                mVar.add(yVar);
                            }
                        }
                        if (!z2) {
                            this.q = false;
                            a("cannot reach main target");
                        } else {
                            SyncPacket a2 = gameEngine.cf.a(this.R);
                            a2.a(mVar);
                            if (this.w != null && com.corrodinggames.rts.gameFramework.f.a(0, 100) < 80) {
                                a2.a(this.w.eo, this.w.ep, true);
                            } else {
                                a2.a(this.w, true);
                            }
                            a("attacking main target");
                        }
                    }
                }
            }
        }
        if (this.v) {
            if (this.F.size() == 0) {
                p();
            }
            if (this.o > 1000.0f && this.F.size() < 3) {
                p();
            }
            if (this.o > 11000.0f) {
                p();
            }
        }
    }

    public void h() {
        float f = this.w.eo;
        float f2 = this.w.ep;
        float d = com.corrodinggames.rts.gameFramework.f.d(f, f2, this.S, this.T);
        float b = com.corrodinggames.rts.gameFramework.f.b(f, f2, this.S, this.T);
        if (com.corrodinggames.rts.gameFramework.f.a(0, 100) < 80) {
            d += com.corrodinggames.rts.gameFramework.f.a(-110, 110);
        }
        int i = (int) (b * 0.6d);
        if (i < 720) {
            i = 720;
        }
        float a2 = com.corrodinggames.rts.gameFramework.f.a(50, i);
        if (com.corrodinggames.rts.gameFramework.f.a(0, 100) < 80 && a2 < 450.0f) {
            a2 = com.corrodinggames.rts.gameFramework.f.a(450, i);
        }
        float k = f + (com.corrodinggames.rts.gameFramework.f.k(d) * a2);
        float j = f2 + (com.corrodinggames.rts.gameFramework.f.j(d) * a2);
        boolean z = true;
        if (!a(k, j)) {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.h() == ao.LAND) {
                z2 = true;
            }
            if (yVar.h() == ao.WATER) {
                z3 = true;
            }
        }
        if (z2) {
            if (this.R.aG == 0 && !b(k, j)) {
                z = false;
            }
            if (!this.R.a(k, j, this.w.eo, this.w.ep, ao.LAND) && com.corrodinggames.rts.gameFramework.f.a(0, 100) < 98) {
                z = false;
            }
        }
        if (z3) {
            if (!b(k, j)) {
                z = false;
            }
            if (!this.R.a(k, j, this.w.eo, this.w.ep, ao.WATER)) {
                z = false;
            }
        }
        if (z) {
            this.S = k;
            this.T = j;
            this.z = 0.0f;
            this.r = true;
            this.G.clear();
            Iterator it2 = this.F.iterator();
            while (it2.hasNext()) {
                y yVar2 = (y) it2.next();
                if (yVar2.h() != ao.WATER && !this.R.a(yVar2, this.S, this.T)) {
                    this.G.add(yVar2);
                }
            }
        }
    }

    public ao i() {
        return this.E;
    }

    public ao j() {
        if (this.F.size() == 0) {
            if (this.B) {
                return ao.WATER;
            }
            return ao.LAND;
        }
        boolean z = true;
        Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((y) it.next()).h() != ao.AIR) {
                z = false;
                break;
            }
        }
        if (z) {
            return ao.AIR;
        }
        if (this.B) {
            boolean z2 = true;
            Iterator it2 = this.F.iterator();
            while (it2.hasNext()) {
                if (((y) it2.next()).h() == ao.WATER) {
                    z2 = false;
                }
            }
            if (z2) {
                return ao.HOVER;
            }
            return ao.WATER;
        }
        boolean z3 = true;
        Iterator it3 = this.F.iterator();
        while (it3.hasNext()) {
            ao h = ((y) it3.next()).h();
            if (h == ao.LAND || h == ao.OVER_CLIFF) {
                z3 = false;
            }
        }
        if (z3) {
            return ao.HOVER;
        }
        return ao.LAND;
    }

    public boolean a(float f, float f2) {
        return !com.corrodinggames.rts.gameFramework.utility.y.a(f, f2, i());
    }

    public boolean b(float f, float f2) {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            if (!this.R.a((y) it.next(), f, f2)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(am amVar, boolean z) {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (z || this.R.a(yVar, amVar.eo, amVar.ep)) {
                if (aq.a(yVar, amVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void k() {
        PointF pointF = null;
        if (this.c && this.g != null) {
            this.S = this.g.eo;
            this.T = this.g.ep;
            this.k = this.R.c(this.g.eo, this.g.ep);
            return;
        }
        if (1 != 0) {
            int i = 0;
            while (i < 7) {
                boolean z = i > 3;
                if (pointF == null) {
                    Iterator it = this.R.bn.iterator();
                    while (it.hasNext()) {
                        o oVar = (o) it.next();
                        if (oVar instanceof i) {
                            i iVar = (i) oVar;
                            if (iVar.b == j.Active && (iVar.u() > 2 || z)) {
                                if (pointF == null || com.corrodinggames.rts.gameFramework.f.c(this.R.ay + 2) == 0) {
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        if (pointF == null) {
                                            PointF w = iVar.w();
                                            if (a(w.x, w.y)) {
                                                pointF = w;
                                            }
                                        }
                                    }
                                    this.k = iVar;
                                }
                            }
                        }
                    }
                }
                i++;
            }
        }
        if (pointF == null) {
            pointF = this.R.am();
            this.k = null;
        }
        this.S = pointF.x;
        this.T = pointF.y;
    }
}
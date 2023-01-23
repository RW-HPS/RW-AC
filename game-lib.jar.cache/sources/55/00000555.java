package com.corrodinggames.rts.gameFramework.k;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/l.class */
public final class l {

    /* renamed from: a */
    static final boolean f608a = false;
    static boolean b;
    static boolean c;
    static boolean d;
    public static f e;
    static boolean f;
    static boolean g;
    static boolean h;
    static int i;
    static boolean j;
    static ArrayList k;
    static boolean l;
    public static final boolean m;
    com.corrodinggames.rts.game.b.b q;
    int r;
    short s;
    short t;
    public i x;
    public i y;
    public i z;
    public i A;
    public i B;
    public i C;
    public i D;
    public i E;
    public boolean n = true;
    o o = new o(this);
    boolean p = true;
    ArrayList u = new ArrayList();
    i[] v = new i[0];
    public Paint w = new Paint();
    Paint F = new Paint();
    Object G = new Object();
    LinkedList I = new LinkedList();
    LinkedList J = new LinkedList();
    Object K = new Object();
    ArrayList H = new ArrayList();

    static {
        b = !GameEngine.as;
        c = false;
        d = false;
        f = false;
        g = false;
        h = false;
        i = 20;
        j = false;
        k = new ArrayList();
        l = false;
        m = false;
    }

    public i a(ao aoVar) {
        i[] iVarArr;
        for (i iVar : this.v) {
            if (iVar.f606a == aoVar) {
                return iVar;
            }
        }
        return null;
    }

    public boolean a(ao aoVar, int i2, int i3) {
        return a(a(aoVar), i2, i3);
    }

    public boolean b(ao aoVar, int i2, int i3) {
        return a(a(aoVar), i2, i3, true);
    }

    public boolean a(i iVar, int i2, int i3) {
        return a(iVar, i2, i3, false);
    }

    public boolean a(i iVar, int i2, int i3, boolean z) {
        if (!this.q.c(i2, i3)) {
            return true;
        }
        if (iVar.f606a == ao.AIR) {
            return false;
        }
        int i4 = (i2 * this.t) + i3;
        if ((!z && iVar.e[i4] == -1) || iVar.d[i4] == -1 || iVar.f[i4] == -1) {
            return true;
        }
        return false;
    }

    public final int b(i iVar, int i2, int i3) {
        if (!this.q.c(i2, i3)) {
            return -1;
        }
        if (iVar.f606a == ao.AIR) {
            return 0;
        }
        int i4 = (i2 * this.t) + i3;
        if (iVar.d[i4] == -1 || iVar.e[i4] == -1 || iVar.f[i4] == -1) {
            return -1;
        }
        return iVar.d[i4] + iVar.e[i4] + (iVar.f[i4] * 10);
    }

    public final int c(i iVar, int i2, int i3) {
        if (!this.q.c(i2, i3)) {
            return -1;
        }
        if (iVar.f606a == ao.AIR) {
            return 4;
        }
        if (iVar.j == null) {
            return -1;
        }
        return iVar.j[(i2 * this.t) + i3];
    }

    public boolean a(int i2, int i3) {
        if (!this.q.c(i2, i3)) {
            return true;
        }
        int i4 = (i2 * this.t) + i3;
        if (this.D.d[i4] != -1 || this.A.d[i4] == -1) {
            return false;
        }
        return true;
    }

    public boolean b(int i2, int i3) {
        if (!this.q.c(i2, i3)) {
            return true;
        }
        int i4 = (i2 * this.t) + i3;
        if (this.C.d[i4] != -1 || this.E.d[i4] == -1) {
            return false;
        }
        return true;
    }

    public synchronized void a(com.corrodinggames.rts.game.b.b bVar, boolean z) {
        d();
        GameEngine.m10e("PathEngine: Setting up map costs");
        boolean z2 = false;
        if (z && this.q != null && this.q == bVar && this.s == bVar.u.n && this.t == bVar.u.o) {
            if (this.r == i.a(bVar)) {
                GameEngine.m10e("PathEngine: Keeping existing map costs");
                z2 = true;
            } else {
                GameEngine.m10e("PathEngine: Error: Map checksum does not match!!!");
            }
        }
        if (z2) {
        }
        this.q = bVar;
        this.r = i.a(bVar);
        this.s = (short) bVar.u.n;
        this.t = (short) bVar.u.o;
        e = null;
        this.u.clear();
        this.v = new i[0];
        this.x = new i(this, ao.NONE, this.s, this.t);
        this.y = new i(this, ao.LAND, this.s, this.t);
        this.y.b();
        this.y.a((y) null);
        this.z = new i(this, ao.BUILDING, this.s, this.t);
        this.A = new i(this, ao.WATER, this.s, this.t);
        this.A.b();
        this.A.a((y) null);
        this.B = new i(this, ao.AIR, this.s, this.t);
        this.C = new i(this, ao.HOVER, this.s, this.t);
        this.C.b();
        this.C.a((y) null);
        this.D = new i(this, ao.OVER_CLIFF, this.s, this.t);
        this.D.b();
        this.D.a((y) null);
        this.E = new i(this, ao.OVER_CLIFF_WATER, this.s, this.t);
        this.E.b();
        this.E.a((y) null);
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(bVar);
        }
        this.o.a(bVar);
        GameEngine.m10e("PathEngine: Ready");
    }

    public void a() {
        int i2;
        int i3;
        int i4;
        GameEngine gameEngine = GameEngine.getGameEngine();
        i iVar = this.y;
        Rect rect = new Rect();
        float f2 = gameEngine.cw;
        float f3 = gameEngine.cx;
        float f4 = gameEngine.cA;
        float f5 = gameEngine.cB;
        com.corrodinggames.rts.game.b.e eVar = gameEngine.bL.u;
        int i5 = (int) ((f2 * this.q.r) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) ((f3 * this.q.s) - 1.0f);
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = (int) (((f2 + f4) * this.q.r) + 1.0f);
        if (i7 > this.s - 1) {
            i7 = this.s - 1;
        }
        int i8 = (int) (((f3 + f5) * this.q.s) + 1.0f);
        if (i8 > this.t - 1) {
            i8 = this.t - 1;
        }
        for (int i9 = i5; i9 < i7 + 1; i9++) {
            for (int i10 = i6; i10 < i8 + 1; i10++) {
                if (eVar.a(i9, i10) != null) {
                    int i11 = i9 * this.q.n;
                    int i12 = i10 * this.q.o;
                    rect.a(i11, i12, i11 + this.q.n, i12 + this.q.o);
                    rect.a((int) (-f2), (int) (-f3));
                    boolean b2 = rect.b((int) (gameEngine.bS.x / gameEngine.cX), (int) (gameEngine.bS.y / gameEngine.cX));
                    if (!g || b2) {
                        byte b3 = iVar.d[(i9 * this.t) + i10];
                        byte b4 = iVar.e[(i9 * this.t) + i10];
                        int i13 = iVar.f[(i9 * this.t) + i10];
                        if (b3 == -1) {
                            i2 = 255;
                        } else {
                            i2 = b3 * 2;
                        }
                        if (b4 == -1) {
                            i3 = 255;
                        } else {
                            i3 = b4 * 2;
                        }
                        if (i13 == -1) {
                            i4 = 255;
                        } else {
                            if (i13 != 0) {
                                i13 += 30;
                            }
                            i4 = i13 * 2;
                        }
                        this.F.a(128, i2, i3, i4);
                        gameEngine.bO.b(rect, this.F);
                        if (b2 && iVar.f != null) {
                            gameEngine.bO.a("o:" + ((int) iVar.f[(i9 * this.t) + i10]), rect.d(), rect.e(), gameEngine.dp);
                        }
                    }
                }
            }
        }
    }

    public void a(y yVar) {
        if (yVar != null) {
            PlayerData.b(yVar);
        }
        for (i iVar : this.v) {
            iVar.c(yVar);
        }
        this.y.a(yVar);
        this.C.a(yVar);
        this.D.a(yVar);
        this.E.a(yVar);
    }

    public void b() {
        for (i iVar : this.v) {
            iVar.e();
        }
    }

    public l() {
        this.H.add(new o(this));
        int c2 = com.corrodinggames.rts.gameFramework.f.c();
        if (c2 > 1) {
            GameEngine.b("PathEngine", "We have " + c2 + " cores, creating extra solvers");
            this.H.add(new o(this));
        } else {
            GameEngine.b("PathEngine", "We only have one core, using single solver");
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((o) it.next()).c();
        }
    }

    public void c() {
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((k) it.next()).w = true;
        }
        this.I.clear();
        h();
    }

    public void d() {
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            a((k) it.next());
        }
        this.I.clear();
        h();
    }

    public void a(i iVar, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            if (iVar.k + 50 < gameEngine.tick) {
                iVar.k = gameEngine.tick - 40;
                iVar.e();
            }
            iVar.a(z);
            return;
        }
        if (iVar.k + 30 < gameEngine.tick) {
            iVar.k = gameEngine.tick;
            iVar.e();
        }
        iVar.a(z);
    }

    public k a(boolean z) {
        f kVar;
        if (y.L) {
            kVar = new f(this, z);
        } else {
            kVar = new k(this, z);
        }
        return kVar;
    }

    public void a(k kVar, boolean z) {
        a(kVar, z, false);
    }

    public void a(k kVar, boolean z, boolean z2) {
        if (!this.p) {
            GameEngine.b("PathEngine", "Cannot start new path, not running");
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        a(a(kVar.o), z);
        kVar.e();
        kVar.t = 300.0f;
        int d2 = com.corrodinggames.rts.gameFramework.f.d(kVar.h - kVar.l);
        int d3 = com.corrodinggames.rts.gameFramework.f.d(kVar.i - kVar.m);
        if (d2 < 15 && d3 < 15) {
            kVar.t = 12.0f;
        } else if (d2 < 50 && d3 < 50) {
            kVar.t = 16.0f;
        } else if (d2 < 200 && d3 < 200) {
            kVar.t = 24.0f;
        } else if (d2 < 400 && d3 < 400) {
            kVar.t = 50.0f;
        } else if (d2 < 1000 && d3 < 1000) {
            kVar.t = 100.0f;
        } else if (d2 < 2000 && d3 < 2000) {
            kVar.t = 200.0f;
        }
        if (!gameEngine.bX.B && !gameEngine.cb.i()) {
            if (d2 < 1000 && d3 < 1000) {
                kVar.t = 180.0f;
            } else {
                kVar.t = 360.0f;
            }
        }
        if (kVar.r) {
            kVar.t *= 2.0f;
            kVar.t += 50.0f;
        }
        kVar.s = kVar.t;
        if (!this.n || z2) {
            this.o.a(kVar);
            this.o.b();
            this.I.add(kVar);
            return;
        }
        b(kVar);
        this.I.add(kVar);
    }

    public void a(float f2) {
        i();
    }

    public void b(float f2) {
        i[] iVarArr;
        for (i iVar : this.v) {
            iVar.p = 0;
            if (iVar.o) {
                iVar.o = false;
                iVar.c(null);
            }
        }
        i();
        d(f2);
    }

    public void c(float f2) {
        if (j) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                kVar.h();
                kVar.g();
            }
        }
        if (d) {
            boolean z = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.bS.bZ.b > 0) {
                am amVar = gameEngine.bS.bZ.get(0);
                if (amVar instanceof y) {
                    y yVar = (y) amVar;
                    if (yVar.au != null) {
                        yVar.au.d(yVar);
                        z = false;
                    }
                }
            }
            if (z) {
            }
        }
        if (f) {
            a();
        }
        if (h) {
        }
    }

    public boolean e() {
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.t <= 0.0f && !kVar.c()) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        Iterator it = this.I.iterator();
        String str = null;
        int i2 = 0;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.t <= 0.0f && !kVar.c()) {
                if (str == null) {
                    str = "[distance:" + com.corrodinggames.rts.gameFramework.f.b(kVar.h, kVar.i, kVar.l, kVar.m) + ", allowedDelay:" + kVar.s + " lowPriority:" + kVar.r + "]";
                }
                i2++;
            }
        }
        String str2 = "(total:" + i2 + ") ";
        if (str != null) {
            str2 = str2 + str;
        }
        return str2;
    }

    private void d(float f2) {
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.t <= 0.0f) {
                kVar.t = 0.0f;
                kVar.u = true;
                if (j) {
                    k.add(kVar);
                    if (k.size() > 10) {
                        k.remove(0);
                    }
                }
                if (!kVar.c()) {
                    if (GameEngine.getGameEngine().ay()) {
                        GameEngine.b("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
                    }
                    a(kVar);
                }
                if (kVar.c()) {
                    it.remove();
                }
            } else {
                kVar.t -= f2;
            }
        }
    }

    private k g() {
        k kVar = null;
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            if (kVar == null || kVar.t > kVar2.t) {
                kVar = kVar2;
            }
        }
        if (kVar == null) {
            throw new RuntimeException("Failed to find any paths");
        }
        if (!this.J.remove(kVar)) {
            throw new RuntimeException("Failed remove found path");
        }
        return kVar;
    }

    private void b(k kVar) {
        synchronized (this.K) {
            this.J.add(kVar);
        }
    }

    private void h() {
        synchronized (this.K) {
            this.J.clear();
        }
    }

    private void i() {
        o j2;
        LinkedList linkedList = this.J;
        if (linkedList.size() > 0) {
            synchronized (this.K) {
                while (linkedList.size() > 0 && (j2 = j()) != null) {
                    k g2 = g();
                    if (!g2.v) {
                        a(j2, g2);
                    }
                }
            }
        }
    }

    private o j() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar.s) {
                return oVar;
            }
        }
        return null;
    }

    public void a(k kVar) {
        o j2;
        if (!kVar.v) {
            while (true) {
                synchronized (this.G) {
                    j2 = j();
                    if (j2 != null) {
                        break;
                    }
                    try {
                        this.G.wait(2000L);
                    } catch (InterruptedException e2) {
                    }
                }
            }
            a(j2, kVar);
        }
        boolean z = false;
        long V = GameEngine.V();
        while (true) {
            synchronized (this.G) {
                if (kVar.c()) {
                    break;
                }
                z = true;
                i();
                try {
                    this.G.wait(2000L);
                } catch (InterruptedException e3) {
                }
            }
            if (!z && b) {
                GameEngine.b("PathEngine", "We were blocked path(" + kVar.e + ") for:" + (GameEngine.V() - V));
                return;
            }
        }
        if (!z) {
        }
    }

    private void a(o oVar, k kVar) {
        synchronized (kVar) {
            if (!kVar.v) {
                oVar.a(kVar);
                oVar.a();
            }
        }
    }
}
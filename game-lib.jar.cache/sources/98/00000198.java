package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/s.class */
public final class s {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean m;
    public int n;
    public int o;
    public int a = 5;
    public com.corrodinggames.rts.game.units.custom.e.f h = new com.corrodinggames.rts.game.units.custom.e.f();
    public com.corrodinggames.rts.game.units.custom.e.f i = new com.corrodinggames.rts.game.units.custom.e.f();
    public com.corrodinggames.rts.game.units.custom.e.f j = new com.corrodinggames.rts.game.units.custom.e.f();
    public com.corrodinggames.rts.game.units.custom.e.f k = new com.corrodinggames.rts.game.units.custom.e.f();
    public com.corrodinggames.rts.game.units.custom.e.f l = new com.corrodinggames.rts.game.units.custom.e.f();
    public t p = new t();
    public t q = new t();

    public void a(am amVar) {
        this.d++;
        if (amVar.cm < 1.0f) {
            this.f++;
        } else {
            this.c++;
        }
        as mo1r = amVar.mo1r();
        if (!mo1r.k()) {
            this.b++;
        }
        if (!this.m && !amVar.u() && amVar.mo1r().y()) {
            this.m = true;
        }
        com.corrodinggames.rts.game.units.custom.d.b dq = amVar.dq();
        if (dq != null) {
            this.k.a(dq, 0.0d, Double.MAX_VALUE);
            this.l.a(dq, -1.7976931348623157E308d, 0.0d);
        }
        if (amVar instanceof com.corrodinggames.rts.game.units.d.l) {
            com.corrodinggames.rts.game.units.d.l lVar = (com.corrodinggames.rts.game.units.d.l) amVar;
            int f = lVar.f(false);
            this.b += f;
            this.e += f;
            if (f != 0) {
                a(lVar);
            }
        }
        c(amVar);
        float cy = amVar.cy();
        if (cy != 0.0f && amVar.cm >= 1.0f) {
            this.g = (int) (this.g + cy);
        }
        com.corrodinggames.rts.game.units.custom.e.f cA = amVar.cA();
        if (!cA.c() && amVar.cm >= 1.0f) {
            this.h.b(cA);
            this.i.a(cA, 0.0d, Double.MAX_VALUE);
            this.j.a(cA, -1.7976931348623157E308d, 0.0d);
        }
        if (amVar.cU()) {
            int b = amVar.cM().b();
            com.corrodinggames.rts.game.units.custom.d.b B = mo1r.B();
            if (B != null) {
                b += B.b();
            }
            if (mo1r.j()) {
                this.o += b;
            } else {
                this.n += b;
            }
        }
    }

    public void b(am amVar) {
        this.d--;
        if (amVar.cm < 1.0f) {
            this.f--;
        } else {
            this.c--;
        }
        as mo1r = amVar.mo1r();
        if (!mo1r.k()) {
            this.b--;
        }
        com.corrodinggames.rts.game.units.custom.d.b dq = amVar.dq();
        if (dq != null) {
            this.k.b(dq, 0.0d, Double.MAX_VALUE);
            this.l.b(dq, -1.7976931348623157E308d, 0.0d);
        }
        if (amVar instanceof com.corrodinggames.rts.game.units.d.l) {
            com.corrodinggames.rts.game.units.d.l lVar = (com.corrodinggames.rts.game.units.d.l) amVar;
            int f = lVar.f(false);
            this.b -= f;
            this.e -= f;
            if (f != 0) {
                b(lVar);
            }
        }
        d(amVar);
        float cy = amVar.cy();
        if (cy != 0.0f && amVar.cm >= 1.0f) {
            this.g = (int) (this.g - cy);
        }
        com.corrodinggames.rts.game.units.custom.e.f cA = amVar.cA();
        if (!cA.c() && amVar.cm >= 1.0f) {
            this.h.c(cA);
            this.i.b(cA, 0.0d, Double.MAX_VALUE);
            this.j.b(cA, -1.7976931348623157E308d, 0.0d);
        }
        if (amVar.cU()) {
            int b = amVar.cM().b();
            com.corrodinggames.rts.game.units.custom.d.b B = mo1r.B();
            if (B != null) {
                b += B.b();
            }
            if (mo1r.j()) {
                this.o -= b;
            } else {
                this.n -= b;
            }
        }
    }

    private final void c(am amVar) {
        com.corrodinggames.rts.game.units.custom.h de = amVar.de();
        if (de != null) {
            for (com.corrodinggames.rts.game.units.custom.g gVar : de.a) {
                p a = a(gVar);
                if (amVar.cm < 1.0f) {
                    a.c++;
                } else {
                    a.b++;
                }
            }
        }
    }

    private final void d(am amVar) {
        com.corrodinggames.rts.game.units.custom.h de = amVar.de();
        if (de != null) {
            for (com.corrodinggames.rts.game.units.custom.g gVar : de.a) {
                p a = a(gVar);
                if (amVar.cm < 1.0f) {
                    a.c--;
                } else {
                    a.b--;
                }
            }
        }
    }

    private final void a(com.corrodinggames.rts.game.units.d.l lVar) {
        as asVar;
        com.corrodinggames.rts.game.units.custom.h x;
        com.corrodinggames.rts.gameFramework.utility.m dx = lVar.dx();
        if (dx.a != 0) {
            Iterator it = dx.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.d.j jVar = (com.corrodinggames.rts.game.units.d.j) it.next();
                if (jVar.f && (asVar = jVar.g) != null && (x = asVar.x()) != null) {
                    for (com.corrodinggames.rts.game.units.custom.g gVar : x.a) {
                        a(gVar).d += jVar.a;
                    }
                }
            }
        }
    }

    private final void b(com.corrodinggames.rts.game.units.d.l lVar) {
        as asVar;
        com.corrodinggames.rts.game.units.custom.h x;
        com.corrodinggames.rts.gameFramework.utility.m dx = lVar.dx();
        if (dx.a != 0) {
            Iterator it = dx.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.d.j jVar = (com.corrodinggames.rts.game.units.d.j) it.next();
                if (jVar.f && (asVar = jVar.g) != null && (x = asVar.x()) != null) {
                    for (com.corrodinggames.rts.game.units.custom.g gVar : x.a) {
                        a(gVar).d -= jVar.a;
                    }
                }
            }
        }
    }

    public final p a(com.corrodinggames.rts.game.units.custom.g gVar) {
        p[] pVarArr = this.q.b;
        int i = this.q.c;
        for (int i2 = 0; i2 < i; i2++) {
            p pVar = pVarArr[i2];
            if (pVar.a == gVar) {
                return pVar;
            }
            if (pVar.a == null) {
                pVar.a = gVar;
                return pVar;
            }
        }
        p pVar2 = new p();
        pVar2.a = gVar;
        this.q.a(pVar2);
        return pVar2;
    }
}
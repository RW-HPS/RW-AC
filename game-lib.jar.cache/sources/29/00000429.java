package com.corrodinggames.rts.gameFramework;

import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ab.class */
public class ab {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.gameFramework.utility.m f399a = new com.corrodinggames.rts.gameFramework.utility.m();
    boolean b;
    float c;
    float d;
    int e;
    boolean f;
    public com.corrodinggames.rts.gameFramework.utility.m g;
    final /* synthetic */ aa h;

    public ab(aa aaVar) {
        this.h = aaVar;
    }

    public void a(com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.game.units.au auVar) {
        auVar.i = this;
        this.f = auVar.j;
    }

    public void a(com.corrodinggames.rts.game.units.au auVar) {
        com.corrodinggames.rts.game.units.au ar;
        Iterator it = this.f399a.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) it.next();
            if (!yVar.bV && (ar = yVar.ar()) != null && ar.b(auVar)) {
                yVar.ay();
            }
        }
    }

    public void a() {
        com.corrodinggames.rts.game.units.au ar;
        this.f399a.clear();
        com.corrodinggames.rts.game.units.am[] a2 = com.corrodinggames.rts.game.units.am.bE.a();
        int size = com.corrodinggames.rts.game.units.am.bE.size();
        for (int i = 0; i < size; i++) {
            com.corrodinggames.rts.game.units.am amVar = a2[i];
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.I() && (ar = yVar.ar()) != null && ar.i == this && yVar.bg()) {
                    this.f399a.add(yVar);
                    this.c = ar.g();
                    this.d = ar.h();
                }
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.y yVar) {
        yVar.ac = this.e;
        com.corrodinggames.rts.game.units.au ar = yVar.ar();
        if (ar != null) {
            ar.i = this;
        }
    }

    public void b() {
        br.a();
        c();
    }

    public com.corrodinggames.rts.game.units.y a(com.corrodinggames.rts.gameFramework.utility.m mVar, float f, float f2, boolean z) {
        float f3 = -1.0f;
        com.corrodinggames.rts.game.units.y yVar = null;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) it.next();
            if (z || (yVar2.ad == null && !yVar2.ae)) {
                float b = f.b(f, f2, yVar2.eo, yVar2.ep);
                if (yVar2.af) {
                    b -= 160.0f;
                }
                if (f3 == -1.0f || b < f3) {
                    f3 = b;
                    yVar = yVar2;
                }
            }
        }
        return yVar;
    }

    public com.corrodinggames.rts.gameFramework.utility.m a(float f, float f2, boolean z) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m(1);
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = new com.corrodinggames.rts.gameFramework.utility.m();
        mVar2.clear();
        mVar2.addAll(this.f399a);
        while (true) {
            com.corrodinggames.rts.game.units.y a2 = a(mVar2, f, f2, true);
            if (a2 != null) {
                mVar.add(a2);
                mVar2.remove(a2);
                mVar2.removeAll(a(mVar2, a2, true, z));
            } else {
                return mVar;
            }
        }
    }

    public com.corrodinggames.rts.gameFramework.utility.m a(com.corrodinggames.rts.gameFramework.utility.m mVar, com.corrodinggames.rts.game.units.y yVar, boolean z, boolean z2) {
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = new com.corrodinggames.rts.gameFramework.utility.m(1);
        mVar2.clear();
        int i = 0;
        Object[] a2 = mVar.a();
        int size = mVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.corrodinggames.rts.game.units.y) a2[i2]).ap = false;
        }
        for (int i3 = 0; i3 <= 2; i3++) {
            int size2 = mVar.size();
            for (int i4 = 0; i4 < size2; i4++) {
                com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) a2[i4];
                if (!yVar2.ap && yVar2 != yVar && ((z || (yVar2.ad == null && !yVar2.ae)) && yVar2.h() == yVar.h())) {
                    float a3 = f.a(yVar2.eo, yVar2.ep, yVar.eo, yVar.ep);
                    if ((i3 != 0 || a3 <= 3600.0f) && ((i3 != 1 || a3 <= 14400.0f) && (((z2 && a3 < 160000.0f) || (a3 < 40000.0f && i < 25)) && (z2 || f.c(yVar2.z() - yVar.z()) < 0.4f)))) {
                        yVar2.ap = true;
                        mVar2.add(yVar2);
                        i++;
                    }
                }
            }
        }
        return mVar2;
    }

    public void c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        br.a();
        a();
        this.h.b.setSite(0.0f, 0.0f);
        Iterator it = this.f399a.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) it.next();
            this.h.b.moveAdd(yVar.eo, yVar.ep);
        }
        this.h.b.setSite(this.h.b.x / this.f399a.size(), this.h.b.y / this.f399a.size());
        float d = f.d(this.h.b.x, this.h.b.y, this.c, this.d);
        Iterator it2 = this.f399a.iterator();
        while (it2.hasNext()) {
            com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) it2.next();
            if (yVar2.ah > 1) {
                yVar2.af = yVar2.ae;
            } else {
                yVar2.af = false;
            }
            if (yVar2.af && yVar2.ah > 7 && f.c(f.c(yVar2.am, d, 360.0f)) > 80.0f) {
                yVar2.af = false;
            }
            yVar2.aB();
            yVar2.ah = (short) 0;
            yVar2.an = gameEngine.by;
            yVar2.ac = this.e;
        }
        int i = 0;
        while (true) {
            br.a();
            com.corrodinggames.rts.game.units.y a2 = a(this.f399a, this.c, this.d, false);
            if (a2 == null) {
                return;
            }
            a2.ae = true;
            ab abVar = null;
            if (i > 0) {
                abVar = this.h.b();
            }
            if (abVar != null) {
                abVar.g = this.g;
                abVar.a(a2);
            }
            int i2 = 0;
            float f = 0.0f;
            Iterator it3 = a(this.f399a, a2, false, this.f).iterator();
            while (it3.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) it3.next();
                if (yVar3.cj > f) {
                    f = yVar3.cj;
                }
                yVar3.a(a2);
                if (abVar != null) {
                    abVar.a(yVar3);
                }
                i2++;
            }
            if (a2 != null) {
                a2.ah = (short) (i2 + 1);
            }
            com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
            Object[] a3 = this.f399a.a();
            int size = this.f399a.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.corrodinggames.rts.game.units.y yVar4 = (com.corrodinggames.rts.game.units.y) a3[i3];
                if (yVar4.ad == a2) {
                    mVar.add(yVar4);
                }
            }
            com.corrodinggames.rts.gameFramework.utility.m a4 = this.h.a(i2, f, d);
            br.a();
            this.h.a(mVar, a2, a4, d, i2);
            br.a();
            this.h.a(mVar, a2);
            i++;
        }
    }
}
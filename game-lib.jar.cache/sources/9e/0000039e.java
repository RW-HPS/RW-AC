package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/k.class */
public class k {
    y a;
    public PointF b = null;
    public final com.corrodinggames.rts.gameFramework.utility.m c = new com.corrodinggames.rts.gameFramework.utility.m();
    final com.corrodinggames.rts.gameFramework.utility.m d = new com.corrodinggames.rts.gameFramework.utility.m();
    public float e;
    j f;

    public k(y yVar) {
        this.a = yVar;
    }

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeInt(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bq) it.next()).a(gameOutputStream);
        }
        gameOutputStream.writeBoolean(this.b != null);
        if (this.b != null) {
            gameOutputStream.writeFloat(this.b.x);
            gameOutputStream.writeFloat(this.b.y);
        }
    }

    public void a(GameInputStream gameInputStream) {
        this.e = gameInputStream.readFloat();
        int readInt = gameInputStream.readInt();
        this.c.clear();
        for (int i = 0; i < readInt; i++) {
            j jVar = new j();
            jVar.a(gameInputStream);
            if (com.corrodinggames.rts.game.units.a.s.c(jVar.j)) {
                if (this.a.a(jVar.j) == null) {
                    GameEngine.b("Factory", this.a.mo1r() + " no longer has the action:" + jVar.j);
                } else {
                    this.c.add(jVar);
                }
            } else {
                GameEngine.b("Factory", "buildQueue has uIndex of -1, skipping");
            }
        }
        if (gameInputStream.b() >= 5) {
            if (gameInputStream.readBoolean()) {
                if (this.b == null) {
                    this.b = new PointF();
                }
                this.b.x = gameInputStream.readFloat();
                this.b.y = gameInputStream.readFloat();
                return;
            }
            this.b = null;
        }
    }

    public am a(j jVar, float f, boolean z, float f2) {
        com.corrodinggames.rts.game.units.a.s a = this.a.a(jVar.j);
        if (a == null) {
            GameNetEngine.a("specialAction=null on completeQueueItem for item.uIndex:" + jVar.j + " id:" + this.a.eh, true);
            return null;
        }
        as mo3i = a.mo3i();
        if (mo3i == null) {
            GameNetEngine.a("unitType=null on completeQueueItem for item.uIndex:" + jVar.j + " id:" + this.a.eh, false);
            return null;
        }
        return a(mo3i, f, z, f2);
    }

    public void a(am amVar, float f, boolean z) {
        amVar.cl = 30.0f;
        if (this.a instanceof f) {
            amVar.cl += 40.0f;
        }
        if (amVar instanceof y) {
            y yVar = (y) amVar;
            yVar.j(90.0f);
            if (yVar.z() < 0.75d) {
                amVar.cl += 30.0f;
            }
            if (yVar.z() < 0.55d) {
                amVar.cl += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float k = this.a.eo + (com.corrodinggames.rts.gameFramework.f.k(amVar.cg) * f);
            float j = this.a.ep + (com.corrodinggames.rts.gameFramework.f.j(amVar.cg) * f);
            if (this.b != null) {
                if (f != 0.0f) {
                    yVar.d(k, j);
                }
                yVar.d(this.b.x + f2, this.b.y);
                return;
            }
            float j2 = k - (com.corrodinggames.rts.gameFramework.f.j(amVar.cg) * f2);
            float k2 = j + (com.corrodinggames.rts.gameFramework.f.k(amVar.cg) * f2);
            if (f != 0.0f) {
                yVar.d(j2, k2);
            }
        }
    }

    public am a(as asVar, float f, boolean z, float f2) {
        am a = asVar.a();
        a.eo = this.a.eo;
        a.ep = this.a.ep + 5.0f;
        a.cg = 90.0f + f2;
        a.f(this.a.bX);
        a.B(this.a);
        a(a, f, z);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (a.bX == gameEngine.playerTeam) {
            gameEngine.bS.i.a(a);
        }
        return a;
    }

    public final boolean a() {
        return this.c.a == 0;
    }

    public j a(com.corrodinggames.rts.game.units.a.w wVar, boolean z) {
        return a(wVar, z, (PointF) null, (am) null);
    }

    public j a(com.corrodinggames.rts.game.units.a.w wVar, boolean z, PointF pointF, am amVar) {
        j jVar = new j();
        jVar.j = wVar.N();
        jVar.h = pointF;
        jVar.i = amVar;
        if (jVar.j == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        jVar.a = 1;
        jVar.b = wVar.K();
        jVar.c = wVar.B();
        jVar.d = wVar.r_();
        jVar.e = wVar.P();
        jVar.f = wVar.g();
        jVar.g = wVar.mo3i();
        jVar.l = wVar.H();
        if (!z) {
            PlayerData.b((am) this.a);
            if (jVar.l) {
                int i = 0;
                for (int i2 = 0; i2 < this.c.size() && ((j) this.c.get(i2)).l; i2++) {
                    i = i2 + 1;
                }
                if (i != 0 || this.c.size() != 0) {
                }
                this.c.add(i, jVar);
            } else {
                this.c.add(jVar);
            }
            PlayerData.c(this.a);
        } else {
            this.d.add(jVar);
        }
        return jVar;
    }

    public j b(com.corrodinggames.rts.game.units.a.w wVar, boolean z) {
        if (z) {
            if (a(wVar.N(), true) > 0) {
                j a = a(wVar, true);
                a.k = true;
                return a;
            }
            return null;
        }
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.c;
        ListIterator listIterator = mVar.listIterator(mVar.size());
        while (listIterator.hasPrevious()) {
            j jVar = (j) listIterator.previous();
            if (jVar.j.equals(wVar.N())) {
                PlayerData.b((am) this.a);
                listIterator.remove();
                PlayerData.c(this.a);
                return jVar;
            }
        }
        return null;
    }

    public void a(j jVar) {
        this.f = jVar;
        this.a.bC();
    }

    public j b() {
        return this.f;
    }

    public com.corrodinggames.rts.game.units.custom.d.b c() {
        if (this.f == null || this.f.d == null) {
            return null;
        }
        return com.corrodinggames.rts.game.units.custom.d.b.a(this.f.d, -(this.f.b * this.a.cx() * 60.0f));
    }

    public com.corrodinggames.rts.game.units.a.s d() {
        if (this.f != null) {
            return this.a.a(this.f.j);
        }
        return null;
    }

    public void a(float f) {
        if (!a()) {
            j jVar = (j) f().get(0);
            if (this.f != jVar) {
                if (jVar.m < 0.0f) {
                    jVar.m = 0.0f;
                    ((l) this.a).b(jVar);
                }
                if (this.f != null) {
                    this.e = jVar.m;
                }
                a(jVar);
            }
            float cx = jVar.b * this.a.cx() * f;
            boolean z = false;
            if (jVar.d != null) {
                if (this.e + cx > 1.0f) {
                    cx = 1.0f - this.e;
                    z = true;
                }
                double d = (this.e + cx) - jVar.n;
                double d2 = 0.0d;
                if (z) {
                    d2 = 1.0d - jVar.n;
                } else if (d >= 0.009999999776482582d) {
                    d2 = ((int) (d / 0.009999999776482582d)) * 0.009999999776482582d;
                }
                boolean z2 = false;
                if (d2 > 0.0d && this.a.bX.am.a(jVar.d)) {
                    z2 = true;
                }
                if (!z2 && (d2 <= 0.0d || jVar.d.c(this.a, d2))) {
                    jVar.n += d2;
                } else {
                    if (!z2) {
                        this.a.bX.am.a(jVar.d, this.a, d2);
                    }
                    cx = 0.0f;
                    z = false;
                }
            }
            this.e += cx;
            if (z) {
                this.e = 1.0f;
            }
            jVar.m = this.e;
            if (this.e >= 1.0f) {
                if (jVar.f && ((l) this.a).dA()) {
                    this.e = 1.0f;
                    return;
                }
                PlayerData.b((am) this.a);
                this.e = 0.0f;
                jVar.a--;
                if (jVar.a <= 0) {
                    List f2 = f();
                    if (f2.size() == 0) {
                        GameEngine.print("-------------buildQueue empty for:" + jVar.j);
                        GameEngine.print("-------------");
                    } else {
                        f2.remove(0);
                    }
                }
                PlayerData.c(this.a);
                ((l) this.a).a(jVar);
                return;
            }
            return;
        }
        a((j) null);
        this.e = 0.0f;
        if (this.d.a > 0) {
            j jVar2 = (j) this.d.get(0);
            if (jVar2.b > 10.0f && jVar2.m <= 0.0f) {
                jVar2.m = 1.0f;
                com.corrodinggames.rts.game.units.a.s a = this.a.a(jVar2.j);
                if (a != null && a.Q()) {
                    a.a(this.a);
                }
            }
        }
    }

    public void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (this.a.a(jVar.j) == null) {
                b(jVar);
                c(jVar);
                it.remove();
            }
        }
    }

    public void a(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (z) {
                b(jVar);
            }
            c(jVar);
            it.remove();
        }
    }

    private void b(j jVar) {
        if (((l) this.a).c(jVar)) {
            if (jVar.d != null && jVar.n > 0.0d) {
                jVar.d.a((am) this.a, jVar.n, true);
            }
            jVar.c.h(this.a);
        }
    }

    private void c(j jVar) {
    }

    public int a(as asVar) {
        int i = 0;
        int i2 = this.c.a;
        if (i2 != 0) {
            Object[] a = this.c.a();
            for (int i3 = 0; i3 < i2; i3++) {
                j jVar = (j) a[i3];
                if (jVar.f && jVar.g == asVar) {
                    i += jVar.a;
                }
            }
        }
        return i;
    }

    public int a(com.corrodinggames.rts.game.units.a.c cVar, boolean z) {
        return a(cVar, z, false);
    }

    public int a(com.corrodinggames.rts.game.units.custom.g gVar) {
        if (gVar == null) {
            return this.c.a;
        }
        int i = 0;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (com.corrodinggames.rts.game.units.custom.g.a(gVar, ((j) it.next()).e)) {
                i++;
            }
        }
        return i;
    }

    public int a(com.corrodinggames.rts.game.units.a.c cVar, boolean z, boolean z2) {
        int i = 0;
        if (this.c.a != 0) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (com.corrodinggames.rts.game.units.a.s.i == cVar || jVar.j.equals(cVar)) {
                    if (!z2 || jVar.f) {
                        i += jVar.a;
                    }
                }
            }
        }
        if (z && this.d.a != 0) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                j jVar2 = (j) it2.next();
                if (com.corrodinggames.rts.game.units.a.s.i == cVar || jVar2.j.equals(cVar)) {
                    if (!z2 || jVar2.f) {
                        if (!jVar2.k) {
                            i += jVar2.a;
                        } else {
                            i -= jVar2.a;
                        }
                    }
                }
            }
        }
        return i;
    }

    public com.corrodinggames.rts.game.units.a.s b(as asVar) {
        ArrayList N = this.a.N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) N.get(i);
            if (sVar != null && (sVar instanceof com.corrodinggames.rts.game.units.a.w)) {
                com.corrodinggames.rts.game.units.a.w wVar = (com.corrodinggames.rts.game.units.a.w) sVar;
                if (wVar.mo3i() == asVar) {
                    return wVar;
                }
            }
        }
        return null;
    }

    public j a(com.corrodinggames.rts.game.units.a.s sVar, boolean z, PointF pointF, am amVar) {
        if (sVar instanceof com.corrodinggames.rts.game.units.a.w) {
            com.corrodinggames.rts.game.units.a.w wVar = (com.corrodinggames.rts.game.units.a.w) sVar;
            if (!z) {
                if (sVar.a((am) this.a, false) && sVar.b(this.a)) {
                    if ((!wVar.g() || this.a.bX.w() < this.a.bX.x()) && wVar.B().c(this.a)) {
                        return a(wVar, false, pointF, amVar);
                    }
                    return null;
                }
                return null;
            }
            j b = b(wVar, false);
            if (b != null) {
                b(b);
                c(b);
                return b;
            }
            return null;
        }
        return null;
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        if (sVar instanceof com.corrodinggames.rts.game.units.a.w) {
            com.corrodinggames.rts.game.units.a.w wVar = (com.corrodinggames.rts.game.units.a.w) sVar;
            if (!z) {
                if (sVar.a((am) this.a, true)) {
                    if ((!wVar.g() || this.a.bX.w() < this.a.bX.x()) && wVar.B().b(this.a, sVar.Q())) {
                        a(wVar, true);
                    }
                }
            } else if (b(wVar, true) != null) {
                wVar.B().e(this.a, sVar.Q());
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar) {
        if (this.d.size() != 0) {
            j jVar = null;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                j jVar2 = (j) it.next();
                if (jVar2.j.equals(sVar.N())) {
                    jVar = jVar2;
                }
            }
            if (jVar != null) {
                if (!jVar.k) {
                    jVar.c.e(this.a, sVar.Q());
                } else {
                    jVar.c.d(this.a, sVar.Q());
                }
                this.d.remove(jVar);
            }
        }
    }

    public List f() {
        return this.c;
    }

    public com.corrodinggames.rts.gameFramework.utility.m g() {
        return this.c;
    }
}
package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/h.class */
public abstract class h extends o {
    ArrayList F;
    ArrayList G;

    public abstract void c(float f);

    public int l() {
        return this.F.size();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public h(a aVar) {
        super(aVar);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public boolean m() {
        Iterator it = this.R.bm.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if ((oVar instanceof n) && ((n) oVar).m == this) {
                return true;
            }
        }
        return false;
    }

    public void n() {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar == null || yVar.bV) {
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

    public void o() {
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar == null || yVar.bV || yVar.cN != null || yVar.cO != null) {
                it.remove();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.a.o
    public void p() {
        q();
        this.G.clear();
        super.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(y yVar) {
        if (yVar.aB != null) {
            yVar.aB.b(yVar);
        }
        if (yVar.bX != null && yVar.bX != this.R) {
            GameEngine.g("unit.team:" + yVar.bX.k + ", ai:" + this.R.k);
        }
        this.F.add(yVar);
        yVar.aB = this;
    }

    public void b(y yVar) {
        this.F.remove(yVar);
        this.G.remove(yVar);
        if (yVar.aB == this) {
            yVar.aB = null;
        }
    }

    public void q() {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar != null && yVar.aB == this) {
                yVar.aB = null;
            }
        }
        this.F.clear();
    }

    public void b(float f) {
    }
}
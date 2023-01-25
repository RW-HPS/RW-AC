package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/h.class */
public abstract class AbstractC0163h extends AbstractC0170o {

    /* renamed from: F */
    ArrayList f688F;

    /* renamed from: G */
    ArrayList f689G;

    /* renamed from: c */
    public abstract void mo4690c(float f);

    /* renamed from: l */
    public int m4750l() {
        return this.f688F.size();
    }

    /* renamed from: a */
    public boolean mo4755a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo4753b() {
        return false;
    }

    public AbstractC0163h(C0136a c0136a) {
        super(c0136a);
        this.f688F = new ArrayList();
        this.f689G = new ArrayList();
    }

    /* renamed from: m */
    public boolean m4749m() {
        Iterator it = this.f761R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0169n) && ((C0169n) abstractC0170o).f753m == this) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m4748n() {
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (abstractC0629y == null || abstractC0629y.f1612bV) {
                if (abstractC0629y != null && abstractC0629y.f3979aB == this) {
                    abstractC0629y.f3979aB = null;
                }
                if (abstractC0629y != null) {
                    this.f689G.remove(abstractC0629y);
                }
                it.remove();
            }
        }
    }

    /* renamed from: o */
    public void m4747o() {
        Iterator it = this.f689G.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (abstractC0629y == null || abstractC0629y.f1612bV || abstractC0629y.f1656cN != null || abstractC0629y.f1657cO != null) {
                it.remove();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o
    /* renamed from: p */
    public void mo4678p() {
        m4746q();
        this.f689G.clear();
        super.mo4678p();
    }

    /* renamed from: a */
    protected void mo4754a(AbstractC0629y abstractC0629y) {
        if (abstractC0629y.f3979aB != null) {
            abstractC0629y.f3979aB.m4751b(abstractC0629y);
        }
        if (abstractC0629y.f1614bX != null && abstractC0629y.f1614bX != this.f761R) {
            GameEngine.m990g("unit.team:" + abstractC0629y.f1614bX.site + ", ai:" + this.f761R.site);
        }
        this.f688F.add(abstractC0629y);
        abstractC0629y.f3979aB = this;
    }

    /* renamed from: b */
    public void m4751b(AbstractC0629y abstractC0629y) {
        this.f688F.remove(abstractC0629y);
        this.f689G.remove(abstractC0629y);
        if (abstractC0629y.f3979aB == this) {
            abstractC0629y.f3979aB = null;
        }
    }

    /* renamed from: q */
    public void m4746q() {
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (abstractC0629y != null && abstractC0629y.f3979aB == this) {
                abstractC0629y.f3979aB = null;
            }
        }
        this.f688F.clear();
    }

    /* renamed from: b */
    public void mo4752b(float f) {
    }
}
package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.AbstractC0434a;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/c.class */
public class C0441c {

    /* renamed from: a */
    public final C1136m f2797a = new C1136m();

    /* renamed from: a */
    public void m3757a(C0433a c0433a) {
        if (!this.f2797a.contains(c0433a)) {
            this.f2797a.add(c0433a);
        }
    }

    /* renamed from: a */
    public void m3755a(C0444f c0444f, AbstractC0244am abstractC0244am, double d) {
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.mo3763a(abstractC0244am) < c0443e.f2828b * d) {
                m3757a(c0443e.f2827a);
            }
        }
    }

    /* renamed from: a */
    public void m3758a(C0429b c0429b, AbstractC0244am abstractC0244am, double d) {
        if (!c0429b.f2732k.m3723c()) {
            m3755a(c0429b.f2732k, abstractC0244am, d);
        }
        if (c0429b.f2723b > 0 && abstractC0244am.f1614bX.credits < c0429b.f2723b * d) {
            m3757a(AbstractC0434a.f2786D);
        }
    }

    /* renamed from: a */
    public boolean m3756a(C0444f c0444f) {
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2797a.contains(((C0443e) m535a[i2]).f2827a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3759a(C0429b c0429b) {
        if (c0429b.f2723b > 0 && this.f2797a.contains(AbstractC0434a.f2786D)) {
            return true;
        }
        if (!c0429b.f2732k.m3723c() && m3756a(c0429b.f2732k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m3760a() {
        this.f2797a.clear();
    }
}
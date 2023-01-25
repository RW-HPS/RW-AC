package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ab.class */
public class C0643ab {

    /* renamed from: a */
    C1136m f4106a = new C1136m();

    /* renamed from: b */
    boolean f4107b;

    /* renamed from: c */
    float f4108c;

    /* renamed from: d */
    float f4109d;

    /* renamed from: e */
    int f4110e;

    /* renamed from: f */
    boolean f4111f;

    /* renamed from: g */
    public C1136m f4112g;

    /* renamed from: h */
    final /* synthetic */ C0642aa f4113h;

    public C0643ab(C0642aa c0642aa) {
        this.f4113h = c0642aa;
    }

    /* renamed from: a */
    public void m2789a(AbstractC0629y abstractC0629y, C0305au c0305au) {
        c0305au.f1810i = this;
        this.f4111f = c0305au.f1811j;
    }

    /* renamed from: a */
    public void m2791a(C0305au c0305au) {
        C0305au m2943ar;
        Iterator it = this.f4106a.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (!abstractC0629y.f1612bV && (m2943ar = abstractC0629y.m2943ar()) != null && m2943ar.m4150b(c0305au)) {
                abstractC0629y.m2936ay();
            }
        }
    }

    /* renamed from: a */
    public void m2793a() {
        C0305au m2943ar;
        this.f4106a.clear();
        AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m499a[i];
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.mo3049I() && (m2943ar = abstractC0629y.m2943ar()) != null && m2943ar.f1810i == this && abstractC0629y.mo2905bg()) {
                    this.f4106a.add(abstractC0629y);
                    this.f4108c = m2943ar.m4139g();
                    this.f4109d = m2943ar.m4137h();
                }
            }
        }
    }

    /* renamed from: a */
    public void m2790a(AbstractC0629y abstractC0629y) {
        abstractC0629y.f3954ac = this.f4110e;
        C0305au m2943ar = abstractC0629y.m2943ar();
        if (m2943ar != null) {
            m2943ar.f1810i = this;
        }
    }

    /* renamed from: b */
    public void m2786b() {
        C0742br.m2440a();
        m2785c();
    }

    /* renamed from: a */
    public AbstractC0629y m2788a(C1136m c1136m, float f, float f2, boolean z) {
        float f3 = -1.0f;
        AbstractC0629y abstractC0629y = null;
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y2 = (AbstractC0629y) it.next();
            if (z || (abstractC0629y2.f3955ad == null && !abstractC0629y2.f3956ae)) {
                float m2170b = C0773f.m2170b(f, f2, abstractC0629y2.f7173eo, abstractC0629y2.f7174ep);
                if (abstractC0629y2.f3957af) {
                    m2170b -= 160.0f;
                }
                if (f3 == -1.0f || m2170b < f3) {
                    f3 = m2170b;
                    abstractC0629y = abstractC0629y2;
                }
            }
        }
        return abstractC0629y;
    }

    /* renamed from: a */
    public C1136m m2792a(float f, float f2, boolean z) {
        C1136m c1136m = new C1136m(1);
        C1136m c1136m2 = new C1136m();
        c1136m2.clear();
        c1136m2.addAll(this.f4106a);
        while (true) {
            AbstractC0629y m2788a = m2788a(c1136m2, f, f2, true);
            if (m2788a != null) {
                c1136m.add(m2788a);
                c1136m2.remove(m2788a);
                c1136m2.removeAll(m2787a(c1136m2, m2788a, true, z));
            } else {
                return c1136m;
            }
        }
    }

    /* renamed from: a */
    public C1136m m2787a(C1136m c1136m, AbstractC0629y abstractC0629y, boolean z, boolean z2) {
        C1136m c1136m2 = new C1136m(1);
        c1136m2.clear();
        int i = 0;
        Object[] m535a = c1136m.m535a();
        int size = c1136m.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0629y) m535a[i2]).f3967ap = false;
        }
        for (int i3 = 0; i3 <= 2; i3++) {
            int size2 = c1136m.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) m535a[i4];
                if (!abstractC0629y2.f3967ap && abstractC0629y2 != abstractC0629y && ((z || (abstractC0629y2.f3955ad == null && !abstractC0629y2.f3956ae)) && abstractC0629y2.mo3069h() == abstractC0629y.mo3069h())) {
                    float m2216a = C0773f.m2216a(abstractC0629y2.f7173eo, abstractC0629y2.f7174ep, abstractC0629y.f7173eo, abstractC0629y.f7174ep);
                    if ((i3 != 0 || m2216a <= 3600.0f) && ((i3 != 1 || m2216a <= 14400.0f) && (((z2 && m2216a < 160000.0f) || (m2216a < 40000.0f && i < 25)) && (z2 || C0773f.m2152c(abstractC0629y2.mo2822z() - abstractC0629y.mo2822z()) < 0.4f)))) {
                        abstractC0629y2.f3967ap = true;
                        c1136m2.add(abstractC0629y2);
                        i++;
                    }
                }
            }
        }
        return c1136m2;
    }

    /* renamed from: c */
    public void m2785c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0742br.m2440a();
        m2793a();
        this.f4113h.f4105b.setSite(0.0f, 0.0f);
        Iterator it = this.f4106a.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            this.f4113h.f4105b.moveAdd(abstractC0629y.f7173eo, abstractC0629y.f7174ep);
        }
        this.f4113h.f4105b.setSite(this.f4113h.f4105b.x / this.f4106a.size(), this.f4113h.f4105b.y / this.f4106a.size());
        float m2138d = C0773f.m2138d(this.f4113h.f4105b.x, this.f4113h.f4105b.y, this.f4108c, this.f4109d);
        Iterator it2 = this.f4106a.iterator();
        while (it2.hasNext()) {
            AbstractC0629y abstractC0629y2 = (AbstractC0629y) it2.next();
            if (abstractC0629y2.f3959ah > 1) {
                abstractC0629y2.f3957af = abstractC0629y2.f3956ae;
            } else {
                abstractC0629y2.f3957af = false;
            }
            if (abstractC0629y2.f3957af && abstractC0629y2.f3959ah > 7 && C0773f.m2152c(C0773f.m2150c(abstractC0629y2.f3964am, m2138d, 360.0f)) > 80.0f) {
                abstractC0629y2.f3957af = false;
            }
            abstractC0629y2.m2986aB();
            abstractC0629y2.f3959ah = (short) 0;
            abstractC0629y2.f3965an = gameEngine.f6358by;
            abstractC0629y2.f3954ac = this.f4110e;
        }
        int i = 0;
        while (true) {
            C0742br.m2440a();
            AbstractC0629y m2788a = m2788a(this.f4106a, this.f4108c, this.f4109d, false);
            if (m2788a == null) {
                return;
            }
            m2788a.f3956ae = true;
            C0643ab c0643ab = null;
            if (i > 0) {
                c0643ab = this.f4113h.m2795b();
            }
            if (c0643ab != null) {
                c0643ab.f4112g = this.f4112g;
                c0643ab.m2790a(m2788a);
            }
            int i2 = 0;
            float f = 0.0f;
            Iterator it3 = m2787a(this.f4106a, m2788a, false, this.f4111f).iterator();
            while (it3.hasNext()) {
                AbstractC0629y abstractC0629y3 = (AbstractC0629y) it3.next();
                if (abstractC0629y3.f1626cj > f) {
                    f = abstractC0629y3.f1626cj;
                }
                abstractC0629y3.m2999a(m2788a);
                if (c0643ab != null) {
                    c0643ab.m2790a(abstractC0629y3);
                }
                i2++;
            }
            if (m2788a != null) {
                m2788a.f3959ah = (short) (i2 + 1);
            }
            C1136m c1136m = new C1136m();
            Object[] m535a = this.f4106a.m535a();
            int size = this.f4106a.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0629y abstractC0629y4 = (AbstractC0629y) m535a[i3];
                if (abstractC0629y4.f3955ad == m2788a) {
                    c1136m.add(abstractC0629y4);
                }
            }
            C1136m m2799a = this.f4113h.m2799a(i2, f, m2138d);
            C0742br.m2440a();
            this.f4113h.m2796a(c1136m, m2788a, m2799a, m2138d, i2);
            C0742br.m2440a();
            this.f4113h.m2797a(c1136m, m2788a);
            i++;
        }
    }
}
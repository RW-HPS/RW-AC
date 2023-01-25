package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0410bh;
import com.corrodinggames.rts.game.units.custom.C0416bn;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.p024d.C0510p;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/k.class */
public class C0399k extends AbstractC0389a {

    /* renamed from: a */
    public static final AbstractC0389a f2411a = new C0399k();

    /* renamed from: b */
    static final PointF f2412b = new PointF();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        C0458l c0458l = c0456j.f2891x;
        int mo2900bl = c0456j.mo2900bl();
        for (int i = 0; i < mo2900bl; i++) {
            C0416bn c0416bn = c0458l.f3301fQ[i];
            if (c0416bn.f2628aj != null && c0456j.f1644cB > 0.0f && !c0456j.f2889v) {
                float floatValue = c0416bn.f2628aj.floatValue();
                f2412b.setSite(c0456j.mo3056E(i));
                float mo2846m = c0456j.mo2846m();
                if (c0416bn.f2620ab < 99999.0f) {
                    mo2846m = c0416bn.f2620ab;
                }
                if (C0510p.m3321a(c0456j, f2412b.x, f2412b.y, c0456j.f7174eq, mo2846m, floatValue)) {
                }
                if (c0456j.f1644cB < 0.0f) {
                    c0456j.f1644cB = 0.0f;
                    c0456j.f2889v = true;
                }
            }
            if (c0416bn.f2629ak != null) {
                m3933a(c0456j, c0416bn);
            }
        }
    }

    /* renamed from: a */
    public static void m3933a(C0456j c0456j, C0416bn c0416bn) {
        if (!c0456j.m3647a(c0416bn)) {
            return;
        }
        float f = c0416bn.f2630al;
        float f2 = c0416bn.f2631am;
        float f3 = c0416bn.f2632an;
        C0188f c0188f = null;
        C0454h c0454h = c0416bn.f2629ak;
        Object[] m535a = C0188f.f1084a.m535a();
        int i = C0188f.f1084a.f7109a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m535a[i2];
            if (c0188f2.f1057aE != null && c0188f2.f7174eq > f3 && C0453g.m3684a(c0188f2.f1057aE, c0454h) && C0773f.m2216a(c0456j.f7172eo, c0456j.f7173ep, c0188f2.f7172eo, c0188f2.f7173ep) < f2 * f2 && ((C0773f.m2216a(c0456j.f7172eo, c0456j.f7173ep, c0188f2.f989n, c0188f2.f990o) < f * f || f < 0.0f) && ((c0188f2.f985j == null || (!c0188f2.f985j.f1614bX.m4390d(c0456j.f1614bX) && c0188f2.f985j.f1614bX != c0456j.f1614bX)) && c0188f2.f983h > 0.0f && !m3934a(c0188f2)))) {
                c0188f = c0188f2;
            }
        }
        if (c0188f != null) {
            c0456j.m3637b(c0416bn);
            C0188f m3652a = c0456j.m3652a((AbstractC0244am) null, c0188f.f7172eo, c0188f.f7173ep, c0416bn.f2571e, (C0410bh) null, 0);
            m3652a.f1055aC = true;
            m3652a.f992q = c0188f;
        }
    }

    /* renamed from: a */
    public static boolean m3934a(C0188f c0188f) {
        Object[] m535a = C0188f.f1084a.m535a();
        int i = C0188f.f1084a.f7109a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m535a[i2];
            if (c0188f2 != c0188f && c0188f2.f992q == c0188f) {
                return true;
            }
        }
        return false;
    }
}
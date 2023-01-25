package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/aa.class */
public class C0642aa extends AbstractC0741bq {

    /* renamed from: a */
    int f4104a;

    /* renamed from: b */
    PointF f4105b = new PointF();

    /* renamed from: a */
    public void m2801a() {
        this.f4104a = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(0);
        gameOutputStream.writeInt(this.f4104a);
    }

    /* renamed from: a */
    public void m2798a(GameInputStream gameInputStream) {
        gameInputStream.readInt();
        this.f4104a = gameInputStream.readInt();
    }

    /* renamed from: a */
    public void m2800a(float f) {
    }

    /* renamed from: b */
    public C0643ab m2795b() {
        C0643ab c0643ab = new C0643ab(this);
        c0643ab.f4110e = this.f4104a;
        this.f4104a++;
        return c0643ab;
    }

    /* renamed from: c */
    public C0643ab m2794c() {
        C0643ab c0643ab = new C0643ab(this);
        c0643ab.f4110e = -1;
        c0643ab.f4107b = true;
        return c0643ab;
    }

    /* renamed from: a */
    public void m2796a(C1136m c1136m, AbstractC0629y abstractC0629y, C1136m c1136m2, float f, int i) {
        int i2 = 0;
        while (!c1136m2.isEmpty()) {
            AbstractC0629y abstractC0629y2 = null;
            float f2 = -1.0f;
            PointF pointF = null;
            int i3 = -1;
            Object[] m535a = c1136m2.m535a();
            Object[] m535a2 = c1136m.m535a();
            int size = c1136m.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0629y abstractC0629y3 = (AbstractC0629y) m535a2[i4];
                if (abstractC0629y3.f3955ad == abstractC0629y && !abstractC0629y3.f3961aj) {
                    float f3 = -1.0f;
                    PointF pointF2 = null;
                    int i5 = -1;
                    for (int i6 = 0; i6 < c1136m2.f7109a; i6++) {
                        PointF pointF3 = (PointF) m535a[i6];
                        float m2216a = C0773f.m2216a(abstractC0629y3.f7173eo, abstractC0629y3.f7174ep, abstractC0629y.f7173eo + pointF3.x, abstractC0629y.f7174ep + pointF3.y);
                        if (f3 == -1.0f || m2216a < f3) {
                            f3 = m2216a;
                            pointF2 = pointF3;
                            i5 = i6;
                        }
                    }
                    if (f3 > f2) {
                        abstractC0629y2 = abstractC0629y3;
                        f2 = f3;
                        pointF = pointF2;
                        i3 = i5;
                    }
                }
            }
            if (abstractC0629y2 != null) {
                i2++;
                abstractC0629y2.f3961aj = true;
                abstractC0629y2.f3962ak = pointF.x;
                abstractC0629y2.f3963al = pointF.y;
                abstractC0629y2.f3964am = f;
                abstractC0629y2.f3966ao = f2;
                abstractC0629y2.f3959ah = (short) (i + 1);
                c1136m2.remove(i3);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m2797a(C1136m c1136m, AbstractC0629y abstractC0629y) {
        while (true) {
            AbstractC0629y abstractC0629y2 = null;
            Iterator it = c1136m.iterator();
            while (it.hasNext()) {
                AbstractC0629y abstractC0629y3 = (AbstractC0629y) it.next();
                if (abstractC0629y3.f3955ad == abstractC0629y && abstractC0629y3.f3966ao > 0.0f && (abstractC0629y2 == null || abstractC0629y3.f3966ao > abstractC0629y2.f3966ao)) {
                    if (abstractC0629y3.f3961aj && abstractC0629y3.f3966ao > 100.0f) {
                        abstractC0629y2 = abstractC0629y3;
                    }
                }
            }
            if (abstractC0629y2 != null) {
                abstractC0629y2.f3961aj = false;
                AbstractC0629y abstractC0629y4 = null;
                float f = 0.0f;
                AbstractC0629y abstractC0629y5 = abstractC0629y2;
                int m2211a = C0773f.m2211a((int) abstractC0629y5.f3966ao);
                Iterator it2 = c1136m.iterator();
                while (it2.hasNext()) {
                    AbstractC0629y abstractC0629y6 = (AbstractC0629y) it2.next();
                    if (abstractC0629y6.f3955ad == abstractC0629y && abstractC0629y6.f3966ao > 0.0f && abstractC0629y6 != abstractC0629y5) {
                        float m2149c = ((0 + C0773f.m2149c(abstractC0629y5.f7173eo, abstractC0629y5.f7174ep, abstractC0629y.f7173eo + abstractC0629y6.f3962ak, abstractC0629y.f7174ep + abstractC0629y6.f3963al)) + C0773f.m2149c(abstractC0629y6.f7173eo, abstractC0629y6.f7174ep, abstractC0629y.f7173eo + abstractC0629y5.f3962ak, abstractC0629y.f7174ep + abstractC0629y5.f3963al)) - (C0773f.m2211a((int) abstractC0629y6.f3966ao) + m2211a);
                        if (m2149c < f) {
                            f = m2149c;
                            abstractC0629y4 = abstractC0629y6;
                        }
                    }
                }
                if (abstractC0629y4 != null) {
                    float f2 = abstractC0629y5.f3962ak;
                    float f3 = abstractC0629y5.f3963al;
                    abstractC0629y5.f3962ak = abstractC0629y4.f3962ak;
                    abstractC0629y5.f3963al = abstractC0629y4.f3963al;
                    abstractC0629y5.f3966ao = C0773f.m2216a(abstractC0629y5.f7173eo, abstractC0629y5.f7174ep, abstractC0629y.f7173eo + abstractC0629y5.f3962ak, abstractC0629y.f7174ep + abstractC0629y5.f3963al);
                    abstractC0629y4.f3962ak = f2;
                    abstractC0629y4.f3963al = f3;
                    abstractC0629y4.f3966ao = C0773f.m2216a(abstractC0629y4.f7173eo, abstractC0629y4.f7174ep, abstractC0629y.f7173eo + abstractC0629y4.f3962ak, abstractC0629y.f7174ep + abstractC0629y4.f3963al);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C1136m m2799a(int i, float f, float f2) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        int i5 = 6 / 2;
        float f3 = 2.0f + (f * 2.0f * 1.5f);
        C1136m c1136m = new C1136m();
        int i6 = i;
        if (i6 % 2 != 0) {
            i6++;
        }
        float m2107k = C0773f.m2107k(f2);
        float m2110j = C0773f.m2110j(f2);
        for (int i7 = 0; i7 < i6; i7++) {
            if (i3 % 2 == 0) {
                i2 = i5 + (i3 / 2);
            } else {
                i2 = i5 - ((i3 + 1) / 2);
            }
            float f4 = (i2 - i5) * f3;
            float f5 = (-i4) * f3;
            c1136m.add(new PointF((f5 * m2107k) - (f4 * m2110j), (f4 * m2107k) + (f5 * m2110j)));
            i3++;
            if (i3 > 6) {
                i3 = 0;
                i4++;
            }
        }
        return c1136m;
    }
}
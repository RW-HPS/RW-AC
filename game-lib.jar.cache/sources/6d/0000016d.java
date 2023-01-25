package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/d.class */
public abstract class AbstractC0159d {

    /* renamed from: b */
    String f650b;

    /* renamed from: c */
    public ArrayList f651c = new ArrayList();

    /* renamed from: a */
    private ArrayList f652a = new ArrayList();

    /* renamed from: d */
    final /* synthetic */ C0136a f653d;

    /* renamed from: a */
    public abstract boolean mo4785a(InterfaceC0303as interfaceC0303as);

    public AbstractC0159d(C0136a c0136a, String str) {
        this.f653d = c0136a;
        this.f650b = str;
        c0136a.f604bq.add(this);
    }

    /* renamed from: b */
    public boolean m4782b(InterfaceC0303as interfaceC0303as) {
        Iterator it = this.f651c.iterator();
        while (it.hasNext()) {
            if (((C0160e) it.next()).f654a == interfaceC0303as) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public float m4780c(InterfaceC0303as interfaceC0303as) {
        return 10.0f;
    }

    /* renamed from: a */
    public ArrayList m4788a() {
        Collections.shuffle(this.f652a);
        return this.f652a;
    }

    /* renamed from: b */
    public void m4783b() {
        this.f651c = new ArrayList();
        float f = 0.0f;
        Iterator it = EnumC0249ar.f1796ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            if (mo4785a(interfaceC0303as)) {
                float m4780c = m4780c(interfaceC0303as);
                f += m4780c;
                this.f651c.add(new C0160e(this, interfaceC0303as, m4780c));
            }
        }
        this.f652a = new ArrayList(this.f651c);
        if (this.f651c.size() == 0) {
            GameEngine.m5460e("AI: rebuildUnitMix: no units in unitMix:" + this.f650b);
        }
    }

    /* renamed from: c */
    public InterfaceC0303as m4781c() {
        return m4786a((EnumC0246ao) null, -1);
    }

    /* renamed from: a */
    public InterfaceC0303as m4787a(EnumC0246ao enumC0246ao) {
        return m4786a(enumC0246ao, -1);
    }

    /* renamed from: a */
    public boolean m4784a(InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == null) {
            return true;
        }
        EnumC0246ao mo3501o = interfaceC0303as.mo3501o();
        if (mo3501o == EnumC0246ao.OVER_CLIFF) {
            mo3501o = EnumC0246ao.LAND;
        }
        if (mo3501o == EnumC0246ao.OVER_CLIFF_WATER) {
            mo3501o = EnumC0246ao.HOVER;
        }
        if (mo3501o == enumC0246ao) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public InterfaceC0303as m4786a(EnumC0246ao enumC0246ao, int i) {
        if (this.f651c.size() == 0) {
            GameEngine.m5460e("AI: getRandomUnitType: no units in unitMix:" + this.f650b);
            return null;
        }
        float f = 0.0f;
        int i2 = 0;
        Iterator it = this.f651c.iterator();
        while (it.hasNext()) {
            C0160e c0160e = (C0160e) it.next();
            if (m4784a(c0160e.f654a, enumC0246ao) && (i == -1 || c0160e.f654a.mo3529c() <= i)) {
                f += c0160e.f655b;
                i2++;
            }
        }
        if (i2 == 0) {
            return null;
        }
        float m2151c = C0773f.m2151c(0.0f, f);
        float f2 = 0.0f;
        Iterator it2 = this.f651c.iterator();
        while (it2.hasNext()) {
            C0160e c0160e2 = (C0160e) it2.next();
            if (m4784a(c0160e2.f654a, enumC0246ao) && (i == -1 || c0160e2.f654a.mo3529c() <= i)) {
                f2 += c0160e2.f655b;
                if (f2 > m2151c) {
                    return c0160e2.f654a;
                }
            }
        }
        GameEngine.m5460e("Did not find getRandomUnit, this should only happen very rarely, name:" + this.f650b + " unitMix.size:" + this.f651c.size() + " minPrice:" + i + " movementType:" + enumC0246ao + " totalUnits:" + i2);
        return ((C0160e) this.f651c.get(this.f651c.size() - 1)).f654a;
    }
}
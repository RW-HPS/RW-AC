package com.corrodinggames.rts.gameFramework.status.p047a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.status.C1066a;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a/c.class */
public class C1069c extends AbstractC1067a {

    /* renamed from: a */
    Integer f6843a;

    /* renamed from: b */
    Integer f6844b;

    /* renamed from: c */
    PlayerData f6845c;

    /* renamed from: d */
    InterfaceC0303as f6846d;

    /* renamed from: e */
    boolean f6847e;

    /* renamed from: f */
    boolean f6848f;

    /* renamed from: g */
    boolean f6849g;

    /* renamed from: h */
    boolean f6850h;

    /* renamed from: i */
    boolean f6851i;

    /* renamed from: j */
    boolean f6852j;

    /* renamed from: k */
    int f6853k;

    /* renamed from: l */
    boolean f6854l;

    /* renamed from: m */
    boolean f6855m;

    /* renamed from: n */
    boolean f6856n;

    /* renamed from: o */
    C0453g f6857o;

    /* renamed from: p */
    boolean f6858p;

    /* renamed from: d */
    public static C1069c m802d(C1066a c1066a) {
        C1069c c1069c = new C1069c();
        c1069c.f6843a = c1066a.m811d("maxUnits");
        int i = 1;
        if (c1069c.f6843a != null) {
            i = 0;
        }
        c1069c.f6844b = Integer.valueOf(c1066a.m825a("minUnits", i));
        c1069c.f6845c = c1066a.m830a();
        InterfaceC0303as interfaceC0303as = null;
        String m817b = c1066a.m817b("unitType");
        if (m817b != null) {
            interfaceC0303as = EnumC0249ar.m4174a(m817b);
            if (interfaceC0303as == null) {
                c1066a.m808g("Cound not find unitType:" + m817b);
            }
        }
        c1069c.f6846d = interfaceC0303as;
        c1069c.f6847e = c1066a.m821a("onlybuildings", "onlyBuildings", false);
        c1069c.f6849g = c1066a.m820a("onlyMainBuildings", false);
        c1069c.f6850h = c1066a.m820a("onlyOnResourcePool", false);
        c1069c.f6848f = c1066a.m821a("onlyidle", "onlyIdle", false);
        c1069c.f6853k = c1066a.m825a("onlyTechLevel", -1);
        c1069c.f6852j = c1066a.m820a("onlyBuilders", false);
        c1069c.f6851i = c1066a.m820a("onlyEmptyQueue", false);
        c1069c.f6854l = c1066a.m820a("onlyAttack", false);
        c1069c.f6855m = c1066a.m820a("onlyAttackAir", false);
        c1069c.f6856n = c1066a.m820a("onlyIfEmpty", false);
        String m817b2 = c1066a.m817b("onlyWithTag");
        if (m817b2 != null && !m817b2.equals(VariableScope.nullOrMissingString)) {
            try {
                c1069c.f6857o = C0453g.m3678b(m817b2);
            } catch (C0417bo e) {
                throw new C0179f(e.getMessage());
            }
        }
        c1069c.f6858p = c1066a.m820a("includeIncomplete", false);
        return c1069c;
    }

    @Override // com.corrodinggames.rts.gameFramework.status.p047a.AbstractC1067a
    /* renamed from: b */
    public boolean mo803b(C1066a c1066a) {
        return m801e(c1066a);
    }

    /* renamed from: e */
    public boolean m801e(C1066a c1066a) {
        int i = 0;
        AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m499a[i2];
            if ((this.f6845c == null || abstractC0244am.f1614bX == this.f6845c) && (abstractC0244am instanceof AbstractC0629y) && abstractC0244am.f1656cN == null && c1066a.m829a(abstractC0244am) && (this.f6846d == null || abstractC0244am.mo5458r() == this.f6846d)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if ((this.f6858p || abstractC0244am.m4226bT()) && ((!this.f6854l || abstractC0244am.mo3067l()) && ((!this.f6855m || (abstractC0244am.mo3067l() && abstractC0629y.mo2955af())) && ((!this.f6847e || abstractC0244am.mo3397bI()) && ((!this.f6849g || (abstractC0244am.mo3397bI() && abstractC0244am.mo3300bJ())) && ((!this.f6850h || abstractC0244am.mo5458r().mo3499p()) && ((!this.f6852j || abstractC0244am.mo2950ak()) && ((!this.f6848f || abstractC0629y.m2944aq()) && ((!this.f6851i || abstractC0629y.mo3371a((C0453g) null) <= 0) && ((this.f6853k == -1 || abstractC0244am.mo3038V() == this.f6853k) && ((this.f6857o == null || C0453g.m3685a(this.f6857o, abstractC0244am.mo3599de())) && (!this.f6856n || abstractC0629y.mo2916bB() <= 0)))))))))))) {
                    i++;
                }
            }
        }
        if (i >= this.f6844b.intValue()) {
            if (this.f6843a == null || i <= this.f6843a.intValue()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.gameFramework.f.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/an.class */
public class C0810an {

    /* renamed from: a */
    static C1136m f5205a = new C1136m();

    /* renamed from: b */
    static final C0843x f5206b = new C0843x();

    /* renamed from: a */
    public static C0811ao m1955a(long j) {
        Object[] m535a = f5205a.m535a();
        for (int i = f5205a.f7109a - 1; i >= 0; i--) {
            C0811ao c0811ao = (C0811ao) m535a[i];
            if (c0811ao.f5207a == j) {
                return c0811ao;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0811ao m1954a(AbstractC0244am abstractC0244am) {
        C0811ao m1955a = m1955a(abstractC0244am.f7166eh);
        if (m1955a == null) {
            m1955a = new C0811ao();
            m1955a.f5207a = abstractC0244am.f7166eh;
            m1955a.f5208b = abstractC0244am.f1647cE;
            m1955a.f5209c = abstractC0244am.f1648cF;
            m1955a.f5210d = GameEngine.getGameEngine().netEngine.loaclTick;
            f5205a.add(m1955a);
        }
        return m1955a;
    }

    /* renamed from: a */
    public static void m1953a(AbstractC0244am abstractC0244am, C0429b c0429b) {
        if (!GameEngine.getGameEngine().netEngine.f5715B) {
            return;
        }
        C0811ao m1954a = m1954a(abstractC0244am);
        m1954a.f5208b += c0429b.f2729f;
        m1954a.f5209c = c0429b.m3821c(m1954a.f5209c);
        if (!c0429b.f2734k.m3723c()) {
            m1954a.f5211e = C0444f.m3724b(m1954a.f5211e, c0429b.f2734k);
        }
    }

    /* renamed from: b */
    public static void m1950b(AbstractC0244am abstractC0244am, C0429b c0429b) {
        if (!GameEngine.getGameEngine().netEngine.f5715B) {
            return;
        }
        C0811ao m1954a = m1954a(abstractC0244am);
        m1954a.f5208b -= c0429b.f2729f;
        m1954a.f5209c = c0429b.m3821c(m1954a.f5209c);
        if (!c0429b.f2734k.m3723c()) {
            m1954a.f5211e = C0444f.m3738a(m1954a.f5211e, c0429b.f2734k);
        }
        if (f5205a.f7109a > 0) {
        }
    }

    /* renamed from: c */
    public static boolean m1949c(AbstractC0244am abstractC0244am, C0429b c0429b) {
        C0811ao m1955a = m1955a(abstractC0244am.f7166eh);
        if (m1955a != null) {
            f5206b.f1614bX = abstractC0244am.f1614bX;
            f5206b.f1647cE = m1955a.f5208b;
            f5206b.f1648cF = m1955a.f5209c;
            C0444f mo1748df = f5206b.mo1748df();
            f5206b.m1750a(m1955a.f5211e);
            boolean mo3800b = c0429b.mo3800b(f5206b);
            f5206b.m1750a(mo1748df);
            return mo3800b;
        }
        return c0429b.mo3800b(abstractC0244am);
    }

    /* renamed from: a */
    public static boolean m1952a(LogicBoolean logicBoolean, AbstractC0629y abstractC0629y) {
        C0811ao m1955a = m1955a(abstractC0629y.f7166eh);
        if (m1955a != null) {
            int i = abstractC0629y.f1647cE;
            int i2 = abstractC0629y.f1648cF;
            abstractC0629y.f1647cE = m1955a.f5208b;
            abstractC0629y.f1648cF = m1955a.f5209c;
            boolean read = logicBoolean.read(abstractC0629y);
            abstractC0629y.f1647cE = i;
            abstractC0629y.f1648cF = i2;
            return read;
        }
        return logicBoolean.read(abstractC0629y);
    }

    /* renamed from: a */
    public static void m1956a() {
        if (f5205a.f7109a > 0) {
            GameEngine.m5777e("LagHiding: clearing: " + f5205a.f7109a);
        }
        f5205a.clear();
    }

    /* renamed from: a */
    public static void m1951a(AbstractC0629y abstractC0629y, AbstractC0224s abstractC0224s) {
        if (f5205a.size() == 0) {
            return;
        }
        int i = GameEngine.getGameEngine().netEngine.loaclTick;
        for (int size = f5205a.size() - 1; size >= 0; size--) {
            C0811ao c0811ao = (C0811ao) f5205a.get(size);
            if (c0811ao.f5207a == abstractC0629y.f7166eh) {
                f5205a.remove(size);
                return;
            } else if (c0811ao.f5210d < i + 80) {
                f5205a.remove(size);
                return;
            }
        }
    }
}
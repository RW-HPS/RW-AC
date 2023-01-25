package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/al.class */
abstract class AbstractC0802al {

    /* renamed from: a */
    static AbstractC0802al f5190a = new AbstractC0802al() { // from class: com.corrodinggames.rts.gameFramework.f.al.1
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0802al
        /* renamed from: a */
        public boolean mo1963a(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo2951aj() && !abstractC0629y.mo1745u() && abstractC0629y.f1656cN == null && abstractC0629y.m2944aq()) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: b */
    static AbstractC0802al f5191b = new AbstractC0802al() { // from class: com.corrodinggames.rts.gameFramework.f.al.2
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0802al
        /* renamed from: a */
        public boolean mo1963a(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo2951aj() && !abstractC0629y.mo1745u() && abstractC0629y.f1656cN == null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: c */
    static AbstractC0802al f5192c = new AbstractC0802al() { // from class: com.corrodinggames.rts.gameFramework.f.al.3
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0802al
        /* renamed from: a */
        public boolean mo1963a(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo1747r() != null && abstractC0629y.mo1747r().mo3499p() && abstractC0629y.f1656cN == null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d */
    static AbstractC0802al f5193d = new AbstractC0802al() { // from class: com.corrodinggames.rts.gameFramework.f.al.4
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0802al
        /* renamed from: a */
        public boolean mo1963a(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo1747r() == EnumC0249ar.fabricator && abstractC0629y.mo3038V() < 3 && abstractC0629y.f1656cN == null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: e */
    static AbstractC0802al f5194e = new AbstractC0802al() { // from class: com.corrodinggames.rts.gameFramework.f.al.5
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0802al
        /* renamed from: a */
        public boolean mo1963a(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo1747r() == EnumC0249ar.landFactory && abstractC0629y.f1656cN == null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: f */
    static AbstractC0802al f5195f = new AbstractC0802al() { // from class: com.corrodinggames.rts.gameFramework.f.al.6
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0802al
        /* renamed from: a */
        public boolean mo1963a(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo1747r() == EnumC0249ar.airFactory && abstractC0629y.f1656cN == null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a */
    public abstract boolean mo1963a(AbstractC0629y abstractC0629y);

    AbstractC0802al() {
    }

    /* renamed from: a */
    public static void m1964a(ArrayList arrayList, AbstractC0802al abstractC0802al, AbstractC0802al abstractC0802al2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6378bS.m1799q() != 1) {
            arrayList.clear();
        }
        AbstractC0629y m1794t = gameEngine.f6378bS.m1794t();
        if (m1794t != null) {
            if (abstractC0802al.mo1963a(m1794t) || (abstractC0802al2 != null && abstractC0802al2.mo1963a(m1794t))) {
                if (!arrayList.contains(m1794t)) {
                    arrayList.add(m1794t);
                }
            } else {
                arrayList.clear();
            }
        }
        AbstractC0629y m1965a = m1965a(arrayList, abstractC0802al);
        if (m1965a == null && abstractC0802al2 != null) {
            m1965a = m1965a(arrayList, abstractC0802al2);
        }
        if (m1965a == null) {
            arrayList.clear();
            if (m1794t != null) {
                arrayList.add(m1794t);
            }
            m1965a = m1965a(arrayList, abstractC0802al);
            if (m1965a == null && abstractC0802al2 != null) {
                m1965a = m1965a(arrayList, abstractC0802al2);
            }
        }
        if (m1965a != null) {
            gameEngine.f6378bS.m1789y();
            gameEngine.f6378bS.m1812j(m1965a);
            gameEngine.m1022b(m1965a.f7173eo, m1965a.f7174ep);
            arrayList.add(m1965a);
        }
    }

    /* renamed from: a */
    public static AbstractC0629y m1965a(ArrayList arrayList, AbstractC0802al abstractC0802al) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0629y abstractC0629y = null;
        float f = -1.0f;
        Iterator it = AbstractC0244am.f1594bE.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am;
                if (gameEngine.f6378bS.m1806m(abstractC0629y2) && abstractC0802al.mo1963a(abstractC0629y2) && !arrayList.contains(abstractC0629y2)) {
                    float m2216a = C0773f.m2216a(gameEngine.f6410cy + gameEngine.f6420cI, gameEngine.f6411cz + gameEngine.f6421cJ, abstractC0629y2.f7173eo, abstractC0629y2.f7174ep);
                    if (abstractC0629y == null || m2216a < f) {
                        f = m2216a;
                        abstractC0629y = abstractC0629y2;
                    }
                }
            }
        }
        return abstractC0629y;
    }
}
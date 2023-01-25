package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.C0773f;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/f.class */
public class C0161f {
    /* renamed from: a */
    static boolean m4776a(AbstractC0629y abstractC0629y) {
        C0305au m2943ar;
        boolean z = false;
        if (abstractC0629y.m2944aq()) {
            z = true;
        }
        if (!z && (m2943ar = abstractC0629y.m2943ar()) != null && m2943ar.m4145d() == EnumC0306av.reclaim) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    static boolean m4773b(AbstractC0629y abstractC0629y) {
        boolean z = false;
        if (abstractC0629y.m2944aq()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Object m4774a(AbstractList abstractList) {
        int size = abstractList.size();
        if (size == 0) {
            return null;
        }
        return abstractList.get(C0773f.rand(0, size - 1));
    }

    /* renamed from: a */
    public static boolean m4775a(AbstractC0629y abstractC0629y, C0453g c0453g) {
        InterfaceC0303as r = abstractC0629y.mo1747r();
        if ((r instanceof C0458l) && C0453g.m3685a(c0453g, ((C0458l) r).f3266fv)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC0224s m4777a(C0136a c0136a, AbstractC0629y abstractC0629y, EnumC0340e enumC0340e) {
        ArrayList N = abstractC0629y.mo3132N();
        ArrayList m4837ap = c0136a.m4837ap();
        Iterator it = N.iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.mo4050v(abstractC0629y) == enumC0340e) {
                m4837ap.add(abstractC0224s);
            }
        }
        if (m4837ap.size() > 0) {
            return (AbstractC0224s) m4774a(m4837ap);
        }
        return null;
    }
}
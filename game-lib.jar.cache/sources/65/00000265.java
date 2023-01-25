package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/be.class */
public final class C0407be {

    /* renamed from: a */
    C1136m f2513a = new C1136m();

    /* renamed from: b */
    C1136m f2514b = new C1136m();

    /* renamed from: c */
    boolean f2515c;

    /* renamed from: d */
    boolean f2516d;

    /* renamed from: e */
    public static final C0408bf f2517e = new C0408bf();

    /* renamed from: a */
    public static C0407be m3907a(C0458l c0458l, C1107ab c1107ab) {
        C0407be c0407be = new C0407be();
        c0407be.m3903b(c0458l, c1107ab);
        if (c0407be.f2514b.size() == 0) {
            return null;
        }
        Iterator it = c0407be.f2513a.iterator();
        while (it.hasNext()) {
            C0453g c0453g = (C0453g) it.next();
            if (c0453g != null) {
                int i = 0;
                C0409bg c0409bg = null;
                Iterator it2 = c0407be.f2514b.iterator();
                while (it2.hasNext()) {
                    C0409bg c0409bg2 = (C0409bg) it2.next();
                    if (c0409bg2.f2523b == c0453g) {
                        i++;
                        c0409bg = c0409bg2;
                    }
                }
                if (i == 1) {
                    c0458l.m3494r("[placementRule_" + c0409bg.f2522a + "]anyRuleInGroup: No other rule with this same group name found");
                }
            }
        }
        return c0407be;
    }

    /* renamed from: b */
    public void m3903b(C0458l c0458l, C1107ab c1107ab) {
        Iterator it = c1107ab.m654e("placementRule_").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.substring("placementRule_".length());
            C0409bg c0409bg = new C0409bg();
            c0409bg.f2522a = substring;
            c0409bg.m3900a(c0458l, c1107ab, str);
            if (c0409bg.m3901a()) {
                if (!this.f2513a.contains(c0409bg.f2523b)) {
                    this.f2513a.add(c0409bg.f2523b);
                }
                if (c0409bg.f2535n) {
                    if (!c0409bg.f2537p) {
                        this.f2515c = true;
                    } else {
                        this.f2516d = true;
                    }
                }
                this.f2514b.add(c0409bg);
            }
        }
    }

    /* renamed from: a */
    public String m3906a(AbstractC0629y abstractC0629y, float f, float f2) {
        if (!this.f2515c) {
            return null;
        }
        return m3902b(abstractC0629y, f, f2);
    }

    /* renamed from: a */
    public String m3905a(AbstractC0629y abstractC0629y, int i, int i2) {
        if (!this.f2516d) {
            return null;
        }
        C0173b c0173b = GameEngine.getGameEngine().f6371bL;
        c0173b.m4624b(i, i2);
        return m3902b(abstractC0629y, c0173b.f829T, c0173b.f830U);
    }

    /* renamed from: b */
    public String m3902b(AbstractC0629y abstractC0629y, float f, float f2) {
        boolean z;
        Iterator it = this.f2513a.iterator();
        while (it.hasNext()) {
            C0453g c0453g = (C0453g) it.next();
            boolean z2 = false;
            boolean z3 = false;
            C0409bg c0409bg = null;
            Iterator it2 = this.f2514b.iterator();
            while (it2.hasNext()) {
                C0409bg c0409bg2 = (C0409bg) it2.next();
                if (c0409bg2.f2523b == c0453g && c0409bg2.f2535n) {
                    if (!m3904a(abstractC0629y, c0409bg2, f, f2)) {
                        if (c0409bg == null) {
                            c0409bg = c0409bg2;
                        }
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (c0453g == null) {
                z = !z3;
            } else {
                z = z2;
            }
            if (!z && c0409bg != null) {
                if (c0409bg.f2536o != null) {
                    return c0409bg.f2536o.m3910b();
                }
                return "{0}";
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m3904a(AbstractC0629y abstractC0629y, C0409bg c0409bg, float f, float f2) {
        f2517e.f2518a = f + c0409bg.f2528g;
        f2517e.f2519b = f2 + c0409bg.f2529h;
        f2517e.f2520c = c0409bg;
        f2517e.f2521d = 0;
        GameEngine.getGameEngine().f6388cc.m3209a(f2517e.f2518a, f2517e.f2519b, c0409bg.f2526e, abstractC0629y, 0.0f, f2517e);
        if (f2517e.f2521d >= c0409bg.f2532k && f2517e.f2521d <= c0409bg.f2533l) {
            return true;
        }
        return false;
    }
}
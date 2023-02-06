package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/be.class */
public final class be {
    com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m b = new com.corrodinggames.rts.gameFramework.utility.m();
    boolean c;
    boolean d;
    public static final bf e = new bf();

    public static be a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar) {
        be beVar = new be();
        beVar.b(lVar, abVar);
        if (beVar.b.size() == 0) {
            return null;
        }
        Iterator it = beVar.a.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar != null) {
                int i = 0;
                bg bgVar = null;
                Iterator it2 = beVar.b.iterator();
                while (it2.hasNext()) {
                    bg bgVar2 = (bg) it2.next();
                    if (bgVar2.b == gVar) {
                        i++;
                        bgVar = bgVar2;
                    }
                }
                if (i == 1) {
                    lVar.r("[placementRule_" + bgVar.a + "]anyRuleInGroup: No other rule with this same group name found");
                }
            }
        }
        return beVar;
    }

    public void b(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar) {
        Iterator it = abVar.e("placementRule_").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.substring("placementRule_".length());
            bg bgVar = new bg();
            bgVar.a = substring;
            bgVar.a(lVar, abVar, str);
            if (bgVar.a()) {
                if (!this.a.contains(bgVar.b)) {
                    this.a.add(bgVar.b);
                }
                if (bgVar.n) {
                    if (!bgVar.p) {
                        this.c = true;
                    } else {
                        this.d = true;
                    }
                }
                this.b.add(bgVar);
            }
        }
    }

    public String a(com.corrodinggames.rts.game.units.y yVar, float f, float f2) {
        if (!this.c) {
            return null;
        }
        return b(yVar, f, f2);
    }

    public String a(com.corrodinggames.rts.game.units.y yVar, int i, int i2) {
        if (!this.d) {
            return null;
        }
        com.corrodinggames.rts.game.maps.b bVar = GameEngine.getGameEngine().bL;
        bVar.b(i, i2);
        return b(yVar, bVar.T, bVar.U);
    }

    public String b(com.corrodinggames.rts.game.units.y yVar, float f, float f2) {
        boolean z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            boolean z2 = false;
            boolean z3 = false;
            bg bgVar = null;
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                bg bgVar2 = (bg) it2.next();
                if (bgVar2.b == gVar && bgVar2.n) {
                    if (!a(yVar, bgVar2, f, f2)) {
                        if (bgVar == null) {
                            bgVar = bgVar2;
                        }
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (gVar == null) {
                z = !z3;
            } else {
                z = z2;
            }
            if (!z && bgVar != null) {
                if (bgVar.o != null) {
                    return bgVar.o.b();
                }
                return "{0}";
            }
        }
        return null;
    }

    private static boolean a(com.corrodinggames.rts.game.units.y yVar, bg bgVar, float f, float f2) {
        e.a = f + bgVar.g;
        e.b = f2 + bgVar.h;
        e.c = bgVar;
        e.d = 0;
        GameEngine.getGameEngine().cc.a(e.a, e.b, bgVar.e, yVar, 0.0f, e);
        if (e.d >= bgVar.k && e.d <= bgVar.l) {
            return true;
        }
        return false;
    }
}
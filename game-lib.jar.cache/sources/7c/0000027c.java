package com.corrodinggames.rts.game.units.custom.d;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/c.class */
public class c extends a {
    public final m a = new m();
    boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public static c a(l lVar, ab abVar, String str, String str2, c cVar) {
        String b = abVar.b(str, str2, (String) null);
        if (b == null) {
            return cVar;
        }
        try {
            return a(lVar, b);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    public static c a(l lVar, String str) {
        return a(lVar, str, false);
    }

    public static c a(l lVar, String str, boolean z) {
        String trim;
        String substring;
        c cVar = new c();
        Iterator it = al.a(str, ",", "|", false).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int a = al.a(str2, "=", ":");
            if (a == -1) {
                if (!z) {
                    throw new bo("Unknown price format:" + str);
                }
                trim = "credits";
                substring = str2;
            } else {
                trim = str2.substring(0, a).trim();
                substring = str2.substring(a + 1);
            }
            if (trim.equals("hasFlag")) {
                cVar.e = b.a(cVar.e, substring);
            } else if (trim.equals("hasMissingFlag")) {
                cVar.f = b.a(cVar.f, substring);
            } else if (trim.equals("setFlag")) {
                cVar.c = b.a(cVar.c, substring);
            } else if (trim.equals("unsetFlag")) {
                cVar.d = b.a(cVar.d, substring);
            } else {
                com.corrodinggames.rts.game.units.custom.e.a j = lVar.j(trim);
                if (j == null) {
                    throw new bo("Could not find resource type:" + trim + " from [" + str + "]");
                }
                LogicBoolean parseNumberBlock = LogicBooleanLoader.parseNumberBlock(lVar, substring);
                if (parseNumberBlock == null) {
                    throw new bo("Value missing for:" + trim + " from [" + str + "]");
                }
                if (!(parseNumberBlock instanceof LogicBoolean.StaticValueBoolean)) {
                    cVar.b = true;
                }
                cVar.a.add(new d(j, parseNumberBlock));
            }
        }
        return cVar;
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public boolean b(am amVar) {
        return b(amVar, 1.0d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public boolean b(am amVar, double d) {
        double d2;
        if (!(amVar instanceof y)) {
            return false;
        }
        y yVar = (y) amVar;
        int i = this.a.a;
        Object[] a = this.a.a();
        for (int i2 = 0; i2 < i; i2++) {
            d dVar = (d) a[i2];
            if (dVar.c != null) {
                d2 = dVar.c.readNumber(yVar) * d;
            } else {
                d2 = dVar.b * d;
            }
            if (d2 > 0.0d && dVar.a.a(yVar) < d2) {
                return false;
            }
        }
        if (!g(yVar)) {
            return false;
        }
        return true;
    }

    public void d(am amVar) {
        double d;
        if (!(amVar instanceof y)) {
            GameEngine.n("DynamicResourcePrice doesn't work on: " + amVar.c());
            return;
        }
        y yVar = (y) amVar;
        int i = this.a.a;
        Object[] a = this.a.a();
        for (int i2 = 0; i2 < i; i2++) {
            d dVar = (d) a[i2];
            if (dVar.c != null) {
                d = dVar.c.readNumber(yVar);
            } else {
                d = dVar.b;
            }
            dVar.a.a(yVar, d);
        }
        f(yVar);
        b.d(yVar);
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public void a(am amVar) {
        a(amVar, 1.0d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public void a(am amVar, double d) {
        double d2;
        if (!(amVar instanceof y)) {
            GameEngine.n("DynamicResourcePrice doesn't work on: " + amVar.c());
            return;
        }
        y yVar = (y) amVar;
        int i = this.a.a;
        Object[] a = this.a.a();
        for (int i2 = 0; i2 < i; i2++) {
            d dVar = (d) a[i2];
            if (dVar.c != null) {
                d2 = dVar.c.readNumber(yVar);
            } else {
                d2 = dVar.b;
            }
            dVar.a.b(yVar, (-d2) * d);
        }
        f(yVar);
        b.d(yVar);
    }

    public void e(am amVar) {
        double d;
        if (!(amVar instanceof y)) {
            GameEngine.n("DynamicResourcePrice doesn't work on: " + amVar.c());
            return;
        }
        y yVar = (y) amVar;
        int i = this.a.a;
        Object[] a = this.a.a();
        for (int i2 = 0; i2 < i; i2++) {
            d dVar = (d) a[i2];
            if (dVar.c != null) {
                d = dVar.c.readNumber(yVar);
            } else {
                d = dVar.b;
            }
            dVar.a.b(yVar, d);
        }
        f(yVar);
        b.d(yVar);
    }

    public void f(am amVar) {
        if (this.d != 0) {
            amVar.cF &= this.d ^ (-1);
        }
        if (this.c != 0) {
            amVar.cF |= this.c;
        }
    }

    public boolean g(am amVar) {
        if (this.e != 0 && !a(amVar.cF, this.e)) {
            return false;
        }
        if (this.f != 0 && b(amVar.cF, this.f)) {
            return false;
        }
        return true;
    }

    public static boolean a(int i, int i2) {
        return (i2 & i) == i2;
    }

    public static boolean b(int i, int i2) {
        return (i2 & i) != 0;
    }
}
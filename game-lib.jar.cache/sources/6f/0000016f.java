package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.y;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/f.class */
public class f {
    static boolean a(y yVar) {
        au ar;
        boolean z = false;
        if (yVar.aq()) {
            z = true;
        }
        if (!z && (ar = yVar.ar()) != null && ar.d() == av.reclaim) {
            z = true;
        }
        return z;
    }

    static boolean b(y yVar) {
        boolean z = false;
        if (yVar.aq()) {
            z = true;
        }
        return z;
    }

    public static Object a(AbstractList abstractList) {
        int size = abstractList.size();
        if (size == 0) {
            return null;
        }
        return abstractList.get(com.corrodinggames.rts.gameFramework.f.rand(0, size - 1));
    }

    public static boolean a(y yVar, com.corrodinggames.rts.game.units.custom.g gVar) {
        as r = yVar.mo1r();
        if ((r instanceof com.corrodinggames.rts.game.units.custom.l) && com.corrodinggames.rts.game.units.custom.g.a(gVar, ((com.corrodinggames.rts.game.units.custom.l) r).fv)) {
            return true;
        }
        return false;
    }

    public static s a(a aVar, y yVar, com.corrodinggames.rts.game.units.custom.a.e eVar) {
        ArrayList N = yVar.N();
        ArrayList ap = aVar.ap();
        Iterator it = N.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.v(yVar) == eVar) {
                ap.add(sVar);
            }
        }
        if (ap.size() > 0) {
            return (s) a(ap);
        }
        return null;
    }
}
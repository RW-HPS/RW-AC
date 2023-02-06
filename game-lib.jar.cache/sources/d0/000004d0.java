package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.d.b;
import com.corrodinggames.rts.game.units.custom.e.f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.m;

/* renamed from: com.corrodinggames.rts.gameFramework.f.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/an.class */
public class an {
    static m a = new m();
    static final x b = new x();

    public static ao a(long j) {
        Object[] a2 = a.a();
        for (int i = a.a - 1; i >= 0; i--) {
            ao aoVar = (ao) a2[i];
            if (aoVar.a == j) {
                return aoVar;
            }
        }
        return null;
    }

    public static ao a(am amVar) {
        ao a2 = a(amVar.eh);
        if (a2 == null) {
            a2 = new ao();
            a2.a = amVar.eh;
            a2.b = amVar.cE;
            a2.c = amVar.cF;
            a2.d = GameEngine.getGameEngine().netEngine.loaclTick;
            a.add(a2);
        }
        return a2;
    }

    public static void a(am amVar, b bVar) {
        if (!GameEngine.getGameEngine().netEngine.B) {
            return;
        }
        ao a2 = a(amVar);
        a2.b += bVar.f;
        a2.c = bVar.c(a2.c);
        if (!bVar.k.c()) {
            a2.e = f.b(a2.e, bVar.k);
        }
    }

    public static void b(am amVar, b bVar) {
        if (!GameEngine.getGameEngine().netEngine.B) {
            return;
        }
        ao a2 = a(amVar);
        a2.b -= bVar.f;
        a2.c = bVar.c(a2.c);
        if (!bVar.k.c()) {
            a2.e = f.a(a2.e, bVar.k);
        }
        if (a.a > 0) {
        }
    }

    public static boolean c(am amVar, b bVar) {
        ao a2 = a(amVar.eh);
        if (a2 != null) {
            b.bX = amVar.bX;
            b.cE = a2.b;
            b.cF = a2.c;
            f df = b.df();
            b.a(a2.e);
            boolean b2 = bVar.b(b);
            b.a(df);
            return b2;
        }
        return bVar.b(amVar);
    }

    public static boolean a(LogicBoolean logicBoolean, y yVar) {
        ao a2 = a(yVar.eh);
        if (a2 != null) {
            int i = yVar.cE;
            int i2 = yVar.cF;
            yVar.cE = a2.b;
            yVar.cF = a2.c;
            boolean read = logicBoolean.read(yVar);
            yVar.cE = i;
            yVar.cF = i2;
            return read;
        }
        return logicBoolean.read(yVar);
    }

    public static void a() {
        if (a.a > 0) {
            GameEngine.m5e("LagHiding: clearing: " + a.a);
        }
        a.clear();
    }

    public static void a(y yVar, s sVar) {
        if (a.size() == 0) {
            return;
        }
        int i = GameEngine.getGameEngine().netEngine.loaclTick;
        for (int size = a.size() - 1; size >= 0; size--) {
            ao aoVar = (ao) a.get(size);
            if (aoVar.a == yVar.eh) {
                a.remove(size);
                return;
            } else if (aoVar.d < i + 80) {
                a.remove(size);
                return;
            }
        }
    }
}
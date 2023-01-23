package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/an.class */
public class an {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.utility.m f502a = new com.corrodinggames.rts.gameFramework.utility.m();
    static final x b = new x();

    public static ao a(long j) {
        Object[] a2 = f502a.a();
        for (int i = f502a.f689a - 1; i >= 0; i--) {
            ao aoVar = (ao) a2[i];
            if (aoVar.f503a == j) {
                return aoVar;
            }
        }
        return null;
    }

    public static ao a(com.corrodinggames.rts.game.units.am amVar) {
        ao a2 = a(amVar.eh);
        if (a2 == null) {
            a2 = new ao();
            a2.f503a = amVar.eh;
            a2.b = amVar.cE;
            a2.c = amVar.cF;
            a2.d = GameEngine.getGameEngine().bX.loaclTick;
            f502a.add(a2);
        }
        return a2;
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.custom.d.b bVar) {
        if (!GameEngine.getGameEngine().bX.B) {
            return;
        }
        ao a2 = a(amVar);
        a2.b += bVar.f;
        a2.c = bVar.c(a2.c);
        if (!bVar.k.c()) {
            a2.e = com.corrodinggames.rts.game.units.custom.e.f.b(a2.e, bVar.k);
        }
    }

    public static void b(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.custom.d.b bVar) {
        if (!GameEngine.getGameEngine().bX.B) {
            return;
        }
        ao a2 = a(amVar);
        a2.b -= bVar.f;
        a2.c = bVar.c(a2.c);
        if (!bVar.k.c()) {
            a2.e = com.corrodinggames.rts.game.units.custom.e.f.a(a2.e, bVar.k);
        }
        if (f502a.f689a > 0) {
        }
    }

    public static boolean c(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.custom.d.b bVar) {
        ao a2 = a(amVar.eh);
        if (a2 != null) {
            b.bX = amVar.bX;
            b.cE = a2.b;
            b.cF = a2.c;
            com.corrodinggames.rts.game.units.custom.e.f df = b.df();
            b.a(a2.e);
            boolean b2 = bVar.b(b);
            b.a(df);
            return b2;
        }
        return bVar.b(amVar);
    }

    public static boolean a(LogicBoolean logicBoolean, com.corrodinggames.rts.game.units.y yVar) {
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
        if (f502a.f689a > 0) {
            GameEngine.m328e("LagHiding: clearing: " + f502a.f689a);
        }
        f502a.clear();
    }

    public static void a(com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.game.units.a.s sVar) {
        if (f502a.size() == 0) {
            return;
        }
        int i = GameEngine.getGameEngine().bX.loaclTick;
        for (int size = f502a.size() - 1; size >= 0; size--) {
            ao aoVar = (ao) f502a.get(size);
            if (aoVar.f503a == yVar.eh) {
                f502a.remove(size);
                return;
            } else if (aoVar.d < i + 80) {
                f502a.remove(size);
                return;
            }
        }
    }
}
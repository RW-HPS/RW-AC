package com.corrodinggames.rts.gameFramework.f;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/c.class */
public class c {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.game.units.am f508a;
    com.corrodinggames.rts.game.units.a.s b;
    float c;
    boolean d;
    boolean e;
    static com.corrodinggames.rts.gameFramework.utility.m f = new com.corrodinggames.rts.gameFramework.utility.m();

    c() {
    }

    public static void a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.a.s sVar, boolean z, boolean z2) {
        c a2 = a(amVar, sVar, z2);
        if (a2 == null) {
            a2 = new c();
            f.add(a2);
        }
        a2.f508a = amVar;
        a2.b = sVar;
        a2.c = 10.0f;
        a2.d = z;
        a2.e = z2;
    }

    public static c a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        Iterator it = f.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f508a == amVar && cVar.b == sVar && cVar.e == z) {
                return cVar;
            }
        }
        return null;
    }

    public static float b(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        c a2 = a(amVar, sVar, z);
        if (a2 != null) {
            float f2 = a2.c / 10.0f;
            if (a2.d) {
                f2 = -f2;
            }
            return f2;
        }
        return 0.0f;
    }

    public static void a(float f2) {
        for (int size = f.size() - 1; size >= 0; size--) {
            c cVar = (c) f.get(size);
            cVar.c -= f2;
            if (cVar.c <= 0.0f) {
                f.remove(size);
            }
        }
    }
}
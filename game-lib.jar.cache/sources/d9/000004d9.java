package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/c.class */
class c {
    am a;
    s b;
    float c;
    boolean d;
    boolean e;
    static m f = new m();

    c() {
    }

    public static void a(am amVar, s sVar, boolean z, boolean z2) {
        c a = a(amVar, sVar, z2);
        if (a == null) {
            a = new c();
            f.add(a);
        }
        a.a = amVar;
        a.b = sVar;
        a.c = 10.0f;
        a.d = z;
        a.e = z2;
    }

    public static c a(am amVar, s sVar, boolean z) {
        Iterator it = f.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a == amVar && cVar.b == sVar && cVar.e == z) {
                return cVar;
            }
        }
        return null;
    }

    public static float b(am amVar, s sVar, boolean z) {
        c a = a(amVar, sVar, z);
        if (a != null) {
            float f2 = a.c / 10.0f;
            if (a.d) {
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
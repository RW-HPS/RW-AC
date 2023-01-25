package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/c.class */
class C0819c {

    /* renamed from: a */
    AbstractC0244am f5226a;

    /* renamed from: b */
    AbstractC0224s f5227b;

    /* renamed from: c */
    float f5228c;

    /* renamed from: d */
    boolean f5229d;

    /* renamed from: e */
    boolean f5230e;

    /* renamed from: f */
    static C1136m f5231f = new C1136m();

    C0819c() {
    }

    /* renamed from: a */
    public static void m1929a(AbstractC0244am abstractC0244am, AbstractC0224s abstractC0224s, boolean z, boolean z2) {
        C0819c m1930a = m1930a(abstractC0244am, abstractC0224s, z2);
        if (m1930a == null) {
            m1930a = new C0819c();
            f5231f.add(m1930a);
        }
        m1930a.f5226a = abstractC0244am;
        m1930a.f5227b = abstractC0224s;
        m1930a.f5228c = 10.0f;
        m1930a.f5229d = z;
        m1930a.f5230e = z2;
    }

    /* renamed from: a */
    public static C0819c m1930a(AbstractC0244am abstractC0244am, AbstractC0224s abstractC0224s, boolean z) {
        Iterator it = f5231f.iterator();
        while (it.hasNext()) {
            C0819c c0819c = (C0819c) it.next();
            if (c0819c.f5226a == abstractC0244am && c0819c.f5227b == abstractC0224s && c0819c.f5230e == z) {
                return c0819c;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static float m1928b(AbstractC0244am abstractC0244am, AbstractC0224s abstractC0224s, boolean z) {
        C0819c m1930a = m1930a(abstractC0244am, abstractC0224s, z);
        if (m1930a != null) {
            float f = m1930a.f5228c / 10.0f;
            if (m1930a.f5229d) {
                f = -f;
            }
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m1931a(float f) {
        for (int size = f5231f.size() - 1; size >= 0; size--) {
            C0819c c0819c = (C0819c) f5231f.get(size);
            c0819c.f5228c -= f;
            if (c0819c.f5228c <= 0.0f) {
                f5231f.remove(size);
            }
        }
    }
}
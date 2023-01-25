package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/e.class */
public class C0425e {

    /* renamed from: a */
    C0421a f2706a;

    /* renamed from: b */
    C1136m f2707b = new C1136m();

    public C0425e(C0421a c0421a) {
        this.f2706a = c0421a;
    }

    /* renamed from: a */
    public C0424d m3855a(AbstractC0244am abstractC0244am) {
        int i = this.f2707b.f7109a;
        Object[] m535a = this.f2707b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0424d c0424d = (C0424d) m535a[i2];
            if (c0424d.f2702a == abstractC0244am) {
                return c0424d;
            }
        }
        return null;
    }
}
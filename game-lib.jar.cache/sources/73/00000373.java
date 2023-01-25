package com.corrodinggames.rts.game.units.custom;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/o.class */
public class C0462o {

    /* renamed from: a */
    String f3359a;

    /* renamed from: b */
    C0446f f3360b;

    /* renamed from: c */
    final /* synthetic */ C0458l f3361c;

    public C0462o(C0458l c0458l) {
        this.f3361c = c0458l;
    }

    /* renamed from: a */
    public void m3481a() {
        if (this.f3359a != null && m3480b() == null) {
            throw new RuntimeException("Failed to find animation:" + this.f3359a);
        }
    }

    /* renamed from: b */
    public C0446f m3480b() {
        if (this.f3359a == null) {
            return null;
        }
        if (this.f3360b != null) {
            return this.f3360b;
        }
        Iterator it = this.f3361c.f3282dr.iterator();
        while (it.hasNext()) {
            C0446f c0446f = (C0446f) it.next();
            if (c0446f.f2833a.equalsIgnoreCase(this.f3359a)) {
                this.f3360b = c0446f;
                return c0446f;
            }
        }
        return null;
    }
}
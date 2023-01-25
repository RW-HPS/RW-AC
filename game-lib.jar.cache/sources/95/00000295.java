package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/i.class */
public class C0455i {

    /* renamed from: a */
    public C1136m f2867a = new C1136m();

    public C0455i() {
    }

    public C0455i(C0454h c0454h) {
        if (c0454h == null) {
            return;
        }
        for (C0453g c0453g : c0454h.f2866a) {
            this.f2867a.add(c0453g);
        }
    }

    /* renamed from: a */
    public boolean m3671a(C0454h c0454h) {
        if (c0454h == null) {
            return false;
        }
        boolean z = false;
        for (C0453g c0453g : c0454h.f2866a) {
            if (m3672a(c0453g)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m3672a(C0453g c0453g) {
        if (!this.f2867a.contains(c0453g)) {
            this.f2867a.add(c0453g);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m3670b(C0454h c0454h) {
        if (c0454h == null) {
            return false;
        }
        boolean z = false;
        for (C0453g c0453g : c0454h.f2866a) {
            if (this.f2867a.remove(c0453g)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C0454h m3673a() {
        if (this.f2867a.size() == 0) {
            return C0453g.f2865d;
        }
        return new C0454h((C0453g[]) this.f2867a.toArray(C0453g.f2864c));
    }
}
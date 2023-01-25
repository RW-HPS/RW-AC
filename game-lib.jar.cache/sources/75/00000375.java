package com.corrodinggames.rts.game.units.custom;

import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.game.units.custom.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/q.class */
class C0464q implements Comparator {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int mo3479a(C0458l c0458l, C0458l c0458l2) {
        if (c0458l.f2952M == null || c0458l2.f2952M == null) {
            return 0;
        }
        return c0458l.f2952M.compareTo(c0458l2.f2952M);
    }
}
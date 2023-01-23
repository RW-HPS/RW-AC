package com.corrodinggames.rts.game.units.custom.c;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.m;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/e.class */
public class e {

    /* renamed from: a  reason: collision with root package name */
    a f285a;
    m b = new m();

    public e(a aVar) {
        this.f285a = aVar;
    }

    public d a(am amVar) {
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            d dVar = (d) a2[i2];
            if (dVar.f284a == amVar) {
                return dVar;
            }
        }
        return null;
    }
}
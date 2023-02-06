package com.corrodinggames.rts.game.units.custom.c;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.m;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/e.class */
public class e {
    a a;
    m b = new m();

    public e(a aVar) {
        this.a = aVar;
    }

    public d a(am amVar) {
        int i = this.b.a;
        Object[] a = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            d dVar = (d) a[i2];
            if (dVar.a == amVar) {
                return dVar;
            }
        }
        return null;
    }
}
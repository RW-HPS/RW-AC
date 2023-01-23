package com.corrodinggames.rts.game.units.custom.d;

import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a.class */
public abstract class a {
    public abstract void a(am amVar);

    public abstract boolean b(am amVar);

    public abstract void a(am amVar, double d);

    public abstract boolean b(am amVar, double d);

    public boolean c(am amVar) {
        if (b(amVar)) {
            a(amVar);
            return true;
        }
        return false;
    }

    public boolean c(am amVar, double d) {
        if (b(amVar, d)) {
            a(amVar, d);
            return true;
        }
        return false;
    }
}
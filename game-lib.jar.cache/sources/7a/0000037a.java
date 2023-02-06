package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/v.class */
public class v {
    String a;
    String b;
    String c;
    com.corrodinggames.rts.game.units.as d;
    boolean e;
    public boolean f;

    public void a() {
        if (!this.e) {
            this.d = l.s(this.c);
            if (this.d == null) {
                GameEngine.m5e("AllUnitTypes: " + l.E());
                if (this.f) {
                    throw new bo("Could not find unit type:" + this.c + " used on:" + this.a + " in section:" + this.b + " (Note: Prefix with 'unitref' if not using a unit type here)");
                }
                throw new bo("Could not find unit type:" + this.c + " used on:" + this.a + " in section:" + this.b);
            }
        }
    }

    public void b() {
    }

    public com.corrodinggames.rts.game.units.as c() {
        return this.d;
    }

    public String d() {
        if (this.e) {
            if (this.d != null) {
                return this.d.i();
            }
            return "(Error: known type is null)";
        }
        return this.c;
    }
}
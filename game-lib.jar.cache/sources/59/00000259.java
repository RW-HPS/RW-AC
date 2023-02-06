package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.t;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/g.class */
public class g extends t {
    String a;
    com.corrodinggames.rts.gameFramework.utility.m b = new com.corrodinggames.rts.gameFramework.utility.m();

    public g(String str) {
        this.a = str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.t
    public void a(com.corrodinggames.rts.game.units.custom.l lVar) {
        d c;
        if (this.a != null) {
            for (String str : this.a.split(",")) {
                String trim = str.trim();
                c = c.c(lVar, trim);
                if (c == null) {
                    throw new bo("Failed to find decal: " + trim);
                }
                this.b.add(c);
            }
            this.a = null;
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.j jVar, float f, float f2) {
        c.i.setSite(f, f2);
        c.a(jVar, 0.0f, f.inactive, this.b, c.i);
    }
}
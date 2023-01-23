package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.t;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/g.class */
public class g extends t {

    /* renamed from: a  reason: collision with root package name */
    String f258a;
    com.corrodinggames.rts.gameFramework.utility.m b = new com.corrodinggames.rts.gameFramework.utility.m();

    public g(String str) {
        this.f258a = str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.t
    public void a(com.corrodinggames.rts.game.units.custom.l lVar) {
        if (this.f258a != null) {
            for (String str : this.f258a.split(",")) {
                String trim = str.trim();
                d b = c.b(lVar, trim);
                if (b == null) {
                    throw new bo("Failed to find decal: " + trim);
                }
                this.b.add(b);
            }
            this.f258a = null;
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.j jVar, float f, float f2) {
        c.i.setSite(f, f2);
        c.a(jVar, 0.0f, f.inactive, this.b, c.i);
    }
}
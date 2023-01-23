package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.units.d.r;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/b.class */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f253a = new b();

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        jVar.u += f;
        if (jVar.u > 40.0f && jVar.aq()) {
            jVar.u = 0.0f;
            r.a((y) jVar, f, 0.0f, false);
        }
    }
}
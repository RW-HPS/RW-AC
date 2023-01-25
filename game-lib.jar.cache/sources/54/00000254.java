package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.p024d.C0515r;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/b.class */
public class C0390b extends AbstractC0389a {

    /* renamed from: a */
    public static final AbstractC0389a f2294a = new C0390b();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        c0456j.f2888u += f;
        if (c0456j.f2888u > 40.0f && c0456j.m2944aq()) {
            c0456j.f2888u = 0.0f;
            C0515r.m3306a((AbstractC0629y) c0456j, f, 0.0f, false);
        }
    }
}
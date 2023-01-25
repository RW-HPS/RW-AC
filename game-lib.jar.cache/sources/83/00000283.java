package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0404bb;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/d.class */
public class C0437d extends AbstractC0434a {
    public C0437d() {
        this.f2777u = true;
        this.f2776t = true;
        this.f2760b = "energy";
        this.f2761c = C0404bb.m3912a("energy");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: a */
    public double mo3763a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1644cB;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: a */
    public void mo3762a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1644cB = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: b */
    public void mo3761b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1644cB = (float) (abstractC0244am.f1644cB + d);
    }
}
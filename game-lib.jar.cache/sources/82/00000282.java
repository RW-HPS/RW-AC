package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0440b;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/c.class */
public class C0436c extends AbstractC0434a {
    public C0436c() {
        this.f2777u = true;
        this.f2776t = true;
        this.f2760b = "credits";
        this.f2761c = C0404bb.m3912a("$");
        this.f2772o = true;
        this.f2792q = EnumC0440b.space;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: a */
    public double mo3763a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1614bX.credits;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: a */
    public void mo3762a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1614bX.credits = d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: b */
    public void mo3761b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1614bX.credits += d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0433a
    /* renamed from: a */
    public String mo3764a(boolean z) {
        return "$";
    }
}
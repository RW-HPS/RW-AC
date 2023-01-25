package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aw.class */
public abstract class AbstractC0384aw extends AbstractC0381at {
    /* renamed from: a */
    public abstract double mo3965a(C0361as c0361as);

    /* renamed from: a */
    public abstract void mo3964a(C0361as c0361as, double d);

    public AbstractC0384aw(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381at
    /* renamed from: a */
    public double mo3961a(C0456j c0456j, C0361as c0361as) {
        return mo3965a(c0361as);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381at
    /* renamed from: a */
    public void mo3962a(C0456j c0456j, double d) {
        c0456j.m3601dJ();
        mo3964a(c0456j.f2892y, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381at
    /* renamed from: b */
    public boolean mo3960b() {
        return false;
    }
}
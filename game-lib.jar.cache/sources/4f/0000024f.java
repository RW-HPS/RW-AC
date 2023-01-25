package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.ax */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ax.class */
public abstract class AbstractC0385ax extends AbstractC0381at {
    /* renamed from: a */
    public abstract double mo3963a(C0456j c0456j);

    /* renamed from: b */
    public abstract void mo3959b(C0456j c0456j, double d);

    public AbstractC0385ax(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381at
    /* renamed from: a */
    public double mo3961a(C0456j c0456j, C0361as c0361as) {
        return mo3963a(c0456j);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381at
    /* renamed from: a */
    public void mo3962a(C0456j c0456j, double d) {
        c0456j.m3601dJ();
        mo3959b(c0456j, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381at
    /* renamed from: b */
    public boolean mo3960b() {
        return true;
    }
}
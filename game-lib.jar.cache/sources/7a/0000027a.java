package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a.class */
public abstract class AbstractC0428a {
    /* renamed from: a */
    public abstract void mo3806a(AbstractC0244am abstractC0244am);

    /* renamed from: b */
    public abstract boolean mo3800b(AbstractC0244am abstractC0244am);

    /* renamed from: a */
    public abstract void mo3805a(AbstractC0244am abstractC0244am, double d);

    /* renamed from: b */
    public abstract boolean mo3799b(AbstractC0244am abstractC0244am, double d);

    /* renamed from: c */
    public boolean m3854c(AbstractC0244am abstractC0244am) {
        if (mo3800b(abstractC0244am)) {
            mo3806a(abstractC0244am);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m3853c(AbstractC0244am abstractC0244am, double d) {
        if (mo3799b(abstractC0244am, d)) {
            mo3805a(abstractC0244am, d);
            return true;
        }
        return false;
    }
}
package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/h.class */
public abstract class AbstractC0530h extends AbstractC0534j {

    /* renamed from: l */
    float f3664l;

    /* renamed from: m */
    public static C0970e f3665m = null;

    /* renamed from: n */
    public static C0970e[] f3666n = new C0970e[10];

    public AbstractC0530h(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        if (mo3267dd()) {
            return AbstractC0534j.f3682dO[this.f1614bX.m4454R()];
        }
        return f3666n[this.f1614bX.m4454R()];
    }

    /* renamed from: K */
    public static void m3257K() {
        f3665m = GameEngine.getGameEngine().f6326bO.mo222a(C0067R.drawable.unit_icon_hover);
        f3666n = PlayerData.m4432a(f3665m);
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1713f;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (m4226bT() && !this.f1612bV && m4215cK()) {
            if (this.f1622cf > 0.0f) {
                this.f3664l += f;
            }
            if (this.f3664l > 10.0f) {
                this.f3664l = 0.0f;
                if (mo2829s_()) {
                    C0760e m2365b = GameEngine.getGameEngine().f6329bR.m2365b(this.f7172eo + (C0773f.m2107k(this.f1623cg) * 4.0f), this.f7173ep + (C0773f.m2110j(this.f1623cg) * 4.0f), 0.0f, EnumC0759d.custom, false, EnumC0763h.low);
                    if (m2365b != null) {
                        m2365b.f4849aq = 0;
                        m2365b.f4848ap = 13;
                        m2365b.f4873ar = (short) 1;
                        m2365b.f4806r = true;
                        m2365b.f4814E = 0.8f;
                        m2365b.f4832W = 80.0f;
                        m2365b.f4831V = 80.0f;
                        m2365b.f4825P = (-C0773f.m2107k(this.f1623cg)) * 0.1f;
                        m2365b.f4826Q = (-C0773f.m2110j(this.f1623cg)) * 0.1f;
                        m2365b.f4833Y = C0773f.m2151c(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
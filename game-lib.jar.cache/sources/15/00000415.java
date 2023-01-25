package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;

/* renamed from: com.corrodinggames.rts.game.units.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/t.class */
public class C0624t extends AbstractC0628x {
    /* renamed from: a */
    public static C0624t m3081a(PlayerData playerData) {
        C0624t c0624t = new C0624t(true);
        c0624t.mo2928b(playerData);
        c0624t.f1612bV = true;
        return c0624t;
    }

    C0624t(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: r */
    public InterfaceC0303as mo5458r() {
        return EnumC0249ar.f1791Z;
    }

    /* renamed from: b */
    public static void m3080b() {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public String mo3079c() {
        String str = mo5458r().mo3513i() + "(pos:" + ((int) this.f7172eo) + "," + ((int) this.f7173ep);
        if (this.f1614bX != null) {
            str = str + " t:" + this.f1614bX.site;
        }
        return str + ")";
    }
}
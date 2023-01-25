package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.translations.C0855a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/at.class */
class C0816at extends C0814ar {
    public C0816at(float f, float f2, InterfaceC0303as interfaceC0303as) {
        super(f, f2, interfaceC0303as);
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0814ar, com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: a */
    public String mo1937a() {
        if (this.f5222g == null) {
            this.f5222g = String.format(C0855a.m1714a("gui.log.upgradeCompleted", new Object[0]), this.f5215a.mo3521e(), Integer.valueOf(this.f5216b));
        }
        return this.f5222g;
    }
}
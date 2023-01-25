package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.translations.C0855a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ar.class */
class C0814ar extends AbstractC0817au {

    /* renamed from: a */
    InterfaceC0303as f5215a;

    /* renamed from: b */
    int f5216b;

    public C0814ar(float f, float f2, InterfaceC0303as interfaceC0303as) {
        super(f, f2);
        this.f5215a = interfaceC0303as;
        this.f5216b = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: a */
    public boolean mo1936a(AbstractC0817au abstractC0817au) {
        return super.mo1936a(abstractC0817au) && (abstractC0817au instanceof C0814ar) && ((C0814ar) abstractC0817au).f5215a == this.f5215a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: b */
    public void mo1934b(AbstractC0817au abstractC0817au) {
        this.f5218c = abstractC0817au.f5218c;
        this.f5216b++;
        this.f5222g = null;
        this.f5223h = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: a */
    public String mo1937a() {
        if (this.f5222g == null) {
            String str = "gui.log.unitCreated";
            if (this.f5215a.mo3511j()) {
                str = "gui.log.buildingConstructed";
            }
            this.f5222g = String.format(C0855a.m1714a(str, new Object[0]), this.f5215a.mo3521e(), Integer.valueOf(this.f5216b));
        }
        return this.f5222g;
    }
}
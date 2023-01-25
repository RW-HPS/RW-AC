package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.translations.C0855a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/as.class */
class C0815as extends AbstractC0817au {

    /* renamed from: a */
    private boolean f5217a;

    public C0815as(float f, float f2, boolean z) {
        super(f, f2);
        this.f5217a = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: a */
    public boolean mo1936a(AbstractC0817au abstractC0817au) {
        return super.mo1936a(abstractC0817au) && (abstractC0817au instanceof C0815as) && ((C0815as) abstractC0817au).f5217a == this.f5217a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: b */
    public void mo1934b(AbstractC0817au abstractC0817au) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: b */
    protected long mo1935b() {
        return 20000L;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0817au
    /* renamed from: a */
    public String mo1937a() {
        if (this.f5222g == null) {
            if (this.f5217a) {
                this.f5222g = C0855a.m1714a("gui.log.baseDamaged", new Object[0]);
            } else {
                this.f5222g = C0855a.m1714a("gui.log.unitDamaged", new Object[0]);
            }
        }
        return this.f5222g;
    }
}
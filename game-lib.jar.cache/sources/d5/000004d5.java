package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.gameFramework.translations.a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/as.class */
class as extends au {
    private boolean a;

    public as(float f, float f2, boolean z) {
        super(f, f2);
        this.a = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public boolean a(au auVar) {
        return super.a(auVar) && (auVar instanceof as) && ((as) auVar).a == this.a;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public void b(au auVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    protected long b() {
        return 20000L;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public String a() {
        if (this.g == null) {
            if (this.a) {
                this.g = a.a("gui.log.baseDamaged", new Object[0]);
            } else {
                this.g = a.a("gui.log.unitDamaged", new Object[0]);
            }
        }
        return this.g;
    }
}
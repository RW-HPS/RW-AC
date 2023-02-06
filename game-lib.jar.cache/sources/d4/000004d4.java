package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.translations.a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ar.class */
class ar extends au {
    as a;
    int b;

    public ar(float f, float f2, as asVar) {
        super(f, f2);
        this.a = asVar;
        this.b = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public boolean a(au auVar) {
        return super.a(auVar) && (auVar instanceof ar) && ((ar) auVar).a == this.a;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public void b(au auVar) {
        this.c = auVar.c;
        this.b++;
        this.g = null;
        this.h = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public String a() {
        if (this.g == null) {
            String str = "gui.log.unitCreated";
            if (this.a.j()) {
                str = "gui.log.buildingConstructed";
            }
            this.g = String.format(a.a(str, new Object[0]), this.a.e(), Integer.valueOf(this.b));
        }
        return this.g;
    }
}
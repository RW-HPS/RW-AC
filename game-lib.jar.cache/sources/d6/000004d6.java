package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.translations.a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/at.class */
class at extends ar {
    public at(float f, float f2, as asVar) {
        super(f, f2, asVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.ar, com.corrodinggames.rts.gameFramework.Interface.au
    public String a() {
        if (this.g == null) {
            this.g = String.format(a.a("gui.log.upgradeCompleted", new Object[0]), this.a.e(), Integer.valueOf(this.b));
        }
        return this.g;
    }
}
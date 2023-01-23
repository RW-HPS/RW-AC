package com.corrodinggames.rts.gameFramework.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/at.class */
public class at extends ar {
    public at(float f, float f2, com.corrodinggames.rts.game.units.as asVar) {
        super(f, f2, asVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.f.ar, com.corrodinggames.rts.gameFramework.f.au
    public String a() {
        if (this.g == null) {
            this.g = String.format(com.corrodinggames.rts.gameFramework.h.a.a("gui.log.upgradeCompleted", new Object[0]), this.f505a.e(), Integer.valueOf(this.b));
        }
        return this.g;
    }
}
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/t.class */
public class t extends x {
    public static t a(PlayerData playerData) {
        t tVar = new t(true);
        tVar.b(playerData);
        tVar.bV = true;
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public as r() {
        return ar.dummyNonUnitWithTeam;
    }

    public static void b() {
    }

    @Override // com.corrodinggames.rts.game.units.am
    public String c() {
        String str = r().i() + "(pos:" + ((int) this.eo) + "," + ((int) this.ep);
        if (this.bX != null) {
            str = str + " t:" + this.bX.k;
        }
        return str + ")";
    }
}
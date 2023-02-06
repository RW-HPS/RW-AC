package com.corrodinggames.rts.game.units.f;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/i.class */
public abstract class i extends j {
    public abstract int excludeTeam(y yVar);

    public abstract PlayerData onlyEnemiesOfTeam(y yVar);

    public PlayerData onlyTeam(y yVar) {
        return null;
    }

    public void setup(y yVar, float f) {
    }

    public am getResult() {
        return null;
    }
}
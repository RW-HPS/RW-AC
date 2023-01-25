package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;

/* renamed from: com.corrodinggames.rts.game.units.f.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/i.class */
public abstract class AbstractC0549i extends AbstractC0550j {
    public abstract int excludeTeam(AbstractC0629y abstractC0629y);

    public abstract PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y);

    public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    public void setup(AbstractC0629y abstractC0629y, float f) {
    }

    public AbstractC0244am getResult() {
        return null;
    }
}
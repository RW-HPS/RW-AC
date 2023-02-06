package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.a.b;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.j;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanActionFilter.class */
public class LogicBooleanActionFilter extends b {
    LogicBoolean logicBoolean;
    j target;

    public LogicBooleanActionFilter(LogicBoolean logicBoolean, j jVar) {
        this.logicBoolean = logicBoolean;
    }

    @Override // com.corrodinggames.rts.game.units.a.b
    public boolean isAvailable(s sVar, am amVar) {
        return this.logicBoolean.read(this.target);
    }
}
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/al.class */
public class al extends aq {
    al(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.ak
    String a(com.corrodinggames.rts.game.units.y yVar) {
        return LogicString.arrayToString(yVar, this.a);
    }
}
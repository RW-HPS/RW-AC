package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/am.class */
public class am extends aq {
    am(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.ak
    String a(com.corrodinggames.rts.game.units.y yVar) {
        return this.a.read(yVar) ? "true" : "false";
    }
}
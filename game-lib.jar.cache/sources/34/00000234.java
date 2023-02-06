package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ap.class */
public class ap extends aq {
    ap(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.ak
    String a(com.corrodinggames.rts.game.units.y yVar) {
        return com.corrodinggames.rts.game.units.am.f(this.a.readUnit(yVar), false);
    }
}
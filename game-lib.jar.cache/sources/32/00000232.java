package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/an.class */
public class an extends aq {
    an(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.ak
    String a(com.corrodinggames.rts.game.units.y yVar) {
        return com.corrodinggames.rts.gameFramework.f.g(this.a.readNumber(yVar));
    }
}
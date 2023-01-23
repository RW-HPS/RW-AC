package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/al.class */
public class al extends aq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public al(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.custom.ak
    public String a(com.corrodinggames.rts.game.units.y yVar) {
        return LogicString.arrayToString(yVar, this.f246a);
    }
}
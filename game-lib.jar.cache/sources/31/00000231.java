package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/am.class */
public class am extends aq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public am(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.custom.ak
    public String a(com.corrodinggames.rts.game.units.y yVar) {
        return this.f246a.read(yVar) ? "true" : "false";
    }
}
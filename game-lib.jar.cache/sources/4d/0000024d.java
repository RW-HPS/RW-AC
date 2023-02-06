package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/av.class */
public class av extends VariableScope.CachedWriter.WriterElement {
    public at a;
    public LogicBoolean b;
    public VariableScope.CachedWriter.Operator c;

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
    public void writeToUnit(com.corrodinggames.rts.game.units.y yVar) {
        if (!(yVar instanceof j)) {
            GameEngine.n("Cannot change data on non custom unit:" + com.corrodinggames.rts.game.units.am.A(yVar));
            return;
        }
        this.a.a((j) yVar, this.b, this.c);
    }
}
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* renamed from: com.corrodinggames.rts.game.units.custom.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/am.class */
public class C0355am extends AbstractC0359aq {
    C0355am(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0353ak
    /* renamed from: a */
    String mo3979a(AbstractC0629y abstractC0629y) {
        return this.f2252a.read(abstractC0629y) ? "true" : "false";
    }
}
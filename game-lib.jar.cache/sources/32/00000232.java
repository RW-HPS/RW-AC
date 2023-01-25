package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.custom.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/an.class */
public class C0356an extends AbstractC0359aq {
    C0356an(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0353ak
    /* renamed from: a */
    String mo3979a(AbstractC0629y abstractC0629y) {
        return C0773f.m2121g(this.f2252a.readNumber(abstractC0629y));
    }
}
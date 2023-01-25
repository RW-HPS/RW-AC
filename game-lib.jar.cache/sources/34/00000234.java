package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* renamed from: com.corrodinggames.rts.game.units.custom.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ap.class */
public class C0358ap extends AbstractC0359aq {
    C0358ap(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0353ak
    /* renamed from: a */
    String mo3979a(AbstractC0629y abstractC0629y) {
        return AbstractC0244am.m4197f(this.f2252a.readUnit(abstractC0629y), false);
    }
}
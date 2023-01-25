package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;

/* renamed from: com.corrodinggames.rts.game.units.custom.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/al.class */
public class C0354al extends AbstractC0359aq {
    C0354al(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0353ak
    /* renamed from: a */
    String mo3979a(AbstractC0629y abstractC0629y) {
        return LogicString.arrayToString(abstractC0629y, this.f2252a);
    }
}
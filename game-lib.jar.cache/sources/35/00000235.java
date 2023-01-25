package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* renamed from: com.corrodinggames.rts.game.units.custom.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq.class */
public abstract class AbstractC0359aq extends AbstractC0353ak {

    /* renamed from: a */
    LogicBoolean f2252a;

    AbstractC0359aq(LogicBoolean logicBoolean) {
        this.f2252a = logicBoolean;
    }

    /* renamed from: a */
    static AbstractC0359aq m3980a(LogicBoolean logicBoolean) {
        LogicBoolean.ReturnType returnType = logicBoolean.getReturnType();
        if (returnType == LogicBoolean.ReturnType.number) {
            return new C0356an(logicBoolean);
        }
        if (returnType == LogicBoolean.ReturnType.string) {
            return new C0357ao(logicBoolean);
        }
        if (returnType == LogicBoolean.ReturnType.unit) {
            return new C0358ap(logicBoolean);
        }
        if (LogicBoolean.ReturnType.isArrayType(returnType)) {
            return new C0354al(logicBoolean);
        }
        return new C0355am(logicBoolean);
    }
}
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq.class */
public abstract class aq extends ak {

    /* renamed from: a  reason: collision with root package name */
    LogicBoolean f246a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(LogicBoolean logicBoolean) {
        this.f246a = logicBoolean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aq a(LogicBoolean logicBoolean) {
        LogicBoolean.ReturnType returnType = logicBoolean.getReturnType();
        if (returnType == LogicBoolean.ReturnType.number) {
            return new an(logicBoolean);
        }
        if (returnType == LogicBoolean.ReturnType.string) {
            return new ao(logicBoolean);
        }
        if (returnType == LogicBoolean.ReturnType.unit) {
            return new ap(logicBoolean);
        }
        if (LogicBoolean.ReturnType.isArrayType(returnType)) {
            return new al(logicBoolean);
        }
        return new am(logicBoolean);
    }
}
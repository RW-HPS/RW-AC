package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/at.class */
public abstract class AbstractC0381at {

    /* renamed from: a */
    int f2274a;

    /* renamed from: b */
    String f2275b;

    /* renamed from: a */
    public abstract double mo3961a(C0456j c0456j, C0361as c0361as);

    /* renamed from: a */
    public abstract void mo3962a(C0456j c0456j, double d);

    /* renamed from: b */
    public abstract boolean mo3960b();

    public AbstractC0381at(int i, String str) {
        this.f2274a = i;
        this.f2275b = str.toLowerCase(Locale.ROOT);
    }

    /* renamed from: a */
    public LogicBoolean.ReturnType m3967a() {
        return LogicBoolean.ReturnType.number;
    }

    /* renamed from: a */
    public final void m3966a(C0456j c0456j, LogicBoolean logicBoolean, VariableScope.CachedWriter.Operator operator) {
        c0456j.m3601dJ();
        double readNumber = logicBoolean.readNumber(c0456j);
        if (operator == VariableScope.CachedWriter.Operator.set) {
            mo3962a(c0456j, readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.add) {
            mo3962a(c0456j, mo3961a(c0456j, c0456j.f2892y) + readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.subtract) {
            mo3962a(c0456j, mo3961a(c0456j, c0456j.f2892y) - readNumber);
        } else {
            GameEngine.m976n("setUnitDataFromLogic: unsupported operator");
        }
    }
}
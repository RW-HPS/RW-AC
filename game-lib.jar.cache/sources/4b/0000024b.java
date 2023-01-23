package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/at.class */
public abstract class at {

    /* renamed from: a  reason: collision with root package name */
    int f249a;
    String b;

    public abstract double a(j jVar, as asVar);

    public abstract void a(j jVar, double d);

    public abstract boolean b();

    public at(int i, String str) {
        this.f249a = i;
        this.b = str.toLowerCase(Locale.ROOT);
    }

    public LogicBoolean.ReturnType a() {
        return LogicBoolean.ReturnType.number;
    }

    public final void a(j jVar, LogicBoolean logicBoolean, VariableScope.CachedWriter.Operator operator) {
        jVar.dJ();
        double readNumber = logicBoolean.readNumber(jVar);
        if (operator == VariableScope.CachedWriter.Operator.set) {
            a(jVar, readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.add) {
            a(jVar, a(jVar, jVar.y) + readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.subtract) {
            a(jVar, a(jVar, jVar.y) - readNumber);
        } else {
            GameEngine.n("setUnitDataFromLogic: unsupported operator");
        }
    }
}
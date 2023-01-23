package com.corrodinggames.rts.game.units.custom.d;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/d.class */
class d {

    /* renamed from: a  reason: collision with root package name */
    public final com.corrodinggames.rts.game.units.custom.e.a f290a;
    public double b;
    public LogicBoolean c;

    public d(com.corrodinggames.rts.game.units.custom.e.a aVar, LogicBoolean logicBoolean) {
        this.f290a = aVar;
        if (this.c instanceof LogicBoolean.StaticValueBoolean) {
            this.b = ((LogicBoolean.StaticValueBoolean) this.c).getStaticValue();
        } else {
            this.c = logicBoolean;
        }
    }
}
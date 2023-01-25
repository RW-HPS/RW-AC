package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/d.class */
class C0431d {

    /* renamed from: a */
    public final C0433a f2742a;

    /* renamed from: b */
    public double f2743b;

    /* renamed from: c */
    public LogicBoolean f2744c;

    public C0431d(C0433a c0433a, LogicBoolean logicBoolean) {
        this.f2742a = c0433a;
        if (this.f2744c instanceof LogicBoolean.StaticValueBoolean) {
            this.f2743b = ((LogicBoolean.StaticValueBoolean) this.f2744c).getStaticValue();
        } else {
            this.f2744c = logicBoolean;
        }
    }
}
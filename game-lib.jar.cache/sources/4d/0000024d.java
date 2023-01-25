package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.custom.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/av.class */
public class C0383av extends VariableScope.CachedWriter.WriterElement {

    /* renamed from: a */
    public AbstractC0381at f2277a;

    /* renamed from: b */
    public LogicBoolean f2278b;

    /* renamed from: c */
    public VariableScope.CachedWriter.Operator f2279c;

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
    public void writeToUnit(AbstractC0629y abstractC0629y) {
        if (!(abstractC0629y instanceof C0456j)) {
            GameEngine.m976n("Cannot change data on non custom unit:" + AbstractC0244am.m4256A(abstractC0629y));
            return;
        }
        this.f2277a.m3966a((C0456j) abstractC0629y, this.f2278b, this.f2279c);
    }
}
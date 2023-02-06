package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/w.class */
public abstract class w extends s {
    public w(int i) {
        super(i);
    }

    public w(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        if (!(amVar instanceof com.corrodinggames.rts.game.units.d.l)) {
            return 99;
        }
        return ((com.corrodinggames.rts.game.units.d.l) amVar).a(N(), z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float p(am amVar) {
        com.corrodinggames.rts.game.units.d.j dw;
        if (!(amVar instanceof com.corrodinggames.rts.game.units.d.l) || (dw = ((com.corrodinggames.rts.game.units.d.l) amVar).dw()) == null || !d(dw.j)) {
            return -1.0f;
        }
        float f = dw.m;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public float K() {
        return 0.01f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.popupQueue;
    }
}
package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/o.class */
public class o extends s {
    public o() {
        super("c_1");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.setRally.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.setRally", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: K */
    public ar i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.setRally;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.rally;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.m.e j() {
        return GameEngine.getGameEngine().bS.bj;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return true;
    }
}
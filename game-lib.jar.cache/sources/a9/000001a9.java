package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/n.class */
public class n extends s {
    public n() {
        super("c_3");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.repairTarget", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.repairTarget", new Object[0]);
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
    public ar mo3i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.repairTarget;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.action;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return true;
    }
}
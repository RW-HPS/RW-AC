package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/f.class */
public class f extends s {
    public f() {
        super("c_8");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: n */
    public ar mo3i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.guardUnit;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.none;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.guardUnit.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.guardUnit", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!InterfaceEngine.bP) {
            return 0.6f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean o_() {
        return true;
    }
}
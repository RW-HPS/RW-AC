package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/b.class */
class b extends com.corrodinggames.rts.game.units.a.w {
    public b() {
        super(a.h.a());
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "-Allows factory to build Tech 2 units";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeT2", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return ar.airFactory.c(2);
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        a aVar = (a) amVar;
        if (aVar.f != 1 || aVar.a(N(), z) > 0) {
            return false;
        }
        return super.a(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: L */
    public ar mo3i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.t f() {
        return com.corrodinggames.rts.game.units.a.t.upgrade;
    }
}
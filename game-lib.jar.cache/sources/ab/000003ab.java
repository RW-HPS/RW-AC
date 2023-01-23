package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/u.class */
public class u extends com.corrodinggames.rts.game.units.a.w {
    public u() {
        super(t.g.a());
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
        return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.upgradeT2", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return ar.seaFactory.c(2);
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        t tVar = (t) amVar;
        if (tVar.r != 1 || tVar.a(N(), z) > 0) {
            return false;
        }
        return super.a(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        if (((t) amVar).r != 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: L */
    public ar i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.t f() {
        return com.corrodinggames.rts.game.units.a.t.upgrade;
    }
}
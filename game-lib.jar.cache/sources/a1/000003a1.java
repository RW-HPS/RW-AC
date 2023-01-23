package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/n.class */
public class n extends com.corrodinggames.rts.game.units.a.w {
    public n() {
        super(m.h.a());
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return com.corrodinggames.rts.gameFramework.h.a.a("units.landFactory.upgrade.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return com.corrodinggames.rts.gameFramework.h.a.a("units.landFactory.upgrade.name", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return ar.landFactory.c(2);
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        m mVar = (m) amVar;
        if (mVar.g || mVar.a(N(), z) > 0) {
            return false;
        }
        return super.a(amVar, z);
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
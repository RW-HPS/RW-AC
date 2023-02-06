package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/m.class */
public class m extends s {
    boolean a;

    public m(boolean z) {
        super("c_2");
        this.a = z;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        if (!this.a) {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.reclaimBuildingTarget.description", new Object[0]);
        }
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.reclaimTarget.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        if (!this.a) {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.reclaimBuildingTarget", new Object[0]);
        }
        return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.reclaimTarget", new Object[0]);
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
        return u.reclaimTarget;
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

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean o(am amVar) {
        if (amVar != null && !this.a) {
            return amVar.bI();
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!InterfaceEngine.bP) {
            return 0.6f;
        }
        return 1.0f;
    }
}
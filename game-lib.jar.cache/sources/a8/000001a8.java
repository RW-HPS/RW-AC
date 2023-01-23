package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/m.class */
public class m extends s {

    /* renamed from: a  reason: collision with root package name */
    boolean f182a;

    public m(boolean z) {
        super("c_2");
        this.f182a = z;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        if (!this.f182a) {
            return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.reclaimBuildingTarget.description", new Object[0]);
        }
        return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.reclaimTarget.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        if (!this.f182a) {
            return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.reclaimBuildingTarget", new Object[0]);
        }
        return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.reclaimTarget", new Object[0]);
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
        if (amVar != null && !this.f182a) {
            return amVar.bI();
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!com.corrodinggames.rts.gameFramework.f.g.bP) {
            return 0.6f;
        }
        return 1.0f;
    }
}
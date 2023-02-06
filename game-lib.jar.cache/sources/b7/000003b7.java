package com.corrodinggames.rts.game.units.e;

import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/h.class */
public abstract class h extends j {
    float l;
    public static com.corrodinggames.rts.gameFramework.unitAction.e m = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] n = new com.corrodinggames.rts.gameFramework.unitAction.e[10];

    public h(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        if (dd()) {
            return j.dO[this.bX.R()];
        }
        return n[this.bX.R()];
    }

    public static void K() {
        m = GameEngine.getGameEngine().bO.a(AssetsID.drawable.unit_icon_hover);
        n = PlayerData.a(m);
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.HOVER;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (bT() && !this.bV && cK()) {
            if (this.cf > 0.0f) {
                this.l += f;
            }
            if (this.l > 10.0f) {
                this.l = 0.0f;
                if (s_()) {
                    com.corrodinggames.rts.gameFramework.emitter.e b = GameEngine.getGameEngine().bR.b(this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * 4.0f), this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * 4.0f), 0.0f, com.corrodinggames.rts.gameFramework.emitter.d.custom, false, com.corrodinggames.rts.gameFramework.emitter.h.low);
                    if (b != null) {
                        b.aq = 0;
                        b.ap = 13;
                        b.ar = (short) 1;
                        b.r = true;
                        b.E = 0.8f;
                        b.W = 80.0f;
                        b.V = 80.0f;
                        b.P = (-com.corrodinggames.rts.gameFramework.f.k(this.cg)) * 0.1f;
                        b.Q = (-com.corrodinggames.rts.gameFramework.f.j(this.cg)) * 0.1f;
                        b.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
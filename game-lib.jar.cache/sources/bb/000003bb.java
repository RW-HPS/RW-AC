package com.corrodinggames.rts.game.units.e;

import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.w;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/j.class */
public abstract class j extends w {
    float dK;
    public static com.corrodinggames.rts.gameFramework.unitAction.e dL = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e dM = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] dN = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] dO = new com.corrodinggames.rts.gameFramework.unitAction.e[10];

    public j(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        if (dd()) {
            return dO[this.bX.R()];
        }
        return dN[this.bX.R()];
    }

    public static void dt() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        dL = gameEngine.bO.a(AssetsID.drawable.unit_icon_land);
        if (dL == null) {
            throw new RuntimeException("IMAGE_ICON is null");
        }
        dN = PlayerData.a(dL);
        dM = gameEngine.bO.a(AssetsID.drawable.unit_icon_land_exp);
        if (dM == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
        }
        dO = PlayerData.a(dM);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.bV) {
            float f2 = 0.0f;
            if (cK()) {
                f2 = -10.0f;
            }
            if (this.eq > f2) {
                if (this.eq > 0.0f && this.dK < 0.4f) {
                    this.dK = 0.4f;
                }
                this.dK += 0.002f * f;
                this.eq -= this.dK * f;
                if (this.eq <= f2) {
                    this.eq = f2;
                }
            }
        }
        if (bT() && !this.bV && !(this instanceof h)) {
            if (this.eq < 0.0f) {
                this.eq += 0.2f * f;
                if (this.eq >= 0.0f) {
                    this.eq = 0.0f;
                }
            }
            if (this.eq > 0.0f) {
                this.dK += 0.03f * f;
                if (this.eq < 0.0f) {
                    this.dK = com.corrodinggames.rts.gameFramework.f.b(this.dK, 0.2f);
                }
                this.eq -= this.dK * f;
                if (this.eq <= 0.0f) {
                    if (this.eq < 0.0f) {
                        this.eq = 0.0f;
                    }
                    this.dK = 0.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.LAND;
    }
}
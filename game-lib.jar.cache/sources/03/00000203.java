package com.corrodinggames.rts.game.units.b;

import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/b.class */
public abstract class b extends w {
    float h;
    boolean i;
    float j;
    Boolean k;
    Boolean l;
    public static com.corrodinggames.rts.gameFramework.unitAction.e m = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] n = new com.corrodinggames.rts.gameFramework.unitAction.e[10];

    public b(boolean z) {
        super(z);
        this.i = false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.h);
        gameOutputStream.writeBoolean(this.i);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.h = gameInputStream.readFloat();
        this.i = gameInputStream.readBoolean();
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return n[this.bX.R()];
    }

    public static void K() {
        m = GameEngine.getGameEngine().bO.a(AssetsID.drawable.unit_icon_air);
        n = PlayerData.a(m);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.AIR;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        com.corrodinggames.rts.gameFramework.emitter.e b;
        super.a(f);
        if (this.bV) {
            if (this.eq > 0.0f) {
                this.h += 0.06f * f;
                this.eq -= this.h * f;
                return;
            }
            if (this.k == null) {
                this.k = Boolean.valueOf(cK());
            }
            if (this.l == null) {
                this.l = Boolean.valueOf(cJ());
            }
            if (!this.i) {
                this.i = true;
                if (this.k.booleanValue()) {
                    a(ab.verysmall);
                    if (this.l.booleanValue()) {
                        GameEngine.getGameEngine().bR.a(this.eo, this.ep, 0.0f, 0, 0.0f, 0.0f, this.cg);
                    }
                } else {
                    a(ab.small);
                }
                this.h = 0.0f;
            } else if (this.k.booleanValue()) {
                if (this.eq > -10.0f) {
                    this.h += 8.0E-4f * f;
                    this.eq -= this.h * f;
                    if (this.l.booleanValue()) {
                        this.j += f;
                        if (this.j > 30.0f) {
                            this.j = 0.0f;
                            if (s_() && (b = GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq, this.cg)) != null) {
                                b.P = 0.0f;
                                b.Q = -0.1f;
                            }
                        }
                    }
                }
            } else {
                this.eq = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.eq > -1.0f) {
            for (int i = 0; i < 3; i++) {
                gameEngine.bR.e(this.eo, this.ep, this.eq);
            }
        }
        return super.e();
    }
}
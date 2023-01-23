package com.corrodinggames.rts.game.units.h;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/f.class */
public abstract class f extends w {
    float m;
    float n;
    boolean o;
    public static com.corrodinggames.rts.gameFramework.m.e p = null;
    public static com.corrodinggames.rts.gameFramework.m.e[] q = new com.corrodinggames.rts.gameFramework.m.e[10];

    public f(boolean z) {
        super(z);
        this.o = false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.n);
        gameOutputStream.writeBoolean(this.o);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.n = gameInputStream.readFloat();
        this.o = gameInputStream.readBoolean();
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.m.e v() {
        if (this.bX.k == -1) {
            return null;
        }
        return q[this.bX.R()];
    }

    public static void M() {
        p = GameEngine.getGameEngine().bO.a(R.drawable.unit_icon_water);
        q = PlayerData.a(p);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.WATER;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cv() {
        return true;
    }

    public boolean K() {
        return true;
    }

    public void s(float f) {
        if (this.eq != 0.0f) {
            this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 0.0f, 0.2f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.bV) {
            if (this.eq > -10.0f) {
                this.n += 0.002f * f;
                this.eq -= this.n * f;
                return;
            }
            this.eq = -10.0f;
            if (!this.o) {
                this.o = true;
            }
        } else if (!bT() || this.bV) {
        } else {
            s(f);
            if (K()) {
                if (this.cf != 0.0f) {
                    this.m += f;
                }
                if (this.m > 10.0f) {
                    this.m = 0.0f;
                    if (s_()) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        float f2 = this.cg + 180.0f;
                        if (this.cf < 0.0f) {
                            f2 += 180.0f;
                        }
                        float f3 = this.cj - 6.0f;
                        if (f3 < 4.0f) {
                            f3 = 4.0f;
                        }
                        gameEngine.bR.b(this.eo + (com.corrodinggames.rts.gameFramework.f.k(f2) * f3), this.ep + (com.corrodinggames.rts.gameFramework.f.j(f2) * f3), 0.0f, f2);
                    }
                }
            }
        }
    }
}
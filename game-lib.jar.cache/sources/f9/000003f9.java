package com.corrodinggames.rts.game.units.p029h;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0627w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.h.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/f.class */
public abstract class AbstractC0596f extends AbstractC0627w {

    /* renamed from: m */
    float f3877m;

    /* renamed from: n */
    float f3878n;

    /* renamed from: o */
    boolean f3879o;

    /* renamed from: p */
    public static C0970e f3880p = null;

    /* renamed from: q */
    public static C0970e[] f3881q = new C0970e[10];

    public AbstractC0596f(boolean z) {
        super(z);
        this.f3879o = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3878n);
        gameOutputStream.writeBoolean(this.f3879o);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3878n = gameInputStream.readFloat();
        this.f3879o = gameInputStream.readBoolean();
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3881q[this.f1614bX.m4454R()];
    }

    /* renamed from: M */
    public static void m3126M() {
        f3880p = GameEngine.getGameEngine().f6326bO.mo222a(C0067R.drawable.unit_icon_water);
        f3881q = PlayerData.m4432a(f3880p);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1712e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cv */
    public boolean mo3125cv() {
        return true;
    }

    /* renamed from: K */
    public boolean mo3127K() {
        return true;
    }

    /* renamed from: s */
    public void mo3124s(float f) {
        if (this.f7174eq != 0.0f) {
            this.f7174eq = C0773f.m2217a(this.f7174eq, 0.0f, 0.2f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV) {
            if (this.f7174eq > -10.0f) {
                this.f3878n += 0.002f * f;
                this.f7174eq -= this.f3878n * f;
                return;
            }
            this.f7174eq = -10.0f;
            if (!this.f3879o) {
                this.f3879o = true;
            }
        } else if (!m4226bT() || this.f1612bV) {
        } else {
            mo3124s(f);
            if (mo3127K()) {
                if (this.f1622cf != 0.0f) {
                    this.f3877m += f;
                }
                if (this.f3877m > 10.0f) {
                    this.f3877m = 0.0f;
                    if (mo2829s_()) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        float f2 = this.f1623cg + 180.0f;
                        if (this.f1622cf < 0.0f) {
                            f2 += 180.0f;
                        }
                        float f3 = this.f1626cj - 6.0f;
                        if (f3 < 4.0f) {
                            f3 = 4.0f;
                        }
                        gameEngine.f6329bR.m2369b(this.f7172eo + (C0773f.m2107k(f2) * f3), this.f7173ep + (C0773f.m2110j(f2) * f3), 0.0f, f2);
                    }
                }
            }
        }
    }
}
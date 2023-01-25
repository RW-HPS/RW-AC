package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0627w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.e.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/j.class */
public abstract class AbstractC0534j extends AbstractC0627w {

    /* renamed from: dK */
    float f3678dK;

    /* renamed from: dL */
    public static C0970e f3679dL = null;

    /* renamed from: dM */
    public static C0970e f3680dM = null;

    /* renamed from: dN */
    public static C0970e[] f3681dN = new C0970e[10];

    /* renamed from: dO */
    public static C0970e[] f3682dO = new C0970e[10];

    public AbstractC0534j(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        if (mo3267dd()) {
            return f3682dO[this.f1614bX.m4454R()];
        }
        return f3681dN[this.f1614bX.m4454R()];
    }

    /* renamed from: dt */
    public static void m3237dt() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3679dL = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_land);
        if (f3679dL == null) {
            throw new RuntimeException("IMAGE_ICON is null");
        }
        f3681dN = PlayerData.m4432a(f3679dL);
        f3680dM = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_land_exp);
        if (f3680dM == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
        }
        f3682dO = PlayerData.m4432a(f3680dM);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV) {
            float f2 = 0.0f;
            if (m4215cK()) {
                f2 = -10.0f;
            }
            if (this.f7174eq > f2) {
                if (this.f7174eq > 0.0f && this.f3678dK < 0.4f) {
                    this.f3678dK = 0.4f;
                }
                this.f3678dK += 0.002f * f;
                this.f7174eq -= this.f3678dK * f;
                if (this.f7174eq <= f2) {
                    this.f7174eq = f2;
                }
            }
        }
        if (m4226bT() && !this.f1612bV && !(this instanceof AbstractC0530h)) {
            if (this.f7174eq < 0.0f) {
                this.f7174eq += 0.2f * f;
                if (this.f7174eq >= 0.0f) {
                    this.f7174eq = 0.0f;
                }
            }
            if (this.f7174eq > 0.0f) {
                this.f3678dK += 0.03f * f;
                if (this.f7174eq < 0.0f) {
                    this.f3678dK = C0773f.m2172b(this.f3678dK, 0.2f);
                }
                this.f7174eq -= this.f3678dK * f;
                if (this.f7174eq <= 0.0f) {
                    if (this.f7174eq < 0.0f) {
                        this.f7174eq = 0.0f;
                    }
                    this.f3678dK = 0.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1709b;
    }
}
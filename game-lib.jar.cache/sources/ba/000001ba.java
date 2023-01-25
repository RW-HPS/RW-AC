package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ae.class */
public class C0236ae extends AbstractC0549i {

    /* renamed from: a */
    public int f1528a;

    /* renamed from: b */
    public float f1529b;

    /* renamed from: c */
    public boolean f1530c;

    /* renamed from: d */
    public boolean f1531d;

    C0236ae(boolean z) {
        this.f1530c = z;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public int excludeTeam(AbstractC0629y abstractC0629y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
        return abstractC0629y.f1614bX;
    }

    /* renamed from: a */
    public void m4274a(float f) {
        this.f1529b = (f * f) + 1.0f;
        this.f1531d = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public void setup(AbstractC0629y abstractC0629y, float f) {
        this.f1528a = 0;
        if (!this.f1531d) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1531d = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0629y.m2925b(abstractC0244am, true)) {
            this.f1528a++;
            if (this.f1530c) {
                if (!(abstractC0244am instanceof AbstractC0629y)) {
                    return;
                }
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am;
                if (!abstractC0629y2.mo3067l() || !abstractC0629y2.mo2850k(abstractC0629y)) {
                    return;
                }
            }
            float m2216a = C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            if (m2216a < this.f1529b) {
                this.f1529b = m2216a;
                abstractC0629y.f3928R = abstractC0244am;
            }
        }
    }
}
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.custom.bf */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bf.class */
public class C0408bf extends AbstractC0549i {

    /* renamed from: a */
    public float f2518a;

    /* renamed from: b */
    public float f2519b;

    /* renamed from: c */
    public C0409bg f2520c;

    /* renamed from: d */
    public int f2521d;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public void setup(AbstractC0629y abstractC0629y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public int excludeTeam(AbstractC0629y abstractC0629y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0629y == abstractC0244am) {
            return;
        }
        C0454h mo3599de = abstractC0244am.mo3599de();
        C0454h c0454h = this.f2520c.f2524c;
        if ((c0454h == null || (mo3599de != null && C0453g.m3684a(c0454h, mo3599de))) && C0773f.m2216a(this.f2518a, this.f2519b, abstractC0244am.f7172eo, abstractC0244am.f7173ep) < this.f2520c.f2527f) {
            if (abstractC0244am.f1629cm < 1.0f && this.f2520c.f2530i) {
                return;
            }
            if (this.f2520c.f2531j && !abstractC0244am.mo3397bI()) {
                return;
            }
            if (this.f2520c.f2525d != null && !abstractC0629y.f1614bX.m4440a(this.f2520c.f2525d, abstractC0244am.f1614bX)) {
                return;
            }
            this.f2521d++;
        }
    }
}
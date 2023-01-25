package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/f.class */
public class C0426f extends AbstractC0549i {

    /* renamed from: a */
    public C0423c f2708a;

    /* renamed from: b */
    public C0421a f2709b;

    /* renamed from: c */
    public AbstractC0244am f2710c;

    /* renamed from: d */
    public float f2711d;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public void setup(AbstractC0629y abstractC0629y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public int excludeTeam(AbstractC0629y abstractC0629y) {
        return -3;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
        return abstractC0629y.f1614bX;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        C0454h mo3598dh;
        if (abstractC0629y != abstractC0244am && (mo3598dh = abstractC0244am.mo3598dh()) != null && C0453g.m3684a(this.f2709b.f2689a, mo3598dh)) {
            if (abstractC0629y.f1614bX != abstractC0244am.f1614bX) {
                if (abstractC0629y.f1614bX.m4390d(abstractC0244am.f1614bX)) {
                    if (!this.f2709b.f2690b) {
                        return;
                    }
                } else if (!abstractC0629y.f1614bX.m4402c(abstractC0244am.f1614bX) || !this.f2709b.f2691c) {
                    return;
                }
            }
            float m2216a = C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            if (m2216a < this.f2711d) {
                C0425e m3858a = this.f2708a.m3858a(this.f2709b, false);
                if (m3858a == null || m3858a.m3855a(abstractC0244am) == null) {
                    this.f2710c = abstractC0244am;
                    this.f2711d = m2216a;
                }
            }
        }
    }
}
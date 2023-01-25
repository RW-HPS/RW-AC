package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.d.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/s.class */
public class C0516s extends AbstractC0549i {

    /* renamed from: a */
    public float f3576a;

    /* renamed from: b */
    public boolean f3577b;

    /* renamed from: c */
    public boolean f3578c;

    /* renamed from: d */
    PlayerData f3579d;

    /* renamed from: e */
    AbstractC0244am f3580e;

    /* renamed from: f */
    float f3581f;

    /* renamed from: g */
    float f3582g;

    /* renamed from: h */
    boolean f3583h;

    C0516s(boolean z) {
        this.f3577b = z;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public int excludeTeam(AbstractC0629y abstractC0629y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    /* renamed from: a */
    public void m3304a(float f, boolean z) {
        this.f3576a = f * f;
        this.f3583h = z;
        this.f3578c = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public void setup(AbstractC0629y abstractC0629y, float f) {
        this.f3580e = null;
        this.f3581f = -1.0f;
        this.f3582g = -1.0f;
        this.f3579d = abstractC0629y.f1614bX;
        if (!this.f3578c) {
            throw new RuntimeException("AutoRepairCallback not ready");
        }
        this.f3578c = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0629y == abstractC0244am) {
            return;
        }
        if ((abstractC0244am.f1637cu < abstractC0244am.f1638cv || abstractC0244am.f1629cm < 1.0f) && !abstractC0244am.f1612bV && abstractC0244am.f1656cN == null && this.f3579d.m4390d(abstractC0244am.f1614bX) && abstractC0629y.mo3011a(abstractC0244am)) {
            float m2216a = C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            if (m2216a < this.f3576a) {
                if (abstractC0244am.f1629cm < 1.0f && abstractC0629y.m2865g(abstractC0244am) != null) {
                    return;
                }
                boolean z = false;
                if (!this.f3583h) {
                    if (this.f3581f == -1.0f || this.f3581f > abstractC0244am.f1637cu) {
                        z = true;
                    }
                } else if (this.f3582g == -1.0f || this.f3582g > m2216a) {
                    z = true;
                }
                if (z && abstractC0244am.mo3284g() == 0.0f) {
                    this.f3581f = abstractC0244am.f1637cu;
                    this.f3582g = m2216a;
                    this.f3580e = abstractC0244am;
                }
            }
        }
    }
}
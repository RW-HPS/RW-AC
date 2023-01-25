package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ac.class */
public class C0234ac extends AbstractC0549i {

    /* renamed from: a */
    public float f1515a;

    /* renamed from: b */
    public float f1516b;

    /* renamed from: c */
    public C0454h f1517c;

    /* renamed from: d */
    public float f1518d;

    /* renamed from: e */
    public AbstractC0244am f1519e;

    /* renamed from: f */
    public boolean f1520f;

    /* renamed from: g */
    public boolean f1521g = false;

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
        if (this.f1520f && abstractC0244am.mo3284g() <= 0.0f) {
            return;
        }
        float m2216a = C0773f.m2216a(this.f1515a, this.f1516b, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
        if (m2216a < this.f1518d) {
            if (abstractC0244am.f1629cm < 1.0f && !this.f1521g) {
                return;
            }
            if (this.f1517c != null && !C0453g.m3684a(this.f1517c, abstractC0244am.mo3599de())) {
                return;
            }
            if ((this.f1520f && !abstractC0629y.mo3142g(abstractC0244am, true)) || abstractC0244am.f1656cN != null) {
                return;
            }
            this.f1519e = abstractC0244am;
            this.f1518d = m2216a;
        }
    }
}
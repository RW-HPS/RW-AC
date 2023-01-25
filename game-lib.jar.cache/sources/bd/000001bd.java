package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ah.class */
public class C0239ah extends AbstractC0549i {

    /* renamed from: a */
    public int f1538a;

    /* renamed from: b */
    public float[] f1539b = new float[31];

    /* renamed from: c */
    public boolean[] f1540c = new boolean[31];

    /* renamed from: d */
    int f1541d;

    /* renamed from: e */
    public boolean f1542e;

    /* renamed from: f */
    public boolean f1543f;

    C0239ah(boolean z) {
        this.f1542e = z;
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
    public void m4271a(AbstractC0629y abstractC0629y) {
        float m2919b = abstractC0629y.m2919b(false);
        this.f1541d = abstractC0629y.mo2900bl();
        for (int i = 0; i < this.f1541d; i++) {
            float mo2821z = abstractC0629y.mo2821z(i);
            if (mo2821z > m2919b) {
                mo2821z = m2919b;
            }
            this.f1539b[i] = (mo2821z * mo2821z) + 1.0f;
            this.f1540c[i] = false;
            if (abstractC0629y.mo2826v(i) == -1 && abstractC0629y.f1654cL[i].f1726j == null) {
                this.f1540c[i] = true;
            }
        }
        this.f1543f = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public void setup(AbstractC0629y abstractC0629y, float f) {
        this.f1538a = 0;
        if (!this.f1543f) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1543f = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0629y.m2925b(abstractC0244am, true)) {
            this.f1538a++;
            if (this.f1542e) {
                if (!(abstractC0244am instanceof AbstractC0629y)) {
                    return;
                }
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am;
                if (!abstractC0629y2.mo3067l() || !abstractC0629y2.mo2850k(abstractC0629y)) {
                    return;
                }
            }
            float m2216a = C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            for (int i = 0; i < this.f1541d; i++) {
                if (this.f1540c[i] && abstractC0629y.mo3017a(i, abstractC0244am, true, false) && m2216a < this.f1539b[i] && m2216a > abstractC0629y.mo3064A(i)) {
                    this.f1539b[i] = m2216a;
                    abstractC0629y.f1654cL[i].f1726j = abstractC0244am;
                }
            }
        }
    }
}
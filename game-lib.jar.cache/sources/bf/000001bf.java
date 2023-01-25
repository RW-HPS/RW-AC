package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;

/* renamed from: com.corrodinggames.rts.game.units.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aj.class */
public class C0241aj extends AbstractC0549i {

    /* renamed from: a */
    float f1565a;

    /* renamed from: b */
    float f1566b;

    /* renamed from: c */
    public C0240ai f1567c;

    C0241aj() {
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
    public void setup(AbstractC0629y abstractC0629y, float f) {
        this.f1567c = null;
    }

    /* renamed from: a */
    public void m4262a(float f, float f2) {
        this.f1565a = f;
        this.f1566b = f2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        if ((abstractC0244am instanceof C0240ai) && !abstractC0244am.f1612bV && abstractC0244am.m4225c(this.f1565a, this.f1566b, 0.0f)) {
            this.f1567c = (C0240ai) abstractC0244am;
        }
    }
}
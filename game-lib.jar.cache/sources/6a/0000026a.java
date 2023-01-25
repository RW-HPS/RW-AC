package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;

/* renamed from: com.corrodinggames.rts.game.units.custom.bj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bj.class */
public class C0412bj extends AbstractC0549i {

    /* renamed from: a */
    C0188f f2543a;

    /* renamed from: b */
    C0413bk f2544b;

    /* renamed from: c */
    AbstractC0244am f2545c;

    /* renamed from: d */
    C0188f f2546d;

    /* renamed from: e */
    AbstractC0244am f2547e;

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
    }
}
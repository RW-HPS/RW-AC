package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.player.EnumC0853f;

/* renamed from: com.corrodinggames.rts.gameFramework.bj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bj.class */
public enum EnumC0734bj {
    f4625a(EnumC0853f.income),
    f4626b(EnumC0853f.armyValue),
    f4627c(EnumC0853f.buildingValue),
    f4628d(EnumC0853f.totalValue);
    

    /* renamed from: e */
    final EnumC0853f f4629e;

    EnumC0734bj(EnumC0853f enumC0853f) {
        this.f4629e = enumC0853f;
    }

    /* renamed from: a */
    public EnumC0853f m2456a() {
        return this.f4629e;
    }
}
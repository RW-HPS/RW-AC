package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.EnumC0734bj;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ac.class */
public enum EnumC0793ac {
    f5154a("A", null),
    f5155b("B", EnumC0734bj.income),
    f5156c("C", EnumC0734bj.armyValue),
    f5157d("D", EnumC0734bj.buildingValue),
    f5158e("E", EnumC0734bj.totalValue);
    

    /* renamed from: f */
    private final String f5159f;

    /* renamed from: g */
    private final EnumC0734bj f5160g;

    EnumC0793ac(String str, EnumC0734bj enumC0734bj) {
        this.f5159f = str;
        this.f5160g = enumC0734bj;
    }

    /* renamed from: a */
    public EnumC0734bj m1988a() {
        return this.f5160g;
    }
}
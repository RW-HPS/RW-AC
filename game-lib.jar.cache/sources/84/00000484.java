package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bj.class */
public enum bj {
    income(com.corrodinggames.rts.gameFramework.g.f.income),
    armyValue(com.corrodinggames.rts.gameFramework.g.f.armyValue),
    buildingValue(com.corrodinggames.rts.gameFramework.g.f.buildingValue),
    totalValue(com.corrodinggames.rts.gameFramework.g.f.totalValue);
    
    final com.corrodinggames.rts.gameFramework.g.f e;

    bj(com.corrodinggames.rts.gameFramework.g.f fVar) {
        this.e = fVar;
    }

    public com.corrodinggames.rts.gameFramework.g.f a() {
        return this.e;
    }
}
package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bj.class */
public enum bj {
    income(com.corrodinggames.rts.gameFramework.player.f.income),
    armyValue(com.corrodinggames.rts.gameFramework.player.f.armyValue),
    buildingValue(com.corrodinggames.rts.gameFramework.player.f.buildingValue),
    totalValue(com.corrodinggames.rts.gameFramework.player.f.totalValue);
    
    final com.corrodinggames.rts.gameFramework.player.f e;

    bj(com.corrodinggames.rts.gameFramework.player.f fVar) {
        this.e = fVar;
    }

    public com.corrodinggames.rts.gameFramework.player.f a() {
        return this.e;
    }
}
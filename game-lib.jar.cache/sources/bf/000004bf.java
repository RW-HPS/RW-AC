package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.gameFramework.bj;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ac.class */
public enum ac {
    overallStats("A", null),
    incomeChart("B", bj.income),
    armyValueChart("C", bj.armyValue),
    buildingValueChart("D", bj.buildingValue),
    totalValueChart("E", bj.totalValue);
    
    private final String f;
    private final bj g;

    ac(String str, bj bjVar) {
        this.f = str;
        this.g = bjVar;
    }

    public bj a() {
        return this.g;
    }
}
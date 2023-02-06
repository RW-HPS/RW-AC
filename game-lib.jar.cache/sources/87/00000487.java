package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bm.class */
public class bm extends TeamStats {
    public bm(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TeamStats teamStats = (TeamStats) it.next();
            this.a += teamStats.a;
            this.b += teamStats.b;
            this.unitsKilled += teamStats.unitsKilled;
            this.buildingsKilled += teamStats.buildingsKilled;
            this.experimentalsKilled += teamStats.experimentalsKilled;
            this.unitsLost += teamStats.unitsLost;
            this.buildingsLost += teamStats.buildingsLost;
            this.experimentalsLost += teamStats.experimentalsLost;
            this.i += teamStats.i;
            this.j = Math.max(this.j, teamStats.j);
            this.k += teamStats.k;
            this.l.a(teamStats.l);
        }
    }
}
package com.corrodinggames.rts.game.units.custom;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/q.class */
public class q implements Comparator {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(l lVar, l lVar2) {
        if (lVar.M == null || lVar2.M == null) {
            return 0;
        }
        return lVar.M.compareTo(lVar2.M);
    }
}
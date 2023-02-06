package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bi.class */
public class bi extends ArrayList {
    public int a(int i) {
        if (isEmpty()) {
            return 0;
        }
        int i2 = ((bh) get(0)).b;
        Iterator it = iterator();
        while (it.hasNext()) {
            bh bhVar = (bh) it.next();
            if (bhVar.a > i) {
                return i2;
            }
            i2 = bhVar.b;
        }
        return i2;
    }
}
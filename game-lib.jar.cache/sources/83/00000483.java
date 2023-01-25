package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.bi */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bi.class */
public class C0733bi extends ArrayList {
    /* renamed from: a */
    public int m2457a(int i) {
        if (isEmpty()) {
            return 0;
        }
        int i2 = ((C0732bh) get(0)).f4624b;
        Iterator it = iterator();
        while (it.hasNext()) {
            C0732bh c0732bh = (C0732bh) it.next();
            if (c0732bh.f4623a > i) {
                return i2;
            }
            i2 = c0732bh.f4624b;
        }
        return i2;
    }
}
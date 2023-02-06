package com.corrodinggames.rts.gameFramework;

import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bl.class */
public class bl {
    com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();

    public void a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.am amVar2) {
        if (this.a.a > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((bk) it.next()).a(amVar, amVar2, null);
            }
        }
    }
}
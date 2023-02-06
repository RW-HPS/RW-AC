package com.corrodinggames.rts.gameFramework;

import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/q.class */
public class q {
    com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();

    public void a(Runnable runnable) {
        this.a.add(runnable);
    }

    public void a() {
        if (this.a.a > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public void b() {
        if (this.a.a > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.a.clear();
        }
    }
}
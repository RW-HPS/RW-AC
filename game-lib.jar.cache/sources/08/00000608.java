package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/aj.class */
public class aj {
    ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    public void a(Runnable runnable) {
        this.a.add(runnable);
    }

    public void a() {
        while (true) {
            Runnable runnable = (Runnable) this.a.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
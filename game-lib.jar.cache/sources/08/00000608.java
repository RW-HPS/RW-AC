package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/aj.class */
public class C1116aj {

    /* renamed from: a */
    ConcurrentLinkedQueue f7067a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public void m592a(Runnable runnable) {
        this.f7067a.add(runnable);
    }

    /* renamed from: a */
    public void m593a() {
        while (true) {
            Runnable runnable = (Runnable) this.f7067a.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
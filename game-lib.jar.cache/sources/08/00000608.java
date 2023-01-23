package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/aj.class */
public class aj {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentLinkedQueue f676a = new ConcurrentLinkedQueue();

    public void a(Runnable runnable) {
        this.f676a.add(runnable);
    }

    public void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f676a.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
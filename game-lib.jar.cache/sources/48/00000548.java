package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k.class */
class C0930k extends Thread {

    /* renamed from: a */
    boolean f6125a = true;

    C0930k() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f6125a) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
            FileChangeEngine.m1640b();
        }
    }
}
package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/au.class */
class au extends Thread {
    final /* synthetic */ am a;

    au(am amVar) {
        this.a = amVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        float f;
        while (true) {
            synchronized (this.a.c) {
                this.a.g = true;
                if (!this.a.f) {
                    try {
                        this.a.c.wait(am.a.e());
                    } catch (InterruptedException e) {
                    }
                }
                this.a.f = false;
                f = this.a.d;
            }
            synchronized (this.a.b) {
                if (!this.a.b(f)) {
                    return;
                }
            }
        }
    }
}
package com.corrodinggames.rts.gameFramework;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/au.class */
public class au extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ am f412a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(am amVar) {
        this.f412a = amVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        float f;
        while (true) {
            synchronized (this.f412a.c) {
                this.f412a.g = true;
                if (!this.f412a.f) {
                    try {
                        this.f412a.c.wait(am.f403a.e());
                    } catch (InterruptedException e) {
                    }
                }
                this.f412a.f = false;
                f = this.f412a.d;
            }
            synchronized (this.f412a.b) {
                if (!this.f412a.b(f)) {
                    return;
                }
            }
        }
    }
}
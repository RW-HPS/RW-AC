package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/au.class */
class C0669au extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0654am f4255a;

    C0669au(C0654am c0654am) {
        this.f4255a = c0654am;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        float f;
        while (true) {
            synchronized (this.f4255a.f4224c) {
                this.f4255a.f4227g = true;
                if (!this.f4255a.f4226f) {
                    try {
                        this.f4255a.f4224c.wait(C0654am.f4220a.mo93e());
                    } catch (InterruptedException e) {
                    }
                }
                this.f4255a.f4226f = false;
                f = this.f4255a.f4225d;
            }
            synchronized (this.f4255a.f4223b) {
                if (!this.f4255a.m2746b(f)) {
                    return;
                }
            }
        }
    }
}
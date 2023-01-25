package com.corrodinggames.rts.gameFramework.p030a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/d.class */
public class C0636d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0633a f4066a;

    public C0636d(C0633a c0633a) {
        this.f4066a = c0633a;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GameEngine.m1033aq();
        while (true) {
            try {
                C0635c c0635c = (C0635c) this.f4066a.f4050a.take();
                c0635c.m2817a();
                this.f4066a.f4052c.m632a(c0635c);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
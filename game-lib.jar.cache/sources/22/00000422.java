package com.corrodinggames.rts.gameFramework.a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/d.class */
public class d extends Thread {
    final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GameEngine.aq();
        while (true) {
            try {
                c cVar = (c) this.a.a.take();
                cVar.a();
                this.a.c.a(cVar);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
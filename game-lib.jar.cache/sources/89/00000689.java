package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/r.class */
public class r extends Thread {
    final /* synthetic */ o a;

    public r(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GameEngine.aq();
        while (true) {
            try {
                p pVar = (p) this.a.b.take();
                pVar.a();
                this.a.c.a(pVar);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
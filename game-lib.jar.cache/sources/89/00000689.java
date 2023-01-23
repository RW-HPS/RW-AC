package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/r.class */
public class r extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f756a;

    public r(o oVar) {
        this.f756a = oVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GameEngine.aq();
        while (true) {
            try {
                p pVar = (p) this.f756a.b.take();
                pVar.a();
                this.f756a.c.a(pVar);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
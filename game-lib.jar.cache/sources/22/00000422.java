package com.corrodinggames.rts.gameFramework.a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/d.class */
public class d extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f396a;

    public d(a aVar) {
        this.f396a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GameEngine.aq();
        while (true) {
            try {
                c cVar = (c) this.f396a.f393a.take();
                cVar.a();
                this.f396a.c.a(cVar);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
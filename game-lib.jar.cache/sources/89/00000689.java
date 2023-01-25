package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/r.class */
public class C1223r extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1220o f7470a;

    public C1223r(C1220o c1220o) {
        this.f7470a = c1220o;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GameEngine.m1033aq();
        while (true) {
            try {
                C1221p c1221p = (C1221p) this.f7470a.f7457b.take();
                c1221p.m77a();
                this.f7470a.f7458c.m632a(c1221p);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
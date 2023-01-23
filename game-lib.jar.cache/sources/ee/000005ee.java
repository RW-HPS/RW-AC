package com.corrodinggames.rts.gameFramework;

import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/q.class */
public class q {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.gameFramework.utility.m f659a = new com.corrodinggames.rts.gameFramework.utility.m();

    public void a(Runnable runnable) {
        this.f659a.add(runnable);
    }

    public void a() {
        if (this.f659a.f689a > 0) {
            Iterator it = this.f659a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public void b() {
        if (this.f659a.f689a > 0) {
            Iterator it = this.f659a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f659a.clear();
        }
    }
}
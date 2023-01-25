package com.corrodinggames.rts.gameFramework.net;

import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.j.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/o.class */
class C0917o extends TimerTask {

    /* renamed from: a */
    int f6100a;

    C0917o(int i) {
        this.f6100a = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        GameNetAPIOperate.m1280a(this.f6100a, -1);
    }
}
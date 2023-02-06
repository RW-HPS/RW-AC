package com.corrodinggames.rts.gameFramework.net;

import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.j.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/o.class */
class o extends TimerTask {
    int a;

    o(int i) {
        this.a = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        GameNetAPIOperate.a(this.a, -1);
    }
}
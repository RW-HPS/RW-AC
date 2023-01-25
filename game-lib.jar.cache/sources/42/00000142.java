package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.appFramework.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/h.class */
class RunnableC0116h implements Runnable {

    /* renamed from: a */
    public String f473a;

    /* renamed from: b */
    final /* synthetic */ ActivityC0097g f474b;

    RunnableC0116h(ActivityC0097g activityC0097g) {
        this.f474b = activityC0097g;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.m1097L();
        gameEngine.f6386ca.m420b(this.f473a, false);
        gameEngine.m1099J();
        if (this.f474b.f442e != null && this.f474b.f442e.isShowing()) {
            this.f474b.m5312b(0);
        }
    }
}
package com.corrodinggames.rts.gameFramework.writeErrorFile;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/c.class */
class RunnableC0754c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0752a f4718a;

    RunnableC0754c(RunnableC0752a runnableC0752a) {
        this.f4718a = runnableC0752a;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f4718a.f4711f) {
            this.f4718a.f4711f = false;
            return;
        }
        if (RunnableC0752a.f4708c) {
            if (gameEngine.f6371bL == null) {
                return;
            }
            gameEngine.f6373bN.f4227F = true;
            if (!gameEngine.f6373bN.m2736j()) {
                RunnableC0752a.f4710e += 1.0f;
            }
            if (RunnableC0752a.f4710e > 5.0f) {
                RunnableC0752a.f4710e = 0.0f;
                System.gc();
                System.gc();
                gameEngine.f6373bN.m2741e();
            }
        }
        if (RunnableC0752a.f4709d && gameEngine.f6371bL != null) {
            gameEngine.f6371bL.m4602g();
        }
    }
}
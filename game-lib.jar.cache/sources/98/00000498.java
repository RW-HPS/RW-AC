package com.corrodinggames.rts.gameFramework.writeErrorFile;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/c.class */
class c implements Runnable {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.a.f) {
            this.a.f = false;
            return;
        }
        if (a.c) {
            if (gameEngine.bL == null) {
                return;
            }
            gameEngine.bN.F = true;
            if (!gameEngine.bN.j()) {
                a.e += 1.0f;
            }
            if (a.e > 5.0f) {
                a.e = 0.0f;
                System.gc();
                System.gc();
                gameEngine.bN.e();
            }
        }
        if (a.d && gameEngine.bL != null) {
            gameEngine.bL.g();
        }
    }
}
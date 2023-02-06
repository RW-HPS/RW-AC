package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/h.class */
class h implements Runnable {
    public String a;
    final /* synthetic */ g b;

    h(g gVar) {
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.L();
        gameEngine.ca.b(this.a, false);
        gameEngine.J();
        if (this.b.e != null && this.b.e.isShowing()) {
            this.b.b(0);
        }
    }
}
package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/h.class */
class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public String f107a;
    final /* synthetic */ g b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.L();
        gameEngine.ca.b(this.f107a, false);
        gameEngine.J();
        if (this.b.e != null && this.b.e.isShowing()) {
            this.b.b(0);
        }
    }
}
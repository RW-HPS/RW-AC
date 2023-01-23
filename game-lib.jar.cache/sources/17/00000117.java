package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/b.class */
public class b extends l {
    public void a() {
        b();
    }

    public void b() {
        GameEngine.m328e("networkSocks");
        GameEngine gameEngine = GameEngine.getGameEngine();
        for (int i = 0; i < 10000; i++) {
            gameEngine.bX.startNet(false);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameEngine.bX.b("test");
        }
        GameEngine.m328e("done");
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
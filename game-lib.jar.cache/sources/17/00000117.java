package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/b.class */
public class TestNewSocket extends AbstractScriptTest {
    /* renamed from: a */
    public void start() {
        test();
    }

    /* renamed from: b */
    public void test() {
        GameEngine.m5924e("networkSocks");
        GameEngine gameEngine = GameEngine.getGameEngine();
        for (int i = 0; i < 10000; i++) {
            gameEngine.netEngine.startNet(false);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameEngine.netEngine.closeServer("test");
        }
        GameEngine.m5924e("done");
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
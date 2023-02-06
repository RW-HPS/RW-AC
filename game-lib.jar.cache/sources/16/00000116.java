package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.y;

/* renamed from: com.corrodinggames.rts.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/a.class */
public class a extends AbstractScriptTest {
    public void a() {
        GameEngine.m5e("== Testing GameLogic ==");
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.by = 1000;
        n.a(y.b(1000, 5));
        n.a(y.b(1000, 1100));
        n.a(y.b(900, 200));
        n.b(y.b(-9999, 200));
        n.b(y.b(1100, 200));
        n.b(y.b(700, 200));
        gameEngine.by = 1000;
        n.a(y.a(500, 300));
        n.b(y.a(900, 300));
    }
}
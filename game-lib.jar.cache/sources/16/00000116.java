package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/a.class */
public class C0072a extends AbstractScriptTest {
    /* renamed from: a */
    public void m5456a() {
        GameEngine.m5924e("== Testing GameLogic ==");
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6315by = 1000;
        C0085n.m5416a(C1152y.m475b(1000, 5));
        C0085n.m5416a(C1152y.m475b(1000, 1100));
        C0085n.m5416a(C1152y.m475b(900, 200));
        C0085n.m5414b(C1152y.m475b(-9999, 200));
        C0085n.m5414b(C1152y.m475b(1100, 200));
        C0085n.m5414b(C1152y.m475b(700, 200));
        gameEngine.f6315by = 1000;
        C0085n.m5416a(C1152y.m496a(500, 300));
        C0085n.m5414b(C1152y.m496a(900, 300));
    }
}
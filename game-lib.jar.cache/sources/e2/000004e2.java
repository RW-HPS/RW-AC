package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p024d.AbstractC0493d;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/j.class */
public class C0828j {

    /* renamed from: a */
    static Point f5438a = new Point();

    /* renamed from: a */
    public static Point m1787a(int i, int i2, int i3) {
        C0180g m4608e;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6371bL.m4662a(i, i2);
        int i4 = gameEngine.f6371bL.f829T;
        int i5 = gameEngine.f6371bL.f830U;
        Point point = null;
        float f = -1.0f;
        for (int i6 = i4 - i3; i6 <= i4 + i3; i6++) {
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (gameEngine.f6371bL.m4618c(i6, i7) && (m4608e = gameEngine.f6371bL.m4608e(i6, i7)) != null && m4608e.f923i) {
                    AbstractC0244am m3399b = AbstractC0493d.m3399b(i6, i7);
                    if (m3399b != null && !m3399b.m4211cf()) {
                        m3399b = null;
                    }
                    if (m3399b == null) {
                        float m2216a = C0773f.m2216a(i4, i5, i6, i7);
                        if (f == -1.0f || f > m2216a) {
                            gameEngine.f6371bL.m4658a(i6, i7);
                            f5438a.m5175a(gameEngine.f6371bL.f829T, gameEngine.f6371bL.f830U);
                            point = f5438a;
                            f = m2216a;
                        }
                    }
                }
            }
        }
        return point;
    }
}
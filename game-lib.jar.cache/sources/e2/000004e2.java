package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Point;
import com.corrodinggames.rts.game.maps.g;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.d.d;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.gameFramework.f.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/j.class */
public class j {
    static Point a = new Point();

    public static Point a(int i, int i2, int i3) {
        g e;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bL.a(i, i2);
        int i4 = gameEngine.bL.T;
        int i5 = gameEngine.bL.U;
        Point point = null;
        float f = -1.0f;
        for (int i6 = i4 - i3; i6 <= i4 + i3; i6++) {
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (gameEngine.bL.c(i6, i7) && (e = gameEngine.bL.e(i6, i7)) != null && e.i) {
                    am b = d.b(i6, i7);
                    if (b != null && !b.cf()) {
                        b = null;
                    }
                    if (b == null) {
                        float a2 = f.a(i4, i5, i6, i7);
                        if (f == -1.0f || f > a2) {
                            gameEngine.bL.a(i6, i7);
                            a.a(gameEngine.bL.T, gameEngine.bL.U);
                            point = a;
                            f = a2;
                        }
                    }
                }
            }
        }
        return point;
    }
}
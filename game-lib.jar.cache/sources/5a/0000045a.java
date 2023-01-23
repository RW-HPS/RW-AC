package com.corrodinggames.rts.gameFramework.b;

import android.graphics.RectF;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ag.class */
public class ag {
    public static void a(b bVar, RectF rectF) {
        int i = 0;
        int i2 = 0;
        int b = bVar.b();
        int c = bVar.c();
        if (bVar.f()) {
            i = 1;
            i2 = 1;
            b--;
            c--;
        }
        rectF.a(i, i2, b, c);
    }
}
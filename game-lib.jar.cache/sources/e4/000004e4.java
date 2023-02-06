package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/l.class */
public class l {
    Paint a;
    String b;
    float d;
    Paint e;
    String f;
    float h;
    int c = -1;
    int g = -1;

    public l(String str, Paint paint, String str2, Paint paint2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.a = paint;
        this.b = str;
        this.d = gameEngine.bO.b(str, paint);
        this.e = paint2;
        this.f = str2;
        this.h = gameEngine.bO.b(str2, paint2);
    }
}
package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/l.class */
public class l {

    /* renamed from: a  reason: collision with root package name */
    Paint f517a;
    String b;
    float d;
    Paint e;
    String f;
    float h;
    int c = -1;
    int g = -1;

    public l(String str, Paint paint, String str2, Paint paint2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f517a = paint;
        this.b = str;
        this.d = gameEngine.bO.b(str, paint);
        this.e = paint2;
        this.f = str2;
        this.h = gameEngine.bO.b(str2, paint2);
    }
}
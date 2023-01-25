package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/l.class */
public class C0830l {

    /* renamed from: a */
    Paint f5444a;

    /* renamed from: b */
    String f5445b;

    /* renamed from: d */
    float f5447d;

    /* renamed from: e */
    Paint f5448e;

    /* renamed from: f */
    String f5449f;

    /* renamed from: h */
    float f5451h;

    /* renamed from: c */
    int f5446c = -1;

    /* renamed from: g */
    int f5450g = -1;

    public C0830l(String str, Paint paint, String str2, Paint paint2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f5444a = paint;
        this.f5445b = str;
        this.f5447d = gameEngine.f6326bO.mo158b(str, paint);
        this.f5448e = paint2;
        this.f5449f = str2;
        this.f5451h = gameEngine.f6326bO.mo158b(str2, paint2);
    }
}
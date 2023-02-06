package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ai.class */
public class ai extends af {
    String d;
    final /* synthetic */ ae e;

    @Override // com.corrodinggames.rts.gameFramework.Interface.af
    public int a(Paint paint) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int b = gameEngine.bO.b(this.d, b(paint));
        if (GameEngine.at()) {
        }
        return b;
    }

    public Paint b(Paint paint) {
        return paint;
    }

    ai(ae aeVar, String str) {
        this.e = aeVar;
        this.d = str;
    }

    public ai b(String str) {
        return new ai(this.e, str);
    }
}
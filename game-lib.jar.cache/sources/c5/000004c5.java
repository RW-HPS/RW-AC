package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ai.class */
public class C0799ai extends C0796af {

    /* renamed from: d */
    String f5182d;

    /* renamed from: e */
    final /* synthetic */ C0795ae f5183e;

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0796af
    /* renamed from: a */
    public int mo1970a(Paint paint) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int mo158b = gameEngine.f6326bO.mo158b(this.f5182d, mo1969b(paint));
        if (GameEngine.m1030at()) {
        }
        return mo158b;
    }

    /* renamed from: b */
    public Paint mo1969b(Paint paint) {
        return paint;
    }

    C0799ai(C0795ae c0795ae, String str) {
        this.f5183e = c0795ae;
        this.f5182d = str;
    }

    /* renamed from: b */
    public C0799ai mo1968b(String str) {
        return new C0799ai(this.f5183e, str);
    }
}
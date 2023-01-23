package com.corrodinggames.rts.gameFramework.b;

import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ae.class */
public class ae extends b {
    ad l;
    public float m;
    public float n;
    public int o;
    public int p;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.b.b
    public boolean c(k kVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(int i) {
        this.l.b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int h() {
        return this.l.h();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void a(RectF rectF) {
        float f = this.g;
        float f2 = this.h;
        rectF.f48a = (rectF.f48a * f) + this.m;
        rectF.c = (rectF.c * f) + this.m;
        rectF.b = (rectF.b * f2) + this.n;
        rectF.d = (rectF.d * f2) + this.n;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void a(RectF rectF, RectF rectF2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(k kVar) {
        GameEngine.m328e("SubTexture prepare TODO");
    }
}
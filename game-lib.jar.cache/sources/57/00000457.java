package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ad.class */
public class ad extends b {
    int l = 9729;

    public ad(k kVar, int i, int i2) {
        a(i, i2);
        this.a = kVar.a().a();
        kVar.d(this);
        kVar.a(this, 6408, 5121, 6408);
    }

    public void a(k kVar, Bitmap bitmap, int i, int i2) {
        kVar.f();
        int g = g();
        kVar.b(this);
        n.q();
        GLUtils.texSubImage2D(g, 0, i, i2, bitmap, 6408, 5121);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    protected boolean c(k kVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(k kVar) {
        GameEngine.m5e("BackingTexture prepare TODO");
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    protected int g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(int i) {
        if (this.l != i) {
            int g = g();
            GLES20.glTexParameterf(g, 10241, i);
            GLES20.glTexParameterf(g, 10240, i);
            this.l = i;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int h() {
        return this.l;
    }
}
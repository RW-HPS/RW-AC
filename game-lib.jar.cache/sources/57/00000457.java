package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ad.class */
public class C0689ad extends AbstractC0699b {

    /* renamed from: l */
    int f4363l = 9729;

    public C0689ad(InterfaceC0709k interfaceC0709k, int i, int i2) {
        m2643a(i, i2);
        this.f4412a = interfaceC0709k.mo2604a().mo2530a();
        interfaceC0709k.mo2553d(this);
        interfaceC0709k.mo2585a(this, 6408, 5121, 6408);
    }

    /* renamed from: a */
    public void m2672a(InterfaceC0709k interfaceC0709k, Bitmap bitmap, int i, int i2) {
        interfaceC0709k.mo2550f();
        int mo2519g = mo2519g();
        interfaceC0709k.mo2562b(this);
        C0712n.m2539q();
        GLUtils.texSubImage2D(mo2519g, 0, i, i2, bitmap, 6408, 5121);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: c */
    protected boolean mo2520c(InterfaceC0709k interfaceC0709k) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2521b(InterfaceC0709k interfaceC0709k) {
        GameEngine.m5460e("BackingTexture prepare TODO");
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: g */
    protected int mo2519g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2522b(int i) {
        if (this.f4363l != i) {
            int mo2519g = mo2519g();
            GLES20.glTexParameterf(mo2519g, 10241, i);
            GLES20.glTexParameterf(mo2519g, 10240, i);
            this.f4363l = i;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: h */
    public int mo2518h() {
        return this.f4363l;
    }
}
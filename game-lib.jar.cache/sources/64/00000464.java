package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/e.class */
public class C0702e extends AbstractC0693ah {

    /* renamed from: l */
    protected Bitmap f4427l;

    public C0702e(Bitmap bitmap) {
        this(bitmap, false);
    }

    public C0702e(Bitmap bitmap, boolean z) {
        super(z);
        this.f4427l = bitmap;
        this.f4377m = mo2628k();
        m2643a(this.f4377m.m5275b() + 0, this.f4377m.m5272c() + 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0693ah
    /* renamed from: a */
    protected void mo2629a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0693ah
    /* renamed from: k */
    protected Bitmap mo2628k() {
        return this.f4427l;
    }
}
package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Bitmap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/e.class */
public class e extends ah {
    protected Bitmap l;

    public e(Bitmap bitmap) {
        this(bitmap, false);
    }

    public e(Bitmap bitmap, boolean z) {
        super(z);
        this.l = bitmap;
        this.m = k();
        a(this.m.b() + 0, this.m.c() + 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.ah
    protected void a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.b.ah
    protected Bitmap k() {
        return this.l;
    }
}
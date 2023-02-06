package com.corrodinggames.rts.gameFramework.b;

import android.util.Log;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/x.class */
public class x extends b {
    private final boolean m;
    private int n;
    protected boolean l;

    public x(int i, int i2, boolean z) {
        this(i, i2, z, 3553);
    }

    public x(int i, int i2, boolean z, int i3) {
        this.n = 3553;
        this.m = z;
        a(i, i2);
        this.n = i3;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(k kVar) {
        this.a = kVar.a().a();
        if (this.n == 3553) {
            kVar.a(this, 6408, 5121, 6408);
        }
        kVar.d(this);
        this.b = 1;
        a(kVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    protected boolean c(k kVar) {
        if (i()) {
            return true;
        }
        Log.c("RawTexture", "lost the content due to context change");
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int g() {
        return this.n;
    }

    public boolean k() {
        return this.l;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int h() {
        return 9729;
    }
}
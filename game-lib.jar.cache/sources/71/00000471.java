package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;

/* renamed from: com.corrodinggames.rts.gameFramework.b.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/q.class */
abstract class AbstractC0715q {

    /* renamed from: b */
    protected final String f4499b;

    /* renamed from: a */
    public int f4498a = -1;

    /* renamed from: c */
    public int f4500c = -1;

    /* renamed from: a */
    public abstract void mo2531a(int i);

    public AbstractC0715q(String str) {
        this.f4499b = str;
    }

    /* renamed from: a */
    public void m2533a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f4498a, 1, false, fArr, 0);
    }
}
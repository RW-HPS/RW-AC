package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/t.class */
public class t implements u {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f440a = new int[1];

    @Override // com.corrodinggames.rts.gameFramework.b.u
    public int a() {
        GLES20.glGenTextures(1, this.f440a, 0);
        n.q();
        return this.f440a[0];
    }
}
package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/t.class */
public class t implements u {
    private final int[] a = new int[1];

    @Override // com.corrodinggames.rts.gameFramework.b.u
    public int a() {
        GLES20.glGenTextures(1, this.a, 0);
        n.q();
        return this.a[0];
    }
}
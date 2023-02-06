package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/q.class */
abstract class q {
    protected final String b;
    public int a = -1;
    public int c = -1;

    public abstract void a(int i);

    public q(String str) {
        this.b = str;
    }

    public void a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.a, 1, false, fArr, 0);
    }
}
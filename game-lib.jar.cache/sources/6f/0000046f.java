package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;
import android.util.Log;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/o.class */
class o extends q {
    public o(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.q
    public void a(int i) {
        String str;
        if (this.c != i) {
            this.f438a = GLES20.glGetAttribLocation(i, this.b);
            this.c = i;
            n.r();
            if (this.f438a == -1) {
                str = n.G;
                Log.d(str, "loadHandle: Failed to find: " + this.b);
            }
        }
    }
}
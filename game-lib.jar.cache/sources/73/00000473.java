package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;
import android.util.Log;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/s.class */
class s extends q {
    public s(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.q
    public void a(int i) {
        String str;
        if (this.c != i) {
            this.a = GLES20.glGetUniformLocation(i, this.b);
            this.c = i;
            n.r();
            if (this.a == -1) {
                str = n.G;
                Log.d(str, "loadHandle: Failed to find: " + this.b);
            }
        }
    }
}
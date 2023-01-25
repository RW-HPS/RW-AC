package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.b.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/o.class */
class C0713o extends AbstractC0715q {
    public C0713o(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0715q
    /* renamed from: a */
    public void mo2531a(int i) {
        String str;
        if (this.f4500c != i) {
            this.f4498a = GLES20.glGetAttribLocation(i, this.f4499b);
            this.f4500c = i;
            C0712n.m2538r();
            if (this.f4498a == -1) {
                str = C0712n.f4440G;
                Log.m5069d(str, "loadHandle: Failed to find: " + this.f4499b);
            }
        }
    }
}
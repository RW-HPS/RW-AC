package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;

/* renamed from: com.corrodinggames.rts.gameFramework.b.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/t.class */
public class C0718t implements InterfaceC0719u {

    /* renamed from: a */
    private final int[] f4502a = new int[1];

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0719u
    /* renamed from: a */
    public int mo2530a() {
        GLES20.glGenTextures(1, this.f4502a, 0);
        C0712n.m2539q();
        return this.f4502a[0];
    }
}
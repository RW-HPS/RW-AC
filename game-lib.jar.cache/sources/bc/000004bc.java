package com.corrodinggames.rts.gameFramework.Interface.a;

import android.graphics.RectF;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/n.class */
public class n extends l {
    h b = h.j;

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.l
    public void a(float f, float f2) {
        super.a(f, f2);
        this.b.a(d(), a(new RectF(), f, f2));
    }
}
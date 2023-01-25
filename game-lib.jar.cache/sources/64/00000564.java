package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;

/* renamed from: com.corrodinggames.rts.gameFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m.class */
class C0958m {

    /* renamed from: a */
    float f6511a;

    /* renamed from: b */
    Paint f6512b;

    /* renamed from: c */
    final /* synthetic */ GameEngine f6513c;

    C0958m(GameEngine gameEngine) {
        this.f6513c = gameEngine;
    }

    /* renamed from: a */
    void m955a() {
        float m999e = this.f6513c.m999e(this.f6511a);
        if (this.f6512b.m5186k() != m999e) {
            if (this.f6512b instanceof C0966ag) {
                ((C0966ag) this.f6512b).m911c(m999e);
            } else {
                this.f6512b.mo913b(m999e);
            }
        }
    }
}
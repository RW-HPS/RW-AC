package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m.class */
class m {
    float a;
    Paint b;
    final /* synthetic */ GameEngine c;

    m(GameEngine gameEngine) {
        this.c = gameEngine;
    }

    void a() {
        float e = this.c.e(this.a);
        if (this.b.k() != e) {
            if (this.b instanceof com.corrodinggames.rts.gameFramework.unitAction.ag) {
                ((com.corrodinggames.rts.gameFramework.unitAction.ag) this.b).c(e);
            } else {
                this.b.b(e);
            }
        }
    }
}
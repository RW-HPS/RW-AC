package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ag.class */
public class ag extends ai {
    public Paint a;
    public int b;
    final /* synthetic */ ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ae aeVar, String str, Paint paint) {
        super(aeVar, str);
        this.c = aeVar;
        this.b = 0;
        this.a = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ae aeVar, String str, Paint paint, int i) {
        super(aeVar, str);
        this.c = aeVar;
        this.b = 0;
        this.a = paint;
        this.b = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.ai
    public Paint b(Paint paint) {
        if (this.a == null) {
            if (this.b != 0) {
                ae.f.a(paint);
                ae.f.b(this.b);
                return ae.f;
            }
            return paint;
        } else if (this.b != 0) {
            ae.f.a(this.a);
            ae.f.b(this.b);
            return ae.f;
        } else {
            return this.a;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.ai
    /* renamed from: a */
    public ag b(String str) {
        return new ag(this.c, str, this.a, this.b);
    }
}
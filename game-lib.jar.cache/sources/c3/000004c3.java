package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ag.class */
public class ag extends ai {

    /* renamed from: a  reason: collision with root package name */
    public Paint f496a;
    public int b;
    final /* synthetic */ ae c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ae aeVar, String str, Paint paint) {
        super(aeVar, str);
        this.c = aeVar;
        this.b = 0;
        this.f496a = paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ae aeVar, String str, Paint paint, int i) {
        super(aeVar, str);
        this.c = aeVar;
        this.b = 0;
        this.f496a = paint;
        this.b = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.ai
    public Paint b(Paint paint) {
        if (this.f496a == null) {
            if (this.b != 0) {
                ae.f.a(paint);
                ae.f.b(this.b);
                return ae.f;
            }
            return paint;
        } else if (this.b != 0) {
            ae.f.a(this.f496a);
            ae.f.b(this.b);
            return ae.f;
        } else {
            return this.f496a;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.f.ai
    /* renamed from: a */
    public ag b(String str) {
        return new ag(this.c, str, this.f496a, this.b);
    }
}
package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ag.class */
public class C0797ag extends C0799ai {

    /* renamed from: a */
    public Paint f5174a;

    /* renamed from: b */
    public int f5175b;

    /* renamed from: c */
    final /* synthetic */ C0795ae f5176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0797ag(C0795ae c0795ae, String str, Paint paint) {
        super(c0795ae, str);
        this.f5176c = c0795ae;
        this.f5175b = 0;
        this.f5174a = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0797ag(C0795ae c0795ae, String str, Paint paint, int i) {
        super(c0795ae, str);
        this.f5176c = c0795ae;
        this.f5175b = 0;
        this.f5174a = paint;
        this.f5175b = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0799ai
    /* renamed from: b */
    public Paint mo1969b(Paint paint) {
        if (this.f5174a == null) {
            if (this.f5175b != 0) {
                C0795ae.f5169f.m5220a(paint);
                C0795ae.f5169f.m5206b(this.f5175b);
                return C0795ae.f5169f;
            }
            return paint;
        } else if (this.f5175b != 0) {
            C0795ae.f5169f.m5220a(this.f5174a);
            C0795ae.f5169f.m5206b(this.f5175b);
            return C0795ae.f5169f;
        } else {
            return this.f5174a;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0799ai
    /* renamed from: a */
    public C0797ag mo1968b(String str) {
        return new C0797ag(this.f5176c, str, this.f5174a, this.f5175b);
    }
}
package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/g.class */
public final class C0547g extends AbstractC0545e {

    /* renamed from: a */
    public RectF f3766a = new RectF();

    /* renamed from: b */
    public float f3767b;

    /* renamed from: c */
    public float f3768c;

    /* renamed from: d */
    public float f3769d;

    /* renamed from: e */
    public float f3770e;

    /* renamed from: a */
    public void m3195a(float f, float f2, float f3, float f4) {
        this.f3767b = f;
        this.f3768c = f3;
        this.f3769d = f2;
        this.f3770e = f4;
        this.f3766a.m5158a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545e
    /* renamed from: a */
    public final boolean mo3194a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f7172eo;
        float f2 = abstractC0244am.f7173ep;
        return this.f3767b <= f && f <= this.f3768c && this.f3769d <= f2 && f2 <= this.f3770e;
    }
}
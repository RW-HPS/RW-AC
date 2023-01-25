package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/h.class */
public final class C0548h extends AbstractC0545e {

    /* renamed from: a */
    public RectF f3771a = new RectF();

    /* renamed from: b */
    public float f3772b;

    /* renamed from: c */
    public float f3773c;

    /* renamed from: d */
    public float f3774d;

    /* renamed from: e */
    public float f3775e;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545e
    /* renamed from: a */
    public final boolean mo3194a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f1626cj;
        float f2 = abstractC0244am.f7172eo;
        float f3 = abstractC0244am.f7173ep;
        return this.f3772b - f <= f2 && f2 <= this.f3773c + f && this.f3774d - f <= f3 && f3 <= this.f3775e + f;
    }
}
package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.game.units.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/d.class */
public final class C0544d extends AbstractC0545e {

    /* renamed from: a */
    public RectF f3756a = new RectF();

    /* renamed from: b */
    public float f3757b;

    /* renamed from: c */
    public float f3758c;

    /* renamed from: d */
    public float f3759d;

    /* renamed from: e */
    public float f3760e;

    /* renamed from: f */
    public float f3761f;

    /* renamed from: g */
    public float f3762g;

    /* renamed from: h */
    public float f3763h;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545e
    /* renamed from: a */
    public final boolean mo3194a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f7172eo;
        float f2 = abstractC0244am.f7173ep;
        return this.f3757b <= f && f <= this.f3758c && this.f3759d <= f2 && f2 <= this.f3760e && C0773f.m2216a(this.f3761f, this.f3762g, f, f2) < this.f3763h;
    }
}
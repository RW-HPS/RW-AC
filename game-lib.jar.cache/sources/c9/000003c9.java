package com.corrodinggames.rts.game.units.f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/h.class */
public final class h extends e {

    /* renamed from: a  reason: collision with root package name */
    public RectF f364a = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;

    @Override // com.corrodinggames.rts.game.units.f.e
    public final boolean a(am amVar) {
        float f = amVar.cj;
        float f2 = amVar.eo;
        float f3 = amVar.ep;
        return this.b - f <= f2 && f2 <= this.c + f && this.d - f <= f3 && f3 <= this.e + f;
    }
}
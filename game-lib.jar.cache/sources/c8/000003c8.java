package com.corrodinggames.rts.game.units.f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/g.class */
public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public RectF f363a = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;

    public void a(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f3;
        this.d = f2;
        this.e = f4;
        this.f363a.a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.game.units.f.e
    public final boolean a(am amVar) {
        float f = amVar.eo;
        float f2 = amVar.ep;
        return this.b <= f && f <= this.c && this.d <= f2 && f2 <= this.e;
    }
}
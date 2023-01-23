package com.corrodinggames.rts.game.units.f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/d.class */
public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public RectF f361a = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    @Override // com.corrodinggames.rts.game.units.f.e
    public final boolean a(am amVar) {
        float f = amVar.eo;
        float f2 = amVar.ep;
        return this.b <= f && f <= this.c && this.d <= f2 && f2 <= this.e && com.corrodinggames.rts.gameFramework.f.a(this.f, this.g, f, f2) < this.h;
    }
}